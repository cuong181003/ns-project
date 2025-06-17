public final class AutoPKAm extends Auto {
   private static long advAB = 0L;
   private long advAC = 0L;
   private boolean advAZ = false;
   public static Auto advAA;

   public final void advAA() {
      super.update();
      if (Code.advBW == -1 || Code.advBX == -1 || Code.advBY == -1) {
         Code.advBW = 70;
         Code.advBX = 1500;
         Code.advBY = 528;
      }

      this.mapID = Code.advBW;
      this.zoneID = Code.advBV;
      this.advAG = TileMap.isHang(Code.advBW);
   }

   protected final void auto() {
      long var1 = (Char.getMyChar().cExpDown > 0L ? Char.getMyChar().cExpDown : Char.getMyChar().cExpR) * 100L / GameScr.exps[Char.getMyChar().clevel];
      if ((Char.getMyChar().cExpDown <= 0L || Math.abs(var1) > 15L) && (Char.getMyChar().cExpDown > 0L || Math.abs(var1) < 0L)) {
         Service.gI().changePk(0);
         GameScr.paint("Đã pk xong!!");
         if (advAA != null) {
            LockGame.java_BK();
            Code.auto = advAA;
            advAA = null;
            return;
         }

         Code.java_AC();
      } else {
         if (Char.getMyChar().cPk <= 10 && !this.advAZ) {
            if (isMyCharInactive()) {
               advAA(true);
               sleep(1500L);
               return;
            }

            if (TileMap.mapID == Code.advBW && TileMap.zoneID == Code.advBU) {
               if (Char.getMyChar().cx == Code.advBX && Char.getMyChar().cy == Code.advBY) {
                  if (System.currentTimeMillis() - advAB >= 300L) {
                     MyVector var4 = new MyVector();

                     for(int var2 = 0; var2 < GameScr.vCharInMap.size(); ++var2) {
                        Char var3;
                        if ((var3 = (Char)GameScr.vCharInMap.elementAt(var2)).cHP > 0 && Math.abs(Char.getMyChar().cx - var3.cx) <= 50 && Math.abs(Char.getMyChar().cy - var3.cy) <= 50 && var4.size() <= advAO.maxFight) {
                           var4.addElement(var3);
                           if (var3.cHP > 0 && Math.abs(Char.getMyChar().cx - var3.cx) <= 50 && Math.abs(Char.getMyChar().cy - var3.cy) <= 50) {
                              Service.gI().sendPlayerAttack((MyVector)(new MyVector()), (MyVector)var4, (int)2);
                              advAB = System.currentTimeMillis();
                           }
                        }
                     }
                  }

                  sleep(100L);
                  return;
               }

               Service.gI().changePk(3);
               if (Code.advBX != -1 && Code.advBY != -1) {
                  Char.moveToChar(Code.advBX, Code.advBY);
               } else {
                  Code.advBX = Char.getMyChar().cx;
                  Code.advBY = Char.getMyChar().cy;
               }

               sleep(500L);
               return;
            }

            this.remap(Code.advBW, Code.advBU, -1, -1);
            return;
         }

         this.advAZ = Char.getMyChar().cPk > 6;
         if (isMyCharInactive()) {
            advAA(true);
            return;
         }

         if (TileMap.mapID != Code.advBW || TileMap.zoneID != Code.advBV) {
            this.remap(Code.advBW, Code.advBV, -1, -1);
            return;
         }

         if (Char.getMyChar().cx != Code.advBX || Char.getMyChar().cy != Code.advBY) {
            Service.gI().changePk(3);
            if (Code.advBX != -1 && Code.advBY != -1) {
               Char.moveToChar(Code.advBX, Code.advBY);
            } else {
               Code.advBX = Char.getMyChar().cx;
               Code.advBY = Char.getMyChar().cy;
            }

            sleep(500L);
            return;
         }

         Code.instance.advAO();
         if (System.currentTimeMillis() - this.advAC >= 30000L) {
            Code.advAH("buon nhu cho can");
            this.advAC = System.currentTimeMillis();
            return;
         }
      }

   }

   public final String toString() {
      return "Auto pk âm";
   }
}
