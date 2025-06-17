
public class As20 extends As10 {

    private int advAA;
    private static final int[] advAB = new int[]{0, 1, 1, 72, 72, 27, 27};
    private static final int[] advAC = new int[]{0, 9, 9, 10, 10, 11, 11};
    private static final int[] advAZ = new int[]{0, 0, 1, 0, 1, 0, 1};
    private static final int[] advBA = new int[]{0, 94, 114, 99, 109, 105, 119};
    private static final int[] advBB = new int[]{-1, 40, 49, 58, 67, 76, 85};
    private static final int[] advBC = new int[]{-1, 41, 50, 59, 68, 77, 86};
    private static final int[] advBD = new int[]{-1, 42, 51, 60, 69, 78, 87};

    public As20(int var1) {
        super.update();
        this.advAA = var1;
    }

    public boolean advAA(Char var1) {
        return var1.clevel >= 20;
    }

    public void advAA(Char var1, byte var2, byte var3) {
        if (var1.ctaskId < 9) {
            super.advAA(var1, var2, var3);
        } else {
            int var5;
            int var7;
            int var8;
            int var9;
            Item var11;
            int var13;
            int var15;
            int var18;
            int var20;
            Item var21;
            switch (var1.ctaskId) {
                case 9:
                    if (var1.nClass.classId != 0) {
                        if (TileMap.mapID == 28) {
                            this.advAC(-1);
                            this.advAB(-1, 1);
                            return;
                        } else {
                            this.remap(28, -1, -1, -1);
                            return;
                        }
                    } else if (this.advAA == 0) {
                        GameScr.paint("Hãy vào lớp!");
                        Code.endAuto();
                        return;
                    } else {
                        var20 = advAB[this.advAA];
                        if (TileMap.mapID != var20) {
                            this.remap(var20, -2, -1, -1);
                            return;
                        } else {
                            GameScr.pickNPC(5, 1, 0);

                            for (var5 = 0; var5 < var1.arrItemBag.length; ++var5) {
                                if ((var11 = var1.arrItemBag[var5]) != null && (var11.template.type == 22 || var11.template.type == 27)) {
                                    Service.gI().useItem(var11.indexUI);
                                }
                            }

                            CuongScr.sleep(1000L);
                            if ((var21 = var1.arrItemBody[1]) != null) {
                                Service.gI().sendAttackMobFast((short) var21.template.type);
                                LockGame.advAQ();
                            }

                            GameScr.pickNPC(advAC[this.advAA], 1, advAZ[this.advAA]);

                            do {
                                CuongScr.sleep(1000L);
                            } while (Char.getBagItem(advBA[this.advAA]) == null);

                            if ((var21 = Char.getBagItem(advBB[this.advAA])) != null) {
                                Service.gI().useItem(var21.indexUI);
                            }

                            if ((var21 = Char.getBagItem(advBA[this.advAA])) != null) {
                                Service.gI().useItem(var21.indexUI);
                            }

                            CuongScr.sleep(1000L);
                            GameScr.pickNPC(4, 0, 0);

                            for (var15 = 0; var15 < var1.arrItemBag.length; ++var15) {
                                if ((var21 = var1.arrItemBag[var15]) != null && (var21.template.type < 10 || var21.template.type == 16 || var21.template.type == 17 || var21.template.id == 23)) {
                                    Service.gI().delItem(var21.indexUI, var21.indexUI);
                                }
                            }

                            Service.gI().bagSort();
                            LockGame.advAS();
                            return;
                        }
                    }
                case 10:
                    if (var1.taskMaint.index == 0) {
                        if (TileMap.mapID == 28) {
                            this.advAC(-1);
                            this.advAB(5, 1);
                            return;
                        }

                        this.remap(28, -1, -1, -1);
                        return;
                    }

                    if (var1.taskMaint.index == 1) {
                        if (TileMap.mapID == 4) {
                            this.advAC(-1);
                            this.advAB(6, 1);
                            return;
                        }

                        this.remap(4, -1, -1, -1);
                        return;
                    }

                    if (var1.taskMaint.index == 2) {
                        if (TileMap.mapID == 46) {
                            this.advAC(-1);
                            this.advAB(7, 1);
                            return;
                        }

                        this.remap(46, -1, -1, -1);
                        return;
                    }
                    break;
                case 11:
                    if (var1.taskMaint.index == 0) {
                        if (TileMap.mapID == 28) {
                            this.advAC(-1);
                            this.advAB(-1, 1);
                            return;
                        }

                        this.remap(28, -1, -1, -1);
                        return;
                    }

                    if (var1.taskMaint.index == 1) {
                        for (var20 = 0; var20 < GameScr.vCharInMap.size(); ++var20) {
                            Char var23;
                            if ((var23 = (Char) GameScr.vCharInMap.elementAt(var20)) != null) {
                                Service.gI().requestForgetPass(var23.cName);
                            }
                        }

                        var15 = super.zoneID;
                        GameScr var19 = GameScr.gI();
                        Npc var22;
                        if ((var22 = GameScr.findNPC(13)) != null && var22.statusMe != 15) {
                            if (Math.abs(var22.cx - Char.getMyChar().cx) > 22 || Math.abs(var22.cy - Char.getMyChar().cy) > 22) {
                                Char.moveToChar(var22.cx, var22.cy);
                            }

                            Service.gI().openUIZone();
                            LockGame.advAE();
                            var20 = -1;
                            if (var15 < 0) {
                                var15 = var19.zones.length - 1;
                            } else if (var15 >= var19.zones.length) {
                                var15 = 0;
                            }

                            var5 = 0;

                            for (var18 = (var15 + 1) % var19.zones.length; var18 != var15; var18 = (var18 + 1) % var19.zones.length) {
                                if (var19.zones[var18] < 20 && var19.zones[var18] > var5) {
                                    var20 = var18;
                                    var5 = var19.zones[var18];
                                }
                            }

                            super.zoneID = var20;
                            Service.gI().requestChangeZone((int) var20, (int) -1);
                            TileMap.advAF();
                            CuongScr.sleep(100L);
                            return;
                        }

                        super.zoneID = TileMap.zoneID;
                        return;
                    }
                    break;
                case 12:
                    if (var1.taskMaint.index == 0) {
                        if (TileMap.mapID == 3) {
                            this.advAC(-1);
                            this.advAB(-1, 1);
                            return;
                        }

                        this.remap(3, -1, -1, -1);
                        return;
                    }

                    boolean var16 = false;
                    var5 = -1;
                    var11 = null;
                    if (var1.taskMaint.index == 1) {
                        var16 = true;
                        var5 = (new int[]{194, 94, 114, 99, 109, 105, 119})[var1.nClass.classId];
                        if ((var11 = var1.arrItemBody[1]) == null) {
                            var16 = false;
                            var11 = Char.getBagItem(var5);
                        }
                    } else if (var1.taskMaint.index == 2) {
                        var16 = true;
                        var5 = 174;
                        if ((var11 = var1.arrItemBody[9]) == null) {
                            var16 = false;
                            var11 = Char.getBagItem(174);
                        }
                    } else if (var1.taskMaint.index == 3) {
                        var16 = true;
                        var5 = var1.cgender == 1 ? 124 : 125;
                        if ((var11 = var1.arrItemBody[8]) == null) {
                            var16 = false;
                            var11 = Char.getBagItem(var5);
                        }
                    }

                    if (var11 == null) {
                        if (TileMap.mapID == 4) {
                            this.advAC(var5);
                            this.advAB(-1, 1);
                            return;
                        }

                        this.remap(4, -1, -1, -1);
                        return;
                    }

                    var13 = 0;
                    var18 = 0;
                    if (var11.isTypeClothe()) {
                        var13 = GameScr.upClothe[var11.upgrade] / 2;
                        var18 = GameScr.coinUpClothes[var11.upgrade];
                    } else if (var11.isTypeAdorn()) {
                        var13 = GameScr.upAdorn[var11.upgrade] / 2;
                        var18 = GameScr.coinUpAdorns[var11.upgrade];
                    } else if (var11.isTypeWeapon()) {
                        var13 = GameScr.upWeapon[var11.upgrade] / 2;
                        var18 = GameScr.coinUpWeapons[var11.upgrade];
                    }

                    if (var13 << 1 > Char.getBagLT() || var18 << 1 > var1.yen) {
                        if (TileMap.mapID == 46) {
                            this.advAC(1);
                            this.advAB(-1, 1);
                            return;
                        }

                        this.remap(46, -1, -1, -1);
                        return;
                    }

                    if (TileMap.mapID != 22) {
                        this.remap(22, -2, -1, -1);
                        return;
                    }

                    if (var16) {
                        Service.gI().itemBodyToBag((int) var11.template.type);
                        LockGame.advAQ();
                    }

                    var7 = var11.upgrade;
                    GameScr.pickNPC(6, 0, 0);
                    LockGame.advAQ();
                    GameScr.itemUpGrade = var11;

                    for (var8 = 0; var8 < 2 && var11.upgrade == var7; ++var8) {
                        GameScr.arrItemUpGrade = new Item[18];
                        var9 = 0;
                        int var24 = 0;

                        for (var20 = 0; var20 < var1.arrItemBag.length && var24 < var13; ++var20) {
                            if ((var21 = var1.arrItemBag[var20]) != null && var21.template.type == 26 && var21.template.id <= 3) {
                                var1.arrItemBag[var20] = null;
                                GameScr.arrItemUpGrade[var9++] = var21;
                                var24 += GameScr.upClothe[var21.template.id];
                            }
                        }

                        do {
                            CuongScr.sleep(3000L);
                            Service.gI().upgradeItem(var11, GameScr.arrItemUpGrade);
                            LockGame.advAQ();
                        } while (GameScr.arrItemUpGrade[0] != null);
                    }

                    GameScr.itemUpGrade = null;
                    Service.gI().useItem(var11.indexUI);
                    if (var11.upgrade > var7) {
                        LockGame.advAO();
                        return;
                    }
                    break;
                case 13:
                    Item var4;
                    if ((var4 = var1.arrItemBody[1]) != null && var4.upgrade < 2) {
                        var5 = GameScr.upWeapon[var4.upgrade] / 2;
                        var15 = GameScr.coinUpWeapons[var4.upgrade];
                        if (var5 << 1 <= Char.getBagLT() && var15 << 1 <= var1.yen) {
                            if (TileMap.mapID != 22) {
                                this.remap(22, -2, -1, -1);
                                return;
                            }

                            Service.gI().itemBodyToBag((int) var4.template.type);
                            LockGame.advAQ();
                            var13 = var4.upgrade;
                            GameScr.pickNPC(6, 0, 0);
                            LockGame.advAQ();
                            GameScr.itemUpGrade = var4;

                            for (var18 = 0; var18 < 2 && var4.upgrade == var13; ++var18) {
                                GameScr.arrItemUpGrade = new Item[18];
                                var7 = 0;
                                var8 = 0;

                                for (var9 = 0; var9 < var1.arrItemBag.length && var8 < var5; ++var9) {
                                    Item var10;
                                    if ((var10 = var1.arrItemBag[var9]) != null && var10.template.type == 26 && var10.template.id <= 3) {
                                        var1.arrItemBag[var9] = null;
                                        GameScr.arrItemUpGrade[var7++] = var10;
                                        var8 += GameScr.upClothe[var10.template.id];
                                    }
                                }

                                do {
                                    CuongScr.sleep(3000L);
                                    Service.gI().upgradeItem(var4, GameScr.arrItemUpGrade, false);
                                    LockGame.advAQ();
                                } while (GameScr.arrItemUpGrade[0] != null);
                            }

                            GameScr.itemUpGrade = null;
                            Service.gI().useItem(var4.indexUI);
                            return;
                        }

                        if (TileMap.mapID == 4) {
                            this.advAC(1);
                            this.advAB(-1, 1);
                            return;
                        }

                        this.remap(4, -1, -1, -1);
                        return;
                    }

                    if (var1.taskMaint.index == 0) {
                        if (TileMap.mapID == 4) {
                            this.advAC(-1);
                            this.advAB(-1, 1);
                            return;
                        }

                        this.remap(4, -1, -1, -1);
                        return;
                    }

                    var5 = var1.taskMaint.index == 1 ? 56 : (var1.taskMaint.index == 2 ? 0 : 73);
                    if (TileMap.mapID != var5) {
                        if (TileMap.mapID != var2) {
                            super.remap(var2, -2, -1, -1);
                            return;
                        }

                        if (GameScr.hpPotion < 10 && var1.yen >= 300 * (10 - GameScr.hpPotion)) {
                            GameScr.pickNPC(3, 0, 0);
                            Service.gI().buyItem(7, 1, 10 - GameScr.hpPotion);
                            LockGame.advAG();
                            return;
                        }

                        GameScr.pickNPC(var3, 0, 0);
                        Service.gI().getTask(var3, 0, -1);
                        TileMap.advAF();
                        return;
                    }

                    if (var1.cHP < var1.cMaxHP / 2 && var1.cHP > 0) {
                        var1.doUsePotion(16);
                    }

                    if (var1.cMP < var1.cMaxMP / 2 && var1.cHP > 0) {
                        var1.doUsePotion(17);
                    }

                    Char var14;
                    if (GameScr.vCharInMap.size() > 0 && (var14 = (Char) GameScr.vCharInMap.elementAt(0)) != null) {
                        Skill var17 = Auto.advAO;
                        if (Res.abs(var1.cx - var14.cx) > var17.dx || Res.abs(var1.cy - var14.cy) > var17.dy) {
                            Char.moveToChar(var14.cx < TileMap.pxw ? var14.cx : TileMap.pxw - 50, var14.cy);
                        }

                        Auto.advAS.removeAllElements();
                        Auto.advAT.removeAllElements();
                        Auto.advAT.addElement(var14);
                        Service.gI().sendPlayerAttack((MyVector) Auto.advAS, (MyVector) Auto.advAT, (int) 1);
                        if (System.currentTimeMillis() - var17.lastTimeUseThisSkill >= (long) var17.coolDown) {
                            var17.lastTimeUseThisSkill = System.currentTimeMillis();
                            var17.paintCanNotUseSkill = true;
                            var1.setAutoSkillPaint(GameScr.sks[var17.template.id], 0);
                            return;
                        }
                    }
                    break;
                case 14:
                    if (var1.clevel >= 15 && (var11 = Char.getBagItem(advBC[var1.nClass.classId])) != null) {
                        GameScr.paint("Học sách kĩ năng");
                        Service.gI().useItem(var11.indexUI);
                        CuongScr.sleep(1000L);
                    }

                    if (var1.taskMaint.index == 0) {
                        if (TileMap.mapID == 29) {
                            this.advAC(-1);
                            this.advAB(-1, 1);
                            return;
                        }

                        this.remap(29, -1, -1, -1);
                        return;
                    }

                    if (var1.taskMaint.index == 1) {
                        if (TileMap.mapID == 29 && super.zoneID == TileMap.zoneID) {
                            var5 = Code.KCNhatValue < 0 ? -1 : Code.KCNhatValue * Code.KCNhatValue;
                            ItemMap var12 = null;

                            for (var13 = 0; var13 < GameScr.vItemMap.size(); ++var13) {
                                ItemMap var6;
                                var7 = Math.abs((var6 = (ItemMap) GameScr.vItemMap.elementAt(var13)).x - var1.cx);
                                var8 = Math.abs(var6.y - var1.cy);
                                var9 = var7 * var7 + var8 * var8;
                                if (!var6.advAK && var6.template.id == 212 && (Char.getBagNum() > 2 || Char.isBagHas(212)) && (var5 < 0 || var9 < var5)) {
                                    var5 = var9;
                                    var12 = var6;
                                }
                            }

                            if (var12 == null) {
                                super.zoneID = (super.zoneID + 1) % 30;
                                return;
                            }

                            Char.moveToChar(var12.xEnd, var12.yEnd);
                            Service.gI().pickItem(var12.itemMapID);

                            for (var13 = 0; var13 < 5 && !LockGame.advAC(); ++var13) {
                            }

                            var12.advAK = true;
                            return;
                        }

                        this.remap(29, super.zoneID, -1, -1);
                        return;
                    }

                    if (var1.taskMaint.index == 2) {
                        if (TileMap.mapID == 40) {
                            this.advAB(15, 1);
                            this.advAC(213);
                            return;
                        }

                        this.remap(40, -1, -1, -1);
                        return;
                    }
                    break;
                case 15:
                    if (var1.taskMaint.index == 0) {
                        if (TileMap.mapID == 8) {
                            this.advAC(-1);
                            this.advAB(-1, 1);
                            return;
                        }

                        this.remap(8, -1, -1, -1);
                        return;
                    }

                    if (TileMap.mapID != var2) {
                        super.remap(var2, -2, -1, -1);
                        return;
                    }

                    GameScr.pickNPC(var3, 0, 0);
                    LockGame.advAO();
                    Auto.advAP();
                    return;
                case 16:
                    if (var1.clevel >= 20 && (var11 = Char.getBagItem(advBD[var1.nClass.classId])) != null) {
                        GameScr.paint("Học sách kĩ năng");
                        Service.gI().useItem(var11.indexUI);
                        CuongScr.sleep(1000L);
                    }

                    if (var1.taskMaint.index == 0) {
                        if (TileMap.mapID == 8) {
                            this.advAC(-1);
                            this.advAB(-1, 1);
                            return;
                        }

                        this.remap(8, -1, -1, -1);
                        return;
                    }

                    if (var1.taskMaint.index == 1) {
                        if (TileMap.mapID == 63) {
                            this.advAC(-1);
                            this.advAB(23, 1);
                            return;
                        }

                        this.remap(63, -1, -1, -1);
                        return;
                    }

                    if (var1.taskMaint.index == 2) {
                        if (TileMap.mapID == 47) {
                            this.advAC(-1);
                            this.advAB(24, 1);
                            return;
                        }

                        this.remap(47, -1, -1, -1);
                    }
            }

        }
    }

    public String toString() {
        return "Auto Nhiệm Vụ 20";
    }
}
