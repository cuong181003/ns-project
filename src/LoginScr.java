
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Image;

public final class LoginScr extends mScreen implements IActionListener {

    private TField tfUser;
    private TField tfPass;
    private TField tfRegPass;
    private TField tfEmail;
    private static LoginScr instance;
    private int focus;
    private int wC;
    private int yL;
    private int defYL;
    private boolean isCheck = false;
    private boolean isRes = false;
    private Command cmdLogin;
    private Command cmdCheck;
    private Command cmdRes;
    private Command cmdMenu;
    public static Image imgTitle = GameCanvas.loadImage("/tt.png");
    private int yy;
    private String[] currentTip;
    private int tipid = -1;
    private int v = 2;
    private int g = 0;
    private int ylogo = -40;
    private int dir = 1;
    public static boolean isLoggingIn;
    private String strNick = "";
    public static int advAB = 0;

    public final void switchToMe() {
        if (RMS.loadRMSString("random") == null) {
            RMS.saveRMSString("random", SelectServerScr.randomNumberlist());
        }

        this.yL = -50;
        this.isRes = false;
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

        if (GameCanvas.menu != null) {
            GameCanvas.menu = new Menu();
        }

        GameCanvas.isGPRS = false;
        super.left = this.cmdMenu = new Command(mResources.FORGETPASS, this, 2005, (Object) null);
        GameScr.nsoAX.removeAllElements();
    }

    public final void switchToMe(boolean var1) {
        this.isRes = true;
        this.yL = -50;
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

        if (GameCanvas.menu != null) {
            GameCanvas.menu = new Menu();
        }

        GameCanvas.isGPRS = false;
        super.left = this.cmdMenu = new Command("Hủy", this, 20051, (Object) null);
    }

    public LoginScr() {
        instance = this;
        this.isRes = false;
        if ((TileMap.bgID = (byte) ((int) (System.currentTimeMillis() % 9L))) == 5 || TileMap.bgID == 6) {
            TileMap.bgID = 4;
        }

        GameScr.loadCamera(true);
        GameScr.cmx = 100;
        if (GameCanvas.h > 200) {
            this.defYL = GameCanvas.hh - 80;
        } else {
            this.defYL = GameCanvas.hh - 65;
        }

        this.yL = -50;
        this.wC = GameCanvas.w - 30;
        if (this.wC < 135) {
            this.wC = 135;
        }

        if (this.wC > 155) {
            this.wC = 155;
        }

        this.yy = GameCanvas.hh - mScreen.ITEM_HEIGHT - 5;
        if (GameCanvas.h <= 160) {
            this.yy = 20;
        }

        this.tfUser = new TField();
        this.tfUser.name = mResources.USERNAME;
        this.tfUser.x = GameCanvas.hw - 20 - 57;
        this.tfUser.y = this.yy;
        this.tfUser.width = this.wC;
        this.tfUser.height = mScreen.ITEM_HEIGHT + 2;
        this.tfUser.isFocus = true;
        this.tfUser.getIputType(3);
        TField.nsoAJ = GameMidlet.instance;
        TField.nsoAI = MotherCanvas.instance;
        this.tfPass = new TField();
        this.tfPass.name = mResources.PASSWORD;
        this.tfPass.x = GameCanvas.hw - 20 - 57;
        this.tfPass.y = this.yy += 35;
        this.tfPass.width = this.wC;
        this.tfPass.height = mScreen.ITEM_HEIGHT + 2;
        this.tfPass.isFocus = false;
        this.tfPass.getIputType(2);
        this.tfRegPass = new TField();
        this.tfRegPass.name = mResources.REPASSWORD;
        this.tfRegPass.x = GameCanvas.hw - 20 - 57;
        this.tfRegPass.y = this.yy += 35;
        this.tfRegPass.width = this.wC;
        this.tfRegPass.height = mScreen.ITEM_HEIGHT + 2;
        this.tfRegPass.isFocus = false;
        this.tfRegPass.getIputType(2);
        this.tfEmail = new TField();
        this.tfEmail.name = "Email/Số di động";
        this.tfEmail.x = GameCanvas.hw - 20 - 57;
        this.tfEmail.y = this.yy += 35;
        this.tfEmail.width = this.wC;
        this.tfEmail.height = mScreen.ITEM_HEIGHT + 2;
        this.tfEmail.isFocus = false;
        this.tfEmail.getIputType(3);
        this.isCheck = true;
        if (SelectServerScr.uname != null) {
            if (SelectServerScr.uname.startsWith("tmpusr")) {
                this.tfUser.setText("");
                this.tfPass.setText("");
            } else {
                this.tfUser.setText(SelectServerScr.uname);
                this.tfPass.setText(SelectServerScr.pass);
            }
        }

        this.focus = 0;
        this.cmdLogin = new Command(mResources.OK, this, 2000, (Object) null);
        this.cmdCheck = new Command(mResources.REMEMBER, this, 2001, (Object) null);
        this.cmdRes = new Command(mResources.REGISTER, this, 2002, (Object) null);
        new Command(mResources.FORGETPASS, this, 2004, (Object) null);
        if (!this.isRes) {
            super.left = this.cmdMenu = new Command(mResources.FORGETPASS, this, 2005, (Object) null);
        } else {
            super.left = this.cmdMenu = new Command(mResources.CANCEL, this, 20051, (Object) null);
        }

        if (GameCanvas.isTouch && GameCanvas.w >= 320) {
            super.center = null;
            super.right = this.cmdLogin;
        } else {
            super.center = this.cmdLogin;
            super.right = this.tfUser.cmdClear;
        }
    }

    public static LoginScr gI() {
        return instance;
    }

    private static void doSetGPRS(boolean var0) {
        GameCanvas.isGPRS = var0;
        RMS.saveRMSInt("isGPRS", var0 ? 1 : 2);
    }

    private void doRegister(String var1) {
        GameMidlet.IP = UpdateServer.listIP[0];
        GameCanvas.startWaitDlg(mResources.CONNECTING);
        GameCanvas.connect();
        GameCanvas.startWaitDlg(mResources.REGISTERING);
        Service.gI().setClientType();
        Service.gI().requestRegisterNew(var1, this.tfPass.getText(), this.tfEmail.getText());
    }

    public final void update() {
        if (++GameScr.cmx > GameCanvas.w * 3 + 100) {
            GameScr.cmx = 100;
        }

        this.tfUser.update();
        this.tfPass.update();
        if (this.isRes) {
            this.tfRegPass.update();
            this.tfEmail.update();
        }

        if (this.defYL != this.yL) {
            this.yL += this.defYL - this.yL >> 1;
        }

        if (GameCanvas.isTouch) {
            super.center = null;
            if (this.isRes) {
                super.right = this.cmdRes;
            } else {
                super.right = this.cmdLogin;
            }
        } else if (this.isRes) {
            super.center = this.cmdRes;
        } else if (this.focus == 2) {
            super.center = this.cmdCheck;
            if (this.isCheck) {
                super.center.caption = mResources.UNCHECK;
            } else {
                super.center.caption = mResources.REMEMBER;
            }
        } else {
            super.center = this.cmdLogin;
        }

        if (this.g >= 0) {
            this.ylogo += this.dir * this.g;
            this.g += this.dir * this.v;
            if (this.g <= 0) {
                this.dir = -this.dir;
            }

            if (this.ylogo > 0) {
                this.dir = -this.dir;
                this.g -= 2 * this.v;
            }
        }

        if (this.tipid >= 0 && GameCanvas.gameTick % 100 == 0) {
            ++this.tipid;
            if (this.tipid >= mResources.tips.length) {
                this.tipid = 0;
            }

            this.currentTip = mFont.tahoma_7_white.splitFontArray(mResources.tips[this.tipid], GameCanvas.w - 40);
        }

    }

    public final void keyPress(int var1) {
        if (this.tfUser.isFocus) {
            this.tfUser.keyPressed(var1);
        } else if (this.tfPass.isFocus) {
            this.tfPass.keyPressed(var1);
        } else if (this.isRes && this.tfRegPass.isFocus) {
            this.tfRegPass.keyPressed(var1);
        } else if (this.isRes && this.tfEmail.isFocus) {
            this.tfEmail.keyPressed(var1);
        }

        super.keyPress(var1);
    }

    public final void unLoad() {
        super.unLoad();
    }

    public final void paint(mGraphics var1) {
        var1.setColor(0);
        var1.fillRect(0, 0, GameCanvas.w, GameCanvas.h);
        GameCanvas.paintBGGameScr(var1);
        int var2 = this.tfUser.y - 45;
        if (GameCanvas.h <= 220) {
            var2 += 5;
        }

        if (GameCanvas.currentDialog == null) {
            if (this.isRes) {
                Paint.paintFrame(GameCanvas.hw - 85, this.tfUser.y - 15, 170, 150, var1);
            } else {
                Paint.paintFrame(GameCanvas.hw - 85, this.tfUser.y - 15, 170, 90, var1);
            }

            if (GameCanvas.h > 160 && imgTitle != null) {
                var1.drawImage(imgTitle, GameCanvas.hw, var2 - 2, 3);
            }

            this.tfUser.paint(var1);
            this.tfPass.paint(var1);
            if (this.isRes) {
                this.tfRegPass.paint(var1);
                this.tfEmail.paint(var1);
            }

            var1.setClip(0, 0, GameCanvas.w, GameCanvas.h);
            boolean var3 = false;
            if (GameCanvas.w > 200) {
                if (this.tfUser.getText().equals("")) {
                    if (!this.tfUser.isFocus) {
                        mFont.tahoma_7b_white.drawString(var1, mResources.USERNAME, this.tfUser.x + 5, this.tfUser.y + 7, 0);
                    } else {
                        mFont.tahoma_7_grey.drawString(var1, mResources.USERNAME, this.tfUser.x + 5, this.tfUser.y + 7, 0);
                    }
                }

                if (this.tfPass.getText().equals("")) {
                    if (!this.tfPass.isFocus) {
                        mFont.tahoma_7b_white.drawString(var1, mResources.PASSWORD, this.tfPass.x + 5, this.tfPass.y + 7, 0);
                    } else {
                        mFont.tahoma_7_grey.drawString(var1, mResources.PASSWORD, this.tfPass.x + 5, this.tfPass.y + 7, 0);
                    }
                }

                if (this.isRes) {
                    if (this.tfRegPass.getText().equals("")) {
                        if (!this.tfRegPass.isFocus) {
                            mFont.tahoma_7b_white.drawString(var1, mResources.REPASS, this.tfRegPass.x + 5, this.tfRegPass.y + 7, 0);
                            mFont.tahoma_7b_white.drawString(var1, mResources.PASSWORD, this.tfRegPass.x + 50, this.tfRegPass.y + 7, 0);
                        } else {
                            mFont.tahoma_7_grey.drawString(var1, mResources.REPASS, this.tfRegPass.x + 5, this.tfRegPass.y + 7, 0);
                            mFont.tahoma_7_grey.drawString(var1, mResources.PASSWORD, this.tfRegPass.x + 50, this.tfRegPass.y + 7, 0);
                        }
                    }

                    if (this.tfEmail.getText().equals("")) {
                        if (!this.tfEmail.isFocus) {
                            mFont.tahoma_7b_white.drawString(var1, "Email/số di động", this.tfEmail.x + 5, this.tfEmail.y + 5, 0);
                        } else {
                            mFont.tahoma_7_grey.drawString(var1, "Email/số di động", this.tfEmail.x + 5, this.tfEmail.y + 5, 0);
                        }
                    }
                }
            } else {
                if (this.tfUser.getText().equals("")) {
                    mFont.tahoma_7b_white.drawString(var1, mResources.USER, this.tfUser.x - 35, this.tfUser.y + 7, 0);
                }

                if (this.tfPass.getText().equals("")) {
                    mFont.tahoma_7b_white.drawString(var1, mResources.PASS, this.tfPass.x - 35, this.tfPass.y + 7, 0);
                }

                if (this.isRes) {
                    mFont.tahoma_7b_white.drawString(var1, mResources.RE, this.tfRegPass.x - 35, this.tfRegPass.y - 1, 0);
                    mFont.tahoma_7b_white.drawString(var1, mResources.PASS, this.tfRegPass.x - 35, this.tfRegPass.y + 13, 0);
                    mFont.tahoma_7b_white.drawString(var1, "Email/số di động", this.tfEmail.x - 35, this.tfEmail.y + 5, 0);
                }
            }
        } else if (this.currentTip != null) {
            for (var2 = 0; var2 < this.currentTip.length; ++var2) {
                mFont.tahoma_7_white.drawString(var1, this.currentTip[var2], GameCanvas.w / 2, this.tfUser.y - 15 + var2 * 10, 2, mFont.tahoma_7_grey);
            }
        }

        String var4 = "2.1.7";
        mFont.tahoma_7_grey.drawString(var1, var4, GameCanvas.w - 5, 5, 1);
        super.paint(var1);
    }

    public final void updateKey() {
        if (GameCanvas.keyPressedz[2]) {
            --this.focus;
            if (this.focus < 0) {
                this.focus = 3;
            }
        } else if (GameCanvas.keyPressedz[8]) {
            ++this.focus;
            if (this.focus > 3) {
                this.focus = 0;
            }
        }

        if (GameCanvas.keyPressedz[2] || GameCanvas.keyPressedz[8]) {
            GameCanvas.clearKeyPressed();
            if (this.focus == 1) {
                this.tfUser.isFocus = false;
                this.tfPass.isFocus = true;
                this.tfRegPass.isFocus = false;
                this.tfEmail.isFocus = false;
                super.right = this.tfPass.cmdClear;
            } else if (this.focus == 0) {
                this.tfUser.isFocus = true;
                this.tfPass.isFocus = false;
                this.tfRegPass.isFocus = false;
                this.tfEmail.isFocus = false;
                super.right = this.tfUser.cmdClear;
            } else {
                this.tfUser.isFocus = false;
                this.tfPass.isFocus = false;
                if (this.isRes) {
                    if (this.focus == 2) {
                        this.tfRegPass.isFocus = true;
                        this.tfEmail.isFocus = false;
                        super.right = this.tfRegPass.cmdClear;
                    } else if (this.focus == 3) {
                        this.tfEmail.isFocus = true;
                        this.tfRegPass.isFocus = false;
                        super.right = this.tfEmail.cmdClear;
                    }
                }
            }
        }

        if (GameCanvas.isPointerJustRelease) {
            if (GameCanvas.isPointerHoldIn(this.tfUser.x, this.tfUser.y, this.tfUser.width, this.tfUser.height)) {
                this.focus = 0;
            } else if (GameCanvas.isPointerHoldIn(this.tfPass.x, this.tfPass.y, this.tfPass.width, this.tfPass.height)) {
                this.focus = 1;
            } else {
                if (this.isRes) {
                    if (GameCanvas.isPointerHoldIn(this.tfRegPass.x, this.tfRegPass.y, this.tfRegPass.width, this.tfRegPass.height)) {
                        this.focus = 2;
                    } else if (GameCanvas.isPointerHoldIn(this.tfEmail.x, this.tfEmail.y, this.tfEmail.width, this.tfEmail.height)) {
                        this.focus = 3;
                    }
                } else if (GameCanvas.isPointerHoldIn(this.tfUser.x - 20, GameCanvas.hh + 40, 80, 20)) {
                    this.isCheck = !this.isCheck;
                }

                this.focus = 2;
            }
        }

        super.updateKey();
        GameCanvas.clearKeyPressed();
    }

    public final void perform(int var1, Object var2) {
        int var7;
        switch (var1) {
            case 1002:
                this.isRes = true;
                this.tfRegPass.isFocus = false;
                this.tfEmail.isFocus = false;
                this.tfPass.isFocus = false;
                this.tfUser.isFocus = true;
                super.right = this.tfUser.cmdClear;
                super.left = new Command(mResources.CANCEL, this, 10021, (Object) null);
                return;
            case 1003:
                try {
                    GameMidlet.instance.platformRequest("http://ninjaschool.vn");
                    return;
                } catch (Exception var3) {
                    var3.printStackTrace();
                    return;
                }
            case 1004:
                MyVector var6 = new MyVector();
                var7 = RMS.loadRMSInt("lowGraphic");
                if (!GameCanvas.isTouch) {
                    if (var7 == 1) {
                        var6.addElement(new Command(mResources.HIGH_GRAPHIC, this, 10041, (Object) null));
                    } else {
                        var6.addElement(new Command(mResources.LOW_GRAPHIC, this, 10042, (Object) null));
                    }
                }

                var6.addElement(new Command(mResources.LANGUAGE, this, 1006, (Object) null));
                if (GameCanvas.currentScreen == this) {
                    var6.addElement(new Command(mResources.RMS, this, 1009, (Object) null));
                }

                GameCanvas.menu.startAt(var6);
                return;
            case 1005:
                GameCanvas.startYesNoDlg(mResources.ASK_NETWORK, new Command("3G/Wifi", this, 3000, (Object) null), new Command("GPRS", this, 3001, (Object) null));
                return;
            case 1006:
                GameCanvas.startYesNoDlg(mResources.SOFT_KEY, new Command(mResources.ACCEPT, this, 10061, (Object) null), new Command(mResources.NO, GameCanvas.gI(), 8882, (Object) null));
                return;
            case 1009:
                RMS.clearRMS();
                return;
            case 2000:
                if (!this.tfUser.getText().equals("") && !this.tfPass.getText().equals("")) {
                    SelectServerScr.unameChange = this.tfUser.getText();
                    SelectServerScr.passChange = this.tfPass.getText();
                }

                GameCanvas.selectsvScr.switchToMe();
                return;
            case 2001:
                if (this.isCheck) {
                    this.isCheck = false;
                    return;
                }

                this.isCheck = true;
                return;
            case 2002:
                if (this.tfUser.getText().equals("")) {
                    GameCanvas.startOKDlg(mResources.NOT_INPUT_USERNAME);
                } else {
                    char[] var5 = this.tfUser.getText().toCharArray();

                    for (var7 = 0; var7 < var5.length; ++var7) {
                        if (!TField.setNormal(var5[var7])) {
                            GameCanvas.startOKDlg(mResources.NOT_SPEC_CHARACTER);
                            return;
                        }
                    }

                    if (this.tfPass.getText().equals("")) {
                        GameCanvas.startOKDlg(mResources.NOT_INPUT_PASS1);
                    } else if (this.tfRegPass.getText().equals("")) {
                        GameCanvas.startOKDlg(mResources.NOT_INPUT_PASS2);
                    } else {
                        this.tfRegPass.getText().equals("");
                        if (this.tfUser.getText().length() < 5) {
                            GameCanvas.startOKDlg(mResources.USERNAME_LENGHT);
                        } else if (!this.tfPass.getText().equals(this.tfRegPass.getText())) {
                            GameCanvas.startOKDlg(mResources.WRONG_PASSWORD);
                        } else {
                            if (!this.tfEmail.getText().equals("")) {
                                GameCanvas.msgdlg.setInfo(mResources.REGISTER_TEXT[0] + " " + this.tfUser.getText() + ", " + mResources.REGISTER_TEXT[1], new Command(mResources.ACCEPT, this, 4000, (Object) null), (Command) null, new Command(mResources.NO, GameCanvas.instance, 8882, (Object) null));
                                GameCanvas.currentDialog = GameCanvas.msgdlg;
                                return;
                            }

                            GameCanvas.startYesNoDlg("Bạn chưa nhập Email/số di động, Email/số di động giúp bạn lấy lại mật khẩu khi mất mật khẩu", new Command(mResources.CONTINUE, this, 4001, (Object) null), new Command(mResources.NO, GameCanvas.instance, 8882, (Object) null));
                        }
                    }
                }
                break;
            case 2003:
                GameMidlet.flatForm("http://dd.ninjaschool.vn/app/index.php?for=event&do=resetpass");
                return;
            case 2004:
                GameCanvas.inputDlg.show(mResources.INPUT_NICK, new Command(mResources.OK, this, 20041, (Object) null), 0);
                return;
            case 2005:
                GameCanvas.startYesNoDlg("Bạn có muốn reset mật khẩu không?", new Command(mResources.OK, this, 20052, (Object) null), new Command(mResources.NO, GameCanvas.instance, 8882, (Object) null));
                return;
            case 3000:
                doSetGPRS(false);
                GameCanvas.endDlg();
                return;
            case 3001:
                doSetGPRS(true);
                GameCanvas.endDlg();
                return;
            case 4000:
                this.doRegister(this.tfUser.getText());
                return;
            case 4001:
                this.doRegister(this.tfUser.getText());
                break;
            case 10021:
                this.isRes = false;
                this.tfRegPass.isFocus = false;
                this.tfPass.isFocus = false;
                this.tfUser.isFocus = true;
                super.right = this.tfUser.cmdClear;
                super.left = this.cmdMenu;
                return;
            case 10041:
                RMS.saveRMSInt("lowGraphic", 0);
                GameCanvas.startOK(mResources.RESTART, 8885, (Object) null);
                return;
            case 10042:
                RMS.saveRMSInt("lowGraphic", 1);
                GameCanvas.startOK(mResources.RESTART, 8885, (Object) null);
                return;
            case 10051:
                RMS.saveRMSInt("isSoftKey", 1);
                GameScr.isSoftKey = true;
                return;
            case 10052:
                RMS.saveRMSInt("isSoftKey", 2);
                GameScr.isSoftKey = false;
                return;
            case 10061:
                GameCanvas.endDlg();
                RMS.saveRMSInt("indLanguage", -1);
                GameMidlet.instance.notifyDestroyed();
                return;
            case 20041:
                this.strNick = GameCanvas.inputDlg.tfInput.getText().toString();
                GameCanvas.endDlg();
                if (this.strNick.equals("")) {
                    GameCanvas.startOKDlg(mResources.NOT_INPUT_USERNAME);
                    return;
                }

                GameCanvas.startYesNoDlg(mResources.ASK_REG_NUM, new Command(mResources.YES, this, 200421, (Object) null), new Command(mResources.NO, this, 200422, (Object) null));
                return;
            case 20051:
                GameScr.gI().switchToMe();
                return;
            case 20052:
                GameMidlet.flatForm("http://dd.ninjaschool.vn/app/index.php?for=event&do=resetpass");
                return;
            case 200421:
                GameCanvas.endDlg();
                String var4 = this.strNick;
                GameMidlet.IP = UpdateServer.listIP[0];
                GameCanvas.startWaitDlg(mResources.CONNECTING);
                GameCanvas.connect();
                GameCanvas.startWaitDlg(mResources.PLEASEWAIT);
                Service.gI().requestForgetPass(var4);
                return;
            case 200422:
                GameCanvas.startOKDlg(mResources.replace(mResources.GETPASS_BY_NUMPHONE, this.strNick));
                return;
        }
        if (var1 >= 20000 && var1 < 20000 + UpdateServer.serverST.length) {
            var1 = UpdateServer.serverST[var1 - 20000];
            GameCanvas.menu.showMenu = false;
            GameMidlet.IP = UpdateServer.listIP[var1];
            GameMidlet.PORT = UpdateServer.listPort[var1];
            GameMidlet.serverLogin = UpdateServer.serverLoginList[var1];
            RMS.saveRMSInt("indServer", UpdateServer.serverST[var1]);
            this.advAH();
        }
    }

    private void advAH() {
        this.tipid = GameCanvas.gameTick % mResources.tips.length;
        this.currentTip = mFont.tahoma_7_white.splitFontArray(mResources.tips[this.tipid], GameCanvas.w - 40);
        String var1 = this.tfUser.getText().toLowerCase().trim();
        String var2 = this.tfPass.getText().toLowerCase().trim();
        if (var1.equals("a") && var2.equals("a")) {
            advAB = 1;
        } else if (var1.equals("b") && var2.equals("b")) {
            advAB = 2;
        }

        if (var1 != null && var2 != null && !var1.equals("")) {
            if (var2.equals("")) {
                this.focus = 1;
                this.tfUser.isFocus = false;
                this.tfPass.isFocus = true;
                super.right = this.tfPass.cmdClear;
                return;
            }

            GameCanvas.startWaitDlg(mResources.CONNECTING);
            GameCanvas.connect();
            GameCanvas.startWaitDlg(mResources.PLEASEWAIT);
            Service.gI().login(var1, var2, "2.1.7");
            isLoggingIn = true;
            if (this.isCheck) {
                RMS.saveRMSInt("check", 1);
                RMS.saveRMSString("acc", var1);
                RMS.saveRMSString("pass", var2);
            } else {
                RMS.saveRMSInt("check", 2);
                RMS.saveRMSString("acc", "");
                RMS.saveRMSString("pass", "");
            }

            this.focus = 0;
        }

    }
}
