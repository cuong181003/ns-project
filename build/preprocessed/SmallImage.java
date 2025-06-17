import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.microedition.lcdui.Image;

public final class SmallImage {
   public static int[][] smallImg;
   private static Image[] imgbig;
   public static Hashtable imgNew = new Hashtable();
   public short x;
   public short y;
   public short w;
   public short h;

   public SmallImage(int var1, int var2, int var3, int var4, int var5) {
      this.x = (short)var2;
      this.y = (short)var3;
      this.w = (short)var4;
      this.h = (short)var5;
   }

   public static void checkTimeUseImg() {
      try {
         Enumeration var0 = imgNew.keys();

         while(var0.hasMoreElements()) {
            String var1 = (String)var0.nextElement();
            MyImage var2 = (MyImage) imgNew.get(var1);
            if (System.currentTimeMillis() - var2.timeUse > 180000L) {
               imgNew.remove(var1);
            }
         }

      } catch (Exception var3) {
      }
   }

   public static void freeBig() {
      imgbig = null;
      System.gc();
   }

   public static void loadBigImage() {
      imgbig = null;
      System.gc();
      imgbig = new Image[]{GameCanvas.loadImage("/img/Big0.png"), GameCanvas.loadImage("/img/Big1.png"), GameCanvas.loadImage("/img/Big2.png"), GameCanvas.loadImage("/img/Big3.png"), GameCanvas.loadImage("/img/Big4.png")};
      Image.createRGBImage(new int[]{-2013265920}, 1, 1, true);
   }

   public SmallImage() {
      readImage();
   }

   public static void init() {
      new SmallImage();
   }

   private static void readImage() {
      try {
         DataInputStream var0;
         short var1;
         smallImg = new int[var1 = (var0 = new DataInputStream(new ByteArrayInputStream(RMS.loadRMS("nj_image")))).readShort()][5];

         for(int var2 = 0; var2 < var1; ++var2) {
            smallImg[var2][0] = var0.readUnsignedByte();
            smallImg[var2][1] = var0.readShort();
            smallImg[var2][2] = var0.readShort();
            smallImg[var2][3] = var0.readShort();
            smallImg[var2][4] = var0.readShort();
         }

      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public static void reciveImage(int var0, byte[] var1) {
      MyImage var2;
      if ((var2 = (MyImage) imgNew.get(String.valueOf(var0))) == null) {
         var2 = new MyImage();
         imgNew.put(String.valueOf(var0), var2);
      }

      var2.img = Controller.createImage(var1);
      if (GameMidlet.CLIENT_TYPE != 1) {
         RMS.saveRMSImage(String.valueOf(var0), var1);
      }

   }

   public static boolean isExitsImage(int var0) {
      if (var0 >= smallImg.length || smallImg[var0][1] >= imgbig[smallImg[var0][0]].getWidth() || smallImg[var0][3] >= imgbig[smallImg[var0][0]].getWidth() || smallImg[var0][2] >= imgbig[smallImg[var0][0]].getHeight() || smallImg[var0][4] >= imgbig[smallImg[var0][0]].getHeight()) {
         MyImage var1;
         if ((var1 = (MyImage) imgNew.get(String.valueOf(var0))) == null) {
            var1 = new MyImage();
            imgNew.put(String.valueOf(var0), var1);
            var1.img = Controller.createImage(RMS.loadRMS(String.valueOf(var0)));
            if (var1.img == null) {
               var1.timerequest = System.currentTimeMillis();
               Service.gI().requestIcon(var0);
            }

            return false;
         }

         if (var1.img != null) {
            return true;
         }

         if (var1.img == null && System.currentTimeMillis() - var1.timerequest > 60000L) {
            var1.timerequest = System.currentTimeMillis();
            Service.gI().requestIcon(var0);
            return false;
         }
      }

      return true;
   }

   public static int getHeight(int var0) {
      return smallImg[var0][4];
   }

   public static void drawSmallImage(mGraphics var0, int var1, int var2, int var3, int var4, int var5) {
      if (var1 < smallImg.length && smallImg[var1][1] < imgbig[smallImg[var1][0]].getWidth() && smallImg[var1][3] < imgbig[smallImg[var1][0]].getWidth() && smallImg[var1][2] < imgbig[smallImg[var1][0]].getHeight() && smallImg[var1][4] < imgbig[smallImg[var1][0]].getHeight()) {
         var0.drawRegion(imgbig[smallImg[var1][0]], smallImg[var1][1], smallImg[var1][2], smallImg[var1][3], smallImg[var1][4], var4, var2, var3, var5);
      } else {
         MyImage var6;
         if ((var6 = (MyImage) imgNew.get(String.valueOf(var1))) == null) {
            var6 = new MyImage();
            imgNew.put(String.valueOf(var1), var6);
            var6.img = Controller.createImage(RMS.loadRMS(String.valueOf(var1)));
            if (var6.img == null) {
               var6.timerequest = System.currentTimeMillis();
               Service.gI().requestIcon(var1);
            }
         } else if (var6.img == null && System.currentTimeMillis() - var6.timerequest > 60000L) {
            var6.timerequest = System.currentTimeMillis();
            Service.gI().requestIcon(var1);
         }

         if (var6 != null) {
            if (var6.img != null) {
               var0.drawRegion(var6.img, 0, 0, var6.img.getWidth(), var6.img.getHeight(), var4, var2, var3, var5);
            }

            var6.timeUse = System.currentTimeMillis();
            return;
         }
      }

   }

   public static void drawSmallImage(mGraphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 < smallImg.length && smallImg[var1][1] < imgbig[smallImg[var1][0]].getWidth() && smallImg[var1][3] < imgbig[smallImg[var1][0]].getWidth() && smallImg[var1][2] < imgbig[smallImg[var1][0]].getHeight() && smallImg[var1][4] < imgbig[smallImg[var1][0]].getHeight()) {
         var0.drawRegion(imgbig[smallImg[var1][0]], smallImg[var1][1], smallImg[var1][2], smallImg[var1][3], smallImg[var1][4], 0, var2, var3, 3);
      } else {
         MyImage var7;
         if ((var7 = (MyImage) imgNew.get(String.valueOf(var1))) == null) {
            var7 = new MyImage();
            imgNew.put(String.valueOf(var1), var7);
            var7.img = Controller.createImage(RMS.loadRMS(String.valueOf(var1)));
            if (var7.img == null) {
               var7.timerequest = System.currentTimeMillis();
               Service.gI().requestIcon(var1);
            }
         } else if (var7.img == null && System.currentTimeMillis() - var7.timerequest > 60000L) {
            var7.timerequest = System.currentTimeMillis();
            Service.gI().requestIcon(var1);
         }

         if (var7 != null) {
            if (var7.img != null) {
               if (var7.img.getHeight() > 35) {
                  var1 = var7.img.getWidth();
                  var5 = var7.img.getHeight() / 3;
                  var0.drawRegion(var7.img, 0, var6 * var5, var1, var5, 0, var2, var3, 3);
               } else {
                  var0.drawRegion(var7.img, 0, 0, var7.img.getWidth(), var7.img.getHeight(), 0, var2, var3, 3);
               }
            }

            var7.timeUse = System.currentTimeMillis();
            return;
         }
      }

   }
}
