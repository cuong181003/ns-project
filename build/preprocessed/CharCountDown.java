public final class CharCountDown {
   long maxTime;
   public String nsoAB;
   public boolean nsoAC;
   public short nsoAD;
   public short nsoAE;
   private byte nsoAF;

   public CharCountDown(short var1, short var2, long var3, String var5, byte var6) {
      this.maxTime = System.currentTimeMillis() + var3 * 1000L;
      this.nsoAB = var5;
      this.nsoAD = var1;
      this.nsoAE = var2;
      this.nsoAF = var6;
      if (this.nsoAF == 0) {
         this.maxTime = var3;
      }

   }

   public final void nsoAA(mGraphics var1, int var2, int var3) {
      if (this.nsoAE == -1) {
         if (this.nsoAF != 1) {
            mFont.tahoma_7.drawString(var1, this.nsoAB, var2 + 1, var3 + 1, 1);
            mFont.tahoma_7_white.drawString(var1, this.nsoAB, var2, var3, 1);
            return;
         }

         int var4;
         if ((var4 = (int)((this.maxTime - System.currentTimeMillis()) / 1000L)) > 0) {
            mFont.tahoma_7.drawString(var1, this.nsoAB + " : " + nsoAA(var4), var2 - 5, var3 + 1, 1);
            mFont.tahoma_7_white.drawString(var1, this.nsoAB + " : " + nsoAA(var4), var2 - 4, var3, 1);
            return;
         }
      } else {
         MyImage var7;
         if ((var7 = (MyImage)SmallImage.imgNew.get(String.valueOf(this.nsoAD))) == null) {
            var7 = new MyImage();
            SmallImage.imgNew.put(String.valueOf(this.nsoAD), var7);
            var7.img = Controller.createImage(RMS.loadRMS(String.valueOf(this.nsoAD)));
            if (var7.img == null) {
               var7.timerequest = System.currentTimeMillis();
               Service.gI().requestIcon(this.nsoAD);
            }
         } else if (var7.img == null && System.currentTimeMillis() - var7.timerequest > 60000L) {
            var7.timerequest = System.currentTimeMillis();
            Service.gI().requestIcon(this.nsoAD);
         }

         if (var7 != null && var7.img != null) {
            int var5;
            if (this.nsoAF == 0) {
               var5 = mFont.tahoma_7.getWidth(this.nsoAB + " : ");
               var1.drawImage(var7.img, var2 - var5 - (var7.img.getWidth() << 1), var3 + mGraphics.getHeight(var7.img) / 4, 0);
               mFont.tahoma_7.drawString(var1, this.nsoAB, var2 - var5 - (var7.img.getWidth() << 1) + 1 + mGraphics.getWidth(var7.img), var3 + 1 + mGraphics.getHeight(var7.img) / 4, 0);
               mFont.tahoma_7_white.drawString(var1, this.nsoAB, var2 - var5 - (var7.img.getWidth() << 1) + mGraphics.getWidth(var7.img), var3 + mGraphics.getHeight(var7.img) / 4, 0);
               return;
            }

            if (this.nsoAF == 1) {
               var5 = (int)((this.maxTime - System.currentTimeMillis()) / 1000L);
               int var6 = mFont.tahoma_7.getWidth(nsoAA(var5) + ":");
               var1.drawImage(var7.img, var2 - var6 - (var7.img.getWidth() << 1), var3 + mGraphics.getHeight(var7.img) / 4, 0);
               mFont.tahoma_7.drawString(var1, " : " + nsoAA(var5), var2 - var6 - (var7.img.getWidth() << 1) + 1 + mGraphics.getWidth(var7.img), var3 + 1 + mGraphics.getHeight(var7.img) / 4, 0);
               mFont.tahoma_7_white.drawString(var1, " : " + nsoAA(var5), var2 - var6 - (var7.img.getWidth() << 1) + mGraphics.getWidth(var7.img), var3 + mGraphics.getHeight(var7.img) / 4, 0);
            }
         }
      }

   }

   public final void nsoAA() {
      if (this.nsoAF == 1 && System.currentTimeMillis() - this.maxTime >= 0L) {
         this.nsoAC = true;
      }

   }

   private static String nsoAA(int var0) {
      int var1 = var0 % 60;
      int var2 = (var0 /= 60) % 60;
      if ((var0 /= 60) > 0) {
         return var0 + ":" + var2;
      } else if (var2 > 0) {
         return var2 + ":" + var1;
      } else {
         return var1 < 0 ? "0:" + var1 : String.valueOf(var1);
      }
   }
}
