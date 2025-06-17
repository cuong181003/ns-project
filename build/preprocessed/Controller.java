
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class Controller {

    private static Controller me;
    private Message messWait;
    private static String[] advAC = new String[]{"Bạn chỉ có thể vào lại game sau ", " giây nữa"};
    private static String advAD = "Bạn chưa thể đi đến khu vực này.Hãy hoàn thành nhiệm vụ trước.";
    private static String advAE = "Cửa này vẫn chưa được mở.";
    private static String advAF = "Cửa này chỉ chứa được tối đa 2 người.";
    private static String advAG = "Số nhóm trong khu vực này đã đạt tối đa.";
    private static String advAH = "Khu vực này đã đầy";
    private static String advAI = "Thao tác quá nhanh.";

    public static Controller gI() {
        if (me == null) {
            me = new Controller();
        }

        return me;
    }

    public final void advAB() {
        System.out.println("Connect ok");
    }

    public final void onConnectionFail() {
        if (Char.isAReConnect && Code.auto != null) {
            Session_ME.gI().reLogin();
        } else {
            GameCanvas.startOK(mResources.SERVER_MAINTENANCE, 8884, (Object) null);
        }
    }

    public final void advAD() {
        System.out.println("Disconnected");
        Code.advAB();
        if (Code.auto instanceof AutoStanima && Res.advAB().get(11) == 3) {
            AutoStanima.advAZ = true;
        }

        if (Char.isAReConnect && Code.auto != null) {
            Session_ME.gI().reLogin();
        } else {
            GameCanvas.instance.resetToLoginScr();
        }
    }

    private static void requestItemPlayer(Message var0) {
        try {
            int var1 = var0.reader().readUnsignedByte();
            Item var4;
            (var4 = GameScr.currentCharViewInfo.arrItemBody[var1]).expires = var0.reader().readLong();
            var4.saleCoinLock = var0.reader().readInt();
            var4.sys = var0.reader().readByte();
            var4.options = new MyVector();

            try {
                while (true) {
                    var4.options.addElement(new ItemOption(var0.reader().readUnsignedByte(), var0.reader().readInt()));
                }
            } catch (Exception var2) {
                System.out.println(" >>>11  loi tai requestItemPlayer" + var2.toString());
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            System.out.println(" >>>222  loi tai requestItemPlayer" + var3.toString());

        }
    }

    private static void viewItemAuction(Message var0) {
        try {
            Item var1 = null;
            int var2 = var0.reader().readInt();

            for (int var3 = 0; var3 < GameScr.arrItemStands.length; ++var3) {
                if (GameScr.arrItemStands[var3].item.itemId == var2) {
                    var1 = GameScr.arrItemStands[var3].item;
                    break;
                }
            }

            var1.typeUI = 37;
            var1.expires = -1L;
            var1.saleCoinLock = var0.reader().readInt();
            if (var1.isTypeBody() || var1.isTypeNgocKham()) {
                var1.options = new MyVector();

                try {
                    var1.upgrade = var0.reader().readByte();
                    var1.sys = var0.reader().readByte();

                    while (true) {
                        var1.options.addElement(new ItemOption(var0.reader().readUnsignedByte(), var0.reader().readInt()));
                    }
                } catch (Exception var4) {
                    return;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
        }

    }

    public final void onMessage(Message msg) {
        try {
            GameScr gameScr;
            Ranked ranked;
            int ine1;
            short sne1;
            String str1;
            int ine2;
            Mob mob;
            Char aChar;
            Char var10000;
            BuNhin buNhin;
            short var76;
            int var77;
            Npc var78;
            Char[] var80;
            int var81;
            byte var85;
            int var86;
            int var91;
            byte var185;
            int var186;
            Char var187;
            String var188;
            short var190;
            String var191;
            Item var193;
            byte var194;
            MyVector var195;
            short var196;
            int var197;
            int var200;
            int var201;
            byte var202;
            int var204;
            String var206;
            byte var210;
            String var220;
            String var221;
            short var224;
            boolean var226;
            short var232;
            int var234;
            ItemMap var236;
            Item var240;
            int var242;
            long var247;
            Char var248;
            int var249;
            int var250;
            int var252;
            switch (msg.command) {
                case -30:
                    this.messageSubCommand(msg);
                    break;
                case -29:
                    messageNotLogin(msg);
                    break;
                case -28:
                    this.messageNotMap(msg);
                case -27:
                case -17:
                case -9:
                case 12:
                case 24:
                case 28:
                case 29:
                case 32:
                case 35:
                case 41:
                case 44:
                case 56:
                case 73:
                case 74:
                case 80:
                case 81:
                case 105:
                case 110:
                case 111:
                case 113:
                case 115:
                case 120:
                default:
                    break;
                case -26:
                    String utf;
                    GameCanvas.startOKDlg(utf = msg.reader().readUTF());
                    boolean equals = false;
                    boolean equals2 = false;
                    if (utf.startsWith(Controller.advAC[0])) {
                        int int1 = 0;
                        try {
                            int1 = Integer.parseInt(utf.substring(Controller.advAC[0].length(), utf.indexOf(Controller.advAC[1])).trim());
                        } catch (final Exception ex) {
                            ex.printStackTrace();
                        }
                        Session_ME.gI().close();
                        Session_ME.nsoAP = false;
                        Session_ME.advAE();
                        GameCanvas.advBS = int1;
                        GameCanvas.advBU = (GameCanvas.advBT = System.currentTimeMillis());
                        return;
                    }
                    if (utf.equals(Controller.advAI)) {
                        LockGame.advAR();
                        return;
                    }
                    if (!TileMap.advBE || (!utf.equals(Controller.advAD) && !(equals = utf.equals(Controller.advAE)) && !(equals2 = utf.equals(Controller.advAF)) && !utf.equals(Controller.advAH) && !utf.equals(Controller.advAG))) {
                        return;
                    }
                    if (Code.auto != null && TileMap.isHang((int) TileMap.mapID)) {
                        if (equals) {
                            final int advAI;
                            if ((advAI = TileMap.advAI(Code.auto.mapID)) > 0) {
                                Code.auto.mapID = advAI;
                            }
                            Code.auto.cx = -1;
                        } else if (equals2) {
                            final int advAH;
                            if ((advAH = TileMap.advAH(Code.auto.mapID)) > 0) {
                                Code.auto.mapID = advAH;
                            }
                            Code.auto.cx = -1;
                        }
                    }
                    if (TileMap.advBD) {
                        TileMap.advBD = false;
                    } else {
                        GameCanvas.endDlg();
                    }
                    TileMap.advAG();
                    return;
                case -25:
                    String utf2;
                    Info.addInfo(utf2 = msg.reader().readUTF(), 150, mFont.tahoma_7b_yellow);
                    ChatManager.gI().addChat(mResources.GLOBALCHAT[0], mResources.SERVER_ALERT, utf2);
                    if (Code.auto instanceof AutoStanima) {
                        Code.autoStanima.advAA(utf2);
                    }
                    if (Code.auto instanceof AutoChoBoss) {
                        ((AutoChoBoss) Code.auto).advAA(utf2);
                    }
                    return;
                case -24:
                    String utf3 = msg.reader().readUTF();

                    if (Code.auto != null && Code.auto instanceof AutoNTGT) {
                        AutoNTGT.ntgtAP().ntgtAE(utf3);
                    } else if (utf3.indexOf("đang đứng nhìn bạn") > 0) {
                        Code.advAG(utf3.substring(0, utf3.indexOf("đang đứng nhìn bạn")).trim());
                    } else if (Char.isANoMP && Code.auto != null && utf3.equals("Không đủ MP để sử dụng")) {
                        Auto.advAP = true;
                    } else if (LockGame.advAB && utf3.equals("Vật phẩm của người khác")) {
                        LockGame.advAD();
                        final ItemMap item;
                        if ((item = Char.getMyChar().itemFocus) != null) {
                            item.advAK = true;
                        }
                    } else if (Code.auto instanceof AutoStanima) {
                        if (Code.autoStanima.advAA == 2 && utf3.equals("Cửa hàng động đã được khép lại.")) {
                            AutoStanima.advAZ = true;
                        } else if (Code.autoStanima.advAA == 4 && utf3.equals("Chiến trường đã khép lại, xem kết quả tại Npc Rikudou.")) {
                            TileMap.advAG();
                        }
                    } else if (Code.cNameLeader != null && !Code.cNameLeader.equals(Char.getMyChar().cName) && utf3.equals("Đối phương đang ở trong nhóm khác.")) {
                        Service.gI().outParty();
                    }

                    if (Code.auto instanceof AutoDanhVong) {
                        AutoDanhVong.advAB(utf3);
                    }

                    InfoMe.addInfo(utf3, 50, mFont.tahoma_7_yellow);
                    return;
                case -23:
                    var252 = msg.reader().readInt();
                    String var254 = msg.reader().readUTF();
                    if (Char.getMyChar().charID == var252) {
                        aChar = Char.getMyChar();
                    } else {
                        aChar = GameScr.findCharInMap(var252);
                    }

                    if (aChar == null) {
                        return;
                    }

                    ChatPopup.addChatPopup(var254, 100, aChar);
                    ChatManager.gI().addChat(mResources.PUBLICCHAT[0], aChar.cName, var254);
                    break;
                case -22:
                    String utf5 = msg.reader().readUTF();
                    String utf6 = msg.reader().readUTF();
                    ChatManager.gI().addChat(utf5, utf5, utf6);
                    if ((!GameScr.isPaintMessage || !ChatManager.gI().getCurrentChatTab().ownerName.equals(utf5)) && !ChatManager.blockPrivateChat) {
                        ChatManager.gI().addWaitList(utf5);
                    }
                    Code.advAB(utf5, utf6);
                    return;
                case -21:
                    var220 = msg.reader().readUTF();
                    var206 = msg.reader().readUTF();
                    ChatManager.gI().addChat(mResources.GLOBALCHAT[0], var220, var206);
                    if (!ChatManager.blockGlobalChat) {
                        Info.addInfo(var220 + ": " + var206, 80, mFont.tahoma_7b_yellow);
                    }
                    break;
                case -20:
                    String utf9 = msg.reader().readUTF();
                    String utf10 = msg.reader().readUTF();
                    ChatManager.gI().addChat(mResources.PARTYCHAT[0], utf9, utf10);
                    if (!GameScr.isPaintMessage || ChatManager.gI().getCurrentChatTab().type != 1) {
                        ChatManager.gI().isMessagePt = true;
                    }
                    Code.advAD(utf9, utf10);
                    return;
                case -19:
                    var188 = msg.reader().readUTF();
                    var191 = msg.reader().readUTF();
                    ChatManager.gI().addChat(mResources.CLANCHAT[0], var188, var191);
                    if (!GameScr.isPaintMessage || ChatManager.gI().getCurrentChatTab().type != 4) {
                        ChatManager.isMessageClan = true;
                    }
                    break;
                case -18:
                    GameCanvas.isLoading = true;
                    GameScr.resetAllvector();
                    TileMap.vGo.removeAllElements();
                    System.gc();
                    TileMap.mapID = (short) msg.reader().readUnsignedByte();
                    TileMap.tileID = msg.reader().readByte();
                    TileMap.bgID = msg.reader().readByte();
                    TileMap.typeMap = msg.reader().readByte();
                    TileMap.mapName = msg.reader().readUTF();
                    TileMap.zoneID = msg.reader().readByte();
                    TileMap.loadTileUse();

                    try {
                        TileMap.loadMapFromResource();
                    } catch (Exception var180) {
                        Service.gI().requestMaptemplate(TileMap.mapID);
                        this.messWait = msg;
                        return;
                    }

                    this.loadInfoMap(msg);
                    if (Char.getMyChar().mobMe != null) {
                        Char.getMyChar().mobMe.x = Char.getMyChar().cx;
                        Char.getMyChar().mobMe.y = Char.getMyChar().cy - 40;
                    }
                    break;
                case -16:
                    Char.isLockKey = true;
                    Char.ischangingMap = true;
                    Mob.vEggMonter.removeAllElements();
                    GameScr.gI().timeStartMap = 0;
                    GameScr.gI().timeLengthMap = 0;
                    Char.getMyChar().mobFocus = null;
                    Char.getMyChar().npcFocus = null;
                    Char.getMyChar().charFocus = null;
                    Char.getMyChar().itemFocus = null;
                    Char.getMyChar().focus.removeAllElements();
                    Char.getMyChar().testCharId = -9999;
                    Char.getMyChar().killCharId = -9999;
                    GameScr.resetAllvector();
                    GameCanvas.resetBg();
                    if (GameScr.vParty.size() <= 1) {
                        GameScr.vParty.removeAllElements();
                    }

                    GameScr.gI().resetButton();
                    GameScr.gI().center = null;
                    break;
                case -15:
                    var232 = msg.reader().readShort();

                    for (var234 = 0; var234 < GameScr.vItemMap.size(); ++var234) {
                        if (((ItemMap) GameScr.vItemMap.elementAt(var234)).itemMapID == var232) {
                            GameScr.vItemMap.removeElementAt(var234);
                            return;
                        }
                    }

                    return;
                case -14:
                    Char.getMyChar().itemFocus = null;
                    var232 = msg.reader().readShort();

                    for (var234 = 0; var234 < GameScr.vItemMap.size(); ++var234) {
                        if ((var236 = (ItemMap) GameScr.vItemMap.elementAt(var234)).itemMapID == var232) {
                            var236.setPoint(Char.getMyChar().cx, Char.getMyChar().cy - 10);
                            if (var236.template.type == 19) {
                                int var237 = msg.reader().readUnsignedShort();
                                Char.getMyChar().yen += var237;
                                if (var236.template.id != 238) {
                                    InfoMe.addInfo(mResources.RECEIVE + " " + var237 + " " + mResources.YEN);
                                    return;
                                }
                            } else if (var236.template.type == 25 && var236.template.id != 238) {
                                InfoMe.addInfo(mResources.RECEIVE + " " + var236.template.name, 15, mFont.tahoma_7_yellow);
                                return;
                            }

                            return;
                        }
                    }
                    LockGame.advAD();

                    return;
                case -13:
                    var232 = msg.reader().readShort();

                    for (var234 = 0; var234 < GameScr.vItemMap.size(); ++var234) {
                        if ((var236 = (ItemMap) GameScr.vItemMap.elementAt(var234)).itemMapID == var232) {
                            if ((aChar = GameScr.findCharInMap(msg.reader().readInt())) == null) {
                                return;
                            }

                            var236.setPoint(aChar.cx, aChar.cy - 10);
                            if (var236.x < aChar.cx) {
                                aChar.cdir = -1;
                            } else if (var236.x > aChar.cx) {
                                aChar.cdir = 1;
                                return;
                            }
                            if (var236 == Char.getMyChar().itemFocus) {
                                var236.advAK = true;
                                LockGame.advAD();
                            }
                            return;
                        }
                    }

                    return;
                case -12:
                    var210 = msg.reader().readByte();
                    GameScr.vItemMap.addElement(new ItemMap(msg.reader().readShort(), Char.getMyChar().arrItemBag[var210].template.id, Char.getMyChar().cx, Char.getMyChar().cy, msg.reader().readShort(), msg.reader().readShort()));
                    Char.getMyChar().arrItemBag[var210] = null;
                    break;
                case -11:
                    Char.getMyChar().cPk = msg.reader().readByte();
                    Char.getMyChar().waitToDie(msg.reader().readShort(), msg.reader().readShort());

                    try {
                        Char.getMyChar().cEXP = msg.reader().readLong();
                        GameScr.setLevel_Exp(Char.getMyChar().cEXP, true);
                    } catch (Exception var144) {
                    }

                    Char.getMyChar().countKill = 0;
                    break;
                case -10:
                    if (Char.getMyChar().wdx != 0 || Char.getMyChar().wdy != 0) {
                        Char.getMyChar().cx = Char.getMyChar().wdx;
                        Char.getMyChar().cy = Char.getMyChar().wdy;
                        Char.getMyChar().wdx = Char.getMyChar().wdy = 0;
                    }

                    Char.getMyChar().liveFromDead();
                    Char.isLockKey = false;
                    break;
                case -8:
                    int var245 = msg.reader().readInt();
                    Char.getMyChar().yen += var245;
                    GameScr.gI().yenTemp = var245;
                    GameScr.startFlyText(var245 > 0 ? "+" + var245 : "" + var245, Char.getMyChar().cx, Char.getMyChar().cy - Char.getMyChar().ch - 10, 0, -2, 1);
                    break;
                case -7:
                    var86 = msg.reader().readInt();
                    Char.getMyChar().xu += var86;
                    Char.getMyChar().yen -= var86;
                    GameScr.startFlyText("+" + var86, Char.getMyChar().cx, Char.getMyChar().cy - Char.getMyChar().ch - 10, 0, -2, 1);
                    break;
                case -6:
                    if ((aChar = GameScr.findCharInMap(msg.reader().readInt())) == null) {
                        return;
                    }

                    GameScr.vItemMap.addElement(new ItemMap(msg.reader().readShort(), msg.reader().readShort(), aChar.cx, aChar.cy, msg.reader().readShort(), msg.reader().readShort()));
                    break;
                case -5:
                    try {
                        (mob = Mob.get_Mob(msg.reader().readUnsignedByte())).sys = msg.reader().readByte();
                        mob.levelBoss = msg.reader().readByte();
                        mob.x = mob.xFirst;
                        mob.y = mob.yFirst;
                        mob.status = 5;
                        mob.injureThenDie = false;
                        mob.hp = msg.reader().readInt();
                        mob.maxHp = mob.hp;
                        if (mob.getTemplate().mobTemplateId == 202) {
                            ServerEffect.addServerEffect(148, mob.x, mob.y, 0);
                        } else {
                            ServerEffect.addServerEffect(60, mob.x, mob.y, 1);
                        }
                        Auto.advAA(mob);

                    } catch (Exception var155) {
                        var155.printStackTrace();
                    }
                    break;
                case -4:
                    mob = null;

                    try {
                        mob = Mob.get_Mob(msg.reader().readUnsignedByte());
                    } catch (Exception var151) {
                    }

                    if (mob != null && mob.status != 0 && mob.status != 0) {
                        mob.startDie();

                        try {
                            if ((var252 = msg.reader().readInt()) < 0) {
                                var252 = Res.abs(var252) + 32767;
                            }

                            if (msg.reader().readBoolean()) {
                                GameScr.startFlyText("-" + var252, mob.x, mob.y - mob.h, 0, -2, 3);
                            } else {
                                GameScr.startFlyText("-" + var252, mob.x, mob.y - mob.h, 0, -2, 5);
                            }

                            ItemMap var253 = new ItemMap(msg.reader().readShort(), msg.reader().readShort(), mob.x, mob.y, msg.reader().readShort(), msg.reader().readShort());
                            GameScr.vItemMap.addElement(var253);
                            if (Res.abs(var253.y - Char.getMyChar().cy) < 24 && Res.abs(var253.x - Char.getMyChar().cx) < 24) {
                                Char.getMyChar().charFocus = null;
                            }
                        } catch (Exception var150) {
                        }
                    }
                    break;
                case -3:
                    mob = null;

                    try {
                        mob = Mob.get_Mob(msg.reader().readUnsignedByte());
                    } catch (Exception var148) {
                        System.out.println("----err null:NPC_ATTACK_ME");
                    }

                    if (mob != null) {
                        var252 = msg.reader().readInt();

                        try {
                            var250 = msg.reader().readInt();
                        } catch (Exception var147) {
                            var250 = 0;
                        }

                        if (mob.isBusyAttackSomeOne) {
                            Char.getMyChar().doInjure(var252, var250, false, -1);
                            mob.attackOtherInRange();
                        } else {
                            mob.dame = var252;
                            mob.dameMp = var250;
                            mob.setAttack(Char.getMyChar());
                        }

                        var190 = msg.reader().readShort();
                        var194 = msg.reader().readByte();
                        var185 = msg.reader().readByte();
                        mob.setTypeAtk(var190, var194, var185);
                    }
                    break;
                case -2:
                    mob = null;

                    try {
                        mob = Mob.get_Mob(msg.reader().readUnsignedByte());
                    } catch (Exception var146) {
                    }

                    if (mob != null) {
                        if ((aChar = GameScr.findCharInMap(msg.reader().readInt())) == null) {
                            return;
                        }

                        var250 = msg.reader().readInt();
                        mob.dame = aChar.cHP - var250;
                        aChar.cHpNew = var250;

                        try {
                            aChar.cMP = msg.reader().readInt();
                        } catch (Exception var145) {
                        }

                        if (mob.isBusyAttackSomeOne) {
                            aChar.doInjure(mob.dame, 0, false, -1);
                            mob.attackOtherInRange();
                        } else {
                            mob.setAttack(aChar);
                        }

                        var190 = msg.reader().readShort();
                        var194 = msg.reader().readByte();
                        var185 = msg.reader().readByte();
                        mob.setTypeAtk(var190, var194, var185);
                    }
                    break;
                case -1:
                    mob = null;

                    try {
                        mob = Mob.get_Mob(msg.reader().readUnsignedByte());
                    } catch (Exception var154) {
                    }

                    if (mob != null) {
                        mob.hp = msg.reader().readInt();
                        if ((var252 = msg.reader().readInt()) < 0) {
                            var252 = Res.abs(var252) + 32767;
                        }

                        boolean var94 = msg.reader().readBoolean();

                        try {
                            mob.levelBoss = msg.reader().readByte();
                            mob.maxHp = msg.reader().readInt();
                            Auto.advAA(mob);

                        } catch (Exception var153) {
                        }

                        if (var94) {
                            GameScr.startFlyText("-" + var252, mob.x, mob.y - mob.h, 0, -2, 3);
                        } else {
                            GameScr.startFlyText("-" + var252, mob.x, mob.y - mob.h, 0, -2, 5);
                        }
                    }
                    break;
                case 0:
                    if ((aChar = GameScr.findCharInMap(msg.reader().readInt())) == null) {
                        return;
                    }

                    aChar.cPk = msg.reader().readByte();
                    if (aChar.charID == Char.aCID) {
                        Char.isAFocusDie = true;
                    }

                    aChar.waitToDie(msg.reader().readShort(), msg.reader().readShort());
                    if (Char.getMyChar().charFocus == aChar) {
                        Char.getMyChar().charFocus = null;
                    }
                    break;
                case 1:
                    var91 = msg.reader().readInt();

                    for (var249 = 0; var249 < GameScr.vCharInMap.size(); ++var249) {
                        var248 = null;

                        try {
                            var248 = (Char) GameScr.vCharInMap.elementAt(var249);
                        } catch (Exception var156) {
                            System.out.println("Char null");

                        }

                        if (var248 == null) {
                            return;
                        }

                        if (var248.charID == var91) {
                            var248.cxMoveLast = msg.reader().readShort();
                            var248.cyMoveLast = msg.reader().readShort();
                            var248.moveTo(var248.cxMoveLast, var248.cyMoveLast);
                            var248.lastUpdateTime = System.currentTimeMillis();
                            return;
                        }
                    }

                    return;
                case 2:
                    var91 = msg.reader().readInt();

                    for (var249 = 0; var249 < GameScr.vCharInMap.size(); ++var249) {
                        if ((var248 = (Char) GameScr.vCharInMap.elementAt(var249)) != null && var248.charID == var91) {
                            if (!var248.isInvisible && var248.isHuman && !var248.isNhanban) {
                                ServerEffect.addServerEffect(60, var248.cx, var248.cy, 1);
                            } else if (!var248.isInvisible && var248.isNhanbanz() && !var248.isHuman) {
                                ServerEffect.addServerEffect(141, var248.cx, var248.cy, 0);
                            }

                            GameScr.vCharInMap.removeElementAt(var249);
                            Party.clear(var91);
                            if (!var248.isHumanz() && var248.cName.equals(Char.getMyChar().cName)) {
                                Char.getMyChar().advAC = null;
                            }
                            return;
                        }
                    }

                    return;
                case 3:
                    (aChar = new Char()).charID = msg.reader().readInt();
                    if (readCharInfo(aChar, msg)) {
                        GameScr.vCharInMap.addElement(aChar);
                        Auto.advAB(aChar);
                        if (!aChar.isHumanz() && aChar.cName.equals(Char.getMyChar().cName)) {
                            Char.getMyChar().advAC = aChar;
                            LockGame.advBD();
                        }
                        if (aChar.charID == -Char.getMyChar().charID) {
                            Char.getMyChar().advAD = aChar;
                        }
                        if (Code.advAB(aChar.cName) && !Code.autoStanima.advAB()) {
                            Service.gI().addParty(aChar.cName);
                        }
                        if (Char.getMyChar().charID != aChar.charID && Code.auto != null && Code.auto instanceof AutoSellPro && AutoSellPro.sellerBF) {
                            AutoSellPro.sellerAO();
                            AutoSellPro.sellerAB(aChar.cName);
                        }
                        if (Char.getMyChar().charID != aChar.charID && Code.auto != null && Code.auto instanceof AutoNTGT && AutoNTGT.ntgtBN) {
                            AutoNTGT.ntgtAP().ntgtAG(aChar.cName);
                        }
                    }
                    break;
                case 4:
                    if ((aChar = GameScr.findCharInMap(msg.reader().readInt())) == null) {
                        return;
                    }

                    if ((TileMap.tileTypeAtPixel(aChar.cx, aChar.cy) & 2) == 2) {
                        aChar.setSkillPaint((SkillPaint) GameScr.sks[msg.reader().readByte()], 0);
                    } else {
                        aChar.setSkillPaint((SkillPaint) GameScr.sks[msg.reader().readByte()], 1);
                    }

                    if (aChar.isWolf) {
                        aChar.isWolf = false;
                        aChar.timeSummon = System.currentTimeMillis();
                        ServerEffect.addServerEffect(60, aChar, 1);
                    }

                    if (aChar.isMoto) {
                        aChar.isMoto = false;
                        aChar.isMotoBehind = true;
                    }

                    var185 = msg.reader().readByte();
                    aChar.attMobs = new Mob[var185];

                    for (var242 = 0; var242 < aChar.attMobs.length; ++var242) {
                        Mob var246 = Mob.get_Mob(msg.reader().readUnsignedByte());
                        aChar.attMobs[var242] = var246;
                        if (var242 == 0) {
                            if (aChar.cx <= var246.x) {
                                aChar.cdir = 1;
                            } else {
                                aChar.cdir = -1;
                            }
                        }
                    }

                    aChar.mobFocus = aChar.attMobs[0];
                    var80 = new Char[10];
                    var81 = 0;

                    try {
                        for (var81 = 0; var81 < var80.length; ++var81) {
                            Char var243;
                            if ((var186 = msg.reader().readInt()) == Char.getMyChar().charID) {
                                var243 = Char.getMyChar();
                            } else {
                                var243 = GameScr.findCharInMap(var186);
                            }

                            var80[var81] = var243;
                            if (var81 == 0) {
                                if (aChar.cx <= var243.cx) {
                                    aChar.cdir = 1;
                                } else {
                                    aChar.cdir = -1;
                                }
                            }
                        }
                    } catch (Exception var174) {
                    }

                    if (var81 > 0) {
                        aChar.attChars = new Char[var81];

                        for (var81 = 0; var81 < aChar.attChars.length; ++var81) {
                            aChar.attChars[var81] = var80[var81];
                        }

                        aChar.charFocus = aChar.attChars[0];
                    }
                    break;
                case 5:
                    var247 = msg.reader().readLong();
                    Char.getMyChar().cExpDown = 0L;
                    Char.getMyChar().cEXP += var247;
                    int var89 = Char.getMyChar().clevel;
                    GameScr.setLevel_Exp(Char.getMyChar().cEXP, true);
                    if (var89 != Char.getMyChar().clevel) {
                        ServerEffect.addServerEffect(58, Char.getMyChar(), 1);
                    }

                    GameScr.startFlyText("+" + var247, Char.getMyChar().cx, Char.getMyChar().cy - Char.getMyChar().ch, 0, -2, 2);
                    if (var247 >= 1000000L) {
                        InfoMe.addInfo(mResources.RECEIVE + " " + var247 + " " + mResources.EXP, 20, mFont.tahoma_7_yellow);
                    }
                    break;
                case 6:
                    ItemMap var233 = new ItemMap(msg.reader().readShort(), msg.reader().readShort(), msg.reader().readShort(), msg.reader().readShort());
                    byte[] var235;
                    if ((var235 = NinjaUtil.readByteArray_Int(msg)) != null && var235.length > 0) {
                        var233.imgCaptcha = new MyImage();
                        var233.imgCaptcha.img = createImage(var235);
                    }

                    GameScr.vItemMap.addElement(var233);
                    break;
                case 7:
                    Char.getMyChar().arrItemBag[msg.reader().readByte()].quantity = msg.reader().readShort();
                    break;
                case 8:
                    var210 = msg.reader().readByte();
                    Char.getMyChar().arrItemBag[var210] = new Item();
                    Char.getMyChar().arrItemBag[var210].typeUI = 3;
                    Char.getMyChar().arrItemBag[var210].indexUI = var210;
                    Char.getMyChar().arrItemBag[var210].template = ItemTemplates.get(msg.reader().readShort());
                    Char.getMyChar().arrItemBag[var210].isLock = msg.reader().readBoolean();
                    if (Char.getMyChar().arrItemBag[var210].isTypeBody() || Char.getMyChar().arrItemBag[var210].isTypeNgocKham()) {
                        Char.getMyChar().arrItemBag[var210].upgrade = msg.reader().readByte();
                    }

                    Char.getMyChar().arrItemBag[var210].isExpires = msg.reader().readBoolean();

                    try {
                        Char.getMyChar().arrItemBag[var210].quantity = msg.reader().readUnsignedShort();
                    } catch (Exception var166) {
                        Char.getMyChar().arrItemBag[var210].quantity = 1;
                    }

                    if (Char.getMyChar().arrItemBag[var210].template.type == 16) {
                        GameScr.hpPotion += Char.getMyChar().arrItemBag[var210].quantity;
                    }

                    if (Char.getMyChar().arrItemBag[var210].template.type == 17) {
                        GameScr.mpPotion += Char.getMyChar().arrItemBag[var210].quantity;
                    }

                    if (Char.getMyChar().arrItemBag[var210].template.id == 340) {
                        gameScr = GameScr.gI();
                        gameScr.numSprinLeft += Char.getMyChar().arrItemBag[var210].quantity;
                    }

                    if (GameScr.isPaintTrade) {
                        if (GameScr.gI().tradeItemName.equals("")) {
                            gameScr = GameScr.gI();
                            gameScr.tradeItemName = gameScr.tradeItemName + Char.getMyChar().arrItemBag[var210].template.name;
                        } else {
                            gameScr = GameScr.gI();
                            gameScr.tradeItemName = gameScr.tradeItemName + ", " + Char.getMyChar().arrItemBag[var210].template.name;
                        }
                    } else if (Char.getMyChar().arrItemBag[var210].template.type != 20) {
                        InfoMe.addInfo(mResources.RECEIVE + " " + Char.getMyChar().arrItemBag[var210].template.name);
                        LockGame.advAT();

                    }
                    break;
                case 9:
                    var193 = Char.getMyChar().arrItemBag[msg.reader().readUnsignedByte()];
                    var226 = false;

                    try {
                        var224 = msg.reader().readShort();
                    } catch (Exception var164) {
                        var224 = 1;
                    }

                    var193.quantity += var224;
                    if (var193.template.type == 16) {
                        GameScr.hpPotion += var224;
                    }

                    if (var193.template.type == 17) {
                        GameScr.mpPotion += var224;
                    }

                    if (var193.template.id == 340) {
                        gameScr = GameScr.gI();
                        gameScr.numSprinLeft += var224;
                    }

                    GameCanvas.endDlg();
                    if (GameScr.isPaintTrade) {
                        if (GameScr.gI().tradeItemName.equals("")) {
                            gameScr = GameScr.gI();
                            gameScr.tradeItemName = gameScr.tradeItemName + var193.template.name;
                        } else {
                            gameScr = GameScr.gI();
                            gameScr.tradeItemName = gameScr.tradeItemName + ", " + var193.template.name;
                        }
                    } else if (var193.template.type != 20) {
                        InfoMe.addInfo(mResources.RECEIVE + " " + var193.template.name);
                    }
                    break;
                case 10:
                    byte b13 = msg.reader().readByte();
                    if (Char.getMyChar().arrItemBag[b13] != null && Char.getMyChar().arrItemBag[b13].template != null) {
                        if (Char.getMyChar().arrItemBag[b13].template.type == 16) {
                            GameScr.hpPotion -= Char.getMyChar().arrItemBag[b13].quantity;
                        }
                        if (Char.getMyChar().arrItemBag[b13].template.type == 17) {
                            GameScr.mpPotion -= Char.getMyChar().arrItemBag[b13].quantity;
                        }
                        Char.getMyChar().arrItemBag[b13] = null;
                    }

                    if (GameScr.isPaintUI()) {
                        GameScr.gI().left = GameScr.gI().center = null;
                    } else {
                        GameScr.gI().resetButton();
                    }

                    return;
                case 11:
                    var210 = msg.reader().readByte();
                    if (Char.getMyChar().arrItemBag[var210].template.type == 24) {
                        InfoDlg.hide();
                    }

                    Char.getMyChar().useItem(var210);
                    Char.getMyChar().readParam(msg);
                    Char.getMyChar().eff5BuffHp = msg.reader().readShort();
                    Char.getMyChar().eff5BuffMp = msg.reader().readShort();
                    GameScr.gI().setLCR();
                    LockGame.advAR();

                    break;
                case 13:
                    Char.getMyChar().xu = msg.reader().readInt();
                    Char.getMyChar().yen = msg.reader().readInt();
                    Char.getMyChar().luong = msg.reader().readInt();
                    LockGame.advAH();
                    GameCanvas.endDlg();
                    break;
                case 14:
                    var240 = Char.getMyChar().arrItemBag[msg.reader().readByte()];
                    Char.getMyChar().yen = msg.reader().readInt();
                    var226 = false;

                    try {
                        var224 = msg.reader().readShort();
                    } catch (Exception var157) {
                        var224 = 1;
                    }

                    var240.quantity -= var224;
                    if (var240.template.type == 16) {
                        GameScr.hpPotion -= var224;
                    }

                    if (var240.template.type == 17) {
                        GameScr.mpPotion -= var224;
                    }

                    if (var240.quantity <= 0) {
                        Char.getMyChar().arrItemBag[var240.indexUI] = null;
                    }
                    if (GameScr.isPaintUI()) {

                        GameScr.gI().left = GameScr.gI().center = null;
                        GameScr.gI().updateCommandForUI();
                    }
                    GameCanvas.endDlg();
                    LockGame.advAT();

                    break;
                case 15:
                    Char.getMyChar().itemBodyToBag(msg);
                    LockGame.advAR();

                    break;
                case 16:
                    Char.getMyChar().itemBoxToBag(msg);
                    break;
                case 17:
                    Char.getMyChar().itemBagToBox(msg);
                    AutoDanhVong.advAB();

                    break;
                case 18:
                    var210 = msg.reader().readByte();
                    var224 = 1;

                    try {
                        var224 = msg.reader().readShort();
                    } catch (Exception var165) {
                    }

                    if (Char.getMyChar().arrItemBag[var210].template.type == 24) {
                        InfoDlg.hide();
                    }

                    if (Char.getMyChar().arrItemBag[var210].template.type == 16) {
                        --GameScr.hpPotion;
                    }

                    if (Char.getMyChar().arrItemBag[var210].template.type == 17) {
                        --GameScr.mpPotion;
                    }

                    if (Char.getMyChar().arrItemBag[var210].quantity > var224) {
                        Item var257 = Char.getMyChar().arrItemBag[var210];
                        var257.quantity -= var224;
                    } else {
                        Char.getMyChar().arrItemBag[var210] = null;
                    }

                    if (GameScr.isPaintInfoMe) {
                        GameScr.gI().setLCR();
                    }
                    AutoDanhVong.advAC();

                    break;
                case 19:
                    Char.getMyChar();
                    Char.crystalCollect(msg, true);
                    break;
                case 20:
                    Char.getMyChar();
                    Char.crystalCollect(msg, false);
                    break;
                case 21:
                    var185 = msg.reader().readByte();
                    Char.getMyChar().luong = msg.reader().readInt();
                    Char.getMyChar().xu = msg.reader().readInt();
                    Char.getMyChar().yen = msg.reader().readInt();
                    if (GameScr.itemUpGrade != null) {
                        GameScr.itemUpGrade.upgrade = msg.reader().readByte();
                        GameScr.itemUpGrade.isLock = true;
                        GameScr.itemUpGrade.clearExpire();
                        if (var185 == 1) {
                            GameScr.effUpok = GameScr.efs[53];
                            GameScr.indexEff = 0;
                        }
                    }

                    if (GameScr.arrItemUpGrade != null) {
                        for (var201 = 0; var201 < GameScr.arrItemUpGrade.length; ++var201) {
                            GameScr.arrItemUpGrade[var201] = null;
                        }
                    }

                    if (var185 == 5 || var185 == 6) {
                        if (GameScr.itemSplit != null) {
                            GameScr.itemSplit = null;
                        }

                        if (GameScr.arrItemSplit != null) {
                            for (var201 = 0; var201 < GameScr.arrItemSplit.length; ++var201) {
                                GameScr.arrItemSplit[var201] = null;
                            }
                        }
                    }

                    GameScr.gI().left = GameScr.gI().center = null;
                    GameScr.gI().updateKeyBuyItemUI();
                    GameCanvas.endDlg();
                    if (var185 == 5) {
                        InfoMe.addInfo(mResources.TYPEKHAMNGOC[0] + GameScr.itemUpGrade.upgrade, 20, mFont.tahoma_7_white);
                    } else if (var185 == 6) {
                        InfoMe.addInfo(mResources.TYPEKHAMNGOC[1] + GameScr.itemUpGrade.upgrade, 20, mFont.tahoma_7_red);
                    } else if (var185 == 1) {
                        InfoMe.addInfo(mResources.TYPEUPGRADE[0] + GameScr.itemUpGrade.upgrade, 20, mFont.tahoma_7_white);
                    } else {
                        InfoMe.addInfo(mResources.TYPEUPGRADE[1] + GameScr.itemUpGrade.upgrade, 20, mFont.tahoma_7_red);
                    }
                    break;
                case 22:
                    var185 = msg.reader().readByte();
                    var191 = mResources.SPLIT_ITEM_NAME;

                    for (ine1 = 0; ine1 < GameScr.arrItemSplit.length; ++ine1) {
                        GameScr.arrItemSplit[ine1] = null;
                    }

                    for (ine1 = 0; ine1 < var185; ++ine1) {
                        Item var218;
                        (var218 = new Item()).typeUI = 3;
                        var218.indexUI = msg.reader().readByte();
                        var218.template = ItemTemplates.get(msg.reader().readShort());
                        var218.expires = -1L;
                        var218.quantity = 1;
                        var218.isLock = GameScr.itemSplit.isLock;
                        Char.getMyChar().arrItemBag[var218.indexUI] = var218;
                        var191 = var191 + var218.template.name;
                        if (ine1 < var185 - 1) {
                            var191 = var191 + ", ";
                        }
                    }

                    GameScr.itemSplit.upgrade = 0;
                    GameScr.itemSplit.clearExpire();
                    GameScr.gI().left = GameScr.gI().center = null;
                    GameScr.gI().updateCommandForUI();
                    GameCanvas.endDlg();
                    InfoMe.addInfo(var191);
                    GameScr.effUpok = GameScr.efs[66];
                    GameScr.indexEff = 0;
                    LockGame.advAR();

                    break;
                case 23:
                    String utf11;
                    if (Code.advAC(utf11 = msg.reader().readUTF())) {
                        Service.gI().acceptPleaseParty(utf11);
                    } else {
                        GameCanvas.startYesNoDlg(utf11 + " " + mResources.PLEASE_PARTY, 8889, (Object) utf11, 8882, (Object) null);
                    }
                    return;
                case 25:
                    byte var95 = msg.reader().readByte();

                    for (int var255 = 0; var255 < var95; ++var255) {
                        int var97 = msg.reader().readInt();
                        short var98 = msg.reader().readShort();
                        short var99 = msg.reader().readShort();
                        int var100 = msg.reader().readInt();
                        Char var101;
                        if ((var101 = GameScr.findCharInMap(var97)) != null) {
                            var101.cx = var98;
                            var101.cy = var99;
                            var101.cHP = var100;
                            var101.lastUpdateTime = System.currentTimeMillis();
                        }
                    }

                    return;
                case 26:
                    Char.getMyChar().countKill = msg.reader().readUnsignedShort();
                    Char.getMyChar().countKillMax = msg.reader().readUnsignedShort();
                    break;
                case 27:
                    Mob var222 = Mob.get_Mob(msg.reader().readUnsignedByte());
                    if ((var186 = msg.reader().readInt()) == Char.getMyChar().charID) {
                        aChar = Char.getMyChar();
                    } else {
                        aChar = GameScr.findCharInMap(var186);
                    }

                    aChar.moveFast = new short[3];
                    aChar.moveFast[0] = 0;
                    aChar.moveFast[1] = (short) var222.x;
                    aChar.moveFast[2] = (short) var222.y;
                    aChar.isBlinking = false;
                    break;
                case 30:
                    byte var75 = msg.reader().readByte();

                    try {
                        GameScr.svTitle = msg.reader().readUTF();
                        GameScr.svAction = msg.reader().readUTF();
                    } catch (Exception var158) {
                    }

                    GameScr.gI().doOpenUI((int) var75);
                    LockGame.advAR();
                    AutoDanhVong.advAH();
                    break;
                case 31:
                    Char.getMyChar().xuInBox = msg.reader().readInt();
                    Char.getMyChar().arrItemBox = new Item[msg.reader().readUnsignedByte()];

                    for (var77 = 0; var77 < Char.getMyChar().arrItemBox.length; ++var77) {
                        short var251;
                        if ((var251 = msg.reader().readShort()) != -1) {
                            Char.getMyChar().arrItemBox[var77] = new Item();
                            Char.getMyChar().arrItemBox[var77].typeUI = 4;
                            Char.getMyChar().arrItemBox[var77].indexUI = var77;
                            Char.getMyChar().arrItemBox[var77].template = ItemTemplates.get(var251);
                            Char.getMyChar().arrItemBox[var77].isLock = msg.reader().readBoolean();
                            if (Char.getMyChar().arrItemBox[var77].isTypeBody() || Char.getMyChar().arrItemBox[var77].isTypeNgocKham()) {
                                Char.getMyChar().arrItemBox[var77].upgrade = msg.reader().readByte();
                            }

                            Char.getMyChar().arrItemBox[var77].isExpires = msg.reader().readBoolean();
                            Char.getMyChar().arrItemBox[var77].quantity = msg.reader().readShort();
                        }
                    }
                    LockGame.advAT();

                    return;
                case 33:
                    byte var238;
                    int var239;
                    if ((var238 = msg.reader().readByte()) == 14) {
                        GameScr.arrItemStore = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemStore.length; ++var239) {
                            GameScr.arrItemStore[var239] = new Item();
                            GameScr.arrItemStore[var239].typeUI = 14;
                            GameScr.arrItemStore[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemStore[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 15) {
                        GameScr.arrItemBook = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemBook.length; ++var239) {
                            GameScr.arrItemBook[var239] = new Item();
                            GameScr.arrItemBook[var239].typeUI = 15;
                            GameScr.arrItemBook[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemBook[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 32) {
                        GameScr.arrItemFashion = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemFashion.length; ++var239) {
                            GameScr.arrItemFashion[var239] = new Item();
                            GameScr.arrItemFashion[var239].typeUI = 32;
                            GameScr.arrItemFashion[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemFashion[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 34) {
                        GameScr.arrItemClanShop = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemClanShop.length; ++var239) {
                            GameScr.arrItemClanShop[var239] = new Item();
                            GameScr.arrItemClanShop[var239].typeUI = 34;
                            GameScr.arrItemClanShop[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemClanShop[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 35) {
                        GameScr.arrItemElites = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemElites.length; ++var239) {
                            GameScr.arrItemElites[var239] = new Item();
                            GameScr.arrItemElites[var239].typeUI = 35;
                            GameScr.arrItemElites[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemElites[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 20) {
                        GameScr.arrItemNonNam = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemNonNam.length; ++var239) {
                            GameScr.arrItemNonNam[var239] = new Item();
                            GameScr.arrItemNonNam[var239].typeUI = var238;
                            GameScr.arrItemNonNam[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemNonNam[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 21) {
                        GameScr.arrItemNonNu = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemNonNu.length; ++var239) {
                            GameScr.arrItemNonNu[var239] = new Item();
                            GameScr.arrItemNonNu[var239].typeUI = var238;
                            GameScr.arrItemNonNu[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemNonNu[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 22) {
                        GameScr.arrItemAoNam = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemAoNam.length; ++var239) {
                            GameScr.arrItemAoNam[var239] = new Item();
                            GameScr.arrItemAoNam[var239].typeUI = var238;
                            GameScr.arrItemAoNam[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemAoNam[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 23) {
                        GameScr.arrItemAoNu = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemAoNu.length; ++var239) {
                            GameScr.arrItemAoNu[var239] = new Item();
                            GameScr.arrItemAoNu[var239].typeUI = var238;
                            GameScr.arrItemAoNu[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemAoNu[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 24) {
                        GameScr.arrItemGangTayNam = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemGangTayNam.length; ++var239) {
                            GameScr.arrItemGangTayNam[var239] = new Item();
                            GameScr.arrItemGangTayNam[var239].typeUI = var238;
                            GameScr.arrItemGangTayNam[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemGangTayNam[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 25) {
                        GameScr.arrItemGangTayNu = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemGangTayNu.length; ++var239) {
                            GameScr.arrItemGangTayNu[var239] = new Item();
                            GameScr.arrItemGangTayNu[var239].typeUI = var238;
                            GameScr.arrItemGangTayNu[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemGangTayNu[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 26) {
                        GameScr.arrItemQuanNam = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemQuanNam.length; ++var239) {
                            GameScr.arrItemQuanNam[var239] = new Item();
                            GameScr.arrItemQuanNam[var239].typeUI = var238;
                            GameScr.arrItemQuanNam[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemQuanNam[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 27) {
                        GameScr.arrItemQuanNu = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemQuanNu.length; ++var239) {
                            GameScr.arrItemQuanNu[var239] = new Item();
                            GameScr.arrItemQuanNu[var239].typeUI = var238;
                            GameScr.arrItemQuanNu[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemQuanNu[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 28) {
                        GameScr.arrItemGiayNam = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemGiayNam.length; ++var239) {
                            GameScr.arrItemGiayNam[var239] = new Item();
                            GameScr.arrItemGiayNam[var239].typeUI = var238;
                            GameScr.arrItemGiayNam[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemGiayNam[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 29) {
                        GameScr.arrItemGiayNu = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemGiayNu.length; ++var239) {
                            GameScr.arrItemGiayNu[var239] = new Item();
                            GameScr.arrItemGiayNu[var239].typeUI = var238;
                            GameScr.arrItemGiayNu[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemGiayNu[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 16) {
                        GameScr.arrItemLien = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemLien.length; ++var239) {
                            GameScr.arrItemLien[var239] = new Item();
                            GameScr.arrItemLien[var239].typeUI = var238;
                            GameScr.arrItemLien[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemLien[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 17) {
                        GameScr.arrItemNhan = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemNhan.length; ++var239) {
                            GameScr.arrItemNhan[var239] = new Item();
                            GameScr.arrItemNhan[var239].typeUI = var238;
                            GameScr.arrItemNhan[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemNhan[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 18) {
                        GameScr.arrItemNgocBoi = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemNgocBoi.length; ++var239) {
                            GameScr.arrItemNgocBoi[var239] = new Item();
                            GameScr.arrItemNgocBoi[var239].typeUI = var238;
                            GameScr.arrItemNgocBoi[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemNgocBoi[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 19) {
                        GameScr.arrItemPhu = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemPhu.length; ++var239) {
                            GameScr.arrItemPhu[var239] = new Item();
                            GameScr.arrItemPhu[var239].typeUI = var238;
                            GameScr.arrItemPhu[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemPhu[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 2) {
                        GameScr.arrItemWeapon = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemWeapon.length; ++var239) {
                            GameScr.arrItemWeapon[var239] = new Item();
                            GameScr.arrItemWeapon[var239].typeUI = var238;
                            GameScr.arrItemWeapon[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemWeapon[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 6) {
                        GameScr.arrItemStack = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemStack.length; ++var239) {
                            GameScr.arrItemStack[var239] = new Item();
                            GameScr.arrItemStack[var239].typeUI = var238;
                            GameScr.arrItemStack[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemStack[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 7) {
                        GameScr.arrItemStackLock = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemStackLock.length; ++var239) {
                            GameScr.arrItemStackLock[var239] = new Item();
                            GameScr.arrItemStackLock[var239].typeUI = var238;
                            GameScr.arrItemStackLock[var239].isLock = true;
                            GameScr.arrItemStackLock[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemStackLock[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 8) {
                        GameScr.arrItemGrocery = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemGrocery.length; ++var239) {
                            GameScr.arrItemGrocery[var239] = new Item();
                            GameScr.arrItemGrocery[var239].typeUI = var238;
                            GameScr.arrItemGrocery[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemGrocery[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        return;
                    } else if (var238 == 9) {
                        GameScr.arrItemGroceryLock = new Item[msg.reader().readByte()];

                        for (var239 = 0; var239 < GameScr.arrItemGroceryLock.length; ++var239) {
                            GameScr.arrItemGroceryLock[var239] = new Item();
                            GameScr.arrItemGroceryLock[var239].typeUI = var238;
                            GameScr.arrItemGroceryLock[var239].isLock = true;
                            GameScr.arrItemGroceryLock[var239].indexUI = msg.reader().readUnsignedByte();
                            GameScr.arrItemGroceryLock[var239].template = ItemTemplates.get(msg.reader().readShort());
                        }
                    }
                    LockGame.advBF();

                    return;

                case 34:
                    var195 = new MyVector();
                    if (!(var188 = msg.reader().readUTF()).equals("")) {
                        GameScr.gI().showAlert((String) null, (String) var188, true);
                    }

                    var185 = msg.reader().readByte();

                    for (ine1 = 0; ine1 < var185; ++ine1) {
                        var206 = msg.reader().readUTF();
                        Short var228 = new Short(msg.reader().readShort());
                        var195.addElement(new Command(var206, GameCanvas.instance, 88819, var228));
                    }

                    GameCanvas.menu.startAt(var195);
                    break;
                case 36:
                    GameScr.gI().openUIZone(msg);
                    LockGame.advAF();

                    break;
                case 37:
                    GameScr.gI().tradeName = msg.reader().readUTF();
                    GameScr.gI().openUITrade();
                    LockGame.advBB();
                    if (Code.auto instanceof AutoTrade) {
                        AutoTrade.gI().lastInviteTime = System.currentTimeMillis();
                        AutoTrade.gI().tradeStep = 37;
                    }
                    if (Code.auto instanceof AutoSellPro) {
                        AutoSellPro.sellerAO().sellerAZ = System.currentTimeMillis();
                        AutoSellPro.sellerAO().sellerBM = 37;
                    }
                    if (Code.auto instanceof AutoNTGT) {
                        AutoNTGT.ntgtAP().ntgtAC = System.currentTimeMillis();
                        AutoNTGT.ntgtAP().ntgtBO = 37;
                    }
                    break;
                case 38:
                    short aShort1 = msg.reader().readShort();

                    for (int int1 = 0; int1 < GameScr.vNpc.size(); ++int1) {
                        Npc npc1;
                        if ((npc1 = (Npc) GameScr.vNpc.elementAt(int1)).template.npcTemplateId == aShort1 && npc1.equals(Char.getMyChar().npcFocus)) {
                            String utf13 = msg.reader().readUTF();
                            ChatPopup.addChatPopupMultiLine(utf13, 1000, npc1);
                            if (npc1.template.npcTemplateId == 0) {
                                if (utf13.equals("Số lần vào trong hang hôm nay của con đã hết.")) {
                                    AutoStanima.advBA = true;
                                    if (Code.auto instanceof AutoStanima) {
                                        AutoStanima.advAZ = true;
                                    }
                                    if (Code.auto instanceof AutoHd9x) {
                                        Code.java_AC();
                                    }
                                    TileMap.advAG();
                                }
                            } else if (npc1.template.npcTemplateId == 5) {
                                if (utf13.equals("Tốt lắm, ngươi đã chọn nơi này làm nơi trở về khi bị trọng thương")) {
                                    LockGame.advAZ();
                                }
                            } else if (npc1.template.npcTemplateId == 25) {
                                if (Code.auto == Code.autoNVHN) {
                                    AutoNVHN.advAA(utf13);
                                } else if (utf13.equals("Hôm nay con đã làm hết nhiệm vụ ta giao. Hãy quay lại vào ngày hôm sau.")) {
                                    AutoStanima.advAC = true;
                                }
                            }
                            return;
                        }
                    }

                    return;
                case 39:
                    var76 = msg.reader().readShort();

                    for (var77 = 0; var77 < GameScr.vNpc.size(); ++var77) {
                        if ((var78 = (Npc) GameScr.vNpc.elementAt(var77)).template.npcTemplateId == var76 && var78.equals(Char.getMyChar().npcFocus)) {
                            ChatPopup.addChatPopup(msg.reader().readUTF(), 1000, var78);
                            String[] var241 = new String[msg.reader().readByte()];

                            for (var242 = 0; var242 < var241.length; ++var242) {
                                var241[var242] = msg.reader().readUTF();
                            }

                            GameScr.gI();
                            GameScr.createMenu(var241, var78);
                            return;
                        }
                    }

                    return;
                case 40:
                    InfoDlg.hide();
                    GameCanvas.clearKeyHold();
                    GameCanvas.clearKeyPressed();
                    var195 = new MyVector();

                    try {
                        while (true) {
                            var195.addElement(new Command(msg.reader().readUTF(), GameCanvas.instance, 88822, (Object) null));
                        }
                    } catch (Exception var182) {
                        if (Char.getMyChar().npcFocus == null) {
                            return;
                        }
                        if (Char.getMyChar().npcFocus.charID == 25) {
                            GameScr.advGO = var195.size();
                        }
                        for (ine1 = 0; ine1 < Char.getMyChar().npcFocus.template.menu.length; ++ine1) {
                            String[] var216 = Char.getMyChar().npcFocus.template.menu[ine1];
                            var195.addElement(new Command(var216[0], GameCanvas.instance, 88820, var216));
                        }

                        GameCanvas.menu.startAt(var195);
                        // GameCanvas.menu.showbyServer = true;
                        break;
                    }
                case 42:
                    requestItemInfo(msg);
                    break;
                case 43:
                    Integer var212 = new Integer(msg.reader().readInt());
                    if ((var187 = GameScr.findCharInMap(var212.intValue())) != null) {
                        if (Code.auto instanceof AutoSell) {
                            Code.autoSell.advAA(var187.cName, var212.intValue());
                        } else if (Code.auto instanceof AutoSellPro) {
                            if (AutoSellPro.sellerAO().sellerAY == null) {
                                AutoSellPro.sellerAO().sellerAA((int) var212.intValue(), var187.cName);
                            }
                            return;
                        } else if (Code.auto instanceof AutoNTGT) {
                            if (AutoNTGT.ntgtAP().ntgtAB == null) {
                                AutoNTGT.ntgtAP().ntgtAA((int) var212.intValue(), var187.cName);
                            }
                            return;
                        } else {
                            GameCanvas.startYesNoDlg(var187.cName + " " + mResources.INVITETRADE, 88810, var212, 88811, (Object) null);
                        }
                    }
                    break;
                case 45:
                    GameScr.gI().typeTradeOrder = 1;
                    GameScr.gI().coinTradeOrder = msg.reader().readInt();
                    GameScr.arrItemTradeOrder = new Item[12];
                    var202 = msg.reader().readByte();

                    for (var201 = 0; var201 < var202; ++var201) {
                        GameScr.arrItemTradeOrder[var201] = new Item();
                        GameScr.arrItemTradeOrder[var201].typeUI = 3;
                        GameScr.arrItemTradeOrder[var201].indexUI = var201;
                        GameScr.arrItemTradeOrder[var201].template = ItemTemplates.get(msg.reader().readShort());
                        GameScr.arrItemTradeOrder[var201].isLock = false;
                        if (GameScr.arrItemTradeOrder[var201].isTypeBody() || GameScr.arrItemTradeOrder[var201].isTypeNgocKham()) {
                            GameScr.arrItemTradeOrder[var201].upgrade = msg.reader().readByte();
                        }

                        GameScr.arrItemTradeOrder[var201].isExpires = msg.reader().readBoolean();
                        GameScr.arrItemTradeOrder[var201].quantity = msg.reader().readShort();
                    }

                    if (GameScr.gI().typeTrade == 1 && GameScr.gI().typeTradeOrder == 1) {
                        GameScr.gI().timeTrade = (int) (System.currentTimeMillis() / 1000L + 5L);
                    }
                    if (Code.auto instanceof AutoTrade) {
                        AutoTrade.gI().lastInviteTime = System.currentTimeMillis();
                        AutoTrade.gI().tradeStep = 45;
                    }
                    if (Code.auto instanceof AutoSellPro) {
                        AutoSellPro.sellerAO().sellerAZ = System.currentTimeMillis();
                        AutoSellPro.sellerAO().sellerBM = 45;
                    }
                    if (Code.auto instanceof AutoNTGT) {
                        AutoNTGT.ntgtAP().ntgtAC = System.currentTimeMillis();
                        AutoNTGT.ntgtAP().ntgtBO = 45;
                    }
                    break;
                case 46:
                    GameScr.gI().typeTradeOrder = 2;
                    if (GameScr.gI().typeTrade >= 2 && GameScr.gI().typeTradeOrder >= 2) {
                        InfoDlg.showWait();
                        LockGame.advBB();

                    }
                    if (Code.auto instanceof AutoSellPro) {
                        AutoSellPro.sellerAO().sellerAZ = System.currentTimeMillis();
                        AutoSellPro.sellerAO().sellerBM = 46;
                    }
                    if (Code.auto instanceof AutoNTGT) {
                        AutoNTGT.ntgtAP().ntgtAC = System.currentTimeMillis();
                        AutoNTGT.ntgtAP().ntgtBO = 46;
                    }
                    break;
                case 47:
                    GameCanvas.taskTick = 150;
                    var196 = msg.reader().readShort();
                    var202 = msg.reader().readByte();
                    String var227 = msg.reader().readUTF();
                    String var229 = msg.reader().readUTF();
                    String[] var66;
                    short[] var67 = new short[(var66 = new String[msg.reader().readByte()]).length];
                    short var68 = -1;

                    int var230;
                    for (var230 = 0; var230 < var66.length; ++var230) {
                        String var231 = msg.reader().readUTF();
                        var67[var230] = -1;
                        if (!var231.equals("")) {
                            var66[var230] = var231;
                        }
                    }

                    try {
                        var68 = msg.reader().readShort();

                        for (var230 = 0; var230 < var66.length; ++var230) {
                            var67[var230] = msg.reader().readShort();
                        }
                    } catch (Exception var171) {
                    }

                    Char.getMyChar().taskMaint = new Task(var196, var202, var227, var229, var66, var67, var68);
                    Char.getMyChar().callEffTask(21);
                    if (Char.getMyChar().npcFocus != null) {
                        Npc.clearEffTask();
                    }
                    LockGame.advAP();

                    break;
                case 48:
                    if (Char.getMyChar().taskMaint != null) {
                        GameCanvas.taskTick = 100;
                        ++Char.getMyChar().taskMaint.index;
                        Char.getMyChar().taskMaint.count = 0;
                        if (Char.getMyChar().npcFocus != null && Char.getMyChar().npcFocus.chatPopup != null && Char.getMyChar().taskMaint.index >= 2) {
                            Char.getMyChar().npcFocus.chatPopup = null;
                        }

                        if (Char.getMyChar().taskMaint.index >= Char.getMyChar().taskMaint.subNames.length - 1) {
                            Char.getMyChar().callEffTask(61);
                        } else {
                            Char.getMyChar().callEffTask(21);
                        }

                        Npc.clearEffTask();
                    }
                    LockGame.advAP();

                    break;
                case 49:
                    ++Char.getMyChar().ctaskId;
                    Char.getMyChar();
                    Char.clearTask();
                    break;
                case 50:
                    GameCanvas.taskTick = 50;
                    Char.getMyChar().taskMaint.count = msg.reader().readShort();
                    if (Char.getMyChar().npcFocus != null) {
                        Npc.clearEffTask();
                    }
                    break;
                case 51:
                    mob = null;

                    try {
                        mob = Mob.get_Mob(msg.reader().readUnsignedByte());
                    } catch (Exception var152) {
                    }

                    if (mob != null) {
                        mob.hp = msg.reader().readInt();
                        GameScr.startFlyText("", mob.x, mob.y - mob.h, 0, -2, 4);
                    }
                    break;
                case 52:
                    Char.ischangingMap = false;
                    Char.isLockKey = false;
                    Char.getMyChar().cx = msg.reader().readShort();
                    Char.getMyChar().cy = msg.reader().readShort();
                    Char.getMyChar().cxSend = Char.getMyChar().cx;
                    Char.getMyChar().cySend = Char.getMyChar().cy;
                    break;
                case 53:
                    GameScr.gI().resetButton();
                    if (!(var188 = msg.reader().readUTF()).equals("typemoi")) {

                        var191 = msg.reader().readUTF();
                        if (Code.auto instanceof AutoDanhVong) {
                            AutoDanhVong.advAA(var191);
                        } else {
                            GameScr.gI().showAlert(var188, var191, false);
                        }
                    } else {
                        var191 = msg.reader().readUTF();
                        var224 = msg.reader().readShort();
                        var220 = msg.reader().readUTF();
                        sne1 = msg.reader().readShort();
                        str1 = msg.reader().readUTF();
                        short var219 = msg.reader().readShort();
                        String var209 = msg.reader().readUTF();
                        byte var215 = msg.reader().readByte();
                        String var225 = msg.reader().readUTF();
                        GameScr.gI().showLucky_Draw(var191, var224, var220, sne1, str1, var219, var209, var225, var215);
                    }
                    break;
                case 54:
                    GameCanvas.gI().openWeb(msg.reader().readUTF(), msg.reader().readUTF(), msg.reader().readUTF(), msg.reader().readUTF());
                    break;
                case 55:
                    GameCanvas.gI().sendSms(msg.reader().readUTF(), msg.reader().readUTF(), msg.reader().readShort(), msg.reader().readUTF(), msg.reader().readUTF());
                    break;
                case 57:
                    GameCanvas.endDlg();
                    GameScr.gI().resetButton();
                    AutoSell.advAA = true;
                    LockGame.advBB();
                    if (Code.auto instanceof AutoTrade && AutoTrade.gI().tradeStep != 0 && AutoTrade.gI().tradeStep != 58) {
                        AutoTrade.gI().lastInviteTime = System.currentTimeMillis();
                        AutoTrade.gI().tradeStep = 57;
                    }
                    if (Code.auto instanceof AutoSellPro && AutoSellPro.sellerAO().sellerBM != 0 && AutoSellPro.sellerAO().sellerBM != 58) {
                        AutoSellPro.sellerAO().sellerAZ = System.currentTimeMillis();
                        AutoSellPro.sellerAO().sellerBM = 57;
                    }
                    if (Code.auto instanceof AutoNTGT && AutoNTGT.ntgtAP().ntgtBO != 0 && AutoNTGT.ntgtAP().ntgtBO != 58) {
                        AutoNTGT.ntgtAP().ntgtAC = System.currentTimeMillis();
                        AutoNTGT.ntgtAP().ntgtBO = 57;
                    }
                    break;
                case 58:
                    GameScr.arrItemTradeMe = null;
                    GameScr.arrItemTradeOrder = null;
                    if (GameScr.gI().coinTradeOrder > 0) {
                        gameScr = GameScr.gI();
                        gameScr.tradeItemName = gameScr.tradeItemName + ", " + GameScr.gI().coinTradeOrder + " " + mResources.XU;
                        GameScr.startFlyText("+" + GameScr.gI().coinTradeOrder, Char.getMyChar().cx, Char.getMyChar().cy - Char.getMyChar().ch - 10, 0, -2, 6);
                    }

                    GameScr.gI().coinTrade = GameScr.gI().coinTradeOrder = 0;
                    GameScr.gI().resetButton();
                    Char.getMyChar().xu = msg.reader().readInt();
                    InfoDlg.hide();
                    if (!GameScr.gI().tradeItemName.equals("")) {
                        InfoMe.addInfo(mResources.RECEIVE + " " + GameScr.gI().tradeItemName);
                    }
                    LockGame.advBB();
                    if (Code.auto instanceof AutoNTGT) {
                        AutoNTGT.ntgtAP().ntgtBO = 58;
                    }
                    break;
                case 59:
                    var191 = msg.reader().readUTF();
                    Friend var223 = new Friend(var191, (byte) 4);
                    GameScr.vFriendWait.addElement(var223);
                    InfoMe.addInfo(var191 + " " + mResources.FRIEND_ADDED, 20, mFont.tahoma_7_white);
                    if (GameScr.isPaintFriend) {
                        boolean var217 = false;

                        for (var197 = 0; var197 < GameScr.vFriend.size(); ++var197) {
                            if (((Friend) GameScr.vFriend.elementAt(var197)).friendName.equals(var191)) {
                                var217 = true;
                                break;
                            }
                        }

                        if (!var217) {
                            GameScr.vFriend.addElement(var223);
                            GameScr.gI();
                            GameScr.sortList((int) 0);
                            GameScr.indexRow = 0;
                            GameScr.scrMain.clear();
                        }
                    }
                    break;
                case 60:
                    final int int16;
                    Code.advAA(int16 = msg.reader().readInt());
                    final Char advAE8;
                    if ((advAE8 = GameScr.findCharInMap(int16)) != null) {
                        Mob.interestChar = advAE8;
                    }
                    if (advAE8 == null) {
                        return;
                    }
                    if ((TileMap.tileTypeAtPixel(advAE8.cx, advAE8.cy) & 0x2) == 0x2) {
                        advAE8.setSkillPaint(GameScr.sks[msg.reader().readByte()], 0);
                    } else {
                        advAE8.setSkillPaint(GameScr.sks[msg.reader().readByte()], 1);
                    }
                    if (advAE8.isWolf && advAE8.vitaWolf >= 500) {
                        advAE8.isWolf = false;
                        advAE8.timeSummon = System.currentTimeMillis();
                        ServerEffect.addServerEffect(60, advAE8, 1);
                    }
                    if (advAE8.isMoto) {
                        advAE8.isMoto = false;
                        advAE8.isMotoBehind = true;
                        if (advAE8.vitaWolf > 500) {
                            ServerEffect.addServerEffect(60, advAE8, 1);
                        }
                    }
                    final Mob[] array7 = new Mob[10];
                    int n19 = 0;
                    try {
                        for (n19 = 0; n19 < 10; ++n19) {
                            final Mob advAA10 = Mob.get_Mob(msg.reader().readUnsignedByte());
                            array7[n19] = advAA10;
                            if (n19 == 0) {
                                if (advAE8.cx <= advAA10.x) {
                                    advAE8.cdir = 1;
                                } else {
                                    advAE8.cdir = -1;
                                }
                            }
                        }
                    } catch (final Exception ex22) {
                    }
                    if (n19 <= 0) {
                        return;
                    }
                    advAE8.attMobs = new Mob[n19];
                    for (int n20 = 0; n20 < advAE8.attMobs.length; ++n20) {
                        advAE8.attMobs[n20] = array7[n20];
                    }
                    advAE8.mobFocus = advAE8.attMobs[0];
                    return;
                case 61:
                    final int int17;
                    Code.advAA(int17 = msg.reader().readInt());
                    final Char advAE9;
                    if ((advAE9 = GameScr.findCharInMap(int17)) == null) {
                        return;
                    }
                    if ((TileMap.tileTypeAtPixel(advAE9.cx, advAE9.cy) & 0x2) == 0x2) {
                        advAE9.setSkillPaint(GameScr.sks[msg.reader().readByte()], 0);
                    } else {
                        advAE9.setSkillPaint(GameScr.sks[msg.reader().readByte()], 1);
                    }
                    if (advAE9.isWolf) {
                        advAE9.isWolf = false;
                        advAE9.timeSummon = System.currentTimeMillis();
                        if (advAE9.vitaWolf >= 500) {
                            ServerEffect.addServerEffect(60, advAE9, 1);
                        }
                    }
                    if (advAE9.isMoto) {
                        advAE9.isMoto = false;
                        advAE9.isMotoBehind = true;
                        ServerEffect.addServerEffect(60, advAE9, 1);
                    }
                    final Char[] array8 = new Char[10];
                    int n21 = 0;
                    try {
                        for (n21 = 0; n21 < 10; ++n21) {
                            final int int18;
                            Char char7;
                            if ((int18 = msg.reader().readInt()) == Char.getMyChar().charID) {
                                char7 = Char.getMyChar();
                            } else {
                                char7 = GameScr.findCharInMap(int18);
                            }
                            array8[n21] = char7;
                            if (n21 == 0) {
                                if (advAE9.cx <= char7.cx) {
                                    advAE9.cdir = 1;
                                } else {
                                    advAE9.cdir = -1;
                                }
                            }
                        }
                    } catch (final Exception ex23) {
                    }
                    if (n21 <= 0) {
                        return;
                    }
                    advAE9.attChars = new Char[n21];
                    for (int n22 = 0; n22 < advAE9.attChars.length; ++n22) {
                        advAE9.attChars[n22] = array8[n22];
                    }
                    advAE9.charFocus = advAE9.attChars[0];
                    return;
                case 62:
                    if ((var186 = msg.reader().readInt()) == Char.getMyChar().charID) {
                        (aChar = Char.getMyChar()).cHP = msg.reader().readInt();
                        var186 = msg.reader().readInt();
                        var201 = 0;

                        try {
                            aChar.cMP = msg.reader().readInt();
                            var201 = msg.reader().readInt();
                        } catch (Exception var169) {
                        }

                        if ((var186 += var201) == 0) {
                            GameScr.startFlyText("", aChar.cx, aChar.cy - aChar.ch, 0, -2, 7);
                        } else if (var186 < 0) {
                            var186 = -var186;
                            GameScr.startFlyText("-" + var186, aChar.cx, aChar.cy - aChar.ch, 0, -2, 8);
                        } else {
                            GameScr.startFlyText("-" + var186, aChar.cx, aChar.cy - aChar.ch, 0, -2, 0);
                        }
                    } else {
                        if ((aChar = GameScr.findCharInMap(var186)) == null) {
                            return;
                        }

                        aChar.cHP = msg.reader().readInt();
                        var186 = msg.reader().readInt();
                        var201 = 0;

                        try {
                            aChar.cMP = msg.reader().readInt();
                            var201 = msg.reader().readInt();
                        } catch (Exception var168) {
                        }

                        if ((var186 += var201) == 0) {
                            GameScr.startFlyText("", aChar.cx, aChar.cy - aChar.ch, 0, -2, 4);
                        } else if (var186 < 0) {
                            var186 = -var186;
                            GameScr.startFlyText("-" + var186, aChar.cx, aChar.cy - aChar.ch, 0, -2, 3);
                        } else {
                            GameScr.startFlyText("-" + var186, aChar.cx, aChar.cy - aChar.ch, 0, -2, 5);
                        }
                    }
                    break;
                case 63:
                    var195 = new MyVector();

                    while (true) {
                        try {
                            var195.addElement(new Command(msg.reader().readUTF(), GameCanvas.instance, 88817, (Object) null));
                        } catch (Exception var179) {
                            GameCanvas.menu.startAt(var195);
                            AutoDanhVong.advAF();

                            return;
                        }
                    }
                case 64:
                    if ((var186 = msg.reader().readInt()) == Char.getMyChar().charID) {
                        var187 = Char.getMyChar();
                    } else {
                        var187 = GameScr.findCharInMap(var186);
                    }

                    var187.moveFast = new short[3];
                    var187.moveFast[0] = 0;
                    var190 = msg.reader().readShort();
                    var196 = msg.reader().readShort();
                    var187.moveFast[1] = var190;
                    var187.moveFast[2] = var196;
                    var187.isBlinking = false;

                    try {
                        if ((var186 = msg.reader().readInt()) == Char.getMyChar().charID) {
                            var187 = Char.getMyChar();
                        } else {
                            var187 = GameScr.findCharInMap(var186);
                        }

                        var187.cx = var190;
                        var187.cy = var196;
                    } catch (Exception var160) {
                        var160.printStackTrace();
                    }
                    break;
                case 65:
                    if ((var187 = GameScr.findCharInMap(msg.reader().readInt())) != null) {
                        GameCanvas.startYesNoDlg(var187.cName + " " + mResources.INVITETEST, 88812, var187, 8882, (Object) null);
                    }
                    break;
                case 66:
                    ine1 = msg.reader().readInt();
                    var201 = msg.reader().readInt();
                    if (ine1 != Char.getMyChar().charID && var201 != Char.getMyChar().charID) {
                        GameScr.findCharInMap(ine1).testCharId = var201;
                        GameScr.findCharInMap(var201).testCharId = ine1;
                    } else if (ine1 == Char.getMyChar().charID) {
                        Char.getMyChar().testCharId = var201;
                        Char.getMyChar().npcFocus = null;
                        Char.getMyChar().mobFocus = null;
                        Char.getMyChar().itemFocus = null;
                        Char.getMyChar().charFocus = GameScr.findCharInMap(Char.getMyChar().testCharId);
                        Char.getMyChar().charFocus.testCharId = Char.getMyChar().charID;
                        GameScr.gI().cPreFocusID = GameScr.gI().cLastFocusID;
                        GameScr.gI().cLastFocusID = var201;
                        Char.isManualFocus = true;
                    } else if (var201 == Char.getMyChar().charID) {
                        Char.getMyChar().testCharId = ine1;
                        Char.getMyChar().npcFocus = null;
                        Char.getMyChar().mobFocus = null;
                        Char.getMyChar().itemFocus = null;
                        Char.getMyChar().charFocus = GameScr.findCharInMap(Char.getMyChar().testCharId);
                        Char.getMyChar().charFocus.testCharId = Char.getMyChar().charID;
                        GameScr.gI().cPreFocusID = GameScr.gI().cLastFocusID;
                        GameScr.gI().cLastFocusID = ine1;
                        Char.isManualFocus = true;
                    }
                    break;
                case 67:
                    ine1 = msg.reader().readInt();
                    var201 = msg.reader().readInt();
                    var186 = 0;

                    try {
                        var186 = msg.reader().readInt();
                    } catch (Exception var162) {
                    }

                    if (ine1 == Char.getMyChar().charID) {
                        aChar = GameScr.findCharInMap(var201);
                        if (var186 > 0) {
                            InfoMe.addInfo(mResources.replace(mResources.YOU_LOST, aChar.cName));
                            Char.getMyChar().cHP = var186;
                            Char.getMyChar().resultTest = 29;
                            if (aChar != null) {
                                aChar.resultTest = 89;
                            }
                        } else {
                            if (aChar != null) {
                                aChar.resultTest = 59;
                            }

                            Char.getMyChar().resultTest = 59;
                            InfoMe.addInfo(mResources.replace(mResources.TEST_END, aChar.cName));
                        }

                        Char.getMyChar().testCharId = -9999;
                        Char.getMyChar().charFocus = null;
                        if (GameScr.gI().cPreFocusID >= 0) {
                            GameScr.gI().cLastFocusID = GameScr.gI().cPreFocusID;
                            GameScr.gI().cPreFocusID = -1;
                        } else {
                            GameScr.gI().cLastFocusID = -1;
                        }

                        if (aChar != null) {
                            aChar.testCharId = -9999;
                        }
                    } else if (var201 == Char.getMyChar().charID) {
                        aChar = GameScr.findCharInMap(ine1);
                        if (var186 > 0) {
                            if (aChar != null) {
                                aChar.cHP = var186;
                            }

                            if (aChar != null) {
                                aChar.resultTest = 29;
                            }

                            Char.getMyChar().resultTest = 89;
                            InfoMe.addInfo(mResources.replace(mResources.YOU_WIN, aChar.cName));
                        } else {
                            if (aChar != null) {
                                aChar.resultTest = 59;
                            }

                            Char.getMyChar().resultTest = 59;
                            InfoMe.addInfo(mResources.replace(mResources.TEST_END, aChar.cName));
                        }

                        if (aChar != null) {
                            aChar.testCharId = -9999;
                        }

                        Char.getMyChar().testCharId = -9999;
                        Char.getMyChar().charFocus = null;
                        if (GameScr.gI().cPreFocusID >= 0) {
                            GameScr.gI().cLastFocusID = GameScr.gI().cPreFocusID;
                            GameScr.gI().cPreFocusID = -1;
                        } else {
                            GameScr.gI().cLastFocusID = -1;
                        }
                    } else {
                        Char var208 = GameScr.findCharInMap(ine1);
                        Char var203 = GameScr.findCharInMap(var201);
                        if (var186 > 0) {
                            if (var208 != null) {
                                var208.cHP = var186;
                            }

                            if (var208 != null) {
                                var208.resultTest = 29;
                            }

                            if (var203 != null) {
                                var203.resultTest = 89;
                            }
                        } else {
                            if (var208 != null) {
                                var208.resultTest = 59;
                            }

                            if (var203 != null) {
                                var203.resultTest = 59;
                            }
                        }

                        if (var208 != null) {
                            var208.testCharId = -9999;
                        }

                        if (var203 != null) {
                            var203.testCharId = -9999;
                        }
                    }
                    break;
                case 68:
                    if ((aChar = GameScr.findCharInMap(msg.reader().readInt())) != null) {
                        aChar.killCharId = Char.getMyChar().charID;
                        Auto.advAB(aChar);

                        Char.getMyChar().npcFocus = null;
                        Char.getMyChar().mobFocus = null;
                        Char.getMyChar().itemFocus = null;
                        Char.getMyChar().charFocus = aChar;
                        Char.isManualFocus = true;
                        InfoMe.addInfo(aChar.cName + mResources.CUU_SAT, 20, mFont.tahoma_7_red);
                    }
                    break;
                case 69:
                    Char.getMyChar().killCharId = msg.reader().readInt();
                    Char.getMyChar().npcFocus = null;
                    Char.getMyChar().mobFocus = null;
                    Char.getMyChar().itemFocus = null;
                    Char.getMyChar().charFocus = GameScr.findCharInMap(Char.getMyChar().killCharId);
                    Char.isManualFocus = true;
                    break;
                case 70:
                    aChar = Char.getMyChar();

                    try {
                        aChar = GameScr.findCharInMap(msg.reader().readInt());
                    } catch (Exception var161) {
                    }

                    aChar.killCharId = -9999;
                    break;
                case 71:
                    var247 = msg.reader().readLong();
                    Char.getMyChar().cExpDown -= var247;
                    GameScr.startFlyText("+" + var247, Char.getMyChar().cx, Char.getMyChar().cy - Char.getMyChar().ch, 0, -2, 2);
                    break;
                case 72:
                    Char.getMyChar().cPk = msg.reader().readByte();
                    Char.getMyChar().waitToDie(msg.reader().readShort(), msg.reader().readShort());
                    Char.getMyChar().cEXP = GameScr.getMaxExp(Char.getMyChar().clevel - 1);
                    Char.getMyChar().cExpDown = msg.reader().readLong();
                    GameScr.setLevel_Exp(Char.getMyChar().cEXP, true);
                    break;
                case 75:
                    buNhin = new BuNhin(msg.reader().readUTF(), msg.reader().readShort(), msg.reader().readShort());
                    GameScr.vBuNhin.addElement(buNhin);
                    ServerEffect.addServerEffect(60, buNhin.x, buNhin.y, 1);
                    break;
                case 76:
                    Mob var74;
                    if ((var74 = Mob.get_Mob(msg.reader().readUnsignedByte())) != null) {
                        if ((buNhin = GameScr.findBuNhinInMap(msg.reader().readShort())) == null) {
                            return;
                        }

                        var190 = msg.reader().readShort();
                        var194 = msg.reader().readByte();
                        var185 = msg.reader().readByte();
                        var74.setAttack(buNhin);
                        var74.setTypeAtk(var190, var194, var185);
                    }
                    break;
                case 77:
                    buNhin = (BuNhin) GameScr.vBuNhin.elementAt(msg.reader().readShort());
                    GameScr.vBuNhin.removeElement(buNhin);
                    ServerEffect.addServerEffect(60, buNhin.x, buNhin.y, 1);
                    break;
                case 78:
                    mob = null;

                    try {
                        mob = Mob.get_Mob(msg.reader().readUnsignedByte());
                    } catch (Exception var149) {
                    }

                    if (mob != null && mob.status != 0 && mob.status != 0) {
                        mob.status = 0;
                        ServerEffect.addServerEffect(60, mob.x, mob.y, 1);
                        ItemMap var93 = new ItemMap(msg.reader().readShort(), msg.reader().readShort(), mob.x, mob.y, msg.reader().readShort(), msg.reader().readShort());
                        GameScr.vItemMap.addElement(var93);
                        if (Res.abs(var93.y - Char.getMyChar().cy) < 24 && Res.abs(var93.x - Char.getMyChar().cx) < 24) {
                            Char.getMyChar().charFocus = null;
                        }
                    }
                    break;
                case 79:
                    ine1 = msg.reader().readInt();
                    var206 = msg.reader().readUTF();
                    GameCanvas.startYesNoDlg(var206 + " " + mResources.INVITEPARTY, 8887, new Integer(ine1), 8888, new Integer(ine1));
                    break;
                case 82:
                    GameScr.vParty.removeAllElements();
                    boolean var207 = msg.reader().readBoolean();

                    try {
                        for (var204 = 0; var204 < 6; ++var204) {
                            GameScr.vParty.addElement(new Party(msg.reader().readInt(), msg.reader().readByte(), msg.reader().readUTF(), var207));
                        }
                    } catch (Exception var177) {
                    }

                    GameScr.gI().refreshTeam();
                    String advAD3 = ((Party) GameScr.vParty.firstElement()).name;
                    if (Code.cNameLeader == null) {
                        Code.cNameLeader = advAD3;
                    } else if (!advAD3.equals(Code.cNameLeader)) {
                        Service.gI().outParty();
                    }
                    break;
                case 83:
                    GameScr.vParty.removeAllElements();
                    GameScr.gI().refreshTeam();
                    break;
                case 84:
                    Friend var214 = new Friend(msg.reader().readUTF(), msg.reader().readByte());
                    GameScr.gI();
                    GameScr.actRemoveWaitAcceptFriend(var214.friendName);
                    if (var214.type == 0) {
                        InfoMe.addInfo(mResources.YOU_ADD + " " + var214.friendName + " " + mResources.TO_LIST);
                        GameScr.vFriend.addElement(var214);
                    } else if (var214.type == 1) {
                        for (ine2 = 0; ine2 < GameScr.vFriend.size(); ++ine2) {
                            if (((Friend) GameScr.vFriend.elementAt(ine2)).friendName.equals(var214.friendName)) {
                                GameScr.vFriend.removeElementAt(ine2);
                                break;
                            }
                        }

                        InfoMe.addInfo(mResources.YOU_AND + " " + var214.friendName + " " + mResources.BE_FRIEND);
                        var214.type = 3;
                        GameScr.vFriend.insertElementAt(var214, 0);
                    }

                    if (GameScr.isPaintFriend) {
                        GameScr.gI();
                        GameScr.sortList((int) 0);
                        GameScr.indexRow = 0;
                        GameScr.scrMain.clear();
                    }
                    break;
                case 85:
                    if ((mob = Mob.get_Mob(msg.reader().readUnsignedByte())) != null) {
                        mob.isDisable = msg.reader().readBoolean();
                    }
                    break;
                case 86:
                    if ((mob = Mob.get_Mob(msg.reader().readUnsignedByte())) != null) {
                        mob.isDontMove = msg.reader().readBoolean();
                    }
                    break;
                case 87:
                    if ((var186 = msg.reader().readInt()) == Char.getMyChar().charID) {
                        aChar = Char.getMyChar();
                    } else {
                        aChar = GameScr.findCharInMap(var186);
                    }

                    if (aChar == null) {
                        return;
                    }

                    ine2 = msg.reader().readUnsignedByte();
                    var190 = msg.reader().readShort();
                    var194 = msg.reader().readByte();
                    var185 = msg.reader().readByte();
                    var202 = 0;
                    var200 = -1;

                    try {
                        if ((var202 = msg.reader().readByte()) == 1) {
                            var200 = msg.reader().readInt();
                        }
                    } catch (Exception var167) {
                        var167.printStackTrace();
                    }

                    if (aChar.mobMe != null) {
                        if (var202 == 0) {
                            Mob var211 = Mob.get_Mob(ine2);
                            aChar.mobMe.attackOtherMob(var211);
                        } else {
                            Char var213 = GameScr.findCharInMap(var200);
                            aChar.mobMe.attackOtherChar(var213);
                        }
                    }

                    aChar.mobMe.setTypeAtk(var190, var194, var185);
                    break;
                case 88:
                    if ((var186 = msg.reader().readInt()) == Char.getMyChar().charID) {
                        aChar = Char.getMyChar();
                    } else if ((aChar = GameScr.findCharInMap(var186)) == null) {
                        return;
                    }

                    aChar.cHP = aChar.cMaxHP;
                    aChar.cMP = aChar.cMaxMP;
                    aChar.cx = msg.reader().readShort();
                    aChar.cy = msg.reader().readShort();
                    aChar.liveFromDead();
                    break;
                case 89:
                    if ((mob = Mob.get_Mob(msg.reader().readUnsignedByte())) != null) {
                        mob.isFire = msg.reader().readBoolean();
                    }
                    break;
                case 90:
                    if ((mob = Mob.get_Mob(msg.reader().readUnsignedByte())) != null) {
                        mob.isIce = msg.reader().readBoolean();
                        if (!mob.isIce) {
                            ServerEffect.addServerEffect(77, mob.x, mob.y - 9, 1);
                        }
                    }
                    break;
                case 91:
                    if ((mob = Mob.get_Mob(msg.reader().readUnsignedByte())) != null) {
                        mob.isWind = msg.reader().readBoolean();
                    }
                    break;
                case 92:
                    var188 = msg.reader().readUTF();
                    Short var199 = new Short(msg.reader().readShort());
                    GameCanvas.inputDlg.show(var188, new Command(mResources.ACCEPT, GameCanvas.instance, 88818, var199), 0);
                    break;
                case 93:
                    var186 = msg.reader().readInt();
                    GameScr.currentCharViewInfo = new Char();
                    if (Char.getMyChar().charID == var186) {
                        GameScr.currentCharViewInfo = Char.getMyChar();
                    } else {
                        if ((aChar = GameScr.findCharInMap(var186)) == null) {
                            GameScr.currentCharViewInfo = new Char();
                        } else {
                            GameScr.currentCharViewInfo = aChar;
                        }

                        GameScr.currentCharViewInfo.charID = var186;
                        GameScr.currentCharViewInfo.statusMe = 1;
                        GameScr.gI().showViewInfo();
                    }

                    GameScr.currentCharViewInfo.cName = msg.reader().readUTF();
                    GameScr.currentCharViewInfo.head = msg.reader().readShort();
                    GameScr.currentCharViewInfo.cgender = msg.reader().readByte();
                    byte var69 = msg.reader().readByte();
                    GameScr.currentCharViewInfo.nClass = GameScr.nClasss[var69];
                    GameScr.currentCharViewInfo.cPk = msg.reader().readByte();
                    GameScr.currentCharViewInfo.cHP = msg.reader().readInt();
                    GameScr.currentCharViewInfo.cMaxHP = msg.reader().readInt();
                    GameScr.currentCharViewInfo.cMP = msg.reader().readInt();
                    GameScr.currentCharViewInfo.cMaxMP = msg.reader().readInt();
                    GameScr.currentCharViewInfo.cspeed = msg.reader().readByte();
                    GameScr.currentCharViewInfo.cResFire = msg.reader().readShort();
                    GameScr.currentCharViewInfo.cResIce = msg.reader().readShort();
                    GameScr.currentCharViewInfo.cResWind = msg.reader().readShort();
                    GameScr.currentCharViewInfo.cdame = msg.reader().readInt();
                    GameScr.currentCharViewInfo.cdameDown = msg.reader().readInt();
                    GameScr.currentCharViewInfo.cExactly = msg.reader().readShort();
                    GameScr.currentCharViewInfo.cMiss = msg.reader().readShort();
                    GameScr.currentCharViewInfo.cFatal = msg.reader().readShort();
                    GameScr.currentCharViewInfo.cReactDame = msg.reader().readShort();
                    GameScr.currentCharViewInfo.sysUp = msg.reader().readShort();
                    GameScr.currentCharViewInfo.sysDown = msg.reader().readShort();
                    GameScr.currentCharViewInfo.clevel = msg.reader().readUnsignedByte();
                    GameScr.currentCharViewInfo.pointUydanh = msg.reader().readShort();
                    GameScr.currentCharViewInfo.cClanName = msg.reader().readUTF();
                    if (!GameScr.currentCharViewInfo.cClanName.equals("")) {
                        GameScr.currentCharViewInfo.ctypeClan = msg.reader().readByte();
                    }

                    GameScr.currentCharViewInfo.pointUydanh = msg.reader().readShort();
                    GameScr.currentCharViewInfo.pointNon = msg.reader().readShort();
                    GameScr.currentCharViewInfo.pointAo = msg.reader().readShort();
                    GameScr.currentCharViewInfo.pointGangtay = msg.reader().readShort();
                    GameScr.currentCharViewInfo.pointQuan = msg.reader().readShort();
                    GameScr.currentCharViewInfo.pointGiay = msg.reader().readShort();
                    GameScr.currentCharViewInfo.pointVukhi = msg.reader().readShort();
                    GameScr.currentCharViewInfo.pointLien = msg.reader().readShort();
                    GameScr.currentCharViewInfo.pointNhan = msg.reader().readShort();
                    GameScr.currentCharViewInfo.pointNgocboi = msg.reader().readShort();
                    GameScr.currentCharViewInfo.pointPhu = msg.reader().readShort();
                    GameScr.currentCharViewInfo.countFinishDay = msg.reader().readByte();
                    GameScr.currentCharViewInfo.countLoopBoos = msg.reader().readByte();
                    GameScr.currentCharViewInfo.countPB = msg.reader().readByte();
                    GameScr.currentCharViewInfo.limitTiemnangso = msg.reader().readByte();
                    GameScr.currentCharViewInfo.limitKynangso = msg.reader().readByte();
                    GameScr.currentCharViewInfo.arrItemBody = new Item[32];

                    int var70;
                    short var71;
                    ItemTemplate var72;
                    try {
                        GameScr.currentCharViewInfo.setDefaultPart();

                        for (var70 = 0; var70 < 16; ++var70) {
                            if ((var71 = msg.reader().readShort()) > -1) {
                                var210 = (var72 = ItemTemplates.get(var71)).type;
                                GameScr.currentCharViewInfo.arrItemBody[var210] = new Item();
                                GameScr.currentCharViewInfo.arrItemBody[var210].indexUI = var210;
                                GameScr.currentCharViewInfo.arrItemBody[var210].typeUI = 5;
                                GameScr.currentCharViewInfo.arrItemBody[var210].template = var72;
                                GameScr.currentCharViewInfo.arrItemBody[var210].isLock = true;
                                GameScr.currentCharViewInfo.arrItemBody[var210].upgrade = msg.reader().readByte();
                                GameScr.currentCharViewInfo.arrItemBody[var210].sys = msg.reader().readByte();
                                if (var210 == 1) {
                                    GameScr.currentCharViewInfo.wp = GameScr.currentCharViewInfo.arrItemBody[var210].template.part;
                                } else if (var210 == 2) {
                                    GameScr.currentCharViewInfo.body = GameScr.currentCharViewInfo.arrItemBody[var210].template.part;
                                } else if (var210 == 6) {
                                    GameScr.currentCharViewInfo.leg = GameScr.currentCharViewInfo.arrItemBody[var210].template.part;
                                }
                            }
                        }
                    } catch (Exception var176) {
                    }

                    try {
                        for (var70 = 0; var70 < 16; ++var70) {
                            if ((var71 = msg.reader().readShort()) > -1) {
                                var204 = (var72 = ItemTemplates.get(var71)).type + 16;
                                GameScr.currentCharViewInfo.arrItemBody[var204] = new Item();
                                GameScr.currentCharViewInfo.arrItemBody[var204].indexUI = var204;
                                GameScr.currentCharViewInfo.arrItemBody[var204].typeUI = 5;
                                GameScr.currentCharViewInfo.arrItemBody[var204].template = var72;
                                GameScr.currentCharViewInfo.arrItemBody[var204].isLock = true;
                                GameScr.currentCharViewInfo.arrItemBody[var204].upgrade = msg.reader().readByte();
                                GameScr.currentCharViewInfo.arrItemBody[var204].sys = msg.reader().readByte();
                                if (var204 == 1) {
                                    GameScr.currentCharViewInfo.wp = GameScr.currentCharViewInfo.arrItemBody[var204].template.part;
                                } else if (var204 == 2) {
                                    GameScr.currentCharViewInfo.body = GameScr.currentCharViewInfo.arrItemBody[var204].template.part;
                                } else if (var204 == 6) {
                                    GameScr.currentCharViewInfo.leg = GameScr.currentCharViewInfo.arrItemBody[var204].template.part;
                                }
                            }
                        }

                        return;
                    } catch (Exception var175) {
                        break;
                    }
                case 94:
                    requestItemPlayer(msg);
                    break;
                case 95:
                    int var84 = msg.reader().readInt();
                    Char.getMyChar().xu += var84;
                    GameScr.startFlyText(var84 > 0 ? "+" + var84 : "" + var84, Char.getMyChar().cx, Char.getMyChar().cy - Char.getMyChar().ch - 10, 0, -2, 1);
                    break;
                case 96:
                    Char.getMyChar().taskOrders.addElement(new TaskOrder(msg.reader().readByte(), msg.reader().readInt(), msg.reader().readInt(), msg.reader().readUTF(), msg.reader().readUTF(), msg.reader().readUnsignedByte(), msg.reader().readUnsignedByte()));
                    Char.getMyChar().callEffTask(21);
                    LockGame.advAL();

                    break;
                case 97:
                    var85 = msg.reader().readByte();

                    for (var86 = 0; var86 < Char.getMyChar().taskOrders.size(); ++var86) {
                        TaskOrder var87;
                        if ((var87 = (TaskOrder) Char.getMyChar().taskOrders.elementAt(var86)).taskId == var85) {
                            var87.count = msg.reader().readInt();
                            if (var87.count == var87.maxCount) {
                                Char.getMyChar().callEffTask(61);
                            }
                            if (var87.taskId == 0) {
                                AutoNVHN.advAA = true;
                            }
                            return;
                        }
                    }

                    return;
                case 98:
                    var85 = msg.reader().readByte();

                    for (var86 = 0; var86 < Char.getMyChar().taskOrders.size(); ++var86) {
                        if (((TaskOrder) Char.getMyChar().taskOrders.elementAt(var86)).taskId == var85) {
                            Char.getMyChar().taskOrders.removeElementAt(var86);
                            break;
                        }
                    }

                    Char.getMyChar().callEffTask(21);
                    LockGame.advAN();

                    break;
                case 99:
                    if ((var187 = GameScr.findCharInMap(msg.reader().readInt())) != null) {
                        if (Code.auto == Code.autoLoiLoss && var187.cName.equals(FormDanhVong.advAB)) {
                            Code.autoLoiLoss.advAB = var187.charID;
                            return;
                        }
                        GameCanvas.startYesNoDlg(var187.cName + " " + mResources.INVITETESTDUN, 88840, var187, 8882, (Object) null);
                    }
                    break;
                case 100:
                    GameScr.vList.removeAllElements();
                    var185 = msg.reader().readByte();
                    ranked = null;

                    for (ine1 = 0; ine1 < var185; ++ine1) {
                        try {
                            DunItem var198;
                            (var198 = new DunItem()).id = msg.reader().readByte();
                            var198.name1 = msg.reader().readUTF();
                            var198.name2 = msg.reader().readUTF();
                            GameScr.vList.addElement(var198);
                        } catch (Exception var163) {
                        }
                    }

                    GameScr.gI().doShowListUI();
                    break;
                case 101:
                    try {
                        GameScr.currentCharViewInfo.pointTinhTu = msg.reader().readInt();
                        GameScr.currentCharViewInfo.limitPhongLoi = msg.reader().readByte();
                        GameScr.currentCharViewInfo.limitBangHoa = msg.reader().readByte();
                    } catch (Exception var159) {
                        var159.printStackTrace();
                    }
                    break;
                case 102:
                    if ((var240 = Char.getMyChar().arrItemBag[msg.reader().readByte()]) != null) {
                        GameScr.itemSell = var240;
                    }

                    Char.getMyChar().xu = msg.reader().readInt();
                    if (GameScr.itemSell != null) {
                        if (GameScr.itemSell.template.type == 16) {
                            GameScr.hpPotion -= GameScr.itemSell.quantity;
                        }

                        if (GameScr.itemSell.template.type == 17) {
                            GameScr.mpPotion -= GameScr.itemSell.quantity;
                        }

                        Char.getMyChar().arrItemBag[GameScr.itemSell.indexUI] = null;
                        GameScr.itemSell = null;
                        GameScr.gI().resetButton();
                        InfoMe.addInfo(mResources.SALE_INFO);
                    }

                    GameCanvas.endDlg();
                    break;
                case 103:
                    GameScr.indexMenu = msg.reader().readByte();
                    GameScr.arrItemStands = new ItemStands[msg.reader().readInt()];

                    for (int var79 = 0; var79 < GameScr.arrItemStands.length; ++var79) {
                        GameScr.arrItemStands[var79] = new ItemStands();
                        GameScr.arrItemStands[var79].item = new Item();
                        GameScr.arrItemStands[var79].item.itemId = msg.reader().readInt();
                        GameScr.arrItemStands[var79].timeStart = (int) (System.currentTimeMillis() / 1000L);
                        GameScr.arrItemStands[var79].timeEnd = msg.reader().readInt();
                        GameScr.arrItemStands[var79].item.quantity = msg.reader().readUnsignedShort();
                        GameScr.arrItemStands[var79].seller = msg.reader().readUTF();
                        GameScr.arrItemStands[var79].price = msg.reader().readInt();
                        GameScr.arrItemStands[var79].item.template = ItemTemplates.get(msg.reader().readShort());
                    }

                    GameScr.gI().doOpenUI((int) 37);
                    break;
                case 104:
                    viewItemAuction(msg);
                    break;
                case 106:
                    if ((var187 = GameScr.findCharInMap(msg.reader().readInt())) != null) {
                        GameCanvas.startYesNoDlg(var187.cName + " " + mResources.INVITETESTGT, 88841, var187, 8882, (Object) null);
                    }
                    break;
                case 107:
                    var194 = msg.reader().readByte();
                    GameCanvas.startYesNoDlg(msg.reader().readUTF(), 8890, new Integer(var194), 8891, (Object) null);
                    break;
                case 108:
                    Char.getMyChar().itemMonToBag(msg);
                    break;
                case 109:
                    InfoDlg.hide();
                    GameCanvas.clearKeyHold();
                    GameCanvas.clearKeyPressed();
                    var195 = new MyVector();

                    try {
                        var194 = msg.reader().readByte();

                        for (var197 = 0; var197 < var194; ++var197) {
                            String[] var64 = new String[msg.reader().readByte()];

                            for (int var65 = 0; var65 < var64.length; ++var65) {
                                var64[var65] = msg.reader().readUTF();
                            }

                            var195.addElement(new Command(var64[0], GameCanvas.instance, 88820, var64));
                        }
                    } catch (Exception var181) {
                    }

                    if (Char.getMyChar().npcFocus == null) {
                        return;
                    }

                    GameCanvas.menu.startAt(var195);
                    break;
                case 112:
                    (var193 = Char.getMyChar().arrItemBag[msg.reader().readByte()]).upgrade = msg.reader().readByte();
                    var193.expires = 0L;
                    break;
                case 114:
                    GameScr.gI().typeba = msg.reader().readByte();
                    break;
                case 116:
                    if ((aChar = GameScr.findCharInMap(msg.reader().readInt())) != null) {
                        readCharInfo(aChar, msg);
                    }
                    break;
                case 117:
                    byte var192;
                    if ((var192 = msg.reader().readByte()) == -1) {
                        GameCanvas.readMessenge.onSubmsg(msg);
                        return;
                    }

                    if (GameCanvas.lowGraphic) {
                        return;
                    }

                    try {
                        Mob.vEggMonter.removeAllElements();
                        TileMap.itemMap.clear();
                        GameScr.vItemTreeBehind.removeAllElements();
                        GameScr.vItemTreeBetwen.removeAllElements();
                        GameScr.vItemTreeFront.removeAllElements();

                        for (ine1 = 0; ine1 < var192; ++ine1) {
                            sne1 = msg.reader().readShort();
                            str1 = String.valueOf(sne1);
                            byte[] var6 = new byte[msg.reader().readInt()];
                            msg.reader().read(var6);
                            Image var189 = createImage(var6);
                            TileMap.itemMap.mput(str1, var189);
                        }

                        var186 = msg.reader().readUnsignedByte();

                        ItemTree var205;
                        for (ine1 = 0; ine1 < var186; ++ine1) {
                            var197 = msg.reader().readUnsignedByte();
                            var200 = msg.reader().readUnsignedByte();
                            var204 = msg.reader().readUnsignedByte();
                            (var205 = new ItemTree(var200, var204)).idTree = var197;
                            GameScr.vItemTreeBehind.addElement(var205);
                        }

                        var186 = msg.reader().readUnsignedByte();

                        for (ine1 = 0; ine1 < var186; ++ine1) {
                            var197 = msg.reader().readUnsignedByte();
                            var200 = msg.reader().readUnsignedByte();
                            var204 = msg.reader().readUnsignedByte();
                            (var205 = new ItemTree(var200, var204)).idTree = var197;
                            GameScr.vItemTreeBetwen.addElement(var205);
                        }

                        var186 = msg.reader().readUnsignedByte();

                        for (ine1 = 0; ine1 < var186; ++ine1) {
                            var197 = msg.reader().readUnsignedByte();
                            var200 = msg.reader().readUnsignedByte();
                            var204 = msg.reader().readUnsignedByte();
                            (var205 = new ItemTree(var200, var204)).idTree = var197;
                            GameScr.vItemTreeFront.addElement(var205);
                        }

                        return;
                    } catch (Exception var178) {
                        var178.printStackTrace();
                        break;
                    }
                case 118:
                    var191 = msg.reader().readUTF();
                    RMS.saveRMSString("acc", var191);
                    var188 = msg.reader().readUTF();
                    RMS.saveRMSString("pass", var188);
                    SelectServerScr.uname = var191;
                    SelectServerScr.pass = var188;
                    SelectServerScr.unameChange = "";
                    SelectServerScr.passChange = "";
                    if (!var191.startsWith("tmpusr")) {
                        GameScr.gI().switchToMe();
                    }
                    Session_ME.advAE();

                    break;
                case 119:
                    if ((var194 = msg.reader().readByte()) == -1) {
                        GameScr.isUseitemAuto = true;
                        GameScr.loadCamera(true);
                        if ((GameScr.rangeSearch = msg.reader().readInt()) > 360) {
                            GameScr.isAllmap = true;
                        } else {
                            GameScr.isAllmap = false;
                            GameScr.pointCenterX = Char.getMyChar().cx;
                            GameScr.pointCenterY = Char.getMyChar().cy;
                        }
                    } else if (var194 == 0) {
                        if ((var187 = GameScr.findCharInMap(msg.reader().readInt())) != null) {
                            ServerEffect.addServerEffect(141, var187.cx, var187.cy, 2);
                            var190 = msg.reader().readShort();
                            var187.cxMoveLast = var190;
                            var196 = msg.reader().readShort();
                            var187.cyMoveLast = var196;
                            ServerEffect.addServerEffect(141, var187.cx, var187.cy, 2);
                        }
                    } else {
                        GameScr.isUseitemAuto = false;
                        GameScr.auto = 0;
                    }
                    break;
                case 121:
                    GameScr.vList.removeAllElements();
                    var186 = msg.reader().readUnsignedByte();
                    ranked = null;

                    for (ine1 = 0; ine1 < var186; ++ine1) {
                        try {
                            (ranked = new Ranked()).name = msg.reader().readUTF();
                            ranked.ranked = msg.reader().readInt();
                            ranked.stt = msg.reader().readUTF();
                            GameScr.vList.addElement(ranked);
                        } catch (Exception var170) {
                        }
                    }

                    GameScr.gI().doShowRankedListUI();
                    break;
                case 122:
                    if ((var185 = msg.reader().readByte()) == 0) {
                        addMob(msg);
                    } else if (var185 == 1) {
                        addEffAuto(msg);
                    } else if (var185 == 2) {
                        getImgEffAuto(msg);
                    } else if (var185 == 3) {
                        getDataEffAuto(msg);
                    }
                    break;
                case 123:
                    if ((var185 = msg.reader().readByte()) == 0) {
                        GameCanvas.isKiemduyet_info = true;
                    } else if (var185 == 1) {
                        GameCanvas.isKiemduyet_info = false;
                    } else if (var185 == 2) {
                        GameCanvas.isKiemduyet = true;
                        RMS.saveRMSInt("isKiemduyet", 0);
                    } else {
                        GameCanvas.isKiemduyet = false;
                        RMS.saveRMSInt("isKiemduyet", 1);
                    }
                    break;
                case 124:
                    khamngoc(msg);
                    break;
                case 125:
                    if ((var185 = msg.reader().readByte()) == 0) {
                        addEffect(msg);
                    } else if (var185 == 1) {
                        getImgEffect(msg);
                    } else if (var185 == 2) {
                        getDataEffect(msg);
                    }
                    break;
                case 126:
                    byte var96 = msg.reader().readByte();
                    GameCanvas.endDlg();
                    if (var96 == 0) {
                        GameScr.instance.resetButton();
                    }
            }
        } catch (Exception var183) {
            System.out.println("ERROR COMAND: " + msg.command);
            var183.printStackTrace();
        } finally {
            if (msg != null) {
                msg.cleanup();
            }

        }

    }

    private static void createItem(DataInputStream var0) {
        try {
            GameScr.vcItem = var0.readByte();
            GameScr.iOptionTemplates = new ItemOptionTemplate[var0.readUnsignedByte()];

            for (int var1 = 0; var1 < GameScr.iOptionTemplates.length; ++var1) {
                GameScr.iOptionTemplates[var1] = new ItemOptionTemplate();
                GameScr.iOptionTemplates[var1].id = var1;
                GameScr.iOptionTemplates[var1].name = var0.readUTF();
                GameScr.iOptionTemplates[var1].type = var0.readByte();
            }

            short var4 = var0.readShort();

            for (int var2 = 0; var2 < var4; ++var2) {
                ItemTemplates.add(new ItemTemplate((short) var2, var0.readByte(), var0.readByte(), var0.readUTF(), var0.readUTF(), var0.readByte(), var0.readShort(), var0.readShort(), var0.readBoolean()));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    private static void createSkill(DataInputStream var0) {
        try {
            GameScr.vcSkill = var0.readByte();
            GameScr.sOptionTemplates = new SkillOptionTemplate[var0.readByte()];

            int var1;
            for (var1 = 0; var1 < GameScr.sOptionTemplates.length; ++var1) {
                GameScr.sOptionTemplates[var1] = new SkillOptionTemplate();
                GameScr.sOptionTemplates[var1].id = var1;
                GameScr.sOptionTemplates[var1].name = var0.readUTF();
            }

            GameScr.nClasss = new NClass[var0.readUnsignedByte()];

            for (var1 = 0; var1 < GameScr.nClasss.length; ++var1) {
                GameScr.nClasss[var1] = new NClass();
                GameScr.nClasss[var1].classId = var1;
                GameScr.nClasss[var1].name = var0.readUTF();
                GameScr.nClasss[var1].skillTemplates = new SkillTemplate[var0.readByte()];

                for (int var2 = 0; var2 < GameScr.nClasss[var1].skillTemplates.length; ++var2) {
                    GameScr.nClasss[var1].skillTemplates[var2] = new SkillTemplate();
                    GameScr.nClasss[var1].skillTemplates[var2].id = var0.readByte();
                    GameScr.nClasss[var1].skillTemplates[var2].name = var0.readUTF();
                    GameScr.nClasss[var1].skillTemplates[var2].maxPoint = var0.readByte();
                    GameScr.nClasss[var1].skillTemplates[var2].type = var0.readByte();
                    GameScr.nClasss[var1].skillTemplates[var2].iconId = var0.readShort();
                    short var3 = 150;
                    if (GameCanvas.w == 128 || GameCanvas.h <= 208) {
                        var3 = 100;
                    }

                    GameScr.nClasss[var1].skillTemplates[var2].description = mFont.tahoma_7_white.splitFontArray(var0.readUTF(), var3);
                    GameScr.nClasss[var1].skillTemplates[var2].skills = new Skill[var0.readByte()];

                    for (int var5 = 0; var5 < GameScr.nClasss[var1].skillTemplates[var2].skills.length; ++var5) {
                        GameScr.nClasss[var1].skillTemplates[var2].skills[var5] = new Skill();
                        GameScr.nClasss[var1].skillTemplates[var2].skills[var5].skillId = var0.readShort();
                        GameScr.nClasss[var1].skillTemplates[var2].skills[var5].template = GameScr.nClasss[var1].skillTemplates[var2];
                        GameScr.nClasss[var1].skillTemplates[var2].skills[var5].point = var0.readByte();
                        GameScr.nClasss[var1].skillTemplates[var2].skills[var5].level = var0.readByte();
                        GameScr.nClasss[var1].skillTemplates[var2].skills[var5].manaUse = var0.readShort();
                        GameScr.nClasss[var1].skillTemplates[var2].skills[var5].coolDown = var0.readInt();
                        GameScr.nClasss[var1].skillTemplates[var2].skills[var5].dx = var0.readShort();
                        GameScr.nClasss[var1].skillTemplates[var2].skills[var5].dy = var0.readShort();
                        GameScr.nClasss[var1].skillTemplates[var2].skills[var5].maxFight = var0.readByte();
                        GameScr.nClasss[var1].skillTemplates[var2].skills[var5].options = new SkillOption[var0.readByte()];

                        for (int var4 = 0; var4 < GameScr.nClasss[var1].skillTemplates[var2].skills[var5].options.length; ++var4) {
                            GameScr.nClasss[var1].skillTemplates[var2].skills[var5].options[var4] = new SkillOption();
                            GameScr.nClasss[var1].skillTemplates[var2].skills[var5].options[var4].param = var0.readShort();
                            GameScr.nClasss[var1].skillTemplates[var2].skills[var5].options[var4].optionTemplate = GameScr.sOptionTemplates[var0.readByte()];
                        }

                        Skills.add(GameScr.nClasss[var1].skillTemplates[var2].skills[var5]);
                    }
                }
            }
        } catch (IOException ex) {
        }

    }

    private static void createMap(DataInputStream var0) {
        try {
            GameScr.vcMap = var0.readByte();
            TileMap.mapNames = new String[var0.readUnsignedByte()];

            for (int var1 = 0; var1 < TileMap.mapNames.length; ++var1) {
                TileMap.mapNames[var1] = var0.readUTF();
            }

            Npc.arrNpcTemplate = new NpcTemplate[var0.readByte()];

            int var2;
            for (byte var4 = 0; var4 < Npc.arrNpcTemplate.length; ++var4) {
                Npc.arrNpcTemplate[var4] = new NpcTemplate();
                Npc.arrNpcTemplate[var4].npcTemplateId = var4;
                Npc.arrNpcTemplate[var4].name = var0.readUTF();
                Npc.arrNpcTemplate[var4].headId = var0.readShort();
                Npc.arrNpcTemplate[var4].bodyId = var0.readShort();
                Npc.arrNpcTemplate[var4].legId = var0.readShort();
                Npc.arrNpcTemplate[var4].menu = new String[var0.readByte()][];

                for (var2 = 0; var2 < Npc.arrNpcTemplate[var4].menu.length; ++var2) {
                    Npc.arrNpcTemplate[var4].menu[var2] = new String[var0.readByte()];

                    for (int var3 = 0; var3 < Npc.arrNpcTemplate[var4].menu[var2].length; ++var3) {
                        Npc.arrNpcTemplate[var4].menu[var2][var3] = var0.readUTF();
                    }
                }
            }

            short var5;
            Mob.arrMobTemplate = new MobTemplate[var5 = var0.readShort()];

            for (var2 = 0; var2 < var5; ++var2) {
                Mob.arrMobTemplate[var2] = new MobTemplate();
                Mob.arrMobTemplate[var2].mobTemplateId = (short) var2;
                Mob.arrMobTemplate[var2].type = var0.readByte();
                Mob.arrMobTemplate[var2].name = var0.readUTF();
                Mob.arrMobTemplate[var2].hp = var0.readInt();
                Mob.arrMobTemplate[var2].rangeMove = var0.readByte();
                Mob.arrMobTemplate[var2].speed = var0.readByte();
            }
        } catch (IOException ex) {
        }

    }

    private static void createData(DataInputStream var0) {
        try {
            GameScr.vcData = var0.readByte();
            RMS.saveRMS("nj_arrow", NinjaUtil.readByteArray(var0));
            RMS.saveRMS("nj_effect", NinjaUtil.readByteArray(var0));
            RMS.saveRMS("nj_image", NinjaUtil.readByteArray(var0));
            RMS.saveRMS("nj_part", NinjaUtil.readByteArray(var0));
            RMS.saveRMS("nj_skill", NinjaUtil.readByteArray(var0));
            GameScr.mapTasks = new byte[(GameScr.tasks = new byte[var0.readByte()][]).length][];

            int var1;
            for (var1 = 0; var1 < GameScr.tasks.length; ++var1) {
                GameScr.tasks[var1] = new byte[var0.readByte()];
                GameScr.mapTasks[var1] = new byte[GameScr.tasks[var1].length];

                for (int var2 = 0; var2 < GameScr.tasks[var1].length; ++var2) {
                    GameScr.tasks[var1][var2] = var0.readByte();
                    GameScr.mapTasks[var1][var2] = var0.readByte();
                }
            }

            GameScr.exps = new long[var0.readUnsignedByte()];

            for (var1 = 0; var1 < GameScr.exps.length; ++var1) {
                GameScr.exps[var1] = var0.readLong();
            }

            GameScr.crystals = new int[var0.readByte()];

            for (var1 = 0; var1 < GameScr.crystals.length; ++var1) {
                GameScr.crystals[var1] = var0.readInt();
            }

            GameScr.upClothe = new int[var0.readByte()];

            for (var1 = 0; var1 < GameScr.upClothe.length; ++var1) {
                GameScr.upClothe[var1] = var0.readInt();
            }

            GameScr.upAdorn = new int[var0.readByte()];

            for (var1 = 0; var1 < GameScr.upAdorn.length; ++var1) {
                GameScr.upAdorn[var1] = var0.readInt();
            }

            GameScr.upWeapon = new int[var0.readByte()];

            for (var1 = 0; var1 < GameScr.upWeapon.length; ++var1) {
                GameScr.upWeapon[var1] = var0.readInt();
            }

            GameScr.coinUpCrystals = new int[var0.readByte()];

            for (var1 = 0; var1 < GameScr.coinUpCrystals.length; ++var1) {
                GameScr.coinUpCrystals[var1] = var0.readInt();
            }

            GameScr.coinUpClothes = new int[var0.readByte()];

            for (var1 = 0; var1 < GameScr.coinUpClothes.length; ++var1) {
                GameScr.coinUpClothes[var1] = var0.readInt();
            }

            GameScr.coinUpAdorns = new int[var0.readByte()];

            for (var1 = 0; var1 < GameScr.coinUpAdorns.length; ++var1) {
                GameScr.coinUpAdorns[var1] = var0.readInt();
            }

            GameScr.coinUpWeapons = new int[var0.readByte()];

            for (var1 = 0; var1 < GameScr.coinUpWeapons.length; ++var1) {
                GameScr.coinUpWeapons[var1] = var0.readInt();
            }

            GameScr.goldUps = new int[var0.readByte()];

            for (var1 = 0; var1 < GameScr.goldUps.length; ++var1) {
                GameScr.goldUps[var1] = var0.readInt();
            }

            GameScr.maxPercents = new int[var0.readByte()];

            for (var1 = 0; var1 < GameScr.maxPercents.length; ++var1) {
                GameScr.maxPercents[var1] = var0.readInt();
            }

            Effect.effTemplates = new EffectTemplate[var0.readByte()];

            for (var1 = 0; var1 < Effect.effTemplates.length; ++var1) {
                Effect.effTemplates[var1] = new EffectTemplate();
                Effect.effTemplates[var1].id = var0.readByte();
                Effect.effTemplates[var1].type = var0.readByte();
                Effect.effTemplates[var1].name = var0.readUTF();
                Effect.effTemplates[var1].iconId = var0.readShort();
            }
        } catch (IOException ex) {
        }

    }

    public static Image createImage(byte[] var0) {
        try {
            return Image.createImage(var0, 0, var0.length);
        } catch (Exception var1) {
            return null;
        }
    }

    private void loadInfoMap(Message msg) {
        try {
            Auto.advAK();
            Auto.advAL();
            Auto.advAP = false;
            Char aChar;
            (aChar = Char.getMyChar()).advAD = null;
            aChar.cx = aChar.cxSend = msg.reader().readShort();
            aChar.cy = aChar.cySend = msg.reader().readShort();
            byte var10 = msg.reader().readByte();

            int var2;
            for (var2 = 0; var2 < var10; ++var2) {
                TileMap.vGo.addElement(new Waypoint(msg.reader().readShort(), msg.reader().readShort(), msg.reader().readShort(), msg.reader().readShort()));
            }
            Auto.advAK();
            var10 = msg.reader().readByte();

            for (byte byte2 = 0; byte2 < var10; ++byte2) {
                GameScr.advAA(new Mob((short) byte2, msg.reader().readBoolean(), msg.reader().readBoolean(), msg.reader().readBoolean(), msg.reader().readBoolean(), msg.reader().readBoolean(), msg.reader().readShort(), msg.reader().readByte(), msg.reader().readInt(), msg.reader().readUnsignedByte(), msg.reader().readInt(), msg.reader().readShort(), msg.reader().readShort(), msg.reader().readByte(), msg.reader().readByte(), msg.reader().readBoolean(), false), byte2);
            }

            var10 = msg.reader().readByte();
            byte var11;

            for (var11 = 0; var11 < var10; ++var11) {
                GameScr.vBuNhin.addElement(new BuNhin(msg.reader().readUTF(), msg.reader().readShort(), msg.reader().readShort()));
            }

            var10 = msg.reader().readByte();

            for (var2 = 0; var2 < var10; ++var2) {
                GameScr.vNpc.addElement(new Npc(var2, msg.reader().readByte(), msg.reader().readShort(), msg.reader().readShort(), msg.reader().readByte()));
            }

            var10 = msg.reader().readByte();

            int var5;
            for (var2 = 0; var2 < var10; ++var2) {
                ItemMap var12 = new ItemMap(msg.reader().readShort(), msg.reader().readShort(), msg.reader().readShort(), msg.reader().readShort());
                boolean var4 = false;

                for (var5 = 0; var5 < GameScr.vItemMap.size(); ++var5) {
                    if (((ItemMap) GameScr.vItemMap.elementAt(var5)).itemMapID == var12.itemMapID) {
                        var4 = true;
                        break;
                    }
                }

                if (!var4) {
                    GameScr.vItemMap.addElement(var12);
                }
            }

            GameScr.loadCamera(false);

            try {
                TileMap.mapName1 = null;
                TileMap.mapName = TileMap.mapName1 = msg.reader().readUTF();
            } catch (Exception var7) {
            }

            try {
                TileMap.locationStand.clear();
                var2 = msg.reader().readUnsignedByte();

                for (int var13 = 0; var13 < var2; ++var13) {
                    int var14 = msg.reader().readUnsignedByte();
                    var5 = msg.reader().readUnsignedByte();
                    String var6 = String.valueOf((short) (var5 * TileMap.tmw + var14));
                    TileMap.locationStand.mput(var6, "location");
                }
            } catch (Exception var8) {
                var8.printStackTrace();
            }

            TileMap.loadMap(TileMap.tileID);
            Char.getMyChar().cvx = 0;
            Char.getMyChar().statusMe = 4;
            GameScr.gI().loadGameScr();
            GameCanvas.loadBG(TileMap.bgID);
            Char.isLockKey = false;
            Char.ischangingMap = false;
            GameCanvas.clearKeyHold();
            GameCanvas.clearKeyPressed();
            if (!TileMap.advBD || TileMap.advBC == TileMap.mapID) {

                GameScr.gI().switchToMe();
                InfoDlg.hide();
                InfoDlg.show(TileMap.mapName, mResources.ZONE + " " + TileMap.zoneID, 30);
                Party.refreshAll();
                GameCanvas.endDlg();
            }
            Session_ME.advAE();

            GameCanvas.isLoading = false;
        } catch (Exception var9) {
        }
        TileMap.advAG();

    }

    private void messageNotMap(Message msg) {
        try {
            try {
                Char aChar1;
                String var7;
                int var33;
                String var34;
                byte var36;
                int var40;
                int var41;
                short var42;
                short var43;
                byte[] var56;
                switch (msg.reader().readByte()) {
                    case -127:
                    case -125:
                    case -124:
                    case -118:
                    case -110:
                    case -107:
                    case -105:
                    case -104:
                    case -103:
                    case -102:
                    case -101:
                    case -100:
                    case -94:
                    case -92:
                    case -91:
                    case -89:
                    case -87:
                    case -85:
                    case -82:
                    case -79:
                    case -78:
                    case -76:
                    case -75:
                    case -74:
                    case -73:
                    case -71:
                    case -69:
                    case -68:
                    case -65:
                    case -64:
                    case -63:
                    case -61:
                    case -60:
                    default:
                        return;
                    case -126:
                        var36 = msg.reader().readByte();
                        LoginScr.isLoggingIn = false;
                        SelectCharScr var49;
                        (var49 = SelectCharScr.gI()).name = new String[3];
                        var49.parthead = new int[3];
                        var49.partleg = new int[3];
                        var49.partbody = new int[3];
                        var49.partWp = new int[3];
                        var49.level = new int[3];
                        var49.phai = new String[3];
                        var49.gender = new byte[3];
                        if (GameCanvas.isTouch) {
                            var49.indexSelect = -1;
                        } else {
                            var49.indexSelect = 0;
                        }

                        GameScr.gI();
                        GameScr.readPart();
                        SmallImage.init();

                        for (byte var57 = 0; var57 < var36; ++var57) {
                            SelectCharScr.gI().gender[var57] = msg.reader().readByte();
                            SelectCharScr.gI().name[var57] = msg.reader().readUTF();
                            SelectCharScr.gI().phai[var57] = msg.reader().readUTF();
                            SelectCharScr.gI().level[var57] = msg.reader().readUnsignedByte();
                            SelectCharScr.gI().parthead[var57] = msg.reader().readShort();
                            SelectCharScr.gI().partWp[var57] = msg.reader().readShort();
                            SelectCharScr.gI().partbody[var57] = msg.reader().readShort();
                            SelectCharScr.gI().partleg[var57] = msg.reader().readShort();
                            if (SelectCharScr.gI().partWp[var57] == -1) {
                                SelectCharScr.gI().partWp[var57] = 15;
                            }

                            if (SelectCharScr.gI().partbody[var57] == -1) {
                                if (SelectCharScr.gI().gender[var57] == 0) {
                                    SelectCharScr.gI().partbody[var57] = 10;
                                } else {
                                    SelectCharScr.gI().partbody[var57] = 1;
                                }
                            }

                            if (SelectCharScr.gI().partleg[var57] == -1) {
                                if (SelectCharScr.gI().gender[var57] == 0) {
                                    SelectCharScr.gI().partleg[var57] = 9;
                                } else {
                                    SelectCharScr.gI().partleg[var57] = 0;
                                }
                            }
                        }

                        SelectCharScr.gI().switchToMe();
                        GameCanvas.endDlg();
                        Session_ME.advAE();

                        return;
                    case -123:
                        GameScr.vsData = msg.reader().readByte();
                        GameScr.vsMap = msg.reader().readByte();
                        GameScr.vsSkill = msg.reader().readByte();
                        GameScr.vsItem = msg.reader().readByte();
                        System.out.println("****** DATA VERSION: Server " + GameScr.vsData + " Client " + GameScr.vcData);
                        System.out.println("****** MAP VERSION: Server " + GameScr.vsMap + " Client " + GameScr.vcMap);
                        System.out.println("****** SKILL VERSION: Server " + GameScr.vsSkill + " Client " + GameScr.vcSkill);
                        System.out.println("****** ITEM VERSION: Server " + GameScr.vsItem + " Client " + GameScr.vcItem);
                        if (GameScr.vsData != GameScr.vcData) {
                            Service.gI().updateData();
                        } else {
                            try {
                                createData(new DataInputStream(new ByteArrayInputStream(RMS.loadRMS("data"))));
                            } catch (Exception var28) {
                                GameScr.vcData = -1;
                                Service.gI().updateData();
                            }
                        }

                        if (GameScr.vsMap != GameScr.vcMap) {
                            Service.gI().updateMap();
                        } else {
                            try {
                                createMap(new DataInputStream(new ByteArrayInputStream(RMS.loadRMS("map"))));
                            } catch (Exception var27) {
                                GameScr.vcMap = -1;
                                Service.gI().updateMap();
                            }
                        }

                        if (GameScr.vsSkill != GameScr.vcSkill) {
                            Service.gI().updateSkill();
                        } else {
                            try {
                                createSkill(new DataInputStream(new ByteArrayInputStream(RMS.loadRMS("skill"))));
                            } catch (Exception var26) {
                                GameScr.vcSkill = -1;
                                Service.gI().updateSkill();
                            }
                        }

                        if (GameScr.vsItem != GameScr.vcItem) {
                            Service.gI().updateItem();
                        } else {
                            try {
                                createItem(new DataInputStream(new ByteArrayInputStream(RMS.loadRMS("item"))));
                            } catch (Exception var25) {
                                GameScr.vcItem = -1;
                                Service.gI().updateItem();
                            }
                        }

                        if (GameScr.vsData == GameScr.vcData && GameScr.vsMap == GameScr.vcMap && GameScr.vsSkill == GameScr.vcSkill && GameScr.vsItem == GameScr.vcItem) {
                            GameScr.gI().readEfect();
                            GameScr.gI().readArrow();
                            GameScr.gI().readSkill();
                            Service.gI().clientOk();
                        }

                        CharPartInfo.doSetInfo(msg);
                        return;
                    case -122:
                        System.out.println("GET UPDATE_DATA " + msg.reader().available() + " bytes");
                        msg.reader().mark(100000);
                        createData(msg.reader());
                        msg.reader().reset();
                        byte[] var55 = new byte[msg.reader().available()];
                        msg.reader().readFully(var55);
                        RMS.saveRMS("data", var55);
                        byte[] var53 = new byte[]{GameScr.vcData};
                        RMS.saveRMS("dataVersion", var53);
                        if (GameScr.vsData != GameScr.vcData || GameScr.vsMap != GameScr.vcMap || GameScr.vsSkill != GameScr.vcSkill || GameScr.vsItem != GameScr.vcItem) {
                            return;
                        }

                        GameScr.gI().readEfect();
                        GameScr.gI().readArrow();
                        GameScr.gI().readSkill();
                        Service.gI().clientOk();
                        return;
                    case -121:
                        System.out.println("GET UPDATE_MAP " + msg.reader().available() + " bytes");
                        msg.reader().mark(100000);
                        createMap(msg.reader());
                        msg.reader().reset();
                        var56 = new byte[msg.reader().available()];
                        msg.reader().readFully(var56);
                        RMS.saveRMS("map", var56);
                        byte[] var58 = new byte[]{GameScr.vcMap};
                        RMS.saveRMS("mapVersion", var58);
                        if (GameScr.vsData != GameScr.vcData || GameScr.vsMap != GameScr.vcMap || GameScr.vsSkill != GameScr.vcSkill || GameScr.vsItem != GameScr.vcItem) {
                            return;
                        }

                        GameScr.gI().readEfect();
                        GameScr.gI().readArrow();
                        GameScr.gI().readSkill();
                        Service.gI().clientOk();
                        return;
                    case -120:
                        System.out.println("GET UPDATE_SKILL " + msg.reader().available() + " bytes");
                        msg.reader().mark(100000);
                        createSkill(msg.reader());
                        msg.reader().reset();
                        byte[] var59 = new byte[msg.reader().available()];
                        msg.reader().readFully(var59);
                        if (Char.getMyChar().isHumanz()) {
                            RMS.saveRMS("skill", var59);
                        } else {
                            RMS.saveRMS("skillnhanban", var59);
                        }

                        byte[] var61 = new byte[]{GameScr.vcSkill};
                        RMS.saveRMS("skillVersion", var61);
                        if (GameScr.vsData != GameScr.vcData || GameScr.vsMap != GameScr.vcMap || GameScr.vsSkill != GameScr.vcSkill || GameScr.vsItem != GameScr.vcItem) {
                            return;
                        }

                        GameScr.gI().readEfect();
                        GameScr.gI().readArrow();
                        GameScr.gI().readSkill();
                        Service.gI().clientOk();
                        return;
                    case -119:
                        System.out.println("GET UPDATE_ITEM " + msg.reader().available() + " bytes");
                        msg.reader().mark(100000);
                        createItem(msg.reader());
                        msg.reader().reset();
                        var56 = new byte[msg.reader().available()];
                        msg.reader().readFully(var56);
                        RMS.saveRMS("item", var56);
                        byte[] var47 = new byte[]{GameScr.vcItem};
                        RMS.saveRMS("itemVersion", var47);
                        if (GameScr.vsData != GameScr.vcData || GameScr.vsMap != GameScr.vcMap || GameScr.vsSkill != GameScr.vcSkill || GameScr.vsItem != GameScr.vcItem) {
                            return;
                        }

                        GameScr.gI().readEfect();
                        GameScr.gI().readArrow();
                        GameScr.gI().readSkill();
                        Service.gI().clientOk();
                        return;
                    case -117:
                        Char.getMyChar().cPk = msg.reader().readByte();
                        Info.addInfo(mResources.PK_NOW + " " + Char.getMyChar().cPk, 15, mFont.tahoma_7_yellow);
                        Char.getMyChar().callEffTask(21);
                        return;
                    case -116:
                        Char.getMyChar().xu = msg.reader().readInt();
                        Char.clan.coin = msg.reader().readInt();
                        return;
                    case -115:
                        var33 = msg.reader().readInt();
                        byte[] var52 = NinjaUtil.readByteArray(msg);
                        SmallImage.reciveImage(var33, var52);
                        return;
                    case -114:
                        if (Char.clan == null) {
                            Char.clan = new Clan();
                        }

                        Char.clan.writeLog(msg.reader().readUTF());
                        return;
                    case -113:
                        if (Char.clan == null) {
                            Char.clan = new Clan();
                        }

                        Char.clan.name = msg.reader().readUTF();
                        Char.clan.main_name = msg.reader().readUTF();
                        msg.reader().readUTF();
                        Char.clan.total = msg.reader().readShort();
                        Char.clan.openDun = msg.reader().readByte();
                        Char.clan.level = msg.reader().readByte();
                        Char.clan.exp = msg.reader().readInt();
                        Char.clan.expNext = msg.reader().readInt();
                        Char.clan.coin = msg.reader().readInt();
                        Char.clan.freeCoin = msg.reader().readInt();
                        Char.clan.coinUp = msg.reader().readInt();
                        Char.clan.reg_date = msg.reader().readUTF();
                        Char.clan.alert = msg.reader().readUTF();
                        Char.clan.use_card = msg.reader().readInt();
                        Char.clan.itemLevel = msg.reader().readByte();
                        AutoNTGT.ntgtAC();

                        return;
                    case -112:
                        GameScr.vClan.removeAllElements();
                        var42 = msg.reader().readShort();

                        for (var41 = 0; var41 < var42; ++var41) {
                            GameScr.vClan.addElement(new Member(msg.reader().readByte(), msg.reader().readByte(), msg.reader().readByte(), msg.reader().readUTF(), msg.reader().readInt(), msg.reader().readBoolean()));
                        }

                        try {
                            for (var41 = 0; var41 < var42; ++var41) {
                                ((Member) GameScr.vClan.elementAt(var41)).pointClanWeek = msg.reader().readInt();
                            }
                        } catch (Exception var30) {
                        }

                        GameScr.gI().sortClan();
                        return;
                    case -111:
                        Char.clan.items = new Item[30];
                        var36 = msg.reader().readByte();

                        for (var33 = 0; var33 < var36; ++var33) {
                            Char.clan.items[var33] = new Item();
                            Char.clan.items[var33].typeUI = 39;
                            Char.clan.items[var33].indexUI = var33;
                            Char.clan.items[var33].quantity = msg.reader().readShort();
                            Char.clan.items[var33].template = ItemTemplates.get(msg.reader().readShort());
                        }

                        GameScr.gI().clearVecThanThu();
                        byte var44 = msg.reader().readByte();

                        for (var41 = 0; var41 < var44; ++var41) {
                            String var50 = msg.reader().readUTF();
                            var43 = msg.reader().readShort();
                            short var45 = msg.reader().readShort();
                            int var51 = msg.reader().readInt();
                            var7 = "";
                            MyVector var8 = new MyVector();
                            int var9 = -1;
                            int var10 = -1;
                            byte var11 = msg.reader().readByte();
                            if (var51 >= 0) {
                                var7 = msg.reader().readUTF();
                            } else {
                                for (int var12 = 0; var12 < var11; ++var12) {
                                    String var54 = msg.reader().readUTF();
                                    var8.addElement(var54);
                                }

                                var9 = msg.reader().readInt();
                                var10 = msg.reader().readInt();
                            }

                            byte var60 = msg.reader().readByte();
                            GameScr.gI().addInfo_ThanThu(new Clan_ThanThu(var50, var60, var43, var45, var51, var7, var8, var9, var10));
                        }
                        AutoNTGT.ntgtAC();

                        return;
                    case -109:
                        try {
                            GameCanvas.isLoading = true;
                            TileMap.maps = null;
                            TileMap.types = null;
                            System.gc();
                            TileMap.advAA(TileMap.mapID, msg.reader());
                            TileMap.loadMapFromResource();
                            this.loadInfoMap(this.messWait);
                        } catch (Exception var29) {
                            var29.printStackTrace();
                        }

                        msg.cleanup();
                        this.messWait.cleanup();
                        msg = this.messWait = null;
                        return;
                    case -108:
                        var42 = msg.reader().readShort();

                        try {
                            var36 = msg.reader().readByte();
                            Mob.arrMobTemplate[var42].typeFly = var36;
                        } catch (Exception var24) {
                        }

                        var36 = msg.reader().readByte();
                        Mob.arrMobTemplate[var42].imgs = new Image[var36];
                        if (var42 != 98 && var42 != 99) {
                            for (var41 = 0; var41 < Mob.arrMobTemplate[var42].imgs.length; ++var41) {
                                Mob.arrMobTemplate[var42].imgs[var41] = createImage(NinjaUtil.readByteArray(msg));
                            }
                            if (var42 == 219) {
                                GameScr.gI().advAA(Mob.arrMobTemplate[var42].imgs[0]);
                            }
                        } else {
                            Mob.arrMobTemplate[var42].imgs = new Image[3];
                            Image var39 = createImage(NinjaUtil.readByteArray(msg));

                            for (var40 = 0; var40 < Mob.arrMobTemplate[var42].imgs.length; ++var40) {
                                Mob.arrMobTemplate[var42].imgs[var40] = var39;
                            }
                        }

                        if (msg.reader().readBoolean()) {
                            var36 = msg.reader().readByte();
                            Mob.arrMobTemplate[var42].frameBossMove = new byte[var36];

                            for (var40 = 0; var40 < var36; ++var40) {
                                Mob.arrMobTemplate[var42].frameBossMove[var40] = msg.reader().readByte();
                            }

                            var36 = msg.reader().readByte();
                            Mob.arrMobTemplate[var42].frameBossAttack = new byte[var36][];

                            for (var40 = 0; var40 < var36; ++var40) {
                                Mob.arrMobTemplate[var42].frameBossAttack[var40] = new byte[msg.reader().readByte()];

                                for (int var46 = 0; var46 < Mob.arrMobTemplate[var42].frameBossAttack[var40].length; ++var46) {
                                    Mob.arrMobTemplate[var42].frameBossAttack[var40][var46] = msg.reader().readByte();
                                }
                            }
                        }

                        if (msg.reader().readInt() > 0) {
                            if (var42 < 236) {
                                readDataMobOld(msg, var42);
                            } else {
                                readDataMobNew(msg, var42);
                            }

                            return;
                        }

                        return;
                    case -106:
                        GameScr.typeActive = msg.reader().readByte();
                        return;
                    case -99:
                        GameCanvas.input2Dlg.setTitle(mResources.SERI_NUM, mResources.CARD_CODE);
                        var34 = msg.reader().readUTF();
                        GameCanvas.input2Dlg.show(var34, new Command(mResources.CLOSE, GameCanvas.instance, 8882, (Object) null), new Command(mResources.CHARGE, GameCanvas.instance, 88816, (Object) null), 0, 1);
                        return;
                    case -98:
                        Char.getMyChar().clearTask();
                        return;
                    case -97:
                        GameCanvas.isLoading = false;
                        GameCanvas.endDlg();
                        Integer var38 = new Integer(msg.reader().readInt());
                        GameCanvas.inputDlg.show(mResources.NAME_CHANGE, new Command(mResources.OK, GameCanvas.instance, 88829, var38), 0);
                        return;
                    case -96:
                        Char.getMyChar().cClanName = msg.reader().readUTF();
                        Char.getMyChar().ctypeClan = 4;
                        Char.getMyChar().luong = msg.reader().readInt();
                        Char.getMyChar().callEffTask(21);
                        return;
                    case -95:
                        if (Char.clan != null) {
                            Char.clan.alert = msg.reader().readUTF();
                        }

                        return;
                    case -93:
                        if ((var33 = msg.reader().readInt()) == Char.getMyChar().charID) {
                            GameScr.vClan.removeAllElements();
                            Char.getMyChar().cClanName = "";
                            Char.getMyChar().ctypeClan = -1;
                            Char.clan = null;
                        } else {
                            GameScr.vClan.removeAllElements();
                            Char var37;
                            (var37 = GameScr.findCharInMap(var33)).cClanName = "";
                            var37.ctypeClan = -1;
                        }

                        return;
                    case -90:
                        Char.getMyChar().xu = msg.reader().readInt();
                        GameScr.gI().resetButton();
                        return;
                    case -88:
                        GameScr.gI().resetButton();
                        Item var35;
                        (var35 = Char.getMyChar().arrItemBag[msg.reader().readByte()]).clearExpire();
                        var35.isLock = true;
                        var35.upgrade = msg.reader().readByte();
                        (var35 = Char.getMyChar().arrItemBag[msg.reader().readByte()]).clearExpire();
                        var35.isLock = true;
                        var35.upgrade = msg.reader().readByte();
                        Info.addInfo(mResources.CONVERT_OK, 20, mFont.tahoma_7b_yellow);
                        return;
                    case -86:
                        GameCanvas.endDlg();
                        GameScr.gI().resetButton();
                        InfoMe.addInfo(msg.reader().readUTF(), 20, mFont.tahoma_7_yellow);
                        return;
                    case -84:
                        Char.pointPB = msg.reader().readShort();
                        return;
                    case -83:
                        short var3 = msg.reader().readShort();
                        var43 = msg.reader().readShort();
                        byte var5 = msg.reader().readByte();
                        short var6 = msg.reader().readShort();
                        if (var3 == 0) {
                            GameScr.gI().showAlert(mResources.REVIEW, "          " + mResources.EMPTY_INFO, false);
                        } else {
                            var7 = mResources.PROPERTY + ": " + var3 + "\n\n";
                            if (var43 == 0) {
                                var7 = var7 + mResources.NOT_FINISH + "\n\n";
                            } else {
                                var7 = var7 + mResources.TIME_FINISH + ": " + NinjaUtil.getTime(var43) + "\n\n";
                            }

                            var7 = var7 + mResources.TEAMWORK + ": " + var5 + "\n\n";
                            var7 = var7 + mResources.REWARD + ": " + var6 + " " + mResources.LUCKY_GIFT + "\n\n";
                            GameScr.gI().showAlert(mResources.REVIEW, var7, false);
                            if (var6 > 0) {
                                GameScr.gI().left = new Command(mResources.REWARD, 1000);
                                return;
                            }
                        }

                        return;
                    case -81:
                        Char.pointChienTruong = msg.reader().readShort();
                        return;
                    case -80:
                        GameScr.gI().showAlert(mResources.RESULT, msg.reader().readUTF(), false);
                        if (msg.reader().readBoolean()) {
                            GameScr.gI().left = new Command(mResources.REWARD, 2000);
                            LockGame.advAZ();

                        }

                        return;
                    case -77:
                        GameCanvas.loadBG(TileMap.bgID = msg.reader().readByte());
                        return;
                    case -72:
                        GameScr.gI().yenValue = new String[9];
                        GameScr.arrItemSprin = new short[9];
                        if (GameScr.indexSelect < 0 || GameScr.indexSelect > 8) {
                            GameScr.indexCard = 0;
                            GameScr.indexSelect = 0;
                        }

                        for (var33 = 0; var33 < 9; ++var33) {
                            GameScr.arrItemSprin[var33] = msg.reader().readShort();
                            GameScr.gI().yenValue[var33] = GameScr.gI().YenCards[NinjaUtil.randomNumber(9)];
                        }

                        GameScr.gI().left = new Command(mResources.CONTINUE, (IActionListener) null, 1506, (Object) null);
                        GameScr.gI().timePoint = System.currentTimeMillis();
                        --GameScr.gI().numSprinLeft;
                        GameCanvas.endDlg();
                        return;
                    case -70:
                        var34 = msg.reader().readUTF();
                        GameCanvas.startYesNoDlg(NinjaUtil.replace(mResources.INVITE_TO_CBT, "#", var34), new Command(mResources.YES, GameCanvas.instance, 88842, (Object) null), new Command(mResources.NO, GameCanvas.instance, 8882, (Object) null));
                        return;
                    case -67:
                        Mob var4 = null;

                        try {
                            var4 = Mob.get_Mob(msg.reader().readUnsignedByte());
                        } catch (Exception var23) {
                        }

                        if (var4 != null) {
                            if ((var33 = msg.reader().readInt()) == Char.getMyChar().charID) {
                                GameScr.vMobSoul.addElement(new MobSoul(var4.x, var4.y, Char.getMyChar()));
                            } else if ((aChar1 = GameScr.findCharInMap(var33)) != null) {
                                GameScr.vMobSoul.addElement(new MobSoul(var4.x, var4.y, aChar1));
                                return;
                            }

                            return;
                        }

                        return;
                    case -66:
                        var33 = msg.reader().readInt();
                        if (Char.getMyChar().charID == var33) {
                            GameScr.vMobSoul.addElement(new MobSoul(Char.getMyChar().cx, Char.getMyChar().cy));
                        } else if ((aChar1 = GameScr.findCharInMap(var33)) != null) {
                            GameScr.vMobSoul.addElement(new MobSoul(aChar1.cx, aChar1.cy));
                            return;
                        }

                        return;
                    case -62:
                        Char.clan.itemLevel = msg.reader().readByte();
                        return;
                }
            } catch (Exception var31) {
            }

        } finally {
            if (msg != null) {
                msg.cleanup();
            }

        }
    }

    private static void messageNotLogin(Message var0) {
        try {
            switch (var0.reader().readByte()) {
                case -124:
                    System.out.println("SEND SMS");
                    String var1 = var0.reader().readUTF();
                    SendSMS.sendSMSRe(var0.reader().readUTF(), "sms://" + var1, new Command("", GameCanvas.gI(), 88825, (Object) null), new Command("", GameCanvas.gI(), 88826, (Object) null));
                    break;
                case 2:
                    RMS.clearRMS();
            }
        } catch (Exception var5) {
        } finally {
            if (var0 != null) {
                var0.cleanup();
            }

        }

    }

    private void messageSubCommand(Message var1) {
        try {
            byte var42 = var1.reader().readByte();
            boolean var2 = false;
            short var64;
            String var65;
            Skill skillNE;
            EffectTemplate var67;
            byte var4;
            Service var73;
            GameScr var74;
            Char var75;
            byte var10000;
            int var43;
            byte var44;
            short var45;
            short[] var46;
            ItemTemplate var47;
            Char var50;
            int var51;
            short var52;
            int var53;
            int var54;
            short var56;
            byte var58;
            Integer var59;
            Effect var60;
            Effect var63;
            switch (var42) {
                case -128:
                    if ((var50 = GameScr.findCharInMap(var1.reader().readInt())) == null) {
                        return;
                    }

                    var50.cHP = var1.reader().readInt();
                    var50.cMaxHP = var1.reader().readInt();
                    var50.clevel = var1.reader().readUnsignedByte();
                    break;
                case -127:
                    GameScr.vCharInMap.removeAllElements();
                    GameScr.vItemMap.removeAllElements();
                    GameScr.loadImg();
                    GameScr.currentCharViewInfo = Char.getMyChar();
                    Char.getMyChar().charID = var1.reader().readInt();
                    Char.getMyChar().cClanName = var1.reader().readUTF();
                    if (!Char.getMyChar().cClanName.equals("")) {
                        Char.getMyChar().ctypeClan = var1.reader().readByte();
                    }

                    Char.getMyChar().ctaskId = var1.reader().readByte();
                    Char.getMyChar().cgender = var1.reader().readByte();
                    Char.getMyChar().head = var1.reader().readShort();
                    Char.getMyChar().cspeed = var1.reader().readByte();
                    Char.getMyChar().cName = var1.reader().readUTF();
                    Char.getMyChar().cPk = var1.reader().readByte();
                    Char.getMyChar().cTypePk = var1.reader().readByte();
                    Char.getMyChar().cMaxHP = var1.reader().readInt();
                    Char.getMyChar().cHP = var1.reader().readInt();
                    Char.getMyChar().cMaxMP = var1.reader().readInt();
                    Char.getMyChar().cMP = var1.reader().readInt();
                    Char.getMyChar().cEXP = var1.reader().readLong();
                    Char.getMyChar().cExpDown = var1.reader().readLong();
                    GameScr.setLevel_Exp(Char.getMyChar().cEXP, true);
                    Char.getMyChar().eff5BuffHp = var1.reader().readShort();
                    Char.getMyChar().eff5BuffMp = var1.reader().readShort();
                    Char.getMyChar().nClass = GameScr.nClasss[var1.reader().readByte()];
                    Char.getMyChar().pPoint = var1.reader().readShort();
                    Char.getMyChar().potential[0] = var1.reader().readShort();
                    Char.getMyChar().potential[1] = var1.reader().readShort();
                    Char.getMyChar().potential[2] = var1.reader().readInt();
                    Char.getMyChar().potential[3] = var1.reader().readInt();
                    Char.getMyChar().sPoint = var1.reader().readShort();
                    Char.getMyChar().vSkill.removeAllElements();
                    Char.getMyChar().vSkillFight.removeAllElements();
                    var44 = var1.reader().readByte();

                    for (var4 = 0; var4 < var44; ++var4) {
                        skillNE = Skills.get(var1.reader().readShort());
                        if (Char.getMyChar().myskill == null) {
                            Char.getMyChar().myskill = skillNE;
                        }
                        if (Code.auto != null && Auto.advAO != null && skillNE.template.id == Auto.advAO.template.id) {
                            Auto.advAO = skillNE;
                        }
                        Char.getMyChar().vSkill.addElement(skillNE);
                        if ((skillNE.template.type == 1 || skillNE.template.type == 4 || skillNE.template.type == 2 || skillNE.template.type == 3) && (skillNE.template.maxPoint == 0 || skillNE.template.maxPoint > 0 && skillNE.point > 0)) {
                            var10000 = skillNE.template.id;
                            Char.getMyChar();
                            if (var10000 == 0) {
                                var73 = Service.gI();
                                Char.getMyChar();
                                var73.selectSkill(0);
                            }

                            Char.getMyChar().vSkillFight.addElement(skillNE);
                        }
                    }

                    GameScr.gI().sortSkill();
                    Char.getMyChar().xu = var1.reader().readInt();
                    Char.getMyChar().yen = var1.reader().readInt();
                    Char.getMyChar().luong = var1.reader().readInt();
                    Char.getMyChar().arrItemBag = new Item[var1.reader().readUnsignedByte()];
                    GameScr.mpPotion = 0;
                    GameScr.hpPotion = 0;

                    for (var54 = 0; var54 < Char.getMyChar().arrItemBag.length; ++var54) {
                        if ((var64 = var1.reader().readShort()) != -1) {
                            Char.getMyChar().arrItemBag[var54] = new Item();
                            Char.getMyChar().arrItemBag[var54].typeUI = 3;
                            Char.getMyChar().arrItemBag[var54].indexUI = var54;
                            Char.getMyChar().arrItemBag[var54].template = ItemTemplates.get(var64);
                            Char.getMyChar().arrItemBag[var54].isLock = var1.reader().readBoolean();
                            if (Char.getMyChar().arrItemBag[var54].isTypeBody() || Char.getMyChar().arrItemBag[var54].isTypeMounts() || Char.getMyChar().arrItemBag[var54].isTypeNgocKham()) {
                                Char.getMyChar().arrItemBag[var54].upgrade = var1.reader().readByte();
                            }

                            Char.getMyChar().arrItemBag[var54].isExpires = var1.reader().readBoolean();
                            Char.getMyChar().arrItemBag[var54].quantity = var1.reader().readUnsignedShort();
                            if (Char.getMyChar().arrItemBag[var54].template.type == 16) {
                                GameScr.hpPotion += Char.getMyChar().arrItemBag[var54].quantity;
                            }

                            if (Char.getMyChar().arrItemBag[var54].template.type == 17) {
                                GameScr.mpPotion += Char.getMyChar().arrItemBag[var54].quantity;
                            }

                            if (Char.getMyChar().arrItemBag[var54].template.id == 340) {
                                var74 = GameScr.gI();
                                var74.numSprinLeft += Char.getMyChar().arrItemBag[var54].quantity;
                            }
                        }
                    }
                    Code.advAJ();
                    Code.tinhluyen();

                    Char.getMyChar().arrItemBody = new Item[32];

                    try {
                        Char.getMyChar().setDefaultPart();

                        for (var54 = 0; var54 < 16; ++var54) {
                            if ((var64 = var1.reader().readShort()) != -1) {
                                ItemTemplate var71;
                                var42 = (var71 = ItemTemplates.get(var64)).type;
                                Char.getMyChar().arrItemBody[var42] = new Item();
                                Char.getMyChar().arrItemBody[var42].indexUI = var42;
                                Char.getMyChar().arrItemBody[var42].typeUI = 5;
                                Char.getMyChar().arrItemBody[var42].template = var71;
                                Char.getMyChar().arrItemBody[var42].isLock = true;
                                Char.getMyChar().arrItemBody[var42].upgrade = var1.reader().readByte();
                                Char.getMyChar().arrItemBody[var42].sys = var1.reader().readByte();
                                if (var42 == 1) {
                                    Char.getMyChar().wp = Char.getMyChar().arrItemBody[var42].template.part;
                                } else if (var42 == 2) {
                                    Char.getMyChar().body = Char.getMyChar().arrItemBody[var42].template.part;
                                } else if (var42 == 6) {
                                    Char.getMyChar().leg = Char.getMyChar().arrItemBody[var42].template.part;
                                }
                            }
                        }
                    } catch (Exception var30) {
                        var30.printStackTrace();
                    }

                    Char.getMyChar().isHuman = var1.reader().readBoolean();
                    Char.getMyChar().isNhanban = var1.reader().readBoolean();
                    short[] var70;
                    if ((var70 = new short[]{var1.reader().readShort(), var1.reader().readShort(), var1.reader().readShort(), var1.reader().readShort()})[0] > -1) {
                        Char.getMyChar().head = var70[0];
                    }

                    if (var70[1] > -1) {
                        Char.getMyChar().wp = var70[1];
                    }

                    if (var70[2] > -1) {
                        Char.getMyChar().body = var70[2];
                    }

                    if (var70[3] > -1) {
                        Char.getMyChar().leg = var70[3];
                    }

                    var46 = new short[10];

                    try {
                        for (var53 = 0; var53 < 10; ++var53) {
                            var46[var53] = var1.reader().readShort();
                        }
                    } catch (Exception var29) {
                        var46 = null;
                    }

                    if (var46 != null) {
                        Char.getMyChar().setThoiTrang(var46);
                    }

                    try {
                        for (var53 = 0; var53 < 16; ++var53) {
                            if ((var64 = var1.reader().readShort()) != -1) {
                                var51 = (var47 = ItemTemplates.get(var64)).type + 16;
                                Char.getMyChar().arrItemBody[var51] = new Item();
                                Char.getMyChar().arrItemBody[var51].indexUI = var51;
                                Char.getMyChar().arrItemBody[var51].typeUI = 5;
                                Char.getMyChar().arrItemBody[var51].template = var47;
                                Char.getMyChar().arrItemBody[var51].isLock = true;
                                Char.getMyChar().arrItemBody[var51].upgrade = var1.reader().readByte();
                                Char.getMyChar().arrItemBody[var51].sys = var1.reader().readByte();
                                if (var51 == 1) {
                                    Char.getMyChar().wp = Char.getMyChar().arrItemBody[var51].template.part;
                                } else if (var51 == 2) {
                                    Char.getMyChar().body = Char.getMyChar().arrItemBody[var51].template.part;
                                } else if (var51 == 6) {
                                    Char.getMyChar().leg = Char.getMyChar().arrItemBody[var51].template.part;
                                }
                            }
                        }
                    } catch (Exception var28) {
                        var28.printStackTrace();
                    }

                    var2 = false;

                    try {
                        var45 = var1.reader().readShort();
                    } catch (Exception var26) {
                        var45 = -1;
                    }

                    Char.getMyChar().ID_SUSANO = var45;
                    if (Char.getMyChar().isHuman) {
                        GameScr.gI().loadSkillShortcut();
                    } else if (Char.getMyChar().isNhanban) {
                        GameScr.gI().loadSkillShortcutNhanban();
                    }

                    Char.getMyChar().statusMe = 4;
                    GameScr.isViewClanInvite = RMS.loadRMSInt(Char.getMyChar().cName + "vci") >= 1;
                    if (Char.getMyChar().isHumanz()) {
                        createSkill(new DataInputStream(new ByteArrayInputStream(RMS.loadRMS("skill"))));
                    } else {
                        createSkill(new DataInputStream(new ByteArrayInputStream(RMS.loadRMS("skillnhanban"))));
                    }

                    Service.gI().loadRMS("KSkill");
                    Service.gI().loadRMS("OSkill");
                    Service.gI().loadRMS("CSkill");
                    break;
                case -126:
                    Char.getMyChar().readParam(var1);
                    Char.getMyChar().potential[0] = var1.reader().readShort();
                    Char.getMyChar().potential[1] = var1.reader().readShort();
                    Char.getMyChar().potential[2] = var1.reader().readInt();
                    Char.getMyChar().potential[3] = var1.reader().readInt();
                    Char.getMyChar().callEffTask(61);
                    Char.getMyChar().nClass = GameScr.nClasss[var1.reader().readByte()];
                    Char.getMyChar().sPoint = var1.reader().readShort();
                    Char.getMyChar().pPoint = var1.reader().readShort();
                    Char.getMyChar().vSkill.removeAllElements();
                    Char.getMyChar().vSkillFight.removeAllElements();
                    Char.getMyChar().myskill = null;
                    break;
                case -125:
                    Char.getMyChar().readParam(var1);
                    if (Char.getMyChar().statusMe != 14 && Char.getMyChar().statusMe != 5) {
                        Char.getMyChar().cHP = Char.getMyChar().cMaxHP;
                        Char.getMyChar().cMP = Char.getMyChar().cMaxMP;
                    }

                    try {
                        Char.getMyChar().sPoint = var1.reader().readShort();
                        Char.getMyChar().vSkill.removeAllElements();
                        Char.getMyChar().vSkillFight.removeAllElements();
                        var44 = var1.reader().readByte();

                        for (var42 = 0; var42 < var44; ++var42) {
                            skillNE = Skills.get(var1.reader().readShort());
                            if (Char.getMyChar().myskill == null) {
                                Char.getMyChar().myskill = skillNE;
                            } else if (skillNE.template.equals(Char.getMyChar().myskill.template)) {
                                Char.getMyChar().myskill = skillNE;
                            }
                            if (Code.auto != null && Auto.advAO != null && skillNE.template.id == Auto.advAO.template.id) {
                                Auto.advAO = skillNE;
                            }
                            Char.getMyChar().vSkill.addElement(skillNE);
                            if ((skillNE.template.type == 1 || skillNE.template.type == 4 || skillNE.template.type == 2 || skillNE.template.type == 3) && (skillNE.template.maxPoint == 0 || skillNE.template.maxPoint > 0 && skillNE.point > 0)) {
                                var10000 = skillNE.template.id;
                                Char.getMyChar();
                                if (var10000 == 0) {
                                    var73 = Service.gI();
                                    Char.getMyChar();
                                    var73.selectSkill(0);
                                }

                                Char.getMyChar().vSkillFight.addElement(skillNE);
                            }
                        }

                        GameScr.gI().sortSkill();
                        if (GameScr.isPaintInfoMe) {
                            GameScr.indexRow = -1;
                            GameScr.gI().setLCR();
                        }
                        System.out.println("LOAD XONG ME LOAD SKILL " + Char.getMyChar().vSkill.size());

                    } catch (Exception var34) {
                        var34.printStackTrace();
                    }
                    LockGame.advAV();

                    break;
                case -124:
                    Char.getMyChar().readParam(var1);
                    Char.getMyChar().cEXP = var1.reader().readLong();
                    GameScr.setLevel_Exp(Char.getMyChar().cEXP, true);
                    Char.getMyChar().sPoint = var1.reader().readShort();
                    Char.getMyChar().pPoint = var1.reader().readShort();
                    Char.getMyChar().potential[0] = var1.reader().readShort();
                    Char.getMyChar().potential[1] = var1.reader().readShort();
                    Char.getMyChar().potential[2] = var1.reader().readInt();
                    Char.getMyChar().potential[3] = var1.reader().readInt();
                    break;
                case -123:
                    Char.getMyChar().xu = var1.reader().readInt();
                    Char.getMyChar().yen = var1.reader().readInt();
                    Char.getMyChar().luong = var1.reader().readInt();
                    Char.getMyChar().cHP = var1.reader().readInt();
                    Char.getMyChar().cMP = var1.reader().readInt();
                    if (var1.reader().readByte() == 1) {
                        GameScr.gI().resetCaptcha();
                        Char.getMyChar().isCaptcha = true;
                    } else {
                        Char.getMyChar().isCaptcha = false;
                        LockGame.advAJ();

                    }
                    break;
                case -122:
                    Char.getMyChar().cHP = var1.reader().readInt();
                    break;
                case -121:
                    Char.getMyChar().cMP = var1.reader().readInt();
                    break;
                case -120:
                    System.out.println("PLAYER LOAD ALL");
                    if ((var50 = GameScr.findCharInMap(var1.reader().readInt())) != null) {
                        readCharInfo(var50, var1);
                    }
                    break;
                case -119:
                    if ((var50 = GameScr.findCharInMap(var1.reader().readInt())) == null) {
                        return;
                    }

                    var50.cHP = var1.reader().readInt();
                    var50.cMaxHP = var1.reader().readInt();
                    break;
                case -117:
                    if ((var50 = GameScr.findCharInMap(var1.reader().readInt())) == null) {
                        return;
                    }

                    var50.cHP = var1.reader().readInt();
                    var50.cMaxHP = var1.reader().readInt();
                    var50.eff5BuffHp = var1.reader().readShort();
                    var50.eff5BuffMp = var1.reader().readShort();
                    var50.wp = var1.reader().readShort();
                    if (var50.wp == -1) {
                        var50.setDefaultWeapon();
                    }
                    break;
                case -116:
                    if ((var50 = GameScr.findCharInMap(var1.reader().readInt())) == null) {
                        return;
                    }

                    var50.cHP = var1.reader().readInt();
                    var50.cMaxHP = var1.reader().readInt();
                    var50.eff5BuffHp = var1.reader().readShort();
                    var50.eff5BuffMp = var1.reader().readShort();
                    var50.body = var1.reader().readShort();
                    if (var50.body == -1) {
                        var50.setDefaultBody();
                    }
                    break;
                case -113:
                    if ((var50 = GameScr.findCharInMap(var1.reader().readInt())) == null) {
                        return;
                    }

                    var50.cHP = var1.reader().readInt();
                    var50.cMaxHP = var1.reader().readInt();
                    var50.eff5BuffHp = var1.reader().readShort();
                    var50.eff5BuffMp = var1.reader().readShort();
                    var50.leg = var1.reader().readShort();
                    if (var50.leg == -1) {
                        var50.setDefaultLeg();
                    }
                    break;
                case -112:
                    if ((var50 = GameScr.findCharInMap(var1.reader().readInt())) == null) {
                        return;
                    }

                    var50.cHP = var1.reader().readInt();
                    var50.cMaxHP = var1.reader().readInt();
                    var50.eff5BuffHp = var1.reader().readShort();
                    var50.eff5BuffMp = var1.reader().readShort();
                    break;
                case -111:
                    if ((var50 = GameScr.findCharInMap(var1.reader().readInt())) == null) {
                        return;
                    }

                    var50.cHP = var1.reader().readInt();
                    break;
                case -110:
                    if ((var50 = GameScr.findCharInMap(var1.reader().readInt())) == null) {
                        return;
                    }

                    var50.cHP = var1.reader().readInt();
                    var50.cMaxHP = var1.reader().readInt();
                    var50.cx = var50.cxMoveLast = var1.reader().readShort();
                    var50.cy = var50.cyMoveLast = var1.reader().readShort();
                    var50.statusMe = 1;
                    ServerEffect.addServerEffect(20, var50, 2);
                    break;
                case -109:
                    Char.getMyChar().readParam(var1);
                    if (Char.getMyChar().statusMe != 14 && Char.getMyChar().statusMe != 5) {
                        Char.getMyChar().cHP = Char.getMyChar().cMaxHP;
                        Char.getMyChar().cMP = Char.getMyChar().cMaxMP;
                    }

                    Char.getMyChar().pPoint = var1.reader().readShort();
                    Char.getMyChar().potential[0] = var1.reader().readShort();
                    Char.getMyChar().potential[1] = var1.reader().readShort();
                    Char.getMyChar().potential[2] = var1.reader().readInt();
                    Char.getMyChar().potential[3] = var1.reader().readInt();
                    LockGame.advAX();

                    break;
                case -107:
                    Char.getMyChar().bagSort();
                    LockGame.advAR();

                    break;
                case -106:
                    Char.getMyChar().boxSort();
                    break;
                case -105:
                    var43 = var1.reader().readInt();
                    Char.getMyChar().xu -= var43;
                    Char.getMyChar().xuInBox += var43;
                    break;
                case -104:
                    var51 = var1.reader().readInt();
                    Char.getMyChar().xuInBox -= var51;
                    Char.getMyChar().xu += var51;
                    break;
                case -102:
                    Char.getMyChar().arrItemBag[var1.reader().readByte()] = null;
                    skillNE = Skills.get(var1.reader().readShort());
                    Char.getMyChar().vSkill.addElement(skillNE);
                    if ((skillNE.template.type == 1 || skillNE.template.type == 4 || skillNE.template.type == 2 || skillNE.template.type == 3) && (skillNE.template.maxPoint == 0 || skillNE.template.maxPoint > 0 && skillNE.point > 0)) {
                        var10000 = skillNE.template.id;
                        Char.getMyChar();
                        if (var10000 == 0) {
                            Char.getMyChar();
                            Service.gI().selectSkill(0);
                        }

                        Char.getMyChar().vSkillFight.addElement(skillNE);
                    }

                    GameScr.gI().sortSkill();
                    GameScr.gI().addSkillShortcut(skillNE);
                    GameScr.gI().setLCR();
                    InfoMe.addInfo(mResources.LEARN_SKILL + " " + skillNE.template.name);
                    break;
                case -101:
                    var63 = new Effect(var1.reader().readByte(), (int) (System.currentTimeMillis() / 1000L) - var1.reader().readInt(), var1.reader().readInt(), var1.reader().readShort());
                    Char.getMyChar().vEff.addElement(var63);
                    if (var63.template.type == 7) {
                        Char.getMyChar().cMiss += var63.param;
                    } else if (var63.template.type != 12 && var63.template.type != 11) {
                        if (var63.template.type == 14) {
                            GameCanvas.clearKeyPressed();
                            GameCanvas.clearKeyHold();
                            Char.getMyChar().cx = var1.reader().readShort();
                            Char.getMyChar().cy = var1.reader().readShort();
                            Char.getMyChar().statusMe = 1;
                            Char.getMyChar().isLockMove = true;
                            ServerEffect.addServerEffectWithTime(76, Char.getMyChar(), var63.timeLenght);
                        } else if (var63.template.type == 1) {
                            ServerEffect.addServerEffectWithTime(48, Char.getMyChar(), var63.timeLenght);
                        } else if (var63.template.type == 2) {
                            GameCanvas.clearKeyPressed();
                            GameCanvas.clearKeyHold();
                            Char.getMyChar().cx = var1.reader().readShort();
                            Char.getMyChar().cy = var1.reader().readShort();
                            Char.getMyChar().statusMe = 1;
                            Char.getMyChar().isLockMove = true;
                            Char.getMyChar().isLockAttack = true;
                        } else if (var63.template.type == 3) {
                            GameCanvas.clearKeyPressed();
                            GameCanvas.clearKeyHold();
                            Char.getMyChar().cx = var1.reader().readShort();
                            Char.getMyChar().cy = var1.reader().readShort();
                            Char.getMyChar().statusMe = 1;
                            Char.isLockKey = true;
                            ServerEffect.addServerEffectWithTime(43, Char.getMyChar(), var63.timeLenght);
                        }
                    } else {
                        Char.getMyChar().isInvisible = true;
                        ServerEffect.addServerEffect(60, Char.getMyChar().cx, Char.getMyChar().cy, 1);
                    }
                    break;
                case -100:
                    var67 = Effect.effTemplates[var1.reader().readByte()];

                    for (var51 = 0; var51 < Char.getMyChar().vEff.size(); ++var51) {
                        if ((var60 = (Effect) Char.getMyChar().vEff.elementAt(var51)).template.type == var67.type) {
                            if (var60.template.type == 7) {
                                Char.getMyChar().cMiss -= var60.param;
                            }

                            var60.template = var67;
                            var60.timeStart = (int) (System.currentTimeMillis() / 1000L) - var1.reader().readInt();
                            var60.timeLenght = var1.reader().readInt() / 1000;
                            var60.param = var1.reader().readShort();
                            if (var60.template.type == 7) {
                                Char.getMyChar().cMiss += var60.param;
                            }
                            break;
                        }
                    }

                    if (!GameScr.isPaintInfoMe) {
                        GameScr.gI().resetButton();
                    }
                    break;
                case -99:
                    var58 = var1.reader().readByte();
                    var60 = null;

                    for (var53 = 0; var53 < Char.getMyChar().vEff.size(); ++var53) {
                        if ((var60 = (Effect) Char.getMyChar().vEff.elementAt(var53)).template.id == var58) {
                            if (var60.template.type == 7) {
                                Char.getMyChar().cMiss -= var60.param;
                            }

                            Char.getMyChar().vEff.removeElementAt(var53);
                            break;
                        }
                    }

                    if (var60.template.type != 0 && var60.template.type != 12) {
                        if (var60.template.type != 4 && var60.template.type != 13 && var60.template.type != 17) {
                            if (var60.template.type == 23) {
                                Char.getMyChar().cHP = var1.reader().readInt();
                                Char.getMyChar().cMaxHP = var1.reader().readInt();
                            } else if (var60.template.type == 11) {
                                Char.getMyChar().isInvisible = false;
                                ServerEffect.addServerEffect(60, Char.getMyChar().cx, Char.getMyChar().cy, 1);
                            } else if (var60.template.type == 14) {
                                Char.getMyChar().isLockMove = false;
                            } else if (var60.template.type == 2) {
                                Char.getMyChar().isLockMove = false;
                                Char.getMyChar().isLockAttack = false;
                                ServerEffect.addServerEffect(77, Char.getMyChar().cx, Char.getMyChar().cy - 9, 1);
                            } else if (var60.template.type == 3) {
                                Char.isLockKey = false;
                            }
                        } else {
                            Char.getMyChar().cHP = var1.reader().readInt();
                        }
                    } else {
                        Char.getMyChar().cHP = var1.reader().readInt();
                        Char.getMyChar().cMP = var1.reader().readInt();
                        if (var60.template.type == 0) {
                            InfoMe.addInfo(mResources.EFF_REMOVE);
                        } else if (var60.template.type == 12) {
                            Char.getMyChar().isInvisible = false;
                            ServerEffect.addServerEffect(60, Char.getMyChar().cx, Char.getMyChar().cy, 1);
                        }
                    }
                    break;
                case -98:
                    try {
                        if ((var50 = GameScr.findCharInMap(var1.reader().readInt())) == null) {
                            return;
                        }

                        var63 = new Effect(var1.reader().readByte(), (int) (System.currentTimeMillis() / 1000L) - var1.reader().readInt(), var1.reader().readInt(), var1.reader().readShort());
                        var50.vEff.addElement(var63);
                        if (var63.template.type != 12 && var63.template.type != 11) {
                            if (var63.template.type == 14) {
                                var50.cx = var50.cxMoveLast = var1.reader().readShort();
                                var50.cy = var50.cyMoveLast = var1.reader().readShort();
                                var50.statusMe = 1;
                                ServerEffect.addServerEffectWithTime(76, var50, var63.timeLenght);
                            } else if (var63.template.type == 1) {
                                ServerEffect.addServerEffectWithTime(48, var50, var63.timeLenght);
                            } else if (var63.template.type == 2) {
                                var50.cx = var50.cxMoveLast = var1.reader().readShort();
                                var50.cy = var50.cyMoveLast = var1.reader().readShort();
                                var50.statusMe = 1;
                                var50.isLockAttack = true;
                            } else if (var63.template.type == 3) {
                                var50.cx = var50.cxMoveLast = var1.reader().readShort();
                                var50.cy = var50.cyMoveLast = var1.reader().readShort();
                                var50.statusMe = 1;
                                ServerEffect.addServerEffectWithTime(43, var50, var63.timeLenght);
                            }
                        } else {
                            var50.isInvisible = true;
                            ServerEffect.addServerEffect(60, var50.cx, var50.cy, 1);
                        }
                    } catch (Exception var39) {
                    }
                    break;
                case -97:
                    try {
                        if ((var50 = GameScr.findCharInMap(var1.reader().readInt())) == null) {
                            return;
                        }

                        var67 = Effect.effTemplates[var1.reader().readByte()];

                        for (var51 = 0; var51 < var50.vEff.size(); ++var51) {
                            var60 = (Effect) var50.vEff.elementAt(var51);
                            if (var67.type == var67.type) {
                                var60.template = var67;
                                var60.timeStart = (int) (System.currentTimeMillis() / 1000L) - var1.reader().readInt();
                                var60.timeLenght = var1.reader().readInt() / 1000;
                                var60.param = var1.reader().readShort();
                                return;
                            }
                        }

                        return;
                    } catch (Exception var38) {
                        break;
                    }
                case -96:
                    if ((var50 = GameScr.findCharInMap(var1.reader().readInt())) == null) {
                        return;
                    }

                    var58 = var1.reader().readByte();
                    var63 = null;

                    for (var54 = 0; var54 < var50.vEff.size(); ++var54) {
                        if ((var63 = (Effect) var50.vEff.elementAt(var54)).template.id == var58) {
                            var50.vEff.removeElementAt(var54);
                            break;
                        }
                    }

                    if (var63 != null) {
                        if (var63.template.type == 0) {
                            var50.cHP = var1.reader().readInt();
                            var50.cMP = var1.reader().readInt();
                        } else if (var63.template.type == 11) {
                            var50.cx = var50.cxMoveLast = var1.reader().readUnsignedShort();
                            var50.cy = var50.cyMoveLast = var1.reader().readUnsignedShort();
                            var50.isInvisible = false;
                            ServerEffect.addServerEffect(60, var50.cx, var50.cy, 1);
                        } else if (var63.template.type == 12) {
                            var50.cHP = var1.reader().readInt();
                            var50.cMP = var1.reader().readInt();
                            var50.isInvisible = false;
                            ServerEffect.addServerEffect(60, var50.cx, var50.cy, 1);
                        } else if (var63.template.type != 4 && var63.template.type != 13 && var63.template.type != 17) {
                            if (var63.template.type == 23) {
                                Char.getMyChar().cHP = var1.reader().readInt();
                                Char.getMyChar().cMaxHP = var1.reader().readInt();
                            } else if (var63.template.type == 2) {
                                var50.isLockAttack = false;
                                ServerEffect.addServerEffect(77, var50.cx, var50.cy - 9, 1);
                            }
                        } else {
                            var50.cHP = var1.reader().readInt();
                        }
                    }
                    break;
                case -95:
                    GameScr.gI().timeLengthMap = var1.reader().readInt();
                    GameScr.gI().timeStartMap = (int) (System.currentTimeMillis() / 1000L);
                    if (Code.auto != null && Code.auto == Code.autoLoiLoss && TileMap.mapID == 111) {
                        Code.autoLoiLoss.advAA = true;
                    }
                    break;
                case -94:
                    var4 = var1.reader().readByte();
                    Npc var72;
                    (var72 = (Npc) GameScr.vNpc.elementAt(var4)).statusMe = var1.reader().readByte();
                    if (var72.template.npcTemplateId == 31 && var72.statusMe == 15) {
                        GameScr.startLanterns(var72.cx, var72.cy);
                    }
                    break;
                case -92:
                    if ((var43 = var1.reader().readInt()) == Char.getMyChar().charID) {
                        var50 = Char.getMyChar();
                    } else {
                        var50 = GameScr.findCharInMap(var43);
                    }

                    if (var50 != null) {
                        var50.cTypePk = var1.reader().readByte();
                        Auto.advAB(var50);
                        if (var50 == Char.getMyChar()) {
                            if (var50.cTypePk == 4) {
                                GameScr.advGP = true;
                            } else if (var50.cTypePk == 5) {
                                GameScr.advGP = false;
                            }
                        }
                    }
                    break;
                case -91:
                    Item[] var68 = new Item[var1.reader().readUnsignedByte()];

                    for (var43 = 0; var43 < Char.getMyChar().arrItemBag.length; ++var43) {
                        var68[var43] = Char.getMyChar().arrItemBag[var43];
                    }

                    Char.getMyChar().arrItemBag = var68;
                    Char.getMyChar().arrItemBag[var1.reader().readUnsignedByte()] = null;
                    InfoMe.addInfo(mResources.BAG_EXPANDED + " " + Char.getMyChar().arrItemBag.length + " " + mResources.CELL);
                    break;
                case -90:
                    for (var43 = 0; var43 < GameScr.vNpc.size(); ++var43) {
                        Npc var62;
                        if ((var62 = (Npc) GameScr.vNpc.elementAt(var43)).statusMe == 15) {
                            var62.statusMe = 1;
                            break;
                        }
                    }

                    if ((var42 = var1.reader().readByte()) == 1) {
                        InfoMe.addInfo(mResources.PROTECT_FAR, 20, mFont.tahoma_7_yellow);
                    } else if (var42 == 2) {
                        InfoMe.addInfo(mResources.PROTECT_INJURE, 20, mFont.tahoma_7_yellow);
                    }
                    break;
                case -89:
                    GameCanvas.isLoading = false;

                    try {
                        InfoMe.addInfo(var1.reader().readUTF(), 20, mFont.tahoma_7_yellow);
                    } catch (Exception var24) {
                    }

                    InfoDlg.hide();
                    GameCanvas.endDlg();
                    break;
                case -87:
                    var44 = var1.reader().readByte();
                    Party var69 = (Party) GameScr.vParty.elementAt(var44);
                    GameScr.vParty.setElementAt(GameScr.vParty.elementAt(0), var44);
                    GameScr.vParty.setElementAt(var69, 0);
                    GameScr.gI().refreshTeam();
                    InfoMe.addInfo(var69.name + mResources.TEAMLEADER_CHANGE, 20, mFont.tahoma_7_yellow);
                    break;
                case -86:
                    GameScr.vParty.removeAllElements();
                    GameScr.gI().refreshTeam();
                    InfoMe.addInfo(mResources.MOVEOUT_ME, 20, mFont.tahoma_7_yellow);
                    Code.cNameLeader = null;

                    break;
                case -85:
                    GameScr.vFriend.removeAllElements();

                    try {
                        while (true) {
                            GameScr.vFriend.addElement(new Friend(var1.reader().readUTF(), var1.reader().readByte()));
                        }
                    } catch (Exception var35) {
                        for (var43 = 0; var43 < GameScr.vFriendWait.size(); ++var43) {
                            GameScr.vFriend.addElement(GameScr.vFriendWait.elementAt(var43));
                        }

                        GameScr.gI().sortList((int) 0);
                        break;
                    }
                case -84:
                    GameScr.vEnemies.removeAllElements();

                    try {
                        while (true) {
                            GameScr.vEnemies.addElement(new Friend(var1.reader().readUTF(), var1.reader().readByte()));
                        }
                    } catch (Exception var36) {
                        GameScr.gI().sortList((int) 1);
                        break;
                    }
                case -83:
                    var65 = var1.reader().readUTF();

                    for (var53 = 0; var53 < GameScr.vFriend.size(); ++var53) {
                        if (((Friend) GameScr.vFriend.elementAt(var53)).friendName.equals(var65)) {
                            GameScr.indexRow = 0;
                            GameScr.vFriend.removeElementAt(var53);
                            GameScr.gI().actRemoveWaitAcceptFriend(var65);
                            break;
                        }
                    }

                    if (GameScr.isPaintFriend) {
                        GameScr.gI().sortList((int) 0);
                        GameScr.indexRow = 0;
                        GameScr.scrMain.clear();
                    }
                    break;
                case -82:
                    var65 = var1.reader().readUTF();

                    for (var53 = 0; var53 < GameScr.vEnemies.size(); ++var53) {
                        if (((Friend) GameScr.vEnemies.elementAt(var53)).friendName.equals(var65)) {
                            GameScr.indexRow = 0;
                            GameScr.vEnemies.removeElementAt(var53);
                            break;
                        }
                    }

                    GameScr.gI().sortList((int) 1);
                    break;
                case -81:
                    Char.getMyChar().cPk = var1.reader().readByte();
                    Char.getMyChar().charFocus = null;
                    break;
                case -80:
                    Char.getMyChar().arrItemBody[var1.reader().readByte()] = null;
                    break;
                case -78:
                    ServerEffect.addServerEffect(var1.reader().readShort(), Char.getMyChar().cx, Char.getMyChar().cy, 1);
                    break;
                case -77:
                    try {
                        GameScr.vPtMap.removeAllElements();

                        while (true) {
                            GameScr.vPtMap.addElement(new Party(var1.reader().readByte(), var1.reader().readUnsignedByte(), var1.reader().readUTF(), var1.reader().readByte()));
                        }
                    } catch (Exception var37) {
                        GameScr.gI().refreshFindTeam();
                        break;
                    }
                case -76:
                    ((Party) GameScr.vParty.firstElement()).isLock = var1.reader().readBoolean();
                    break;
                case -75:
                    Char.getMyChar().arrItemBox[var1.reader().readByte()] = null;
                    break;
                case -74:
                    InfoDlg.showWait(var1.reader().readUTF());
                    break;
                case -73:
                    Mob var66 = Mob.get_Mob(var1.reader().readUnsignedByte());
                    ServerEffect.addServerEffect(67, var66.x, var66.y, 1);
                    break;
                case -72:
                    Char.getMyChar().luong = var1.reader().readInt();
                    break;
                case -71:
                    var51 = var1.reader().readInt();
                    Char.getMyChar().luong += var51;
                    GameScr.startFlyText("+" + var51, Char.getMyChar().cx, Char.getMyChar().cy - Char.getMyChar().ch - 10, 0, -2, 6);
                    InfoMe.addInfo(mResources.RECEIVE + " " + var51 + " " + mResources.GOLD, 20, mFont.tahoma_7_yellow);
                    break;
                case -69:
                    var52 = var1.reader().readShort();
                    var44 = var1.reader().readByte();
                    if (var52 > 0) {
                        var64 = (short) Char.getMyChar().cx;
                        var56 = (short) (Char.getMyChar().cy - 40);
                        Char.getMyChar().mobMe = new Mob((short) -1, false, false, false, false, false, var52, 1, 0, 0, 0, var64, var56, (byte) 4, (byte) 0, var44 != 0, false);
                        Char.getMyChar().mobMe.status = 5;
                    } else {
                        Char.getMyChar().mobMe = null;
                    }
                    break;
                case -68:
                    if ((var50 = GameScr.findCharInMap(var1.reader().readInt())) == null) {
                        return;
                    }

                    var52 = var1.reader().readShort();
                    var44 = var1.reader().readByte();
                    if (var52 > 0) {
                        var56 = (short) var50.cx;
                        short var57 = (short) (var50.cy - 40);
                        var50.mobMe = new Mob((short) -1, false, false, false, false, false, var52, 1, 0, 0, 0, var56, var57, (byte) 4, (byte) 0, var44 != 0, false);
                        var50.mobMe.status = 5;
                    } else {
                        var50.mobMe = null;
                    }
                    break;
                case -65:
                    String var61 = var1.reader().readUTF();
                    byte[] var5 = new byte[var1.reader().readInt()];
                    var1.reader().read(var5);
                    if (var5.length == 0) {
                        var5 = null;
                    }

                    try {
                        var1.reader().readByte();
                    } catch (Exception var25) {
                        var25.printStackTrace();
                    }

                    if (var61.equals("KSkill")) {
                        GameScr.gI().onKSkill(var5);
                    } else if (var61.equals("OSkill")) {
                        GameScr.gI().onOSkill(var5);
                    } else if (var61.equals("CSkill")) {
                        GameScr.gI().onCSkill(var5);
                    }
                    break;
                case -64:
                    if ((var50 = GameScr.findCharInMap(var1.reader().readInt())) == null) {
                        return;
                    }

                    var50.cHP = var1.reader().readInt();
                    var50.cMaxHP = var1.reader().readInt();
                    var50.eff5BuffHp = var1.reader().readShort();
                    var50.eff5BuffMp = var1.reader().readShort();
                    var50.head = var1.reader().readShort();
                    break;
                case -63:
                    var59 = new Integer(var1.reader().readInt());
                    if ((var50 = GameScr.findCharInMap(var59.intValue())) != null) {
                        GameCanvas.startYesNoDlg(var50.cName + " " + mResources.replace(mResources.INVITECLAN, var1.reader().readUTF()), 88830, var59, 88811, (Object) null);
                    }
                    break;
                case -62:
                    var43 = var1.reader().readInt();
                    if (Char.getMyChar().charID == var43) {
                        Char.getMyChar().cClanName = var1.reader().readUTF();
                        Char.getMyChar().ctypeClan = var1.reader().readByte();
                        Char.getMyChar().callEffTask(21);
                    } else {
                        (var50 = GameScr.findCharInMap(var43)).cClanName = var1.reader().readUTF();
                        var50.ctypeClan = var1.reader().readByte();
                    }
                    break;
                case -61:
                    var59 = new Integer(var1.reader().readInt());
                    if (GameScr.isViewClanInvite && (var50 = GameScr.findCharInMap(var59.intValue())) != null) {
                        GameCanvas.startYesNoDlg(var50.cName + " " + mResources.PLEASECLAN, 88831, var59, 88811, (Object) null);
                    }
                    break;
                case -59:
                    if ((var43 = var1.reader().readInt()) == Char.getMyChar().charID) {
                        var50 = Char.getMyChar();
                    } else {
                        var50 = GameScr.findCharInMap(var43);
                    }

                    var50.cHP = var1.reader().readInt();
                    var50.cMaxHP = var1.reader().readInt();
                    break;
                case -58:
                    GameScr.gI().resetButton();
                    GameCanvas.timeBallEffect = 70;
                    GameCanvas.isBallEffect = true;
                    ServerEffect.addServerEffect(119, GameScr.gW2 + GameScr.cmx, GameScr.gH2 + GameScr.cmy, 1);
                    break;
                case -57:
                    GameCanvas.timeBallEffect = 40;
                    GameCanvas.isBallEffect = true;
                    break;
                case -56:
                    if ((var50 = GameScr.findCharInMap(var1.reader().readInt())) != null) {
                        var50.cHP = var1.reader().readInt();
                        var50.cMaxHP = var1.reader().readInt();
                        var50.coat = (short) var1.reader().readUnsignedShort();
                    }
                    break;
                case -55:
                    if ((var50 = GameScr.findCharInMap(var1.reader().readInt())) != null) {
                        var50.cHP = var1.reader().readInt();
                        var50.cMaxHP = var1.reader().readInt();
                        var50.glove = (short) var1.reader().readUnsignedShort();
                    }
                    break;
                case -54:
                    var43 = var1.reader().readInt();
                    if (Char.getMyChar().charID == var43) {
                        var50 = Char.getMyChar();
                    } else {
                        var50 = GameScr.findCharInMap(var43);
                    }

                    if (var50 != null) {
                        var50.arrItemMounts = new Item[5];
                        var50.isNewMount = var50.isWolf = var50.isMoto = var50.isMotoBehind = false;

                        for (var53 = 0; var53 < var50.arrItemMounts.length; ++var53) {
                            if ((var56 = var1.reader().readShort()) != -1) {
                                var50.arrItemMounts[var53] = new Item();
                                var50.arrItemMounts[var53].typeUI = 41;
                                var50.arrItemMounts[var53].indexUI = var53;
                                var50.arrItemMounts[var53].template = ItemTemplates.get(var56);
                                var50.arrItemMounts[var53].upgrade = var1.reader().readByte();
                                var50.arrItemMounts[var53].expires = var1.reader().readLong();
                                var50.arrItemMounts[var53].sys = var1.reader().readByte();
                                var50.arrItemMounts[var53].isLock = true;
                                if (var53 == 4) {
                                    if (var50.arrItemMounts[var53].template.id != 485 && var50.arrItemMounts[var53].template.id != 524) {
                                        if (var50.arrItemMounts[var53].template.id != 443 && var50.arrItemMounts[var53].template.id != 523) {
                                            var50.isNewMount = true;
                                            var50.GetNewMount();
                                        } else {
                                            var50.isWolf = true;
                                        }
                                    } else {
                                        var50.isMoto = true;
                                    }
                                }

                                var58 = var1.reader().readByte();
                                var50.arrItemMounts[var53].options = new MyVector();

                                for (var54 = 0; var54 < var58; ++var54) {
                                    var50.arrItemMounts[var53].options.addElement(new ItemOption(var1.reader().readUnsignedByte(), var1.reader().readInt()));
                                }
                            }
                        }
                    }
                    break;
                case 115:
                    System.out.println("UPDATE INFO ME");
                    GameScr.currentCharViewInfo = Char.getMyChar();
                    Char.getMyChar().lastNormalSkill = null;
                    Char.getMyChar().charID = var1.reader().readInt();
                    Char.getMyChar().cClanName = var1.reader().readUTF();
                    if (!Char.getMyChar().cClanName.equals("")) {
                        Char.getMyChar().ctypeClan = var1.reader().readByte();
                    }

                    Char.getMyChar().ctaskId = var1.reader().readByte();
                    Char.getMyChar().cgender = var1.reader().readByte();
                    Char.getMyChar().head = var1.reader().readShort();
                    Char.getMyChar().cspeed = var1.reader().readByte();
                    Char.getMyChar().cName = var1.reader().readUTF();
                    Char.getMyChar().cPk = var1.reader().readByte();
                    Char.getMyChar().cTypePk = var1.reader().readByte();
                    Char.getMyChar().cMaxHP = var1.reader().readInt();
                    Char.getMyChar().cHP = var1.reader().readInt();
                    Char.getMyChar().cMaxMP = var1.reader().readInt();
                    Char.getMyChar().cMP = var1.reader().readInt();
                    Char.getMyChar().cEXP = var1.reader().readLong();
                    Char.getMyChar().cExpDown = var1.reader().readLong();
                    GameScr.setLevel_Exp(Char.getMyChar().cEXP, true);
                    Char.getMyChar().eff5BuffHp = var1.reader().readShort();
                    Char.getMyChar().eff5BuffMp = var1.reader().readShort();
                    Char.getMyChar().nClass = GameScr.nClasss[var1.reader().readByte()];
                    Char.getMyChar().pPoint = var1.reader().readShort();
                    Char.getMyChar().potential[0] = var1.reader().readShort();
                    Char.getMyChar().potential[1] = var1.reader().readShort();
                    Char.getMyChar().potential[2] = var1.reader().readInt();
                    Char.getMyChar().potential[3] = var1.reader().readInt();
                    Char.getMyChar().sPoint = var1.reader().readShort();
                    Char.getMyChar().vSkill.removeAllElements();
                    Char.getMyChar().vSkillFight.removeAllElements();
                    var44 = var1.reader().readByte();

                    for (var42 = 0; var42 < var44; ++var42) {
                        skillNE = Skills.get(var1.reader().readShort());
                        if (Char.getMyChar().myskill == null) {
                            Char.getMyChar().myskill = skillNE;
                        }
                        if (Code.auto != null && Auto.advAO != null && skillNE.template.id == Auto.advAO.template.id) {
                            Auto.advAO = skillNE;
                        }
                        Char.getMyChar().vSkill.addElement(skillNE);
                        if ((skillNE.template.type == 1 || skillNE.template.type == 4 || skillNE.template.type == 2 || skillNE.template.type == 3) && (skillNE.template.maxPoint == 0 || skillNE.template.maxPoint > 0 && skillNE.point > 0)) {
                            var10000 = skillNE.template.id;
                            Char.getMyChar();
                            if (var10000 == 0) {
                                Char.getMyChar();
                                Service.gI().selectSkill(0);
                            }

                            Char.getMyChar().vSkillFight.addElement(skillNE);
                        }
                    }

                    GameScr.gI().sortSkill();
                    Char.getMyChar().xu = var1.reader().readInt();
                    Char.getMyChar().yen = var1.reader().readInt();
                    Char.getMyChar().luong = var1.reader().readInt();
                    Char.getMyChar().arrItemBag = new Item[var1.reader().readUnsignedByte()];
                    GameScr.mpPotion = 0;
                    GameScr.hpPotion = 0;

                    for (var43 = 0; var43 < Char.getMyChar().arrItemBag.length; ++var43) {
                        if ((var45 = var1.reader().readShort()) != -1) {
                            Char.getMyChar().arrItemBag[var43] = new Item();
                            Char.getMyChar().arrItemBag[var43].typeUI = 3;
                            Char.getMyChar().arrItemBag[var43].indexUI = var43;
                            Char.getMyChar().arrItemBag[var43].template = ItemTemplates.get(var45);
                            Char.getMyChar().arrItemBag[var43].isLock = var1.reader().readBoolean();
                            if (Char.getMyChar().arrItemBag[var43].isTypeBody() || Char.getMyChar().arrItemBag[var43].isTypeMounts() || Char.getMyChar().arrItemBag[var43].isTypeNgocKham()) {
                                Char.getMyChar().arrItemBag[var43].upgrade = var1.reader().readByte();
                            }

                            Char.getMyChar().arrItemBag[var43].isExpires = var1.reader().readBoolean();
                            Char.getMyChar().arrItemBag[var43].quantity = var1.reader().readUnsignedShort();
                            if (Char.getMyChar().arrItemBag[var43].template.type == 16) {
                                GameScr.hpPotion += Char.getMyChar().arrItemBag[var43].quantity;
                            }

                            if (Char.getMyChar().arrItemBag[var43].template.type == 17) {
                                GameScr.mpPotion += Char.getMyChar().arrItemBag[var43].quantity;
                            }

                            if (Char.getMyChar().arrItemBag[var43].template.id == 340) {
                                var74 = GameScr.gI();
                                var74.numSprinLeft += Char.getMyChar().arrItemBag[var43].quantity;
                            }
                        }
                    }
                    Code.advAJ();
                    Code.tinhluyen();
                    Char.getMyChar().arrItemBody = new Item[32];

                    try {
                        Char.getMyChar().setDefaultPart();

                        for (var43 = 0; var43 < 16; ++var43) {
                            if ((var45 = var1.reader().readShort()) != -1) {
                                ItemTemplate var48;
                                var4 = (var48 = ItemTemplates.get(var45)).type;
                                Char.getMyChar().arrItemBody[var4] = new Item();
                                Char.getMyChar().arrItemBody[var4].indexUI = var4;
                                Char.getMyChar().arrItemBody[var4].typeUI = 5;
                                Char.getMyChar().arrItemBody[var4].template = var48;
                                Char.getMyChar().arrItemBody[var4].isLock = true;
                                Char.getMyChar().arrItemBody[var4].upgrade = var1.reader().readByte();
                                Char.getMyChar().arrItemBody[var4].sys = var1.reader().readByte();
                                if (var4 == 1) {
                                    Char.getMyChar().wp = Char.getMyChar().arrItemBody[var4].template.part;
                                } else if (var4 == 2) {
                                    Char.getMyChar().body = Char.getMyChar().arrItemBody[var4].template.part;
                                } else if (var4 == 6) {
                                    Char.getMyChar().leg = Char.getMyChar().arrItemBody[var4].template.part;
                                }
                            }
                        }
                    } catch (Exception var33) {
                        var33.printStackTrace();
                    }

                    Char.getMyChar().isHuman = var1.reader().readBoolean();
                    Char.getMyChar().isNhanban = var1.reader().readBoolean();
                    if ((var46 = new short[]{var1.reader().readShort(), var1.reader().readShort(), var1.reader().readShort(), var1.reader().readShort()})[0] > -1) {
                        Char.getMyChar().head = var46[0];
                    }

                    if (var46[1] > -1) {
                        Char.getMyChar().wp = var46[1];
                    }

                    if (var46[2] > -1) {
                        Char.getMyChar().body = var46[2];
                    }

                    if (var46[3] > -1) {
                        Char.getMyChar().leg = var46[3];
                    }

                    short[] var49 = new short[10];

                    try {
                        for (var51 = 0; var51 < 10; ++var51) {
                            var49[var51] = var1.reader().readShort();
                        }
                    } catch (Exception var32) {
                        var49 = null;
                    }

                    if (var49 != null) {
                        Char.getMyChar().setThoiTrang(var49);
                    }

                    GameScr.gI().sortSkill();
                    if (Char.getMyChar().isHuman) {
                        GameScr.gI().loadSkillShortcut();
                    } else if (Char.getMyChar().isNhanban) {
                        GameScr.gI().loadSkillShortcutNhanban();
                    }

                    Char.getMyChar().statusMe = 4;
                    GameScr.isViewClanInvite = RMS.loadRMSInt(Char.getMyChar().cName + "vci") >= 1;
                    Service.gI().loadRMS("KSkill");
                    Service.gI().loadRMS("OSkill");
                    Service.gI().loadRMS("CSkill");

                    try {
                        for (var51 = 0; var51 < 16; ++var51) {
                            if ((var52 = var1.reader().readShort()) != -1) {
                                var53 = (var47 = ItemTemplates.get(var52)).type + 16;
                                Char.getMyChar().arrItemBody[var53] = new Item();
                                Char.getMyChar().arrItemBody[var53].indexUI = var53;
                                Char.getMyChar().arrItemBody[var53].typeUI = 5;
                                Char.getMyChar().arrItemBody[var53].template = var47;
                                Char.getMyChar().arrItemBody[var53].isLock = true;
                                Char.getMyChar().arrItemBody[var53].upgrade = var1.reader().readByte();
                                Char.getMyChar().arrItemBody[var53].sys = var1.reader().readByte();
                                if (var53 == 1) {
                                    Char.getMyChar().wp = Char.getMyChar().arrItemBody[var53].template.part;
                                } else if (var53 == 2) {
                                    Char.getMyChar().body = Char.getMyChar().arrItemBody[var53].template.part;
                                } else if (var53 == 6) {
                                    Char.getMyChar().leg = Char.getMyChar().arrItemBody[var53].template.part;
                                }
                            }
                        }
                    } catch (Exception var31) {
                        var31.printStackTrace();
                    }

                    boolean var55 = false;

                    try {
                        var56 = var1.reader().readShort();
                    } catch (Exception var27) {
                        var56 = -1;
                    }

                    Char.getMyChar().ID_SUSANO = var56;
            }
        } catch (Exception var40) {
        } finally {
            if (var1 != null) {
                var1.cleanup();
            }

        }

    }

    private static boolean readCharInfo(Char var0, Message var1) {
        try {
            var0.cClanName = var1.reader().readUTF();
            if (!var0.cClanName.equals("")) {
                var0.ctypeClan = var1.reader().readByte();
            }

            var0.isInvisible = var1.reader().readBoolean();
            var0.cTypePk = var1.reader().readByte();
            var0.nClass = GameScr.nClasss[var1.reader().readByte()];
            var0.cgender = var1.reader().readByte();
            var0.head = var1.reader().readShort();
            var0.cName = var1.reader().readUTF();
            var0.cHP = var1.reader().readInt();
            var0.cMaxHP = var1.reader().readInt();
            var0.clevel = var1.reader().readUnsignedByte();
            var0.wp = var1.reader().readShort();
            var0.body = var1.reader().readShort();
            var0.leg = var1.reader().readShort();
            byte var2 = var1.reader().readByte();
            if (var0.wp == -1) {
                var0.setDefaultWeapon();
            }

            if (var0.body == -1) {
                var0.setDefaultBody();
            }

            if (var0.leg == -1) {
                var0.setDefaultLeg();
            }

            short var3;
            if (var2 == -1) {
                var0.mobMe = null;
            } else {
                var3 = (short) var0.cx;
                short var4 = (short) (var0.cy - 40);
                var0.mobMe = new Mob((short) -1, false, false, false, false, false, var2, 1, 0, 0, 0, var3, var4, (byte) 4, (byte) 0, false, false);
                var0.mobMe.status = 5;
            }

            var0.cx = var0.cxMoveLast = var1.reader().readShort();
            var0.cy = var0.cyMoveLast = var1.reader().readShort();
            var0.eff5BuffHp = var1.reader().readShort();
            var0.eff5BuffMp = var1.reader().readShort();
            byte var13 = var1.reader().readByte();

            int var16;
            for (var16 = 0; var16 < var13; ++var16) {
                Effect var10 = new Effect(var1.reader().readByte(), var1.reader().readInt(), var1.reader().readInt(), var1.reader().readShort());
                var0.vEff.addElement(var10);
                if (var10.template.type == 12 || var10.template.type == 11) {
                    var0.isInvisible = true;
                }
            }

            if (!var0.isInvisible) {
                ServerEffect.addServerEffect(60, var0, 1);
            }

            if (var0.cHP == 0) {
                var0.statusMe = 14;
                if (Char.getMyChar().charID == var0.charID) {
                    GameScr.gI().resetButton();
                }
            }

            if (var0.charID == -Char.getMyChar().charID) {
                for (var16 = 0; var16 < GameScr.vNpc.size(); ++var16) {
                    Npc var11;
                    if ((var11 = (Npc) GameScr.vNpc.elementAt(var16)).template.name.equals(var0.cName)) {
                        var11.statusMe = 15;
                        var11.chatPopup = null;
                        break;
                    }
                }
            }

            var0.isHuman = var1.reader().readBoolean();
            var0.isNhanban = var1.reader().readBoolean();
            if (var0.isNhanbanz()) {
                ServerEffect.addServerEffect(141, var0.cx, var0.cy, 0);
            }

            short[] var18;
            if ((var18 = new short[]{var1.reader().readShort(), var1.reader().readShort(), var1.reader().readShort(), var1.reader().readShort()})[0] > -1) {
                var0.head = var18[0];
            }

            if (var18[1] > -1) {
                var0.wp = var18[1];
            }

            if (var18[2] > -1) {
                var0.body = var18[2];
            }

            if (var18[3] > -1) {
                var0.leg = var18[3];
            }

            short[] var12 = new short[10];

            try {
                for (int var15 = 0; var15 < 10; ++var15) {
                    var12[var15] = var1.reader().readShort();
                }
            } catch (Exception var6) {
            }

            var0.setThoiTrang(var12);
            boolean var17 = false;

            try {
                var3 = var1.reader().readShort();
            } catch (Exception var5) {
                var3 = -1;
            }

            var0.ID_SUSANO = var3;
            Char var14 = var0;

            for (int var8 = 0; var8 < GameScr.vParty.size(); ++var8) {
                Party var9;
                if ((var9 = (Party) GameScr.vParty.elementAt(var8)).charId == var14.charID) {
                    var9.c = var14;
                    break;
                }
            }

            return true;
        } catch (Exception var7) {
            return false;
        }
    }

    private static void requestItemInfo(Message var0) {
        try {
            byte var1;
            Item var3;
            var1 = var0.reader().readByte();
            int var2 = var0.reader().readUnsignedByte();
            var3 = null;
            label186:
            switch (var1) {
                case 2:
                    var3 = GameScr.arrItemWeapon[var2];
                    break;
                case 3:
                    if ((var3 = Char.getMyChar().arrItemBag[var2]) != null) {
                        break;
                    }

                    if (GameScr.itemSplit != null && GameScr.itemSplit.indexUI == var2) {
                        var3 = GameScr.itemSplit;
                    }

                    if (GameScr.itemUpGrade != null && GameScr.itemUpGrade.indexUI == var2) {
                        var3 = GameScr.itemUpGrade;
                    }

                    if (GameScr.itemSell != null && GameScr.itemSell.indexUI == var2) {
                        var3 = GameScr.itemSell;
                    }

                    int var4;
                    if (var3 == null && GameScr.arrItemUpGrade != null) {
                        for (var4 = 0; var4 < GameScr.arrItemUpGrade.length; ++var4) {
                            if (GameScr.arrItemUpGrade[var4] != null && GameScr.arrItemUpGrade[var4].indexUI == var2) {
                                var3 = GameScr.arrItemUpGrade[var4];
                                break;
                            }
                        }
                    }

                    if (var3 == null && GameScr.arrItemConvert != null) {
                        for (var4 = 0; var4 < GameScr.arrItemConvert.length; ++var4) {
                            if (GameScr.arrItemConvert[var4] != null && GameScr.arrItemConvert[var4].indexUI == var2) {
                                var3 = GameScr.arrItemConvert[var4];
                                break;
                            }
                        }
                    }

                    if (var3 == null && GameScr.arrItemUpPeal != null) {
                        for (var4 = 0; var4 < GameScr.arrItemUpPeal.length; ++var4) {
                            if (GameScr.arrItemUpPeal[var4] != null && GameScr.arrItemUpPeal[var4].indexUI == var2) {
                                var3 = GameScr.arrItemUpPeal[var4];
                                break;
                            }
                        }
                    }

                    if (var3 == null && GameScr.arrItemTradeMe != null) {
                        for (var4 = 0; var4 < GameScr.arrItemTradeMe.length; ++var4) {
                            if (GameScr.arrItemTradeMe[var4] != null && GameScr.arrItemTradeMe[var4].indexUI == var2) {
                                var3 = GameScr.arrItemTradeMe[var4];
                                break;
                            }
                        }
                    }

                    if (var3 != null || GameScr.arrItemSplit == null) {
                        break;
                    }

                    var4 = 0;

                    while (true) {
                        if (var4 >= GameScr.arrItemSplit.length) {
                            break label186;
                        }

                        if (GameScr.arrItemSplit[var4] != null && GameScr.arrItemSplit[var4].indexUI == var2) {
                            var3 = GameScr.arrItemSplit[var4];
                            break label186;
                        }

                        ++var4;
                    }
                case 4:
                    var3 = Char.getMyChar().arrItemBox[var2];
                    break;
                case 5:
                    var3 = Char.getMyChar().arrItemBody[var2];
                    break;
                case 6:
                    var3 = GameScr.arrItemStack[var2];
                    break;
                case 7:
                    var3 = GameScr.arrItemStackLock[var2];
                    break;
                case 8:
                    var3 = GameScr.arrItemGrocery[var2];
                    break;
                case 9:
                    var3 = GameScr.arrItemGroceryLock[var2];
                case 10:
                case 11:
                case 12:
                case 13:
                case 31:
                case 33:
                case 36:
                case 37:
                case 38:
                default:
                    break;
                case 14:
                    var3 = GameScr.arrItemStore[var2];
                    break;
                case 15:
                    var3 = GameScr.arrItemBook[var2];
                    break;
                case 16:
                    var3 = GameScr.arrItemLien[var2];
                    break;
                case 17:
                    var3 = GameScr.arrItemNhan[var2];
                    break;
                case 18:
                    var3 = GameScr.arrItemNgocBoi[var2];
                    break;
                case 19:
                    var3 = GameScr.arrItemPhu[var2];
                    break;
                case 20:
                    var3 = GameScr.arrItemNonNam[var2];
                    break;
                case 21:
                    var3 = GameScr.arrItemNonNu[var2];
                    break;
                case 22:
                    var3 = GameScr.arrItemAoNam[var2];
                    break;
                case 23:
                    var3 = GameScr.arrItemAoNu[var2];
                    break;
                case 24:
                    var3 = GameScr.arrItemGangTayNam[var2];
                    break;
                case 25:
                    var3 = GameScr.arrItemGangTayNu[var2];
                    break;
                case 26:
                    var3 = GameScr.arrItemQuanNam[var2];
                    break;
                case 27:
                    var3 = GameScr.arrItemQuanNu[var2];
                    break;
                case 28:
                    var3 = GameScr.arrItemGiayNam[var2];
                    break;
                case 29:
                    var3 = GameScr.arrItemGiayNu[var2];
                    break;
                case 30:
                    var3 = GameScr.arrItemTradeOrder[var2];
                    break;
                case 32:
                    var3 = GameScr.arrItemFashion[var2];
                    break;
                case 34:
                    var3 = GameScr.arrItemClanShop[var2];
                    break;
                case 35:
                    var3 = GameScr.arrItemElites[var2];
                    break;
                case 39:
                    var3 = Char.clan.items[GameScr.indexSelect];
            }

            var3.expires = var0.reader().readLong();
            if (var3.isTypeUIMe()) {
                var3.saleCoinLock = var0.reader().readInt();
            } else if (var3.isTypeUIShop() || var3.isTypeUIShopLock() || var3.isTypeUIStore() || var3.isTypeUIBook() || var3.isTypeUIFashion() || var3.isTypeUIClanShop()) {
                var3.buyCoin = var0.reader().readInt();
                var3.buyCoinLock = var0.reader().readInt();
                var3.buyGold = var0.reader().readInt();
            }

            if (!var3.isTypeBody() && !var3.isTypeMounts() && !var3.isTypeNgocKham()) {
                if (var3.template.id == 233) {
                    var3.img = createImage(NinjaUtil.readByteArray(var0));
                } else if (var3.template.id == 234) {
                    var3.img = createImage(NinjaUtil.readByteArray(var0));
                } else if (var3.template.id == 235) {
                    var3.img = createImage(NinjaUtil.readByteArray(var0));
                }
            } else {
                var3.sys = var0.reader().readByte();
                var3.options = new MyVector();

                try {
                    while (true) {
                        var3.options.addElement(new ItemOption(var0.reader().readUnsignedByte(), var0.reader().readInt()));
                    }
                } catch (Exception var5) {
                }
            }
            var3.advAS = true;

            if (var1 == 5) {
                Char.getMyChar().updateKickOption();
                return;
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            System.out.println("Controller.requestItemInfo()");
        }
        LockGame.advAT();

    }

    private static void addMob(Message message) {
        try {
            for (byte byte1 = message.reader().readByte(), b = 0; b < byte1; ++b) {
                GameScr.advAA(new Mob((short) message.reader().readUnsignedByte(), message.reader().readBoolean(), message.reader().readBoolean(), message.reader().readBoolean(), message.reader().readBoolean(), message.reader().readBoolean(), message.reader().readUnsignedByte(), message.reader().readByte(), message.reader().readInt(), message.reader().readUnsignedByte(), message.reader().readInt(), message.reader().readShort(), message.reader().readShort(), message.reader().readByte(), message.reader().readByte(), message.reader().readBoolean(), true), b);
            }

        } catch (Exception var19) {
            var19.printStackTrace();
            System.out.println("err addMob");
        }
    }

    private static void addEffAuto(Message var0) {
        try {
            short var1 = (short) var0.reader().readUnsignedByte();
            short var2 = var0.reader().readShort();
            short var3 = var0.reader().readShort();
            byte var4 = var0.reader().readByte();
            short var6 = var0.reader().readShort();
            EffectAuto.addEffectAuto(var1, var2, var3, var4, var6, 1);
        } catch (Exception var5) {
            var5.printStackTrace();
            System.out.println("err add effAuto");
        }
    }

    private static void getDataEffAuto(Message var0) {
        try {
            short var1 = (short) var0.reader().readUnsignedByte();
            short var2 = var0.reader().readShort();
            byte[] var3 = null;
            if (var2 > 0) {
                var3 = new byte[var2];
                var0.reader().read(var3);
            }

            EffectAuto.reciveData(var1, var3);
        } catch (Exception var4) {
            var4.printStackTrace();
            System.out.println("err add effAuto");
        }
    }

    private static void getImgEffAuto(Message var0) {
        try {
            short var1 = (short) var0.reader().readUnsignedByte();
            byte[] var3 = NinjaUtil.readByteArray_Int(var0);
            EffectAuto.reciveImage(var1, var3);
        } catch (Exception var2) {
            var2.printStackTrace();
            System.out.println("err getImgEffAuto");
        }
    }

    private static void khamngoc(Message var0) {
        try {
            byte var1 = var0.reader().readByte();
            Char.getMyChar().luong = var0.reader().readInt();
            Char.getMyChar().xu = var0.reader().readInt();
            Char.getMyChar().yen = var0.reader().readInt();
            int var3;
            if (var1 == 0) {
                if (GameScr.itemSplit != null) {
                    GameScr.itemSplit = null;
                }

                if (GameScr.arrItemSplit != null) {
                    for (var3 = 0; var3 < GameScr.arrItemSplit.length; ++var3) {
                        GameScr.arrItemSplit[var3] = null;
                    }
                }
            } else if (var1 == 1) {
                if (GameScr.itemSplit != null) {
                    GameScr.itemSplit.isLock = true;
                    GameScr.itemSplit.upgrade = var0.reader().readByte();
                    GameScr.effUpok = GameScr.efs[53];
                    GameScr.indexEff = 0;
                }

                if (GameScr.arrItemSplit != null) {
                    for (var3 = 0; var3 < GameScr.arrItemSplit.length; ++var3) {
                        GameScr.arrItemSplit[var3] = null;
                    }
                }
            } else if ((var1 == 2 || var1 == 3) && GameScr.arrItemSplit != null) {
                for (var3 = 0; var3 < GameScr.arrItemSplit.length; ++var3) {
                    GameScr.arrItemSplit[var3] = null;
                }
            }

            GameScr.gI().left = GameScr.gI().center = null;
            GameScr.gI().updateKeyBuyItemUI();
            GameCanvas.endDlg();
        } catch (Exception var2) {
            var2.printStackTrace();
            System.out.println("err getImgEffAuto");
        }
    }

    private static void addEffect(Message var0) {
        try {
            Object var1;
            int var2;
            if (var0.reader().readByte() == 1) {
                var1 = Mob.get_Mob(var0.reader().readUnsignedByte());
            } else if ((var2 = var0.reader().readInt()) == Char.getMyChar().charID) {
                var1 = Char.getMyChar();
            } else {
                var1 = GameScr.findCharInMap(var2);
            }

            if (var1 == null) {
                return;
            }

            short var15 = var0.reader().readShort();
            int var3 = var0.reader().readInt();
            byte var4 = var0.reader().readByte();
            boolean var13 = var0.reader().readByte() != 0;
            long var10002 = (long) var3;
            var2 = var4 * 1000;
            long var10 = var10002;
            short var16 = var15;
            Object var14 = var1;
            int var18 = 0;

            while (true) {
                if (var18 >= ((MainObject) var14).vecEFfect.size()) {
                    DataSkillEff var19 = new DataSkillEff(var16, var10, var2, var13);
                    ((MainObject) var14).vecEFfect.addElement(var19);
                    return;
                }

                DataSkillEff var5;
                if ((var5 = (DataSkillEff) ((MainObject) var14).vecEFfect.elementAt(var18)) != null && var5.idEff == var16) {
                    var5.timelive = var10 + System.currentTimeMillis();
                    var5.miliSecondWait = var2;
                    var5.setTypeEff(var10);
                    break;
                }

                ++var18;
            }
        } catch (Exception var12) {
            var12.printStackTrace();
        }

    }

    private static void getImgEffect(Message var0) {
        try {
            short var1 = (short) var0.reader().readUnsignedByte();
            byte[] var4 = NinjaUtil.readByteArray_Int(var0);
            GameData.setImgIcon(var1, var4);
            ImageIcon var2;
            if ((var2 = (ImageIcon) GameData.listImgIcon.get("" + var1)) == null) {
                var2 = new ImageIcon();
                GameData.listImgIcon.put(String.valueOf(var1), var2);
            }

            var2.img = createImage(var4);
            if (GameMidlet.CLIENT_TYPE != 1) {
                RMS.saveRMSImage("ImgEffect " + var1, var4);
                return;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            System.out.println("err getImgEffect");
        }

    }

    private static void getDataEffect(Message var0) {
        try {
            short var1 = (short) var0.reader().readUnsignedByte();
            short var2 = var0.reader().readShort();
            byte[] var3 = null;
            if (var2 > 0) {
                var3 = new byte[var2];
                var0.reader().read(var3);
            }

            EffectData var5;
            if ((var5 = (EffectData) GameData.listbyteData.get("" + var1)) != null) {
                if (var3 != null) {
                    var5.data = var3;
                }

                return;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            System.out.println("err getDataEffect ");
        }

    }

    private static void readDataMobOld(Message var0, int var1) {
        try {
            Mob.arrMobTemplate[var1].imginfo = new ImageInfo[var0.reader().readByte()];

            int var2;
            for (var2 = 0; var2 < Mob.arrMobTemplate[var1].imginfo.length; ++var2) {
                Mob.arrMobTemplate[var1].imginfo[var2] = new ImageInfo();
                var0.reader().readByte();
                Mob.arrMobTemplate[var1].imginfo[var2].x0 = var0.reader().readUnsignedByte();
                Mob.arrMobTemplate[var1].imginfo[var2].y0 = var0.reader().readUnsignedByte();
                Mob.arrMobTemplate[var1].imginfo[var2].w = var0.reader().readUnsignedByte();
                Mob.arrMobTemplate[var1].imginfo[var2].h = var0.reader().readUnsignedByte();
            }

            Mob.arrMobTemplate[var1].frameBoss = new Frame[var0.reader().readShort()];

            for (var2 = 0; var2 < Mob.arrMobTemplate[var1].frameBoss.length; ++var2) {
                Mob.arrMobTemplate[var1].frameBoss[var2] = new Frame();
                byte var3 = var0.reader().readByte();
                Mob.arrMobTemplate[var1].frameBoss[var2].dx = new short[var3];
                Mob.arrMobTemplate[var1].frameBoss[var2].dy = new short[var3];
                Mob.arrMobTemplate[var1].frameBoss[var2].idImg = new byte[var3];

                for (int var4 = 0; var4 < var3; ++var4) {
                    Mob.arrMobTemplate[var1].frameBoss[var2].dx[var4] = var0.reader().readShort();
                    Mob.arrMobTemplate[var1].frameBoss[var2].dy[var4] = var0.reader().readShort();
                    Mob.arrMobTemplate[var1].frameBoss[var2].idImg[var4] = var0.reader().readByte();
                }
            }

            short var6 = var0.reader().readShort();

            for (int var7 = 0; var7 < var6; ++var7) {
                var0.reader().readShort();
            }

        } catch (Exception var5) {
        }
    }

    private static void readDataMobNew(Message var0, int var1) {
        try {
            boolean var2 = false;
            Mob.arrMobTemplate[var1].imginfo = new ImageInfo[var0.reader().readByte()];

            int var7;
            for (var7 = 0; var7 < Mob.arrMobTemplate[var1].imginfo.length; ++var7) {
                Mob.arrMobTemplate[var1].imginfo[var7] = new ImageInfo();
                var0.reader().readByte();
                Mob.arrMobTemplate[var1].imginfo[var7].x0 = var0.reader().readUnsignedByte();
                Mob.arrMobTemplate[var1].imginfo[var7].y0 = var0.reader().readUnsignedByte();
                Mob.arrMobTemplate[var1].imginfo[var7].w = var0.reader().readUnsignedByte();
                Mob.arrMobTemplate[var1].imginfo[var7].h = var0.reader().readUnsignedByte();
            }

            Mob.arrMobTemplate[var1].frameBoss = new Frame[var0.reader().readShort()];

            int var4;
            for (var7 = 0; var7 < Mob.arrMobTemplate[var1].frameBoss.length; ++var7) {
                Mob.arrMobTemplate[var1].frameBoss[var7] = new Frame();
                byte var3 = var0.reader().readByte();
                Mob.arrMobTemplate[var1].frameBoss[var7].dx = new short[var3];
                Mob.arrMobTemplate[var1].frameBoss[var7].dy = new short[var3];
                Mob.arrMobTemplate[var1].frameBoss[var7].idImg = new byte[var3];
                Mob.arrMobTemplate[var1].frameBoss[var7].flip = new byte[var3];
                Mob.arrMobTemplate[var1].frameBoss[var7].onTop = new byte[var3];

                for (var4 = 0; var4 < var3; ++var4) {
                    Mob.arrMobTemplate[var1].frameBoss[var7].dx[var4] = var0.reader().readShort();
                    Mob.arrMobTemplate[var1].frameBoss[var7].dy[var4] = var0.reader().readShort();
                    Mob.arrMobTemplate[var1].frameBoss[var7].idImg[var4] = var0.reader().readByte();
                    Mob.arrMobTemplate[var1].frameBoss[var7].flip[var4] = var0.reader().readByte();
                    Mob.arrMobTemplate[var1].frameBoss[var7].onTop[var4] = var0.reader().readByte();
                }
            }

            short var9 = (short) var0.reader().readUnsignedByte();
            Mob.arrMobTemplate[var1].sequence = new byte[var9];

            int var8;
            for (var8 = 0; var8 < var9; ++var8) {
                Mob.arrMobTemplate[var1].sequence[var8] = (byte) var0.reader().readShort();
            }

            var0.reader().readByte();

            for (var8 = 0; var8 < 4; ++var8) {
                if (var8 != 2) {
                    byte var10 = var0.reader().readByte();
                    Mob.arrMobTemplate[var1].frameChar[var8] = new byte[var10];

                    for (var4 = 0; var4 < var10; ++var4) {
                        Mob.arrMobTemplate[var1].frameChar[var8][var4] = var0.reader().readByte();
                    }
                }
            }

            try {
                Mob.arrMobTemplate[var1].indexSplash[0] = (byte) (Mob.arrMobTemplate[var1].frameChar[0].length - 7);
                Mob.arrMobTemplate[var1].indexSplash[1] = (byte) (Mob.arrMobTemplate[var1].frameChar[1].length - 7);
                Mob.arrMobTemplate[var1].indexSplash[2] = (byte) (Mob.arrMobTemplate[var1].frameChar[3].length - 7);
                Mob.arrMobTemplate[var1].indexSplash[3] = (byte) (Mob.arrMobTemplate[var1].frameChar[3].length - 7);
            } catch (Exception var5) {
                (new StringBuffer("loi read data mod ")).append(var5.toString()).toString();
            }

            for (var8 = 0; var8 < 3; ++var8) {
                Mob.arrMobTemplate[var1].indexSplash[var8] = var0.reader().readByte();
            }

            Mob.arrMobTemplate[var1].indexSplash[3] = Mob.arrMobTemplate[var1].indexSplash[2];
        } catch (Exception var6) {
            (new StringBuffer("loi ham read data new mob ")).append(var1).append(" ").append(var6.toString()).toString();
        }
    }
}
