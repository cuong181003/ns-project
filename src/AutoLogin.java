
public final class AutoLogin implements Runnable {

    public static Session_ME advAA;

    AutoLogin(Session_ME var1) {
        this.advAA = var1;
    }

    public final void run() {
        do {
            try {
                GameCanvas.startWaitDlgWithoutCancel();
                this.advAA.close();
                Thread.sleep(5000L);
                this.advAA.connect(Session_ME.IP, Session_ME.PORT);
                GameMidlet.serverLogin = Session_ME.serverLogin;
                Service.gI().login(SelectServerScr.uname, SelectServerScr.pass, "2.1.7");
                Session_ME.advAA(15000L);
                Service.gI().selectCharToPlay(SelectCharScr.gI().name[0]);
                Session_ME.advAA(5000L);
            } catch (InterruptedException var1) {
                var1.printStackTrace();
            }
        } while (Session_ME.nsoAP && GameCanvas.currentScreen != GameScr.instance);

    }
}
