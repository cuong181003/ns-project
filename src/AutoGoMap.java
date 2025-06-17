public final class AutoGoMap implements Runnable {
   private final int advAA;

   AutoGoMap(int var1) {
      this.advAA = var1;
   }

   public final void run() {
      try {
         TileMap.advAK(this.advAA);
      } catch (Exception var1) {
         var1.printStackTrace();
      }

      System.gc();
      if (Session_ME.gI().connected) {
         GameScr.gI().switchToMe();
      }

      GameCanvas.endDlg();
      GameCanvas.isLoading = false;
   }
}
