
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public abstract class Auto {

    public boolean advAD;
    public int mapID;
    public int zoneID;
    public boolean advAG;
    public int cx;
    public int cy;
    private int advAA;
    private int advAB;
    public int advAJ;
    public long advAK;
    public long advAL;
    public Auto T;
    public static boolean advAN;
    public static Skill advAO;
    public static boolean advAP;
    public static MyVector advAQ = new MyVector();
    private static MyVector advAC = new MyVector();
    public static int advAR = 0;
    private static boolean advAZ = false;
    private static long advBA = -1L;
    public static MyVector advAS = new MyVector();
    public static MyVector advAT = new MyVector();
    protected long advAU = 0L;
    protected long advAV = 0L;
    protected long advAW = 0L;
    protected boolean advAX = false;
    private static MyVector advBB = new MyVector();
    public static long advAY = 0L;
    private byte advBC;
    private ByteArrayInputStream advBD;
    private DataInputStream advBE;
    public static int mapid = 134;

    public static void advAA(Mob mob) {
        if (mob.isBoss || mob.status != 0 && mob.levelBoss != 3 && mob.maxHp != mob.getTemplate().hp) {
            if (!mob.isBoss && mob.levelBoss == 0) {
                if (mob.maxHp == 10 * mob.getTemplate().hp) {
                    mob.levelBoss = 1;
                } else {
                    if (mob.maxHp != 100 * mob.getTemplate().hp && mob.templateId != 89) {
                        return;
                    }

                    mob.levelBoss = 2;
                }
            }

            if (!advAQ.contains(mob)) {
                advAQ.addElement(mob);
            }
        }

    }

    public static void advAB(Mob var0) {
        advAQ.removeElement(var0);
    }

    public static void advAK() {
        advAQ.removeAllElements();
    }

    public static void advAB(Char aChar) {
        if (aChar != Char.getMyChar()) {
            if (advAC.contains(aChar)) {
                if (aChar.cTypePk != 3 && aChar.killCharId != Char.getMyChar().charID) {
                    advAC.removeElement(aChar);
                    return;
                }
            } else if (aChar.cTypePk == 3 || aChar.killCharId == Char.getMyChar().charID) {
                advAC.addElement(aChar);
                if (LockGame.advAB && Res.abs(Char.getMyChar().cx - aChar.cx) <= 300 && Res.abs(Char.getMyChar().cy - aChar.cy) <= 300) {
                    LockGame.advAD();
                }
            }
        }

    }

    public static void advAL() {
        advAC.removeAllElements();
    }

    public void update() {
        this.mapID = -1;
        this.zoneID = -1;
        this.advAG = false;
        this.T = null;
        this.advAJ = Char.getMyChar().yen;
        this.advAK = Char.getMyChar().cEXP;
        this.advAL = System.currentTimeMillis();
        this.advAD = false;
        Code.advAT = -1;
        Code.advAX = 0;
        advAN = Char.getMyChar().isHuman;
        advAO = Char.getMyChar().myskill;
        this.advAM();
    }

    protected void advAM() {
        advAP = false;
        Code.advBD = System.currentTimeMillis();
    }

    public final void advAA(byte var1) {
        this.advBC = var1;
    }

    public final void advAA(byte[] var1) {
        this.advBD = new ByteArrayInputStream(var1);
        this.advBE = new DataInputStream(this.advBD);
    }

    protected final void advAN() {
        try {
            switch (this.advBC) {
                case 15:
                    if (Code.isADapDo) {

                        this.advBE.readByte();
                        this.advBE.readInt();
                        this.advBE.readInt();
                        this.advBE.readShort();
                        this.advBE.readShort();
                        this.advBE.readUnsignedByte();
                        Code.advCH = this.advBE.readUnsignedByte();
                        this.advBE.readShort();
                        return;

                    }
                    break;
                case 16:
                    Item item;
                    if (Code.auto instanceof AutoDanhVong && (item = Char.getMyChar().arrItemBox[this.advBE.readUnsignedByte()]) != null) {
                        AutoDanhVong.advAC = item;
                        item.indexUI = this.advBE.readUnsignedByte();
                        AutoDanhVong.advAD();
                    }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    protected static boolean advAC(Char aChar) {
        return aChar.cHP <= 0 || aChar.statusMe == 14 || aChar.statusMe == 5;
    }

    protected static boolean isMyCharInactive() {
        return advAC(Char.getMyChar());
    }

    protected final void remap(int MapID, int ZoneID, int Acx, int Acy) {
        if ((MapID < 139 || MapID > 148) && TileMap.mapID >= 139 && TileMap.mapID <= 148) {
            advAP();
        } else {

            if (TileMap.mapID != MapID) {
                if (!TileMap.advAK(MapID)) {
                    if (TileMap.isLangCo(MapID)) {
                        try {
                            Thread.sleep(1L);
                            return;
                        } catch (InterruptedException var9) {
                        }
                    }

                    return;
                }

                if (ZoneID >= -1 && TileMap.zoneID != ZoneID) {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException var7) {
                    }
                }
            }

            if (!advAC(Char.getMyChar())) {
                if (ZoneID == -1) {
                    if (Code.isADanhCK) {
                        int[] var10 = Code.advAY;
                        Code.advAX = 0;
                        advAA(this.zoneID = var10[0]);
                    } else {
                        this.advAB(ZoneID);
                    }
                } else if (ZoneID >= 0) {
                    advAA(ZoneID);
                }

                if (TileMap.zoneID == this.zoneID && Acx > 0 && Acy > 0 && Char.getMyChar().cx != Acx && Char.getMyChar().cy != Acy) {
                    if (this instanceof AutoTuDanh || this instanceof AutoPKBoss) {
                        Char.moveToChar(Acx, Acy);
                        return;
                    }

                    this.advAC(advAA(Acx, Acy));
                }

            }
        }
    }

    protected static void advAP() {
        Char aChar;
        if (!advAC(aChar = Char.getMyChar())) {
            if (!Char.isBagHas(37) && !Char.isBagHas(35)) {
                Npc npc;
                if ((npc = GameScr.findNPC(13)) != null && Math.abs(npc.cx - aChar.cx) <= 400 && Math.abs(npc.cy - aChar.cy) <= 400) {
                    Char.moveToChar(npc.cx > 400 ? npc.cx - 400 : npc.cx + 400, npc.cy);
                }

                Service.gI().openUIZone();
            } else {
                Char.moveToChar(aChar.cx, TileMap.pxh);
            }

            long timeChangezone = System.currentTimeMillis();

            while (aChar.cHP > 0 && System.currentTimeMillis() - timeChangezone < 5L) {
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException var3) {
                }
            }

        }
    }

    protected static void advAA(boolean bool1) {
        Char myChar = Char.getMyChar();
        if (bool1) {
            if (advAZ) {
                if (System.currentTimeMillis() - advBA < 200L) {
                    return;
                }

                advAZ = false;
            } else if (Char.isADanhNhom && GameScr.vParty.size() > 0) {
                for (int i = 0; i < GameScr.vParty.size(); ++i) {
                    Party party;
                    if ((party = (Party) GameScr.vParty.elementAt(i)).charId != myChar.charID && party.c != null && party.c.cHP > 0 && party.c.nClass.classId == 6) {
                        GameScr.paint("Chờ hồi sinh!");
                        advBA = System.currentTimeMillis();
                        advAZ = true;
                        return;
                    }
                }
            }
        }

        try {
            Thread.sleep(50L);
        } catch (InterruptedException var4) {
        }

        advAQ.removeAllElements();
        advAP = false;
        LockGame.advAA = true;
        Service.gI().returnTownFromDead();
        TileMap.advAF();
        LockGame.advAA = false;

        try {
            Thread.sleep(50L);
        } catch (InterruptedException var3) {
        }
    }

    protected static void advAA(int i) {
        if (TileMap.zoneID != i) {
            Npc npc = GameScr.findNPC(13);
            int n = -1;
            if (npc != null && npc.statusMe != 15) {
                if (Math.abs(npc.cx - Char.getMyChar().cx) > 22 || Math.abs(npc.cy - Char.getMyChar().cy) > 22) {
                    Char.moveToChar(npc.cx, npc.cy);

                    try {
                        Thread.sleep(1L);
                    } catch (InterruptedException var3) {
                    }
                }
            } else {
                if (TileMap.mapID != 99 && TileMap.mapID != 103 && TileMap.mapID != 134 && TileMap.mapID != 135 && TileMap.mapID != 136 && TileMap.mapID != 137) {
                    return;
                }

                if ((n = Char.getBagIndex(37)) < 0 && (n = Char.getBagIndex(35)) < 0) {
                    return;
                }
            }

            if (System.currentTimeMillis() - advAY < 1L) {
                return;
            }

            Service.gI().requestChangeZone(i, n);
            TileMap.advAF();
            advAY = System.currentTimeMillis();

            try {
                Thread.sleep(1L);
                return;
            } catch (InterruptedException var4) {
            }
        }

    }

    protected final void advAB(int i) {
        if (!this.advAD || Code.cNameLeader == null || Char.getMyChar().cName.equals(Code.cNameLeader)) {
            GameScr gamescr = GameScr.gI();
            Npc npc = GameScr.findNPC(13);
            int n = -1;
            if (npc != null && npc.statusMe != 15) {
                if (Math.abs(npc.cx - Char.getMyChar().cx) > 22 || Math.abs(npc.cy - Char.getMyChar().cy) > 22) {
                    Char.moveToChar(npc.cx, npc.cy);

                    try {
                        Thread.sleep(1L);
                    } catch (InterruptedException var7) {
                    }
                }
            } else {
                if (TileMap.mapID != 99 && TileMap.mapID != 103 && TileMap.mapID != 134 && TileMap.mapID != 135 && TileMap.mapID != 136 && TileMap.mapID != 137) {
                    this.zoneID = TileMap.zoneID;
                    advAY = System.currentTimeMillis();
                    return;
                }

                if ((n = Char.getBagIndex(37)) < 0 && (n = Char.getBagIndex(35)) < 0) {
                    this.zoneID = TileMap.zoneID;
                    advAY = System.currentTimeMillis();
                    return;
                }
            }

            if (System.currentTimeMillis() - advAY < 1L) {
                return;
            }

            Service.gI().openUIZone();
            LockGame.advAE();
            int m = -1;
            if (i < 0) {
                i = gamescr.zones.length - 1;
            } else if (i >= gamescr.zones.length) {
                i = 0;
            }

            if (this instanceof AutoTaThu) {
                m = (i / 5 + 1) * 5 % gamescr.zones.length;
            } else if (!Char.isADanhQuai) {
                m = (i + 1) % gamescr.zones.length;
            } else {
                int y = -1;

                for (int var6 = (i + 1) % gamescr.zones.length; var6 != i; var6 = (var6 + 1) % gamescr.zones.length) {
                    if (y == -1 || gamescr.zones[var6] < y) {
                        m = var6;
                        y = gamescr.zones[var6];
                    }
                }
            }

            Service.gI().requestChangeZone(m, n);
            this.zoneID = m;
            TileMap.advAF();
            if (this.advAA()) {
                Service.gI().chatParty("khu " + m);
            }

            advAY = System.currentTimeMillis();

            try {
                Thread.sleep(1L);
                return;
            } catch (InterruptedException var8) {
            }
        }

    }

    private static boolean advAA(Mob mob, int i) {
        if (mob.templateId == 202 && mob.status == 8) {
            return false;
        } else {
            return i < 0 || mob.templateId == i;
        }
    }

    private static boolean advAC(int i, int n) {
        return n < 0 || i == 0 && (n & 1) > 0 || i == 1 && (n & 2) > 0 || i == 2 && (n & 4) > 0 || i == 3 && (n & 8) > 0;
    }

    public final int advAA(boolean bool1, boolean bool2, boolean bool3) {
        if (this.advAG) {
            return -1;
        } else {
            int i = 0;
            if (bool1) {
                i = 1;
            }

            if (bool2) {
                i |= 2;
            }

            if (bool3) {
                i |= 4;
            }

            return i;
        }
    }

    protected static boolean advAA(Char aChar, Char aChar1) {
        return aChar1.statusMe != 14 && aChar1.statusMe != 5 && aChar1.statusMe != 15 && (aChar1.cTypePk == 3 || aChar.cTypePk == 3 || aChar1.cTypePk == 1 && aChar.cTypePk == 1 || aChar1.cTypePk == 5 && aChar.cTypePk == 4 || aChar1.cTypePk == 4 && aChar.cTypePk == 5 || aChar.killCharId >= 0 && aChar.killCharId == aChar1.charID || aChar.testCharId >= 0 && aChar.testCharId == aChar1.charID || aChar1.killCharId >= 0 && aChar1.killCharId == aChar.charID);
    }

    protected final void advAC(Mob mob) {
        if (mob != null) {
            int x = mob.xFirst;
            int y = mob.yFirst;
            Char myChar = Char.getMyChar();
            if (TileMap.mapID == 35) {
                if (mob.xFirst == 1428 && mob.yFirst == 528) {
                    x = 1452;
                    y = 552;
                } else if (mob.xFirst == 1284 && mob.yFirst == 528) {
                    x = 1308;
                    y = 552;
                } else if (mob.xFirst == 1836 && mob.yFirst == 648) {
                    x = 1812;
                    y = 672;
                }
            } else if (TileMap.mapID == 37) {
                if ((mob.xFirst == 876 || mob.xFirst == 900) && mob.yFirst == 408) {
                    x = 900;
                    y = 432;
                } else if ((mob.xFirst == 828 || mob.xFirst == 852) && mob.yFirst == 360) {
                    x = 852;
                    y = 384;
                } else if ((mob.xFirst == 924 || mob.xFirst == 876) && mob.yFirst == 624) {
                    x = 924;
                    y = 648;
                } else if (mob.xFirst == 732 && mob.yFirst == 600 || mob.xFirst == 756 && mob.yFirst == 576) {
                    x = 756;
                    y = 600;
                }
            }

            if (Char.advAD(x, y)) {
                this.advAA = this.cx;
                this.advAB = this.cy;
                this.cx = myChar.cx;
                this.cy = myChar.cy;
                myChar.mobFocus = mob;

                try {
                    Thread.sleep(1L);
                    return;
                } catch (InterruptedException var5) {
                    return;
                }
            }

            myChar.mobFocus = null;
        }

    }

    protected static void advAD(Char aChar) {
        if (aChar != null) {
            Char myChar = Char.getMyChar();
            Char.moveToChar(aChar.cx, TileMap.advAD(aChar.cx, aChar.cy));
            myChar.charFocus = aChar;

            try {
                Thread.sleep(1L);
                return;
            } catch (InterruptedException var2) {
            }
        }

    }

    public static void advAA(SkillPaint skillPaint) {
        try {
            if (advAS.size() > 0 || advAT.size() > 0) {
                EffectPaint[] effectPaint = new EffectPaint[advAS.size() + advAT.size()];

                int i;
                for (i = 0; i < advAS.size(); ++i) {
                    effectPaint[i] = new EffectPaint();
                    effectPaint[i].effCharPaint = GameScr.efs[skillPaint.id - 1];
                    effectPaint[i].eMob = (Mob) advAS.elementAt(i);
                }

                for (i = 0; i < advAT.size(); ++i) {
                    effectPaint[i + advAS.size()] = new EffectPaint();
                    effectPaint[i + advAS.size()].effCharPaint = GameScr.efs[skillPaint.id - 1];
                    effectPaint[i + advAS.size()].eChar = (Char) advAT.elementAt(i);
                }

                if (effectPaint.length > 1) {
                    EPosition eposition = new EPosition();
                    if (effectPaint[0].eMob != null) {
                        eposition = new EPosition(effectPaint[0].eMob.x, effectPaint[0].eMob.y);
                    } else if (effectPaint[0].eChar != null) {
                        eposition = new EPosition(effectPaint[0].eChar.cx, effectPaint[0].eChar.cy);
                    }

                    MyVector myVector = new MyVector();

                    for (int n = 1; n < effectPaint.length; ++n) {
                        if (effectPaint[n].eMob != null) {
                            myVector.addElement(new EPosition(effectPaint[n].eMob.x, effectPaint[n].eMob.y));
                        } else if (effectPaint[n].eChar != null) {
                            myVector.addElement(new EPosition(effectPaint[n].eChar.cx, effectPaint[n].eChar.cy));
                        }

                        if (n > 5) {
                            break;
                        }
                    }

                    Lightning.addLight(myVector, eposition, false, Char.getMyChar().getClassColor());
                }

                Char.getMyChar().effPaints = effectPaint;
            }

        } catch (Exception var4) {
        }
    }

    private boolean advAA() {
        return this.advAD && GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).charId == Char.getMyChar().charID;
    }

    protected final boolean advAQ() {
        return this.advAD && GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).charId != Char.getMyChar().charID;
    }

    private void advAB() {
        if (Code.isADanhCK) {
            advAA(this.zoneID = Code.advAY[Code.advAX = (Code.advAX + 1) % Code.advAY.length]);
            if (this.advAA()) {
                Service.gI().chatParty("khu " + this.zoneID);
                return;
            }
        } else {
            this.advAB(TileMap.zoneID);
        }

    }

    private boolean advAA(int var1, int var2, int var3) {
        if (var1 >= 4) {
            return false;
        } else {
            for (int var4 = 0; var4 < advAQ.size(); ++var4) {
                Mob var5;
                if ((var5 = (Mob) advAQ.elementAt(var4)).levelBoss != 0 && var5.hp > 0 && var5.status != 0) {
                    boolean var6;
                    label71:
                    {
                        if (var5.levelBoss == 3) {
                            if (this instanceof AutoTaThu || this instanceof AutoTuDanh) {
                                var6 = false;
                                break label71;
                            }
                        } else if ((!var5.isBoss || (var1 & 6) == 6) && (var5.levelBoss != 1 || (var1 & 2) != 0) && (var5.levelBoss != 2 || (var1 & 4) != 0)) {
                            var6 = false;
                            break label71;
                        }

                        var6 = true;
                    }

                    if (var6 && Res.abs(var2 - var5.xFirst) <= 200 && Res.abs(var3 - var5.yFirst) <= 100) {
                        return true;
                    }
                } else {
                    advAQ.removeElement(var5);
                    --var4;
                }
            }

            return false;
        }
    }

    private boolean advAD(int var1, int var2) {
        if (Char.isANePk && !(this instanceof AutoTaThu)) {
            for (int var3 = 0; var3 < advAC.size(); ++var3) {
                Char var4;
                if (!advAC(var4 = (Char) advAC.elementAt(var3)) && Res.abs(var1 - var4.cx) <= 300 && Res.abs(var2 - var4.cy) <= 300) {
                    return true;
                }
            }

            return false;
        } else {
            return false;
        }
    }

    protected static Mob advAA(int var0, int var1) {
        Mob var2 = null;
        Char var3 = Char.getMyChar();
        int var4 = var0 - var3.getdxSkill() - 10;
        int var5 = var0 + var3.getdxSkill() + 10;
        int var6 = var1 - var3.getdySkill() - (var3.nClass.classId != 0 && var3.nClass.classId != 1 && var3.nClass.classId != 3 && var3.nClass.classId != 5 ? 0 : 40);
        int var12;
        if ((var12 = var1 + var3.getdySkill()) > var1 + 30) {
            var12 = var1 + 30;
        }

        int var7 = -1;

        for (int var8 = 0; var8 < GameScr.vMob.size(); ++var8) {
            Mob var9 = (Mob) GameScr.vMob.elementAt(var8);
            int var10 = Math.abs(var0 - var9.x);
            int var11 = Math.abs(var1 - var9.y);
            var10 = var10 > var11 ? var10 : var11;
            if (var4 <= var9.x && var9.x <= var5 && var6 <= var9.y && var9.y <= var12 && var9.status != 0 && var9.status != 1 && (var7 == -1 || var10 < var7)) {
                var2 = var9;
                var7 = var10;
            }
        }

        return var2;
    }

    protected final void advAA(int var1, boolean var2) {
        if (Code.advAT < 0 || Code.advAT >= Code.cxViTri.size()) {
            Code.advAT = 0;
        }

        while (true) {
            int var3 = ((Integer) Code.cxViTri.elementAt(Code.advAT)).intValue();
            int var4 = ((Integer) Code.cyViTri.elementAt(Code.advAT)).intValue();
            Mob var5 = advAA(var3, var4);
            if (!this.advAA(var1, var3, var4) && !this.advAD(var3, var4) && var5 != null && !this.advAA(var1, var5.x, var5.y)) {
                this.advAA = Char.getMyChar().cx;
                this.advAB = Char.getMyChar().cy;
                Char.moveToChar(var3, var4);
                Char.getMyChar().mobFocus = var5;
                Service.gI().sendAttackMobFast(var5.mobId);

                try {
                    Thread.sleep(1L);
                    return;
                } catch (InterruptedException var6) {
                    return;
                }
            }

            if (++Code.advAT == Code.cxViTri.size()) {
                Code.advAT = 0;
                if (Char.isAChuyenMapHetQuai && var2) {
                    this.advAB();
                }
            }
        }
    }

    protected Mob advAA(Char charObj, int level, int distance, Char targetChar, boolean autoMove) {
        if (Code.isADanhCVT && !Code.cxViTri.isEmpty()) {
            this.advAA(distance, autoMove);
            return advAA(charObj.cx, charObj.cy);
        }

        int charX = charObj.cx;
        int charY = charObj.cy;
        Mob selectedMob = null;
        int bestScore = -1, bestDist = -1;
        MyVector mobs = GameScr.vMob;

        for (int i = 0; i < mobs.size(); i++) {
            Mob mob = (Mob) mobs.elementAt(i);
            if (mob == null || mob.hp <= 0 || mob.status == 0 || mob.status == 1) {
                continue;
            }

            boolean validMob = advAA(mob, level) && advAC(mob.levelBoss, distance)
                    && (targetChar == null || targetChar.charID == Char.getMyChar().charID
                    || Res.distance(mob.xFirst, mob.yFirst, targetChar.cx, targetChar.cy) <= 1000);

            if (!validMob || this.advAA(distance, mob.x, mob.y) || this.advAD(mob.x, mob.y)) {
                continue;
            }

            if (this.advAG && (this.mapID == 157 || this.mapID == 158 || this.mapID == 159)) {
                if (mob.isBoss) {
                    return mob;
                }
            } else {
                int mobScore = mob.levelBoss << 4 | Math.min(countNearbyMobs(mobs, mob, level, distance), advAO.maxFight);
                int mobDist = targetChar != null && targetChar.charID != Char.getMyChar().charID
                        ? Res.distance(targetChar.cx, targetChar.cy, mob.xFirst, mob.yFirst)
                        : Res.distance(charX, charY, mob.xFirst, mob.yFirst);

                if (mobScore > bestScore || (mobScore == bestScore && mobDist < bestDist)) {
                    bestScore = mobScore;
                    bestDist = mobDist;
                    selectedMob = mob;
                }
            }
        }

        if (selectedMob != null) {
            this.advAC(selectedMob);
            return selectedMob;
        }

        handleAutoMove(autoMove);
        return null;
    }

    private int countNearbyMobs(MyVector mobs, Mob referenceMob, int level, int distance) {
        int count = 0;
        for (int i = 0; i < mobs.size(); i++) {
            Mob mob = (Mob) mobs.elementAt(i);
            if (mob != null && mob.hp > 0 && mob.status != 0 && mob.status != 1
                    && advAA(referenceMob, level) && advAC(referenceMob.levelBoss, distance)
                    && Math.abs(mob.x - referenceMob.x) <= 100 && Math.abs(mob.y - referenceMob.y) <= 50) {
                count++;
            }
        }
        return count;
    }

    private void handleAutoMove(boolean autoMove) {
        if (System.currentTimeMillis() - this.advAU > 1L && !this.advAR()) {
            if (this.advAG) {
                int mapAction = TileMap.advAH(TileMap.mapID);
                if (mapAction >= 0) {
                    this.mapID = mapAction;
                }
                this.cx = this.cy = -1;

                try {
                    Thread.sleep(1L);
                } catch (InterruptedException e) {
                }
            } else if (autoMove && Char.isAChuyenMapHetQuai) {
                this.advAB();
            }
        }
    }

    protected final Char advAA(Char var1, int var2) {
        for (int var3 = 0; var3 < GameScr.vCharInMap.size(); ++var3) {
            Char var4;
            if ((var4 = (Char) GameScr.vCharInMap.elementAt(var3)) != null && !advAC(var4) && !this.advAA(var2, var4.cx, var4.cy) && !this.advAD(var4.cx, var4.cy) && !Code.advAD(var4.cName) && SavePK.advAC(var4.cName) && (var4.cTypePk == 1 || var4.killCharId == var1.charID || var1.cPk < 15)) {
                return var4;
            }
        }

        return null;
    }

    protected static Char advAE(Char focusChar) {
        Char selectedChar = null;
        Char myChar = Char.getMyChar();
        int focusX = focusChar.cx;
        int focusY = focusChar.cy;

        // Xác định vùng ảnh hưởng
        int minX = focusX - myChar.getdxSkill() - 10;
        int maxX = focusX + myChar.getdxSkill() + 10;
        int minY = focusY - myChar.getdySkill() - (isSpecialClass(myChar) ? 0 : 40);
        int maxY = focusY + myChar.getdySkill() + (isSpecialClass(myChar) ? 0 : 40);

        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < GameScr.vCharInMap.size(); i++) {
            Char currentChar = (Char) GameScr.vCharInMap.elementAt(i);

            if (currentChar.cx >= minX && currentChar.cx <= maxX
                    && currentChar.cy >= minY && currentChar.cy <= maxY
                    && !advAC(currentChar) && advAA(myChar, currentChar)
                    && !Code.advAD(currentChar.cName)) {

                int distance = Math.max(Math.abs(focusX - currentChar.cx), Math.abs(focusY - currentChar.cy));

                if (distance < minDistance) {
                    selectedChar = currentChar;
                    minDistance = distance;
                }
            }
        }

        return focusChar.charFocus = selectedChar;
    }

    private static boolean isSpecialClass(Char myChar) {
        int classId = myChar.nClass.classId;
        return classId != 0 && classId != 1 && classId != 3 && classId != 5;
    }

    protected final void advAB(int targetType, int mobType) {
        Char myChar = Char.getMyChar();
        if (!advAT()) {
            Char partyLeader = this.advAD && GameScr.vParty.size() > 0 ? ((Party) GameScr.vParty.firstElement()).c : null;
            boolean canAttack = !this.advAD || Code.cNameLeader == null || myChar.cName.equals(Code.cNameLeader) && LockGame.advBH();
            Mob mobfocus = myChar.mobFocus;
            Char charfocus = myChar.charFocus;
            if (Code.isPk && (charfocus == null || Code.advAD(charfocus.cName) || !SavePK.advAC(charfocus.cName) && !advAA(myChar, charfocus)) && (charfocus = this.advAA(myChar, mobType)) == null) {
                charfocus = advAE(myChar);
            }

            boolean isPKTarget = charfocus != null && SavePK.advAC(charfocus.cName);
            if (charfocus == null && this.advAX) {
                Service.gI().changePk(0);
                this.advAX = false;
            }

            if (Code.isPk && myChar.cPk >= 5 && System.currentTimeMillis() - this.advAW > 5000L) {
                Item item;
                if ((item = Char.getBagItem(257)) != null && item.template.id == 257) {
                    Service.gI().useItem(item.indexUI);
                }

                this.advAW = System.currentTimeMillis();
            }

            if (Code.isADanhCVT && Code.cxViTri.size() > 0 && Code.advAT < 0) {
                this.advAA(mobType, canAttack);
                return;
            }

            boolean shouldEvade = false;
            if (this.advAA(mobType, myChar.cx, myChar.cy) || this.advAD(myChar.cx, myChar.cy) || mobfocus != null && this.advAA(mobType, mobfocus.x, mobfocus.y)) {
                sleep(500L);
                GameScr.paint("Né");
                if (Char.isAChuyenMapHetQuai && canAttack) {
                    this.advAB();
                    shouldEvade = true;
                } else {
                    shouldEvade = false;
                }

                if (shouldEvade) {
                    return;
                }

                shouldEvade = true;
                mobfocus = null;
            }

            if (mobfocus == null || mobfocus.status == 0 || !advAA(mobfocus, targetType) || !advAC(mobfocus.levelBoss, mobType) || System.currentTimeMillis() - this.advAU > 5000L) {
                mobfocus = this.advAA(myChar, targetType, mobType, partyLeader, canAttack);
            }

            if (mobfocus == null && shouldEvade && this.advAA > 0 && this.advAB > 0) {
                Char.moveToChar(this.advAA, this.advAB);
            }

            if (Char.isADanhNhom && GameScr.vParty.size() > 0 && myChar.nClass.classId == 6 && myChar.cHP > 0) {
                int j;
                Char aChar;
                for (int i = 0; i < myChar.vSkillFight.size(); ++i) {
                    Skill skill;
                    if ((skill = (Skill) myChar.vSkillFight.elementAt(i)) != null && skill.template.type == 4) {
                        if (!skill.isCooldown()) {
                            for (j = 0; j < GameScr.vParty.size(); ++j) {
                                Party var14;
                                if ((var14 = (Party) GameScr.vParty.elementAt(j)).charId != myChar.charID && var14.c != null && var14.c.cHP <= 0) {
                                    aChar = var14.c;
                                    if (Math.abs(myChar.cx - aChar.cx) > 50 || Math.abs(myChar.cy - aChar.cy) > 50) {
                                        Char.moveToChar(aChar.cx, aChar.cy);
                                    }

                                    sleep(500L);
                                    Service.gI().buffLive(var14.charId);
                                    skill.lastTimeUseThisSkill = System.currentTimeMillis();
                                    skill.paintCanNotUseSkill = true;
                                    myChar.setAutoSkillPaint(GameScr.sks[skill.template.id], 0);
                                    sleep(1000L);
                                    return;
                                }
                            }
                        }
                        break;
                    }
                }
            }

            if (Char.isASanTaTl && !this.advAG && (mobfocus == null || mobfocus.levelBoss == 0 && (mobType & 6) != 0)) {
                boolean isBossLv1 = (mobType & 2) != 0;
                boolean isBossLv2 = (mobType & 4) != 0;

                for (int i = 0; i < advAQ.size(); ++i) {
                    Mob mob;
                    if ((mob = (Mob) advAQ.elementAt(i)).hp > 0 && mob.status != 0 && mob.status != 1 && !this.advAA(mobType, mob.x, mob.y) && !this.advAD(mob.x, mob.y) && advAA(mob, targetType) && (isBossLv1 && mob.levelBoss == 1 || isBossLv2 && mob.levelBoss == 2)) {
                        mobfocus = mob;
                        this.advAC(mob);
                        break;
                    }
                }
            }

            if (advAO != null) {
                int ine2;
                Skill skill1 = advAO;
                if (skill1.isCooldown() && (Char.isABuff || this instanceof As20)) {
                    labelNe:
                    for (int ine1 = 0; ine1 < myChar.vSkillFight.size(); ++ine1) {
                        Skill currentSkill = (Skill) myChar.vSkillFight.elementAt(ine1);
                        if (currentSkill == null || System.currentTimeMillis() - currentSkill.lastTimeUseThisSkill < (long) currentSkill.coolDown - 300L) {
                            continue;
                        }
                        if (currentSkill.template.type == 2) {
                            if ((myChar.advAC != null || !Char.isADungPT) && currentSkill.template.id >= 67 && currentSkill.template.id <= 72 || !Char.isAKhienMana && currentSkill.template.id == 31 || currentSkill.template.id == 15 && Char.isADotQuai && (myChar.cHP >= myChar.cMaxHP * Char.aHpValue / 100 || !myChar.isHuman) || currentSkill.template.id == 6 && !myChar.isHuman) {
                                continue;
                            }
                            ine2 = (int) (System.currentTimeMillis() / 1000L);
                            for (int ine3 = 0; ine3 < myChar.vEff.size(); ++ine3) {
                                Effect effect = (Effect) myChar.vEff.elementAt(ine3);
                                if (effect != null && (effect.template.iconId == currentSkill.template.iconId || currentSkill.template.id == 58 && effect.template.type == 7) && effect.timeLenght - (ine2 - effect.timeStart) >= 2) {
                                    continue labelNe;
                                }
                            }
                        } else if (!(currentSkill.template.type == 3 && mobfocus != null && mobfocus.levelBoss == 0 && mobfocus.hp > mobfocus.maxHp / 2 ? currentSkill.template.id != 4 || Char.isADotQuai && myChar.cHP < myChar.cMaxHP * Char.aHpValue / 100 : !(currentSkill.template.id != 7 && currentSkill.template.id != 16 && currentSkill.template.id != 25 && currentSkill.template.id != 34 && currentSkill.template.id != 43 || mobfocus == null || mobfocus.levelBoss == 0 && mobfocus.hp < mobfocus.maxHp / 2 || (currentSkill.template.id == 7 || currentSkill.template.id == 16) && mobfocus.isFire || (currentSkill.template.id == 25 || currentSkill.template.id == 34) && !mobfocus.isIce || currentSkill.template.id == 43 && !mobfocus.isWind))) {
                            continue;
                        }
                        skill1 = currentSkill;
                        Auto.sleep(500L);
                        break;
                    }
                }

                if (skill1.template.type == 2) {
                    if (System.currentTimeMillis() - skill1.lastTimeUseThisSkill >= (long) (skill1.coolDown)) {
                        skill1.lastTimeUseThisSkill = System.currentTimeMillis();
                        Service.gI().selectSkill(skill1.template.id);
                        Service.gI().sendUseSkillMyBuff();
                        if (!Code.skilltape) {
                            myChar.setAutoSkillPaint(GameScr.sks[skill1.template.id], 0);
                        }
                    } else {
                        skill1.paintCanNotUseSkill = true;
                    }
                } else {
                    Mob mob1;
                    Char aChar1;
                    if (Code.isPk && charfocus != null && !advAC(charfocus) && (isPKTarget || advAA(myChar, charfocus))) {
                        if (isPKTarget) {
                            if ((skill1.template.type == 1 || skill1.template.type == 3) && (Res.abs(myChar.cx - charfocus.cx) > skill1.dx + 30 || Res.abs(myChar.cy - charfocus.cy) > skill1.dy + 30) && System.currentTimeMillis() - this.advAV > 1500L) {
                                advAD(charfocus);
                                this.advAV = System.currentTimeMillis();
                            }

                            if (charfocus.killCharId != myChar.charID && charfocus.cTypePk != 3) {
                                this.advAX = true;
                                Service.gI().changePk(3);
                            }
                        }

                        int skdx = skill1.dx;
                        int skdy = skill1.dy;
                        advAS.removeAllElements();
                        advAT.removeAllElements();
                        advAT.addElement(charfocus);

                        for (ine2 = 0; ine2 < GameScr.vCharInMap.size() && advAS.size() + advAT.size() < skill1.maxFight; ++ine2) {
                            if ((aChar1 = (Char) GameScr.vCharInMap.elementAt(ine2)).cHP > 0 && aChar1.statusMe != 14 && aChar1.statusMe != 5 && aChar1.statusMe != 15 && !aChar1.equals(charfocus) && (aChar1.cTypePk == 3 || myChar.cTypePk == 3 || aChar1.cTypePk == 1 && myChar.cTypePk == 1 || myChar.killCharId >= 0 && myChar.killCharId == aChar1.charID || myChar.testCharId >= 0 && myChar.testCharId == aChar1.charID || aChar1.killCharId == myChar.charID) && !Code.advAD(aChar1.cName) && charfocus.cx - skdx <= aChar1.cx && aChar1.cx <= charfocus.cx + skdx && charfocus.cy - skdy <= aChar1.cy && aChar1.cy <= charfocus.cy + skdy) {
                                advAT.addElement(aChar1);
                            }
                        }

                        for (ine2 = 0; ine2 < GameScr.vMob.size() && advAS.size() + advAT.size() < skill1.maxFight; ++ine2) {
                            if ((mob1 = (Mob) GameScr.vMob.elementAt(ine2)).status != 0 && mob1.status != 1 && charfocus.cx - skdx <= mob1.x && mob1.x <= charfocus.cx + skdx && charfocus.cy - skdy <= mob1.y && mob1.y <= charfocus.cy + skdy && advAC(mob1.levelBoss, mobType) && (targetType == -1 || mob1.templateId == targetType)) {
                                advAS.addElement(mob1);
                            }
                        }

                        if (System.currentTimeMillis() - skill1.lastTimeUseThisSkill >= (long) (skill1.coolDown)) {
                            skill1.lastTimeUseThisSkill = System.currentTimeMillis();
                            Service.gI().selectSkill(skill1.template.id);
                            Service.gI().sendPlayerAttack((MyVector) advAS, (MyVector) advAT, (int) 2);
                            if (!Code.skilltape) {
                                myChar.setAutoSkillPaint(GameScr.sks[skill1.template.id], 0);
                            }
                        } else {
                            skill1.paintCanNotUseSkill = true;
                        }
                    } else {
                        if (mobfocus == null || targetType != -1 && mobfocus.templateId != targetType || !advAC(mobfocus.levelBoss, mobType)) {
                            return;
                        }

                        if ((skill1.template.type == 1 || skill1.template.type == 3) && (Res.abs(myChar.cx - mobfocus.xFirst) > skill1.dx + 30 || Res.abs(myChar.cy - mobfocus.yFirst) > skill1.dy + 30)) {
                            myChar.mobFocus = null;
                            return;
                        }

                        int skdx = skill1.dx;
                        int skdy = skill1.dy;
                        advAS.removeAllElements();
                        advAT.removeAllElements();
                        advAS.addElement(mobfocus);

                        for (ine2 = 0; ine2 < GameScr.vMob.size() && advAS.size() + advAT.size() < skill1.maxFight; ++ine2) {
                            if ((mob1 = (Mob) GameScr.vMob.elementAt(ine2)).status != 0 && mob1.status != 1 && !mob1.equals(mobfocus) && mobfocus.xFirst - 100 <= mob1.xFirst && mob1.xFirst <= mobfocus.xFirst + 100 && mobfocus.yFirst - 50 <= mob1.yFirst && mob1.yFirst <= mobfocus.yFirst + 50 && advAC(mob1.levelBoss, mobType) && (targetType == -1 || mob1.templateId == targetType)) {
                                advAS.addElement(mob1);
                            }
                        }

                        for (ine2 = 0; ine2 < GameScr.vCharInMap.size() && advAS.size() + advAT.size() < skill1.maxFight; ++ine2) {
                            if ((aChar1 = (Char) GameScr.vCharInMap.elementAt(ine2)).cHP > 0 && aChar1.statusMe != 14 && aChar1.statusMe != 5 && aChar1.statusMe != 15 && (aChar1.cTypePk == 3 || myChar.cTypePk == 3 || aChar1.cTypePk == 1 && myChar.cTypePk == 1 || myChar.killCharId >= 0 && myChar.killCharId == aChar1.charID || myChar.testCharId >= 0 && myChar.testCharId == aChar1.charID || aChar1.killCharId == myChar.charID) && !Code.advAD(aChar1.cName) && mobfocus.x - skdx <= aChar1.cx && aChar1.cx <= mobfocus.x + skdx && mobfocus.y - skdy <= aChar1.cy && aChar1.cy <= mobfocus.y + skdy) {
                                advAT.addElement(aChar1);
                            }
                        }

                        if (System.currentTimeMillis() - skill1.lastTimeUseThisSkill >= (long) (skill1.coolDown)) {
                            skill1.lastTimeUseThisSkill = System.currentTimeMillis();
                            Service.gI().selectSkill(skill1.template.id);
                            Service.gI().sendPlayerAttack((MyVector) advAS, (MyVector) advAT, (int) 1);
                            if (!Code.skilltape) {
                                myChar.setAutoSkillPaint(GameScr.sks[skill1.template.id], 0);
                            }
                        } else {
                            skill1.paintCanNotUseSkill = true;
                        }
                    }
                }

                this.advAU = System.currentTimeMillis();
            }
        }

    }

    protected boolean advAR() {
        if (!(this instanceof AutoTaThu) && !Code.isAHutVP) {
            Char var1 = Char.getMyChar();
            int var2 = Code.KCNhatValue < 0 ? -1 : Code.KCNhatValue;

            for (int var3 = 0; var3 < GameScr.vItemMap.size(); ++var3) {
                ItemMap var4;
                if (!(var4 = (ItemMap) GameScr.vItemMap.elementAt(var3)).advAK && (var1.nClass.classId == 1 && var4.template.id == 218 || var4.template.type == 19 || Code.advAA(var4.template) && (Char.getBagNum() > 2 || var4.template.isUpToUp && Char.isBagHas(var4.template.id))) && (var2 < 0 || Res.distance(var1.cx, var1.cy, var4.xEnd, var4.yEnd) < var2) && !this.advAD(var4.x, var4.y)) {
                    return true;
                }
            }

            return false;
        } else {
            return false;
        }
    }

    public static boolean isLang(int var0) {
        return var0 == 10 || var0 == 17 || var0 == 22 || var0 == 32 || var0 == 38 || var0 == 43 || var0 == 48;
    }

    public final void LangCo() {
        if (this.mapID == 134 || this.mapID == 135 || this.mapID == 136 || this.mapID == 137) {
            mapid = this.mapID;
        }
    }

    public final void ressetcPk() {
        if ((TileMap.isTruong(TileMap.mapID) || isLang(TileMap.mapID)) && (this.mapID >= 134 && this.mapID <= 138)) {
            GameScr.gI().doInfo();
            CuongScr.sleep(200L);

            if (Char.getMyChar().cPk > 0) {
                Item hoanLuong = Char.getBagItem(257);
                if (hoanLuong != null && hoanLuong.template.id == 257) {
                    System.out.println("Dùng hoàn lương chỉ thảo");
                    Service.gI().useItem(hoanLuong.indexUI);
                    CuongScr.sleep(100L);
                }
                return;
            }
        }
    }

    protected final void advAC(int targetItemId) {
        if (!Code.isAHutVP) {
            Char playerCharacter = Char.getMyChar();
            if (!advAT()) {
                advBB.removeAllElements();
                int attackMode = this.advAA(Char.isADanhQuai, Char.isADanhTA, Char.isADanhTL);

                int i;
                for (i = 0; i < GameScr.vItemMap.size(); ++i) {
                    ItemMap item;
                    if (!(item = (ItemMap) GameScr.vItemMap.elementAt(i)).advAK
                            && (playerCharacter.nClass.classId == 1 && item.template.id == 218
                            || (Code.advAA(item.template) || item.template.id == targetItemId
                            || this instanceof AutoDanhVong && AutoDanhVong.advAA == 4 && item.template.type == 26)
                            && (Char.getBagNum() > 2 || item.template.type == 19
                            || item.template.isUpToUp && Char.isBagHas(item.template.id)))
                            && !this.advAA(attackMode, item.xEnd, item.yEnd)
                            && !this.advAD(item.xEnd, item.yEnd)
                            && (Code.KCNhatValue < 0 || Res.distance(playerCharacter.cx, playerCharacter.cy, item.xEnd, item.yEnd) < Code.KCNhatValue)) {
                        advBB.addElement(item);
                    }
                }

                if (advBB.size() > 0) {
                    int originalX = playerCharacter.cx;
                    int originalY = playerCharacter.cy;
                    Mob originalTarget = playerCharacter.mobFocus;

                    label1:
                    for (int j = 0; j < advBB.size(); ++j) {
                        try {
                            Thread.sleep(10L);
                        } catch (InterruptedException e) {
                        }

                        ItemMap pickedItem;
                        Char.moveToChar((pickedItem = (ItemMap) advBB.elementAt(j)).xEnd, TileMap.advAD(pickedItem.xEnd, pickedItem.yEnd));
                        playerCharacter.itemFocus = pickedItem;

                        for (int attempt = 0; attempt < 4 && pickedItem.status != 2 && !pickedItem.advAK; ++attempt) {
                            Service.gI().pickItem(pickedItem.itemMapID);
                            if (LockGame.advAC()) {
                                break;
                            }

                            if (this.advAD(playerCharacter.cx, playerCharacter.cy) || playerCharacter.cHP <= 0) {
                                break label1;
                            }
                        }

                        pickedItem.advAK = true;
                        pickedItem.advAL = System.currentTimeMillis();
                    }

                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e) {
                    }

                    Char.moveToChar(originalX, originalY);
                    playerCharacter.mobFocus = originalTarget;
                }
            }
        }
    }

    protected final void advAS() {
        if (TileMap.mapID != 22) {
            this.remap(22, -2, -1, -1);
        } else {
            Char var1;
            if ((var1 = Char.getMyChar()).advAC != null) {
                GameScr.pickNPC(12, 3, 0);
                LockGame.advBC();
            } else {
                for (int var2 = 0; var2 < var1.vSkillFight.size(); ++var2) {
                    Skill var3;
                    if ((var3 = (Skill) var1.vSkillFight.elementAt(var2)) != null && !var3.isCooldown() && var3.template.id >= 67 && var3.template.id <= 72) {
                        Service.gI().selectSkill(var3.template.id);
                        Service.gI().sendUseSkillMyBuff();
                        LockGame.advBC();
                        break;
                    }
                }

                try {
                    Thread.sleep(200L);
                } catch (InterruptedException var4) {
                }
            }
        }
    }

    protected static boolean advAT() {
        Char var0;
        if ((var0 = Char.getMyChar()).isHuman && var0.cHP < var0.cMaxHP) {
            for (int var1 = 0; var1 < var0.vEff.size(); ++var1) {
                Effect var2;
                if ((var2 = (Effect) var0.vEff.elementAt(var1)) != null && var2.template.type == 12) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void sleep(long var0) {
        try {
            Thread.sleep(var0);
        } catch (InterruptedException var2) {
        }
    }

    protected abstract void auto();

    public String toString() {
        return "";
    }
}
