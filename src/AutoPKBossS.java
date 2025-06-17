public final class AutoPKBossS extends Auto {
   public int advAA;
   public int advAB;
   private int advAC;
   private MyVector advAZ;
   private MyVector advBA;
   private long advBB;

   public AutoPKBossS(MyVector var1, MyVector var2, int var3) {
      this.advAA = 0;
      this.advAB = -1;
      this.advAC = var3;
      this.advAZ = var1;
      this.advBA = var2;
   }

   public AutoPKBossS(int var1) {
      this.advAA = 1;
      this.advAB = -1;
      this.advAC = var1;
      this.advBB = System.currentTimeMillis();
   }

   protected final void auto() {
      if (Char.getMyChar().cHP <= 0) {
         Auto.advAA(true);
      } else {
         switch(this.advAA) {
         case 0:
            if (TileMap.mapID == 38 && TileMap.zoneID == 21) {
               LockGame.advBJ();
               this.advAA = 2;
               return;
            }

            this.remap(38, 21, -1, -1);
            return;
         case 1:
            if (System.currentTimeMillis() - this.advBB > 180000L) {
               Code.java_AC();
               return;
            }

            if (TileMap.mapID != 38 || TileMap.zoneID != 21) {
               this.remap(38, 21, -1, -1);
               return;
            }
            break;
         case 2:
            if (this.advAZ.size() > 0) {
               int var1 = this.advAZ.size() - 1;
               super.mapID = ((Integer)this.advAZ.elementAt(var1)).intValue();
               this.advAB = ((Integer)this.advBA.elementAt(var1)).intValue();
               this.advAZ.removeElementAt(var1);
               this.advBA.removeElementAt(var1);
               this.advAA = 3;
               Service.gI().chatParty("pkms " + super.mapID + " " + this.advAB);
               return;
            }

            this.advAA = 4;
            Service.gI().chatParty("pkes");
            return;
         case 3:
            if (this.advAB > 0) {
               if (TileMap.mapID != this.advAB) {
                  this.remap(this.advAB, -2, -1, -1);
                  return;
               }

               GameScr.pickNPC(5, 1, 0);
               if (LockGame.advAY()) {
                  this.advAA = 5;
                  Code.setAuto((Auto)(new AutoPKBoss(super.mapID)));
                  return;
               }
            }
            break;
         case 4:
            if (this.advAC > 0) {
               if (TileMap.mapID != this.advAC) {
                  this.remap(this.advAC, -2, -1, -1);
                  return;
               }

               GameScr.pickNPC(5, 1, 0);
               if (LockGame.advAY()) {
                  Code.java_AC();
                  return;
               }
            } else {
               this.advAC = 22;
            }
            break;
         case 5:
            CuongScr.sleep(10000L);
            if (Code.cNameLeader != null && !Char.getMyChar().cName.equals(Code.cNameLeader)) {
               this.advAA = 1;
               this.advBB = System.currentTimeMillis();
               return;
            } else {
               this.advAA = 2;
               return;
            }
         }

      }
   }

   public final String toString() {
      return "PKBoss S";
   }
}
