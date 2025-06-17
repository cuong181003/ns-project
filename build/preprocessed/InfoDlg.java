
public final class InfoDlg {

    static boolean isShow;
    private static String title;
    private static String subtitke;
    public static int delay;
    public static boolean isLock;
    int advAA;
    int advAB;
    int advAC;
    int advAD;
    private int advAG;
    private int advAH;
    private int advAI;
    private int advAJ;
    private int advAK = 28;
    private int advAL;
    private int advAM;
    private int advAN;
    private int advAO;
    private int advAP;
    private boolean advAQ = false;

    private static boolean advAE() {
        if (Char.getMyChar().statusMe != 3) {
            for (int var0 = 2; var0 > 0; --var0) {
                int var1;
                try {
                    if (Res.abs(GameCanvas.arrPos[var0].x - GameCanvas.arrPos[var0 - 1].x) <= 2) {
                        continue;
                    }

                    var1 = Res.abs(GameCanvas.arrPos[var0].y - GameCanvas.arrPos[var0 - 1].y);
                } catch (Exception var2) {
                    var2.printStackTrace();
                    return true;
                }

                if (var1 > 2) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void advAF() {
        GameCanvas.keyHold[1] = false;
        GameCanvas.keyHold[2] = false;
        GameCanvas.keyHold[3] = false;
        GameCanvas.keyHold[4] = false;
        GameCanvas.keyHold[6] = false;
    }

    public final void advAA() {
        if (GameCanvas.isPointerDown && !GameCanvas.isPointerJustRelease) {
            this.advAG = GameCanvas.pxLast;
            this.advAH = GameCanvas.pyLast;
            if (this.advAG <= (GameCanvas.w >> 1) - 100 && this.advAH >= GameCanvas.h >> 1) {
                if (!this.advAQ) {
                    this.advAA = this.advAC = this.advAG;
                    this.advAB = this.advAD = this.advAH;
                }

                this.advAQ = true;
                this.advAM = GameCanvas.px - this.advAA;
                this.advAN = GameCanvas.py - this.advAB;
                this.advAO = this.advAM * this.advAM + this.advAN * this.advAN;
                this.advAL = Res.advAF(this.advAO);
                if (Math.abs(this.advAM) > 4 || Math.abs(this.advAN) > 4) {
                    this.advAP = Res.angle(this.advAM, this.advAN);
                    if (!GameCanvas.isPointerHoldIn(this.advAA - this.advAK, this.advAB - this.advAK, this.advAK << 1, this.advAK << 1)) {
                        if (this.advAL != 0) {
                            this.advAD = this.advAN * this.advAK / this.advAL;
                            this.advAC = this.advAM * this.advAK / this.advAL;
                            this.advAC += this.advAA;
                            this.advAD += this.advAB;
                            if (!Res.advAA(this.advAA - this.advAK, this.advAB - this.advAK, this.advAK << 1, this.advAK << 1, this.advAC, this.advAD)) {
                                this.advAC = this.advAI;
                                this.advAD = this.advAJ;
                            } else {
                                this.advAI = this.advAC;
                                this.advAJ = this.advAD;
                            }
                        } else {
                            this.advAC = this.advAI;
                            this.advAD = this.advAJ;
                        }
                    } else {
                        this.advAC = GameCanvas.px;
                        this.advAD = GameCanvas.py;
                    }

                    advAF();
                    if (!advAE()) {
                        advAF();
                        return;
                    }

                    if (this.advAP <= 360 && this.advAP > 340 || this.advAP > 0 && this.advAP <= 90) {
                        GameScr.auto = 0;
                        GameCanvas.keyHold[6] = true;
                        GameCanvas.keyPressedz[6] = true;
                        return;
                    }

                    if (this.advAP > 290 && this.advAP <= 340) {
                        GameScr.auto = 0;
                        GameCanvas.keyHold[3] = true;
                        GameCanvas.keyPressedz[3] = true;
                        return;
                    }

                    if (this.advAP > 250 && this.advAP <= 290) {
                        GameScr.auto = 0;
                        GameCanvas.keyHold[2] = true;
                        GameCanvas.keyPressedz[2] = true;
                        return;
                    }

                    if (this.advAP > 200 && this.advAP <= 250) {
                        GameScr.auto = 0;
                        GameCanvas.keyHold[1] = true;
                        GameCanvas.keyPressedz[1] = true;
                        return;
                    }

                    if (this.advAP > 90 && this.advAP <= 200) {
                        GameScr.auto = 0;
                        GameCanvas.keyHold[4] = true;
                        GameCanvas.keyPressedz[4] = true;
                        return;
                    }
                }
            }
        } else {
            this.advAA = this.advAC = 50;
            this.advAB = this.advAD = GameCanvas.h - 50;
            this.advAQ = false;
            advAF();
        }

    }

    public static void show(String var0, String var1, int var2) {
        if (var0 != null) {
            isShow = true;
            title = var0;
            subtitke = var1;
            delay = var2;
        }
    }

    public static void showWait() {
        show(mResources.PLEASEWAIT, (String) null, 5000);
        isLock = true;
    }

    public static void showWait(String var0) {
        show(var0, (String) null, 5000);
        isLock = true;
    }

    public static void paint(mGraphics var0) {
        String var1 = title;
        if (TileMap.mapName1 != null) {
            var1 = TileMap.mapName1;
        }

        if (isShow) {
            if (!isLock || delay <= 4990) {
                if (!GameScr.isPaintAlert) {
                    Paint.paintFrame(GameCanvas.hw - 64, 10, 128, 40, var0);
                    if (isLock) {
                        GameCanvas.paintShukiren(GameCanvas.hw - mFont.tahoma_8b.getWidth(var1) / 2 - 10, 30, var0, false);
                        mFont.tahoma_8b.drawString(var0, var1, GameCanvas.hw + 5, 23, 2);
                    } else if (subtitke != null) {
                        mFont.tahoma_8b.drawString(var0, var1, GameCanvas.hw, 18, 2);
                        mFont.tahoma_7_white.drawString(var0, subtitke, GameCanvas.hw, 32, 2);
                    } else {
                        mFont.tahoma_8b.drawString(var0, var1, GameCanvas.hw, 23, 2);
                    }
                }
            }
        }
    }

    public static void hide() {
        title = "";
        subtitke = null;
        isLock = false;
        delay = 0;
        isShow = false;
    }
}
