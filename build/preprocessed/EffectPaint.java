public final class EffectPaint {
   public int index;
   public Mob eMob;
   public Char eChar;
   public EffectCharPaint effCharPaint;
   public boolean isFly;

   public final int getImgId() {
      return this.effCharPaint.arrEfInfo[this.index].idImg;
   }
}
