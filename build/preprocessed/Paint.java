import javax.microedition.lcdui.Image;

public final class Paint {
   public static int COLORBACKGROUND = 6562304;
   public static int COLORLIGHT = 9581056;
   public static int COLORDARK = 3937280;
   public static int COLORBORDER = 15224576;
   public static int COLORFOCUS = 16777215;
   public static int hTab = 24;
   private static int lenCaption = 0;

   public Paint() {
      int[] var10000 = new int[]{15970400, -844109861, 2250052, 16374659, 15906669, 12931125, 3108954};
   }

   public static void paintCmdBar(mGraphics var0, Command var1, Command var2, Command var3) {
      mFont var4 = GameCanvas.isTouch ? mFont.tahoma_7b_yellow : mFont.tahoma_8b;
      int var5 = GameCanvas.isTouch ? 3 : 1;
      if (!GameCanvas.isTouch) {
         if (var1 != null) {
            var4.drawString(var0, var1.caption, 5, GameCanvas.h - mScreen.cmdH + 4 + var5, 0);
         }

         if (var2 != null) {
            var4.drawString(var0, var2.caption, GameCanvas.hw, GameCanvas.h - mScreen.cmdH + 4 + var5, 2);
         }

         if (var3 != null) {
            if (var3.img != null) {
               var0.drawImage(var3.img, GameCanvas.w - 5, GameCanvas.h - 11, 10);
               return;
            }

            var4.drawString(var0, var3.caption, GameCanvas.w - 5, GameCanvas.h - mScreen.cmdH + 4 + var5, 1);
            return;
         }
      } else {
         if (var1 != null && (lenCaption = var4.getWidth(var1.caption)) > 0) {
            if (var1.x > 0 && var1.y > 0) {
               var1.paint(var0);
            } else {
               if (mScreen.keyTouch == 0) {
                  var0.drawImage(GameScr.imgLbtnFocus, 1, GameCanvas.h - mScreen.cmdH + 1, 0);
               } else {
                  var0.drawImage(GameScr.imgLbtn, 1, GameCanvas.h - mScreen.cmdH + 1, 0);
               }

               var4.drawString(var0, var1.caption, 35, GameCanvas.h - mScreen.cmdH + 4 + var5, 2);
            }
         }

         if (var2 != null && (lenCaption = var4.getWidth(var2.caption)) > 0) {
            if (var2.x > 0 && var2.y > 0) {
               var2.paint(var0);
            } else {
               if (mScreen.keyTouch == 1) {
                  var0.drawImage(GameScr.imgLbtnFocus, GameCanvas.hw - 35, GameCanvas.h - mScreen.cmdH + 1, 0);
               } else {
                  var0.drawImage(GameScr.imgLbtn, GameCanvas.hw - 35, GameCanvas.h - mScreen.cmdH + 1, 0);
               }

               var4.drawString(var0, var2.caption, GameCanvas.hw, GameCanvas.h - mScreen.cmdH + 4 + var5, 2);
            }
         }

         if (var3 != null && (lenCaption = var4.getWidth(var3.caption)) > 0) {
            if (var3.x > 0 && var3.y > 0) {
               var3.paint(var0);
               return;
            }

            if (mScreen.keyTouch == 2) {
               var0.drawImage(GameScr.imgLbtnFocus, GameCanvas.w - 71, GameCanvas.h - mScreen.cmdH + 1, 0);
            } else {
               var0.drawImage(GameScr.imgLbtn, GameCanvas.w - 71, GameCanvas.h - mScreen.cmdH + 1, 0);
            }

            var4.drawString(var0, var3.caption, GameCanvas.w - 35, GameCanvas.h - mScreen.cmdH + 4 + var5, 2);
         }
      }

   }

   public static void nsoAA(mGraphics var0) {
      if (!GameCanvas.isTouch) {
         var0.setColor(0);
         var0.fillRect(0, GameCanvas.h - hTab, GameCanvas.w, hTab + 1);
         var0.setColor(8947848);
         var0.fillRect(0, GameCanvas.h - (hTab - 1), GameCanvas.w, 1);
      }

   }

   public static void paintInputTf(mGraphics var0, boolean var1, int var2, int var3, int var4, int var5, int var6, int var7, String var8) {
      var0.setColor(0);
      int var9;
      if (var1) {
         var0.drawRegion(GameScr.imgTf, 0, 81, 29, 27, 0, var2, var3, 0);
         var0.drawRegion(GameScr.imgTf, 0, 135, 29, 27, 0, var2 + var4 - 29, var3, 0);
         var0.drawRegion(GameScr.imgTf, 0, 108, 29, 27, 0, var2 + var4 - 58, var3, 0);

         for(var9 = 0; var9 < (var4 - 58) / 29; ++var9) {
            var0.drawRegion(GameScr.imgTf, 0, 108, 29, 27, 0, var2 + 29 + var9 * 29, var3, 0);
         }
      } else {
         var0.drawRegion(GameScr.imgTf, 0, 0, 29, 27, 0, var2, var3, 0);
         var0.drawRegion(GameScr.imgTf, 0, 54, 29, 27, 0, var2 + var4 - 29, var3, 0);
         var0.drawRegion(GameScr.imgTf, 0, 27, 29, 27, 0, var2 + var4 - 58, var3, 0);

         for(var9 = 0; var9 < (var4 - 58) / 29; ++var9) {
            var0.drawRegion(GameScr.imgTf, 0, 27, 29, 27, 0, var2 + 29 + var9 * 29, var3, 0);
         }
      }

      var0.setClip(var2 + 3, var3 + 1, var4 - 4, var5 - 4);
      mFont.tahoma_8b.drawString(var0, var8, var6, var7, 0);
   }

   public static void paintInputTf_new(mGraphics var0, boolean var1, int var2, int var3, int var4, int var5, int var6, String var7) {
      var0.setColor(0);
      int var8;
      if (var1) {
         var0.drawRegion(GameScr.imgTf, 0, 81, 29, 27, 0, var2, var3, 0);
         var0.drawRegion(GameScr.imgTf, 0, 135, 29, 27, 0, var2 + var4 - 29, var3, 0);
         var0.drawRegion(GameScr.imgTf, 0, 108, 29, 27, 0, var2 + var4 - 58, var3, 0);

         for(var8 = 0; var8 < (var4 - 58) / 29; ++var8) {
            var0.drawRegion(GameScr.imgTf, 0, 108, 29, 27, 0, var2 + 29 + var8 * 29, var3, 0);
         }
      } else {
         var0.drawRegion(GameScr.imgTf, 0, 0, 29, 27, 0, var2, var3, 0);
         var0.drawRegion(GameScr.imgTf, 0, 54, 29, 27, 0, var2 + var4 - 29, var3, 0);
         var0.drawRegion(GameScr.imgTf, 0, 27, 29, 27, 0, var2 + var4 - 58, var3, 0);

         for(var8 = 0; var8 < (var4 - 58) / 29; ++var8) {
            var0.drawRegion(GameScr.imgTf, 0, 27, 29, 27, 0, var2 + 29 + var8 * 29, var3, 0);
         }
      }

      mFont.tahoma_8b.drawString(var0, var7, var5, var6, 0);
   }

   public final void paintInputDlg(mGraphics var1, int var2, int var3, int var4, int var5, String[] var6, Image var7) {
      int var8;
      if (var7 == null) {
         paintFrame(var2, var3, var4, var5, var1);
         var8 = var3 + 20 - mFont.tahoma_8b.getHeight();
         var3 = 0;

         for(var8 = var8; var3 < var6.length; var8 += mFont.tahoma_8b.getHeight()) {
            mFont.tahoma_8b.drawString(var1, var6[var3], var2 + var4 / 2, var8, 2);
            ++var3;
         }

      } else {
         paintFrame(var2, var3 - var7.getHeight(), var4, var5 + var7.getHeight(), var1);
         var1.drawImage(var7, var2 + var4 / 2, var3 + var5 / 2 - 4, 33);
         var8 = var3 + 20 - mFont.tahoma_8b.getHeight();
         var3 = 0;

         for(var8 = var8; var3 < var6.length; var8 += mFont.tahoma_8b.getHeight()) {
            mFont.tahoma_8b.drawString(var1, var6[var3], var2 + var4 / 2, var8 - var7.getHeight(), 2);
            ++var3;
         }

      }
   }

   public static void paintFrame(int var0, int var1, int var2, int var3, mGraphics var4) {
      var4.setColor(COLORBACKGROUND);
      var4.fillRect(var0, var1, var2, var3);
      var4.setColor(0);
      var4.drawRect(var0 - 2, var1 - 2, var2 + 3, var3 + 3);
      var4.setColor(13948116);
      var4.drawRect(var0 - 1, var1 - 1, var2 + 1, var3 + 1);
      var4.setColor(5720393);
      var4.drawRect(var0, var1, var2 - 1, var3 - 1);
      if (GameCanvas.isTouch) {
         var4.drawImage(GameCanvas.imgBorder[0], var0 - 4, var1 - 3, 20);
         var4.drawRegion(GameCanvas.imgBorder[0], 0, 0, GameCanvas.borderConnerW, GameCanvas.borderConnerH, 2, var0 + var2 + 4, var1 - 3, StaticObj.TOP_RIGHT);
         var4.drawRegion(GameCanvas.imgBorder[0], 0, 0, GameCanvas.borderConnerW, GameCanvas.borderConnerH, 1, var0 - 4, var1 + var3 + 3, StaticObj.BOTTOM_LEFT);
         var4.drawRegion(GameCanvas.imgBorder[0], 0, 0, GameCanvas.borderConnerW, GameCanvas.borderConnerH, 3, var0 + var2 + 4, var1 + var3 + 3, StaticObj.BOTTOM_RIGHT);
         var4.drawImage(GameCanvas.imgBorder[1], var0 + var2 / 2, var1 - 4, StaticObj.TOP_CENTER);
      }

   }

   public static void paintFrameBorder(int var0, int var1, int var2, int var3, mGraphics var4) {
      var4.setColor(0);
      var4.drawRect(var0 - 2, var1 - 2, var2 + 3, var3 + 3);
      var4.setColor(13948116);
      var4.drawRect(var0 - 1, var1 - 1, var2 + 1, var3 + 1);
      var4.setColor(5720393);
      var4.drawRect(var0, var1, var2 - 1, var3 - 1);
      if (GameCanvas.isTouch) {
         var4.drawImage(GameCanvas.imgBorder[0], var0 - 4, var1 - 3, 20);
         var4.drawRegion(GameCanvas.imgBorder[0], 0, 0, GameCanvas.borderConnerW, GameCanvas.borderConnerH, 2, var0 + var2 + 4, var1 - 3, StaticObj.TOP_RIGHT);
         var4.drawRegion(GameCanvas.imgBorder[0], 0, 0, GameCanvas.borderConnerW, GameCanvas.borderConnerH, 1, var0 - 4, var1 + var3 + 3, StaticObj.BOTTOM_LEFT);
         var4.drawRegion(GameCanvas.imgBorder[0], 0, 0, GameCanvas.borderConnerW, GameCanvas.borderConnerH, 3, var0 + var2 + 4, var1 + var3 + 3, StaticObj.BOTTOM_RIGHT);
         var4.drawImage(GameCanvas.imgBorder[1], var0 + var2 / 2, var1 - 4, StaticObj.TOP_CENTER);
      }

   }

   public static void paintFrameInside(int var0, int var1, int var2, int var3, mGraphics var4) {
      var4.setColor(COLORBACKGROUND);
      var4.fillRect(var0, var1, var2, var3);
   }

   public static void paintFrameInsideSelected(int var0, int var1, int var2, int var3, mGraphics var4) {
      var4.setColor(COLORLIGHT);
      var4.fillRect(var0, var1, var2, var3);
   }
}
