public final class AutoNVHN extends Auto {
   public static boolean advAA = false;
   private static final String[] advAB = new String[]{"Hôm nay con đã làm hết nhiệm vụ ta giao. Hãy quay lại vào ngày hôm sau.", "Đây là lần nhận nhiệm vụ thứ ", " trong ngày hôm nay. Mỗi ngày được nhận tối đa 20 lần con nhé."};
   private static int advAC;
   private TaskOrder advAZ;

   public static void advAA(String var0) {
      if (var0.equals(advAB[0])) {
         advAC = 21;
         LockGame.advAL();
      } else {
         int var1;
         if ((var1 = var0.indexOf(advAB[1])) >= 0) {
            var0 = var0.substring(var1 + advAB[1].length(), var0.indexOf(advAB[2])).trim();

            try {
               advAC = Integer.parseInt(var0);
               return;
            } catch (NumberFormatException var2) {
            }
         }

      }
   }

   public final void update() {
      super.update();
      advAC = 0;
      this.advAZ = Char.getTaskOrder(0);
      if (TileMap.isTruong(TileMap.mapID)) {
         super.mapID = TileMap.mapID;
      } else {
         super.mapID = 1;
      }
   }

   public final void advAM() {
      this.advAZ = Char.getTaskOrder(0);
   }

   public final void auto() {
      if (advAC <= 20 && (!(super.T instanceof AutoStanima) || System.currentTimeMillis() - super.advAL < 3600000L)) {
         if (isMyCharInactive()) {
            Auto.advAA(false);
            return;
         }

         if (TileMap.isTruong(TileMap.mapID)) {
            if (this.advAZ == null) {
               GameScr.paint("Nhận NV " + (advAC + 1) + "/20");
               GameScr.pickNPC(25, GameScr.advGO, 0);
               LockGame.advAK();
               this.advAZ = Char.getTaskOrder(0);
               return;
            }

            if (this.advAZ.count >= this.advAZ.maxCount) {
               if (Char.getBagNum() <= 0) {
                  GameScr.paint("Hành trang đầy");
                  return;
               }

               GameScr.paint("Hoàn thành NV " + advAC + "/20");
               GameScr.pickNPC(25, GameScr.advGO, 2);
               this.advAZ = null;
               return;
            }

            GameScr.paint("Đi làm NV " + advAC + "/20");
            GameScr.pickNPC(25, GameScr.advGO, 3);
            TileMap.advAF();
            Auto.advAY = System.currentTimeMillis() - 5000L;
            sleep(500L);
            return;
         }

         if (this.advAZ != null && TileMap.mapID == this.advAZ.mapId) {
            if (this.advAZ.count >= this.advAZ.maxCount) {
               Auto.advAP();
               return;
            }

            if (TileMap.zoneID == super.zoneID) {
               this.advAB(this.advAZ.killId, 1);
               this.advAC(-1);
               if (advAA) {
                  GameScr.paint("Nhiệm vụ " + advAC + "/20: " + this.advAZ.count + "/" + this.advAZ.maxCount + " " + Mob.arrMobTemplate[this.advAZ.killId].name);
                  advAA = false;
                  return;
               }
            } else {
               super.advAB(super.zoneID);
            }

            return;
         }

         if (TileMap.mapID != super.mapID) {
            if (!TileMap.isTruong(super.mapID)) {
               super.mapID = 1;
            }

            this.remap(super.mapID, -2, -1, -1);
            return;
         }
      } else {
         GameScr.paint("Hoàn thành!");
         if (super.T != null && !(super.T instanceof AutoNVHN)) {
            Auto.sleep(5000L);
            Code.java_AC();
            return;
         }

         Code.endAuto();
      }

   }

   public final String toString() {
      return "Auto NVHN: " + advAC + "/20";
   }
}
