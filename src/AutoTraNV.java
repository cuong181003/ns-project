public final class AutoTraNV extends As10 {
   private int advAA;

   public AutoTraNV() {
      this.advAA = Char.getMyChar().ctaskId;
   }

   public final boolean advAA(Char var1) {
      return var1.ctaskId > this.advAA;
   }

   public final void advAA(Char var1, byte var2, byte var3) {
   }

   public final String toString() {
      return "Trả NV";
   }
}
