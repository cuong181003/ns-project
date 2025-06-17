
public final class LanguageScr extends mScreen implements IActionListener {

    private int popupW;
    private int popupH;
    private int popupX;
    private int popupY;
    private int indexRow = -1;

    public final void switchToMe() {
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

        super.center = new Command(GameCanvas.isTouch ? "" : mResources.OK, this, 1000, (Object) null);
        super.right = new Command(mResources.EXIT, GameCanvas.instance, 8885, (Object) null);
        this.indexRow = -1;
        if (!GameCanvas.isTouch) {
            this.indexRow = 0;
        }

        if (GameCanvas.isTouch && GameCanvas.w >= 320) {
            super.center.x = GameCanvas.w / 2 - 35;
            super.right.x = GameCanvas.w / 2 + 88;
            super.center.y = super.right.y = GameCanvas.h - 26;
        }

    }

    public final void paint(mGraphics var1) {
        var1.setColor(0);
        var1.fillRect(0, 0, GameCanvas.w, GameCanvas.h);
        GameCanvas.paintBGGameScr(var1);
        Paint.paintFrame(this.popupX, this.popupY, this.popupW, this.popupH, var1);
        var1.setColor(Paint.COLORDARK);
        var1.fillRoundRect(GameCanvas.hw - mFont.tahoma_8b.getWidth(mResources.LANGUAGE) / 2 - 12, this.popupY + 7, mFont.tahoma_8b.getWidth(mResources.LANGUAGE) + 22, 24, 6, 6);
        var1.setColor(Paint.COLORLIGHT);
        var1.drawRoundRect(GameCanvas.hw - mFont.tahoma_8b.getWidth(mResources.LANGUAGE) / 2 - 12, this.popupY + 7, mFont.tahoma_8b.getWidth(mResources.LANGUAGE) + 22, 24, 6, 6);
        mFont.tahoma_8b.drawString(var1, mResources.LANGUAGE, GameCanvas.hw, this.popupY + 12, 2);
        String[] var2 = mResources.LANGUAGES;
        int var3 = this.popupY + 50;

        for (int var4 = 0; var4 < var2.length; ++var4) {
            var1.setColor(Paint.COLORDARK);
            var1.fillRect(this.popupX + 10, var3 + var4 * 35, this.popupW - 20, 28);
            var1.setColor(5720393);
            var1.drawRect(this.popupX + 10, var3 + var4 * 35, this.popupW - 20, 28);
            if (var4 == this.indexRow) {
                var1.setColor(Paint.COLORLIGHT);
                var1.fillRect(this.popupX + 10, var3 + var4 * 35, this.popupW - 20, 28);
                var1.setColor(11053224);
                var1.drawRect(this.popupX + 10, var3 + var4 * 35, this.popupW - 20, 28);
            }

            mFont.tahoma_7b_white.drawString(var1, var2[var4], this.popupX + this.popupW / 2, var3 + var4 * 35 + 8, 2);
        }

        super.paint(var1);
        Paint.paintCmdBar(var1, super.left, super.center, super.right);
    }

    public final void update() {
        if (++GameScr.cmx > GameCanvas.w * 3 + 100) {
            GameScr.cmx = 100;
        }

        super.update();
    }

    public final void updateKey() {
        if (GameCanvas.keyPressedz[2] || GameCanvas.keyPressedz[4] || GameCanvas.keyPressedz[6] || GameCanvas.keyPressedz[8]) {
            this.indexRow = this.indexRow == 0 ? 1 : 0;
        }

        if (GameCanvas.isPointerJustRelease && GameCanvas.isPointerHoldIn(this.popupX + 10, this.popupY + 45, this.popupW - 10, 70)) {
            if (GameCanvas.isPointerClick) {
                this.indexRow = (GameCanvas.py - (this.popupY + 45)) / 35;
            }

            this.perform(1000, (Object) null);
        }

        super.updateKey();
        GameCanvas.clearKeyPressed();
    }

    public final void perform(int var1, Object var2) {
        switch (var1) {
            case 1000:
                GameCanvas.currentDialog = null;
                var1 = mResources.languageID = this.indexRow == 0 ? 0 : 1;
                RMS.saveRMSInt("indLanguage", var1);
                mResources.loadLanguage();
                RMS.clearRMS();
                GameCanvas.initGameCanvas();
                GameCanvas.selectsvScr.switchToMe();
            default:
        }
    }
}
