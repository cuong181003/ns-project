
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Enumeration;

public class Char extends MainObject {

    public Char advAC;
    public Char advAD;
    public boolean isHuman;
    public boolean isNhanban;
    public boolean isCaptcha;
    private int tickEffWolf;
    private int timeBocdau;
    public long lastUpdateTime;
    public ChatPopup chatPopup;
    public long cEXP;
    public long cExpDown;
    private int lcx;
    private int lcy;
    public int cx;
    public int cy;
    public int cvx;
    public int cvy;
    public int cp1;
    private int cp2;
    private int cp3;
    public int statusMe;
    public int cdir;
    public int charID;
    public int cgender;
    public int ctaskId;
    public int cBonusSpeed;
    public int cspeed;
    public int cdame;
    public int cdameDown;
    public int clevel;
    public int cMP;
    public int cMaxMP;
    public int cHP;
    public int cHpNew;
    public int cMaxHP;
    private int cyStartFall;
    public int eff5BuffHp;
    public int eff5BuffMp;
    public long cExpR;
    public int pPoint;
    public int sPoint;
    public int pointUydanh;
    public int pointNon;
    public int pointVukhi;
    public int pointAo;
    public int pointLien;
    public int pointGangtay;
    public int pointNhan;
    public int pointQuan;
    public int pointNgocboi;
    public int pointGiay;
    public int pointPhu;
    public int pointTinhTu;
    public int countFinishDay;
    public int countLoopBoos;
    public int limitTiemnangso;
    public int limitKynangso;
    public int limitPhongLoi;
    public int limitBangHoa;
    public int countPB;
    public int[] potential;
    public String cName;
    public String cClanName;
    public byte ctypeClan;
    public static Clan clan;
    public int cw;
    public int ch;
    public int chw;
    public int chh;
    public boolean canJumpHigh;
    private boolean cmtoChar;
    public boolean me;
    public boolean isAttack;
    private boolean isAttFly;
    public int cf;
    private int tick;
    public boolean isMoto;
    public boolean isWolf;
    public boolean isMotoBehind;
    private boolean isBocdau;
    public boolean isNewMount;
    public int xu;
    public int xuInBox;
    public int yen;
    public int luong;
    public NClass nClass;
    public MyVector vSkill;
    public MyVector vSkillFight;
    public MyVector vEff;
    private MyVector vDomsang;
    public Skill myskill;
    public Task taskMaint;
    private boolean paintName;
    public Item[] arrItemBag;
    public Item[] arrItemBox;
    public Item[] arrItemBody;
    public Item[] arrItemMounts;
    public Item[] arrItemViThu;
    public short cResFire;
    public short cResIce;
    public short cResWind;
    public short cMiss;
    public short cExactly;
    public short cFatal;
    public byte cPk;
    public byte cTypePk;
    public short cReactDame;
    public short sysUp;
    public short sysDown;
    public Mob mobFocus;
    public Mob mobMe;
    public Mob mobVithu;
    public Npc npcFocus;
    public Char charFocus;
    public ItemMap itemFocus;
    public MyVector focus;
    public Mob[] attMobs;
    public Char[] attChars;
    public short[] moveFast;
    public int testCharId;
    public int killCharId;
    public byte resultTest;
    public int countKill;
    public int countKillMax;
    public int tickCoat;
    private int tickEffmoto;
    private int tickEffFireW;
    public boolean isInvisible;
    public static boolean isAHP;
    public static boolean isAMP;
    public static boolean isAFood;
    public static boolean isABuff;
    public static boolean isADungPT;
    public static boolean isAKhienMana;
    public static boolean isADotQuai;
    public static boolean isAPickYen;
    public static boolean isAPickYHM;
    public static boolean isAPickYHMS;
    public static boolean isALuyenDa;
    public static boolean isAPickTB;
    public static boolean isAPickTBLa;
    public static boolean isAPickVPNV;
    public static boolean isAPickVPSK;
    public static boolean isAPickAll;
    public static boolean isAPickSVC;
    public static boolean isANoPick;
    public static boolean isALuyenTTT;
    public static boolean isALuyenTTC;
    public static boolean isAReMap;
    public static boolean isATsMapTrong;
    public static boolean isAMuaFood;
    public static boolean isANoMP;
    public static boolean isAReConnect;
    public static boolean isAChuyenMapHetQuai;
    public static boolean isASanTaTl;
    public static boolean isADanhQuai;
    public static boolean isADanhTA;
    public static boolean isADanhTL;
    public static boolean isACongTN;
    public static boolean isACongKN;
    public static boolean isADanhNhom;
    public static boolean isANePk;
    public static boolean isADungCoLenh;
    public static boolean isAMuaCoLenh;
    public static boolean isADungTTL;
    public static boolean isAMuaTTL;
    public static boolean isAResuscitate;
    public static boolean isAFocusDie;
    public static int aHpValue;
    public static int aMpValue;
    public static int aFoodValue;
    public static int aHpMpValue;
    public static int aDaValue;
    public static int aLuyenDaValue;
    public static int aTBValue;
    public static int aCID;
    private long lastTimeUseSkill;
    public MyVector taskOrders;
    public static int pointPB;
    public static int pointChienTruong;
    private long timeStartBlink;
    public long timeSummon;
    public static final int[][][] CharInfo = new int[][][]{{{0, -10, 32}, {1, -7, 7}, {1, -11, 15}, {1, -9, 45}}, {{0, -10, 33}, {1, -7, 7}, {1, -11, 16}, {1, -9, 46}}, {{1, -10, 33}, {2, -10, 11}, {2, -9, 16}, {1, -12, 49}}, {{1, -10, 32}, {3, -11, 9}, {3, -11, 16}, {1, -13, 47}}, {{1, -10, 34}, {4, -9, 9}, {4, -8, 16}, {1, -12, 47}}, {{1, -10, 34}, {5, -11, 11}, {5, -10, 17}, {1, -13, 49}}, {{1, -10, 33}, {6, -9, 9}, {6, -8, 16}, {1, -12, 47}}, {{0, -9, 36}, {7, -5, 15}, {7, -10, 21}, {1, -8, 49}}, {{4, -13, 26}, new int[3], new int[3], new int[3]}, {{5, -13, 25}, new int[3], new int[3], new int[3]}, {{6, -12, 26}, new int[3], new int[3], new int[3]}, {{7, -13, 25}, new int[3], new int[3], new int[3]}, {{0, -9, 35}, {8, -4, 13}, {8, -14, 27}, {1, -9, 49}}, {{0, -9, 31}, {9, -11, 8}, {10, -10, 17}, new int[3]}, {{2, -7, 33}, {9, -11, 8}, {11, -8, 15}, new int[3]}, {{2, -8, 32}, {9, -11, 8}, {12, -8, 14}, new int[3]}, {{2, -7, 32}, {9, -11, 8}, {13, -12, 15}, new int[3]}, {{0, -11, 31}, {9, -11, 8}, {14, -15, 18}, new int[3]}, {{2, -9, 32}, {9, -11, 8}, {15, -13, 19}, new int[3]}, {{2, -9, 31}, {9, -11, 8}, {16, -7, 22}, new int[3]}, {{2, -9, 32}, {9, -11, 8}, {17, -11, 18}, new int[3]}, {{3, -12, 34}, {8, -4, 13}, {8, -15, 25}, {1, -10, 46}}, {{0, -9, 32}, {8, -4, 9}, {10, -10, 18}, new int[3]}, {{2, -7, 34}, {8, -4, 9}, {11, -8, 16}, new int[3]}, {{2, -8, 33}, {8, -4, 9}, {12, -8, 15}, new int[3]}, {{2, -7, 33}, {8, -4, 9}, {13, -12, 16}, new int[3]}, {{0, -11, 32}, {7, -5, 9}, {14, -15, 19}, new int[3]}, {{2, -9, 33}, {7, -5, 9}, {15, -13, 20}, new int[3]}, {{2, -9, 32}, {7, -5, 9}, {16, -7, 23}, new int[3]}, {{2, -9, 33}, {7, -5, 9}, {17, -11, 19}, new int[3]}};
    private static Char myChar;
    private int cvyJump;
    public int cxSend;
    public int cySend;
    public int cxMoveLast;
    public int cyMoveLast;
    public MyVector vMovePoints;
    public static boolean ischangingMap;
    public static boolean isLockKey;
    public boolean isLockMove;
    public boolean isLockAttack;
    public boolean isBlinking;
    public MovePoint currentMovePoint;
    private int count;
    private boolean isEffBatTu;
    public long lastUseHP;
    public int vitaWolf;
    private long timeSendmove;
    private static boolean isSendMove;
    private int cX0;
    private int cY0;
    private int FramecharRideHorse;
    private int inAir;
    private long currMove;
    private boolean isLastMove;
    public static byte[] locate;
    private long timeLastCheck;
    private long timelastSendmove;
    private static short delaySendmove;
    public short head;
    public short leg;
    public short body;
    public short wp;
    public short coat;
    public short glove;
    private int indexEff;
    public int indexEffTask;
    private EffectCharPaint eff;
    public EffectCharPaint effTask;
    private int indexSkill;
    private int i0;
    private int i1;
    private int i2;
    private int dx0;
    private int dx1;
    private int dx2;
    private int dy0;
    private int dy1;
    private int dy2;
    private EffectCharPaint eff0;
    private EffectCharPaint eff1;
    private EffectCharPaint eff2;
    public Arrow arr;
    public SkillPaint skillPaint;
    public EffectPaint[] effPaints;
    private int sType;
    private byte isInjure;
    private static mHashtable ALL_PART_EFF;
    private int heightCharName;
    private int dxHead;
    private int dyHead;
    private int dxBody;
    private int dyBody;
    private int tickWolf;
    private int dy;
    private int hdx;
    private int hdy;
    private int[] idWolfW;
    private int FrameName;
    private int fName;
    private int FrameRank;
    private int fRank;
    private int FrameMatna;
    private int fMatNa;
    private int FrameBienHinh;
    private int fBienhinh;
    private int FrameWeaPone;
    private int fWeapone;
    private int FrameSusan;
    private int fsusan;
    private int FrameLeg;
    private int fLeg;
    private int FrameBody;
    private int fBody;
    private int FrameHair;
    private int fHair;
    public short ID_Body;
    public short ID_PP;
    public short ID_HAIR;
    public short ID_LEG;
    public short ID_HORSE;
    private short ID_NAME;
    private short ID_RANK;
    public short ID_MAT_NA;
    private short ID_Bien_Hinh;
    public short ID_WEA_PONE;
    public short ID_SUSANO;
    private byte ColorName;
    private static mFont[] color_font_name;
    private int FramePP;
    private int fPP;
    private int FrameHorse;
    private int fho;
    private byte[] ActionHorse;
    private int fHorseUI;
    private int fhorsetrangbi;
    private short[] fRun_PP;
    private int FbodyUI;
    private int FlegUI;
    private int fHeadUI;
    private int fPPUI;
    private byte fWeaponUI;
    private byte fMatNaUI;
    private int dynewhhorse;
    private int dxnewhorse;
    private byte frameFix;
    public static boolean isManualFocus;
    public short wdx;
    public short wdy;
    public boolean isDirtyPostion;
    public Skill lastNormalSkill;
    public boolean currentFireByShortcut;
    private int EffdefautX;
    private int EffdefautY;
    private int EffdefautX1;
    private int EffdefautY1;
    private int[][] frameMount;
    private int tickNewMount;
    private int fNewMount;
    private int dyMount;
    public static boolean isANameMob;

    static {
        LoadAuto();
    }

    private static void LoadAuto() {
        // Default settings
        int[] var10000 = new int[]{-2, -6, 22, 21, 19, 22, 10, -2, -2, 5, 19};
        var10000 = new int[]{9, 22, 25, 17, 26, 37, 36, 49, 50, 52, 36};
        isABuff = true;
        isADungPT = true;
        isAKhienMana = false;
        isADotQuai = false;
        isAPickYen = true;
        isAPickYHM = true;
        isAPickTBLa = false;
        isAPickVPSK = true;
        isALuyenTTT = false;
        isALuyenTTC = false;
        isAReMap = true;
        isATsMapTrong = true;
        isANoMP = true;
        isAReConnect = true;
        isAChuyenMapHetQuai = true;
        isASanTaTl = true;
        isADanhQuai = true;
        isADanhTA = true;
        isADanhTL = true;
        isADanhNhom = true;
        isANePk = false;
        isADungCoLenh = false;
        isAMuaCoLenh = false;
        isAMuaTTL = false;
        isADungTTL = false;
        aHpValue = 20;
        aMpValue = 20;
        aFoodValue = 70;
        aHpMpValue = 30;
        aDaValue = 3;
        aLuyenDaValue = 5;
        aTBValue = 30;
        isSendMove = true;
        isANameMob = false;
        locate = new byte[]{0, 0, 0, -1, -1, -1, -2, -2, -2, -1, -1, -1};
        delaySendmove = 250;
        ALL_PART_EFF = new mHashtable();
        color_font_name = new mFont[]{mFont.tahoma_7_white, mFont.tahoma_7_blue1, mFont.tahoma_7b_purple, mFont.tahoma_7b_yellow};
        isManualFocus = false;
        System.out.println("Load Auto");

        try {
            byte[] buf = RMS.loadRMS("V7ProSetting");
            if (buf == null) {
                return;
            }

            ByteArrayInputStream var0 = new ByteArrayInputStream(buf);
            DataInputStream var1 = new DataInputStream(var0);

            isAHP = var1.readBoolean();
            aHpValue = var1.readInt();
            isAMP = var1.readBoolean();
            aMpValue = var1.readInt();
            isAFood = var1.readBoolean();
            aFoodValue = var1.readInt();
            isABuff = var1.readBoolean();
            isAKhienMana = var1.readBoolean();
            isADotQuai = var1.readBoolean();
            isADungPT = var1.readBoolean();
            isAPickYen = var1.readBoolean();
            isAPickYHM = var1.readBoolean();
            aHpMpValue = var1.readInt();
            isAPickYHMS = var1.readBoolean();
            aDaValue = var1.readInt();
            isALuyenDa = var1.readBoolean();
            aLuyenDaValue = var1.readInt();
            isAPickTB = var1.readBoolean();
            isAPickTBLa = var1.readBoolean();
            aTBValue = var1.readInt();
            isAPickVPNV = var1.readBoolean();
            isAPickVPSK = var1.readBoolean();
            isAPickAll = var1.readBoolean();
            isAPickSVC = var1.readBoolean();
            isANoPick = var1.readBoolean();
            isAReMap = var1.readBoolean();
            isATsMapTrong = var1.readBoolean();
            isAMuaFood = var1.readBoolean();
            isANoMP = var1.readBoolean();
            isAReConnect = var1.readBoolean();
            isAChuyenMapHetQuai = var1.readBoolean();
            isANePk = var1.readBoolean();
            isASanTaTl = var1.readBoolean();
            isADanhQuai = var1.readBoolean();
            isADanhTA = var1.readBoolean();
            isADanhTL = var1.readBoolean();
            isACongTN = var1.readBoolean();
            isACongKN = var1.readBoolean();
            isADanhNhom = var1.readBoolean();

            int var2 = var1.readInt();
            System.out.println("lent: " + var2);
            if (Code.arrItemNhat.length < var2) {
                Code.arrItemNhat = new short[10 * (var2 / 10 + 1)];
            }

            for (int var3 = 0; var3 < var2; ++var3) {
                Code.arrItemNhat[var3] = var1.readShort();
            }

            Code.SPGameValue = var1.readInt();
            isALuyenTTT = var1.readBoolean();
            isALuyenTTC = var1.readBoolean();

            var2 = var1.readInt();
            System.out.println("lentDel: " + var2);
            if (Code.arrItemDel.length < var2) {
                Code.arrItemDel = new short[10 * (var2 / 10 + 1)];
            }

            for (int var3 = 0; var3 < var2; ++var3) {
                Code.arrItemDel[var3] = var1.readShort();
            }
            isADungTTL = var1.readBoolean();
            isAMuaTTL = var1.readBoolean();
            isADungCoLenh = var1.readBoolean();
            var2 = var1.readInt();

            for (int var3 = 0; var3 < var2; ++var3) {
                Code.advBB.addElement(new Integer(var1.readShort()));
                Code.advBC.addElement(new Integer(var1.readInt()));
            }

            isAMuaCoLenh = var1.readBoolean();
            FormPK.AA = var1.readBoolean();
            FormPK.AC = var1.readBoolean();
            FormPK.AD = var1.readBoolean();
            FormPK.AB = var1.readBoolean();
            FormPK.AF = var1.readInt();
            FormPK.AE = var1.readInt();
            isANameMob = var1.readBoolean();
            var0.close();
            var1.close();
        } catch (Exception var4) {
            var4.printStackTrace();
        }
    }

    public static void SaveAuto() {
        System.out.println("Save Auto");
        ByteArrayOutputStream var0 = new ByteArrayOutputStream();
        DataOutputStream var1 = new DataOutputStream(var0);

        try {
            var1.writeBoolean(isAHP);
            var1.writeInt(aHpValue);
            var1.writeBoolean(isAMP);
            var1.writeInt(aMpValue);
            var1.writeBoolean(isAFood);
            var1.writeInt(aFoodValue);
            var1.writeBoolean(isABuff);
            var1.writeBoolean(isAKhienMana);
            var1.writeBoolean(isADotQuai);
            var1.writeBoolean(isADungPT);
            var1.writeBoolean(isAPickYen);
            var1.writeBoolean(isAPickYHM);
            var1.writeInt(aHpMpValue);
            var1.writeBoolean(isAPickYHMS);
            var1.writeInt(aDaValue);
            var1.writeBoolean(isALuyenDa);
            var1.writeInt(aLuyenDaValue);
            var1.writeBoolean(isAPickTB);
            var1.writeBoolean(isAPickTBLa);
            var1.writeInt(aTBValue);
            var1.writeBoolean(isAPickVPNV);
            var1.writeBoolean(isAPickVPSK);
            var1.writeBoolean(isAPickAll);
            var1.writeBoolean(isAPickSVC);
            var1.writeBoolean(isANoPick);
            var1.writeBoolean(isAReMap);
            var1.writeBoolean(isATsMapTrong);
            var1.writeBoolean(isAMuaFood);
            var1.writeBoolean(isANoMP);
            var1.writeBoolean(isAReConnect);
            var1.writeBoolean(isAChuyenMapHetQuai);
            var1.writeBoolean(isANePk);
            var1.writeBoolean(isASanTaTl);
            var1.writeBoolean(isADanhQuai);
            var1.writeBoolean(isADanhTA);
            var1.writeBoolean(isADanhTL);
            var1.writeBoolean(isACongTN);
            var1.writeBoolean(isACongKN);
            var1.writeBoolean(isADanhNhom);
            int var2 = 0;

            int var3;
            for (var3 = 0; var3 < Code.arrItemNhat.length; ++var3) {
                if (Code.arrItemNhat[var3] >= 0) {
                    ++var2;
                }
            }

            System.out.println("lent: " + var2);
            var1.writeInt(var2);

            for (var3 = 0; var3 < Code.arrItemNhat.length; ++var3) {
                if (Code.arrItemNhat[var3] >= 0) {
                    var1.writeShort(Code.arrItemNhat[var3]);
                }
            }

            var1.writeInt(Code.SPGameValue);
            var1.writeBoolean(isALuyenTTT);
            var1.writeBoolean(isALuyenTTC);
            var2 = 0;

            for (var3 = 0; var3 < Code.arrItemDel.length; ++var3) {
                if (Code.arrItemDel[var3] >= 0) {
                    ++var2;
                }
            }

            System.out.println("lent: " + var2);
            var1.writeInt(var2);

            for (var3 = 0; var3 < Code.arrItemDel.length; ++var3) {
                if (Code.arrItemDel[var3] >= 0) {
                    var1.writeShort(Code.arrItemDel[var3]);
                }
            }
            var1.writeBoolean(isADungTTL);
            var1.writeBoolean(isAMuaTTL);
            var1.writeBoolean(isADungCoLenh);
            var1.writeInt(Code.advBB.size());

            for (var3 = 0; var3 < Code.advBB.size(); ++var3) {
                var1.writeShort(((Integer) Code.advBB.elementAt(var3)).intValue());
                var1.writeInt(((Integer) Code.advBC.elementAt(var3)).intValue());
            }

            var1.writeBoolean(isAMuaCoLenh);
            var1.writeBoolean(FormPK.AA);
            var1.writeBoolean(FormPK.AC);
            var1.writeBoolean(FormPK.AD);
            var1.writeBoolean(FormPK.AB);
            var1.writeInt(FormPK.AF);
            var1.writeInt(FormPK.AE);
            var1.writeBoolean(isANameMob);

            var1.flush();
            var0.flush();
            RMS.saveRMS("V7ProSetting", var0.toByteArray());
        } catch (Exception var4) {
            var4.printStackTrace();
        }
    }

    public final int getdxSkill() {
        return this.myskill != null ? this.myskill.advAB() : 0;
    }

    public final int getdySkill() {
        return this.myskill != null ? this.myskill.advAC() : 0;
    }

    public Char() {
        short[] var10000 = new short[]{-1, -1, -1, -1};
        this.tickEffWolf = 0;
        this.timeBocdau = 0;
        this.cx = 24;
        this.cy = 24;
        this.statusMe = 5;
        this.cdir = 1;
        this.potential = new int[4];
        new MyVector();
        this.cClanName = "";
        this.cw = 22;
        this.ch = 32;
        this.chw = 11;
        this.chh = 16;
        this.canJumpHigh = true;
        this.isMoto = false;
        this.isWolf = false;
        this.isBocdau = false;
        this.isNewMount = false;
        this.vSkill = new MyVector();
        this.vSkillFight = new MyVector();
        this.vEff = new MyVector();
        this.vDomsang = new MyVector();
        this.paintName = true;
        this.arrItemMounts = new Item[5];
        this.arrItemViThu = new Item[5];
        this.focus = new MyVector();
        this.testCharId = -9999;
        this.killCharId = -9999;
        this.lastTimeUseSkill = 0L;
        this.taskOrders = new MyVector();
        this.vMovePoints = new MyVector();
        this.count = 0;
        this.lastUseHP = System.currentTimeMillis();
        this.vitaWolf = 0;
        this.currMove = 0L;
        this.isLastMove = false;
        this.coat = -1;
        this.glove = -1;
        this.indexEff = -1;
        this.indexEffTask = -1;
        this.eff0 = null;
        this.eff1 = null;
        this.eff2 = null;
        this.arr = null;
        this.heightCharName = 0;
        this.dxHead = 0;
        this.dyHead = 0;
        this.dxBody = 0;
        this.dyBody = 0;
        this.tickWolf = 0;
        this.dy = 0;
        this.hdx = 0;
        this.hdy = 0;
        this.idWolfW = new int[]{1715, 1737, 1714, 1738};
        this.ID_Body = -1;
        this.ID_PP = -1;
        this.ID_HAIR = -1;
        this.ID_LEG = -1;
        this.ID_HORSE = -1;
        this.ID_NAME = -1;
        this.ID_RANK = -1;
        this.ID_MAT_NA = -1;
        this.ID_Bien_Hinh = -1;
        this.ID_WEA_PONE = -1;
        this.ID_SUSANO = -1;
        this.ColorName = 0;
        this.fRun_PP = new short[]{2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        this.dynewhhorse = 0;
        this.dxnewhorse = 0;
        this.frameFix = 2;
        this.frameMount = new int[][]{{3049, 3050}, {3051, 3051, 3052, 3052, 3053, 3053}, {3054}, {3055}, {3056}, {3049, 3049, 3049, 3050, 3050, 3050}};
        this.statusMe = 6;
    }

    public final int getSys() {
        if (this.nClass.classId != 1 && this.nClass.classId != 2) {
            if (this.nClass.classId != 3 && this.nClass.classId != 4) {
                return this.nClass.classId != 5 && this.nClass.classId != 6 ? 0 : 3;
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    public final int getSpeed() {
        if (Code.isAspeed) {
            return Code.speedValue;
        } else {
            return !this.isWolf && !this.isMoto ? this.cspeed : this.cspeed + 2;
        }
    }

    public final boolean isUseLongRangeWeapon() {
        return this.nClass.classId == 2 || this.nClass.classId == 4 || this.nClass.classId == 6;
    }

    public static Char getMyChar() {
        if (myChar == null) {
            (myChar = new Char()).me = true;
            myChar.cmtoChar = true;
            myChar.timelastSendmove = System.currentTimeMillis();
        }

        return myChar;
    }

    public static void clearMyChar() {
        isAResuscitate = false;
        isAFocusDie = false;
        myChar = null;
    }

    public final void readParam(Message var1) {
        try {
            this.cspeed = var1.reader().readByte();
            this.cMaxHP = var1.reader().readInt();
            this.cMaxMP = var1.reader().readInt();
        } catch (Exception var2) {
            var2.printStackTrace();
            System.out.println("Char.readParam()");
        }
    }

    public final void bagSort() {
        try {
            MyVector var1 = new MyVector();

            int var2;
            Item var3;
            for (var2 = 0; var2 < this.arrItemBag.length; ++var2) {
                if ((var3 = this.arrItemBag[var2]) != null && var3.template.isUpToUp && !var3.isExpires) {
                    var1.addElement(var3);
                }
            }

            for (var2 = 0; var2 < var1.size(); ++var2) {
                if ((var3 = (Item) var1.elementAt(var2)) != null) {
                    for (int var4 = var2 + 1; var4 < var1.size(); ++var4) {
                        Item var5;
                        if ((var5 = (Item) var1.elementAt(var4)) != null && var3.template.equals(var5.template) && var3.isLock == var5.isLock) {
                            var3.quantity += var5.quantity;
                            this.arrItemBag[var5.indexUI] = null;
                            var1.setElementAt((Object) null, var4);
                        }
                    }
                }
            }

            for (var2 = 0; var2 < this.arrItemBag.length; ++var2) {
                if (this.arrItemBag[var2] != null) {
                    for (int var7 = 0; var7 <= var2; ++var7) {
                        if (this.arrItemBag[var7] == null) {
                            this.arrItemBag[var7] = this.arrItemBag[var2];
                            this.arrItemBag[var7].indexUI = var7;
                            this.arrItemBag[var2] = null;
                            break;
                        }
                    }
                }
            }

        } catch (Exception var6) {
            var6.printStackTrace();
            System.out.println("Char.bagSort()");
        }
    }

    public final void boxSort() {
        try {
            MyVector var1 = new MyVector();

            int var2;
            Item var3;
            for (var2 = 0; var2 < this.arrItemBox.length; ++var2) {
                if ((var3 = this.arrItemBox[var2]) != null && var3.template.isUpToUp && !var3.isExpires) {
                    var1.addElement(var3);
                }
            }

            for (var2 = 0; var2 < var1.size(); ++var2) {
                if ((var3 = (Item) var1.elementAt(var2)) != null) {
                    for (int var4 = var2 + 1; var4 < var1.size(); ++var4) {
                        Item var5;
                        if ((var5 = (Item) var1.elementAt(var4)) != null && var3.template.equals(var5.template) && var3.isLock == var5.isLock) {
                            var3.quantity += var5.quantity;
                            this.arrItemBox[var5.indexUI] = null;
                            var1.setElementAt((Object) null, var4);
                        }
                    }
                }
            }

            for (var2 = 0; var2 < this.arrItemBox.length; ++var2) {
                if (this.arrItemBox[var2] != null) {
                    for (int var7 = 0; var7 <= var2; ++var7) {
                        if (this.arrItemBox[var7] == null) {
                            this.arrItemBox[var7] = this.arrItemBox[var2];
                            this.arrItemBox[var7].indexUI = var7;
                            this.arrItemBox[var2] = null;
                            break;
                        }
                    }
                }
            }

        } catch (Exception var6) {
            var6.printStackTrace();
            System.out.println("Char.boxSort()");
        }
    }

    public final void useItem(int var1) {
        Item var2;
        int var3;
        Item var5;
        if ((var2 = this.arrItemBag[var1]).isTypeBody()) {
            var2.isLock = true;
            var2.typeUI = 5;
            var5 = this.arrItemBody[var2.template.type];
            this.arrItemBag[var1] = null;
            if (var5 != null) {
                var5.typeUI = 3;
                this.arrItemBody[var2.template.type] = null;
                var5.indexUI = var1;
                this.arrItemBag[var1] = var5;
            }

            var2.indexUI = var2.template.type;
            this.arrItemBody[var2.indexUI] = var2;

            for (var3 = 0; var3 < this.arrItemBody.length; ++var3) {
                Item var6;
                if ((var6 = this.arrItemBody[var3]) != null) {
                    if (var6.template.type == 1) {
                        this.wp = var6.template.part;
                    } else if (var6.template.type == 2) {
                        this.body = var6.template.part;
                    } else if (var6.template.type == 6) {
                        this.leg = var6.template.part;
                    }
                }
            }

        } else {
            if (var2.isTypeMounts()) {
                var2.isLock = true;
                var2.typeUI = 41;
                this.arrItemBag[var1] = null;

                for (var3 = 0; var3 < this.arrItemMounts.length; ++var3) {
                    int var4;
                    if ((var4 = var2.template.type - 29) == var3) {
                        if ((var5 = this.arrItemMounts[var4]) != null) {
                            var5.typeUI = 41;
                            this.arrItemMounts[var4] = null;
                            var5.indexUI = var1;
                            this.arrItemBag[var1] = var5;
                        }

                        var2.indexUI = var2.template.type;
                        this.arrItemMounts[var4] = var2;
                        return;
                    }
                }
            }

        }
    }

    public final Skill getSkill(SkillTemplate var1) {
        for (int var2 = 0; var2 < this.vSkill.size(); ++var2) {
            Skill var3;
            if ((var3 = (Skill) this.vSkill.elementAt(var2)).template.equals(var1)) {
                return var3;
            }
        }

        return null;
    }

    private boolean isInWaypoint() {
        int var1 = TileMap.vGo.size();

        for (byte var2 = 0; var2 < var1; ++var2) {
            Waypoint var3 = (Waypoint) TileMap.vGo.elementAt(var2);
            if (this.cx >= var3.minX && this.cx <= var3.maxX && this.cy >= var3.minY && this.cy <= var3.maxY) {
                return true;
            }
        }

        return false;
    }

    private static int getDistance(int var0, int var1) {
        return Res.abs(var0 - var1);
    }

    private void updateFramecharByhorse() {
        if (this.ID_HORSE == -1) {
            this.dynewhhorse = 0;
            this.dxnewhorse = 0;
        } else {
            DataSkillEff var1;
            if ((var1 = getPartEff(this.ID_HORSE, true)) != null && var1.isLoadData) {
                if (this.ActionHorse == null) {
                    this.ActionHorse = var1.ActionStand;
                }

                this.dynewhhorse = var1.dyHorse + var1.Dy_Char[this.getFrameHores()];
                this.dxnewhorse = var1.dxHorse + var1.Dx_Char[this.getFrameHores()];
                if (this.cdir == 1) {
                    this.dxnewhorse = -this.dxnewhorse;
                }

                if (this.statusMe != 1 && this.statusMe != 6) {
                    if (this.statusMe != 2 && this.statusMe != 10) {
                        if (this.statusMe == 4) {
                            this.ActionHorse = var1.ActionFall;
                        } else if (this.statusMe == 3) {
                            this.ActionHorse = var1.ActionJum;
                        } else {
                            this.ActionHorse = var1.ActionStand;
                        }
                    } else {
                        this.ActionHorse = var1.ActionMove;
                    }
                } else {
                    this.ActionHorse = var1.ActionStand;
                }

                if (GameCanvas.gameTick % 3 == 0) {
                    this.fho = (this.fho + 1) % this.ActionHorse.length;
                    this.FramecharRideHorse = var1.FrameChar[this.getFrameHores()];
                }

                this.cf = this.FramecharRideHorse;
            }
        }
    }

    public void update() {
        DataSkillEff var2;
        if (this.ID_NAME > -1 && (var2 = getPartEff(this.ID_NAME, false)) != null && var2.sequence != null) {
            ++this.fName;
            if (this.fName > var2.sequence.length - 1) {
                this.fName = 0;
            }

            this.FrameName = var2.sequence[this.fName];
        }

        if (this.ID_RANK > -1 && (var2 = getPartEff(this.ID_RANK, false)) != null && var2.sequence != null) {
            ++this.fRank;
            if (this.fRank > var2.sequence.length - 1) {
                this.fRank = 0;
            }

            this.FrameRank = var2.sequence[this.fRank];
        }

        if (this.ID_SUSANO > -1 && (var2 = getPartEff(this.ID_SUSANO, false)) != null && var2.sequence != null) {
            ++this.fsusan;
            if (this.fsusan > var2.sequence.length - 1) {
                this.fsusan = 0;
            }

            this.FrameSusan = var2.sequence[this.fsusan];
        }

        this.cX0 = this.cx;
        this.cY0 = this.cy;
        if (GameCanvas.gameTick % 3 == 0 && (var2 = getPartEff(this.ID_HORSE, true)) != null && var2.isLoadData) {
            this.fhorsetrangbi = (this.fhorsetrangbi + 1) % var2.ActionStand.length;
        }

        if (this.arrItemBody != null && this.arrItemBody[10] == null && this.mobMe != null) {
            this.mobMe = null;
        }

        if (this.ID_Bien_Hinh > -1) {
            this.fBienhinh = (this.fBienhinh + 1) % 10;
        }

        if (this.ID_MAT_NA > -1) {
            this.fMatNa = (this.fMatNa + 1) % 9;
        }

        if (this.ID_WEA_PONE > -1) {
            this.fWeapone = (this.fWeapone + 1) % 10;
        }

        if (this.ID_LEG > -1) {
            this.fLeg = (this.fLeg + 1) % 10;
        }

        if (this.ID_Body > -1) {
            this.fBody = (this.fBody + 1) % 10;
        }

        if (this.ID_HAIR > -1) {
            this.fHair = (this.fHair + 1) % 10;
        }

        if (this.ID_PP > -1) {
            this.fPP = (this.fPP + 1) % 10;
        }

        int var3;
        int var7;
        if (this.me && this.cHP > 0) {
            var7 = getDistance(this.cxSend, this.cx);
            var3 = getDistance(this.cySend, this.cy);
            if ((var7 > 0 || var3 > 0) && System.currentTimeMillis() - this.timeSendmove >= 250L) {
                isSendMove = true;
            }

            if (isSendMove) {
                isSendMove = false;
                Service.gI().charMove(this.cx, this.cy);
                this.timeSendmove = System.currentTimeMillis();
                this.cxSend = this.cx;
                this.cySend = this.cy;
            }
        }

        if (this.ID_HORSE <= 0) {
            this.dxnewhorse = 0;
            this.dynewhhorse = 0;
        }

        Mob var10000;
        if (this.mobVithu != null) {
            if (this.mobVithu != null) {
                this.mobVithu.owner = this;
            }

            if (this.mobVithu.getTemplate() != null && this.mobVithu.getTemplate().typeFly == 1) {
                if (Mob.getDistance(this.mobVithu.x, this.mobVithu.y, this.cx, this.cy) > Mob.arrMobTemplate[this.mobVithu.templateId].rangeMove + 100) {
                    this.mobVithu.xFirst = this.cx + (3 - GameCanvas.gameTick % 6) * 6;
                    this.mobVithu.yFirst = this.cy - 60;
                    var7 = this.mobVithu.xFirst - this.mobVithu.x;
                    var3 = this.mobVithu.yFirst - this.mobVithu.y;
                    if (var7 > 50 || var7 < -50) {
                        var10000 = this.mobVithu;
                        var10000.x += var7 / 10;
                    }

                    if (var3 > 50 || var3 < -50) {
                        var10000 = this.mobVithu;
                        var10000.y += var3 / 10;
                    }
                }

                this.mobVithu.update();
            } else {
                if (this.mobVithu.status != 3) {
                    if (this.cdir == -1) {
                        this.mobVithu.xFirst = this.cx + 20;
                        this.mobVithu.yFirst = this.cy;
                        this.mobVithu.dir = this.cdir;
                        this.mobVithu.y = this.cy - 20;
                    } else {
                        this.mobVithu.xFirst = this.cx - 20;
                        this.mobVithu.yFirst = this.cy;
                        this.mobVithu.dir = this.cdir;
                        this.mobVithu.y = this.cy - 20;
                    }

                    var7 = this.mobVithu.xFirst - this.mobVithu.x;
                    var3 = this.mobVithu.yFirst - this.mobVithu.y;
                    if (var7 <= 50 && var7 >= -50) {
                        var10000 = this.mobVithu;
                        var10000.x += var7;
                    } else {
                        var10000 = this.mobVithu;
                        var10000.x += var7 / 10;
                    }

                    if (var3 > 50 || var3 < -50) {
                        var10000 = this.mobVithu;
                        var10000.y += var3 / 10;
                    }
                }

                this.mobVithu.update();
            }
        }

        if (this.mobMe != null) {
            if (this.mobMe != null && this.mobMe.templateId >= 236) {
                if (this.mobMe != null) {
                    this.mobMe.owner = this;
                }

                if (this.mobMe.templateId == 122 || this.mobMe.templateId == 70 || this.mobMe.getTemplate() != null && this.mobMe.getTemplate().typeFly == 1) {
                    if (this.mobMe.status != 3) {
                        this.mobMe.xFirst = this.cx + (3 - GameCanvas.gameTick % 6) * 6;
                        this.mobMe.yFirst = this.cy - 60;
                    }

                    this.mobMe.update();
                } else {
                    if (this.mobMe.status != 3) {
                        if (this.cdir == -1) {
                            this.mobMe.xFirst = this.cx + 20;
                            this.mobMe.yFirst = this.cy;
                            this.mobMe.dir = this.cdir;
                            this.mobMe.y = this.cy - 20;
                        } else {
                            this.mobMe.xFirst = this.cx - 20;
                            this.mobMe.yFirst = this.cy;
                            this.mobMe.dir = this.cdir;
                            this.mobMe.y = this.cy - 20;
                        }

                        var7 = this.mobMe.xFirst - this.mobMe.x;
                        var3 = this.mobMe.yFirst - this.mobMe.y;
                        if (var7 <= 50 && var7 >= -50) {
                            var10000 = this.mobMe;
                            var10000.x += var7;
                        } else {
                            var10000 = this.mobMe;
                            var10000.x += var7 / 10;
                        }

                        if (var3 > 50 || var3 < -50) {
                            var10000 = this.mobMe;
                            var10000.y += var3 / 10;
                        }
                    }

                    this.mobMe.update();
                }
            } else if (this.mobMe.templateId != 122 && this.mobMe.templateId != 70 && (this.mobMe.getTemplate() == null || this.mobMe.getTemplate().typeFly != 1)) {
                if (this.mobMe.status != 3) {
                    if (this.cdir == -1) {
                        this.mobMe.xFirst = this.cx + 20;
                        this.mobMe.yFirst = this.cy;
                        this.mobMe.dir = this.cdir;
                        this.mobMe.y = this.cy - 20;
                    } else {
                        this.mobMe.xFirst = this.cx - 20;
                        this.mobMe.yFirst = this.cy;
                        this.mobMe.dir = this.cdir;
                        this.mobMe.y = this.cy - 20;
                    }

                    var7 = this.mobMe.xFirst - this.mobMe.x;
                    var3 = this.mobMe.yFirst - this.mobMe.y;
                    if (var7 <= 50 && var7 >= -50) {
                        var10000 = this.mobMe;
                        var10000.x += var7;
                    } else {
                        var10000 = this.mobMe;
                        var10000.x += var7 / 10;
                    }

                    if (var3 > 50 || var3 < -50) {
                        var10000 = this.mobMe;
                        var10000.y += var3 / 10;
                    }
                }

                this.mobMe.update();
            } else {
                if (this.mobMe.status != 3) {
                    this.mobMe.xFirst = this.cx + (3 - GameCanvas.gameTick % 6) * 6;
                    this.mobMe.yFirst = this.cy - 60;
                    var7 = this.mobMe.xFirst - this.mobMe.x;
                    var3 = this.mobMe.yFirst - this.mobMe.y;
                    if (var7 > 50 || var7 < -50) {
                        var10000 = this.mobMe;
                        var10000.x += var7 / 10;
                    }

                    if (var3 > 50 || var3 < -50) {
                        var10000 = this.mobMe;
                        var10000.y += var3 / 10;
                    }
                }

                this.mobMe.update();
            }
        }

        this.isEffBatTu = false;
        if (this.resultTest > 0 && GameCanvas.gameTick % 2 == 0) {
            --this.resultTest;
            if (this.resultTest == 30 || this.resultTest == 60) {
                this.resultTest = 0;
            }
        }

        if (this.myskill != null && (this.myskill.template.id == 77 || this.myskill.template.id == 73)) {
            this.updateSkillPaint();
        }

        this.updateSkillPaint();
        if (this.mobMe != null) {
            this.mobMe.update();
        }

        if (this.mobVithu != null) {
            this.mobVithu.update();
        }

        if (this.arr != null) {
            this.arr.update();
        }

        int var1;
        if (this.arrItemMounts != null && this.arrItemMounts[4] != null && this.arrItemMounts[4].options != null) {
            for (var1 = 0; var1 < this.arrItemMounts[4].options.size(); ++var1) {
                ItemOption var10;
                if ((var10 = (ItemOption) this.arrItemMounts[4].options.elementAt(var1)).optionTemplate.id == 66) {
                    this.vitaWolf = var10.param;
                }
            }
        }

        if (this.isWolf && this.vitaWolf < 500) {
            this.isWolf = false;
        }

        Domsang var9;
        Domsang var11;
        if (this.isWolf) {
            if (this.arrItemMounts[4].template.id == 443 && this.arrItemMounts[4].sys >= 2) {
                if (this.idWolfW[1] == 1737) {
                    int var20 = this.cdir;
                    boolean var10001 = true;
                    this.EffdefautY -= 5;
                }

                if (this.cdir != 1) {
                    var11 = new Domsang(this.EffdefautX - 4, this.EffdefautY, 0);
                    var9 = new Domsang(this.EffdefautX - 1, this.EffdefautY, 0);
                } else {
                    var11 = new Domsang(this.EffdefautX + 4, this.EffdefautY, 0);
                    var9 = new Domsang(this.EffdefautX + 1, this.EffdefautY, 0);
                }

                if (this.statusMe != 1 || this.statusMe != 6) {
                    this.vDomsang.addElement(var11);
                    this.vDomsang.addElement(var9);
                }
            }

            for (var1 = 0; var1 < this.vDomsang.size(); ++var1) {
                (var11 = (Domsang) this.vDomsang.elementAt(var1)).update();
                if (var11.frame >= 6) {
                    this.vDomsang.removeElementAt(var1);
                }
            }
        } else if (this.isMoto) {
            if (this.arrItemMounts[4].template.id == 524 && this.arrItemMounts[4].sys >= 2) {
                if (this.cdir != 1) {
                    var11 = new Domsang(this.EffdefautX, this.EffdefautY, 1);
                    var9 = new Domsang(this.EffdefautX1, this.EffdefautY1, 1);
                } else {
                    var11 = new Domsang(this.EffdefautX, this.EffdefautY, 1);
                    var9 = new Domsang(this.EffdefautX1, this.EffdefautY1, 1);
                }

                if ((this.statusMe == 2 || this.statusMe == 10) && GameCanvas.gameTick % 3 == 0) {
                    this.vDomsang.addElement(var11);
                    this.vDomsang.addElement(var9);
                }
            }

            for (var1 = 0; var1 < this.vDomsang.size(); ++var1) {
                (var11 = (Domsang) this.vDomsang.elementAt(var1)).update();
                if (var11.frame >= 6) {
                    this.vDomsang.removeElementAt(var1);
                }
            }
        } else {
            for (var1 = 0; var1 < this.vDomsang.size(); ++var1) {
                (var11 = (Domsang) this.vDomsang.elementAt(var1)).update();
                if (var11.frame >= 6) {
                    this.vDomsang.removeElementAt(var1);
                }
            }
        }

        Item item;
        if (this.me && isAHP && Code.auto == null && this.cHP < this.cMaxHP * aHpValue / 100 && System.currentTimeMillis() - this.lastUseHP > 5000L && this.statusMe != 14 && this.statusMe != 5 && this.cHP > 0) {
            if (this.vEff.size() == 0) {
                for (var1 = 0; var1 < this.arrItemBag.length; ++var1) {
                    if ((item = this.arrItemBag[var1]) != null && item.template.type == 16 && item.template.level == aHpValue) {
                        GameScr.gI().doUseHP();
                        this.lastUseHP = System.currentTimeMillis();
                        break;
                    }
                }
            } else {
                for (var1 = 0; var1 < this.vEff.size() && ((Effect) getMyChar().vEff.elementAt(var1)).template.type != 17; ++var1) {
                    if (var1 == this.vEff.size() - 1) {
                        GameScr.gI().doUseHP();
                        this.lastUseHP = System.currentTimeMillis();
                    }
                }
            }
        }

        if (this.me && (isAFood || Code.auto instanceof As10) && GameCanvas.gameTick % 10 == 0 && !GameScr.isPaintAuto && this.statusMe != 14 && this.statusMe != 5 && this.cHP > 0) {
            int iFoodValue = Code.auto instanceof As10 ? (this.ctaskId >= 9 ? 10 : 1) : aFoodValue;
            if (this.vEff.size() == 0) {
                for (var1 = 0; var1 < this.arrItemBag.length; ++var1) {
                    if ((item = this.arrItemBag[var1]) != null && item.template.type == 18 && item.template.level == iFoodValue) {
                        Service.gI().useItem(var1);
                        break;
                    }
                }
            } else {
                for (var1 = 0; var1 < this.vEff.size() && ((Effect) getMyChar().vEff.elementAt(var1)).template.type != 0; ++var1) {
                    if (var1 == this.vEff.size() - 1) {
                        for (var3 = 0; var3 < this.arrItemBag.length; ++var3) {
                            Item var4;
                            if ((var4 = this.arrItemBag[var3]) != null && var4.template.type == 18 && var4.template.level == iFoodValue) {
                                Service.gI().useItem(var3);
                                break;
                            }
                        }
                    }
                }
            }
        }

        Skill skill;
        if (this.me && isABuff && Code.auto == null && getMyChar().statusMe != 14 && getMyChar().statusMe != 5 && this.cHP > 0 && System.currentTimeMillis() - this.lastTimeUseSkill > 500L) {
            for (var1 = 0; var1 < this.vSkill.size(); ++var1) {
                boolean var16 = false;
                if (((skill = (Skill) this.vSkill.elementAt(var1)).template.id < 67 || skill.template.id > 72) && skill != null && skill.template.type == 2 && !skill.isCooldown()) {
                    for (int var8 = 0; var8 < this.vEff.size(); ++var8) {
                        Effect var5;
                        if ((var5 = (Effect) this.vEff.elementAt(var8)) != null && var5.template.iconId == skill.template.iconId) {
                            var16 = true;
                            break;
                        }
                    }

                    if (!var16) {
                        GameScr.gI().doUseSkill(skill, true, false);
                        Service.gI().sendUseSkillMyBuff();
                        this.saveLoadPreviousSkill();
                        this.lastTimeUseSkill = System.currentTimeMillis();
                        break;
                    }
                }
            }
        }

        if (this.me && isAMP && Code.auto == null && this.cMP < this.cMaxMP * aMpValue / 100 && GameCanvas.gameTick % 4 == 0 && this.statusMe != 14 && this.statusMe != 5 && this.cHP > 0) {
            GameScr.gI().doUseMP();
        }

        Char var12;
        if (this.me && isAResuscitate && this.nClass.classId == 6 && aCID > 0 && getMyChar().statusMe != 14 && getMyChar().statusMe != 5 && (var12 = GameScr.findCharInMap(aCID)) != null && (var12.cHP <= 0 || var12.statusMe == 14 || var12.statusMe == 5 || isAFocusDie)) {
            for (var7 = 0; var7 < this.vSkill.size(); ++var7) {
                if ((skill = (Skill) getMyChar().vSkill.elementAt(var7)) != null && skill.template.type == 4) {
                    if (Res.abs(this.cx - var12.cx) < skill.advAB() && Res.abs(this.cy - var12.cy) < skill.advAC()) {
                        getMyChar().myskill = skill;
                        GameScr.gI().doRescuedOtherChar(aCID);
                        isAFocusDie = false;
                        this.saveLoadPreviousSkill();
                    } else {
                        InfoMe.addInfo(mResources.LIVE_TEXT, 20, mFont.tahoma_7_white);
                    }
                    break;
                }
            }
        }

        if (this.cHP > 0) {
            for (var1 = 0; var1 < this.vEff.size(); ++var1) {
                Effect var17;
                if ((var17 = (Effect) this.vEff.elementAt(var1)).template.type != 0 && var17.template.type != 12) {
                    if (var17.template.type != 4 && var17.template.type != 17) {
                        if (var17.template.type == 13) {
                            if (GameCanvas.isEff1) {
                                this.cHP -= this.cMaxHP * 3 / 100;
                                if (this.cHP < 1) {
                                    this.cHP = 1;
                                }
                            }
                        } else if (var17.template.type == 7) {
                            this.isEffBatTu = true;
                        } else if (var17.template.type == 1) {
                            this.cHP = this.cHP;
                        }
                    } else if (GameCanvas.isEff1) {
                        this.cHP += var17.param;
                    }
                } else if (GameCanvas.isEff1) {
                    this.cHP += var17.param;
                    this.cMP += var17.param;
                }
            }

            if (this.isEffBatTu) {
                ++this.count;
            } else {
                this.count = 0;
            }

            if (this.eff5BuffHp > 0 && GameCanvas.isEff2) {
                this.cHP += this.eff5BuffHp;
            }

            if (this.eff5BuffMp > 0 && GameCanvas.isEff2) {
                this.cMP += this.eff5BuffMp;
            }

            if (this.cHP > this.cMaxHP) {
                this.cHP = this.cMaxHP;
            }

            if (this.cMP > this.cMaxMP) {
                this.cMP = this.cMaxMP;
            }
        }

        if (this.cmtoChar) {
            GameScr.cmtoX = this.cx - GameScr.gW2 + GameScr.gW6 * this.cdir;
            GameScr.cmtoY = this.cy - GameScr.gH23;
        }

        this.tick = (this.tick + 1) % 100;
        if (this.me) {
            if (this.charFocus != null && (this.charFocus.isNhanbanz() || !GameScr.vCharInMap.contains(this.charFocus))) {
                this.charFocus = null;
            }

            if (this.cx < 10) {
                this.cvx = 0;
                this.cx = 10;
            } else if (this.cx > TileMap.pxw - 10) {
                this.cx = TileMap.pxw - 10;
                this.cvx = 0;
            }

            if (!ischangingMap && this.isInWaypoint()) {
                isSendMove = true;
                Service.gI().requestChangeMap();
                isLockKey = true;
                ischangingMap = true;
                GameCanvas.clearKeyHold();
                GameCanvas.clearKeyPressed();
                return;
            }

            if (this.isBlinking) {
                this.isBlinking = System.currentTimeMillis() - this.timeStartBlink < 2000L;
            }

            if (this.isLockMove) {
                this.currentMovePoint = null;
            }

            if (this.currentMovePoint != null && (this.statusMe == 1 || this.statusMe == 2)) {
                this.statusMe = 2;
                if (this.cx - this.currentMovePoint.xEnd > 0) {
                    this.cdir = -1;
                    if (this.cx - this.currentMovePoint.xEnd <= 10) {
                        this.currentMovePoint = null;
                    }
                } else {
                    this.cdir = 1;
                    if (this.cx - this.currentMovePoint.xEnd >= -10) {
                        this.currentMovePoint = null;
                    }
                }

                if (this.currentMovePoint != null) {
                    this.cvx = this.getSpeed() * this.cdir;
                    this.cvy = 0;
                }
            }

            this.searchFocus();
            if (this.statusMe != 1 && this.statusMe != 6) {
                this.currMove = System.currentTimeMillis();
                this.isLastMove = true;
            } else if (System.currentTimeMillis() - this.currMove > 500L && this.isLastMove) {
                isSendMove = true;
                this.isLastMove = false;
                this.currMove = System.currentTimeMillis();
            }
        } else {
            if (GameCanvas.gameTick % 20 == 0 && this.charID >= 0) {
                for (var1 = 0; var1 < GameScr.vCharInMap.size(); ++var1) {
                    Char var18 = null;

                    try {
                        var18 = (Char) GameScr.vCharInMap.elementAt(var1);
                    } catch (Exception var6) {
                    }

                    if (var18 != null) {
                        var18.equals(this);
                    }
                }
            }

            if (this.statusMe == 1 || this.statusMe == 6) {
                boolean var15 = false;
                if (this.currentMovePoint != null) {
                    if (abs(this.currentMovePoint.xEnd - this.cx) < 4 && abs(this.currentMovePoint.yEnd - this.cy) < 4) {
                        this.cx = this.currentMovePoint.xEnd;
                        this.cy = this.currentMovePoint.yEnd;
                        this.currentMovePoint = null;
                        if ((TileMap.tileTypeAtPixel(this.cx, this.cy) & 2) == 2) {
                            this.changeStatusStand();
                            GameCanvas.gI().startDust(-1, this.cx - -8, this.cy);
                            GameCanvas.gI().startDust(1, this.cx - 8, this.cy);
                        } else {
                            this.statusMe = 4;
                            this.cvy = 0;
                        }

                        var15 = true;
                    } else if (this.cy == this.currentMovePoint.yEnd) {
                        if (this.cx != this.currentMovePoint.xEnd) {
                            this.cx = (this.cx + this.currentMovePoint.xEnd) / 2;
                            this.cf = GameCanvas.gameTick % 5 + 2;
                        }
                    } else if (this.cy < this.currentMovePoint.yEnd) {
                        this.cf = 12;
                        this.cx = (this.cx + this.currentMovePoint.xEnd) / 2;
                        if (this.cvy < 0) {
                            this.cvy = 0;
                        }

                        this.cy += this.cvy;
                        if ((TileMap.tileTypeAtPixel(this.cx, this.cy) & 2) == 2) {
                            GameCanvas.gI().startDust(-1, this.cx - -8, this.cy);
                            GameCanvas.gI().startDust(1, this.cx - 8, this.cy);
                        }

                        ++this.cvy;
                        if (this.cvy > 16) {
                            this.cy = (this.cy + this.currentMovePoint.yEnd) / 2;
                        }
                    } else {
                        this.cf = 7;
                        this.cx = (this.cx + this.currentMovePoint.xEnd) / 2;
                        this.cy = (this.cy + this.currentMovePoint.yEnd) / 2;
                    }
                } else {
                    var15 = true;
                }

                if (var15 && this.vMovePoints.size() > 0) {
                    if (this.vMovePoints.size() > 5) {
                        this.currentMovePoint = (MovePoint) this.vMovePoints.lastElement();
                        this.vMovePoints.removeElementAt(0);
                        this.cx = this.currentMovePoint.xEnd;
                        this.cy = this.currentMovePoint.yEnd;
                        this.vMovePoints.removeAllElements();
                        this.statusMe = 6;
                        this.currentMovePoint = null;
                        return;
                    }

                    this.currentMovePoint = (MovePoint) this.vMovePoints.firstElement();
                    this.vMovePoints.removeElementAt(0);
                    if (this.currentMovePoint.status == 2) {
                        this.statusMe = 2;
                        if (this.cx - this.currentMovePoint.xEnd > 0) {
                            this.cdir = -1;
                        } else if (this.cx - this.currentMovePoint.xEnd < 0) {
                            this.cdir = 1;
                        }

                        this.cvx = 5 * this.cdir;
                        this.cvy = 0;
                    } else if (this.currentMovePoint.status == 3) {
                        this.statusMe = 3;
                        GameCanvas.gI().startDust(-1, this.cx - -8, this.cy);
                        GameCanvas.gI().startDust(1, this.cx - 8, this.cy);
                        if (this.cx - this.currentMovePoint.xEnd > 0) {
                            this.cdir = -1;
                        } else if (this.cx - this.currentMovePoint.xEnd < 0) {
                            this.cdir = 1;
                        }

                        this.cvx = abs(this.cx - this.currentMovePoint.xEnd) / 9 * this.cdir;
                        this.cvy = -10;
                    } else if (this.currentMovePoint.status == 4) {
                        this.statusMe = 4;
                        if (this.cx - this.currentMovePoint.xEnd > 0) {
                            this.cdir = -1;
                        } else if (this.cx - this.currentMovePoint.xEnd < 0) {
                            this.cdir = 1;
                        }

                        this.cvx = abs(this.cx - this.currentMovePoint.xEnd) / 9 * this.cdir;
                        this.cvy = 0;
                    } else {
                        this.cx = this.currentMovePoint.xEnd;
                        this.cy = this.currentMovePoint.yEnd;
                        this.currentMovePoint = null;
                    }
                }

                if (this.statusMe == 6) {
                    if (this.cf >= 8 && this.cf <= 11) {
                        ++this.cf;
                        ++this.cp1;
                        if (this.cf > 11) {
                            this.cf = 8;
                        }

                        if (this.cp1 > 5) {
                            this.cf = 0;
                        }
                    }

                    if (this.cf <= 1) {
                        ++this.cp1;
                        if (this.cp1 > 6) {
                            this.cf = 0;
                        } else {
                            this.cf = 1;
                        }

                        if (this.cp1 > 10) {
                            this.cp1 = 0;
                        }
                    }
                }

                this.lcx = this.cx;
                this.lcy = this.cy;
                if (System.currentTimeMillis() - this.timeSummon > 7000L) {
                    if (!this.isWolf && this.isHaveWolf() && this.vitaWolf >= 500) {
                        this.isWolf = true;
                        ServerEffect.addServerEffect(60, this, 1);
                    }

                    if (this.isMoto && this.isHaveMoto()) {
                        this.isMoto = false;
                        this.isMotoBehind = true;
                    }
                }
            }
        }

        if (this.isInjure > 0) {
            this.cf = 21;
            --this.isInjure;
        } else {
            switch (this.statusMe) {
                case 1:
                    this.isBocdau = false;
                    this.timeBocdau = 0;
                    if (this.isWolf) {
                        if (this.cdir == 1) {
                            this.EffdefautX = this.cx + 21 + 4;
                            this.EffdefautY = this.cy - 15;
                        } else {
                            this.EffdefautX = this.cx - 24 - 4;
                            this.EffdefautY = this.cy - 15;
                        }
                    }

                    var12 = this;

                    for (var7 = 0; var7 < var12.vDomsang.size(); ++var7) {
                        (var9 = (Domsang) var12.vDomsang.elementAt(var7)).update();
                        if (var9.frame >= 6) {
                            var12.vDomsang.removeElementAt(var7);
                        }
                    }

                    var12.isAttack = false;
                    var12.isAttFly = false;
                    var12.cvx = 0;
                    var12.cvy = 0;
                    ++var12.cp1;
                    var12.lcx = var12.cx;
                    var12.lcy = var12.cy;
                    if (var12.cp1 > 30) {
                        var12.cp1 = 0;
                    }

                    if (var12.cp1 % 15 < 5) {
                        var12.cf = 0;
                    } else {
                        var12.cf = 1;
                    }

                    var12.updateCharInBridge();
                    if (System.currentTimeMillis() - var12.timeSummon > 7000L) {
                        if (!var12.isWolf && var12.isHaveWolf() && var12.vitaWolf >= 500) {
                            var12.isWolf = true;
                            ServerEffect.addServerEffect(60, var12, 1);
                        }

                        if (var12.isMoto && var12.isHaveMoto()) {
                            var12.isMoto = false;
                            var12.isMotoBehind = true;
                        }
                    }
                    break;
                case 2:
                    if (this.isMoto) {
                        ++this.timeBocdau;
                        if (this.arrItemMounts[4].template.id == 485 && this.arrItemMounts[4].sys >= 4) {
                            this.isBocdau = true;
                        }

                        if (this.timeBocdau > 20) {
                            this.isBocdau = false;
                        }
                    }

                    if (this.isWolf) {
                        if (this.cdir == 1) {
                            if (this.idWolfW[this.tickWolf] == 1737) {
                                this.EffdefautX = this.cx + 21 + 4;
                                this.EffdefautY = this.cy - 19;
                            } else {
                                this.EffdefautX = this.cx + 21 + 4;
                                this.EffdefautY = this.cy - 16;
                            }
                        } else if (this.idWolfW[this.tickWolf] == 1737) {
                            this.EffdefautX = this.cx - 24 - 4;
                            this.EffdefautY = this.cy - 19;
                        } else {
                            this.EffdefautX = this.cx - 24 - 4;
                            this.EffdefautY = this.cy - 16;
                        }
                    } else if (this.isMoto) {
                        if (this.cdir == 1) {
                            this.EffdefautX = this.cx + 15;
                            this.EffdefautX1 = this.cx - 25;
                            this.EffdefautY = this.cy;
                            this.EffdefautY1 = this.cy;
                        } else {
                            this.EffdefautX = this.cx - 18;
                            this.EffdefautX1 = this.cx + 25;
                            this.EffdefautY = this.cy;
                            this.EffdefautY1 = this.cy;
                        }
                    }

                    var7 = 0;
                    if (!this.me && this.currentMovePoint != null) {
                        var7 = abs(this.cx - this.currentMovePoint.xEnd);
                    }

                    ++this.cp1;
                    if (this.cp1 >= 10) {
                        this.cp1 = 0;
                        this.cBonusSpeed = 0;
                    }

                    this.cf = (this.cp1 >> 1) + 2;
                    if ((TileMap.tileTypeAtPixel(this.cx, this.cy - 1) & 64) == 64) {
                        this.cx += this.cvx >> 1;
                    } else {
                        this.cx += this.cvx;
                    }

                    if (this.cdir == 1) {
                        if (GameScr.auto != 1) {
                            if (TileMap.tileTypeAt(this.cx + this.chw, this.cy - this.chh, 4)) {
                                if (this.me) {
                                    this.cvx = 0;
                                    this.cx = TileMap.tileXofPixel(this.cx + this.chw) - this.chw;
                                } else {
                                    this.stop();
                                }
                            }
                        } else if (TileMap.tileTypeAt(this.cx + this.chw, this.cy - this.chh, 4)) {
                            if (this.me) {
                                this.statusMe = 3;
                                if (this.statusMe == 3) {
                                    this.cvy -= 10;
                                }
                            } else {
                                this.stop();
                            }
                        }
                    } else if (GameScr.auto != 1) {
                        if (TileMap.tileTypeAt(this.cx - this.chw - 1, this.cy - this.chh, 8)) {
                            if (this.me) {
                                this.cvx = 0;
                                this.cx = TileMap.tileXofPixel(this.cx - this.chw - 1) + TileMap.size + this.chw;
                            } else {
                                this.stop();
                            }
                        }
                    } else if (TileMap.tileTypeAt(this.cx - this.chw - 1, this.cy - this.chh, 8)) {
                        if (this.me) {
                            this.statusMe = 3;
                            if (this.statusMe == 3) {
                                this.cvy -= 10;
                            }
                        } else {
                            this.stop();
                        }
                    }

                    if (!this.isNewMount && this.isHaveNewMount()) {
                        this.isNewMount = true;
                        this.isMotoBehind = false;
                    }

                    if (!this.isMoto && this.isHaveMoto()) {
                        this.isMoto = true;
                        this.isMotoBehind = false;
                    }

                    if (!this.isWolf && this.isHaveWolf() && this.vitaWolf >= 500) {
                        this.dx0 = Res.abs(this.cx - this.lcx);
                        this.dy0 = Res.abs(this.cy - this.lcy);
                        this.dx0 = this.dx0 > this.dy0 ? this.dx0 : this.dy0;
                        if (this.me && this.dx0 > 150 || !this.me && this.dx0 > 40) {
                            this.isWolf = true;
                            ServerEffect.addServerEffect(60, this, 1);
                        }

                        this.dx0 = this.dy0 = 0;
                    }

                    if (this.me) {
                        if (this.cvx > 0) {
                            --this.cvx;
                        } else if (this.cvx < 0) {
                            ++this.cvx;
                        } else {
                            this.changeStatusStand();
                            this.cBonusSpeed = 0;
                        }
                    }

                    if ((TileMap.tileTypeAtPixel(this.cx, this.cy) & 2) != 2) {
                        if (this.me) {
                            if ((this.cx - this.cxSend != 0 || this.cy - this.cySend != 0) && this.me) {
                                this.cf = 7;
                                this.statusMe = 4;
                                this.cvx = 3 * this.cdir;
                                this.cp2 = 0;
                            }
                        } else {
                            this.stop();
                        }
                    }

                    if (!this.me && this.currentMovePoint != null && abs(this.cx - this.currentMovePoint.xEnd) > var7) {
                        this.stop();
                    }

                    if (!this.isMoto && !this.isNewMount) {
                        GameCanvas.gI().startDust(this.cdir, this.cx - (this.cdir << 3), this.cy);
                    } else if (GameCanvas.gameTick % 5 == 0) {
                        ServerEffect.addServerEffect(120, this.cx - (this.cdir << 5), this.cy, 0, (byte) this.cdir);
                    }

                    this.updateCharInBridge();
                    int var19 = this.cx - (this.cdir << 4);
                    var3 = this.cy;
                    var7 = var19;
                    if (this.isWolf && this.arrItemMounts[4].sys >= 4 && this.getSys() > 0 && GameCanvas.gameTick % 8 == 0) {
                        if (this.getSys() == 1) {
                            ServerEffect.addServerEffect(116, var7, var3, 2);
                        } else if (this.getSys() == 2) {
                            ServerEffect.addServerEffect(117, var7, var3, 2);
                        } else if (this.getSys() == 3) {
                            ServerEffect.addServerEffect(118, var7, var3, 2);
                        }
                    }
                    break;
                case 3:
                    this.isBocdau = false;
                    this.timeBocdau = 0;
                    if (this.isWolf) {
                        if (this.cdir == 1) {
                            this.EffdefautX = this.cx + 21 + 4;
                            this.EffdefautY = this.cy - 30;
                        } else {
                            this.EffdefautX = this.cx - 23 - 4;
                            this.EffdefautY = this.cy - 30;
                        }
                    }

                    this.updateCharJump();
                    break;
                case 4:
                    this.isBocdau = false;
                    this.timeBocdau = 0;
                    if (this.isWolf) {
                        if (this.cdir == 1) {
                            this.EffdefautX = this.cx + 21 + 4;
                            this.EffdefautY = this.cy - 19;
                        } else {
                            this.EffdefautX = this.cx - 24;
                            this.EffdefautY = this.cy - 20;
                        }
                    }

                    this.updateCharFall();
                    break;
                case 5:
                    this.isBocdau = false;
                    this.timeBocdau = 0;
                    this.updateCharDeadFly();
                    break;
                case 6:
                    this.isBocdau = false;
                    this.timeBocdau = 0;
                    if (this.cf == 21 && this.isInjure <= 0) {
                        this.cf = 0;
                    }
                case 7:
                case 8:
                default:
                    break;
                case 9:
                    this.isBocdau = false;
                    this.timeBocdau = 0;
                    this.updateCharAutoJump();
                    break;
                case 10:
                    this.isBocdau = false;
                    this.timeBocdau = 0;
                    this.updateCharWaterRun();
                    break;
                case 11:
                    this.isBocdau = false;
                    this.timeBocdau = 0;
                    this.updateCharWaterDown();
                    break;
                case 12:
                    this.isBocdau = false;
                    this.timeBocdau = 0;
                    this.updateSkillStand();
                    break;
                case 13:
                    this.isBocdau = false;
                    this.timeBocdau = 0;
                    break;
                case 14:
                    this.isBocdau = false;
                    this.timeBocdau = 0;
            }
        }

        if (this.wdx != 0 || this.wdy != 0) {
            this.startDie(this.wdx, this.wdy);
            this.wdx = 0;
            this.wdy = 0;
        }

        if (this.moveFast != null) {
            if (this.moveFast[0] == 0) {
                ++this.moveFast[0];
                ServerEffect.addServerEffect(60, this, 1);
            } else if (this.moveFast[0] < 10) {
                ++this.moveFast[0];
            } else {
                this.cx = this.moveFast[1];
                this.cy = this.moveFast[2];
                this.moveFast = null;
                ServerEffect.addServerEffect(60, this, 1);
                if (this.me) {
                    if ((TileMap.tileTypeAtPixel(this.cx, this.cy) & 2) != 2) {
                        this.statusMe = 4;
                        getMyChar().setAutoSkillPaint(GameScr.sks[38], 1);
                    } else {
                        getMyChar().setAutoSkillPaint(GameScr.sks[38], 0);
                    }
                }
            }
        }

        if (!this.me && this.vMovePoints.size() == 0 && this.cxMoveLast != 0 && this.cyMoveLast != 0 && this.currentMovePoint == null) {
            if (this.cxMoveLast != this.cx) {
                this.cx = this.cxMoveLast;
            }

            if (this.cyMoveLast != this.cy) {
                this.cy = this.cyMoveLast;
            }

            if (this.cHP > 0) {
                this.statusMe = 6;
            }
        }

        ++this.tickEffWolf;
        if (this.tickEffWolf > 5) {
            this.tickEffWolf = 0;
        }

        this.fixMove();
        this.updateDataEff((byte) 0, this.statusMe);
        if (this.ID_HORSE > 0) {
            this.isNewMount = false;
            this.isMoto = false;
            this.isWolf = false;
        }

        this.updNewMount();
        this.updateFramecharByhorse();
    }

    private void fixMove() {
        if (!this.me) {
            if (this.cf == 12 && this.cX0 == this.cx && this.cY0 == this.cy) {
                ++this.inAir;
            } else if (this.cf == 0 && (TileMap.tileTypeAtPixel(this.cx, this.cy) & 2) != 2) {
                ++this.inAir;
            } else {
                this.inAir = 0;
            }

            if (this.inAir > 1) {
                for (int var1 = this.cy; var1 < this.cy + 150; var1 += 24) {
                    if ((TileMap.tileTypeAtPixel(this.cx, var1) & 2) != 2) {
                        if ((var1 = TileMap.tileYofPixel(var1) + 24) - this.cy > 24) {
                            this.cy += (var1 - this.cy) / 2;
                            if (!this.isMoto && !this.isWolf && !this.isNewMount) {
                                this.cf = 12;
                            }

                            this.vMovePoints.removeAllElements();
                            this.currentMovePoint = null;
                        } else {
                            this.statusMe = 1;
                            this.vMovePoints.removeAllElements();
                            this.currentMovePoint = null;
                            this.cvx = 0;
                            this.cvy = 0;
                            this.cp1 = 0;
                            this.cp2 = 0;
                            this.cp3 = 0;
                            this.inAir = 0;
                            this.cxMoveLast = 0;
                            this.cyMoveLast = 0;
                            this.cy = var1;
                        }

                        this.lcy = this.cy;
                        return;
                    }
                }
            }
        }

    }

    private void updateSkillPaint() {
        if (this.statusMe != 14 && this.statusMe != 5) {
            if (this.skillPaint != null && this.mobFocus != null && this.mobFocus.status == 0) {
                if (!this.me) {
                    if ((TileMap.tileTypeAtPixel(this.cx, this.cy) & 2) == 2) {
                        this.changeStatusStand();
                    } else {
                        this.statusMe = 6;
                    }
                }

                this.indexSkill = 0;
                this.skillPaint = null;
                this.eff0 = this.eff1 = this.eff2 = null;
                this.i0 = this.i1 = this.i2 = 0;
                this.mobFocus = null;
                this.effPaints = null;
                this.arr = null;
            }

            if (this.skillPaint != null && this.arr == null && this.indexSkill >= this.skillInfoPaint1().length) {
                if (!this.me) {
                    if ((TileMap.tileTypeAtPixel(this.cx, this.cy) & 2) == 2) {
                        this.changeStatusStand();
                    } else {
                        this.statusMe = 6;
                    }
                }

                this.indexSkill = 0;
                this.skillPaint = null;
                this.eff0 = this.eff1 = this.eff2 = null;
                this.i0 = this.i1 = this.i2 = 0;
                this.arr = null;
            }

            SkillInfoPaint[] var1;
            if ((var1 = this.skillInfoPaint1()) != null) {
                if (this.me && this.myskill.template.type == 2) {
                    if (this.indexSkill == var1.length - var1.length / 3) {
                        Service.gI().sendUseSkillMyBuff();
                        this.saveLoadPreviousSkill();
                        return;
                    }
                } else if ((this.mobFocus != null || !this.me && this.charFocus != null || this.me && this.charFocus != null && this.isMeCanAttackOtherPlayer(this.charFocus)) && this.arr == null && this.indexSkill == var1.length - var1.length / 3) {
                    this.setAttack();
                    if (this.me) {
                        this.saveLoadPreviousSkill();
                    }
                }
            }

        }
    }

    public final void saveLoadPreviousSkill() {
        if (System.currentTimeMillis() - this.timeLastCheck > 500L) {
            if (this.myskill.template.type != 1 && this.lastNormalSkill != null) {
                this.myskill = this.lastNormalSkill;
                Service.gI().selectSkill(this.myskill.template.id);
            }

            if (this.currentFireByShortcut) {
                if (this.lastNormalSkill != null) {
                    this.myskill = this.lastNormalSkill;
                    Service.gI().selectSkill(this.myskill.template.id);
                }
            } else if (GameScr.auto != 1) {
                this.lastNormalSkill = this.myskill;
            }

            this.timeLastCheck = System.currentTimeMillis();
        }

    }

    private void updateCharDeadFly() {
        ++this.cp1;
        this.cx += (this.cp2 - this.cx) / 4;
        if (this.cp1 > 7) {
            this.cy += (this.cp3 - this.cy) / 4;
        } else {
            this.cy += this.cp1 - 10;
        }

        if (Res.abs(this.cp2 - this.cx) < 4 && Res.abs(this.cp3 - this.cy) < 10) {
            this.cx = this.cp2;
            this.cy = this.cp3;
            this.statusMe = 14;
            this.callEff(60);
            if (this.me) {
                GameScr.gI().resetButton();
            }
        }

        this.cf = 21;
    }

    private void updateSkillStand() {
        ++this.cp1;
        if (this.cdir == 1) {
            if ((TileMap.tileTypeAtPixel(this.cx + this.chw, this.cy - this.chh) & 4) == 4) {
                this.cvx = 0;
            }
        } else if ((TileMap.tileTypeAtPixel(this.cx - this.chw, this.cy - this.chh) & 8) == 8) {
            this.cvx = 0;
        }

        if (this.cy > this.ch && TileMap.tileTypeAt(this.cx, this.cy - this.ch, 8192)) {
            if (!TileMap.tileTypeAt(this.cx, this.cy, 2)) {
                this.statusMe = 4;
                this.cp1 = 0;
                this.cp2 = 0;
                this.cvy = 1;
            } else {
                this.cy = TileMap.tileYofPixel(this.cy);
            }
        }

        this.cx += this.cvx;
        this.cy += this.cvy;
        if (this.cy < 0) {
            this.cy = this.cvy = 0;
        }

        if (this.cvy == 0) {
            if ((TileMap.tileTypeAtPixel(this.cx, this.cy) & 2) != 2) {
                this.statusMe = 4;
                this.cvx = (this.getSpeed() >> 1) * this.cdir;
                this.cp1 = this.cp2 = 0;
            }
        } else if (this.cvy < 0) {
            ++this.cvy;
            if (this.cvy == 0) {
                this.cvy = 1;
            }
        } else {
            if (this.cvy < 20 && this.cp1 % 5 == 0) {
                ++this.cvy;
            }

            if (this.cvy > 3) {
                this.cvy = 3;
            }

            if ((TileMap.tileTypeAtPixel(this.cx, this.cy + 3) & 2) == 2 && this.cy <= TileMap.tileXofPixel(this.cy + 3)) {
                this.cvx = this.cvy = 0;
                this.cy = TileMap.tileXofPixel(this.cy + 3);
            }

            if (TileMap.tileTypeAt(this.cx, this.cy, 64) && this.cy % TileMap.size > 8) {
                this.statusMe = 10;
                this.cvx = this.cdir << 1;
                this.cvy >>= 2;
                this.cy = TileMap.tileYofPixel(this.cy) + 12;
                this.statusMe = 11;
                return;
            }

            if (TileMap.tileTypeAt(this.cx, this.cy, 2048)) {
                this.statusMe = 11;
                return;
            }
        }

        if (this.cvx > 0) {
            --this.cvx;
        } else {
            if (this.cvx < 0) {
                ++this.cvx;
            }

        }
    }

    private void updateCharAutoJump() {
        this.cx += this.cvx * this.cdir;
        this.cy += this.cvyJump;
        ++this.cvyJump;
        if (this.cp1 == 0) {
            this.cf = 7;
        } else {
            this.cf = 23;
        }

        if (this.canJumpHigh) {
            if (this.cvyJump == -3) {
                this.cf = 8;
            } else if (this.cvyJump == -2) {
                this.cf = 9;
            } else if (this.cvyJump == -1) {
                this.cf = 10;
            } else if (this.cvyJump == 0) {
                this.cf = 11;
            }
        }

        if (this.cvyJump == 0) {
            this.statusMe = 6;
            ((MovePoint) this.vMovePoints.firstElement()).status = 4;
            this.cp1 = 0;
            this.cvy = 1;
        }

    }

    private void stop() {
        this.statusMe = 6;
        this.cvx = 0;
        this.cvy = 0;
        this.cp1 = this.cp2 = 0;
    }

    private static int abs(int var0) {
        return var0 > 0 ? var0 : -var0;
    }

    private void updateCharJump() {
        if (GameScr.auto == 1) {
            if (this.cdir == 1) {
                this.cvx = 5;
            } else {
                this.cvx = -5;
            }
        }

        if (this.isHaveNewMount()) {
            this.isNewMount = true;
            this.isMotoBehind = false;
        }

        if (this.isHaveMoto()) {
            this.isMoto = true;
            this.isMotoBehind = false;
        }

        this.cx += this.cvx;
        this.cy += this.cvy;
        if (this.cy < 0) {
            this.cy = 0;
            this.cvy = -1;
        }

        ++this.cvy;
        if (!this.me && this.currentMovePoint != null) {
            label113:
            {
                int var1;
                if ((var1 = this.currentMovePoint.xEnd - this.cx) > 0) {
                    if (this.cvx > var1) {
                        this.cvx = var1;
                    }

                    if (this.cvx >= 0) {
                        break label113;
                    }
                } else if (var1 < 0) {
                    if (this.cvx < var1) {
                        this.cvx = var1;
                    }

                    if (this.cvx <= 0) {
                        break label113;
                    }
                }

                this.cvx = var1;
            }
        }

        if (this.cp1 == 0) {
            this.cf = 7;
        } else {
            this.cf = 23;
        }

        if (this.canJumpHigh) {
            if (this.cvy == -3) {
                this.cf = 8;
            } else if (this.cvy == -2) {
                this.cf = 9;
            } else if (this.cvy == -1) {
                this.cf = 10;
            } else if (this.cvy == 0) {
                this.cf = 11;
            }
        }

        if (this.cdir == 1) {
            if ((TileMap.tileTypeAtPixel(this.cx + this.chw, this.cy - 1) & 4) == 4 && this.cx <= TileMap.tileXofPixel(this.cx + this.chw) + 12) {
                this.cx = TileMap.tileXofPixel(this.cx + this.chw) - this.chw;
                this.cvx = 0;
            }
        } else if ((TileMap.tileTypeAtPixel(this.cx - this.chw, this.cy - 1) & 8) == 8 && this.cx >= TileMap.tileXofPixel(this.cx - this.chw) + 12) {
            this.cx = TileMap.tileXofPixel(this.cx + 24 - this.chw) + this.chw;
            this.cvx = 0;
        }

        if (this.cvy == 0) {
            if (this.me) {
                this.cyStartFall = this.cy;
                this.statusMe = 4;
                this.cp1 = 0;
                if (this.canJumpHigh) {
                    this.cp2 = 1;
                } else {
                    this.cp2 = 0;
                }

                this.cvy = 1;
            } else {
                this.stop();
            }
        }

        if (this.me && !ischangingMap && this.isInWaypoint()) {
            ischangingMap = true;
            isSendMove = true;
            Service.gI().requestChangeMap();
            isLockKey = true;
            GameCanvas.clearKeyHold();
            GameCanvas.clearKeyPressed();
        } else {
            if (this.cp3 < 0) {
                ++this.cp3;
            }

            if (this.cy > this.ch && TileMap.tileTypeAt(this.cx, this.cy - this.ch, 8192)) {
                if (this.me) {
                    this.statusMe = 4;
                    this.cp1 = 0;
                    this.cp2 = 0;
                    this.cvy = 1;
                } else {
                    this.stop();
                }
            }

            if (!this.me && this.currentMovePoint != null && this.cy < this.currentMovePoint.yEnd) {
                this.stop();
            }

        }
    }

    private void updateCharFall() {
        if (this.cy + 4 >= TileMap.pxh) {
            this.changeStatusStand();
            this.cvx = this.cvy = 0;
        } else {
            if (this.cy % 24 == 0 && (TileMap.tileTypeAtPixel(this.cx, this.cy) & 2) == 2) {
                if (this.me) {
                    this.cvx = this.cvy = 0;
                    this.cp1 = this.cp2 = 0;
                    this.changeStatusStand();
                    return;
                }

                this.stop();
                this.cf = 0;
                GameCanvas.gI().startDust(-1, this.cx - -8, this.cy);
                GameCanvas.gI().startDust(1, this.cx - 8, this.cy);
            }

            this.cf = 12;
            this.cx += this.cvx;
            if (!this.me && this.currentMovePoint != null) {
                label106:
                {
                    int var1;
                    if ((var1 = this.currentMovePoint.xEnd - this.cx) > 0) {
                        if (this.cvx > var1) {
                            this.cvx = var1;
                        }

                        if (this.cvx >= 0) {
                            break label106;
                        }
                    } else if (var1 < 0) {
                        if (this.cvx < var1) {
                            this.cvx = var1;
                        }

                        if (this.cvx <= 0) {
                            break label106;
                        }
                    }

                    this.cvx = var1;
                }
            }

            this.cy += this.cvy;
            if (this.cvy < 20) {
                ++this.cvy;
            }

            if (this.cdir == 1) {
                if ((TileMap.tileTypeAtPixel(this.cx + this.chw, this.cy - 1) & 4) == 4 && this.cx <= TileMap.tileXofPixel(this.cx + this.chw) + 12) {
                    this.cx = TileMap.tileXofPixel(this.cx + this.chw) - this.chw;
                    this.cvx = 0;
                }
            } else if ((TileMap.tileTypeAtPixel(this.cx - this.chw, this.cy - 1) & 8) == 8 && this.cx >= TileMap.tileXofPixel(this.cx - this.chw) + 12) {
                this.cx = TileMap.tileXofPixel(this.cx + 24 - this.chw) + this.chw;
                this.cvx = 0;
            }

            if (this.cvy > 4 && (this.cyStartFall == 0 || this.cyStartFall <= TileMap.tileYofPixel(this.cy + 3)) && (TileMap.tileTypeAtPixel(this.cx, this.cy + 3) & 2) == 2) {
                if (this.me) {
                    this.cyStartFall = 0;
                    this.cvx = this.cvy = 0;
                    this.cp1 = this.cp2 = 0;
                    this.cy = TileMap.tileXofPixel(this.cy + 3);
                    this.changeStatusStand();
                    GameCanvas.gI().startDust(-1, this.cx - -8, this.cy);
                    GameCanvas.gI().startDust(1, this.cx - 8, this.cy);
                } else {
                    this.stop();
                    this.cy = TileMap.tileXofPixel(this.cy + 3);
                    this.cf = 0;
                    GameCanvas.gI().startDust(-1, this.cx - -8, this.cy);
                    GameCanvas.gI().startDust(1, this.cx - 8, this.cy);
                }
            } else {
                if (this.cp2 == 1) {
                    if (this.cvy == 3) {
                        this.cf = 11;
                    } else if (this.cvy == 2) {
                        this.cf = 8;
                    } else if (this.cvy == 1) {
                        this.cf = 9;
                    } else if (this.cvy == 0) {
                        this.cf = 10;
                    }
                } else {
                    this.cf = 12;
                }

                if (this.cvy > 6 && TileMap.tileTypeAt(this.cx, this.cy, 64) && this.cy % TileMap.size > 8) {
                    this.cy = TileMap.tileYofPixel(this.cy) + 8;
                    this.statusMe = 10;
                    this.cvx = this.cdir << 1;
                    this.cvy >>= 2;
                    this.cy = TileMap.tileYofPixel(this.cy) + 12;
                }

                if (!this.me) {
                    if ((TileMap.tileTypeAtPixel(this.cx, this.cy + 1) & 2) == 2) {
                        this.cf = 0;
                    }

                    if (this.currentMovePoint != null && this.cy > this.currentMovePoint.yEnd) {
                        this.stop();
                    }
                }

            }
        }
    }

    private void updateCharWaterRun() {
        if (!TileMap.tileTypeAt(this.cx, this.cy, 64)) {
            this.statusMe = 4;
        }

        ++this.cp1;
        if (this.cp1 >= 5) {
            this.cp1 = 0;
            this.cBonusSpeed = 0;
        }

        this.cf = this.cp1 + 2;
        if (this.cdir == 1) {
            if (TileMap.tileTypeAt(this.cx + this.chw, this.cy - 1, 4)) {
                this.cvx = 0;
                this.cx = TileMap.tileXofPixel(this.cx + this.chw) - this.chw;
            }
        } else if (TileMap.tileTypeAt(this.cx - this.chw - 1, this.cy - 1, 8)) {
            this.cvx = 0;
            this.cx = TileMap.tileXofPixel(this.cx - this.chw - 1) + TileMap.size + this.chw;
        }

        this.cx += this.cvx;
        if (this.cvx > 0) {
            --this.cvx;
        } else if (this.cvx < 0) {
            ++this.cvx;
        } else if (this.cx - this.cxSend != 0) {
            if (this.me && System.currentTimeMillis() - (this.timelastSendmove + (long) delaySendmove) >= 0L) {
                isSendMove = true;
            }

            this.statusMe = 11;
            this.cBonusSpeed = 0;
        }

        GameCanvas.gI();
        GameCanvas.startWaterSplash(this.cx, this.cy);
        GameCanvas.gI().startDust(this.cdir, this.cx - (this.cdir << 3), this.cy);
    }

    private void updateCharWaterDown() {
        this.cy += this.cvy;
        if (this.cvy < 20 && GameCanvas.gameTick % 2 == 0) {
            ++this.cvy;
        }

        this.cf = 7;
        if (this.cy >= TileMap.pxh) {
            this.cHP = 0;
            this.statusMe = 5;
        } else if (TileMap.tileTypeAt(this.cx, this.cy, 2)) {
            this.changeStatusStand();
            this.cvx = this.cvy = 0;
            this.cp1 = this.cp2 = 0;
            this.cy = TileMap.tileXofPixel(this.cy);
        } else {
            if (TileMap.tileTypeAt(this.cx, this.cy, 2048)) {
                this.cHP = 0;
                this.statusMe = 5;
            }

        }
    }

    public final void setDefaultPart() {
        this.wp = 15;
        this.setDefaultBody();
        this.setDefaultLeg();
    }

    public final void setDefaultWeapon() {
        this.wp = 15;
    }

    public static Part getDefaultHead(int var0) {
        try {
            return var0 == 0 ? GameScr.parts[27] : GameScr.parts[2];
        } catch (Exception var1) {
            return null;
        }
    }

    public final void setDefaultBody() {
        if (this.cgender == 0) {
            this.body = 10;
        } else {
            this.body = 1;
        }
    }

    public final void setDefaultLeg() {
        if (this.cgender == 0) {
            this.leg = 9;
        } else {
            this.leg = 0;
        }
    }

    public final void setSkillPaint(SkillPaint var1, int var2) {
        long var3 = System.currentTimeMillis();
        if (this.me) {
            if (var3 - this.myskill.lastTimeUseThisSkill < (long) this.myskill.coolDown) {
                this.myskill.paintCanNotUseSkill = true;
                return;
            }

            this.myskill.lastTimeUseThisSkill = var3;
            this.cMP -= this.myskill.manaUse;
            if (this.cMP < 0) {
                this.cMP = 0;
            }
        }

        this.setAutoSkillPaint(var1, var2);
    }

    public void setAutoSkillPaint(SkillPaint var1, int var2) {
        this.skillPaint = var1;
        this.sType = var2;
        this.indexSkill = 0;
        this.i0 = this.i1 = this.i2 = this.dx0 = this.dx1 = this.dx2 = this.dy0 = this.dy1 = this.dy2 = 0;
        this.eff0 = null;
        this.eff1 = null;
        this.eff2 = null;
    }

    private SkillInfoPaint[] skillInfoPaint1() {
        if (this.skillPaint == null) {
            return null;
        } else {
            return this.sType == 0 ? this.skillPaint.skillStand : this.skillPaint.skillfly;
        }
    }

    public final void setAttack() {
        try {
            int var1;
            if (this.me) {
                if (this.myskill.template.type == 2) {
                    return;
                }

                if (this.myskill.template.id == 42 && !this.myskill.isCooldown()) {
                    this.isBlinking = true;
                    this.timeStartBlink = System.currentTimeMillis();
                }

                if (this.skillPaint != null && (this.mobFocus != null || this.charFocus != null && this.isMeCanAttackOtherPlayer(this.charFocus))) {
                    if (Code.auto != null) {
                        Auto.advAA(this.skillPaint);
                        return;
                    }
                    this.isUseLongRangeWeapon();
                    var1 = this.myskill.advAB();
                    int var2 = this.myskill.advAC();
                    MyVector var3 = new MyVector();
                    MyVector var4 = new MyVector();
                    int var5;
                    Mob var6;
                    Char var11;
                    if (this.charFocus != null) {
                        var4.addElement(this.charFocus);

                        for (var5 = 0; var5 < GameScr.vCharInMap.size() && var3.size() + var4.size() < this.myskill.advAD(); ++var5) {
                            if ((var11 = (Char) GameScr.vCharInMap.elementAt(var5)).statusMe != 14 && var11.statusMe != 5 && var11.statusMe != 15 && !var11.isInvisible && !var11.equals(this.charFocus) && this.isMeCanAttackOtherPlayer(var11) && this.charFocus.cx - var1 <= var11.cx && var11.cx <= this.charFocus.cx + var1 && this.charFocus.cy - var2 <= var11.cy && var11.cy <= this.charFocus.cy + var2 && (this.cdir == -1 && var11.cx <= this.cx || this.cdir == 1 && var11.cx >= this.cx)) {
                                var4.addElement(var11);
                            }
                        }

                        for (var5 = 0; var5 < GameScr.vMob.size() && var3.size() + var4.size() < this.myskill.advAD(); ++var5) {
                            if ((var6 = (Mob) GameScr.vMob.elementAt(var5)).status != 1 && var6.status != 0 && this.charFocus.cx - var1 <= var6.x && var6.x <= this.charFocus.cx + var1 && this.charFocus.cy - var2 <= var6.y && var6.y <= this.charFocus.cy + var2 && (this.cdir == -1 && var6.x <= this.cx || this.cdir == 1 && var6.x >= this.cx)) {
                                var3.addElement(var6);
                            }
                        }
                    } else if (this.mobFocus != null && this.mobFocus.status != 1 && this.mobFocus.status != 0) {
                        var3.addElement(this.mobFocus);

                        for (var5 = 0; var5 < GameScr.vMob.size() && var3.size() + var4.size() < this.myskill.advAD(); ++var5) {
                            if ((var6 = (Mob) GameScr.vMob.elementAt(var5)).status != 1 && var6.status != 0 && !var6.equals(this.mobFocus) && this.mobFocus.x - 100 <= var6.x && var6.x <= this.mobFocus.x + 100 && this.mobFocus.y - 50 <= var6.y && var6.y <= this.mobFocus.y + 50) {
                                var3.addElement(var6);
                            }
                        }

                        for (var5 = 0; var5 < GameScr.vCharInMap.size() && var3.size() + var4.size() < this.myskill.advAD(); ++var5) {
                            if ((var11 = (Char) GameScr.vCharInMap.elementAt(var5)).statusMe != 14 && var11.statusMe != 5 && var11.statusMe != 15 && !var11.isInvisible && (this.cTypePk >= 4 && this.cTypePk <= 6 && var11.cTypePk >= 4 && var11.cTypePk <= 6 && this.cTypePk != var11.cTypePk || var11.cTypePk == 3 || this.cTypePk == 3 || var11.cTypePk == 1 && this.cTypePk == 1 || this.testCharId >= 0 && this.testCharId == var11.charID || this.killCharId >= 0 && this.killCharId == var11.charID) && this.mobFocus.x - var1 <= var11.cx && var11.cx <= this.mobFocus.x + var1 && this.mobFocus.y - var2 <= var11.cy && var11.cy <= this.mobFocus.y + var2 && (this.cdir == -1 && var11.cx <= this.cx || this.cdir == 1 && var11.cx >= this.cx)) {
                                var4.addElement(var11);
                            }
                        }
                    }

                    this.effPaints = new EffectPaint[var3.size() + var4.size()];

                    for (var5 = 0; var5 < var3.size(); ++var5) {
                        this.effPaints[var5] = new EffectPaint();
                        this.effPaints[var5].effCharPaint = GameScr.efs[this.skillPaint.id - 1];
                        this.effPaints[var5].eMob = (Mob) var3.elementAt(var5);
                    }

                    for (var5 = 0; var5 < var4.size(); ++var5) {
                        this.effPaints[var5 + var3.size()] = new EffectPaint();
                        this.effPaints[var5 + var3.size()].effCharPaint = GameScr.efs[this.skillPaint.id - 1];
                        this.effPaints[var5 + var3.size()].eChar = (Char) var4.elementAt(var5);
                    }

                    if (this.effPaints.length > 1) {
                        EPosition var13 = new EPosition();
                        if (this.effPaints[0].eMob != null) {
                            var13 = new EPosition(this.effPaints[0].eMob.x, this.effPaints[0].eMob.y);
                        } else if (this.effPaints[0].eChar != null) {
                            var13 = new EPosition(this.effPaints[0].eChar.cx, this.effPaints[0].eChar.cy);
                        }

                        MyVector var12 = new MyVector();

                        for (var1 = 1; var1 < this.effPaints.length; ++var1) {
                            if (this.effPaints[var1].eMob != null) {
                                var12.addElement(new EPosition(this.effPaints[var1].eMob.x, this.effPaints[var1].eMob.y));
                            } else if (this.effPaints[var1].eChar != null) {
                                var12.addElement(new EPosition(this.effPaints[var1].eChar.cx, this.effPaints[var1].eChar.cy));
                            }

                            if (var1 > 5) {
                                break;
                            }
                        }

                        Lightning.addLight(var12, var13, true, this.getClassColor());
                    }

                    byte var14 = 0;
                    if (this.mobFocus != null) {
                        var14 = 1;
                    } else if (this.charFocus != null) {
                        var14 = 2;
                    }

                    if (this.me) {
                        Service.gI().sendPlayerAttack((MyVector) var3, (MyVector) var4, (int) var14);
                        return;
                    }
                }
            } else if (this.skillPaint != null && (this.mobFocus != null || this.charFocus != null)) {
                if (this.attMobs != null && this.attChars != null) {
                    this.effPaints = new EffectPaint[this.attMobs.length + this.attChars.length];

                    for (var1 = 0; var1 < this.attMobs.length; ++var1) {
                        this.effPaints[var1] = new EffectPaint();
                        this.effPaints[var1].effCharPaint = GameScr.efs[this.skillPaint.id - 1];
                        this.effPaints[var1].eMob = this.attMobs[var1];
                    }

                    for (var1 = 0; var1 < this.attChars.length; ++var1) {
                        this.effPaints[var1 + this.attMobs.length] = new EffectPaint();
                        this.effPaints[var1 + this.attMobs.length].effCharPaint = GameScr.efs[this.skillPaint.id - 1];
                        this.effPaints[var1 + this.attMobs.length].eChar = this.attChars[var1];
                    }

                    this.attMobs = null;
                    this.attChars = null;
                } else if (this.attMobs != null) {
                    this.effPaints = new EffectPaint[this.attMobs.length];

                    for (var1 = 0; var1 < this.attMobs.length; ++var1) {
                        this.effPaints[var1] = new EffectPaint();
                        this.effPaints[var1].effCharPaint = GameScr.efs[this.skillPaint.id - 1];
                        this.effPaints[var1].eMob = this.attMobs[var1];
                    }

                    this.attMobs = null;
                } else if (this.attChars != null) {
                    this.effPaints = new EffectPaint[this.attChars.length];

                    for (var1 = 0; var1 < this.attChars.length; ++var1) {
                        this.effPaints[var1] = new EffectPaint();
                        this.effPaints[var1].effCharPaint = GameScr.efs[this.skillPaint.id - 1];
                        this.effPaints[var1].eChar = this.attChars[var1];
                    }

                    this.attChars = null;
                }

                if (this.effPaints.length > 1 && this.effPaints[0] != null) {
                    EPosition var10 = new EPosition();
                    if (this.effPaints[0].eMob != null) {
                        var10 = new EPosition(this.effPaints[0].eMob.x, this.effPaints[0].eMob.y);
                    } else if (this.effPaints[0].eChar != null) {
                        var10 = new EPosition(this.effPaints[0].eChar.cx, this.effPaints[0].eChar.cy);
                    }

                    MyVector var8 = new MyVector();

                    for (int var9 = 1; var9 < this.effPaints.length; ++var9) {
                        if (this.effPaints[var9].eMob != null) {
                            var8.addElement(new EPosition(this.effPaints[var9].eMob.x, this.effPaints[var9].eMob.y));
                        } else if (this.effPaints[var9].eChar != null) {
                            var8.addElement(new EPosition(this.effPaints[var9].eChar.cx, this.effPaints[var9].eChar.cy));
                        }

                        if (var9 > 5) {
                            break;
                        }
                    }

                    Lightning.addLight(var8, var10, true, this.getClassColor());
                    return;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
        }

    }

    public final boolean isHaveWolf() {
        if (this.ID_HORSE > -1) {
            return false;
        } else {
            return this.arrItemMounts != null && this.arrItemMounts[4] != null && this.arrItemMounts[4].template != null && (this.arrItemMounts[4].template.id == 443 || this.arrItemMounts[4].template.id == 523);
        }
    }

    public final boolean isHaveMoto() {
        if (this.ID_HORSE > -1) {
            return false;
        } else {
            return this.arrItemMounts != null && this.arrItemMounts[4] != null && this.arrItemMounts[4].template != null && (this.arrItemMounts[4].template.id == 485 || this.arrItemMounts[4].template.id == 524);
        }
    }

    public final boolean isPaint() {
        if (this.cx < GameScr.cmx) {
            return false;
        } else if (this.cx > GameScr.cmx + GameScr.gW) {
            return false;
        } else if (this.cy < GameScr.cmy) {
            return false;
        } else {
            return this.cy <= GameScr.cmy + GameScr.gH + 30;
        }
    }

    private static DataSkillEff getPartEff(short var0, boolean var1) {
        if (var0 == -1) {
            return null;
        } else {
            DataSkillEff var2;
            if ((var2 = (DataSkillEff) ALL_PART_EFF.get(String.valueOf(var0))) == null) {
                var2 = new DataSkillEff(var0, var1);
                ALL_PART_EFF.put(String.valueOf(var0), var2);
                var2.timeRemove = (long) ((int) (System.currentTimeMillis() / 1000L));
            } else {
                var2.timeRemove = System.currentTimeMillis();
            }

            return var2;
        }
    }

    public static void SetRemove() {
        Enumeration var0 = ALL_PART_EFF.h.keys();

        while (var0.hasMoreElements()) {
            String var1 = (String) var0.nextElement();
            DataSkillEff var2 = (DataSkillEff) ALL_PART_EFF.get(var1);
            if ((System.currentTimeMillis() - var2.timeRemove) / 1000L > 200L) {
                ALL_PART_EFF.h.remove(var1);
            }
        }

    }

    public void paint(mGraphics var1) {
        if (!this.isPaint()) {
            if (this.skillPaint != null) {
                this.indexSkill = this.skillInfoPaint1().length;
                this.skillPaint = null;
                this.effPaints = null;
                this.eff = null;
                this.effTask = null;
                this.indexEff = -1;
                this.indexEffTask = -1;
            }

        } else {
            this.paintBottomDataEff(var1, this.cx, this.cy - this.getDyHorse(), -this.heightCharName);
            if (this.statusMe != 15 && (this.moveFast == null || this.moveFast[0] <= 0)) {
                this.paintCharName_HP_MP_Overhead(var1);
                Char var3;
                if (this.skillPaint != null && this.indexSkill < this.skillInfoPaint1().length) {
                    mGraphics var2 = var1;
                    var3 = this;

                    try {
                        SkillInfoPaint[] var4 = var3.skillInfoPaint1();
                        var3.cf = var4[var3.indexSkill].status;
                        if (var4[var3.indexSkill].effS0Id != 0) {
                            var3.eff0 = GameScr.efs[var4[var3.indexSkill].effS0Id - 1];
                            var3.i0 = var3.dx0 = var3.dy0 = 0;
                        }

                        if (var4[var3.indexSkill].effS1Id != 0) {
                            var3.eff1 = GameScr.efs[var4[var3.indexSkill].effS1Id - 1];
                            var3.i1 = var3.dx1 = var3.dy1 = 0;
                        }

                        if (var4[var3.indexSkill].effS2Id != 0) {
                            var3.eff2 = GameScr.efs[var4[var3.indexSkill].effS2Id - 1];
                            var3.i2 = var3.dx2 = var3.dy2 = 0;
                        }

                        if (var4 != null && var4[var3.indexSkill] != null && var4[var3.indexSkill].arrowId != 0) {
                            var3.arr = new Arrow(var3, GameScr.arrs[var4[var3.indexSkill].arrowId - 1]);
                            var3.arr.life = 10;
                            var3.arr.ax = var3.cx + var4[var3.indexSkill].adx;
                            var3.arr.ay = var3.cy + var4[var3.indexSkill].ady;
                        }

                        var3.paintCharWithoutSkill(var2);
                        if (var3.cdir == 1) {
                            if (var3.eff0 != null) {
                                if (var3.dx0 == 0) {
                                    var3.dx0 = var4[var3.indexSkill].e0dx;
                                }

                                if (var3.dy0 == 0) {
                                    var3.dy0 = var4[var3.indexSkill].e0dy;
                                }

                                SmallImage.drawSmallImage(var2, var3.eff0.arrEfInfo[var3.i0].idImg, var3.cx + var3.dx0 + var3.eff0.arrEfInfo[var3.i0].dx, var3.cy + var3.dy0 + var3.eff0.arrEfInfo[var3.i0].dy, 0, 3);
                                ++var3.i0;
                                if (var3.i0 >= var3.eff0.arrEfInfo.length) {
                                    var3.eff0 = null;
                                    var3.i0 = var3.dx0 = var3.dy0 = 0;
                                }
                            }

                            if (var3.eff1 != null) {
                                if (var3.dx1 == 0) {
                                    var3.dx1 = var4[var3.indexSkill].e1dx;
                                }

                                if (var3.dy1 == 0) {
                                    var3.dy1 = var4[var3.indexSkill].e1dy;
                                }

                                SmallImage.drawSmallImage(var2, var3.eff1.arrEfInfo[var3.i1].idImg, var3.cx + var3.dx1 + var3.eff1.arrEfInfo[var3.i1].dx, var3.cy + var3.dy1 + var3.eff1.arrEfInfo[var3.i1].dy, 0, 3);
                                ++var3.i1;
                                if (var3.i1 >= var3.eff1.arrEfInfo.length) {
                                    var3.eff1 = null;
                                    var3.i1 = var3.dx1 = var3.dy1 = 0;
                                }
                            }

                            if (var3.eff2 != null) {
                                if (var3.dx2 == 0) {
                                    var3.dx2 = var4[var3.indexSkill].e2dx;
                                }

                                if (var3.dy2 == 0) {
                                    var3.dy2 = var4[var3.indexSkill].e2dy;
                                }

                                SmallImage.drawSmallImage(var2, var3.eff2.arrEfInfo[var3.i2].idImg, var3.cx + var3.dx2 + var3.eff2.arrEfInfo[var3.i2].dx, var3.cy + var3.dy2 + var3.eff2.arrEfInfo[var3.i2].dy, 0, 3);
                                ++var3.i2;
                                if (var3.eff2.arrEfInfo != null && var3.i2 >= var3.eff2.arrEfInfo.length) {
                                    var3.eff2 = null;
                                    var3.i2 = var3.dx2 = var3.dy2 = 0;
                                }
                            }
                        } else {
                            if (var3.eff0 != null) {
                                if (var3.dx0 == 0) {
                                    var3.dx0 = var4[var3.indexSkill].e0dx;
                                }

                                if (var3.dy0 == 0) {
                                    var3.dy0 = var4[var3.indexSkill].e0dy;
                                }

                                SmallImage.drawSmallImage(var2, var3.eff0.arrEfInfo[var3.i0].idImg, var3.cx - var3.dx0 - var3.eff0.arrEfInfo[var3.i0].dx, var3.cy + var3.dy0 + var3.eff0.arrEfInfo[var3.i0].dy, 2, 3);
                                ++var3.i0;
                                if (var3.i0 >= var3.eff0.arrEfInfo.length) {
                                    var3.eff0 = null;
                                    var3.i0 = 0;
                                    var3.dx0 = 0;
                                    var3.dy0 = 0;
                                }
                            }

                            if (var3.eff1 != null) {
                                if (var3.dx1 == 0) {
                                    var3.dx1 = var4[var3.indexSkill].e1dx;
                                }

                                if (var3.dy1 == 0) {
                                    var3.dy1 = var4[var3.indexSkill].e1dy;
                                }

                                SmallImage.drawSmallImage(var2, var3.eff1.arrEfInfo[var3.i1].idImg, var3.cx - var3.dx1 - var3.eff1.arrEfInfo[var3.i1].dx, var3.cy + var3.dy1 + var3.eff1.arrEfInfo[var3.i1].dy, 2, 3);
                                ++var3.i1;
                                if (var3.i1 >= var3.eff1.arrEfInfo.length) {
                                    var3.eff1 = null;
                                    var3.i1 = 0;
                                    var3.dx1 = 0;
                                    var3.dy1 = 0;
                                }
                            }

                            if (var3.eff2 != null) {
                                if (var3.dx2 == 0) {
                                    var3.dx2 = var4[var3.indexSkill].e2dx;
                                }

                                if (var3.dy2 == 0) {
                                    var3.dy2 = var4[var3.indexSkill].e2dy;
                                }

                                SmallImage.drawSmallImage(var2, var3.eff2.arrEfInfo[var3.i2].idImg, var3.cx - var3.dx2 - var3.eff2.arrEfInfo[var3.i2].dx, var3.cy + var3.dy2 + var3.eff2.arrEfInfo[var3.i2].dy, 2, 3);
                                ++var3.i2;
                                if (var3.eff2.arrEfInfo != null && var3.i2 >= var3.eff2.arrEfInfo.length) {
                                    var3.eff2 = null;
                                    var3.i2 = 0;
                                    var3.dx2 = 0;
                                    var3.dy2 = 0;
                                }
                            }
                        }

                        ++var3.indexSkill;
                    } catch (Exception var7) {
                        System.out.println("loi paint charskill");
                    }
                } else {
                    this.paintCharWithoutSkill(var1);
                }

                if (this.arr != null) {
                    this.arr.paint(var1);
                }
                int var8;
                if (this.effPaints != null) {
                    for (var8 = 0; var8 < this.effPaints.length; ++var8) {
                        if (this.effPaints[var8] != null) {
                            if (this.effPaints[var8].eMob != null) {
                                if (!this.effPaints[var8].isFly) {
                                    this.effPaints[var8].eMob.setInjure();
                                    this.effPaints[var8].eMob.injureBy = this;
                                    if (this.me) {
                                        getMyChar();
                                        getMyChar();
                                        NinjaUtil.randomNumber(11);
                                    }

                                    if (this.effPaints[var8].eMob.templateId != 98 && this.effPaints[var8].eMob.templateId != 99) {
                                        GameScr.startSplash(this.effPaints[var8].eMob.x, this.effPaints[var8].eMob.y - (this.effPaints[var8].eMob.h >> 1), this.cdir);
                                    }

                                    this.effPaints[var8].isFly = true;
                                }

                                SmallImage.drawSmallImage(var1, this.effPaints[var8].getImgId(), this.effPaints[var8].eMob.x, this.effPaints[var8].eMob.y, 0, 33);
                            } else if (this.effPaints[var8].eChar != null) {
                                if (!this.effPaints[var8].isFly) {
                                    if (this.effPaints[var8].eChar.charID >= 0) {
                                        (var3 = this.effPaints[var8].eChar).isInjure = 4;
                                        var3.callEff(49);
                                    }

                                    GameScr.startSplash(this.effPaints[var8].eChar.cx, this.effPaints[var8].eChar.cy - (this.effPaints[var8].eChar.ch >> 1), this.cdir);
                                    this.effPaints[var8].isFly = true;
                                }

                                SmallImage.drawSmallImage(var1, this.effPaints[var8].getImgId(), this.effPaints[var8].eChar.cx, this.effPaints[var8].eChar.cy, 0, 33);
                            }

                            ++this.effPaints[var8].index;
                            if (this.effPaints[var8].index >= this.effPaints[var8].effCharPaint.arrEfInfo.length) {
                                this.effPaints[var8] = null;
                            }
                        }
                    }
                }

                if (this.indexEff >= 0 && this.eff != null) {
                    SmallImage.drawSmallImage(var1, this.eff.arrEfInfo[this.indexEff].idImg, this.cx + this.eff.arrEfInfo[this.indexEff].dx, this.cy + this.eff.arrEfInfo[this.indexEff].dy, 0, 3);
                    if (GameCanvas.gameTick % 2 == 0) {
                        ++this.indexEff;
                        if (this.indexEff >= this.eff.arrEfInfo.length) {
                            this.indexEff = -1;
                            this.eff = null;
                        }
                    }
                }

                if (this.indexEffTask >= 0 && this.effTask != null) {
                    SmallImage.drawSmallImage(var1, this.effTask.arrEfInfo[this.indexEffTask].idImg, this.cx + this.effTask.arrEfInfo[this.indexEffTask].dx, this.cy + this.effTask.arrEfInfo[this.indexEffTask].dy, 0, 3);
                    if (GameCanvas.gameTick % 2 == 0) {
                        ++this.indexEffTask;
                        if (this.indexEffTask >= this.effTask.arrEfInfo.length) {
                            this.indexEffTask = -1;
                            this.effTask = null;
                        }
                    }
                }

                if (this.isEffBatTu) {
                    if (this.count < 2) {
                        SmallImage.drawSmallImage(var1, 1366, this.cx, this.cy - this.chh, 0, 3);
                    } else if (this.count < 4) {
                        SmallImage.drawSmallImage(var1, 1367, this.cx, this.cy - this.chh, 0, 3);
                    } else if (this.count < 8) {
                        SmallImage.drawSmallImage(var1, 1368, this.cx, this.cy - this.chh, 0, 3);
                    } else if (GameCanvas.gameTick % 2 == 0) {
                        SmallImage.drawSmallImage(var1, 1369, this.cx, this.cy - this.chh, 0, 3);
                    } else {
                        SmallImage.drawSmallImage(var1, 1370, this.cx, this.cy - this.chh, 0, 3);
                    }
                }

                try {
                    if (this.mobMe != null) {
                        this.mobMe.paint(var1);
                    }
                } catch (Exception var6) {
                    var6.printStackTrace();
                }

                if (this.mobVithu != null) {
                    this.mobVithu.paint(var1);
                }

                if (this.statusMe != 1 && this.statusMe != 6) {
                    for (var8 = 0; var8 < this.vDomsang.size(); ++var8) {
                        ((Domsang) this.vDomsang.elementAt(var8)).paint(var1);
                    }
                }

                this.paintTopDataEff(var1, this.cx, this.cy - this.getDyHorse(), -this.heightCharName);
            }
        }
    }

    public final void paintHp(mGraphics var1, int var2, int var3) {
        int var4 = this.cHP * 26 / this.cMaxHP;
        if (this.statusMe != 5 && this.statusMe != 14 && var4 < 2) {
            var4 = 2;
        } else if (this.statusMe == 5 || this.statusMe == 14) {
            var4 = 0;
        }

        if (var4 > 26) {
            var4 = 0;
        }

        var1.setColor(16777215);
        var1.fillRect(var2, var3, 26, 4);
        var1.setColor(this.getClassColor());
        var1.fillRect(var2, var3, var4, 4);
        var1.setColor(0);
        var1.drawRect(var2, var3, 26, 4);
    }

    private int[] geteffOngbo() {
        int[] var1 = null;
        if (this.isMoto && this.arrItemMounts[4].template.id == 485 && this.arrItemMounts[4].sys >= 3) {
            var1 = new int[]{2094, 2095, 2096};
        }

        return var1;
    }

    private int[] getEffmoto() {
        int[] var1 = null;
        if (this.isMoto) {
            var1 = new int[]{2082, 2082, 2083, 2083, 2084, 2084, 2089, 2089, 2082, 2082, 2083, 2083};
        }

        return var1;
    }

    private int[] getEffwolf() {
        int[] var1 = null;
        if (this.isWolf) {
            var1 = new int[]{2085, 2086, 2087, 2088};
        }

        return var1;
    }

    public final int[] getClassCoat() {
        int[] var1 = null;
        short var2 = -1;
        if (this.me) {
            if (this.arrItemBody[12] != null) {
                var2 = this.arrItemBody[12].template.id;
            }
        } else {
            var2 = this.coat;
        }

        if (var2 == -1) {
            return null;
        } else {
            if (var2 == 420) {
                if (!this.isWolf && !this.isMoto && !this.isNewMount) {
                    var1 = new int[]{1635, 1636, 1637, 1636};
                } else {
                    var1 = new int[]{2029, 2030, 2031, 2030};
                }
            } else if (var2 == 421) {
                if (!this.isWolf && !this.isMoto && !this.isNewMount) {
                    var1 = new int[]{1652, 1653, 1654, 1653};
                } else {
                    var1 = new int[]{2035, 2036, 2037, 2036};
                }
            } else if (var2 == 422) {
                if (!this.isWolf && !this.isMoto && !this.isNewMount) {
                    var1 = new int[]{1655, 1656, 1657, 1656};
                } else {
                    var1 = new int[]{2032, 2033, 2034, 2033};
                }
            }

            return var1;
        }
    }

    public final int getClassColor() {
        int var1 = 9145227;
        if (this.nClass.classId != 1 && this.nClass.classId != 2) {
            if (this.nClass.classId != 3 && this.nClass.classId != 4) {
                if (this.nClass.classId == 5 || this.nClass.classId == 6) {
                    var1 = 7443811;
                }
            } else {
                var1 = 33023;
            }
        } else {
            var1 = 16711680;
        }

        return var1;
    }

    public final void paintNameInSameParty(mGraphics var1) {
        if (this.isPaint()) {
            if (getMyChar().charFocus == null || !getMyChar().charFocus.equals(this)) {
                mFont.tahoma_7_yellow.drawString(var1, this.cName, this.cx, this.cy - this.ch - mFont.tahoma_7_green.getHeight() - 5, 2, mFont.tahoma_7_grey);
                return;
            }

            if (getMyChar().charFocus != null && getMyChar().charFocus.equals(this)) {
                mFont.tahoma_7_yellow.drawString(var1, this.cName, this.cx, this.cy - this.ch - mFont.tahoma_7_green.getHeight() - 10, 2, mFont.tahoma_7_grey);
            }
        }

    }

    public final void paintCharName_HP_MP_Overhead(mGraphics var1) {
        this.heightCharName = this.ch + 5;
        this.heightCharName += !this.isWolf && !this.isMoto && !this.isNewMount ? 0 : 15;
        DataSkillEff var2;
        if (this.ID_HORSE > -1 && (var2 = getPartEff(this.ID_HORSE, true)) != null && var2.isLoadData) {
            this.heightCharName += var2.dyHorse;
        }

        if (!this.isInvisible || this.me) {
            boolean var4;
            label152:
            {
                var4 = false;
                if (this.me) {
                    GameScr.gI();
                    if (GameScr.auto != 1) {
                        if (this.ColorName > 0) {
                            var4 = true;
                            this.heightCharName += mFont.tahoma_7.getHeight();
                            if (!this.isHuman) {
                                mFont.tahoma_7_blue1.drawString(var1, this.cName, this.cx, this.cy - this.heightCharName, 2, mFont.tahoma_7_grey);
                            } else {
                                color_font_name[this.ColorName].drawString(var1, this.cName, this.cx, this.cy - this.heightCharName, 2, mFont.tahoma_7_grey);
                            }

                            ++this.heightCharName;
                        } else if (this.npcFocus == null && this.charFocus == null && this.mobFocus == null && this.itemFocus == null) {
                            var4 = true;
                            this.heightCharName += mFont.tahoma_7.getHeight();
                            if (!this.isHuman) {
                                mFont.tahoma_7_blue1.drawString(var1, this.cName, this.cx, this.cy - this.heightCharName, 2, mFont.tahoma_7_grey);
                            } else {
                                color_font_name[this.ColorName].drawString(var1, this.cName, this.cx, this.cy - this.heightCharName, 2, mFont.tahoma_7_grey);
                            }

                            ++this.heightCharName;
                        }
                        break label152;
                    }

                    if (!GameScr.gI().lockAutoMove) {
                        this.heightCharName += mFont.tahoma_7.getHeight();
                        mFont.tahoma_7_yellow.drawString(var1, mResources.AUTO_FIRE, this.cx, this.cy - this.heightCharName, 2, mFont.tahoma_7_grey);
                    } else {
                        this.heightCharName += mFont.tahoma_7.getHeight();
                        mFont.tahoma_7_yellow.drawString(var1, mResources.UNMOVE, this.cx, this.cy - this.heightCharName, 2, mFont.tahoma_7_grey);
                    }
                } else {
                    if (getMyChar().charFocus != null && getMyChar().charFocus.equals(this)) {
                        var4 = true;
                        this.heightCharName += 5;
                        this.paintHp(var1, this.cx - 13, this.cy - this.heightCharName);
                        this.heightCharName += mFont.tahoma_7.getHeight();
                        if (!this.isHuman) {
                            mFont.tahoma_7_blue1.drawString(var1, this.cName, this.cx, this.cy - this.heightCharName, 2, mFont.tahoma_7_grey);
                        } else {
                            color_font_name[this.ColorName].drawString(var1, this.cName, this.cx, this.cy - this.heightCharName, 2, mFont.tahoma_7_grey);
                        }

                        ++this.heightCharName;
                        break label152;
                    }

                    if (!this.paintName) {
                        break label152;
                    }

                    var4 = true;
                    this.heightCharName += mFont.tahoma_7.getHeight();
                    if (!this.isHuman) {
                        mFont.tahoma_7_blue1.drawString(var1, this.cName, this.cx, this.cy - this.heightCharName, 2, mFont.tahoma_7_grey);
                    } else {
                        color_font_name[this.ColorName].drawString(var1, this.cName, this.cx, this.cy - this.heightCharName, 2, mFont.tahoma_7_grey);
                    }
                }

                ++this.heightCharName;
            }

            if (this.charID == -getMyChar().charID) {
                this.heightCharName += color_font_name[this.ColorName].getHeight();
                color_font_name[this.ColorName].drawString(var1, mResources.BY + " " + getMyChar().cName + " " + mResources.PROTECT, this.cx, this.cy - this.heightCharName, 2, mFont.tahoma_7_grey);
                ++this.heightCharName;
            }

            if (!this.cClanName.equals("") && var4) {
                this.heightCharName += mFont.tahoma_7.getHeight() - 1;
                byte var5 = 0;
                if (this.ctypeClan > 0) {
                    var5 = 5;
                }

                mFont.tahoma_7_white.drawString(var1, this.cClanName, this.cx + var5, this.cy - this.heightCharName, 2, mFont.tahoma_7_blue);
                if (this.ctypeClan == 3) {
                    SmallImage.drawSmallImage(var1, 1215, this.cx - (mFont.tahoma_7_white.getWidth(this.cClanName) / 2 + (7 - var5)), this.cy - this.heightCharName + 1, 0, 17);
                } else if (this.ctypeClan == 4) {
                    SmallImage.drawSmallImage(var1, 1216, this.cx - (mFont.tahoma_7_white.getWidth(this.cClanName) / 2 + (7 - var5)), this.cy - this.heightCharName + 1, 0, 17);
                } else if (this.ctypeClan == 2) {
                    SmallImage.drawSmallImage(var1, 1217, this.cx - (mFont.tahoma_7_white.getWidth(this.cClanName) / 2 + (7 - var5)), this.cy - this.heightCharName + 1, 0, 17);
                }

                ++this.heightCharName;
            }

            if (this.resultTest > 0 && this.resultTest < 30) {
                this.heightCharName += SmallImage.smallImg[1117][4];
                SmallImage.drawSmallImage(var1, 1117, this.cx, this.cy - this.heightCharName, 0, 17);
                ++this.heightCharName;
            } else if (this.resultTest > 30 && this.resultTest < 60) {
                this.heightCharName += SmallImage.smallImg[1117][4];
                SmallImage.drawSmallImage(var1, 1126, this.cx, this.cy - this.heightCharName, 0, 17);
                ++this.heightCharName;
            } else if (this.resultTest > 60 && this.resultTest < 90) {
                this.heightCharName += SmallImage.smallImg[1117][4];
                SmallImage.drawSmallImage(var1, 1118, this.cx, this.cy - this.heightCharName, 0, 17);
                ++this.heightCharName;
            } else {
                if (this.charID >= 0) {
                    if (this.killCharId >= 0) {
                        this.heightCharName += SmallImage.smallImg[1122][4];
                        SmallImage.drawSmallImage(var1, 1122, this.cx, this.cy - this.heightCharName, 0, 17);
                        ++this.heightCharName;
                        return;
                    }

                    if (this.cTypePk == 3) {
                        this.heightCharName += SmallImage.smallImg[1121][4];
                        SmallImage.drawSmallImage(var1, 1121, this.cx, this.cy - this.heightCharName, 0, 17);
                        ++this.heightCharName;
                        return;
                    }

                    if (this.cTypePk == 2) {
                        this.heightCharName += SmallImage.smallImg[1124][4];
                        SmallImage.drawSmallImage(var1, 1124, this.cx, this.cy - this.heightCharName, 0, 17);
                        ++this.heightCharName;
                        return;
                    }

                    if (this.cTypePk == 1) {
                        this.heightCharName += SmallImage.smallImg[1123][4];
                        SmallImage.drawSmallImage(var1, 1123, this.cx, this.cy - this.heightCharName, 0, 17);
                        ++this.heightCharName;
                        return;
                    }

                    if (this.cTypePk == 4) {
                        this.heightCharName += SmallImage.smallImg[1240][4];
                        SmallImage.drawSmallImage(var1, 1240, this.cx, this.cy - this.heightCharName, 0, 17);
                        ++this.heightCharName;
                        return;
                    }

                    if (this.cTypePk == 5) {
                        this.heightCharName += SmallImage.smallImg[1241][4];
                        SmallImage.drawSmallImage(var1, 1241, this.cx, this.cy - this.heightCharName, 0, 17);
                        ++this.heightCharName;
                        return;
                    }

                    if (this.cTypePk == 6) {
                        this.heightCharName += SmallImage.smallImg[1241][4];
                        SmallImage.drawSmallImage(var1, 1123, this.cx, this.cy - this.heightCharName, 0, 17);
                        ++this.heightCharName;
                        return;
                    }

                    if (this.cTypePk == 7) {
                        this.heightCharName += SmallImage.smallImg[1241][4];
                        SmallImage.drawSmallImage(var1, 3410, this.cx, this.cy - this.heightCharName, 0, 17);
                        ++this.heightCharName;
                        return;
                    }

                    if (this.testCharId > 0) {
                        this.heightCharName += SmallImage.smallImg[1116][4];
                        SmallImage.drawSmallImage(var1, 1116, this.cx, this.cy - this.heightCharName, 0, 17);
                        ++this.heightCharName;
                    }
                }

            }
        }
    }

    private byte getFrameHores() {
        DataSkillEff var1;
        if ((var1 = getPartEff(this.ID_HORSE, true)) != null && var1.isLoadData) {
            if (this.statusMe != 1 && this.statusMe != 6) {
                if (this.statusMe != 2 && this.statusMe != 10) {
                    if (this.statusMe == 4) {
                        this.ActionHorse = var1.ActionFall;
                    } else if (this.statusMe == 3) {
                        this.ActionHorse = var1.ActionJum;
                    } else {
                        this.ActionHorse = var1.ActionStand;
                    }
                } else {
                    this.ActionHorse = var1.ActionMove;
                }
            } else {
                this.ActionHorse = var1.ActionStand;
            }

            return this.fho >= this.ActionHorse.length ? (byte) (this.ActionHorse[this.ActionHorse.length - 1] + this.FrameHorse * var1.nHorseFrame) : (byte) (this.ActionHorse[this.fho] + this.FrameHorse * var1.nHorseFrame);
        } else {
            return 0;
        }
    }

    private int getFrameHorseui(int var1) {
        return var1 + this.fHorseUI * 30;
    }

    public final void paintHorseUI(mGraphics var1, int var2, int var3) {
        DataSkillEff var4;
        if ((var4 = getPartEff(this.ID_HORSE, true)) != null && var4.isLoadData) {
            if (GameCanvas.gameTick % 10 == 0) {
                int var5;
                if ((var5 = var4.listFrame.size() / var4.sequence.length) == 0) {
                    var5 = 1;
                }

                this.fHorseUI = (byte) ((this.fHorseUI + 1) % var5);
            }

            var4.paintBottomEff_new(var1, var2, var3, this.getFrameHorseui(var4.ActionStand[this.fhorsetrangbi]), 2);
            var4.paintTopEff_new(var1, var2, var3, this.getFrameHorseui(var4.ActionStand[this.fhorsetrangbi]), 2);
        }

    }

    private int getFrameBienHinh() {
        if (!this.isMoto && !this.isWolf && !this.isNewMount && this.ID_HORSE <= -1) {
            return this.cf + this.FrameBienHinh * 30;
        } else {
            return this.statusMe != 1 && this.statusMe != 6 ? this.fRun_PP[this.fBienhinh] + this.FrameBienHinh * 30 : this.cf + this.FrameBienHinh * 30;
        }
    }

    private int getFrameLeg() {
        if (!this.isMoto && !this.isWolf && !this.isNewMount && this.ID_HORSE <= -1) {
            return this.cf + this.FrameLeg * 30;
        } else {
            return this.statusMe != 1 && this.statusMe != 6 ? this.fRun_PP[this.fLeg] + this.FrameLeg * 30 : this.cf + this.FrameLeg * 30;
        }
    }

    private int getFrameMatna() {
        if (!this.isMoto && !this.isWolf && !this.isNewMount) {
            return this.cf + this.FrameMatna * 30;
        } else {
            return this.statusMe != 1 && this.statusMe != 6 ? this.fRun_PP[this.fMatNa] + this.FrameMatna * 30 : this.cf + this.FrameMatna * 30;
        }
    }

    private int getFrameWeapone() {
        if (!this.isMoto && !this.isWolf && !this.isNewMount) {
            return this.cf + this.FrameWeaPone * 30;
        } else {
            return this.statusMe != 1 && this.statusMe != 6 ? this.fRun_PP[this.fWeapone] + this.FrameWeaPone * 30 : this.cf + this.FrameWeaPone * 30;
        }
    }

    private int getFrameBody() {
        if (!this.isMoto && !this.isWolf && !this.isNewMount) {
            return this.cf + this.FrameBody * 30;
        } else {
            return this.statusMe != 1 && this.statusMe != 6 ? this.fRun_PP[this.fBody] + this.FrameBody * 30 : this.cf + this.FrameBody * 30;
        }
    }

    private int getFrameHair() {
        if (!this.isMoto && !this.isWolf && !this.isNewMount) {
            return this.cf + this.FrameHair * 30;
        } else {
            return this.statusMe != 1 && this.statusMe != 6 ? this.fRun_PP[this.fHair] + this.FrameHair * 30 : this.cf + this.FrameHair * 30;
        }
    }

    private int getFramePP() {
        if (!this.isMoto && !this.isWolf && !this.isNewMount && this.ID_HORSE <= -1) {
            return this.cf + this.FramePP * 30;
        } else {
            return this.statusMe != 1 && this.statusMe != 6 ? this.fRun_PP[this.fPP] + this.FramePP * 30 : this.cf + this.FramePP * 30;
        }
    }

    private int getFramePP(int var1) {
        return var1 + this.fPPUI * 30;
    }

    private int getFrameHeadUI(int var1) {
        return var1 + this.fHeadUI * 30;
    }

    private int getFrameBodyUI(int var1) {
        return var1 + this.FbodyUI * 30;
    }

    private int getFrameLegUI(int var1) {
        return var1 + this.FlegUI * 30;
    }

    public final void paintPPUIBot(mGraphics var1, int var2, int var3, int var4) {
        DataSkillEff var5;
        if ((var5 = getPartEff(this.ID_PP, false)) != null) {
            var5.paintBottomEff_new(var1, var2, var3, this.getFramePP(var4), 0);
        }

    }

    public final void paintPPUITop(mGraphics var1, int var2, int var3, int var4) {
        DataSkillEff var5;
        if ((var5 = getPartEff(this.ID_PP, false)) != null) {
            if (GameCanvas.gameTick % 10 == 0) {
                int var6;
                if ((var6 = var5.listFrame.size() / 30) == 0) {
                    var6 = 1;
                }

                this.fPPUI = (byte) ((this.fPPUI + 1) % var6);
            }

            var5.paintTopEff_new(var1, var2, var3, this.getFramePP(var4), 0);
        }

    }

    private int getFrameWeaponUI(int var1) {
        return var1 + this.fWeaponUI * 30;
    }

    private int getFrameMatNaUI(int var1) {
        return var1 + this.fMatNaUI * 30;
    }

    public final void paintMatNaUI(mGraphics var1, int var2, int var3, int var4) {
        DataSkillEff var5;
        if ((var5 = getPartEff(this.ID_MAT_NA, false)) != null) {
            if (GameCanvas.gameTick % 6 == 0) {
                int var6;
                if ((var6 = var5.listFrame.size() / 30) == 0) {
                    var6 = 1;
                }

                this.fMatNaUI = (byte) ((this.fMatNaUI + 1) % var6);
            }

            var5.paintTopEff_new(var1, var2, var3, this.getFrameMatNaUI(var4), 0);
            var5.paintBottomEff_new(var1, var2, var3, this.getFrameMatNaUI(var4), 0);
        }

    }

    public final void paintWeaponUITop(mGraphics var1, int var2, int var3, int var4) {
        DataSkillEff var5;
        if ((var5 = getPartEff(this.ID_WEA_PONE, false)) != null) {
            if (GameCanvas.gameTick % 6 == 0) {
                int var6;
                if ((var6 = var5.listFrame.size() / 30) == 0) {
                    var6 = 1;
                }

                this.fWeaponUI = (byte) ((this.fWeaponUI + 1) % var6);
            }

            var5.paintTopEff_new(var1, var2, var3, this.getFrameWeaponUI(var4), 0);
        }

    }

    public final void paintWeaponUIBot(mGraphics var1, int var2, int var3, int var4) {
        DataSkillEff var5;
        if ((var5 = getPartEff(this.ID_WEA_PONE, false)) != null) {
            if (GameCanvas.gameTick % 6 == 0) {
                int var6;
                if ((var6 = var5.listFrame.size() / 30) == 0) {
                    var6 = 1;
                }

                this.fWeaponUI = (byte) ((this.fWeaponUI + 1) % var6);
            }

            var5.paintBottomEff_new(var1, var2, var3, this.getFrameWeaponUI(var4), 0);
        }

    }

    public final void paintHeadUI(mGraphics var1, int var2, int var3, int var4) {
        DataSkillEff var5;
        if ((var5 = getPartEff(this.ID_HAIR, false)) != null) {
            if (GameCanvas.gameTick % 6 == 0) {
                int var6;
                if ((var6 = var5.listFrame.size() / 30) == 0) {
                    var6 = 1;
                }

                this.fHeadUI = (byte) ((this.fHeadUI + 1) % var6);
            }

            var5.paintBottomEff_new(var1, var2, var3, this.getFrameHeadUI(var4), 0);
            var5.paintTopEff_new(var1, var2, var3, this.getFrameHeadUI(var4), 0);
        }

    }

    public final void paintLegUI(mGraphics var1, int var2, int var3, int var4) {
        DataSkillEff var5;
        if ((var5 = getPartEff(this.ID_LEG, false)) != null) {
            if (GameCanvas.gameTick % 6 == 0) {
                int var6;
                if ((var6 = var5.listFrame.size() / 30) == 0) {
                    var6 = 1;
                }

                this.FlegUI = (byte) ((this.FlegUI + 1) % var6);
            }

            var5.paintBottomEff_new(var1, var2, var3, this.getFrameLegUI(var4), 0);
            var5.paintTopEff_new(var1, var2, var3, this.getFrameLegUI(var4), 0);
        }

    }

    public final void paintBodyUI(mGraphics var1, int var2, int var3, int var4) {
        DataSkillEff var5;
        if ((var5 = getPartEff(this.ID_Body, false)) != null) {
            if (GameCanvas.gameTick % 6 == 0) {
                int var6;
                if ((var6 = var5.listFrame.size() / 30) == 0) {
                    var6 = 1;
                }

                this.FbodyUI = (byte) ((this.FbodyUI + 1) % var6);
            }

            var5.paintBottomEff_new(var1, var2, var3, this.getFrameBodyUI(var4), 0);
            var5.paintTopEff_new(var1, var2, var3, this.getFrameBodyUI(var4), 0);
        }

    }

    private void paintWeaponBot(mGraphics var1, int var2, int var3, int var4, DataSkillEff var5) {
        var4 = 0;
        if ((this.statusMe == 1 || this.statusMe == 6) && this.cf <= 1) {
            var4 = this.cf << 1;
        }

        if (var5 != null) {
            if (this.isNewMount) {
                byte var6 = -2;
                if (this.cdir == 1) {
                    var6 = 2;
                }

                if ((this.statusMe == 1 || this.statusMe == 6) && this.cf <= 1) {
                    var4 = this.cf;
                }

                var5.paintBottomEff_new(var1, var2 + this.getxs() + var6, var3 + var4 - this.getDyHorse() + this.dyMount - this.getys(), this.statusMe != 1 && this.statusMe != 6 ? 5 + this.FrameWeaPone * 30 : this.getFrameWeapone(), this.cdir == 1 ? 0 : 2);
                return;
            }

            if (this.isWolf) {
                var5.paintBottomEff_new(var1, var2 + this.getxs(), var3 + var4 - this.getDyHorse() - this.getys(), this.statusMe != 1 && this.statusMe != 6 ? 5 + this.FrameWeaPone * 30 : this.getFrameWeapone(), this.cdir == 1 ? 0 : 2);
                return;
            }

            if (this.isMoto) {
                var5.paintBottomEff_new(var1, var2 + this.getxs(), var3 + var4 - this.getDyHorse() - this.getys(), this.statusMe != 1 && this.statusMe != 6 ? 5 + this.FrameWeaPone * 30 : this.getFrameWeapone(), this.cdir == 1 ? 0 : 2);
                return;
            }

            if (this.ID_HORSE > -1) {
                var5.paintBottomEff_new(var1, var2 + this.getxs() + this.dxnewhorse, var3 - this.getys() - this.getDyHorse(), this.getFrameWeapone(), this.cdir == 1 ? 0 : 2);
                return;
            }

            var5.paintBottomEff_new(var1, var2 + this.getxs(), var3 - this.getys(), this.getFrameWeapone(), this.cdir == 1 ? 0 : 2);
        }

    }

    private void paintWeaponTop(mGraphics var1, int var2, int var3, int var4, DataSkillEff var5) {
        var4 = 0;
        if ((this.statusMe == 1 || this.statusMe == 6) && this.cf <= 1) {
            var4 = this.cf << 1;
        }

        if (var5 != null) {
            if (this.isNewMount) {
                byte var6 = -2;
                if (this.cdir == 1) {
                    var6 = 2;
                }

                if ((this.statusMe == 1 || this.statusMe == 6) && this.cf <= 1) {
                    var4 = this.cf;
                }

                var5.paintTopEff_new(var1, var2 + this.getxs() + var6, var3 + var4 - this.getDyHorse() + this.dyMount - this.getys(), this.statusMe != 1 && this.statusMe != 6 ? 5 + this.FrameWeaPone * 30 : this.getFrameWeapone(), this.cdir == 1 ? 0 : 2);
                return;
            }

            if (this.isWolf) {
                var5.paintTopEff_new(var1, var2 + this.getxs(), var3 + var4 - this.getDyHorse() - this.getys(), this.statusMe != 1 && this.statusMe != 6 ? 5 + this.FrameWeaPone * 30 : this.getFrameWeapone(), this.cdir == 1 ? 0 : 2);
                return;
            }

            if (this.isMoto) {
                var5.paintTopEff_new(var1, var2 + this.getxs(), var3 + var4 - this.getDyHorse() - this.getys(), this.statusMe != 1 && this.statusMe != 6 ? 5 + this.FrameWeaPone * 30 : this.getFrameWeapone(), this.cdir == 1 ? 0 : 2);
                return;
            }

            if (this.ID_HORSE > -1) {
                var5.paintTopEff_new(var1, var2 + this.getxs() + this.dxnewhorse, var3 - this.getys() - this.getDyHorse(), this.getFrameWeapone(), this.cdir == 1 ? 0 : 2);
                return;
            }

            var5.paintTopEff_new(var1, var2 + this.getxs(), var3 - this.getys(), this.getFrameWeapone(), this.cdir == 1 ? 0 : 2);
        }

    }

    private void paintBody(mGraphics var1, int var2, int var3, int var4) {
        DataSkillEff var5 = getPartEff(this.ID_Body, false);
        int var6 = 0;
        if ((this.statusMe == 1 || this.statusMe == 6) && this.cf <= 1) {
            var6 = this.cf * var4;
        }

        if (var5 != null) {
            var5.paintBottomEff_new(var1, var2 + this.getxs(), var3 + var6 - this.getys(), this.statusMe != 1 && this.statusMe != 6 ? 5 + this.FrameBody * 30 : this.getFrameBody(), this.cdir == 1 ? 0 : 2);
            var5.paintTopEff_new(var1, var2 + this.getxs(), var3 + var6 - this.getys(), this.statusMe != 1 && this.statusMe != 6 ? 5 + this.FrameBody * 30 : this.getFrameBody(), this.cdir == 1 ? 0 : 2);
        }

    }

    private int getys() {
        byte var1 = 0;
        if (this.isMoto) {
            if (this.arrItemMounts[4].template.id == 485) {
                var1 = 4;
            } else {
                var1 = 6;
            }
        }

        if (this.isNewMount) {
            var1 = 2;
            if (this.statusMe == 3) {
                var1 = 4;
            }
        }

        return var1;
    }

    private int getxs() {
        byte var1 = 0;
        if (this.isWolf) {
            var1 = 3;
            if (this.cdir == 1) {
                var1 = -3;
            }
        }

        if (this.isMoto) {
            if (this.arrItemMounts[4].template.id == 485) {
                var1 = 4;
                if (this.cdir == 1) {
                    var1 = -4;
                }
            } else {
                var1 = 7;
                if (this.cdir == 1) {
                    var1 = -7;
                }
            }
        }

        if (this.isNewMount) {
            var1 = 1;
            if (this.cdir == 1) {
                var1 = -1;
            }
        }

        return var1;
    }

    private void paintHair(mGraphics var1, int var2, int var3, int var4) {
        DataSkillEff var5 = getPartEff(this.ID_HAIR, false);
        int var6 = 0;
        if ((this.statusMe == 1 || this.statusMe == 6) && this.cf <= 1) {
            var6 = this.cf * var4;
        }

        if (var5 != null) {
            var5.paintBottomEff_new(var1, var2 + this.getxs(), var3 + var6 - this.getys(), this.statusMe != 1 && this.statusMe != 6 ? 5 + this.FrameHair * 30 : this.getFrameHair(), this.cdir == 1 ? 0 : 2);
            var5.paintTopEff_new(var1, var2 + this.getxs(), var3 + var6 - this.getys(), this.statusMe != 1 && this.statusMe != 6 ? 5 + this.FrameHair * 30 : this.getFrameHair(), this.cdir == 1 ? 0 : 2);
        }

    }

    private void paintMatna(mGraphics var1, int var2, int var3, int var4) {
        if (this.ID_MAT_NA >= 0) {
            DataSkillEff var5 = getPartEff(this.ID_MAT_NA, false);
            int var6 = 0;
            if ((this.statusMe == 1 || this.statusMe == 6) && this.cf <= 1) {
                var6 = this.cf * var4;
            }

            if (var5 != null) {
                if (this.isWolf && (this.arrItemMounts[4].template.id == 443 || this.arrItemMounts[4].template.id == 523)) {
                    byte var8 = -2;
                    if (this.statusMe == 1 || this.statusMe == 6) {
                        var8 = 0;
                    }

                    byte var7 = 0;
                    if (this.cgender == 1) {
                        var7 = 3;
                    }

                    if (this.statusMe == 1 || this.statusMe == 6) {
                        var7 = 0;
                    }

                    var5.paintBottomEff_new(var1, var2 + var8, var3 + var6 - this.getys() - var7, this.statusMe != 1 && this.statusMe != 6 ? 5 + this.FrameMatna * 30 : this.getFrameMatna(), this.cdir == 1 ? 0 : 2);
                    var5.paintTopEff_new(var1, var2 + var8, var3 + var6 - this.getys() - var7, this.statusMe != 1 && this.statusMe != 6 ? 5 + this.FrameMatna * 30 : this.getFrameMatna(), this.cdir == 1 ? 0 : 2);
                    return;
                }

                var5.paintBottomEff_new(var1, var2 + this.getxs(), var3 + var6 - this.getys(), this.statusMe != 1 && this.statusMe != 6 ? 5 + this.FrameMatna * 30 : this.getFrameMatna(), this.cdir == 1 ? 0 : 2);
                var5.paintTopEff_new(var1, var2 + this.getxs(), var3 + var6 - this.getys(), this.statusMe != 1 && this.statusMe != 6 ? 5 + this.FrameMatna * 30 : this.getFrameMatna(), this.cdir == 1 ? 0 : 2);
            }

        }
    }

    private void paintPP_Bot(mGraphics var1) {
        DataSkillEff var2 = getPartEff(this.ID_PP, false);
        boolean var3 = false;
        int var4 = 0;
        byte var5;
        if (this.isMoto) {
            if (this.arrItemMounts[4].template.id == 485) {
                if ((this.statusMe == 1 || this.statusMe == 6) && this.cf <= 1) {
                    var4 = this.cf << 1;
                }

                if (var2 != null) {
                    var2.paintBottomEff_new(var1, this.cx + this.getxs(), this.cy - 9 + var4 - this.getys(), this.getFramePP(), this.cdir == 1 ? 0 : 2);
                }
            }

            if (this.arrItemMounts[4].template.id == 524) {
                var5 = 2;
                if ((this.statusMe == 1 || this.statusMe == 6) && this.cf <= 1) {
                    var4 = this.cf << 1;
                }

                if (this.cdir == 1) {
                    var5 = -2;
                }

                if (var2 != null) {
                    var2.paintBottomEff_new(var1, this.cx + var5 + this.getxs(), this.cy - 12 + var4 - this.getys(), this.getFramePP(), this.cdir == 1 ? 0 : 2);
                    return;
                }
            }
        } else if (this.isWolf) {
            if (this.arrItemMounts[4].template.id == 523) {
                if ((this.statusMe == 1 || this.statusMe == 6) && this.cf <= 1) {
                    var4 = this.cf << 1;
                }

                var5 = 2;
                if (this.cdir == 1) {
                    var5 = -2;
                }

                if (var2 != null) {
                    var2.paintBottomEff_new(var1, this.cx + var5 + this.getxs(), this.cy - 15 + var4 - this.getys(), this.getFramePP(), this.cdir == 1 ? 0 : 2);
                    return;
                }
            } else if (this.arrItemMounts[4].template.id == 443) {
                if ((this.statusMe == 1 || this.statusMe == 6) && this.cf <= 1) {
                    var4 = this.cf << 1;
                }

                var5 = 2;
                if (this.cdir == 1) {
                    var5 = -2;
                }

                if (var2 != null) {
                    var2.paintBottomEff_new(var1, this.cx + var5 + this.getxs(), this.cy - 15 + var4 - this.getys(), this.getFramePP(), this.cdir == 1 ? 0 : 2);
                    return;
                }
            }
        } else if (this.isNewMount) {
            var5 = -4;
            if ((this.statusMe == 1 || this.statusMe == 6) && this.cf <= 1) {
                var4 = this.cf;
            }

            if (this.cdir == 1) {
                var5 = 4;
            }

            if (var2 != null) {
                var2.paintBottomEff_new(var1, this.cx + var5 + this.getxs(), this.cy - 18 + this.dyMount + var4 - this.getys(), this.getFramePP(), this.cdir == 1 ? 0 : 2);
                return;
            }
        } else if (var2 != null) {
            var2.paintBottomEff_new(var1, this.cx + this.dxnewhorse + this.getxs(), this.cy - this.dynewhhorse - this.getys(), this.getFramePP(), this.cdir == 1 ? 0 : 2);
        }

    }

    private void paintPP_Top(mGraphics var1) {
        DataSkillEff var2 = getPartEff(this.ID_PP, false);
        boolean var3 = false;
        int var4 = 0;
        byte var5;
        if (this.isMoto) {
            if (this.arrItemMounts[4].template.id == 485) {
                if ((this.statusMe == 1 || this.statusMe == 6) && this.cf <= 1) {
                    var4 = this.cf << 1;
                }

                if (var2 != null) {
                    var2.paintTopEff_new(var1, this.cx + this.getxs(), this.cy - 9 + var4 - this.getys(), this.getFramePP(), this.cdir == 1 ? 0 : 2);
                }
            }

            if (this.arrItemMounts[4].template.id == 524) {
                var5 = 2;
                if ((this.statusMe == 1 || this.statusMe == 6) && this.cf <= 1) {
                    var4 = this.cf << 1;
                }

                if (this.cdir == 1) {
                    var5 = -2;
                }

                if (var2 != null) {
                    var2.paintTopEff_new(var1, this.cx + var5 + this.getxs(), this.cy - 12 + var4 - this.getys(), this.getFramePP(), this.cdir == 1 ? 0 : 2);
                    return;
                }
            }
        } else if (this.isWolf) {
            if (this.arrItemMounts[4].template.id == 523) {
                var5 = 2;
                if ((this.statusMe == 1 || this.statusMe == 6) && this.cf <= 1) {
                    var4 = this.cf << 1;
                }

                if (this.cdir == 1) {
                    var5 = -2;
                }

                if (var2 != null) {
                    var2.paintTopEff_new(var1, this.cx + var5 + this.getxs(), this.cy - 15 + var4 - this.getys(), this.getFramePP(), this.cdir == 1 ? 0 : 2);
                    return;
                }
            } else if (this.arrItemMounts[4].template.id == 443) {
                if ((this.statusMe == 1 || this.statusMe == 6) && this.cf <= 1) {
                    var4 = this.cf << 1;
                }

                var5 = 2;
                if (this.cdir == 1) {
                    var5 = -2;
                }

                if (var2 != null) {
                    var2.paintTopEff_new(var1, this.cx + var5 + this.getxs(), this.cy - 15 + var4 - this.getys(), this.getFramePP(), this.cdir == 1 ? 0 : 2);
                    return;
                }
            }
        } else if (this.isNewMount) {
            var5 = -4;
            if ((this.statusMe == 1 || this.statusMe == 6) && this.cf <= 1) {
                var4 = this.cf;
            }

            if (this.cdir == 1) {
                var5 = 4;
            }

            if (var2 != null) {
                var2.paintTopEff_new(var1, this.cx + var5 + this.getxs(), this.cy - 18 + this.dyMount + var4 - this.getys(), this.getFramePP(), this.cdir == 1 ? 0 : 2);
                return;
            }
        } else if (var2 != null) {
            var2.paintTopEff_new(var1, this.cx + this.dxnewhorse + this.getxs(), this.cy - this.dynewhhorse - this.getys(), this.getFramePP(), this.cdir == 1 ? 0 : 2);
        }

    }

    private int getDyHorse() {
        DataSkillEff var1;
        if (this.ID_HORSE > -1 && (var1 = getPartEff(this.ID_HORSE, true)) != null && var1.isLoadData) {
            return var1.dyHorse + var1.Dy_Char[this.getFrameHores()];
        } else {
            return !this.isWolf && !this.isMoto && !this.isNewMount ? 0 : 12;
        }
    }

    private void paintCharWithoutSkill(mGraphics var1) {
        try {
            DataSkillEff var2;
            if ((var2 = getPartEff(this.ID_WEA_PONE, false)) != null && GameCanvas.gameTick % 3 == 0) {
                int var3;
                if ((var3 = var2.listFrame.size() / 30) == 0) {
                    var3 = 1;
                }

                this.FrameWeaPone = (byte) ((this.FrameWeaPone + 1) % var3);
            }

            DataSkillEff var20;
            if ((var20 = getPartEff(this.ID_Bien_Hinh, false)) != null && GameCanvas.gameTick % 6 == 0) {
                int var4;
                if ((var4 = var20.listFrame.size() / 30) == 0) {
                    var4 = 1;
                }

                this.FrameBienHinh = (byte) ((this.FrameBienHinh + 1) % var4);
            }

            DataSkillEff var23;
            if ((var23 = getPartEff(this.ID_MAT_NA, false)) != null && GameCanvas.gameTick % 6 == 0) {
                int var5;
                if ((var5 = var23.listFrame.size() / 30) == 0) {
                    var5 = 1;
                }

                this.FrameMatna = (byte) ((this.FrameMatna + 1) % var5);
            }

            DataSkillEff var25 = getPartEff(this.ID_SUSANO, false);
            DataSkillEff var6 = getPartEff(this.ID_RANK, false);
            DataSkillEff var7 = getPartEff(this.ID_NAME, false);
            DataSkillEff var8;
            if ((var8 = getPartEff(this.ID_LEG, false)) != null && GameCanvas.gameTick % 6 == 0) {
                int var9;
                if ((var9 = var8.listFrame.size() / 30) == 0) {
                    var9 = 1;
                }

                this.FrameLeg = (byte) ((this.FrameLeg + 1) % var9);
            }

            DataSkillEff var27;
            if ((var27 = getPartEff(this.ID_HORSE, true)) != null && var27.isLoadData && GameCanvas.gameTick % 10 == 0) {
                int var10;
                if ((var10 = var27.listFrame.size() / var27.sequence.length) == 0) {
                    var10 = 1;
                }

                this.FrameHorse = (byte) ((this.FrameHorse + 1) % var10);
            }

            DataSkillEff var28;
            if ((var28 = getPartEff(this.ID_Body, false)) != null && GameCanvas.gameTick % 6 == 0) {
                int var11;
                if ((var11 = var28.listFrame.size() / 30) == 0) {
                    var11 = 1;
                }

                this.FrameBody = (byte) ((this.FrameBody + 1) % var11);
            }

            DataSkillEff var29;
            if ((var29 = getPartEff(this.ID_HAIR, false)) != null && GameCanvas.gameTick % 6 == 0) {
                int var12;
                if ((var12 = var29.listFrame.size() / 30) == 0) {
                    var12 = 1;
                }

                this.FrameHair = (byte) ((this.FrameHair + 1) % var12);
            }

            DataSkillEff var30;
            if ((var30 = getPartEff(this.ID_PP, false)) != null && GameCanvas.gameTick % 6 == 0) {
                int var13;
                if ((var13 = var30.listFrame.size() / 30) == 0) {
                    var13 = 1;
                }

                this.FramePP = (byte) ((this.FramePP + 1) % var13);
            }

            Object var31 = null;
            Part var14 = GameScr.parts[this.head];
            Part var15 = GameScr.parts[this.leg];
            Part var16 = GameScr.parts[this.body];
            Part var17 = GameScr.parts[this.wp];
            if (var2 != null) {
                var17 = null;
            }

            if (this.arrItemBody != null && this.arrItemBody[11] != null) {
                var14 = GameScr.parts[this.arrItemBody[11].template.part];
                this.head = this.arrItemBody[11].template.part;
            }

            int var18;
            if (var14.pi != null && var14.pi.length >= 8) {
                for (var18 = 0; var18 < var14.pi.length; ++var18) {
                    if (var14.pi[var18] == null || !SmallImage.isExitsImage(var14.pi[var18].id)) {
                        var14 = getDefaultHead(this.cgender);
                        break;
                    }
                }
            } else {
                var14 = getDefaultHead(this.cgender);
            }

            int[] var33 = var14.pi[CharInfo[this.cf][0][0]].id <= 4 ? null : this.getClassCoat();
            if (((this.statusMe == 1 || this.statusMe == 6) && GameCanvas.gameTick % 10 == 0 || (this.statusMe == 2 || this.statusMe == 10) && GameCanvas.gameTick % 2 == 0 || (this.statusMe == 4 || this.statusMe == 3) && GameCanvas.gameTick % 3 == 0) && var33 != null) {
                ++this.tickCoat;
                if (this.tickCoat > var33.length - 1) {
                    this.tickCoat = 0;
                }
            }

            if (this.statusMe == 14) {
                if (this.isHaveNewMount()) {
                    this.paintBehindNewMount(var1);
                } else if (this.isHaveMoto()) {
                    if (this.arrItemMounts[4].template.id == 485) {
                        if (this.arrItemMounts[4].sys < 2) {
                            SmallImage.drawSmallImage(var1, 1800, this.lcx, this.lcy, 2, 33);
                        } else {
                            SmallImage.drawSmallImage(var1, 2063, this.lcx, this.lcy, 2, 33);
                        }
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        if (this.arrItemMounts[4].sys < 2) {
                            SmallImage.drawSmallImage(var1, 2064, this.lcx, this.lcy, 2, 33);
                        } else {
                            SmallImage.drawSmallImage(var1, 2068, this.lcx, this.lcy, 2, 33);
                        }
                    }
                }

                SmallImage.drawSmallImage(var1, 1040, this.cx, this.cy, 0, 33);
            } else if (this.isInvisible) {
                if (this.me) {
                    if (GameCanvas.gameTick % 50 != 48 && GameCanvas.gameTick % 50 != 90) {
                        SmallImage.drawSmallImage(var1, 1195, this.cx, this.cy - 18, 0, 3);
                    } else {
                        SmallImage.drawSmallImage(var1, 1196, this.cx, this.cy - 18, 0, 3);
                    }
                }
            } else {
                if (var25 != null) {
                    var25.paintBottomEff_new(var1, this.cx, this.cy - this.getDyHorse(), this.FrameSusan, this.cdir == 1 ? 0 : 2);
                }

                if (var2 != null) {
                    this.paintWeaponBot(var1, this.cx, this.cy, 2, var2);
                }

                if (var20 != null) {
                    var20.paintBottomEff_new(var1, this.cx, this.cy, this.getFrameBienHinh(), this.cdir == 1 ? 0 : 2);
                    var20.paintTopEff_new(var1, this.cx, this.cy, this.getFrameBienHinh(), this.cdir == 1 ? 0 : 2);
                }

                if (var27 != null) {
                    var27.paintBottomEff_new(var1, this.cx, this.cy, this.getFrameHores(), this.cdir == 1 ? 2 : 0);
                }

                if (var6 != null) {
                    var6.paintBottomEff_new(var1, this.cx, this.cy - this.getDyHorse(), this.FrameRank, this.cdir == 1 ? 0 : 2);
                }

                if (var7 != null) {
                    var7.paintBottomEff_new(var1, this.cx, this.cy - this.getDyHorse(), this.FrameName, 0);
                }

                this.paintPP_Bot(var1);
                int[] var22;
                int[] var35;
                if (this.isMoto) {
                    var18 = 0;
                    boolean var21 = false;
                    int var26 = 0;
                    boolean var34 = false;
                    if ((var35 = this.geteffOngbo()) != null) {
                        ++this.tickEffmoto;
                        if (this.tickEffmoto >= var35.length) {
                            this.tickEffmoto = 0;
                        }
                    }

                    int var10000;
                    if (this.arrItemMounts[4].template.id == 485) {
                        if (this.arrItemMounts[4].sys < 2) {
                            label1626:
                            {
                                if (this.statusMe != 1 && this.statusMe != 6) {
                                    if (this.statusMe != 2 && this.statusMe != 10) {
                                        break label1626;
                                    }

                                    var10000 = GameCanvas.gameTick % 6 > 3 ? 1 : 0;
                                } else {
                                    var18 = GameCanvas.gameTick % 20 > 12 ? 1 : 0;
                                    if (var30 == null && var28 == null && var29 == null && var2 == null && var23 == null || this.cf > 1) {
                                        break label1626;
                                    }

                                    var10000 = this.cf;
                                }

                                var18 = var10000;
                            }

                            if (this.statusMe == 3) {
                                var26 = -5 * this.cdir;
                            }

                            if (this.cdir == 1) {
                                if (this.statusMe == 3) {
                                    SmallImage.drawSmallImage(var1, 1711, this.cx, this.cy + 2, 0, 33);
                                } else {
                                    SmallImage.drawSmallImage(var1, var18 == 0 ? 1709 : 1710, this.cx, this.cy, 0, 33);
                                }

                                if (var29 != null) {
                                    this.paintHair(var1, this.cx, this.cy - 8, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getHeadId(), this.cx + var26 + this.dxHead * this.cdir, this.cy - CharInfo[0][0][2] + var14.pi[CharInfo[0][0][0]].dy - 12 + var18 + this.dyHead, 0, 17);
                                }

                                if (var28 != null) {
                                    this.paintBody(var1, this.cx, this.cy - 8, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getBodyPaintId(), this.cx + this.dxBody * this.cdir, this.cy - SmallImage.getHeight(this.getLegId()) - 8 + var18 + this.dyBody, 0, 33);
                                }

                                this.paintMatna(var1, this.cx, this.cy - 8, 2);
                            } else {
                                if (this.statusMe == 3) {
                                    SmallImage.drawSmallImage(var1, 1711, this.cx, this.cy + 2, 2, 33);
                                } else {
                                    SmallImage.drawSmallImage(var1, var18 == 0 ? 1709 : 1710, this.cx, this.cy, 2, 33);
                                }

                                if (var29 != null) {
                                    this.paintHair(var1, this.cx, this.cy - 8, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getHeadId(), this.cx + var26 + this.dxHead * this.cdir, this.cy - CharInfo[0][0][2] + var14.pi[CharInfo[0][0][0]].dy - 12 + var18 + this.dyHead, 2, 17);
                                }

                                if (var28 != null) {
                                    this.paintBody(var1, this.cx, this.cy - 8, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getBodyPaintId(), this.cx + this.dxBody * this.cdir, this.cy - SmallImage.getHeight(this.getLegId()) - 8 + var18 + this.dyBody, 2, 33);
                                }

                                this.paintMatna(var1, this.cx, this.cy - 8, 2);
                            }
                        } else {
                            label1627:
                            {
                                if (this.statusMe != 1 && this.statusMe != 6) {
                                    if (this.statusMe != 2 && this.statusMe != 10) {
                                        break label1627;
                                    }

                                    var10000 = GameCanvas.gameTick % 6 > 3 ? 1 : 0;
                                } else {
                                    var18 = GameCanvas.gameTick % 20 > 12 ? 1 : 0;
                                    if (var30 == null && var28 == null && var29 == null && var2 == null && var23 == null || this.cf > 1) {
                                        break label1627;
                                    }

                                    var10000 = this.cf;
                                }

                                var18 = var10000;
                            }

                            if (this.statusMe == 3) {
                                var26 = -5 * this.cdir;
                            }

                            if (this.cdir == 1) {
                                if (this.statusMe == 3) {
                                    SmallImage.drawSmallImage(var1, 2057, this.cx, this.cy + 2, 0, 33);
                                } else if (!this.isBocdau) {
                                    SmallImage.drawSmallImage(var1, var18 == 0 ? 2056 : 2055, this.cx, this.cy, 0, 33);
                                } else {
                                    SmallImage.drawSmallImage(var1, 2057, this.cx, this.cy, 0, 33);
                                }

                                if (this.statusMe == 2 && var35 != null) {
                                    SmallImage.drawSmallImage(var1, var35[this.tickEffmoto], this.cx - 25, this.cy - 2, 0, 33);
                                }

                                if (!this.isBocdau) {
                                    if (var29 != null) {
                                        this.paintHair(var1, this.cx, this.cy - 8, 2);
                                    } else {
                                        SmallImage.drawSmallImage(var1, this.getHeadId(), this.cx + var26 + this.dxHead * this.cdir, this.cy - CharInfo[0][0][2] + var14.pi[CharInfo[0][0][0]].dy - 12 + var18 + this.dyHead, 0, 17);
                                    }

                                    if (var28 != null) {
                                        this.paintBody(var1, this.cx, this.cy - 8, 2);
                                    } else {
                                        SmallImage.drawSmallImage(var1, this.getBodyPaintId(), this.cx + this.dxBody * this.cdir, this.cy - SmallImage.getHeight(this.getLegId()) - 8 + var18 + this.dyBody, 0, 33);
                                    }

                                    this.paintMatna(var1, this.cx, this.cy - 8, 2);
                                } else {
                                    if (var29 != null) {
                                        this.paintHair(var1, this.cx, this.cy - 8, 2);
                                    } else {
                                        SmallImage.drawSmallImage(var1, this.getHeadId(), this.cx + var26 + this.dxHead * this.cdir - 3, this.cy - 1 - CharInfo[0][0][2] + var14.pi[CharInfo[0][0][0]].dy - 12 + var18 + this.dyHead, 0, 17);
                                    }

                                    if (var28 != null) {
                                        this.paintBody(var1, this.cx, this.cy - 8, 2);
                                    } else {
                                        SmallImage.drawSmallImage(var1, this.getBodyPaintId(), this.cx - 3 + this.dxBody * this.cdir, this.cy - 1 - SmallImage.getHeight(this.getLegId()) - 8 + var18 + this.dyBody, 0, 33);
                                    }

                                    this.paintMatna(var1, this.cx, this.cy - 8, 2);
                                }
                            } else {
                                if (this.statusMe == 3) {
                                    SmallImage.drawSmallImage(var1, 2057, this.cx, this.cy + 2, 2, 33);
                                } else if (!this.isBocdau) {
                                    SmallImage.drawSmallImage(var1, var18 == 0 ? 2056 : 2055, this.cx, this.cy, 2, 33);
                                } else {
                                    SmallImage.drawSmallImage(var1, 2057, this.cx, this.cy, 2, 33);
                                }

                                if (this.statusMe == 2 && var35 != null) {
                                    SmallImage.drawSmallImage(var1, var35[this.tickEffmoto], this.cx + 25, this.cy - 2, 2, 33);
                                }

                                if (var29 != null) {
                                    this.paintHair(var1, this.cx, this.cy - 8, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getHeadId(), this.cx + var26 + this.dxHead * this.cdir, this.cy - CharInfo[0][0][2] + var14.pi[CharInfo[0][0][0]].dy - 12 + var18 + this.dyHead, 2, 17);
                                }

                                if (var28 != null) {
                                    this.paintBody(var1, this.cx, this.cy - 8, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getBodyPaintId(), this.cx + this.dxBody * this.cdir, this.cy - SmallImage.getHeight(this.getLegId()) - 8 + var18 + this.dyBody, 2, 33);
                                }

                                this.paintMatna(var1, this.cx, this.cy - 8, 2);
                            }
                        }
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        if (this.arrItemMounts[4].sys < 2) {
                            label1628:
                            {
                                if (this.statusMe != 1 && this.statusMe != 6) {
                                    if (this.statusMe != 2 && this.statusMe != 10) {
                                        break label1628;
                                    }

                                    var10000 = GameCanvas.gameTick % 6 > 3 ? 1 : 0;
                                } else {
                                    var18 = GameCanvas.gameTick % 20 > 12 ? 1 : 0;
                                    if (var30 == null && var28 == null && var29 == null && var2 == null && var23 == null || this.cf > 1) {
                                        break label1628;
                                    }

                                    var10000 = this.cf;
                                }

                                var18 = var10000;
                            }

                            if (this.statusMe == 3) {
                                var26 = -5 * this.cdir;
                            }

                            if (this.cdir == 1) {
                                if (this.statusMe == 3) {
                                    SmallImage.drawSmallImage(var1, 2066, this.cx, this.cy + 2, 0, 33);
                                } else {
                                    SmallImage.drawSmallImage(var1, var18 == 0 ? 2064 : 2065, this.cx, this.cy, 0, 33);
                                }

                                if (var29 != null) {
                                    this.paintHair(var1, this.cx, this.cy - 8, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getHeadId(), this.cx + var26 + this.dxHead * this.cdir, this.cy - CharInfo[0][0][2] + var14.pi[CharInfo[0][0][0]].dy - 12 + var18 + this.dyHead, 0, 17);
                                }

                                if (var28 != null) {
                                    this.paintBody(var1, this.cx, this.cy - 8, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getBodyPaintId(), this.cx + this.dxBody * this.cdir, this.cy - SmallImage.getHeight(this.getLegId()) - 8 + var18 + this.dyBody, 0, 33);
                                }

                                this.paintMatna(var1, this.cx, this.cy - 8, 2);
                            } else {
                                if (this.statusMe == 3) {
                                    SmallImage.drawSmallImage(var1, 2066, this.cx, this.cy + 2, 2, 33);
                                } else {
                                    SmallImage.drawSmallImage(var1, var18 == 0 ? 2064 : 2065, this.cx, this.cy, 2, 33);
                                }

                                if (var29 != null) {
                                    this.paintHair(var1, this.cx, this.cy - 8, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getHeadId(), this.cx + var26 + this.dxHead * this.cdir, this.cy - CharInfo[0][0][2] + var14.pi[CharInfo[0][0][0]].dy - 12 + var18 + this.dyHead, 2, 17);
                                }

                                if (var28 != null) {
                                    this.paintBody(var1, this.cx, this.cy - 8, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getBodyPaintId(), this.cx + this.dxBody * this.cdir, this.cy - SmallImage.getHeight(this.getLegId()) - 8 + var18 + this.dyBody, 2, 33);
                                }

                                this.paintMatna(var1, this.cx, this.cy - 8, 2);
                            }
                        } else if (this.arrItemMounts[4].sys >= 2 && this.arrItemMounts[4].sys < 4) {
                            if ((var22 = this.getEffmoto()) != null) {
                                ++this.tickEffmoto;
                                if (this.tickEffmoto >= var22.length) {
                                    this.tickEffmoto = 0;
                                }
                            }

                            label1629:
                            {
                                if (this.statusMe != 1 && this.statusMe != 6) {
                                    if (this.statusMe != 2 && this.statusMe != 10) {
                                        break label1629;
                                    }

                                    var10000 = GameCanvas.gameTick % 6 > 3 ? 1 : 0;
                                } else {
                                    var18 = GameCanvas.gameTick % 20 > 12 ? 1 : 0;
                                    if (var30 == null && var28 == null && var29 == null && var2 == null && var23 == null || this.cf > 1) {
                                        break label1629;
                                    }

                                    var10000 = this.cf;
                                }

                                var18 = var10000;
                            }

                            if (this.statusMe == 3) {
                                var26 = -5 * this.cdir;
                            }

                            if (this.cdir == 1) {
                                if (this.statusMe == 3) {
                                    SmallImage.drawSmallImage(var1, 2070, this.cx, this.cy + 2, 0, 33);
                                } else if (this.statusMe == 4) {
                                    SmallImage.drawSmallImage(var1, var18 == 0 ? 2068 : 2069, this.cx, this.cy, 0, 33);
                                } else if (this.statusMe != 2 && this.statusMe != 10) {
                                    if (this.statusMe == 1 || this.statusMe == 6) {
                                        SmallImage.drawSmallImage(var1, var18 == 0 ? 2068 : 2069, this.cx, this.cy, 0, 33);
                                    }
                                } else {
                                    SmallImage.drawSmallImage(var1, var18 == 0 ? 2068 : 2069, this.cx, this.cy, 0, 33);
                                }

                                if (var29 != null) {
                                    this.paintHair(var1, this.cx, this.cy - 8, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getHeadId(), this.cx + var26 + this.dxHead * this.cdir, this.cy - CharInfo[0][0][2] + var14.pi[CharInfo[0][0][0]].dy - 12 + var18 + this.dyHead, 0, 17);
                                }

                                if (var28 != null) {
                                    this.paintBody(var1, this.cx, this.cy - 8, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getBodyPaintId(), this.cx + this.dxBody * this.cdir, this.cy - SmallImage.getHeight(this.getLegId()) - 8 + var18 + this.dyBody, 0, 33);
                                }

                                this.paintMatna(var1, this.cx, this.cy - 8, 2);
                            } else {
                                if (this.statusMe == 3) {
                                    SmallImage.drawSmallImage(var1, 2070, this.cx, this.cy + 2, 2, 33);
                                }

                                if (this.statusMe == 4) {
                                    SmallImage.drawSmallImage(var1, var18 == 0 ? 2068 : 2069, this.cx, this.cy, 2, 33);
                                } else if (this.statusMe != 2 && this.statusMe != 10) {
                                    if (this.statusMe == 1 || this.statusMe == 6) {
                                        SmallImage.drawSmallImage(var1, var18 == 0 ? 2068 : 2069, this.cx, this.cy, 2, 33);
                                    }
                                } else {
                                    SmallImage.drawSmallImage(var1, var18 == 0 ? 2068 : 2069, this.cx, this.cy, 2, 33);
                                }

                                if (var29 != null) {
                                    this.paintHair(var1, this.cx, this.cy - 8, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getHeadId(), this.cx + var26 + this.dxHead * this.cdir, this.cy - CharInfo[0][0][2] + var14.pi[CharInfo[0][0][0]].dy - 12 + var18 + this.dyHead, 2, 17);
                                }

                                if (var28 != null) {
                                    this.paintBody(var1, this.cx, this.cy - 8, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getBodyPaintId(), this.cx + this.dxBody * this.cdir, this.cy - SmallImage.getHeight(this.getLegId()) - 8 + var18 + this.dyBody, 2, 33);
                                }

                                this.paintMatna(var1, this.cx, this.cy - 8, 2);
                            }
                        } else {
                            if ((var22 = this.getEffmoto()) != null) {
                                ++this.tickEffmoto;
                                if (this.tickEffmoto >= var22.length) {
                                    this.tickEffmoto = 0;
                                }
                            }

                            label1630:
                            {
                                if (this.statusMe != 1 && this.statusMe != 6) {
                                    if (this.statusMe != 2 && this.statusMe != 10) {
                                        break label1630;
                                    }

                                    var10000 = GameCanvas.gameTick % 6 > 3 ? 1 : 0;
                                } else {
                                    var18 = GameCanvas.gameTick % 20 > 12 ? 1 : 0;
                                    if (var30 == null && var28 == null && var29 == null && var2 == null && var23 == null || this.cf > 1) {
                                        break label1630;
                                    }

                                    var10000 = this.cf;
                                }

                                var18 = var10000;
                            }

                            if (this.statusMe == 3) {
                                var26 = -5 * this.cdir;
                            }

                            if (this.cdir == 1) {
                                if (this.statusMe == 3) {
                                    SmallImage.drawSmallImage(var1, 2070, this.cx, this.cy + 2, 0, 33);
                                    SmallImage.drawSmallImage(var1, var22[this.tickEffmoto], this.cx + 13, this.cy - 17, 0, 33);
                                    SmallImage.drawSmallImage(var1, var22[this.tickEffmoto], this.cx - 24, this.cy + 2, 0, 33);
                                } else if (this.statusMe == 4) {
                                    SmallImage.drawSmallImage(var1, var18 == 0 ? 2068 : 2069, this.cx, this.cy, 0, 33);
                                    SmallImage.drawSmallImage(var1, var22[this.tickEffmoto], this.cx + 15, this.cy, 0, 33);
                                    SmallImage.drawSmallImage(var1, var22[this.tickEffmoto], this.cx - 27, this.cy, 0, 33);
                                } else if (this.statusMe != 2 && this.statusMe != 10) {
                                    if (this.statusMe == 1 || this.statusMe == 6) {
                                        SmallImage.drawSmallImage(var1, var18 == 0 ? 2068 : 2069, this.cx, this.cy, 0, 33);
                                        SmallImage.drawSmallImage(var1, var22[this.tickEffmoto], this.cx + 15, this.cy, 0, 33);
                                        SmallImage.drawSmallImage(var1, var22[this.tickEffmoto], this.cx - 27, this.cy, 0, 33);
                                    }
                                } else {
                                    SmallImage.drawSmallImage(var1, var18 == 0 ? 2068 : 2069, this.cx, this.cy, 0, 33);
                                    SmallImage.drawSmallImage(var1, var22[this.tickEffmoto], this.cx + 15, this.cy, 0, 33);
                                    SmallImage.drawSmallImage(var1, var22[this.tickEffmoto], this.cx - 27, this.cy, 0, 33);
                                }

                                if (var29 != null) {
                                    this.paintHair(var1, this.cx, this.cy - 8, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getHeadId(), this.cx + var26 + this.dxHead * this.cdir, this.cy - CharInfo[0][0][2] + var14.pi[CharInfo[0][0][0]].dy - 12 + var18 + this.dyHead, 0, 17);
                                }

                                if (var28 != null) {
                                    this.paintBody(var1, this.cx, this.cy - 8, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getBodyPaintId(), this.cx + this.dxBody * this.cdir, this.cy - SmallImage.getHeight(this.getLegId()) - 8 + var18 + this.dyBody, 0, 33);
                                }

                                this.paintMatna(var1, this.cx, this.cy - 8, 2);
                            } else {
                                if (this.statusMe == 3) {
                                    SmallImage.drawSmallImage(var1, 2070, this.cx, this.cy + 2, 2, 33);
                                    SmallImage.drawSmallImage(var1, var22[this.tickEffmoto], this.cx - 12, this.cy - 17, 2, 33);
                                    SmallImage.drawSmallImage(var1, var22[this.tickEffmoto], this.cx + 25, this.cy + 3, 2, 33);
                                }

                                if (this.statusMe == 4) {
                                    SmallImage.drawSmallImage(var1, var18 == 0 ? 2068 : 2069, this.cx, this.cy, 2, 33);
                                    SmallImage.drawSmallImage(var1, var22[this.tickEffmoto], this.cx - 15, this.cy, 2, 33);
                                    SmallImage.drawSmallImage(var1, var22[this.tickEffmoto], this.cx + 27, this.cy, 2, 33);
                                } else if (this.statusMe != 2 && this.statusMe != 10) {
                                    if (this.statusMe == 1 || this.statusMe == 6) {
                                        SmallImage.drawSmallImage(var1, var18 == 0 ? 2068 : 2069, this.cx, this.cy, 2, 33);
                                        SmallImage.drawSmallImage(var1, var22[this.tickEffmoto], this.cx - 15, this.cy, 2, 33);
                                        SmallImage.drawSmallImage(var1, var22[this.tickEffmoto], this.cx + 27, this.cy, 2, 33);
                                    }
                                } else {
                                    SmallImage.drawSmallImage(var1, var18 == 0 ? 2068 : 2069, this.cx, this.cy, 2, 33);
                                    SmallImage.drawSmallImage(var1, var22[this.tickEffmoto], this.cx - 15, this.cy, 2, 33);
                                    SmallImage.drawSmallImage(var1, var22[this.tickEffmoto], this.cx + 27, this.cy, 2, 33);
                                }

                                if (var29 != null) {
                                    this.paintHair(var1, this.cx, this.cy - 8, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getHeadId(), this.cx + var26 + this.dxHead * this.cdir, this.cy - CharInfo[0][0][2] + var14.pi[CharInfo[0][0][0]].dy - 12 + var18 + this.dyHead, 2, 17);
                                }

                                if (var28 != null) {
                                    this.paintBody(var1, this.cx, this.cy - 8, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getBodyPaintId(), this.cx + this.dxBody * this.cdir, this.cy - SmallImage.getHeight(this.getLegId()) - 8 + var18 + this.dyBody, 2, 33);
                                }

                                this.paintMatna(var1, this.cx, this.cy - 8, 2);
                            }
                        }
                    }
                } else if (this.isWolf) {
                    int[] var37;
                    if ((var37 = this.getEffwolf()) != null) {
                        ++this.tickEffFireW;
                        if (this.tickEffFireW >= var37.length) {
                            this.tickEffFireW = 0;
                        }
                    }

                    if (this.statusMe != 1 && this.statusMe != 6) {
                        if (this.statusMe == 2 || this.statusMe == 10) {
                            if (GameCanvas.gameTick % 12 <= 3) {
                                this.tickWolf = 0;
                            } else if (GameCanvas.gameTick % 12 <= 6) {
                                this.tickWolf = 1;
                                this.dy = 2;
                            } else if (GameCanvas.gameTick % 12 <= 9) {
                                this.tickWolf = 2;
                                this.dy = 4;
                            } else {
                                this.tickWolf = 3;
                                this.dy = 2;
                            }
                        }
                    } else {
                        this.tickWolf = GameCanvas.gameTick % 20 > 12 ? 1 : 0;
                        if ((var30 != null || var28 != null || var29 != null || var2 != null || var23 != null) && this.cf <= 1) {
                            this.tickWolf = this.cf;
                        }

                        this.dy = -this.tickWolf;
                    }

                    var22 = new int[]{2050, 2053, 2049, 2052};
                    int[] var32 = new int[]{2075, 2078, 2074, 2079};
                    var33 = new int[]{this.cy - 22, this.cy - 23, this.cy - 22, this.cy - 23};
                    var35 = new int[]{this.cy - 22, this.cy - 23, this.cy - 22, this.cy - 22};
                    if (this.statusMe == 3) {
                        this.hdx = -5 * this.cdir;
                        this.hdy = 0;
                    } else {
                        this.hdx = -3 * this.cdir;
                        this.hdy = 0;
                    }

                    byte var24;
                    if (this.arrItemMounts[4].template.id == 523) {
                        if (this.cdir == 1) {
                            if (var17 != null) {
                                SmallImage.drawSmallImage(var1, var17.pi[CharInfo[this.cf][3][0]].id, this.cx + CharInfo[this.cf][3][1] + var17.pi[CharInfo[this.cf][3][0]].dx, this.cy - CharInfo[this.cf][3][2] + var17.pi[CharInfo[this.cf][3][0]].dy - 10, 0, 0);
                            }

                            if (this.statusMe == 3) {
                                SmallImage.drawSmallImage(var1, 2051, this.cx, this.cy, 0, 33);
                            } else if (this.statusMe == 4) {
                                SmallImage.drawSmallImage(var1, 2052, this.cx, this.cy, 0, 33);
                            } else if (this.statusMe != 1 && this.statusMe != 6) {
                                if (this.statusMe == 2 || this.statusMe == 10) {
                                    SmallImage.drawSmallImage(var1, var22[this.tickWolf], this.cx, this.cy - this.dy, 0, 33);
                                }
                            } else {
                                SmallImage.drawSmallImage(var1, this.tickWolf == 0 ? 2047 : 2048, this.cx, this.cy, 0, 33);
                            }

                            var24 = 2;
                            if (this.cdir == 1) {
                                var24 = -2;
                            }

                            if (var29 != null) {
                                this.paintHair(var1, this.cx + var24, this.cy - 15, 2);
                            } else {
                                SmallImage.drawSmallImage(var1, this.getHeadId(), this.cx + this.hdx + this.dxHead * this.cdir, this.cy - CharInfo[0][0][2] + var14.pi[CharInfo[0][0][0]].dy - 12 - this.dy + this.dyHead, 0, 17);
                            }

                            if (var28 != null) {
                                this.paintBody(var1, this.cx + var24, this.cy - 15, 2);
                            } else {
                                SmallImage.drawSmallImage(var1, this.getBodyPaintId(), this.cx + this.hdx + this.dxBody * this.cdir, this.cy - SmallImage.getHeight(this.getLegId()) - 9 - this.dy + this.dyBody, 0, 33);
                            }

                            this.paintMatna(var1, this.cx + var24, this.cy - 15, 2);
                        } else {
                            if (var17 != null) {
                                SmallImage.drawSmallImage(var1, var17.pi[CharInfo[this.cf][3][0]].id, this.cx - CharInfo[this.cf][3][1] - var17.pi[CharInfo[this.cf][3][0]].dx, this.cy - CharInfo[this.cf][3][2] + var17.pi[CharInfo[this.cf][3][0]].dy - 10, 2, 24);
                            }

                            if (this.statusMe == 3) {
                                SmallImage.drawSmallImage(var1, 2051, this.cx, this.cy, 2, 33);
                            } else if (this.statusMe == 4) {
                                SmallImage.drawSmallImage(var1, 2052, this.cx, this.cy, 2, 33);
                            } else if (this.statusMe != 1 && this.statusMe != 6) {
                                if (this.statusMe == 2 || this.statusMe == 10) {
                                    SmallImage.drawSmallImage(var1, var22[this.tickWolf], this.cx, this.cy - this.dy, 2, 33);
                                }
                            } else {
                                SmallImage.drawSmallImage(var1, this.tickWolf == 0 ? 2047 : 2048, this.cx, this.cy, 2, 33);
                            }

                            var24 = 2;
                            if (this.cdir == 1) {
                                var24 = -2;
                            }

                            if (var29 != null) {
                                this.paintHair(var1, this.cx + var24, this.cy - 15, 2);
                            } else {
                                SmallImage.drawSmallImage(var1, this.getHeadId(), this.cx + this.hdx + this.dxHead * this.cdir, this.cy - CharInfo[0][0][2] + var14.pi[CharInfo[0][0][0]].dy - 12 - this.dy + this.dyHead, 2, 17);
                            }

                            if (var28 != null) {
                                this.paintBody(var1, this.cx + var24, this.cy - 15, 2);
                            } else {
                                SmallImage.drawSmallImage(var1, this.getBodyPaintId(), this.cx + this.hdx + this.dxBody * this.cdir, this.cy - SmallImage.getHeight(this.getLegId()) - 9 - this.dy + this.dyBody, 2, 33);
                            }

                            this.paintMatna(var1, this.cx + var24, this.cy - 15, 2);
                        }
                    } else if (this.arrItemMounts[4].template.id == 443) {
                        if (this.arrItemMounts[4].sys >= 3) {
                            if (this.cdir == 1) {
                                if (var17 != null) {
                                    SmallImage.drawSmallImage(var1, var17.pi[CharInfo[this.cf][3][0]].id, this.cx + CharInfo[this.cf][3][1] + var17.pi[CharInfo[this.cf][3][0]].dx, this.cy - CharInfo[this.cf][3][2] + var17.pi[CharInfo[this.cf][3][0]].dy - 10, 0, 0);
                                }

                                if (this.statusMe == 3) {
                                    SmallImage.drawSmallImage(var1, 2077, this.cx, this.cy, 0, 33);
                                    var1.drawRegion(GameScr.imgMatcho, 0, this.tickEffWolf * 3, 3, 3, 0, this.cx + 21, this.cy - 30, 0);
                                } else if (this.statusMe == 4) {
                                    SmallImage.drawSmallImage(var1, 2076, this.cx, this.cy, 0, 33);
                                    var1.drawRegion(GameScr.imgMatcho, 0, this.tickEffWolf * 3, 3, 3, 0, this.cx + 21, this.cy - 19, 0);
                                } else if (this.statusMe != 1 && this.statusMe != 6) {
                                    if (this.statusMe == 2 || this.statusMe == 10) {
                                        SmallImage.drawSmallImage(var1, var32[this.tickWolf], this.cx, this.cy - this.dy, 0, 33);
                                        var1.drawRegion(GameScr.imgMatcho, 0, this.tickEffWolf * 3, 3, 3, 0, this.cx + 21, var33[this.tickWolf], 0);
                                    }
                                } else {
                                    SmallImage.drawSmallImage(var1, this.tickWolf == 0 ? 2073 : 2072, this.cx, this.cy, 0, 33);
                                    var1.drawRegion(GameScr.imgMatcho, 0, this.tickEffWolf * 3, 3, 3, 0, this.cx + 21, this.cy - 19, 0);
                                }

                                var24 = 2;
                                if (this.cdir == 1) {
                                    var24 = -2;
                                }

                                if (var29 != null) {
                                    this.paintHair(var1, this.cx + var24, this.cy - 15, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getHeadId(), this.cx + this.hdx + this.dxHead * this.cdir, this.cy - CharInfo[0][0][2] + var14.pi[CharInfo[0][0][0]].dy - 12 - this.dy + this.dyHead, 0, 17);
                                }

                                if (var28 != null) {
                                    this.paintBody(var1, this.cx + var24, this.cy - 15, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getBodyPaintId(), this.cx + this.hdx + this.dxBody * this.cdir, this.cy - SmallImage.getHeight(this.getLegId()) - 9 - this.dy + this.dyBody, 0, 33);
                                }

                                this.paintMatna(var1, this.cx + var24, this.cy - 15, 2);
                            } else {
                                if (var17 != null) {
                                    SmallImage.drawSmallImage(var1, var17.pi[CharInfo[this.cf][3][0]].id, this.cx - CharInfo[this.cf][3][1] - var17.pi[CharInfo[this.cf][3][0]].dx, this.cy - CharInfo[this.cf][3][2] + var17.pi[CharInfo[this.cf][3][0]].dy - 10, 2, 24);
                                }

                                if (this.statusMe == 3) {
                                    SmallImage.drawSmallImage(var1, 2077, this.cx, this.cy, 2, 33);
                                    var1.drawRegion(GameScr.imgMatcho, 0, this.tickEffWolf * 3, 3, 3, 0, this.cx - 23, this.cy - 30, 0);
                                } else if (this.statusMe == 4) {
                                    SmallImage.drawSmallImage(var1, 2076, this.cx, this.cy, 2, 33);
                                    var1.drawRegion(GameScr.imgMatcho, 0, this.tickEffWolf * 3, 3, 3, 0, this.cx - 24, this.cy - 20, 0);
                                } else if (this.statusMe != 1 && this.statusMe != 6) {
                                    if (this.statusMe == 2 || this.statusMe == 10) {
                                        SmallImage.drawSmallImage(var1, var32[this.tickWolf], this.cx, this.cy - this.dy, 2, 33);
                                        var1.drawRegion(GameScr.imgMatcho, 0, this.tickEffWolf * 3, 3, 3, 0, this.cx - 24, var35[this.tickWolf], 0);
                                    }
                                } else {
                                    SmallImage.drawSmallImage(var1, this.tickWolf == 0 ? 2073 : 2072, this.cx, this.cy, 2, 33);
                                    var1.drawRegion(GameScr.imgMatcho, 0, this.tickEffWolf * 3, 3, 3, 0, this.cx - 24, this.cy - 20, 0);
                                }

                                var24 = 2;
                                if (this.cdir == 1) {
                                    var24 = -2;
                                }

                                if (var29 != null) {
                                    this.paintHair(var1, this.cx + var24, this.cy - 15, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getHeadId(), this.cx + this.hdx + this.dxHead * this.cdir, this.cy - CharInfo[0][0][2] + var14.pi[CharInfo[0][0][0]].dy - 12 - this.dy + this.dyHead, 2, 17);
                                }

                                if (var28 != null) {
                                    this.paintBody(var1, this.cx + var24, this.cy - 15, 2);
                                } else {
                                    SmallImage.drawSmallImage(var1, this.getBodyPaintId(), this.cx + this.hdx + this.dxBody * this.cdir, this.cy - SmallImage.getHeight(this.getLegId()) - 9 - this.dy + this.dyBody, 2, 33);
                                }

                                this.paintMatna(var1, this.cx + var24, this.cy - 15, 2);
                            }
                        } else if (this.cdir == 1) {
                            if (var17 != null) {
                                SmallImage.drawSmallImage(var1, var17.pi[CharInfo[this.cf][3][0]].id, this.cx + CharInfo[this.cf][3][1] + var17.pi[CharInfo[this.cf][3][0]].dx, this.cy - CharInfo[this.cf][3][2] + var17.pi[CharInfo[this.cf][3][0]].dy - 10, 0, 0);
                            }

                            if (this.statusMe == 3) {
                                SmallImage.drawSmallImage(var1, 1716, this.cx, this.cy, 0, 33);
                            } else if (this.statusMe == 4) {
                                SmallImage.drawSmallImage(var1, 1717, this.cx, this.cy, 0, 33);
                            } else if (this.statusMe != 1 && this.statusMe != 6) {
                                if (this.statusMe == 2 || this.statusMe == 10) {
                                    SmallImage.drawSmallImage(var1, this.idWolfW[this.tickWolf], this.cx, this.cy - this.dy, 0, 33);
                                }
                            } else {
                                SmallImage.drawSmallImage(var1, this.tickWolf == 0 ? 1712 : 1713, this.cx, this.cy, 0, 33);
                            }

                            var24 = 2;
                            if (this.cdir == 1) {
                                var24 = -2;
                            }

                            if (var29 != null) {
                                this.paintHair(var1, this.cx + var24, this.cy - 14, 2);
                            } else {
                                SmallImage.drawSmallImage(var1, this.getHeadId(), this.cx + this.hdx + this.dxHead * this.cdir, this.cy - CharInfo[0][0][2] + var14.pi[CharInfo[0][0][0]].dy - 12 - this.dy + this.dyHead, 0, 17);
                            }

                            if (var28 != null) {
                                this.paintBody(var1, this.cx + var24, this.cy - 14, 2);
                            } else {
                                SmallImage.drawSmallImage(var1, this.getBodyPaintId(), this.cx + this.hdx + this.dxBody * this.cdir, this.cy - SmallImage.getHeight(this.getLegId()) - 9 - this.dy + this.dyBody, 0, 33);
                            }

                            this.paintMatna(var1, this.cx + var24, this.cy - 14, 2);
                        } else {
                            if (var17 != null) {
                                SmallImage.drawSmallImage(var1, var17.pi[CharInfo[this.cf][3][0]].id, this.cx - CharInfo[this.cf][3][1] - var17.pi[CharInfo[this.cf][3][0]].dx, this.cy - CharInfo[this.cf][3][2] + var17.pi[CharInfo[this.cf][3][0]].dy - 10, 2, 24);
                            }

                            if (this.statusMe == 3) {
                                SmallImage.drawSmallImage(var1, 1716, this.cx, this.cy, 2, 33);
                            } else if (this.statusMe == 4) {
                                SmallImage.drawSmallImage(var1, 1717, this.cx, this.cy, 2, 33);
                            } else if (this.statusMe != 1 && this.statusMe != 6) {
                                if (this.statusMe == 2 || this.statusMe == 10) {
                                    SmallImage.drawSmallImage(var1, this.idWolfW[this.tickWolf], this.cx, this.cy - this.dy, 2, 33);
                                }
                            } else {
                                SmallImage.drawSmallImage(var1, this.tickWolf == 0 ? 1712 : 1713, this.cx, this.cy, 2, 33);
                            }

                            var24 = 2;
                            if (this.cdir == 1) {
                                var24 = -2;
                            }

                            if (var29 != null) {
                                this.paintHair(var1, this.cx - var24, this.cy - 14, 2);
                            } else {
                                SmallImage.drawSmallImage(var1, this.getHeadId(), this.cx + this.hdx + this.dxHead * this.cdir, this.cy - CharInfo[0][0][2] + var14.pi[CharInfo[0][0][0]].dy - 12 - this.dy + this.dyHead, 2, 17);
                            }

                            if (var28 != null) {
                                this.paintBody(var1, this.cx + var24, this.cy - 14, 2);
                            } else {
                                SmallImage.drawSmallImage(var1, this.getBodyPaintId(), this.cx + this.hdx + this.dxBody * this.cdir, this.cy - SmallImage.getHeight(this.getLegId()) - 9 - this.dy + this.dyBody, 2, 33);
                            }

                            this.paintMatna(var1, this.cx + var24, this.cy - 14, 2);
                        }
                    }
                } else {
                    byte var38 = 2;
                    byte var36 = 24;
                    if (this.cdir == 1) {
                        var38 = 0;
                        var36 = 0;
                    }

                    if (this.isNewMount) {
                        this.paintNewMount(var1, var17, var14, var33);
                        if (var25 != null) {
                            var25.paintTopEff_new(var1, this.cx, this.cy - this.getDyHorse(), this.FrameSusan, this.cdir == 1 ? 0 : 2);
                        }

                        this.paintPP_Top(var1);
                        if (var7 != null) {
                            var7.paintTopEff_new(var1, this.cx, this.cy - this.getDyHorse(), this.FrameName, 0);
                        }

                        if (var6 != null) {
                            var6.paintTopEff_new(var1, this.cx, this.cy - this.getDyHorse(), this.FrameRank, this.cdir == 1 ? 0 : 2);
                        }

                        if (var2 != null) {
                            this.paintWeaponTop(var1, this.cx, this.cy, 2, var2);
                        }

                        return;
                    }

                    if (this.isMotoBehind) {
                        if (this.isHaveNewMount()) {
                            this.paintBehindNewMount(var1);
                        } else if (!this.isMoto && !this.isWolf) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                if (this.arrItemMounts[4].sys <= 1) {
                                    SmallImage.drawSmallImage(var1, 1800, this.lcx, this.lcy, 2, 33);
                                } else {
                                    SmallImage.drawSmallImage(var1, 2063, this.lcx, this.lcy, 2, 33);
                                }
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                if (this.arrItemMounts[4].sys <= 1) {
                                    SmallImage.drawSmallImage(var1, 2067, this.lcx, this.lcy, 2, 33);
                                } else {
                                    SmallImage.drawSmallImage(var1, 2071, this.lcx, this.lcy, 2, 33);
                                }
                            }
                        }
                    }

                    if (var33 != null && var30 == null) {
                        SmallImage.drawSmallImage(var1, var33[this.tickCoat], this.cx + this.dxnewhorse - 7 * this.cdir, this.cy - this.dynewhhorse - 18, var38, 17);
                    }

                    if (var17 != null) {
                        SmallImage.drawSmallImage(var1, var17.pi[CharInfo[this.cf][3][0]].id, this.cx + this.dxnewhorse + (CharInfo[this.cf][3][1] + var17.pi[CharInfo[this.cf][3][0]].dx) * this.cdir, this.cy - this.dynewhhorse - CharInfo[this.cf][3][2] + var17.pi[CharInfo[this.cf][3][0]].dy, var38, var36);
                    }

                    if (var27 == null) {
                        if (var8 != null) {
                            var8.paintBottomEff_new(var1, this.cx, this.cy, this.getFrameLeg(), this.cdir == 1 ? 0 : 2);
                            var8.paintTopEff_new(var1, this.cx, this.cy, this.getFrameLeg(), this.cdir == 1 ? 0 : 2);
                        } else {
                            SmallImage.drawSmallImage(var1, var15.pi[CharInfo[this.cf][1][0]].id, this.cx + (CharInfo[this.cf][1][1] + var15.pi[CharInfo[this.cf][1][0]].dx) * this.cdir, this.cy - CharInfo[this.cf][1][2] + var15.pi[CharInfo[this.cf][1][0]].dy, var38, var36);
                        }
                    }

                    if (this.statusMe != 2) {
                        this.paintClanEffect(var1, this.cx + 7 * this.cdir, this.cy - 2 - this.getDyHorse());
                    }

                    if (this.statusMe != 1 && this.statusMe != 6) {
                        if (var29 != null) {
                            var29.paintBottomEff_new(var1, this.cx + this.dxnewhorse, this.cy - this.dynewhhorse, this.getFrameHair(), this.cdir == 1 ? 0 : 2);
                            var29.paintTopEff_new(var1, this.cx + this.dxnewhorse, this.cy - this.dynewhhorse, this.getFrameHair(), this.cdir == 1 ? 0 : 2);
                        } else {
                            SmallImage.drawSmallImage(var1, var14.pi[CharInfo[this.cf][0][0]].id, this.cx + this.dxnewhorse + (CharInfo[this.cf][0][1] + var14.pi[CharInfo[this.cf][0][0]].dx) * this.cdir, this.cy - this.dynewhhorse - CharInfo[this.cf][0][2] + var14.pi[CharInfo[this.cf][0][0]].dy, var38, var36);
                        }
                    }

                    if (var28 != null) {
                        var28.paintBottomEff_new(var1, this.cx + this.dxnewhorse, this.cy - this.dynewhhorse, this.getFrameBody(), this.cdir == 1 ? 0 : 2);
                        var28.paintTopEff_new(var1, this.cx + this.dxnewhorse, this.cy - this.dynewhhorse, this.getFrameBody(), this.cdir == 1 ? 0 : 2);
                    } else {
                        SmallImage.drawSmallImage(var1, var16.pi[CharInfo[this.cf][2][0]].id, this.cx + this.dxnewhorse + (CharInfo[this.cf][2][1] + var16.pi[CharInfo[this.cf][2][0]].dx) * this.cdir, this.cy - CharInfo[this.cf][2][2] + var16.pi[CharInfo[this.cf][2][0]].dy - this.dynewhhorse, var38, var36);
                    }

                    if (this.statusMe == 1 || this.statusMe == 6) {
                        if (var29 != null) {
                            var29.paintBottomEff_new(var1, this.cx + this.dxnewhorse, this.cy - this.dynewhhorse, this.getFrameHair(), this.cdir == 1 ? 0 : 2);
                            var29.paintTopEff_new(var1, this.cx + this.dxnewhorse, this.cy - this.dynewhhorse, this.getFrameHair(), this.cdir == 1 ? 0 : 2);
                        } else {
                            SmallImage.drawSmallImage(var1, var14.pi[CharInfo[this.cf][0][0]].id, this.cx + this.dxnewhorse + (CharInfo[this.cf][0][1] + var14.pi[CharInfo[this.cf][0][0]].dx) * this.cdir, this.cy - this.dynewhhorse - CharInfo[this.cf][0][2] + var14.pi[CharInfo[this.cf][0][0]].dy, var38, var36);
                        }
                    }

                    if (var23 != null) {
                        var23.paintBottomEff_new(var1, this.cx + this.dxnewhorse, this.cy - this.dynewhhorse, this.getFrameMatna(), this.cdir == 1 ? 0 : 2);
                        var23.paintTopEff_new(var1, this.cx + this.dxnewhorse, this.cy - this.dynewhhorse, this.getFrameMatna(), this.cdir == 1 ? 0 : 2);
                    }

                    if (this.statusMe == 2) {
                        this.paintClanEffectRun(var1, this.cx - 14 * this.cdir, this.cy - 2 - this.getDyHorse());
                        this.paintClanEffect2(var1, this.cx + 7 * this.cdir, this.cy - 2 - this.getDyHorse());
                    } else {
                        this.paintClanEffect(var1, this.cx - 7 * this.cdir, this.cy - 2 - this.getDyHorse());
                        this.paintClanEffect2(var1, this.cx + 11 * this.cdir, this.cy - 2 - this.getDyHorse());
                    }
                }

                if (var27 != null) {
                    var27.paintTopEff_new(var1, this.cx, this.cy, this.getFrameHores(), this.cdir == 1 ? 2 : 0);
                }

                if (var25 != null) {
                    var25.paintTopEff_new(var1, this.cx, this.cy - this.getDyHorse(), this.FrameSusan, this.cdir == 1 ? 0 : 2);
                }

                this.paintPP_Top(var1);
                if (var7 != null) {
                    var7.paintTopEff_new(var1, this.cx, this.cy - this.getDyHorse(), this.FrameName, 0);
                }

                if (var6 != null) {
                    var6.paintTopEff_new(var1, this.cx, this.cy - this.getDyHorse(), this.FrameRank, this.cdir == 1 ? 0 : 2);
                }

                if (var2 != null) {
                    this.paintWeaponTop(var1, this.cx, this.cy, 2, var2);
                }
            }

            if (this.isLockAttack) {
                SmallImage.drawSmallImage(var1, 290, this.cx, this.cy, 0, 33);
                return;
            }
        } catch (Exception var19) {
        }

    }

    private int getLegId() {
        CharPartInfo var1;
        if ((var1 = (CharPartInfo) CharPartInfo.head_jump.get(String.valueOf(this.leg))) != null) {
            return var1.idSmall;
        } else {
            switch (this.leg) {
                case 0:
                    return 26;
                case 4:
                    return 58;
                case 6:
                    return 86;
                case 8:
                    return 114;
                case 9:
                    return 123;
                case 17:
                    return 353;
                case 19:
                    return 379;
                case 21:
                    return 405;
                case 30:
                    return 484;
                case 33:
                    return 518;
                case 35:
                    return 544;
                case 37:
                    return 571;
                case 39:
                    return 810;
                case 43:
                    return 982;
                case 95:
                    return 1156;
                case 142:
                    return 1360;
                case 155:
                    return 1494;
                case 157:
                    return 1519;
                default:
                    return 26;
            }
        }
    }

    private int getBodyPaintId() {
        this.dxBody = 0;
        this.dyBody = 0;
        CharPartInfo var1 = null;
        Part var2 = GameScr.parts[this.body];
        CharPartInfo var3;
        if (this.statusMe == 3) {
            if ((var1 = (CharPartInfo) CharPartInfo.body_jump.get(String.valueOf(this.body))) != null && (var3 = (CharPartInfo) var1.item.get(String.valueOf(this.arrItemMounts[4].template.id))) != null) {
                this.dxBody = var3.dx;
                this.dyBody = var3.dy;
                return var2 != null ? var2.pi[this.frameFix].id : var1.idSmall;
            } else {
                switch (this.body) {
                    case 1:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 4;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 4;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -8;
                            this.dyBody = -6;
                        }

                        return 13;
                    case 3:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 4;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 4;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -8;
                            this.dyBody = -6;
                        }

                        return 45;
                    case 5:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 4;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 4;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -9;
                            this.dyBody = -7;
                        }

                        return 73;
                    case 7:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 4;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 4;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -9;
                            this.dyBody = -7;
                        }

                        return 101;
                    case 10:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 4;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 4;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -9;
                            this.dyBody = -7;
                        }

                        return 137;
                    case 18:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 4;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 4;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -9;
                            this.dyBody = -7;
                        }

                        return 365;
                    case 20:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 4;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 4;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -9;
                            this.dyBody = -7;
                        }

                        return 391;
                    case 22:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 4;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 4;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -9;
                            this.dyBody = -7;
                        }

                        return 417;
                    case 29:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 1;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 1;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -3;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -11;
                            this.dyBody = -6;
                        }

                        return 472;
                    case 32:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 1;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 1;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -3;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -11;
                            this.dyBody = -6;
                        }

                        return 506;
                    case 34:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 3;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 3;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -8;
                            this.dyBody = -7;
                        }

                        return 531;
                    case 36:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 3;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 3;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -8;
                            this.dyBody = -7;
                        }

                        return 559;
                    case 38:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 3;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 3;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -8;
                            this.dyBody = -7;
                        }

                        return 798;
                    case 42:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 3;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 3;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -8;
                            this.dyBody = -7;
                        }

                        return 970;
                    case 94:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -4;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -12;
                            this.dyBody = -7;
                        }

                        return 1142;
                    case 141:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 3;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 3;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -9;
                            this.dyBody = -7;
                        }

                        return 1348;
                    case 154:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = -3;
                            this.dyBody = 0;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = -3;
                            this.dyBody = 0;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -8;
                            this.dyBody = 0;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -15;
                            this.dyBody = -3;
                        }

                        return 1487;
                    case 156:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 1;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 1;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -4;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -10;
                            this.dyBody = -7;
                        }

                        return 1507;
                    case 157:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 4;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 4;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -8;
                            this.dyBody = -7;
                        }

                        return 1812;
                    case 173:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 4;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 4;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -8;
                            this.dyBody = -7;
                        }

                        return 1838;
                    case 180:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 4;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 4;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -8;
                            this.dyBody = -7;
                        }

                        return 1959;
                    case 183:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 4;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 4;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -8;
                            this.dyBody = -7;
                        }

                        return 1987;
                    case 186:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = -3;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = -3;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -6;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -14;
                            this.dyBody = -5;
                        }

                        return 2117;
                    case 189:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = -3;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = -3;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -6;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -14;
                            this.dyBody = -5;
                        }

                        return 2144;
                    case 197:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -5;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -10;
                            this.dyBody = -6;
                        }

                        return 2342;
                    case 199:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -5;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -10;
                            this.dyBody = -6;
                        }

                        return 2373;
                    case 206:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = -1;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -5;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -10;
                            this.dyBody = -6;
                        }

                        return 2459;
                    default:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 3;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 3;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = 0;
                            this.dyBody = -4;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -7;
                            this.dyBody = -6;
                        }

                        return 13;
                }
            }
        } else if (!this.isBocdau) {
            if ((var1 = (CharPartInfo) CharPartInfo.body_normal.get(String.valueOf(this.body))) != null && (var3 = (CharPartInfo) var1.item.get(String.valueOf(this.arrItemMounts[4].template.id))) != null) {
                this.dxBody = var3.dx;
                this.dyBody = var3.dy;
                return var2 != null ? var2.pi[this.frameFix].id : var1.idSmall;
            } else {
                switch (this.body) {
                    case 1:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 2;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 2;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = 0;
                            this.dyBody = 0;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -5;
                            this.dyBody = -2;
                        }

                        return 9;
                    case 3:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = -3;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = 0;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -5;
                            this.dyBody = -3;
                        }

                        return 41;
                    case 5:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -6;
                            this.dyBody = -2;
                        }

                        return 70;
                    case 7:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -6;
                            this.dyBody = -2;
                        }

                        return 97;
                    case 10:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -6;
                            this.dyBody = -2;
                        }

                        return 133;
                    case 18:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -6;
                            this.dyBody = -2;
                        }

                        return 369;
                    case 20:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -6;
                            this.dyBody = -2;
                        }

                        return 395;
                    case 22:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -6;
                            this.dyBody = -2;
                        }

                        return 421;
                    case 29:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = 0;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -6;
                            this.dyBody = -2;
                        }

                        return 468;
                    case 32:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = 0;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -6;
                            this.dyBody = -2;
                        }

                        return 502;
                    case 34:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = 0;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -5;
                            this.dyBody = -2;
                        }

                        return 540;
                    case 36:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = 0;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -5;
                            this.dyBody = -2;
                        }

                        return 555;
                    case 38:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = 0;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -5;
                            this.dyBody = -2;
                        }

                        return 794;
                    case 42:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = 0;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -5;
                            this.dyBody = -2;
                        }

                        return 966;
                    case 94:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = 0;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -5;
                            this.dyBody = -2;
                        }

                        return 1139;
                    case 141:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = -2;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = -2;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -3;
                            this.dyBody = 0;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -7;
                            this.dyBody = -1;
                        }

                        return 1343;
                    case 154:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = 0;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = 0;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = 0;
                            this.dyBody = 1;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -3;
                            this.dyBody = -1;
                        }

                        return 1479;
                    case 156:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 3;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 3;
                            this.dyBody = -2;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = 0;
                            this.dyBody = 2;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -3;
                            this.dyBody = 0;
                        }

                        return 1502;
                    case 157:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -6;
                            this.dyBody = -2;
                        }

                        return 1808;
                    case 173:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -6;
                            this.dyBody = -2;
                        }

                        return 1834;
                    case 180:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -6;
                            this.dyBody = -2;
                        }

                        return 1955;
                    case 183:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -1;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -6;
                            this.dyBody = -2;
                        }

                        return 1983;
                    case 186:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -2;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -8;
                            this.dyBody = -2;
                        }

                        return 2135;
                    case 189:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 0;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 0;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -2;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -8;
                            this.dyBody = -2;
                        }

                        return 2135;
                    case 197:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = -3;
                            this.dyBody = 0;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = -3;
                            this.dyBody = 0;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -4;
                            this.dyBody = 0;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -5;
                            this.dyBody = -1;
                        }

                        return 2337;
                    case 199:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = -3;
                            this.dyBody = 0;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = -3;
                            this.dyBody = 0;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -4;
                            this.dyBody = 0;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -5;
                            this.dyBody = -1;
                        }

                        return 2363;
                    case 206:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = -3;
                            this.dyBody = 0;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = -3;
                            this.dyBody = 0;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = -4;
                            this.dyBody = 0;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -9;
                            this.dyBody = -1;
                        }

                        return 2456;
                    default:
                        if (this.arrItemMounts[4].template.id == 443) {
                            this.dxBody = 2;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 523) {
                            this.dxBody = 2;
                            this.dyBody = -1;
                        } else if (this.arrItemMounts[4].template.id == 485) {
                            this.dxBody = 0;
                            this.dyBody = 0;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxBody = -5;
                            this.dyBody = -2;
                        }

                        return 9;
                }
            }
        } else if ((var1 = (CharPartInfo) CharPartInfo.body_boc_dau.get(String.valueOf(this.body))) != null && (var3 = (CharPartInfo) var1.item.get(String.valueOf(this.arrItemMounts[4].template.id))) != null) {
            this.dxBody = var3.dx;
            this.dyBody = var3.dy;
            return var2 != null ? var2.pi[this.frameFix].id : var1.idSmall;
        } else {
            switch (this.body) {
                case 1:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 3;
                        this.dyBody = -3;
                        this.dxBody = 4;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 3;
                        this.dyBody = -3;
                        this.dxBody = 4;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -8;
                        this.dyBody = -6;
                    }

                    return 13;
                case 3:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 4;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 4;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -8;
                        this.dyBody = -6;
                    }

                    return 45;
                case 5:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 4;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 4;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -9;
                        this.dyBody = -7;
                    }

                    return 73;
                case 7:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 4;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 4;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -9;
                        this.dyBody = -7;
                    }

                    return 101;
                case 10:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 4;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 4;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -9;
                        this.dyBody = -7;
                    }

                    return 137;
                case 18:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 4;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 4;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -9;
                        this.dyBody = -7;
                    }

                    return 365;
                case 20:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 4;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 4;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -9;
                        this.dyBody = -7;
                    }

                    return 391;
                case 22:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 4;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 4;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -9;
                        this.dyBody = -7;
                    }

                    return 417;
                case 29:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 1;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 1;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -3;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -11;
                        this.dyBody = -6;
                    }

                    return 472;
                case 32:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 1;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 1;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -3;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -11;
                        this.dyBody = -6;
                    }

                    return 506;
                case 34:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 3;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 3;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -8;
                        this.dyBody = -7;
                    }

                    return 531;
                case 36:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 3;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 3;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -8;
                        this.dyBody = -7;
                    }

                    return 559;
                case 38:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 3;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 3;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -8;
                        this.dyBody = -7;
                    }

                    return 798;
                case 42:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 3;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 3;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -8;
                        this.dyBody = -7;
                    }

                    return 970;
                case 94:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 0;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 0;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -4;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -12;
                        this.dyBody = -7;
                    }

                    return 1142;
                case 141:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 3;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 3;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -9;
                        this.dyBody = -7;
                    }

                    return 1348;
                case 154:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = -3;
                        this.dyBody = 0;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = -3;
                        this.dyBody = 0;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -8;
                        this.dyBody = 0;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -15;
                        this.dyBody = -3;
                    }

                    return 1487;
                case 156:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 1;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 1;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -4;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -10;
                        this.dyBody = -7;
                    }

                    return 1507;
                case 157:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 4;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 4;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -8;
                        this.dyBody = -7;
                    }

                    return 1812;
                case 173:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 4;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 4;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -8;
                        this.dyBody = -7;
                    }

                    return 1838;
                case 180:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 4;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 4;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -8;
                        this.dyBody = -7;
                    }

                    return 1959;
                case 183:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 4;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 4;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -8;
                        this.dyBody = -7;
                    }

                    return 1987;
                case 186:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = -3;
                        this.dyBody = -2;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = -3;
                        this.dyBody = -2;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -6;
                        this.dyBody = -2;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -14;
                        this.dyBody = -5;
                    }

                    return 2117;
                case 189:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = -3;
                        this.dyBody = -2;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = -3;
                        this.dyBody = -2;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -6;
                        this.dyBody = -2;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -14;
                        this.dyBody = -5;
                    }

                    return 2144;
                case 197:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -5;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -10;
                        this.dyBody = -6;
                    }

                    return 2342;
                case 199:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -5;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -10;
                        this.dyBody = -6;
                    }

                    return 2373;
                case 206:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = -1;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = -5;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -10;
                        this.dyBody = -6;
                    }

                    return 2459;
                default:
                    if (this.arrItemMounts[4].template.id == 443) {
                        this.dxBody = 3;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 523) {
                        this.dxBody = 3;
                        this.dyBody = -3;
                    } else if (this.arrItemMounts[4].template.id == 485) {
                        this.dxBody = 0;
                        this.dyBody = -4;
                    } else if (this.arrItemMounts[4].template.id == 524) {
                        this.dxBody = -7;
                        this.dyBody = -6;
                    }

                    return 13;
            }
        }
    }

    private int getHeadId() {
        this.dxHead = this.dyHead = 0;
        Part var1 = GameScr.parts[this.head];
        CharPartInfo var2 = null;
        CharPartInfo var3;
        if (this.statusMe == 3) {
            if ((var2 = (CharPartInfo) CharPartInfo.head_jump.get(String.valueOf(this.head))) != null && (var3 = (CharPartInfo) var2.item.get(String.valueOf(this.arrItemMounts[4].template.id))) != null) {
                this.dxHead = var3.dx;
                this.dyHead = var3.dy;
                return var1 != null ? var1.pi[this.frameFix].id : var2.idSmall;
            } else {
                switch (this.head) {
                    case 2:
                        this.dxHead = 0;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 33;
                    case 11:
                        this.dxHead = 0;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 147;
                    case 23:
                        this.dxHead = 1;
                        this.dyHead = -4;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 427;
                    case 24:
                        this.dxHead = 1;
                        this.dyHead = -4;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 430;
                    case 25:
                        this.dxHead = 3;
                        this.dyHead = -4;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 433;
                    case 26:
                        this.dxHead = 0;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 436;
                    case 27:
                        this.dxHead = 0;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 439;
                    case 28:
                        this.dxHead = 0;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 442;
                    case 112:
                        this.dxHead = 1;
                        this.dyHead = -4;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 148;
                    case 113:
                        this.dxHead = -1;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 443;
                    case 124:
                        this.dxHead = 1;
                        this.dyHead = -4;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1235;
                    case 125:
                        this.dxHead = -1;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1237;
                    case 126:
                        this.dxHead = -1;
                        this.dyHead = -4;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1255;
                    case 127:
                        this.dxHead = -1;
                        this.dyHead = -4;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1257;
                    case 137:
                        this.dxHead = 0;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1309;
                    case 138:
                        this.dxHead = 0;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1311;
                    case 139:
                        this.dxHead = 2;
                        this.dyHead = -5;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1315;
                    case 140:
                        this.dxHead = 3;
                        this.dyHead = -4;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1313;
                    case 146:
                        this.dxHead = 1;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1416;
                    case 147:
                        this.dxHead = -2;
                        this.dyHead = -4;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1418;
                    case 148:
                        this.dxHead = 0;
                        this.dyHead = -4;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1422;
                    case 149:
                        this.dxHead = -2;
                        this.dyHead = -4;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1424;
                    case 150:
                        this.dxHead = 0;
                        this.dyHead = -4;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1441;
                    case 151:
                        this.dxHead = -2;
                        this.dyHead = -4;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1439;
                    case 152:
                        this.dxHead = 1;
                        this.dyHead = -4;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1447;
                    case 153:
                        this.dxHead = 0;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1445;
                    case 158:
                        this.dxHead = -2;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1585;
                    case 159:
                        this.dxHead = 0;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1589;
                    case 160:
                        this.dxHead = 2;
                        this.dyHead = -2;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1587;
                    case 161:
                        this.dxHead = 3;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1595;
                    case 162:
                        this.dxHead = -5;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1597;
                    case 163:
                        this.dxHead = -3;
                        this.dyHead = -2;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1604;
                    case 179:
                        this.dxHead = 3;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 1978;
                    case 182:
                        this.dxHead = 3;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 2006;
                    case 185:
                        this.dxHead = -4;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 2129;
                    case 188:
                        this.dxHead = 0;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 2156;
                    case 205:
                        this.dxHead = 0;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 2451;
                    case 210:
                        this.dxHead = 0;
                        this.dyHead = -5;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 2519;
                    case 211:
                        this.dxHead = -1;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 2521;
                    case 212:
                        this.dxHead = -2;
                        this.dyHead = -2;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 2523;
                    case 213:
                        this.dxHead = 0;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 2525;
                    case 214:
                        this.dxHead = 1;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 2526;
                    default:
                        this.dxHead = 2;
                        this.dyHead = -5;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                this.dxHead -= 2;
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 7;
                                --this.dyHead;
                            }
                        }

                        return 33;
                }
            }
        } else if (!this.isBocdau) {
            if ((var2 = (CharPartInfo) CharPartInfo.head_normal.get(String.valueOf(this.head))) != null && (var3 = (CharPartInfo) var2.item.get(String.valueOf(this.arrItemMounts[4].template.id))) != null) {
                this.dxHead = var3.dx;
                this.dyHead = var3.dy;
                return var1 != null ? var1.pi[this.frameFix].id : var2.idSmall;
            } else {
                switch (this.head) {
                    case 2:
                        this.dxHead = -1;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 33;
                    case 11:
                        this.dxHead = -2;
                        this.dyHead = -1;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 147;
                    case 23:
                        this.dxHead = -1;
                        this.dyHead = -2;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 427;
                    case 24:
                        this.dxHead = -1;
                        this.dyHead = -2;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 430;
                    case 25:
                        this.dxHead = 1;
                        this.dyHead = -2;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 433;
                    case 26:
                        this.dxHead = -2;
                        this.dyHead = -1;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 436;
                    case 27:
                        this.dxHead = -2;
                        this.dyHead = -1;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 439;
                    case 28:
                        this.dxHead = -2;
                        this.dyHead = -1;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 442;
                    case 112:
                        this.dxHead = -1;
                        this.dyHead = -2;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 148;
                    case 113:
                        this.dxHead = -3;
                        this.dyHead = -1;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 443;
                    case 124:
                        this.dxHead = -1;
                        this.dyHead = -2;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1235;
                    case 125:
                        this.dxHead = -1;
                        this.dyHead = -2;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1237;
                    case 126:
                        this.dxHead = -1;
                        this.dyHead = -2;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1255;
                    case 127:
                        this.dxHead = -3;
                        this.dyHead = -2;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1257;
                    case 137:
                        this.dxHead = -2;
                        this.dyHead = -1;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1309;
                    case 138:
                        this.dxHead = -2;
                        this.dyHead = -1;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1311;
                    case 139:
                        this.dxHead = 0;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1315;
                    case 140:
                        this.dxHead = 1;
                        this.dyHead = -2;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1313;
                    case 146:
                        this.dxHead = -1;
                        this.dyHead = -1;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1416;
                    case 147:
                        this.dxHead = -4;
                        this.dyHead = -2;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1418;
                    case 148:
                        this.dxHead = -2;
                        this.dyHead = -2;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1422;
                    case 149:
                        this.dxHead = -4;
                        this.dyHead = -2;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1424;
                    case 150:
                        this.dxHead = -2;
                        this.dyHead = -2;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1441;
                    case 151:
                        this.dxHead = -4;
                        this.dyHead = -2;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1439;
                    case 152:
                        this.dxHead = -1;
                        this.dyHead = -2;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1447;
                    case 153:
                        this.dxHead = -2;
                        this.dyHead = -1;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1445;
                    case 158:
                        this.dxHead = -4;
                        this.dyHead = -1;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1585;
                    case 159:
                        this.dxHead = -2;
                        this.dyHead = -1;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1589;
                    case 160:
                        this.dxHead = 0;
                        this.dyHead = 0;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1587;
                    case 161:
                        this.dxHead = 1;
                        this.dyHead = -1;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1595;
                    case 162:
                        this.dxHead = -7;
                        this.dyHead = -1;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1597;
                    case 163:
                        this.dxHead = -5;
                        this.dyHead = 0;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1604;
                    case 179:
                        this.dxHead = 1;
                        this.dyHead = -1;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 1978;
                    case 182:
                        this.dxHead = 1;
                        this.dyHead = -1;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 2006;
                    case 185:
                        this.dxHead = -6;
                        this.dyHead = -1;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 2129;
                    case 188:
                        this.dxHead = -2;
                        this.dyHead = -1;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 2156;
                    case 205:
                        this.dxHead = -2;
                        this.dyHead = -1;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 2451;
                    case 210:
                        this.dxHead = -2;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 2519;
                    case 211:
                        this.dxHead = -3;
                        this.dyHead = -1;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 2521;
                    case 212:
                        this.dxHead = -4;
                        this.dyHead = 0;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 2523;
                    case 213:
                        this.dxHead = 0;
                        this.dyHead = -1;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 2525;
                    case 214:
                        this.dxHead = -1;
                        this.dyHead = -1;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 2526;
                    default:
                        this.dxHead = -1;
                        this.dyHead = -3;
                        if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                            if (this.arrItemMounts[4].template.id == 485) {
                                ++this.dyHead;
                            } else if (this.arrItemMounts[4].template.id == 524) {
                                this.dxHead -= 5;
                                --this.dyHead;
                            }
                        }

                        return 33;
                }
            }
        } else if ((var2 = (CharPartInfo) CharPartInfo.head_boc_dau.get(String.valueOf(this.head))) != null && (var3 = (CharPartInfo) var2.item.get(String.valueOf(this.arrItemMounts[4].template.id))) != null) {
            this.dxHead = var3.dx;
            this.dyHead = var3.dy;
            return var1 != null ? var1.pi[this.frameFix].id : var2.idSmall;
        } else {
            switch (this.head) {
                case 2:
                    this.dxHead = 2;
                    this.dyHead = -5;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 33;
                case 11:
                    this.dxHead = 0;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 147;
                case 23:
                    this.dxHead = 1;
                    this.dyHead = -4;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 427;
                case 24:
                    this.dxHead = 1;
                    this.dyHead = -4;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 430;
                case 25:
                    this.dxHead = 3;
                    this.dyHead = -4;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 433;
                case 26:
                    this.dxHead = 0;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 436;
                case 27:
                    this.dxHead = 0;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 439;
                case 28:
                    this.dxHead = 0;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 442;
                case 112:
                    this.dxHead = 1;
                    this.dyHead = -4;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 148;
                case 113:
                    this.dxHead = -1;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 443;
                case 124:
                    this.dxHead = 1;
                    this.dyHead = -4;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1235;
                case 125:
                    this.dxHead = -1;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1237;
                case 126:
                    this.dxHead = -1;
                    this.dyHead = -4;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1255;
                case 127:
                    this.dxHead = -1;
                    this.dyHead = -4;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1257;
                case 137:
                    this.dxHead = 0;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1309;
                case 138:
                    this.dxHead = 0;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1311;
                case 139:
                    this.dxHead = 2;
                    this.dyHead = -5;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1315;
                case 140:
                    this.dxHead = 3;
                    this.dyHead = -4;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1313;
                case 146:
                    this.dxHead = 1;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1416;
                case 147:
                    this.dxHead = -2;
                    this.dyHead = -4;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1418;
                case 148:
                    this.dxHead = 0;
                    this.dyHead = -4;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1422;
                case 149:
                    this.dxHead = -2;
                    this.dyHead = -4;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1424;
                case 150:
                    this.dxHead = 0;
                    this.dyHead = -4;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1441;
                case 151:
                    this.dxHead = -2;
                    this.dyHead = -4;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1439;
                case 152:
                    this.dxHead = 1;
                    this.dyHead = -4;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1447;
                case 153:
                    this.dxHead = 0;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1445;
                case 158:
                    this.dxHead = -2;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1585;
                case 159:
                    this.dxHead = 0;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1589;
                case 160:
                    this.dxHead = 2;
                    this.dyHead = -2;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1587;
                case 161:
                    this.dxHead = 3;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1595;
                case 162:
                    this.dxHead = -5;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1597;
                case 163:
                    this.dxHead = -3;
                    this.dyHead = -2;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1604;
                case 179:
                    this.dxHead = 3;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 1978;
                case 182:
                    this.dxHead = 3;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 2006;
                case 185:
                    this.dxHead = -4;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 2129;
                case 188:
                    this.dxHead = 0;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 2156;
                case 205:
                    this.dxHead = 0;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 2451;
                case 210:
                    this.dxHead = 0;
                    this.dyHead = -5;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 2519;
                case 211:
                    this.dxHead = -1;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 2521;
                case 212:
                    this.dxHead = -2;
                    this.dyHead = -2;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 2523;
                case 213:
                    this.dxHead = 0;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 2525;
                case 214:
                    this.dxHead = 1;
                    this.dyHead = -3;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 2526;
                default:
                    this.dxHead = 2;
                    this.dyHead = -5;
                    if (this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523) {
                        if (this.arrItemMounts[4].template.id == 485) {
                            this.dxHead -= 2;
                            ++this.dyHead;
                        } else if (this.arrItemMounts[4].template.id == 524) {
                            this.dxHead -= 7;
                            --this.dyHead;
                        }
                    }

                    return 33;
            }
        }
    }

    private int[] getClanEffect() {
        if (this.statusMe != 6 && this.statusMe != 1 && this.statusMe != 2 && this.statusMe != 10 && this.statusMe != 11) {
            return null;
        } else {
            int[] var1 = null;
            if (this.me) {
                if (this.arrItemBody[13] != null) {
                    if (this.arrItemBody[13].template.id == 425) {
                        var1 = new int[]{1687, 1688, 1689, 1690, 1691};
                    } else if (this.arrItemBody[13].template.id == 426) {
                        var1 = new int[]{1682, 1683, 1684, 1685, 1686};
                    } else if (this.arrItemBody[13].template.id == 427) {
                        var1 = new int[]{1677, 1678, 1679, 1680, 1681};
                    }
                }
            } else {
                if (this.glove == -1) {
                    return null;
                }

                if (this.glove == 425) {
                    var1 = new int[]{1687, 1688, 1689, 1690, 1691};
                } else if (this.glove == 426) {
                    var1 = new int[]{1682, 1683, 1684, 1685, 1686};
                } else if (this.glove == 427) {
                    var1 = new int[]{1677, 1678, 1679, 1680, 1681};
                }
            }

            return var1;
        }
    }

    public final void paintClanEffect(mGraphics var1, int var2, int var3) {
        int[] var5;
        if ((var5 = this.getClanEffect()) != null) {
            int var4;
            if ((var4 = GameCanvas.gameTick % 13) > 9) {
                SmallImage.drawSmallImage(var1, var5[0], var2, var3, 0, 33);
            } else if (var4 > 6) {
                SmallImage.drawSmallImage(var1, var5[1], var2, var3 + 2, 0, 33);
            } else if (var4 > 3) {
                SmallImage.drawSmallImage(var1, var5[2], var2 - 2, var3 + 1, 0, 33);
            } else {
                SmallImage.drawSmallImage(var1, var5[3], var2 - 2, var3, 0, 33);
            }
        }
    }

    private void paintClanEffectRun(mGraphics var1, int var2, int var3) {
        int[] var4;
        if ((var4 = this.getClanEffect()) != null) {
            int var5 = this.cdir == 1 ? 6 : 5;
            int var7 = this.cdir == -1 ? 40 : 36;
            int var6;
            if ((var6 = GameCanvas.gameTick % 13) > 9) {
                SmallImage.drawSmallImage(var1, var4[0], var2, var3, var5, var7);
            } else if (var6 > 6) {
                SmallImage.drawSmallImage(var1, var4[1], var2, var3, var5, var7);
            } else if (var6 > 3) {
                SmallImage.drawSmallImage(var1, var4[2], var2, var3, var5, var7);
            } else {
                SmallImage.drawSmallImage(var1, var4[3], var2, var3, var5, var7);
            }
        }
    }

    public final void paintClanEffect2(mGraphics var1, int var2, int var3) {
        int[] var4;
        if ((var4 = this.getClanEffect()) != null) {
            SmallImage.drawSmallImage(var1, var4[4], var2 - 2, var3, 0, 33);
        }
    }

    private void callEff(int var1) {
        this.indexEff = 0;
        this.eff = GameScr.efs[var1];
    }

    public final void callEffTask(int var1) {
        this.indexEffTask = 0;
        this.effTask = GameScr.efs[var1];
    }

    public static int getIndexChar(int var0) {
        for (int var1 = 0; var1 < GameScr.vCharInMap.size(); ++var1) {
            if (((Char) GameScr.vCharInMap.elementAt(var1)).charID == var0) {
                return var1;
            }
        }

        return -1;
    }

    public final void moveTo(int var1, int var2) {
        byte var3 = 0;
        byte var4 = 0;
        var1 -= this.cx;
        var2 -= this.cy;
        if (var1 == 0 && var2 == 0) {
            var4 = 1;
        } else if (var2 == 0) {
            var4 = 2;
            if (this.vMovePoints.size() > 0) {
                MovePoint var5 = null;

                try {
                    var5 = (MovePoint) this.vMovePoints.lastElement();
                } catch (Exception var7) {
                }

                if (var5 != null && TileMap.tileTypeAt(var5.xEnd, var5.yEnd, 64) && var5.yEnd % TileMap.size > 8) {
                    var4 = 10;
                }
            }

            if (var1 > 0) {
                var3 = 1;
            }

            if (var1 < 0) {
                var3 = -1;
            }
        } else if (var2 != 0) {
            if (var2 < 0) {
                var4 = 3;
            }

            if (var2 > 0) {
                var4 = 4;
            }

            if (var1 < 0) {
                var3 = -1;
            }

            if (var1 > 0) {
                var3 = 1;
            }
        }

        boolean var8 = false;
        boolean var6 = false;
        int var9 = this.cx + var1;
        int var10 = this.cy + var2;
        this.vMovePoints.addElement(new MovePoint(var9, var10, var4, var3));
        this.statusMe = 6;
    }

    private void searchFocus() {
        if (this.charFocus != null && this.charFocus.isNhanban) {
            this.charFocus = null;
        }

        if (isManualFocus && this.charFocus != null && (this.charFocus.statusMe == 15 || this.charFocus.isInvisible)) {
            this.charFocus = null;
        }

        if (GameCanvas.gameTick % 2 != 0) {
            if (!this.isMeCanAttackOtherPlayer(this.charFocus)) {
                byte var1 = 0;
                if (this.nClass.classId == 0 || this.nClass.classId == 1 || this.nClass.classId == 3 || this.nClass.classId == 5) {
                    if (GameScr.auto != 1) {
                        var1 = 40;
                    } else {
                        var1 = 0;
                    }
                }

                int[] var2 = new int[]{-1, -1, -1, -1};
                int var3 = GameScr.cmx - 10;
                int var4 = GameScr.cmx + GameCanvas.w + 10;
                int var5 = GameScr.cmy;
                int var6 = GameScr.cmy + GameCanvas.h - GameScr.cmdBarH + 10;
                if (isManualFocus) {
                    if (this.mobFocus != null && this.mobFocus.status != 1 && this.mobFocus.status != 8 && this.mobFocus.status != 0 && var3 <= this.mobFocus.x && this.mobFocus.x <= var4 && var5 <= this.mobFocus.y && this.mobFocus.y <= var6 || this.npcFocus != null && var3 <= this.npcFocus.cx && this.npcFocus.cx <= var4 && var5 <= this.npcFocus.cy && this.npcFocus.cy <= var6 || this.charFocus != null && var3 <= this.charFocus.cx && this.charFocus.cx <= var4 && var5 <= this.charFocus.cy && this.charFocus.cy <= var6 || this.itemFocus != null && var3 <= this.itemFocus.x && this.itemFocus.x <= var4 && var5 <= this.itemFocus.y && this.itemFocus.y <= var6) {
                        return;
                    }

                    isManualFocus = false;
                }

                int var7;
                ItemMap var8;
                int var9;
                int var10;
                int var11;
                if (this.itemFocus == null) {
                    for (var7 = 0; var7 < GameScr.vItemMap.size(); ++var7) {
                        var8 = (ItemMap) GameScr.vItemMap.elementAt(var7);
                        var9 = Math.abs(getMyChar().cx - var8.x);
                        var10 = Math.abs(getMyChar().cy - var8.y);
                        var11 = var9 > var10 ? var9 : var10;
                        if (var9 <= 48 && var10 <= 48 && (this.itemFocus == null || var11 < var2[3])) {
                            GameScr.gI();
                            if (GameScr.auto != 0) {
                                GameScr.gI();
                                if (GameScr.isBagFull()) {
                                    if (var8.template.type == 19) {
                                        if (GameScr.isUseitemAuto) {
                                            this.itemFocus = null;
                                        } else {
                                            this.itemFocus = var8;
                                        }

                                        var2[3] = var11;
                                    }
                                    continue;
                                }
                            }

                            if (!isAPickYen && !isAPickYHM && !isAPickYHMS && !isANoPick) {
                                if (GameScr.isUseitemAuto) {
                                    this.itemFocus = null;
                                } else {
                                    this.itemFocus = var8;
                                }

                                var2[3] = var11;
                            } else if (isAPickYen && var8.template.type == 19
                                    || isAPickYHM && (var8.template.type == 16
                                    || var8.template.type == 17)
                                    || isAPickYHMS && var8.template.type == 26
                                    || isAPickTB && var8.template.advAA()
                                    || isAPickVPNV && var8.template.advAB()) {
                                if (GameScr.isUseitemAuto) {
                                    this.itemFocus = null;
                                } else {
                                    this.itemFocus = var8;

                                }

                                var2[3] = var11;
                            }
                        }
                    }
                } else {
                    if (var3 <= this.itemFocus.x && this.itemFocus.x <= var4 && var5 <= this.itemFocus.y && this.itemFocus.y <= var6) {
                        this.clearFocus(3);
                        return;
                    }

                    this.itemFocus = null;

                    for (var7 = 0; var7 < GameScr.vItemMap.size(); ++var7) {
                        var8 = (ItemMap) GameScr.vItemMap.elementAt(var7);
                        var9 = Math.abs(getMyChar().cx - var8.x);
                        var10 = Math.abs(getMyChar().cy - var8.y);
                        var11 = var9 > var10 ? var9 : var10;
                        if (var3 <= var8.x && var8.x <= var4 && var5 <= var8.y && var8.y <= var6 && (this.itemFocus == null || var11 < var2[3])) {
                            GameScr.gI();
                            if (GameScr.auto != 0) {
                                GameScr.gI();
                                if (GameScr.isBagFull()) {
                                    if (var8.template.type == 19) {
                                        if (GameScr.isUseitemAuto) {
                                            this.itemFocus = null;
                                        } else {
                                            this.itemFocus = var8;
                                        }

                                        var2[3] = var11;
                                    }
                                    continue;
                                }
                            }

                            if (!isAPickYen && !isAPickYHM && !isAPickYHMS && !isANoPick) {
                                if (GameScr.isUseitemAuto) {
                                    this.itemFocus = null;
                                } else {
                                    this.itemFocus = var8;
                                }

                                var2[3] = var11;
                            } else if (isAPickYen && var8.template.type == 19
                                    || isAPickYHM && (var8.template.type == 16 || var8.template.type == 17)
                                    || isAPickYHMS
                                    && var8.template.type == 26 || isAPickTB && var8.template.advAA()
                                    || isAPickVPNV && var8.template.advAB()) {
                                if (GameScr.isUseitemAuto) {
                                    this.itemFocus = null;
                                } else {
                                    this.itemFocus = var8;
                                }

                                var2[3] = var11;
                            }
                        }
                    }
                }

                Mob var12;
                Npc var13;
                Char var14;
                int var15;
                if (TileMap.typeMap != 3 && TileMap.mapID != 111) {
                    var3 = getMyChar().cx - getMyChar().getdxSkill() - 10;
                    var4 = getMyChar().cx + getMyChar().getdxSkill() + 10;
                    var5 = getMyChar().cy - getMyChar().getdySkill() - var1;
                    if ((var6 = getMyChar().cy + getMyChar().getdySkill()) > getMyChar().cy + 30) {
                        var6 = getMyChar().cy + 30;
                    }

                    if (this.mobFocus == null) {
                        for (var7 = 0; var7 < GameScr.vMob.size(); ++var7) {
                            var12 = (Mob) GameScr.vMob.elementAt(var7);
                            var9 = Math.abs(getMyChar().cx - var12.x);
                            var10 = Math.abs(getMyChar().cy - var12.y);
                            var11 = var9 > var10 ? var9 : var10;
                            if ((var12.templateId != 97 || getMyChar().cTypePk != 4) && (var12.templateId != 98 || getMyChar().cTypePk != 4) && (var12.templateId != 167 || getMyChar().cTypePk != 4) && (var12.templateId != 99 || getMyChar().cTypePk != 5) && (var12.templateId != 96 || getMyChar().cTypePk != 5) && (var12.templateId != 166 || getMyChar().cTypePk != 5) && (var12.templateId != 200 || getMyChar().cTypePk != 4) && (var12.templateId != 199 || getMyChar().cTypePk != 5) && (var12.templateId != 198 || getMyChar().cTypePk != 6) && (var12.templateId != 202 || var12.status != 8 || var12.isPaint()) && (!GameScr.isUseitemAuto || var12.levelBoss != 3) && var12.templateId != 202 && var3 <= var12.x && var12.x <= var4 && var5 <= var12.y && var12.y <= var6 && var12.status != 0 && var12.status != 1 && (this.mobFocus == null || var11 < var2[0])) {
                                this.mobFocus = var12;
                                var2[0] = var11;
                            }
                        }
                    } else {
                        if (this.mobFocus.status != 1 && this.mobFocus.status != 0 && var3 <= this.mobFocus.x && this.mobFocus.x <= var4 && var5 <= this.mobFocus.y && this.mobFocus.y <= var6) {
                            this.clearFocus(0);
                            return;
                        }

                        this.mobFocus = null;

                        for (var7 = 0; var7 < GameScr.vMob.size(); ++var7) {
                            var12 = (Mob) GameScr.vMob.elementAt(var7);
                            var9 = Math.abs(getMyChar().cx - var12.x);
                            var10 = Math.abs(getMyChar().cy - var12.y);
                            var11 = var9 > var10 ? var9 : var10;
                            if ((var12.templateId != 97 || getMyChar().cTypePk != 4) && (var12.templateId != 96 || getMyChar().cTypePk != 5) && (var12.templateId != 98 || getMyChar().cTypePk != 4) && (var12.templateId != 167 || getMyChar().cTypePk != 4) && (var12.templateId != 99 || getMyChar().cTypePk != 5) && (var12.templateId != 166 || getMyChar().cTypePk != 5) && (var12.templateId != 96 || getMyChar().cTypePk != 6) && (var12.templateId != 99 || getMyChar().cTypePk != 6) && (var12.templateId != 166 || getMyChar().cTypePk != 6) && (var12.templateId != 202 || var12.status != 8 || var12.isPaint()) && (!GameScr.isUseitemAuto || var12.levelBoss != 3) && var12.templateId != 202 && var3 <= var12.x && var12.x <= var4 && var5 <= var12.y && var12.y <= var6 && var12.status != 0 && var12.status != 1 && (this.mobFocus == null || var11 < var2[0])) {
                                this.mobFocus = var12;
                                var2[0] = var11;
                            }
                        }
                    }

                    var3 = getMyChar().cx - 80;
                    var4 = getMyChar().cx + 80;
                    var5 = getMyChar().cy - 30;
                    var6 = getMyChar().cy + 30;
                    if (this.npcFocus != null && this.npcFocus.template.npcTemplateId == 13) {
                        var3 = getMyChar().cx - 20;
                        var4 = getMyChar().cx + 20;
                        var5 = getMyChar().cy - 10;
                        var6 = getMyChar().cy + 10;
                    }

                    if (this.npcFocus == null) {
                        for (var7 = 0; var7 < GameScr.vNpc.size(); ++var7) {
                            if ((var13 = (Npc) GameScr.vNpc.elementAt(var7)).statusMe != 15 && TileMap.typeMap != 1) {
                                var9 = Math.abs(getMyChar().cx - var13.cx);
                                var10 = Math.abs(getMyChar().cy - var13.cy);
                                var11 = var9 > var10 ? var9 : var10;
                                var3 = getMyChar().cx - 80;
                                var4 = getMyChar().cx + 80;
                                var5 = getMyChar().cy - 30;
                                var6 = getMyChar().cy + 30;
                                if (var13.template.npcTemplateId == 13) {
                                    var3 = getMyChar().cx - 20;
                                    var4 = getMyChar().cx + 20;
                                    var5 = getMyChar().cy - 10;
                                    var6 = getMyChar().cy + 10;
                                }

                                if (var3 <= var13.cx && var13.cx <= var4 && var5 <= var13.cy && var13.cy <= var6 && (this.npcFocus == null || var11 < var2[1])) {
                                    if (GameScr.isUseitemAuto && GameScr.auto == 1) {
                                        break;
                                    }

                                    this.npcFocus = var13;
                                    var2[1] = var11;
                                }
                            }
                        }
                    } else {
                        if (var3 <= this.npcFocus.cx && this.npcFocus.cx <= var4 && var5 <= this.npcFocus.cy && this.npcFocus.cy <= var6) {
                            this.clearFocus(1);
                            return;
                        }

                        this.deFocusNPC();

                        for (var7 = 0; var7 < GameScr.vNpc.size(); ++var7) {
                            if ((var13 = (Npc) GameScr.vNpc.elementAt(var7)).statusMe != 15 && TileMap.typeMap != 1) {
                                var9 = Math.abs(getMyChar().cx - var13.cx);
                                var10 = Math.abs(getMyChar().cy - var13.cy);
                                var11 = var9 > var10 ? var9 : var10;
                                var3 = getMyChar().cx - 80;
                                var4 = getMyChar().cx + 80;
                                var5 = getMyChar().cy - 30;
                                var6 = getMyChar().cy + 30;
                                if (var13.template.npcTemplateId == 13) {
                                    var3 = getMyChar().cx - 20;
                                    var4 = getMyChar().cx + 20;
                                    var5 = getMyChar().cy - 10;
                                    var6 = getMyChar().cy + 10;
                                }

                                if (var3 <= var13.cx && var13.cx <= var4 && var5 <= var13.cy && var13.cy <= var6 && (this.npcFocus == null || var11 < var2[1])) {
                                    if (GameScr.isUseitemAuto && GameScr.auto == 1) {
                                        break;
                                    }

                                    this.npcFocus = var13;
                                    var2[1] = var11;
                                }
                            }
                        }
                    }

                    if (this.charFocus == null) {
                        for (var7 = 0; var7 < GameScr.vCharInMap.size(); ++var7) {
                            if (!(var14 = (Char) GameScr.vCharInMap.elementAt(var7)).isNhanban && var14.statusMe != 15 && !var14.isInvisible && var14.charID < -1 && this.wdx == 0 && this.wdy == 0 && var14.statusMe != 14 && var14.statusMe != 5) {
                                var9 = Math.abs(getMyChar().cx - var14.cx);
                                var10 = Math.abs(getMyChar().cy - var14.cy);
                                var11 = var9 > var10 ? var9 : var10;
                                if (var3 <= var14.cx && var14.cx <= var4 && var5 <= var14.cy && var14.cy <= var6 && (this.charFocus == null || var11 < var2[2])) {
                                    this.charFocus = var14;
                                    var2[2] = var11;
                                }
                            }
                        }
                    } else {
                        if (var3 <= this.charFocus.cx && this.charFocus.cx <= var4 && var5 <= this.charFocus.cy && this.charFocus.cy <= var6 && this.charFocus.statusMe != 15 && !this.charFocus.isInvisible) {
                            this.clearFocus(2);
                            return;
                        }

                        this.charFocus = null;

                        for (var7 = 0; var7 < GameScr.vCharInMap.size(); ++var7) {
                            if (!(var14 = (Char) GameScr.vCharInMap.elementAt(var7)).isNhanban && var14.statusMe != 15 && !var14.isInvisible && var14.charID < 0 && this.wdx == 0 && this.wdy == 0 && var14.statusMe != 14 && var14.statusMe != 5) {
                                var9 = Math.abs(getMyChar().cx - var14.cx);
                                var10 = Math.abs(getMyChar().cy - var14.cy);
                                var11 = var9 > var10 ? var9 : var10;
                                if (var3 <= var14.cx && var14.cx <= var4 && var5 <= var14.cy && var14.cy <= var6 && (this.charFocus == null || var11 < var2[2])) {
                                    this.charFocus = var14;
                                    var2[2] = var11;
                                }
                            }
                        }
                    }

                    var7 = -1;

                    for (var15 = 0; var15 < var2.length; ++var15) {
                        if (var7 == -1) {
                            if (var2[var15] != -1) {
                                var7 = var15;
                            }
                        } else if (var2[var15] < var2[var7] && var2[var15] != -1) {
                            var7 = var15;
                        }
                    }

                    if (GameScr.isUseitemAuto && GameScr.auto == 1 && !GameScr.gI().lockAutoMove) {
                        GameScr.updateAutoMovetoMob();
                    }
                } else {
                    var3 = getMyChar().cx - getMyChar().getdxSkill();
                    var4 = getMyChar().cx + getMyChar().getdxSkill();
                    var5 = getMyChar().cy - getMyChar().getdySkill() - var1;
                    if ((var6 = getMyChar().cy + getMyChar().getdySkill()) > getMyChar().cy + 30) {
                        var6 = getMyChar().cy + 30;
                    }

                    if (this.mobFocus == null) {
                        for (var7 = 0; var7 < GameScr.vMob.size(); ++var7) {
                            var12 = (Mob) GameScr.vMob.elementAt(var7);
                            var9 = Math.abs(getMyChar().cx - var12.x);
                            var10 = Math.abs(getMyChar().cy - var12.y);
                            var11 = var9 > var10 ? var9 : var10;
                            if ((var12.templateId != 97 || getMyChar().cTypePk != 4) && (var12.templateId != 96 || getMyChar().cTypePk != 5) && (var12.templateId != 98 || getMyChar().cTypePk != 4) && (var12.templateId != 167 || getMyChar().cTypePk != 4) && (var12.templateId != 99 || getMyChar().cTypePk != 5) && (var12.templateId != 166 || getMyChar().cTypePk != 5) && (var12.templateId != 200 || getMyChar().cTypePk != 4) && (var12.templateId != 199 || getMyChar().cTypePk != 5) && (var12.templateId != 198 || getMyChar().cTypePk != 6) && (var12.templateId != 202 || var12.status != 8 || var12.isPaint()) && (!GameScr.isUseitemAuto || var12.levelBoss != 3) && var3 <= var12.x && var12.x <= var4 && var5 <= var12.y && var12.y <= var6 && var12.status != 0 && var12.status != 1 && (this.mobFocus == null || var11 < var2[0])) {
                                this.mobFocus = var12;
                                var2[0] = var11;
                            }
                        }
                    } else {
                        if (this.mobFocus.status != 1 && this.mobFocus.status != 0 && var3 <= this.mobFocus.x && this.mobFocus.x <= var4 && var5 <= this.mobFocus.y && this.mobFocus.y <= var6) {
                            this.clearFocus(0);
                            return;
                        }

                        this.mobFocus = null;

                        for (var7 = 0; var7 < GameScr.vMob.size(); ++var7) {
                            var12 = (Mob) GameScr.vMob.elementAt(var7);
                            var9 = Math.abs(getMyChar().cx - var12.x);
                            var10 = Math.abs(getMyChar().cy - var12.y);
                            var11 = var9 > var10 ? var9 : var10;
                            if ((var12.templateId != 97 || getMyChar().cTypePk != 4) && (var12.templateId != 96 || getMyChar().cTypePk != 5) && (var12.templateId != 98 || getMyChar().cTypePk != 4) && (var12.templateId != 167 || getMyChar().cTypePk != 4) && (var12.templateId != 99 || getMyChar().cTypePk != 5) && (var12.templateId != 166 || getMyChar().cTypePk != 5) && (var12.templateId != 200 || getMyChar().cTypePk != 4) && (var12.templateId != 199 || getMyChar().cTypePk != 5) && (var12.templateId != 198 || getMyChar().cTypePk != 6) && (var12.templateId != 202 || var12.status != 8 || var12.isPaint()) && (!GameScr.isUseitemAuto || var12.levelBoss != 3) && var3 <= var12.x && var12.x <= var4 && var5 <= var12.y && var12.y <= var6 && var12.status != 0 && var12.status != 1 && (this.mobFocus == null || var11 < var2[0])) {
                                this.mobFocus = var12;
                                var2[0] = var11;
                            }
                        }
                    }

                    var3 = getMyChar().cx - 80;
                    var4 = getMyChar().cx + 80;
                    var5 = getMyChar().cy - 30;
                    var6 = getMyChar().cy + 30;
                    if (this.npcFocus != null && this.npcFocus.template.npcTemplateId == 13) {
                        var3 = getMyChar().cx - 20;
                        var4 = getMyChar().cx + 20;
                        var5 = getMyChar().cy - 10;
                        var6 = getMyChar().cy + 10;
                    }

                    if (this.npcFocus == null) {
                        for (var7 = 0; var7 < GameScr.vNpc.size(); ++var7) {
                            if ((var13 = (Npc) GameScr.vNpc.elementAt(var7)).statusMe != 15) {
                                var9 = Math.abs(getMyChar().cx - var13.cx);
                                var10 = Math.abs(getMyChar().cy - var13.cy);
                                var11 = var9 > var10 ? var9 : var10;
                                var3 = getMyChar().cx - 80;
                                var4 = getMyChar().cx + 80;
                                var5 = getMyChar().cy - 30;
                                var6 = getMyChar().cy + 30;
                                if (var13.template.npcTemplateId == 13) {
                                    var3 = getMyChar().cx - 20;
                                    var4 = getMyChar().cx + 20;
                                    var5 = getMyChar().cy - 10;
                                    var6 = getMyChar().cy + 10;
                                }

                                if (var3 <= var13.cx && var13.cx <= var4 && var5 <= var13.cy && var13.cy <= var6 && (this.npcFocus == null || var11 < var2[1])) {
                                    if (GameScr.isUseitemAuto && GameScr.auto == 1) {
                                        break;
                                    }

                                    this.npcFocus = var13;
                                    var2[1] = var11;
                                }
                            }
                        }
                    } else {
                        if (var3 <= this.npcFocus.cx && this.npcFocus.cx <= var4 && var5 <= this.npcFocus.cy && this.npcFocus.cy <= var6) {
                            this.clearFocus(1);
                            return;
                        }

                        this.deFocusNPC();

                        for (var7 = 0; var7 < GameScr.vNpc.size(); ++var7) {
                            if ((var13 = (Npc) GameScr.vNpc.elementAt(var7)).statusMe != 15) {
                                var9 = Math.abs(getMyChar().cx - var13.cx);
                                var10 = Math.abs(getMyChar().cy - var13.cy);
                                var11 = var9 > var10 ? var9 : var10;
                                var3 = getMyChar().cx - 80;
                                var4 = getMyChar().cx + 80;
                                var5 = getMyChar().cy - 30;
                                var6 = getMyChar().cy + 30;
                                if (var13.template.npcTemplateId == 13) {
                                    var3 = getMyChar().cx - 20;
                                    var4 = getMyChar().cx + 20;
                                    var5 = getMyChar().cy - 10;
                                    var6 = getMyChar().cy + 10;
                                }

                                if (var3 <= var13.cx && var13.cx <= var4 && var5 <= var13.cy && var13.cy <= var6 && (this.npcFocus == null || var11 < var2[1])) {
                                    if (GameScr.isUseitemAuto && GameScr.auto == 1) {
                                        break;
                                    }

                                    this.npcFocus = var13;
                                    var2[1] = var11;
                                }
                            }
                        }
                    }

                    var3 = getMyChar().cx - 40;
                    var4 = getMyChar().cx + 40;
                    var5 = getMyChar().cy - 30;
                    var6 = getMyChar().cy + 30;
                    if (this.charFocus == null) {
                        for (var7 = 0; var7 < GameScr.vCharInMap.size(); ++var7) {
                            if (!(var14 = (Char) GameScr.vCharInMap.elementAt(var7)).isNhanban) {
                                if (TileMap.mapID != 111) {
                                    if (var14.statusMe == 15 || var14.isInvisible || var14.cTypePk == myChar.cTypePk || this.wdx != 0 || this.wdy != 0 || var14.statusMe == 14 || var14.statusMe == 5) {
                                        continue;
                                    }
                                } else {
                                    if (var14.statusMe == 15 || var14.isInvisible || this.wdx != 0 || this.wdy != 0) {
                                        continue;
                                    }

                                    if (myChar.nClass.classId == 6) {
                                        if (myChar.cTypePk == var14.cTypePk) {
                                            if (var14.statusMe != 14 || var14.statusMe != 5) {
                                                continue;
                                            }
                                        } else if (var14.statusMe == 14 || var14.statusMe == 5) {
                                            continue;
                                        }
                                    } else if (myChar.cTypePk == var14.cTypePk || var14.statusMe == 14 || var14.statusMe == 5) {
                                        continue;
                                    }
                                }

                                var9 = Math.abs(getMyChar().cx - var14.cx);
                                var10 = Math.abs(getMyChar().cy - var14.cy);
                                var11 = var9 > var10 ? var9 : var10;
                                if (var3 <= var14.cx && var14.cx <= var4 && var5 <= var14.cy && var14.cy <= var6 && (this.charFocus == null || var11 < var2[2])) {
                                    this.charFocus = var14;
                                    var2[2] = var11;
                                }
                            }
                        }
                    } else {
                        if (var3 <= this.charFocus.cx && this.charFocus.cx <= var4 && var5 <= this.charFocus.cy && this.charFocus.cy <= var6 && this.charFocus.statusMe != 15 && !this.charFocus.isInvisible && this.charFocus.statusMe != 14 && this.charFocus.statusMe != 5) {
                            this.clearFocus(2);
                            return;
                        }

                        this.charFocus = null;

                        for (var7 = 0; var7 < GameScr.vCharInMap.size(); ++var7) {
                            if (!(var14 = (Char) GameScr.vCharInMap.elementAt(var7)).isNhanban) {
                                if (TileMap.mapID != 111) {
                                    if (var14.statusMe == 15 || var14.isInvisible || var14.cTypePk == myChar.cTypePk || this.wdx != 0 || this.wdy != 0 || var14.statusMe == 14 || var14.statusMe == 5) {
                                        continue;
                                    }
                                } else {
                                    if (var14.statusMe == 15 || var14.isInvisible || this.wdx != 0 || this.wdy != 0) {
                                        continue;
                                    }

                                    if (myChar.nClass.classId == 6) {
                                        if (myChar.cTypePk == var14.cTypePk) {
                                            if (var14.statusMe != 14 || var14.statusMe != 5) {
                                                continue;
                                            }
                                        } else if (var14.statusMe == 14 || var14.statusMe == 5) {
                                            continue;
                                        }
                                    } else if (myChar.cTypePk == var14.cTypePk || var14.statusMe == 14 || var14.statusMe == 5) {
                                        continue;
                                    }
                                }

                                var9 = Math.abs(getMyChar().cx - var14.cx);
                                var10 = Math.abs(getMyChar().cy - var14.cy);
                                var11 = var9 > var10 ? var9 : var10;
                                if (var3 <= var14.cx && var14.cx <= var4 && var5 <= var14.cy && var14.cy <= var6 && (this.charFocus == null || var11 < var2[2])) {
                                    this.charFocus = var14;
                                    var2[2] = var11;
                                }
                            }
                        }
                    }

                    var7 = -1;

                    for (var15 = 0; var15 < var2.length; ++var15) {
                        if (var7 == -1) {
                            if (var2[var15] != -1) {
                                var7 = var15;
                            }
                        } else if (var2[var15] < var2[var7] && var2[var15] != -1) {
                            var7 = var15;
                        }
                    }
                }

                this.clearFocus(var7);
            }
        }
    }

    private void clearFocus(int var1) {
        if (var1 == 0) {
            this.deFocusNPC();
            this.charFocus = null;
            this.itemFocus = null;
        } else if (var1 == 1) {
            this.mobFocus = null;
            this.charFocus = null;
            this.itemFocus = null;
        } else if (var1 == 2) {
            this.mobFocus = null;
            this.deFocusNPC();
            this.itemFocus = null;
        } else {
            if (var1 == 3) {
                this.mobFocus = null;
                this.deFocusNPC();
                this.charFocus = null;
            }

        }
    }

    public static boolean isCharInScreen(Char var0) {
        int var1 = GameScr.cmx;
        int var2 = GameScr.cmx + GameCanvas.w;
        int var3 = GameScr.cmy + 10;
        int var4 = GameScr.cmy + GameScr.gH;
        return var0.statusMe != 15 && !var0.isInvisible && var1 <= var0.cx && var0.cx <= var2 && var3 <= var0.cy && var0.cy <= var4;
    }

    public final void findNextFocusByKey() {
        if (this.charFocus != null && this.charFocus.isNhanban) {
            this.charFocus = null;
        }

        if (getMyChar().skillPaint == null && getMyChar().arr == null) {
            this.focus.removeAllElements();
            int var1 = 0;
            int var2 = GameScr.cmx + 10;
            int var3 = GameScr.cmx + GameCanvas.w - 10;
            int var4 = GameScr.cmy + 10;
            int var5 = GameScr.cmy + GameScr.gH;
            int var6;
            Char var7;
            ItemMap var9;
            Mob var10;
            Npc var11;
            if (TileMap.typeMap != 3 && TileMap.mapID != 111) {
                for (var6 = 0; var6 < GameScr.vItemMap.size(); ++var6) {
                    var9 = (ItemMap) GameScr.vItemMap.elementAt(var6);
                    if (var2 <= var9.x && var9.x <= var3 && var4 <= var9.y && var9.y <= var5) {
                        this.focus.addElement(var9);
                        if (this.itemFocus != null && var9.equals(this.itemFocus)) {
                            var1 = this.focus.size();
                        }
                    }
                }

                for (var6 = 0; var6 < GameScr.vMob.size(); ++var6) {
                    if (((var10 = (Mob) GameScr.vMob.elementAt(var6)).templateId != 97 || getMyChar().cTypePk != 4) && (var10.templateId != 96 || getMyChar().cTypePk != 5) && (var10.templateId != 98 || getMyChar().cTypePk != 4) && (var10.templateId != 167 || getMyChar().cTypePk != 4) && (var10.templateId != 99 || getMyChar().cTypePk != 5) && (var10.templateId != 166 || getMyChar().cTypePk != 5) && (var10.templateId != 200 || getMyChar().cTypePk != 4) && (var10.templateId != 199 || getMyChar().cTypePk != 5) && (var10.templateId != 198 || getMyChar().cTypePk != 6) && (var10.templateId != 202 || var10.status != 8 || var10.isPaint()) && var10.status != 1 && var10.status != 0 && var2 <= var10.x && var10.x <= var3 && var4 <= var10.y && var10.y <= var5) {
                        this.focus.addElement(var10);
                        if (this.mobFocus != null && var10.equals(this.mobFocus)) {
                            var1 = this.focus.size();
                        }
                    }
                }

                for (var6 = 0; var6 < GameScr.vNpc.size(); ++var6) {
                    if ((var11 = (Npc) GameScr.vNpc.elementAt(var6)).statusMe != 15 && var2 <= var11.cx && var11.cx <= var3 && var4 <= var11.cy && var11.cy <= var5) {
                        this.focus.addElement(var11);
                        if (this.npcFocus != null && var11.equals(this.npcFocus)) {
                            var1 = this.focus.size();
                        }
                    }
                }

                for (var6 = 0; var6 < GameScr.vCharInMap.size(); ++var6) {
                    if (!(var7 = (Char) GameScr.vCharInMap.elementAt(var6)).isNhanban && var7.statusMe != 15 && !var7.isInvisible && var2 <= var7.cx && var7.cx <= var3 && var4 <= var7.cy && var7.cy <= var5) {
                        this.focus.addElement(var7);
                        if (this.charFocus != null && var7.equals(this.charFocus)) {
                            var1 = this.focus.size();
                        }
                    }
                }

                if (this.focus.size() > 0) {
                    if (var1 >= this.focus.size()) {
                        var1 = 0;
                    }

                    if (this.focus.elementAt(var1) instanceof Mob) {
                        this.mobFocus = (Mob) this.focus.elementAt(var1);
                        this.deFocusNPC();
                        this.charFocus = null;
                        this.itemFocus = null;
                        isManualFocus = true;
                        return;
                    }

                    if (this.focus.elementAt(var1) instanceof Npc) {
                        this.mobFocus = null;
                        this.deFocusNPC();
                        this.npcFocus = (Npc) this.focus.elementAt(var1);
                        this.charFocus = null;
                        this.itemFocus = null;
                        isManualFocus = true;
                        return;
                    }

                    if (this.focus.elementAt(var1) instanceof Char) {
                        this.mobFocus = null;
                        this.deFocusNPC();
                        this.charFocus = (Char) this.focus.elementAt(var1);
                        this.itemFocus = null;
                        isManualFocus = true;
                        return;
                    }

                    if (this.focus.elementAt(var1) instanceof ItemMap) {
                        this.mobFocus = null;
                        this.deFocusNPC();
                        this.charFocus = null;
                        this.itemFocus = (ItemMap) this.focus.elementAt(var1);
                        isManualFocus = true;
                        return;
                    }
                } else {
                    this.mobFocus = null;
                    this.deFocusNPC();
                    this.charFocus = null;
                    this.itemFocus = null;
                    isManualFocus = false;
                }
            } else {
                if (TileMap.mapID != 98 && TileMap.mapID != 104) {
                    for (var6 = 0; var6 < GameScr.vCharInMap.size(); ++var6) {
                        if (!(var7 = (Char) GameScr.vCharInMap.elementAt(var6)).isNhanban && var7.statusMe != 15 && !var7.isInvisible && var2 <= var7.cx && var7.cx <= var3 && var4 <= var7.cy && var7.cy <= var5) {
                            if (TileMap.mapID != 111) {
                                if (var7.cTypePk != getMyChar().cTypePk && var7.statusMe != 14 && var7.statusMe != 5) {
                                    this.focus.addElement(var7);
                                    if (this.charFocus != null && var7.equals(this.charFocus)) {
                                        var1 = this.focus.size();
                                    }
                                }
                            } else if (myChar.cTypePk == 0) {
                                this.focus.addElement(var7);
                                if (this.charFocus != null && var7.equals(this.charFocus)) {
                                    var1 = this.focus.size();
                                }
                            } else if (myChar.nClass.classId == 6) {
                                if (myChar.cTypePk == var7.cTypePk) {
                                    if (var7.statusMe == 14 || var7.statusMe == 5) {
                                        this.focus.addElement(var7);
                                        if (this.charFocus != null && var7.equals(this.charFocus)) {
                                            var1 = this.focus.size();
                                        }
                                    }
                                } else if ((myChar.cTypePk != 4 || var7.cTypePk == 5 || var7.cTypePk == 6 || var7.cTypePk == 7) && (myChar.cTypePk != 5 || var7.cTypePk == 4 || var7.cTypePk == 6 || var7.cTypePk == 7) && (myChar.cTypePk != 6 || var7.cTypePk == 4 || var7.cTypePk == 5 || var7.cTypePk == 7) && (myChar.cTypePk != 7 || var7.cTypePk == 4 || var7.cTypePk == 5 || var7.cTypePk == 6) && var7.statusMe != 14 && var7.statusMe != 5) {
                                    this.focus.addElement(var7);
                                    if (this.charFocus != null && var7.equals(this.charFocus)) {
                                        var1 = this.focus.size();
                                    }
                                }
                            } else if ((myChar.cTypePk != 4 || var7.cTypePk == 5 || var7.cTypePk == 6 || var7.cTypePk == 7) && (myChar.cTypePk != 5 || var7.cTypePk == 4 || var7.cTypePk == 6 || var7.cTypePk == 7) && (myChar.cTypePk != 6 || var7.cTypePk == 4 || var7.cTypePk == 5 || var7.cTypePk == 7) && (myChar.cTypePk != 7 || var7.cTypePk == 4 || var7.cTypePk == 5 || var7.cTypePk == 6) && var7.statusMe != 14 && var7.statusMe != 5) {
                                this.focus.addElement(var7);
                                if (this.charFocus != null && var7.equals(this.charFocus)) {
                                    var1 = this.focus.size();
                                }
                            }
                        }
                    }
                } else {
                    for (var6 = 0; var6 < GameScr.vCharInMap.size(); ++var6) {
                        if (!(var7 = (Char) GameScr.vCharInMap.elementAt(var6)).isNhanban && var7.statusMe != 15 && !var7.isInvisible && var2 <= var7.cx && var7.cx <= var3 && var4 <= var7.cy && var7.cy <= var5) {
                            this.focus.addElement(var7);
                            if (this.charFocus != null && var7.equals(this.charFocus)) {
                                var1 = this.focus.size();
                            }
                        }
                    }
                }

                for (var6 = 0; var6 < GameScr.vItemMap.size(); ++var6) {
                    var9 = (ItemMap) GameScr.vItemMap.elementAt(var6);
                    if (var2 <= var9.x && var9.x <= var3 && var4 <= var9.y && var9.y <= var5) {
                        this.focus.addElement(var9);
                        if (this.itemFocus != null && var9.equals(this.itemFocus)) {
                            var1 = this.focus.size();
                        }
                    }
                }

                for (var6 = 0; var6 < GameScr.vMob.size(); ++var6) {
                    if (((var10 = (Mob) GameScr.vMob.elementAt(var6)).templateId != 97 || getMyChar().cTypePk != 4) && (var10.templateId != 98 || getMyChar().cTypePk != 4) && (var10.templateId != 167 || getMyChar().cTypePk != 4) && (var10.templateId != 96 || getMyChar().cTypePk != 5) && (var10.templateId != 99 || getMyChar().cTypePk != 5) && (var10.templateId != 166 || getMyChar().cTypePk != 5) && (var10.templateId != 200 || getMyChar().cTypePk != 4) && (var10.templateId != 199 || getMyChar().cTypePk != 5) && (var10.templateId != 198 || getMyChar().cTypePk != 6) && (var10.templateId != 202 || var10.status != 8 || var10.isPaint()) && var10.status != 1 && var10.status != 0 && var2 <= var10.x && var10.x <= var3 && var4 <= var10.y && var10.y <= var5) {
                        this.focus.addElement(var10);
                        if (this.mobFocus != null && var10.equals(this.mobFocus)) {
                            var1 = this.focus.size();
                        }
                    }
                }

                for (var6 = 0; var6 < GameScr.vNpc.size(); ++var6) {
                    if ((var11 = (Npc) GameScr.vNpc.elementAt(var6)).statusMe != 15 && var2 <= var11.cx && var11.cx <= var3 && var4 <= var11.cy && var11.cy <= var5) {
                        this.focus.addElement(var11);
                        if (this.npcFocus != null && var11.equals(this.npcFocus)) {
                            var1 = this.focus.size();
                        }
                    }
                }

                if (this.focus.size() <= 0) {
                    this.mobFocus = null;
                    this.deFocusNPC();
                    this.charFocus = null;
                    this.itemFocus = null;
                    isManualFocus = false;
                    return;
                }

                if (var1 >= this.focus.size()) {
                    var1 = 0;
                }

                if (this.focus.elementAt(var1) instanceof Char) {
                    this.mobFocus = null;
                    this.deFocusNPC();
                    this.charFocus = (Char) this.focus.elementAt(var1);
                    this.itemFocus = null;
                    isManualFocus = true;
                    return;
                }

                if (this.focus.elementAt(var1) instanceof Npc) {
                    this.mobFocus = null;
                    this.deFocusNPC();
                    this.npcFocus = (Npc) this.focus.elementAt(var1);
                    this.charFocus = null;
                    this.itemFocus = null;
                    isManualFocus = true;
                    return;
                }

                if (this.focus.elementAt(var1) instanceof Mob) {
                    this.mobFocus = (Mob) this.focus.elementAt(var1);
                    this.deFocusNPC();
                    this.charFocus = null;
                    this.itemFocus = null;
                    isManualFocus = true;
                    return;
                }

                if (this.focus.elementAt(var1) instanceof ItemMap) {
                    this.mobFocus = null;
                    this.deFocusNPC();
                    this.charFocus = null;
                    this.itemFocus = (ItemMap) this.focus.elementAt(var1);
                    isManualFocus = true;
                    return;
                }
            }

        }
    }

    public final void deFocusNPC() {
        if (this.me && this.npcFocus != null) {
            this.npcFocus.chatPopup = null;
            this.npcFocus = null;
        }

    }

    private void updateCharInBridge() {
        if (!GameCanvas.lowGraphic) {
            if (TileMap.tileTypeAt(this.cx, this.cy + 1, 1024)) {
                TileMap.setTileTypeAtPixel(this.cx, this.cy + 1, 512);
                TileMap.setTileTypeAtPixel(this.cx, this.cy - 2, 512);
            }

            if (TileMap.tileTypeAt(this.cx - TileMap.size, this.cy + 1, 512)) {
                TileMap.killTileTypeAt(this.cx - TileMap.size, this.cy + 1, 512);
                TileMap.killTileTypeAt(this.cx - TileMap.size, this.cy - 2, 512);
            }

            if (TileMap.tileTypeAt(this.cx + TileMap.size, this.cy + 1, 512)) {
                TileMap.killTileTypeAt(this.cx + TileMap.size, this.cy + 1, 512);
                TileMap.killTileTypeAt(this.cx + TileMap.size, this.cy - 2, 512);
            }

        }
    }

    public final void itemMonToBag(Message var1) {
        try {
            this.readParam(var1);
            getMyChar().eff5BuffHp = var1.reader().readShort();
            getMyChar().eff5BuffMp = var1.reader().readShort();
            int var2 = var1.reader().readUnsignedByte();
            Item var3;
            (var3 = this.arrItemMounts[var2]).typeUI = 3;
            this.arrItemMounts[var2] = null;
            var3.indexUI = var1.reader().readUnsignedByte();
            this.arrItemBag[var3.indexUI] = var3;
            if (var2 == 4) {
                this.isNewMount = this.isWolf = this.isMoto = this.isMotoBehind = false;
            }

            GameScr.isPaintItemInfo = false;
            GameScr.gI().setLCR();
        } catch (Exception var4) {
            var4.printStackTrace();
        }
    }

    public final void itemBodyToBag(Message var1) {
        try {
            this.readParam(var1);
            getMyChar().eff5BuffHp = var1.reader().readShort();
            getMyChar().eff5BuffMp = var1.reader().readShort();
            Item var2;
            (var2 = this.arrItemBody[var1.reader().readUnsignedByte()]).typeUI = 3;
            if (var2.indexUI == 1) {
                this.wp = 15;
            } else if (var2.indexUI == 2) {
                this.setDefaultBody();
            } else if (var2.indexUI == 6) {
                this.setDefaultLeg();
            }

            this.arrItemBody[var2.indexUI] = null;
            var2.indexUI = var1.reader().readUnsignedByte();
            getMyChar().head = var1.reader().readShort();
            this.arrItemBag[var2.indexUI] = var2;
            GameScr.gI().left = GameScr.gI().center = null;
            GameScr.gI().setLCR();
        } catch (Exception var4) {
            var4.printStackTrace();
            System.out.println("Char.itemBodyToBag()");
        }
    }

    public final void itemBagToBox(Message var1) {
        try {
            int var2 = var1.reader().readUnsignedByte();
            int var5 = var1.reader().readUnsignedByte();
            Item var3;
            if ((var3 = this.arrItemBag[var2]) != null) {
                if (var3.template.type == 16) {
                    GameScr.hpPotion -= var3.quantity;
                }

                if (var3.template.type == 17) {
                    GameScr.mpPotion -= var3.quantity;
                }

                this.arrItemBag[var2] = null;
                if (this.arrItemBox[var5] == null) {
                    var3.indexUI = var5;
                    var3.typeUI = 4;
                    this.arrItemBox[var5] = var3;
                } else {
                    Item var10000 = this.arrItemBox[var5];
                    var10000.quantity += var3.quantity;
                }
            }

            GameScr.gI().left = GameScr.gI().center = null;
            GameScr.gI().updateKeyBuyItemUI();
        } catch (Exception var4) {
            var4.printStackTrace();
            System.out.println("Char.itemBagToBox()");
        }
    }

    public final void itemBoxToBag(Message var1) {
        try {
            int var2 = var1.reader().readUnsignedByte();
            int var5 = var1.reader().readUnsignedByte();
            Item var3;
            if ((var3 = this.arrItemBox[var2]) != null) {
                if (var3.template.type == 16) {
                    GameScr.hpPotion += var3.quantity;
                }

                if (var3.template.type == 17) {
                    GameScr.mpPotion += var3.quantity;
                }

                this.arrItemBox[var2] = null;
                if (this.arrItemBag[var5] == null) {
                    var3.indexUI = var5;
                    var3.typeUI = 3;
                    this.arrItemBag[var5] = var3;
                } else {
                    Item var10000 = this.arrItemBag[var5];
                    var10000.quantity += var3.quantity;
                }
            }

            GameScr.gI().left = GameScr.gI().center = null;
            GameScr.gI().updateKeyBuyItemUI();
        } catch (Exception var4) {
            var4.printStackTrace();
            System.out.println("Char.itemBoxToBag()");
        }
    }

    public static void crystalCollect(Message var0, boolean var1) {
        try {
            for (int var2 = 0; var2 < GameScr.arrItemUpPeal.length; ++var2) {
                GameScr.arrItemUpPeal[var2] = null;
            }

            byte var6 = var0.reader().readByte();
            Item var3;
            (var3 = new Item()).typeUI = 3;
            var3.indexUI = var0.reader().readByte();
            var3.template = ItemTemplates.get(var0.reader().readShort());
            var3.isLock = var0.reader().readBoolean();
            var3.isExpires = var0.reader().readBoolean();
            var3.quantity = 1;
            if (var1) {
                getMyChar().xu = var0.reader().readInt();
            } else {
                getMyChar().yen = var0.reader().readInt();

                try {
                    getMyChar().xu = var0.reader().readInt();
                } catch (Exception var4) {
                }
            }

            GameScr.arrItemUpPeal[0] = var3;
            GameScr.effUpok = GameScr.efs[53];
            GameScr.indexEff = 0;
            GameScr.gI().left = GameScr.gI().center = null;
            GameScr.gI().updateCommandForUI();
            GameCanvas.endDlg();
            if (var6 == 1) {
                InfoMe.addInfo(mResources.UPGRADE_SUCCESS + " " + var3.template.name);
            } else {
                InfoMe.addInfo(mResources.UPGRADE + " " + ItemTemplates.get((short) (var3.template.id + 1)).name + " " + mResources.UPGRADE_FAIL + " " + var3.template.name, 25, mFont.tahoma_7_red);
            }
            LockGame.advAB();

        } catch (Exception var5) {
            var5.printStackTrace();
            System.out.println("Char.itemBagToBox()");
        }
    }

    private static void kickOption(Item var0, int var1) {
        int var2 = 0;
        if (var0 != null && var0.options != null) {
            for (int var3 = 0; var3 < var0.options.size(); ++var3) {
                ItemOption var4;
                (var4 = (ItemOption) var0.options.elementAt(var3)).active = 0;
                if (var4.optionTemplate.type == 2) {
                    if (var2 < var1) {
                        var4.active = 1;
                        ++var2;
                    }
                } else if (var4.optionTemplate.type == 3 && var0.upgrade >= 4) {
                    var4.active = 1;
                } else if (var4.optionTemplate.type == 4 && var0.upgrade >= 8) {
                    var4.active = 1;
                } else if (var4.optionTemplate.type == 5 && var0.upgrade >= 12) {
                    var4.active = 1;
                } else if (var4.optionTemplate.type == 6 && var0.upgrade >= 14) {
                    var4.active = 1;
                } else if (var4.optionTemplate.type == 7 && var0.upgrade >= 16) {
                    var4.active = 1;
                }
            }
        }

    }

    public final void updateKickOption() {
        int var1 = 2;
        int var2 = 2;
        int var3 = 2;
        if (this.arrItemBody[0] == null) {
            --var1;
        }

        if (this.arrItemBody[6] == null) {
            --var1;
        }

        if (this.arrItemBody[5] == null) {
            --var1;
        }

        kickOption(this.arrItemBody[0], var1);
        kickOption(this.arrItemBody[6], var1);
        kickOption(this.arrItemBody[5], var1);
        if (this.arrItemBody[2] == null) {
            --var2;
        }

        if (this.arrItemBody[8] == null) {
            --var2;
        }

        if (this.arrItemBody[7] == null) {
            --var2;
        }

        kickOption(this.arrItemBody[2], var2);
        kickOption(this.arrItemBody[8], var2);
        kickOption(this.arrItemBody[7], var2);
        if (this.arrItemBody[4] == null) {
            --var3;
        }

        if (this.arrItemBody[3] == null) {
            --var3;
        }

        if (this.arrItemBody[9] == null) {
            --var3;
        }

        if (this.arrItemBody[1] != null) {
            ItemOption var4;
            if (this.arrItemBody[1].sys == this.getSys()) {
                if (this.arrItemBody[1].options != null) {
                    for (var1 = 0; var1 < this.arrItemBody[1].options.size(); ++var1) {
                        if ((var4 = (ItemOption) this.arrItemBody[1].options.elementAt(var1)).optionTemplate.type == 2) {
                            var4.active = 1;
                        }
                    }
                }
            } else if (this.arrItemBody[1].options != null) {
                for (var1 = 0; var1 < this.arrItemBody[1].options.size(); ++var1) {
                    if ((var4 = (ItemOption) this.arrItemBody[1].options.elementAt(var1)).optionTemplate.type == 2) {
                        var4.active = 0;
                    }
                }
            }
        }

        kickOption(this.arrItemBody[4], var3);
        kickOption(this.arrItemBody[3], var3);
        kickOption(this.arrItemBody[9], var3);
    }

    public final void doInjure(int var1, int var2, boolean var3, int var4) {
        this.cHP -= var1;
        this.cMP -= var2;
        if (!this.me) {
            this.cHP = this.cHpNew;
        }

        if (this.cHP < 0) {
            this.cHP = 0;
        }

        if (this.cMP < 0) {
            this.cMP = 0;
        }

        if (this.cHP < 1 && this.statusMe != 14 && this.statusMe != 5) {
            this.cHP = 1;
        }

        if (var1 <= 0) {
            if (this.me) {
                GameScr.startFlyText("", this.cx, this.cy - this.ch, 0, -2, 7);
            } else {
                GameScr.startFlyText("", this.cx, this.cy - this.ch, 0, -2, 4);
            }
        } else {
            GameScr.startFlyText("-" + var1, this.cx, this.cy - this.ch, 0, -2, 0);
        }

        if (var1 > 0) {
            this.isInjure = 4;
        }

        if (var3) {
            if (var4 == 114) {
                ServerEffect.addServerEffect(32, this.cx, this.cy - this.chh, 1);
                return;
            }

            if (var4 == 115) {
                ServerEffect.addServerEffect(85, this.cx, this.cy, 1);
                return;
            }

            if (var4 == 139) {
                GameScr.shaking = 1;
                GameScr.count = 0;
                ServerEffect.addServerEffect(91, this, 2);
                return;
            }

            if (var4 == 144) {
                ServerEffect.addServerEffect(91, this, 1);
                return;
            }
        } else {
            this.callEff(49);
        }

    }

    private void startDie(short var1, short var2) {
        if (this.me) {
            isLockKey = true;

            for (int var3 = 0; var3 < GameScr.vCharInMap.size(); ++var3) {
                ((Char) GameScr.vCharInMap.elementAt(var3)).killCharId = -9999;
            }
        }

        this.statusMe = 5;
        this.cp2 = var1;
        this.cp3 = var2;
        this.cp1 = 0;
        this.cHP = 0;
        this.testCharId = -9999;
        this.killCharId = -9999;
    }

    public final void waitToDie(short var1, short var2) {
        this.wdx = var1;
        this.wdy = var2;
    }

    private void changeStatusStand() {
        this.timeBocdau = 0;
        this.statusMe = 1;
        this.timeSummon = System.currentTimeMillis();
    }

    public final void liveFromDead() {
        this.cHP = this.cMaxHP;
        this.cMP = this.cMaxMP;
        this.changeStatusStand();
        this.cp1 = this.cp2 = this.cp3 = 0;
        ServerEffect.addServerEffect(20, this, 2);
        GameScr.gI().center = null;
    }

    public final boolean doUsePotion(int var1) {
        if (this.arrItemBag == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < this.arrItemBag.length; ++var2) {
                if (this.arrItemBag[var2] != null && this.arrItemBag[var2].template.type == var1 && this.arrItemBag[var2].template.level <= myChar.clevel) {
                    Service.gI().useItem(var2);
                    return true;
                }
            }

            return false;
        }
    }

    private static boolean isLang() {
        return TileMap.mapID == 1 || TileMap.mapID == 27 || TileMap.mapID == 72 || TileMap.mapID == 10 || TileMap.mapID == 17 || TileMap.mapID == 22 || TileMap.mapID == 32 || TileMap.mapID == 38 || TileMap.mapID == 43 || TileMap.mapID == 48;
    }

    public final boolean isMeCanAttackOtherPlayer(Char var1) {
        if (var1 != null && var1.isNhanban) {
            return false;
        } else if (var1 != null && getMyChar().myskill != null && getMyChar().myskill.template.type != 2 && getMyChar().myskill.template.type != 3 && (getMyChar().myskill.template.type != 4 || var1.statusMe == 14 || var1.statusMe == 5)) {
            label162:
            {
                if (getMyChar().cTypePk == 7 && (var1.cTypePk == 6 || var1.cTypePk == 4 || var1.cTypePk == 5) || getMyChar().cTypePk == 6 && (var1.cTypePk == 7 || var1.cTypePk == 4 || var1.cTypePk == 5) || getMyChar().cTypePk == 4 && (var1.cTypePk == 7 || var1.cTypePk == 5 || var1.cTypePk == 6) || getMyChar().cTypePk == 5 && (var1.cTypePk == 7 || var1.cTypePk == 4 || var1.cTypePk == 6)) {
                    getMyChar();
                    if (!isTeam(var1) && !isLang()) {
                        break label162;
                    }
                }

                if (var1.cTypePk == 3) {
                    getMyChar();
                    if (!isTeam(var1) && !isLang()) {
                        break label162;
                    }
                }

                if (getMyChar().cTypePk == 3) {
                    getMyChar();
                    if (!isTeam(var1) && !isLang()) {
                        break label162;
                    }
                }

                if (getMyChar().cTypePk == 1 && var1.cTypePk == 1) {
                    getMyChar();
                    if (!isTeam(var1) && !isLang()) {
                        break label162;
                    }
                }

                if ((getMyChar().testCharId < 0 || getMyChar().testCharId != var1.charID) && (getMyChar().killCharId < 0 || getMyChar().killCharId != var1.charID || isLang()) && (var1.killCharId < 0 || var1.killCharId != getMyChar().charID || isLang())) {
                    return false;
                }
            }

            if (var1.statusMe != 14 && var1.statusMe != 5) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    private static boolean isTeam(Char var0) {
        for (int var1 = 0; var1 < GameScr.vParty.size(); ++var1) {
            Party var2 = (Party) GameScr.vParty.elementAt(var1);
            if (var0.charID == var2.charId) {
                return true;
            }
        }

        return false;
    }

    public static void clearTask() {
        getMyChar().callEffTask(21);
        getMyChar().taskMaint = null;

        for (int var0 = 0; var0 < getMyChar().arrItemBag.length; ++var0) {
            if (getMyChar().arrItemBag[var0] != null && (getMyChar().arrItemBag[var0].template.type == 25 || getMyChar().arrItemBag[var0].template.type == 23 || getMyChar().arrItemBag[var0].template.type == 24)) {
                getMyChar().arrItemBag[var0] = null;
            }
        }

        Npc.clearEffTask();
    }

    public static int getCT() {
        if (pointChienTruong >= 4000) {
            return 4;
        } else if (pointChienTruong >= 1500) {
            return 3;
        } else if (pointChienTruong >= 600) {
            return 2;
        } else {
            return pointChienTruong >= 200 ? 1 : 0;
        }
    }

    public final boolean isHumanz() {
        return this.isHuman;
    }

    public final boolean isNhanbanz() {
        return this.isNhanban;
    }

    public final void GetNewMount() {
        this.frameMount = (int[][]) CharPartInfo.newMount.get(String.valueOf(this.arrItemMounts[4].template.id));
    }

    public final boolean isHaveNewMount() {
        if (this.ID_HORSE > -1) {
            return false;
        } else {
            return this.arrItemMounts != null && this.arrItemMounts[4] != null && this.arrItemMounts[4].template != null && this.arrItemMounts[4].template.id != 443 && this.arrItemMounts[4].template.id != 523 && this.arrItemMounts[4].template.id != 485 && this.arrItemMounts[4].template.id != 524;
        }
    }

    private void updNewMount() {
        if (this.ID_HORSE <= -1 && this.isNewMount && this.frameMount != null) {
            ++this.tickNewMount;
            if (this.isMotoBehind) {
                this.fNewMount = 5;
            } else if (this.statusMe != 1 && this.statusMe != 6) {
                if (this.statusMe != 2 && this.statusMe != 10) {
                    if (this.statusMe == 3) {
                        this.fNewMount = 2;
                    } else if (this.statusMe == 4) {
                        this.fNewMount = 3;
                    } else if (this.statusMe == 14) {
                        this.fNewMount = 4;
                    }
                } else {
                    this.fNewMount = 1;
                    int var1 = this.frameMount[this.fNewMount].length / 3;
                    if (this.tickNewMount < var1) {
                        this.dyMount = 0;
                    } else if (this.tickNewMount < var1 << 1) {
                        this.dyMount = 1;
                    } else {
                        this.dyMount = 2;
                    }
                }
            } else {
                this.fNewMount = 0;
                this.tickNewMount = GameCanvas.gameTick % 20 > 12 ? 1 : 0;
                if (this.ID_PP > -1) {
                    this.tickNewMount = this.cf;
                }

                this.dyMount = this.tickNewMount;
            }

            if (this.tickNewMount > this.frameMount[this.fNewMount].length - 1) {
                this.tickNewMount = 0;
            }

        }
    }

    private void paintBehindNewMount(mGraphics var1) {
        byte var2 = 2;
        if (this.cdir == 1) {
            var2 = 0;
        }

        SmallImage.drawSmallImage(var1, this.frameMount[this.fNewMount][this.tickNewMount], this.cx, this.cy, var2, 33);
    }

    private void paintNewMount(mGraphics var1, Part var2, Part var3, int[] var4) {
        byte var5 = 2;
        byte var6 = 24;
        if (this.cdir == 1) {
            var5 = 0;
            var6 = 0;
        }

        if (var2 != null) {
            SmallImage.drawSmallImage(var1, var2.pi[CharInfo[this.cf][3][0]].id, this.cx + (CharInfo[this.cf][3][1] + var2.pi[CharInfo[this.cf][3][0]].dx) * this.cdir, this.cy - CharInfo[this.cf][3][2] + var2.pi[CharInfo[this.cf][3][0]].dy - 10 + this.dyMount, var5, var6);
        }

        if (var4 != null && this.ID_PP == -1) {
            SmallImage.drawSmallImage(var1, var4[this.tickCoat], this.cx + this.hdx + (this.dxBody + -7) * this.cdir, this.cy - SmallImage.getHeight(this.getLegId()) - 19 + this.dyBody + this.dyMount, var5, 17);
        }

        byte var7 = -4;
        if (this.cdir == 1) {
            var7 = 4;
        }

        SmallImage.drawSmallImage(var1, this.frameMount[this.fNewMount][this.tickNewMount], this.cx, this.cy, var5, 33);
        if (this.ID_Body > -1) {
            this.paintBody(var1, this.cx + var7 + this.getxs(), this.cy - 18 + this.dyMount - this.getys(), 1);
        } else {
            SmallImage.drawSmallImage(var1, this.getBodyPaintId(), this.cx + this.hdx + this.dxBody * this.cdir, this.cy - SmallImage.getHeight(this.getLegId()) - 9 + this.dyBody + this.dyMount, var5, 33);
        }

        if (this.ID_HAIR > -1) {
            this.paintHair(var1, this.cx + var7 + this.getxs(), this.cy - 18 + this.dyMount - this.getys(), 1);
        } else {
            SmallImage.drawSmallImage(var1, this.getHeadId(), this.cx + this.hdx + this.dxHead * this.cdir, this.cy - CharInfo[0][0][2] + var3.pi[CharInfo[0][0][0]].dy - 12 + this.dyHead + this.dyMount, var5, 17);
        }

        if (this.ID_MAT_NA > -1) {
            this.paintMatna(var1, this.cx + var7 + this.getxs(), this.cy - 18 + this.dyMount - this.getys(), 1);
        }

    }

    public final void setThoiTrang(short[] var1) {
        this.ID_HAIR = var1[0];
        this.ID_Body = var1[1];
        this.ID_LEG = var1[2];
        this.ID_WEA_PONE = var1[3];
        this.ID_PP = var1[4];
        this.ID_NAME = var1[5];
        this.ID_HORSE = var1[6];
        this.ID_RANK = var1[7];
        this.ID_MAT_NA = var1[8];
        this.ID_Bien_Hinh = var1[9];
        this.ColorName = 0;
        if (this.ID_NAME > 3000) {
            this.ColorName = (byte) (this.ID_NAME - 3000);
            this.ID_NAME = -1;
        }

    }

    public static int getBagLT() {
        Item[] var0 = getMyChar().arrItemBag;
        int var1 = 0;

        for (int var2 = 0; var2 < var0.length; ++var2) {
            Item var3;
            if ((var3 = var0[var2]) != null && var3.template.type == 26 && var3.template.id <= 4) {
                var1 += GameScr.crystals[var3.template.id];
            }
        }

        return var1;
    }

    public static Item getBagItem(int var0, int var1) {
        Item[] var2 = getMyChar().arrItemBag;

        for (int var3 = 0; var3 < var2.length; ++var3) {
            Item var4;
            if ((var4 = var2[var3]) != null && var4.template.id == var0 && var4.quantity == var1) {
                return var4;
            }
        }

        return null;
    }

    public static Item getBagItem(int var0) {
        Item[] var1 = getMyChar().arrItemBag;

        for (int var2 = 0; var2 < var1.length; ++var2) {
            Item var3;
            if ((var3 = var1[var2]) != null && var3.template.id == var0) {
                return var3;
            }
        }

        return null;
    }

    public static Item getBagItemLock(int var0) {
        Item[] var1 = getMyChar().arrItemBag;

        for (int var2 = 0; var2 < var1.length; ++var2) {
            Item var3;
            if ((var3 = var1[var2]) != null && var3.template.id == var0 && !var3.isLock) {
                return var3;
            }
        }

        return null;
    }

    public static MyVector getBagItems(int var0) {
        Item[] var1 = getMyChar().arrItemBag;
        MyVector var2 = new MyVector();

        for (int var3 = 0; var3 < var1.length; ++var3) {
            Item var4;
            if ((var4 = var1[var3]) != null && var4.template.id == var0) {
                var2.addElement(var4);
            }
        }

        return var2;
    }

    public static int getBagIndex(int var0) {
        Item[] var1 = getMyChar().arrItemBag;

        for (int var2 = 0; var2 < var1.length; ++var2) {
            if (var1[var2] != null && var1[var2].template.id == var0) {
                return var2;
            }
        }

        return -1;
    }

    public static boolean isBagHas(int var0) {
        Item[] var1 = getMyChar().arrItemBag;

        for (int var2 = 0; var2 < var1.length; ++var2) {
            if (var1[var2] != null && var1[var2].template.id == var0) {
                return true;
            }
        }

        return false;
    }

    public static int getBagNum(int var0) {
        Item[] var1 = getMyChar().arrItemBag;
        int var2 = 0;

        for (int var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3] != null && var1[var3].template.id == var0) {
                if (var1[var3].template.isUpToUp) {
                    var2 += var1[var3].quantity;
                } else {
                    ++var2;
                }
            }
        }

        return var2;
    }

    public static int getBagNum() {
        Item[] var0 = getMyChar().arrItemBag;
        int var1 = 0;

        for (int var2 = 0; var2 < var0.length; ++var2) {
            if (var0[var2] == null) {
                ++var1;
            }
        }

        return var1;
    }

    public static int getBoxNum() {
        Item[] var0 = getMyChar().arrItemBox;
        int var1 = 0;
        if (var0 != null) {
            for (int var2 = 0; var2 < var0.length; ++var2) {
                if (var0[var2] == null) {
                    ++var1;
                }
            }
        }

        return var1;
    }

    public static Item advAL(int var0) {
        if (getMyChar().arrItemBox == null) {
            Service.gI().requestItem(4);
            LockGame.advAS();
            System.out.println("Get box " + getMyChar().arrItemBox);
        }

        Item[] var1 = getMyChar().arrItemBox;

        for (int var2 = 0; var2 < var1.length; ++var2) {
            Item var3;
            if ((var3 = var1[var2]) != null && var3.template.id == var0) {
                return var3;
            }
        }

        return null;
    }

    public static TaskOrder getTaskOrder(int var0) {
        for (int var1 = 0; var1 < getMyChar().taskOrders.size(); ++var1) {
            TaskOrder var2;
            if ((var2 = (TaskOrder) getMyChar().taskOrders.elementAt(var1)) != null && var2.taskId == var0) {
                return var2;
            }
        }

        return null;
    }

    public static boolean moveToChar(int var0, int var1) {
        Char var2 = getMyChar();
        if (var0 == -1) {
            var0 = var2.cx;
        }

        if (var1 == -1) {
            var1 = var2.cy;
        }

        if (var0 == var2.cx && var1 == var2.cy) {
            return false;
        } else {
            int var3 = 0;
            int var4 = var2.cx;
            int var5 = TileMap.tileTypeAt(var0, var1 - 12, 64) ? TileMap.tileYofPixel(var1) - 24 : var1;
            int var6;
            if (var0 > var4) {
                while (true) {
                    var4 += 50;
                    if (var4 >= var0) {
                        break;
                    }

                    var6 = TileMap.advAE(var4, var5);
                    Service.gI().charMove(var4, var6);
                    ++var3;
                    if (var3 > 50) {
                        try {
                            Thread.sleep(200L);
                        } catch (InterruptedException var8) {
                            var8.printStackTrace();
                        }
                    }
                }
            } else {
                while (true) {
                    var4 -= 50;
                    if (var4 <= var0) {
                        break;
                    }

                    var6 = TileMap.advAE(var4, var5);
                    Service.gI().charMove(var4, var6);
                    ++var3;
                    if (var3 > 50) {
                        try {
                            Thread.sleep(200L);
                        } catch (InterruptedException var7) {
                            var7.printStackTrace();
                        }
                    }
                }
            }

            Service.gI().charMove(var0, var1);
            var2.timeSendmove = System.currentTimeMillis();
            var2.cx = var2.cxSend = var0;
            var2.cy = var2.cySend = var1;
            return true;
        }
    }

    public static boolean advAD(int var0, int var1) {
        if (var0 == -1) {
            var0 = myChar.cx;
        }

        if (var1 == -1) {
            var1 = myChar.cy;
        }

        int[] var2 = new int[2];
        return !TileMap.advAA(var0, var1, var2) ? false : moveToChar(var2[0], var2[1]);
    }

    public static void advAE(int var0, int var1) {
        int var4 = Res.abs(var0 - myChar.cx) / 50;
        int var3 = Res.abs(var1 - myChar.cy) / 10;
        int var2 = myChar.cx;
        int var5 = myChar.cy;
        if (var3 < 3) {
            Service.gI().charMove(myChar.cx, var5 = var1 - 60);
            var3 = 3;
        }

        int var6;
        for (var6 = 0; var6 < var4; ++var6) {
            if (var0 > myChar.cx) {
                var2 += 50;
            } else {
                var2 -= 50;
            }

            Service.gI().charMove(var2, var5);
        }

        Service.gI().charMove(var0, var5);

        for (var6 = 0; var6 < var3; ++var6) {
            if (var1 > myChar.cy) {
                var5 += 10;
            } else {
                var5 -= 10;
            }

            Service.gI().charMove(var0, var5);
        }

        Service.gI().charMove(var0, var1);
        myChar.timeSendmove = System.currentTimeMillis();
        myChar.cx = myChar.cxSend = var0;
        myChar.cy = myChar.cySend = var1;
    }
}
