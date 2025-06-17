public final class AutoDanhHeo extends Auto {
   public AutoDanhHeo() {
      super.update();
   }

   protected final void auto() {
      Char var1;
      if ((var1 = Char.getMyChar()).cHP <= 0) {
         Auto.advAA(true);
      } else if (var1.ctaskId == 20 && var1.taskMaint.index < var1.taskMaint.subNames.length - 1) {
         if (TileMap.mapID == 74) {
            this.advAB(69, -1);
            this.advAC(221);
            if (Char.getMyChar().cMP < Char.getMyChar().cMaxMP / 2) {
               Char.getMyChar().doUsePotion(17);
            }

            if (Char.getMyChar().cHP < Char.getMyChar().cMaxHP * 3 / 4) {
               int var4 = (int)(System.currentTimeMillis() / 1000L);

               for(int var2 = 0; var2 < Char.getMyChar().vEff.size(); ++var2) {
                  Effect var3;
                  if ((var3 = (Effect)Char.getMyChar().vEff.elementAt(var2)).template.id == 21 && var3.timeLenght - (var4 - var3.timeStart) >= 2) {
                     return;
                  }
               }

               Char.getMyChar().doUsePotion(16);
               return;
            }
         } else {
            this.remap(74, -2, -1, -1);
         }

      } else {
         Code.endAuto();
      }
   }

   public final String toString() {
      return "Đánh Heo";
   }
}
