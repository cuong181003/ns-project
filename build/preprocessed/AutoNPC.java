public final class AutoNPC implements Runnable {
   private final int advAA;
   private final int advAB;
   private final int advAC;

   AutoNPC(int var1, int var2, int var3) {
      this.advAA = var1;
      this.advAB = var2;
      this.advAC = var3;
   }

   public final void run() {
      GameScr.advAH(33);
      Service.gI().openMenu(33);

      for(int var1 = 0; var1 < this.advAA; ++var1) {
         Service.gI().menu((byte)0,33, this.advAB, this.advAC);

         try {
            Thread.sleep(20L);
         } catch (InterruptedException var2) {
         }
      }

   }
}
