public final class AutoChoPK extends Auto {
   private long advAA;

   public final void advAA() {
      super.update();
      if (Code.advBW == -1 || Code.advBX == -1 || Code.advBY == -1) {
         Code.advBW = 70;
         Code.advBX = 1500;
         Code.advBY = 528;
      }

      this.mapID = Code.advBW;
      this.zoneID = Code.advBU;
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

            Code.instance.advAO();
            if (System.currentTimeMillis() - this.advAA >= 30000L) {
               Code.advAH("chao a. e dung day tu chieu");
               this.advAA = System.currentTimeMillis();
               return;
            }
         } else {
            this.remap(this.mapID, this.zoneID, this.cx, this.cy);
         }

      }
   }

   public final String toString() {
      return "Auto đứng chờ pk";
   }
}
