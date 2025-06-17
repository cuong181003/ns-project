
public final class SelectServerScr extends mScreen implements IActionListener {

    private int popupW;
    private int popupH;
    private int popupX;
    private int popupY;
    private int indexRow = -1;
    private static String[] menu;
    public static String uname;
    public static String pass;
    public static String unameChange = "";
    public static String passChange = "";
    private static Command cmdChoiMoi = null;
    private static Command cmdDoiTaiKhoan = null;
    private static Command cmdChoiTiep = null;
    private static Command cmdChonServer = null;
    private static Command cmdUpdLinkSv = null;
    private static Command[][] cmd = null;
    private static int ipSelect;
    public boolean advAE = false;
    public long advAF = 0L;
    private long advAZ = -1L;

    public static void loadIP() {
        GameCanvas.menu.menuSelectedItem = UpdateServer.serverST[0];
        GameMidlet.IP = UpdateServer.listIP[GameCanvas.menu.menuSelectedItem];
        int var1 = RMS.loadRMSInt("indServer");

        for (int var2 = 0; var2 < UpdateServer.serverST.length; ++var2) {
            if (var1 == UpdateServer.serverST[var2]) {
                GameCanvas.menu.menuSelectedItem = UpdateServer.serverST[var2];
                GameMidlet.IP = UpdateServer.listIP[var2];
                return;
            }
        }
    }

    public SelectServerScr() {
        if (CuongScr.advAA != -1) {
            StaticObj.SKYCOLOR = new int[17];
        }
        loadIP();
    }

    public final void switchToMe() {
        if (RMS.loadRMSInt("isKiemduyet") == 0) {
            GameCanvas.isKiemduyet = true;
        } else {
            GameCanvas.isKiemduyet = false;
        }

        GameScr.gH = GameCanvas.h;
        if (GameCanvas.typeBg == 2) {
            GameCanvas.loadBG(0);
        } else {
            GameCanvas.loadBG(TileMap.bgID);
        }

        super.switchToMe();
        if (GameScr.instance != null) {
            GameScr.instance = null;
        }

        if ((TileMap.bgID = (byte) ((int) (System.currentTimeMillis() % 9L))) == 5 || TileMap.bgID == 6) {
            TileMap.bgID = 4;
        }

        GameScr.loadCamera(true);
        GameScr.cmx = 100;
        this.popupW = 170;
        this.popupH = 175;
        if (GameCanvas.w == 128 || GameCanvas.h <= 208) {
            this.popupW = 126;
            this.popupH = 160;
        }

        this.popupX = GameCanvas.w / 2 - this.popupW / 2;
        this.popupY = GameCanvas.h / 2 - this.popupH / 2;
        if (GameCanvas.h <= 250) {
            this.popupY -= 10;
        }

        super.right = new Command(mResources.EXIT, GameCanvas.instance, 8885, (Object) null);
        super.left = new Command(mResources.LANGUAGE, GameCanvas.instance, 8886, (Object) null);
        this.indexRow = -1;
        if (!GameCanvas.isTouch) {
            this.indexRow = 0;
        }

        if (GameCanvas.isTouch && GameCanvas.w >= 320) {
            super.right.x = GameCanvas.w / 2 + 88;
        }

        if (cmdChoiMoi == null) {
            cmdChoiMoi = new Command(GameCanvas.isTouch ? "" : mResources.OK, this, 1000, (Object) null);
            cmdDoiTaiKhoan = new Command(GameCanvas.isTouch ? "" : mResources.OK, this, 1001, (Object) null);
            cmdChonServer = new Command(GameCanvas.isTouch ? "" : mResources.OK, this, 1002, (Object) null);
            cmdChoiTiep = new Command(GameCanvas.isTouch ? "" : mResources.OK, this, 1003, (Object) null);
            cmdUpdLinkSv = new Command(GameCanvas.isTouch ? "" : mResources.OK, this, 20100, (Object) null);
            cmd = new Command[][]{{cmdChoiMoi, cmdDoiTaiKhoan, cmdChonServer, cmdUpdLinkSv}, {cmdChoiTiep, cmdChoiMoi, cmdDoiTaiKhoan, cmdChonServer, cmdUpdLinkSv}};
        }

        if ((uname == null || uname.equals("")) && unameChange.equals("")) {
            menu = new String[]{mResources.NEW_PLAY, mResources.CHANGE_ACC, mResources.SERVER, mResources.UPDATE_LINKSV};
        } else {
            menu = new String[]{mResources.COUNTINUE_PLAY, mResources.NEW_PLAY, mResources.CHANGE_ACC, mResources.SERVER, mResources.UPDATE_LINKSV};
        }

        loadIP();

        if (RMS.loadRMSString("random") == null) {
            RMS.saveRMSString("random", randomNumberlist());
        }

    }

    static {
        uname = RMS.loadRMSString("acc");
        pass = RMS.loadRMSString("pass");
        if (uname == null) {
            uname = "";
        }

        if (pass == null) {
            pass = "";
        }
    }

    public final void paint(mGraphics var1) {
        var1.setColor(0);
        var1.fillRect(0, 0, GameCanvas.w, GameCanvas.h);
        GameCanvas.paintBGGameScr(var1);
        var1.drawImage(LoginScr.imgTitle, GameCanvas.hw - LoginScr.imgTitle.getWidth() / 2, this.popupY + 10 - LoginScr.imgTitle.getHeight() / 2, 0);
        if (GameCanvas.menu.menuSelectedItem == -1) {
            GameCanvas.menu.menuSelectedItem = 0;
        }

        int var2 = this.popupY + 50;

        for (int var3 = 0; var3 < menu.length; ++var3) {
            var1.setColor(Paint.COLORDARK);
            var1.fillRect(this.popupX + 10, var2 + var3 * 35, this.popupW - 20, 28);
            Paint.paintFrameBorder(this.popupX + 10, var2 + var3 * 35, this.popupW - 20, 28, var1);
            if (var3 == this.indexRow) {
                var1.setColor(Paint.COLORLIGHT);
                var1.fillRect(this.popupX + 10, var2 + var3 * 35, this.popupW - 20, 28);
                Paint.paintFrameBorder(this.popupX + 10, var2 + var3 * 35, this.popupW - 20, 28, var1);
            }

            if (var3 < menu.length) {
                String var4;
                if (uname.equals("") && unameChange.equals("")) {
                    if (var3 == 2) {
                        var4 = UpdateServer.listName[GameCanvas.menu.menuSelectedItem];
                        mFont.tahoma_7b_white.drawString(var1, menu[var3] + var4, this.popupX + this.popupW / 2, var2 + var3 * 35 + 8, 2);
                    } else {
                        mFont.tahoma_7b_white.drawString(var1, menu[var3], this.popupX + this.popupW / 2, var2 + var3 * 35 + 8, 2);
                    }
                } else if (var3 == 0) {
                    mFont.tahoma_7b_white.drawString(var1, menu[var3] + (!unameChange.equals("") ? ": " + unameChange : (uname.startsWith("tmpusr") ? "" : ": " + uname)), this.popupX + this.popupW / 2, var2 + var3 * 35 + 8, 2);
                } else if (var3 == 3) {
                    var4 = UpdateServer.listName[GameCanvas.menu.menuSelectedItem];
                    mFont.tahoma_7b_white.drawString(var1, menu[var3] + var4, this.popupX + this.popupW / 2, var2 + var3 * 35 + 8, 2);
                } else {
                    mFont.tahoma_7b_white.drawString(var1, menu[var3], this.popupX + this.popupW / 2, var2 + var3 * 35 + 8, 2);
                }
            }
        }
        if (this.advAZ > 0L) {
            mFont.tahoma_7_yellow.drawString(var1, "Đăng nhập lại sau: " + this.advAZ + "s", 5, 5, 0, mFont.tahoma_7_grey);
        }
        if (GameCanvas.currentDialog == null) {
            Paint.paintCmdBar(var1, super.left, super.center, super.right);
        }

        super.paint(var1);
    }

    public final void update() {
        if (uname.equals("") && unameChange.equals("")) {
            if (this.indexRow > -1 && this.indexRow < cmd[0].length) {
                super.center = cmd[0][this.indexRow];
            }
        } else if (this.indexRow > -1 && this.indexRow < cmd[1].length) {
            super.center = cmd[1][this.indexRow];
        }

        if (++GameScr.cmx > GameCanvas.w * 3 + 100) {
            GameScr.cmx = 100;
        }
        if (this.advAE && this.advAF > 0L) {
            this.advAZ = (this.advAF + 31000L - System.currentTimeMillis()) / 1000L;
            if (this.advAZ <= 0L) {
                this.advAE = false;
                this.advAF = 0L;
                this.advAZ = -1L;
                Session_ME.gI().reLogin();
            }
        }
        super.update();
    }

    public final void updateKey() {
        if (!GameCanvas.keyPressedz[2] && !GameCanvas.keyPressedz[4]) {
            if (GameCanvas.keyPressedz[8] || GameCanvas.keyPressedz[6]) {
                ++this.indexRow;
                if (this.indexRow > menu.length - 1) {
                    this.indexRow = 0;
                }
            }
        } else {
            --this.indexRow;
            if (this.indexRow < 0) {
                this.indexRow = menu.length - 1;
            }
        }

        if (GameCanvas.isPointerJustRelease && GameCanvas.isPointerHoldIn(this.popupX + 10, this.popupY + 45, this.popupW - 10, 170)) {
            if (GameCanvas.isPointerClick) {
                this.indexRow = (GameCanvas.py - (this.popupY + 45)) / 35;
            }

            if (uname.equals("") && unameChange.equals("")) {
                if (this.indexRow > -1 && this.indexRow < cmd[0].length) {
                    cmd[0][this.indexRow].performAction();
                }
            } else if (this.indexRow > -1 && this.indexRow < cmd[1].length) {
                cmd[1][this.indexRow].performAction();
            }
        }

        super.updateKey();
        GameCanvas.clearKeyPressed();
    }

    private void doViewFAQ() {
        if (!Session_ME.gI().connected) {
            GameCanvas.connect();
        }

        GameCanvas.startWaitDlg();
    }

    public static boolean isVirtualAcc() {
        return uname != null && (uname.startsWith("tmpusr") || uname.equals(""));
    }

    public static String randomNumberlist() {
        String var0 = "";

        for (int var1 = 0; var1 < 12; ++var1) {
            String var2 = Integer.toString(Res.random(0, 9));
            var0 = var0 + var2;
        }

        return var0;
    }

    public final void perform(int var1, Object var2) {
        int i1;
        switch (var1) {
            case 1000:
                if (isVirtualAcc() && !uname.equals("")) {
                    GameCanvas.startYesNoDlg(mResources.NEW_ACC_ARLET, new Command(mResources.COUNTINUE_PLAY, this, 10001, (Object) null), new Command(mResources.NO, GameCanvas.instance, 8882, (Object) null));
                    return;
                }

                this.doViewFAQ();
                Service.gI().login("-1", "12345", "2.1.7");
                return;
            case 1001:
                if (isVirtualAcc() && !uname.equals("") && unameChange.equals("")) {
                    GameCanvas.startYesNoDlg(mResources.NEW_ACC_ARLET, new Command(mResources.COUNTINUE, this, 10004, (Object) null), new Command(mResources.NO, GameCanvas.instance, 8882, (Object) null));
                    return;
                }

                GameCanvas.loginScr.switchToMe();
                return;
            case 1002:
                MyVector var5 = new MyVector();
                for (i1 = 0; i1 < UpdateServer.serverST.length; ++i1) {
                    var5.addElement(new Command(UpdateServer.listName[UpdateServer.serverST[i1]], this, i1 + 20000, (Object) null));
                }

                GameCanvas.menu.startAt(var5);
                if (RMS.loadRMSInt("indServer") != -1 && !GameCanvas.isTouch) {
                    GameCanvas.menu.menuSelectedItem = RMS.loadRMSInt("indServer");
                }

                return;
            case 1003:
                this.doViewFAQ();
                if (!unameChange.equals("")) {
                    uname = unameChange;
                    pass = passChange;
                    unameChange = "";
                    passChange = "";
                    RMS.saveRMSString("acc", uname);
                    RMS.saveRMSString("pass", pass);
                }

                Service.gI().login(uname, pass, "2.1.7");
                return;
            case 10001:
                this.doViewFAQ();
                Service.gI().login("-1", "12345", "2.1.7");
                if (!unameChange.equals("")) {
                    uname = unameChange;
                    pass = passChange;
                    unameChange = "";
                    passChange = "";
                    RMS.saveRMSString("acc", uname);
                    RMS.saveRMSString("pass", pass);
                    return;
                }
                break;
            case 10004:
                GameCanvas.currentDialog = null;
                GameCanvas.loginScr.switchToMe();
                return;
            case 20100:
                boolean bl2 = UpdateServer.a();
                Session_ME.gI().close();
                GameCanvas.initGameCanvas();
                GameCanvas.endDlg();
                GameCanvas.startOK(bl2 ? new String(new char[]{'U', 'p', 'd', 'a', 't', 'e', ' ', 'O', 'K'})
                        : new String(new char[]{'e', 'r', 'r', 'o', 'r', ' ', '!', '!', ' ', 'V', 'u', 'i', ' ', 'L', 'ò', 'n', 'g', ' ', 'K', 'i', 'ể', 'm', ' ',
                    'T', 'r', 'a', ' ', 'L', 'ạ', 'i', ' ', 'K', 'ế', 't', ' ', 'N', 'ố', 'i'}), 8882, null);
                return;
            case 100041:
                return;
        }
        if (var1 >= 20000 && var1 < 20000 + UpdateServer.serverST.length) {
            i1 = UpdateServer.serverST[var1 - 20000];
            GameCanvas.menu.showMenu = false;
            GameMidlet.IP = UpdateServer.listIP[i1];
            GameMidlet.PORT = UpdateServer.listPort[i1];
            GameMidlet.serverLogin = UpdateServer.serverLoginList[i1];
            RMS.saveRMSInt("indServer", UpdateServer.serverST[i1]);
        }

    }
}
