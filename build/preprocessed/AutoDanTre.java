public final class AutoDanTre extends Auto {
   public AutoDanTre() {
      super.update();
      super.zoneID = TileMap.zoneID;
   }

   private static void advAA(Char var0) {
      if (var0 != null) {
         Char var1 = Char.getMyChar();
         Char.moveToChar(var0.cx, var0.cy);
         var1.charFocus = var0;
         CuongScr.sleep(100L);
      }

   }

   protected final void auto() {
      if (Char.getMyChar().cHP <= 0) {
         Auto.advAA(true);
      } else {
         if (TileMap.mapID == 33) {
            Char var1;
            if ((var1 = Char.getMyChar()).ctaskId != 17 || var1.taskMaint.index >= var1.taskMaint.subNames.length - 1) {
               Code.endAuto();
               return;
            }

            if (var1.advAD == null) {
               GameScr.pickNPC(17, 0, 0);
               CuongScr.sleep(2000L);
               return;
            }

            if (Res.distance(var1.cx, var1.cy, var1.advAD.cx, var1.advAD.cy) > 200) {
               advAA(var1.advAD);
            }

            Char var2 = Char.getMyChar();
            Skill var3 = Auto.advAO;
            if (Char.isABuff) {
               for(int var4 = 0; var4 < var2.vSkillFight.size(); ++var4) {
                  Skill var5;
                  if ((var5 = (Skill)var2.vSkillFight.elementAt(var4)) != null && !var5.isCooldown() && var5.template.type == 2 && (var5.template.id != 47 || var2.cHP < var2.cMaxHP * Char.aHpValue / 100)) {
                     boolean var6 = false;

                     for(int var7 = 0; var7 < var2.vEff.size(); ++var7) {
                        Effect var8;
                        if ((var8 = (Effect)var2.vEff.elementAt(var7)) != null && var8.template.iconId == var5.template.iconId) {
                           var6 = true;
                           break;
                        }
                     }

                     if (!var6) {
                        var3 = var5;
                        CuongScr.sleep(500L);
                        break;
                     }
                  }
               }
            }

            label173: {
               if (var3.template.type == 2) {
                  Service.gI().sendUseSkillMyBuff();
               } else {
                  Char var12;
                  MyVector var13;
                  int var15;
                  Char var10000;
                  label170: {
                     if ((var12 = Char.getMyChar()).advAD != null) {
                        var13 = GameScr.vCharInMap;

                        for(var15 = 0; var15 < var13.size(); ++var15) {
                           Char var16;
                           if ((var16 = (Char)var13.elementAt(var15)) != null && var16.statusMe != 14 && var16.statusMe != 5 && var16.statusMe != 15 && (var16.cTypePk == 3 || var12.cTypePk == 3 || var16.cTypePk == 1 && var12.cTypePk == 1 || var12.killCharId >= 0 && var12.killCharId == var16.charID || var12.testCharId >= 0 && var12.testCharId == var16.charID) && Res.distance(var16.cx, var16.cy, var12.advAD.cx, var12.advAD.cy) < 200) {
                              var10000 = var16;
                              break label170;
                           }
                        }
                     }

                     var10000 = null;
                  }

                  var12 = var10000;
                  if (var10000 != null) {
                     if (Res.distance(var12.cx, var12.cy, var2.advAD.cx, var2.advAD.cy) < 200 && (Res.abs(var2.cx - var12.cx) > var3.dx || Res.abs(var2.cy - var12.cy) > var3.dy)) {
                        advAA(var12);
                     }

                     Service.gI().selectSkill(var3.template.id);
                     Auto.advAS.removeAllElements();
                     Auto.advAT.removeAllElements();
                     Auto.advAT.addElement(var12);
                     Service.gI().sendPlayerAttack((MyVector)Auto.advAS, (MyVector)Auto.advAT, (int)2);
                  } else {
                     Mob var18;
                     label128: {
                        if ((var12 = Char.getMyChar()).advAD != null) {
                           var13 = GameScr.vMob;

                           for(var15 = 0; var15 < var13.size(); ++var15) {
                              Mob var17;
                              if ((var17 = (Mob)var13.elementAt(var15)) != null && var17.hp > 0 && var17.status != 0 && var17.status != 1 && Res.distance(var17.x, var17.y, var12.advAD.cx, var12.advAD.cy) < 200) {
                                 var18 = var17;
                                 break label128;
                              }
                           }
                        }

                        var18 = null;
                     }

                     Mob var14 = var18;
                     if (var18 == null) {
                        break label173;
                     }

                     if (Res.distance(var14.x, var14.y, var2.advAD.cx, var2.advAD.cy) < 200 && (Res.abs(var2.cx - var14.x) > var3.dx || Res.abs(var2.cy - var14.y) > var3.dy)) {
                        this.advAC(var14);
                     }

                     Service.gI().selectSkill(var3.template.id);
                     Auto.advAS.removeAllElements();
                     Auto.advAT.removeAllElements();
                     Auto.advAS.addElement(var14);
                     Service.gI().sendPlayerAttack((MyVector)Auto.advAS, (MyVector)Auto.advAT, (int)1);
                  }
               }

               if (System.currentTimeMillis() - var3.lastTimeUseThisSkill >= (long)var3.coolDown) {
                  var3.lastTimeUseThisSkill = System.currentTimeMillis();
                  var3.paintCanNotUseSkill = true;
                  if (!Code.skilltape) {
                     var2.setAutoSkillPaint(GameScr.sks[var3.template.id], 0);
                  }
               }
            }

            if (Char.getMyChar().cMP < Char.getMyChar().cMaxMP * Char.aMpValue / 100) {
               Char.getMyChar().doUsePotion(17);
            }

            if (Char.getMyChar().cHP < Char.getMyChar().cMaxHP * Char.aHpValue / 100) {
               int var9 = (int)(System.currentTimeMillis() / 1000L);

               for(int var10 = 0; var10 < Char.getMyChar().vEff.size(); ++var10) {
                  Effect var11;
                  if ((var11 = (Effect)Char.getMyChar().vEff.elementAt(var10)).template.id == 21 && var11.timeLenght - (var9 - var11.timeStart) >= 2) {
                     return;
                  }
               }

               Char.getMyChar().doUsePotion(16);
               return;
            }
         } else {
            this.remap(33, super.zoneID, -1, -1);
         }

      }
   }

   public final String toString() {
      return "Dẫn trẻ";
   }
}
