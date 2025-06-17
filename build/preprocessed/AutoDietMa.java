
public final class AutoDietMa implements Runnable {

    private GameScr advAA;

    AutoDietMa(GameScr var1) {
        this.advAA = var1;
    }

    public final void run() {
        ChatPopup.addChatPopupMultiLine("Diệt ma", 1000, Char.getMyChar());

        for (int var1 = 0; var1 < 6; ++var1) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException var5) {
                var5.printStackTrace();
            }

            byte var2;
            if (this.advAA.advGN[var1 * 10 + 120] >>> 24 != 0) {
                var2 = 2;
            } else {
                int var6 = 0;
                int var3 = 0;

                int var4;
                for (var4 = 0; var4 < 10; ++var4) {
                    if (this.advAA.advGN[var1 * 10 + var4] >>> 24 != 0) {
                        ++var3;
                    }
                }

                for (var4 = 0; var4 < 10; ++var4) {
                    if (this.advAA.advGN[var1 * 10 + var4 * 60] >>> 24 != 0) {
                        ++var6;
                    }
                }

                if (var3 < var6) {
                    var2 = 1;
                } else {
                    var2 = 0;
                }
            }

            ChatPopup.addChatPopupMultiLine("Diệt ma: " + this.advAA.advGM[var2], 1000, Char.getMyChar());
            GameScr.advAA(this.advAA, var2);
        }

    }
}
