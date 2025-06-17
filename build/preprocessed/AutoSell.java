
public final class AutoSell extends Auto {

    private int advAB;
    private int advAC;
    private boolean advAZ;
    private boolean advBA;
    private boolean advBB;
    private String advBC;
    private MyVector advBD;
    private MyVector advBE;
    private long advBF;
    public static boolean advAA;

    public final void advAA(String var1, int var2) {
        if (ChatSell.advAC()) {
            Service.gI().acceptInviteTrade(var2);
            this.advBC = var1;
            this.advBB = true;
            this.advBA = true;
            this.advBD = null;
            this.advBE = null;
            this.advAZ = true;
        } else {
            Service.gI().cancelInviteTrade();
            Code.advAA(var1, "<Hiện mk ko mua vp nào>");
        }
    }

    public final void advAA(String var1, String var2) {
        String[] var15 = Code.split(var2, " ");
        if (this.advAZ) {
            if (!GameScr.isPaintTrade) {
                Code.advAA(var1, "<Đang giao dịch với người khác. Mong bạn chờ giây lát>");
            }

        }
    }

    public final void update() {
        super.update();
        super.mapID = TileMap.mapID;
        super.zoneID = TileMap.zoneID;
        this.advAB = Char.getMyChar().cx;
        this.advAC = Char.getMyChar().cy;
        this.advBF = 0L;
        this.advAZ = false;
        ChatSell.advAA = -1;
    }

    private void advAA(Char var1) {
        Item[] var2 = new Item[12];
        advAA = false;
        long var3;
        if (!this.advBA) {
            if (!Char.advAD(var1.cx, var1.cy)) {
                Code.advAA(this.advBC, "<Hãy đứng ở nơi dễ GD>");
                return;
            }

            Service.gI().tradeInvite(var1.charID);
            if (!LockGame.advBA()) {
                if (GameScr.isPaintTrade) {
                    Service.gI().cancelTrade();
                    CuongScr.sleep(1000L);
                }

                Code.advAA(this.advBC, "<Hãy đồng ý giao dịch>");
                return;
            }
        } else {
            var3 = System.currentTimeMillis();

            while (!GameScr.isPaintTrade || System.currentTimeMillis() - var3 >= 10000L) {
                CuongScr.sleep(1000L);
            }
        }

        var3 = System.currentTimeMillis();

        while (GameScr.gI().typeTradeOrder != 1) {
            if (advAA || System.currentTimeMillis() - var3 >= 20000L) {
                if (GameScr.isPaintTrade) {
                    Service.gI().cancelTrade();
                    CuongScr.sleep(1000L);
                }

                Code.advAA(this.advBC, "<Hãy giao dịch lại>");
                return;
            }

            CuongScr.sleep(200L);
        }

        MyVector var8 = new MyVector();
        MyVector var9 = new MyVector();

        int var4;
        int var7;
        int var10;
        for (var4 = 0; var4 < GameScr.arrItemTradeOrder.length; ++var4) {
            if (GameScr.arrItemTradeOrder[var4] != null) {
                RMS var5;
                if ((var5 = ChatSell.advAA(GameScr.arrItemTradeOrder[var4].template.id)) == null || !var5.advAC()) {
                    if (GameScr.isPaintTrade) {
                        Service.gI().cancelTrade();
                        CuongScr.sleep(1000L);
                    }

                    Code.advAA(this.advBC, "<Item " + var4 + ": bạn đã GD vp mk ko mua>");
                    return;
                }

                int var6 = GameScr.arrItemTradeOrder[var4].template.isUpToUp ? GameScr.arrItemTradeOrder[var4].indexUI : 1;
                if (var8.contains(var5)) {
                    var7 = var8.indexOf(var5);
                    var10 = ((Integer) var9.elementAt(var7)).intValue() + var6;
                    var9.setElementAt(new Integer(var10), var7);
                } else {
                    var8.addElement(var5);
                    var9.addElement(new Integer(var6));
                }
            }
        }

        if (var8.size() == 0) {
            if (GameScr.isPaintTrade) {
                Service.gI().cancelTrade();
                CuongScr.sleep(1000L);
            }

            Code.advAA(this.advBC, "<Giao dịch trống>");
        } else {
            var4 = 0;

            for (var10 = 0; var10 < var8.size(); ++var10) {
                RMS var11 = (RMS) var8.elementAt(var10);
                var7 = ((Integer) var9.elementAt(var10)).intValue();
                if (Char.getBagNum(var11.template.id) + var7 > var11.soLuongMua) {
                    if (GameScr.isPaintTrade) {
                        Service.gI().cancelTrade();
                        CuongScr.sleep(1000L);
                    }

                    Code.advAA(this.advBC, "<" + var11.template.name + " bạn đá bán quá số mk cần mua>");
                    return;
                }

                var4 += var7 * var11.giaMua * 1000 / var11.giaTrenItem;
            }

            if (var4 > Char.getMyChar().xu) {
                if (GameScr.isPaintTrade) {
                    Service.gI().cancelTrade();
                }

                Code.advAA(this.advBC, "<Hiện mk ko đủ xu, xin bạn quay lại sau>");
            } else {
                GameScr.gI().coinTrade = var4;
                GameScr.arrItemTradeMe = var2;
                Service.gI().tradeItemLock(var4, var2);
                GameScr.gI().typeTrade = 1;
                var3 = System.currentTimeMillis();

                while (System.currentTimeMillis() - var3 < 5000L) {
                    if (advAA) {
                        Code.advAA(this.advBC, "<Hãy giao dịch lại>");
                        return;
                    }

                    CuongScr.sleep(200L);
                }

                Service.gI().tradeAccept();
                GameScr.gI().typeTrade = 2;

                while (GameScr.gI().coinTrade < 2) {
                    if (advAA || System.currentTimeMillis() - var3 >= 20000L) {
                        if (GameScr.isPaintTrade) {
                            Service.gI().cancelTrade();
                            CuongScr.sleep(1000L);
                        }

                        Code.advAA(this.advBC, "<Hãy giao dịch lại>");
                        return;
                    }

                    CuongScr.sleep(200L);
                }

            }
        }
    }

    private void advAF(Char var1) {
        Item[] var2 = new Item[12];
        int var3 = 0;
        int var4 = 0;
        boolean var5 = false;
        int var6;
        int var8;

        advAA = false;
        if (!Char.advAD(var1.cx, var1.cy)) {
            Code.advAA(this.advBC, "<Hãy đứng ở nơi dễ GD>");
            if (var5) {
                Service.gI().bagSort();
                LockGame.advAS();
            }

        } else {
            Service.gI().tradeInvite(var1.charID);
            if (!LockGame.advBA()) {
                if (GameScr.isPaintTrade) {
                    Service.gI().cancelTrade();
                    CuongScr.sleep(1000L);
                }

                if (var5) {
                    Service.gI().bagSort();
                    LockGame.advAS();
                }

                Code.advAA(this.advBC, "<Hãy đồng ý giao dịch>");
            } else {
                GameScr.gI().coinTrade = 0;
                GameScr.arrItemTradeMe = new Item[12];

                for (var6 = 0; var6 < 12; ++var6) {
                    GameScr.arrItemTradeMe[var6] = var2[var6];
                    if (var2[var6] != null && var2[var6].indexUI >= 0 && var2[var6].indexUI < Char.getMyChar().arrItemBag.length) {
                        int var10001 = var2[var6].indexUI;
                        Char.getMyChar().arrItemBag[var10001] = null;
                    }
                }

                Service.gI().tradeItemLock((int) 0, (Item[]) var2);
                GameScr.gI().typeTrade = 1;
                long var13 = System.currentTimeMillis();

                while (GameScr.gI().typeTradeOrder != 1) {
                    if (advAA || System.currentTimeMillis() - var13 >= 20000L) {
                        if (GameScr.isPaintTrade) {
                            Service.gI().cancelTrade();
                            CuongScr.sleep(1000L);
                        }

                        if (var5) {
                            Service.gI().bagSort();
                            LockGame.advAS();
                        }

                        Code.advAA(this.advBC, "<Hãy giao dịch lại>");
                        return;
                    }

                    CuongScr.sleep(200L);
                }

                var13 = System.currentTimeMillis();
                if (GameScr.gI().coinTradeOrder < var4) {
                    if (GameScr.isPaintTrade) {
                        Service.gI().cancelTrade();
                        CuongScr.sleep(1000L);
                    }

                    if (var5) {
                        Service.gI().bagSort();
                        LockGame.advAS();
                    }

                    Code.advAA(this.advBC, "<Không đủ xu>");
                } else {
                    for (var8 = 0; var8 < GameScr.arrItemTradeOrder.length; ++var8) {
                        if (GameScr.arrItemTradeOrder[var8] != null && ChatSell.advAA(GameScr.arrItemTradeOrder[var8].template.id) == null) {
                            if (GameScr.isPaintTrade) {
                                Service.gI().cancelTrade();
                                CuongScr.sleep(1000L);
                            }

                            if (var5) {
                                Service.gI().bagSort();
                                LockGame.advAS();
                            }

                            Code.advAA(this.advBC, "<Chỉ GD xu>");
                            return;
                        }
                    }

                    while (System.currentTimeMillis() - var13 < 6000L) {
                        if (advAA) {
                            if (var5) {
                                Service.gI().bagSort();
                                LockGame.advAS();
                            }

                            Code.advAA(this.advBC, "<Hãy giao dịch lại>");
                            return;
                        }

                        CuongScr.sleep(200L);
                    }

                    Service.gI().tradeAccept();
                    GameScr.gI().typeTrade = 2;

                    while (GameScr.gI().typeTradeOrder < 2) {
                        if (advAA || System.currentTimeMillis() - var13 >= 20000L) {
                            if (GameScr.isPaintTrade) {
                                Service.gI().cancelTrade();
                                CuongScr.sleep(1000L);
                            }

                            if (var5) {
                                Service.gI().bagSort();
                                LockGame.advAS();
                            }

                            Code.advAA(this.advBC, "<Hãy giao dịch lại>");
                            return;
                        }

                        CuongScr.sleep(200L);
                    }

                }
            }
        }
    }

    public final void auto() {
        if (Auto.isMyCharInactive()) {
            Auto.advAA(true);
        } else if (super.mapID == TileMap.mapID && super.zoneID == TileMap.zoneID) {
            if (this.advAZ) {
                String var1 = this.advBC;
                int var5 = 0;

                Char var10000;
                while (true) {
                    if (var5 >= GameScr.vCharInMap.size()) {
                        var10000 = null;
                        break;
                    }

                    Char var3;
                    if ((var3 = (Char) GameScr.vCharInMap.elementAt(var5)).cName.equals(var1)) {
                        var10000 = var3;
                        break;
                    }

                    ++var5;
                }

                Char var4 = var10000;
                if (var10000 == null) {
                    if (this.advBC != null) {
                        Code.advAA(this.advBC, "<Hãy đến " + TileMap.mapNames[TileMap.mapID] + " khu " + TileMap.zoneID + " để giao dịch>");
                    }

                    this.advAZ = false;
                } else {
                    if (this.advBB) {
                        this.advAA(var4);
                    } else {
                        this.advAF(var4);
                    }

                    CuongScr.sleep(500L);
                    this.advAZ = false;
                }
            } else {
                if (Char.getMyChar().cx != this.advAB || Char.getMyChar().cy != this.advAC) {
                    Char.moveToChar(this.advAB, this.advAC);
                    CuongScr.sleep(500L);
                }

                String var2;
                if (System.currentTimeMillis() - this.advBF >= 5000L && !(var2 = ChatSell.advAB()).equals("")) {
                    Service.gI().chat(var2);
                    this.advBF = System.currentTimeMillis();
                }

            }
        } else {
            this.remap(super.mapID, super.zoneID, -1, -1);
        }
    }

    public final String toString() {
        return "Auto Buy ";
    }
}
