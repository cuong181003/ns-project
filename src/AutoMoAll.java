public final class AutoMoAll implements Runnable {
   private final Item advAA;

   AutoMoAll(Item var1) {
      this.advAA = var1;
   }

   public final void run() {
      try {
         for(int var1 = 0; var1 < this.advAA.quantity && Char.getBagNum() > 0; ++var1) {
            if (!(GameCanvas.currentScreen instanceof GameScr)) {
               return;
            }

            Service.gI().useItem(this.advAA.indexUI);
            Thread.sleep(20L);
         }
      } catch (InterruptedException var2) {
      }

   }
}
