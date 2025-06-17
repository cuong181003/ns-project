public final class AutoHd9x extends Auto {
   private int advAA;
   private int advAB;
   private boolean[] advAC;

   public AutoHd9x() {
      super.update();
      super.mapID = 157;
      super.advAG = true;
      super.zoneID = -2;
      this.advAA = 199;
      this.advAB = 0;
      this.advAC = new boolean[3];
   }

   public final void auto() {
      if (Auto.isMyCharInactive()) {
         Auto.advAA(true);
      } else if (super.mapID != TileMap.mapID) {
         this.remap(super.mapID, super.zoneID, super.cx, super.cy);
      } else {
         Char var2 = Char.getMyChar();
         if (!Auto.advAT()) {
            label387: {
               Mob var3;
               int var5;
               Mob var6;
               if ((var3 = var2.mobFocus) == null || var3.status == 0 || !var3.isBoss || System.currentTimeMillis() - super.advAU > 5000L) {
                  AutoHd9x var10 = this;
                  MyVector var4 = GameScr.vMob;
                  var5 = 0;

                  Mob var10000;
                  while(true) {
                     if (var5 >= var4.size()) {
                        var10000 = null;
                        break;
                     }

                     if ((var6 = (Mob)var4.elementAt(var5)) != null && var6.hp > 0 && var6.status != 0 && var6.status != 1 && var6.templateId == var10.advAA && var6.levelBoss == var10.advAB) {
                        var10000 = var6;
                        break;
                     }

                     ++var5;
                  }

                  var3 = var10000;
                  if (var10000 == null && System.currentTimeMillis() - super.advAU > 1000L && !this.advAR()) {
                     var4 = GameScr.vMob;
                     var5 = 0;

                     boolean var18;
                     while(true) {
                        if (var5 >= var4.size()) {
                           var18 = true;
                           break;
                        }

                        if ((var6 = (Mob)var4.elementAt(var5)) != null && var6.hp > 0 && var6.status != 0 && var6.status != 1) {
                           var18 = false;
                           break;
                        }

                        ++var5;
                     }

                     if (var18) {
                        this.advAC[this.advAA - 198] = true;
                        if (this.advAC[0] && this.advAC[1] && this.advAC[2]) {
                           Code.java_AC();
                           break label387;
                        }
                     }

                     switch(this.advAA) {
                     case 198:
                        this.advAA = 199;
                        super.mapID = 157;
                        if (this.advAB == 0) {
                           this.advAB = 4;
                        }
                        break label387;
                     case 199:
                        this.advAA = 200;
                        super.mapID = 158;
                        break label387;
                     case 200:
                        this.advAA = 198;
                        super.mapID = 159;
                     default:
                        break label387;
                     }
                  }
               }

               if (Char.isADanhNhom && GameScr.vParty.size() > 0 && var2.nClass.classId == 6 && var2.cHP > 0) {
                  for(int var11 = 0; var11 < var2.vSkillFight.size(); ++var11) {
                     Skill var13;
                     if ((var13 = (Skill)var2.vSkillFight.elementAt(var11)) != null && var13.template.type == 4) {
                        if (!var13.isCooldown()) {
                           for(int var14 = 0; var14 < GameScr.vParty.size(); ++var14) {
                              Party var7;
                              if ((var7 = (Party)GameScr.vParty.elementAt(var14)).charId != var2.charID && var7.c != null && var7.c.cHP <= 0) {
                                 Char var8 = var7.c;
                                 if (Math.abs(var2.cx - var8.cx) > 50 || Math.abs(var2.cy - var8.cy) > 50) {
                                    Char.moveToChar(var8.cx, var8.cy);
                                 }

                                 CuongScr.sleep(500L);
                                 Service.gI().buffLive(var7.charId);
                                 var13.lastTimeUseThisSkill = System.currentTimeMillis();
                                 var13.paintCanNotUseSkill = true;
                                 var2.setAutoSkillPaint(GameScr.sks[var13.template.id], 0);
                                 CuongScr.sleep(1000L);
                                 break label387;
                              }
                           }
                        }
                        break;
                     }
                  }
               }

               if (Auto.advAO != null && var3 != null && var3.isBoss && var3.templateId == this.advAA && var3.levelBoss == this.advAB) {
                  Skill var12;
                  if ((var12 = Auto.advAO).isCooldown() && Char.isABuff) {
                     label371: {
                        var5 = 0;

                        Skill var15;
                        label266:
                        while(true) {
                           if (var5 >= var2.vSkillFight.size()) {
                              break label371;
                           }

                           if ((var15 = (Skill)var2.vSkillFight.elementAt(var5)) != null && System.currentTimeMillis() - var15.lastTimeUseThisSkill >= (long)var15.coolDown - 300L) {
                              if (var15.template.type == 2) {
                                 if ((var2.advAC == null && Char.isADungPT || var15.template.id < 67 || var15.template.id > 72) && (Char.isAKhienMana || var15.template.id != 31) && (var15.template.id != 15 || var2.cHP < var2.cMaxHP * Char.aHpValue / 100)) {
                                    int var16 = (int)(System.currentTimeMillis() / 1000L);
                                    int var17 = 0;

                                    while(true) {
                                       if (var17 >= var2.vEff.size()) {
                                          break label266;
                                       }

                                       Effect var9;
                                       if ((var9 = (Effect)var2.vEff.elementAt(var17)) != null && (var9.template.iconId == var15.template.iconId || var15.template.id == 58 && var9.template.type == 7) && var9.timeLenght - (var16 - var9.timeStart) >= 2) {
                                          break;
                                       }

                                       ++var17;
                                    }
                                 }
                              } else if (var15.template.type == 3 && var3.levelBoss == 0 && var3.hp > var3.maxHp / 2) {
                                 if (var15.template.id != 4 || Char.isADotQuai && var2.cHP < var2.cMaxHP * Char.aHpValue / 100) {
                                    break;
                                 }
                              } else if ((var15.template.id == 7 || var15.template.id == 16 || var15.template.id == 25 || var15.template.id == 34 || var15.template.id == 43) && (var3.levelBoss != 0 || var3.hp >= var3.maxHp / 2) && (var15.template.id != 7 && var15.template.id != 16 || !var3.isFire) && (var15.template.id != 25 && var15.template.id != 34 || var3.isIce) && (var15.template.id != 43 || var3.isWind)) {
                                 break;
                              }
                           }

                           ++var5;
                        }

                        var12 = var15;
                        CuongScr.sleep(500L);
                     }
                  }

                  if ((var12.template.type == 1 || var12.template.type == 3) && (Res.abs(var2.cx - var3.xFirst) > var12.dx || Res.abs(var2.cy - var3.yFirst) > var12.dy)) {
                     this.advAC(var3);
                  }

                  Service.gI().selectSkill(var12.template.id);
                  if (var12.template.type == 2) {
                     Service.gI().sendUseSkillMyBuff();
                  } else {
                     Auto.advAS.removeAllElements();
                     Auto.advAT.removeAllElements();
                     if (var3 != null) {
                        Auto.advAS.addElement(var3);

                        for(var5 = 0; var5 < GameScr.vMob.size() && Auto.advAS.size() + Auto.advAT.size() < var12.maxFight; ++var5) {
                           if ((var6 = (Mob)GameScr.vMob.elementAt(var5)).status != 0 && var6.status != 1 && !var6.equals(var3) && var3.xFirst - 100 <= var6.xFirst && var6.xFirst <= var3.xFirst + 100 && var3.yFirst - 50 <= var6.yFirst && var6.yFirst <= var3.yFirst + 50) {
                              Auto.advAS.addElement(var6);
                           }
                        }
                     }

                     Service.gI().sendPlayerAttack((MyVector)Auto.advAS, (MyVector)Auto.advAT, (int)1);
                  }

                  if (System.currentTimeMillis() - var12.lastTimeUseThisSkill >= (long)var12.coolDown) {
                     var12.lastTimeUseThisSkill = System.currentTimeMillis();
                     var12.paintCanNotUseSkill = true;
                     if (!Code.skilltape) {
                        var2.setAutoSkillPaint(GameScr.sks[var12.template.id], 0);
                     }
                  }

                  super.advAU = System.currentTimeMillis();
                  if (var12.template.id == 15) {
                     CuongScr.sleep(2000L);
                  }
               }
            }
         }

         this.advAC(-1);
      }
   }

   public final String toString() {
      return "Hang 9x Lvl " + this.advAB;
   }
}
