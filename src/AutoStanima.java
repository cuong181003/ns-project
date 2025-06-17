import java.util.Calendar;

public final class AutoStanima extends Auto {
   private boolean advBB;
   private boolean advBC;
   private int advBD;
   private boolean advBE;
   public int advAA;
   private int advBF;
   private int advBG;
   private boolean advBH;
   private int advBI;
   private long advBJ;
   public int advAB;
   private long advBK;
   public static boolean advAC;
   public static boolean advAZ;
   public static boolean advBA;

   public final void advAA(int var1, int var2, int var3, boolean var4, boolean var5) {
      super.update();
      super.mapID = var2;
      super.zoneID = var3;
      this.advAB = var1;
      this.advBB = var4;
      this.advBC = var5;
      this.advAA = 0;
      this.advBJ = 0L;
      this.advBE = true;
      this.advBD = -1;
      Calendar var6 = Res.advAB();
      this.advBI = var6.get(11) < 2 ? var6.get(5) - 1 : var6.get(5);
   }

   public final void advAA(String var1) {
      if (Code.cNameLeader != null && !TileMap.isLangCo(super.mapID)) {
         if (var1.startsWith("Thần thú đã xuất hiện tại")) {
            if (Char.getMyChar().cName.equals(Code.cNameLeader)) {
               int var2 = Char.getMyChar().clevel;
               MyVector var3 = new MyVector();
               MyVector var4 = new MyVector();
               if (var2 >= 40 && var2 <= 60) {
                  if (var1.indexOf("Đảo Hebi") > 0) {
                     var3.addElement(new Integer(34));
                     var4.addElement(new Integer(32));
                  }

                  if (var1.indexOf("Hang Meiro") > 0) {
                     var3.addElement(new Integer(35));
                     var4.addElement(new Integer(32));
                  }

                  if (var1.indexOf("Rừng Kappa") > 0) {
                     var3.addElement(new Integer(52));
                     var4.addElement(new Integer(48));
                  }

                  if (var1.indexOf("Rừng Aokigahara") > 0) {
                     var3.addElement(new Integer(14));
                     var4.addElement(new Integer(10));
                  }

                  if (var1.indexOf("Rừng Aokigahara") > 0) {
                     var3.addElement(new Integer(14));
                     var4.addElement(new Integer(10));
                  }

                  if (var1.indexOf("Vách núi Ito") > 0) {
                     var3.addElement(new Integer(15));
                     var4.addElement(new Integer(10));
                  }

                  if (var1.indexOf("Núi Anzen") > 0) {
                     var3.addElement(new Integer(68));
                     var4.addElement(new Integer(38));
                  }

                  if (var1.indexOf("Thung lũng Taira") > 0) {
                     var3.addElement(new Integer(16));
                     var4.addElement(new Integer(10));
                  }
               }

               if (var2 >= 50 && var2 <= 70) {
                  if (var1.indexOf("Núi Ontake") > 0) {
                     var3.addElement(new Integer(67));
                     var4.addElement(new Integer(38));
                  }

                  if (var1.indexOf("Đỉnh Okama") > 0) {
                     var3.addElement(new Integer(44));
                     var4.addElement(new Integer(43));
                  }
               }

               if (var2 >= 60 && var2 <= 80) {
                  if (var1.indexOf("Khu đá đỏ Akai") > 0) {
                     var3.addElement(new Integer(41));
                     var4.addElement(new Integer(43));
                  }

                  if (var1.indexOf("Mũi Hone") > 0) {
                     var3.addElement(new Integer(59));
                     var4.addElement(new Integer(38));
                  }

                  if (var1.indexOf("Đỉnh Ichidai") > 0) {
                     var3.addElement(new Integer(24));
                     var4.addElement(new Integer(38));
                  }

                  if (var1.indexOf("Hang núi Kurai") > 0) {
                     var3.addElement(new Integer(45));
                     var4.addElement(new Integer(43));
                  }
               }

               if (var2 >= 70 && var2 <= 100) {
                  if (var1.indexOf("Ngôi đền Orochi") > 0) {
                     var3.addElement(new Integer(19));
                     var4.addElement(new Integer(17));
                  }

                  if (var1.indexOf("Đồng Kisei") > 0) {
                     var3.addElement(new Integer(36));
                     var4.addElement(new Integer(38));
                  }

                  if (var1.indexOf("Đền Harumoto") > 0) {
                     var3.addElement(new Integer(54));
                     var4.addElement(new Integer(43));
                  }
               }

               if (var2 >= 90) {
                  if (var1.indexOf("Sinh Tử Kiều") > 0) {
                     var3.addElement(new Integer(143));
                     var4.addElement(new Integer(this.advBD));
                  }

                  if (var1.indexOf("Đoạn Sơn") > 0) {
                     var3.addElement(new Integer(141));
                     var4.addElement(new Integer(this.advBD));
                  }
               }

               if (var3.size() > 0) {
                  Code.setAuto((Auto)(new AutoPKBossS(var3, var4, this.advBD)));
                  return;
               }
            } else {
               Code.setAuto((Auto)(new AutoPKBossS(this.advBD)));
            }
         }

      }
   }

   public final void advAA() {
      if (this.advAA == 0) {
         this.advBI = Res.advAB().get(5);
         if (!TileMap.isLangCo(super.mapID)) {
            this.advAA = 2;
            this.advBK = System.currentTimeMillis();
            this.advBF = super.mapID;
            this.advBG = super.zoneID;
            this.advBH = super.advAD;
            this.advBE = false;
            advAZ = false;
            advBA = false;
            return;
         }
      } else {
         if (this.advAA == 1) {
            this.advAA = 3;
            this.advBK = System.currentTimeMillis();
            this.advBE = false;
            return;
         }

         if (this.advAA == 2) {
            this.advAA = 1;
            this.advBK = System.currentTimeMillis();
            advAC = false;
            return;
         }

         if (this.advAA == 3) {
            this.advAA = 0;
            this.advBE = false;
            Code.AutoNVHN();
            return;
         }

         if (this.advAA == 4) {
            this.advAA = 0;
            this.advBE = false;
         }
      }

   }

   public final void advAM() {
      this.advBJ = 0L;
      super.advAM();
   }

   public final boolean advAB() {
      return Code.auto instanceof AutoStanima && this.advAA == 2 && Char.getMyChar().clevel >= 60 && Char.getMyChar().clevel < 70;
   }

   public final void auto() {
      if (Auto.isMyCharInactive()) {
         Auto.advAA(true);
      } else {
         Calendar var1;
         int var2 = (var1 = Res.advAB()).get(5);
         int var3 = var1.get(11);
         int var4 = var1.get(12);
         switch(this.advAA) {
         case 0:
            if (!this.advBE && this.advBD > 0) {
               if (TileMap.mapID != this.advBD) {
                  this.remap(this.advBD, -2, -1, -1);
                  return;
               }

               GameScr.pickNPC(5, 1, 0);
               if (LockGame.advAY()) {
                  this.advBE = true;
                  super.mapID = this.advBF;
                  super.zoneID = this.advBG;
                  super.advAD = this.advBH;
                  super.advAG = false;
                  return;
               }

               return;
            }

            if (this.advBD < 0 && (TileMap.isLang(TileMap.mapID) || TileMap.isTruong(TileMap.mapID))) {
               this.advBD = TileMap.mapID;
            }

            if (var2 == this.advBI || var3 < 2 || var4 < 30) {
               if (super.mapID != TileMap.mapID || !super.advAG && super.zoneID != TileMap.zoneID) {
                  this.remap(super.mapID, super.zoneID, super.cx, super.cy);
                  return;
               }

               if (Char.isALuyenDa && Code.advAH() && Char.getBagNum() < 5 && !TileMap.isLangCo(TileMap.mapID)) {
                  Auto.advAP();
                  return;
               }

               if (!this.advBC && !this.advBB) {
                  this.advAB(this.advAB, this.advAA(Char.isADanhQuai, Char.isADanhTA, Char.isADanhTL));
                  this.advAC(-1);
               } else {
                  Char var12 = Char.getMyChar();
                  Char var8 = GameScr.vParty.size() > 0 ? ((Party)GameScr.vParty.firstElement()).c : null;
                  Skill var15;
                  if (this.advBC && GameScr.vParty.size() > 0 && var12.nClass.classId == 6) {
                     for(var3 = 0; var3 < var12.vSkillFight.size(); ++var3) {
                        if ((var15 = (Skill)var12.vSkillFight.elementAt(var3)) != null && var15.template.type == 4) {
                           if (!var15.isCooldown()) {
                              for(var3 = 0; var3 < GameScr.vParty.size(); ++var3) {
                                 Party var5;
                                 if ((var5 = (Party)GameScr.vParty.elementAt(var3)).charId != var12.charID && var5.c != null && var5.c.cHP <= 0) {
                                    var3 = var12.cx;
                                    int var9 = var12.cy;
                                    Char var6;
                                    Char.moveToChar((var6 = var5.c).cx, var6.cy);
                                    CuongScr.sleep(500L);
                                    Service.gI().buffLive(var5.charId);
                                    var15.lastTimeUseThisSkill = System.currentTimeMillis();
                                    var15.paintCanNotUseSkill = true;
                                    var12.setAutoSkillPaint(GameScr.sks[var15.template.id], 0);
                                    CuongScr.sleep(1000L);
                                    Char.moveToChar(var3, var9);
                                    return;
                                 }
                              }
                           }
                           break;
                        }
                     }
                  }

                  if (this.advBB && this.advAQ() && var8 != null && var12.nClass.classId == 6) {
                     for(var3 = 0; var3 < var12.vSkillFight.size(); ++var3) {
                        if ((var15 = (Skill)var12.vSkillFight.elementAt(var3)) != null && !var15.isCooldown() && var15.template.type == 2 && (var15.template.id < 67 || var15.template.id > 72) && (var15.template.id != 47 || var8.cHP < var8.cMaxHP * Char.aHpValue / 100)) {
                           System.currentTimeMillis();

                           int var16;
                           for(var16 = 0; var16 < var8.vEff.size(); ++var16) {
                              var8.vEff.elementAt(var16);
                           }

                           var16 = var12.cx;
                           var3 = var12.cy;
                           Char.moveToChar(var8.cx, var8.cy);
                           Service.gI().selectSkill(var15.template.id);
                           Service.gI().sendUseSkillMyBuff();
                           var15.lastTimeUseThisSkill = System.currentTimeMillis();
                           var15.paintCanNotUseSkill = true;
                           var12.setAutoSkillPaint(GameScr.sks[var15.template.id], 0);
                           CuongScr.sleep(1000L);
                           Char.moveToChar(var16, var3);
                           break;
                        }
                     }
                  }
               }

               Item var14;
               if (System.currentTimeMillis() - this.advBJ > 602000L && Char.getBagNum() > 1 && (var14 = Char.getBagItem(38)) != null) {
                  Service.gI().useItem(var14.indexUI);
                  this.advBJ = System.currentTimeMillis();
                  return;
               }

               return;
            }
            break;
         case 1:
            if (Code.cNameLeader == null || System.currentTimeMillis() - this.advBK >= 3600000L) {
               this.advAA();
               return;
            }

            if (TileMap.mapID != 1 || TileMap.zoneID != 21) {
               this.remap(1, 21, -1, -1);
               return;
            }

            TaskOrder var10 = Char.getTaskOrder(1);
            boolean var7 = Char.getMyChar().cName.equals(Code.cNameLeader);
            if (advAC && var7) {
               this.advAA();
               Service.gI().chatParty("sts");
               return;
            }

            if (var10 == null) {
               Npc var11;
               Char.moveToChar((var11 = GameScr.findNPC(25)).cx, var11.cy);
               LockGame.advAA(300000L);
               if (var7) {
                  GameScr.pickNPC(25, GameScr.advGO + 1, 0);
                  LockGame.advAK();
                  CuongScr.sleep(2000L);
                  return;
               }
            } else {
               if (var10.count >= var10.maxCount) {
                  GameScr.pickNPC(25, GameScr.advGO + 1, 2);
                  LockGame.advAM();
                  CuongScr.sleep(2000L);
                  return;
               }

               if (var7) {
                  AutoTaThu var13;
                  (var13 = Code.autoTaThu).update();
                  var13.advAD = true;
                  Code.setAuto((Auto)var13);
                  Service.gI().chatParty("att " + var13.mapID + " " + var13.zoneID + " " + var13.advAA);
                  return;
               }
            }

            return;
         case 2:
            if (Char.getMyChar().clevel < 30 || System.currentTimeMillis() - this.advBK >= 10800000L) {
               this.advAA();
               return;
            }

            if (!this.advBE) {
               if (TileMap.mapID != 1 || TileMap.zoneID != 21) {
                  this.remap(1, 21, -1, -1);
                  return;
               }

               if (Char.aFoodValue <= 50) {
                  int var10000 = (var2 = Char.getBagNum(Char.aFoodValue == 50 ? 29 : 23 + Char.aFoodValue / 10)) >= 2 ? 0 : 2 - var2;
                  var2 = var10000;
                  if (var10000 > 0) {
                     GameScr.pickNPC(4, 0, 0);
                     if (Char.aFoodValue == 50) {
                        Service.gI().buyItem(9, 7, var2);
                     } else {
                        Service.gI().buyItem(9, Char.aFoodValue / 10, var2);
                     }

                     LockGame.advAG();
                  }
               }

               if (var1.get(7) == 2) {
                  GameScr.pickNPC(24, 1, 0);
                  CuongScr.sleep(2000L);
               }

               this.advBE = true;
               if ((var2 = Char.getMyChar().clevel) >= 90) {
                  LockGame.advBI();
                  Code.setAuto((Auto)(new AutoHd9x()));
                  advAZ = true;
                  return;
               }

               super.mapID = var2 < 40 ? 91 : (var2 < 50 ? 94 : (var2 < 60 ? 105 : (var2 < 70 ? 114 : 125)));
               super.advAG = true;
               super.advAD = false;
               if (var2 >= 60 && var2 < 70) {
                  if (GameScr.vParty.size() > 1) {
                     Service.gI().outParty();
                     return;
                  }

                  return;
               }

               if (Code.cNameLeader != null) {
                  LockGame.advBI();
                  return;
               }
            } else {
               if (!advAZ) {
                  if (TileMap.mapID == super.mapID) {
                     this.advAB(-1, -1);
                     this.advAC(-1);
                     return;
                  }

                  this.remap(super.mapID, -2, -1, -1);
                  return;
               }

               if (!TileMap.isTruong(TileMap.mapID)) {
                  return;
               }

               GameScr.pickNPC(0, 2, 0);
               Service.gI().rewardPB();
               this.advBE = false;
               advAZ = false;
               if (!advBA) {
                  return;
               }
            }
            break;
         case 3:
            if (!this.advBE) {
               if (TileMap.mapID != 1 || TileMap.zoneID != 21) {
                  this.remap(1, 21, -1, -1);
                  return;
               }

               GameScr.pickNPC(5, 1, 0);
               if (LockGame.advAY()) {
                  if (var1.get(7) == 2) {
                     GameScr.pickNPC(24, 1, 0);
                     CuongScr.sleep(2000L);
                  }

                  this.advBE = true;
                  return;
               }

               return;
            }
            break;
         default:
            return;
         }

         this.advAA();
      }
   }

   public final String toString() {
      if (this.advBB && this.advBC) {
         return "Stanima Buff HS";
      } else if (this.advBB) {
         return "Stanima Buff";
      } else if (this.advBC) {
         return "Stanima HS";
      } else {
         return this.advAB >= 0 && this.advAB < Mob.arrMobTemplate.length ? "Stanima " + Mob.arrMobTemplate[this.advAB].name : "Stanima";
      }
   }
}
