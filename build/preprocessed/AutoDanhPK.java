public final class AutoDanhPK extends Auto {
   private long advAA;
   private static long advAB;

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
      if (isMyCharInactive()) {
         advAA(true);
         sleep(1500L);
      } else {
         if (this.mapID == TileMap.mapID && this.zoneID == TileMap.zoneID) {
            if (Char.getMyChar().cx != Code.advBX || Char.getMyChar().cy != Code.advBY) {
               if (Code.advBX != -1 && Code.advBY != -1) {
                  Char.moveToChar(Code.advBX, Code.advBY);
               } else {
                  Code.advBX = Char.getMyChar().cx;
                  Code.advBY = Char.getMyChar().cy;
               }

               sleep(500L);
               return;
            }

            if (System.currentTimeMillis() - advAB >= 300L) {
               MyVector var1 = new MyVector();

               for(int var2 = 0; var2 < GameScr.vCharInMap.size(); ++var2) {
                  Char var3;
                  if ((var3 = (Char)GameScr.vCharInMap.elementAt(var2)).cHP > 0 && var3.cTypePk == 3 && Math.abs(Char.getMyChar().cx - var3.cx) <= 50 && Math.abs(Char.getMyChar().cy - var3.cy) <= 50 && var1.size() <= advAO.maxFight) {
                     var1.addElement(var3);
                     if (var3.cHP > 0 && var3.cTypePk == 3 && Math.abs(Char.getMyChar().cx - var3.cx) <= 50) {
                        Service.gI().sendPlayerAttack((MyVector)(new MyVector()), (MyVector)var1, (int)2);
                        advAB = System.currentTimeMillis();
                     }
                  }
               }
            }

            Code.instance.advAO();
            if (System.currentTimeMillis() - this.advAA >= 30000L) {
               Code.advAH("chao e. a dung day tu chieu");
               this.advAA = System.currentTimeMillis();
               return;
            }
         } else {
            this.remap(this.mapID, this.zoneID, this.cx, this.cy);
         }

      }
   }

   public final String toString() {
      return "Auto đánh pk";
   }
}
