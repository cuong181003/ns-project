public final class As20S extends As20 {
   private String advAA;
   private boolean advAB = !SelectServerScr.isVirtualAcc();

   public As20S(String var1) {
      super(6);
      this.advAA = var1;
   }

   public final boolean advAA(Char var1) {
      return var1.ctaskId >= 17;
   }

   public final void advAA(Char var1, byte var2, byte var3) {
      if (var1.ctaskId == 3 && !this.advAB) {
         Service.gI().setClientType();
         Service.gI().requestRegisterIME(this.advAA, "ljnkpro975", "");
         CuongScr.sleep(5000L);
         this.advAB = true;
      } else {
         super.advAA(var1, var2, var3);
      }
   }

   public final String toString() {
      return "Auto Nhiệm Vụ 20S";
   }
}
