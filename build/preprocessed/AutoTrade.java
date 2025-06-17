
public final class AutoTrade extends Auto {

    private static AutoTrade instance;

    public long lastInviteTime;
    private long searchStartTime;
    private int searchAttempt;
    public int tradeStep;
    public int itemLimitPerTrade;
    public static MyVector allowedTradeChars = new MyVector();

    public Char targetChar;
    private String[] itemIDList;
    private String targetCharName;

    private int currentItemsAdded = 0;
    public long waitAcceptStart = 0L;
    public long waitLockStart = 0L;
    public int addedItemCount = 0;
    public int lastTradeAccepted = -1;

    public static AutoTrade gI() {
        if (instance == null) {
            instance = new AutoTrade();
        }
        return instance;
    }

    private void resetTrade() {
        targetChar = null;
        tradeStep = 0;
        searchStartTime = 0L;
        searchAttempt = 0;
        itemLimitPerTrade = -1;
        currentItemsAdded = 0;
        lastInviteTime = 0L;
    }

    public static void saveTradeCharList() {
        String data = "";
        for (int i = 0; i < allowedTradeChars.size(); i++) {
            String name = (String) allowedTradeChars.elementAt(i);
            if (name != null && name.length() > 0) {
                if (data.length() > 0) {
                    data += ";";
                }
                data += name;
            }
        }

        if (data.length() > 0) {
            RMS.saveRMSString("chipSellerLists", data);
        } else {
            RMS.deleteRecord("chipSellerLists");
        }
    }

    public static MyVector getTradeCharList() {
        MyVector list = new MyVector();
        for (int i = 0; i < allowedTradeChars.size(); i++) {
            String name = (String) allowedTradeChars.elementAt(i);
            list.addElement((i + 1) + ". " + name);
        }
        return list;
    }

    public final boolean handleTradeCommand(String sender, String message) {
        if (!isAllowedTrader(sender)) {
            return false;
        }

        if (message.startsWith("@cmdcall")) {
            message = Code.sellerAI(message);
            if (message != null && message.length() > 0) {
                String[] splitMsg = Code.split(message, " ");
                if (splitMsg.length >= 2) {
                    String[] itemIDs = Code.split(splitMsg[1], ":");
                    if (hasAnyItem(itemIDs)) {
                        try {
                            String[] location = Code.split(splitMsg[0], ":");
                            int mapId = Integer.parseInt(location[0]);
                            int zoneId = Integer.parseInt(location[1]);
                            int itemCount = Integer.parseInt(location[2]);

                            AutoTrade trader = gI();
                            trader.update();
                            trader.resetTrade();
                            trader.targetCharName = sender;
                            trader.mapID = mapId;
                            trader.zoneID = zoneId;
                            trader.advAG = TileMap.isHang(mapId);
                            trader.itemLimitPerTrade = itemCount;
                            trader.itemIDList = itemIDs;
                            Code.setAuto(trader);
                            return true;
                        } catch (Exception e) {
                            return false;
                        }
                    }
                    Code.sellerAB(sender, "chua co hang goi cc");
                }
            }
        } else if (message.equals("Hiện tại không online.") || message.indexOf("em an com roi") != -1) {
            this.waitLockStart = System.currentTimeMillis() - 55000L;
            return true;
        }

        return false;
    }

    private static boolean hasAnyItem(String[] ids) {
        if (ids != null && ids.length > 0) {
            for (int i = 0; i < ids.length; i++) {
                try {
                    short id = Short.parseShort(ids[i]);
                    for (int j = 0; j < Char.getMyChar().arrItemBag.length; j++) {
                        Item item = Char.getMyChar().arrItemBag[j];
                        if (item != null && !item.isLock && item.template.id == id) {
                            return true;
                        }
                    }
                } catch (NumberFormatException ignored) {
                }
            }
        }
        return false;
    }

    private static boolean matchesItem(Item item, String[] ids) {
        if (ids != null && item != null && !item.isLock) {
            for (int i = 0; i < ids.length; i++) {
                try {
                    if (Short.parseShort(ids[i]) == item.template.id) {
                        return true;
                    }
                } catch (NumberFormatException ignored) {
                }
            }
        }
        return false;
    }

    private static boolean isAllowedTrader(String name) {
        return !allowedTradeChars.isEmpty() && allowedTradeChars.contains(name);
    }

    public static boolean removeTradeChar(String name) {
        if (isAllowedTrader(name)) {
            allowedTradeChars.removeElement(name);
            return true;
        }
        return false;
    }

    public static boolean addTradeChar(String name) {
        if (!isAllowedTrader(name)) {
            allowedTradeChars.addElement(name);
            return true;
        }
        return false;
    }

    private static Char findCharByName(String name) {
        if (name != null && name.length() > 0) {
            for (int i = 0; i < GameScr.vCharInMap.size(); i++) {
                Char c = (Char) GameScr.vCharInMap.elementAt(i);
                if (c.cName.equals(name)) {
                    return c;
                }
            }
        }
        return null;
    }

    private void cancelTrade() {
        itemIDList = null;
        targetCharName = null;
        if (super.T != null && !(super.T instanceof AutoTrade)) {
            Code.java_AC();
        } else {
            Code.endAuto();
        }
    }

    protected final void auto() {
        if (Auto.isMyCharInactive()) {
            resetTrade();
            Auto.advAA(true);
        } else if (super.mapID == TileMap.mapID && super.zoneID == TileMap.zoneID) {
            if (targetChar == null) {
                if (GameScr.isPaintTrade) {
                    GameScr.gI().resetButton();
                    if (tradeStep != 0) {
                        resetTrade();
                    }
                }

                if ((targetChar = findCharByName(targetCharName)) != null) {
                    searchAttempt = 0;
                } else if (System.currentTimeMillis() - searchStartTime > 6000L) {
                    if (searchAttempt >= 10) {
                        resetTrade();
                        cancelTrade();
                        return;
                    }
                    searchAttempt++;
                    searchStartTime = System.currentTimeMillis();
                    GameScr.paint("Không tìm thấy acc nhận đồ: " + targetCharName);
                }
            } else {
                switch (tradeStep) {
                    case -45:
                    case -37:
                        if (System.currentTimeMillis() - lastInviteTime > 35000L) {
                            GameCanvas.endDlg();
                            GameScr.gI().resetButton();
                            resetTrade();
                        }
                        break;

                    case 0:
                        if (System.currentTimeMillis() - lastInviteTime > 35000L) {
                            lastInviteTime = System.currentTimeMillis();
                            targetChar = findCharByName(targetCharName);
                            if (targetChar != null) {
                                if (Math.abs(targetChar.cx - Char.getMyChar().cx) > 60
                                        || Math.abs(targetChar.cy - Char.getMyChar().cy) > 40) {
                                    Char.moveToChar(targetChar.cx, targetChar.cy);
                                    Auto.sleep(2000L);
                                }
                                Service.gI().tradeInvite(targetChar.charID);
                            }
                        }
                        break;

                    case 37:
                        if (itemLimitPerTrade <= 0) {
                            resetTrade();
                            cancelTrade();
                            return;
                        }

                        if (GameScr.isPaintTrade && GameScr.arrItemTradeOrder != null) {
                            int count = 0;
                            for (int i = 0; i < Char.getMyChar().arrItemBag.length; i++) {
                                Item item = Char.getMyChar().arrItemBag[i];
                                if (matchesItem(item, itemIDList)) {
                                    GameScr.indexSelect = item.indexUI;
                                    GameScr.gI().actTradeSelectItem();
                                    count++;
                                    if (count >= itemLimitPerTrade || count >= 12) {
                                        break;
                                    }
                                }
                            }
                            currentItemsAdded = count;
                            Auto.sleep(1000L);
                            lastInviteTime = System.currentTimeMillis();
                            tradeStep = -37;
                            GameScr.gI().actTradeLock();
                        } else if (System.currentTimeMillis() - lastInviteTime > 35000L) {
                            GameCanvas.endDlg();
                            GameScr.gI().resetButton();
                            resetTrade();
                        }
                        break;

                    case 45:
                        if (GameScr.gI().typeTradeOrder > 0
                                && System.currentTimeMillis() - lastInviteTime >= 6000L) {
                            lastInviteTime = System.currentTimeMillis();
                            tradeStep = -45;
                            GameScr.gI().actTradeAccept();
                        } else if (System.currentTimeMillis() - lastInviteTime > 35000L) {
                            GameCanvas.endDlg();
                            GameScr.gI().resetButton();
                            resetTrade();
                        }
                        break;

                    case 57:
                        if (System.currentTimeMillis() - lastInviteTime > 2000L) {
                            resetTrade();
                        }
                        break;

                    case 58:
                        if (itemLimitPerTrade > currentItemsAdded && hasAnyItem(itemIDList)) {
                            resetTrade();
                            itemLimitPerTrade -= currentItemsAdded;
                            Auto.sleep(2000L);
                        } else {
                            resetTrade();
                            cancelTrade();
                        }
                        break;
                }
            }
        } else {
            this.remap(super.mapID, super.zoneID, -1, -1);
        }
    }

    public final String toString() {
        return "Auto giao hàng";
    }

    static {
        String savedList = RMS.loadRMSString("chipSellerLists");
        if (savedList != null && savedList.length() > 0) {
            String[] names = Code.split(savedList, ";");
            for (int i = 0; i < names.length; i++) {
                if (!allowedTradeChars.contains(names[i])) {
                    allowedTradeChars.addElement(names[i]);
                }
            }
        }
    }
}
