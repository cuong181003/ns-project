public final class AutoLoiLoss extends Auto {
   private static boolean advAZ = false;
   private static boolean advBA = false;
   private long advBB = 0L;
   private long advBC;
   public boolean advAA;
   public int advAB;
   public boolean advAC;
   private long advBD;

   public final void advAA() {
      super.update();
      advAZ = false;
      advBA = false;
      this.advAB = -1;
      this.advAA = false;
      this.advAC = false;
      this.advBC = System.currentTimeMillis();
   }

   public final void auto() {
      if (isMyCharInactive()) {
         if (TileMap.mapID == 111) {
            if (FormDanhVong.advAQ && this.advAA) {
               this.advAA = false;
               advAZ = false;
               advBA = false;
               GameCanvas.selectsvScr.advAE = true;
               GameCanvas.selectsvScr.advAF = System.currentTimeMillis();
               Session_ME.gI().close();
               GameCanvas.instance.resetToLoginScr();
            }

         } else {
            Auto.advAA(true);
         }
      } else {
         if (System.currentTimeMillis() - this.advBC >= 30000L) {
            Code.advAH("chao e. a dung day tu chieu");
            this.advBC = System.currentTimeMillis();
         }

         Code.instance.advAO();
         if (!advAZ && !advBA) {
            if (TileMap.mapID == 110) {
               advAZ = true;
               advBA = false;
               this.advBD = System.currentTimeMillis();
               return;
            }

            if (TileMap.mapID != FormDanhVong.advAC || TileMap.zoneID != FormDanhVong.advAD) {
               if (TileMap.mapID != 111 && TileMap.mapID != 129 && TileMap.mapID != 149) {
                  this.remap(FormDanhVong.advAC, FormDanhVong.advAD, -1, -1);
                  return;
               } else {
                  Auto.sleep(1000L);
                  Auto.advAP();
                  return;
               }
            }

            if (!this.advAC) {
               GameScr.pickNPC(5, 1, 0);
               if (LockGame.advAY()) {
                  this.advAC = true;
                  Auto.sleep(1000L);
               }
            }

            if (this.advAB > 0) {
               Service.gI().acceptInviteTestDun(this.advAB);
               this.advAB = -1;
               return;
            }
         } else if (advAZ && !advBA) {
            if (TileMap.mapID == 111) {
               advAZ = true;
               advBA = true;
               return;
            }

            if (TileMap.mapID == 110) {
               Npc var1 = GameScr.findNPC(0);
               if (Char.getMyChar().cx == var1.cx && Char.getMyChar().cy == var1.cy) {
                  if (System.currentTimeMillis() - this.advBB >= 2000L) {
                     Service.gI().textBoxId((short)3, (String)String.valueOf(FormDanhVong.advAG));
                     GameCanvas.endDlg();
                     Auto.sleep(3000L);
                     this.advBB = System.currentTimeMillis();
                  }

                  return;
               }

               Char.moveToChar(var1.cx, var1.cy);
               Auto.sleep(1000L);
               this.advBB = System.currentTimeMillis();
               return;
            }

            if (System.currentTimeMillis() - this.advBD > 30000L) {
               advAZ = false;
               advBA = false;
               return;
            }
         } else if (advAZ && advBA && TileMap.mapID != 111) {
            advAZ = false;
            advBA = false;
            sleep(1000L);
         }

      }
   }

   public final String toString() {
      return "Lôi lose";
   }
}
