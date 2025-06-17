public final class AutoLoiWin extends Auto {
   private static boolean advAA = false;
   private static boolean advAB = false;
   private long advAC;
   private long advAZ;
   private long advBA = 0L;
   private long advBB;
   private long advBC;

   public final void advAA() {
      super.update();
      advAA = false;
      advAB = false;
   }

   public final void auto() {
      if (isMyCharInactive()) {
         if (TileMap.mapID != 111) {
            Auto.advAA(true);
         }
      } else {
         int var1;
         Char var2;
         Npc var5;
         if (!advAA && !advAB) {
            if (TileMap.mapID == 110) {
               advAA = true;
               advAB = false;
               this.advBC = System.currentTimeMillis();
            } else if (TileMap.mapID == FormDanhVong.advAC && TileMap.zoneID == FormDanhVong.advAD) {
               var5 = GameScr.findNPC(0);
               if (Char.getMyChar().cx == var5.cx && Char.getMyChar().cy == var5.cy) {
                  for(var1 = 0; var1 < GameScr.vCharInMap.size(); ++var1) {
                     var2 = (Char)GameScr.vCharInMap.elementAt(var1);
                     if (FormDanhVong.advAB.equals(var2.cName) && System.currentTimeMillis() - this.advAZ >= 5000L) {
                        Service.gI().textBoxId((short)2, (String)FormDanhVong.advAB);
                        GameCanvas.endDlg();
                        this.advAZ = System.currentTimeMillis();
                        return;
                     }
                  }
               } else {
                  Char.moveToChar(var5.cx, var5.cy);
                  Auto.sleep(1000L);
               }

            } else if (TileMap.mapID != 111 && TileMap.mapID != 129 && TileMap.mapID != 149) {
               this.remap(FormDanhVong.advAC, FormDanhVong.advAD, -1, -1);
            } else {
               Auto.sleep(1000L);
               Auto.advAP();
            }
         } else {
            if (advAA && !advAB) {
               if (TileMap.mapID == 111) {
                  advAA = true;
                  advAB = true;
                  this.advAC = System.currentTimeMillis();
                  return;
               }

               if (TileMap.mapID == 110) {
                  var5 = GameScr.findNPC(0);
                  if (Char.getMyChar().cx == var5.cx && Char.getMyChar().cy == var5.cy) {
                     if (System.currentTimeMillis() - this.advBA >= 3000L) {
                        Service.gI().textBoxId((short)3, (String)String.valueOf(FormDanhVong.advAG));
                        GameCanvas.endDlg();
                        Auto.sleep(3000L);
                        this.advBA = System.currentTimeMillis();
                     }

                     return;
                  }

                  Char.moveToChar(var5.cx, var5.cy);
                  Auto.sleep(1000L);
                  this.advBA = System.currentTimeMillis();
                  return;
               }

               if (System.currentTimeMillis() - this.advBC > 30000L) {
                  advAA = false;
                  advAB = false;
                  return;
               }
            } else if (advAA && advAB) {
               if (TileMap.mapID != 111) {
                  advAA = false;
                  advAB = false;
                  this.advAC = System.currentTimeMillis();
                  sleep(2000L);
                  return;
               }

               if (System.currentTimeMillis() - this.advAC >= 59000L) {
                  var2 = null;

                  for(var1 = 0; var1 < GameScr.vCharInMap.size(); ++var1) {
                     Char var3;
                     if ((var3 = (Char)GameScr.vCharInMap.elementAt(var1)).cName.equals(FormDanhVong.advAB)) {
                        var2 = var3;
                        break;
                     }
                  }

                  if (var2 == null) {
                     int var7 = (int)(System.currentTimeMillis() / 1000L);
                     if (GameScr.gI().timeLengthMap - (var7 - GameScr.gI().timeStartMap) <= 0) {
                        advAA = false;
                        advAB = false;
                        this.advAC = System.currentTimeMillis();
                        sleep(2000L);
                     }

                     return;
                  }

                  if (Auto.advAO != null && var2.cHP > 0) {
                     Skill var6 = Auto.advAO;
                     Char var4 = Char.getMyChar();
                     if (var6.template.type == 2) {
                        Service.gI().selectSkill(var6.template.id);
                        Service.gI().sendUseSkillMyBuff();
                     } else {
                        if ((var6.template.type == 1 || var6.template.type == 3) && (Res.abs(var4.cx - var2.cx) > var6.dx + 30 || Res.abs(var4.cy - var2.cy) > var6.dy + 30) && System.currentTimeMillis() - this.advBB > 1500L) {
                           Auto.advAD(var2);
                           this.advBB = System.currentTimeMillis();
                        }

                        Auto.advAS.removeAllElements();
                        Auto.advAT.removeAllElements();
                        Auto.advAT.addElement(var2);
                        Service.gI().selectSkill(var6.template.id);
                        Service.gI().sendPlayerAttack((MyVector)Auto.advAS, (MyVector)Auto.advAT, (int)2);
                     }

                     if (System.currentTimeMillis() - var6.lastTimeUseThisSkill >= (long)var6.coolDown + 50L) {
                        var6.lastTimeUseThisSkill = System.currentTimeMillis();
                        var6.paintCanNotUseSkill = true;
                        if (!Code.skilltape) {
                           var4.setAutoSkillPaint(GameScr.sks[var6.template.id], 0);
                        }
                     }

                     super.advAU = System.currentTimeMillis();
                  }
               }
            }

         }
      }
   }

   public final String toString() {
      return "Lôi win";
   }
}
