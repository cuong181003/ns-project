public final class upgrade_1 {
   int advAA;
   int advAB;
   int advAC;

   public upgrade_1(Item var1) {
      if (var1.isTypeClothe()) {
         this.advAA = GameScr.upClothe[var1.upgrade];
         this.advAB = GameScr.coinUpClothes[var1.upgrade];
      } else if (var1.isTypeAdorn()) {
         this.advAA = GameScr.upAdorn[var1.upgrade];
         this.advAB = GameScr.coinUpAdorns[var1.upgrade];
      } else if (var1.isTypeWeapon()) {
         this.advAA = GameScr.upWeapon[var1.upgrade];
         this.advAB = GameScr.coinUpWeapons[var1.upgrade];
      } else {
         this.advAA = 0;
         this.advAB = 0;
      }

      this.advAC = GameScr.maxPercents[var1.upgrade];
   }
}
