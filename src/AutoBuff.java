public final class AutoBuff extends Auto {
   private boolean advAA;
   private boolean advAB;
   private long advAC = 0L;

   public final void advAA(int var1, int var2, boolean var3, boolean var4) {
      super.update();
      super.mapID = var1;
      super.zoneID = var2;
      super.advAG = TileMap.isHang(var1);
      this.advAA = var3;
      this.advAB = var4;
      super.advAD = true;
   }

   public final void auto() {
      if (Auto.isMyCharInactive()) {
         Auto.advAA(true);
      } else {
         if (super.mapID == TileMap.mapID && (TileMap.isHang(super.mapID) || super.zoneID == TileMap.zoneID)) {
            Char var1 = Char.getMyChar();
            int var4;
            int var5;
            int var6;
            Char var9;
            if (this.advAB && (GameScr.vParty.size() > 1 || Code.advAK.size() > 0) && var1.nClass.classId == 6) {
               for(int var2 = 0; var2 < var1.vSkillFight.size(); ++var2) {
                  Skill var3;
                  if ((var3 = (Skill)var1.vSkillFight.elementAt(var2)) != null && var3.template.type == 4) {
                     if (System.currentTimeMillis() - this.advAC > 3000L) {
                        for(var4 = 0; var4 < GameScr.vParty.size(); ++var4) {
                           Party var8;
                           if ((var8 = (Party)GameScr.vParty.elementAt(var4)).charId != var1.charID && var8.c != null && var8.c.cHP <= 0) {
                              var5 = var1.cx;
                              var6 = var1.cy;
                              Char var14;
                              Char.moveToChar((var14 = var8.c).cx, var14.cy);
                              CuongScr.sleep(500L);
                              if (Auto.advAC(var14)) {
                                 this.advAC = System.currentTimeMillis();
                                 Service.gI().buffLive(var8.charId);
                                 var3.lastTimeUseThisSkill = System.currentTimeMillis();
                                 var3.paintCanNotUseSkill = true;
                                 var1.setAutoSkillPaint(GameScr.sks[var3.template.id], 0);
                                 CuongScr.sleep(1000L);
                              }

                              Char.moveToChar(var5, var6);
                              return;
                           }
                        }

                        for(var4 = 0; var4 < GameScr.vCharInMap.size(); ++var4) {
                           if ((var9 = (Char)GameScr.vCharInMap.elementAt(var4)) != null && Auto.advAC(var9) && Code.advAA(var9.cName)) {
                              var5 = var1.cx;
                              var6 = var1.cy;
                              Char.moveToChar(var9.cx, var9.cy);
                              CuongScr.sleep(500L);
                              if (Auto.advAC(var9)) {
                                 this.advAC = System.currentTimeMillis();
                                 Service.gI().buffLive(var9.charID);
                                 var3.lastTimeUseThisSkill = System.currentTimeMillis();
                                 var3.paintCanNotUseSkill = true;
                                 var1.setAutoSkillPaint(GameScr.sks[var3.template.id], 0);
                                 CuongScr.sleep(1000L);
                              }

                              Char.moveToChar(var5, var6);
                              return;
                           }
                        }
                     }
                     break;
                  }
               }
            }

            var9 = GameScr.vParty.size() > 0 ? ((Party)GameScr.vParty.firstElement()).c : null;
            if (this.advAA && this.advAQ() && var9 != null && var1.nClass.classId == 6) {
               for(int var10 = 0; var10 < var1.vSkillFight.size(); ++var10) {
                  Skill var15;
                  if ((var15 = (Skill)var1.vSkillFight.elementAt(var10)) != null && !var15.isCooldown() && var15.template.type == 2 && (var15.template.id < 67 || var15.template.id > 72) && (var15.template.id != 47 || var9.cHP < var9.cMaxHP * Char.aHpValue / 100)) {
                     System.currentTimeMillis();

                     for(var5 = 0; var5 < var9.vEff.size(); ++var5) {
                        var9.vEff.elementAt(var5);
                     }

                     var5 = var1.cx;
                     var6 = var1.cy;
                     Char.moveToChar(var9.cx, var9.cy);
                     Service.gI().selectSkill(var15.template.id);
                     Service.gI().sendUseSkillMyBuff();
                     var15.lastTimeUseThisSkill = System.currentTimeMillis();
                     var15.paintCanNotUseSkill = true;
                     var1.setAutoSkillPaint(GameScr.sks[var15.template.id], 0);
                     CuongScr.sleep(1000L);
                     Char.moveToChar(var5, var6);
                     return;
                  }
               }
            }

            if (Code.isPk) {
               Char var12;
               if (((var12 = var1.charFocus) == null || !SavePK.advAC(var12.cName) && !Auto.advAA(var1, var12)) && (var12 = this.advAA((Char)var1, -1)) == null) {
                  var12 = Auto.advAE(var1);
               }

               boolean var16 = var12 != null && SavePK.advAC(var12.cName);
               if (var12 == null && super.advAX) {
                  Service.gI().changePk(0);
                  super.advAX = false;
               }

               if (var1.cPk >= 5 && System.currentTimeMillis() - super.advAW > 5000L) {
                  Item var11;
                  if ((var11 = Char.getBagItem(257)) != null && var11.template.id == 257) {
                     Service.gI().useItem(var11.indexUI);
                  }

                  super.advAW = System.currentTimeMillis();
               }

               if (var12 != null && var12 != null && !Auto.advAC(var12) && (var16 || Auto.advAA(var1, var12))) {
                  Skill var13 = Auto.advAO;
                  if (var16) {
                     if ((var13.template.type == 1 || var13.template.type == 3) && (Res.abs(var1.cx - var12.cx) > var13.dx + 30 || Res.abs(var1.cy - var12.cy) > var13.dy + 30) && System.currentTimeMillis() - super.advAV > 1500L) {
                        Auto.advAD(var12);
                        super.advAV = System.currentTimeMillis();
                     }

                     if (var12.killCharId != var1.charID && var12.cTypePk != 3) {
                        super.advAX = true;
                        Service.gI().changePk(3);
                     }
                  }

                  var5 = var13.dx;
                  var6 = var13.dy;
                  Auto.advAS.removeAllElements();
                  Auto.advAT.removeAllElements();
                  Auto.advAT.addElement(var12);

                  for(var4 = 0; var4 < GameScr.vCharInMap.size() && Auto.advAS.size() + Auto.advAT.size() < var13.maxFight; ++var4) {
                     Char var7;
                     if ((var7 = (Char)GameScr.vCharInMap.elementAt(var4)).cHP > 0 && var7.statusMe != 14 && var7.statusMe != 5 && var7.statusMe != 15 && !var7.equals(var12) && (var7.cTypePk == 3 || var1.cTypePk == 3 || var7.cTypePk == 1 && var1.cTypePk == 1 || var1.killCharId >= 0 && var1.killCharId == var7.charID || var1.testCharId >= 0 && var1.testCharId == var7.charID) && !Code.advAD(var7.cName) && var12.cx - var5 <= var7.cx && var7.cx <= var12.cx + var5 && var12.cy - var6 <= var7.cy && var7.cy <= var12.cy + var6) {
                        Auto.advAT.addElement(var7);
                     }
                  }

                  Service.gI().sendPlayerAttack((MyVector)Auto.advAS, (MyVector)Auto.advAT, (int)2);
                  if (System.currentTimeMillis() - var13.lastTimeUseThisSkill >= (long)var13.coolDown) {
                     var13.lastTimeUseThisSkill = System.currentTimeMillis();
                     var13.paintCanNotUseSkill = true;
                     if (!Code.skilltape) {
                        var1.setAutoSkillPaint(GameScr.sks[var13.template.id], 0);
                     }
                  }

                  super.advAU = System.currentTimeMillis();
                  return;
               }
            }
         } else {
            this.remap(super.mapID, super.zoneID, -1, -1);
         }

      }
   }

   public final String toString() {
      if (this.advAA && this.advAB) {
         return "Buff HS Xa";
      } else {
         return this.advAB ? "HSinh Xa" : "Buff Xa";
      }
   }
}
