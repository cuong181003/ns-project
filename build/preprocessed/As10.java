public class As10 extends Auto {
   public As10() {
      super.update();
   }

   public boolean advAA(Char var1) {
      return var1.ctaskId >= 9;
   }

   public void advAA(Char var1, byte var2, byte var3) {
      switch(var1.ctaskId) {
      case 0:
         NpcTemplate var5 = Npc.arrNpcTemplate[var3];

         for(int var7 = 0; var7 < var5.menu.length; ++var7) {
            if (var5.menu[var7][0].equals("Nói chuyện")) {
               GameScr.pickNPC(var3, var7, 0);
               LockGame.advAO();
               return;
            }
         }

         return;
      case 1:
         if (var1.taskMaint.index == 0) {
            GameScr.pickNPC(var3, 0, 0);
            Service.gI().getTask(var3, 1, -1);
            LockGame.advAO();
            return;
         }

         if (var1.taskMaint.index == 1) {
            Service.gI().getTask(var3, 0, -1);
            LockGame.advAO();
            return;
         }

         if (var1.taskMaint.index == 2) {
            Service.gI().getTask(var3, 1, -1);
            LockGame.advAO();
            return;
         }

         if (var1.taskMaint.index == 3) {
            Service.gI().getTask(var3, 2, -1);
            LockGame.advAO();
            return;
         }

         if (var1.taskMaint.index == 4) {
            Service.gI().getTask(var3, 0, -1);
            LockGame.advAO();
            return;
         }
         break;
      case 2:
         if (var1.taskMaint.index == 0) {
            if (var1.arrItemBag[0] != null) {
               Service.gI().useItem(0);
            }

            LockGame.advAO();
            return;
         }

         if (var1.taskMaint.index == 1) {
            if (TileMap.mapID == 22) {
               this.advAC(-1);
               this.advAB(0, 1);
               return;
            }

            this.remap(22, -1, -1, -1);
            return;
         }
         break;
      case 3:
         if (var1.taskMaint.index == 0) {
            CuongScr.sleep(2000L);
            GameScr.pickNPC(4, 0, 0);
            Service.gI().buyItem(9, 0, 3);
            LockGame.advAO();
            return;
         }

         if (var1.taskMaint.index == 1) {
            if (var1.arrItemBag[0] != null) {
               Service.gI().useItem(0);
            }

            LockGame.advAO();
            return;
         }

         if (var1.taskMaint.index == 2) {
            if (TileMap.mapID == 23) {
               this.advAC(-1);
               this.advAB(1, 1);
               return;
            }

            this.remap(23, -1, -1, -1);
            return;
         }

         if (var1.taskMaint.index == 3) {
            if (TileMap.mapID == 23) {
               this.advAC(-1);
               this.advAB(2, 1);
               return;
            }

            this.remap(23, -1, -1, -1);
            return;
         }
         break;
      case 4:
         if (var1.taskMaint.index == 0) {
            if (TileMap.mapID == 21) {
               this.advAC(-1);
               this.advAB(-1, 1);
               return;
            }

            this.remap(21, -1, -1, -1);
            return;
         }

         if (var1.taskMaint.index == 1) {
            if (TileMap.mapID == 21) {
               this.advAC(209);
               this.advAB(3, 1);
               return;
            }

            this.remap(21, -1, -1, -1);
            return;
         }

         if (var1.taskMaint.index == 2) {
            if (TileMap.mapID == 23) {
               this.advAC(210);
               this.advAB(4, 1);
               return;
            }

            this.remap(23, -1, -1, -1);
            return;
         }
         break;
      case 5:
         if (var1.taskMaint.index == 0) {
            if (TileMap.mapID == 20) {
               this.advAC(-1);
               this.advAB(3, 1);
               return;
            }

            this.remap(20, -1, -1, -1);
            return;
         }

         if (var1.taskMaint.index == 1) {
            if (TileMap.mapID == 20) {
               this.advAC(211);
               this.advAB(54, 1);
               return;
            }

            this.remap(20, -1, -1, -1);
            return;
         }
         break;
      case 6:
         if (var1.taskMaint.index == 0) {
            if (TileMap.mapID == 26) {
               this.advAC(-1);
               this.advAB(-1, 1);
               return;
            }

            this.remap(26, -1, -1, -1);
            return;
         }

         if (var1.taskMaint.index == 1) {
            super.remap(2, -2, -1, -1);
            CuongScr.sleep(500L);
            return;
         }

         if (var1.taskMaint.index == 2) {
            super.remap(71, -2, -1, -1);
            CuongScr.sleep(500L);
            return;
         }

         if (var1.taskMaint.index == 3) {
            super.remap(26, -2, -1, -1);
            CuongScr.sleep(500L);
            return;
         }
         break;
      case 7:
         if (var1.taskMaint.index == 0) {
            if (TileMap.mapID == 71) {
               this.advAC(-1);
               this.advAB(-1, 1);
               return;
            }

            this.remap(71, -1, -1, -1);
            return;
         }

         if (var1.taskMaint.index == 1) {
            super.remap(var2, -2, -1, -1);
            GameScr.pickNPC(var3, 0, 0);
            Service.gI().getTask(var3, 1, -1);
            LockGame.advAO();
            return;
         }

         if (var1.taskMaint.index == 2) {
            Service.gI().getTask(var3, 0, -1);
            LockGame.advAO();
            return;
         }

         if (var1.taskMaint.index == 3) {
            Service.gI().getTask(var3, 1, -1);
            LockGame.advAO();
            return;
         }

         if (var1.taskMaint.index == 4) {
            Service.gI().getTask(var3, 1, -1);
            LockGame.advAO();
            return;
         }

         if (var1.taskMaint.index == 5) {
            Service.gI().getTask(var3, 2, -1);
            LockGame.advAO();
            return;
         }

         if (var1.taskMaint.index == 6) {
            GameScr.pickNPC(var3, 0, 0);
            Service.gI().getTask(var3, 2, -1);
            LockGame.advAO();
            return;
         }

         if (var1.taskMaint.index == 7) {
            Service.gI().getTask(var3, 0, -1);
            LockGame.advAO();
            return;
         }

         if (var1.taskMaint.index == 8) {
            Service.gI().getTask(var3, 2, -1);
            LockGame.advAO();
            return;
         }

         if (var1.taskMaint.index == 9) {
            Service.gI().getTask(var3, 2, -1);
            LockGame.advAO();
            return;
         }

         if (var1.taskMaint.index == 10) {
            Service.gI().getTask(var3, 1, -1);
            LockGame.advAO();
            return;
         }

         if (var1.taskMaint.index == 11) {
            GameScr.pickNPC(var3, 0, 0);
            Service.gI().getTask(var3, 0, -1);
            LockGame.advAO();
            return;
         }

         if (var1.taskMaint.index == 12) {
            Service.gI().getTask(var3, 1, -1);
            LockGame.advAO();
            return;
         }

         if (var1.taskMaint.index == 13) {
            Service.gI().getTask(var3, 2, -1);
            LockGame.advAO();
            return;
         }

         if (var1.taskMaint.index == 14) {
            Service.gI().getTask(var3, 2, -1);
            LockGame.advAO();
            return;
         }

         if (var1.taskMaint.index == 15) {
            Service.gI().getTask(var3, 1, -1);
            LockGame.advAO();
            return;
         }
         break;
      case 8:
         if (var1.taskMaint.index == 0) {
            if (TileMap.mapID == 26) {
               this.advAC(-1);
               this.advAB(-1, 1);
               return;
            }

            this.remap(26, -1, -1, -1);
            return;
         }

         super.remap(var2, -2, -1, -1);
         GameScr.advAH(var3);
         NpcTemplate var6 = Npc.arrNpcTemplate[var3];

         for(int var4 = 0; var4 < var6.menu.length; ++var4) {
            if (var6.menu[var4][0].equals("Nói chuyện")) {
               GameScr.pickNPC(var3, var4, 0);
               LockGame.advAO();
               CuongScr.sleep(1000L);
               return;
            }
         }
      }

   }

   public final void auto() {
      Char var1 = Char.getMyChar();
      if (this.advAA(var1)) {
         GameScr.paint("Xong!");
         Code.endAuto();
      } else {
         byte var2 = GameScr.getTaskMapId();
         byte var3 = GameScr.getTaskNpcId();
         if (Char.getMyChar().cHP <= 0) {
            Auto.advAA(false);
         } else if (var1.taskMaint == null) {
            if (TileMap.mapID != var2) {
               super.remap(var2, -2, -1, -1);
            } else {
               GameScr.pickNPC(var3, 0, 0);
               Service.gI().getTask(var3, 0, -1);
               LockGame.advAO();
               super.zoneID = -1;
            }
         } else if (var1.taskMaint.index >= var1.taskMaint.subNames.length - 1) {
            if (TileMap.mapID != var2) {
               super.remap(var2, -2, -1, -1);
            } else {
               GameScr.pickNPC(var3, 0, 0);
               Service.gI().getTask(var3, 0, -1);
               LockGame.advAO();
               super.zoneID = -1;
            }
         } else {
            this.advAA(var1, var2, var3);
         }
      }
   }

   public String toString() {
      return "Auto Nhiệm Vụ 10";
   }
}
