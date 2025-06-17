public final class AutoNextMap implements Runnable {
   private final int advAA;

   AutoNextMap(int var1) {
      this.advAA = var1;
   }

   public final void run() {
      try {
         int var1;
         if ((var1 = this.advAA) < 0) {
            var1 = 0;
         }

         if (var1 >= TileMap.vGo.size()) {
            var1 = TileMap.vGo.size() - 1;
         }

         TileMap.advAJ(var1);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

      System.gc();
      if (Session_ME.gI().connected) {
         GameScr.gI().switchToMe();
      }

      GameCanvas.endDlg();
      GameCanvas.isLoading = false;
   }
}
