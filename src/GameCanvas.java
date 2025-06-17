
import java.io.IOException;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class GameCanvas extends GameGraphics implements IActionListener {

    public static boolean lowGraphic = false;
    public static Image testCapcha = null;
    public static boolean isMoveNumberPad = true;
    public static boolean isGPRS = true;
    public static boolean isBallEffect = false;
    public static boolean isLoading;
    public static boolean isTouch = false;
    public static boolean isTouchControl;
    public static boolean isTouchControlSmallScreen;
    public static boolean isTouchControlLargeScreen;
    public static GameCanvas instance;
    public static Readmsg readMessenge;
    public static boolean[] keyPressedz = new boolean[14];
    private static boolean[] keyReleasedz = new boolean[14];
    public static boolean[] keyHold = new boolean[14];
    public static boolean isPointerDown;
    public static boolean isPointerClick;
    public static boolean isPointerJustRelease;
    public static int px;
    public static int py;
    public static int pxLast;
    public static int pyLast;
    public static Position[] arrPos = new Position[4];
    public static int gameTick;
    public static int taskTick;
    public static boolean isEff1;
    public static boolean isEff2;
    private static long timeTickEff1;
    private static long timeTickEff2;
    public static boolean isBlackBerryDevice;
    public static int w;
    public static int h;
    public static int hw;
    public static int hh;
    public static mScreen currentScreen;
    public static Menu menu = new Menu();
    public static SelectServerScr selectsvScr;
    public static LoginScr loginScr;
    public static LanguageScr languageScr;
    public static Dialog currentDialog;
    public static MsgDlg msgdlg;
    public static InputDlg inputDlg;
    public static Input2Dlg input2Dlg;
    public static Paint paintz;
    public static RegisterScr regScr;
    private static Image[] imgBG;
    private static int skyColor;
    private static int curPos;
    public static int timeBallEffect;
    private static int[] imgBGWidth;
    private mGraphics g = new mGraphics();
    private static boolean paintBG;
    private static int gsskyHeight;
    private static int gsgreenField1Y;
    private static int gsgreenField2Y;
    private static int gshouseY;
    private static int gsmountainY;
    private static int bgLayer0y;
    private static int bgLayer1y;
    private static Image imgCloud;
    private static Image imgSun;
    public static Image[] imgBorder;
    public static int borderConnerW;
    public static int borderConnerH;
    private static int[] cloudX;
    private static int[] cloudY;
    private static int sunX;
    private static int sunY;
    public static int typeBg;
    private static long lastTimePress;
    public static int keyAsciiPress;
    private static int[] bgSpeed;
    private int[] dustX;
    private int[] dustY;
    private int[] dustState;
    private static int[] wsX;
    private static int[] wsY;
    private static int[] wsState;
    private static Image[] imgWS;
    private static Image imgShuriken;
    private static Image[][] imgDust;
    private boolean resetToLoginScrz;
    public static boolean isKiemduyet;
    public static boolean isKiemduyet_info;
    public static Image imgPlus12;
    public static Image backitem;
    public static Image[] imgMx;
    private static int xKd;
    private static int yKd;
    private static int wStr;
    public static int advBS;
    public static long advBT;
    public static long advBU;

    static {
        new MyVector();
        curPos = 0;
        imgBorder = new Image[2];
        typeBg = -1;
        lastTimePress = 0L;
        new MyVector();
        isKiemduyet = false;
        isKiemduyet_info = false;
        xKd = w;
        yKd = 0;
    }

    public GameCanvas() {
        boolean var1 = true;
        UpdateServer.b();
        MotherCanvas.instance.setFullScreenMode(true);
        MotherCanvas.instance.setChildCanvas(this);
        w = MotherCanvas.instance.mgetWidth();
        h = MotherCanvas.instance.mgetHeight();
        hw = w / 2;
        hh = h / 2;
        isBlackBerryDevice = System.getProperty("microedition.platform").indexOf("RIM") == 0;
        if (MotherCanvas.instance.hasPointerEvents()) {
            isTouch = true;
            if (w >= 240) {
                isTouchControl = true;
            }

            if (w < 320) {
                isTouchControlSmallScreen = true;
            }

            if (w >= 320) {
                isTouchControlLargeScreen = true;
            }
        }

        msgdlg = new MsgDlg();
        if (h <= 160) {
            Paint.hTab = 15;
            mScreen.cmdH = 17;
        }

        readMessenge = new Readmsg();
        instance = this;
        System.gc();
        paintz = new Paint();
        TileMap.advAI();

        if (!lowGraphic) {
            if (imgDust == null) {
                imgDust = new Image[2][5];

                for (int var4 = 0; var4 < 2; ++var4) {
                    for (int var2 = 0; var2 < 5; ++var2) {
                        imgDust[var4][var2] = loadImage("/e/d" + var4 + var2 + ".png");
                    }
                }
            }

            this.dustX = new int[2];
            this.dustY = new int[2];
            this.dustState = new int[2];
            this.dustState[0] = this.dustState[1] = -1;
        }

        loadWaterSplash();
        int languagene;
        if ((languagene = RMS.loadRMSInt("indLanguage")) < 0) {
            mResources.languageID = 0;
        } else {
            mResources.languageID = languagene;
        }
        mResources.loadLanguage();

        imgShuriken = loadImage("/u/f.png");
        if (isTouch) {
            for (int var3 = 0; var3 < 2; ++var3) {
                imgBorder[var3] = loadImage("/hd/bd" + var3 + ".png");
            }

            borderConnerW = mGraphics.getWidth(imgBorder[0]);
            borderConnerH = mGraphics.getHeight(imgBorder[0]);
            mGraphics.getWidth(imgBorder[1]);
            mGraphics.getHeight(imgBorder[1]);
        } else if (RMS.loadRMSInt("lowGraphic") == 1) {
            lowGraphic = true;
        }

        SmallImage.loadBigImage();
        if (MotherCanvas.instance.hasPointerEvents()) {
            new MyVector();
        }

        mScreen.initPos();
        languageScr = new LanguageScr();
    }

    public static GameCanvas gI() {
        if (instance == null) {
            instance = new GameCanvas();
        }

        return instance;
    }

    public static void connect() {
        Session_ME.gI().connect(GameMidlet.IP, GameMidlet.PORT);
    }

    public static void initGameCanvas() {
        w = MotherCanvas.instance.mgetWidth();
        h = MotherCanvas.instance.mgetHeight();
        hw = w / 2;
        hh = h / 2;
        loginScr = new LoginScr();
        selectsvScr = new SelectServerScr();
        regScr = new RegisterScr();
        inputDlg = new InputDlg();
        input2Dlg = new Input2Dlg();
    }

    public final void update() {
        if (advBS > 0) {
            if ((advBU = System.currentTimeMillis()) - advBT >= 1000L) {
                if (--advBS == 0) {
                    Session_ME.gI().reLogin();
                }

                advBT = advBU;
            }
        } 
//        else if (Session_ME.gI().connected && System.currentTimeMillis() - Session_ME.gI().timeConnected > 300000L) {
//            Session_ME.gI().reLogin();
//        }
        long var1;
        if ((var1 = System.currentTimeMillis()) - timeTickEff1 >= 780L && !isEff1) {
            timeTickEff1 = var1;
            isEff1 = true;
        } else {
            isEff1 = false;
        }

        if (var1 - timeTickEff2 >= 7800L && !isEff2) {
            timeTickEff2 = var1;
            isEff2 = true;
        } else {
            isEff2 = false;
        }

        if (taskTick > 0) {
            --taskTick;
        }

        if (++gameTick > 10000) {
            if (System.currentTimeMillis() - lastTimePress > 20000L && currentScreen == loginScr) {
                GameMidlet.instance.notifyDestroyed();
            }

            gameTick = 0;
        }

        if (currentScreen != null) {
            if (currentDialog != null) {
                currentDialog.update();
            } else if (menu.showMenu) {
                menu.updateMenu();
                menu.updateMenuKey();
            }

            if (!isLoading) {
                currentScreen.update();
            }

            currentScreen.updateKey();
        }

        long var5 = System.currentTimeMillis();
        if (Timer.isON && var5 > Timer.timeExecute) {
            Timer.isON = false;

            try {
                if (Timer.idAction > 0) {
                    GameScr.gI().perform((int) Timer.idAction, (Object) null);
                }
            } catch (Exception var10) {
                var10.printStackTrace();
            }
        }

        if (InfoDlg.delay > 0 && --InfoDlg.delay == 0) {
            InfoDlg.hide();
        }

        if (this.resetToLoginScrz) {
            this.advAE();

        }

        MotherCanvas.instance.repaint();
        MotherCanvas.instance.serviceRepaints();

    }

    public final void advAE() {
        this.resetToLoginScrz = false;
        selectsvScr.switchToMe();

        try {
            Char.clearMyChar();
            GameScr.clearGameScr();
            GameScr.resetAllvector();
            endDlg();
            InfoDlg.hide();
            GameScr.loadCamera(true);
            GameScr.cmx = 100;
            loadBG(TileMap.bgID);
            GameScr.vParty.removeAllElements();
            GameScr.vClan.removeAllElements();
            GameScr.vFriend.removeAllElements();
            GameScr.vEnemies.removeAllElements();
            Char.clan = null;
        } catch (Exception var9) {
            var9.printStackTrace();
        }
    }

    public static void updateBallEffect() {
        if (isBallEffect && --timeBallEffect < 0) {
            isBallEffect = false;
        }

    }

    public static void updateBG() {
        if (!lowGraphic) {
            if (imgCloud != null) {
                for (int var0 = 0; var0 < cloudX.length; ++var0) {
                    if (gameTick % (var0 + 2 << 3) == 0) {
                        int var10002 = cloudX[var0]++;
                        if (cloudX[var0] > GameScr.gW + (mGraphics.getWidth(imgCloud) >> 1)) {
                            cloudX[var0] = -(mGraphics.getWidth(imgCloud) >> 1);
                        }
                    }
                }

            }
        }
    }

public static void paintBGGameScr(mGraphics var0) {
    if (isBallEffect) {
        if (gameTick % 10 > 7) {
            var0.setColor(16777215);
        } else {
            var0.setColor(0);
        }
        var0.fillRect(0, 0, GameScr.gW, GameScr.gH);
    } else {
        if (paintBG && !lowGraphic && imgBG != null) { // Check if imgBG is not null
            var0.setColor(skyColor);
            var0.fillRect(0, 0, GameScr.gW, gsskyHeight);
            int var1;

            if (typeBg >= 0 && typeBg <= 1) {
                if (imgBG[0] != null) { // Check if imgBG[0] is not null
                    for (var1 = -((GameScr.cmx >> 1) % 24); var1 < GameScr.gW; var1 += 24) {
                        var0.drawImage(imgBG[0], var1, gsgreenField1Y, 0);
                    }
                }

                if (imgBG[1] != null) { // Check if imgBG[1] is not null
                    for (var1 = -((GameScr.cmx >> 2) % 24); var1 < GameScr.gW; var1 += 24) {
                        var0.drawImage(imgBG[1], var1, gsgreenField2Y, 0);
                    }
                }

                if (imgBG[3] != null) { // Check if imgBG[3] is not null
                    for (var1 = -((GameScr.cmx >> 4) % 64); var1 < GameScr.gW; var1 += 64) {
                        var0.drawImage(imgBG[3], var1, gsmountainY, 0);
                    }
                }

                if (imgSun != null) {
                    var0.drawImage(imgSun, sunX, sunY, 3);
                }

                if (imgCloud != null) {
                    for (var1 = 0; var1 < 2; ++var1) {
                        var0.drawImage(imgCloud, cloudX[var1], cloudY[var1], 3);
                    }
                }

                if (imgBG[2] != null) { // Check if imgBG[2] is not null
                    for (var1 = -((GameScr.cmx >> 3) % 192); var1 < GameScr.gW; var1 += 192) {
                        var0.drawImage(imgBG[2], var1, gshouseY, 0);
                    }
                    return;
                }
            } else if (typeBg >= 2 && typeBg <= 6) {
                if (imgSun != null) {
                    var0.drawImage(imgSun, sunX, sunY, 3);
                }

                if (imgCloud != null) {
                    for (var1 = 0; var1 < cloudX.length; ++var1) {
                        var0.drawImage(imgCloud, cloudX[var1], cloudY[var1], 3);
                    }
                }

                if (typeBg != 2) {
                    if (imgBG[3] != null) { // Check if imgBG[3] is not null
                        for (var1 = -((GameScr.cmx >> bgSpeed[3]) % imgBGWidth[3]); var1 < GameScr.gW; var1 += imgBGWidth[3]) {
                            var0.drawImage(imgBG[3], var1, gsmountainY, 0);
                        }
                    }

                    if (imgBG[2] != null) { // Check if imgBG[2] is not null
                        for (var1 = -((GameScr.cmx >> bgSpeed[2]) % imgBGWidth[2]); var1 < GameScr.gW; var1 += imgBGWidth[2]) {
                            var0.drawImage(imgBG[2], var1, gshouseY, 0);
                        }
                    }

                    if (imgBG[1] != null) { // Check if imgBG[1] is not null
                        for (var1 = -((GameScr.cmx >> bgSpeed[1]) % imgBGWidth[1]); var1 < GameScr.gW; var1 += imgBGWidth[1]) {
                            var0.drawImage(imgBG[1], var1, bgLayer1y, 0);
                        }
                    }

                    if (imgBG[0] != null) { // Check if imgBG[0] is not null
                        for (var1 = -((GameScr.cmx >> bgSpeed[0]) % imgBGWidth[0]); var1 < GameScr.gW; var1 += imgBGWidth[0]) {
                            var0.drawImage(imgBG[0], var1, bgLayer0y, 0);
                        }
                        return;
                    }
                }
            } else if (typeBg >= 7 && typeBg <= 16) {
                var0.setColor(skyColor);
                var0.fillRect(0, 0, GameScr.gW, GameScr.gH);

                if (typeBg != 8 && imgBG[3] != null) { // Check if imgBG[3] is not null
                    for (var1 = -((GameScr.cmx >> bgSpeed[3]) % imgBGWidth[3]); var1 < GameScr.gW; var1 += imgBGWidth[3]) {
                        if (typeBg != 11 && typeBg != 12) {
                            var0.drawImage(imgBG[3], var1, gsmountainY, 0);
                        } else {
                            var0.drawImage(imgBG[3], var1, GameScr.gH - mGraphics.getHeight(imgBG[3]), 0);
                        }
                    }
                }

                if (typeBg != 8 && typeBg != 11 && typeBg != 12 && imgBG[2] != null) { // Check if imgBG[2] is not null
                    if (TileMap.mapID == 45) {
                        var0.drawImage(imgBG[2], GameScr.gW, gshouseY, 0);
                    } else {
                        for (var1 = -((GameScr.cmx >> bgSpeed[2]) % imgBGWidth[2]); var1 < GameScr.gW; var1 += imgBGWidth[2]) {
                            if (typeBg == 14) {
                                var0.drawImage(imgBG[2], var1, gshouseY + 12, 0);
                            } else {
                                var0.drawImage(imgBG[2], var1, gshouseY, 0);
                            }
                        }
                    }
                }

                if (typeBg != 11 && typeBg != 12 && imgBG[1] != null && TileMap.mapID != 52) { // Check if imgBG[1] is not null
                    for (var1 = -((GameScr.cmx >> bgSpeed[1]) % imgBGWidth[1]); var1 < GameScr.gW; var1 += imgBGWidth[1]) {
                        var0.drawImage(imgBG[1], var1, bgLayer1y, 0);
                    }
                }

                if (TileMap.mapID == 45 || TileMap.mapID == 55) {
                    var0.setColor(1114112);
                    var0.fillRect(0, bgLayer0y + 20, GameScr.gW, GameScr.gH);
                }

                if (imgBG[0] != null) { // Check if imgBG[0] is not null
                    for (var1 = -((GameScr.cmx >> bgSpeed[0]) % imgBGWidth[0]); var1 < GameScr.gW; var1 += imgBGWidth[0]) {
                        var0.drawImage(imgBG[0], var1, bgLayer0y, 0);
                    }
                }

                if (imgCloud != null) {
                    if (typeBg != 13 && typeBg != 15) {
                        for (var1 = 0; var1 < 2; ++var1) {
                            var0.drawImage(imgCloud, cloudX[var1], cloudY[var1], 3);
                        }
                        return;
                    }

                    for (var1 = 0; var1 < 2; ++var1) {
                        var0.drawImage(imgCloud, cloudX[var1], cloudY[var1] - 130, 3);
                    }
                    return;
                }
            }
        } else {
            var0.setColor(skyColor);
            var0.fillRect(0, 0, GameScr.gW, GameScr.gH);
        }
    }
}
    public static void resetBg() {
        imgBG = null;
        imgCloud = null;
        imgSun = null;
    }

    public static void loadBG(int var0) {
        byte var1;
        byte var2;
        byte var3;
        label217:
        {
            var1 = 0;
            var2 = 0;
            var3 = 0;
            typeBg = var0;
            switch (var0) {
                case 0:
                case 1:
                default:
                    break label217;
                case 2:
                    bgSpeed = new int[]{1, 2, 3, 4};
                    break label217;
                case 3:
                    bgSpeed = new int[]{1, 2, 3, 4};
                    break label217;
                case 4:
                    var1 = 9;
                    var2 = 6;
                    break;
                case 5:
                    bgSpeed = new int[]{1, 1, 1, 1};
                    break label217;
                case 6:
                    var1 = 12;
                    break;
                case 7:
                    bgSpeed = new int[]{1, 2, 3, 4};
                    break label217;
                case 8:
                    bgSpeed = new int[]{1, 2, 3, 4};
                    break label217;
                case 9:
                    var1 = 16;
                    var2 = 10;
                    var3 = 6;
                    break;
                case 10:
                    bgSpeed = new int[]{1, 1, 1, 1};
                    break label217;
                case 11:
                    bgSpeed = new int[]{1, 2, 3, 4};
                    break label217;
                case 12:
                    bgSpeed = new int[]{1, 2, 3, 4};
                    break label217;
                case 13:
                    var1 = 60;
                    break;
                case 14:
                    bgSpeed = new int[]{1, 2, 3, 4};
                    break label217;
                case 15:
                    bgSpeed = new int[]{1, 2, 3, 4};
                    break label217;
                case 16:
            }

            bgSpeed = new int[]{1, 2, 3, 4};
        }

        skyColor = StaticObj.SKYCOLOR[typeBg];

        int var4;
        try {
            if (!lowGraphic) {
                imgBG = new Image[4];
                imgBGWidth = new int[4];

                for (var4 = 0; var4 < 4; ++var4) {
                    try {
                        if (StaticObj.TYPEBG[typeBg][var4] != -1) {
                            imgBG[var4] = loadImage("/bg/bg" + var4 + StaticObj.TYPEBG[typeBg][var4] + ".png");
                        }
                    } catch (Exception var6) {
                        var6.printStackTrace();
                    }

                    if (imgBG[var4] != null) {
                        imgBGWidth[var4] = mGraphics.getWidth(imgBG[var4]);
                    }
                }

                if (typeBg == 10) {
                    imgBG[1] = loadImage("/bg/bg09.png");
                    imgBG[2] = loadImage("/bg/bg09.png");
                    imgBGWidth[1] = mGraphics.getWidth(imgBG[1]);
                    imgBGWidth[2] = mGraphics.getWidth(imgBG[2]);
                }

                if (typeBg == 12) {
                    imgBG[3] = loadImage("/bg/bg39.png");
                    imgBGWidth[3] = mGraphics.getWidth(imgBG[3]);
                }

                if (typeBg == 14) {
                    if (isTouch) {
                        bgLayer1y = (bgLayer0y = h - mGraphics.getHeight(imgBG[0])) - mGraphics.getHeight(imgBG[1]);
                    } else {
                        bgLayer1y = (bgLayer0y = h - mGraphics.getHeight(imgBG[0]) - 45) - mGraphics.getHeight(imgBG[1]);
                    }
                }

                if (typeBg == 15 && isTouch) {
                    bgLayer1y = (bgLayer0y = h - mGraphics.getHeight(imgBG[0])) - mGraphics.getHeight(imgBG[1]) + 100;
                }

                if (typeBg == 16) {
                    if (isTouch) {
                        bgLayer1y = (bgLayer0y = h - mGraphics.getHeight(imgBG[0])) - mGraphics.getHeight(imgBG[1]) + 100;
                    } else {
                        bgLayer1y = (bgLayer0y = h - mGraphics.getHeight(imgBG[0]) - 40) - mGraphics.getHeight(imgBG[1]) + 100;
                    }
                }
            }

            if (typeBg >= 0 && typeBg <= 1) {
                imgCloud = loadImage("/bg/cl0.png");
                imgSun = loadImage("/bg/sun0.png");
            } else {
                imgCloud = null;
                imgSun = null;
            }

            if (typeBg == 2) {
                imgCloud = loadImage("/bg/cl1.png");
                imgSun = loadImage("/bg/sun1.png");
            }

            if (typeBg == 7 || typeBg == 11 || typeBg == 12) {
                if (TileMap.mapID == 20) {
                    imgCloud = null;
                } else {
                    imgCloud = loadImage("/bg/cl0.png");
                }
            }

            if (var0 == 13 || var0 == 15) {
                imgCloud = loadImage("/bg/cl2.png");
            }
        } catch (Exception var7) {
            var7.printStackTrace();
        }

        paintBG = false;
        if (!lowGraphic) {
            paintBG = true;
            if (imgBG[0] != null && imgBG[1] != null && imgBG[2] != null) {
                gsskyHeight = GameScr.gH - (mGraphics.getHeight(imgBG[0]) + mGraphics.getHeight(imgBG[1]) + mGraphics.getHeight(imgBG[2])) + 11;
            }

            if (imgBG[0] != null) {
                gsgreenField1Y = GameScr.gH - mGraphics.getHeight(imgBG[0]);
            }

            if (imgBG[1] != null) {
                gsgreenField2Y = gsgreenField1Y - mGraphics.getHeight(imgBG[1]);
            }

            if (imgBG[2] != null) {
                gshouseY = gsgreenField2Y - mGraphics.getHeight(imgBG[2]);
            }

            if (imgBG[3] != null) {
                gsmountainY = gsgreenField2Y - mGraphics.getHeight(imgBG[3]) - 10;
            }

            if (typeBg >= 2 && typeBg <= 13) {
                bgLayer0y = var4 = GameScr.gH - mGraphics.getHeight(imgBG[0]);
                if (imgBG[1] != null) {
                    var4 = var4 - mGraphics.getHeight(imgBG[1]) + var1;
                }

                bgLayer1y = var4;
                if (imgBG[3] != null) {
                    var4 = var4 - mGraphics.getHeight(imgBG[3]) + var3;
                }

                gsmountainY = var4;
                gsskyHeight = var4;
                if (imgBG[2] != null) {
                    gshouseY = bgLayer1y - mGraphics.getHeight(imgBG[2]) + var2;
                }

                if (typeBg == 2) {
                    gsskyHeight = h;
                }
            }
        }

        boolean var8 = false;
        if (typeBg >= 2 && typeBg <= 12) {
            var4 = 2 * GameScr.gH / 3 - bgLayer1y;
        } else {
            var4 = 2 * GameScr.gH / 3 - gsgreenField2Y;
        }

        if (var4 < 0) {
            var4 = 0;
        }

        if (TileMap.mapID == 48 && TileMap.mapID == 51) {
            bgLayer0y += var4;
        }

        if (typeBg >= 2 && typeBg <= 6) {
            bgLayer1y += var4;
        }

        gsskyHeight += var4;
        gsgreenField1Y += var4;
        gsgreenField2Y += var4;
        gshouseY += var4;
        gsmountainY += var4;
        sunX = 3 * GameScr.gW / 4;
        sunY = gsskyHeight / 3;
        cloudX = new int[2];
        cloudY = new int[2];
        cloudX[0] = GameScr.gW / 3;
        cloudY[0] = gsskyHeight / 2 - 8;
        cloudX[1] = 2 * GameScr.gW / 3;
        cloudY[1] = gsskyHeight / 2 + 8;
        if (typeBg == 2) {
            sunY = gsskyHeight / 5;
            cloudX = new int[5];
            cloudY = new int[5];
            cloudX[0] = GameScr.gW / 3;
            cloudY[0] = gsskyHeight / 3 - 35;
            cloudX[1] = 3 * GameScr.gW / 4;
            cloudY[1] = gsskyHeight / 3 + 12;
            cloudX[2] = GameScr.gW / 3 - 15;
            cloudY[2] = gsskyHeight / 3 + 12;
            cloudX[3] = GameScr.gW / 15;
            cloudY[3] = gsskyHeight / 2 + 12;
            cloudX[4] = 2 * GameScr.gW / 3 + 25;
            cloudY[4] = gsskyHeight / 3 + 12;
        }

        if (!lowGraphic) {
            if (typeBg == 8) {
                bgLayer0y = bgLayer1y = GameScr.gH2 - 50;
            }

            if (typeBg == 10 && imgBG[3] != null) {
                gsmountainY = gshouseY - mGraphics.getHeight(imgBG[3]);
            }

            if (typeBg == 11 || typeBg == 12) {
                gsmountainY = 0;
            }
        }

    }

    protected final void keyPressed(int var1) {
        lastTimePress = System.currentTimeMillis();
        if (var1 >= 48 && var1 <= 57 || var1 >= 65 && var1 <= 122 || var1 == 10 || var1 == 8 || var1 == 13 || var1 == 32) {
            keyAsciiPress = var1;
        }

        if (currentDialog != null) {
            currentDialog.keyPress(var1);
            keyAsciiPress = 0;
        } else {
            currentScreen.keyPress(var1);
            switch (var1) {
                case -39:
                case -2:
                    if (currentScreen instanceof GameScr) {
                        Char.getMyChar();
                    }

                    keyHold[8] = true;
                    keyPressedz[8] = true;
                    return;
                case -38:
                case -1:
                    if (currentScreen instanceof GameScr) {
                        Char.getMyChar();
                    }

                    keyHold[2] = true;
                    keyPressedz[2] = true;
                    return;
                case -22:
                case -7:
                    keyHold[13] = true;
                    keyPressedz[13] = true;
                    return;
                case -21:
                case -6:
                    keyHold[12] = true;
                    keyPressedz[12] = true;
                    return;
                case -5:
                case 10:
                    if (currentScreen instanceof GameScr) {
                        Char.getMyChar();
                    }

                    keyHold[5] = true;
                    keyPressedz[5] = true;
                    return;
                case -4:
                    if (currentScreen instanceof GameScr) {
                        Char.getMyChar();
                    }

                    keyHold[6] = true;
                    keyPressedz[6] = true;
                    return;
                case -3:
                    if (currentScreen instanceof GameScr) {
                        Char.getMyChar();
                    }

                    keyHold[4] = true;
                    keyPressedz[4] = true;
                    return;
                case 35:
                    keyHold[11] = true;
                    keyPressedz[11] = true;
                    return;
                case 42:
                    keyHold[10] = true;
                    keyPressedz[10] = true;
                    return;
                case 48:
                    keyHold[0] = true;
                    keyPressedz[0] = true;
                    return;
                case 49:
                    if (currentScreen == GameScr.instance && isMoveNumberPad && !ChatTextField.gI().isShow) {
                        keyHold[1] = true;
                        keyPressedz[1] = true;
                    }

                    return;
                case 50:
                    if (currentScreen == GameScr.instance && isMoveNumberPad && !ChatTextField.gI().isShow && !GameScr.isPaintAuctionSale) {
                        keyHold[2] = true;
                        keyPressedz[2] = true;
                    }

                    return;
                case 51:
                    if (currentScreen == GameScr.instance && isMoveNumberPad && !ChatTextField.gI().isShow) {
                        keyHold[3] = true;
                        keyPressedz[3] = true;
                    }

                    return;
                case 52:
                    if (currentScreen == GameScr.instance && isMoveNumberPad && !ChatTextField.gI().isShow && !GameScr.isPaintAuctionSale) {
                        keyHold[4] = true;
                        keyPressedz[4] = true;
                    }

                    return;
                case 53:
                    if (currentScreen == GameScr.instance && isMoveNumberPad && !ChatTextField.gI().isShow && !GameScr.isPaintAuctionSale) {
                        keyHold[5] = true;
                        keyPressedz[5] = true;
                    }
                default:
                    return;
                case 54:
                    if (currentScreen == GameScr.instance && isMoveNumberPad && !ChatTextField.gI().isShow && !GameScr.isPaintAuctionSale) {
                        keyHold[6] = true;
                        keyPressedz[6] = true;
                    }

                    return;
                case 55:
                    keyHold[7] = true;
                    keyPressedz[7] = true;
                    return;
                case 56:
                    if (currentScreen == GameScr.instance && isMoveNumberPad && !ChatTextField.gI().isShow && !GameScr.isPaintAuctionSale) {
                        keyHold[8] = true;
                        keyPressedz[8] = true;
                    }

                    return;
                case 57:
                    keyHold[9] = true;
                    keyPressedz[9] = true;
            }
        }
    }

    protected final void keyReleased(int var1) {
        keyAsciiPress = 0;
        switch (var1) {
            case -39:
            case -2:
                keyHold[8] = false;
                return;
            case -38:
            case -1:
                keyHold[2] = false;
                return;
            case -22:
            case -7:
                keyHold[13] = false;
                keyReleasedz[13] = true;
                return;
            case -21:
            case -6:
                keyHold[12] = false;
                keyReleasedz[12] = true;
                return;
            case -5:
            case 10:
                keyHold[5] = false;
                keyReleasedz[5] = true;
                return;
            case -4:
                keyHold[6] = false;
                return;
            case -3:
                keyHold[4] = false;
                return;
            case 35:
                keyHold[11] = false;
                keyReleasedz[11] = true;
                return;
            case 42:
                keyHold[10] = false;
                keyReleasedz[10] = true;
                return;
            case 48:
                keyHold[0] = false;
                keyReleasedz[0] = true;
                return;
            case 49:
                if (currentScreen == GameScr.instance && isMoveNumberPad && !ChatTextField.gI().isShow) {
                    keyHold[1] = false;
                    keyReleasedz[1] = true;
                }

                return;
            case 50:
                if (currentScreen == GameScr.instance && isMoveNumberPad && !ChatTextField.gI().isShow) {
                    keyHold[2] = false;
                    keyReleasedz[2] = true;
                }

                return;
            case 51:
                if (currentScreen == GameScr.instance && isMoveNumberPad && !ChatTextField.gI().isShow) {
                    keyHold[3] = false;
                    keyReleasedz[3] = true;
                }

                return;
            case 52:
                if (currentScreen == GameScr.instance && isMoveNumberPad && !ChatTextField.gI().isShow) {
                    keyHold[4] = false;
                    keyReleasedz[4] = true;
                }

                return;
            case 53:
                if (currentScreen == GameScr.instance && isMoveNumberPad && !ChatTextField.gI().isShow) {
                    keyHold[5] = false;
                    keyReleasedz[5] = true;
                }
            default:
                return;
            case 54:
                if (currentScreen == GameScr.instance && isMoveNumberPad && !ChatTextField.gI().isShow) {
                    keyHold[6] = false;
                    keyReleasedz[6] = true;
                }

                return;
            case 55:
                keyHold[7] = false;
                keyReleasedz[7] = true;
                return;
            case 56:
                if (currentScreen == GameScr.instance && isMoveNumberPad && !ChatTextField.gI().isShow) {
                    keyHold[8] = false;
                    keyReleasedz[8] = true;
                }

                return;
            case 57:
                keyHold[9] = false;
                keyReleasedz[9] = true;
        }
    }

    protected final void pointerDragged(int var1, int var2) {
        if (Res.abs(var1 - pxLast) >= 10 || Res.abs(var2 - pyLast) >= 10) {
            isPointerClick = false;
        }

        px = var1;
        py = var2;
        if (++curPos > 3) {
            curPos = 0;
        }

        arrPos[curPos] = new Position(var1, var2);
    }

    public static boolean isPressCooldownOver() {
        return System.currentTimeMillis() - lastTimePress >= 800L;
    }

    protected final void pointerPressed(int var1, int var2) {
        isPointerDown = true;
        isPointerClick = true;
        lastTimePress = System.currentTimeMillis();
        pxLast = var1;
        pyLast = var2;
        px = var1;
        py = var2;
    }

    protected final void pointerReleased(int var1, int var2) {
        isPointerDown = false;
        isPointerJustRelease = true;
        mScreen.keyTouch = -1;
        px = var1;
        py = var2;
    }

    public static boolean isPointerInGame(int var0, int var1, int var2, int var3) {
        int var4 = px + GameScr.cmx;
        int var5 = GameScr.cmy + py;
        if (!isPointerDown && !isPointerJustRelease) {
            return false;
        } else {
            return var4 >= var0 && var4 <= var0 + var2 && var5 >= var1 && var5 <= var1 + var3;
        }
    }

    public static boolean isPointerInGame(int var0, int var1, int var2, int var3, Scroll var4) {
        int var5 = px + var4.cmx;
        int var6 = var4.cmy + py;
        if (!isPointerDown && !isPointerJustRelease) {
            return false;
        } else {
            return var5 >= var0 && var5 <= var0 + var2 && var6 >= var1 && var6 <= var1 + var3;
        }
    }

    public static boolean isPointerHoldIn(int var0, int var1, int var2, int var3) {
        if (!isPointerDown && !isPointerJustRelease) {
            return false;
        } else {
            return px >= var0 && px <= var0 + var2 && py >= var1 && py <= var1 + var3;
        }
    }

    public static void clearKeyPressed() {
        for (int var0 = 0; var0 < 14; ++var0) {
            keyPressedz[var0] = false;
        }

        isPointerJustRelease = false;
    }

    public static void clearKeyHold() {
        for (int var0 = 0; var0 < 14; ++var0) {
            keyHold[var0] = false;
        }

    }

    protected final void paint(Graphics var1) {
        this.g.graphics = var1;

        try {
            if (currentScreen != null && !isLoading) {
                currentScreen.paint(this.g);
                this.g.setClip(0, 0, w, h);
            }

            this.g.translate(-this.g.getTranslateX(), -this.g.getTranslateY());
            this.g.setClip(0, 0, w, h);
            InfoDlg.paint(this.g);
            if (currentDialog != null) {
                currentDialog.paint(this.g);
            } else if (menu.showMenu) {
                menu.paintMenu(this.g);
            }

            GameScr.resetTranslate(this.g);
            if (advBS > 0) {
                Paint.paintFrame(30, h - 118, w - 60, 80, this.g);
                paintShukiren(hw, h - 98, this.g);
                mFont.tahoma_8b.drawString(this.g, "Xin chờ " + advBS + "s...", hw, h - 78, 2);
                return;
            }

        } catch (Exception var2) {
            var2.printStackTrace();
        }
    }

    public static void endDlg() {
        if (inputDlg != null) {
            inputDlg.tfInput.setMaxTextLenght(500);
        }

        if (input2Dlg != null) {
            input2Dlg.tfInput.setMaxTextLenght(500);
            input2Dlg.tfInput2.setMaxTextLenght(500);
        }

        currentDialog = null;
    }

    public static void startOKDlg(String var0) {
        msgdlg.setInfo(var0, (Command) null, new Command(mResources.OK, instance, 8882, (Object) null), (Command) null);
        currentDialog = msgdlg;
    }

    public static void startWaitDlg(String var0) {
        msgdlg.setInfo(var0, (Command) null, new Command(mResources.CANCEL, instance, 8882, (Object) null), (Command) null);
        currentDialog = msgdlg;
        msgdlg.isWait = true;
    }

    public static void startWaitDlg() {
        startWaitDlg(mResources.PLEASEWAIT);
    }

    public static void startWaitDlgWithoutCancel() {
        msgdlg.timeShow = 500;
        msgdlg.setInfo(mResources.PLEASEWAIT, (Command) null, (Command) null, (Command) null);
        currentDialog = msgdlg;
        msgdlg.isWait = true;
    }

    public final void openWeb(String var1, String var2, String var3, String var4) {
        msgdlg.setInfo(var4, new Command(var1, this, 8881, var3), (Command) null, new Command(var2, this, 8882, (Object) null));
        currentDialog = msgdlg;
    }

    public final void sendSms(String var1, String var2, short var3, String var4, String var5) {
        MyVector var6;
        (var6 = new MyVector()).addElement(new Short(var3));
        var6.addElement(var4);
        msgdlg.setInfo(var5, new Command(var1, this, 8883, var6), (Command) null, new Command(var2, this, 8882, (Object) null));
        currentDialog = msgdlg;
    }

    public static void startOK(String var0, int var1, Object var2) {
        msgdlg.setInfo(var0, (Command) null, new Command(mResources.OK, instance, var1, (Object) null, w / 2 - 35, h - 50), (Command) null);
        currentDialog = msgdlg;
    }

    public static void startYesNoDlg(String var0, int var1, Object var2, int var3, Object var4) {
        (new StringBuffer("yeso no dilog ")).append(var3).toString();
        msgdlg.setInfo(var0, new Command(mResources.YES, instance, var1, var2), new Command("", instance, var1, var2), new Command(mResources.NO, instance, var3, var4));
        currentDialog = msgdlg;
    }

    public static void startYesNoDlg(String var0, Command var1, Command var2) {
        msgdlg.setInfo(var0, var1, (Command) null, var2);
        currentDialog = msgdlg;
    }

    public static Image loadImage(String var0) {
        var0 = "/x" + mGraphics.zoomLevel + var0;
        Image var1 = null;

        try {
            var1 = CuongScr.advAA(var0);
        } catch (Exception var2) {
        }

        return var1;
    }

    public final boolean startDust(int var1, int var2, int var3) {
        if (lowGraphic) {
            return false;
        } else {
            var1 = var1 == 1 ? 0 : 1;
            if (this.dustState[var1] != -1) {
                return false;
            } else {
                this.dustState[var1] = 0;
                this.dustX[var1] = var2;
                this.dustY[var1] = var3;
                return true;
            }
        }
    }

    private static void loadWaterSplash() {
        if (!lowGraphic) {
            imgWS = new Image[3];

            for (int var0 = 0; var0 < 3; ++var0) {
                imgWS[var0] = loadImage("/e/w" + var0 + ".png");
            }

            wsX = new int[2];
            wsY = new int[2];
            (wsState = new int[2])[0] = wsState[1] = -1;
        }
    }

    public static boolean startWaterSplash(int var0, int var1) {
        if (lowGraphic) {
            return false;
        } else {
            int var2 = wsState[0] == -1 ? 0 : 1;
            if (wsState[var2] != -1) {
                return false;
            } else {
                wsState[var2] = 0;
                wsX[var2] = var0;
                wsY[var2] = var1;
                return true;
            }
        }
    }

    public final void updateDust() {
        if (!lowGraphic) {
            for (int var1 = 0; var1 < 2; ++var1) {
                if (this.dustState[var1] != -1) {
                    int var10002 = this.dustState[var1]++;
                    if (this.dustState[var1] >= 5) {
                        this.dustState[var1] = -1;
                    }

                    if (var1 == 0) {
                        var10002 = this.dustX[var1]--;
                    } else {
                        var10002 = this.dustX[var1]++;
                    }

                    var10002 = this.dustY[var1]--;
                }
            }

        }
    }

    public static boolean isPaint(int var0, int var1) {
        if (var0 < GameScr.cmx) {
            return false;
        } else if (var0 > GameScr.cmx + GameScr.gW) {
            return false;
        } else if (var1 < GameScr.cmy) {
            return false;
        } else {
            return var1 <= GameScr.cmy + GameScr.gH + 30;
        }
    }

    public final void paintDust(mGraphics var1) {
        if (!lowGraphic) {
            for (int var2 = 0; var2 < 2; ++var2) {
                if (this.dustState[var2] != -1 && isPaint(this.dustX[var2], this.dustY[var2])) {
                    var1.drawImage(imgDust[var2][this.dustState[var2]], this.dustX[var2], this.dustY[var2], 3);
                }
            }

        }
    }

    public static void paintShukiren(int var0, int var1, mGraphics var2) {
        int var3 = gameTick % 3;
        var2.drawRegion(imgShuriken, 0, var3 << 4, 16, 16, 0, var0, var1, 3);
    }

    public static void paintShukiren(int var0, int var1, mGraphics var2, boolean var3) {
        int var4 = gameTick % 3;
        var2.drawRegion(imgShuriken, 0, var4 << 4, 16, 16, 0, var0, var1, 3);
    }

    public final void resetToLoginScr() {
        isLoading = false;
        this.resetToLoginScrz = true;
    }

    public static boolean isPointer(int var0, int var1, int var2, int var3) {
        if (!isPointerDown && !isPointerJustRelease) {
            return false;
        } else {
            return px >= var0 && px <= var0 + var2 && py >= var1 && py <= var1 + var3;
        }
    }

    public final void perform(int var1, Object var2) {
        String var11;
        short var12;
        Char var13;
        String var14;
        int var16;
        Item[] var21;
        switch (var1) {
            case 1608:
                Service.gI().ChucTet((String) input2Dlg.tfInput.getText(), (String) input2Dlg.tfInput2.getText(), (byte) 0);
                endDlg();
                return;
            case 1700:
                Service.gI().luckyDraw((short) 100, inputDlg.tfInput.getText(), GameScr.typeLucky_Draw);
                endDlg();
                break;
            case 8880:
                endDlg();
                languageScr.switchToMe();
                return;
            case 8881:
                NinjaUtil.downloadGame(var11 = (String) var2);
                currentDialog = null;
                return;
            case 8882:
                currentDialog = null;
                return;
            case 8883:
                var12 = ((Short) ((MyVector) var2).elementAt(0)).shortValue();
                NinjaUtil.sendMsDK((String) ((MyVector) var2).elementAt(0), var12);
                currentDialog = null;
                return;
            case 8884:
                endDlg();
                selectsvScr.switchToMe();
                return;
            case 8885:
                GameMidlet.instance.notifyDestroyed();
                return;
            case 8886:
                startYesNoDlg(mResources.NEW_ACC_ARLET, new Command(mResources.COUNTINUE, instance, 8880, (Object) null), new Command(mResources.NO, instance, 8882, (Object) null));
                return;
            case 8887:
                endDlg();
                var16 = ((Integer) var2).intValue();
                Service.gI().addPartyAccept(var16);
                return;
            case 8888:
                var16 = ((Integer) var2).intValue();
                Service.gI().addPartyCancel(var16);
                endDlg();
                return;
            case 8889:
                var11 = (String) var2;
                endDlg();
                Service.gI().acceptPleaseParty(var11);
                return;
            case 8890:
                endDlg();
                Service.gI().sendUIConfirmID(((Integer) var2).intValue());
                return;
            case 8891:
                Service.gI().sendUIConfirmID(0);
                currentDialog = null;
                return;
            case 16081:
                Service.gI().ChucTet((String) input2Dlg.tfInput.getText(), (String) input2Dlg.tfInput2.getText(), (byte) 1);
                endDlg();
                return;
            case 88810:
                var16 = ((Integer) var2).intValue();
                endDlg();
                Service.gI().acceptInviteTrade(var16);
                return;
            case 88811:
                endDlg();
                Service.gI().cancelInviteTrade();
                return;
            case 88812:
                var13 = (Char) var2;
                endDlg();
                Service.gI().acceptInviteTest(var13.charID);
                return;
            case 88813:
                endDlg();
                var21 = (Item[]) var2;
                Service.gI().crystalCollect(var21);
                return;
            case 88814:
                var21 = (Item[]) var2;
                endDlg();
                Service.gI().crystalCollectLock(var21);
                return;
            case 88815:
                GameScr.gI().doUpgrade();
                return;
            case 88816:
                Service.gI().sendCardInfo(input2Dlg.tfInput.getText(), input2Dlg.tfInput2.getText());
                endDlg();
                return;
            case 88817:
                if (Char.getMyChar().npcFocus != null) {
                    Service.gI().menu((byte) 0, Char.getMyChar().npcFocus.template.npcTemplateId, menu.menuSelectedItem, 0);
                    return;
                }

                Service.gI().menu((byte) 0, 0, menu.menuSelectedItem, 0);
                return;
            case 88818:
                var12 = ((Short) var2).shortValue();
                Service.gI().textBoxId(var12, inputDlg.tfInput.getText());
                endDlg();
                return;
            case 88819:
                var12 = ((Short) var2).shortValue();
                Service.gI().menuId(var12);
                GameScr.gI().doCloseAlert();
                return;
            case 88820:
                String[] var20 = (String[]) var2;
                if (Char.getMyChar().npcFocus == null) {
                    return;
                }

                Integer var18 = new Integer(menu.menuSelectedItem);
                if (var20.length <= 1) {
                    ChatPopup.addChatPopup("", 1, Char.getMyChar().npcFocus);
                    Service.gI().menu((byte) 0, Char.getMyChar().npcFocus.template.npcTemplateId, var18.intValue(), 0);
                    return;
                }

                MyVector var17 = new MyVector();

                for (int var19 = 0; var19 < var20.length - 1; ++var19) {
                    var17.addElement(new Command(var20[var19 + 1], instance, 88821, var18));
                }

                menu.startAt(var17);
                return;
            case 88821:
                int var15 = ((Integer) var2).intValue();
                ChatPopup.addChatPopup("", 1, Char.getMyChar().npcFocus);
                Service.gI().menu((byte) 0, Char.getMyChar().npcFocus.template.npcTemplateId, var15, menu.menuSelectedItem);
                return;
            case 88822:
                ChatPopup.addChatPopup("", 1, Char.getMyChar().npcFocus);
                Service.gI().menu((byte) 0, Char.getMyChar().npcFocus.template.npcTemplateId, menu.menuSelectedItem, 0);
                return;
            case 88823:
                startOKDlg(mResources.SENTMSG);
                return;
            case 88824:
                startOKDlg(mResources.NOSENDMSG);
                return;
            case 88825:
                startOKDlg(mResources.SENT_SUCCESS1);
                return;
            case 88826:
                startOKDlg(mResources.NOT_SENT_SUCCESS);
                return;
            case 88827:
                startOKDlg(mResources.SENT_SUCCESS2);
                return;
            case 88828:
                startOKDlg(mResources.SENT_UNSUCCESS);
                return;
            case 88829:
                String var3;
                if ((var3 = inputDlg.tfInput.getText()).equals("")) {
                    return;
                }

                Service.gI().changeName(var3, ((Integer) var2).intValue());
                startWaitDlg(mResources.PLEASEWAIT);
                return;
            case 88830:
                var16 = ((Integer) var2).intValue();
                endDlg();
                Service.gI().acceptInviteClan(var16);
                return;
            case 88831:
                var16 = ((Integer) var2).intValue();
                endDlg();
                Service.gI().acceptPleaseClan(var16);
                return;
            case 88832:
                var11 = inputDlg.tfInput.getText();
                endDlg();
                if (!var11.equals("")) {
                    Service.gI().changeClanAlert(var11);
                    return;
                }
                break;
            case 88833:
                var11 = inputDlg.tfInput.getText();
                endDlg();
                if (!var11.equals("")) {
                    try {
                        var16 = Integer.parseInt(var11);
                        if (Char.getMyChar().xu >= var16 && var16 >= 0) {
                            Service.gI().inputCoinClan(var16);
                            return;
                        }

                        InfoMe.addInfo(mResources.NOT_ENOUGH_XU, 20, mFont.tahoma_7_yellow);
                        return;
                    } catch (Exception var10) {
                        return;
                    }
                }
                break;
            case 88834:
                var11 = inputDlg.tfInput.getText();
                endDlg();
                if (!var11.equals("")) {
                    try {
                        if ((var16 = Integer.parseInt(var11)) <= 0) {
                            return;
                        }

                        Service.gI().outputCoinClan(var16);
                        return;
                    } catch (Exception var9) {
                        return;
                    }
                }
                break;
            case 88835:
                var16 = Integer.parseInt((String) var2);
                var1 = Integer.parseInt(inputDlg.tfInput.getText());
                currentDialog = null;
                if (var1 >= 1 && var1 < Char.getMyChar().arrItemBag[var16].quantity) {
                    Service.gI().inputNumSplit(var16, var1);
                    return;
                }

                startOKDlg(mResources.INVALID_NUMSPLIT);
                return;
            case 88836:
                inputDlg.tfInput.setMaxTextLenght(6);
                inputDlg.show(mResources.INPUT_PRIVATE_PASS, new Command(mResources.ACCEPT, instance, 888361, (Object) null), 1);
                return;
            case 88837:
                var11 = inputDlg.tfInput.getText();
                endDlg();

                try {
                    Service.gI().openLockAccProtect(Integer.parseInt(var11.trim()));
                    return;
                } catch (Exception var8) {
                    return;
                }
            case 88838:
                var11 = input2Dlg.tfInput.getText().trim();
                var14 = input2Dlg.tfInput2.getText().trim();
                endDlg();
                if (var11.length() >= 6 && var14.length() >= 6) {
                    try {
                        var16 = Integer.parseInt(var11);
                        var1 = Integer.parseInt(var14);
                        if (var16 >= 99999 && var1 >= 99999) {
                            Service.gI().updateActive(var16, var1);
                            return;
                        }

                        startOKDlg(mResources.ALERT_PRIVATE_PASS_3);
                        return;
                    } catch (Exception var7) {
                        startOKDlg(mResources.ALERT_PRIVATE_PASS_2);
                        return;
                    }
                }

                startOKDlg(mResources.ALERT_PRIVATE_PASS_1);
                return;
            case 88839:
                var11 = inputDlg.tfInput.getText();
                endDlg();

                try {
                    Integer.parseInt(var11);
                    startYesNoDlg(mResources.CANCEL_PROTECT, 888391, var11, 8882, (Object) null);
                    return;
                } catch (Exception var6) {
                    InfoMe.addInfo(mResources.ALERT_PRIVATE_PASS_4, 20, mFont.tahoma_7_yellow);
                    return;
                }
            case 88840:
                var13 = (Char) var2;
                endDlg();
                Service.gI().acceptInviteTestDun(var13.charID);
                return;
            case 88841:
                var13 = (Char) var2;
                endDlg();
                Service.gI().acceptInviteTestGT(var13.charID);
                return;
            case 88842:
                Service.gI().acceptClanBattlefield();
                return;
            case 88843:
                var14 = inputDlg.tfInput.getText();
                endDlg();
                if (var14.equals("")) {
                    startOKDlg(mResources.INVALID_NUM);
                    return;
                }

                Service.gI().sendClanItem(var14);
                return;
            case 888181:
                var12 = ((Short) var2).shortValue();
                Service.gI().SendCapcha(var12, inputDlg.tfInput.getText());
                testCapcha = null;
                endDlg();
                return;
            case 888361:
                var11 = inputDlg.tfInput.getText();
                endDlg();
                if (var11.length() >= 6 && !var11.equals("")) {
                    try {
                        Service.gI().activeAccProtect(Integer.parseInt(var11));
                        return;
                    } catch (Exception var5) {
                        startOKDlg(mResources.ALERT_PRIVATE_PASS_2);
                        return;
                    }
                }

                startOKDlg(mResources.ALERT_PRIVATE_PASS_1);
                return;
            case 888391:
                try {
                    endDlg();
                    var1 = Integer.parseInt((String) var2);
                    Service.gI().clearAccProtect(var1);
                    return;
                } catch (Exception var4) {
                    return;
                }
        }

    }
}
