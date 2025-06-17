public final class LockGame {
   private static boolean advAC = false;
   public static boolean advAA = false;
   public static boolean advAB = false;
   private static boolean advAD = false;
   private static boolean advAE = false;
   private static boolean advAF = false;
   private static boolean advAG = false;
   private static boolean advAH = false;
   private static boolean advAI = false;
   private static boolean advAJ = false;
   private static boolean advAK = false;
   private static boolean advAL = false;
   private static boolean advAM = false;
   private static boolean advAN = false;
   private static boolean advAO = false;
   private static boolean advAP = false;
   private static boolean advAQ = false;
   private static Object advAR = new Object();
   private static int advAS;

   public static void advAA() {
      advAC = true;
      synchronized(advAR) {
         try {
            advAR.wait(2000L);
         } catch (InterruptedException var1) {
         }

      }
   }

   public static void advAB() {
      if (advAC) {
         synchronized(advAR) {
            advAR.notifyAll();
         }

         advAC = false;
      }

   }

   public static boolean advAC() {
      advAB = true;
      long var0 = System.currentTimeMillis();
      synchronized(advAR) {
         try {
            advAR.wait(50L);
         } catch (InterruptedException var3) {
         }
      }

      return System.currentTimeMillis() - var0 < 50L;
   }

   public static void advAD() {
      if (advAB) {
         synchronized(advAR) {
            advAR.notifyAll();
         }

         advAB = false;
      }

   }

   public static void advAE() {
      advAD = true;
      synchronized(advAR) {
         try {
            advAR.wait(2000L);
         } catch (InterruptedException var1) {
         }

      }
   }

   public static void advAF() {
      if (advAD) {
         synchronized(advAR) {
            advAR.notifyAll();
         }

         advAD = false;
      }

   }

   public static void advAG() {
      advAE = true;
      synchronized(advAR) {
         try {
            advAR.wait(2000L);
         } catch (InterruptedException var1) {
         }

      }
   }

   public static void advAH() {
      if (advAE) {
         synchronized(advAR) {
            advAR.notifyAll();
         }

         advAE = false;
      }

   }

   public static void advAI() {
      advAJ = true;
      synchronized(advAR) {
         try {
            advAR.wait();
         } catch (InterruptedException var1) {
         }

      }
   }

   public static void advAJ() {
      if (advAJ) {
         synchronized(advAR) {
            advAR.notifyAll();
         }

         advAJ = false;
      }

   }

   public static void advAK() {
      advAF = true;
      synchronized(advAR) {
         try {
            advAR.wait(2000L);
         } catch (InterruptedException var1) {
         }

      }
   }

   public static void advAL() {
      if (advAF) {
         synchronized(advAR) {
            advAR.notifyAll();
         }

         advAF = false;
      }

   }

   public static void advAM() {
      advAG = true;
      synchronized(advAR) {
         try {
            advAR.wait(2000L);
         } catch (InterruptedException var1) {
         }

      }
   }

   public static void advAN() {
      if (advAG) {
         synchronized(advAR) {
            advAR.notifyAll();
         }

         advAG = false;
      }

   }

   public static void advAO() {
      advAH = true;
      synchronized(advAR) {
         try {
            advAR.wait(2000L);
         } catch (InterruptedException var1) {
         }

      }
   }

   public static void advAP() {
      if (advAH) {
         synchronized(advAR) {
            advAR.notifyAll();
         }

         advAH = false;
      }

   }

   public static boolean advAQ() {
      advAI = true;
      long var0 = System.currentTimeMillis();
      synchronized(advAR) {
         try {
            advAR.wait(5000L);
         } catch (InterruptedException var3) {
         }
      }

      return System.currentTimeMillis() - var0 < 5000L;
   }

   public static void advAR() {
      if (advAI) {
         synchronized(advAR) {
            advAR.notifyAll();
         }

         advAI = false;
      }

   }

   public static boolean advAS() {
      advAK = true;
      long var0 = System.currentTimeMillis();
      synchronized(advAR) {
         try {
            advAR.wait(7000L);
         } catch (InterruptedException var3) {
         }
      }

      return System.currentTimeMillis() - var0 < 7000L;
   }

   public static void advAT() {
      if (advAK) {
         synchronized(advAR) {
            advAR.notifyAll();
         }

         advAK = false;
      }

   }

   public static boolean advAU() {
      advAS = Auto.advAO != null ? Auto.advAO.point : 0;
      advAL = true;
      synchronized(advAR) {
         try {
            advAR.wait(3000L);
         } catch (InterruptedException var1) {
         }
      }

      return Auto.advAO == null || Auto.advAO.point > advAS;
   }

   public static void advAV() {
      if (advAL) {
         synchronized(advAR) {
            advAR.notifyAll();
         }

         advAL = false;
      }

   }

   public static void advAW() {
      advAM = true;
      synchronized(advAR) {
         try {
            advAR.wait(3000L);
         } catch (InterruptedException var1) {
         }

      }
   }

   public static void advAX() {
      if (advAM) {
         synchronized(advAR) {
            advAR.notifyAll();
         }

         advAM = false;
      }

   }

   public static boolean advAY() {
      advAN = true;
      long var0 = System.currentTimeMillis();
      synchronized(advAR) {
         try {
            advAR.wait(5000L);
         } catch (InterruptedException var3) {
         }
      }

      return System.currentTimeMillis() - var0 < 5000L;
   }

   public static void advAZ() {
      if (advAN) {
         synchronized(advAR) {
            advAR.notifyAll();
         }

         advAN = false;
      }

   }

   public static boolean advBA() {
      advAO = true;
      if (20000L < 0L) {
         synchronized(advAR) {
            try {
               advAR.wait();
            } catch (InterruptedException var3) {
            }
         }

         if (AutoSell.advAA) {
            AutoSell.advAA = false;
            return false;
         } else {
            return true;
         }
      } else {
         long var1 = System.currentTimeMillis();
         synchronized(advAR) {
            try {
               advAR.wait(20000L);
            } catch (InterruptedException var5) {
            }
         }

         if (AutoSell.advAA) {
            AutoSell.advAA = false;
            return false;
         } else {
            return System.currentTimeMillis() - var1 < 20000L;
         }
      }
   }

   public static void advBB() {
      if (advAO) {
         synchronized(advAR) {
            advAR.notifyAll();
         }

         advAO = false;
      }

   }

   public static void advBC() {
      advAP = true;
      synchronized(advAR) {
         try {
            advAR.wait(500L);
         } catch (InterruptedException var1) {
         }

      }
   }

   public static void advBD() {
      if (advAP) {
         synchronized(advAR) {
            advAR.notifyAll();
         }

         advAP = false;
      }

   }

   public static boolean advBE() {
      System.out.println("WaitDV");
      advAQ = true;
      long var0 = System.currentTimeMillis();
      synchronized(advAR) {
         try {
            advAR.wait(10000L);
         } catch (InterruptedException var3) {
         }
      }

      return System.currentTimeMillis() - var0 < 10000L;
   }

   public static void advBF() {
      System.out.println("NotifyDV");
      if (advAQ) {
         synchronized(advAR) {
            advAR.notifyAll();
         }

         advAQ = false;
      }

   }

   public static boolean advBG() {
      int var0 = 0;

      label31:
      while(var0 < Code.vParty.size()) {
         String var1 = (String)Code.vParty.elementAt(var0);

         for(int var2 = 0; var2 < GameScr.vParty.size(); ++var2) {
            Party var3;
            if ((var3 = (Party)GameScr.vParty.elementAt(var2)).name.equals(var1)) {
               if (var3.c == null || Res.distance(Char.getMyChar().cx, Char.getMyChar().cy, var3.c.cx, var3.c.cy) > 100) {
                  return false;
               }

               ++var0;
               continue label31;
            }
         }

         return false;
      }

      return true;
   }

   public static boolean advBH() {
      label23:
      for(int var0 = 0; var0 < Code.vParty.size(); ++var0) {
         String var1 = (String)Code.vParty.elementAt(var0);

         for(int var2 = 0; var2 < GameScr.vParty.size(); ++var2) {
            if (((Party)GameScr.vParty.elementAt(var2)).name.equals(var1)) {
               continue label23;
            }
         }

         return false;
      }

      return true;
   }

   public static void advAA(long var0) {
      if (Code.cNameLeader != null) {
         long var2 = System.currentTimeMillis();

         while(!advBG() && System.currentTimeMillis() - var2 < var0) {
            CuongScr.sleep(2000L);
         }

      }
   }

   public static void advBI() {
      if (Code.cNameLeader != null) {
         long var2 = System.currentTimeMillis();

         while(true) {
            int var0 = 0;

            boolean var10000;
            label37:
            while(true) {
               if (var0 >= Code.vParty.size()) {
                  var10000 = true;
                  break;
               }

               String var1 = (String)Code.vParty.elementAt(var0);

               for(int var4 = 0; var4 < GameScr.vParty.size(); ++var4) {
                  Party var5;
                  if ((var5 = (Party)GameScr.vParty.elementAt(var4)).name.equals(var1)) {
                     if (var5.c == null) {
                        var10000 = false;
                        break label37;
                     }

                     ++var0;
                     continue label37;
                  }
               }

               var10000 = false;
               break;
            }

            if (var10000 || System.currentTimeMillis() - var2 >= 300000L) {
               return;
            }

            CuongScr.sleep(2000L);
         }
      }
   }

   public static void advBJ() {
      if (Code.cNameLeader != null) {
         long var0 = System.currentTimeMillis();

         while(!advBH() && System.currentTimeMillis() - var0 < 60000L) {
            CuongScr.sleep(2000L);
         }

      }
   }

   public static void java_BK() {
      synchronized(advAR) {
         advAR.notifyAll();
      }

      advAB = false;
      advAD = false;
      advAE = false;
      advAF = false;
      advAG = false;
      advAH = false;
      advAJ = false;
      advAC = false;
      advAI = false;
      advAA = false;
      advAK = false;
      advAL = false;
      advAM = false;
      advAN = false;
      advAO = false;
      advAP = false;
      TileMap.advBD = false;
      TileMap.advAG();
   }
}
