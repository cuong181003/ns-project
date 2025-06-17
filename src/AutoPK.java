// Decompiled with: CFR 0.152
// Class Version: 6

public final class AutoPK
        extends Auto {

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected final void auto() {
        if (FormPK.AB && Char.getMyChar().cPk > 0 && Char.getMyChar().cPk >= FormPK.AF && FormPK.AE > 0 && Char.getBagNum(257) >= FormPK.AE) {
            GameScr.paint(new StringBuffer("Sử dụng ").append(FormPK.AE).append(" hoàn lương chi thảo").toString());
            long l = 3000 / FormPK.AE;
            for (int i = 0; i < Char.getMyChar().arrItemBag.length; ++i) {
                Item item = Char.getMyChar().arrItemBag[i];
                if (item == null || item.template.id != 257) {
                    continue;
                }
                for (int j = 0; j < FormPK.AE; ++j) {
                    Service.gI().useItem(i);
                    try {
                        Thread.sleep(l);
                        continue;
                    } catch (InterruptedException interruptedException) {
                    }
                }
                return;
            }
            return;
        }
        if (TileMap.mapID != this.mapID || TileMap.zoneID != this.zoneID) {
            AutoPK autoPK = this;
            super.remap(autoPK.mapID, this.zoneID, -1, -1);
            return;
        }
        try {
            Char char_ = null;
            MyVector myVector = new MyVector();
            Char char_2 = Char.getMyChar();
            short s = 0;
            short s2 = 9999;
            if (!FormPK.AA) {
                for (int i = 0; i < GameScr.vCharInMap.size(); ++i) {
                    Char char_3 = (Char) GameScr.vCharInMap.elementAt(i);
                    if (char_3 == null || char_3.cHP <= 0 || char_3.statusMe == 14 || char_3.statusMe == 5 || char_3.statusMe == 15 || !(char_3.cTypePk == 3 || char_2.cTypePk == 3 || char_3.cTypePk == 1 && char_2.cTypePk == 1 || char_2.killCharId > 0 && char_2.killCharId == char_3.charID || char_2.testCharId > 0 && char_2.testCharId == char_3.charID) && char_3.killCharId != char_2.charID || Code.advAD(char_3.cName)) {
                        continue;
                    }
                    if (FormPK.AD) {
                        if (char_3.cx >= char_2.cx + 150 || char_3.cx <= char_2.cx - 150 || char_3.cy >= char_2.cy + 150 || char_3.cy <= char_2.cy - 150) {
                            continue;
                        }
                        if (char_3.cx > char_2.cx) {
                            s = (short) (char_3.cx - char_2.cx);
                        } else if (char_3.cx < char_2.cx) {
                            s = (short) (char_2.cx - char_3.cx);
                        }
                        if (s >= s2) {
                            continue;
                        }
                        s2 = s;
                    }
                    char_2.charFocus = char_3;
                    char_2.mobFocus = null;
                    char_2.npcFocus = null;
                    char_ = char_3;
                }
                if (char_ == null) {
                    return;
                }
                if (FormPK.AC) {
                    Char.moveToChar(char_.cx, char_.cy);
                }
                myVector.addElement(char_);
                for (int i = 0; i < GameScr.vCharInMap.size(); ++i) {
                    Char char_4 = (Char) GameScr.vCharInMap.elementAt(i);
                    if (char_4 == null || char_4.charID == char_.charID || char_4.cHP <= 0 || char_4.statusMe == 14 || char_4.statusMe == 5 || char_4.statusMe == 15 || !(char_4.cTypePk == 3 || char_2.cTypePk == 3 || char_4.cTypePk == 1 && char_2.cTypePk == 1 || char_2.killCharId > 0 && char_2.killCharId == char_4.charID || char_2.testCharId > 0 && char_2.testCharId == char_4.charID) && char_4.killCharId != char_2.charID || Code.advAD(char_4.cName) || char_4.cx >= char_2.cx + 150 || char_4.cx <= char_2.cx - 150 || char_4.cy >= char_2.cy + 150 || char_4.cy <= char_2.cy - 150) {
                        continue;
                    }
                    myVector.addElement(char_4);
                }
                Skill skill = char_2.myskill;
                if (System.currentTimeMillis() - skill.lastTimeUseThisSkill >= (long) (skill.coolDown)) {
                    skill.lastTimeUseThisSkill = System.currentTimeMillis();
                    Service.gI().selectSkill(skill.template.id);
                    Service.gI().sendPlayerAttack(new MyVector(), myVector, 2);
                    if (Code.skilltape) {
                        return;
                    }
                    char_2.setAutoSkillPaint(GameScr.sks[skill.template.id], 0);
                    return;
                }
                skill.paintCanNotUseSkill = true;
                return;
            }
            for (int i = 0; i < GameScr.vCharInMap.size(); ++i) {
                Char char_5 = (Char) GameScr.vCharInMap.elementAt(i);
                if (char_5 == null || !SavePK.advAC(char_5.cName) || char_5.cHP <= 0 || char_5.statusMe == 14 || char_5.statusMe == 5 || char_5.statusMe == 15 || !(char_5.cTypePk == 3 || char_2.cTypePk == 3 || char_5.cTypePk == 1 && char_2.cTypePk == 1 || char_2.killCharId > 0 && char_2.killCharId == char_5.charID || char_2.testCharId > 0 && char_2.testCharId == char_5.charID) && char_5.killCharId != char_2.charID || Code.advAD(char_5.cName)) {
                    continue;
                }
                if (FormPK.AD) {
                    if (char_5.cx >= char_2.cx + 150 || char_5.cx <= char_2.cx - 150 || char_5.cy >= char_2.cy + 150 || char_5.cy <= char_2.cy - 150) {
                        continue;
                    }
                    if (char_5.cx > char_2.cx) {
                        s = (short) (char_5.cx - char_2.cx);
                    } else if (char_5.cx < char_2.cx) {
                        s = (short) (char_2.cx - char_5.cx);
                    }
                    if (s >= s2) {
                        continue;
                    }
                    s2 = s;
                }
                char_2.charFocus = char_5;
                char_2.mobFocus = null;
                char_2.npcFocus = null;
                char_ = char_5;
            }
            if (char_ == null) {
                return;
            }
            if (FormPK.AC) {
                Char.moveToChar(char_.cx, char_.cy);
            }
            myVector.addElement(char_);
            for (int i = 0; i < GameScr.vCharInMap.size(); ++i) {
                Char char_6 = (Char) GameScr.vCharInMap.elementAt(i);
                if (char_6 == null || !SavePK.advAC(char_6.cName) || char_6.cHP <= 0 || char_6.statusMe == 14 || char_6.statusMe == 5 || char_6.statusMe == 15 || !(char_6.cTypePk == 3 || char_2.cTypePk == 3 || char_6.cTypePk == 1 && char_2.cTypePk == 1 || char_2.killCharId > 0 && char_2.killCharId == char_6.charID || char_2.testCharId > 0 && char_2.testCharId == char_6.charID) && char_6.killCharId != char_2.charID || Code.advAD(char_6.cName) || char_6.cx >= char_2.cx + 150 || char_6.cx <= char_2.cx - 150 || char_6.cy >= char_2.cy + 150 || char_6.cy <= char_2.cy - 150) {
                    continue;
                }
                myVector.addElement(char_6);
            }
            Skill skill = char_2.myskill;
            if (System.currentTimeMillis() - skill.lastTimeUseThisSkill >= (long) (skill.coolDown)) {
                skill.lastTimeUseThisSkill = System.currentTimeMillis();
                Service.gI().selectSkill(skill.template.id);
                Service.gI().sendPlayerAttack(new MyVector(), myVector, 2);
                if (Code.skilltape) {
                    return;
                }
                char_2.setAutoSkillPaint(GameScr.sks[skill.template.id], 0);
                return;
            }
            skill.paintCanNotUseSkill = true;
            return;
        } catch (Exception exception) {
        }
    }

    public final String toString() {
        return "Auto pk";
    }

    public final void update() {
        super.update();
        this.mapID = TileMap.mapID;
        this.zoneID = TileMap.zoneID;
        this.cx = Char.getMyChar().cx;
        this.cy = Char.getMyChar().cy;
    }
}
