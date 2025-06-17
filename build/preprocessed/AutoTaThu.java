public final class AutoTaThu extends Auto {
   private TaskOrder advAZ;
   public int advAA;
   public static boolean advAB;
   public static long advAC;

   public final void update() {
      super.update();
      this.advAZ = Char.getTaskOrder(1);
      if (this.advAZ != null) {
         this.advAA = this.advAZ.killId;
         super.mapID = this.advAZ.mapId;
         if (TileMap.mapID == this.advAZ.mapId && TileMap.zoneID % 5 == 0) {
            super.zoneID = TileMap.zoneID;
            return;
         }
      }

      super.zoneID = 5;
      advAB = false;
   }

   public final void advAC(int var1, int var2) {
      super.update();
      this.advAZ = null;
      this.advAA = var2;
      super.mapID = var1;
      if (TileMap.mapID == var1 && TileMap.zoneID % 5 == 0) {
         super.zoneID = TileMap.zoneID;
      } else {
         super.zoneID = 5;
      }
   }

   public final void advAM() {
      this.advAZ = Char.getTaskOrder(1);
      super.advAM();
   }

   public final void auto() {
      if (super.mapID >= 0 && (!(super.T instanceof AutoStanima) || System.currentTimeMillis() - super.advAL < 3600000L)) {
         boolean var10000;
         int var1;
         if (Auto.isMyCharInactive()) {
            if (Char.isADanhNhom && TileMap.mapID == super.mapID && TileMap.zoneID == super.zoneID && Char.getMyChar().mobFocus != null && Char.getMyChar().mobFocus.hp < Char.getMyChar().mobFocus.maxHp / 20) {
               var1 = 0;

               while(true) {
                  if (var1 >= GameScr.vParty.size()) {
                     var10000 = false;
                     break;
                  }

                  Party var2;
                  if ((var2 = (Party)GameScr.vParty.elementAt(var1)).c != null && var2.c.cHP > 0) {
                     var10000 = true;
                     break;
                  }

                  ++var1;
               }
            } else {
               var10000 = false;
            }

            if (!var10000) {
               Auto.advAA(true);
               return;
            }
         } else if (TileMap.mapID == super.mapID && TileMap.zoneID == super.zoneID) {
            if (this.advAZ != null && this.advAZ.count >= this.advAZ.maxCount) {
               GameScr.paint("Xong Tà Thú");
               Code.java_AC();
               return;
            }

            if (Char.getMyChar().cName.equals(Code.cNameLeader)) {
               if (Char.getMyChar().mobFocus != null && Char.getMyChar().mobFocus.hp < Char.getMyChar().mobFocus.maxHp / 10) {
                  if (!LockGame.advBG()) {
                     Service.gI().chatParty("waitGr");
                     LockGame.advAA(200000L);
                     Service.gI().chatParty("notifyGr");
                  }

                  var10000 = false;
               } else {
                  var10000 = false;
               }
            } else {
               if (advAB && System.currentTimeMillis() - advAC > 120000L) {
                  advAB = false;
               }

               var10000 = advAB;
            }

            if (!var10000) {
               this.advAB(this.advAA, 8);
            }

            if (Char.getMyChar().cMP < Char.getMyChar().cMaxMP * Char.aMpValue / 100) {
               Char.getMyChar().doUsePotion(17);
            }

            if (Char.getMyChar().cHP < Char.getMyChar().cMaxHP * Char.aHpValue / 100) {
               var1 = (int)(System.currentTimeMillis() / 1000L);

               for(int var4 = 0; var4 < Char.getMyChar().vEff.size(); ++var4) {
                  Effect var3;
                  if ((var3 = (Effect)Char.getMyChar().vEff.elementAt(var4)).template.id == 21 && var3.timeLenght - (var1 - var3.timeStart) >= 2) {
                     return;
                  }
               }

               Char.getMyChar().doUsePotion(16);
               return;
            }
         } else {
            this.remap(super.mapID, super.zoneID, super.cx, super.cy);
         }

      } else {
         Code.java_AC();
      }
   }

   public final String toString() {
      return "Auto Tà Thú";
   }
}
