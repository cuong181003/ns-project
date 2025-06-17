public final class AutoDelItem implements Runnable {
   AutoDelItem() {
   }

   public final void run() {
      try {
         Char var1 = Char.getMyChar();

         for(int var2 = 0; var2 < var1.arrItemBag.length; ++var2) {
            Item var3;
            if (Code.advAD(var3 = var1.arrItemBag[var2])) {
               Service.gI().delItem(var3.indexUI, 1);
            }
         }

      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }
}
