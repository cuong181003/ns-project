
public final class SplashScr extends mScreen {

    public static int splashScrStat;

    public final void update() {
        if (splashScrStat++ > 5) {
            if (RMS.loadRMSInt("indLanguage") <= 0) {
                GameCanvas.initGameCanvas();
                GameCanvas.selectsvScr.switchToMe();
            } else {
                GameCanvas.initGameCanvas();
                GameCanvas.languageScr.switchToMe();
            }
        }
    }
}
