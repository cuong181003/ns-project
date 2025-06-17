
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Image;

public final class GameScr extends mScreen implements IActionListener, IChatable {

    public static GameScr instance;
    public static int gW;
    public static int gH;
    public static int gW2;
    private static int gssw;
    private static int gssh;
    public static int gH23;
    public static int gH2;
    private static int csPadMaxH;
    public static int cmdBarH;
    public static int gW6;
    public static int cmx;
    public static int cmy;
    private static int cmdx;
    private static int cmdy;
    private static int cmvx;
    private static int cmvy;
    public static int cmtoX;
    public static int cmtoY;
    private static int cmxLim;
    private static int cmyLim;
    public static int gssx;
    public static int gssy;
    public static int gssxe;
    public static int gssye;
    public static MyVector nsoAX = new MyVector();
    private Command cmdBag;
    private Command cmdSkill;
    private Command cmdTiemnang;
    private Command cmdtrangbi;
    private Command cmdInfo;
    private Command cmdFocus;
    private Command cmdBijuu;
    private Command cmdTrangbi2;
    public static int mpPotion;
    public static int hpPotion;
    public static SkillPaint[] sks;
    public static Arrowpaint[] arrs;
    public static Part[] parts;
    public static EffectCharPaint[] efs;
    private int idTypeTask = 0;
    private boolean isShortcut = false;
    public static MyVector vMobSoul = new MyVector();
    public static MyVector vClan = new MyVector();
    public static MyVector vParty = new MyVector();
    public static MyVector vPtMap = new MyVector();
    public static MyVector vFriend = new MyVector();
    public static MyVector vList = new MyVector();
    public static MyVector vFriendWait = new MyVector();
    public static MyVector vEnemies = new MyVector();
    public static MyVector vCharInMap = new MyVector();
    public static MyVector vItemMap = new MyVector();
    public static MyVector vMobAttack = new MyVector();
    public static MyVector vSet = new MyVector();
    public static MyVector vMob = new MyVector();
    public static MyVector vNpc = new MyVector();
    public static MyVector vBuNhin = new MyVector();
    private static MyVector vLanterns = new MyVector();
    public static NClass[] nClasss;
    private static int indexSize = 28;
    private static int indexTitle = 0;
    public static int indexSelect = 0;
    public static int indexRow = -1;
    private static int indexRowMax;
    public static int indexMenu = 0;
    public static int indexCard = -1;
    private Item itemFocus;
    public static ItemOptionTemplate[] iOptionTemplates;
    public static SkillOptionTemplate[] sOptionTemplates;
    private static Scroll scrInfo = new Scroll();
    public static Scroll scrMain = new Scroll();
    public static Item[] arrItemNonNam;
    public static Item[] arrItemNonNu;
    public static Item[] arrItemAoNam;
    public static Item[] arrItemAoNu;
    public static Item[] arrItemGangTayNam;
    public static Item[] arrItemGangTayNu;
    public static Item[] arrItemQuanNam;
    public static Item[] arrItemQuanNu;
    public static Item[] arrItemGiayNam;
    public static Item[] arrItemGiayNu;
    public static Item[] arrItemLien;
    public static Item[] arrItemNhan;
    public static Item[] arrItemNgocBoi;
    public static Item[] arrItemPhu;
    public static Item[] arrItemWeapon;
    public static Item[] arrItemStack;
    public static Item[] arrItemStackLock;
    public static Item[] arrItemGrocery;
    public static Item[] arrItemGroceryLock;
    public static Item[] arrItemStore;
    public static Item[] arrItemElites;
    public static Item[] arrItemClanShop;
    public static Item[] arrItemBook;
    public static Item[] arrItemFashion;
    public static Item[] arrItemUpPeal;
    public static Item[] arrItemUpGrade;
    public static Item[] arrItemSplit;
    public static Item[] arrItemTradeMe;
    public static Item[] arrItemTradeOrder;
    public static Item[] arrItemConvert;
    public static ItemStands[] arrItemStands;
    public static short[] arrItemSprin;
    public int numSprinLeft;
    public static Item itemUpGrade;
    public static Item itemSplit;
    public static Item itemSell;
    private static boolean isTypeXu;
    private static boolean isViewNext;
    private static boolean isViewClanMemOnline;
    private static boolean isSortClanByPointWeek;
    public static boolean isViewClanInvite;
    private static boolean isChop;
    public static boolean isMessageMenu;
    private static boolean isPaintRankedList;
    public static boolean isPaintAuctionSale;
    public static boolean isPaintAlert;
    private static boolean isPaintTask;
    private static boolean isPaintTeam;
    private static boolean isPaintFindTeam;
    public static boolean isPaintFriend;
    private static boolean isPaintList;
    private static boolean isPaintEnemies;
    public static boolean isPaintItemInfo;
    private static boolean isPaintSelectSkill;
    public static boolean isPaintInfoMe;
    private static boolean isPaintStore;
    private static boolean isPaintEliteShop;
    private static boolean isPaintNonNam;
    private static boolean isPaintNonNu;
    private static boolean isPaintAoNam;
    private static boolean isPaintAoNu;
    private static boolean isPaintGangTayNam;
    private static boolean isPaintGangTayNu;
    private static boolean isPaintQuanNam;
    private static boolean isPaintQuanNu;
    private static boolean isPaintGiayNam;
    private static boolean isPaintGiayNu;
    private static boolean isPaintLien;
    private static boolean isPaintNhan;
    private static boolean isPaintNgocBoi;
    private static boolean isPaintPhu;
    private static boolean isPaintWeapon;
    private static boolean isPaintStack;
    private static boolean isPaintStackLock;
    private static boolean isPaintGrocery;
    private static boolean isPaintGroceryLock;
    private static boolean isPaintUpGrade;
    private static boolean isPaintConvert;
    private static boolean isPaintUpGradeGold;
    private static boolean isPaintUpPearl;
    private static boolean isPaintBox;
    private static boolean isPaintSplit;
    private static boolean isPaintCharInMap;
    public static boolean isPaintTrade;
    private static boolean isPaintZone;
    public static boolean isPaintAuto;
    public static boolean isPaintMessage;
    private static boolean isPaintClan;
    private static boolean isRequestMember;
    private static boolean isPaintLuckySpin;
    private static boolean isPaintAuctionBuy;
    private static boolean isPaintLuyenThach;
    private static boolean isPaintTinhluyen;
    private static boolean isPaintDichChuyen;
    private static boolean isPaintLuyenNgoc;
    private static boolean isPaintKhamNgoc;
    private static boolean isPaintGotNgoc;
    private static boolean isPaintThaoNgoc;
    private static boolean isPaintLucky_Draw;
    private static boolean isPaintGiaoDo;
    private static boolean isPaintCheDo;
    public static Char currentCharViewInfo;
    public static long[] exps;
    public static int[] crystals;
    public static int[] upClothe;
    public static int[] upAdorn;
    public static int[] upWeapon;
    public static int[] coinUpCrystals;
    public static int[] coinUpClothes;
    public static int[] coinUpAdorns;
    public static int[] coinUpWeapons;
    public static int[] maxPercents;
    public static int[] goldUps;
    private static int[] coinGotngoc;
    private int zoneCol = 6;
    public int[] zones;
    private int[] pts;
    public int typeTrade = 0;
    public int typeTradeOrder = 0;
    public int coinTrade = 0;
    public int coinTradeOrder = 0;
    public int timeTrade = 0;
    private int typeSortPrice = 0;
    private int typeSortLevel = 0;
    private int typeSortName = 0;
    private int indexItemUse = -1;
    public int cLastFocusID = -1;
    public int cPreFocusID = -1;
    private boolean isLockKey;
    public static byte[][] tasks;
    public static byte[][] mapTasks;
    private MyVector texts;
    private String textsTitle;
    private TField tfText = null;
    public static byte vcData;
    public static byte vcMap;
    public static byte vcSkill;
    public static byte vcItem;
    public static byte vsData;
    public static byte vsMap;
    public static byte vsSkill;
    public static byte vsItem;
    private static Image imgTopBar;
    private static Image imgTransparent;
    private static Image imgArrow;
    private static Image imgArrow2;
    private static Image imgChat;
    private static Image imgMenu;
    private static Image imgFocus;
    private static Image imgButton;
    private static Image imgButton2;
    private static Image imgHpp;
    private static Image imgMpp;
    private static Image imgRight;
    private static Image imgRight2;
    private static Image imgSkill;
    public static Image imgTf;
    public static Image imgMapBorder;
    public static Image imgLbtn;
    public static Image imgLbtnFocus;
    private static Image imgSelect;
    public static Image imgMatcho;
    public static Image imgFiremoto;
    public String tradeName = "";
    public String tradeItemName = "";
    public int timeLengthMap;
    public int timeStartMap;
    private static byte typeViewInfo;
    public static byte typeActive;
    private int[] xM = new int[2];
    private int[] yM = new int[2];
    private int[] xMounts;
    private int[] yMounts;
    public long timePoint;
    public String[] YenCards = new String[]{"10000", "20000", "30000", "50000", "100000", "200000", "500000", "1000000", "5000000"};
    public int yenTemp;
    public int typeba;
    public String[] yenValue;
    public static MyVector vItemTreeFront;
    public static MyVector vItemTreeBehind;
    public static MyVector vItemTreeBetwen;
    public static Image imgEggMonters;
    public static Image imgEffMob;
    public static Image imgEffMob1;
    public static Image imgEffMob2;
    public static Image imgEffMob3;
    public static Image imgsmokeFollow;
    public static boolean isUseitemAuto;
    public static boolean isAllmap;
    private static Skill[] keySkill;
    private static Skill[] onScreenSkill;
    private static byte[] ScreenSkill;
    private static byte[] keySkill1;
    private Command menu;
    private Command cmdPotentialAdd;
    private Command cmdSkillUp;
    private Command cmdAddFriend;
    private Command cmdBijuuAddPoint;
    private Command cmdBijuuSkillUp;
    private static byte nsoMG;
    static int shaking;
    static int count;
    private long lastFire;
    public static int auto;
    public boolean lockAutoMove = false;
    private int nSkill = 0;
    private int selectedIndexSkill = -1;
    private long lastSendUpdatePostion;
    private int runArrow = 0;
    private static int nsoMM;
    private static int yTouchBar;
    private static int xL;
    private static int yL;
    private static int xC;
    private static int yC;
    private static int xR;
    private static int yR;
    private static int xF;
    private static int yF;
    private static int xU;
    private static int yU;
    private static int xHP;
    private static int yHP;
    private static int xMP;
    private static int yMP;
    private static int xTG;
    private static int yTG;
    private static int[] xS;
    private static int[] yS;
    private static int xSkill;
    private static int ySkill;
    private static int padSkill;
    private static String[] flyTextString;
    private static int[] flyTextX;
    private static int[] flyTextY;
    private static int[] flyTextDx;
    private static int[] flyTextDy;
    private static int[] flyTextState;
    private static int[] flyTextColor;
    private static int[] splashX;
    private static int[] splashY;
    private static int[] splashState;
    private static int[] splashF;
    private static int[] splashDir;
    private static Image[] imgSplash;
    private static int cmdBarX;
    private static int cmdBarY;
    private static int cmdBarW;
    private static int nsoNZ;
    private static int nsoPA;
    private static int nsoPB;
    private static int hpBarX;
    private static int hpBarY;
    private static int hpBarW;
    private static int mpBarW;
    private static int expBarW;
    private static int nsoPH;
    private static Image[] nsoPI;
    public static int popupY;
    public static int popupX;
    private static int indextabTrangbi;
    private static boolean nsoPK;
    private int indexMember;
    private String[] arrClanInfo;
    private String[] arrClanDongGop;
    private int indexTiemNang;
    private Command cmdGiaoDoMoveOut;
    private Command cmdTradeLock;
    private Command cmdTradeAccept;
    private Command cmdKhamNgocMoveOut_Ngoc;
    private Command cmdKhamNgocMoveOut_Item;
    private Command cmdKhamNgocMoveOut_Stone;
    private Command cmdUpgradeMoveOut;
    private Command cmdConvertMoveOut;
    private Command cmdSplitMoveOut;
    private Command cmdTradeSendMoney;
    private Command cmdTradeMoveOut;
    private Command cmdTradeViewItemInfo;
    private Command cmdTradeSelectItem;
    private Command cmdTradeSelectInBag;
    private Command cmdTradeSelectInList;
    private Command cmdCloseAll;
    private Command cmdEliteShopBuy;
    private Command cmdEliteShopView;
    private Command cmdStoreBuy;
    private Command cmdStoreView;
    private Command cmdClanStoreBuy;
    private Command cmdClanStoreView;
    private Command cmdStoreLockBuy;
    private Command cmdStoreLockView;
    private Command cmdStoreFashionBuy;
    private Command cmdStoreFashionView;
    private Command cmdNonNamBuy;
    private Command cmdNonNamView;
    private Command cmdNonNuBuy;
    private Command cmdNonNuView;
    private Command cmdAoNamBuy;
    private Command cmdAoNamView;
    private Command cmdAoNuBuy;
    private Command cmdAoNuView;
    private Command cmdGangTayNamBuy;
    private Command cmdGangTayNamView;
    private Command cmdGangTayNuBuy;
    private Command cmdGangTayNuView;
    private String alertURL;
    private String fnick;
    private static int xstart;
    private static int ystart;
    public static int popupW;
    public static int popupH;
    private static int cmySK;
    private static int cmtoYSK;
    private static int cmdySK;
    private static int cmvySK;
    private static int columns;
    private static int rows;
    private int yPaint;
    private int[] color;
    private int[][] colorBorder;
    private int[] size;
    private static String Name_store;
    public static int indexEff;
    public static EffectCharPaint effUpok;
    private static int inforX;
    private static int inforY;
    private static int inforW;
    private static int inforH;
    public Command cmdDead;
    private Command cmdBagUseItem;
    private Command cmdBagSortItem;
    private Command cmdItemInfoClose;
    private Command cmdBagThrowItem;
    private Command cmdBagSplitItem;
    private Command cmdBagViewItemInfo;
    private Command cmdBagSelectItem;
    public static String svTitle;
    public static String svAction;
    private int Hitem;
    private int step;
    private String strErrCard;
    private long timeLastBuff;
    private static long lastAutoMove;
    private static int index;
    private static int[] fardistandsX;
    private static int[] fardistandsY;
    private static boolean nsoSJ;
    public static int pointCenterX;
    public static int pointCenterY;
    public static int rangeSearch;
    private short timeLucky_Draw;
    private short percentWin1Lucky_Draw;
    private short numPlayerLucky_Draw;
    private String timeC;
    private String totalMoneyLucky_Draw;
    private String percentWin2Lucky_Draw;
    private String winnerInfoLucky_Draw;
    private String myMoneyLucky_Draw;
    private long timeStart;
    private boolean isRefresh;
    public static byte typeLucky_Draw;
    private mFont fnt;
    private byte[] arrowCaptcha;
    private byte indexThanThu;
    private MyVector clan_thanthu;
    private int xThanThu;
    private int yThanThu;
    private int wThanThu;
    private int hThanThu;
    private int xExpThanThu;
    private int yExpThanThu;
    private int wExpThanThu;
    private int hExpThanThu;
    private int xSelectThanThu;
    private int ySelectThanThu;
    private int wSelectThanThu;
    private int xRecThanThu;
    private int yRecThanThu;
    private int wRecThanThu;
    private int hRecThanThu;
    private int countSendRequests;
    private String strTime;
    private int[] nsoTP;
    private int[] nsoTQ;
    private int nsoTR;
    private int[][] arrNgocKhamEXP;
    private static int indexBijuuMenu;
    public static boolean isSoftKey;
    private static InfoDlg advTE;
    public String[] advGM = new String[]{"LEFT", "UP", "RIGHT"};
    protected int[] advGN = new int[600];
    private static boolean isPaintPickItem;
    private static boolean isPaintDelItem;
    private static MyVector vMobTemplate;
    public static int advGO;
    public static boolean advGP;

    static {
        advTE = new InfoDlg();
        isSoftKey = true;
        vMobTemplate = new MyVector();
        advGO = 1;
        advGP = true;
        new MyVector();
        isViewClanMemOnline = false;
        isSortClanByPointWeek = false;
        isViewClanInvite = true;
        isMessageMenu = false;
        isPaintRankedList = false;
        isPaintAuctionSale = false;
        isPaintAlert = false;
        isPaintTask = false;
        isPaintTeam = false;
        isPaintFindTeam = false;
        isPaintFriend = false;
        isPaintList = false;
        isPaintEnemies = false;
        isPaintItemInfo = false;
        isPaintSelectSkill = false;
        isPaintInfoMe = false;
        isPaintStore = false;
        isPaintEliteShop = false;
        isPaintNonNam = false;
        isPaintNonNu = false;
        isPaintAoNam = false;
        isPaintAoNu = false;
        isPaintGangTayNam = false;
        isPaintGangTayNu = false;
        isPaintQuanNam = false;
        isPaintQuanNu = false;
        isPaintGiayNam = false;
        isPaintGiayNu = false;
        isPaintLien = false;
        isPaintNhan = false;
        isPaintNgocBoi = false;
        isPaintPhu = false;
        isPaintWeapon = false;
        isPaintStack = false;
        isPaintStackLock = false;
        isPaintGrocery = false;
        isPaintGroceryLock = false;
        isPaintUpGrade = false;
        isPaintConvert = false;
        isPaintUpGradeGold = false;
        isPaintUpPearl = false;
        isPaintBox = false;
        isPaintDelItem = false;
        isPaintPickItem = false;

        isPaintSplit = false;
        isPaintCharInMap = false;
        isPaintTrade = false;
        isPaintZone = false;
        isPaintAuto = false;
        isPaintMessage = false;
        isPaintClan = false;
        isRequestMember = false;
        isPaintLuckySpin = false;
        isPaintAuctionBuy = false;
        isPaintLucky_Draw = false;
        isPaintGiaoDo = false;
        isPaintCheDo = false;
        coinGotngoc = new int[]{0, 5000, 40000, 135000, 320000, 625000, 1080000, 1715000, 2560000, 3645000, 5000000};
        typeViewInfo = 0;
        typeActive = 0;
        vItemTreeFront = new MyVector();
        vItemTreeBehind = new MyVector();
        vItemTreeBetwen = new MyVector();
        isUseitemAuto = false;
        isAllmap = false;
        (GameCanvas.imgMx = new Image[2])[0] = GameCanvas.loadImage("/m1.png");
        GameCanvas.imgMx[1] = GameCanvas.loadImage("/m2.png");
        GameCanvas.imgPlus12 = GameCanvas.loadImage("/plus12.png");
        GameCanvas.backitem = GameCanvas.loadImage("/Big4.png");
        imgEggMonters = GameCanvas.loadImage("/trung1.png");
        imgSelect = GameCanvas.loadImage("/u/select.png");
        imgTf = GameCanvas.loadImage("/hd/tf.png");
        imgEffMob = GameCanvas.loadImage("/eff/g132.png");
        imgEffMob1 = GameCanvas.loadImage("/eff/g10.png");
        imgEffMob2 = GameCanvas.loadImage("/eff/g6.png");
        imgEffMob3 = GameCanvas.loadImage("/eff/g99.png");
        imgsmokeFollow = GameCanvas.loadImage("/eff/g9.png");
        if (GameCanvas.isTouch) {
            imgButton = GameCanvas.loadImage("/hd/button.png");
            imgButton2 = GameCanvas.loadImage("/hd/button2.png");
            imgHpp = GameCanvas.loadImage("/hd/hpp.png");
            imgMpp = GameCanvas.loadImage("/hd/mpp.png");
            imgRight = GameCanvas.loadImage("/hd/right.png");
            imgRight2 = GameCanvas.loadImage("/hd/right2.png");
            imgSkill = GameCanvas.loadImage("/hd/skill.png");
            imgLbtnFocus = GameCanvas.loadImage("/hd/btnlf.png");
            imgArrow = GameCanvas.loadImage("/hd/arrow.png");
            imgArrow2 = GameCanvas.loadImage("/hd/arrow2.png");
            imgChat = GameCanvas.loadImage("/hd/chat.png");
            imgFocus = GameCanvas.loadImage("/hd/focus.png");
            imgMenu = GameCanvas.loadImage("/hd/menu.png");
            imgTopBar = GameCanvas.loadImage("/hd/topbar.png");
            imgTransparent = GameCanvas.loadImage("/hd/transparent.png");
            imgMapBorder = GameCanvas.loadImage("/hd/mapborder.png");
            imgLbtn = GameCanvas.loadImage("/hd/btnl.png");
        }

        imgMatcho = GameCanvas.loadImage("/hd/mat.png");
        imgFiremoto = GameCanvas.loadImage("/hd/lua.png");
        byte[] var0 = RMS.loadRMS("dataVersion");
        byte[] var1 = RMS.loadRMS("mapVersion");
        byte[] var2 = RMS.loadRMS("skillVersion");
        byte[] var3 = RMS.loadRMS("itemVersion");
        if (var0 != null) {
            vcData = var0[0];
        }

        if (var1 != null) {
            vcMap = var1[0];
        }

        if (var2 != null) {
            vcSkill = var2[0];
        }

        if (var3 != null) {
            vcItem = var3[0];
        }

        keySkill = new Skill[3];
        onScreenSkill = new Skill[5];
        count = 0;
        flyTextX = new int[5];
        flyTextY = new int[5];
        flyTextDx = new int[5];
        flyTextDy = new int[5];
        flyTextState = new int[5];
        flyTextString = new String[5];
        flyTextColor = new int[8];

        for (int var4 = 0; var4 < 5; ++var4) {
            flyTextState[var4] = -1;
        }

        nsoPK = false;
        popupW = 140;
        popupH = 160;
        columns = 6;
        Name_store = "Shop Online";
        new MyVector();
        indexEff = 0;
        svTitle = "";
        svAction = "";
        nsoSJ = false;
        typeLucky_Draw = 0;
        indexBijuuMenu = 0;
    }

    public static long getMaxExp(int var0) {
        long var1 = 0L;

        for (int var3 = 0; var3 <= var0; ++var3) {
            var1 += exps[var3];
        }

        return var1;
    }

    public static void resetAllvector() {
        vCharInMap.removeAllElements();
        vItemMap.removeAllElements();
        vMobSoul.removeAllElements();
        Effect2.vEffect2.removeAllElements();
        Effect2.vAnimateEffect.removeAllElements();
        Effect2.vEffect2Outside.removeAllElements();
        vMobAttack.removeAllElements();
        vSet.removeAllElements();
        vMob.removeAllElements();
        vNpc.removeAllElements();
        vBuNhin.removeAllElements();
        Char.getMyChar().vMovePoints.removeAllElements();
    }

    public static void loadSkillShortcut() {
        Service.gI().loadRMS("KSkill");
        Service.gI().loadRMS("OSkill");
        Service.gI().loadRMS("CSkill");
    }

    public static void loadSkillShortcutNhanban() {
        Service.gI().loadRMS("KSkill");
        Service.gI().loadRMS("OSkill");
        Service.gI().loadRMS("CSkill");
    }

    public final void unLoad() {
        keySkill1 = new byte[this.yM.length];

        int var1;
        for (var1 = 0; var1 < this.yM.length; ++var1) {
            keySkill1[var1] = keySkill[var1] == null ? -1 : keySkill[var1].template.id;
        }

        ScreenSkill = new byte[this.xM.length];

        for (var1 = 0; var1 < this.xM.length; ++var1) {
            ScreenSkill[var1] = onScreenSkill[var1] == null ? -1 : onScreenSkill[var1].template.id;
        }

    }

    public static void onOSkill(byte[] var0) {
        onScreenSkill = new Skill[5];
        int var1;
        int var2;
        Skill var3;
        if (var0 == null) {
            if (ScreenSkill != null) {
                for (var1 = 0; var1 < ScreenSkill.length; ++var1) {
                    for (var2 = 0; var2 < Char.getMyChar().vSkillFight.size(); ++var2) {
                        if ((var3 = (Skill) Char.getMyChar().vSkillFight.elementAt(var2)).template.id == ScreenSkill[var1]) {
                            onScreenSkill[var1] = var3;
                            break;
                        }
                    }
                }
            } else {
                for (var1 = 0; var1 < onScreenSkill.length && var1 < Char.getMyChar().vSkillFight.size(); ++var1) {
                    Skill var4 = (Skill) Char.getMyChar().vSkillFight.elementAt(var1);
                    onScreenSkill[var1] = var4;
                }
            }

            saveOnScreenSkillToRMS();
        } else {
            for (var1 = 0; var1 < var0.length; ++var1) {
                for (var2 = 0; var2 < Char.getMyChar().vSkillFight.size(); ++var2) {
                    if ((var3 = (Skill) Char.getMyChar().vSkillFight.elementAt(var2)).template.id == var0[var1]) {
                        onScreenSkill[var1] = var3;
                        break;
                    }
                }
            }

        }
    }

    public static void onKSkill(byte[] var0) {
        keySkill = new Skill[3];
        int var1;
        int var2;
        Skill var3;
        if (var0 == null) {
            if (keySkill1 != null) {
                for (var1 = 0; var1 < keySkill1.length; ++var1) {
                    for (var2 = 0; var2 < Char.getMyChar().vSkillFight.size(); ++var2) {
                        if ((var3 = (Skill) Char.getMyChar().vSkillFight.elementAt(var2)).template.id == keySkill1[var1]) {
                            keySkill[var1] = var3;
                            break;
                        }
                    }
                }
            } else {
                for (var1 = 0; var1 < keySkill.length && var1 < Char.getMyChar().vSkillFight.size(); ++var1) {
                    Skill var4 = (Skill) Char.getMyChar().vSkillFight.elementAt(var1);
                    keySkill[var1] = var4;
                }
            }

            saveKeySkillToRMS();
        } else {
            for (var1 = 0; var1 < var0.length; ++var1) {
                for (var2 = 0; var2 < Char.getMyChar().vSkillFight.size(); ++var2) {
                    if ((var3 = (Skill) Char.getMyChar().vSkillFight.elementAt(var2)).template.id == var0[var1]) {
                        keySkill[var1] = var3;
                        break;
                    }
                }
            }

        }
    }

    public final void onCSkill(byte[] var1) {
        if (var1 != null && var1.length != 0) {
            for (int var3 = 0; var3 < Char.getMyChar().vSkillFight.size(); ++var3) {
                Skill var2;
                if ((var2 = (Skill) Char.getMyChar().vSkillFight.elementAt(var3)).template.id == var1[0]) {
                    Char.getMyChar().myskill = var2;
                    Char.getMyChar().lastNormalSkill = var2;
                    break;
                }
            }
        } else if (Char.getMyChar().vSkillFight.size() > 0) {
            Char.getMyChar().myskill = (Skill) Char.getMyChar().vSkillFight.elementAt(0);
        }

        if (Char.getMyChar().myskill != null) {
            Service.gI().selectSkill(Char.getMyChar().myskill.template.id);
            Char.getMyChar();
        }

    }

    private static void doSetOnScreenSkill(SkillTemplate var0) {
        Skill var5 = Char.getMyChar().getSkill(var0);
        MyVector var1 = new MyVector();

        for (int var2 = 0; var2 < 5; ++var2) {
            boolean var3 = false;
            if (onScreenSkill[var2] == null) {
                var3 = true;
            }

            Object[] var4;
            (var4 = new Object[2])[0] = var5;
            var4[1] = String.valueOf(var2);
            var1.addElement(new Command(mResources.CELLS + " " + (var2 + 1), 11120, var4));
            if (var3) {
                break;
            }
        }

        GameCanvas.menu.startAt(var1);
    }

    private static void doSetKeySkill(SkillTemplate var0) {
        Skill var5 = Char.getMyChar().getSkill(var0);
        String[] var1 = TField.isQwerty ? mResources.KEY_T9 : mResources.KEY_QWERTY;
        MyVector var2 = new MyVector();

        for (int var3 = 0; var3 < 3; ++var3) {
            Object[] var4;
            (var4 = new Object[2])[0] = var5;
            var4[1] = String.valueOf(var3);
            var2.addElement(new Command(var1[var3], 11121, var4));
        }

        GameCanvas.menu.startAt(var2);
    }

    private static void saveOnScreenSkillToRMS() {
        byte[] var0 = new byte[onScreenSkill.length];

        for (int var1 = 0; var1 < onScreenSkill.length; ++var1) {
            if (onScreenSkill[var1] == null) {
                var0[var1] = -1;
            } else {
                var0[var1] = onScreenSkill[var1].template.id;
            }
        }

        if (Char.getMyChar().isHumanz()) {
            Service.gI().saveRms((String) "OSkill", (byte[]) var0, (byte) 0);
        } else {
            Service.gI().saveRms((String) "OSkill", (byte[]) var0, (byte) 1);
        }
    }

    private static void saveKeySkillToRMS() {
        byte[] var0 = new byte[keySkill.length];

        for (int var1 = 0; var1 < keySkill.length; ++var1) {
            if (keySkill[var1] == null) {
                var0[var1] = -1;
            } else {
                var0[var1] = keySkill[var1].template.id;
            }
        }

        if (Char.getMyChar().isHumanz()) {
            Service.gI().saveRms((String) "KSkill", (byte[]) var0, (byte) 0);
        } else {
            Service.gI().saveRms((String) "KSkill", (byte[]) var0, (byte) 1);
        }
    }

    public final void addSkillShortcut(Skill var1) {
        if (var1.template.type != 0) {
            int var2;
            for (var2 = 0; var2 < onScreenSkill.length; ++var2) {
                if (onScreenSkill[var2] == null) {
                    onScreenSkill[var2] = var1;
                    break;
                }
            }

            for (var2 = 0; var2 < keySkill.length; ++var2) {
                if (keySkill[var2] == null) {
                    keySkill[var2] = var1;
                    break;
                }
            }

            if (Char.getMyChar().myskill == null) {
                Char.getMyChar().myskill = var1;
                if (Code.auto instanceof As20) {
                    Auto.advAO = var1;
                }
            }

            saveKeySkillToRMS();
            saveOnScreenSkillToRMS();
        }
    }

    public static boolean isBagFull() {
        for (int var0 = Char.getMyChar().arrItemBag.length - 1; var0 >= 0; --var0) {
            if (Char.getMyChar().arrItemBag[var0] == null) {
                return false;
            }
        }

        return true;
    }

    public static void createMenu(String[] var0, Npc var1) {
        MyVector var2 = new MyVector();

        for (int var3 = 0; var3 < var0.length; ++var3) {
            var2.addElement(new Command(var0[var3], 11057, var1));
        }

        GameCanvas.menu.startAt(var2);
    }

    public void doBag() {
        currentCharViewInfo = Char.getMyChar();
        indexMenu = 0;
        this.doMiniMenuInforMe();
    }

    private void doskill() {
        currentCharViewInfo = Char.getMyChar();
        indexMenu = 1;
        this.doMiniMenuInforMe();
    }

    private void doTiemnangMe() {
        currentCharViewInfo = Char.getMyChar();
        indexMenu = 2;
        this.doMiniMenuInforMe();
    }

    public final void doInfo() {
        currentCharViewInfo = Char.getMyChar();
        indexMenu = 3;
        this.doMiniMenuInforMe();
    }

    private void doTrangbi() {
        currentCharViewInfo = Char.getMyChar();
        indexMenu = 4;
        this.doMiniMenuInforMe();
    }

    private void doThucuoi() {
        currentCharViewInfo = Char.getMyChar();
        indexMenu = 5;
        this.doMiniMenuInforMe();
    }

    private void doBiJuu() {
        currentCharViewInfo = Char.getMyChar();
        indexMenu = 6;
        indexBijuuMenu = 0;
        this.doMiniMenuInforMe();
    }

    private void doBiJuu_Point() {
        currentCharViewInfo = Char.getMyChar();
        indexMenu = 6;
        indexBijuuMenu = 1;
        this.doMiniMenuInforMe();
    }

    private void doBiJuu_Skill() {
        currentCharViewInfo = Char.getMyChar();
        indexMenu = 6;
        indexBijuuMenu = 2;
        this.doMiniMenuInforMe();
    }

    public static void readPart() {
        DataInputStream var0 = null;

        try {
            short var1;
            parts = new Part[var1 = (var0 = new DataInputStream(new ByteArrayInputStream(RMS.loadRMS("nj_part")))).readShort()];

            for (int var2 = 0; var2 < var1; ++var2) {
                byte var3 = var0.readByte();
                parts[var2] = new Part(var3);

                for (int var11 = 0; var11 < parts[var2].pi.length; ++var11) {
                    parts[var2].pi[var11] = new PartImage();
                    parts[var2].pi[var11].id = var0.readShort();
                    parts[var2].pi[var11].dx = var0.readByte();
                    parts[var2].pi[var11].dy = var0.readByte();
                }
            }
        } catch (Exception var9) {
            var9.printStackTrace();
        } finally {
            try {
                var0.close();
            } catch (IOException var8) {
                var8.printStackTrace();
            }

        }

    }

    public static void readEfect() {
        DataInputStream var0 = null;

        try {
            short var1;
            efs = new EffectCharPaint[var1 = (var0 = new DataInputStream(new ByteArrayInputStream(RMS.loadRMS("nj_effect")))).readShort()];

            for (int var2 = 0; var2 < var1; ++var2) {
                efs[var2] = new EffectCharPaint();
                efs[var2].idEf = var0.readShort();
                efs[var2].arrEfInfo = new EffectInfoPaint[var0.readByte()];

                for (int var3 = 0; var3 < efs[var2].arrEfInfo.length; ++var3) {
                    efs[var2].arrEfInfo[var3] = new EffectInfoPaint();
                    efs[var2].arrEfInfo[var3].idImg = var0.readShort();
                    efs[var2].arrEfInfo[var3].dx = var0.readByte();
                    efs[var2].arrEfInfo[var3].dy = var0.readByte();
                }
            }
        } catch (Exception var9) {
            var9.printStackTrace();
        } finally {
            try {
                var0.close();
            } catch (IOException var8) {
                var8.printStackTrace();
            }

        }

    }

    public static void readArrow() {
        DataInputStream var0 = null;

        try {
            short var1;
            arrs = new Arrowpaint[var1 = (var0 = new DataInputStream(new ByteArrayInputStream(RMS.loadRMS("nj_arrow")))).readShort()];

            for (int var2 = 0; var2 < var1; ++var2) {
                arrs[var2] = new Arrowpaint();
                var0.readShort();
                arrs[var2].imgId[0] = var0.readShort();
                arrs[var2].imgId[1] = var0.readShort();
                arrs[var2].imgId[2] = var0.readShort();
            }
        } catch (Exception var8) {
            var8.printStackTrace();
        } finally {
            try {
                var0.close();
            } catch (IOException var7) {
                var7.printStackTrace();
            }

        }

    }

    public static void readSkill() {
        DataInputStream var0 = null;

        try {
            short var1 = (var0 = new DataInputStream(new ByteArrayInputStream(RMS.loadRMS("nj_skill")))).readShort();
            int var2 = 0;

            for (int var3 = 0; var3 < nClasss.length; ++var3) {
                var2 += nClasss[var3].skillTemplates.length;
            }

            sks = new SkillPaint[var2];

            for (int var3 = 0; var3 < var1; ++var3) {
                short var12 = var0.readShort();

                if (var12 >= 0 && var12 < sks.length) {
                    sks[var12] = new SkillPaint();
                    sks[var12].id = var0.readShort();
                    var0.readByte();
                    sks[var12].skillStand = new SkillInfoPaint[var0.readByte()];

                    for (int var4 = 0; var4 < sks[var12].skillStand.length; ++var4) {
                        sks[var12].skillStand[var4] = new SkillInfoPaint();
                        sks[var12].skillStand[var4].status = var0.readByte();
                        sks[var12].skillStand[var4].effS0Id = var0.readShort();
                        sks[var12].skillStand[var4].e0dx = var0.readShort();
                        sks[var12].skillStand[var4].e0dy = var0.readShort();
                        sks[var12].skillStand[var4].effS1Id = var0.readShort();
                        sks[var12].skillStand[var4].e1dx = var0.readShort();
                        sks[var12].skillStand[var4].e1dy = var0.readShort();
                        sks[var12].skillStand[var4].effS2Id = var0.readShort();
                        sks[var12].skillStand[var4].e2dx = var0.readShort();
                        sks[var12].skillStand[var4].e2dy = var0.readShort();
                        sks[var12].skillStand[var4].arrowId = var0.readShort();
                        sks[var12].skillStand[var4].adx = var0.readShort();
                        sks[var12].skillStand[var4].ady = var0.readShort();
                    }

                    sks[var12].skillfly = new SkillInfoPaint[var0.readByte()];

                    for (int var4 = 0; var4 < sks[var12].skillfly.length; ++var4) {
                        sks[var12].skillfly[var4] = new SkillInfoPaint();
                        sks[var12].skillfly[var4].status = var0.readByte();
                        sks[var12].skillfly[var4].effS0Id = var0.readShort();
                        sks[var12].skillfly[var4].e0dx = var0.readShort();
                        sks[var12].skillfly[var4].e0dy = var0.readShort();
                        sks[var12].skillfly[var4].effS1Id = var0.readShort();
                        sks[var12].skillfly[var4].e1dx = var0.readShort();
                        sks[var12].skillfly[var4].e1dy = var0.readShort();
                        sks[var12].skillfly[var4].effS2Id = var0.readShort();
                        sks[var12].skillfly[var4].e2dx = var0.readShort();
                        sks[var12].skillfly[var4].e2dy = var0.readShort();
                        sks[var12].skillfly[var4].arrowId = var0.readShort();
                        sks[var12].skillfly[var4].adx = var0.readShort();
                        sks[var12].skillfly[var4].ady = var0.readShort();
                    }
                }
            }
        } catch (Exception var10) {
            var10.printStackTrace();
        } finally {
            try {
                if (var0 != null) {
                    var0.close();
                }
            } catch (IOException var9) {
                var9.printStackTrace();
            }
        }
    }

    public static void setLevel_Exp(long var0, boolean var2) {
        long var6 = var0;
        boolean var8 = false;

        int var9;
        for (var9 = 0; var9 < exps.length && var6 >= exps[var9]; ++var9) {
            var6 -= exps[var9];
        }

        long[] var10 = new long[]{(long) var9, var6};
        Char.getMyChar().clevel = (int) var10[0];
        Char.getMyChar().cExpR = var10[1];
    }

    public static GameScr gI() {
        if (instance == null) {
            instance = new GameScr();
        }

        return instance;
    }

    public static void clearGameScr() {
        instance = null;
        arrItemTradeOrder = null;
        arrItemTradeMe = null;
        arrItemSplit = null;
        arrItemUpGrade = null;
        arrItemUpPeal = null;
        itemSplit = null;
        itemUpGrade = null;
    }

    public final void loadGameScr() {
        if (imgSplash == null) {
            imgSplash = new Image[3];

            for (int var1 = 0; var1 < 3; ++var1) {
                imgSplash[var1] = GameCanvas.loadImage("/e/sp" + var1 + ".png");
            }
        }

        splashX = new int[2];
        splashY = new int[2];
        splashState = new int[2];
        splashF = new int[2];
        splashDir = new int[2];
        splashState[0] = splashState[1] = -1;
        this.loadCmdBar();
        Res.init();
    }

    public GameScr() {
        int[] var10000 = new int[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        this.indexMember = 0;
        this.arrClanInfo = null;
        this.arrClanDongGop = null;
        this.indexTiemNang = 0;
        this.yPaint = 0;
        this.color = new int[]{0, 0, 0, 0, 600841, 600841, 667658, 667658, 3346944, 3346688, 4199680, 5052928, 3276851, 3932211, 4587571, 5046280, 6684682, 3359744};
        this.colorBorder = new int[][]{{18687, 16869, 15052, 13235, 11161, 9344}, {45824, 39168, 32768, 26112, 19712, 13056}, {16744192, 15037184, 13395456, 11753728, 10046464, 8404992}, {13500671, 12058853, 10682572, 9371827, 7995545, 6684800}, {16711705, 15007767, 13369364, 11730962, 10027023, 8388621}};
        this.size = new int[]{2, 1, 1, 1, 1, 1};
        this.cmdDead = new Command(mResources.DIES[0], 11038);
        this.Hitem = 30;
        this.step = 0;
        this.strErrCard = "";
        this.fnt = mFont.tahoma_7b_yellow;
        this.arrowCaptcha = new byte[]{-1, -1, -1, -1, -1, -1};
        this.indexThanThu = 0;
        this.clan_thanthu = new MyVector();
        this.strTime = "";
        this.arrNgocKhamEXP = new int[][]{new int[2], {200, 10}, {500, 20}, {1000, 50}, {2000, 100}, {5000, 200}, {10000, 500}, {20000, 1000}, {50000, 2000}, {100000, 5000}, {100000, 10000}};
        if (GameCanvas.w == 128 || GameCanvas.h <= 208) {
            indexSize = 20;
        }

        this.cmdBijuuAddPoint = new Command(mResources.ADD, 5043);
        this.cmdBijuuSkillUp = new Command(mResources.ADD, 5053);
        this.cmdAddFriend = new Command(mResources.ACCEPT, 11002);
        this.cmdSkillUp = new Command(mResources.ADD, 11003);
        this.cmdGangTayNuView = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11004);
        this.cmdGangTayNuBuy = new Command(mResources.BUY, 11005);
        this.cmdPotentialAdd = new Command(mResources.ADD, 11006);
        this.cmdGangTayNamView = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11007);
        this.cmdGangTayNamBuy = new Command(mResources.BUY, 11008);
        this.cmdAoNuView = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11009);
        this.cmdAoNuBuy = new Command(mResources.BUY, 11010);
        this.cmdAoNamView = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11011);
        this.cmdAoNamBuy = new Command(mResources.BUY, 11012);
        this.cmdNonNuView = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11013);
        this.cmdNonNuBuy = new Command(mResources.BUY, 11014);
        this.cmdNonNamView = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11015);
        this.cmdNonNamBuy = new Command(mResources.BUY, 11016);
        this.cmdStoreLockView = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11017);
        this.cmdStoreFashionView = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 13001);
        this.cmdStoreLockBuy = new Command(mResources.BUY, 11018);
        this.cmdStoreFashionBuy = new Command(mResources.BUY, 13002);
        this.cmdStoreView = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11019);
        this.cmdStoreBuy = new Command(mResources.BUY, 11020);
        this.cmdEliteShopBuy = new Command(mResources.BUY, 14022);
        this.cmdEliteShopView = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 14023);
        this.cmdClanStoreView = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 14018);
        this.cmdClanStoreBuy = new Command(mResources.BUY, 14019);
        this.cmdCloseAll = new Command(mResources.CLOSE, 11021);
        this.cmdBagSelectItem = new Command(mResources.SELECT, 11022);
        this.cmdBagViewItemInfo = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11023);
        this.cmdBagThrowItem = new Command(mResources.THROW, 11024);
        this.cmdBagSplitItem = new Command(mResources.SPLIT, 110244);
        this.cmdItemInfoClose = new Command(mResources.CLOSE, 11025);
        this.cmdBagUseItem = new Command(mResources.USE, 11026);
        this.cmdBagSortItem = new Command(mResources.SORT, 110221);
        this.cmdTradeSelectInList = new Command(mResources.SELECT, 11027);
        this.cmdTradeSelectInBag = new Command(mResources.SELECT, 11028);
        this.cmdTradeSelectItem = new Command(mResources.SELECT, 11029);
        this.cmdTradeViewItemInfo = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11030);
        new Command(mResources.BACK, 11021);
        this.menu = new Command(mResources.MENU, 11000);
        this.cmdFocus = new Command("Focus", 11001);
        this.cmdTradeLock = new Command(mResources.LOCK1, 11032);
        this.cmdTradeAccept = new Command(mResources.ACCEPT, 11033);
        this.cmdUpgradeMoveOut = new Command(mResources.MOVEOUT, 11034);
        this.cmdConvertMoveOut = new Command(mResources.MOVEOUT, 14014);
        this.cmdSplitMoveOut = new Command(mResources.MOVEOUT, 11035);
        this.cmdTradeSendMoney = new Command(mResources.SENDMONEY, 11036);
        this.cmdTradeMoveOut = new Command(mResources.MOVEOUT, 11037);
        this.cmdKhamNgocMoveOut_Ngoc = new Command(mResources.MOVEOUT, 339);
        this.cmdKhamNgocMoveOut_Item = new Command(mResources.MOVEOUT, 340);
        this.cmdKhamNgocMoveOut_Stone = new Command(mResources.MOVEOUT, 343);
        this.cmdGiaoDoMoveOut = new Command(mResources.MOVEOUT, 402);
        new Command("240", 110381);
        new Command("360", 1103911);
        new Command("Toàn Map", 110401);
        this.cmdTrangbi2 = new Command(mResources.tbi2, 2003);
        int iX = GameCanvas.w / 2 - 35;
        int iY = GameCanvas.h - 26;
        this.cmdTrangbi2.x = iX;
        this.cmdTrangbi2.y = iY;
        if (GameCanvas.isTouch && GameCanvas.isTouchControl) {
            this.menu.x = gW - 135;
            this.menu.y = 6;
            this.menu.img = imgMenu;
            this.cmdFocus.x = gW;
            this.cmdFocus.y = gH;
            if (GameCanvas.isTouchControlSmallScreen) {
                this.menu.x = gW / 2 - 38;
                this.menu.y = gH - 34;
            }
        }

        this.cmdFocus.img = GameCanvas.loadImage("/u/fc.png");
        super.left = this.menu;
        super.right = this.cmdFocus;
        if ((nsoMM = GameCanvas.h / 5) > 100) {
            nsoMM = 100;
        }

    }

    private void doCloseItemInfo() {
        if (!GameCanvas.isTouch || GameCanvas.isTouch && GameCanvas.w < 320 || isPaintInfoMe && indexMenu > 0 || isPaintClan && indexMenu == 0) {
            isPaintItemInfo = false;
        }

        isViewNext = false;
        if (isPaintUI()) {
            this.updateCommandForUI();
            super.right = this.cmdCloseAll;
        } else {
            this.setLCR();
        }
    }

    private void doUpPotential() {
        if (indexTitle > 0 && indexTitle <= 4 || GameCanvas.isTouch) {
            GameCanvas.inputDlg.show(mResources.INPUT_POINT, this.cmdPotentialAdd, 1);
        }
    }

    private void doUpSkill() {
        if (indexTitle > 0 && indexTitle <= 4) {
            GameCanvas.inputDlg.show(mResources.INPUT_POINT, this.cmdSkillUp, 1);
        }
    }

    private void doAddFriend() {
        if (isPaintFriend) {
            GameCanvas.inputDlg.show(mResources.BE_FRIEND_WITH, this.cmdAddFriend, 0);
        }
    }

    private void doMiniMenuInforMe() {
        isPaintInfoMe = true;
        setPopupSize(175, 202);
        this.setLCR();
        if (indexMenu == 3 && currentCharViewInfo.charID == Char.getMyChar().charID) {
            Service.gI().viewInfo((String) currentCharViewInfo.cName, 0);
        }

        if (indexMenu == 5) {
            this.xMounts = new int[5];
            this.yMounts = new int[5];
            xstart = popupX + 5;
            ystart = popupY + 35;
            this.xMounts[0] = xstart + 5;
            this.yMounts[0] = ystart + 35;
            this.xMounts[1] = xstart + 5;
            this.yMounts[1] = ystart + 70;
            this.xMounts[2] = xstart + 131;
            this.yMounts[2] = ystart + 35;
            this.xMounts[3] = xstart + 131;
            this.yMounts[3] = ystart + 70;
            this.xMounts[4] = this.xMounts[0] + indexSize + 7;
            this.yMounts[4] = this.yMounts[0] - 5;
        }

        if (indexMenu == 6) {
            this.xMounts = new int[5];
            this.yMounts = new int[5];
            xstart = popupX + 5;
            ystart = popupY + 35;
            this.xMounts[0] = xstart + 5;
            this.yMounts[0] = ystart + 35;
            this.xMounts[1] = xstart + 5;
            this.yMounts[1] = ystart + 70;
            this.xMounts[2] = xstart + 131;
            this.yMounts[2] = ystart + 35;
            this.xMounts[3] = xstart + 131;
            this.yMounts[3] = ystart + 70;
            this.xMounts[4] = this.xMounts[0] + indexSize + 7;
            this.yMounts[4] = this.yMounts[0] - 5;
        }

        super.right = new Command(mResources.BACK, 11060);
    }

    private void doMenuInforMe() {
        scrMain.clear();
        scrInfo.clear();
        isViewNext = false;
        this.cmdBag = new Command(mResources.MENUME[0], 1100011);
        this.cmdSkill = new Command(mResources.MENUME[1], 1100012);
        this.cmdTiemnang = new Command(mResources.MENUME[2], 1100013);
        this.cmdInfo = new Command(mResources.MENUME[3], 1100014);
        this.cmdtrangbi = new Command(mResources.MENUME[4], 1100015);
        this.cmdBijuu = new Command(mResources.MENUME[6], 1100017);
        MyVector var1;
        (var1 = new MyVector()).addElement(this.cmdBag);
        var1.addElement(this.cmdSkill);
        var1.addElement(this.cmdTiemnang);
        var1.addElement(this.cmdInfo);
        var1.addElement(this.cmdtrangbi);
        var1.addElement(new Command(mResources.MENUME[5], 1100016));
        var1.addElement(this.cmdBijuu);
        GameCanvas.menu.startAt(var1);
    }

    private static void doMenuAuto() {
        MyVector var0 = new MyVector();
        if (Code.auto != null) {
            var0.addElement(new Command("Tắt Auto", 1100073));
        } else {
            if (TileMap.mapID == 1 || TileMap.mapID == 27 || TileMap.mapID == 72) {
                var0.addElement(new Command("Auto NV", 1100074));
            }

            var0.addElement(new Command("Tàn sát", 1100069));
            var0.addElement(new Command("Auto Tà Thú", 1100075));
        }

        var0.addElement(new Command("NPC", 1100071));
        var0.addElement(new Command("DS PK", 1100093));
        var0.addElement(new Command("DS HS", 1100094));
        var0.addElement(new Command("Item Sell", 1100091));
        var0.addElement(new Command("Item Nhặt", 1100076));
        var0.addElement(new Command("Item Del", 11000761));
        var0.addElement(new Command("Item SW", 1100092));
        var0.addElement(new Command(Code.isAHutVP ? "Hút VP" : "Nhặt Xa", 1100080));
        var0.addElement(new Command(Code.KCNhatValue > 0 ? "KC Nhặt: " + Code.KCNhatValue : "Nhặt Full", 1100081));
        var0.addElement(new Command(Code.KCTSValue > 0 ? "KCTS: " + Code.KCTSValue : "TS Full", 1100082));
        var0.addElement(new Command("Đánh CVT: " + (Code.isADanhCVT ? "Bật" : "Tắt"), 1100083));
        var0.addElement(new Command("Đánh CK: " + (Code.isADanhCK ? "Bật" : "Tắt"), 1100089));
        var0.addElement(new Command("Giữ Lvl: " + (Code.isAGiuLV ? "Bật" : "Tắt"), 1100084));
        var0.addElement(new Command("SPGame: " + Code.SPGameValue, 1100087));
        var0.addElement(CuongScr.advAA("SPNextMap: " + Code.SPNextMapValue, 93));
        var0.addElement(new Command(mResources.ACTIONS[7], 1100068));
        GameCanvas.menu.startAt(var0);
    }

    private static void doMenusynthesis() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.SYNTHESIS[0], 110002));
        var0.addElement(new Command(mResources.SYNTHESIS[1], 1100032));
        var0.addElement(new Command(mResources.SYNTHESIS[2], 1100033));
        var0.addElement(new Command(mResources.Lucky_draw, 1100034));
        var0.addElement(new Command(mResources.CONFIG, LoginScr.gI(), 1004, (Object) null));
        GameCanvas.menu.startAt(var0);
    }

    private static void actMenu() {
        MyVector var0 = new MyVector();
        var0.addElement(new Command(mResources.MENUGAMESCR[1], 110001));
        var0.addElement(new Command("MenuAuto", 110021));
        var0.addElement(CuongScr.advAA("cuongcute", 99));
        var0.addElement(new Command("Lật hình", 11000799));

        var0.addElement(new Command(mResources.MENUGAMESCR[3], 110003));
        var0.addElement(new Command(mResources.MENUGAMESCR[6], 110006));
        var0.addElement(new Command(mResources.MENUGAMESCR[18], 110018));
        var0.addElement(new Command(mResources.MENUGAMESCR[14], 110014));
        var0.addElement(new Command("Tự sát", 110020));
        var0.addElement(new Command(mResources.MENUGAMESCR[16], 110016));
        var0.addElement(new Command(mResources.MENUGAMESCR[4], 110004));
        GameCanvas.menu.startAt(var0);
    }

    private void doShowTaskUI() {
        this.resetButton();
        isPaintTask = true;
        indexMenu = this.idTypeTask;
        this.isLockKey = true;
        setPopupSize(175, 200);
        super.right = this.cmdCloseAll;
        super.left = new Command(mResources.MENUGAMESCR[2], 110002);
        super.center = new Command(mResources.CHANGE, 110019);
    }

    private void doShowFindTeamUI() {
        this.resetButton();
        isPaintFindTeam = true;
        this.isLockKey = true;
        setPopupSize(175, 200);
        super.right = this.cmdCloseAll;
        Service.gI().openFindParty();
        this.refreshFindTeam();
    }

    private void doShowCharInMap() {
        this.resetButton();
        if (this.cLastFocusID > 0) {
            indexRow = Char.getIndexChar(this.cLastFocusID);
        } else {
            indexRow = 0;
            this.cLastFocusID = -1;
        }

        isPaintCharInMap = true;
        this.isLockKey = true;
        setPopupSize(175, 200);
        super.right = this.cmdCloseAll;
    }

    private void doShowTeamUI() {
        this.resetButton();
        isPaintTeam = true;
        this.isLockKey = true;
        setPopupSize(175, 200);
        super.right = this.cmdCloseAll;
        this.refreshTeam();
    }

    public final void doShowRankedListUI() {
        this.resetButton();
        isPaintRankedList = true;
        this.isLockKey = true;
        setPopupSize(175, 200);
        super.right = this.cmdCloseAll;
        super.left = super.center = null;
        indexRow = 0;
    }

    public final void doShowListUI() {
        this.resetButton();
        isPaintList = true;
        this.isLockKey = true;
        setPopupSize(175, 200);
        super.right = this.cmdCloseAll;
        super.left = super.center = null;
        indexRow = 0;
    }

    private void doShowFriendUI() {
        this.resetButton();
        isPaintFriend = true;
        this.isLockKey = true;
        setPopupSize(175, 200);
        super.right = this.cmdCloseAll;
        super.left = new Command(mResources.LIST, 11044);
        super.center = null;
        indexRow = 0;
        Service.gI().requestFriend();
    }

    private void doShowEnemiesUI() {
        this.resetButton();
        isPaintEnemies = true;
        this.isLockKey = true;
        setPopupSize(175, 200);
        super.right = this.cmdCloseAll;
        super.left = new Command(mResources.LIST, 14017);
        super.center = null;
        indexRow = 0;
        Service.gI().requestEnemies();
    }

    public final void refreshFindTeam() {
        if (isPaintFindTeam) {
            super.left = super.center = null;
            super.left = new Command(mResources.MENU, 11045);
            Party var1;
            if (vPtMap.size() > 0 && indexRow >= 0 && indexRow < vPtMap.size() && (var1 = (Party) vPtMap.elementAt(indexRow)) != null && !Char.getMyChar().cName.equals(var1.name)) {
                super.center = new Command(mResources.SELECT, 11046);
            }
        }

    }

    public final void refreshTeam() {
        if (isPaintTeam) {
            super.left = super.center = null;
            indexRow = 0;
            if (vParty.size() == 0) {
                super.center = null;
                super.left = new Command(mResources.MENU, 11047);
                return;
            }

            Party var1;
            if ((var1 = (Party) vParty.firstElement()).charId == Char.getMyChar().charID) {
                super.left = new Command(mResources.TEAMLEADER, 11070, var1);
                return;
            }

            super.left = new Command(mResources.OUT_TEAM, 11071);
        }

    }

    private static void doShowMap() {
        if (TileMap.typeMap != 1) {
            MapScr.gI().switchToMe();
        }

    }

    public final void openUIZone(Message var1) {
        InfoDlg.hide();

        try {
            byte var2;
            if ((var2 = var1.reader().readByte()) > 0) {
                this.zones = new int[var2];
                this.pts = new int[this.zones.length];

                for (int var4 = 0; var4 < this.zones.length; ++var4) {
                    this.zones[var4] = var1.reader().readByte();
                    this.pts[var4] = var1.reader().readByte();
                }

                isPaintZone = true;
                indexSelect = TileMap.zoneID;
                setPopupSize(175, 200);
                super.left = new Command(mResources.SELECT, 11067);
                super.center = new Command("", 11067);
                super.right = this.cmdCloseAll;
            }
        } catch (Exception var3) {
            var3.printStackTrace();
        }
    }

    public final void openUITrade() {
        try {
            this.resetButton();
            this.tradeItemName = "";
            this.typeTrade = 0;
            this.typeTrade = this.typeTradeOrder = this.coinTrade = this.coinTradeOrder = 0;
            isPaintTrade = true;
            arrItemTradeMe = new Item[12];
            arrItemTradeOrder = new Item[12];
            indexMenu = 0;
            setPopupSize(175, 200);
            super.right = this.cmdCloseAll;
        } catch (Exception var1) {
        }
    }

    public static final void loadCamera(boolean var0) {
        gW = GameCanvas.w;
        if (GameCanvas.isTouch && (!GameCanvas.isTouch || GameCanvas.isTouchControl)) {
            cmdBarH = 8;
        } else {
            cmdBarH = 36;
            if (GameCanvas.isTouch) {
                cmdBarH += 3;
            }
        }

        gH = GameCanvas.h - cmdBarH - 20;
        if (var0) {
            gH = GameCanvas.h;
        }

        if (GameCanvas.isTouch && GameCanvas.isTouchControl) {
            gH = GameCanvas.h;
        }

        if (GameCanvas.h == 160) {
            gH = 150;
        }

        cmdBarW = gW;
        if (GameCanvas.w > 176) {
            cmdBarW -= 50;
        }

        cmdBarX = 0;
        cmdBarY = GameCanvas.h - Paint.hTab - cmdBarH;
        if ((csPadMaxH = GameCanvas.h / 6) < 48) {
            csPadMaxH = 48;
        }

        gW2 = gW >> 1;
        gH2 = gH >> 1;
        gH23 = 2 * gH / 3;
        gW6 = gW / 6;
        gssw = gW / TileMap.size + 2;
        gssh = gH / TileMap.size + 2;
        if (gW % 24 != 0) {
            ++gssw;
        }

        cmxLim = (TileMap.tmw - 1) * TileMap.size - gW;
        cmyLim = (TileMap.tmh - 1) * TileMap.size - gH;
        if (GameCanvas.isTouch && GameCanvas.isTouchControl) {
            cmyLim += 60;
        }

        cmx = cmtoX = Char.getMyChar().cx - gW2 + gW6 * Char.getMyChar().cdir;
        cmy = cmtoY = Char.getMyChar().cy - gH23;
        if (cmx < 24) {
            cmx = 24;
        }

        if (cmx > cmxLim) {
            cmx = cmxLim;
        }

        if (cmy < 0) {
            cmy = 0;
        }

        if (cmy > cmyLim) {
            cmy = cmyLim;
        }

        if ((gssx = cmx / TileMap.size - 1) < 0) {
            gssx = 0;
        }

        gssy = cmy / TileMap.size;
        gssxe = gssx + gssw;
        gssye = gssy + gssh;
        if (gssy < 0) {
            gssy = 0;
        }

        if (gssye > TileMap.tmh - 1) {
            gssye = TileMap.tmh - 1;
        }

        if ((TileMap.countx = gssxe - gssx << 2) > TileMap.tmw) {
            TileMap.countx = TileMap.tmw;
        }

        if ((TileMap.county = gssye - gssy << 2) > TileMap.tmh) {
            TileMap.county = TileMap.tmh;
        }

        if ((TileMap.gssx = (Char.getMyChar().cx - 2 * gW) / TileMap.size) < 0) {
            TileMap.gssx = 0;
        }

        if ((TileMap.gssxe = TileMap.gssx + TileMap.countx) > TileMap.tmw) {
            TileMap.gssxe = TileMap.tmw;
        }

        if ((TileMap.gssy = (Char.getMyChar().cy - 2 * gH) / TileMap.size) < 0) {
            TileMap.gssy = 0;
        }

        if ((TileMap.gssye = TileMap.gssy + TileMap.county) > TileMap.tmh) {
            TileMap.gssye = TileMap.tmh;
        }

        ChatTextField.gI().parentScreen = instance;
        ChatTextField.gI().tfChat.y = GameCanvas.h - 35 - ChatTextField.gI().tfChat.height;
        if (GameCanvas.isTouch && (!GameCanvas.isTouch || GameCanvas.isTouchControl)) {
            TileMap.setPosMiniMap(GameCanvas.w - 60, 0, 60, 42);
        } else {
            TileMap.setPosMiniMap(GameCanvas.w - 51, cmdBarY - 4, 50, 40);
        }

        if (GameCanvas.isTouch) {
            yTouchBar = gH - 88;
            xC = gW - 100;
            yC = 2;
            if (GameCanvas.isTouchControlSmallScreen) {
                xC = gW / 2 - 2;
                yC = yTouchBar + 50;
            }

            xL = 1;
            yL = yTouchBar + 50;
            xR = 42;
            yR = yTouchBar + 50;
            xF = gW - 50;
            yF = yTouchBar + 35;
            xU = 22;
            yU = yTouchBar + 19;
            xHP = gW - 74;
            yHP = yTouchBar + 13;
            xMP = gW - 85;
            yMP = yTouchBar + 50;
            xTG = gW - 37;
            yTG = yTouchBar - 1;
            if (GameCanvas.w >= 450) {
                yU -= 15;
                xU += 28;
                xR += 45;
                xL += 10;
                yTG -= 12;
                yHP -= 7;
                xF -= 18;
                xTG -= 10;
                xHP -= 17;
                xMP -= 24;
            } else if (GameCanvas.w >= 360) {
                yU -= 5;
                xU += 6;
                xR += 12;
                yTG -= 2;
                yHP -= 2;
                xHP -= 2;
                xMP -= 2;
            }
        }

        xS = new int[onScreenSkill.length];
        yS = new int[onScreenSkill.length];
        int var1;
        if (GameCanvas.isTouch) {
            if (GameCanvas.isTouchControlSmallScreen) {
                xSkill = 2;
                ySkill = 55;
                padSkill = 5;

                for (var1 = 0; var1 < xS.length; ++var1) {
                    xS[var1] = var1 * (25 + padSkill);
                    yS[var1] = ySkill;
                }

            } else {
                if (GameCanvas.w <= 320) {
                    xSkill = gW2 - onScreenSkill.length * 25 / 2 - 15;
                } else {
                    xSkill = gW2 - onScreenSkill.length * 25 / 2;
                }

                ySkill = yTouchBar + 58;
                padSkill = 5;

                for (var1 = 0; var1 < xS.length; ++var1) {
                    xS[var1] = var1 * (25 + padSkill);
                    yS[var1] = ySkill;
                }

            }
        } else {
            xSkill = 0;

            for (var1 = 0; var1 < yS.length; ++var1) {
                xS[var1] = 2;
                yS[var1] = 2 + var1 * 25;
            }

        }
    }

    private static boolean checkSkillValid() {
        if (Char.getMyChar().myskill != null && Char.getMyChar().cMP < Char.getMyChar().myskill.manaUse) {
            InfoMe.addInfo(mResources.NOT_ENOUGH_MP);
            return false;
        } else if (Char.getMyChar().myskill != null && (Char.getMyChar().myskill.template.maxPoint <= 0 || Char.getMyChar().myskill.point != 0)) {
            if (Char.getMyChar().arrItemBody[1] == null) {
                GameCanvas.startOKDlg(mResources.SKILL_FAIL);
                return false;
            } else {
                return true;
            }
        } else {
            GameCanvas.startOKDlg(mResources.WEAPON_EMPTY);
            return false;
        }
    }

    public final void resetButton() {
        if (Char.getMyChar().arrItemBag != null) {
            int var10001;
            int var1;
            if ((isPaintUpPearl || isPaintLuyenThach) && arrItemUpPeal != null) {
                for (var1 = 0; var1 < arrItemUpPeal.length; ++var1) {
                    if (arrItemUpPeal[var1] != null) {
                        var10001 = arrItemUpPeal[var1].indexUI;
                        Char.getMyChar().arrItemBag[var10001] = arrItemUpPeal[var1];
                        arrItemUpPeal[var1] = null;
                    }
                }
            }

            if (isPaintUpGrade) {
                if (itemUpGrade != null) {
                    Char.getMyChar().arrItemBag[itemUpGrade.indexUI] = itemUpGrade;
                    itemUpGrade = null;
                }

                if (arrItemUpGrade != null) {
                    for (var1 = 0; var1 < arrItemUpGrade.length; ++var1) {
                        if (arrItemUpGrade[var1] != null) {
                            var10001 = arrItemUpGrade[var1].indexUI;
                            Char.getMyChar().arrItemBag[var10001] = arrItemUpGrade[var1];
                            arrItemUpGrade[var1] = null;
                        }
                    }
                }
            }

            if (isPaintKhamNgoc) {
                if (itemUpGrade != null) {
                    Char.getMyChar().arrItemBag[itemUpGrade.indexUI] = itemUpGrade;
                    itemUpGrade = null;
                }

                if (itemSplit != null) {
                    Char.getMyChar().arrItemBag[itemSplit.indexUI] = itemSplit;
                    itemSplit = null;
                }

                if (arrItemUpGrade != null) {
                    for (var1 = 0; var1 < arrItemUpGrade.length; ++var1) {
                        if (arrItemUpGrade[var1] != null) {
                            var10001 = arrItemUpGrade[var1].indexUI;
                            Char.getMyChar().arrItemBag[var10001] = arrItemUpGrade[var1];
                            arrItemUpGrade[var1] = null;
                        }
                    }
                }
            }

            if (isPaintGiaoDo && arrItemUpGrade != null) {
                for (var1 = 0; var1 < arrItemUpGrade.length; ++var1) {
                    if (arrItemUpGrade[var1] != null) {
                        var10001 = arrItemUpGrade[var1].indexUI;
                        Char.getMyChar().arrItemBag[var10001] = arrItemUpGrade[var1];
                        arrItemUpGrade[var1] = null;
                    }
                }
            }

            if (isPaintAuctionSale && itemSell != null) {
                Char.getMyChar().arrItemBag[itemSell.indexUI] = itemSell;
                itemSell = null;
            }

            if (isPaintConvert && arrItemConvert != null) {
                for (var1 = 0; var1 < arrItemConvert.length; ++var1) {
                    if (arrItemConvert[var1] != null) {
                        var10001 = arrItemConvert[var1].indexUI;
                        Char.getMyChar().arrItemBag[var10001] = arrItemConvert[var1];
                        arrItemConvert[var1] = null;
                    }
                }
            }

            if (isPaintSplit || isPaintDichChuyen || isPaintTinhluyen || isPaintLuyenNgoc || isPaintCheDo) {
                if (itemSplit != null) {
                    Char.getMyChar().arrItemBag[itemSplit.indexUI] = itemSplit;
                    itemSplit = null;
                }

                if (arrItemSplit != null) {
                    for (var1 = 0; var1 < arrItemSplit.length; ++var1) {
                        if (arrItemSplit[var1] != null) {
                            if (isPaintTinhluyen || isPaintDichChuyen || isPaintLuyenNgoc || isPaintCheDo) {
                                var10001 = arrItemSplit[var1].indexUI;
                                Char.getMyChar().arrItemBag[var10001] = arrItemSplit[var1];
                            }

                            arrItemSplit[var1] = null;
                        }
                    }
                }
            }

            if (isPaintGiaoDo && arrItemSplit != null) {
                for (var1 = 0; var1 < arrItemSplit.length; ++var1) {
                    if (arrItemSplit[var1] != null) {
                        var10001 = arrItemSplit[var1].indexUI;
                        Char.getMyChar().arrItemBag[var10001] = arrItemSplit[var1];
                        arrItemSplit[var1] = null;
                    }
                }
            }

            if (isPaintTrade) {
                InfoDlg.hide();
                if (this.coinTrade > 0) {
                    Char var10000 = Char.getMyChar();
                    var10000.xu += this.coinTrade;
                }

                if (arrItemTradeMe != null) {
                    for (var1 = 0; var1 < arrItemTradeMe.length; ++var1) {
                        if (arrItemTradeMe[var1] != null) {
                            var10001 = arrItemTradeMe[var1].indexUI;
                            Char.getMyChar().arrItemBag[var10001] = arrItemTradeMe[var1];
                            arrItemTradeMe[var1] = null;
                        }
                    }
                }

                if (arrItemTradeOrder != null) {
                    for (var1 = 0; var1 < arrItemTradeOrder.length; ++var1) {
                        arrItemTradeOrder[var1] = null;
                    }
                }
            }

            if ((isPaintGotNgoc || isPaintThaoNgoc) && itemSplit != null) {
                Char.getMyChar().arrItemBag[itemSplit.indexUI] = itemSplit;
                itemSplit = null;
            }
        }
        if (isPaintAuto || isPaintPickItem || isPaintDelItem) {
            Char.SaveAuto();
        }
        if (isPaintTrade) {
            Service.gI().cancelTrade();
        }

        GameCanvas.menu.showMenu = false;
        ChatTextField var2;
        (var2 = ChatTextField.gI()).tfChat.setText("");
        var2.isShow = false;
        ChatTextField.gI().center = null;
        if (!GameCanvas.isTouch) {
            isPaintSelectSkill = false;
        }

        isMessageMenu = false;
        isPaintUpGradeGold = false;
        this.isLockKey = false;
        isPaintZone = false;
        isPaintAuto = false;
        isPaintInfoMe = false;
        isPaintItemInfo = false;
        isPaintTask = false;
        isPaintTeam = false;
        isPaintMessage = false;
        isPaintClan = false;
        isPaintLuckySpin = false;
        isRequestMember = false;
        isPaintCharInMap = false;
        isPaintFindTeam = false;
        isPaintFriend = false;
        isPaintAuctionBuy = false;
        isPaintList = false;
        isPaintRankedList = false;
        isPaintEnemies = false;
        isPaintAlert = false;
        isPaintLucky_Draw = false;
        this.typeTrade = 0;
        isPaintStore = false;
        isPaintEliteShop = false;
        isPaintNonNam = false;
        isPaintNonNu = false;
        isPaintAoNam = false;
        isPaintAoNu = false;
        isPaintGangTayNam = false;
        isPaintGangTayNu = false;
        isPaintQuanNam = false;
        isPaintQuanNu = false;
        isPaintGiayNam = false;
        isPaintGiayNu = false;
        isPaintLien = false;
        isPaintNhan = false;
        isPaintNgocBoi = false;
        isPaintPhu = false;
        isPaintWeapon = false;
        isPaintStack = false;
        isPaintStackLock = false;
        isPaintGrocery = false;
        isPaintGroceryLock = false;
        isPaintUpGrade = false;
        isPaintAuctionSale = false;
        isPaintConvert = false;
        isPaintDichChuyen = false;
        isPaintTinhluyen = false;
        isPaintSplit = false;
        isPaintTrade = false;
        isPaintLuyenThach = false;
        isPaintUpPearl = false;
        isPaintBox = false;
        isPaintDelItem = false;
        isPaintPickItem = false;

        isPaintKhamNgoc = false;
        isPaintLuyenNgoc = false;
        isPaintCheDo = false;
        isPaintGiaoDo = false;
        isPaintGotNgoc = false;
        isPaintThaoNgoc = false;
        indexMenu = 0;
        indexSelect = 0;
        this.indexItemUse = -1;
        indexRow = -1;
        indexRowMax = 0;
        indexTitle = 0;
        this.typeTrade = this.typeTradeOrder = 0;
        super.left = this.menu;
        super.right = this.cmdFocus;
        this.xMounts = this.yMounts = null;
        super.center = null;
        if (Char.getMyChar().cHP <= 0 || Char.getMyChar().statusMe == 14 || Char.getMyChar().statusMe == 5) {
            if (GameCanvas.isTouchControlSmallScreen) {
                this.cmdDead.caption = "";
            }

            super.center = this.cmdDead;
        }

        scrMain.clear();
    }

    public final void keyPress(int var1) {
        if (this.tfText != null && this.tfText.isFocus) {
            this.tfText.keyPressed(var1);
        }

        super.keyPress(var1);
    }

    private void paintClan() {
        if (isPaintClan) {
            if (indexTitle == 0) {
                if (GameCanvas.keyPressedz[8]) {
                    if (Char.clan == null) {
                        indexTitle = 0;
                    } else {
                        indexTitle = 1;
                    }

                    indexSelect = 0;
                    indexRow = -1;
                    if (indexMenu == 0) {
                        indexSelect = Char.clan.itemLevel;
                    }

                    scrMain.clear();
                    scrInfo.clear();
                }

                if (GameCanvas.keyPressedz[4]) {
                    indexSelect = 0;
                    indexRow = -1;
                    --indexMenu;
                    scrMain.clear();
                    scrInfo.clear();
                    if (indexMenu < 0) {
                        indexMenu = mResources.CLAN.length - 1;
                    }

                    if (indexMenu >= mResources.CLAN.length) {
                        indexMenu = 0;
                    }

                    if (indexMenu == 1 && isRequestMember) {
                        Service.gI().requestClanMember();
                        isRequestMember = false;
                    } else if (indexMenu == 2) {
                        Service.gI().requestClanItem();
                    } else if (indexMenu == 3) {
                        Service.gI().requestClanLog();
                    } else if (indexMenu == 4) {
                        Service.gI().requestClanItem();
                    }

                    setPopupSize(175, 200);
                }

                if (GameCanvas.keyPressedz[6]) {
                    indexSelect = 0;
                    indexRow = -1;
                    ++indexMenu;
                    scrMain.clear();
                    scrInfo.clear();
                    if (indexMenu < 0) {
                        indexMenu = mResources.CLAN.length - 1;
                    }

                    if (indexMenu >= mResources.CLAN.length) {
                        indexMenu = 0;
                    }

                    if (indexMenu == 1 && isRequestMember) {
                        Service.gI().requestClanMember();
                        isRequestMember = false;
                    } else if (indexMenu == 2) {
                        Service.gI().requestClanItem();
                    } else if (indexMenu == 3) {
                        Service.gI().requestClanLog();
                    } else if (indexMenu == 4) {
                        Service.gI().requestClanItem();
                    }

                    setPopupSize(175, 200);
                }

                this.setClanComand();
            } else if (isPaintItemInfo) {
                if (GameCanvas.keyPressedz[2]) {
                    if (--indexRow < 0) {
                        indexRow = indexRowMax - 1;
                    }

                    scrInfo.moveTo(indexRow * scrInfo.ITEM_SIZE);
                } else if (GameCanvas.keyPressedz[8]) {
                    if (++indexRow >= indexRowMax) {
                        indexRow = 0;
                    }

                    scrInfo.moveTo(indexRow * scrInfo.ITEM_SIZE);
                }
            } else {
                if (indexRow < 0) {
                    indexRow = 0;
                }

                if (indexMenu == 2) {
                    if (Char.clan != null && Char.clan.items != null) {
                        if (GameCanvas.keyPressedz[4]) {
                            if (--indexSelect < 0) {
                                indexSelect = Char.clan.items.length - 1;
                            }
                        } else if (GameCanvas.keyPressedz[6]) {
                            if (++indexSelect >= Char.clan.items.length) {
                                indexSelect = 0;
                            }
                        } else if (GameCanvas.keyPressedz[8]) {
                            if (indexSelect + columns <= Char.clan.items.length - 1) {
                                indexSelect += columns;
                            }
                        } else if (GameCanvas.keyPressedz[2]) {
                            if (indexSelect >= 0 && indexSelect < columns) {
                                indexTitle = 0;
                                indexSelect = 0;
                            } else if (indexSelect - columns >= 0) {
                                indexSelect -= columns;
                            }
                        }

                        scrMain.moveTo(indexSelect / columns * scrMain.ITEM_SIZE);
                    }
                } else if (indexMenu == 0 && indexTitle == 1) {
                    if (GameCanvas.keyPressedz[8]) {
                        ++indexTitle;
                    } else if (GameCanvas.keyPressedz[2]) {
                        --indexTitle;
                    }
                } else if (indexMenu == 4) {
                    if (GameCanvas.keyPressedz[2]) {
                        if (indexRow == 0) {
                            --indexTitle;
                            indexRow = -1;
                        } else {
                            --indexRow;
                        }

                        scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                    } else if (GameCanvas.keyPressedz[8]) {
                        if (++indexRow >= indexRowMax) {
                            indexRow = 0;
                        }

                        scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                    } else if (GameCanvas.keyPressedz[4]) {
                        --this.indexThanThu;
                        if (this.indexThanThu < 0) {
                            this.indexThanThu = 0;
                        }
                    } else if (GameCanvas.keyPressedz[6]) {
                        ++this.indexThanThu;
                        if (this.indexThanThu > this.clan_thanthu.size() - 1) {
                            this.indexThanThu = (byte) (this.clan_thanthu.size() - 1);
                        }
                    }
                } else if (GameCanvas.keyPressedz[2]) {
                    if (indexRow == 0) {
                        --indexTitle;
                        indexRow = -1;
                    } else {
                        --indexRow;
                    }

                    scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                    if (indexMenu == 1 && isRequestMember) {
                        Service.gI().requestClanMember();
                        isRequestMember = false;
                    }
                } else if (GameCanvas.keyPressedz[8]) {
                    if (++indexRow >= indexRowMax) {
                        indexRow = 0;
                    }

                    scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                }

                this.setClanComand();
            }

            if (GameCanvas.isTouch && GameCanvas.currentDialog == null && !GameCanvas.menu.showMenu) {
                label367:
                {
                    if (GameCanvas.isPointerJustRelease) {
                        if (GameCanvas.isPointerHoldIn(popupX, popupY, popupW, this.Hitem) && (!isPaintItemInfo || GameCanvas.w >= 320) && GameCanvas.isPointerClick) {
                            if (GameCanvas.isPointerHoldIn(gW2 - 90, popupY + 5, 60, 40)) {
                                indexSelect = 0;
                                --indexMenu;
                                indexRow = 0;
                            }

                            if (GameCanvas.isPointerHoldIn(gW2 + 20, popupY + 5, 60, 40)) {
                                indexSelect = 0;
                                ++indexMenu;
                                indexRow = 0;
                            }

                            isPaintItemInfo = false;
                            scrMain.clear();
                            scrInfo.clear();
                            if (indexMenu < 0) {
                                indexMenu = mResources.CLAN.length - 1;
                            }

                            if (indexMenu > mResources.CLAN.length - 1) {
                                indexMenu = 0;
                            }

                            indexTitle = 1;
                            if (indexMenu == 1 && isRequestMember) {
                                Service.gI().requestClanMember();
                                isRequestMember = false;
                            } else if (indexMenu == 2 && Char.clan != null && Char.clan.items == null) {
                                Service.gI().requestClanItem();
                            }

                            if (indexMenu == 3) {
                                Service.gI().requestClanLog();
                            }

                            if (indexMenu == 4) {
                                Service.gI().requestClanItem();
                            }

                            setPopupSize(175, 200);
                            this.setClanComand();
                        }

                        if (indexMenu == 4) {
                            int var1 = this.xSelectThanThu - this.wSelectThanThu / 2;
                            int var2 = this.ySelectThanThu - this.wSelectThanThu / 2;
                            int var3 = (this.wSelectThanThu + 5) * this.clan_thanthu.size();
                            int var4 = this.wSelectThanThu;
                            if (GameCanvas.isPointerHoldIn(var1, var2, var3, var4) && (var1 = (GameCanvas.px - var1) / (this.wSelectThanThu + 5)) >= 0 && var1 < this.clan_thanthu.size()) {
                                this.indexThanThu = (byte) var1;
                            }
                        }
                    }

                    ScrollResult var5;
                    if (isPaintItemInfo) {
                        if ((var5 = scrInfo.updateKey()).isDowning || var5.isFinish) {
                            indexRow = var5.selected;
                            indexTitle = 1;
                        }

                        if (GameCanvas.isTouchControlSmallScreen) {
                            break label367;
                        }
                    }

                    if (indexMenu == 2) {
                        if ((var5 = scrMain.updateKey()).isDowning || var5.isFinish) {
                            indexSelect = var5.selected;
                            indexTitle = 1;
                            this.actionPerform(1509, (Object) null);
                        }
                    } else if (indexMenu == 0 && GameCanvas.isPointerHoldIn(popupX + 18, popupY + 32, 5 * indexSize, indexSize) && GameCanvas.isPointerJustRelease && GameCanvas.isPointerClick) {
                        if (Char.clan != null) {
                            indexSelect = Char.clan.itemLevel;
                            indexTitle = 1;
                        }
                    } else if (indexMenu != 0 && indexMenu != 3) {
                        if (indexMenu == 1 && vClan.size() != 0 && ((var5 = scrMain.updateKey()).isDowning || var5.isFinish)) {
                            indexRow = var5.selected;
                            this.updateCommandForUI();
                        }
                    } else if (!isPaintItemInfo && ((var5 = scrMain.updateKey()).isDowning || var5.isFinish)) {
                        indexRow = var5.selected;
                        indexTitle = indexMenu == 0 ? 2 : 1;
                        if (var5.isFinish) {
                            scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                        }
                    }
                }
            }

            GameCanvas.clearKeyHold();
            GameCanvas.clearKeyPressed();
        }

    }

    private void advCU() {
        if (!GameCanvas.menu.showMenu && GameCanvas.currentDialog == null) {
            if (GameCanvas.isPointerJustRelease && GameCanvas.isPointerHoldIn(popupX, popupY, popupW, this.Hitem) && (!isPaintItemInfo || GameCanvas.w >= 320) && GameCanvas.isPointerClick) {
                if (GameCanvas.isPointerHoldIn(gW2 - 90, popupY + 5, 60, 40)) {
                    indexSelect = 0;
                    --indexMenu;
                }

                if (GameCanvas.isPointerHoldIn(gW2 + 20, popupY + 5, 60, 40)) {
                    indexSelect = 0;
                    ++indexMenu;
                }

                isPaintItemInfo = false;
                scrMain.clear();
                scrInfo.clear();
                if (currentCharViewInfo.charID != Char.getMyChar().charID) {
                    if (indexMenu < 3) {
                        indexMenu = mResources.MENUME.length - 1;
                    }

                    if (indexMenu > mResources.MENUME.length - 1) {
                        indexMenu = 3;
                    }
                } else {
                    if (indexMenu < 0) {
                        indexMenu = mResources.MENUME.length - 1;
                    }

                    if (indexMenu > mResources.MENUME.length - 1) {
                        indexMenu = 0;
                    }
                }

                indexTitle = 1;
                indexSelect = -1;
                this.doMiniMenuInforMe();
            }

            ScrollResult var1;
            if (isPaintItemInfo) {
                if ((var1 = scrInfo.updateKey()).isDowning || var1.isFinish) {
                    indexRow = var1.selected;
                    indexTitle = 1;
                }

                if (GameCanvas.isTouchControlSmallScreen) {
                    return;
                }
            }

            if (indexMenu == 0) {
                if ((var1 = scrMain.updateKey()).isDowning || var1.isFinish) {
                    if (indexSelect != var1.selected) {
                        indexSelect = var1.selected;
                        super.left = super.center = null;
                        if (GameCanvas.isTouchControlSmallScreen) {
                            this.setLCR();
                        } else if (getItemFocus(3) != null) {
                            this.actBagViewItemInfo();
                        } else {
                            isPaintItemInfo = false;
                            super.left = this.cmdBagSortItem;
                        }
                    }

                    indexTitle = 1;
                    return;
                }
            } else if (indexMenu == 1) {
                if ((var1 = scrMain.updateKey()).isDowning || var1.isFinish) {
                    if (indexSelect != var1.selected) {
                        indexSelect = var1.selected;
                        if (var1.selected >= Char.getMyChar().nClass.skillTemplates.length) {
                            indexSelect = -1;
                        }

                        super.left = super.center = null;
                        this.setLCR();
                        scrInfo.clear();
                        indexRow = 0;
                    }

                    indexTitle = 1;
                    return;
                }

                if (((var1 = scrInfo.updateKey()).isDowning || var1.isFinish) && indexRow != var1.selected) {
                    indexRow = var1.selected;
                    return;
                }
            } else {
                int var3;
                if (indexMenu == 2) {
                    if (GameCanvas.isPointerJustRelease && GameCanvas.isPointerHoldIn(popupX + 5, popupY + 52, popupW - 10, 130) && GameCanvas.isPointerClick) {
                        var3 = (GameCanvas.py - (popupY + 52)) / 32;
                        ++var3;
                        if (var3 == this.indexTiemNang) {
                            MyVector var2;
                            (var2 = new MyVector()).addElement(new Command(mResources.UPPOINT, 11064));
                            var2.addElement(new Command(mResources.UPPOINTS, 11065));
                            GameCanvas.menu.startAt(var2);
                        }

                        indexTitle = var3;
                        this.indexTiemNang = var3;
                        this.setLCR();
                        return;
                    }
                } else if (indexMenu == 3) {
                    if ((var1 = scrMain.updateKey()).isDowning || var1.isFinish) {
                        indexRow = var1.selected;
                        indexTitle = 1;
                        return;
                    }
                } else if (indexMenu == 4) {
                    if (GameCanvas.isPointerJustRelease) {
                        indexTitle = 1;
                        if (GameCanvas.isPointerHoldIn(popupX + 4, popupY + 35, indexSize, 130)) {
                            indexSelect = (GameCanvas.py - (popupY + 35)) / indexSize << 1;
                            super.left = super.center = null;
                            this.setLCR();
                        }

                        if (GameCanvas.isPointerHoldIn(popupX + popupW - 30, popupY + 35, indexSize, 130)) {
                            indexSelect = ((GameCanvas.pyLast - (popupY + 35)) / indexSize << 1) + 1;
                            super.left = super.center = null;
                            this.setLCR();
                        }

                        if (GameCanvas.isPointerHoldIn(popupX + 4, popupY + 165, popupW - 8, indexSize)) {
                            var3 = (GameCanvas.pxLast - (popupX + 4)) / indexSize;
                            var3 += 10;
                            indexSelect = var3;
                            super.left = super.center = null;
                            this.setLCR();
                            return;
                        }
                    }
                } else if (indexMenu == 5 && GameCanvas.isPointerJustRelease) {
                    for (var3 = 0; var3 < this.xMounts.length; ++var3) {
                        if (var3 == 4) {
                            if (GameCanvas.isPointerHoldIn(this.xMounts[var3], this.yMounts[var3], 84, 75) && GameCanvas.isPointerClick) {
                                indexTitle = 1;
                                indexSelect = 4;
                                this.setLCR();
                                if (!GameCanvas.isTouchControlSmallScreen && super.center != null) {
                                    this.actionPerform(super.center.idAction, super.center.p);
                                }
                            }
                        } else if (GameCanvas.isPointerHoldIn(this.xMounts[var3], this.yMounts[var3], indexSize, indexSize) && GameCanvas.isPointerClick) {
                            indexTitle = 1;
                            indexSelect = var3;
                            this.setLCR();
                            if (!GameCanvas.isTouchControlSmallScreen) {
                                if (currentCharViewInfo.arrItemMounts[indexSelect] != null) {
                                    this.actionPerform(super.center.idAction, super.center.p);
                                } else {
                                    isPaintItemInfo = false;
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    public final void updateKey() {
        if (!GameCanvas.menu.showMenu && !InfoDlg.isLock) {
            int var1;
            boolean var5;
            if (GameCanvas.isTouch && !ChatTextField.gI().isShow && !GameCanvas.menu.showMenu) {
                GameScr var3 = this;
                int var4 = -1;
                if (GameCanvas.isPointerClick) {
                    for (var1 = 0; var1 < var3.xM.length; ++var1) {
                        if (GameCanvas.isPointerHoldIn(var3.xM[var1], var3.yM[var1], 100, 12) && GameCanvas.isPointerJustRelease) {
                            var4 = var1;
                            break;
                        }
                    }
                }

                if (var4 != -1 && !isPaintPopup() && !isPaintUI() && !isOpenUI()) {
                    if (var4 != 0) {
                        if (ChatManager.isMessagePt) {
                            ChatManager.gI().switchToTab(1);
                        } else if (ChatManager.isMessageClan) {
                            ChatManager.gI().switchToTab(3);
                        }

                        this.openUIChatTab();
                        this.xM[1] = this.yM[1] = -1;
                    } else if (ChatManager.gI().waitList.size() > 0) {
                        ChatManager var2 = ChatManager.gI();
                        var1 = 3;

                        int var11;
                        label1495:
                        while (true) {
                            if (var1 >= var2.chatTabs.size()) {
                                var11 = -1;
                                break;
                            }

                            ChatTab var9 = (ChatTab) var2.chatTabs.elementAt(var1);

                            for (var4 = 0; var4 < var2.waitList.size(); ++var4) {
                                if (var9.ownerName.equals(var2.waitList.elementAt(var4).toString())) {
                                    var11 = var1;
                                    break label1495;
                                }
                            }

                            ++var1;
                        }

                        ChatManager.gI().switchToTab(var11);
                        this.openUIChatTab();
                        this.xM[0] = this.yM[0] = -1;
                    }
                }

                var5 = false;
                mScreen.keyTouch = -1;
                if (GameCanvas.isPointerHoldIn(TileMap.posMiniMapX, TileMap.posMiniMapY, TileMap.wMiniMap, TileMap.hMiniMap) && GameCanvas.isPointerClick && GameCanvas.isPointerJustRelease) {
                    doShowMap();
                    var5 = true;
                }

                if (GameCanvas.isTouch && (!GameCanvas.menu.showMenu || !GameCanvas.isTouchControlSmallScreen) && GameCanvas.currentDialog == null && ChatPopup.currentMultilineChatPopup == null && !GameCanvas.menu.showMenu && !isPaintPopup()) {
                    if (GameCanvas.isPointerHoldIn(xC, yC, 34, 34)) {
                        mScreen.keyTouch = 15;
                        if (GameCanvas.isPointerClick && GameCanvas.isPointerJustRelease) {
                            ChatTextField.gI().startChat(mResources.PUBLICCHAT[0]);
                            var5 = true;
                            GameCanvas.isPointerJustRelease = false;
                            GameCanvas.isPointerClick = false;
                        }
                    }

                    if (!this.isNotPaintTouchControl()) {
                        if (!Char.getMyChar().isCaptcha) {
                            if (isSoftKey) {
                                if (GameCanvas.isPointerHoldIn(xU, yU, 34, 34)) {
                                    mScreen.keyTouch = 3;
                                    GameCanvas.keyHold[2] = true;
                                    this.resetAuto();
                                    var5 = true;
                                } else if (GameCanvas.isPointerDown) {
                                    GameCanvas.keyHold[2] = false;
                                }

                                if (GameCanvas.isPointerHoldIn(xU - 30, yU, 30, 34)) {
                                    GameCanvas.keyHold[1] = true;
                                    this.resetAuto();
                                    var5 = true;
                                } else if (GameCanvas.isPointerDown) {
                                    GameCanvas.keyHold[1] = false;
                                }

                                if (GameCanvas.isPointerHoldIn(xU + 34, yU, 30, 34)) {
                                    GameCanvas.keyHold[3] = true;
                                    this.resetAuto();
                                    var5 = true;
                                } else if (GameCanvas.isPointerDown) {
                                    GameCanvas.keyHold[3] = false;
                                }

                                if (GameCanvas.isPointerHoldIn(xL, yL, 34, 34)) {
                                    mScreen.keyTouch = 4;
                                    GameCanvas.keyHold[4] = true;
                                    this.resetAuto();
                                    var5 = true;
                                } else if (GameCanvas.isPointerDown) {
                                    GameCanvas.keyHold[4] = false;
                                }

                                if (GameCanvas.isPointerHoldIn(xR - 5, yR, 40, 34)) {
                                    mScreen.keyTouch = 6;
                                    GameCanvas.keyHold[6] = true;
                                    this.resetAuto();
                                    var5 = true;
                                } else if (GameCanvas.isPointerDown) {
                                    GameCanvas.keyHold[6] = false;
                                }
                            } else {
                                advTE.advAA();
                            }

                            if (GameCanvas.isPointerHoldIn(xF, yF, 54, 54)) {
                                GameCanvas.keyHold[5] = true;
                                mScreen.keyTouch = 5;
                                if (GameCanvas.isPointerJustRelease) {
                                    GameCanvas.keyPressedz[5] = true;
                                    var5 = true;
                                }
                            }
                        } else {
                            if (GameCanvas.isPointer(xL, yL, 34, 34) && GameCanvas.isPointerJustRelease) {
                                this.doClickCaptcha((byte) 0);
                                GameCanvas.clearKeyHold();
                            }

                            if (GameCanvas.isPointer(xU, yU, 34, 34) && GameCanvas.isPointerJustRelease) {
                                this.doClickCaptcha((byte) 1);
                                GameCanvas.clearKeyHold();
                            }

                            if (GameCanvas.isPointer(xR - 5, yR, 40, 34) && GameCanvas.isPointerJustRelease) {
                                this.doClickCaptcha((byte) 2);
                                GameCanvas.clearKeyHold();
                            }
                        }

                        if (Char.getMyChar().ctaskId > 1) {
                            if (GameCanvas.isPointerHoldIn(xMP, yMP, 34, 34)) {
                                mScreen.keyTouch = 11;
                                if (GameCanvas.isPointerClick && GameCanvas.isPointerJustRelease) {
                                    GameCanvas.keyPressedz[11] = true;
                                    var5 = true;
                                }
                            }

                            if (GameCanvas.isPointerHoldIn(xHP, yHP, 34, 34)) {
                                mScreen.keyTouch = 10;
                                if (GameCanvas.isPointerClick && GameCanvas.isPointerJustRelease) {
                                    GameCanvas.keyPressedz[10] = true;
                                    var5 = true;
                                }
                            }

                            if (GameCanvas.isPointerHoldIn(xTG, yTG, 34, 34)) {
                                mScreen.keyTouch = 13;
                                if (GameCanvas.isPointerClick && GameCanvas.isPointerJustRelease) {
                                    Char.getMyChar().findNextFocusByKey();
                                    var5 = true;
                                }
                            }
                        }

                        if (Char.getMyChar().vSkill.size() >= 2 && (GameCanvas.isPointerHoldIn(xSkill + xS[0], yS[0], onScreenSkill.length * 30, 30) || !GameCanvas.isTouchControl && GameCanvas.isPointerHoldIn(xSkill + xS[0], yS[0], 30, onScreenSkill.length * 25)) && GameCanvas.isPointerClick && GameCanvas.isPointerJustRelease) {
                            if (!GameCanvas.isTouchControl) {
                                var4 = (GameCanvas.pyLast - (ySkill + yS[0])) / 25;
                            } else {
                                var4 = (GameCanvas.pxLast - (xSkill + xS[0])) / 30;
                            }

                            this.selectedIndexSkill = var4;
                            if (indexSelect < 0) {
                                indexSelect = 0;
                            }

                            if (this.selectedIndexSkill > onScreenSkill.length - 1) {
                                this.selectedIndexSkill = onScreenSkill.length - 1;
                            }

                            var5 = true;
                            Skill var6 = onScreenSkill[this.selectedIndexSkill];
                            this.doUseSkill(var6, false, true);
                            this.isShortcut = true;
                        }

                        if (GameCanvas.isPointerJustRelease) {
                            GameCanvas.keyHold[1] = false;
                            GameCanvas.keyHold[2] = false;
                            GameCanvas.keyHold[3] = false;
                            GameCanvas.keyHold[4] = false;
                            GameCanvas.keyHold[6] = false;
                        }

                        if (!var5 && !isPaintPopup() && !isPaintUI() && !isOpenUI() && GameCanvas.isPointerClick) {
                            var1 = 0;

                            label1443:
                            while (true) {
                                if (var1 >= vMob.size()) {
                                    for (var1 = 0; var1 < vNpc.size(); ++var1) {
                                        Npc var8;
                                        if ((var8 = (Npc) vNpc.elementAt(var1)).isPaint() && GameCanvas.isPointerInGame(var8.cx - var8.cw / 2, var8.cy - var8.ch, var8.cw, var8.ch) && GameCanvas.isPointerJustRelease) {
                                            Char.getMyChar().mobFocus = null;
                                            Char.getMyChar().deFocusNPC();
                                            Char.getMyChar().npcFocus = var8;
                                            Char.getMyChar().charFocus = null;
                                            Char.getMyChar().itemFocus = null;
                                            Char.isManualFocus = true;
                                            break label1443;
                                        }
                                    }

                                    for (var1 = 0; var1 < vCharInMap.size(); ++var1) {
                                        Char var10;
                                        if ((var10 = (Char) vCharInMap.elementAt(var1)).isPaint() && !var10.isNhanbanz() && GameCanvas.isPointerInGame(var10.cx - var10.cw / 2, var10.cy - var10.ch, var10.cw, var10.ch) && GameCanvas.isPointerJustRelease) {
                                            Char.getMyChar().mobFocus = null;
                                            Char.getMyChar().deFocusNPC();
                                            Char.getMyChar().charFocus = var10;
                                            Char.getMyChar().itemFocus = null;
                                            Char.isManualFocus = true;
                                            break label1443;
                                        }
                                    }

                                    var1 = 0;

                                    while (true) {
                                        if (var1 >= vItemMap.size()) {
                                            break label1443;
                                        }

                                        ItemMap var12;
                                        if (GameCanvas.isPointerInGame((var12 = (ItemMap) vItemMap.elementAt(var1)).x - 12, var12.y - 24, 24, 24) && GameCanvas.isPointerJustRelease) {
                                            Char.getMyChar().mobFocus = null;
                                            Char.getMyChar().deFocusNPC();
                                            Char.getMyChar().charFocus = null;
                                            Char.getMyChar().itemFocus = var12;
                                            Char.isManualFocus = true;
                                            break label1443;
                                        }

                                        ++var1;
                                    }
                                }

                                Mob var7;
                                if ((var7 = (Mob) vMob.elementAt(var1)).isPaint() && GameCanvas.isPointerInGame(var7.x - var7.w / 2, var7.y - var7.h, var7.w, var7.h) && GameCanvas.isPointerJustRelease) {
                                    Char.getMyChar().mobFocus = var7;
                                    Char.getMyChar().deFocusNPC();
                                    Char.getMyChar().charFocus = null;
                                    Char.getMyChar().itemFocus = null;
                                    Char.isManualFocus = true;
                                    break;
                                }

                                ++var1;
                            }
                        }
                    }
                }
            }

            if (TileMap.mapID != 130 && !isMobSameParty()) {
                label1615:
                {
                    long var14 = System.currentTimeMillis();
                    if (GameCanvas.keyPressedz[2] || GameCanvas.keyPressedz[4] || GameCanvas.keyPressedz[6] || GameCanvas.keyPressedz[1] || GameCanvas.keyPressedz[3]) {
                        auto = 0;
                        if (this.lockAutoMove) {
                            Char.getMyChar().isLockMove = false;
                            this.lockAutoMove = false;
                        }
                    }

                    if (GameCanvas.keyPressedz[5] && !isPaintPopup()) {
                        if (auto == 0) {
                            if (var14 - this.lastFire < 800L && (Char.getMyChar().myskill == null || Char.getMyChar().cMP >= Char.getMyChar().myskill.manaUse) && Char.getMyChar().myskill != null && (Char.getMyChar().myskill.template.maxPoint <= 0 || Char.getMyChar().myskill.point != 0) && Char.getMyChar().arrItemBody[1] != null && Char.getMyChar().mobFocus != null) {
                                auto = 10;
                                GameCanvas.keyPressedz[5] = false;
                            }
                        } else {
                            if (!this.lockAutoMove && Char.getMyChar().statusMe != 14) {
                                this.lockAutoMove = !this.lockAutoMove;
                                Char.getMyChar().isLockMove = !Char.getMyChar().isLockMove;
                                this.lastFire = var14;
                                break label1615;
                            }

                            auto = 0;
                            if (this.lockAutoMove) {
                                Char.getMyChar().isLockMove = false;
                                this.lockAutoMove = false;
                            }

                            GameCanvas.keyPressedz[4] = GameCanvas.keyPressedz[6] = false;
                        }

                        this.lastFire = var14;
                    }

                    if (GameCanvas.gameTick % 10 == 0 && auto > 0 && (Char.getMyChar().mobFocus != null || Char.getMyChar().itemFocus != null)) {
                        this.doFire(true);
                    }

                    if (auto > 1) {
                        --auto;
                    }
                }
            }

            if (GameCanvas.isTouch) {
                if (GameCanvas.isPointerDown && !GameCanvas.isPointerJustRelease && GameCanvas.isPointerHoldIn(xTG, yTG, 34, 34) && !isPaintCharInMap && GameCanvas.isPointerClick && GameCanvas.isPressCooldownOver()) {
                    this.doShowCharInMap();
                }
            } else if (GameCanvas.keyHold[13] && !isPaintCharInMap && GameCanvas.isPressCooldownOver()) {
                this.doShowCharInMap();
            }

            if (ChatPopup.currentMultilineChatPopup != null) {
                Command var15;
                if ((var15 = ChatPopup.currentMultilineChatPopup.cmdNextLine) != null && (GameCanvas.keyPressedz[5] || mScreen.getCmdPointerLast(var15))) {
                    GameCanvas.isPointerJustRelease = false;
                    GameCanvas.keyPressedz[5] = false;
                    mScreen.keyTouch = -1;
                    var15.performAction();
                }
            } else if (!ChatTextField.gI().isShow) {
                if ((GameCanvas.keyPressedz[12] || mScreen.getCmdPointerLast(GameCanvas.currentScreen.left)) && super.left != null) {
                    GameCanvas.isPointerJustRelease = false;
                    GameCanvas.isPointerClick = false;
                    GameCanvas.keyPressedz[12] = false;
                    mScreen.keyTouch = -1;
                    if (super.left != null) {
                        super.left.performAction();
                    }
                }

                if ((GameCanvas.keyPressedz[13] || mScreen.getCmdPointerLast(GameCanvas.currentScreen.right)) && super.right != null) {
                    GameCanvas.isPointerJustRelease = false;
                    GameCanvas.isPointerClick = false;
                    GameCanvas.keyPressedz[13] = false;
                    mScreen.keyTouch = -1;
                    if (super.right != null) {
                        super.right.performAction();
                    }
                }

                if ((GameCanvas.keyPressedz[5] || mScreen.getCmdPointerLast(GameCanvas.currentScreen.center)) && super.center != null) {
                    GameCanvas.isPointerJustRelease = false;
                    GameCanvas.keyPressedz[5] = false;
                    mScreen.keyTouch = -1;
                    if (super.center != null) {
                        super.center.performAction();
                    }
                }
            } else {
                if (ChatTextField.gI().left != null && (GameCanvas.keyPressedz[12] || mScreen.getCmdPointerLast(ChatTextField.gI().left)) && ChatTextField.gI().left != null) {
                    ChatTextField.gI().left.performAction();
                }

                if (ChatTextField.gI().right != null && (GameCanvas.keyPressedz[13] || mScreen.getCmdPointerLast(ChatTextField.gI().right)) && ChatTextField.gI().right != null) {
                    ChatTextField.gI().right.performAction();
                }

                if (ChatTextField.gI().center != null && (GameCanvas.keyPressedz[5] || mScreen.getCmdPointerLast(ChatTextField.gI().center)) && ChatTextField.gI().center != null) {
                    ChatTextField.gI().center.performAction();
                }
            }

            ScrollResult var16;
            if (isPaintZone && GameCanvas.currentDialog == null) {
                var5 = false;
                if (GameCanvas.keyPressedz[4]) {
                    if (--indexSelect < 0) {
                        indexSelect = this.zones.length - 1;
                    }

                    var5 = true;
                } else if (GameCanvas.keyPressedz[6]) {
                    if (++indexSelect >= this.zones.length) {
                        indexSelect = 0;
                    }

                    var5 = true;
                } else if (GameCanvas.keyPressedz[8]) {
                    if (indexSelect + this.zoneCol <= this.zones.length - 1) {
                        indexSelect += this.zoneCol;
                    }

                    var5 = true;
                } else if (GameCanvas.keyPressedz[2]) {
                    if (indexSelect - this.zoneCol >= 0) {
                        indexSelect -= this.zoneCol;
                    }

                    var5 = true;
                }

                if (var5) {
                    scrMain.moveTo(indexSelect / columns * scrMain.ITEM_SIZE);
                    GameCanvas.clearKeyHold();
                    GameCanvas.clearKeyPressed();
                }

                if (GameCanvas.isTouch && ((var16 = scrMain.updateKey()).isDowning || var16.isFinish)) {
                    indexSelect = var16.selected;
                }
            }

            ScrollResult var19;
            if (isPaintRankedList || isPaintTeam || isPaintFindTeam || isPaintFriend || isPaintEnemies || isPaintCharInMap || isPaintList || isPaintAuctionBuy) {
                if (isPaintAuctionBuy) {
                    if (isPaintAuctionBuy && ((var19 = scrMain.updateKey()).isDowning || var19.isFinish)) {
                        indexSelect = var19.selected;
                        if (var19.selected >= arrItemStands.length) {
                            indexSelect = -1;
                        }

                        if (indexSelect >= 0) {
                            indexTitle = 1;
                        }

                        this.updateCommandForUI();
                    }
                } else {
                    label1609:
                    {
                        if (isPaintTeam) {
                            if (vParty.size() == 0) {
                                break label1609;
                            }

                            if (GameCanvas.keyPressedz[8]) {
                                if (++indexRow >= vParty.size()) {
                                    indexRow = vParty.size() - 1;
                                }

                                scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                            } else if (GameCanvas.keyPressedz[2]) {
                                if (--indexRow < 0) {
                                    indexRow = 0;
                                }

                                scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                            }

                            this.setPartyCommand();
                        } else if (isPaintFindTeam) {
                            if (GameCanvas.keyPressedz[8]) {
                                if (++indexRow >= vPtMap.size()) {
                                    indexRow = vPtMap.size() - 1;
                                }

                                scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                            } else if (GameCanvas.keyPressedz[2]) {
                                if (--indexRow < 0) {
                                    indexRow = 0;
                                }

                                scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                            }

                            this.refreshFindTeam();
                        } else if (isPaintFriend) {
                            if (GameCanvas.keyPressedz[8]) {
                                if (++indexRow >= indexRowMax) {
                                    indexRow = 0;
                                }

                                scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                            } else if (GameCanvas.keyPressedz[2]) {
                                if (--indexRow < 0) {
                                    indexRow = indexRowMax - 1;
                                }

                                scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                            }

                            this.setFriendCommand();
                        } else if (isPaintEnemies) {
                            if (GameCanvas.keyPressedz[8]) {
                                if (++indexRow >= indexRowMax) {
                                    indexRow = 0;
                                }

                                scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                            } else if (GameCanvas.keyPressedz[2]) {
                                if (--indexRow < 0) {
                                    indexRow = indexRowMax - 1;
                                }

                                scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                            }

                            this.setEnemiesCommand();
                        } else if (isPaintCharInMap) {
                            if (GameCanvas.keyPressedz[8]) {
                                if (++indexRow >= vCharInMap.size()) {
                                    indexRow = vCharInMap.size() - 1;
                                }

                                scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                            } else if (GameCanvas.keyPressedz[2]) {
                                if (--indexRow < 0) {
                                    indexRow = 0;
                                }

                                scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                            }

                            if (this.cLastFocusID > 0 && !GameCanvas.isTouch) {
                                scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                            }

                            this.setCharFocusCommand();
                        } else if (isPaintList) {
                            if (GameCanvas.keyPressedz[8]) {
                                if (++indexRow >= vList.size()) {
                                    indexRow = vList.size() - 1;
                                }

                                scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                            } else if (GameCanvas.keyPressedz[2]) {
                                if (--indexRow < 0) {
                                    indexRow = 0;
                                }

                                scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                            }

                            this.setDunListCommand();
                        } else if (isPaintRankedList) {
                            if (GameCanvas.keyPressedz[8]) {
                                if (++indexRow >= vList.size()) {
                                    indexRow = vList.size() - 1;
                                }

                                scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                            } else if (GameCanvas.keyPressedz[2]) {
                                if (--indexRow < 0) {
                                    indexRow = 0;
                                }

                                scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                            }

                            this.setRankedListCommand();
                        }

                        if (GameCanvas.isTouch && GameCanvas.currentDialog == null && !GameCanvas.menu.showMenu) {
                            MyVector var13 = null;
                            if (isPaintTeam) {
                                var13 = vParty;
                            } else if (isPaintFriend) {
                                var13 = vFriend;
                            } else if (isPaintEnemies) {
                                var13 = vEnemies;
                            } else if (isPaintFindTeam) {
                                var13 = vPtMap;
                            } else if (isPaintCharInMap) {
                                var13 = vCharInMap;
                            } else if (isPaintList) {
                                var13 = vList;
                            } else if (isPaintRankedList) {
                                var13 = vList;
                            }

                            if ((var16 = scrMain.updateKey()).isDowning || var16.isFinish) {
                                indexRow = var16.selected;
                                if (var13 == null || var16.selected >= var13.size()) {
                                    indexRow = -1;
                                }

                                if (isPaintTeam) {
                                    this.setPartyCommand();
                                } else if (isPaintFriend) {
                                    this.setFriendCommand();
                                } else if (isPaintEnemies) {
                                    this.setEnemiesCommand();
                                } else if (isPaintCharInMap) {
                                    this.setCharFocusCommand();
                                } else if (isPaintList) {
                                    this.setDunListCommand();
                                } else if (isPaintRankedList) {
                                    this.setRankedListCommand();
                                }
                            }
                        }

                        GameCanvas.clearKeyHold();
                        GameCanvas.clearKeyPressed();
                    }
                }
            }

            this.updateKeyBuyItemUI();
            if (isPaintInfoMe && indexMenu != -1 && GameCanvas.currentDialog == null) {
                if (indexTitle == 0) {
                    super.left = super.center = null;
                    if (indexMenu == 0) {
                        super.left = new Command(mResources.SORT, 110221);
                    }

                    if (GameCanvas.keyPressedz[8]) {
                        indexTitle = 1;
                        indexSelect = 0;
                        indexRow = 0;
                        scrMain.clear();
                        scrInfo.clear();
                    }

                    if (GameCanvas.keyPressedz[4]) {
                        indexSelect = 0;
                        indexRow = -1;
                        --indexMenu;
                        scrMain.clear();
                        scrInfo.clear();
                        if (currentCharViewInfo.charID != Char.getMyChar().charID) {
                            if (indexMenu < 3) {
                                indexMenu = 5;
                            }
                        } else if (indexMenu < 0) {
                            indexMenu = mResources.MENUME.length - 1;
                        }

                        this.doMiniMenuInforMe();
                    }

                    if (GameCanvas.keyPressedz[6]) {
                        indexSelect = 0;
                        indexRow = -1;
                        ++indexMenu;
                        scrMain.clear();
                        scrInfo.clear();
                        if (currentCharViewInfo.charID != Char.getMyChar().charID) {
                            if (indexMenu > 5) {
                                indexMenu = 3;
                            }
                        } else if (indexMenu > mResources.MENUME.length - 1) {
                            indexMenu = 0;
                        }

                        this.doMiniMenuInforMe();
                    }

                    this.setLCR();
                } else if (isPaintItemInfo) {
                    if (GameCanvas.keyPressedz[2]) {
                        if (--indexRow < 0) {
                            indexRow = indexRowMax - 1;
                        }

                        scrInfo.moveTo(indexRow * scrInfo.ITEM_SIZE);
                    } else if (GameCanvas.keyPressedz[8]) {
                        if (++indexRow >= indexRowMax) {
                            indexRow = 0;
                        }

                        scrInfo.moveTo(indexRow * scrInfo.ITEM_SIZE);
                    }
                } else if (indexMenu == 0) {
                    if (GameCanvas.keyPressedz[4]) {
                        if (--indexSelect < 0) {
                            indexSelect = Char.getMyChar().arrItemBag.length - 1;
                        }

                        super.left = super.center = null;
                        this.setLCR();
                        scrMain.moveTo(indexSelect / columns * scrMain.ITEM_SIZE);
                    } else if (GameCanvas.keyPressedz[6]) {
                        if (++indexSelect >= Char.getMyChar().arrItemBag.length) {
                            indexSelect = 0;
                        }

                        super.left = super.center = null;
                        this.setLCR();
                        scrMain.moveTo(indexSelect / columns * scrMain.ITEM_SIZE);
                    } else if (GameCanvas.keyPressedz[8]) {
                        if (indexSelect + columns <= Char.getMyChar().arrItemBag.length - 1) {
                            indexSelect += columns;
                        }

                        super.left = super.center = null;
                        this.setLCR();
                        scrMain.moveTo(indexSelect / columns * scrMain.ITEM_SIZE);
                    } else if (GameCanvas.keyPressedz[2]) {
                        if (indexSelect >= 0 && indexSelect < columns) {
                            indexTitle = 0;
                            indexSelect = 0;
                        } else if (indexSelect - columns >= 0) {
                            indexSelect -= columns;
                        }

                        super.left = super.center = null;
                        this.setLCR();
                        scrMain.moveTo(indexSelect / columns * scrMain.ITEM_SIZE);
                    }
                } else {
                    label1591:
                    {
                        if (indexMenu == 1) {
                            if (GameCanvas.keyPressedz[2]) {
                                if (indexTitle == 1 && indexRow == -1) {
                                    --indexTitle;
                                } else if (indexTitle == 1 && indexRow >= 0) {
                                    --indexRow;
                                }

                                scrInfo.moveTo(indexRow * scrInfo.ITEM_SIZE);
                                break label1591;
                            }

                            if (!GameCanvas.keyPressedz[8]) {
                                if (GameCanvas.keyPressedz[4]) {
                                    indexRow = -1;
                                    if (indexTitle == 1 && --indexSelect < 0) {
                                        indexSelect = Char.getMyChar().nClass.skillTemplates.length - 1;
                                    }

                                    super.left = super.center = null;
                                    this.setLCR();
                                    scrMain.moveTo(indexSelect * scrMain.ITEM_SIZE);
                                    scrInfo.clear();
                                    indexRow = 0;
                                } else if (GameCanvas.keyPressedz[6]) {
                                    indexRow = -1;
                                    if (indexTitle == 1 && ++indexSelect >= Char.getMyChar().nClass.skillTemplates.length) {
                                        indexSelect = 0;
                                    }

                                    super.left = super.center = null;
                                    this.setLCR();
                                    scrMain.moveTo(indexSelect * scrMain.ITEM_SIZE);
                                    scrInfo.clear();
                                    indexRow = 0;
                                }
                                break label1591;
                            }

                            if (indexTitle == 0) {
                                ++indexTitle;
                            } else if (indexTitle == 1) {
                                if (++indexRow >= indexRowMax) {
                                    indexRow = 0;
                                }

                                scrInfo.moveTo(indexRow * scrInfo.ITEM_SIZE);
                            }

                            super.left = super.center = null;
                        } else if (indexMenu == 2) {
                            if (GameCanvas.keyPressedz[2]) {
                                --indexTitle;
                                break label1591;
                            }

                            if (!GameCanvas.keyPressedz[8]) {
                                break label1591;
                            }

                            if (++indexTitle >= 5) {
                                indexTitle = 1;
                            }

                            super.left = super.center = null;
                        } else {
                            if (indexMenu == 3) {
                                if (indexRow < 0) {
                                    indexRow = 0;
                                }

                                if (GameCanvas.keyPressedz[2]) {
                                    if (indexRow == 0) {
                                        --indexTitle;
                                        indexRow = -1;
                                    } else {
                                        --indexRow;
                                    }

                                    scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                                } else if (GameCanvas.keyPressedz[8]) {
                                    if (++indexRow >= indexRowMax) {
                                        indexRow = 0;
                                    }

                                    scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                                }
                                break label1591;
                            }

                            if (indexMenu == 4) {
                                label1619:
                                {
                                    var1 = indexSelect;
                                    if (indexSelect != 11 && indexSelect != 12 && indexSelect != 13 && indexSelect != 14) {
                                        if (indexSelect == 9) {
                                            if (GameCanvas.keyPressedz[2]) {
                                                indexSelect -= 2;
                                                break label1619;
                                            }

                                            if (GameCanvas.keyPressedz[8]) {
                                                indexSelect = 15;
                                                break label1619;
                                            }

                                            if (!GameCanvas.keyPressedz[4]) {
                                                if (GameCanvas.keyPressedz[6]) {
                                                    ++indexSelect;
                                                }
                                                break label1619;
                                            }
                                        } else if (indexSelect == 10) {
                                            if (GameCanvas.keyPressedz[2]) {
                                                indexSelect -= 2;
                                                break label1619;
                                            }

                                            if (!GameCanvas.keyPressedz[4]) {
                                                if (GameCanvas.keyPressedz[6] || GameCanvas.keyPressedz[8]) {
                                                    ++indexSelect;
                                                }
                                                break label1619;
                                            }
                                        } else {
                                            if (indexSelect != 15) {
                                                if (GameCanvas.keyPressedz[2]) {
                                                    if (indexSelect <= 1) {
                                                        indexSelect = 0;
                                                        indexTitle = 0;
                                                    } else {
                                                        indexSelect -= 2;
                                                    }
                                                } else if (GameCanvas.keyPressedz[8]) {
                                                    if ((indexSelect += 2) > 15) {
                                                        indexSelect = 0;
                                                    }
                                                } else if (GameCanvas.keyPressedz[4]) {
                                                    if (--indexSelect < 0) {
                                                        indexSelect = 15;
                                                    }
                                                } else if (GameCanvas.keyPressedz[6] && ++indexSelect > 11) {
                                                    indexSelect = 0;
                                                }
                                                break label1619;
                                            }

                                            if (GameCanvas.keyPressedz[2]) {
                                                indexSelect = 9;
                                                break label1619;
                                            }

                                            if (!GameCanvas.keyPressedz[4]) {
                                                if (GameCanvas.keyPressedz[8] || GameCanvas.keyPressedz[6]) {
                                                    indexSelect = 0;
                                                }
                                                break label1619;
                                            }
                                        }
                                    } else if (!GameCanvas.keyPressedz[2] && !GameCanvas.keyPressedz[4]) {
                                        if (GameCanvas.keyPressedz[6] || GameCanvas.keyPressedz[8]) {
                                            ++indexSelect;
                                        }
                                        break label1619;
                                    }

                                    --indexSelect;
                                }

                                if (var1 == indexSelect) {
                                    break label1591;
                                }

                                super.left = super.center = null;
                            } else {
                                if (indexMenu != 5) {
                                    break label1591;
                                }

                                if (GameCanvas.keyPressedz[2]) {
                                    if (indexSelect == 4) {
                                        indexSelect = 0;
                                        --indexTitle;
                                    } else if (--indexSelect < 0) {
                                        indexSelect = 0;
                                        --indexTitle;
                                    }

                                    this.setLCR();
                                    break label1591;
                                }

                                if (GameCanvas.keyPressedz[4]) {
                                    if (indexSelect >= 2 && indexSelect != 4) {
                                        indexSelect = 4;
                                    } else {
                                        indexSelect = 0;
                                    }

                                    this.setLCR();
                                    break label1591;
                                }

                                if (GameCanvas.keyPressedz[6]) {
                                    if (indexSelect < 2) {
                                        indexSelect = 4;
                                    } else {
                                        indexSelect = 2;
                                    }

                                    this.setLCR();
                                    break label1591;
                                }

                                if (!GameCanvas.keyPressedz[8]) {
                                    break label1591;
                                }

                                if (++indexSelect >= 4) {
                                    indexSelect = 0;
                                }
                            }
                        }

                        this.setLCR();
                    }
                }

                if (GameCanvas.isTouch) {
                    this.advCU();
                }

                GameCanvas.clearKeyHold();
                GameCanvas.clearKeyPressed();
            }

            this.paintClan();
            if (isPaintTask) {
                if (indexTitle == 0) {
                    if (indexTitle == 0 && GameCanvas.keyPressedz[8]) {
                        indexTitle = 1;
                        indexRow = -1;
                        scrMain.clear();
                        scrInfo.clear();
                    }
                } else {
                    if (indexRow < 0) {
                        indexRow = 0;
                    }

                    if (GameCanvas.keyPressedz[2]) {
                        if (indexRow == 0) {
                            --indexTitle;
                            indexRow = -1;
                        } else {
                            --indexRow;
                        }

                        scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                    } else if (GameCanvas.keyPressedz[8]) {
                        if (++indexRow >= indexRowMax) {
                            indexRow = 0;
                        }

                        scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                    }
                }

                if (GameCanvas.isTouch && ((var19 = scrMain.updateKey()).isDowning || var19.isFinish)) {
                    indexRow = var19.selected;
                    indexTitle = 1;
                }
            }

            this.updateKeyAlert();
            this.updateKeyMessage();
            int var20;
            if (Char.getMyChar().currentMovePoint != null) {
                for (var20 = 0; var20 < GameCanvas.keyPressedz.length; ++var20) {
                    if (GameCanvas.keyPressedz[var20]) {
                        Char.getMyChar().currentMovePoint = null;
                        break;
                    }
                }
            }

            if (ChatTextField.gI().isShow && GameCanvas.keyAsciiPress != 0) {
                ChatTextField var17 = ChatTextField.gI();
                var1 = GameCanvas.keyAsciiPress;
                if (var17.isShow) {
                    var17.tfChat.keyPressed(var1);
                }

                if (var17.tfChat.getText().equals("")) {
                    var17.right.caption = mResources.CLOSE;
                } else {
                    var17.right.caption = mResources.DELETE;
                }

                GameCanvas.keyAsciiPress = 0;
            }

            if (this.isLockKey) {
                GameCanvas.clearKeyHold();
            } else {
                if (GameCanvas.menu.showMenu || isOpenUI() || Char.isLockKey) {
                    return;
                }

                if (GameCanvas.keyPressedz[10]) {
                    GameCanvas.keyPressedz[10] = false;
                    doUseHP();
                    GameCanvas.clearKeyPressed();
                }

                if (GameCanvas.keyPressedz[11]) {
                    GameCanvas.keyPressedz[11] = false;
                    doUseMP();
                    GameCanvas.clearKeyPressed();
                }

                if (GameCanvas.keyAsciiPress != 0 && TField.isQwerty) {
                    if (GameCanvas.keyAsciiPress == 32) {
                        doUseHP();
                        GameCanvas.keyAsciiPress = 0;
                        GameCanvas.clearKeyPressed();
                    } else if (GameCanvas.keyAsciiPress == 64) {
                        doUseMP();
                        GameCanvas.keyAsciiPress = 0;
                        GameCanvas.clearKeyPressed();
                    } else if (GameCanvas.keyAsciiPress == 48) {
                        doUseMP();
                        GameCanvas.keyAsciiPress = 0;
                        GameCanvas.clearKeyPressed();
                    } else if (GameCanvas.keyAsciiPress == 63) {
                        doUseMP();
                        GameCanvas.keyAsciiPress = 0;
                        GameCanvas.clearKeyPressed();
                    }
                }

                if (Char.getMyChar().skillPaint != null) {
                    return;
                }

                if (Char.getMyChar().isCaptcha) {
                    this.updateKeyCaptcha();
                } else {
                    if (Char.getMyChar().statusMe == 1) {
                        if (GameCanvas.keyPressedz[5]) {
                            GameCanvas.keyPressedz[5] = false;
                            this.doFire(false);
                        } else if (GameCanvas.keyHold[2]) {
                            if (!Char.getMyChar().isLockMove && !Char.getMyChar().isBlinking) {
                                setCharJump(0);
                            }
                        } else if (GameCanvas.keyHold[1]) {
                            Char.getMyChar().cdir = -1;
                            if (!Char.getMyChar().isLockMove && !Char.getMyChar().isBlinking) {
                                setCharJump(-4);
                            }
                        } else if (GameCanvas.keyHold[3]) {
                            Char.getMyChar().cdir = 1;
                            if (!Char.getMyChar().isLockMove && !Char.getMyChar().isBlinking) {
                                setCharJump(4);
                            }
                        } else if (GameCanvas.keyHold[4]) {
                            Char.getMyChar();
                            if (Char.getMyChar().cdir == 1) {
                                Char.getMyChar().cdir = -1;
                            } else if (!Char.getMyChar().isLockMove && !Char.getMyChar().isBlinking) {
                                Char.getMyChar().statusMe = 2;
                                Char.getMyChar().cvx = -Char.getMyChar().getSpeed();
                            }
                        } else if (GameCanvas.keyHold[6]) {
                            Char.getMyChar();
                            if (Char.getMyChar().cdir == -1) {
                                Char.getMyChar().cdir = 1;
                            } else if (!Char.getMyChar().isLockMove && !Char.getMyChar().isBlinking) {
                                Char.getMyChar().statusMe = 2;
                                Char.getMyChar().cvx = Char.getMyChar().getSpeed();
                            }
                        }
                    } else if (Char.getMyChar().statusMe == 2) {
                        if (GameCanvas.keyPressedz[5]) {
                            GameCanvas.keyPressedz[5] = false;
                            this.doFire(false);
                        } else if (GameCanvas.keyHold[2]) {
                            Char.getMyChar().cvy = Char.getMyChar().canJumpHigh ? -10 : -8;
                            Char.getMyChar().statusMe = 3;
                            Char.getMyChar().cp1 = 0;
                        } else if (GameCanvas.keyHold[1]) {
                            Char.getMyChar().cdir = -1;
                            Char.getMyChar().cvy = Char.getMyChar().canJumpHigh ? -10 : -8;
                            Char.getMyChar().cvx = -4;
                            Char.getMyChar().statusMe = 3;
                            Char.getMyChar().cp1 = 0;
                        } else if (GameCanvas.keyHold[3]) {
                            Char.getMyChar().cdir = 1;
                            Char.getMyChar().cvy = Char.getMyChar().canJumpHigh ? -10 : -8;
                            Char.getMyChar().cvx = 4;
                            Char.getMyChar().statusMe = 3;
                            Char.getMyChar().cp1 = 0;
                        } else {
                            Char var18;
                            if (GameCanvas.keyHold[4]) {
                                if (Char.getMyChar().cdir == 1) {
                                    Char.getMyChar().cdir = -1;
                                } else {
                                    var18 = Char.getMyChar();
                                    var20 = -Char.getMyChar().getSpeed();
                                    Char.getMyChar();
                                    var18.cvx = var20;
                                }
                            } else if (GameCanvas.keyHold[6]) {
                                if (Char.getMyChar().cdir == -1) {
                                    Char.getMyChar().cdir = 1;
                                } else {
                                    var18 = Char.getMyChar();
                                    var20 = Char.getMyChar().getSpeed();
                                    Char.getMyChar();
                                    var18.cvx = var20;
                                }
                            }
                        }
                    } else if (Char.getMyChar().statusMe == 3) {
                        if (GameCanvas.keyPressedz[5]) {
                            GameCanvas.keyPressedz[5] = false;
                            this.doFire(false);
                        }

                        if (!GameCanvas.keyHold[4] && !GameCanvas.keyHold[1]) {
                            if (GameCanvas.keyHold[6] || GameCanvas.keyHold[3]) {
                                if (Char.getMyChar().cdir == -1) {
                                    Char.getMyChar().cdir = 1;
                                } else {
                                    Char.getMyChar().cvx = Char.getMyChar().getSpeed();
                                }
                            }
                        } else if (Char.getMyChar().cdir == 1) {
                            Char.getMyChar().cdir = -1;
                        } else {
                            Char.getMyChar().cvx = -Char.getMyChar().getSpeed();
                        }

                        if ((GameCanvas.keyHold[2] || GameCanvas.keyHold[1] || GameCanvas.keyHold[3]) && Char.getMyChar().canJumpHigh && Char.getMyChar().cp1 == 0 && Char.getMyChar().cvy > -4) {
                            ++Char.getMyChar().cp1;
                            Char.getMyChar().cvy = -7;
                        }
                    } else if (Char.getMyChar().statusMe == 4) {
                        if (GameCanvas.keyPressedz[5]) {
                            GameCanvas.keyPressedz[5] = false;
                            this.doFire(false);
                        }

                        if (GameCanvas.keyPressedz[2]) {
                            GameCanvas.clearKeyPressed();
                        }

                        if (GameCanvas.keyHold[4]) {
                            if (Char.getMyChar().cdir == 1) {
                                Char.getMyChar().cdir = -1;
                            } else {
                                Char.getMyChar().cvx = -Char.getMyChar().getSpeed();
                            }
                        } else if (GameCanvas.keyHold[6]) {
                            if (Char.getMyChar().cdir == -1) {
                                Char.getMyChar().cdir = 1;
                            } else {
                                Char.getMyChar().cvx = Char.getMyChar().getSpeed();
                            }
                        }
                    } else if (Char.getMyChar().statusMe == 10) {
                        if (GameCanvas.keyPressedz[5]) {
                            GameCanvas.keyPressedz[5] = false;
                            this.doFire(false);
                        }

                        if (GameCanvas.keyHold[2]) {
                            Char.getMyChar().cvy = -10;
                            Char.getMyChar().statusMe = 3;
                            Char.getMyChar().cp1 = 0;
                        } else if (GameCanvas.keyHold[4]) {
                            if (Char.getMyChar().cdir == 1) {
                                Char.getMyChar().cdir = -1;
                            } else {
                                Char.getMyChar().cvx = -5;
                            }
                        } else if (GameCanvas.keyHold[6]) {
                            if (Char.getMyChar().cdir == -1) {
                                Char.getMyChar().cdir = 1;
                            } else {
                                Char.getMyChar().cvx = 5;
                            }
                        }
                    } else if (Char.getMyChar().statusMe == 7) {
                        if (GameCanvas.keyPressedz[5]) {
                            GameCanvas.keyPressedz[5] = false;
                        }

                        if (GameCanvas.keyHold[4]) {
                            if (Char.getMyChar().cdir == 1) {
                                Char.getMyChar().cdir = -1;
                            } else {
                                Char.getMyChar().cvx = -Char.getMyChar().getSpeed() + 2;
                            }
                        } else if (GameCanvas.keyHold[6]) {
                            if (Char.getMyChar().cdir == -1) {
                                Char.getMyChar().cdir = 1;
                            } else {
                                Char.getMyChar().cvx = Char.getMyChar().getSpeed() - 2;
                            }
                        }
                    } else if (Char.getMyChar().statusMe == 11) {
                        if (GameCanvas.keyPressedz[5]) {
                            GameCanvas.keyPressedz[5] = false;
                            this.doFire(false);
                        }

                        if (GameCanvas.keyHold[2]) {
                            Char.getMyChar().cvy = -10;
                            Char.getMyChar().statusMe = 3;
                            Char.getMyChar().cp1 = 0;
                        }
                    }

                    if (GameCanvas.keyPressedz[8] && GameCanvas.keyAsciiPress != 56) {
                        GameCanvas.keyPressedz[8] = false;
                        this.doChangeSkill();
                    }
                }

                if (GameCanvas.keyAsciiPress != 0) {
                    if (TField.isQwerty) {
                        if (GameCanvas.keyAsciiPress == 113) {
                            this.isShortcut = true;
                            if (keySkill[0] != null) {
                                this.doUseSkill(keySkill[0], false, true);
                            }
                        } else if (GameCanvas.keyAsciiPress == 119) {
                            this.isShortcut = true;
                            if (keySkill[1] != null) {
                                this.doUseSkill(keySkill[1], false, true);
                            }
                        } else if (GameCanvas.keyAsciiPress == 101) {
                            this.isShortcut = true;
                            if (keySkill[2] != null) {
                                this.doUseSkill(keySkill[2], false, true);
                            }
                        } else {
                            ChatTextField.gI().startChat(GameCanvas.keyAsciiPress, this, mResources.PUBLICCHAT[0]);
                        }
                    } else if (!GameCanvas.isMoveNumberPad) {
                        ChatTextField.gI().startChat(GameCanvas.keyAsciiPress, this, mResources.PUBLICCHAT[0]);
                    } else if (GameCanvas.keyAsciiPress == 55) {
                        this.isShortcut = true;
                        if (keySkill[0] != null) {
                            this.doUseSkill(keySkill[0], false, true);
                        }
                    } else if (GameCanvas.keyAsciiPress == 56) {
                        this.isShortcut = true;
                        if (keySkill[1] != null) {
                            this.doUseSkill(keySkill[1], false, true);
                        }
                    } else if (GameCanvas.keyAsciiPress == 57) {
                        this.isShortcut = true;
                        if (keySkill[2] != null) {
                            this.doUseSkill(keySkill[2], false, true);
                        }
                    } else if (GameCanvas.keyAsciiPress == 48) {
                        ChatTextField.gI().startChat(mResources.PUBLICCHAT[0]);
                    }

                    GameCanvas.keyAsciiPress = 0;
                }
            }

            GameCanvas.clearKeyPressed();
        }

    }

    private void resetAuto() {
        auto = 0;
        this.lockAutoMove = Char.getMyChar().isLockMove = false;
    }

    public static void doUseMP() {
        if (!Char.getMyChar().doUsePotion(17)) {
            for (int var0 = 0; var0 < Char.getMyChar().arrItemBag.length; ++var0) {
                if (Char.getMyChar().arrItemBag[var0] != null && Char.getMyChar().arrItemBag[var0].template.type == 17) {
                    InfoMe.addInfo(mResources.NOT_ENOUGH_LEVEL);
                    return;
                }
            }

            if (auto != 1) {
                InfoMe.addInfo(mResources.MP_EMPTY);
            }
        }

    }

    public static void doUseHP() {
        int var0 = (int) (System.currentTimeMillis() / 1000L);

        int var1;
        for (var1 = 0; var1 < Char.getMyChar().vEff.size(); ++var1) {
            Effect var2;
            if ((var2 = (Effect) Char.getMyChar().vEff.elementAt(var1)).template.id == 21 && var2.timeLenght - (var0 - var2.timeStart) >= 2) {
                return;
            }
        }

        if (!Char.getMyChar().doUsePotion(16)) {
            for (var1 = 0; var1 < Char.getMyChar().arrItemBag.length; ++var1) {
                if (Char.getMyChar().arrItemBag[var1] != null && Char.getMyChar().arrItemBag[var1].template.type == 16) {
                    InfoMe.addInfo(mResources.NOT_ENOUGH_LEVEL);
                    return;
                }
            }

            if (auto != 1) {
                InfoMe.addInfo(mResources.HP_EMPTY);
            }
        }

    }

    private static boolean isMobSameParty() {
        if (Char.getMyChar().mobFocus == null) {
            return false;
        } else {
            return Char.getMyChar().mobFocus.getTemplate().mobTemplateId == 142 && Char.getMyChar().cTypePk == 4 || Char.getMyChar().mobFocus.getTemplate().mobTemplateId == 143 && Char.getMyChar().cTypePk == 5 || Char.getMyChar().mobFocus.getTemplate().mobTemplateId == 143 && Char.getMyChar().cTypePk == 6;
        }
    }

    private void doFire(boolean var1) {
        if (Char.getMyChar().statusMe != 14) {
            boolean var10000;
            if (!InfoDlg.isLock && !Char.getMyChar().isLockAttack && !Char.isLockKey && !Char.getMyChar().isBlinking) {
                if (Char.getMyChar().mobFocus == null || (Char.getMyChar().mobFocus.templateId != 97 || Char.getMyChar().cTypePk != 4) && (Char.getMyChar().mobFocus.templateId != 98 || Char.getMyChar().cTypePk != 4) && (Char.getMyChar().mobFocus.templateId != 96 || Char.getMyChar().cTypePk != 5) && (Char.getMyChar().mobFocus.templateId != 99 || Char.getMyChar().cTypePk != 5) && (Char.getMyChar().mobFocus.templateId != 200 || Char.getMyChar().cTypePk != 4) && (Char.getMyChar().mobFocus.templateId != 199 || Char.getMyChar().cTypePk != 5) && (Char.getMyChar().mobFocus.templateId != 198 || Char.getMyChar().cTypePk != 6)) {
                    if (Char.getMyChar().myskill != null && Char.getMyChar().myskill.template.type == 2 && Char.getMyChar().npcFocus == null) {
                        var10000 = checkSkillValid();
                    } else if (Char.getMyChar().skillPaint == null && (Char.getMyChar().charFocus == null || !Char.getMyChar().charFocus.isNhanbanz()) && (Char.getMyChar().mobFocus != null || Char.getMyChar().npcFocus != null || Char.getMyChar().charFocus != null || Char.getMyChar().itemFocus != null)) {
                        label448:
                        {
                            int var2;
                            int var3;
                            if (Char.getMyChar().mobFocus != null) {
                                if (Char.getMyChar().myskill == null) {
                                    var10000 = false;
                                    break label448;
                                }

                                if (Char.getMyChar().arrItemBody[1] == null) {
                                    InfoMe.addInfo(mResources.WEAPON_FAIL);
                                    var10000 = false;
                                    break label448;
                                }

                                if (Char.getMyChar().mobFocus.status == 1 || Char.getMyChar().mobFocus.status == 0 || Char.getMyChar().myskill.template.type == 4) {
                                    var10000 = false;
                                    break label448;
                                }

                                if (!checkSkillValid()) {
                                    var10000 = false;
                                    break label448;
                                }

                                if (Char.getMyChar().cx < Char.getMyChar().mobFocus.x) {
                                    Char.getMyChar().cdir = 1;
                                } else {
                                    Char.getMyChar().cdir = -1;
                                }

                                var2 = Math.abs(Char.getMyChar().cx - Char.getMyChar().mobFocus.x);
                                var3 = Math.abs(Char.getMyChar().cy - Char.getMyChar().mobFocus.y);
                                Char.getMyChar().cvx = 0;
                                if (Char.getMyChar().isUseLongRangeWeapon()) {
                                    if (var2 > Char.getMyChar().myskill.advAB() || var3 > Char.getMyChar().myskill.advAC()) {
                                        Char.getMyChar().currentMovePoint = new MovePoint(Char.getMyChar().mobFocus.x, Char.getMyChar().cy);
                                        GameCanvas.clearKeyHold();
                                        GameCanvas.clearKeyPressed();
                                        var10000 = false;
                                        break label448;
                                    }

                                    GameCanvas.clearKeyHold();
                                    GameCanvas.clearKeyPressed();
                                } else if ((Char.getMyChar().myskill.template.id == 24 || Char.getMyChar().myskill.template.id == 40 || Char.getMyChar().myskill.template.id == 42) && var2 <= Char.getMyChar().myskill.advAB() && var3 <= Char.getMyChar().myskill.advAC()) {
                                    GameCanvas.clearKeyHold();
                                    GameCanvas.clearKeyPressed();
                                    Char.getMyChar().cvx = 0;
                                } else {
                                    if (var2 > Char.getMyChar().myskill.advAB() || var3 > Char.getMyChar().myskill.advAC() || Char.getMyChar().cy < Char.getMyChar().mobFocus.y - 10) {
                                        Char.getMyChar().currentMovePoint = new MovePoint(Char.getMyChar().mobFocus.x + Char.getMyChar().mobFocus.dir * 12, Char.getMyChar().cy);
                                        GameCanvas.clearKeyHold();
                                        GameCanvas.clearKeyPressed();
                                        var10000 = false;
                                        break label448;
                                    }

                                    GameCanvas.clearKeyHold();
                                    GameCanvas.clearKeyPressed();
                                    Char.getMyChar().cvx = 0;
                                }
                            } else {
                                if (Char.getMyChar().npcFocus != null) {
                                    if (Char.getMyChar().cx < Char.getMyChar().npcFocus.cx) {
                                        Char.getMyChar().cdir = 1;
                                    } else {
                                        Char.getMyChar().cdir = -1;
                                    }

                                    if (Char.getMyChar().cx < Char.getMyChar().npcFocus.cx) {
                                        Char.getMyChar().npcFocus.cdir = -1;
                                    } else {
                                        Char.getMyChar().npcFocus.cdir = 1;
                                    }

                                    var2 = Math.abs(Char.getMyChar().cx - Char.getMyChar().npcFocus.cx);
                                    var3 = Math.abs(Char.getMyChar().cy - Char.getMyChar().npcFocus.cy);
                                    if (var2 < 60 && var3 < 40) {
                                        GameCanvas.clearKeyHold();
                                        GameCanvas.clearKeyPressed();
                                        if (Char.getMyChar().npcFocus.template.npcTemplateId == 13) {
                                            InfoDlg.showWait();
                                            Service.gI().openUIZone();
                                        } else {
                                            Service.gI().openMenu(Char.getMyChar().npcFocus.template.npcTemplateId);
                                            InfoDlg.showWait();
                                        }
                                    } else {
                                        Char.getMyChar().currentMovePoint = new MovePoint(Char.getMyChar().npcFocus.cx, Char.getMyChar().cy);
                                        GameCanvas.clearKeyHold();
                                        GameCanvas.clearKeyPressed();
                                    }

                                    var10000 = false;
                                    break label448;
                                }

                                if (Char.getMyChar().charFocus != null) {
                                    if (Char.getMyChar().cx < Char.getMyChar().charFocus.cx) {
                                        Char.getMyChar().cdir = 1;
                                    } else {
                                        Char.getMyChar().cdir = -1;
                                    }

                                    var2 = Math.abs(Char.getMyChar().cx - Char.getMyChar().charFocus.cx);
                                    var3 = Math.abs(Char.getMyChar().cy - Char.getMyChar().charFocus.cy);
                                    if (!Char.getMyChar().isMeCanAttackOtherPlayer(Char.getMyChar().charFocus)) {
                                        if (var2 < 60 && var3 < 40 && Char.getMyChar().charFocus.charID >= 0) {
                                            GameCanvas.clearKeyHold();
                                            if (Char.getMyChar().charFocus.statusMe != 14 && Char.getMyChar().charFocus.statusMe != 5 && TileMap.typeMap == 1) {
                                                var10000 = false;
                                                break label448;
                                            }

                                            if (!this.isShortcut) {
                                                MyVector var5;
                                                (var5 = new MyVector()).addElement(new Command(mResources.CHAR_ORDER[6], 110397));
                                                var5.addElement(new Command(mResources.CHAR_ORDER[4], 110391));
                                                if ((Char.getMyChar().ctypeClan == 4 || Char.getMyChar().ctypeClan == 3 || Char.getMyChar().ctypeClan == 2) && Char.getMyChar().charFocus.cClanName.equals("")) {
                                                    var5.addElement(new Command(mResources.CHAR_ORDER[8], 110398));
                                                }

                                                if ((Char.getMyChar().charFocus.ctypeClan == 4 || Char.getMyChar().charFocus.ctypeClan == 3 || Char.getMyChar().charFocus.ctypeClan == 2) && Char.getMyChar().cClanName.equals("")) {
                                                    var5.addElement(new Command(mResources.CHAR_ORDER[9], 110399));
                                                }

                                                var5.addElement(new Command(mResources.CHAR_ORDER[7], 12004, Char.getMyChar().charFocus.cName));
                                                if (Char.getMyChar().nClass.classId == 6) {
                                                    var5.addElement(new Command(mResources.CHAR_ORDER[11] + ": " + (!Char.isAResuscitate ? mResources.ON : mResources.OFF), 1103991));
                                                }

                                                if (Char.getMyChar().charFocus.statusMe != 14 && Char.getMyChar().charFocus.statusMe != 5) {
                                                    var5.addElement(new Command(mResources.CHAR_ORDER[0], 110392));
                                                    var5.addElement(new Command(mResources.CHAR_ORDER[1], 110393));
                                                    var5.addElement(new Command(mResources.CHAR_ORDER[2], 110394));
                                                } else if (Char.getMyChar().myskill != null && Char.getMyChar().myskill.template != null && Char.getMyChar().myskill.template.type == 4) {
                                                    var5.addElement(new Command(mResources.CHAR_ORDER[5], 110395));
                                                }

                                                var5.addElement(new Command(mResources.CHAR_ORDER[3], 110396));
                                                GameCanvas.menu.startAt(var5);
                                                GameCanvas.menu.wait = 5;
                                            }

                                            this.isShortcut = false;
                                        } else {
                                            Char.getMyChar().currentMovePoint = new MovePoint(Char.getMyChar().charFocus.cx, Char.getMyChar().cy);
                                            GameCanvas.clearKeyHold();
                                            GameCanvas.clearKeyPressed();
                                        }

                                        var10000 = false;
                                        break label448;
                                    }

                                    if (Char.getMyChar().myskill == null) {
                                        var10000 = false;
                                        break label448;
                                    }

                                    if (Char.getMyChar().arrItemBody[1] == null) {
                                        InfoMe.addInfo(mResources.WEAPON_FAIL);
                                        var10000 = false;
                                        break label448;
                                    }

                                    if (!checkSkillValid()) {
                                        var10000 = false;
                                        break label448;
                                    }

                                    if (Char.getMyChar().cx < Char.getMyChar().charFocus.cx) {
                                        Char.getMyChar().cdir = 1;
                                    } else {
                                        Char.getMyChar().cdir = -1;
                                    }

                                    Char.getMyChar().cvx = 0;
                                    if (Char.getMyChar().isUseLongRangeWeapon()) {
                                        if (var2 > Char.getMyChar().myskill.advAB() || var3 > Char.getMyChar().myskill.advAC()) {
                                            Char.getMyChar().currentMovePoint = new MovePoint(Char.getMyChar().charFocus.cx, Char.getMyChar().cy);
                                            GameCanvas.clearKeyHold();
                                            GameCanvas.clearKeyPressed();
                                            var10000 = false;
                                            break label448;
                                        }

                                        GameCanvas.clearKeyHold();
                                        GameCanvas.clearKeyPressed();
                                    } else if ((Char.getMyChar().myskill.template.id == 24 || Char.getMyChar().myskill.template.id == 40 || Char.getMyChar().myskill.template.id == 42) && var2 <= Char.getMyChar().myskill.advAB() && var3 <= Char.getMyChar().myskill.advAC()) {
                                        GameCanvas.clearKeyHold();
                                        GameCanvas.clearKeyPressed();
                                        Char.getMyChar().cvx = 0;
                                    } else {
                                        if (var2 > Char.getMyChar().myskill.advAB() || var3 > Char.getMyChar().myskill.advAC() || Char.getMyChar().cy < Char.getMyChar().charFocus.cy) {
                                            Char.getMyChar().currentMovePoint = new MovePoint(Char.getMyChar().charFocus.cx + Char.getMyChar().charFocus.cdir * 12, Char.getMyChar().cy);
                                            GameCanvas.clearKeyHold();
                                            GameCanvas.clearKeyPressed();
                                            var10000 = false;
                                            break label448;
                                        }

                                        GameCanvas.clearKeyHold();
                                        GameCanvas.clearKeyPressed();
                                        Char.getMyChar().cvx = 0;
                                    }
                                } else if (Char.getMyChar().itemFocus != null) {
                                    if (Char.getMyChar().statusMe != 1) {
                                        var10000 = false;
                                        break label448;
                                    }

                                    if (Char.getMyChar().cx < Char.getMyChar().itemFocus.x) {
                                        Char.getMyChar().cdir = 1;
                                    } else {
                                        Char.getMyChar().cdir = -1;
                                    }

                                    var2 = Math.abs(Char.getMyChar().cx - Char.getMyChar().itemFocus.x);
                                    var3 = Math.abs(Char.getMyChar().cy - Char.getMyChar().itemFocus.y);
                                    if ((var2 > 35 || var3 >= 35) && (auto == 0 || var2 > 48 || var3 > 48)) {
                                        Char.getMyChar().currentMovePoint = new MovePoint(Char.getMyChar().itemFocus.x, Char.getMyChar().cy);
                                        GameCanvas.clearKeyHold();
                                        GameCanvas.clearKeyPressed();
                                    } else {
                                        GameCanvas.clearKeyHold();
                                        GameCanvas.clearKeyPressed();
                                        Service.gI().pickItem(Char.getMyChar().itemFocus.itemMapID);
                                    }

                                    var10000 = false;
                                    break label448;
                                }
                            }

                            var10000 = true;
                        }
                    } else {
                        var10000 = false;
                    }
                } else {
                    var10000 = false;
                }
            } else {
                var10000 = false;
            }

            if (var10000) {
                MyVector var4;
                if (isMobSameParty()) {
                    (var4 = new MyVector()).addElement(new Command(mResources.CAT_KEO, 151301));
                    GameCanvas.menu.startAt(var4);
                    return;
                }

                if (Char.getMyChar().mobFocus != null && Char.getMyChar().mobFocus.getTemplate().mobTemplateId == 144 && TileMap.mapID == 130) {
                    (var4 = new MyVector()).addElement(new Command(mResources.CHO_KEO, 151301));
                    GameCanvas.menu.startAt(var4);
                    return;
                }

                Char.getMyChar().setSkillPaint((SkillPaint) sks[Char.getMyChar().myskill.template.id], 0);
                Char.getMyChar().currentFireByShortcut = var1;
                if (Char.getMyChar().isWolf) {
                    Char.getMyChar().isWolf = false;
                    Char.getMyChar().timeSummon = System.currentTimeMillis();
                    if (Char.getMyChar().vitaWolf >= 500) {
                        ServerEffect.addServerEffect(60, Char.getMyChar(), 1);
                    }
                }

                if (Char.getMyChar().isHaveMoto() && !Char.getMyChar().isMotoBehind) {
                    Char.getMyChar().isMoto = false;
                    Char.getMyChar().isMotoBehind = true;
                    ServerEffect.addServerEffect(60, Char.getMyChar(), 1);
                }

                if (Char.getMyChar().isHaveNewMount() && !Char.getMyChar().isMotoBehind) {
                    Char.getMyChar().isNewMount = false;
                    Char.getMyChar().isMotoBehind = true;
                    ServerEffect.addServerEffect(60, Char.getMyChar(), 1);
                }
            }
        }

        if (!var1) {
            Char.getMyChar().lastNormalSkill = Char.getMyChar().myskill;
        }

    }

    private void doChangeSkill() {
        this.nSkill = 0;

        int var1;
        for (var1 = 0; var1 < onScreenSkill.length; ++var1) {
            if (onScreenSkill[var1] != null) {
                ++this.nSkill;
            }
        }

        if (this.nSkill <= 1) {
            InfoMe.isEmpty();
        } else {
            if (!isPaintSelectSkill || this.selectedIndexSkill == -1) {
                isPaintSelectSkill = true;

                for (var1 = 0; var1 < onScreenSkill.length; ++var1) {
                    if (onScreenSkill[var1] == Char.getMyChar().myskill) {
                        this.selectedIndexSkill = var1;
                        break;
                    }
                }
            }

            ++this.selectedIndexSkill;
            if (this.selectedIndexSkill >= onScreenSkill.length) {
                this.selectedIndexSkill = 0;
            }

            if (onScreenSkill[this.selectedIndexSkill] == null) {
                this.selectedIndexSkill = 0;
            }

            super.center = new Command("", 11059);
        }
    }

    public final void doUseSkill(Skill var1, boolean var2, boolean var3) {
        this.selectedIndexSkill = -1;

        if (var1 == null) {
            return;

        }

        if (var1.template.type == 4 && Char.getMyChar().charFocus != null) {
            if (Char.getMyChar().charFocus.isNhanbanz()) {
                return;
            }

            if (Char.getMyChar().charFocus.statusMe == 14 || Char.getMyChar().charFocus.statusMe == 5) {
                Service.gI().buffLive(Char.getMyChar().charFocus.charID);
                if ((TileMap.tileTypeAtPixel(Char.getMyChar().cx, Char.getMyChar().cy) & 2) == 2) {
                    Char.getMyChar().setSkillPaint((SkillPaint) sks[49], 0);
                } else {
                    Char.getMyChar().setSkillPaint((SkillPaint) sks[49], 1);
                }
            }
        }

        if (var3) {
            Service.gI().selectSkill(var1.template.id);
        }

        if (var1.template.type != 2) {
            this.resetButton();
        }

        Char.getMyChar().myskill = var1;

        if (var1.template.type == 1 && Code.auto != null) {
            Auto.advAO = var1;
        }

        if (Char.getMyChar().npcFocus == null && var1.template.type != 4) {
            this.doFire(var2);
        }
    }

    public static void sortList(int var0) {
        MyVector var6 = var0 == 0 ? vFriend : vEnemies;

        for (int var1 = 0; var1 < var6.size() - 1; ++var1) {
            Friend var2 = (Friend) var6.elementAt(var1);

            for (int var3 = var1 + 1; var3 < var6.size(); ++var3) {
                Friend var4;
                Friend var5;
                if ((var4 = (Friend) var6.elementAt(var3)).type > var2.type) {
                    var5 = var4;
                    var4 = var2;
                    var2 = var5;
                    var6.setElementAt(var5, var1);
                    var6.setElementAt(var4, var3);
                } else if (var4.type == var2.type && var2.friendName.compareTo(var4.friendName) > 0) {
                    var5 = var4;
                    var4 = var2;
                    var2 = var5;
                    var6.setElementAt(var5, var1);
                    var6.setElementAt(var4, var3);
                }
            }
        }

    }

    public static void sortClan() {
        for (int var0 = 0; var0 < vClan.size() - 1; ++var0) {
            Member var1 = (Member) vClan.elementAt(var0);

            for (int var2 = var0 + 1; var2 < vClan.size(); ++var2) {
                Member var3 = (Member) vClan.elementAt(var2);
                Member var4;
                if (isViewClanMemOnline && !isSortClanByPointWeek) {
                    if (var3.isOnline && !var1.isOnline) {
                        var4 = var3;
                        var3 = var1;
                        var1 = var4;
                        vClan.setElementAt(var4, var0);
                        vClan.setElementAt(var3, var2);
                    } else if (var3.isOnline && var1.isOnline) {
                        if (var3.type > var1.type) {
                            var4 = var3;
                            var3 = var1;
                            var1 = var4;
                            vClan.setElementAt(var4, var0);
                            vClan.setElementAt(var3, var2);
                        } else if (var3.type == var1.type) {
                            if (var3.pointClan > var1.pointClan) {
                                var4 = var3;
                                var3 = var1;
                                var1 = var4;
                                vClan.setElementAt(var4, var0);
                                vClan.setElementAt(var3, var2);
                            } else if (var1.pointClan == var3.pointClan) {
                                if (var3.pointClanWeek > var1.pointClanWeek) {
                                    var4 = var3;
                                    var3 = var1;
                                    var1 = var4;
                                    vClan.setElementAt(var4, var0);
                                    vClan.setElementAt(var3, var2);
                                } else if (var1.pointClanWeek == var3.pointClanWeek) {
                                    if (var3.level > var1.level) {
                                        var4 = var3;
                                        var3 = var1;
                                        var1 = var4;
                                        vClan.setElementAt(var4, var0);
                                        vClan.setElementAt(var3, var2);
                                    } else if (var1.level == var3.level && var1.name.compareTo(var3.name) > 0) {
                                        var4 = var3;
                                        var3 = var1;
                                        var1 = var4;
                                        vClan.setElementAt(var4, var0);
                                        vClan.setElementAt(var3, var2);
                                    }
                                }
                            }
                        }
                    }
                } else if (isSortClanByPointWeek) {
                    if (isViewClanMemOnline) {
                        if (var3.isOnline && !var1.isOnline) {
                            var4 = var3;
                            var3 = var1;
                            var1 = var4;
                            vClan.setElementAt(var4, var0);
                            vClan.setElementAt(var3, var2);
                        } else if (var3.isOnline && var1.isOnline) {
                            if (var3.pointClanWeek > var1.pointClanWeek) {
                                var4 = var3;
                                var3 = var1;
                                var1 = var4;
                                vClan.setElementAt(var4, var0);
                                vClan.setElementAt(var3, var2);
                            } else if (var1.pointClanWeek == var3.pointClanWeek) {
                                if (var3.pointClan > var1.pointClan) {
                                    var4 = var3;
                                    var3 = var1;
                                    var1 = var4;
                                    vClan.setElementAt(var4, var0);
                                    vClan.setElementAt(var3, var2);
                                } else if (var1.pointClan == var3.pointClan) {
                                    if (var3.type > var1.type) {
                                        var4 = var3;
                                        var3 = var1;
                                        var1 = var4;
                                        vClan.setElementAt(var4, var0);
                                        vClan.setElementAt(var3, var2);
                                    } else if (var3.type == var1.type && var1.level == var3.level && var1.name.compareTo(var3.name) > 0) {
                                        var4 = var3;
                                        var3 = var1;
                                        var1 = var4;
                                        vClan.setElementAt(var4, var0);
                                        vClan.setElementAt(var3, var2);
                                    }
                                }
                            }
                        }
                    } else if (var3.pointClanWeek > var1.pointClanWeek) {
                        var4 = var3;
                        var3 = var1;
                        var1 = var4;
                        vClan.setElementAt(var4, var0);
                        vClan.setElementAt(var3, var2);
                    } else if (var1.pointClanWeek == var3.pointClanWeek) {
                        if (var3.pointClan > var1.pointClan) {
                            var4 = var3;
                            var3 = var1;
                            var1 = var4;
                            vClan.setElementAt(var4, var0);
                            vClan.setElementAt(var3, var2);
                        } else if (var1.pointClan == var3.pointClan) {
                            if (var3.type > var1.type) {
                                var4 = var3;
                                var3 = var1;
                                var1 = var4;
                                vClan.setElementAt(var4, var0);
                                vClan.setElementAt(var3, var2);
                            } else if (var3.type == var1.type && var1.level == var3.level && var1.name.compareTo(var3.name) > 0) {
                                var4 = var3;
                                var3 = var1;
                                var1 = var4;
                                vClan.setElementAt(var4, var0);
                                vClan.setElementAt(var3, var2);
                            }
                        }
                    }
                } else if (var3.type > var1.type) {
                    var4 = var3;
                    var3 = var1;
                    var1 = var4;
                    vClan.setElementAt(var4, var0);
                    vClan.setElementAt(var3, var2);
                } else if (var3.type == var1.type) {
                    if (var3.pointClan > var1.pointClan) {
                        var4 = var3;
                        var3 = var1;
                        var1 = var4;
                        vClan.setElementAt(var4, var0);
                        vClan.setElementAt(var3, var2);
                    } else if (var1.pointClan == var3.pointClan) {
                        if (var3.pointClanWeek > var1.pointClanWeek) {
                            var4 = var3;
                            var3 = var1;
                            var1 = var4;
                            vClan.setElementAt(var4, var0);
                            vClan.setElementAt(var3, var2);
                        } else if (var1.pointClanWeek == var3.pointClanWeek) {
                            if (var3.level > var1.level) {
                                var4 = var3;
                                var3 = var1;
                                var1 = var4;
                                vClan.setElementAt(var4, var0);
                                vClan.setElementAt(var3, var2);
                            } else if (var1.level == var3.level && var1.name.compareTo(var3.name) > 0) {
                                var4 = var3;
                                var3 = var1;
                                var1 = var4;
                                vClan.setElementAt(var4, var0);
                                vClan.setElementAt(var3, var2);
                            }
                        }
                    }
                }
            }
        }

    }

    public static void sortSkill() {
        for (int var0 = 0; var0 < Char.getMyChar().vSkillFight.size() - 1; ++var0) {
            Skill var1 = (Skill) Char.getMyChar().vSkillFight.elementAt(var0);

            for (int var2 = var0 + 1; var2 < Char.getMyChar().vSkillFight.size(); ++var2) {
                Skill var3;
                if ((var3 = (Skill) Char.getMyChar().vSkillFight.elementAt(var2)).template.id < var1.template.id) {
                    Skill var4 = var3;
                    var3 = var1;
                    var1 = var4;
                    Char.getMyChar().vSkillFight.setElementAt(var4, var0);
                    Char.getMyChar().vSkillFight.setElementAt(var3, var2);
                }
            }
        }

    }

    private static void setCharJump(int var0) {
        Char.getMyChar().cvy = Char.getMyChar().canJumpHigh ? -10 : -8;
        Char.getMyChar().cvx = var0;
        Char.getMyChar().statusMe = 3;
        Char.getMyChar().cp1 = 0;
    }

    public final void update() {
        int var3;
        for (var3 = 0; var3 < nsoAX.size(); ++var3) {
            CharCountDown var2;
            if ((var2 = (CharCountDown) nsoAX.elementAt(var3)) != null) {
                var2.nsoAA();
                if (var2.nsoAC) {
                    nsoAX.removeElement(var2);
                }
            }
        }

        if (!GameCanvas.menu.showMenu && indexMenu == 4 && GameCanvas.isTouch && mScreen.getCmdPointerLast(this.cmdTrangbi2) && this.cmdTrangbi2 != null) {
            GameCanvas.isPointerJustRelease = false;
            GameCanvas.keyPressedz[5] = false;
            mScreen.keyTouch = -1;
            this.cmdTrangbi2.performAction();
        }

        if (GameCanvas.gameTick % 200 == 0) {
            Char.SetRemove();
        }

        if (shaking != 0 && !GameCanvas.lowGraphic) {
            cmx += NinjaUtil.random(-7, 7);
            if (++count > 20) {
                shaking = 0;
                count = 0;
            }
        } else if (cmx != cmtoX || cmy != cmtoY) {
            if (Code.auto == null) {
                if (!isUseitemAuto) {
                    cmvx = cmtoX - cmx << 2;
                    cmvy = cmtoY - cmy << 2;
                } else {
                    cmvx = cmtoX - cmx << 1;
                    cmvy = cmtoY - cmy << 2;
                }

                cmdx += cmvx;
                cmx += cmdx >> 4;
                cmdx &= 15;
                cmdy += cmvy;
                cmy += cmdy >> 4;
                cmdy &= 15;
            } else {
                cmx = cmtoX;
                cmy = cmtoY;
            }
            if (cmx < 24) {
                cmx = 24;
            }

            if (cmx > cmxLim) {
                cmx = cmxLim;
            }

            if (cmy < 0) {
                cmy = 0;
            }

            if (cmy > cmyLim) {
                cmy = cmyLim;
            }
        }

        if ((gssx = cmx / TileMap.size - 1) < 0) {
            gssx = 0;
        }

        gssy = cmy / TileMap.size;
        gssxe = gssx + gssw;
        gssye = gssy + gssh;
        if (gssy < 0) {
            gssy = 0;
        }

        if (gssye > TileMap.tmh - 1) {
            gssye = TileMap.tmh - 1;
        }

        if ((TileMap.gssx = (Char.getMyChar().cx - 2 * gW) / TileMap.size) < 0) {
            TileMap.gssx = 0;
        }

        if ((TileMap.gssxe = TileMap.gssx + TileMap.countx) > TileMap.tmw) {
            TileMap.gssx = (TileMap.gssxe = TileMap.tmw) - TileMap.countx;
        }

        if ((TileMap.gssy = (Char.getMyChar().cy - 2 * gH) / TileMap.size) < 0) {
            TileMap.gssy = 0;
        }

        if ((TileMap.gssye = TileMap.gssy + TileMap.county) > TileMap.tmh) {
            TileMap.gssy = (TileMap.gssye = TileMap.tmh) - TileMap.county;
        }

        scrMain.updatecm();
        scrInfo.updatecm();
        ChatTextField var10;
        if ((var10 = ChatTextField.gI()).isShow) {
            var10.tfChat.update();
            var10.tfChat.getClass();
            if (var10.tfChat.advAI) {
                var10.tfChat.advAI = false;
                var10.parentScreen.onChatFromMe(var10.tfChat.getText(), var10.to);
                var10.tfChat.setText("");
                var10.right.caption = mResources.CLOSE;
            }
        }

        if (nsoMG >= 0) {
            --nsoMG;
        }

        TileMap.updateCmMiniMap();
        TileMap.advAE();
        GameCanvas.gI();
        GameCanvas.updateBallEffect();
        int var1;
        if (GameCanvas.isGPRS) {
            MyVector var6 = new MyVector();
            long var12 = System.currentTimeMillis();

            for (var1 = 0; var1 < vCharInMap.size(); ++var1) {
                Char var5;
                (var5 = (Char) vCharInMap.elementAt(var1)).update();
                if (var5.isPaint()) {
                    if (var5.isDirtyPostion && var12 - var5.lastUpdateTime > 10000L && var12 - this.lastSendUpdatePostion > 10000L) {
                        var5.isDirtyPostion = false;
                        var5.lastUpdateTime = var12;
                        var6.addElement(var5);
                    }
                } else {
                    var5.lastUpdateTime = var12;
                    var5.isDirtyPostion = true;
                }
            }

            if (var6.size() > 0) {
                Service.gI().requestPlayerInfo(var6);
                this.lastSendUpdatePostion = var12;
            }
        } else {
            for (var1 = 0; var1 < vCharInMap.size(); ++var1) {
                ((Char) vCharInMap.elementAt(var1)).update();
            }
        }

        Char.getMyChar().update();
        if (Char.getMyChar().cHP <= 0 && TileMap.advBE && !LockGame.advAA) {
            TileMap.advAG();
        }
        if (Char.getMyChar().statusMe == 1 && GameCanvas.gameTick % 100 == 0) {
            System.gc();
        }

        for (var1 = 0; var1 < vMob.size(); ++var1) {
            ((Mob) vMob.elementAt(var1)).update();
        }

        for (var1 = 0; var1 < vNpc.size(); ++var1) {
            ((Npc) vNpc.elementAt(var1)).update();
        }

        GameCanvas.gI().updateDust();

        int[] var10000;
        for (var3 = 0; var3 < 5; ++var3) {
            if (flyTextState[var3] != -1) {
                var10000 = flyTextState;
                var10000[var3] += Res.abs(flyTextDy[var3]);
                if (flyTextState[var3] > 30) {
                    flyTextState[var3] = -1;
                }

                var10000 = flyTextX;
                var10000[var3] += flyTextDx[var3];
                var10000 = flyTextY;
                var10000[var3] += flyTextDy[var3];
            }
        }

        for (var3 = 0; var3 < vLanterns.size(); ++var3) {
            Lanterns var7;
            Lanterns var16 = var7 = (Lanterns) vLanterns.elementAt(var3);
            var16.y -= var7.dy;
            if (var7.yStart - var7.y > 150) {
                var7.isEnd = true;
            }

            if (((Lanterns) vLanterns.elementAt(var3)).isEnd) {
                vLanterns.removeElementAt(var3);
            }
        }

        for (var3 = 0; var3 < 2; ++var3) {
            if (splashState[var3] != -1) {
                int var10002 = splashState[var3]++;
                var10000 = splashX;
                var10000[var3] += splashDir[var3] << 2;
                var10002 = splashY[var3]--;
                if (splashState[var3] >= 6) {
                    splashState[var3] = -1;
                } else {
                    splashF[var3] = (splashState[var3] >> 1) % 3;
                }
            }
        }

        if (indexMenu != -1) {
            if (cmySK != cmtoYSK) {
                cmvySK = cmtoYSK - cmySK << 2;
                cmdySK += cmvySK;
                cmySK += cmdySK >> 4;
                cmdySK &= 15;
            }

            if (Math.abs(cmtoYSK - cmySK) < 15 && cmySK < 0) {
                cmtoYSK = 0;
            }

            if (Math.abs(cmtoYSK - cmySK) < 15 && cmySK > 0) {
                cmtoYSK = 0;
            }
        }

        GameCanvas.updateBG();

        for (var1 = 0; var1 < vMobAttack.size(); ++var1) {
            ((MobAttack) vMobAttack.elementAt(var1)).update();
        }

        for (var1 = 0; var1 < vItemMap.size(); ++var1) {
            ItemMap var13;
            if ((var13 = (ItemMap) vItemMap.elementAt(var1)).status == 2 && var13.x == var13.xEnd && var13.y == var13.yEnd) {
                vItemMap.removeElement(var13);
                if (Char.getMyChar().itemFocus != null && Char.getMyChar().itemFocus.equals(var13)) {
                    Char.getMyChar().itemFocus = null;
                }
            } else if (var13.status <= 0) {
                var13.status = (byte) (var13.status - 4);
                if (var13.status < -12) {
                    var13.y -= 12;
                    var13.status = 1;
                }
            } else {
                if (var13.vx == 0) {
                    var13.x = var13.xEnd;
                }

                if (var13.vy == 0) {
                    var13.y = var13.yEnd;
                }

                if (var13.x != var13.xEnd) {
                    var13.x += var13.vx;
                    if (var13.vx > 0 && var13.x > var13.xEnd || var13.vx < 0 && var13.x < var13.xEnd) {
                        var13.x = var13.xEnd;
                    }
                }

                if (var13.y != var13.yEnd) {
                    var13.y += var13.vy;
                    if (var13.vy > 0 && var13.y > var13.yEnd || var13.vy < 0 && var13.y < var13.yEnd) {
                        var13.y = var13.yEnd;
                    }
                }
            }
            if (var13.advAK && System.currentTimeMillis() - var13.advAL >= 10000L) {
                var13.advAK = false;
            }
        }

        for (var1 = 0; var1 < vMobSoul.size(); ++var1) {
            ((MobSoul) vMobSoul.elementAt(var1)).update();
        }

        for (var1 = 0; var1 < vSet.size(); ++var1) {
            Set var14;
            ++(var14 = (Set) vSet.elementAt(var1)).time;
            if (var14.time == 5) {
                var14.time = 0;
                vSet.removeElement(var14);
            }

            Mob var8 = Mob.get_Mob(0);
            var14.xMob = var8.x;
            var14.yMob = var8.y - var8.h / 2;
            var14.xChar = ((Char) vCharInMap.elementAt(0)).cx;
            var14.yChar = ((Char) vCharInMap.elementAt(0)).cy - Char.getMyChar().chh;

            int sum = Res.random(5, 10);
            int[] x1 = new int[sum + 1];
            int[] y1 = new int[sum + 1];

            if (Res.abs(x1[0] - var14.xMob) > 5 || Res.abs(y1[0] - var14.yMob) > 5) {
                x1[0] = var14.xMob;
                y1[0] = var14.yMob;
            }

            if (Res.abs(x1[0] - var14.xChar) > 5 || Res.abs(y1[0] - var14.yChar) > 5) {
                x1[0] = var14.xChar;
                y1[0] = var14.yChar;
            }
        }

        if ((TileMap.tmw * TileMap.sizeMiniMap >= TileMap.wMiniMap || TileMap.tmh * TileMap.sizeMiniMap >= TileMap.hMiniMap) && System.currentTimeMillis() / 100L > 20L) {
            TileMap.updateMiniMap();
        }

        for (var1 = Effect2.vRemoveEffect2.size() - 1; var1 >= 0; --var1) {
            Effect2.vEffect2.removeElement(Effect2.vRemoveEffect2.elementAt(var1));
            Effect2.vRemoveEffect2.removeElementAt(var1);
        }

        for (var1 = 0; var1 < Effect2.vEffect2.size(); ++var1) {
            ((Effect2) Effect2.vEffect2.elementAt(var1)).update();
        }

        for (var1 = 0; var1 < Effect2.vEffect2Outside.size(); ++var1) {
            ((Effect2) Effect2.vEffect2Outside.elementAt(var1)).update();
        }

        for (var1 = 0; var1 < Effect2.vAnimateEffect.size(); ++var1) {
            ((Effect2) Effect2.vAnimateEffect.elementAt(var1)).update();
        }

        for (var1 = 0; var1 < Mob.vEggMonter.size(); ++var1) {
            EggMonters var9;
            if ((var9 = (EggMonters) Mob.vEggMonter.elementAt(var1)) != null) {
                if (var9.isPaint()) {
                    if (var9.status == 0) {
                        ++var9.vy;
                        var9.y += var9.vy;
                        ++var9.frame;
                        if (var9.frame > 3) {
                            var9.frame = 0;
                        }

                        if ((TileMap.tileTypeAtPixel(var9.x, var9.y) & 2) == 2) {
                            var9.status = 1;
                            var9.vy = 0;
                        }
                    } else if (var9.status == 1) {
                        ++var9.frame;
                        if (var9.frame > 6) {
                            var9.frame = 6;
                            EggMonters.ownerEgg.status = 5;
                        }
                    }
                }

                if (var9.frame == 6) {
                    if (EggMonters.ownerEgg != null) {
                        EggMonters.ownerEgg.status = 5;
                    }

                    Mob.vEggMonter.removeElementAt(var1);
                }
            }
        }

        SmallImage.checkTimeUseImg();
        if (this.cLastFocusID >= 0 && vCharInMap.size() > 0) {
            int var11;
            if ((var11 = Char.getIndexChar(this.cLastFocusID)) >= 0 && var11 < vCharInMap.size()) {
                Char var15;
                if ((var15 = (Char) vCharInMap.elementAt(var11)) != null && Char.isCharInScreen(var15) && !var15.isNhanbanz()) {
                    Char.getMyChar().mobFocus = null;
                    Char.getMyChar().deFocusNPC();
                    Char.getMyChar().itemFocus = null;
                    Char.getMyChar();
                    Char.isManualFocus = true;
                    Char.getMyChar().charFocus = var15;
                }
            } else {
                this.cLastFocusID = -1;
                Char.getMyChar().charFocus = null;
            }
        } else {
            this.cLastFocusID = -1;
        }

        Info.update();
        InfoMe.update();
        if (currentCharViewInfo != null && currentCharViewInfo.charID != Char.getMyChar().charID) {
            currentCharViewInfo.update();
        }

        ++this.runArrow;
        if (this.runArrow > 3) {
            this.runArrow = 0;
        }

        if (isPaintRankedList) {
            indexSize = 40;
        } else {
            indexSize = 28;
        }

        EffectAuto.checkTimeUseImg();
        EffectAuto.checkTimeUseData();
        if (GameCanvas.isKiemduyet_info) {
            GameCanvas.regScr.switchToMe();
        }

    }

    private static void nsoAC(mGraphics var0) {
        for (int var1 = 0; var1 < nsoAX.size(); ++var1) {
            CharCountDown var2;
            if ((var2 = (CharCountDown) nsoAX.elementAt(var1)) != null) {
                var2.nsoAA(var0, GameCanvas.w, nsoMM + var1 * 18 + 15);
            }
        }

    }

    public final void paint(mGraphics var1) {
        if (Char.ischangingMap) {
            var1.setColor(0);
            var1.fillRect(0, 0, GameCanvas.w, GameCanvas.h);
            mFont.tahoma_7b_yellow.drawString(var1, mResources.LOADING, GameCanvas.hw, GameCanvas.hh + 20, 2);
            GameCanvas.paintShukiren(GameCanvas.hw, GameCanvas.hh, var1, false);
        } else {
            GameCanvas.paintBGGameScr(var1);
            var1.translate(-cmx, -cmy);

            int var2;
            for (var2 = 0; var2 < vItemTreeBehind.size(); ++var2) {
                ((ItemTree) vItemTreeBehind.elementAt(var2)).paint(var1);
            }

            TileMap.paintTilemap(var1);

            for (var2 = 0; var2 < vItemTreeBetwen.size(); ++var2) {
                ((ItemTree) vItemTreeBetwen.elementAt(var2)).paint(var1);
            }

            for (var2 = 0; var2 < vMob.size(); ++var2) {
                ((Mob) vMob.elementAt(var2)).paint(var1);
            }

            for (var2 = 0; var2 < Mob.vEggMonter.size(); ++var2) {
                EggMonters var3;
                if ((var3 = (EggMonters) Mob.vEggMonter.elementAt(var2)).isPaint()) {
                    var1.drawRegion(imgEggMonters, 0, var3.frame << 5, 32, 32, 0, var3.x, var3.y, 33);
                }
            }

            for (var2 = 0; var2 < vBuNhin.size(); ++var2) {
                BuNhin var5;
                BuNhin var13;
                if ((var5 = var13 = (BuNhin) vBuNhin.elementAt(var2)).x < cmx ? false : (var5.x > cmx + gW ? false : (var5.y < cmy ? false : var5.y <= cmy + gH + 30))) {
                    mFont.tahoma_7_yellow.drawString(var1, var13.name, var13.x, var13.y - 32, 2, mFont.tahoma_7_grey);
                    SmallImage.drawSmallImage(var1, 1180, var13.x, var13.y, 0, 33);
                    if (var13.isInjure) {
                        SmallImage.drawSmallImage(var1, 288, var13.x, var13.y, 0, 33);
                        var13.isInjure = false;
                    }
                }
            }

            for (var2 = 0; var2 < vNpc.size(); ++var2) {
                ((Npc) vNpc.elementAt(var2)).paint(var1);
            }

            mGraphics var4 = var1;
            GameScr var14 = this;

            int var7;
            int var9;
            int var18;
            for (var9 = 0; var9 < TileMap.vGo.size(); ++var9) {
                Waypoint var10;
                if ((var10 = (Waypoint) TileMap.vGo.elementAt(var9)).minY != 0 && var10.maxY < TileMap.pxh - 24) {
                    if (var10.maxX <= TileMap.pxw / 2) {
                        if (!GameCanvas.isTouch) {
                            SmallImage.drawSmallImage(var4, 1213, var10.maxX + 12 + var14.runArrow, var10.maxY - 12, 2, StaticObj.VCENTER_HCENTER);
                        } else {
                            SmallImage.drawSmallImage(var4, 1213, var10.maxX + 12 + var14.runArrow, var10.maxY - 32, 2, StaticObj.VCENTER_HCENTER);
                        }
                    } else if (var10.minX >= TileMap.pxw / 2) {
                        if (!GameCanvas.isTouch) {
                            SmallImage.drawSmallImage(var4, 1213, var10.minX - 12 - var14.runArrow, var10.maxY - 12, 0, StaticObj.VCENTER_HCENTER);
                        } else {
                            SmallImage.drawSmallImage(var4, 1213, var10.minX - 12 - var14.runArrow, var10.maxY - 32, 0, StaticObj.VCENTER_HCENTER);
                        }
                    }
                } else if (var10.maxY <= TileMap.pxh / 2) {
                    var18 = var10.minX + (var10.maxX - var10.minX) / 2;
                    var7 = var10.minY + (var10.maxY - var10.minY) / 2 + var14.runArrow;
                    if (GameCanvas.isTouch) {
                        var7 = var10.maxY + (var10.maxY - var10.minY) + var14.runArrow + 10;
                    }

                    SmallImage.drawSmallImage(var4, 1213, var18, var7, 6, StaticObj.VCENTER_HCENTER);
                } else if (var10.minY >= TileMap.pxh / 2) {
                    SmallImage.drawSmallImage(var4, 1213, var10.minX + (var10.maxX - var10.minX) / 2, var10.minY - 12 - var14.runArrow, 4, StaticObj.VCENTER_HCENTER);
                }
            }

            var1.setClip(0, -200, GameCanvas.w - var1.getTranslateX(), 200 + GameCanvas.h - var1.getTranslateY());
            GameCanvas.gI().paintDust(var1);

            for (var2 = 0; var2 < vCharInMap.size(); ++var2) {
                Char var15 = null;

                try {
                    var15 = (Char) vCharInMap.elementAt(var2);
                } catch (Exception var11) {
                }

                if (var15 != null) {
                    if (TileMap.mapID == 111 && var2 > 19) {
                        var15.paintCharName_HP_MP_Overhead(var1);
                    } else {
                        var15.paint(var1);
                    }
                }
            }

            for (var2 = 0; var2 < vParty.size(); ++var2) {
                Party var17;
                if ((var17 = (Party) vParty.elementAt(var2)).c != null && var17.c != Char.getMyChar()) {
                    var17.c.paintNameInSameParty(var1);
                }
            }

            mGraphics var19 = var1;

            int var16;
            for (var16 = 0; var16 < 5; ++var16) {
                if (flyTextState[var16] != -1 && GameCanvas.isPaint(flyTextX[var16], flyTextY[var16])) {
                    if (flyTextColor[var16] == 0) {
                        mFont.number_red.drawString(var19, flyTextString[var16], flyTextX[var16], flyTextY[var16], 2);
                    } else if (flyTextColor[var16] == 1) {
                        mFont.number_yellow.drawString(var19, flyTextString[var16], flyTextX[var16], flyTextY[var16], 2);
                    } else if (flyTextColor[var16] == 2) {
                        mFont.number_green.drawString(var19, flyTextString[var16], flyTextX[var16], flyTextY[var16], 2);
                    } else if (flyTextColor[var16] == 3) {
                        mFont.tahoma_7b_yellow.drawString(var19, flyTextString[var16], flyTextX[var16], flyTextY[var16], 2, mFont.tahoma_7b_blue);
                    } else if (flyTextColor[var16] == 8) {
                        mFont.tahoma_7b_white.drawString(var19, flyTextString[var16], flyTextX[var16], flyTextY[var16], 2, mFont.tahoma_7b_blue);
                    } else if (flyTextColor[var16] == 4) {
                        SmallImage.drawSmallImage(var19, 1062, flyTextX[var16], flyTextY[var16], 0, 3);
                    } else if (flyTextColor[var16] == 5) {
                        mFont.number_orange.drawString(var19, flyTextString[var16], flyTextX[var16], flyTextY[var16], 2);
                    } else if (flyTextColor[var16] == 6) {
                        mFont.tahoma_7_yellow.drawString(var19, flyTextString[var16], flyTextX[var16], flyTextY[var16], 2, mFont.tahoma_7_red);
                    } else if (flyTextColor[var16] == 7) {
                        SmallImage.drawSmallImage(var19, 655, flyTextX[var16], flyTextY[var16], 0, 3);
                    }
                }
            }

            var19 = var1;

            for (var16 = 0; var16 < vLanterns.size(); ++var16) {
                Lanterns var20 = (Lanterns) vLanterns.elementAt(var16);
                if (GameCanvas.gameTick % 10 < 8) {
                    SmallImage.drawSmallImage(var19, 1292, var20.x, var20.y, 0, 3);
                } else {
                    SmallImage.drawSmallImage(var19, 1291, var20.x, var20.y, 0, 3);
                }
            }

            var19 = var1;

            for (var16 = 0; var16 < 2; ++var16) {
                if (splashState[var16] != -1) {
                    if (splashDir[var16] == 1) {
                        var19.drawImage(imgSplash[splashF[var16]], splashX[var16], splashY[var16], 3);
                    } else {
                        var19.drawRegion(imgSplash[splashF[var16]], 0, 0, mGraphics.getWidth(imgSplash[splashF[var16]]), mGraphics.getHeight(imgSplash[splashF[var16]]), 2, splashX[var16], splashY[var16], 3);
                    }
                }
            }

            Char.getMyChar().paint(var1);
            var4 = var1;
            var14 = this;
            if (Char.getMyChar().isCaptcha) {
                for (var18 = 0; var18 < var14.arrowCaptcha.length; ++var18) {
                    if (var14.arrowCaptcha[var18] != -1) {
                        byte var24 = 0;
                        if (var14.arrowCaptcha[var18] == 0) {
                            var24 = 2;
                        } else if (var14.arrowCaptcha[var18] == 1) {
                            var24 = 6;
                        } else if (var14.arrowCaptcha[var18] == 2) {
                            var24 = 0;
                        }

                        SmallImage.drawSmallImage(var4, 989, Char.getMyChar().cx + var18 * 10 - (var14.arrowCaptcha.length - 1) * 10 / 2, Char.getMyChar().cy - 40, var24, 3);
                    }
                }
            }

            for (var2 = 0; var2 < vSet.size(); ++var2) {
                Set var10000 = (Set) vSet.elementAt(var2);
            }

            byte var22;
            for (var2 = 0; var2 < vItemMap.size(); ++var2) {
                ItemMap var21;
                if ((var21 = (ItemMap) vItemMap.elementAt(var2)).imgCaptcha != null && var21.imgCaptcha.img != null) {
                    var22 = 0;
                    if (var21.status <= 0) {
                        var22 = var21.status;
                    }

                    var1.drawImage(var21.imgCaptcha.img, var21.x, var21.y + var22, 33);
                } else {
                    var22 = 0;
                    if (var21.status <= 0) {
                        var22 = var21.status;
                    }

                    SmallImage.drawSmallImage(var1, var21.template.iconID, var21.x, var21.y + var22, 0, 33);
                    if (Char.getMyChar().itemFocus != null && Char.getMyChar().itemFocus.equals(var21) && var21.status != 2) {
                        SmallImage.drawSmallImage(var1, 988, var21.x, var21.y - 20, 0, 3);
                    }
                }
            }

            for (var2 = 0; var2 < vMobSoul.size(); ++var2) {
                ((MobSoul) vMobSoul.elementAt(var2)).paint(var1);
            }

            TileMap.paintOutTilemap(var1);
            if (Code.KCTSValue > 0) {
                var1.setColor(16711680);
                var1.advAE(Code.cxValue - Code.KCTSValue, Code.cyValue - Code.KCTSValue, Code.KCTSValue << 1, Code.KCTSValue << 1);
            }

            if (Code.KCNhatValue > 0) {
                var1.setColor(65280);
                var1.advAE(Char.getMyChar().cx - Code.KCNhatValue, Char.getMyChar().cy - Code.KCNhatValue, Code.KCNhatValue << 1, Code.KCNhatValue << 1);
            }
            for (var2 = 0; var2 < Effect2.vEffect2.size(); ++var2) {
                ((Effect2) Effect2.vEffect2.elementAt(var2)).paint(var1);
            }

            for (var2 = 0; var2 < vItemTreeFront.size(); ++var2) {
                ((ItemTree) vItemTreeFront.elementAt(var2)).paint(var1);
            }

            if (!GameCanvas.lowGraphic) {
                for (var2 = 0; var2 < Effect2.vAnimateEffect.size(); ++var2) {
                    ((Effect2) Effect2.vAnimateEffect.elementAt(var2)).paint(var1);
                }
            }

            for (var2 = 0; var2 < vMobAttack.size(); ++var2) {
                vMobAttack.elementAt(var2);
            }

            var4 = var1;

            int var8;
            try {
                if ((var22 = getTaskNpcId()) != -1) {
                    Npc var25 = null;

                    for (var8 = 0; var8 < vNpc.size(); ++var8) {
                        Npc var26;
                        if ((var26 = (Npc) vNpc.elementAt(var8)).template.npcTemplateId == var22) {
                            if (var25 == null) {
                                var25 = var26;
                            } else if (Res.abs(var26.cx - Char.getMyChar().cx) < Res.abs(var25.cx - Char.getMyChar().cx)) {
                                var25 = var26;
                            }
                        }
                    }

                    if (var25 != null && var25.statusMe != 15 && (var25.cx <= cmx || var25.cx >= cmx + gW || var25.cy <= cmy || var25.cy >= cmy + gH) && GameCanvas.gameTick % 10 >= 5) {
                        var8 = var25.cx - Char.getMyChar().cx;
                        var9 = var25.cy - Char.getMyChar().cy;
                        int var27 = 0;
                        var2 = 0;
                        byte var23 = 0;
                        if (var8 > 0 && var9 >= 0) {
                            if (Res.abs(var8) >= Res.abs(var9)) {
                                var27 = gW - 10;
                                var2 = gH / 2 + 30;
                                if (GameCanvas.isTouch) {
                                    var2 = gH / 2 + 10;
                                }

                                var23 = 0;
                            } else {
                                var27 = gW / 2;
                                var2 = gH - 10;
                                var23 = 5;
                            }
                        } else if (var8 >= 0 && var9 < 0) {
                            if (Res.abs(var8) >= Res.abs(var9)) {
                                var27 = gW - 10;
                                var2 = gH / 2 + 30;
                                if (GameCanvas.isTouch) {
                                    var2 = gH / 2 + 10;
                                }

                                var23 = 0;
                            } else {
                                var27 = gW / 2;
                                var2 = 10;
                                var23 = 6;
                            }
                        }

                        if (var8 < 0 && var9 >= 0) {
                            if (Res.abs(var8) >= Res.abs(var9)) {
                                var27 = 10;
                                var2 = gH / 2 + 30;
                                if (GameCanvas.isTouch) {
                                    var2 = gH / 2 + 10;
                                }

                                var23 = 3;
                            } else {
                                var27 = gW / 2;
                                var2 = gH - 10;
                                var23 = 5;
                            }
                        } else if (var8 <= 0 && var9 < 0) {
                            if (Res.abs(var8) >= Res.abs(var9)) {
                                var27 = 10;
                                var2 = gH / 2 + 30;
                                if (GameCanvas.isTouch) {
                                    var2 = gH / 2 + 10;
                                }

                                var23 = 3;
                            } else {
                                var27 = gW / 2;
                                var2 = 10;
                                var23 = 6;
                            }
                        }

                        resetTranslate(var4);
                        SmallImage.drawSmallImage(var4, 992, var27, var2, var23, StaticObj.VCENTER_HCENTER);
                    }
                }
            } catch (Exception var12) {
            }

            var4 = var1;
            if (GameCanvas.isTouch) {
                resetTranslate(var1);
                this.loadInforBar();
                var18 = Char.getMyChar().cHP * hpBarW / Char.getMyChar().cMaxHP;
                var7 = Char.getMyChar().cMP * mpBarW / Char.getMyChar().cMaxMP;
                var8 = (int) (Char.getMyChar().cExpR * (long) expBarW / exps[Char.getMyChar().clevel]);
                if (var18 > hpBarW) {
                    var18 = 0;
                }

                var1.setColor(-10585344);
                var1.fillRect(0, hpBarY - 10, expBarW, 3);
                var1.setColor(-10427136);
                var1.fillRect(0, hpBarY - 10, var8, 3);
                var1.setColor(-9756672);
                var1.fillRect(0, hpBarY - 10, expBarW, 1);
                var1.fillRect(0, hpBarY - 7, expBarW, 1);

                for (var9 = 0; var9 < 10; ++var9) {
                    var4.fillRect(var9 * expBarW / 10 - 1, hpBarY - 10, 1, 3);
                }

                var4.setColor(-1769452);
                var4.drawImage(imgTransparent, hpBarX - 1, hpBarY, 0);
                var4.fillRect(hpBarX, hpBarY, var18, 9);
                var4.setColor(-16755227);
                var4.drawImage(imgTransparent, hpBarX - 28, hpBarY + 13, 0);
                var4.fillRect(hpBarX, hpBarY + 16, var7, 7);
                var4.drawImage(imgTopBar, 0, hpBarY - 7, 0);
                mFont.number_white.drawString(var4, "" + Char.getMyChar().cHP, hpBarX + hpBarW / 2 - 30, hpBarY + 1, 0);
                mFont.number_white.drawString(var4, "" + Char.getMyChar().cMP, hpBarX + hpBarW / 2 - 30, hpBarY + 15, 0);
                mFont.tahoma_8b.drawString(var4, "" + Char.getMyChar().clevel, hpBarX - 27, hpBarY + 1, 2);
                long var28 = 0L;
                if (Char.getMyChar().cExpDown > 0L) {
                    var28 = Char.getMyChar().cExpDown * 10000L / exps[Char.getMyChar().clevel];
                } else {
                    var28 = Char.getMyChar().cExpR * 10000L / exps[Char.getMyChar().clevel];
                }
                mFont.tahoma_7_yellow.drawString(var4, Res.advAB().get(11) + ":" + Res.advAB().get(12) + ":" + Res.advAB().get(13), hpBarX + 20, hpBarY + 27, 0, mFont.tahoma_7_red);

                var2 = (int) (var28 % 100L);
                mFont.tahoma_7_white.drawString(var4, (Char.getMyChar().cExpDown > 0L ? "-" + var28 / 100L : "" + var28 / 100L) + "." + (var2 < 10 ? "0" + var2 : "" + var2) + "%", hpBarX - 27, hpBarY + 13, 2);
            }

            if (!Char.getMyChar().isCaptcha) {
                this.paintDebugInfo(var1);
                resetTranslate(var1);
                this.paintFoodEffect(var1);
                resetTranslate(var1);
                TileMap.paintMiniMap(var1);
                var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
                if (!GameCanvas.isTouch || GameCanvas.isTouch && !GameCanvas.isTouchControl) {
                    var1.setClip(0, cmdBarY - 4, GameCanvas.w, 100);
                    var1.setColor(3612190);
                    var1.fillRect(hpBarX - 44, hpBarY, 19, 19);
                    var1.setColor(265220);
                    var1.fillRect(nsoNZ, cmdBarY + 35, nsoPB, 1);
                    var1.fillRect(nsoNZ, cmdBarY + 33, nsoPB, 1);
                    var1.fillRect(nsoNZ, cmdBarY + 30, nsoPB, 1);
                    var1.fillRect(nsoNZ, cmdBarY + 28, nsoPB, 1);
                    var1.fillRect(nsoNZ, cmdBarY + 26, nsoPB, 1);
                    var1.fillRect(nsoNZ, cmdBarY + 12, nsoPB, 1);
                    var1.fillRect(nsoNZ, cmdBarY + 24, nsoPB, 1);
                    var1.fillRect(nsoNZ, cmdBarY + 18, nsoPB, 1);
                    var1.fillRect(nsoNZ, cmdBarY + 16, nsoPB, 1);
                    var1.fillRect(nsoNZ, cmdBarY + 2, nsoPB, 1);
                    var1.fillRect(nsoNZ, cmdBarY + 4, nsoPB, 1);
                    var1.fillRect(nsoNZ, cmdBarY + 6, nsoPB, 1);
                    var1.fillRect(nsoNZ, cmdBarY + 14, nsoPB, 1);
                    var1.setColor(12562018);
                    var1.fillRect(nsoNZ, cmdBarY + 5, nsoPB, 1);
                    var1.fillRect(nsoNZ, cmdBarY + 17, nsoPB, 1);
                    var1.fillRect(nsoNZ, cmdBarY + 34, nsoPB, 1);
                    var1.fillRect(nsoNZ, cmdBarY + 29, nsoPB, 1);
                    var1.setColor(14667167);
                    var1.fillRect(nsoNZ, cmdBarY + 3, nsoPB, 1);
                    var1.fillRect(nsoNZ, cmdBarY + 15, nsoPB, 1);
                    var1.fillRect(nsoNZ, cmdBarY + 27, nsoPB, 1);
                    var1.setColor(3355443);
                    var1.fillRect(nsoNZ, cmdBarY + 7, nsoPB, 5);
                    var1.fillRect(nsoNZ, cmdBarY + 19, nsoPB, 5);
                    var1.fillRect(nsoNZ, cmdBarY + 31, nsoPB, 2);
                    var1.setColor(12281361);
                    var1.fillRect(nsoNZ, cmdBarY + 25, nsoPB, 1);
                    var1.fillRect(nsoNZ, cmdBarY + 13, nsoPB, 1);
                    var1.drawImage(nsoPI[0], 0, cmdBarY + 2, 0);
                    var1.drawImage(nsoPI[1], 0 + cmdBarW, cmdBarY - 4, 24);
                    if ((var16 = Char.getMyChar().cHP * hpBarW / Char.getMyChar().cMaxHP) > hpBarW) {
                        var16 = 0;
                    }

                    var1.setColor(7798784);
                    var1.fillRect(hpBarX, hpBarY, var16, 2);
                    var1.setColor(13369344);
                    var1.fillRect(hpBarX, hpBarY + 1, var16, 4);
                    if ((var16 = Char.getMyChar().cMP * hpBarW / Char.getMyChar().cMaxMP) > hpBarW) {
                        var16 = 0;
                    }

                    var1.setColor(4488);
                    var1.fillRect(hpBarX, hpBarY + 12, var16, 2);
                    var1.setColor(4573);
                    var1.fillRect(hpBarX, hpBarY + 14, var16, nsoPH - 2);
                    var18 = (int) (Char.getMyChar().cExpR * (long) expBarW / exps[Char.getMyChar().clevel]);
                    var1.setColor(94373);
                    var1.fillRect(46, cmdBarY + 31, var18, 1);
                    var1.setColor(65535);
                    var1.fillRect(46, cmdBarY + 32, var18, 1);
                    mFont.number_yellow.drawString(var1, "" + Char.getMyChar().clevel, 28, cmdBarY + 9, 2);
                    long var29 = 0L;
                    if (Char.getMyChar().cExpDown > 0L) {
                        var29 = Char.getMyChar().cExpDown * 10000L / exps[Char.getMyChar().clevel];
                    } else {
                        var29 = Char.getMyChar().cExpR * 10000L / exps[Char.getMyChar().clevel];
                    }

                    var9 = (int) (var29 % 100L);
                    mFont.tahoma_7_white.drawString(var1, (Char.getMyChar().cExpDown > 0L ? "-" + var29 / 100L : "" + var29 / 100L) + "." + (var9 < 10 ? "0" + var9 : "" + var9) + "%", 24, cmdBarY + 23, 2);
                    mFont.number_green.drawString(var1, "" + hpPotion, cmdBarW - 11, cmdBarY + 6, 2);
                    mFont.number_green.drawString(var1, "" + mpPotion, cmdBarW - 11, cmdBarY + 18, 2);
                    mFont.number_white.drawString(var1, "" + Char.getMyChar().cHP, hpBarX + hpBarW / 2, cmdBarY + 6, 2);
                    mFont.number_white.drawString(var1, "" + Char.getMyChar().cMP, hpBarX + hpBarW / 2, cmdBarY + 18, 2);
                    if (Char.getMyChar().vSkillFight.size() > 0 && Char.getMyChar().myskill != null) {
                        int var10001 = nsoNZ - 28;
                        int var10002 = hpBarY + 7;
                        Char.getMyChar().myskill.paint(var10001, var10002, var1);
                    }

                    var1.setColor(9463099);
                    var1.fillRect(0, cmdBarY + 35, GameCanvas.w, 1);
                } else {
                    Paint.nsoAA(var1);
                }

                if (GameCanvas.isTouch) {
                    isPaintSelectSkill = true;
                }

                resetTranslate(var1);
                this.paintSelectedSkill(var1);
                resetTranslate(var1);
                var1.setClip(0, 0, GameCanvas.w, GameCanvas.h);

                for (var2 = 0; var2 < Effect2.vEffect2Outside.size(); ++var2) {
                    ((Effect2) Effect2.vEffect2Outside.elementAt(var2)).paint(var1);
                }

                resetTranslate(var1);
                if (isPaintInfoMe) {
                    if (indexMenu == 0) {
                        this.paintBag(var1, mResources.MENUME);
                    }

                    this.paintKyNang(var1);
                    this.paintTiemNang(var1);
                    if (indexMenu == 3) {
                        label796:
                        {
                            resetTranslate(var1);
                            Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
                            if (indexTitle == 1) {
                                var1.setColor(Paint.COLORDARK);
                                var1.fillRect(popupX + 7, popupY + 32, popupW - 14, popupH - 40);
                                var1.setColor(16777215);
                            } else {
                                var1.setColor(10249521);
                            }

                            var1.drawRect(popupX + 7, popupY + 32, popupW - 14, popupH - 40);
                            paintTitle(var1, mResources.MENUME[indexMenu], true);
                            xstart = popupX + 17;
                            ystart = popupY + 34;
                            scrMain.setStyle(indexRowMax, 12, popupX, popupY + 35, popupW, popupH - 44, true, 1);
                            scrMain.setClip(var1);
                            mFont var30;
                            String var31;
                            if (typeViewInfo == 0) {
                                indexRowMax = 19;
                                var18 = ystart;
                                if (currentCharViewInfo == null) {
                                    break label796;
                                }

                                mFont.tahoma_7b_white.drawString(var1, mResources.inforMe[0] + currentCharViewInfo.cName, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMe[1] + currentCharViewInfo.cPk;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMe[2] + currentCharViewInfo.clevel;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_blue1;
                                var31 = mResources.inforMe[3] + currentCharViewInfo.nClass.name;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_blue1;
                                var31 = mResources.inforMe[4] + mResources.SYS[currentCharViewInfo.getSys()];
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMe[5] + currentCharViewInfo.cHP + "/" + currentCharViewInfo.cMaxHP;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMe[6] + currentCharViewInfo.cMP + "/" + currentCharViewInfo.cMaxMP;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMe[7] + currentCharViewInfo.getSpeed();
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMe[8] + (currentCharViewInfo.cdame - currentCharViewInfo.cdame / 10) + "-" + currentCharViewInfo.cdame;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMe[9] + currentCharViewInfo.cResFire;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMe[10] + currentCharViewInfo.cResIce;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMe[11] + currentCharViewInfo.cResWind;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMe[12] + currentCharViewInfo.cdameDown;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMe[13] + currentCharViewInfo.cExactly;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMe[14] + currentCharViewInfo.cMiss;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMe[15] + currentCharViewInfo.cFatal;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMe[16] + currentCharViewInfo.cReactDame;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMe[17] + currentCharViewInfo.sysUp;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMe[18] + currentCharViewInfo.sysDown;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                            } else if (typeViewInfo == 1) {
                                indexRowMax = 20;
                                var18 = ystart;
                                if (currentCharViewInfo == null) {
                                    break label796;
                                }

                                mFont.tahoma_7b_white.drawString(var1, mResources.inforMePoint[15] + (currentCharViewInfo.cClanName.equals("") ? mResources.NO_CLAN : currentCharViewInfo.cClanName), xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMePoint[0] + currentCharViewInfo.pointUydanh;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_blue1;
                                var31 = mResources.inforMePoint[11] + currentCharViewInfo.countFinishDay + "/20";
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_blue1;
                                var31 = mResources.inforMePoint[12] + currentCharViewInfo.countLoopBoos + mResources.NUMBER;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_blue1;
                                var31 = mResources.inforMePoint[16] + currentCharViewInfo.countPB + mResources.NUMBER;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMePoint[13] + currentCharViewInfo.limitTiemnangso;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMePoint[14] + currentCharViewInfo.limitKynangso;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMePoint[18] + currentCharViewInfo.limitPhongLoi + mResources.NUMBER;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMePoint[19] + currentCharViewInfo.limitBangHoa + mResources.NUMBER;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMePoint[17] + currentCharViewInfo.pointTinhTu;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMePoint[1] + currentCharViewInfo.pointVukhi;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMePoint[2] + currentCharViewInfo.pointLien;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMePoint[3] + currentCharViewInfo.pointNhan;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMePoint[4] + currentCharViewInfo.pointNgocboi;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMePoint[5] + currentCharViewInfo.pointPhu;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMePoint[6] + currentCharViewInfo.pointNon;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMePoint[7] + currentCharViewInfo.pointAo;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMePoint[8] + currentCharViewInfo.pointGangtay;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMePoint[9] + currentCharViewInfo.pointQuan;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                                var30 = mFont.tahoma_7_white;
                                var31 = mResources.inforMePoint[10] + currentCharViewInfo.pointGiay;
                                var18 += 12;
                                var30.drawString(var1, var31, xstart, var18, 0);
                            }

                            if (indexTitle == 1 && indexRow >= 0) {
                                SmallImage.drawSmallImage(var1, 942, xstart - 8, ystart + 2 + indexRow * 12, 0, StaticObj.TOP_LEFT);
                            }
                        }
                    }

                    this.paintTrangbi(var1);
                    this.paintThuCuoi(var1);
                    this.paintBijuu(var1);
                } else if (isPaintUI()) {
                    if (isPaintStore) {
                        if (indexMenu == 0) {
                            this.paintItemList(var1, mResources.TITLESTORE, arrItemStore);
                        } else if (indexMenu == 1) {
                            this.paintItemList(var1, mResources.TITLESTORE, arrItemBook);
                        } else if (indexMenu == 2) {
                            this.paintItemList(var1, mResources.TITLESTORE, arrItemFashion);
                        } else if (indexMenu == 3) {
                            this.paintItemList(var1, mResources.TITLESTORE, arrItemClanShop);
                        } else if (indexMenu == 52) {
                            this.paintShopOnline(var1, arrItemFashion);
                        }
                    }

                    if (isPaintNonNam) {
                        if (indexMenu == 0) {
                            this.paintItemList(var1, mResources.TITLECLOTHE, arrItemNonNam);
                        } else if (indexMenu == 1) {
                            this.paintBag(var1, mResources.TITLENON);
                        }
                    }

                    if (isPaintNonNu) {
                        if (indexMenu == 0) {
                            this.paintItemList(var1, mResources.TITLECLOTHE, arrItemNonNu);
                        } else if (indexMenu == 1) {
                            this.paintBag(var1, mResources.TITLENON);
                        }
                    }

                    if (isPaintAoNam) {
                        if (indexMenu == 0) {
                            this.paintItemList(var1, mResources.TITLECLOTHE, arrItemAoNam);
                        } else if (indexMenu == 1) {
                            this.paintBag(var1, mResources.TITLEAO);
                        }
                    }

                    if (isPaintAoNu) {
                        if (indexMenu == 0) {
                            this.paintItemList(var1, mResources.TITLECLOTHE, arrItemAoNu);
                        } else if (indexMenu == 1) {
                            this.paintBag(var1, mResources.TITLEAO);
                        }
                    }

                    if (isPaintGangTayNam) {
                        if (indexMenu == 0) {
                            this.paintItemList(var1, mResources.TITLECLOTHE, arrItemGangTayNam);
                        } else if (indexMenu == 1) {
                            this.paintBag(var1, mResources.TITLEGANGTAY);
                        }
                    }

                    if (isPaintGangTayNu) {
                        if (indexMenu == 0) {
                            this.paintItemList(var1, mResources.TITLECLOTHE, arrItemGangTayNu);
                        } else if (indexMenu == 1) {
                            this.paintBag(var1, mResources.TITLEGANGTAY);
                        }
                    }

                    if (isPaintQuanNam) {
                        if (indexMenu == 0) {
                            this.paintItemList(var1, mResources.TITLECLOTHE, arrItemQuanNam);
                        } else if (indexMenu == 1) {
                            this.paintBag(var1, mResources.TITLEQUAN);
                        }
                    }

                    if (isPaintQuanNu) {
                        if (indexMenu == 0) {
                            this.paintItemList(var1, mResources.TITLEQUAN, arrItemQuanNu);
                        } else if (indexMenu == 1) {
                            this.paintBag(var1, mResources.TITLEQUAN);
                        }
                    }

                    if (isPaintGiayNam) {
                        if (indexMenu == 0) {
                            this.paintItemList(var1, mResources.TITLECLOTHE, arrItemGiayNam);
                        } else if (indexMenu == 1) {
                            this.paintBag(var1, mResources.TITLEGIAY);
                        }
                    }

                    if (isPaintGiayNu) {
                        if (indexMenu == 0) {
                            this.paintItemList(var1, mResources.TITLECLOTHE, arrItemGiayNu);
                        } else if (indexMenu == 1) {
                            this.paintBag(var1, mResources.TITLEGIAY);
                        }
                    }

                    if (isPaintLien) {
                        if (indexMenu == 0) {
                            this.paintItemList(var1, mResources.TITLEDAYCHUYEN, arrItemLien);
                        } else if (indexMenu == 1) {
                            this.paintBag(var1, mResources.TITLEDAYCHUYEN);
                        }
                    }

                    if (isPaintNhan) {
                        if (indexMenu == 0) {
                            this.paintItemList(var1, mResources.TITLENHAN, arrItemNhan);
                        } else if (indexMenu == 1) {
                            this.paintBag(var1, mResources.TITLENHAN);
                        }
                    }

                    if (isPaintNgocBoi) {
                        if (indexMenu == 0) {
                            this.paintItemList(var1, mResources.TITLENGOCBOI, arrItemNgocBoi);
                        } else if (indexMenu == 1) {
                            this.paintBag(var1, mResources.TITLENGOCBOI);
                        }
                    }

                    if (isPaintPhu) {
                        if (indexMenu == 0) {
                            this.paintItemList(var1, mResources.TITLEPHU, arrItemPhu);
                        } else if (indexMenu == 1) {
                            this.paintBag(var1, mResources.TITLEPHU);
                        }
                    }

                    if (isPaintWeapon) {
                        if (indexMenu == 0) {
                            this.paintItemList(var1, mResources.TITLEWEAPON, arrItemWeapon);
                        } else if (indexMenu == 1) {
                            this.paintBag(var1, mResources.TITLEWEAPON);
                        }
                    }

                    if (isPaintEliteShop) {
                        this.paintItemList(var1, mResources.TITLEELITESHOP, arrItemElites);
                    }

                    this.paintUILuckySprin(var1);
                    this.paintThuoc(var1);
                    this.paintThuocKhoa(var1);
                    this.paintTaphoa(var1);
                    this.paintTaphoakhoa(var1);
                    this.paintCuonghoa(var1);
                    this.paintGianHang(var1);
                    this.PaintAuctionBuy(var1);
                    this.paintChuyenHoa(var1);
                    this.paintTachHT(var1);
                    this.paintLuyenThu(var1);
                    this.paintLuyenAo(var1);
                    this.paintGhepngoc(var1);
                    this.paintLuyenThach(var1);
                    this.paintRuong(var1);
                    this.paintItemTrade(var1);
                    this.paintLuyenNgoc(var1);
                    this.paintCheDo(var1);
                    this.paintKhamNgoc(var1);
                    this.paintGiaoDo(var1);
                    this.paintGotNgoc(var1);
                    this.paintThaoNgoc(var1);
                    this.paintDelItem(var1);
                    this.paintPickItem(var1);

                } else if (isPaintZone) {
                    this.paintZone(var1);
                }

                this.paintUIAuto(var1);
                this.paintTask(var1);
                this.paintCharInMap(var1);
                this.paintTeam(var1);
                this.paintFindTeam(var1);
                this.paintFriend(var1);
                this.paintList(var1);
                this.paintClanInfo(var1);
                this.paintItemInfo(var1);
                this.paintListRanked(var1);
                resetTranslate(var1);
                if (GameCanvas.isTouch && GameCanvas.w >= 320) {
                    if (super.left != null && super.left != this.menu) {
                        super.left.x = GameCanvas.w / 2 - 160;
                        super.left.y = GameCanvas.h - 26;
                    }

                    if (super.center != null) {
                        super.center.x = GameCanvas.w / 2 - 35;
                        super.center.y = GameCanvas.h - 26;
                    }

                    if (super.right != null && super.right != this.cmdFocus) {
                        super.right.x = GameCanvas.w / 2 + 88;
                        super.right.y = GameCanvas.h - 26;
                    }
                }
            }

            super.paint(var1);
            if (GameCanvas.isTouch && GameCanvas.isTouchControl) {
                this.paintTouchControl(var1);
                isPaintSelectSkill = true;
            }

            nsoAC(var1);
            resetTranslate(var1);
            this.paintAlert(var1);
            resetTranslate(var1);
            this.paintLucky_Draw(var1);
            resetTranslate(var1);
            Info.paint(var1);
            resetTranslate(var1);
            ChatTextField.gI().paint(var1);
            resetTranslate(var1);
            InfoMe.paint(var1);
        }
    }

    private void paintUIAuto(mGraphics graphics) {
        if (isPaintAuto) {
            resetTranslate(graphics);
            Paint.paintFrame(popupX, popupY, popupW, popupH, graphics);
            if (indexTitle == 1) {
                graphics.setColor(Paint.COLORDARK);
                graphics.fillRect(popupX + 7, popupY + 32, popupW - 14, popupH - 55);
                graphics.setColor(16777215);
            } else {
                graphics.setColor(10249521);
            }

            graphics.drawRect(popupX + 7, popupY + 32, popupW - 14, popupH - 55);
            paintTitle(graphics, mResources.ACTIONS[7], false);
            xstart = popupX + 17;
            ystart = popupY + 45;
            indexRowMax = 38;
            scrMain.setStyle(indexRowMax, 30, popupX, popupY + 39, popupW, popupH - 63, true, 1);
            scrMain.setClip(graphics);
            int ystartNE = ystart;
            paintCheckBox(graphics, mResources.AUTO_TEXT[0], Char.isAHP, Char.aHpValue + "%", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[1], Char.isAMP, Char.aMpValue + "%", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[2], Char.isAFood, String.valueOf(Char.aFoodValue), xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[3], Char.isABuff, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[4], Char.isAKhienMana, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[5], Char.isADotQuai, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[6], Char.isADungPT, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[7], Char.isAPickYen, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[8], Char.isAPickYHM, "LV: " + Char.aHpMpValue, xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[9], Char.isAPickYHMS, "LV: " + Char.aDaValue, xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[10], Char.isALuyenDa, "LV: " + Char.aLuyenDaValue, xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[11], Char.isAPickTB, "LV: " + Char.aTBValue, xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[12], Char.isAPickTBLa, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[13], Char.isAPickVPNV, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[14], Char.isAPickVPSK, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[15], Char.isAPickAll, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[16], Char.isAPickSVC, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[17], Char.isANoPick, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[18], Char.isALuyenTTT, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[19], Char.isALuyenTTC, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[20], Char.isAReMap, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[21], Char.isATsMapTrong, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[22], Char.isAMuaFood, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[23], Char.isANoMP, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[24], Char.isAReConnect, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[25], Char.isAChuyenMapHetQuai, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[26], Char.isASanTaTl, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[27], Char.isADanhQuai, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[28], Char.isADanhTA, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[29], Char.isADanhTL, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[30], Char.isACongTN, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[31], Char.isACongKN, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[32], Char.isADanhNhom, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[33], Char.isANePk, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[34], Char.isADungCoLenh, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[35], Char.isAMuaCoLenh, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[36], Char.isADungTTL, "", xstart, ystartNE);
            ystartNE += 30;
            paintCheckBox(graphics, mResources.AUTO_TEXT[37], Char.isAMuaTTL, "", xstart, ystartNE);
            if (indexTitle == 1 && indexRow >= 0 && !GameCanvas.isTouch) {
                SmallImage.drawSmallImage(graphics, 942, xstart - 8, ystart + 2 + indexRow * 30, 0, StaticObj.TOP_LEFT);
            }

            resetTranslate(graphics);
            mFont.tahoma_7_green.drawString(graphics, GameCanvas.isTouch ? mResources.AUTO_TIP2 : mResources.AUTO_TIP1, popupX + popupW / 2, popupY + popupH - 17, 2);
        }
    }

    private static void paintCheckBox(mGraphics var0, String var1, boolean var2, String var3, int var4, int var5) {
        var0.setColor(16777215);
        var0.fillRect(var4, var5, 12, 12);
        if (var2) {
            var0.setColor(9650442);
            var0.drawLine(var4 + 2, var5 + 2, var4 + 2 + 7, var5 + 2 + 7);
            var0.drawLine(var4 + 2, var5 + 2 + 7, var4 + 2 + 7, var5 + 2);
        }

        mFont var6;
        (var6 = var2 ? mFont.tahoma_7_white : mFont.tahoma_7_grey).drawString(var0, var1, var4 + 18, var5, 0);
        if (!var3.equals("")) {
            var0.setColor(Paint.COLORLIGHT);
            var0.fillRect(var4 + 115, var5 - 3, 30, 20);
            var0.setColor(var2 ? 16777215 : 0);
            var0.drawRect(var4 + 115, var5 - 3, 30, 20);
            var6.drawString(var0, var3, var4 + 133, var5 + 2, 2);
        }
    }

    private void paintList(mGraphics var1) {
        if (isPaintList) {
            Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
            paintTitle(var1, mResources.LIST, false);
            xstart = popupX + 5;
            ystart = popupY + 40;
            if (vList.size() == 0) {
                mFont.tahoma_7_white.drawString(var1, mResources.EMPTY_INFO, popupX + popupW / 2, popupY + 40, 2);
                return;
            }

            var1.setColor(-16770791);
            var1.fillRect(xstart - 2, ystart - 2, popupW - 6, indexSize * 5 + 8);
            resetTranslate(var1);
            scrMain.setStyle(vList.size(), indexSize, xstart, ystart, popupW - 3, indexSize * 5 + 4, true, 1);
            scrMain.setClip(var1, xstart, ystart, popupW - 3, indexSize * 5 + 6);
            indexRowMax = vList.size();

            for (int var4 = 0; var4 < vList.size(); ++var4) {
                DunItem var2 = null;

                try {
                    var2 = (DunItem) vList.elementAt(var4);
                } catch (Exception var3) {
                }

                if (var2 != null) {
                    if (indexRow == var4) {
                        var1.setColor(Paint.COLORLIGHT);
                        var1.fillRect(xstart + 2, ystart + indexRow * indexSize + 2, popupW - 15, indexSize - 4);
                        var1.setColor(16777215);
                        var1.drawRect(xstart + 2, ystart + indexRow * indexSize + 2, popupW - 15, indexSize - 4);
                    } else {
                        var1.setColor(Paint.COLORBACKGROUND);
                        var1.fillRect(xstart + 2, ystart + var4 * indexSize + 2, popupW - 15, indexSize - 4);
                        var1.setColor(13932896);
                        var1.drawRect(xstart + 2, ystart + var4 * indexSize + 2, popupW - 15, indexSize - 4);
                    }

                    mFont.tahoma_7_yellow.drawString(var1, var2.name1, xstart + (popupW - 10) / 2 - popupW / 4, ystart + var4 * indexSize + indexSize / 2 - 6, 2);
                    mFont.tahoma_7b_red.drawString(var1, " vs ", xstart + (popupW - 10) / 2, ystart + var4 * indexSize + indexSize / 2 - 6, 2);
                    mFont.tahoma_7_yellow.drawString(var1, var2.name2, xstart + (popupW - 10) / 2 + popupW / 4, ystart + var4 * indexSize + indexSize / 2 - 6, 2);
                }
            }

            paintNumCount(var1);
        }

    }

    private void paintCharInMap(mGraphics var1) {
        if (isPaintCharInMap) {
            Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
            paintTitle(var1, mResources.LIST, false);
            xstart = popupX + 5;
            ystart = popupY + 40;
            if (vCharInMap.size() == 0) {
                mFont.tahoma_7_white.drawString(var1, mResources.NO_ONE, popupX + popupW / 2, popupY + 40, 2);
                return;
            }

            var1.setColor(-16770791);
            var1.fillRect(xstart - 2, ystart - 2, popupW - 6, indexSize * 5 + 8);
            resetTranslate(var1);
            scrMain.setStyle(vCharInMap.size(), indexSize, xstart, ystart, popupW - 3, indexSize * 5 + 4, true, 1);
            scrMain.setClip(var1, xstart, ystart, popupW - 3, indexSize * 5 + 6);
            indexRowMax = vCharInMap.size();

            for (int var2 = 0; var2 < vCharInMap.size(); ++var2) {
                Char var3 = null;

                try {
                    if ((var3 = (Char) vCharInMap.elementAt(var2)).isNhanbanz()) {
                        continue;
                    }
                } catch (Exception var4) {
                }

                if (var3 != null) {
                    if (indexRow == var2) {
                        var1.setColor(Paint.COLORLIGHT);
                        var1.fillRect(xstart + 2, ystart + indexRow * indexSize + 2, popupW - 15, indexSize - 4);
                        var1.setColor(16777215);
                        var1.drawRect(xstart + 2, ystart + indexRow * indexSize + 2, popupW - 15, indexSize - 4);
                    } else {
                        var1.setColor(Paint.COLORBACKGROUND);
                        var1.fillRect(xstart + 2, ystart + var2 * indexSize + 2, popupW - 15, indexSize - 4);
                        var1.setColor(13932896);
                        var1.drawRect(xstart + 2, ystart + var2 * indexSize + 2, popupW - 15, indexSize - 4);
                    }

                    SmallImage.drawSmallImage(var1, 647, xstart + 12, ystart + var2 * indexSize + indexSize / 2, 0, 3);
                    if (this.cLastFocusID > 0 && this.cLastFocusID == var3.charID) {
                        mFont.tahoma_7_yellow.drawString(var1, var3.cName + " - " + mResources.level + ": " + var3.clevel, xstart + 22, ystart + var2 * indexSize + indexSize / 2 - 6, 0);
                    } else if (var3.statusMe == 14) {
                        mFont.tahoma_7_grey.drawString(var1, var3.cName + " - " + mResources.level + ": " + var3.clevel, xstart + 22, ystart + var2 * indexSize + indexSize / 2 - 6, 0);
                    } else {
                        mFont.tahoma_7_green.drawString(var1, var3.cName + " - " + mResources.level + ": " + var3.clevel, xstart + 22, ystart + var2 * indexSize + indexSize / 2 - 6, 0);
                    }
                }
            }

            paintNumCount(var1);
        }

    }

    private void paintFoodEffect(mGraphics var1) {
        try {
            int var2 = (int) (System.currentTimeMillis() / 1000L);
            int var4 = 5;
            if (GameCanvas.isTouch && GameCanvas.isTouchControl) {
                var4 = 45 + Info.hI;
            }

            if (GameCanvas.isTouchControlSmallScreen && Char.getMyChar().vSkillFight.size() > 4) {
                var4 += 25;
            }

            resetTranslate(var1);
            int var8;
            if (!GameCanvas.isTouchControlLargeScreen) {
                boolean var3 = false;

                for (int var5 = 0; var5 < Char.getMyChar().vEff.size(); ++var5) {
                    Effect var7 = (Effect) Char.getMyChar().vEff.elementAt(var5);
                    SmallImage.drawSmallImage(var1, var7.template.iconId, GameCanvas.w - 13 - (var5 * 13 << 1), var4 + 14, 0, 33);
                    if ((var8 = var7.timeLenght - (var2 - var7.timeStart)) >= 0) {
                        mFont.tahoma_7_white.drawString(var1, NinjaUtil.getTime(var8), GameCanvas.w - 13 - (var5 * 13 << 1), var4 + 15, 2, mFont.tahoma_7_grey);
                    }
                }

                var8 = this.timeLengthMap - (var2 - this.timeStartMap);
                if (Char.getMyChar().vEff.size() > 0) {
                    var4 += 27;
                }

                if (var8 > 0) {
                    mFont.tahoma_7_white.drawString(var1, mResources.TIME + ": " + NinjaUtil.getTime(var8), GameCanvas.w - 2, var4, 1, mFont.tahoma_7_grey);
                    var4 += 12;
                }

                if (TileMap.typeMap == 1) {
                    mFont.tahoma_7_white.drawString(var1, mResources.ACHIEVEMENT + ": " + Char.getMyChar().countKill, GameCanvas.w - 2, var4, 1, mFont.tahoma_7_grey);
                    var4 += 12;
                    mFont.tahoma_7_white.drawString(var1, mResources.MAX + ": " + Char.getMyChar().countKillMax, GameCanvas.w - 2, var4, 1, mFont.tahoma_7_grey);
                    var4 += 12;
                } else if (TileMap.typeMap != 2 && TileMap.mapID != 114 && TileMap.mapID != 115 && TileMap.mapID != 116) {
                    if (TileMap.typeMap == 3) {
                        mFont.tahoma_7_white.drawString(var1, mResources.PROPERTY + ": " + Char.pointChienTruong, GameCanvas.w - 2, var4, 1, mFont.tahoma_7_grey);
                        var4 += 12;
                        mFont.tahoma_7_white.drawString(var1, mResources.TITLE_CT[Char.getCT()], GameCanvas.w - 2, var4, 1, mFont.tahoma_7_grey);
                        var4 += 12;
                    }
                } else {
                    mFont.tahoma_7_white.drawString(var1, mResources.PROPERTY + ": " + Char.pointPB, GameCanvas.w - 2, var4, 1, mFont.tahoma_7_grey);
                    var4 += 12;
                }
            }

            if (vParty.size() > 0 && GameCanvas.w > 128 && !isPaintUI()) {
                var4 -= 18;

                for (var8 = 0; var8 < vParty.size(); ++var8) {
                    Party var9;
                    if ((var9 = (Party) vParty.elementAt(var8)).c != null) {
                        mFont var10000 = mFont.tahoma_7_white;
                        String var10002 = var9.name + "(" + var9.c.clevel + ")";
                        int var10003 = GameCanvas.w - 14;
                        var4 += 18;
                        var10000.drawString(var1, var10002, var10003, var4, 1, mFont.tahoma_7_grey);
                        var9.c.paintHp(var1, GameCanvas.w - 41, var4 + 12);
                        SmallImage.drawSmallImage(var1, var9.iconId, GameCanvas.w - 7, var4 + 9, 0, 3);
                    } else {
                        var4 += 16;
                        mFont.tahoma_7_green.drawString(var1, var9.name, GameCanvas.w - 14, var4 + 5, 1, mFont.tahoma_7_grey);
                        SmallImage.drawSmallImage(var1, var9.iconId, GameCanvas.w - 7, var4 + 11, 0, 3);
                    }
                }

                return;
            }
        } catch (Exception var6) {
        }

    }

    public static void resetTranslate(mGraphics var0) {
        var0.translate(-var0.getTranslateX(), -var0.getTranslateY());
        var0.setClip(0, -200, GameCanvas.w, 200 + GameCanvas.h);
    }

    public static void ShowMob(final mGraphics var1, final int x, final int y) {
        int normalMobs = 0;
        int eliteMobs = 0;
        int bossMobs = 0;
        for (int i = 0; i < vMob.size(); i++) {
            Mob mob = (Mob) vMob.elementAt(i);
            if (mob.levelBoss == 0 && mob.status != 0 && mob.status != 1 && mob.hp > 0) {
                normalMobs++;
            } else if (mob.levelBoss == 1 && mob.status != 0 && mob.status != 1 && mob.hp > 0) {
                eliteMobs++;
            } else if (mob.levelBoss == 2 && mob.status != 0 && mob.status != 1 && mob.hp > 0) {
                bossMobs++;
            }
        }

        String displayText = "Số quái,TA,TL: " + normalMobs
                + " - " + eliteMobs
                + " - " + bossMobs;
        mFont.tahoma_7_yellow.drawString(var1, displayText, x, y + 66, 0, mFont.tahoma_7);
    }

    public static void ShowPlayer(mGraphics var1, int x, int y) {
        int playersType1 = 0;
        int playersType2 = 0;
        int playersType3 = 0;
        int players = vCharInMap.size();

        for (int i = 0; i < vCharInMap.size(); i++) {
            Char player = (Char) vCharInMap.elementAt(i);
            if (player.cTypePk == 1) {
                playersType1++;
            } else if (player.cTypePk == 2) {
                playersType2++;
            } else if (player.cTypePk == 3) {
                playersType3++;
            }
        }

        String player = "Số player pk,player: " + (playersType1 + playersType2 + playersType3 + " - " + players);
        mFont.tahoma_7_yellow.drawString(var1, player, x, y + 78, 0, mFont.tahoma_7);
    }

    private void paintDebugInfo(mGraphics var1) {
        try {
            if (!GameCanvas.menu.showMenu) {
                if (!InfoDlg.isShow) {
                    if (!isPaintPopup()) {
                        int intY = -7;
                        int intX = 3;
                        if ((!GameCanvas.isTouch || GameCanvas.isTouch && !GameCanvas.isTouchControl) && isPaintSelectSkill) {
                            intX += 30;
                        }

                        if (GameCanvas.isTouch) {
                            intY = -7 + 45 + Info.hI;
                            if (GameCanvas.isTouchControlSmallScreen) {
                                intY += 35;
                            }
                        }

                        var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
                        int var9;
                        mFont var10000;
                        String var10002;
                        if (GameCanvas.isTouchControlLargeScreen) {
                            int var4 = (int) (System.currentTimeMillis() / 1000L);

                            for (int var6 = 0; var6 < Char.getMyChar().vEff.size(); ++var6) {
                                Effect var5 = (Effect) Char.getMyChar().vEff.elementAt(var6);
                                SmallImage.drawSmallImage(var1, var5.template.iconId, intX + 13 + (var6 * 13 << 1), intY + 27, 0, 33);
                                if ((var9 = var5.timeLenght - (var4 - var5.timeStart)) >= 0) {
                                    mFont.tahoma_7_white.drawString(var1, NinjaUtil.getTime(var9), intX + 13 + (var6 * 13 << 1), intY + 28, 2, mFont.tahoma_7_grey);
                                }
                            }

                            var9 = this.timeLengthMap - (var4 - this.timeStartMap);
                            if (Char.getMyChar().vEff.size() > 0) {
                                intY += 27;
                            }

                            if (var9 > 0) {
                                var10000 = mFont.tahoma_7_white;
                                var10002 = mResources.TIME + ": " + NinjaUtil.getTime(var9);
                                intY += 12;
                                var10000.drawString(var1, var10002, intX, intY, 0, mFont.tahoma_7_grey);
                            }
                        }

                        String var8;
                        if (Char.getMyChar().clevel <= 20) {
                            if (Char.getMyChar().pPoint > 0) {
                                var8 = "+" + Char.getMyChar().pPoint + " " + mResources.POTENIAL;
                                intY += 12;
                                mFont.tahoma_7_yellow.drawString(var1, var8, intX, intY, 0, mFont.tahoma_7_grey);
                            }

                            if (Char.getMyChar().sPoint > 0) {
                                var8 = "+" + Char.getMyChar().sPoint + " " + mResources.SKILL_PT;
                                intY += 12;
                                mFont.tahoma_7_yellow.drawString(var1, var8, intX, intY, 0, mFont.tahoma_7_grey);
                            }
                        }
                        if (Code.auto != null) {
                            intY += 12;
                            (GameCanvas.gameTick % 10 > 7 ? mFont.tahoma_7_red : mFont.tahoma_7_yellow).drawString(var1, Code.auto.toString(), intX, intY, 0, mFont.tahoma_7_grey);
                            if (Code.auto instanceof AutoSellPro) {
                                intY += 12;
                                mFont.tahoma_7_yellow.drawString(var1, "TK: " + NinjaUtil.numberToString(String.valueOf(Char.getMyChar().xu)) + " xu", intX, intY, 0, mFont.tahoma_7_grey);
                            }
                            if (Code.isADapDo) {
                                intY += 12;
                                mFont.tahoma_7_yellow.drawString(var1, "Auto đập đồ: +" + Code.CapDoValue, intX, intY, 0, mFont.tahoma_7_grey);
                            }

                            if (Code.isAGiuLV) {
                                intY += 12;
                                mFont.tahoma_7_yellow.drawString(var1, "Tự đi pk âm: " + Code.PKAmValue + "%", intX, intY, 0, mFont.tahoma_7_grey);
                            }

                            if (FormDanhVong.isADanhVong && !(Code.auto instanceof AutoDanhVong)) {
                                intY += 12;
                                String var13 = (FormDanhVong.advAH < 10 ? "0" : "") + FormDanhVong.advAH + "h" + (FormDanhVong.advAI < 10 ? "0" : "") + FormDanhVong.advAI;
                                mFont.tahoma_7_yellow.drawString(var1, "Tự đi làm dv: " + var13, intX, intY, 0, mFont.tahoma_7_grey);
                            }
                        }

                        if (Code.isADanhCVT) {
                            intY += 12;
                            mFont.tahoma_7_yellow.drawString(var1, "Vị trí: " + (Code.advAT + 1) + "/" + Code.cxViTri.size(), intX, intY, 0, mFont.tahoma_7_grey);
                        }

                        if (Code.TimeUpValue > 0L) {
                            intY += 12;
                            mFont.tahoma_7_yellow.drawString(var1, "Up Còn: " + NinjaUtil.getTime((int) (Code.TimeUpValue / 1000L)), intX, intY, 0, mFont.tahoma_7_grey);
                        }
                        ShowMob(var1, intX, intY);
                        ShowPlayer(var1, intX, intY);

                        if (ChatManager.gI().waitList.size() > 0) {
                            this.xM[0] = intX;
                            this.yM[0] = intY + 12;
                            var8 = "+" + ChatManager.gI().waitList.size() + " " + mResources.private_message;
                            if (GameCanvas.gameTick % 10 > 4) {
                                intY += 12;
                                mFont.tahoma_7_red.drawString(var1, var8, intX, intY, 0, mFont.tahoma_7_grey);
                            } else {
                                intY += 12;
                                mFont.tahoma_7_yellow.drawString(var1, var8, intX, intY, 0, mFont.tahoma_7_grey);
                            }
                        }

                        if (ChatManager.isMessageClan || ChatManager.isMessagePt) {
                            var8 = "";
                            this.xM[1] = intX;
                            this.yM[1] = intY + 12;
                            if (ChatManager.isMessageClan && ChatManager.isMessagePt) {
                                var8 = mResources.CLANPT_MESSAGE[0];
                            } else if (ChatManager.isMessageClan) {
                                var8 = mResources.CLANPT_MESSAGE[1];
                            } else if (ChatManager.isMessagePt) {
                                var8 = mResources.CLANPT_MESSAGE[2];
                            }

                            if (GameCanvas.gameTick % 10 > 7) {
                                intY += 12;
                                mFont.tahoma_7_red.drawString(var1, var8, intX, intY, 0, mFont.tahoma_7_grey);
                            } else {
                                intY += 12;
                                mFont.tahoma_7_yellow.drawString(var1, var8, intX, intY, 0, mFont.tahoma_7_grey);
                            }
                        }

                        if (TileMap.typeMap != 3) {
                            if (Char.getMyChar().isHumanz()) {
                                if (Char.getMyChar().taskMaint != null) {
                                    var8 = Char.getMyChar().taskMaint.subNames[Char.getMyChar().taskMaint.index];

                                    for (var9 = 0; var8 == null; var8 = Char.getMyChar().taskMaint.subNames[Char.getMyChar().taskMaint.index - var9]) {
                                        ++var9;
                                    }

                                    if (Char.getMyChar().taskMaint.counts[Char.getMyChar().taskMaint.index] != -1) {
                                        var8 = var8 + " " + Char.getMyChar().taskMaint.count + "/" + Char.getMyChar().taskMaint.counts[Char.getMyChar().taskMaint.index];
                                    }

                                    if (GameCanvas.taskTick > 0 && GameCanvas.gameTick % 10 > 4) {
                                        intY += 12;
                                        mFont.tahoma_7_yellow.drawString(var1, var8, intX, intY, 0, mFont.tahoma_7_grey);
                                    } else {
                                        intY += 12;
                                        mFont.tahoma_7_white.drawString(var1, var8, intX, intY, 0, mFont.tahoma_7_grey);
                                    }
                                } else {
                                    byte var11;
                                    if ((var11 = getTaskMapId()) >= 0) {
                                        var10000 = mFont.tahoma_7_white;
                                        var10002 = mResources.TASK_RECEIVE + " " + TileMap.mapNames[var11];
                                        intY += 12;
                                        var10000.drawString(var1, var10002, intX, intY, 0, mFont.tahoma_7_grey);
                                    }
                                }
                            }
                        } else if (Char.getMyChar().charFocus != null) {
                            if (Char.getMyChar().charFocus.cTypePk == 4) {
                                intY += 12;
                                mFont.tahoma_7_white.drawString(var1, mResources.WHITE_PARTY, intX, intY, 0, mFont.tahoma_7_grey);
                            } else if (Char.getMyChar().charFocus.cTypePk == 5) {
                                intY += 12;
                                mFont.tahoma_7_white.drawString(var1, mResources.BLACK_PARTY, intX, intY, 0, mFont.tahoma_7_grey);
                            } else if (Char.getMyChar().charFocus.cTypePk == 6) {
                                intY += 12;
                                mFont.tahoma_7_white.drawString(var1, mResources.PHE3_PARTY, intX, intY, 0, mFont.tahoma_7_grey);
                            }
                        } else if (Char.getMyChar().mobFocus != null) {
                            if (Char.getMyChar().mobFocus.templateId == 96) {
                                intY += 12;
                                mFont.tahoma_7_white.drawString(var1, mResources.BLACK_PARTY, intX, intY, 0, mFont.tahoma_7_grey);
                            } else if (Char.getMyChar().mobFocus.templateId == 97) {
                                intY += 12;
                                mFont.tahoma_7_white.drawString(var1, mResources.WHITE_PARTY, intX, intY, 0, mFont.tahoma_7_grey);
                            } else if (Char.getMyChar().mobFocus.templateId == 93) {
                                intY += 12;
                                mFont.tahoma_7_white.drawString(var1, mResources.PHE3_PARTY, intX, intY, 0, mFont.tahoma_7_grey);
                            } else {
                                intY += 12;
                                mFont.tahoma_7_white.drawString(var1, mResources.NEUTRAL, intX, intY, 0, mFont.tahoma_7_grey);
                            }
                        }

                        if (Char.getMyChar().mobFocus != null) {
                            MobTemplate var12 = Char.getMyChar().mobFocus.getTemplate();
                            String var10 = var12.name + " lv" + Char.getMyChar().mobFocus.level;
                            if (Char.getMyChar().mobFocus.templateId != 0 && Char.getMyChar().mobFocus.templateId != 142 && Char.getMyChar().mobFocus.templateId != 143) {
                                var10 = var10 + ": " + Char.getMyChar().mobFocus.hp + "/" + Char.getMyChar().mobFocus.maxHp;
                            }

                            var1.setColor(Char.getMyChar().mobFocus.getHPColor());
                            intY += 12;
                            var1.fillRect(intX, intY + 3, 5, 5);
                            var1.setColor(0);
                            var1.drawRect(intX, intY + 3, 5, 5);
                            mFont.tahoma_7_white.drawString(var1, var10, intX + 12, intY, 0, mFont.tahoma_7_grey);
                        } else if (Char.getMyChar().npcFocus != null) {
                            intY += 12;
                            mFont.tahoma_7_yellow.drawString(var1, Char.getMyChar().npcFocus.template.name, intX, intY, 0, mFont.tahoma_7_grey);
                        } else if (Char.getMyChar().charFocus != null) {
                            var1.setColor(Char.getMyChar().charFocus.getClassColor());
                            intY += 12;
                            var1.fillRect(intX, intY + 3, 5, 5);
                            var1.setColor(0);
                            var1.drawRect(intX, intY + 3, 5, 5);
                            mFont.tahoma_7_white.drawString(var1, Char.getMyChar().charFocus.cName + " lv" + Char.getMyChar().charFocus.clevel + ": " + Char.getMyChar().charFocus.cHP + "/" + Char.getMyChar().charFocus.cMaxHP, intX + 12, intY, 0, mFont.tahoma_7_grey);
                        }

                        if (GameCanvas.isTouchControlLargeScreen) {
                            if (TileMap.typeMap == 1) {
                                var10000 = mFont.tahoma_7_white;
                                var10002 = mResources.ACHIEVEMENT + ": " + Char.getMyChar().countKill;
                                intY += 12;
                                var10000.drawString(var1, var10002, intX, intY, 0, mFont.tahoma_7_grey);
                                var10000 = mFont.tahoma_7_white;
                                var10002 = mResources.MAX + ": " + Char.getMyChar().countKillMax;
                                intY += 12;
                                var10000.drawString(var1, var10002, intX, intY, 0, mFont.tahoma_7_grey);
                            } else if (TileMap.typeMap != 2 && TileMap.mapID != 114 && TileMap.mapID != 115 && TileMap.mapID != 116) {
                                if (TileMap.typeMap == 3) {
                                    var10000 = mFont.tahoma_7_white;
                                    var10002 = mResources.PROPERTY + ": " + Char.pointChienTruong;
                                    intY += 12;
                                    var10000.drawString(var1, var10002, intX, intY, 0, mFont.tahoma_7_grey);
                                    var10000 = mFont.tahoma_7_white;
                                    var10002 = mResources.TITLE_CT[Char.getCT()];
                                    intY += 12;
                                    var10000.drawString(var1, var10002, intX, intY, 0, mFont.tahoma_7_grey);
                                }
                            } else {
                                var10000 = mFont.tahoma_7_white;
                                var10002 = mResources.PROPERTY + ": " + Char.pointPB;
                                intY += 12;
                                var10000.drawString(var1, var10002, intX, intY, 0, mFont.tahoma_7_grey);
                            }
                        }

                        var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
                    }
                }
            }
        } catch (Exception var7) {
        }
    }

    private void paintTouchControl(mGraphics var1) {
        if (GameCanvas.isTouch && (!GameCanvas.menu.showMenu || !GameCanvas.isTouchControlSmallScreen)) {
            if (GameCanvas.currentDialog == null && ChatPopup.currentMultilineChatPopup == null && !GameCanvas.menu.showMenu && !isPaintPopup()) {
                resetTranslate(var1);
                if (!ChatTextField.gI().isShow) {
                    var1.drawImage(imgChat, xC + 17, yC + 17, 3);
                }

                if (!this.isNotPaintTouchControl()) {
                    var1.drawImage(imgButton, xL, yL, 0);
                    var1.drawRegion(imgArrow, 0, 0, mGraphics.getWidth(imgArrow), mGraphics.getHeight(imgArrow), 3, xL + 15, yL + 16, 3);
                    if (mScreen.keyTouch == 4) {
                        var1.drawImage(imgButton2, xL, yL, 0);
                        var1.drawRegion(imgArrow2, 0, 0, mGraphics.getWidth(imgArrow), mGraphics.getHeight(imgArrow), 3, xL + 15, yL + 16, 3);
                    }

                    var1.drawImage(imgButton, xR, yR, 0);
                    var1.drawRegion(imgArrow, 0, 0, mGraphics.getWidth(imgArrow), mGraphics.getHeight(imgArrow), 0, xR + 17, yR + 16, 3);
                    if (mScreen.keyTouch == 6) {
                        var1.drawImage(imgButton2, xR, yR, 0);
                        var1.drawRegion(imgArrow2, 0, 0, mGraphics.getWidth(imgArrow), mGraphics.getHeight(imgArrow), 0, xR + 17, yR + 16, 3);
                    }

                    var1.drawImage(imgButton, xU, yU, 0);
                    var1.drawRegion(imgArrow, 0, 0, mGraphics.getWidth(imgArrow), mGraphics.getHeight(imgArrow), 7, xU + 17, yU + 14, 3);
                    if (mScreen.keyTouch == 3) {
                        var1.drawImage(imgButton2, xU, yU, 0);
                        var1.drawRegion(imgArrow2, 0, 0, mGraphics.getWidth(imgArrow), mGraphics.getHeight(imgArrow), 7, xU + 17, yU + 14, 3);
                    }

                    if (Char.getMyChar().ctaskId > 1) {
                        var1.drawImage(imgButton, xHP, yHP, 0);
                        if (mScreen.keyTouch == 10) {
                            var1.drawImage(imgButton2, xHP, yHP, 0);
                        }

                        var1.drawImage(imgHpp, xHP + 16, yHP + 15, 3);
                        mFont.number_white.drawString(var1, "" + hpPotion, xHP + 22, yHP + 20, 1);
                        var1.drawImage(imgButton, xMP, yMP, 0);
                        if (mScreen.keyTouch == 11) {
                            var1.drawImage(imgButton2, xMP, yMP, 0);
                        }

                        var1.drawImage(imgMpp, xMP + 16, yMP + 15, 3);
                        mFont.number_white.drawString(var1, "" + mpPotion, xMP + 22, yMP + 20, 1);
                        var1.drawImage(imgButton, xTG, yTG, 0);
                        if (mScreen.keyTouch == 13) {
                            var1.drawImage(imgButton2, xTG, yTG, 0);
                        }

                        var1.drawImage(imgFocus, xTG + 16, yTG + 16, 3);
                    }

                    var1.drawImage(imgRight, xF, yF, 0);
                    if (mScreen.keyTouch == 5) {
                        var1.drawImage(imgRight2, xF, yF, 0);
                    }

                }
            }
        }
    }

    private void paintSelectedSkill(mGraphics var1) {
        if (GameCanvas.currentDialog == null && ChatPopup.currentMultilineChatPopup == null && !GameCanvas.menu.showMenu && !isPaintPopup() && super.center != this.cmdDead) {
            if (!GameCanvas.isTouch || Char.getMyChar().vSkill.size() >= 2) {
                if (isPaintSelectSkill) {
                    for (int var2 = 0; var2 < onScreenSkill.length; ++var2) {
                        if (GameCanvas.isTouchControlSmallScreen) {
                            if (Info.hI > 0) {
                                yS[var2] = 55 + Info.hI;
                            } else {
                                yS[var2] = 55;
                            }
                        }

                        if (GameCanvas.isTouch && GameCanvas.isTouchControl) {
                            var1.drawImage(imgSkill, xSkill + xS[var2] - 1, yS[var2] - 1, 0);
                        } else {
                            var1.setColor(16764040);
                            var1.drawRect(xSkill + xS[var2] - 1, yS[var2] - 1, 25, 25);
                        }

                        Skill var3 = onScreenSkill[var2];
                        if (var2 == this.selectedIndexSkill && !isPaintUI() && GameCanvas.gameTick % 10 > 5) {
                            var1.setColor(16777215);
                            var1.fillRect(xSkill + xS[var2] + 1, yS[var2] + 1, 22, 22);
                        } else if (!GameCanvas.isTouch) {
                            var1.setColor(0);
                            var1.fillRect(xSkill + xS[var2], yS[var2], 24, 24);
                        }

                        if (var3 != null) {
                            if (var3 == Char.getMyChar().myskill) {
                                var1.setColor(16711680);
                                var1.drawRect(xSkill + xS[var2] - 1, yS[var2] - 1, 25, 25);
                            }

                            var3.paint(xSkill + xS[var2] + 12, yS[var2] + 12, var1);
                        }

                    }
                }

            }
        }
    }

    public static final void startFlyText(String var0, int var1, int var2, int var3, int var4, int var5) {
        var3 = -1;

        for (var4 = 0; var4 < 5; ++var4) {
            if (flyTextState[var4] == -1) {
                var3 = var4;
                break;
            }
        }

        if (var3 != -1) {
            flyTextColor[var3] = var5;
            flyTextString[var3] = var0;
            flyTextX[var3] = var1;
            flyTextY[var3] = var2;
            flyTextDx[var3] = 0;
            flyTextDy[var3] = -2;
            flyTextState[var3] = 0;
        }
    }

    public static final void startLanterns(int var0, int var1) {
        vLanterns.addElement(new Lanterns(var0, var1));
    }

    public static final boolean startSplash(int var0, int var1, int var2) {
        int var3 = splashState[0] == -1 ? 0 : 1;
        if (splashState[var3] != -1) {
            return false;
        } else {
            splashState[var3] = 0;
            splashDir[var3] = var2;
            splashX[var3] = var0;
            splashY[var3] = var1;
            return true;
        }
    }

    private void loadCmdBar() {
        if (nsoPI == null) {
            nsoPI = new Image[2];

            for (int var1 = 0; var1 < 2; ++var1) {
                nsoPI[var1] = GameCanvas.loadImage("/u/c" + var1 + ".png");
            }
        }

        nsoNZ = mGraphics.getWidth(nsoPI[0]);
        nsoPA = mGraphics.getWidth(nsoPI[1]);
        nsoPB = gW - nsoNZ - nsoPA + 1;
        hpBarX = 63;
        hpBarY = cmdBarY + 7;
        hpBarW = gW - 84 - 30 + 15;
        expBarW = gW - 44 - 4;
        nsoPH = 5;
        if (GameCanvas.w > 176) {
            nsoPB -= 50;
            hpBarW -= 50;
            expBarW -= 50;
            hpBarX += 15;
            hpBarW -= 15;
        }

        this.loadInforBar();
    }

    private void loadInforBar() {
        if (GameCanvas.isTouch) {
            hpBarW = 82;
            mpBarW = 57;
            hpBarX = 52;
            hpBarY = GameCanvas.isKiemduyet ? 25 : 10 + Info.hI;
            expBarW = gW - 61;
            if (GameCanvas.isTouchControlSmallScreen) {
                xC = gW / 2 - 2;
                yC = yTouchBar + 50;
            } else {
                this.menu.y = 6 + Info.hI;
                xC = gW - 100;
                yC = 2 + Info.hI;
            }

            TileMap.setPosMiniMap(GameCanvas.w - 60, GameCanvas.isKiemduyet ? 16 : Info.hI, 60, 42);
        }
    }

    private static void showTinhLuyen(final mGraphics mGraphics, final Item item, final int n, final int n2, final boolean b) {
        if (!GameScr.isPaintItemInfo) {
            if (b) {
                mFont.tahoma_7b_white.drawString(mGraphics, (item.sys + 1) + " Sao", n, n2, 2);
                return;
            }
            if (item.options != null) {
                int param = -1;
                for (int i = item.options.size() - 1; i >= 0; --i) {
                    final ItemOption itemOption;
                    if ((itemOption = (ItemOption) item.options.elementAt(i)) != null && itemOption.optionTemplate.id == 85) {
                        param = itemOption.param;
                        break;
                    }
                }
                String tinhLuyenStr = "+" + item.upgrade + (param >= 0 ? ",TL" + param : "");
                mFont.tahoma_7b_white.drawString(mGraphics, tinhLuyenStr, n, n2, 2);
                return;
            }
            if (item.BA <= System.currentTimeMillis()) {
                item.BA = System.currentTimeMillis() + 30000L;
                if (GameScr.currentCharViewInfo.charID != Char.getMyChar().charID) {
                    Service.gI().requestItemPlayer(GameScr.currentCharViewInfo.charID, item.indexUI);
                    return;
                }
                Service.gI().requestItemInfo(item.typeUI, item.indexUI);
            }
        }
    }

    private void paintTrangbi(mGraphics graphics) {
        if (indexMenu == 4) {
            graphics.translate(-graphics.getTranslateX(), -graphics.getTranslateY());
            Paint.paintFrame(popupX, popupY, popupW, popupH, graphics);
            graphics.setColor(Paint.COLORBACKGROUND);
            paintTitle(graphics, mResources.MENUME[indexMenu], true);

            if (currentCharViewInfo.arrItemBody == null) {
                GameCanvas.paintShukiren(popupX + 90, popupY + 75, graphics, false);
                mFont.tahoma_7b_white.drawString(graphics, mResources.PLEASEWAIT, popupX + popupW / 2, popupY + 90, 2);
            } else {
                graphics.setColor(13606712);
                graphics.drawRect(popupX + 33, popupY + (GameCanvas.isTouchControlLargeScreen ? 87 : 34), popupW - 67, GameCanvas.isTouchControlLargeScreen ? 76 : 128);

                int itemSize = indexSize - 2;
                int slotIndex = 0;

                int itemUI;
                int itemX;
                int itemY;

                // Draw item slots
                for (itemUI = 0; itemUI < 16; ++itemUI) {
                    if (itemUI != 0 && itemUI != 2 && itemUI != 4 && itemUI != 6 && itemUI != 8) {
                        if (itemUI != 1 && itemUI != 3 && itemUI != 5 && itemUI != 7 && itemUI != 9) {
                            if (itemUI == 9 || itemUI == 10 || itemUI == 11 || itemUI == 12 || itemUI == 13 || itemUI == 14 || itemUI == 15) {
                                itemX = popupX + 4 + 1 + slotIndex * (itemSize + 2);
                                itemY = popupY + 35 + itemSize * 5 + 1;
                                graphics.setColor(0);
                                graphics.fillRect(itemX, popupY + 35 + itemSize * 5 + 1, itemSize - 1, itemSize - 1);

                                if (indextabTrangbi == 0) {
                                    if (mResources.ITEMNAME[itemUI].length > 1) {
                                        mFont.tahoma_7_grey.drawString(graphics, mResources.ITEMNAME[itemUI][0], itemX + itemSize / 2, itemY + 2, 2);
                                        mFont.tahoma_7_grey.drawString(graphics, mResources.ITEMNAME[itemUI][1], itemX + itemSize / 2, itemY + 2 + 9, 2);
                                    } else {
                                        mFont.tahoma_7_grey.drawString(graphics, mResources.ITEMNAME[itemUI][0], itemX + itemSize / 2, itemY + 2 + 5, 2);
                                    }
                                }

                                ++slotIndex;
                            }
                        } else {
                            graphics.setColor(0);
                            graphics.fillRect(popupX + popupW - itemSize - 4, popupY + 35 + itemUI / 2 * itemSize + 1, itemSize - 1, itemSize - 1);

                            if (indextabTrangbi == 0) {
                                if (mResources.ITEMNAME[itemUI].length > 1) {
                                    mFont.tahoma_7_grey.drawString(graphics, mResources.ITEMNAME[itemUI][0], popupX + popupW - itemSize / 2 - 4, popupY + 36 + itemUI / 2 * itemSize + 2, 2);
                                    mFont.tahoma_7_grey.drawString(graphics, mResources.ITEMNAME[itemUI][1], popupX + popupW - itemSize / 2 - 4, popupY + 36 + itemUI / 2 * itemSize + 2 + 9, 2);
                                } else {
                                    mFont.tahoma_7_grey.drawString(graphics, mResources.ITEMNAME[itemUI][0], popupX + popupW - itemSize / 2 - 4, popupY + 36 + itemUI / 2 * itemSize + 2 + 5, 2);
                                }
                            }
                        }
                    } else {
                        graphics.setColor(0);
                        graphics.fillRect(popupX + 4 + 1, popupY + 35 + itemUI / 2 * itemSize + 1, itemSize - 1, itemSize - 1);

                        if (indextabTrangbi == 0) {
                            if (mResources.ITEMNAME[itemUI].length > 1) {
                                mFont.tahoma_7_grey.drawString(graphics, mResources.ITEMNAME[itemUI][0], popupX + 7 + 11, popupY + 36 + itemUI / 2 * itemSize + 2, 2);
                                mFont.tahoma_7_grey.drawString(graphics, mResources.ITEMNAME[itemUI][1], popupX + 7 + 11, popupY + 36 + itemUI / 2 * itemSize + 2 + 9, 2);
                            } else {
                                mFont.tahoma_7_grey.drawString(graphics, mResources.ITEMNAME[itemUI][0], popupX + 7 + 11, popupY + 36 + itemUI / 2 * itemSize + 2 + 5, 2);
                            }
                        }
                    }
                }

                int effectIndex;
                Item currentItem;

                // Draw equipped items (tab 0)
                if (indextabTrangbi == 0) {
                    for (itemUI = 0; itemUI < 16; ++itemUI) {
                        if ((currentItem = currentCharViewInfo.arrItemBody[itemUI]) != null) {
                            if (currentItem.eff == null) {
                                currentItem.eff = efs[56];
                            }

                            if (currentItem.indexUI != 0 && currentItem.indexUI != 2 && currentItem.indexUI != 4 && currentItem.indexUI != 6 && currentItem.indexUI != 8) {
                                if (currentItem.indexUI != 1 && currentItem.indexUI != 3 && currentItem.indexUI != 5 && currentItem.indexUI != 7 && currentItem.indexUI != 9) {
                                    if (currentItem.indexUI == 10 || currentItem.indexUI == 11 || currentItem.indexUI == 12 || currentItem.indexUI == 13 || currentItem.indexUI == 14 || currentItem.indexUI == 15) {
                                        if (currentItem.indexUI == 10) {
                                            slotIndex = 1;
                                        } else if (currentItem.indexUI == 11) {
                                            slotIndex = 2;
                                        } else if (currentItem.indexUI == 12) {
                                            slotIndex = 3;
                                        } else if (currentItem.indexUI == 13) {
                                            slotIndex = 4;
                                        } else if (currentItem.indexUI == 14) {
                                            slotIndex = 5;
                                        } else if (currentItem.indexUI == 15) {
                                            slotIndex = 6;
                                        }

                                        itemY = popupX + 2 + 1 + slotIndex * (itemSize + 2) - itemSize;
                                        effectIndex = popupY + 35 + itemSize * 5;
                                        this.paintItem(graphics, currentItem, itemY - 2, effectIndex - 1, 0, 1);
                                        showTinhLuyen(graphics, currentItem, itemY + itemSize / 2, effectIndex + 27, false);

                                    }
                                } else {
                                    itemY = popupX + popupW - itemSize - 5;
                                    effectIndex = popupY + 35 + currentItem.indexUI / 2 * itemSize;
                                    this.paintItem(graphics, currentItem, itemY - 1, effectIndex - 1, 0, 1);
                                    showTinhLuyen(graphics, currentItem, itemY + itemSize / 2 - 27, effectIndex + 8, false);

                                }
                            } else {
                                itemY = popupX + 4;
                                effectIndex = popupY + 34 + currentItem.indexUI / 2 * itemSize;
                                this.paintItem(graphics, currentItem, itemY - 1, effectIndex, 0, 1);
                                showTinhLuyen(graphics, currentItem, itemY + itemSize / 2 + 27, effectIndex + 8, false);
                            }

                            if (GameCanvas.gameTick % 4 == 0) {
                                ++currentItem.indexEff;
                                if (currentItem.indexEff >= currentItem.eff.arrEfInfo.length) {
                                    currentItem.indexEff = 0;
                                }
                            }
                        }
                    }
                }

                if (indextabTrangbi > 0) {
                    for (itemUI = 0; itemUI < 16; ++itemUI) {
                        if ((currentItem = currentCharViewInfo.arrItemBody[itemUI + indextabTrangbi]) != null) {
                            itemY = currentItem.indexUI - 16;
                            if (currentItem.eff == null) {
                                currentItem.eff = efs[56];
                            }

                            int xPos;
                            if (itemY != 0 && itemY != 2 && itemY != 4 && itemY != 6 && itemY != 8) {
                                if (itemY != 1 && itemY != 3 && itemY != 5 && itemY != 7 && itemY != 9) {
                                    if (itemY == 10 || itemY == 11 || itemY == 12 || itemY == 13 || itemY == 14 || itemY == 15) {
                                        if (itemY == 10) {
                                            slotIndex = 1;
                                        } else if (itemY == 11) {
                                            slotIndex = 2;
                                        } else if (itemY == 12) {
                                            slotIndex = 3;
                                        } else if (itemY == 13) {
                                            slotIndex = 4;
                                        } else if (itemY == 14) {
                                            slotIndex = 5;
                                        } else if (itemY == 15) {
                                            slotIndex = 6;
                                        }

                                        effectIndex = popupX + 2 + 1 + slotIndex * (itemSize + 2) - itemSize;
                                        xPos = popupY + 35 + itemSize * 5;
                                        this.paintItem(graphics, currentItem, effectIndex - 2, xPos - 1, 0, 1);
                                        showTinhLuyen(graphics, currentItem, effectIndex + itemSize / 2, xPos + 27, false);

                                    }
                                } else {
                                    effectIndex = popupX + popupW - itemSize - 5;
                                    xPos = popupY + 35 + itemY / 2 * itemSize;
                                    this.paintItem(graphics, currentItem, effectIndex - 1, xPos - 1, 0, 1);
                                    showTinhLuyen(graphics, currentItem, effectIndex + itemSize / 2 - 27, xPos + 8, false);

                                }
                            } else {
                                effectIndex = popupX + 4;
                                xPos = popupY + 34 + itemY / 2 * itemSize;
                                this.paintItem(graphics, currentItem, effectIndex - 1, xPos, 0, 1);
                                showTinhLuyen(graphics, currentItem, effectIndex + itemSize / 2 + 27, xPos + 8, false);

                            }

                            // Update item effect animation
                            if (GameCanvas.gameTick % 4 == 0) {
                                ++currentItem.indexEff;
                                if (currentItem.indexEff >= currentItem.eff.arrEfInfo.length) {
                                    currentItem.indexEff = 0;
                                }
                            }
                        }
                    }
                }
                // Draw selection highlight
                for (itemUI = 0; itemUI < 16; ++itemUI) {
                    if (indexTitle == 1 && itemUI == indexSelect) {
                        if (itemUI != 0 && itemUI != 2 && itemUI != 4 && itemUI != 6 && itemUI != 8) {
                            if (itemUI != 1 && itemUI != 3 && itemUI != 5 && itemUI != 7 && itemUI != 9) {
                                if (itemUI == 9 || itemUI == 10 || itemUI == 11 || itemUI == 12 || itemUI == 13 || itemUI == 14 || itemUI == 15) {
                                    if (itemUI == 9) {
                                        slotIndex = 0;
                                    } else if (itemUI == 10) {
                                        slotIndex = 1;
                                    } else if (itemUI == 11) {
                                        slotIndex = 2;
                                    } else if (itemUI == 12) {
                                        slotIndex = 3;
                                    } else if (itemUI == 13) {
                                        slotIndex = 4;
                                    } else if (itemUI == 14) {
                                        slotIndex = 5;
                                    } else if (itemUI == 15) {
                                        slotIndex = 6;
                                    }

                                    itemX = popupX + 2 + 1 + slotIndex * (itemSize + 2) - itemSize;
                                    itemY = popupY + 35 + itemSize * 5;
                                    graphics.setColor(16777215);
                                    graphics.drawRect(itemX - 1, itemY, itemSize, itemSize);
                                    paintSelectHighlight(itemX - 2, itemY - 1, graphics);
                                }
                            } else {
                                graphics.setColor(16777215);
                                graphics.drawRect(popupX + popupW - itemSize - 4 - 1, popupY + 35 + itemUI / 2 * itemSize, itemSize, itemSize);
                                paintSelectHighlight(popupX + popupW - itemSize - 4 - 2, popupY + 35 + itemUI / 2 * itemSize - 1, graphics);
                            }
                        } else {
                            graphics.setColor(16777215);
                            graphics.drawRect(popupX + 4, popupY + 35 + itemUI / 2 * itemSize, itemSize, itemSize);
                            paintSelectHighlight(popupX + 5 - 2, popupY + 35 + itemUI / 2 * itemSize - 1, graphics);
                        }
                    }
                }

                // Draw character preview
                itemUI = GameCanvas.isTouchControlLargeScreen ? -25 : 16;
                Part headPart = parts[currentCharViewInfo.head];
                Part legPart = parts[currentCharViewInfo.leg];
                Part bodyPart = parts[currentCharViewInfo.body];
                Part weaponPart = parts[currentCharViewInfo.wp];

                if (currentCharViewInfo.arrItemBody != null && currentCharViewInfo.arrItemBody[11] != null) {
                    headPart = parts[currentCharViewInfo.arrItemBody[11].template.part];
                }

                if (headPart.pi != null && headPart.pi.length >= 8) {
                    for (itemSize = 0; itemSize < headPart.pi.length; ++itemSize) {
                        if (headPart.pi[itemSize] == null || !SmallImage.isExitsImage(headPart.pi[itemSize].id)) {
                            Char.getMyChar();
                            headPart = Char.getDefaultHead(Char.getMyChar().cgender);
                            break;
                        }
                    }
                } else {
                    Char.getMyChar();
                    headPart = Char.getDefaultHead(Char.getMyChar().cgender);
                }

                itemSize = currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1;
                int[] coatArray = currentCharViewInfo.getClassCoat();

                // Draw weapon bottom layer
                if (currentCharViewInfo.ID_WEA_PONE > -1) {
                    currentCharViewInfo.paintWeaponUIBot(graphics, gW2, gH2 + 14, itemSize);
                }

                // Draw PP bottom layer
                if (currentCharViewInfo.ID_PP > -1) {
                    currentCharViewInfo.paintPPUIBot(graphics, gW2, gH2 + 14, itemSize);
                }

                // Draw coat if available
                if (coatArray != null && currentCharViewInfo.ID_PP == -1) {
                    if (Char.getMyChar().tickCoat == 0) {
                        SmallImage.drawSmallImage(graphics, coatArray[Char.getMyChar().tickCoat], gW2
                                + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][1]
                                + headPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5
                                        ? 0 : 1][0][0]].dx - 2, gH2 + itemUI - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][2]
                                + headPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][0]].dy + 14, 0, 0);
                    } else if (Char.getMyChar().tickCoat == 1) {
                        SmallImage.drawSmallImage(graphics, coatArray[Char.getMyChar().tickCoat], gW2
                                + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][1]
                                + headPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5
                                        ? 0 : 1][0][0]].dx - 9, gH2 + itemUI - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][2]
                                + headPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][0]].dy + 14, 0, 0);
                    } else if (Char.getMyChar().tickCoat == 2) {
                        SmallImage.drawSmallImage(graphics, coatArray[Char.getMyChar().tickCoat], gW2
                                + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][1]
                                + headPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5
                                        ? 0 : 1][0][0]].dx - 12, gH2 + itemUI - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][2]
                                + headPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][0]].dy + 14, 0, 0);
                    } else {
                        SmallImage.drawSmallImage(graphics, coatArray[Char.getMyChar().tickCoat], gW2
                                + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][1]
                                + headPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5
                                        ? 0 : 1][0][0]].dx - 9, gH2 + itemUI - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][2]
                                + headPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][0]].dy + 14, 0, 0);
                    }
                }

                // Draw clan effect
                currentCharViewInfo.paintClanEffect(graphics, gW2 + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][1]
                        + bodyPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][0]].dx + 18, gH2
                        + itemUI - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][2]
                        + legPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][0]].dy + 14);

                // Draw weapon if no special weapon
                if (currentCharViewInfo.ID_WEA_PONE == -1) {
                    SmallImage.drawSmallImage(graphics, weaponPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][3][0]].id, gW2
                            + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][3][1]
                            + weaponPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][3][0]].dx, gH2
                            + itemUI - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][3][2]
                            + weaponPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][3][0]].dy, 0, 0);
                }

                // Draw leg part
                if (currentCharViewInfo.ID_LEG > -1) {
                    currentCharViewInfo.paintLegUI(graphics, gW2, gH2 + 14, itemSize);
                } else {
                    SmallImage.drawSmallImage(graphics, legPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][0]].id, gW2
                            + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][1]
                            + legPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][0]].dx, gH2
                            + itemUI - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][2]
                            + legPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][0]].dy, 0, 0);
                }

                // Draw body part
                if (currentCharViewInfo.ID_Body > -1) {
                    currentCharViewInfo.paintBodyUI(graphics, gW2, gH2 + 14, itemSize);
                } else {
                    SmallImage.drawSmallImage(graphics, bodyPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][0]].id, gW2
                            + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][1]
                            + bodyPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][0]].dx, gH2
                            + itemUI - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][2]
                            + bodyPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][0]].dy, 0, 0);
                }

                // Draw head part
                if (currentCharViewInfo.ID_HAIR > -1) {
                    currentCharViewInfo.paintHeadUI(graphics, gW2, gH2 + 14, itemSize);
                } else {
                    SmallImage.drawSmallImage(graphics, headPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][0]].id, gW2
                            + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][1]
                            + headPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][0]].dx, gH2
                            + itemUI - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][2]
                            + headPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][0][0]].dy, 0, 0);
                }

                // Draw mask if available
                if (currentCharViewInfo.ID_MAT_NA > -1) {
                    currentCharViewInfo.paintMatNaUI(graphics, gW2, gH2 + 14, itemSize);
                }

                // Draw additional clan effects
                currentCharViewInfo.paintClanEffect(graphics, gW2 + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][1]
                        + bodyPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][0]].dx + 5, gH2
                        + itemUI - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][2]
                        + legPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][0]].dy + 14);
                currentCharViewInfo.paintClanEffect2(graphics, gW2 + Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][1]
                        + bodyPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][2][0]].dx + 22, gH2
                        + itemUI - Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][2]
                        + legPart.pi[Char.CharInfo[currentCharViewInfo.cp1 % 15 < 5 ? 0 : 1][1][0]].dy + 14);

                // Draw PP top layer
                if (currentCharViewInfo.ID_PP > -1) {
                    currentCharViewInfo.paintPPUITop(graphics, gW2, gH2 + 14, itemSize);
                }

                // Draw weapon top layer
                if (currentCharViewInfo.ID_WEA_PONE > -1) {
                    currentCharViewInfo.paintWeaponUITop(graphics, gW2, gH2 + 14, itemSize);
                }

                if (GameScr.indexMenu == 4 && !GameCanvas.menu.showMenu && this.cmdTrangbi2 != null && GameCanvas.isTouch) {
                    if (!this.cmdTrangbi2.isFocus) {
                        graphics.drawImage(imgLbtn, this.cmdTrangbi2.x, this.cmdTrangbi2.y, 0);
                    } else {
                        graphics.drawImage(imgLbtnFocus, this.cmdTrangbi2.x, this.cmdTrangbi2.y, 0);
                    }

                    mFont.tahoma_7b_white.drawString(graphics, this.cmdTrangbi2.caption, this.cmdTrangbi2.x + 36, this.cmdTrangbi2.y + 6, 2);
                }
            }
        }
    }

    private void paintThuCuoi(mGraphics var1) {
        if (indexMenu == 5) {
            var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
            Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
            var1.setColor(Paint.COLORBACKGROUND);
            paintTitle(var1, mResources.MENUME[indexMenu], true);
            resetTranslate(var1);
            var1.setColor(0);
            var1.fillRect(popupX + 2, popupY + 31, 171, popupH - 34);
            var1.setColor(13606712);
            var1.drawRect(popupX + 3, popupY + 32, 168, popupH - 37);
            var1.setColor(Paint.COLORBACKGROUND);
            var1.fillRect(popupX + 4, popupY + 34, 166, popupH - 39);
            int var2;
            int var3;
            if (currentCharViewInfo.arrItemMounts[4] != null) {
                mFont.tahoma_7b_white.drawString(var1, currentCharViewInfo.arrItemMounts[4].template.name, popupX + 90, ystart + 2, 2);
                var2 = currentCharViewInfo.arrItemMounts[4].sys + 1;

                for (var3 = 0; var3 < var2; ++var3) {
                    SmallImage.drawSmallImage(var1, 628, popupX + 90 + var3 * 12 - var2 * 6, ystart + 20, 0, 3);

                }
            } else {
                mFont.tahoma_7b_white.drawString(var1, mResources.MON_NAME, popupX + 90, ystart + 2, 2);
            }

            for (var2 = 0; var2 < currentCharViewInfo.arrItemMounts.length - 1; ++var2) {
                if (currentCharViewInfo.arrItemMounts[var2] != null) {
                    this.paintItem(var1, currentCharViewInfo.arrItemMounts[var2], this.xMounts[var2], this.yMounts[var2]);
                    if (var2 == 1 || var2 == 3) {
                        GameScr.showTinhLuyen(var1, GameScr.currentCharViewInfo.arrItemMounts[var2], this.xMounts[var2] + 15, this.yMounts[var2] + 28, false);
                    } else if (var2 == 0 || var2 == 2) {
                        GameScr.showTinhLuyen(var1, GameScr.currentCharViewInfo.arrItemMounts[var2], this.xMounts[var2] + 15, this.yMounts[var2] - 11, false);
                    }
                } else {
                    var1.setColor(6425);
                    var1.fillRect(this.xMounts[var2] - 1, this.yMounts[var2] - 1, indexSize + 3, indexSize + 3);
                    if (var2 == 0) {
                        if (currentCharViewInfo.isHaveMoto()) {
                            mFont.tahoma_7_grey.drawString(var1, mResources.ITEMNAME[22][0], this.xMounts[var2] + indexSize / 2, this.yMounts[var2] + indexSize / 2 - 10, 2);
                            mFont.tahoma_7_grey.drawString(var1, mResources.ITEMNAME[22][1], this.xMounts[var2] + indexSize / 2, this.yMounts[var2] + indexSize / 2 + 2, 2);
                        } else {
                            mFont.tahoma_7_grey.drawString(var1, mResources.ITEMNAME[19][0], this.xMounts[var2] + indexSize / 2, this.yMounts[var2] + indexSize / 2 - 10, 2);
                            mFont.tahoma_7_grey.drawString(var1, mResources.ITEMNAME[19][1], this.xMounts[var2] + indexSize / 2, this.yMounts[var2] + indexSize / 2 + 2, 2);
                        }
                    } else if (var2 == 1) {
                        if (currentCharViewInfo.isHaveMoto()) {
                            mFont.tahoma_7_grey.drawString(var1, mResources.ITEMNAME[20][0], this.xMounts[var2] + indexSize / 2, this.yMounts[var2] + indexSize / 2 - 10, 2);
                            mFont.tahoma_7_grey.drawString(var1, mResources.ITEMNAME[20][1], this.xMounts[var2] + indexSize / 2, this.yMounts[var2] + indexSize / 2 + 2, 2);
                        } else {
                            mFont.tahoma_7_grey.drawString(var1, mResources.ITEMNAME[16][0], this.xMounts[var2] + indexSize / 2, this.yMounts[var2] + indexSize / 2 - 10, 2);
                            mFont.tahoma_7_grey.drawString(var1, mResources.ITEMNAME[16][1], this.xMounts[var2] + indexSize / 2, this.yMounts[var2] + indexSize / 2 + 2, 2);
                        }
                    } else if (var2 == 2) {
                        if (currentCharViewInfo.isHaveMoto()) {
                            mFont.tahoma_7_grey.drawString(var1, mResources.ITEMNAME[21][0], this.xMounts[var2] + indexSize / 2, this.yMounts[var2] + indexSize / 2 - 10, 2);
                            mFont.tahoma_7_grey.drawString(var1, mResources.ITEMNAME[21][1], this.xMounts[var2] + indexSize / 2, this.yMounts[var2] + indexSize / 2 + 2, 2);
                        } else {
                            mFont.tahoma_7_grey.drawString(var1, mResources.ITEMNAME[17][0], this.xMounts[var2] + indexSize / 2, this.yMounts[var2] + indexSize / 2 - 10, 2);
                            mFont.tahoma_7_grey.drawString(var1, mResources.ITEMNAME[17][1], this.xMounts[var2] + indexSize / 2, this.yMounts[var2] + indexSize / 2 + 2, 2);
                        }
                    } else if (var2 == 3) {
                        if (currentCharViewInfo.isHaveMoto()) {
                            mFont.tahoma_7_grey.drawString(var1, mResources.ITEMNAME[23][0], this.xMounts[var2] + indexSize / 2, this.yMounts[var2] + indexSize / 2 - 10, 2);
                            mFont.tahoma_7_grey.drawString(var1, mResources.ITEMNAME[23][1], this.xMounts[var2] + indexSize / 2, this.yMounts[var2] + indexSize / 2 + 2, 2);
                        } else {
                            mFont.tahoma_7_grey.drawString(var1, mResources.ITEMNAME[18][0], this.xMounts[var2] + indexSize / 2, this.yMounts[var2] + indexSize / 2 - 10, 2);
                            mFont.tahoma_7_grey.drawString(var1, mResources.ITEMNAME[18][1], this.xMounts[var2] + indexSize / 2, this.yMounts[var2] + indexSize / 2 + 2, 2);
                        }
                    }
                }

                if (indexSelect == var2 && indexTitle == 1 && indexSelect < 4) {
                    var1.setColor(16777215);
                } else {
                    var1.setColor(12281361);
                }

                var1.drawRect(this.xMounts[var2], this.yMounts[var2], indexSize, indexSize);
            }

            var2 = this.xMounts[0] + indexSize + 7;
            var3 = this.yMounts[0] - 5;
            var1.setColor(6425);
            var1.fillRect(var2, var3, 84, 75);
            if (indexSelect == 4) {
                var1.setColor(16777215);
            } else {
                var1.setColor(12281361);
            }

            var1.drawRect(var2, var3, 84, 75);
            int var9 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            if (currentCharViewInfo.ID_HORSE > -1) {
                currentCharViewInfo.paintHorseUI(var1, var2 + 35, var3 + 55);
            }

            int var11;
            if (currentCharViewInfo.arrItemMounts[4] != null) {
                if (currentCharViewInfo.isHaveNewMount()) {
                    int[][] var8 = (int[][]) CharPartInfo.newMount.get(String.valueOf(currentCharViewInfo.arrItemMounts[4].template.id));
                    if (GameCanvas.gameTick % 20 > 15) {
                        SmallImage.drawSmallImage(var1, var8[0][0], var2 + 45 - 10, var3 + 35, 0, 3);
                    } else {
                        SmallImage.drawSmallImage(var1, var8[0][1], var2 + 45 - 10, var3 + 35, 0, 3);
                    }
                } else if (currentCharViewInfo.isHaveMoto()) {
                    if (currentCharViewInfo.arrItemMounts[4].template.id == 485) {
                        if (currentCharViewInfo.arrItemMounts[4].sys < 2) {
                            SmallImage.drawSmallImage(var1, 1800, var2 + 45, var3 + 35, 0, 3);
                        } else {
                            SmallImage.drawSmallImage(var1, 2063, var2 + 45, var3 + 35, 0, 3);
                        }
                    } else if (currentCharViewInfo.arrItemMounts[4].template.id == 524) {
                        if (currentCharViewInfo.arrItemMounts[4].sys < 2) {
                            SmallImage.drawSmallImage(var1, 2067, var2 + 45, var3 + 35, 0, 3);
                        } else {
                            SmallImage.drawSmallImage(var1, 2071, var2 + 45, var3 + 35, 0, 3);
                        }
                    }
                } else if (currentCharViewInfo.isHaveWolf()) {
                    if (currentCharViewInfo.arrItemMounts[4].template.id == 443) {
                        if (currentCharViewInfo.arrItemMounts[4].sys < 2) {
                            if (GameCanvas.gameTick % 20 > 15) {
                                SmallImage.drawSmallImage(var1, 1801, var2 + 45, var3 + 35, 0, 3);
                            } else {
                                SmallImage.drawSmallImage(var1, 1802, var2 + 45, var3 + 35, 0, 3);
                            }
                        } else if (GameCanvas.gameTick % 20 > 15) {
                            SmallImage.drawSmallImage(var1, 2080, var2 + 45, var3 + 35, 0, 3);
                        } else {
                            SmallImage.drawSmallImage(var1, 2081, var2 + 45, var3 + 35, 0, 3);
                        }
                    } else if (currentCharViewInfo.arrItemMounts[4].template.id == 523) {
                        if (GameCanvas.gameTick % 20 > 15) {
                            SmallImage.drawSmallImage(var1, 2062, var2 + 45, var3 + 35, 0, 3);
                        } else {
                            SmallImage.drawSmallImage(var1, 2061, var2 + 45, var3 + 35, 0, 3);
                        }
                    }
                }
                GameScr.showTinhLuyen(var1, GameScr.currentCharViewInfo.arrItemMounts[4], var2 + 42, var3 + 60, true);
                if (currentCharViewInfo.arrItemMounts[4].options != null) {
                    for (var11 = 0; var11 < currentCharViewInfo.arrItemMounts[4].options.size(); ++var11) {
                        ItemOption var10;
                        if ((var10 = (ItemOption) currentCharViewInfo.arrItemMounts[4].options.elementAt(var11)).optionTemplate.id == 65) {
                            var9 = var10.param;
                        } else if (var10.optionTemplate.id == 66) {
                            var4 = var10.param;
                        }
                    }
                }

                var5 = var9 * 85 / 1000;
                var6 = var4 * 85 / 1000;
                var7 = currentCharViewInfo.arrItemMounts[4].upgrade + 1;
            }

            var11 = xstart + 5;
            var2 = ystart + 112;
            mFont.tahoma_7b_white.drawString(var1, mResources.Level + ": ", var11, var2, 0);
            mFont.tahoma_7b_white.drawString(var1, String.valueOf(var7), var11 + 70, var2, 0);
            mFont var10000;
            String var10002;
            if (currentCharViewInfo.isHaveMoto()) {
                var10000 = mFont.tahoma_7b_white;
                var10002 = mResources.MACHINE + ": ";
                var2 += 15;
                var10000.drawString(var1, var10002, var11, var2, 0);
            } else {
                var10000 = mFont.tahoma_7b_white;
                var10002 = mResources.EXP + ": ";
                var2 += 15;
                var10000.drawString(var1, var10002, var11, var2, 0);
            }

            var1.setColor(6425);
            var1.fillRect(var11 + 70, var2, 85, 14);
            var1.setColor(371981);
            var1.fillRect(var11 + 70, var2, var5, 14);
            var1.setColor(5131338);
            var1.drawRect(var11 + 70, var2, 85, 14);
            mFont.tahoma_7_white.drawString(var1, var9 + "/" + 1000, var11 + 113, var2 + 2, 2);
            if (currentCharViewInfo.isHaveMoto()) {
                var10000 = mFont.tahoma_7b_white;
                var10002 = mResources.POWER + ": ";
                var2 += 17;
                var10000.drawString(var1, var10002, var11, var2, 0);
            } else {
                var10000 = mFont.tahoma_7b_white;
                var10002 = mResources.VITALITY + ": ";
                var2 += 17;
                var10000.drawString(var1, var10002, var11, var2, 0);
            }

            var1.setColor(6425);
            var1.fillRect(var11 + 70, var2, 85, 14);
            var1.setColor(16711680);
            var1.fillRect(var11 + 70, var2, var6, 14);
            var1.setColor(5131338);
            var1.drawRect(var11 + 70, var2, 85, 14);
            mFont.tahoma_7_white.drawString(var1, var4 + "/" + 1000, var11 + 113, var2 + 2, 2);
        }
    }

    private void paintClanInfo(mGraphics var1) {
        if (isPaintClan) {
            resetTranslate(var1);
            Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
            paintTitle(var1, mResources.CLAN[indexMenu], true);
            if (indexMenu == 0) {
                if (Char.clan != null && Char.clan.name != null && !Char.clan.name.equals("")) {
                    int[] var6 = new int[]{1692, 1693, 1694, 1695, 1696};

                    for (int var4 = 0; var4 < var6.length; ++var4) {
                        var1.setColor(6425);
                        var1.fillRect(popupX + var4 * indexSize + 18, popupY + 32, indexSize - 2, indexSize - 2);
                        if (indexTitle == 1 && var4 == indexSelect) {
                            var1.setColor(16777215);
                        } else {
                            var1.setColor(12281361);
                        }

                        var1.drawRect(popupX + var4 * indexSize + 18, popupY + 32, indexSize - 2, indexSize - 2);
                        if (var4 > Char.clan.itemLevel - 1) {
                            SmallImage.drawSmallImage(var1, 1697, popupX + var4 * indexSize + 18 + indexSize / 2, popupY + 32 + indexSize / 2, 0, 3);
                        } else {
                            SmallImage.drawSmallImage(var1, var6[var4], popupX + var4 * indexSize + 18 + indexSize / 2, popupY + 32 + indexSize / 2, 0, 3);
                        }
                    }

                    if (indexTitle == 2) {
                        var1.setColor(Paint.COLORDARK);
                        var1.fillRect(popupX + 7, popupY + 60, popupW - 14, popupH - 68);
                        var1.setColor(16777215);
                    } else {
                        var1.setColor(10249521);
                    }

                    var1.drawRect(popupX + 7, popupY + 60, popupW - 14, popupH - 68);
                    xstart = popupX + 17;
                    ystart = popupY + 62;
                    indexRowMax = 12;
                    scrMain.setStyle(indexRowMax, 12, popupX, popupY + 62, popupW, popupH - 72, true, 1);
                    scrMain.setClip(var1);
                    mFont.tahoma_7b_yellow.drawString(var1, mResources.CLANINFO[0] + Char.clan.name, xstart, ystart, 0);
                    mFont.tahoma_7_blue1.drawString(var1, mResources.CLANINFO[1] + Char.clan.main_name, xstart, ystart += 12, 0);
                    mFont.tahoma_7_white.drawString(var1, mResources.CLANINFO[2] + Char.clan.total + "/" + (Char.clan.level * 5 + 45), xstart, ystart += 12, 0);
                    mFont.tahoma_7_white.drawString(var1, mResources.CLANINFO[3] + Char.clan.level, xstart, ystart += 12, 0);
                    mFont.tahoma_7_white.drawString(var1, mResources.CLANINFO[4] + Char.clan.exp + "/" + Char.clan.expNext, xstart, ystart += 12, 0);
                    mFont.tahoma_7_white.drawString(var1, mResources.CLANINFO[5] + NinjaUtil.numberToString(String.valueOf(Char.clan.coin)) + " " + mResources.XU, xstart, ystart += 12, 0);
                    mFont.tahoma_7_white.drawString(var1, mResources.CLANINFO[8] + NinjaUtil.numberToString(String.valueOf(Char.clan.freeCoin)) + " " + mResources.XU, xstart, ystart += 12, 0);
                    mFont.tahoma_7_white.drawString(var1, mResources.CLANINFO[9] + NinjaUtil.numberToString(String.valueOf(Char.clan.coinUp)) + " " + mResources.XU, xstart, ystart += 12, 0);
                    if (mFont.tahoma_7_white.getWidth(mResources.CLANINFO[10] + Char.clan.openDun + " " + mResources.COUNT) > inforW - 10) {
                        this.paintMultiLine(var1, mFont.tahoma_7_white, mResources.CLANINFO[10] + Char.clan.openDun + " " + mResources.COUNT, xstart, ystart += 12, 0, popupW - 20);
                    } else {
                        mFont.tahoma_7_white.drawString(var1, mResources.CLANINFO[10] + Char.clan.openDun + " " + mResources.COUNT, xstart, ystart += 12, 0);
                    }

                    if (mFont.tahoma_7_white.getWidth(mResources.CLANINFO[12] + Char.clan.use_card + " " + mResources.COUNT) > inforW - 10) {
                        this.paintMultiLine(var1, mFont.tahoma_7_white, mResources.CLANINFO[12] + Char.clan.use_card + " " + mResources.COUNT, xstart, ystart += 12, 0, popupW - 20);
                    } else {
                        mFont.tahoma_7_white.drawString(var1, mResources.CLANINFO[12] + Char.clan.use_card + " " + mResources.COUNT, xstart, ystart += 12, 0);
                    }

                    mFont.tahoma_7_white.drawString(var1, mResources.CLANINFO[6] + Char.clan.reg_date, xstart, ystart += 12, 0);
                    if (this.arrClanInfo == null) {
                        this.arrClanInfo = splitMultiLine(mFont.tahoma_7_yellow, Char.clan.alert);
                    }

                    this.paintMultiLine(var1, mFont.tahoma_7_yellow, (String[]) this.arrClanInfo, xstart, ystart += 12, 0);
                    if (indexTitle == 2 && indexRow >= 0) {
                        SmallImage.drawSmallImage(var1, 942, xstart - 8, popupY + 62 + 2 + indexRow * 12, 0, StaticObj.TOP_LEFT);
                    }

                    scrMain.setStyle(indexRowMax, 12, popupX, popupY + 62, popupW, popupH - 72, true, 1);
                } else {
                    indexRowMax = 1;
                    mFont.tahoma_7_white.drawString(var1, mResources.EMPTY_INFO, popupX + popupW / 2, popupY + 40, 2);
                }
            } else if (indexMenu == 1) {
                xstart = popupX + 5;
                ystart = popupY + 32;
                if (vClan.size() == 0) {
                    mFont.tahoma_7_white.drawString(var1, mResources.EMPTY_INFO, popupX + popupW / 2, popupY + 40, 2);
                } else {
                    var1.setColor(6425);
                    var1.fillRect(xstart - 2, ystart - 2, popupW - 6, indexSize * 5 + 8);
                    resetTranslate(var1);
                    scrMain.setClip(var1, xstart, ystart, popupW - 3, indexSize * 5 + 6);
                    this.indexMember = 0;

                    for (int var5 = 0; var5 < vClan.size(); ++var5) {
                        Member var3 = (Member) vClan.elementAt(var5);
                        if (!isViewClanMemOnline || var3.isOnline) {
                            if (var5 * (indexSize + indexSize / 2) >= scrMain.cmy - (indexSize + indexSize / 2) && var5 * (indexSize + indexSize / 2) < scrMain.cmy + indexSize * 5 + 8) {
                                if (indexRow == this.indexMember) {
                                    var1.setColor(Paint.COLORLIGHT);
                                    var1.fillRect(xstart + 2, ystart + indexRow * (indexSize + indexSize / 2) + 2, popupW - 15, indexSize + indexSize / 2 - 4);
                                    var1.setColor(16777215);
                                    var1.drawRect(xstart + 2, ystart + indexRow * (indexSize + indexSize / 2) + 2, popupW - 15, indexSize + indexSize / 2 - 4);
                                } else {
                                    var1.setColor(Paint.COLORBACKGROUND);
                                    var1.fillRect(xstart + 2, ystart + this.indexMember * (indexSize + indexSize / 2) + 2, popupW - 15, indexSize + indexSize / 2 - 4);
                                    var1.setColor(13932896);
                                    var1.drawRect(xstart + 2, ystart + this.indexMember * (indexSize + indexSize / 2) + 2, popupW - 15, indexSize + indexSize / 2 - 4);
                                }

                                SmallImage.drawSmallImage(var1, var3.iconId, xstart + 12, ystart + this.indexMember * (indexSize + indexSize / 2) + 13, 0, 3);
                                if (var3.type == 4) {
                                    SmallImage.drawSmallImage(var1, 1216, xstart + 12, ystart + this.indexMember * (indexSize + indexSize / 2) + 30, 0, 3);
                                    if (var3.isOnline) {
                                        mFont.tahoma_7_yellow.drawString(var1, mResources.CLANS_STANDFOR[0] + " ", xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 5, 0, mFont.tahoma_7_grey);
                                        mFont.tahoma_7_white.drawString(var1, var3.name + " - " + mResources.level + ": " + var3.level, xstart + 45, ystart + this.indexMember * (indexSize + indexSize / 2) + 5, 0);
                                        mFont.tahoma_7_green.drawString(var1, mResources.CLANINFO[7] + var3.pointClan, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 16, 0);
                                        mFont.tahoma_7_blue1.drawString(var1, mResources.CLANINFO[11] + var3.pointClanWeek, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 26, 0);
                                    } else {
                                        mFont.tahoma_7_grey.drawString(var1, mResources.CLANS_STANDFOR[0] + " ", xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 5, 0);
                                        mFont.tahoma_7_grey.drawString(var1, var3.name + " - " + mResources.level + ": " + var3.level, xstart + 45, ystart + this.indexMember * (indexSize + indexSize / 2) + 5, 0);
                                        mFont.tahoma_7_grey.drawString(var1, mResources.CLANINFO[7] + var3.pointClan, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 16, 0);
                                        mFont.tahoma_7_grey.drawString(var1, mResources.CLANINFO[11] + var3.pointClanWeek, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 26, 0);
                                    }
                                } else if (var3.type == 3) {
                                    SmallImage.drawSmallImage(var1, 1215, xstart + 12, ystart + this.indexMember * (indexSize + indexSize / 2) + 30, 0, 3);
                                    if (var3.isOnline) {
                                        mFont.tahoma_7_yellow.drawString(var1, mResources.CLANS_STANDFOR[1] + " ", xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 5, 0, mFont.tahoma_7_grey);
                                        mFont.tahoma_7_white.drawString(var1, var3.name + " - " + mResources.level + ": " + var3.level, xstart + 45, ystart + this.indexMember * (indexSize + indexSize / 2) + 5, 0);
                                        mFont.tahoma_7_green.drawString(var1, mResources.CLANINFO[7] + var3.pointClan, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 16, 0);
                                        mFont.tahoma_7_blue1.drawString(var1, mResources.CLANINFO[11] + var3.pointClanWeek, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 26, 0);
                                    } else {
                                        mFont.tahoma_7_grey.drawString(var1, mResources.CLANS_STANDFOR[1] + " ", xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 5, 0);
                                        mFont.tahoma_7_grey.drawString(var1, var3.name + " - " + mResources.level + ": " + var3.level, xstart + 45, ystart + this.indexMember * (indexSize + indexSize / 2) + 5, 0);
                                        mFont.tahoma_7_grey.drawString(var1, mResources.CLANINFO[7] + var3.pointClan, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 16, 0);
                                        mFont.tahoma_7_grey.drawString(var1, mResources.CLANINFO[11] + var3.pointClanWeek, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 26, 0);
                                    }
                                } else if (var3.type == 2) {
                                    SmallImage.drawSmallImage(var1, 1217, xstart + 12, ystart + this.indexMember * (indexSize + indexSize / 2) + 30, 0, 3);
                                    if (var3.isOnline) {
                                        mFont.tahoma_7_yellow.drawString(var1, mResources.CLANS_STANDFOR[2] + " ", xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 5, 0, mFont.tahoma_7_grey);
                                        mFont.tahoma_7_white.drawString(var1, var3.name + " - " + mResources.level + ": " + var3.level, xstart + 45, ystart + this.indexMember * (indexSize + indexSize / 2) + 5, 0);
                                        mFont.tahoma_7_green.drawString(var1, mResources.CLANINFO[7] + var3.pointClan, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 16, 0);
                                        mFont.tahoma_7_blue1.drawString(var1, mResources.CLANINFO[11] + var3.pointClanWeek, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 26, 0);
                                    } else {
                                        mFont.tahoma_7_grey.drawString(var1, mResources.CLANS_STANDFOR[2] + " ", xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 5, 0);
                                        mFont.tahoma_7_grey.drawString(var1, var3.name + " - " + mResources.level + ": " + var3.level, xstart + 45, ystart + this.indexMember * (indexSize + indexSize / 2) + 5, 0);
                                        mFont.tahoma_7_grey.drawString(var1, mResources.CLANINFO[7] + var3.pointClan, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 16, 0);
                                        mFont.tahoma_7_grey.drawString(var1, mResources.CLANINFO[11] + var3.pointClanWeek, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 26, 0);
                                    }
                                } else if (var3.type == 1) {
                                    SmallImage.drawSmallImage(var1, 1214, xstart + 12, ystart + this.indexMember * (indexSize + indexSize / 2) + 30, 0, 3);
                                    if (var3.isOnline) {
                                        mFont.tahoma_7_yellow.drawString(var1, mResources.CLANS_STANDFOR[3] + " ", xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 5, 0, mFont.tahoma_7_grey);
                                        mFont.tahoma_7_white.drawString(var1, var3.name + " - " + mResources.level + ": " + var3.level, xstart + 45, ystart + this.indexMember * (indexSize + indexSize / 2) + 5, 0);
                                        mFont.tahoma_7_green.drawString(var1, mResources.CLANINFO[7] + var3.pointClan, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 16, 0);
                                        mFont.tahoma_7_blue1.drawString(var1, mResources.CLANINFO[11] + var3.pointClanWeek, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 26, 0);
                                    } else {
                                        mFont.tahoma_7_grey.drawString(var1, mResources.CLANS_STANDFOR[3] + " ", xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 5, 0);
                                        mFont.tahoma_7_grey.drawString(var1, var3.name + " - " + mResources.level + ": " + var3.level, xstart + 45, ystart + this.indexMember * (indexSize + indexSize / 2) + 5, 0);
                                        mFont.tahoma_7_grey.drawString(var1, mResources.CLANINFO[7] + var3.pointClan, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 16, 0);
                                        mFont.tahoma_7_grey.drawString(var1, mResources.CLANINFO[11] + var3.pointClanWeek, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 26, 0);
                                    }
                                } else if (var3.isOnline) {
                                    mFont.tahoma_7_white.drawString(var1, var3.name + " - " + mResources.level + ": " + var3.level, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 5, 0);
                                    mFont.tahoma_7_green.drawString(var1, mResources.CLANINFO[7] + var3.pointClan, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 16, 0);
                                    mFont.tahoma_7_blue1.drawString(var1, mResources.CLANINFO[11] + var3.pointClanWeek, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 26, 0);
                                } else {
                                    mFont.tahoma_7_grey.drawString(var1, var3.name + " - " + mResources.level + ": " + var3.level, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 5, 0);
                                    mFont.tahoma_7_grey.drawString(var1, mResources.CLANINFO[7] + var3.pointClan, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 16, 0);
                                    mFont.tahoma_7_grey.drawString(var1, mResources.CLANINFO[11] + var3.pointClanWeek, xstart + 22, ystart + this.indexMember * (indexSize + indexSize / 2) + 26, 0);
                                }
                            }

                            ++this.indexMember;
                        }
                    }

                    scrMain.setStyle(this.indexMember, indexSize + indexSize / 2, xstart, ystart, popupW - 3, indexSize * 5 + 4, true, 1);
                    indexRowMax = this.indexMember;
                    paintNumCount(var1);
                }
            } else if (indexMenu != 2) {
                if (indexMenu == 3) {
                    if (Char.clan != null && Char.clan.name != null && !Char.clan.name.equals("") && !Char.clan.log.equals("")) {
                        indexRowMax = 1;
                        xstart = popupX + 17;
                        ystart = popupY + 34;
                        inforW = popupW - 30;
                        scrMain.setClip(var1);
                        if (this.arrClanDongGop == null) {
                            this.arrClanDongGop = splitMultiLine(mFont.tahoma_7_white, Char.clan.log);
                        }

                        this.paintMultiLine(var1, mFont.tahoma_7_white, (String[]) this.arrClanDongGop, xstart, ystart, 0);
                        if (indexTitle == 1 && indexRow >= 0) {
                            SmallImage.drawSmallImage(var1, 942, xstart - 8, popupY + 34 + 2 + indexRow * 12, 0, StaticObj.TOP_LEFT);
                        }

                        scrMain.setStyle(indexRowMax, 12, popupX, popupY + 35, popupW, popupH - 44, true, 1);
                    } else {
                        indexRowMax = 1;
                        mFont.tahoma_7_white.drawString(var1, mResources.EMPTY_INFO, popupX + popupW / 2, popupY + 40, 2);
                    }
                } else {
                    if (indexMenu == 4) {
                        this.paintThanThu_Clan(var1);
                    }

                }
            } else {
                xstart = popupX + 3;
                ystart = popupY + 32;
                var1.setColor(6425);
                var1.fillRect(xstart - 1, ystart - 1, columns * indexSize + 3, 5 * indexSize + 3);
                Item[] var2 = null;
                if (Char.clan != null && Char.clan.items != null) {
                    var2 = Char.clan.items;
                } else {
                    var2 = new Item[30];
                }

                this.paintBagItem(var1, var2);
            }
        }
    }

    private static void paintNumCount(mGraphics var0) {
        resetTranslate(var0);
        int var1 = indexRow;
        if (isPaintAuctionBuy) {
            var1 = indexSelect;
        }

        if (var1 >= 0 && indexRowMax > 0) {
            var1 = var1 + 1 < indexRowMax ? var1 + 1 : indexRowMax;
            mFont.tahoma_7_yellow.drawString(var0, var1 + "/" + indexRowMax, popupX + popupW / 2, popupY + popupH - 12, 2, mFont.tahoma_7_grey);
        }

    }

    private void updateKeyUIInforMe() {
        if (isPaintInfoMe && indexMenu != -1 && GameCanvas.currentDialog == null) {
            int var1;
            if (indexTitle == 0) {
                super.left = super.center = null;
                if (indexMenu == 0) {
                    super.left = new Command(mResources.SORT, 110221);
                }

                if (GameCanvas.keyPressedz[8]) {
                    indexTitle = 1;
                    indexSelect = 0;
                    indexRow = 0;
                    scrMain.clear();
                    scrInfo.clear();
                }

                if (GameCanvas.keyPressedz[4]) {
                    indexSelect = 0;
                    indexRow = -1;
                    --indexMenu;
                    scrMain.clear();
                    scrInfo.clear();
                    if (currentCharViewInfo.charID != Char.getMyChar().charID) {
                        if (indexMenu < 3) {
                            indexMenu = 5;
                        }
                    } else if (indexMenu < 0) {
                        indexMenu = mResources.MENUME.length - 1;
                    }

                    this.doMiniMenuInforMe();
                }

                if (GameCanvas.keyPressedz[6]) {
                    indexSelect = 0;
                    indexRow = -1;
                    ++indexMenu;
                    scrMain.clear();
                    scrInfo.clear();
                    if (currentCharViewInfo.charID != Char.getMyChar().charID) {
                        if (indexMenu > 5) {
                            indexMenu = 3;
                        }
                    } else if (indexMenu > mResources.MENUME.length - 1) {
                        indexMenu = 0;
                    }

                    this.doMiniMenuInforMe();
                }

                this.setLCR();
            } else if (isPaintItemInfo) {
                if (GameCanvas.keyPressedz[2]) {
                    if (--indexRow < 0) {
                        indexRow = indexRowMax - 1;
                    }

                    scrInfo.moveTo(indexRow * scrInfo.ITEM_SIZE);
                } else if (GameCanvas.keyPressedz[8]) {
                    if (++indexRow >= indexRowMax) {
                        indexRow = 0;
                    }

                    scrInfo.moveTo(indexRow * scrInfo.ITEM_SIZE);
                }
            } else if (indexMenu == 0) {
                if (GameCanvas.keyPressedz[4]) {
                    if (--indexSelect < 0) {
                        indexSelect = Char.getMyChar().arrItemBag.length - 1;
                    }

                    super.left = super.center = null;
                    this.setLCR();
                    scrMain.moveTo(indexSelect / columns * scrMain.ITEM_SIZE);
                } else if (GameCanvas.keyPressedz[6]) {
                    if (++indexSelect >= Char.getMyChar().arrItemBag.length) {
                        indexSelect = 0;
                    }

                    super.left = super.center = null;
                    this.setLCR();
                    scrMain.moveTo(indexSelect / columns * scrMain.ITEM_SIZE);
                } else if (GameCanvas.keyPressedz[8]) {
                    if (indexSelect + columns <= Char.getMyChar().arrItemBag.length - 1) {
                        indexSelect += columns;
                    }

                    super.left = super.center = null;
                    this.setLCR();
                    scrMain.moveTo(indexSelect / columns * scrMain.ITEM_SIZE);
                } else if (GameCanvas.keyPressedz[2]) {
                    if (indexSelect >= 0 && indexSelect < columns) {
                        indexTitle = 0;
                        indexSelect = 0;
                    } else if (indexSelect - columns >= 0) {
                        indexSelect -= columns;
                    }

                    super.left = super.center = null;
                    this.setLCR();
                    scrMain.moveTo(indexSelect / columns * scrMain.ITEM_SIZE);
                }
            } else if (indexMenu == 1) {
                if (GameCanvas.keyPressedz[2]) {
                    if (indexTitle == 1 && indexRow == -1) {
                        --indexTitle;
                    } else if (indexTitle == 1 && indexRow >= 0) {
                        --indexRow;
                    }

                    scrInfo.moveTo(indexRow * scrInfo.ITEM_SIZE);
                } else if (GameCanvas.keyPressedz[8]) {
                    if (indexTitle == 0) {
                        ++indexTitle;
                    } else if (indexTitle == 1) {
                        if (++indexRow >= indexRowMax) {
                            indexRow = 0;
                        }

                        scrInfo.moveTo(indexRow * scrInfo.ITEM_SIZE);
                    }

                    super.left = super.center = null;
                    this.setLCR();
                } else if (GameCanvas.keyPressedz[4]) {
                    indexRow = -1;
                    if (indexTitle == 1 && --indexSelect < 0) {
                        indexSelect = Char.getMyChar().nClass.skillTemplates.length - 1;
                    }

                    super.left = super.center = null;
                    this.setLCR();
                    scrMain.moveTo(indexSelect * scrMain.ITEM_SIZE);
                    scrInfo.clear();
                    indexRow = 0;
                } else if (GameCanvas.keyPressedz[6]) {
                    indexRow = -1;
                    if (indexTitle == 1 && ++indexSelect >= Char.getMyChar().nClass.skillTemplates.length) {
                        indexSelect = 0;
                    }

                    super.left = super.center = null;
                    this.setLCR();
                    scrMain.moveTo(indexSelect * scrMain.ITEM_SIZE);
                    scrInfo.clear();
                    indexRow = 0;
                }
            } else if (indexMenu == 2) {
                if (GameCanvas.keyPressedz[2]) {
                    --indexTitle;
                } else if (GameCanvas.keyPressedz[8]) {
                    if (++indexTitle >= 5) {
                        indexTitle = 1;
                    }

                    super.left = super.center = null;
                    this.setLCR();
                }
            } else if (indexMenu == 3) {
                if (indexRow < 0) {
                    indexRow = 0;
                }

                if (GameCanvas.keyPressedz[2]) {
                    if (indexRow == 0) {
                        --indexTitle;
                        indexRow = -1;
                    } else {
                        --indexRow;
                    }

                    scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                } else if (GameCanvas.keyPressedz[8]) {
                    if (++indexRow >= indexRowMax) {
                        indexRow = 0;
                    }

                    scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                }
            } else if (indexMenu == 4) {
                var1 = indexSelect;
                if (indexSelect != 11 && indexSelect != 12 && indexSelect != 13 && indexSelect != 14) {
                    if (indexSelect == 9) {
                        if (GameCanvas.keyPressedz[2]) {
                            indexSelect -= 2;
                        } else if (GameCanvas.keyPressedz[8]) {
                            indexSelect = 15;
                        } else if (GameCanvas.keyPressedz[4]) {
                            --indexSelect;
                        } else if (GameCanvas.keyPressedz[6]) {
                            ++indexSelect;
                        }
                    } else if (indexSelect == 10) {
                        if (GameCanvas.keyPressedz[2]) {
                            indexSelect -= 2;
                        } else if (GameCanvas.keyPressedz[4]) {
                            --indexSelect;
                        } else if (GameCanvas.keyPressedz[6] || GameCanvas.keyPressedz[8]) {
                            ++indexSelect;
                        }
                    } else if (indexSelect == 15) {
                        if (GameCanvas.keyPressedz[2]) {
                            indexSelect = 9;
                        } else if (GameCanvas.keyPressedz[4]) {
                            --indexSelect;
                        } else if (GameCanvas.keyPressedz[8] || GameCanvas.keyPressedz[6]) {
                            indexSelect = 0;
                        }
                    } else if (GameCanvas.keyPressedz[2]) {
                        if (indexSelect <= 1) {
                            indexSelect = 0;
                            indexTitle = 0;
                        } else {
                            indexSelect -= 2;
                        }
                    } else if (GameCanvas.keyPressedz[8]) {
                        if ((indexSelect += 2) > 15) {
                            indexSelect = 0;
                        }
                    } else if (GameCanvas.keyPressedz[4]) {
                        if (--indexSelect < 0) {
                            indexSelect = 15;
                        }
                    } else if (GameCanvas.keyPressedz[6] && ++indexSelect > 11) {
                        indexSelect = 0;
                    }
                } else if (!GameCanvas.keyPressedz[2] && !GameCanvas.keyPressedz[4]) {
                    if (GameCanvas.keyPressedz[6] || GameCanvas.keyPressedz[8]) {
                        ++indexSelect;
                    }
                } else {
                    --indexSelect;
                }

                if (var1 != indexSelect) {
                    super.left = super.center = null;
                    this.setLCR();
                }
            } else if (indexMenu == 5) {
                if (GameCanvas.keyPressedz[2]) {
                    if (indexSelect == 4) {
                        indexSelect = 0;
                        --indexTitle;
                    } else if (--indexSelect < 0) {
                        indexSelect = 0;
                        --indexTitle;
                    }

                    this.setLCR();
                } else if (GameCanvas.keyPressedz[4]) {
                    if (indexSelect >= 2 && indexSelect != 4) {
                        indexSelect = 4;
                    } else {
                        indexSelect = 0;
                    }

                    this.setLCR();
                } else if (GameCanvas.keyPressedz[6]) {
                    if (indexSelect < 2) {
                        indexSelect = 4;
                    } else {
                        indexSelect = 2;
                    }

                    this.setLCR();
                } else if (GameCanvas.keyPressedz[8]) {
                    if (++indexSelect >= 4) {
                        indexSelect = 0;
                    }

                    this.setLCR();
                }
            } else if (indexMenu == 6) {
                if (indexBijuuMenu == 0) {
                    if (GameCanvas.keyPressedz[2]) {
                        if (indexSelect == 4) {
                            indexSelect = 0;
                            --indexTitle;
                        } else if (--indexSelect < 0) {
                            indexSelect = 0;
                            --indexTitle;
                        }

                        this.setLCR();
                    } else if (GameCanvas.keyPressedz[4]) {
                        if (indexSelect >= 2 && indexSelect != 4) {
                            indexSelect = 4;
                        } else {
                            indexSelect = 0;
                        }

                        this.setLCR();
                    } else if (GameCanvas.keyPressedz[6]) {
                        if (indexSelect < 2) {
                            indexSelect = 4;
                        } else {
                            indexSelect = 2;
                        }

                        this.setLCR();
                    } else if (GameCanvas.keyPressedz[8]) {
                        if (++indexSelect >= 4) {
                            indexSelect = 0;
                        }

                        this.setLCR();
                    }
                } else if (indexBijuuMenu == 1) {
                    if (GameCanvas.keyPressedz[2]) {
                        --indexTitle;
                    } else if (GameCanvas.keyPressedz[8]) {
                        if (++indexTitle >= 5) {
                            indexTitle = 1;
                        }

                        super.left = super.center = null;
                        this.setLCR();
                    }
                } else if (GameCanvas.keyPressedz[2]) {
                    if (indexTitle == 1 && indexRow == -1) {
                        --indexTitle;
                    } else if (indexTitle == 1 && indexRow >= 0) {
                        --indexRow;
                    }

                    scrInfo.moveTo(indexRow * scrInfo.ITEM_SIZE);
                } else if (GameCanvas.keyPressedz[8]) {
                    if (indexTitle == 0) {
                        ++indexTitle;
                    } else if (indexTitle == 1) {
                        if (++indexRow >= indexRowMax) {
                            indexRow = 0;
                        }

                        scrInfo.moveTo(indexRow * scrInfo.ITEM_SIZE);
                    }

                    super.left = super.center = null;
                    this.setLCR();
                } else if (GameCanvas.keyPressedz[4]) {
                    indexRow = -1;
                    if (indexTitle == 1 && --indexSelect < 0) {
                        indexSelect = Char.getMyChar().nClass.skillTemplates.length - 1;
                    }

                    super.left = super.center = null;
                    this.setLCR();
                    scrMain.moveTo(indexSelect * scrMain.ITEM_SIZE);
                    scrInfo.clear();
                    indexRow = 0;
                } else if (GameCanvas.keyPressedz[6]) {
                    indexRow = -1;
                    if (indexTitle == 1 && ++indexSelect >= Char.getMyChar().nClass.skillTemplates.length) {
                        indexSelect = 0;
                    }

                    super.left = super.center = null;
                    this.setLCR();
                    scrMain.moveTo(indexSelect * scrMain.ITEM_SIZE);
                    scrInfo.clear();
                    indexRow = 0;
                }
            }

            if (GameCanvas.isTouch) {
                GameScr var3 = this;
                if (!GameCanvas.menu.showMenu && GameCanvas.currentDialog == null) {
                    label696:
                    {
                        if (GameCanvas.isPointerJustRelease && GameCanvas.isPointerHoldIn(popupX, popupY, popupW, this.Hitem) && (!isPaintItemInfo || GameCanvas.w >= 320) && GameCanvas.isPointerClick) {
                            if (GameCanvas.isPointerHoldIn(gW2 - 90, popupY + 5, 60, 40)) {
                                indexSelect = 0;
                                --indexMenu;
                            }

                            if (GameCanvas.isPointerHoldIn(gW2 + 20, popupY + 5, 60, 40)) {
                                indexSelect = 0;
                                ++indexMenu;
                            }

                            isPaintItemInfo = false;
                            scrMain.clear();
                            scrInfo.clear();
                            if (currentCharViewInfo.charID != Char.getMyChar().charID) {
                                if (indexMenu < 3) {
                                    indexMenu = mResources.MENUME.length - 1;
                                }

                                if (indexMenu > mResources.MENUME.length - 1) {
                                    indexMenu = 3;
                                }
                            } else {
                                if (indexMenu < 0) {
                                    indexMenu = mResources.MENUME.length - 1;
                                }

                                if (indexMenu > mResources.MENUME.length - 1) {
                                    indexMenu = 0;
                                }
                            }

                            indexTitle = 1;
                            indexSelect = -1;
                            this.doMiniMenuInforMe();
                        }

                        ScrollResult var4;
                        if (isPaintItemInfo) {
                            if ((var4 = scrInfo.updateKey()).isDowning || var4.isFinish) {
                                indexRow = var4.selected;
                                indexTitle = 1;
                            }

                            if (GameCanvas.isTouchControlSmallScreen) {
                                break label696;
                            }
                        }

                        if (indexMenu == 0) {
                            if ((var4 = scrMain.updateKey()).isDowning || var4.isFinish) {
                                if (indexSelect != var4.selected) {
                                    indexSelect = var4.selected;
                                    super.left = super.center = null;
                                    if (GameCanvas.isTouchControlSmallScreen) {
                                        this.setLCR();
                                    } else if (getItemFocus(3) != null) {
                                        this.actBagViewItemInfo();
                                    } else {
                                        isPaintItemInfo = false;
                                        super.left = this.cmdBagSortItem;
                                    }
                                }

                                indexTitle = 1;
                            }
                        } else if (indexMenu == 1) {
                            if (!(var4 = scrMain.updateKey()).isDowning && !var4.isFinish) {
                                if (((var4 = scrInfo.updateKey()).isDowning || var4.isFinish) && indexRow != var4.selected) {
                                    indexRow = var4.selected;
                                }
                            } else {
                                if (indexSelect != var4.selected) {
                                    if ((indexSelect = var4.selected) >= Char.getMyChar().nClass.skillTemplates.length) {
                                        indexSelect = -1;
                                    }

                                    super.left = super.center = null;
                                    this.setLCR();
                                    scrInfo.clear();
                                    indexRow = 0;
                                }

                                indexTitle = 1;
                            }
                        } else if (indexMenu == 2) {
                            if (GameCanvas.isPointerJustRelease && GameCanvas.isPointerHoldIn(popupX + 5, popupY + 52, popupW - 10, 130) && GameCanvas.isPointerClick) {
                                var1 = (GameCanvas.py - (popupY + 52)) / 32;
                                ++var1;
                                if (var1 == this.indexTiemNang) {
                                    MyVector var2;
                                    (var2 = new MyVector()).addElement(new Command(mResources.UPPOINT, 11064));
                                    var2.addElement(new Command(mResources.UPPOINTS, 11065));
                                    GameCanvas.menu.startAt(var2);
                                }

                                indexTitle = var1;
                                this.indexTiemNang = var1;
                                this.setLCR();
                            }
                        } else if (indexMenu == 3) {
                            if ((var4 = scrMain.updateKey()).isDowning || var4.isFinish) {
                                indexRow = var4.selected;
                                indexTitle = 1;
                            }
                        } else if (indexMenu == 4) {
                            if (GameCanvas.isPointerJustRelease) {
                                indexTitle = 1;
                                if (GameCanvas.isPointerHoldIn(popupX + 4, popupY + 35, indexSize, 130)) {
                                    indexSelect = (GameCanvas.py - (popupY + 35)) / indexSize << 1;
                                    super.left = super.center = null;
                                    this.setLCR();
                                }

                                if (GameCanvas.isPointerHoldIn(popupX + popupW - 30, popupY + 35, indexSize, 130)) {
                                    indexSelect = ((GameCanvas.pyLast - (popupY + 35)) / indexSize << 1) + 1;
                                    super.left = super.center = null;
                                    this.setLCR();
                                }

                                if (GameCanvas.isPointerHoldIn(popupX + 4, popupY + 165, popupW - 8, indexSize)) {
                                    var1 = (GameCanvas.pxLast - (popupX + 4)) / indexSize;
                                    var1 += 10;
                                    indexSelect = var1;
                                    super.left = super.center = null;
                                    this.setLCR();
                                }
                            }
                        } else if (indexMenu == 5) {
                            if (GameCanvas.isPointerJustRelease) {
                                for (var1 = 0; var1 < var3.xMounts.length; ++var1) {
                                    if (var1 == 4) {
                                        if (GameCanvas.isPointerHoldIn(var3.xMounts[var1], var3.yMounts[var1], 84, 75) && GameCanvas.isPointerClick) {
                                            indexTitle = 1;
                                            indexSelect = 4;
                                            var3.setLCR();
                                            if (!GameCanvas.isTouchControlSmallScreen && var3.center != null) {
                                                var3.actionPerform(var3.center.idAction, var3.center.p);
                                            }
                                        }
                                    } else if (GameCanvas.isPointerHoldIn(var3.xMounts[var1], var3.yMounts[var1], indexSize, indexSize) && GameCanvas.isPointerClick) {
                                        indexTitle = 1;
                                        indexSelect = var1;
                                        var3.setLCR();
                                        if (!GameCanvas.isTouchControlSmallScreen) {
                                            if (currentCharViewInfo.arrItemMounts[indexSelect] != null) {
                                                var3.actionPerform(var3.center.idAction, var3.center.p);
                                            } else {
                                                isPaintItemInfo = false;
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (indexMenu == 6) {
                            if (indexBijuuMenu == 0) {
                                if (GameCanvas.isPointerJustRelease) {
                                    for (var1 = 0; var1 < var3.xMounts.length; ++var1) {
                                        if (var1 == 4) {
                                            if (GameCanvas.isPointerHoldIn(var3.xMounts[var1], var3.yMounts[var1], 84, 75) && GameCanvas.isPointerClick) {
                                                indexTitle = 1;
                                                indexSelect = 4;
                                                var3.setLCR();
                                                if (!GameCanvas.isTouchControlSmallScreen && var3.center != null) {
                                                    var3.actionPerform(var3.center.idAction, var3.center.p);
                                                }
                                            }
                                        } else if (GameCanvas.isPointerHoldIn(var3.xMounts[var1], var3.yMounts[var1], indexSize, indexSize) && GameCanvas.isPointerClick) {
                                            indexTitle = 1;
                                            indexSelect = var1;
                                            var3.setLCR();
                                            if (!GameCanvas.isTouchControlSmallScreen) {
                                                if (currentCharViewInfo.arrItemViThu[indexSelect] != null) {
                                                    var3.actionPerform(var3.center.idAction, var3.center.p);
                                                } else {
                                                    isPaintItemInfo = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (indexBijuuMenu == 1) {
                                if (GameCanvas.isPointerJustRelease && GameCanvas.isPointerHoldIn(popupX + 5, popupY + 52, popupW - 10, 130) && GameCanvas.isPointerClick) {
                                    var1 = (GameCanvas.py - (popupY + 52)) / 32;
                                    ++var1;
                                    if (var1 == this.indexTiemNang) {
                                        actBijuuMenuPoint();
                                    }

                                    indexTitle = var1;
                                    this.indexTiemNang = var1;
                                    this.setLCR();
                                }
                            } else if (!(var4 = scrMain.updateKey()).isDowning && !var4.isFinish) {
                                if (((var4 = scrInfo.updateKey()).isDowning || var4.isFinish) && indexRow != var4.selected) {
                                    indexRow = var4.selected;
                                }
                            } else {
                                if (indexSelect != var4.selected) {
                                    if ((indexSelect = var4.selected) >= Char.getMyChar().nClass.skillTemplates.length) {
                                        indexSelect = -1;
                                    }

                                    super.left = super.center = null;
                                    this.setLCR();
                                    scrInfo.clear();
                                    indexRow = 0;
                                }

                                indexTitle = 1;
                            }
                        }
                    }
                }
            }

            GameCanvas.clearKeyHold();
            GameCanvas.clearKeyPressed();
        }
    }

    private static Member curMemberSelected() {
        return (Member) vClan.elementAt(indexRow);
    }

    private void setClanComand() {
        if (!isPaintItemInfo) {
            super.left = super.center = null;
            if (indexMenu == 0) {
                if (Char.getMyChar().ctypeClan == 4) {
                    super.left = new Command(mResources.CLANS[0], 14004);
                }

                if (Char.getMyChar().ctypeClan == 3) {
                    super.left = new Command(mResources.CLANS[1], 14004);
                }

                if (Char.getMyChar().ctypeClan == 2) {
                    super.left = new Command(mResources.CLANS[2], 14004);
                }

                if (!Char.getMyChar().cClanName.equals("")) {
                    if (indexTitle == 1) {
                        super.center = new Command(mResources.VIEW, 140101);
                        return;
                    }

                    super.center = new Command(mResources.CLAN_MENU[3], 14010);
                    return;
                }
            } else if (indexMenu == 1) {
                Member var1;
                if (vClan.size() > 0 && indexRow >= 0 && indexRow < vClan.size() && (var1 = curMemberSelected()) != null) {
                    if (Char.getMyChar().ctypeClan == 4) {
                        super.left = new Command(mResources.CLANS[0], 14005);
                    }

                    if (Char.getMyChar().ctypeClan == 3) {
                        super.left = new Command(mResources.CLANS[1], 14005);
                    }

                    if (Char.getMyChar().ctypeClan != 4 && Char.getMyChar().ctypeClan != 3) {
                        super.left = new Command(mResources.CLANS[4], 14005);
                    }

                    if (!var1.name.equals(Char.getMyChar().cName) && (!isViewClanMemOnline || this.indexMember != 0)) {
                        super.center = new Command(mResources.SELECT, 14006, var1.name);
                        return;
                    }
                }
            } else if (indexMenu == 2 && indexTitle == 1) {
                if (Char.clan == null || Char.clan.items == null) {
                    return;
                }

                super.left = new Command(mResources.SELECT, 1508);
                if (!GameCanvas.isTouchControlLargeScreen) {
                    super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 1509);
                }
            }

        }
    }

    private void updateKeyAlert() {
        if (isPaintAlert && GameCanvas.currentDialog == null) {
            boolean var1 = false;
            if (GameCanvas.keyPressedz[8]) {
                if (++indexRow >= this.texts.size()) {
                    indexRow = 0;
                }

                var1 = true;
            } else if (GameCanvas.keyPressedz[2]) {
                if (--indexRow < 0) {
                    indexRow = this.texts.size() - 1;
                }

                var1 = true;
            }

            if (var1) {
                scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                GameCanvas.clearKeyHold();
                GameCanvas.clearKeyPressed();
            }

            ScrollResult var2;
            if (GameCanvas.isTouch && ((var2 = scrMain.updateKey()).isDowning || var2.isFinish)) {
                indexRow = var2.selected;
                var1 = true;
            }

            ChatTab var5;
            if (isPaintMessage && !GameCanvas.isTouch && (var5 = ChatManager.gI().getCurrentChatTab()).type == 2 && indexRow == 0) {
                ChatTextField.gI().center = new Command(mResources.HIDE_TAB, 120051, var5);
            }

            if (var1 && indexRow >= 0 && indexRow < this.texts.size()) {
                String var6 = (String) this.texts.elementAt(indexRow);
                var1 = false;
                this.fnick = null;
                this.alertURL = null;
                super.center = null;
                ChatTextField.gI().center = null;
                int var7;
                if ((var7 = var6.indexOf("http://")) >= 0) {
                    this.alertURL = var6.substring(var7);
                    super.center = new Command(mResources.OPEN_LINK, 12000);
                    if (!GameCanvas.isTouch) {
                        ChatTextField.gI().center = new Command(mResources.OPEN_LINK, (IActionListener) null, 12000, (Object) null);
                        return;
                    }
                } else if (var6.indexOf("@") >= 0) {
                    var7 = (var6 = var6.substring(2).trim()).indexOf("@");
                    String var3 = var6.substring(var7);
                    boolean var4 = false;
                    int var8;
                    if ((var8 = var3.indexOf(" ")) <= 0) {
                        var8 = var7 + var3.length();
                    } else {
                        var8 += var7;
                    }

                    this.fnick = var6.substring(var7 + 1, var8);
                    if (!this.fnick.equals("") && !this.fnick.equals(Char.getMyChar().cName) && !this.fnick.equals(mResources.SERVER_ALERT.substring(0, 5)) && !this.fnick.equals(mResources.SERVER_ALERT)) {
                        super.center = new Command(mResources.SELECT, 12009, this.fnick);
                        if (!GameCanvas.isTouch) {
                            ChatTextField.gI().center = new Command(mResources.SELECT, (IActionListener) null, 12009, this.fnick);
                            return;
                        }
                    } else {
                        this.fnick = null;
                        super.center = null;
                    }
                }
            }

        }
    }

    private void updateKeyMessage() {
        if (isPaintMessage) {
            boolean var1 = false;
            if (GameCanvas.keyPressedz[4]) {
                var1 = true;
                ChatManager.gI().switchToPreviousTab();
            } else if (GameCanvas.keyPressedz[6]) {
                var1 = true;
                ChatManager.gI().switchToNextTab();
            }

            if (var1) {
                this.openUIChatTab();
            }

            if (GameCanvas.isTouch && GameCanvas.isTouch && GameCanvas.isPointerHoldIn(popupX, popupY, popupW, this.Hitem) && (!isPaintItemInfo || GameCanvas.w >= 320) && GameCanvas.isPointerClick && GameCanvas.isPointerJustRelease) {
                if (GameCanvas.isPointerHoldIn(gW2 - 90, popupY + 5, 60, 40)) {
                    ChatManager.gI().switchToPreviousTab();
                    this.openUIChatTab();
                }

                if (GameCanvas.isPointerHoldIn(gW2 + 20, popupY + 5, 60, 40)) {
                    ChatManager.gI().switchToNextTab();
                    this.openUIChatTab();
                }
            }

        }
    }

    private void setCharFocusCommand() {
        if (indexRow >= 0 && vCharInMap.size() > 0) {
            if (Char.getIndexChar(this.cLastFocusID) == indexRow) {
                super.left = new Command(mResources.UNSELECT, 14002);
            } else {
                super.left = new Command(mResources.SELECT, 14003);
                super.center = new Command("", 14003);
            }
        } else {
            super.left = super.center = null;
        }
    }

    private void setRankedListCommand() {
        if (vList.size() > 0 && indexRow >= 0 && indexRowMax > 0) {
            super.center = new Command(mResources.RANKED_MATCH, 14024);
            super.left = new Command(mResources.PLAYER_INFO, 14025);
        } else {
            super.center = null;
            super.left = null;
        }
    }

    private void setDunListCommand() {
        if (vList.size() > 0 && indexRow >= 0 && indexRowMax > 0) {
            super.center = new Command(mResources.SELECT, 14021);
        } else {
            super.center = null;
        }
    }

    private void setEnemiesCommand() {
        if (vEnemies.size() > 0 && indexRow >= 0 && indexRowMax > 0) {
            super.center = new Command(mResources.SELECT, 11078);
        } else {
            super.center = null;
        }
    }

    private void setFriendCommand() {
        if (vFriend.size() > 0 && indexRow >= 0 && indexRowMax > 0 && indexRow < vFriend.size()) {
            vFriend.elementAt(indexRow);
            super.center = new Command(mResources.SELECT, 11079);
        } else {
            super.center = null;
        }
    }

    private void setPartyCommand() {
        super.center = null;
        if (indexRow != -1) {
            Party var1;
            if (((Party) vParty.elementAt(0)).charId == Char.getMyChar().charID) {
                if ((var1 = (Party) vParty.elementAt(indexRow)).charId != Char.getMyChar().charID) {
                    super.center = new Command(mResources.SELECT, 11080, var1.name);
                    return;
                }
            } else if ((var1 = (Party) vParty.elementAt(indexRow)).charId != Char.getMyChar().charID) {
                super.center = new Command(mResources.SELECT, 12009, var1.name);
            }

        }
    }

    private static boolean isPaintPopup() {
        return isPaintRankedList || isPaintLuckySpin || isPaintItemInfo || isPaintInfoMe || isPaintStore
                || isPaintEliteShop || isPaintAuctionBuy || isPaintWeapon || isPaintNonNam || isPaintNonNu
                || isPaintAoNam || isPaintAoNu || isPaintGangTayNam || isPaintGangTayNu || isPaintQuanNam
                || isPaintQuanNu || isPaintGiayNam || isPaintGiayNu || isPaintLien || isPaintNhan || isPaintNgocBoi
                || isPaintPhu || isPaintStack || isPaintStackLock || isPaintGrocery || isPaintGroceryLock
                || isPaintUpGrade || isPaintAuctionSale || isPaintConvert || isPaintSplit || isPaintTinhluyen
                || isPaintDichChuyen || isPaintUpPearl || isPaintLuyenThach || isPaintBox || isPaintDelItem || isPaintPickItem
                || isPaintTrade || isPaintAlert || isPaintZone || isPaintAuto || isPaintTeam || isPaintClan || isPaintFindTeam
                || isPaintTask || isPaintFriend || isPaintList || isPaintEnemies || isPaintCharInMap || isPaintMessage
                || isPaintLucky_Draw || isPaintLuyenNgoc || isPaintCheDo || isPaintKhamNgoc || isPaintGiaoDo || isPaintGotNgoc || isPaintThaoNgoc;
    }

    private boolean isNotPaintTouchControl() {
        if (GameCanvas.isTouch && !Char.ischangingMap && !isPaintZone && !isPaintAuto) {
            if (ChatTextField.gI().isShow) {
                return true;
            } else if (super.center == this.cmdDead && GameCanvas.isTouchControlLargeScreen) {
                return true;
            } else {
                return GameCanvas.currentDialog != null || ChatPopup.currentMultilineChatPopup != null || GameCanvas.menu.showMenu || isPaintPopup();
            }
        } else {
            return true;
        }
    }

    public static boolean isPaintUI() {
        return isPaintAuto || isPaintStore || isPaintLuckySpin || isPaintEliteShop || isPaintWeapon || isPaintNonNam
                || isPaintNonNu || isPaintAoNam || isPaintAoNu || isPaintGangTayNam || isPaintGangTayNu || isPaintQuanNam
                || isPaintQuanNu || isPaintGiayNam || isPaintGiayNu || isPaintLien || isPaintNhan || isPaintNgocBoi
                || isPaintPhu || isPaintStack || isPaintStackLock || isPaintGrocery || isPaintGroceryLock || isPaintUpGrade
                || isPaintAuctionBuy || isPaintAuctionSale || isPaintConvert || isPaintSplit || isPaintTinhluyen || isPaintDichChuyen
                || isPaintUpPearl || isPaintLuyenThach || isPaintBox || isPaintDelItem || isPaintPickItem || isPaintTrade || isPaintLuyenNgoc || isPaintCheDo || isPaintKhamNgoc
                || isPaintGiaoDo || isPaintGotNgoc || isPaintThaoNgoc;
    }

    private static boolean isOpenUI() {
        return isPaintAuto || isPaintItemInfo || isPaintLuckySpin || isPaintInfoMe || isPaintStore || isPaintEliteShop
                | isPaintWeapon || isPaintNonNam || isPaintNonNu || isPaintAoNam || isPaintAoNu || isPaintGangTayNam
                || isPaintGangTayNu || isPaintQuanNam || isPaintQuanNu || isPaintGiayNam || isPaintGiayNu || isPaintLien
                || isPaintNhan || isPaintNgocBoi || isPaintPhu || isPaintStack || isPaintStackLock || isPaintGrocery
                || isPaintGroceryLock || isPaintUpGrade || isPaintAuctionBuy || isPaintAuctionSale || isPaintConvert
                || isPaintSplit || isPaintTinhluyen || isPaintDichChuyen || isPaintUpPearl || isPaintLuyenThach || isPaintBox || isPaintDelItem || isPaintPickItem
                || isPaintTrade || isPaintLuyenNgoc || isPaintCheDo || isPaintKhamNgoc || isPaintGiaoDo || isPaintGotNgoc || isPaintThaoNgoc;
    }

    private static boolean isSmallUI() {
        return isPaintRankedList || isPaintInfoMe && indexMenu == 6 && indexBijuuMenu != 0 || isPaintInfoMe && indexMenu > 0 && indexMenu < 5 || isPaintAuto || isPaintZone || isPaintClan && (indexMenu == 0 || indexMenu == 1 || indexMenu == 3 || indexMenu == 4) || isPaintCharInMap || isPaintTeam || isPaintFindTeam || isPaintFriend || isPaintList || isPaintEnemies || isPaintTask || isPaintMessage || isPaintAlert || isPaintLucky_Draw;
    }

    private static void actionBuy(Item var0) {
        Command var1 = new Command(mResources.ACCEPT, 11055, var0);
        GameCanvas.inputDlg.show(mResources.INPUT_QUANTITY, var1, 1);
    }

    private static void actionSale(Item var0) {
        if (var0.quantity > 1) {
            Command var1 = new Command(mResources.ACCEPT, 110562, var0);
            GameCanvas.inputDlg.show(mResources.INPUT_QUANTITY, var1, 1);
        } else {
            GameCanvas.startYesNoDlg(mResources.CONFIRMSALEITEM, new Command(mResources.YES, 11061, var0), new Command(mResources.NO, 1));
        }
    }

    private static void actionCoinOut() {
        Command var0 = new Command(mResources.ACCEPT, 11042);
        GameCanvas.inputDlg.show(mResources.INPUT_COIN, var0, 1);
    }

    private static void actionCoinTrade() {
        Command var0 = new Command(mResources.ACCEPT, 110361);
        GameCanvas.inputDlg.show(mResources.INPUT_COIN, var0, 1);
    }

    private static void actionCoinIn() {
        Command var0 = new Command(mResources.ACCEPT, 11043);
        GameCanvas.inputDlg.show(mResources.INPUT_COIN, var0, 1);
    }

    public final void updateKeyBuyItemUI() {
        if (GameCanvas.currentDialog == null && isPaintUI()) {
            GameScr var1;
            int var3;
            int var4;
            int var6;
            int var11;
            if (indexTitle == 0) {
                var1 = this;
                super.left = super.center = null;
                if (!isPaintLuckySpin) {
                    if (isPaintBox) {
                        if (svTitle.equals("")) {
                            if (indexMenu == 0) {
                                super.left = new Command(mResources.MENU, 11115);
                            } else if (indexMenu == 1) {
                                super.left = new Command(mResources.MENU, 11116);
                            }
                        } else {
                            super.left = null;
                        }
                    } else if (indexMenu == 1 && isPaintTrade && this.typeTrade == 0) {
                        super.left = this.cmdTradeSendMoney;
                    } else if (indexMenu == 1 && !isPaintStore && !isPaintEliteShop && !isPaintUpPearl && !isPaintLuyenThach && !isPaintUpGrade && !isPaintConvert && !isPaintSplit && !isPaintTinhluyen && !isPaintDichChuyen && !isPaintTrade && !isPaintAuctionBuy && !isPaintAuctionSale && !isPaintLuyenNgoc && !isPaintCheDo && !isPaintKhamNgoc && !isPaintGiaoDo && !isPaintGotNgoc && !isPaintThaoNgoc) {
                        super.left = new Command(mResources.SORT, 110221);
                    }

                    if (isPaintLuyenThach && indexMenu == 0) {
                        var11 = 0;
                        var3 = 0;
                        var4 = 0;
                        short var5 = 0;

                        for (var6 = 0; var6 < arrItemUpPeal.length; ++var6) {
                            Item var7;
                            if ((var7 = arrItemUpPeal[var6]) != null) {
                                if (var7.template.id == 455) {
                                    ++var11;
                                } else if (var7.template.id == 456) {
                                    ++var3;
                                } else if (var7.template.type == 26) {
                                    ++var4;
                                    var5 = var7.template.id;
                                }
                            }
                        }

                        if (var11 >= 9 || var3 >= 9 || var5 >= 10 && var11 >= 3 && var4 == 1 || var5 >= 11 && var3 >= 3 && var4 == 1) {
                            super.left = new Command(mResources.BEGIN, 1600);
                        }
                    } else {
                        Item var2;
                        if (isPaintTinhluyen) {
                            try {
                                if (indexMenu == 0) {
                                    if (indexTitle == 1) {
                                        if (itemSplit != null) {
                                            var1.left = new Command(mResources.SELECT, 11103);
                                        } else {
                                            isPaintItemInfo = false;
                                        }

                                        if (GameCanvas.isTouchControlLargeScreen) {
                                            var1.updateItemInfo((int) 3, (Item) itemSplit);
                                        } else {
                                            var1.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11104, itemSplit);
                                        }
                                    } else if (indexTitle == 2) {
                                        if ((var2 = arrItemSplit[indexSelect]) != null) {
                                            if (GameCanvas.isTouchControlLargeScreen) {
                                                var1.updateItemInfo((int) 3, (Item) var2);
                                            } else {
                                                var1.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11104, var2);
                                            }

                                            var1.left = new Command(mResources.MOVEOUT, 1605);
                                        } else {
                                            isPaintItemInfo = false;
                                        }

                                        if (itemSplit != null) {
                                            var1.left = new Command(mResources.SELECT, 1604);
                                        }
                                    }
                                } else if (indexMenu == 1) {
                                    if (Char.getMyChar().arrItemBag[indexSelect] == null) {
                                        var1.left = null;
                                        isPaintItemInfo = false;
                                    } else {
                                        var1.left = new Command(mResources.SELECT, 11106);
                                    }
                                }
                            } catch (Exception var8) {
                            }
                        } else if (isPaintDichChuyen) {
                            if (indexMenu == 0) {
                                if (indexTitle != 1) {
                                    if (indexTitle == 2) {
                                        if ((var2 = arrItemSplit[indexSelect]) != null) {
                                            if (GameCanvas.isTouchControlLargeScreen) {
                                                this.updateItemInfo((int) 3, (Item) var2);
                                            } else {
                                                super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11104, var2);
                                            }
                                        } else {
                                            isPaintItemInfo = false;
                                        }

                                        if (itemSplit != null && itemSplit.upgrade > 13) {
                                            super.left = new Command(mResources.SELECT, 1604);
                                        }
                                    }
                                } else {
                                    if (itemSplit != null && itemSplit.upgrade > 13) {
                                        super.left = new Command(mResources.SELECT, 11103);
                                    } else if (itemSplit != null) {
                                        super.left = this.cmdSplitMoveOut;
                                    } else {
                                        isPaintItemInfo = false;
                                    }

                                    if (GameCanvas.isTouchControlLargeScreen) {
                                        this.updateItemInfo((int) 3, (Item) itemSplit);
                                    } else {
                                        super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11104, itemSplit);
                                    }
                                }
                            } else if (indexMenu == 1) {
                                if (Char.getMyChar().arrItemBag[indexSelect] == null) {
                                    super.left = null;
                                    isPaintItemInfo = false;
                                } else {
                                    super.left = new Command(mResources.SELECT, 1606);
                                }
                            }
                        }
                    }

                    if (isPaintUpPearl && indexMenu == 0) {
                        var11 = 0;

                        for (var3 = 0; var3 < arrItemUpPeal.length; ++var3) {
                            if (arrItemUpPeal[var3] != null) {
                                ++var11;
                                if (var11 >= 2) {
                                    super.left = new Command(mResources.BEGIN, 11062);
                                    break;
                                }
                            }
                        }
                    }

                    if (isPaintUpGrade && indexMenu == 0 && itemUpGrade != null) {
                        for (var11 = 0; var11 < arrItemUpGrade.length; ++var11) {
                            if (arrItemUpGrade[var11] != null) {
                                super.center = new Command("", 110981);
                                super.left = new Command(mResources.BEGIN, 110981);
                                break;
                            }
                        }
                    }

                    if (isPaintKhamNgoc && indexMenu == 0 && itemUpGrade != null && itemSplit != null) {
                        for (var11 = 0; var11 < arrItemUpGrade.length; ++var11) {
                            if (arrItemUpGrade[var11] != null) {
                                super.center = new Command("", 341);
                                super.left = new Command(mResources.BEGIN, 341);
                                break;
                            }
                        }
                    }

                    if (isPaintAuctionSale && indexMenu == 0 && itemSell != null && this.tfText != null && !this.tfText.getText().equals("") && Char.getMyChar().xu >= 5000) {
                        super.left = new Command(mResources.SALE, 15002);
                    }

                    if (isPaintConvert && indexMenu == 0 && indexTitle == 0) {
                        for (var11 = 0; var11 < arrItemConvert.length; ++var11) {
                            if (arrItemConvert[var11] == null) {
                                var1.left = null;
                                break;
                            }

                            if (var11 == arrItemConvert.length - 1) {
                                var1.left = new Command(mResources.BEGIN, 140131);
                            }
                        }
                    }

                    if (isPaintSplit && indexMenu == 0 && itemSplit != null && itemSplit.upgrade > 0) {
                        var1.left = new Command(mResources.BEGIN, 11105);
                    }

                    if (isPaintTrade && indexMenu == 0) {
                        if (var1.typeTrade == 0) {
                            var1.left = var1.cmdTradeLock;
                        } else if (var1.typeTrade == 1 && var1.typeTradeOrder >= 1 && (long) var1.timeTrade - System.currentTimeMillis() / 1000L <= 0L) {
                            var1.left = var1.cmdTradeAccept;
                        }
                    }

                    if (GameCanvas.keyPressedz[8]) {
                        indexTitle = 1;
                        indexSelect = 0;
                        indexRow = -1;
                        scrMain.clear();
                        scrInfo.clear();
                        var1.updateCommandForUI();
                    }

                    if (GameCanvas.keyPressedz[4]) {
                        indexSelect = 0;
                        indexRow = -1;
                        --indexMenu;
                        scrMain.clear();
                        scrInfo.clear();
                        if (isPaintAuctionBuy) {
                            if (indexMenu < 0) {
                                indexMenu = mResources.MENUSTANDS.length - 1;
                            }

                            Service.gI().menu((byte) 0, 28, 0, indexMenu);
                            arrItemStands = null;
                            indexSelect = -1;
                        } else if (!isPaintEliteShop && !isPaintAuto) {
                            if (indexMenu < 0) {
                                if (isPaintStore) {
                                    indexMenu = mResources.TITLESTORE.length - 1;
                                } else {
                                    indexMenu = 1;
                                }
                            }
                        } else {
                            indexMenu = 0;
                        }

                        var1.left = var1.center = null;
                        if (isPaintStore) {
                            getCurrentStoreData();
                        }

                        if (isPaintEliteShop && arrItemElites == null && indexMenu == 0) {
                            Service.gI().requestItem(35);
                        }
                    }

                    if (GameCanvas.keyPressedz[6]) {
                        indexSelect = 0;
                        indexRow = -1;
                        ++indexMenu;
                        scrMain.clear();
                        scrInfo.clear();
                        if (isPaintAuctionBuy) {
                            if (indexMenu > mResources.MENUSTANDS.length - 1) {
                                indexMenu = 0;
                            }

                            Service.gI().menu((byte) 0, 28, 0, indexMenu);
                            arrItemStands = null;
                            indexSelect = -1;
                        } else if (!isPaintEliteShop && !isPaintAuto) {
                            if (isPaintStore) {
                                if (indexMenu > mResources.TITLESTORE.length - 1) {
                                    indexMenu = 0;
                                }
                            } else if (indexMenu > 1) {
                                indexMenu = 0;
                            }
                        } else {
                            indexMenu = 0;
                        }

                        var1.left = var1.center = null;
                        if (isPaintStore) {
                            getCurrentStoreData();
                        }

                        if (isPaintEliteShop && arrItemElites == null && indexMenu == 0) {
                            Service.gI().requestItem(35);
                        }
                    }
                }
            } else if (indexTitle >= 1) {
                if (isPaintItemInfo) {
                    if (GameCanvas.keyPressedz[2]) {
                        if (--indexRow < 0) {
                            indexRow = indexRowMax - 1;
                        }

                        scrInfo.moveTo(indexRow * scrInfo.ITEM_SIZE);
                    } else if (GameCanvas.keyPressedz[8]) {
                        if (++indexRow >= indexRowMax) {
                            indexRow = 0;
                        }

                        scrInfo.moveTo(indexRow * scrInfo.ITEM_SIZE);
                    }
                } else {
                    if (isPaintAuto) {
                        if (GameCanvas.keyPressedz[2]) {
                            if (--indexRow < 0) {
                                indexRow = indexRowMax;
                            }

                            scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                        } else if (GameCanvas.keyPressedz[4]) {
                            if (indexRow == 0) {
                                if ((Char.aHpValue -= 10) < 10) {
                                    Char.aHpValue = 10;
                                }
                            } else if (indexRow == 1) {
                                if ((Char.aMpValue -= 10) < 10) {
                                    Char.aMpValue = 10;
                                }
                            } else if (indexRow == 2 && (Char.aFoodValue -= 10) <= 0) {
                                Char.aFoodValue = 1;
                            }
                        } else if (GameCanvas.keyPressedz[6]) {
                            if (indexRow == 0) {
                                if ((Char.aHpValue += 10) > 90) {
                                    Char.aHpValue = 90;
                                }
                            } else if (indexRow == 1) {
                                if ((Char.aMpValue += 10) > 90) {
                                    Char.aMpValue = 90;
                                }
                            } else if (indexRow == 2) {
                                if (Char.aFoodValue == 1) {
                                    Char.aFoodValue = 10;
                                } else if ((Char.aFoodValue += 10) > 70) {
                                    Char.aFoodValue = 70;
                                }
                            }
                        } else if (GameCanvas.keyPressedz[8]) {
                            if (++indexRow > indexRowMax) {
                                indexRow = 0;
                            }

                            scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
                        }

                        if (!GameCanvas.isTouch) {
                            GameCanvas.clearKeyHold();
                            GameCanvas.clearKeyPressed();
                        }
                    } else if (isPaintTrade && indexMenu == 0) {
                        boolean var9 = false;
                        if (indexTitle == 1) {
                            if (GameCanvas.keyPressedz[4]) {
                                if (--indexSelect < 0) {
                                    indexSelect = 11;
                                }

                                super.left = super.center = null;
                                this.updateCommandForUI();
                            } else if (GameCanvas.keyPressedz[6]) {
                                if (indexSelect == 2) {
                                    indexTitle = 2;
                                    indexSelect = 0;
                                } else if (indexSelect == 5) {
                                    indexTitle = 2;
                                    indexSelect = 3;
                                } else if (indexSelect == 8) {
                                    indexTitle = 2;
                                    indexSelect = 6;
                                } else if (indexSelect == 11) {
                                    indexTitle = 2;
                                    indexSelect = 9;
                                } else if (indexSelect == 14) {
                                    indexTitle = 2;
                                    indexSelect = 12;
                                } else if (++indexSelect >= 12) {
                                    indexSelect = 0;
                                }

                                super.left = super.center = null;
                                this.updateCommandForUI();
                            } else if (GameCanvas.keyPressedz[8]) {
                                if (indexSelect + 3 <= 11) {
                                    indexSelect += 3;
                                }

                                super.left = super.center = null;
                                this.updateCommandForUI();
                            } else if (GameCanvas.keyPressedz[2]) {
                                if (indexSelect >= 0 && indexSelect < 3) {
                                    indexTitle = 0;
                                    indexSelect = 0;
                                } else if (indexSelect - 3 >= 0) {
                                    indexSelect -= 3;
                                }

                                super.left = super.center = null;
                                this.updateCommandForUI();
                            }
                        } else if (indexTitle == 2) {
                            if (GameCanvas.keyPressedz[4]) {
                                if (indexSelect == 0) {
                                    indexTitle = 1;
                                    indexSelect = 2;
                                } else if (indexSelect == 3) {
                                    indexTitle = 1;
                                    indexSelect = 5;
                                } else if (indexSelect == 6) {
                                    indexTitle = 1;
                                    indexSelect = 8;
                                } else if (indexSelect == 9) {
                                    indexTitle = 1;
                                    indexSelect = 11;
                                } else if (indexSelect == 12) {
                                    indexTitle = 1;
                                    indexSelect = 14;
                                } else if (--indexSelect < 0) {
                                    indexSelect = 11;
                                }

                                super.left = super.center = null;
                                this.updateCommandForUI();
                            } else if (GameCanvas.keyPressedz[6]) {
                                if (++indexSelect >= 12) {
                                    indexSelect = 0;
                                }

                                super.left = super.center = null;
                                this.updateCommandForUI();
                            } else if (GameCanvas.keyPressedz[8]) {
                                if (indexSelect + 3 <= 11) {
                                    indexSelect += 3;
                                }

                                super.left = super.center = null;
                                this.updateCommandForUI();
                            } else if (GameCanvas.keyPressedz[2]) {
                                if (indexSelect >= 0 && indexSelect < 3) {
                                    indexTitle = 0;
                                    indexSelect = 0;
                                } else if (indexSelect - 3 >= 0) {
                                    indexSelect -= 3;
                                }

                                super.left = super.center = null;
                                this.updateCommandForUI();
                            }
                        }

                        if (!GameCanvas.isTouch) {
                            GameCanvas.clearKeyHold();
                            GameCanvas.clearKeyPressed();
                        }
                    } else if (isPaintLuckySpin) {
                        if (GameCanvas.keyPressedz[4]) {
                            if (--indexSelect < 0) {
                                indexSelect = 8;
                            }
                        } else if (GameCanvas.keyPressedz[6]) {
                            if (++indexSelect > 8) {
                                indexSelect = 0;
                            }
                        } else if (GameCanvas.keyPressedz[8]) {
                            if (indexSelect + 3 < 9) {
                                indexSelect += 3;
                            }
                        } else if (GameCanvas.keyPressedz[2] && indexSelect - 3 >= 0) {
                            indexSelect -= 3;
                        }

                        if (!GameCanvas.isTouch) {
                            GameCanvas.clearKeyHold();
                            GameCanvas.clearKeyPressed();
                        }
                    } else if (isPaintAuctionSale && indexMenu == 0) {
                        if (GameCanvas.keyPressedz[2]) {
                            if (--indexTitle < 0) {
                                indexTitle = 0;
                            }
                        } else if (GameCanvas.keyPressedz[8] && ++indexTitle > 2) {
                            indexTitle = 2;
                        }

                        this.updateCommandForUI();
                    } else if (isPaintAuctionBuy) {
                        if (GameCanvas.keyPressedz[4]) {
                            if (arrItemStands != null) {
                                if ((indexSelect -= 5) < 0) {
                                    indexSelect = arrItemStands.length - 1;
                                }

                                scrMain.moveTo(indexSelect * scrMain.ITEM_SIZE);
                                this.updateCommandForUI();
                            }
                        } else if (GameCanvas.keyPressedz[6]) {
                            if (arrItemStands != null) {
                                if ((indexSelect += 5) >= arrItemStands.length) {
                                    indexSelect = 0;
                                }

                                scrMain.moveTo(indexSelect * scrMain.ITEM_SIZE);
                                this.updateCommandForUI();
                            }
                        } else if (GameCanvas.keyPressedz[8]) {
                            if (arrItemStands != null) {
                                if (++indexSelect >= arrItemStands.length) {
                                    indexSelect = 0;
                                }

                                scrMain.moveTo(indexSelect * scrMain.ITEM_SIZE);
                                this.updateCommandForUI();
                            }
                        } else if (GameCanvas.keyPressedz[2] && arrItemStands != null) {
                            if (--indexSelect < 0) {
                                indexTitle = 0;
                            }

                            scrMain.moveTo(indexSelect * scrMain.ITEM_SIZE);
                            this.updateCommandForUI();
                        }

                        GameCanvas.clearKeyHold();
                        GameCanvas.clearKeyPressed();
                    } else if ((isPaintGiaoDo || isPaintKhamNgoc || isPaintUpGrade || isPaintConvert) && indexTitle == 1 && indexMenu == 0) {
                        if (GameCanvas.keyPressedz[4]) {
                            if (--indexSelect < 0) {
                                indexSelect = 1;
                            }

                            super.left = super.center = null;
                            this.updateCommandForUI();
                        } else if (GameCanvas.keyPressedz[6]) {
                            if (++indexSelect > 1) {
                                indexSelect = 0;
                            }

                            super.left = super.center = null;
                            this.updateCommandForUI();
                        } else if (GameCanvas.keyPressedz[8]) {
                            indexTitle = 2;
                            indexSelect = 0;
                            super.left = super.center = null;
                            this.updateCommandForUI();
                        } else if (GameCanvas.keyPressedz[2]) {
                            indexTitle = 0;
                            indexSelect = 0;
                            super.left = super.center = null;
                            this.updateCommandForUI();
                        }

                        if (!GameCanvas.isTouch) {
                            GameCanvas.clearKeyHold();
                            GameCanvas.clearKeyPressed();
                        }
                    } else if ((isPaintSplit || isPaintTinhluyen || isPaintDichChuyen || isPaintLuyenNgoc || isPaintCheDo) && indexTitle == 1 && indexMenu == 0) {
                        if (GameCanvas.keyPressedz[8]) {
                            indexTitle = 2;
                            indexSelect = 0;
                            super.left = super.center = null;
                            this.updateCommandForUI();
                        } else if (GameCanvas.keyPressedz[2]) {
                            indexTitle = 0;
                            indexSelect = 0;
                            super.left = super.center = null;
                            this.updateCommandForUI();
                        }

                        GameCanvas.clearKeyHold();
                        GameCanvas.clearKeyPressed();
                    } else if ((isPaintGotNgoc || isPaintThaoNgoc) && indexMenu == 0) {
                        if (GameCanvas.keyPressedz[2]) {
                            if (--indexTitle < 0) {
                                indexTitle = 0;
                            }
                        } else if (GameCanvas.keyPressedz[8] && ++indexTitle > 1) {
                            indexTitle = 1;
                        }

                        this.updateCommandForUI();
                    }

                    int var10 = getMaxIndexForCurrentStore();
                    if (GameCanvas.keyPressedz[4]) {
                        if (--indexSelect < 0) {
                            indexSelect = var10 - 1;
                        }

                        super.left = super.center = null;
                        this.updateCommandForUI();
                        scrMain.moveTo(indexSelect / columns * scrMain.ITEM_SIZE);
                    } else if (GameCanvas.keyPressedz[6]) {
                        if (++indexSelect >= var10) {
                            indexSelect = 0;
                        }

                        super.left = super.center = null;
                        this.updateCommandForUI();
                        scrMain.moveTo(indexSelect / columns * scrMain.ITEM_SIZE);
                    } else if (GameCanvas.keyPressedz[8]) {
                        if (indexSelect + columns <= var10 - 1) {
                            indexSelect += columns;
                        }

                        super.left = super.center = null;
                        this.updateCommandForUI();
                        scrMain.moveTo(indexSelect / columns * scrMain.ITEM_SIZE);
                    } else if (GameCanvas.keyPressedz[2]) {
                        if (indexSelect >= 0 && indexSelect < columns) {
                            indexTitle = 0;
                            indexSelect = 0;
                            if ((isPaintKhamNgoc || isPaintUpGrade || isPaintSplit || isPaintTinhluyen || isPaintDichChuyen || isPaintConvert || isPaintLuyenNgoc || isPaintCheDo) && indexMenu == 0) {
                                indexTitle = 1;
                            }
                        } else if (indexSelect - columns >= 0) {
                            indexSelect -= columns;
                        }

                        super.left = super.center = null;
                        this.updateCommandForUI();
                        scrMain.moveTo(indexSelect / columns * scrMain.ITEM_SIZE);
                    }
                }
            }

            if (GameCanvas.isTouch) {
                var1 = this;
                if (!GameCanvas.menu.showMenu && GameCanvas.currentDialog == null) {
                    label1492:
                    {
                        if (GameCanvas.isPointerJustRelease && GameCanvas.isPointerHoldIn(popupX, popupY, popupW, this.Hitem) && (!isPaintItemInfo || GameCanvas.w >= 320) && GameCanvas.isPointerClick) {
                            if (GameCanvas.isPointerHoldIn(gW2 - 80, popupY + 5, 60, 40)) {
                                indexSelect = 0;
                                --indexMenu;
                                this.updateCommandForUI();
                            }

                            if (GameCanvas.isPointerHoldIn(gW2 + 10, popupY + 5, 60, 40)) {
                                indexSelect = 0;
                                ++indexMenu;
                                this.updateCommandForUI();
                            }

                            indexTitle = 0;
                            if (!isPaintUI()) {
                                if (indexMenu < 0) {
                                    indexMenu = mResources.MENUME.length - 1;
                                }

                                if (indexMenu > mResources.MENUME.length - 1) {
                                    indexMenu = 0;
                                }
                            } else {
                                if (isPaintStore) {
                                    if (indexMenu < 0) {
                                        indexMenu = mResources.TITLESTORE.length - 1;
                                    } else if (indexMenu > mResources.TITLESTORE.length - 1) {
                                        indexMenu = 0;
                                    }

                                    getCurrentStoreData();
                                } else if (isPaintAuctionBuy) {
                                    if (indexMenu < 0) {
                                        indexMenu = mResources.MENUSTANDS.length - 1;
                                    } else if (indexMenu > mResources.MENUSTANDS.length - 1) {
                                        indexMenu = 0;
                                    }

                                    Service.gI().menu((byte) 0, 28, 0, indexMenu);
                                    indexSelect = -1;
                                } else if (!isPaintEliteShop && !isPaintAuto) {
                                    if (indexMenu < 0) {
                                        indexMenu = 1;
                                    } else if (indexMenu > 1) {
                                        indexMenu = 0;
                                    }
                                } else {
                                    indexMenu = 0;
                                }

                                if (isPaintEliteShop) {
                                    indexMenu = 0;
                                }
                            }

                            isPaintItemInfo = false;
                            scrMain.clear();
                        }

                        ScrollResult var14;
                        if (isPaintItemInfo) {
                            if ((var14 = scrInfo.updateKey()).isDowning || var14.isFinish) {
                                indexRow = var14.selected;
                                indexTitle = 1;
                            }

                            if (!GameCanvas.isTouchControlLargeScreen) {
                                break label1492;
                            }
                        }

                        if (isPaintAuto) {
                            if (((var14 = scrMain.updateKey()).isFinish || var14.isDowning) && indexSelect != var14.selected) {
                                indexTitle = 1;
                                indexRow = var14.selected;
                                this.updateCommandForUI();
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 5, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isAHP = !Char.isAHP;
                                if (typeActive == 1) {
                                    Char.isAHP = false;
                                    InfoMe.addInfo(mResources.AOPENACC, 20, mFont.tahoma_7_yellow);
                                }

                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 35, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isAMP = !Char.isAMP;
                                if (typeActive == 1) {
                                    Char.isAMP = false;
                                    InfoMe.addInfo(mResources.AOPENACC, 20, mFont.tahoma_7_yellow);
                                }

                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 65, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isAFood = !Char.isAFood;
                                if (typeActive == 1) {
                                    Char.isAFood = false;
                                    InfoMe.addInfo(mResources.AOPENACC, 20, mFont.tahoma_7_yellow);
                                }

                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 95, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isABuff = !Char.isABuff;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 125, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isAKhienMana = !Char.isAKhienMana;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 155, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isADotQuai = !Char.isADotQuai;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 185, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isADungPT = !Char.isADungPT;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 215, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isAPickYen = !Char.isAPickYen;
                                GameCanvas.isPointerDown = false;
                                if (Char.isAPickYen) {
                                    Char.isANoPick = false;
                                }
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 245, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isAPickYHM = !Char.isAPickYHM;
                                GameCanvas.isPointerDown = false;
                                if (Char.isAPickYHM) {
                                    Char.isANoPick = false;
                                }
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 275, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isAPickYHMS = !Char.isAPickYHMS;
                                GameCanvas.isPointerDown = false;
                                if (Char.isAPickYHMS) {
                                    Char.isANoPick = false;
                                }
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 305, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isALuyenDa = !Char.isALuyenDa;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 335, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isAPickTB = !Char.isAPickTB;
                                GameCanvas.isPointerDown = false;
                                if (Char.isAPickTB) {
                                    Char.isANoPick = false;
                                }
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 365, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isAPickTBLa = !Char.isAPickTBLa;
                                GameCanvas.isPointerDown = false;
                                if (Char.isAPickTBLa) {
                                    Char.isAPickTB = true;
                                    Char.isANoPick = false;
                                }
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 395, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isAPickVPNV = !Char.isAPickVPNV;
                                GameCanvas.isPointerDown = false;
                                if (Char.isAPickVPNV) {
                                    Char.isANoPick = false;
                                }
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 425, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isAPickVPSK = !Char.isAPickVPSK;
                                GameCanvas.isPointerDown = false;
                                if (Char.isAPickVPSK) {
                                    Char.isANoPick = false;
                                }
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 455, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isAPickAll = !Char.isAPickAll;
                                GameCanvas.isPointerDown = false;
                                if (Char.isAPickAll) {
                                    Char.isANoPick = false;
                                }
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 485, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isAPickSVC = !Char.isAPickSVC;
                                GameCanvas.isPointerDown = false;
                                if (Char.isAPickSVC) {
                                    Char.isANoPick = false;
                                }
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 515, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isANoPick = !Char.isANoPick;
                                GameCanvas.isPointerDown = false;
                                if (Char.isANoPick) {
                                    Char.isAPickYHMS = false;
                                    Char.isAPickYHM = false;
                                    Char.isAPickYen = false;
                                    Char.isAPickTB = false;
                                    Char.isAPickTBLa = false;
                                    Char.isAPickVPNV = false;
                                    Char.isAPickVPSK = false;
                                    Char.isAPickAll = false;
                                    Char.isAPickSVC = false;
                                }
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 545, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isALuyenTTT = !Char.isALuyenTTT;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 575, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isALuyenTTC = !Char.isALuyenTTC;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 605, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isAReMap = !Char.isAReMap;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 635, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isATsMapTrong = !Char.isATsMapTrong;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 665, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isAMuaFood = !Char.isAMuaFood;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 695, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isANoMP = !Char.isANoMP;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 725, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isAReConnect = !Char.isAReConnect;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 755, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isAChuyenMapHetQuai = !Char.isAChuyenMapHetQuai;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 785, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isASanTaTl = !Char.isASanTaTl;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 815, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isADanhQuai = !Char.isADanhQuai;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 845, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isADanhTA = !Char.isADanhTA;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 875, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isADanhTL = !Char.isADanhTL;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 905, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isACongTN = !Char.isACongTN;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 935, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isACongKN = !Char.isACongKN;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 965, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isADanhNhom = !Char.isADanhNhom;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 995, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isANePk = !Char.isANePk;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 1025, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isADungCoLenh = !Char.isADungCoLenh;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 1055, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isAMuaCoLenh = !Char.isAMuaCoLenh;
                                GameCanvas.isPointerDown = false;
                            }
                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 1085, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isADungTTL = !Char.isADungTTL;
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 16, scrMain.yPos + 1115, 16, 16, scrMain) && GameCanvas.isPointerClick) {
                                Char.isAMuaTTL = !Char.isAMuaTTL;
                                GameCanvas.isPointerDown = false;
                            }
                            if (GameCanvas.isPointerInGame(scrMain.xPos + 131, scrMain.yPos + 2, 30, 20, scrMain) && GameCanvas.isPointerClick && Char.isAHP) {
                                GameCanvas.inputDlg.show(mResources.AHP_TEXT, new Command(mResources.OK, 1511), 1);
                                GameCanvas.isPointerDown = false;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 131, scrMain.yPos + 32, 30, 20, scrMain) && GameCanvas.isPointerClick && Char.isAMP) {
                                GameCanvas.inputDlg.show(mResources.AHP_TEXT, new Command(mResources.OK, 1512), 1);
                                GameCanvas.isPointerDown = false;
                            }
                            MyVector myVector;

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 131, scrMain.yPos + 62, 30, 20, scrMain) && GameCanvas.isPointerClick && Char.isAFood) {
                                (myVector = new MyVector()).addElement(new Command(mResources.ALEVEL[0], 15130));
                                myVector.addElement(new Command(mResources.ALEVEL[1], 15131));
                                myVector.addElement(new Command(mResources.ALEVEL[2], 15132));
                                myVector.addElement(new Command(mResources.ALEVEL[3], 15133));
                                myVector.addElement(new Command(mResources.ALEVEL[4], 15134));
                                myVector.addElement(new Command(mResources.ALEVEL[5], 15135));
                                myVector.addElement(new Command(mResources.ALEVEL[6], 15136));
                                myVector.addElement(new Command(mResources.ALEVEL[7], 15137));
                                myVector.addElement(new Command(mResources.ALEVEL[8], 15138));
                                GameCanvas.menu.startAt(myVector);
                                GameCanvas.menu.disableClose = true;
                            }
                            if (GameCanvas.isPointerInGame(scrMain.xPos + 131, scrMain.yPos + 242, 30, 20, scrMain) && GameCanvas.isPointerClick && Char.isAPickYHM) {
                                (myVector = new MyVector()).addElement(new Command(mResources.ALEVEL[0], 15150));
                                myVector.addElement(new Command(mResources.ALEVEL[1], 15151));
                                myVector.addElement(new Command(mResources.ALEVEL[3], 15153));
                                myVector.addElement(new Command(mResources.ALEVEL[5], 15155));
                                myVector.addElement(new Command(mResources.ALEVEL[7], 15157));
                                myVector.addElement(new Command(mResources.ALEVEL[8], 15158));

                                GameCanvas.menu.startAt(myVector);
                                GameCanvas.menu.disableClose = true;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 131, scrMain.yPos + 272, 30, 20, scrMain) && GameCanvas.isPointerClick && Char.isAPickYHMS) {
                                (myVector = new MyVector()).addElement(new Command(mResources.ALEVELDA[0], 15161));
                                myVector.addElement(new Command(mResources.ALEVELDA[1], 15162));
                                myVector.addElement(new Command(mResources.ALEVELDA[2], 15163));
                                myVector.addElement(new Command(mResources.ALEVELDA[3], 15164));
                                myVector.addElement(new Command(mResources.ALEVELDA[4], 15165));
                                myVector.addElement(new Command(mResources.ALEVELDA[5], 15166));
                                myVector.addElement(new Command(mResources.ALEVELDA[6], 15167));
                                GameCanvas.menu.startAt(myVector);
                                GameCanvas.menu.disableClose = true;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 131, scrMain.yPos + 302, 30, 20, scrMain) && GameCanvas.isPointerClick && Char.isALuyenDa) {
                                (myVector = new MyVector()).addElement(new Command(mResources.ALEVELDA[3], 15174));
                                myVector.addElement(new Command(mResources.ALEVELDA[4], 15175));
                                myVector.addElement(new Command(mResources.ALEVELDA[5], 15176));
                                myVector.addElement(new Command(mResources.ALEVELDA[6], 15177));
                                myVector.addElement(new Command(mResources.ALEVELDA[7], 15178));
                                myVector.addElement(new Command(mResources.ALEVELDA[8], 15179));
                                myVector.addElement(new Command(mResources.ALEVELDA[9], 151710));
                                myVector.addElement(new Command(mResources.ALEVELDA[10], 151711));
                                myVector.addElement(new Command(mResources.ALEVELDA[11], 151712));
                                GameCanvas.menu.startAt(myVector);
                                GameCanvas.menu.disableClose = true;
                            }

                            if (GameCanvas.isPointerInGame(scrMain.xPos + 131, scrMain.yPos + 332, 30, 20, scrMain) && GameCanvas.isPointerClick && Char.isAPickTB) {
                                (myVector = new MyVector()).addElement(new Command(mResources.ALEVEL[0], 15140));
                                myVector.addElement(new Command(mResources.ALEVEL[1], 15141));
                                myVector.addElement(new Command(mResources.ALEVEL[2], 15142));
                                myVector.addElement(new Command(mResources.ALEVEL[3], 15143));
                                myVector.addElement(new Command(mResources.ALEVEL[4], 15144));
                                myVector.addElement(new Command(mResources.ALEVEL[5], 15145));
                                myVector.addElement(new Command(mResources.ALEVEL[6], 15146));
                                myVector.addElement(new Command(mResources.ALEVEL[7], 15147));
                                myVector.addElement(new Command(mResources.ALEVEL[8], 15148));

                                GameCanvas.menu.startAt(myVector);
                                GameCanvas.menu.disableClose = true;
                            }
                        } else if (!isPaintEliteShop && !isPaintStore && !isPaintBox && !isPaintDelItem && !isPaintPickItem && !isPaintGrocery && !isPaintGroceryLock && !isPaintStack && !isPaintStackLock && !isPaintNonNam && !isPaintNonNu && !isPaintAoNam && !isPaintAoNu && !isPaintGangTayNam && !isPaintGangTayNu && !isPaintQuanNam && !isPaintQuanNu && !isPaintGiayNam && !isPaintGiayNu && !isPaintWeapon && !isPaintLien && !isPaintNhan && !isPaintNgocBoi && !isPaintPhu) {
                            if (isPaintTrade) {
                                if (indexMenu == 0) {
                                    this.indexPointer(popupX + 4, popupY + this.Hitem + 15, 3, 4, 1);
                                    this.indexPointer(popupX + popupW - 3 - 3 * indexSize, popupY + this.Hitem + 15, 3, 4, 2);
                                } else if (indexMenu == 1 && ((var14 = scrMain.updateKey()).isFinish || var14.isDowning) && indexSelect != var14.selected) {
                                    indexTitle = 1;
                                    indexSelect = var14.selected;
                                    this.updateCommandForUI();
                                }
                            } else if (!isPaintUpPearl && !isPaintLuyenThach) {
                                if (!isPaintSplit && !isPaintTinhluyen && !isPaintDichChuyen && !isPaintLuyenNgoc) {
                                    if (!isPaintUpGrade && !isPaintConvert && !isPaintKhamNgoc) {
                                        if (isPaintGiaoDo) {
                                            if (indexMenu == 0) {
                                                if (((var14 = scrMain.updateKey()).isFinish || var14.isDowning) && indexSelect != var14.selected) {
                                                    indexTitle = 1;
                                                    indexSelect = var14.selected;
                                                    super.left = super.center = null;
                                                    isPaintItemInfo = false;
                                                    this.updateCommandForUI();
                                                }
                                            } else if (indexMenu == 1 && ((var14 = scrMain.updateKey()).isFinish || var14.isDowning) && indexSelect != var14.selected) {
                                                indexTitle = 1;
                                                indexSelect = var14.selected;
                                                this.updateCommandForUI();
                                            }
                                        } else if (isPaintAuctionSale) {
                                            if (indexMenu == 0) {
                                                if (GameCanvas.isPointerHoldIn(popupX + 75, popupY + 69, indexSize, indexSize)) {
                                                    if (GameCanvas.isPointerClick && GameCanvas.isPointerJustRelease) {
                                                        indexTitle = 1;
                                                        this.updateCommandForUI();
                                                    }
                                                } else if (GameCanvas.isPointerHoldIn(this.tfText.x, this.tfText.y, this.tfText.width, this.tfText.height) && GameCanvas.isPointerClick && GameCanvas.isPointerJustRelease) {
                                                    indexTitle = 2;
                                                    this.tfText.nsoAA();
                                                    this.updateCommandForUI();
                                                }
                                            } else if (indexMenu == 1 && ((var14 = scrMain.updateKey()).isFinish || var14.isDowning) && indexSelect != var14.selected) {
                                                indexTitle = 1;
                                                indexSelect = var14.selected;
                                                this.updateCommandForUI();
                                            }
                                        } else if (isPaintLuckySpin) {
                                            if (GameCanvas.isPointerHoldIn(xstart, ystart, 120, 120) && GameCanvas.isPointerJustRelease && GameCanvas.isPointerClick) {
                                                indexSelect = (GameCanvas.pxLast - xstart) / 40 + (GameCanvas.pyLast - ystart) / 40 * 3;
                                                indexTitle = 1;
                                                this.updateCommandForUI();
                                                this.doviewCardsInfo();
                                            }
                                        } else if (!isPaintGotNgoc && !isPaintThaoNgoc) {
                                            if (isPaintCheDo) {
                                                if (indexMenu == 1 && ((var14 = scrMain.updateKey()).isFinish || var14.isDowning) && indexSelect != var14.selected) {
                                                    indexTitle = 1;
                                                    indexSelect = var14.selected;
                                                    this.updateCommandForUI();
                                                }

                                                if (indexMenu == 0) {
                                                    for (var11 = 0; var11 < var1.nsoTP.length; ++var11) {
                                                        if (GameCanvas.isPointerHoldIn(var1.nsoTP[var11], var1.nsoTQ[var11], indexSize, indexSize) && GameCanvas.isPointerClick && GameCanvas.isPointerJustRelease) {
                                                            var1.nsoTR = var11;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (indexMenu == 0) {
                                            if (GameCanvas.isPointerHoldIn(popupX + 75, popupY + 69, indexSize, indexSize) && GameCanvas.isPointerClick && GameCanvas.isPointerJustRelease) {
                                                indexTitle = 1;
                                                this.updateCommandForUI();
                                            }
                                        } else if (indexMenu == 1 && ((var14 = scrMain.updateKey()).isFinish || var14.isDowning) && indexSelect != var14.selected) {
                                            indexTitle = 1;
                                            indexSelect = var14.selected;
                                            this.updateCommandForUI();
                                        }
                                    } else if (indexMenu == 0) {
                                        var3 = popupX + 45;
                                        var4 = popupY + 32;
                                        int var13 = popupX + 100;
                                        if (GameCanvas.isPointerJustRelease) {
                                            if (GameCanvas.isPointerHoldIn(var3, var4, 29, 29)) {
                                                indexTitle = 1;
                                                indexSelect = 0;
                                                this.updateCommandForUI();
                                            }

                                            if (GameCanvas.isPointerHoldIn(var13, var4, 29, 29)) {
                                                indexTitle = 1;
                                                indexSelect = 1;
                                                this.updateCommandForUI();
                                                if (isPaintUpPearl && indexMenu == 0) {
                                                    for (var6 = 0; var6 < arrItemUpPeal.length; ++var6) {
                                                        if (arrItemUpPeal[var6] != null) {
                                                            super.center = new Command(mResources.ACCEPT, 11062);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }

                                            if (GameCanvas.isPointerHoldIn(popupX, popupY + 2 * this.Hitem + 5, popupW, popupH - this.Hitem * 3)) {
                                                this.indexPointer(popupX, popupY + 2 * this.Hitem + 5, 6, 3, 2);
                                            }
                                        }
                                    } else if (indexMenu == 1 && ((var14 = scrMain.updateKey()).isFinish || var14.isDowning) && indexSelect != var14.selected) {
                                        indexTitle = 1;
                                        indexSelect = var14.selected;
                                        this.updateCommandForUI();
                                    }
                                } else if (indexMenu == 0) {
                                    if (GameCanvas.isPointerHoldIn(popupX + 74, ystart - indexSize - 3, indexSize, indexSize)) {
                                        indexTitle = 1;
                                        indexSelect = 0;
                                        this.updateCommandForUI();
                                    }

                                    this.indexPointer(popupX + 4, popupY + 2 * this.Hitem + 5, 6, 4, 2);
                                } else if (indexMenu == 1 && ((var14 = scrMain.updateKey()).isFinish || var14.isDowning) && indexSelect != var14.selected) {
                                    indexTitle = 1;
                                    indexSelect = var14.selected;
                                    this.updateCommandForUI();
                                }
                            } else if (indexMenu == 0) {
                                this.indexPointer(popupX + 4, popupY + this.Hitem + 3, 6, 4, 1);
                            } else if (indexMenu == 1 && ((var14 = scrMain.updateKey()).isFinish || var14.isDowning) && indexSelect != var14.selected) {
                                indexTitle = 1;
                                indexSelect = var14.selected;
                                this.updateCommandForUI();
                            }
                        } else if (((var14 = scrMain.updateKey()).isFinish || var14.isDowning) && indexSelect != var14.selected) {
                            indexTitle = 1;
                            indexSelect = var14.selected;
                            super.left = super.center = null;
                            isPaintItemInfo = false;
                            this.updateCommandForUI();
                        }
                    }
                }
            }

            GameCanvas.clearKeyHold();
            GameCanvas.clearKeyPressed();
        }
    }

    private static int getMaxIndexForCurrentStore() {
        int var0 = 0;

        try {
            if (isPaintEliteShop) {
                if (arrItemElites.length % columns == 0) {
                    var0 = arrItemElites.length;
                } else {
                    var0 = (arrItemElites.length / columns + 1) * columns;
                }
            } else if (isPaintStore) {
                if (indexMenu == 0) {
                    if (arrItemStore.length % columns == 0) {
                        var0 = arrItemStore.length;
                    } else {
                        var0 = (arrItemStore.length / columns + 1) * columns;
                    }
                } else if (indexMenu == 1) {
                    if (arrItemBook.length % columns == 0) {
                        var0 = arrItemBook.length;
                    } else {
                        var0 = (arrItemBook.length / columns + 1) * columns;
                    }
                } else if (indexMenu == 2) {
                    if (arrItemFashion.length % columns == 0) {
                        var0 = arrItemFashion.length;
                    } else {
                        var0 = (arrItemFashion.length / columns + 1) * columns;
                    }
                } else if (indexMenu == 52) {
                    if (arrItemFashion.length % columns == 0) {
                        var0 = arrItemFashion.length;
                    } else {
                        var0 = (arrItemFashion.length / columns + 1) * columns;
                    }
                }
            } else if (isPaintNonNam) {
                if (arrItemNonNam.length % columns == 0) {
                    var0 = arrItemNonNam.length;
                } else {
                    var0 = (arrItemNonNam.length / columns + 1) * columns;
                }
            } else if (isPaintNonNu) {
                if (arrItemNonNu.length % columns == 0) {
                    var0 = arrItemNonNu.length;
                } else {
                    var0 = (arrItemNonNu.length / columns + 1) * columns;
                }
            } else if (isPaintAoNam) {
                if (arrItemAoNam.length % columns == 0) {
                    var0 = arrItemAoNam.length;
                } else {
                    var0 = (arrItemAoNam.length / columns + 1) * columns;
                }
            } else if (isPaintAoNu) {
                if (arrItemAoNu.length % columns == 0) {
                    var0 = arrItemAoNu.length;
                } else {
                    var0 = (arrItemAoNu.length / columns + 1) * columns;
                }
            } else if (isPaintGangTayNam) {
                if (arrItemGangTayNam.length % columns == 0) {
                    var0 = arrItemGangTayNam.length;
                } else {
                    var0 = (arrItemGangTayNam.length / columns + 1) * columns;
                }
            } else if (isPaintGangTayNu) {
                if (arrItemGangTayNu.length % columns == 0) {
                    var0 = arrItemGangTayNu.length;
                } else {
                    var0 = (arrItemGangTayNu.length / columns + 1) * columns;
                }
            } else if (isPaintQuanNam) {
                if (arrItemQuanNam.length % columns == 0) {
                    var0 = arrItemQuanNam.length;
                } else {
                    var0 = (arrItemQuanNam.length / columns + 1) * columns;
                }
            } else if (isPaintQuanNu) {
                if (arrItemQuanNu.length % columns == 0) {
                    var0 = arrItemQuanNu.length;
                } else {
                    var0 = (arrItemQuanNu.length / columns + 1) * columns;
                }
            } else if (isPaintGiayNam) {
                if (arrItemGiayNam.length % columns == 0) {
                    var0 = arrItemGiayNam.length;
                } else {
                    var0 = (arrItemGiayNam.length / columns + 1) * columns;
                }
            } else if (isPaintGiayNu) {
                if (arrItemGiayNu.length % columns == 0) {
                    var0 = arrItemGiayNu.length;
                } else {
                    var0 = (arrItemGiayNu.length / columns + 1) * columns;
                }
            } else if (isPaintLien) {
                if (arrItemLien.length % columns == 0) {
                    var0 = arrItemLien.length;
                } else {
                    var0 = (arrItemLien.length / columns + 1) * columns;
                }
            } else if (isPaintNhan) {
                if (arrItemNhan.length % columns == 0) {
                    var0 = arrItemNhan.length;
                } else {
                    var0 = (arrItemNhan.length / columns + 1) * columns;
                }
            } else if (isPaintNgocBoi) {
                if (arrItemNgocBoi.length % columns == 0) {
                    var0 = arrItemNgocBoi.length;
                } else {
                    var0 = (arrItemNgocBoi.length / columns + 1) * columns;
                }
            } else if (isPaintPhu) {
                if (arrItemPhu.length % columns == 0) {
                    var0 = arrItemPhu.length;
                } else {
                    var0 = (arrItemPhu.length / columns + 1) * columns;
                }
            } else if (isPaintWeapon) {
                if (arrItemWeapon.length % columns == 0) {
                    var0 = arrItemWeapon.length;
                } else {
                    var0 = (arrItemWeapon.length / columns + 1) * columns;
                }
            } else if (isPaintStack) {
                if (arrItemStack.length % columns == 0) {
                    var0 = arrItemStack.length;
                } else {
                    var0 = (arrItemStack.length / columns + 1) * columns;
                }
            } else if (isPaintStackLock) {
                if (arrItemStackLock.length % columns == 0) {
                    var0 = arrItemStackLock.length;
                } else {
                    var0 = (arrItemStackLock.length / columns + 1) * columns;
                }
            } else if (isPaintGrocery) {
                if (arrItemGrocery.length % columns == 0) {
                    var0 = arrItemGrocery.length;
                } else {
                    var0 = (arrItemGrocery.length / columns + 1) * columns;
                }
            } else if (isPaintGroceryLock) {
                if (arrItemGroceryLock.length % columns == 0) {
                    var0 = arrItemGroceryLock.length;
                } else {
                    var0 = (arrItemGroceryLock.length / columns + 1) * columns;
                }
            }

            if (isPaintBox) {
                var0 = Char.getMyChar().arrItemBox.length;
            }

            if (indexMenu == 1 && !isPaintStore) {
                var0 = Char.getMyChar().arrItemBag.length;
            }
        } catch (Exception var2) {
            var2.printStackTrace();
        }

        if ((isPaintUpPearl || isPaintLuyenThach || isPaintSplit || isPaintTinhluyen || isPaintDichChuyen || isPaintLuyenNgoc || isPaintCheDo) && indexMenu == 0) {
            var0 = 24;
        } else if ((isPaintKhamNgoc || isPaintUpGrade || isPaintConvert) && indexMenu == 0) {
            var0 = 18;
        } else if (var0 < 30) {
            var0 = 30;
        }

        return var0;
    }

    private static void getCurrentStoreData() {
        if (indexMenu == 0) {
            Service.gI().requestItem(14);
        } else if (indexMenu == 1) {
            Service.gI().requestItem(15);
        } else if (indexMenu == 2) {
            Service.gI().requestItem(32);
        } else if (indexMenu == 3) {
            Service.gI().requestItem(34);
        } else {
            if (indexMenu == 52) {
                Service.gI().requestItem(32);
            }

        }
    }

    private void saleItem() {
        if (Char.getMyChar().arrItemBag[indexSelect].quantity > 1) {
            super.left = new Command(mResources.SALE, 11072);
        } else {
            super.left = new Command(mResources.SALE, 11073);
        }
    }

    public final void updateCommandForUI() {
        super.left = super.center = null;
        if (indexSelect >= 0) {
            if (isPaintAuto) {
                if (indexTitle == 1 && !GameCanvas.isTouch) {
                    super.left = new Command(mResources.SELECT, 1510);
                }

            } else if (isPaintLuckySpin) {
                if (indexTitle == 1) {
                    super.left = new Command(mResources.SELECT, 1506);
                    super.center = new Command("", 1507);
                }

            } else if (isPaintEliteShop) {
                if (indexMenu == 0 && getItemFocus(35) != null) {
                    super.left = this.cmdEliteShopBuy;
                    if (!GameCanvas.isTouchControlLargeScreen) {
                        super.center = this.cmdEliteShopView;
                        return;
                    }

                    this.actView((byte) 35);
                }

            } else if (isPaintStore) {
                if (indexMenu == 52) {
                    if (getItemFocus(32) != null) {
                        super.left = this.cmdStoreFashionBuy;
                        if (!GameCanvas.isTouchControlLargeScreen) {
                            super.center = this.cmdStoreFashionView;
                            return;
                        }

                        this.actView((byte) 32);
                        return;
                    }
                } else if (indexMenu == 0) {
                    if (getItemFocus(14) != null) {
                        super.left = this.cmdStoreBuy;
                        if (!GameCanvas.isTouchControlLargeScreen) {
                            super.center = this.cmdStoreView;
                            return;
                        }

                        this.actView((byte) 14);
                        return;
                    }
                } else if (indexMenu == 1) {
                    if (getItemFocus(15) != null) {
                        super.left = this.cmdStoreLockBuy;
                        if (!GameCanvas.isTouchControlLargeScreen) {
                            super.center = this.cmdStoreLockView;
                            return;
                        }

                        this.actView((byte) 15);
                        return;
                    }
                } else if (indexMenu == 2) {
                    if (getItemFocus(32) != null) {
                        super.left = this.cmdStoreFashionBuy;
                        if (!GameCanvas.isTouchControlLargeScreen) {
                            super.center = this.cmdStoreFashionView;
                            return;
                        }

                        this.actView((byte) 32);
                        return;
                    }
                } else if (indexMenu == 3 && getItemFocus(34) != null) {
                    super.left = this.cmdClanStoreBuy;
                    if (!GameCanvas.isTouchControlLargeScreen) {
                        super.center = this.cmdClanStoreView;
                        return;
                    }

                    this.actView((byte) 34);
                }

            } else {
                if (isPaintNonNam) {
                    if (indexMenu == 0) {
                        if (getItemFocus(20) != null) {
                            super.left = this.cmdNonNamBuy;
                            if (!GameCanvas.isTouchControlLargeScreen) {
                                super.center = this.cmdNonNamView;
                            } else {
                                this.actView((byte) 20);
                            }
                        }
                    } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                        this.saleItem();
                    }
                } else if (isPaintNonNu) {
                    if (indexMenu == 0) {
                        if (getItemFocus(21) != null) {
                            super.left = this.cmdNonNuBuy;
                            if (!GameCanvas.isTouchControlLargeScreen) {
                                super.center = this.cmdNonNuView;
                            } else {
                                this.actView((byte) 21);
                            }
                        }
                    } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                        this.saleItem();
                    }
                } else if (isPaintAoNam) {
                    if (indexMenu == 0) {
                        if (getItemFocus(22) != null) {
                            super.left = this.cmdAoNamBuy;
                            if (!GameCanvas.isTouchControlLargeScreen) {
                                super.center = this.cmdAoNamView;
                            } else {
                                this.actView((byte) 22);
                            }
                        }
                    } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                        this.saleItem();
                    }
                } else if (isPaintAoNu) {
                    if (indexMenu == 0) {
                        if (getItemFocus(23) != null) {
                            super.left = this.cmdAoNuBuy;
                            if (!GameCanvas.isTouchControlLargeScreen) {
                                super.center = this.cmdAoNuView;
                            } else {
                                this.actView((byte) 23);
                            }
                        }
                    } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                        this.saleItem();
                    }
                } else if (isPaintGangTayNam) {
                    if (indexMenu == 0) {
                        if (getItemFocus(24) != null) {
                            super.left = this.cmdGangTayNamBuy;
                            if (!GameCanvas.isTouchControlLargeScreen) {
                                super.center = this.cmdGangTayNamView;
                            } else {
                                this.actView((byte) 24);
                            }
                        }
                    } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                        this.saleItem();
                    }
                } else if (isPaintGangTayNu) {
                    if (indexMenu == 0) {
                        if (getItemFocus(25) != null) {
                            super.left = this.cmdGangTayNuBuy;
                            if (!GameCanvas.isTouchControlLargeScreen) {
                                super.center = this.cmdGangTayNuView;
                            } else {
                                this.actView((byte) 25);
                            }
                        }
                    } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                        this.saleItem();
                    }
                } else {
                    Item var1;
                    if (isPaintQuanNam) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(26)) != null) {
                                super.left = new Command(mResources.BUY, 11092, var1);
                                if (!GameCanvas.isTouchControlLargeScreen) {
                                    super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11088, var1);
                                } else {
                                    this.updateItemInfo((int) 26, (Item) var1);
                                }
                            }
                        } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                            this.saleItem();
                        }
                    } else if (isPaintQuanNu) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(27)) != null) {
                                super.left = new Command(mResources.BUY, 11092, var1);
                                if (!GameCanvas.isTouchControlLargeScreen) {
                                    super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11089);
                                } else {
                                    this.updateItemInfo((int) 27, (Item) var1);
                                }
                            }
                        } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                            this.saleItem();
                        }
                    } else if (isPaintGiayNam) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(28)) != null) {
                                super.left = new Command(mResources.BUY, 11092, var1);
                                if (!GameCanvas.isTouchControlLargeScreen) {
                                    super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11090);
                                } else {
                                    this.updateItemInfo((int) 28, (Item) var1);
                                }
                            }
                        } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                            this.saleItem();
                        }
                    } else if (isPaintGiayNu) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(29)) != null) {
                                super.left = new Command(mResources.BUY, 11092, var1);
                                if (!GameCanvas.isTouchControlLargeScreen) {
                                    super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11091);
                                } else {
                                    this.updateItemInfo((int) 29, (Item) var1);
                                }
                            }
                        } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                            this.saleItem();
                        }
                    } else if (isPaintLien) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(16)) != null) {
                                super.left = new Command(mResources.BUY, 11092, var1);
                                if (GameCanvas.isTouchControlLargeScreen) {
                                    this.updateItemInfo((int) 16, (Item) var1);
                                } else {
                                    super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 110923);
                                }
                            } else {
                                isPaintItemInfo = false;
                            }
                        } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                            this.saleItem();
                        }
                    } else if (isPaintNhan) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(17)) != null) {
                                super.left = new Command(mResources.BUY, 11092, var1);
                                if (GameCanvas.isTouchControlLargeScreen) {
                                    this.updateItemInfo((int) 17, (Item) var1);
                                } else {
                                    super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 110924);
                                }
                            } else {
                                isPaintItemInfo = false;
                            }
                        } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                            this.saleItem();
                        }
                    } else if (isPaintNgocBoi) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(18)) != null) {
                                super.left = new Command(mResources.BUY, 11092, var1);
                                if (GameCanvas.isTouchControlLargeScreen) {
                                    this.updateItemInfo((int) 18, (Item) var1);
                                } else {
                                    super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 110925);
                                }
                            } else {
                                isPaintItemInfo = false;
                            }
                        } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                            this.saleItem();
                        }
                    } else if (isPaintPhu) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(19)) != null) {
                                super.left = new Command(mResources.BUY, 11092, var1);
                                if (GameCanvas.isTouchControlLargeScreen) {
                                    this.updateItemInfo((int) 19, (Item) var1);
                                } else {
                                    super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 110926);
                                }
                            } else {
                                isPaintItemInfo = false;
                            }
                        } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                            this.saleItem();
                        }
                    } else if (isPaintWeapon) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(2)) != null) {
                                super.left = new Command(mResources.BUY, 11092, var1);
                                if (GameCanvas.isTouchControlLargeScreen) {
                                    this.updateItemInfo((int) 2, (Item) var1);
                                } else {
                                    super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11093);
                                }
                            } else {
                                isPaintItemInfo = false;
                            }
                        } else if (indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                            this.saleItem();
                        }
                    } else if (isPaintStack) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(6)) != null) {
                                super.left = new Command(mResources.BUY, 11092, var1);
                                if (GameCanvas.isTouchControlLargeScreen) {
                                    this.updateItemInfo((int) 6, (Item) var1);
                                } else {
                                    super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11094);
                                }
                            }
                        } else if (indexMenu == 1) {
                            if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                this.saleItem();
                            } else {
                                super.left = this.cmdBagSortItem;
                            }
                        }
                    } else if (isPaintStackLock) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(7)) != null) {
                                super.left = new Command(mResources.BUY, 11092, var1);
                                if (GameCanvas.isTouchControlLargeScreen) {
                                    this.updateItemInfo((int) 7, (Item) var1);
                                } else {
                                    super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11095);
                                }
                            }
                        } else if (indexMenu == 1) {
                            if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                this.saleItem();
                            } else {
                                super.left = this.cmdBagSortItem;
                            }
                        }
                    } else if (isPaintGrocery) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(8)) != null) {
                                super.left = new Command(mResources.BUY, 11092, var1);
                                if (GameCanvas.isTouchControlLargeScreen) {
                                    this.updateItemInfo((int) 8, (Item) var1);
                                } else {
                                    super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11096);
                                }
                            }
                        } else if (indexMenu == 1) {
                            if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                this.saleItem();
                            } else {
                                super.left = this.cmdBagSortItem;
                            }
                        }
                    } else if (isPaintGroceryLock) {
                        if (indexMenu == 0) {
                            if ((var1 = getItemFocus(9)) != null) {
                                super.left = new Command(mResources.BUY, 11092, var1);
                                if (GameCanvas.isTouchControlLargeScreen) {
                                    this.updateItemInfo((int) 9, (Item) var1);
                                } else {
                                    super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11097);
                                }
                            }
                        } else if (indexMenu == 1) {
                            if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                this.saleItem();
                            } else {
                                super.left = this.cmdBagSortItem;
                            }
                        }
                    } else {
                        int var2;
                        if (isPaintUpGrade) {
                            if (indexMenu == 0) {
                                if (indexTitle == 1) {
                                    if (itemUpGrade != null) {
                                        if (indexSelect == 0) {
                                            super.left = new Command(mResources.SELECT, 11098);
                                            if (GameCanvas.isTouchControlLargeScreen) {
                                                isViewNext = false;
                                                this.updateItemInfo((int) 3, (Item) itemUpGrade);
                                            } else {
                                                super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11099);
                                            }
                                        } else if (indexSelect == 1 && !itemUpGrade.isUpMax()) {
                                            if (GameCanvas.isTouchControlLargeScreen) {
                                                isViewNext = true;
                                                this.updateItemInfo((int) 3, (Item) itemUpGrade);
                                            } else {
                                                super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 110991);
                                            }
                                        }
                                    } else {
                                        isPaintItemInfo = false;
                                    }
                                } else if (indexTitle == 2) {
                                    var1 = getItemFocus(10);
                                    isViewNext = false;
                                    if (var1 != null) {
                                        super.left = new Command(mResources.SELECT, 11100);
                                        if (GameCanvas.isTouchControlLargeScreen) {
                                            this.updateItemInfo((int) 3, (Item) var1);
                                        } else {
                                            super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11101);
                                        }
                                    } else {
                                        super.left = null;
                                        isPaintItemInfo = false;
                                        if (itemUpGrade != null) {
                                            for (var2 = 0; var2 < arrItemUpGrade.length; ++var2) {
                                                if (arrItemUpGrade[var2] != null) {
                                                    super.left = new Command(mResources.BEGIN, 110981);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (indexMenu == 1) {
                                if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                    super.left = new Command(mResources.SELECT, 11102);
                                } else {
                                    super.left = null;
                                }
                            }
                        } else {
                            int var3;
                            if (isPaintConvert) {
                                if (indexMenu == 0) {
                                    if (indexTitle == 1) {
                                        if (indexSelect == 0) {
                                            if (arrItemConvert[0] != null) {
                                                super.left = new Command(mResources.SELECT, 14013);
                                                if (GameCanvas.isTouchControlLargeScreen) {
                                                    this.updateItemInfo((int) 3, (Item) arrItemConvert[indexSelect]);
                                                } else {
                                                    super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 14016);
                                                }
                                            }
                                        } else if (indexSelect == 1) {
                                            if (arrItemConvert[1] != null) {
                                                super.left = new Command(mResources.SELECT, 14013);
                                                if (GameCanvas.isTouchControlLargeScreen) {
                                                    this.updateItemInfo((int) 3, (Item) arrItemConvert[indexSelect]);
                                                } else {
                                                    super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 14016);
                                                }
                                            }
                                        } else {
                                            isPaintItemInfo = false;
                                        }
                                    } else if (indexTitle == 2) {
                                        var1 = null;
                                        if ((var2 = indexSelect + 2) <= arrItemConvert.length - 1) {
                                            var1 = arrItemConvert[var2];
                                        }

                                        if (var1 != null) {
                                            super.left = new Command(mResources.MOVEOUT, 140151);
                                            if (GameCanvas.isTouchControlLargeScreen) {
                                                this.updateItemInfo((int) 3, (Item) var1);
                                            } else {
                                                super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 140161);
                                            }
                                        } else {
                                            super.left = new Command(mResources.BEGIN, 140131);

                                            for (var3 = 0; var3 < arrItemConvert.length; ++var3) {
                                                if (arrItemConvert[var3] == null) {
                                                    super.left = null;
                                                    break;
                                                }
                                            }

                                            isPaintItemInfo = false;
                                        }
                                    }
                                } else if (indexMenu == 1) {
                                    if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                        super.left = new Command(mResources.SELECT, 14012);
                                    } else {
                                        super.left = null;
                                    }
                                }
                            } else {
                                int var13;
                                if (isPaintAuctionSale) {
                                    if (indexMenu == 0) {
                                        if (indexTitle == 2) {
                                            this.tfText.isFocus = true;
                                            super.right = this.tfText.cmdClear;
                                        } else {
                                            this.tfText.isFocus = false;
                                            super.right = this.cmdCloseAll;
                                        }

                                        var13 = 0;

                                        try {
                                            var13 = Integer.parseInt(this.tfText.getText());
                                        } catch (Exception var9) {
                                        }

                                        if (itemSell != null && var13 > 0 && Char.getMyChar().xu >= 5000) {
                                            super.left = new Command(mResources.SALE, 15002);
                                        }

                                        if (indexTitle == 1 && itemSell != null) {
                                            super.left = new Command(mResources.SELECT, 1500);
                                            if (GameCanvas.isTouchControlLargeScreen) {
                                                this.updateItemInfo((int) 3, (Item) itemSell);
                                            } else {
                                                super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 1501);
                                            }
                                        }
                                    } else if (indexMenu == 1) {
                                        super.right = this.cmdCloseAll;
                                        if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                            super.left = new Command(mResources.SELECT, 1503);
                                        } else {
                                            super.left = null;
                                            isPaintItemInfo = false;
                                        }
                                    }
                                } else {
                                    if (isPaintAuctionBuy) {
                                        if (indexTitle == 1 && arrItemStands != null && indexSelect >= 0 && indexSelect < arrItemStands.length && arrItemStands[indexSelect] != null) {
                                            super.left = new Command(mResources.SELECT, 1504);
                                            if (GameCanvas.isTouchControlLargeScreen) {
                                                this.actionPerform(1505, (Object) null);
                                                return;
                                            }

                                            super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 1505);
                                        }

                                        return;
                                    }

                                    if (isPaintSplit) {
                                        if (indexMenu == 0) {
                                            if (indexTitle == 1) {
                                                if (itemSplit != null && itemSplit.upgrade > 0) {
                                                    super.left = new Command(mResources.SELECT, 11103);
                                                } else if (itemSplit != null) {
                                                    super.left = this.cmdSplitMoveOut;
                                                } else {
                                                    isPaintItemInfo = false;
                                                }

                                                if (GameCanvas.isTouchControlLargeScreen) {
                                                    this.updateItemInfo((int) 3, (Item) itemSplit);
                                                } else {
                                                    super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11104, itemSplit);
                                                }
                                            } else if (indexTitle == 2) {
                                                if ((var1 = arrItemSplit[indexSelect]) != null) {
                                                    if (GameCanvas.isTouchControlLargeScreen) {
                                                        this.updateItemInfo((int) 3, (Item) var1);
                                                    } else {
                                                        super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11104, var1);
                                                    }
                                                } else {
                                                    isPaintItemInfo = false;
                                                }

                                                if (itemSplit != null && itemSplit.upgrade > 0) {
                                                    super.left = new Command(mResources.BEGIN, 11105);
                                                }
                                            }
                                        } else if (indexMenu == 1) {
                                            if (Char.getMyChar().arrItemBag[indexSelect] == null) {
                                                super.left = null;
                                                isPaintItemInfo = false;
                                            } else {
                                                super.left = new Command(mResources.SELECT, 11106);
                                            }
                                        }
                                    } else if (isPaintTinhluyen) {
                                        try {
                                            if (indexMenu == 0) {
                                                if (indexTitle == 1) {
                                                    if (itemSplit != null) {
                                                        super.left = new Command(mResources.SELECT, 11103);
                                                    } else {
                                                        isPaintItemInfo = false;
                                                    }

                                                    if (GameCanvas.isTouchControlLargeScreen) {
                                                        this.updateItemInfo((int) 3, (Item) itemSplit);
                                                    } else {
                                                        super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11104, itemSplit);
                                                    }
                                                } else if (indexTitle == 2) {
                                                    if ((var1 = arrItemSplit[indexSelect]) != null) {
                                                        if (GameCanvas.isTouchControlLargeScreen) {
                                                            this.updateItemInfo((int) 3, (Item) var1);
                                                        } else {
                                                            super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11104, var1);
                                                        }

                                                        super.left = new Command(mResources.MOVEOUT, 1605);
                                                    } else {
                                                        isPaintItemInfo = false;
                                                    }

                                                    if (itemSplit != null) {
                                                        super.left = new Command(mResources.SELECT, 1604);
                                                    }
                                                }
                                            } else if (indexMenu == 1) {
                                                if (Char.getMyChar().arrItemBag[indexSelect] == null) {
                                                    super.left = null;
                                                    isPaintItemInfo = false;
                                                } else {
                                                    super.left = new Command(mResources.SELECT, 11106);
                                                }
                                            }
                                        } catch (Exception var8) {
                                        }
                                    } else if (isPaintDichChuyen) {
                                        if (indexMenu == 0) {
                                            if (indexTitle == 1) {
                                                if (itemSplit != null && itemSplit.upgrade > 11) {
                                                    super.left = new Command(mResources.SELECT, 11103);
                                                } else if (itemSplit != null) {
                                                    super.left = this.cmdSplitMoveOut;
                                                } else {
                                                    isPaintItemInfo = false;
                                                }

                                                if (GameCanvas.isTouchControlLargeScreen) {
                                                    this.updateItemInfo((int) 3, (Item) itemSplit);
                                                } else {
                                                    super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11104, itemSplit);
                                                }
                                            } else if (indexTitle == 2) {
                                                if ((var1 = arrItemSplit[indexSelect]) != null) {
                                                    if (GameCanvas.isTouchControlLargeScreen) {
                                                        this.updateItemInfo((int) 3, (Item) var1);
                                                    } else {
                                                        super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11104, var1);
                                                    }
                                                } else {
                                                    isPaintItemInfo = false;
                                                }

                                                if (itemSplit != null && itemSplit.upgrade > 11) {
                                                    super.left = new Command(mResources.SELECT, 1604);
                                                }
                                            }
                                        } else if (indexMenu == 1) {
                                            if (Char.getMyChar().arrItemBag[indexSelect] == null) {
                                                super.left = null;
                                                isPaintItemInfo = false;
                                            } else {
                                                super.left = new Command(mResources.SELECT, 1606);
                                            }
                                        }
                                    } else {
                                        Item var10;
                                        if (isPaintUpPearl) {
                                            if (indexMenu == 0) {
                                                var13 = 0;

                                                for (var2 = 0; var2 < arrItemUpPeal.length; ++var2) {
                                                    if (arrItemUpPeal[var2] != null) {
                                                        ++var13;
                                                        if (var13 >= 2) {
                                                            break;
                                                        }
                                                    }
                                                }

                                                if ((var10 = getItemFocus(11)) != null) {
                                                    if (var13 >= 2) {
                                                        super.left = new Command(mResources.SELECT, 11107);
                                                    } else {
                                                        super.left = new Command(mResources.MOVEOUT, 111071);
                                                    }

                                                    if (GameCanvas.isTouchControlLargeScreen) {
                                                        this.updateItemInfo((int) 3, (Item) var10);
                                                    } else {
                                                        super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11108);
                                                    }
                                                } else {
                                                    isPaintItemInfo = false;
                                                    if (var13 >= 2) {
                                                        super.left = new Command(mResources.BEGIN, 11062);
                                                    }
                                                }
                                            } else if (indexMenu == 1) {
                                                if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                                    super.left = new Command(mResources.SELECT, 11109);
                                                } else {
                                                    isPaintItemInfo = false;
                                                    super.left = null;
                                                }
                                            }
                                        } else if (isPaintLuyenThach) {
                                            if (indexMenu == 0) {
                                                var13 = 0;
                                                var2 = 0;
                                                var3 = 0;
                                                short var4 = 0;

                                                for (int var5 = 0; var5 < arrItemUpPeal.length; ++var5) {
                                                    Item var6;
                                                    if ((var6 = arrItemUpPeal[var5]) != null) {
                                                        if (var6.template.id == 455) {
                                                            ++var13;
                                                        } else if (var6.template.id == 456) {
                                                            ++var2;
                                                        } else if (var6.template.type == 26) {
                                                            var4 = var6.template.id;
                                                            ++var3;
                                                        }
                                                    }

                                                    if (var13 >= 9 || var2 >= 9 || var4 == 10 && var13 >= 3 || var4 == 11 && var2 >= 3) {
                                                        break;
                                                    }
                                                }

                                                Item var11;
                                                if ((var11 = getItemFocus(43)) != null) {
                                                    if (var13 != 9 && var2 != 9 && (var4 != 10 || var13 != 3 || var3 != 1) && (var4 != 11 || var2 != 3 || var3 != 1)) {
                                                        super.left = new Command(mResources.MOVEOUT, 111071);
                                                    } else {
                                                        super.left = new Command(mResources.SELECT, 1601);
                                                    }

                                                    if (GameCanvas.isTouchControlLargeScreen) {
                                                        this.updateItemInfo((int) 43, (Item) var11);
                                                    } else {
                                                        super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 1602);
                                                    }
                                                } else {
                                                    isPaintItemInfo = false;
                                                    if (var13 >= 9 || var2 >= 9 || var4 >= 10 && (var13 >= 3 || var2 >= 3)) {
                                                        super.left = new Command(mResources.BEGIN, 1600);
                                                    }
                                                }
                                            } else if (indexMenu == 1) {
                                                if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                                    super.left = new Command(mResources.SELECT, 1603);
                                                } else {
                                                    isPaintItemInfo = false;
                                                    super.left = null;
                                                }
                                            }
                                        } else if (isPaintTrade) {
                                            if (indexMenu == 0) {
                                                if (indexTitle == 1) {
                                                    if (arrItemTradeMe[indexSelect] != null) {
                                                        if (this.typeTrade == 0) {
                                                            super.left = this.cmdTradeSelectInList;
                                                        } else if (this.typeTrade == 1 && this.typeTradeOrder >= 1 && (long) this.timeTrade - System.currentTimeMillis() / 1000L <= 0L) {
                                                            super.left = this.cmdTradeAccept;
                                                        }

                                                        if (GameCanvas.isTouchControlLargeScreen) {
                                                            var10 = arrItemTradeMe[indexSelect];
                                                            this.updateItemInfo((int) 3, (Item) var10);
                                                        } else {
                                                            super.center = this.cmdTradeViewItemInfo;
                                                        }
                                                    } else {
                                                        isPaintItemInfo = false;
                                                        if (this.typeTrade == 0) {
                                                            super.left = this.cmdTradeLock;
                                                        } else if (this.typeTrade == 1 && this.typeTradeOrder >= 1 && (long) this.timeTrade - System.currentTimeMillis() / 1000L <= 0L) {
                                                            super.left = this.cmdTradeAccept;
                                                        }
                                                    }
                                                }

                                                if (indexTitle == 2) {
                                                    if (arrItemTradeOrder[indexSelect] != null) {
                                                        if (GameCanvas.isTouchControlLargeScreen) {
                                                            var10 = arrItemTradeOrder[indexSelect];
                                                            this.updateItemInfo((int) 30, (Item) var10);
                                                        } else {
                                                            super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11110);
                                                        }
                                                    } else {
                                                        isPaintItemInfo = false;
                                                    }
                                                }
                                            } else if (indexMenu == 1 && this.typeTrade == 0) {
                                                if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                                    super.left = this.cmdTradeSelectInBag;
                                                } else {
                                                    super.left = this.cmdTradeSendMoney;
                                                }
                                            }
                                        } else if (isPaintBox) {
                                            if (indexMenu == 0) {
                                                if ((var1 = getItemFocus(4)) != null) {
                                                    String var12 = mResources.GETOUT;
                                                    if (!svTitle.equals("")) {
                                                        var12 = svAction;
                                                    }

                                                    super.left = new Command(var12, 111101);
                                                    if (GameCanvas.isTouchControlLargeScreen) {
                                                        this.updateItemInfo((int) 4, (Item) var1);
                                                    } else {
                                                        super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11111);
                                                    }
                                                } else if (svTitle.equals("")) {
                                                    super.left = new Command(mResources.SORT, 11112);
                                                }
                                            } else if (indexMenu == 1) {
                                                if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                                    super.left = new Command(mResources.GETIN, 11113);
                                                } else {
                                                    super.left = this.cmdBagSortItem;
                                                }
                                            }
                                        } else if (isPaintPickItem) {
                                            if (indexMenu == 0) {
                                                if (indexSelect >= 0 && indexSelect <= Code.arrItemNhat.length && Code.arrItemNhat[indexSelect] > 0) {
                                                    super.left = new Command(mResources.XOA, 1100077);
                                                } else {
                                                    super.left = new Command(mResources.SORT, 1100078);
                                                }
                                            } else if (indexMenu == 1) {
                                                if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                                    super.left = new Command(mResources.THEM, 1100079);
                                                } else {
                                                    super.left = this.cmdBagSortItem;
                                                }
                                            }
                                        } else if (isPaintDelItem) {
                                            if (indexMenu == 0) {
                                                if (indexSelect >= 0 && indexSelect <= Code.arrItemDel.length && Code.arrItemDel[indexSelect] > 0) {
                                                    super.left = new Command(mResources.XOA, 11000771);
                                                } else {
                                                    super.left = new Command(mResources.SORT, 11000781);
                                                }
                                            } else if (indexMenu == 1) {
                                                if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                                    super.left = new Command(mResources.THEM, 11000791);
                                                } else {
                                                    super.left = this.cmdBagSortItem;
                                                }
                                            }
                                        } else if (!isPaintCheDo) {
                                            if (isPaintLuyenNgoc) {
                                                GameScr var14 = this;

                                                try {
                                                    if (indexMenu == 0) {
                                                        if (indexTitle == 1) {
                                                            if (itemSplit != null) {
                                                                var14.left = new Command(mResources.SELECT, 11103);
                                                            } else {
                                                                isPaintItemInfo = false;
                                                            }

                                                            if (GameCanvas.isTouchControlLargeScreen) {
                                                                var14.updateItemInfo((int) 3, (Item) itemSplit);
                                                            } else {
                                                                var14.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11104, itemSplit);
                                                            }
                                                        } else if (indexTitle == 2) {
                                                            if ((var10 = arrItemSplit[indexSelect]) != null) {
                                                                if (GameCanvas.isTouchControlLargeScreen) {
                                                                    var14.updateItemInfo((int) 3, (Item) var10);
                                                                } else {
                                                                    var14.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11104, var10);
                                                                }

                                                                var14.left = new Command(mResources.MOVEOUT, 1605);
                                                            } else {
                                                                isPaintItemInfo = false;
                                                            }

                                                            if (itemSplit != null) {
                                                                var14.left = new Command(mResources.SELECT, 1604);
                                                            }
                                                        }
                                                    } else if (indexMenu == 1) {
                                                        if (Char.getMyChar().arrItemBag[indexSelect] == null) {
                                                            var14.left = null;
                                                            isPaintItemInfo = false;
                                                        } else {
                                                            var14.left = new Command(mResources.SELECT, 222);
                                                        }
                                                    }
                                                } catch (Exception var7) {
                                                }
                                            } else if (isPaintKhamNgoc) {
                                                if (indexMenu == 0) {
                                                    if (indexTitle == 1) {
                                                        if (itemSplit != null && indexSelect == 0) {
                                                            super.left = new Command(mResources.SELECT, 338);
                                                            if (GameCanvas.isTouchControlLargeScreen) {
                                                                isViewNext = false;
                                                                this.updateItemInfo((int) 3, (Item) itemSplit);
                                                            } else {
                                                                super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 335);
                                                            }
                                                        }

                                                        if (itemUpGrade != null && indexSelect == 1) {
                                                            super.left = new Command(mResources.SELECT, 344);
                                                            if (GameCanvas.isTouchControlLargeScreen) {
                                                                isViewNext = false;
                                                                this.updateItemInfo((int) 3, (Item) itemUpGrade);
                                                            } else {
                                                                super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 336);
                                                            }
                                                        }

                                                        if (itemSplit == null && itemUpGrade == null) {
                                                            isPaintItemInfo = false;
                                                        }
                                                    } else if (indexTitle == 2) {
                                                        var10 = getItemFocus(47);
                                                        isViewNext = false;
                                                        if (var10 != null) {
                                                            super.left = new Command(mResources.SELECT, 345);
                                                            if (GameCanvas.isTouchControlLargeScreen) {
                                                                this.updateItemInfo((int) 3, (Item) var10);
                                                            } else {
                                                                super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11101);
                                                            }
                                                        } else {
                                                            super.left = null;
                                                            isPaintItemInfo = false;
                                                            if (itemUpGrade != null && itemSplit != null) {
                                                                for (var2 = 0; var2 < arrItemUpGrade.length; ++var2) {
                                                                    if (arrItemUpGrade[var2] != null) {
                                                                        super.left = new Command(mResources.BEGIN, 341);
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (indexMenu == 1) {
                                                    if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                                        super.left = new Command(mResources.SELECT, 337);
                                                    } else {
                                                        super.left = null;
                                                    }
                                                }
                                            } else if (isPaintGiaoDo) {
                                                if (indexMenu == 0) {
                                                    var10 = getItemFocus(48);
                                                    isViewNext = false;
                                                    if (var10 != null) {
                                                        super.left = new Command(mResources.SELECT, 401);
                                                        if (GameCanvas.isTouchControlLargeScreen) {
                                                            this.updateItemInfo((int) 3, (Item) var10);
                                                        } else {
                                                            super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11101);
                                                        }
                                                    } else {
                                                        for (var2 = 0; var2 < arrItemSplit.length; ++var2) {
                                                            if (arrItemSplit[var2] != null) {
                                                                super.left = new Command(mResources.TITLEGIAODO[0], 403);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                } else if (indexMenu == 1) {
                                                    if (Char.getMyChar().arrItemBag[indexSelect] != null) {
                                                        super.left = new Command(mResources.SELECT, 400);
                                                    } else {
                                                        super.left = null;
                                                    }
                                                }
                                            } else if (isPaintGotNgoc || isPaintThaoNgoc) {
                                                if (indexMenu == 0) {
                                                    if (itemSplit != null) {
                                                        super.left = new Command(mResources.SELECT, 11103);
                                                    } else {
                                                        isPaintItemInfo = false;
                                                    }

                                                    if (GameCanvas.isTouchControlLargeScreen) {
                                                        this.updateItemInfo((int) 3, (Item) itemSplit);
                                                    } else {
                                                        super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11104, itemSplit);
                                                    }
                                                } else if (indexMenu == 1) {
                                                    if (Char.getMyChar().arrItemBag[indexSelect] == null) {
                                                        super.left = null;
                                                        isPaintItemInfo = false;
                                                    } else {
                                                        super.left = new Command(mResources.SELECT, 405);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                if (isPaintUI() && indexMenu == 1 && Char.getMyChar().arrItemBag[indexSelect] != null) {
                    if (GameCanvas.isTouchControlLargeScreen) {
                        this.updateItemInfo((int) 3, (Item) Char.getMyChar().arrItemBag[indexSelect]);
                        return;
                    }

                    super.center = new Command(GameCanvas.isTouch ? mResources.VIEW : "", 11114);
                }

            }
        }
    }

    public static void setPopupSize(int var0, int var1) {
        if (GameCanvas.w == 128 || GameCanvas.h <= 208) {
            var0 = 126;
            var1 = 160;
        }

        popupW = var0;
        popupH = var1;
        popupX = gW2 - var0 / 2;
        popupY = gH2 - var1 / 2;
        if (GameCanvas.h <= 250) {
            popupY -= 10;
        }

        if (GameCanvas.isTouchControlLargeScreen && !isSmallUI() && GameCanvas.currentScreen instanceof GameScr) {
            popupW = 310;
            popupX = gW / 2 - popupW / 2;
        }

        if (popupY < -10) {
            popupY = -10;
        }

        if (GameCanvas.h > 208 && popupY < 0) {
            popupY = 0;
        }

        if (GameCanvas.h == 208 && popupY < 10) {
            popupY = 10;
        }

    }

    private void paintSkillInfo(mGraphics var1, Skill var2) {
        if (Char.getMyChar().clevel >= var2.level) {
            mFont.tahoma_7_white.drawString(var1, mResources.LEVELNEED + " " + var2.level, xstart + 5, this.yPaint += 12, 0);
        } else {
            mFont.tahoma_7_red.drawString(var1, mResources.LEVELNEED + " " + var2.level, xstart + 5, this.yPaint += 12, 0);
        }

        if (var2.template.type != 0) {
            indexRowMax += 4;
            mFont.tahoma_7_white.drawString(var1, mResources.MAX_FIGHT + ": " + var2.advAD(), xstart + 5, this.yPaint += 12, 0);
            mFont.tahoma_7_white.drawString(var1, mResources.MANA_USE + ": " + var2.manaUse, xstart + 5, this.yPaint += 12, 0);
            mFont.tahoma_7_white.drawString(var1, mResources.RANGE_ATTACK + ": " + var2.advAB(), xstart + 5, this.yPaint += 12, 0);
            mFont var10000 = mFont.tahoma_7_white;
            mGraphics var10001 = var1;
            StringBuffer var10002 = (new StringBuffer(String.valueOf(mResources.TIME_LOOP))).append(": ");
            Skill var3 = var2;
            String var10003;
            if (var2.coolDown % 1000 == 0) {
                var10003 = String.valueOf(var2.coolDown / 1000);
            } else {
                int var4 = var2.coolDown % 1000;
                var10003 = var3.coolDown / 1000 + "." + (var4 % 100 == 0 ? var4 / 100 : var4 / 10);
            }

            var10000.drawString(var10001, var10002.append(var10003).append(" ").append(mResources.SECOND).toString(), xstart + 5, this.yPaint += 12, 0);
        }

        ++indexRowMax;
    }

    private void paintSkillOption(mGraphics var1, Skill var2) {
        SkillOption[] var6 = var2.options;

        for (int var3 = 0; var3 < var6.length; ++var3) {
            SkillOption var4 = var6[var3];
            if (mFont.tahoma_7_white.getWidth(var4.getOptionString()) > 145) {
                MyVector var7 = mFont.tahoma_7_white.splitFontVector(var4.getOptionString(), 145);

                for (int var5 = 0; var5 < var7.size(); ++var5) {
                    mFont.tahoma_7_white.drawString(var1, var7.elementAt(var5).toString(), xstart + 5, this.yPaint += 12, 0);
                    ++indexRowMax;
                }
            } else {
                mFont.tahoma_7_white.drawString(var1, var4.getOptionString(), xstart + 5, this.yPaint += 12, 0);
                ++indexRowMax;
            }
        }

    }

    private void paintKyNang(mGraphics var1) {
        if (indexMenu == 1) {
            resetTranslate(var1);
            Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
            paintTitle(var1, mResources.MENUME[indexMenu], true);
            mFont.tahoma_7b_white.drawString(var1, mResources.SKILL_POINT, popupX + 10, popupY + 32, 0);
            mFont.tahoma_7b_white.drawString(var1, "" + Char.getMyChar().sPoint, popupX + popupW - 10, popupY + 32, 1);
            var1.setColor(0);
            var1.fillRect(popupX + 4, popupY + 44, popupW - 7, indexSize + 3);
            var1.setColor(12281361);
            var1.drawRect(popupX + 5, popupY + 45, popupW - 10, indexSize);
            if (indexTitle >= 1) {
                var1.setColor(Paint.COLORBORDER);
                var1.drawRect(popupX + 5, popupY + 48 + indexSize, popupW - 10, popupH - 64 - indexSize);
            }

            int var2 = Char.getMyChar().nClass.skillTemplates.length;
            xstart = popupX + 5;
            ystart = popupY + 45;
            scrMain.setStyle(var2, indexSize + 2, xstart + 1, ystart, popupW - 12, indexSize + 2, false, 1);
            scrMain.setClip(var1);

            for (int var3 = 0; var3 < var2; ++var3) {
                int var10002 = xstart + var3 * (indexSize + 2) + indexSize / 2;
                SmallImage.drawSmallImage(var1, Char.getMyChar().nClass.skillTemplates[var3].iconId, var10002, ystart + indexSize / 2, 0, 3);
                if (indexTitle == 1 && var3 == indexSelect) {
                    var1.setColor(16777215);
                    var1.drawRect(xstart + var3 * (indexSize + 2) + 2, ystart + 2, indexSize - 4, indexSize - 4);
                    paintSelectHighlight(xstart + var3 * (indexSize + 2), ystart, var1);
                }
            }

            xstart += 8;
            ystart += 6;
            if (indexTitle == 1 && indexSelect >= 0) {
                resetTranslate(var1);
                SkillTemplate var10 = Char.getMyChar().nClass.skillTemplates[indexSelect];
                indexRowMax = 4 + var10.description.length;
                Skill var9 = Char.getMyChar().getSkill(var10);
                int var4 = popupX;
                int var5 = ystart + indexSize + 2;
                int var6 = popupW - 6;
                int var7 = popupH - 70 - indexSize;
                scrInfo.setClip(var1, var4, var5, var6, var7);
                this.yPaint = ystart + 18;
                int var8;
                if (var9 == null) {
                    var9 = var10.skills.length > 1 ? var10.skills[1] : var10.skills[0];
                    mFont.tahoma_7b_red.drawString(var1, "[" + var9.template.id + "]" + var10.name, xstart + 5, this.yPaint += 12, 0);

                    for (var8 = 0; var8 < var10.description.length; ++var8) {
                        mFont.tahoma_7_white.drawString(var1, var10.description[var8], xstart + 5, this.yPaint += 12, 0);
                    }

                    mFont.tahoma_7_white.drawString(var1, mResources.SKILLTYPE[var10.type], xstart + 5, this.yPaint += 12, 0);
                    mFont.tahoma_7_white.drawString(var1, mResources.LEVELMAX + ": " + var10.maxPoint, xstart + 5, this.yPaint += 12, 0);
                    mFont.tahoma_7_red.drawString(var1, mResources.replace(mResources.LEVELNEXT, String.valueOf(var9.point)), xstart + 5, this.yPaint += 12, 0);
                    this.paintSkillInfo(var1, var9);
                    this.paintSkillOption(var1, var9);
                } else {
                    mFont.tahoma_7b_white.drawString(var1, "[" + var9.template.id + "]" + var10.name, xstart + 5, this.yPaint += 12, 0);

                    for (var8 = 0; var8 < var10.description.length; ++var8) {
                        mFont.tahoma_7_white.drawString(var1, var10.description[var8], xstart + 5, this.yPaint += 12, 0);
                    }

                    mFont.tahoma_7_white.drawString(var1, mResources.SKILLTYPE[var10.type], xstart + 5, this.yPaint += 12, 0);
                    mFont.tahoma_7_white.drawString(var1, mResources.LEVELMAX + ": " + var10.maxPoint, xstart + 5, this.yPaint += 12, 0);
                    if (var9.point == var10.maxPoint) {
                        mFont.tahoma_7_blue.drawString(var1, mResources.LEVELEDMAX, xstart + 5, this.yPaint += 12, 0);
                        this.paintSkillInfo(var1, var9);
                        this.paintSkillOption(var1, var9);
                    } else {
                        mFont.tahoma_7_blue.drawString(var1, mResources.replace(mResources.LEVELNOW, String.valueOf(var9.point)), xstart + 5, this.yPaint += 12, 0);
                        this.paintSkillInfo(var1, var9);
                        this.paintSkillOption(var1, var9);

                        for (var8 = 0; var8 < var10.skills.length; ++var8) {
                            if (var10.skills[var8].equals(var9)) {
                                ++var8;
                                break;
                            }
                        }

                        mFont.tahoma_7_red.drawString(var1, mResources.replace(mResources.LEVELNEXT, String.valueOf(var10.skills[var8].point)), xstart + 5, this.yPaint += 12, 0);
                        this.paintSkillInfo(var1, var10.skills[var8]);
                        ++indexRowMax;
                        this.paintSkillOption(var1, var10.skills[var8]);
                    }
                }

                scrInfo.setStyle(indexRowMax, 12, var4, var5, var6, var7, true, 1);
                if (indexRow >= 0) {
                    SmallImage.drawSmallImage(var1, 942, xstart + 2, ystart + 32 + indexRow * 12, 0, StaticObj.TOP_RIGHT);
                }
            }

        }
    }

    private void paintBag(mGraphics var1, String[] var2) {
        try {
            resetTranslate(var1);
            this.paintItemFrame(var1, var2, true);
            this.paintBagItem(var1, Char.getMyChar().arrItemBag);
        } catch (Exception var3) {
            var3.printStackTrace();
        }
    }

    private void paintBagItem(mGraphics var1, Item[] var2) {
        rows = var2.length / columns;
        scrMain.setStyle(rows, indexSize, xstart, ystart, columns * indexSize, 5 * indexSize, true, 6);
        scrMain.setClip(var1, xstart, ystart, scrMain.width + 2, scrMain.height + 2);

        int var3;
        int var4;
        for (var3 = 0; var3 < rows; ++var3) {
            for (var4 = 0; var4 < columns; ++var4) {
                SmallImage.drawSmallImage(var1, 154, xstart + var4 * indexSize + indexSize / 2, ystart + var3 * indexSize + indexSize / 2, 0, 3);
                var1.setColor(12281361);
                var1.drawRect(xstart + var4 * indexSize, ystart + var3 * indexSize, indexSize, indexSize);
            }
        }

        for (var3 = 0; var3 < var2.length; ++var3) {
            Item var7;
            if ((var7 = var2[var3]) != null) {
                int var5 = var7.indexUI / columns;
                int var6 = var7.indexUI - var5 * columns;
                this.paintItem(var1, var7, xstart + var6 * indexSize, ystart + var5 * indexSize);
                if (var7.quantity > 1) {
                    mFont.number_yellow.drawString(var1, "" + var7.quantity, xstart + var6 * indexSize + indexSize, ystart + var5 * indexSize + indexSize - mFont.number_yellow.getHeight(), 1);
                }
            }
        }

        if (indexTitle > 0 && indexSelect >= 0) {
            var3 = indexSelect / columns;
            var4 = indexSelect - var3 * columns;
            var1.setColor(16777215);
            var1.drawRect(xstart + var4 * indexSize, ystart + var3 * indexSize, indexSize, indexSize);
            paintSelectHighlight(xstart + var4 * indexSize, ystart + var3 * indexSize, var1);
        }

    }

    private static void paintSelectHighlight(int var0, int var1, mGraphics var2) {
        var2.drawImage(imgSelect, var0 - 5, var1 - 5, 0);
    }

    private static int upgradeEffectY(int var0) {
        int var1 = indexSize - 2;
        if ((var0 %= var1 * 4) >= 0 && var0 < var1) {
            return 0;
        } else if (var1 <= var0 && var0 < var1 << 1) {
            return var0 % var1;
        } else {
            return var1 << 1 <= var0 && var0 < var1 * 3 ? var1 : var1 - var0 % var1;
        }
    }

    private static int upgradeEffectX(int var0) {
        int var1 = indexSize - 2;
        if ((var0 %= var1 * 4) >= 0 && var0 < var1) {
            return var0 % var1;
        } else if (var1 <= var0 && var0 < var1 << 1) {
            return var1;
        } else {
            return var1 << 1 <= var0 && var0 < var1 * 3 ? var1 - var0 % var1 : 0;
        }
    }

    private void paintShopOnline(mGraphics var1, Item[] var2) {
        try {
            resetTranslate(var1);
            boolean var7 = true;
            String var4 = Name_store;
            Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
            mFont.tahoma_7_white.drawString(var1, mResources.XU + ": " + NinjaUtil.numberToString(String.valueOf(Char.getMyChar().xu)), popupX + 6, popupY + popupH - 26, 0);
            mFont.tahoma_7_white.drawString(var1, mResources.YEN + ": " + NinjaUtil.numberToString(String.valueOf(Char.getMyChar().yen)), popupX + popupW - 6, popupY + popupH - 26, 1);
            if (isPaintTrade) {
                if (GameCanvas.gameTick % 10 > 4) {
                    mFont.tahoma_7_yellow.drawString(var1, mResources.SELECTTRADE, popupX + popupW / 2, popupY + popupH - 14, 2);
                }
            } else if (isPaintUpPearl) {
                if (GameCanvas.gameTick % 10 > 4) {
                    mFont.tahoma_7_yellow.drawString(var1, mResources.SELECTPEARL, popupX + popupW / 2, popupY + popupH - 14, 2);
                }
            } else if (isPaintSplit) {
                if (GameCanvas.gameTick % 10 > 4) {
                    mFont.tahoma_7_yellow.drawString(var1, mResources.SELECT_ITEM, popupX + popupW / 2, popupY + popupH - 14, 2);
                }
            } else {
                mFont.tahoma_7_yellow.drawString(var1, mResources.LUONG + ": " + NinjaUtil.numberToString(String.valueOf(Char.getMyChar().luong)), popupX + popupW / 2, popupY + popupH - 14, 2);
            }

            paintTitle(var1, var4, false);
            xstart = popupX + 3;
            ystart = popupY + 32;
            var1.setColor(6425);
            var1.fillRect(xstart - 1, ystart - 1, columns * indexSize + 3, 5 * indexSize + 3);
            if (var2 == null) {
                GameCanvas.paintShukiren(popupX + 90, popupY + 75, var1, false);
                mFont.tahoma_7b_white.drawString(var1, mResources.PLEASEWAIT, popupX + 90, popupY + 90, 2);
                return;
            }

            if (var2.length <= 30) {
                rows = 5;
            } else if (var2.length % columns == 0) {
                rows = var2.length / columns;
            } else {
                rows = var2.length / columns + 1;
            }

            scrMain.setStyle(rows, indexSize, xstart, ystart, columns * indexSize, 5 * indexSize, true, 6);
            scrMain.setClip(var1, xstart, ystart, scrMain.width + 2, scrMain.height + 2);

            int var3;
            int var8;
            for (var8 = 0; var8 < rows; ++var8) {
                for (var3 = 0; var3 < columns; ++var3) {
                    SmallImage.drawSmallImage(var1, 154, xstart + var3 * indexSize + indexSize / 2, ystart + var8 * indexSize + indexSize / 2, 0, 3);
                    var1.setColor(12281361);
                    var1.drawRect(xstart + var3 * indexSize, ystart + var8 * indexSize, indexSize, indexSize);
                }
            }

            for (var8 = 0; var8 < var2.length; ++var8) {
                Item var9;
                if ((var9 = var2[var8]) != null) {
                    int var10 = var9.indexUI / columns;
                    int var5 = var9.indexUI - var10 * columns;
                    if (!var9.isLock) {
                        var1.setColor(12083);
                        var1.fillRect(xstart + var5 * indexSize + 1, ystart + var10 * indexSize + 1, indexSize - 1, indexSize - 1);
                        SmallImage.drawSmallImage(var1, 154, xstart + var5 * indexSize + indexSize / 2, ystart + var10 * indexSize + indexSize / 2, 0, 3);
                    }

                    SmallImage.drawSmallImage(var1, var9.template.iconID, xstart + var5 * indexSize + indexSize / 2, ystart + var10 * indexSize + indexSize / 2, 0, 3);
                }
            }

            if (indexTitle > 0 && indexSelect >= 0) {
                var8 = indexSelect / columns;
                var3 = indexSelect - var8 * columns;
                var1.setColor(16777215);
                var1.drawRect(xstart + var3 * indexSize, ystart + var8 * indexSize, indexSize, indexSize);
                paintSelectHighlight(xstart + var3 * indexSize, ystart + var8 * indexSize, var1);
                return;
            }
        } catch (Exception var6) {
        }

    }

    private void paintItemList(mGraphics var1, String[] var2, Item[] var3) {
        try {
            resetTranslate(var1);
            this.paintItemFrame(var1, var2, true);
            if (var3 == null) {
                GameCanvas.paintShukiren(popupX + 90, popupY + 75, var1, false);
                mFont.tahoma_7b_white.drawString(var1, mResources.PLEASEWAIT, popupX + 90, popupY + 90, 2);
                return;
            }

            if (var3.length <= 30) {
                rows = 5;
            } else if (var3.length % columns == 0) {
                rows = var3.length / columns;
            } else {
                rows = var3.length / columns + 1;
            }

            scrMain.setStyle(rows, indexSize, xstart, ystart, columns * indexSize, 5 * indexSize, true, 6);
            scrMain.setClip(var1, xstart, ystart, scrMain.width + 2, scrMain.height + 2);

            int var7;
            int var8;
            for (var7 = 0; var7 < rows; ++var7) {
                for (var8 = 0; var8 < columns; ++var8) {
                    SmallImage.drawSmallImage(var1, 154, xstart + var8 * indexSize + indexSize / 2, ystart + var7 * indexSize + indexSize / 2, 0, 3);
                    var1.setColor(12281361);
                    var1.drawRect(xstart + var8 * indexSize, ystart + var7 * indexSize, indexSize, indexSize);
                }
            }

            for (var7 = 0; var7 < var3.length; ++var7) {
                Item var9;
                if ((var9 = var3[var7]) != null) {
                    int var4 = var9.indexUI / columns;
                    int var5 = var9.indexUI - var4 * columns;
                    if (!var9.isLock) {
                        var1.setColor(12083);
                        var1.fillRect(xstart + var5 * indexSize + 1, ystart + var4 * indexSize + 1, indexSize - 1, indexSize - 1);
                        SmallImage.drawSmallImage(var1, 154, xstart + var5 * indexSize + indexSize / 2, ystart + var4 * indexSize + indexSize / 2, 0, 3);
                    }

                    if (GameCanvas.gameTick % 6 == 0) {
                        var9.indexFrame = (var9.indexFrame + 1) % 3;
                    }

                    if (var9.isNewitem()) {
                        var1.drawImage(GameCanvas.backitem, xstart + var5 * indexSize + indexSize / 2, ystart + var4 * indexSize + indexSize / 2, 3);
                    }

                    SmallImage.drawSmallImage(var1, var9.template.iconID, xstart + var5 * indexSize + indexSize / 2, ystart + var4 * indexSize + indexSize / 2, 0, 3, var9.indexFrame);
                }
            }

            if (indexTitle > 0 && indexSelect >= 0) {
                var7 = indexSelect / columns;
                var8 = indexSelect - var7 * columns;
                var1.setColor(16777215);
                var1.drawRect(xstart + var8 * indexSize, ystart + var7 * indexSize, indexSize, indexSize);
                paintSelectHighlight(xstart + var8 * indexSize, ystart + var7 * indexSize, var1);
                return;
            }
        } catch (Exception var6) {
        }

    }

    private void paintItemFrame(mGraphics var1, String[] var2, boolean var3) {
        Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
        if (var3) {
            mFont.tahoma_7_white.drawString(var1, mResources.XU + ": " + NinjaUtil.numberToString(String.valueOf(Char.getMyChar().xu)), popupX + 6, popupY + popupH - 26, 0);
            mFont.tahoma_7_white.drawString(var1, mResources.YEN + ": " + NinjaUtil.numberToString(String.valueOf(Char.getMyChar().yen)), popupX + popupW - 6, popupY + popupH - 26, 1);
            if (isPaintTrade) {
                if (GameCanvas.gameTick % 10 > 4) {
                    mFont.tahoma_7_yellow.drawString(var1, mResources.SELECTTRADE, popupX + popupW / 2, popupY + popupH - 14, 2);
                }
            } else if (isPaintUpPearl) {
                if (GameCanvas.gameTick % 10 > 4) {
                    mFont.tahoma_7_yellow.drawString(var1, mResources.SELECTPEARL, popupX + popupW / 2, popupY + popupH - 14, 2);
                }
            } else if (isPaintSplit) {
                if (GameCanvas.gameTick % 10 > 4) {
                    mFont.tahoma_7_yellow.drawString(var1, mResources.SELECT_ITEM, popupX + popupW / 2, popupY + popupH - 14, 2);
                }
            } else {
                mFont.tahoma_7_yellow.drawString(var1, mResources.LUONG + ": " + NinjaUtil.numberToString(String.valueOf(Char.getMyChar().luong)), popupX + popupW / 2, popupY + popupH - 14, 2);
            }
        }

        paintTitle(var1, var2[indexMenu], var2.length > 1);
        xstart = popupX + 3;
        ystart = popupY + 32;
        var1.setColor(6425);
        var1.fillRect(xstart - 1, ystart - 1, columns * indexSize + 3, 5 * indexSize + 3);
    }

    private void paintItem(mGraphics var1, Item var2, int var3, int var4) {
        this.paintItem(var1, var2, var3, var4, 0, 0);
    }

    private void paintItem(mGraphics var1, Item var2, int var3, int var4, int var5, int var6) {
        if (!var2.isTypeMounts()) {
            if ((var5 += var2.upgrade) > 0) {
                if (var5 >= 4) {
                    var1.setColor(this.color[var5 > 16 ? 16 : var5]);
                    var1.fillRect(var3 + 1 + var6, var4 + 1 + var6, indexSize - 1 - var6 * 2, indexSize - 1 - var6 * 2);
                    SmallImage.drawSmallImage(var1, 154, var3 + indexSize / 2, var4 + indexSize / 2, 0, 3);
                } else {
                    paintItemBackground(var1, var2, var3, var4, var6);
                }

                if (var5 >= 1) {
                    int var10001 = var3 + indexSize / 2;
                    int var10002 = var4 + indexSize / 2;
                    mGraphics var8 = var1;
                    int var7 = var5;
                    var6 = var10002;
                    var5 = var10001;
                    GameScr var14 = this;
                    int var9 = indexSize - 2;
                    int var10 = var7 < 4 ? 0 : (var7 < 8 ? 1 : (var7 < 12 ? 2 : (var7 <= 14 ? 3 : 4)));

                    int var11;
                    int var12;
                    int var13;
                    for (var11 = 0; var11 < var14.size.length; ++var11) {
                        var12 = var5 - var9 / 2 + upgradeEffectX(GameCanvas.gameTick - (var11 << 2));
                        var13 = var6 - var9 / 2 + upgradeEffectY(GameCanvas.gameTick - (var11 << 2));
                        var8.setColor(var14.colorBorder[var10][var11]);
                        var8.fillRect(var12 - var14.size[var11] / 2, var13 - var14.size[var11] / 2, var14.size[var11], var14.size[var11]);
                    }

                    if (var7 == 4 || var7 == 8) {
                        for (var11 = 0; var11 < var14.size.length; ++var11) {
                            var12 = var5 - var9 / 2 + upgradeEffectX(GameCanvas.gameTick - (var9 << 1) - (var11 << 2));
                            var13 = var6 - var9 / 2 + upgradeEffectY(GameCanvas.gameTick - (var9 << 1) - (var11 << 2));
                            var8.setColor(var14.colorBorder[var10 - 1][var11]);
                            var8.fillRect(var12 - var14.size[var11] / 2, var13 - var14.size[var11] / 2, var14.size[var11], var14.size[var11]);
                        }
                    }

                    if (var7 != 1 && var7 != 4 && var7 != 8) {
                        for (var11 = 0; var11 < var14.size.length; ++var11) {
                            var12 = var5 - var9 / 2 + upgradeEffectX(GameCanvas.gameTick - (var9 << 1) - (var11 << 2));
                            var13 = var6 - var9 / 2 + upgradeEffectY(GameCanvas.gameTick - (var9 << 1) - (var11 << 2));
                            var8.setColor(var14.colorBorder[var10][var11]);
                            var8.fillRect(var12 - var14.size[var11] / 2, var13 - var14.size[var11] / 2, var14.size[var11], var14.size[var11]);
                        }
                    }

                    if (var7 != 1 && var7 != 4 && var7 != 8 && var7 != 12 && var7 != 2 && var7 != 5 && var7 != 9) {
                        for (var11 = 0; var11 < var14.size.length; ++var11) {
                            var12 = var5 - var9 / 2 + upgradeEffectX(GameCanvas.gameTick - var9 - (var11 << 2));
                            var13 = var6 - var9 / 2 + upgradeEffectY(GameCanvas.gameTick - var9 - (var11 << 2));
                            var8.setColor(var14.colorBorder[var10][var11]);
                            var8.fillRect(var12 - var14.size[var11] / 2, var13 - var14.size[var11] / 2, var14.size[var11], var14.size[var11]);
                        }
                    }

                    if (var7 != 1 && var7 != 4 && var7 != 8 && var7 != 12 && var7 != 2 && var7 != 5 && var7 != 9 && var7 != 13 && var7 != 3 && var7 != 6 && var7 != 10 && var7 != 15) {
                        for (var11 = 0; var11 < var14.size.length; ++var11) {
                            var12 = var5 - var9 / 2 + upgradeEffectX(GameCanvas.gameTick - var9 * 3 - (var11 << 2));
                            var13 = var6 - var9 / 2 + upgradeEffectY(GameCanvas.gameTick - var9 * 3 - (var11 << 2));
                            var8.setColor(var14.colorBorder[var10][var11]);
                            var8.fillRect(var12 - var14.size[var11] / 2, var13 - var14.size[var11] / 2, var14.size[var11], var14.size[var11]);
                        }
                    }
                }
            } else {
                paintItemBackground(var1, var2, var3, var4, var6);
            }
        }

        if (GameCanvas.gameTick % 6 == 0) {
            var2.indexFrame = (var2.indexFrame + 1) % 3;
        }

        if (var2.isNewitem()) {
            var1.drawImage(GameCanvas.backitem, var3 + indexSize / 2, var4 + indexSize / 2, 3);
        }

        SmallImage.drawSmallImage(var1, var2.template.iconID, var3 + indexSize / 2, var4 + indexSize / 2, 0, 3, var2.indexFrame);
    }

    private static void paintItemBackground(mGraphics var0, Item var1, int var2, int var3, int var4) {
        if (!var1.isLock) {
            var0.setColor(12083);
        } else {
            var0.setColor(6425);
        }

        var0.fillRect(var2 + 1 + var4, var3 + 1 + var4, indexSize - 2 - var4 * 2, indexSize - 2 - var4 * 2);
        SmallImage.drawSmallImage(var0, 154, var2 + indexSize / 2, var3 + indexSize / 2, 0, 3);
    }

    private void paintSplit(mGraphics var1, String[] var2) {
        try {
            Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
            paintTitle(var1, var2[indexMenu], var2.length > 1);
            xstart = popupX + 3;
            ystart = popupY + 34 + indexSize;
            int var10 = popupX + 74;
            int var3 = ystart - indexSize - 3;
            rows = 4;
            if (itemSplit != null) {
                this.paintItem(var1, itemSplit, var10, var3);
            } else {
                var1.setColor(6425);
                var1.fillRect(var10 - 1, var3 - 1, indexSize + 3, indexSize + 3);
                SmallImage.drawSmallImage(var1, 154, var10 + indexSize / 2, var3 + indexSize / 2, 0, 3);
            }

            var1.setColor(12281361);
            var1.drawRect(var10, var3, indexSize, indexSize);
            var1.setColor(6425);
            var1.fillRect(xstart - 1, ystart - 1, indexSize * columns + 3, indexSize * rows + 3);

            int var4;
            int var8;
            for (var8 = 0; var8 < rows; ++var8) {
                for (var4 = 0; var4 < columns; ++var4) {
                    SmallImage.drawSmallImage(var1, 154, xstart + var4 * indexSize + indexSize / 2, ystart + var8 * indexSize + indexSize / 2, 0, 3);
                    var1.setColor(12281361);
                    var1.drawRect(xstart + var4 * indexSize, ystart + var8 * indexSize, indexSize, indexSize);
                }
            }

            for (var8 = 0; var8 < arrItemSplit.length; ++var8) {
                Item var11;
                if ((var11 = arrItemSplit[var8]) != null) {
                    int var5 = var8 / columns;
                    int var6 = var8 - var5 * columns;
                    if (!var11.isLock) {
                        var1.setColor(12083);
                        var1.fillRect(xstart + var6 * indexSize + 1, ystart + var5 * indexSize + 1, indexSize - 1, indexSize - 1);
                    }

                    SmallImage.drawSmallImage(var1, var11.template.iconID, xstart + var6 * indexSize + indexSize / 2, ystart + var5 * indexSize + indexSize / 2, 0, 3);
                }
            }

            if (indexTitle == 1) {
                var1.setColor(16777215);
                var1.drawRect(var10, var3, indexSize, indexSize);
            } else if (indexTitle == 2) {
                var8 = indexSelect / columns;
                var4 = indexSelect - var8 * columns;
                var1.setColor(16777215);
                var1.drawRect(xstart + var4 * indexSize, ystart + var8 * indexSize, indexSize, indexSize);
            }

            if (effUpok != null) {
                SmallImage.drawSmallImage(var1, effUpok.arrEfInfo[indexEff].idImg, var10 + indexSize / 2 + effUpok.arrEfInfo[indexEff].dx, var3 + indexSize / 2 + effUpok.arrEfInfo[indexEff].dy, 0, 3);
                if (GameCanvas.gameTick % 2 == 0 && ++indexEff >= effUpok.arrEfInfo.length) {
                    indexEff = 0;
                    effUpok = null;
                }
            }

            if (isPaintTinhluyen && itemSplit != null) {
                ItemOption var9 = null;

                for (var4 = 0; var4 < itemSplit.options.size() && (var9 = (ItemOption) itemSplit.options.elementAt(var4)).optionTemplate.id != 85; ++var4) {
                    var9 = null;
                }

                if (var9 != null) {
                    int[] var13 = new int[]{60, 45, 34, 26, 20, 15, 11, 8, 6};
                    int[] var12 = new int[]{150000, 247500, 408375, 673819, 1111801, 2056832, 4010822, 7420021, 12243035};
                    byte[] var14 = new byte[]{3, 5, 9, 4, 7, 10, 5, 7, 9};
                    mFont.tahoma_7_yellow.drawString(var1, mResources.LEVEL_TINHLUYEN + ": " + NinjaUtil.numberToString(String.valueOf(var9.param + 1)), xstart + 1, ystart + 114, 0);
                    mFont.tahoma_7_yellow.drawString(var1, mResources.PERCENT1 + var13[var9.param] + "%)", xstart + 70, ystart + 114, 0);
                    mFont.tahoma_7_yellow.drawString(var1, mResources.NEED + ": " + NinjaUtil.numberToString(String.valueOf(var12[var9.param])) + " " + mResources.YEN + ", " + var14[var9.param] + " " + (var9.param < 3 ? mResources.TUTINH[1] : (var9.param < 6 ? mResources.TUTINH[2] : mResources.TUTINH[3])), xstart + 1, ystart + 126, 0);
                    return;
                }

                mFont.tahoma_7_red.drawString(var1, mResources.CAN_NOT_TINHLUYEN, xstart + 1, ystart + 120, 0);
                return;
            }
        } catch (Exception var7) {
            var7.printStackTrace();
        }

    }

    private void paintUpPearl(mGraphics var1, String[] var2) {
        try {
            resetTranslate(var1);
            Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
            paintTitle(var1, var2[indexMenu], var2.length > 1);
            xstart = popupX + 3;
            ystart = popupY + 32;
            var1.setColor(6425);
            rows = 4;
            int var3;
            int var7;
            int var8;
            if (!isPaintUpPearl) {
                mFont.tahoma_7_white.drawString(var1, mResources.LUYEN_THACH[0], xstart + 3, ystart + rows * indexSize + 9, 0);
                mFont.tahoma_7_white.drawString(var1, mResources.LUYEN_THACH[1], xstart + 3, ystart + rows * indexSize + 21, 0);
                mFont.tahoma_7_white.drawString(var1, mResources.LUYEN_THACH[2], xstart + 3, ystart + rows * indexSize + 33, 0);
            } else {
                var7 = 0;
                var8 = 0;
                var3 = 0;
                boolean var4 = false;

                int var5;
                for (var5 = 0; var5 < arrItemUpPeal.length; ++var5) {
                    if (arrItemUpPeal[var5] != null) {
                        if (arrItemUpPeal[var5].isLock) {
                            var4 = true;
                        }

                        var7 += crystals[arrItemUpPeal[var5].template.id];
                        ++var8;
                    }
                }

                if (var7 > 0) {
                    for (var3 = crystals.length - 1; var3 >= 0 && var7 <= crystals[var3]; --var3) {
                    }
                }

                if (var3 >= crystals.length - 1) {
                    var3 = crystals.length - 2;
                }

                if (isTypeXu) {
                    if (var8 > 1) {
                        mFont.tahoma_7_yellow.drawString(var1, mResources.CRYSTALOUT + " " + (var3 + 2) + " " + (var4 ? mResources.LOCK : ""), xstart + 3, ystart + rows * indexSize + 9, 0);
                        if (coinUpCrystals[var3 + 1] > Char.getMyChar().xu) {
                            mFont.tahoma_7_red.drawString(var1, mResources.replace(mResources.COINNEED, NinjaUtil.numberToString(String.valueOf(coinUpCrystals[var3 + 1]))), xstart + 3, ystart + rows * indexSize + 21, 0);
                        } else {
                            mFont.tahoma_7_yellow.drawString(var1, mResources.replace(mResources.COINNEED, NinjaUtil.numberToString(String.valueOf(coinUpCrystals[var3 + 1]))), xstart + 3, ystart + rows * indexSize + 21, 0);
                        }

                        mFont.tahoma_7_yellow.drawString(var1, mResources.PERCENT + ": " + var7 * 100 / crystals[var3 + 1] + "%", xstart + 3, ystart + rows * indexSize + 33, 0);
                    } else {
                        for (var5 = 1; var5 <= 2; ++var5) {
                            mFont.tahoma_7_white.drawString(var1, mResources.HELPCRYSTAL[var5], xstart + 3, ystart + rows * indexSize + 5 + (var5 - 1) * 12, 0);
                        }
                    }
                } else if (var8 > 1) {
                    mFont.tahoma_7_yellow.drawString(var1, mResources.CRYSTALOUT + " " + (var3 + 2) + " " + mResources.LOCK, xstart + 3, ystart + rows * indexSize + 9, 0);
                    if (coinUpCrystals[var3 + 1] > Char.getMyChar().xu + Char.getMyChar().yen) {
                        mFont.tahoma_7_red.drawString(var1, mResources.replace(mResources.COINLOCKNEED, NinjaUtil.numberToString(String.valueOf(coinUpCrystals[var3 + 1]))), xstart + 3, ystart + rows * indexSize + 21, 0);
                    } else {
                        mFont.tahoma_7_yellow.drawString(var1, mResources.replace(mResources.COINLOCKNEED, NinjaUtil.numberToString(String.valueOf(coinUpCrystals[var3 + 1]))), xstart + 3, ystart + rows * indexSize + 21, 0);
                    }

                    mFont.tahoma_7_yellow.drawString(var1, mResources.PERCENT + ": " + var7 * 100 / crystals[var3 + 1] + "%", xstart + 3, ystart + rows * indexSize + 33, 0);
                } else {
                    for (var5 = 0; var5 < 3; ++var5) {
                        mFont.tahoma_7_white.drawString(var1, mResources.HELPCRYSTAL[var5], xstart + 3, ystart + rows * indexSize + 5 + var5 * 12, 0);
                    }
                }
            }

            var1.setColor(0);
            var1.fillRect(xstart, ystart, columns * indexSize + 1, rows * indexSize + 1);

            for (var7 = 0; var7 < rows; ++var7) {
                for (var8 = 0; var8 < columns; ++var8) {
                    SmallImage.drawSmallImage(var1, 154, xstart + var8 * indexSize + indexSize / 2, ystart + var7 * indexSize + indexSize / 2, 0, 3);
                    var1.setColor(12281361);
                    var1.drawRect(xstart + var8 * indexSize, ystart + var7 * indexSize, indexSize, indexSize);
                }
            }

            for (var7 = 0; var7 < arrItemUpPeal.length; ++var7) {
                Item var9;
                if ((var9 = arrItemUpPeal[var7]) != null) {
                    var3 = var7 / columns;
                    int var10 = var7 - var3 * columns;
                    if (!var9.isLock) {
                        var1.setColor(4543829);
                        var1.fillRect(xstart + var10 * indexSize + 1, ystart + var3 * indexSize + 1, indexSize - 1, indexSize - 1);
                    }

                    SmallImage.drawSmallImage(var1, var9.template.iconID, xstart + var10 * indexSize + indexSize / 2, ystart + var3 * indexSize + indexSize / 2, 0, 3);
                }
            }

            if (indexTitle > 0) {
                var7 = indexSelect / columns;
                var8 = indexSelect - var7 * columns;
                var1.setColor(16777215);
                var1.drawRect(xstart + var8 * indexSize, ystart + var7 * indexSize, indexSize, indexSize);
            }

            if (effUpok != null) {
                SmallImage.drawSmallImage(var1, effUpok.arrEfInfo[indexEff].idImg, xstart + indexSize / 2 + effUpok.arrEfInfo[indexEff].dx + 1, ystart + indexSize / 2 + 9 + effUpok.arrEfInfo[indexEff].dy, 0, 3);
                if (GameCanvas.gameTick % 2 == 0 && ++indexEff >= effUpok.arrEfInfo.length) {
                    indexEff = 0;
                    effUpok = null;
                    return;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
        }

    }

    private void paintUILuckySprin(mGraphics var1) {
        if (isPaintLuckySpin) {
            resetTranslate(var1);
            Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
            int var2 = popupW;
            if (GameCanvas.isTouchControlLargeScreen) {
                var2 = popupW / 2 + 20;
            }

            var1.setColor(0);
            var1.fillRect(popupX + 7, popupY + 31, var2 - 14, popupH - 58);
            var1.setColor(-3170504);
            var1.drawRect(popupX + 8, popupY + 32, var2 - 16, popupH - 60);
            var1.setColor(Paint.COLORBACKGROUND);
            var1.fillRect(popupX + 9, popupY + 33, var2 - 18, popupH - 62);
            paintTitle(var1, mResources.LATQUA, false);
            xstart = popupX + 33;
            ystart = popupY + 40;

            int var3;
            for (var2 = 0; var2 < 3; ++var2) {
                for (var3 = 0; var3 < 3; ++var3) {
                    var1.setColor(Paint.COLORDARK);
                    var1.fillRect(xstart + var3 * 40, ystart + 10 + var2 * 40, 29, 29);
                    var1.setColor(-6527695);
                    var1.drawRect(xstart + var3 * 40, ystart + 10 + var2 * 40, 29, 29);
                    var1.setColor(-6737152);
                    var1.fillRect(xstart + var3 * 40 + 2, ystart + 12 + var2 * 40, 26, 26);
                    var1.setColor(Paint.COLORDARK);
                    var1.fillRect(xstart + var3 * 40 + 4, ystart + 14 + var2 * 40, 22, 22);
                    SmallImage.drawSmallImage(var1, 1414, xstart + var3 * 40 + 20 - 5, ystart + var2 * 40 + 20 + 4, 0, StaticObj.VCENTER_HCENTER);
                }
            }

            for (var2 = 0; var2 < 9; ++var2) {
                mGraphics var10000;
                int var10001;
                int var4;
                label75:
                {
                    var3 = var2 / 3;
                    var4 = var2 - var3 * 3;
                    if (arrItemSprin != null) {
                        var1.setColor(-16770791);
                        var1.fillRect(xstart + var4 * 40 + 4, ystart + 14 + var3 * 40, 22, 22);
                        var1.setColor(var2 == indexSelect ? -1 : -6527695);
                        var1.drawRect(xstart + var4 * 40 + 4, ystart + 14 + var3 * 40, 21, 21);
                        SmallImage.drawSmallImage(var1, 154, xstart + var4 * 40 + 17 - 3, ystart + 7 + var3 * 40 + 17, 0, 3);
                        if (System.currentTimeMillis() - this.timePoint < 1000L) {
                            if (var2 == indexCard) {
                                SmallImage.drawSmallImage(var1, ItemTemplates.getIcon(arrItemSprin[indexCard]), xstart + var4 * 40 + 17 - 3, ystart + 7 + var3 * 40 + 17, 0, 3);
                            } else {
                                SmallImage.drawSmallImage(var1, 1414, xstart + var4 * 40 + 17 - 2, ystart + 7 + var3 * 40 + 17, 0, StaticObj.VCENTER_HCENTER);
                            }
                        } else if (arrItemSprin[var2] >= 0 && arrItemSprin[var2] < ItemTemplates.itemTemplates.h.size()) {
                            SmallImage.drawSmallImage(var1, ItemTemplates.getIcon(arrItemSprin[var2]), xstart + var4 * 40 + 17 - 3, ystart + 7 + var3 * 40 + 17, 0, 3);
                        } else {
                            SmallImage.drawSmallImage(var1, ItemTemplates.getIcon((short) 242), xstart + var4 * 40 + 17 - 3, ystart + 7 + var3 * 40 + 17, 0, 3);
                        }

                        if (indexCard == var2 && this.yenTemp > 0) {
                            this.yenValue[var2] = String.valueOf(this.yenTemp);
                        }

                        if (indexTitle != 1) {
                            continue;
                        }

                        if (indexCard == var2 && GameCanvas.gameTick % 10 > 4) {
                            var10000 = var1;
                            var10001 = -3368653;
                            break label75;
                        }

                        if (var2 == indexSelect) {
                            var10000 = var1;
                            var10001 = -1;
                            break label75;
                        }

                        var10000 = var1;
                    } else {
                        if (indexTitle != 1) {
                            continue;
                        }

                        var10000 = var1;
                        if (var2 == indexSelect) {
                            var10001 = -1;
                            break label75;
                        }
                    }

                    var10001 = Paint.COLORLIGHT;
                }

                var10000.setColor(var10001);
                var1.drawRect(xstart + var4 * 40, ystart + 10 + var3 * 40, 29, 29);
            }

            mFont.tahoma_7_yellow.drawString(var1, mResources.LUOTLATQUA + this.numSprinLeft, popupX + popupW / 2, popupY + popupH - 20, 2);
        }

    }

    private void paintThuoc(mGraphics var1) {
        if (isPaintStack) {
            if (indexMenu == 0) {
                this.paintItemList(var1, mResources.TITLESTACK, arrItemStack);
                return;
            }

            if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLESTACK);
            }
        }

    }

    private void paintThuocKhoa(mGraphics var1) {
        if (isPaintStackLock) {
            if (indexMenu == 0) {
                this.paintItemList(var1, mResources.TITLESTACKLOCK, arrItemStackLock);
                return;
            }

            if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLESTACKLOCK);
            }
        }

    }

    private void paintTaphoa(mGraphics var1) {
        if (isPaintGrocery) {
            if (indexMenu == 0) {
                this.paintItemList(var1, mResources.TITLEGROCERY, arrItemGrocery);
                return;
            }

            if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLEGROCERY);
            }
        }

    }

    private void paintTaphoakhoa(mGraphics var1) {
        if (isPaintGroceryLock) {
            if (indexMenu == 0) {
                this.paintItemList(var1, mResources.TITLEGROCERYLOCK, arrItemGroceryLock);
                return;
            }

            if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLEGROCERYLOCK);
            }
        }

    }

    private void paintCuonghoa(mGraphics var1) {
        if (isPaintUpGrade) {
            if (indexMenu == 0) {
                String[] var2 = mResources.TITLEUPGRADE;
                var1 = var1;
                GameScr var8 = this;

                try {
                    rows = 3;
                    Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
                    paintTitle(var1, var2[indexMenu], var2.length > 1);
                    xstart = popupX + 3;
                    ystart = popupY + 34 + indexSize;
                    int var10 = popupX + 45;
                    int var3 = popupX + 100;
                    int var4 = ystart - indexSize - 3;
                    if (itemUpGrade != null) {
                        var8.paintItem(var1, itemUpGrade, var10, var4);
                        var1.setColor(12281361);
                        var1.drawRect(var10, var4, indexSize, indexSize);
                        mFont.tahoma_7_yellow.drawString(var1, "(+" + itemUpGrade.upgrade + ")", var10 - 5, var4 + indexSize / 2 - 5, 1);
                    } else {
                        var1.setColor(6425);
                        var1.fillRect(var10 - 1, var4 - 1, indexSize + 3, indexSize + 3);
                        SmallImage.drawSmallImage(var1, 154, var10 + indexSize / 2, var4 + indexSize / 2, 0, 3);
                        var1.setColor(12281361);
                        var1.drawRect(var10, var4, indexSize, indexSize);
                    }

                    SmallImage.drawSmallImage(var1, 942, var10 + 43, ystart - 15, 0, StaticObj.VCENTER_HCENTER);
                    if (itemUpGrade != null && !itemUpGrade.isUpMax()) {
                        var8.paintItem(var1, itemUpGrade, var3, var4, 1, 0);
                        var1.setColor(12281361);
                        var1.drawRect(var3, var4, indexSize, indexSize);
                        mFont.tahoma_7_yellow.drawString(var1, "(+" + (itemUpGrade.upgrade + 1) + ")", var3 + indexSize + 10, var4 + indexSize / 2 - 5, 0);
                    } else {
                        var1.setColor(6425);
                        var1.fillRect(var3 - 1, var4 - 1, indexSize + 3, indexSize + 3);
                        SmallImage.drawSmallImage(var1, 154, var3 + indexSize / 2, var4 + indexSize / 2, 0, 3);
                        var1.setColor(12281361);
                        var1.drawRect(var3, var4, indexSize, indexSize);
                    }

                    if (indexTitle == 1) {
                        if (indexSelect == 0) {
                            var1.setColor(16777215);
                            var1.drawRect(var10, var4, indexSize, indexSize);
                        }

                        if (indexSelect == 1) {
                            var1.setColor(16777215);
                            var1.drawRect(var3, var4, indexSize, indexSize);
                        }
                    }

                    int var5;
                    int var9;
                    if (itemUpGrade == null) {
                        for (var9 = 0; var9 < 3; ++var9) {
                            mFont.tahoma_7_white.drawString(var1, mResources.HELPUPGRADE[var9], xstart, ystart + rows * indexSize + 5 + var9 * 12, 0);
                        }
                    } else if (itemUpGrade.isUpMax()) {
                        if (!GameCanvas.isTouchControlLargeScreen) {
                            mFont.tahoma_7_yellow.drawString(var1, mResources.HELPUPGRADE[3], popupX + popupW / 2, ystart + rows * indexSize + 5, 2);
                        } else {
                            mFont.tahoma_7_yellow.drawString(var1, mResources.HELPUPGRADE[3], popupX + 7, ystart + rows * indexSize + 5, 0);
                        }
                    } else {
                        var9 = 0;

                        for (var3 = 0; var3 < arrItemUpGrade.length; ++var3) {
                            if (arrItemUpGrade[var3] != null && arrItemUpGrade[var3].template.type == 26) {
                                var9 += crystals[arrItemUpGrade[var3].template.id];
                            }
                        }

                        var5 = 0;
                        if (itemUpGrade.isTypeClothe()) {
                            if ((var3 = var9 * 100 / upClothe[itemUpGrade.upgrade]) > maxPercents[itemUpGrade.upgrade]) {
                                var3 = maxPercents[itemUpGrade.upgrade];
                            }

                            if (isPaintUpGradeGold) {
                                var3 = (int) ((double) var3 * 1.5D);
                                var5 = goldUps[itemUpGrade.upgrade];
                            }

                            if (coinUpClothes[itemUpGrade.upgrade] > Char.getMyChar().xu + Char.getMyChar().yen) {
                                mFont.tahoma_7_red.drawString(var1, mResources.replace(mResources.COINLOCKNEED, NinjaUtil.numberToString(String.valueOf(coinUpClothes[itemUpGrade.upgrade]))), xstart, ystart + rows * indexSize + 5, 0);
                            } else {
                                mFont.tahoma_7_yellow.drawString(var1, mResources.replace(mResources.COINLOCKNEED, NinjaUtil.numberToString(String.valueOf(coinUpClothes[itemUpGrade.upgrade]))), xstart, ystart + rows * indexSize + 5, 0);
                            }

                            if (var5 > Char.getMyChar().luong) {
                                mFont.tahoma_7_red.drawString(var1, mResources.replace(mResources.GOLDNEED, String.valueOf(var5)), xstart, ystart + rows * indexSize + 17, 0);
                            } else {
                                mFont.tahoma_7_yellow.drawString(var1, mResources.replace(mResources.GOLDNEED, String.valueOf(var5)), xstart, ystart + rows * indexSize + 17, 0);
                            }

                            mFont.tahoma_7_yellow.drawString(var1, mResources.PERCENT + ": " + var3 + "%", xstart, ystart + rows * indexSize + 29, 0);
                        } else if (itemUpGrade.isTypeAdorn()) {
                            if ((var3 = var9 * 100 / upAdorn[itemUpGrade.upgrade]) > maxPercents[itemUpGrade.upgrade]) {
                                var3 = maxPercents[itemUpGrade.upgrade];
                            }

                            if (isPaintUpGradeGold) {
                                var3 = (int) ((double) var3 * 1.5D);
                                var5 = goldUps[itemUpGrade.upgrade];
                            }

                            if (coinUpAdorns[itemUpGrade.upgrade] > Char.getMyChar().xu + Char.getMyChar().yen) {
                                mFont.tahoma_7_red.drawString(var1, mResources.replace(mResources.COINLOCKNEED, NinjaUtil.numberToString(String.valueOf(coinUpAdorns[itemUpGrade.upgrade]))), xstart, ystart + rows * indexSize + 5, 0);
                            } else {
                                mFont.tahoma_7_yellow.drawString(var1, mResources.replace(mResources.COINLOCKNEED, NinjaUtil.numberToString(String.valueOf(coinUpAdorns[itemUpGrade.upgrade]))), xstart, ystart + rows * indexSize + 5, 0);
                            }

                            if (var5 > Char.getMyChar().luong) {
                                mFont.tahoma_7_red.drawString(var1, mResources.replace(mResources.GOLDNEED, String.valueOf(var5)), xstart, ystart + rows * indexSize + 17, 0);
                            } else {
                                mFont.tahoma_7_yellow.drawString(var1, mResources.replace(mResources.GOLDNEED, String.valueOf(var5)), xstart, ystart + rows * indexSize + 17, 0);
                            }

                            mFont.tahoma_7_yellow.drawString(var1, mResources.PERCENT + ": " + var3 + "%", xstart, ystart + rows * indexSize + 29, 0);
                        } else if (itemUpGrade.isTypeWeapon()) {
                            if ((var3 = var9 * 100 / upWeapon[itemUpGrade.upgrade]) > maxPercents[itemUpGrade.upgrade]) {
                                var3 = maxPercents[itemUpGrade.upgrade];
                            }

                            if (isPaintUpGradeGold) {
                                var3 = (int) ((double) var3 * 1.5D);
                                var5 = goldUps[itemUpGrade.upgrade];
                            }

                            if (coinUpWeapons[itemUpGrade.upgrade] > Char.getMyChar().xu + Char.getMyChar().yen) {
                                mFont.tahoma_7_red.drawString(var1, mResources.replace(mResources.COINLOCKNEED, NinjaUtil.numberToString(String.valueOf(coinUpWeapons[itemUpGrade.upgrade]))), xstart, ystart + rows * indexSize + 5, 0);
                            } else {
                                mFont.tahoma_7_yellow.drawString(var1, mResources.replace(mResources.COINLOCKNEED, NinjaUtil.numberToString(String.valueOf(coinUpWeapons[itemUpGrade.upgrade]))), xstart, ystart + rows * indexSize + 5, 0);
                            }

                            if (var5 > Char.getMyChar().luong) {
                                mFont.tahoma_7_red.drawString(var1, mResources.replace(mResources.GOLDNEED, String.valueOf(var5)), xstart, ystart + rows * indexSize + 17, 0);
                            } else {
                                mFont.tahoma_7_yellow.drawString(var1, mResources.replace(mResources.GOLDNEED, String.valueOf(var5)), xstart, ystart + rows * indexSize + 17, 0);
                            }

                            mFont.tahoma_7_yellow.drawString(var1, mResources.PERCENT + ": " + var3 + "%", xstart, ystart + rows * indexSize + 29, 0);
                        }
                    }

                    var1.setColor(0);
                    var1.fillRect(xstart - 1, ystart - 1, columns * indexSize + 3, rows * indexSize + 3);

                    for (var9 = 0; var9 < rows; ++var9) {
                        for (var3 = 0; var3 < columns; ++var3) {
                            SmallImage.drawSmallImage(var1, 154, xstart + var3 * indexSize + indexSize / 2, ystart + var9 * indexSize + indexSize / 2, 0, 3);
                            var1.setColor(12281361);
                            var1.drawRect(xstart + var3 * indexSize, ystart + var9 * indexSize, indexSize, indexSize);
                        }
                    }

                    if (indexTitle == 2) {
                        var9 = indexSelect / columns;
                        var3 = indexSelect - var9 * columns;
                        var1.setColor(16777215);
                        var1.drawRect(xstart + var3 * indexSize, ystart + var9 * indexSize, indexSize, indexSize);
                    }

                    for (var9 = 0; var9 < arrItemUpGrade.length; ++var9) {
                        Item var11;
                        if ((var11 = arrItemUpGrade[var9]) != null) {
                            var5 = var9 / columns;
                            int var6 = var9 - var5 * columns;
                            if (!var11.isLock) {
                                var1.setColor(12083);
                                var1.fillRect(xstart + var6 * indexSize + 1, ystart + var5 * indexSize + 1, indexSize - 1, indexSize - 1);
                            }

                            SmallImage.drawSmallImage(var1, var11.template.iconID, xstart + var6 * indexSize + indexSize / 2, ystart + var5 * indexSize + indexSize / 2, 0, 3);
                        }
                    }

                    if (effUpok == null) {
                        return;
                    }

                    SmallImage.drawSmallImage(var1, effUpok.arrEfInfo[indexEff].idImg, var10 + indexSize / 2 + effUpok.arrEfInfo[indexEff].dx + 1, var4 + indexSize / 2 + 9 + effUpok.arrEfInfo[indexEff].dy, 0, 3);
                    if (GameCanvas.gameTick % 2 != 0 || ++indexEff < effUpok.arrEfInfo.length) {
                        return;
                    }

                    indexEff = 0;
                    effUpok = null;
                } catch (Exception var7) {
                    var7.printStackTrace();
                    return;
                }
            } else if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLEUPGRADE);
            }
        }

    }

    private void paintGianHang(mGraphics var1) {
        if (isPaintAuctionSale) {
            if (indexMenu == 0) {
                String[] var2 = mResources.TITLESTAND;
                var1 = var1;
                GameScr var5 = this;

                try {
                    rows = 5;
                    Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
                    var5.paintItemFrame(var1, var2, false);
                    var1.setColor(6693376);
                    var1.fillRect(popupX + 3, popupY + 32, 168, 140);
                    var1.setColor(13408563);
                    var1.drawRect(popupX + 3, popupY + 32, 168, 140);
                    int var6 = popupX + 74;
                    int var3 = popupY + 40 + indexSize;
                    mFont.tahoma_7_white.drawString(var1, mResources.ITEM_SELL, var6 + indexSize / 2, var3 - indexSize / 2 - 4, 2);
                    if (itemSell != null) {
                        var1.setColor(6425);
                        var1.fillRect(var6 - 1, var3 - 1, indexSize + 3, indexSize + 3);
                        SmallImage.drawSmallImage(var1, 154, var6 + indexSize / 2, var3 + indexSize / 2, 0, 3);
                        var5.paintItem(var1, itemSell, var6, var3);
                        if (itemSell.quantity > 1) {
                            mFont.number_yellow.drawString(var1, String.valueOf(itemSell.quantity), var6 + indexSize, var3 + indexSize / 2 + 6, 1);
                        }

                        var1.setColor(indexTitle == 1 ? 16777215 : 12281361);
                        var1.drawRect(var6, var3, indexSize, indexSize);
                    } else {
                        var1.setColor(6425);
                        var1.fillRect(var6 - 1, var3 - 1, indexSize + 3, indexSize + 3);
                        SmallImage.drawSmallImage(var1, 154, var6 + indexSize / 2, var3 + indexSize / 2, 0, 3);
                        var1.setColor(12281361);
                        var1.drawRect(var6, var3, indexSize, indexSize);
                    }

                    mFont.tahoma_7_white.drawString(var1, mResources.MONEY_SELL, var6 + indexSize / 2, var3 + 3 * indexSize / 2 + 2, 2);
                    if (Char.getMyChar().xu < 5000) {
                        mFont.tahoma_7_red.drawString(var1, mResources.SALENEED, var6 + indexSize / 2, popupY + popupH - 25, 2);
                        mFont.tahoma_7_red.drawString(var1, mResources.SALETAX, var6 + indexSize / 2, popupY + popupH - 13, 2);
                    } else {
                        mFont.tahoma_7_white.drawString(var1, mResources.SALENEED, var6 + indexSize / 2, popupY + popupH - 25, 2);
                        mFont.tahoma_7_white.drawString(var1, mResources.SALETAX, var6 + indexSize / 2, popupY + popupH - 13, 2);
                    }

                    var5.tfText.x = popupX + 40;
                    var5.tfText.y = popupY + 130;
                    var5.tfText.paint(var1);
                } catch (Exception var4) {
                    var4.printStackTrace();
                    return;
                }
            } else if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLESTAND);
            }
        }

    }

    private void paintChuyenHoa(mGraphics var1) {
        if (isPaintConvert) {
            if (indexMenu == 0) {
                String[] var2 = mResources.TITLECONVERT;
                var1 = var1;
                GameScr var7 = this;

                try {
                    rows = 3;
                    Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
                    paintTitle(var1, var2[indexMenu], var2.length > 1);
                    xstart = popupX + 3;
                    ystart = popupY + 34 + indexSize;
                    int var9 = popupX + 45;
                    int var3 = popupX + 100;
                    int var4 = ystart - indexSize - 3;
                    if (arrItemConvert[0] != null) {
                        var7.paintItem(var1, arrItemConvert[0], var9, var4);
                        var1.setColor(12281361);
                        var1.drawRect(var9, var4, indexSize, indexSize);
                        mFont.tahoma_7_yellow.drawString(var1, "(+" + arrItemConvert[0].upgrade + ")", var9 - 5, var4 + indexSize / 2 - 5, 1);
                    } else {
                        var1.setColor(6425);
                        var1.fillRect(var9 - 1, var4 - 1, indexSize + 3, indexSize + 3);
                        SmallImage.drawSmallImage(var1, 154, var9 + indexSize / 2, var4 + indexSize / 2, 0, 3);
                        var1.setColor(12281361);
                        var1.drawRect(var9, var4, indexSize, indexSize);
                    }

                    SmallImage.drawSmallImage(var1, 942, var9 + 43, ystart - 15, 0, StaticObj.VCENTER_HCENTER);
                    Item var5;
                    if (arrItemConvert[1] != null) {
                        var5 = arrItemConvert[1].iclone();
                        if (arrItemConvert[0] != null && arrItemConvert[0].template.type == var5.template.type && arrItemConvert[1].template.level >= arrItemConvert[0].template.level) {
                            var5.upgrade = arrItemConvert[0].upgrade;
                        }

                        var7.paintItem(var1, var5, var3, var4);
                        var1.setColor(12281361);
                        var1.drawRect(var3, var4, indexSize, indexSize);
                        mFont.tahoma_7_yellow.drawString(var1, "(+" + var5.upgrade + ")", var3 + indexSize + 10, var4 + indexSize / 2 - 5, 0);
                    } else {
                        var1.setColor(6425);
                        var1.fillRect(var3 - 1, var4 - 1, indexSize + 3, indexSize + 3);
                        SmallImage.drawSmallImage(var1, 154, var3 + indexSize / 2, var4 + indexSize / 2, 0, 3);
                        var1.setColor(12281361);
                        var1.drawRect(var3, var4, indexSize, indexSize);
                    }

                    if (indexTitle == 1) {
                        if (indexSelect == 0) {
                            var1.setColor(16777215);
                            var1.drawRect(var9, var4, indexSize, indexSize);
                        }

                        if (indexSelect == 1) {
                            var1.setColor(16777215);
                            var1.drawRect(var3, var4, indexSize, indexSize);
                        }
                    }

                    var1.setColor(0);
                    var1.fillRect(xstart - 1, ystart - 1, columns * indexSize + 3, rows * indexSize + 3);
                    int var10 = 0;

                    while (true) {
                        int var8;
                        if (var10 >= rows) {
                            if ((var5 = arrItemConvert[2]) != null) {
                                var8 = 0 / columns;
                                var9 = 0 - var8 * columns;
                                if (!var5.isLock) {
                                    var1.setColor(12083);
                                    var1.fillRect(xstart + var9 * indexSize + 1, ystart + var8 * indexSize + 1, indexSize - 1, indexSize - 1);
                                }

                                SmallImage.drawSmallImage(var1, var5.template.iconID, xstart + var9 * indexSize + indexSize / 2, ystart + var8 * indexSize + indexSize / 2, 0, 3);
                            }

                            mFont.tahoma_7_white.drawString(var1, "- " + mResources.UPGRADE_CONDITION[0], xstart, ystart + rows * indexSize + 10, 0);
                            mFont.tahoma_7_white.drawString(var1, "  " + mResources.UPGRADE_CONDITION[1], xstart, ystart + rows * indexSize + 22, 0);
                            mFont.tahoma_7_white.drawString(var1, "- " + mResources.UPGRADE_CONDITION[2], xstart, ystart + rows * indexSize + 34, 0);
                            if (indexTitle != 2) {
                                return;
                            }

                            var8 = indexSelect / columns;
                            var9 = indexSelect - var8 * columns;
                            var1.setColor(16777215);
                            var1.drawRect(xstart + var9 * indexSize, ystart + var8 * indexSize, indexSize, indexSize);
                            break;
                        }

                        for (var8 = 0; var8 < columns; ++var8) {
                            SmallImage.drawSmallImage(var1, 154, xstart + var8 * indexSize + indexSize / 2, ystart + var10 * indexSize + indexSize / 2, 0, 3);
                            var1.setColor(12281361);
                            var1.drawRect(xstart + var8 * indexSize, ystart + var10 * indexSize, indexSize, indexSize);
                        }

                        ++var10;
                    }
                } catch (Exception var6) {
                    var6.printStackTrace();
                    return;
                }
            } else if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLEUPGRADE);
            }
        }

    }

    private void paintTachHT(mGraphics var1) {
        if (isPaintSplit) {
            if (indexMenu == 0) {
                this.paintSplit(var1, mResources.TITLESPLIT);
                return;
            }

            if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLESPLIT);
            }
        }

    }

    private void paintLuyenThu(mGraphics var1) {
        if (isPaintDichChuyen) {
            if (indexMenu == 0) {
                this.paintSplit(var1, mResources.TITLELUYENTHU);
                return;
            }

            if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLELUYENTHU);
            }
        }

    }

    private void paintLuyenAo(mGraphics var1) {
        if (isPaintTinhluyen) {
            if (indexMenu == 0) {
                this.paintSplit(var1, mResources.TITLELUYENAO);
                return;
            }

            if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLELUYENAO);
            }
        }

    }

    private void paintItemTrade(mGraphics var1) {
        if (isPaintTrade) {
            if (indexMenu == 0) {
                String[] var2 = mResources.TITLETRADE;
                var1 = var1;
                GameScr var7 = this;

                try {
                    Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
                    paintTitle(var1, var2[indexMenu], var2.length > 1);
                    xstart = popupX + 3;
                    ystart = popupY + 45;
                    rows = 4;
                    int var10003 = xstart + 1;
                    int var10004 = ystart - 12;
                    mFont.tahoma_7_yellow.drawString(var1, Char.getMyChar().cName, var10003, var10004, 0);
                    int var8 = xstart;

                    int var3;
                    for (var3 = 0; var3 < 3; ++var3) {
                        if (var3 == var7.typeTrade) {
                            mFont.tahoma_7_blue1.drawString(var1, String.valueOf(var3 + 1), var8 + 2 + var3 * 20, ystart + rows * (indexSize + 3) + 8, 0);
                        } else {
                            mFont.tahoma_7_grey.drawString(var1, String.valueOf(var3 + 1), var8 + 2 + var3 * 20, ystart + rows * (indexSize + 3) + 8, 0);
                        }

                        if (var3 < 2) {
                            SmallImage.drawSmallImage(var1, 942, var8 + 14 + var3 * 20, ystart + rows * (indexSize + 3) + 13, 0, StaticObj.VCENTER_HCENTER);
                        }
                    }

                    mFont.tahoma_7_white.drawString(var1, NinjaUtil.numberToString(String.valueOf(var7.coinTrade)) + " " + mResources.XU, xstart, ystart + rows * indexSize + 4, 0);
                    if (var7.typeTrade == 0) {
                        var1.setColor(0);
                    }

                    if (var7.typeTrade == 1) {
                        var1.setColor(210986);
                    }

                    if (var7.typeTrade == 2) {
                        var1.setColor(805690);
                    }

                    var1.fillRect(xstart - 1, ystart - 1, indexSize * 3 + 3, (indexSize << 2) + 3);

                    for (var3 = 0; var3 < rows; ++var3) {
                        for (var8 = 0; var8 < 3; ++var8) {
                            SmallImage.drawSmallImage(var1, 154, xstart + var8 * indexSize + indexSize / 2, ystart + var3 * indexSize + indexSize / 2, 0, 3);
                            var1.setColor(12281361);
                            var1.drawRect(xstart + var8 * indexSize, ystart + var3 * indexSize, indexSize, indexSize);
                        }
                    }

                    if (indexTitle == 1) {
                        var3 = indexSelect / 3;
                        var8 = indexSelect - var3 * 3;
                        var1.setColor(16777215);
                        var1.drawRect(xstart + var8 * indexSize, ystart + var3 * indexSize, indexSize, indexSize);
                    }

                    int var4;
                    int var5;
                    Item var9;
                    if (arrItemTradeMe != null) {
                        for (var3 = 0; var3 < arrItemTradeMe.length; ++var3) {
                            if ((var9 = arrItemTradeMe[var3]) != null) {
                                var4 = var3 / 3;
                                var5 = var3 - var4 * 3;
                                if (!var9.isLock) {
                                    var1.setColor(12083);
                                    var1.fillRect(xstart + var5 * indexSize + 1, ystart + var4 * indexSize + 1, indexSize - 1, indexSize - 1);
                                }

                                if (GameCanvas.gameTick % 6 == 0) {
                                    var9.indexFrame = (var9.indexFrame + 1) % 3;
                                }

                                if (var9.isNewitem()) {
                                    var1.drawImage(GameCanvas.backitem, xstart + var5 * indexSize + indexSize / 2, ystart + var4 * indexSize + indexSize / 2, 3);
                                }

                                SmallImage.drawSmallImage(var1, var9.template.iconID, xstart + var5 * indexSize + indexSize / 2, ystart + var4 * indexSize + indexSize / 2, 0, 3, var9.indexFrame);
                                if (var9.quantity > 1) {
                                    mFont.number_yellow.drawString(var1, String.valueOf(var9.quantity), xstart + var5 * indexSize + indexSize, ystart + var4 * indexSize + indexSize - mFont.number_yellow.getHeight(), 1);
                                }

                                if (var9.quantity > 1) {
                                    mFont.number_yellow.drawString(var1, String.valueOf(var9.quantity), xstart + var5 * indexSize + indexSize, ystart + var4 * indexSize + indexSize - mFont.number_yellow.getHeight(), 1);
                                }
                            }
                        }
                    }

                    xstart = popupX + popupW - 2 - indexSize * 3;
                    rows = 4;
                    mFont.tahoma_7_yellow.drawString(var1, var7.tradeName, popupX + popupW - 2, ystart - 12, 1);
                    var8 = popupX + popupW - 3 - 60;

                    for (var3 = 0; var3 < 3; ++var3) {
                        if (var3 == var7.typeTradeOrder) {
                            mFont.tahoma_7_blue1.drawString(var1, String.valueOf(var3 + 1), var8 + 2 + var3 * 20, ystart + rows * (indexSize + 3) + 8, 0);
                        } else {
                            mFont.tahoma_7_grey.drawString(var1, String.valueOf(var3 + 1), var8 + 2 + var3 * 20, ystart + rows * (indexSize + 3) + 8, 0);
                        }

                        if (var3 < 2) {
                            SmallImage.drawSmallImage(var1, 942, var8 + 14 + var3 * 20, ystart + rows * (indexSize + 3) + 13, 0, StaticObj.VCENTER_HCENTER);
                        }
                    }

                    mFont.tahoma_7_white.drawString(var1, NinjaUtil.numberToString(String.valueOf(var7.coinTradeOrder)) + " " + mResources.XU, popupX + popupW - 2, ystart + rows * indexSize + 4, 1);
                    if (var7.typeTradeOrder == 0) {
                        var1.setColor(0);
                    }

                    if (var7.typeTradeOrder == 1) {
                        var1.setColor(210986);
                    }

                    if (var7.typeTradeOrder == 2) {
                        var1.setColor(805690);
                    }

                    var1.fillRect(xstart - 1, ystart - 1, indexSize * 3 + 3, (indexSize << 2) + 3);

                    for (var3 = 0; var3 < rows; ++var3) {
                        for (var8 = 0; var8 < 3; ++var8) {
                            SmallImage.drawSmallImage(var1, 154, xstart + var8 * indexSize + indexSize / 2, ystart + var3 * indexSize + indexSize / 2, 0, 3);
                            var1.setColor(12281361);
                            var1.drawRect(xstart + var8 * indexSize, ystart + var3 * indexSize, indexSize, indexSize);
                        }
                    }

                    if (indexTitle == 2) {
                        var3 = indexSelect / 3;
                        var8 = indexSelect - var3 * 3;
                        var1.setColor(16777215);
                        var1.drawRect(xstart + var8 * indexSize, ystart + var3 * indexSize, indexSize, indexSize);
                    }

                    if (arrItemTradeOrder != null) {
                        for (var3 = 0; var3 < arrItemTradeOrder.length; ++var3) {
                            if ((var9 = arrItemTradeOrder[var3]) != null) {
                                var4 = var3 / 3;
                                var5 = var3 - var4 * 3;
                                if (!var9.isLock) {
                                    var1.setColor(12083);
                                    var1.fillRect(xstart + var5 * indexSize + 1, ystart + var4 * indexSize + 1, indexSize - 1, indexSize - 1);
                                }

                                if (GameCanvas.gameTick % 6 == 0) {
                                    var9.indexFrame = (var9.indexFrame + 1) % 3;
                                }

                                if (var9.isNewitem()) {
                                    var1.drawImage(GameCanvas.backitem, xstart + var5 * indexSize + indexSize / 2, ystart + var4 * indexSize + indexSize / 2, 3);
                                }

                                SmallImage.drawSmallImage(var1, var9.template.iconID, xstart + var5 * indexSize + indexSize / 2, ystart + var4 * indexSize + indexSize / 2, 0, 3, var9.indexFrame);
                                if (var9.quantity > 1) {
                                    mFont.number_yellow.drawString(var1, String.valueOf(var9.quantity), xstart + var5 * indexSize + indexSize, ystart + var4 * indexSize + indexSize - mFont.number_yellow.getHeight(), 1);
                                }

                                if (var9.quantity > 1) {
                                    mFont.number_yellow.drawString(var1, String.valueOf(var9.quantity), xstart + var5 * indexSize + indexSize, ystart + var4 * indexSize + indexSize - mFont.number_yellow.getHeight(), 1);
                                }
                            }
                        }
                    }

                    var3 = (int) (System.currentTimeMillis() / 1000L);
                    if (var7.timeTrade - var3 > 0 && var7.typeTrade == 1 && var7.typeTradeOrder == 1) {
                        mFont.tahoma_7_white.drawString(var1, mResources.WAIT + " " + (var7.timeTrade - var3) + " " + mResources.SECOND, popupX + popupW / 2, popupY + popupH - 13, 2);
                    } else {
                        if (var7.typeTrade != 0) {
                            return;
                        }

                        mFont.tahoma_7_white.drawString(var1, mResources.TRADEHELP, popupX + popupW / 2, popupY + popupH - 13, 2);
                    }
                } catch (Exception var6) {
                    var6.printStackTrace();
                    return;
                }
            } else if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLETRADE);
            }
        }

    }

    private void paintGhepngoc(mGraphics var1) {
        if (isPaintUpPearl) {
            if (indexMenu == 0) {
                this.paintUpPearl(var1, mResources.TITLEUPPEARL);
                return;
            }

            if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLEUPPEARL);
            }
        }

    }

    private void paintLuyenThach(mGraphics var1) {
        if (isPaintLuyenThach) {
            if (indexMenu == 0) {
                this.paintUpPearl(var1, mResources.TITLELUYENTHACH);
                return;
            }

            if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLELUYENTHACH);
            }
        }

    }

    private void paintRuong(mGraphics var1) {
        if (isPaintBox) {
            if (indexMenu == 0) {
                String[] var2 = mResources.TITLEBOX;
                var1 = var1;
                GameScr var4 = this;

                try {
                    resetTranslate(var1);
                    var4.paintItemFrame(var1, var2, false);
                    if (Char.getMyChar().arrItemBox == null) {
                        GameCanvas.paintShukiren(popupX + 90, popupY + 75, var1, false);
                        mFont.tahoma_7b_white.drawString(var1, mResources.PLEASEWAIT, popupX + 90, popupY + 90, 2);
                    } else {
                        mFont.tahoma_7_white.drawString(var1, mResources.XUINBAG + ": " + NinjaUtil.numberToString(String.valueOf(Char.getMyChar().xuInBox)), popupX + popupW / 2, popupY + popupH - 18, 2);
                        var4.paintBagItem(var1, Char.getMyChar().arrItemBox);
                    }
                } catch (Exception var3) {
                    var3.printStackTrace();
                    return;
                }
            } else if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLEBOX);
            }
        }

    }

    private void paintPickItem(mGraphics var1) {
        if (isPaintPickItem) {
            if (indexMenu == 0) {
                resetTranslate(var1);
                paintItemFrame(var1, mResources.TITLENHATDO, false);
                paintPickDelItem(var1, Code.arrItemNhat);
                return;
            }

            if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLENHATDO);
            }
        }

    }

    private void paintDelItem(mGraphics var1) {
        if (isPaintDelItem) {
            if (indexMenu == 0) {
                resetTranslate(var1);
                paintItemFrame(var1, mResources.TITLEDELDO, false);
                paintPickDelItem(var1, Code.arrItemDel);
                return;
            }

            if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLEDELDO);
            }
        }

    }

    private static void paintPickDelItem(mGraphics var0, short[] var1) {
        rows = var1.length / columns;
        scrMain.setStyle(rows, indexSize, xstart, ystart, columns * indexSize, 5 * indexSize, true, 6);
        scrMain.setClip(var0, xstart, ystart, scrMain.width + 2, scrMain.height + 2);

        int var2;
        int var3;
        for (var2 = 0; var2 < rows; ++var2) {
            for (var3 = 0; var3 < columns; ++var3) {
                SmallImage.drawSmallImage(var0, 154, xstart + var3 * indexSize + indexSize / 2, ystart + var2 * indexSize + indexSize / 2, 0, 3);
                var0.setColor(12281361);
                var0.drawRect(xstart + var3 * indexSize, ystart + var2 * indexSize, indexSize, indexSize);
            }
        }

        for (var2 = 0; var2 < var1.length; ++var2) {
            short var6;
            if ((var6 = var1[var2]) > 0) {
                int var4 = var2 / columns;
                int var5 = var2 - var4 * columns;
                ItemTemplate var7;
                if ((var7 = ItemTemplates.get(var6)) != null) {
                    SmallImage.drawSmallImage(var0, var7.iconID, xstart + var5 * indexSize + indexSize / 2, ystart + var4 * indexSize + indexSize / 2, 0, 3);
                }
            }
        }

        if (indexTitle > 0 && indexSelect >= 0) {
            var2 = indexSelect / columns;
            var3 = indexSelect - var2 * columns;
            var0.setColor(16777215);
            var0.drawRect(xstart + var3 * indexSize, ystart + var2 * indexSize, indexSize, indexSize);
            paintSelectHighlight(xstart + var3 * indexSize, ystart + var2 * indexSize, var0);
        }

    }

    private void paintTiemNang(mGraphics var1) {
        if (indexMenu == 2) {
            var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
            Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
            paintTitle(var1, mResources.MENUME[indexMenu], true);
            mFont.tahoma_8b.drawString(var1, mResources.POTENTIAL_POINT, popupX + 10, popupY + 33, 0);
            mFont.tahoma_8b.drawString(var1, "" + Char.getMyChar().pPoint, popupX + popupW - 10, popupY + 33, 1);
            int var3 = (popupH - 80) / 5;

            for (int var2 = 0; var2 < Char.getMyChar().potential.length; ++var2) {
                var1.setColor(Paint.COLORBORDER);
                if (indexTitle > 0 && indexTitle - 1 == var2) {
                    var1.setColor(Paint.COLORDARK);
                    var1.fillRect(popupX + 5, popupY + 52 + var2 * (var3 + 4), popupW - 10, var3);
                    var1.setColor(Paint.COLORFOCUS);
                }

                var1.drawRect(popupX + 5, popupY + 52 + var2 * (var3 + 4), popupW - 10, var3);
                mFont.tahoma_7b_white.drawString(var1, "" + Char.getMyChar().potential[var2], popupX + popupW - 10, popupY + 52 + (var3 - 10) / 2 + var2 * (var3 + 4), 1);
                mFont.tahoma_7b_white.drawString(var1, mResources.NAMEPOTENTIAL[var2], popupX + 10, popupY + 52 + (var3 - 10) / 2 + var2 * (var3 + 4), 0);
            }

            if (indexTitle > 0) {
                switch (Char.getMyChar().nClass.classId) {
                    case 0:
                        mFont.tahoma_7_green.drawString(var1, mResources.HELPPOTENTIAL1[0], popupX + 10, popupY + 52 + (var3 - 10) / 2 + 4 * (var3 + 4), 0);
                        return;
                    case 1:
                    case 3:
                    case 5:
                        mFont.tahoma_7_green.drawString(var1, mResources.HELPPOTENTIAL2[indexTitle - 1], popupX + 10, popupY + 52 + (var3 - 10) / 2 + 4 * (var3 + 4), 0);
                        return;
                    case 2:
                    case 4:
                    case 6:
                        mFont.tahoma_7_green.drawString(var1, mResources.HELPPOTENTIAL3[indexTitle - 1], popupX + 10, popupY + 52 + (var3 - 10) / 2 + 4 * (var3 + 4), 0);
                }
            }

        }
    }

    private static Item getItemFocus(int var0) {
        try {
            if (indexSelect < 0) {
                return null;
            }

            switch (var0) {
                case 2:
                    if (arrItemWeapon.length > indexSelect) {
                        return arrItemWeapon[indexSelect];
                    }

                    return null;
                case 3:
                    return Char.getMyChar().arrItemBag[indexSelect];
                case 4:
                    return Char.getMyChar().arrItemBox[indexSelect];
                case 5:
                    return currentCharViewInfo.arrItemBody[indexSelect + indextabTrangbi];
                case 6:
                    if (arrItemStack.length > indexSelect) {
                        return arrItemStack[indexSelect];
                    }

                    return null;
                case 7:
                    if (arrItemStackLock.length > indexSelect) {
                        return arrItemStackLock[indexSelect];
                    }

                    return null;
                case 8:
                    if (arrItemGrocery.length > indexSelect) {
                        return arrItemGrocery[indexSelect];
                    }

                    return null;
                case 9:
                    if (arrItemGroceryLock.length > indexSelect) {
                        return arrItemGroceryLock[indexSelect];
                    }

                    return null;
                case 10:
                    return arrItemUpGrade[indexSelect];
                case 11:
                    return arrItemUpPeal[indexSelect];
                case 12:
                case 13:
                case 30:
                case 31:
                case 33:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 49:
                case 50:
                case 51:
                default:
                    break;
                case 14:
                    if (arrItemStore.length > indexSelect) {
                        return arrItemStore[indexSelect];
                    }

                    return null;
                case 15:
                    if (arrItemBook.length > indexSelect) {
                        return arrItemBook[indexSelect];
                    }

                    return null;
                case 16:
                    if (arrItemLien.length > indexSelect) {
                        return arrItemLien[indexSelect];
                    }

                    return null;
                case 17:
                    if (arrItemNhan.length > indexSelect) {
                        return arrItemNhan[indexSelect];
                    }

                    return null;
                case 18:
                    if (arrItemNgocBoi.length > indexSelect) {
                        return arrItemNgocBoi[indexSelect];
                    }

                    return null;
                case 19:
                    if (arrItemPhu.length > indexSelect) {
                        return arrItemPhu[indexSelect];
                    }

                    return null;
                case 20:
                    if (arrItemNonNam.length > indexSelect) {
                        return arrItemNonNam[indexSelect];
                    }

                    return null;
                case 21:
                    if (arrItemNonNu.length > indexSelect) {
                        return arrItemNonNu[indexSelect];
                    }

                    return null;
                case 22:
                    if (arrItemAoNam.length > indexSelect) {
                        return arrItemAoNam[indexSelect];
                    }

                    return null;
                case 23:
                    if (arrItemAoNu.length > indexSelect) {
                        return arrItemAoNu[indexSelect];
                    }

                    return null;
                case 24:
                    if (arrItemGangTayNam.length > indexSelect) {
                        return arrItemGangTayNam[indexSelect];
                    }

                    return null;
                case 25:
                    if (arrItemGangTayNu.length > indexSelect) {
                        return arrItemGangTayNu[indexSelect];
                    }

                    return null;
                case 26:
                    if (arrItemQuanNam.length > indexSelect) {
                        return arrItemQuanNam[indexSelect];
                    }

                    return null;
                case 27:
                    if (arrItemQuanNu.length > indexSelect) {
                        return arrItemQuanNu[indexSelect];
                    }

                    return null;
                case 28:
                    if (arrItemGiayNam.length > indexSelect) {
                        return arrItemGiayNam[indexSelect];
                    }

                    return null;
                case 29:
                    if (arrItemGiayNu.length > indexSelect) {
                        return arrItemGiayNu[indexSelect];
                    }

                    return null;
                case 32:
                    if (arrItemFashion.length > indexSelect) {
                        return arrItemFashion[indexSelect];
                    }

                    return null;
                case 34:
                    if (arrItemClanShop.length > indexSelect) {
                        return arrItemClanShop[indexSelect];
                    }

                    return null;
                case 35:
                    if (arrItemElites.length > indexSelect) {
                        return arrItemElites[indexSelect];
                    }

                    return null;
                case 43:
                    return arrItemUpPeal[indexSelect];
                case 44:
                    return arrItemSplit[indexSelect];
                case 45:
                    return arrItemSplit[indexSelect];
                case 46:
                    return arrItemSplit[indexSelect];
                case 47:
                    return arrItemUpGrade[indexSelect];
                case 48:
                    return arrItemSplit[indexSelect];
                case 52:
                    if (arrItemFashion.length > indexSelect) {
                        return arrItemFashion[indexSelect];
                    }

                    return null;
            }
        } catch (Exception var1) {
        }

        return null;
    }

    public static void loadImg() {
        TileMap.loadTileImage();
    }

    private static void paintTitle(mGraphics var0, String var1, boolean var2) {
        boolean var3 = false;
        if (!svTitle.equals("")) {
            var1 = svTitle;
        }

        int var4 = gW / 2;
        var0.setColor(Paint.COLORDARK);
        var0.fillRoundRect(var4 - mFont.tahoma_8b.getWidth(var1) / 2 - 12, popupY + 4, mFont.tahoma_8b.getWidth(var1) + 22, 24, 6, 6);
        if ((indexTitle == 0 || GameCanvas.isTouch) && var2) {
            SmallImage.drawSmallImage(var0, 989, var4 - mFont.tahoma_8b.getWidth(var1) / 2 - 15 - 7 - (GameCanvas.gameTick % 8 <= 3 ? 2 : 0), popupY + 16, 2, StaticObj.VCENTER_HCENTER);
            SmallImage.drawSmallImage(var0, 989, var4 + mFont.tahoma_8b.getWidth(var1) / 2 + 15 + 5 + (GameCanvas.gameTick % 8 <= 3 ? 2 : 0), popupY + 16, 0, StaticObj.VCENTER_HCENTER);
        }

        if (indexTitle == 0) {
            var0.setColor(Paint.COLORFOCUS);
        } else {
            var0.setColor(Paint.COLORBORDER);
        }

        var0.drawRoundRect(var4 - mFont.tahoma_8b.getWidth(var1) / 2 - 12, popupY + 4, mFont.tahoma_8b.getWidth(var1) + 22, 24, 6, 6);
        mFont.tahoma_8b.drawString(var0, var1, var4, popupY + 9, 2);
    }

    private void paintZone(mGraphics var1) {
        if (isPaintZone) {
            resetTranslate(var1);
            this.paintItemFrame(var1, new String[]{mResources.ZONE}, false);
            mFont.tahoma_7_yellow.drawString(var1, TileMap.mapName, popupX + popupW / 2, popupY + popupH - 25, 2);
            if (indexSelect >= 0 && indexSelect < this.zones.length) {
                mFont.tahoma_7_white.drawString(var1, mResources.POPULATION + ": " + this.zones[indexSelect] + ", " + mResources.PARTY + ": " + this.pts[indexSelect], popupX + popupW / 2, popupY + popupH - 13, 2);
            }

            int var2 = indexSelect / this.zoneCol;
            int var3 = indexSelect % this.zoneCol;
            rows = this.zones.length / this.zoneCol;
            if (this.zones.length % this.zoneCol > 0) {
                ++rows;
            }

            if (rows < 5) {
                rows = 5;
            }

            scrMain.setStyle(rows, indexSize, xstart, ystart, columns * indexSize + 2, 5 * indexSize + 2, true, 6);
            scrMain.setClip(var1);
            int var4 = 0;

            for (int var5 = 0; var5 < rows; ++var5) {
                for (int var6 = 0; var6 < this.zoneCol; ++var6) {
                    var1.setColor(12281361);
                    var1.drawRect(xstart + var6 * indexSize, ystart + var5 * indexSize, indexSize, indexSize);
                    if (var4 < this.zones.length) {
                        SmallImage.drawSmallImage(var1, 154, xstart + var6 * indexSize + indexSize / 2, ystart + var5 * indexSize + indexSize / 2, 0, 3);
                        if (this.zones[var4] >= 20) {
                            mFont.tahoma_7b_red.drawString(var1, "" + var4, xstart + var6 * indexSize + indexSize / 2, ystart + var5 * indexSize + indexSize / 2 - 4, 2);
                        } else if (this.zones[var4] >= 15) {
                            mFont.tahoma_7b_yellow.drawString(var1, "" + var4, xstart + var6 * indexSize + indexSize / 2, ystart + var5 * indexSize + indexSize / 2 - 4, 2);
                        } else {
                            mFont.tahoma_7b_white.drawString(var1, "" + var4, xstart + var6 * indexSize + indexSize / 2, ystart + var5 * indexSize + indexSize / 2 - 4, 2);
                        }

                        ++var4;
                    }
                }
            }

            if (indexSelect >= 0) {
                var1.setColor(16777215);
                var1.drawRect(xstart + var3 * indexSize, ystart + var2 * indexSize, indexSize, indexSize);
            }

        }
    }

    private static void upPearl() {
        int var0 = 0;
        int var1 = 0;
        boolean var2 = false;
        boolean var3 = false;

        int var4;
        for (var4 = 0; var4 < arrItemUpPeal.length; ++var4) {
            if (arrItemUpPeal[var4] != null) {
                ++var0;
                var1 += crystals[arrItemUpPeal[var4].template.id];
                if (arrItemUpPeal[var4].template.id == 11) {
                    GameCanvas.msgdlg.setInfo(mResources.UP_MAX, (Command) null, new Command(mResources.CLOSE, 1), (Command) null);
                    GameCanvas.currentDialog = GameCanvas.msgdlg;
                    return;
                }
            }

            if (arrItemUpPeal[var4] != null && arrItemUpPeal[var4].isLock) {
                var2 = true;
            }

            if (arrItemUpPeal[var4] != null && !arrItemUpPeal[var4].isLock) {
                var3 = true;
            }
        }

        if (var0 <= 1) {
            GameCanvas.msgdlg.setInfo(mResources.NOT_ENOUGH_UPPEARL, (Command) null, new Command(mResources.CLOSE, 1), (Command) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        } else {
            for (var4 = crystals.length - 1; var4 >= 0 && var1 <= crystals[var4]; --var4) {
            }

            if (var4 >= crystals.length - 1) {
                var4 = crystals.length - 2;
            }

            if (isTypeXu) {
                if (coinUpCrystals[var4 + 1] > Char.getMyChar().xu) {
                    GameCanvas.msgdlg.setInfo(mResources.NOT_ENOUGH_COIN_UPPEARL, (Command) null, new Command(mResources.CLOSE, 1), (Command) null);
                    GameCanvas.currentDialog = GameCanvas.msgdlg;
                } else if (var2) {
                    GameCanvas.startYesNoDlg(mResources.CONFIRMUPPEARL, 88813, arrItemUpPeal, 8882, (Object) null);
                } else {
                    Service.gI().crystalCollect(arrItemUpPeal);
                }
            } else if (coinUpCrystals[var4 + 1] > Char.getMyChar().xu + Char.getMyChar().yen) {
                GameCanvas.msgdlg.setInfo(mResources.NOT_ENOUGH_COIN_UPPEARL, (Command) null, new Command(mResources.CLOSE, 1), (Command) null);
                GameCanvas.currentDialog = GameCanvas.msgdlg;
            } else if (var3) {
                GameCanvas.startYesNoDlg(mResources.CONFIRMUPPEARL, 88814, arrItemUpPeal, 8882, (Object) null);
            } else {
                Service.gI().crystalCollectLock(arrItemUpPeal);
            }
        }
    }

    private static void doLuyenThach() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        short var3 = 0;

        for (int var4 = 0; var4 < arrItemUpPeal.length; ++var4) {
            Item var5;
            if ((var5 = arrItemUpPeal[var4]) != null) {
                if (var5.template.id == 455) {
                    ++var0;
                } else if (var5.template.id == 456) {
                    ++var1;
                } else if (var5.template.type == 26) {
                    ++var2;
                    var3 = var5.template.id;
                }
            }
        }

        if (var2 > 1) {
            GameCanvas.startOKDlg(mResources.ONLY_LUYENTHACH3);
        } else if (var0 <= 9 && var1 <= 9 && (var3 < 10 || var0 <= 3 && var1 <= 3)) {
            if (var0 + var1 < 3) {
                GameCanvas.startOKDlg(mResources.NOT_ENOUGH_LUYENTHACH1);
            } else if ((var3 != 10 || var1 != 3) && (var3 != 11 || var0 != 3)) {
                Service.gI().luyenthach(arrItemUpPeal);
            } else {
                GameCanvas.startOKDlg(mResources.ONLY_LUYENTHACH4);
            }
        } else {
            GameCanvas.startOKDlg(mResources.MAX_LUYENTHACH1);
        }
    }

    public static byte getTaskMapId() {
        if (Char.getMyChar().ctaskId >= tasks.length) {
            return -3;
        } else {
            boolean var0 = false;
            byte var1;
            if (Char.getMyChar().taskMaint == null) {
                var1 = mapTasks[Char.getMyChar().ctaskId][0];
            } else {
                var1 = mapTasks[Char.getMyChar().ctaskId][Char.getMyChar().taskMaint.index + 1];
            }

            if (var1 == -1) {
                if (Char.getMyChar().nClass.classId == 0 && Char.getMyChar().ctaskId == 9) {
                    var1 = -2;
                } else if (Char.getMyChar().nClass.classId != 0 && Char.getMyChar().nClass.classId != 1 && Char.getMyChar().nClass.classId != 2) {
                    if (Char.getMyChar().nClass.classId != 3 && Char.getMyChar().nClass.classId != 4) {
                        if (Char.getMyChar().nClass.classId == 5 || Char.getMyChar().nClass.classId == 6) {
                            var1 = 27;
                        }
                    } else {
                        var1 = 72;
                    }
                } else {
                    var1 = 1;
                }
            }

            return var1;
        }
    }

    public static byte getTaskNpcId() {
        try {
            if (Char.getMyChar().ctaskId >= tasks.length) {
                return -3;
            } else {
                boolean var0 = false;
                byte var2;
                if (Char.getMyChar().taskMaint == null) {
                    var2 = tasks[Char.getMyChar().ctaskId][0];
                } else {
                    var2 = tasks[Char.getMyChar().ctaskId][Char.getMyChar().taskMaint.index + 1];
                }

                if (var2 == -1) {
                    if (Char.getMyChar().nClass.classId == 0 && Char.getMyChar().ctaskId == 9) {
                        var2 = -2;
                    } else if (Char.getMyChar().nClass.classId != 0 && Char.getMyChar().nClass.classId != 1 && Char.getMyChar().nClass.classId != 2) {
                        if (Char.getMyChar().nClass.classId != 3 && Char.getMyChar().nClass.classId != 4) {
                            if (Char.getMyChar().nClass.classId == 5 || Char.getMyChar().nClass.classId == 6) {
                                var2 = 11;
                            }
                        } else {
                            var2 = 10;
                        }
                    } else {
                        var2 = 9;
                    }
                }

                return var2;
            }
        } catch (Exception var1) {
            return -1;
        }
    }

    private void upGrade() {
        int var4 = 0;

        for (int var1 = 0; var1 < arrItemUpGrade.length; ++var1) {
            if (arrItemUpGrade[var1] != null && arrItemUpGrade[var1].template.type == 26) {
                var4 += crystals[arrItemUpGrade[var1].template.id];
            }
        }

        boolean var5 = false;
        boolean var2 = false;
        int var3 = 0;
        if (itemUpGrade.isTypeClothe()) {
            if (coinUpClothes[itemUpGrade.upgrade] > Char.getMyChar().xu + Char.getMyChar().yen) {
                var5 = true;
            }

            var3 = var4 * 100 / upClothe[itemUpGrade.upgrade];
        } else if (itemUpGrade.isTypeAdorn()) {
            if (coinUpAdorns[itemUpGrade.upgrade] > Char.getMyChar().xu + Char.getMyChar().yen) {
                var5 = true;
            }

            var3 = var4 * 100 / upAdorn[itemUpGrade.upgrade];
        } else if (itemUpGrade.isTypeWeapon()) {
            if (coinUpWeapons[itemUpGrade.upgrade] > Char.getMyChar().xu + Char.getMyChar().yen) {
                var5 = true;
            }

            var3 = var4 * 100 / upWeapon[itemUpGrade.upgrade];
        }

        if (isPaintUpGradeGold && goldUps[itemUpGrade.upgrade] > Char.getMyChar().luong) {
            var2 = true;
        }

        if (var5) {
            InfoMe.addInfo(mResources.NOT_ENOUGH_COIN_UPGRADE, 15, mFont.tahoma_7_red);
        } else if (var2) {
            InfoMe.addInfo(mResources.NOT_ENOUGH_GOLD_UPGRADE, 15, mFont.tahoma_7_red);
        } else if (var3 > 250) {
            GameCanvas.startYesNoDlg(mResources.PERCENT_BIG, 88815, (Object) null, 8882, (Object) null);
        } else {
            doUpgrade();
        }
    }

    public static void doUpgrade() {
        if (!itemUpGrade.isLock) {
            GameCanvas.startYesNoDlg(mResources.CONFIRMUPGRADE, new Command(mResources.YES, 11063), new Command(mResources.NO, 1));
        } else {
            Service.gI().upgradeItem(itemUpGrade, arrItemUpGrade, isPaintUpGradeGold);
        }
    }

    private static void split() {
        if (!isPaintCheDo) {
            if (isPaintLuyenNgoc) {
                Service.gI().ngockham((byte) 1, (Item) null, itemSplit, arrItemSplit);
                return;
            }

            if (isPaintTinhluyen) {
                Service.gI().tinhluyen(itemSplit, arrItemSplit);
                return;
            }

            if (isPaintDichChuyen) {
                Service.gI().dichchuyen(itemSplit, arrItemSplit);
                return;
            }

            if (itemSplit.upgrade == 0) {
                GameCanvas.msgdlg.setInfo(mResources.NOT_UPGRADE, (Command) null, new Command(mResources.CLOSE, 1), (Command) null);
                GameCanvas.currentDialog = GameCanvas.msgdlg;
                return;
            }

            int var0 = -1;
            int var1 = 0;

            int var2;
            for (var2 = 0; var2 < Char.getMyChar().arrItemBag.length; ++var2) {
                if (Char.getMyChar().arrItemBag[var2] == null) {
                    ++var0;
                }
            }

            for (var2 = 0; var2 < arrItemSplit.length; ++var2) {
                if (arrItemSplit[var2] != null) {
                    ++var1;
                }
            }

            if (var1 > var0) {
                GameCanvas.msgdlg.setInfo(mResources.BAG_FULL, (Command) null, new Command(mResources.CLOSE, 1), (Command) null);
                GameCanvas.currentDialog = GameCanvas.msgdlg;
                return;
            }

            GameCanvas.startYesNoDlg(mResources.CONFIRMSPLIT, new Command(mResources.YES, 11087, itemSplit), new Command(mResources.NO, 1));
        }

    }

    private void updateItemInfo(int var1, Item var2, Command var3, Command var4) {
        this.updateItemInfo((int) 3, (Item) var2);
        if (var3 != null) {
            super.left = new Command(var3.caption, 11040);
        }

    }

    private void updateItemInfo(int var1, Item var2) {
        if (var2 != null) {
            this.itemFocus = var2;
            inforW = 120;
            inforH = 120;
            if (GameCanvas.isTouch && !GameCanvas.isTouchControlSmallScreen) {
                inforH += 18;
            }

            isPaintItemInfo = true;
            scrInfo.clear();
            indexRow = 0;
            if (var2.expires == 0L) {
                if (isPaintTinhluyen || isPaintDichChuyen || isPaintLuyenNgoc || isPaintCheDo || isPaintKhamNgoc || isPaintThaoNgoc || isPaintGotNgoc) {
                    Service.gI().requestItemInfo(var2.typeUI, var2.indexUI);
                }

                if (isPaintAuctionBuy) {
                    Service.gI().requestItemAuction(var2.itemId);
                } else if (currentCharViewInfo.charID == Char.getMyChar().charID) {
                    Service.gI().requestItemInfo(var1, var2.indexUI);
                } else {
                    Service.gI().requestItemPlayer(currentCharViewInfo.charID, var2.indexUI);
                }
            }

            if (var1 == 5) {
                Char.getMyChar().updateKickOption();
            }

            if (!GameCanvas.isTouch || GameCanvas.isTouch && GameCanvas.isTouchControlSmallScreen || isPaintInfoMe && indexMenu > 0 && indexMenu < 4 || isPaintClan && indexMenu == 0) {
                super.center = this.cmdItemInfoClose;
                super.right = null;
                super.left = null;
            }

            GameCanvas.clearKeyHold();
            GameCanvas.clearKeyPressed();
        }
    }

    public final void showAlert(String var1, String var2, boolean var3) {
        InfoDlg.hide();
        isPaintAlert = true;
        this.isLockKey = true;
        indexRow = 0;
        setPopupSize(175, 200);
        if (var3) {
            popupH -= 60;
        }

        super.right = new Command(mResources.CLOSE, 3);
        super.left = super.center = null;
        this.textsTitle = var1;
        this.texts = mFont.tahoma_7.splitFontVector(var2, popupW - 30);
    }

    public final void doCloseAlert() {
        isPaintAlert = false;
        this.textsTitle = null;
        this.texts = null;
        super.center = null;
        this.resetButton();
    }

    public final void scrollDownAlert() {
        indexRowMax = this.texts.size();
        scrMain.setStyle(indexRowMax, 12, popupX, ystart + 12, popupW, popupH - 42 - (this.textsTitle != null ? 10 : 0), true, 1);
        indexRow = this.texts.size() - 1;
        scrMain.moveTo(indexRow * scrMain.ITEM_SIZE);
    }

    private void paintAlert(mGraphics var1) {
        if (this.texts != null && isPaintAlert) {
            resetTranslate(var1);
            Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
            if (this.textsTitle != null) {
                paintTitle(var1, this.textsTitle, isPaintMessage);
            }

            xstart = popupX + 15;
            ystart = popupY + 15;
            if (this.textsTitle != null) {
                ystart += 10;
            }

            indexRowMax = this.texts.size();
            scrMain.setStyle(indexRowMax, 12, popupX, ystart + 12, popupW, popupH - 42 - (this.textsTitle != null ? 10 : 0), true, 1);
            scrMain.setClip(var1);
            this.yPaint = ystart;
            mFont var2 = mFont.tahoma_7_white;

            String var4;
            for (int var3 = 0; var3 < this.texts.size() && (var4 = (String) this.texts.elementAt(var3)) != null && this.texts != null && var2 != null; ++var3) {
                if (var4.startsWith("c")) {
                    if (var4.startsWith("c0")) {
                        var4 = var4.substring(2);
                        var2 = mFont.tahoma_7_white;
                    } else if (var4.startsWith("c1")) {
                        var4 = var4.substring(2);
                        var2 = mFont.tahoma_7b_yellow;
                    } else if (var4.startsWith("c2")) {
                        var4 = var4.substring(2);
                        var2 = mFont.tahoma_7b_white;
                    } else if (var4.startsWith("c3")) {
                        var4 = var4.substring(2);
                        var2 = mFont.tahoma_7_yellow;
                    } else if (var4.startsWith("c4")) {
                        var4 = var4.substring(2);
                        var2 = mFont.tahoma_7b_red;
                    } else if (var4.startsWith("c5")) {
                        var4 = var4.substring(2);
                        var2 = mFont.tahoma_7_red;
                    } else if (var4.startsWith("c6")) {
                        var4 = var4.substring(2);
                        var2 = mFont.tahoma_7_grey;
                    } else if (var4.startsWith("c7")) {
                        var4 = var4.substring(2);
                        var2 = mFont.tahoma_7b_blue;
                    } else if (var4.startsWith("c8")) {
                        var4 = var4.substring(2);
                        var2 = mFont.tahoma_7_blue;
                    } else if (var4.startsWith("c9")) {
                        var4 = var4.substring(2);
                        var2 = mFont.tahoma_7_green;
                    }
                }

                var2.drawString(var1, var4, xstart + 5, this.yPaint += 12, 0);
            }

            if (indexRow >= 0) {
                SmallImage.drawSmallImage(var1, 942, xstart - 5, ystart + 12 + 1 + indexRow * 12, 0, StaticObj.TOP_LEFT);
            }

        }
    }

    private void paintFindTeam(mGraphics var1) {
        if (isPaintFindTeam) {
            Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
            paintTitle(var1, mResources.FINDTEAM, false);
            xstart = popupX + 5;
            ystart = popupY + 40;
            if (vPtMap.size() == 0) {
                mFont.tahoma_7_white.drawString(var1, mResources.NOT_TEAM_MAP, popupX + popupW / 2, popupY + 40, 2);
            } else {
                var1.setColor(6425);
                var1.fillRect(xstart - 2, ystart - 2, popupW - 6, indexSize * 5 + 8);
                resetTranslate(var1);
                scrMain.setStyle(vPtMap.size(), indexSize, xstart, ystart, popupW - 3, indexSize * 5 + 4, true, 1);
                scrMain.setClip(var1, xstart, ystart, popupW - 3, indexSize * 5 + 6);
                indexRowMax = vPtMap.size();

                for (int var3 = 0; var3 < vPtMap.size(); ++var3) {
                    Party var2 = (Party) vPtMap.elementAt(var3);
                    if (indexRow == var3) {
                        var1.setColor(Paint.COLORLIGHT);
                        var1.fillRect(xstart + 2, ystart + indexRow * indexSize + 2, popupW - 15, indexSize - 4);
                        var1.setColor(16777215);
                        var1.drawRect(xstart + 2, ystart + indexRow * indexSize + 2, popupW - 15, indexSize - 4);
                    } else {
                        var1.setColor(Paint.COLORBACKGROUND);
                        var1.fillRect(xstart + 2, ystart + var3 * indexSize + 2, popupW - 15, indexSize - 4);
                        var1.setColor(13932896);
                        var1.drawRect(xstart + 2, ystart + var3 * indexSize + 2, popupW - 15, indexSize - 4);
                    }

                    SmallImage.drawSmallImage(var1, 647, xstart + 12, ystart + var3 * indexSize + indexSize / 2, 0, 3);
                    mFont.tahoma_7_white.drawString(var1, var2.name + " - " + mResources.level + ": " + var2.level + " (" + var2.size + ")", xstart + 22, ystart + var3 * indexSize + indexSize / 2 - 6, 0);
                }
            }

            paintNumCount(var1);
        }

    }

    private void paintTeam(mGraphics var1) {
        if (isPaintTeam) {
            Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
            paintTitle(var1, mResources.TEAM, false);
            xstart = popupX + 5;
            ystart = popupY + 40;
            if (vParty.size() == 0) {
                mFont.tahoma_7_white.drawString(var1, mResources.NOT_TEAM, popupX + popupW / 2, popupY + 40, 2);
            } else {
                var1.setColor(6425);
                var1.fillRect(xstart - 2, ystart - 2, popupW - 6, indexSize * 5 + 8);
                resetTranslate(var1);
                scrMain.setStyle(vParty.size(), indexSize, xstart, ystart, popupW - 3, indexSize * 5 + 4, true, 1);
                scrMain.setClip(var1, xstart, ystart, popupW - 3, indexSize * 5 + 6);
                indexRowMax = vParty.size();

                for (int var3 = 0; var3 < vParty.size(); ++var3) {
                    Party var2 = (Party) vParty.elementAt(var3);
                    if (indexRow == var3) {
                        var1.setColor(Paint.COLORLIGHT);
                        var1.fillRect(xstart + 2, ystart + indexRow * indexSize + 2, popupW - 15, indexSize - 4);
                        var1.setColor(16777215);
                        var1.drawRect(xstart + 2, ystart + indexRow * indexSize + 2, popupW - 15, indexSize - 4);
                    } else {
                        var1.setColor(Paint.COLORBACKGROUND);
                        var1.fillRect(xstart + 2, ystart + var3 * indexSize + 2, popupW - 15, indexSize - 4);
                        var1.setColor(13932896);
                        var1.drawRect(xstart + 2, ystart + var3 * indexSize + 2, popupW - 15, indexSize - 4);
                    }

                    SmallImage.drawSmallImage(var1, var2.iconId, xstart + 12, ystart + var3 * indexSize + indexSize / 2, 0, 3);
                    if (var2.c == null) {
                        mFont.tahoma_7_green.drawString(var1, var2.name, xstart + 22, ystart + var3 * indexSize + indexSize / 2 - 6, 0);
                    } else if (var3 == 0) {
                        mFont.tahoma_7_yellow.drawString(var1, var2.name + " - " + mResources.level + ": " + var2.c.clevel, xstart + 22, ystart + var3 * indexSize + indexSize / 2 - 6, 0);
                    } else {
                        mFont.tahoma_7_white.drawString(var1, var2.name + " - " + mResources.level + ": " + var2.c.clevel, xstart + 22, ystart + var3 * indexSize + indexSize / 2 - 6, 0);
                    }
                }
            }

            paintNumCount(var1);
        }

    }

    private void PaintAuctionBuy(mGraphics var1) {
        if (isPaintAuctionBuy) {
            int var6 = popupW;
            if (GameCanvas.isTouchControlLargeScreen) {
                var6 = popupW / 2 + 20;
            }

            Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
            paintTitle(var1, mResources.MENUSTANDS[indexMenu], GameCanvas.isTouch ? true : indexTitle == 0);
            var1.setColor(6425);
            var1.fillRect(xstart - 2, ystart - 2, var6 - 6, indexSize * 5 + 4);
            if (arrItemStands == null) {
                GameCanvas.paintShukiren(popupX + 90, popupY + 75, var1, false);
                mFont.tahoma_7b_white.drawString(var1, mResources.PLEASEWAIT, popupX + 90, popupY + 90, 2);
                return;
            }

            ItemStands[] var2 = arrItemStands;
            xstart = popupX + 5;
            ystart = popupY + 33;
            if (var2.length > 0) {
                indexRowMax = var2.length;
                resetTranslate(var1);
                scrMain.setStyle(indexRowMax, indexSize, xstart, ystart, var6 - 3, indexSize * 5, true, 1);
                scrMain.setClip(var1, xstart, ystart, var6 - 3, indexSize * 5 + 2);

                for (int var4 = 0; var4 < var2.length; ++var4) {
                    ItemStands var5;
                    if ((var5 = var2[var4]) != null && var5.item != null && var5.item.template != null) {
                        int var3 = (int) (System.currentTimeMillis() / 1000L);
                        if (var4 * indexSize >= scrMain.cmy - indexSize && var4 * indexSize < scrMain.cmy + indexSize * 5 + 4) {
                            if (indexSelect == var4) {
                                var1.setColor(Paint.COLORLIGHT);
                                var1.fillRect(xstart + 2, ystart + indexSelect * indexSize + 2, var6 - 15, indexSize - 4);
                                var1.setColor(16777215);
                                var1.drawRect(xstart + 2, ystart + indexSelect * indexSize + 2, var6 - 15, indexSize - 4);
                            } else {
                                var1.setColor(Paint.COLORBACKGROUND);
                                var1.fillRect(xstart + 2, ystart + var4 * indexSize + 2, var6 - 15, indexSize - 4);
                                var1.setColor(13932896);
                                var1.drawRect(xstart + 2, ystart + var4 * indexSize + 2, var6 - 15, indexSize - 4);
                            }

                            var1.setColor(0);
                            var1.fillRect(xstart + 4, ystart + var4 * indexSize + 4, indexSize - 1, indexSize - 8);
                            var1.setColor(indexSelect == var4 ? 16777215 : 12281361);
                            var1.drawRect(xstart + 4, ystart + var4 * indexSize + 4, indexSize - 1, indexSize - 8);
                            if (GameCanvas.gameTick % 6 == 0) {
                                var5.item.indexFrame = (var5.item.indexFrame + 1) % 3;
                            }

                            var1.setColor(11403519);
                            if (var5.item.isNewitem()) {
                                var1.drawRect(xstart + 5, ystart + var4 * indexSize + 5, indexSize - 3, indexSize - 10);
                            }

                            SmallImage.drawSmallImage(var1, var5.item.template.iconID, xstart + indexSize / 2, ystart + var4 * indexSize + indexSize / 2, 0, 3, var5.item.indexFrame);
                            if (var5.item.quantity > 1) {
                                mFont.number_yellow.drawString(var1, String.valueOf(var5.item.quantity), xstart + indexSize, ystart + var4 * indexSize + indexSize / 2 + 2, 1);
                            }

                            var3 = var5.timeEnd - (var3 - var5.timeStart);
                            mFont.tahoma_7_white.drawString(var1, mResources.SELLER + ": " + var5.seller, xstart + indexSize + 7, ystart + var4 * indexSize + indexSize / 2 - mFont.number_yellow.getHeight() - 2, 0);
                            mFont.tahoma_7_white.drawString(var1, mResources.PRICE + ": " + NinjaUtil.numberToString(String.valueOf(var5.price)) + " " + mResources.XU, xstart + indexSize + 7, ystart + var4 * indexSize + indexSize / 2 - mFont.number_yellow.getHeight() + 9, 0);
                            if (var3 < 60) {
                                mFont.tahoma_7_blue.drawString(var1, mResources.NEAR, xstart + var6 - 30, ystart + var4 * indexSize + indexSize / 2 - mFont.number_yellow.getHeight() - 2, 2);
                                mFont.tahoma_7_blue.drawString(var1, mResources.DEADLINE, xstart + var6 - 30, ystart + var4 * indexSize + indexSize / 2 - mFont.number_yellow.getHeight() + 9, 2);
                            } else {
                                mFont.tahoma_7_green.drawString(var1, mResources.REMAIN, xstart + var6 - 30, ystart + var4 * indexSize + indexSize / 2 - mFont.number_yellow.getHeight() - 2, 2);
                                mFont.tahoma_7_green.drawString(var1, NinjaUtil.getTime(var3), xstart + var6 - 30, ystart + var4 * indexSize + indexSize / 2 - mFont.number_yellow.getHeight() + 9, 2);
                            }
                        }
                    }
                }
            } else {
                indexRowMax = var2.length;
                mFont.tahoma_7_white.drawString(var1, mResources.EMPTY_INFO, popupX + var6 / 2, popupY + 40, 2);
            }

            paintNumCount(var1);
        }

    }

    private void paintFriend(mGraphics var1) {
        if (isPaintFriend || isPaintEnemies) {
            String var6 = isPaintFriend ? mResources.FRIENDS[0] : mResources.FRIENDS[1];
            MyVector var2 = isPaintFriend ? vFriend : vEnemies;
            Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
            paintTitle(var1, var6, false);
            if (var2.size() <= 0) {
                mFont.tahoma_7_white.drawString(var1, isPaintFriend ? mResources.NO_FRIEND : mResources.YOU_KILLED, popupX + popupW / 2, popupY + 40, 2);
            } else {
                xstart = popupX + 5;
                ystart = popupY + 40;
                var1.setColor(6425);
                var1.fillRect(xstart - 2, ystart - 2, popupW - 6, indexSize * 5 + 8);
                resetTranslate(var1);
                scrMain.setStyle(var2.size(), indexSize, xstart, ystart, popupW - 3, indexSize * 5 + 4, true, 1);
                scrMain.setClip(var1, xstart, ystart, popupW - 3, indexSize * 5 + 6);
                indexRowMax = var2.size();
                int var7 = 0;
                int var3 = 0;

                while (true) {
                    if (var3 >= var2.size()) {
                        indexRowMax = var7;
                        scrMain.setStyle(var7, indexSize, xstart, ystart, popupW - 3, indexSize * 5 + 4, true, 1);
                        break;
                    }

                    Friend var4 = (Friend) var2.elementAt(var3);
                    if (!isViewClanMemOnline || var4.type == 3) {
                        mFont var5 = mFont.tahoma_7_grey;
                        if (var4.type != 1 && var4.type != 2) {
                            if (var4.type == 3) {
                                var5 = mFont.tahoma_7_white;
                            } else if (var4.type == 4) {
                                var5 = mFont.tahoma_7_red;
                            }
                        } else {
                            var5 = mFont.tahoma_7_green;
                        }

                        if (var3 * indexSize >= scrMain.cmy - indexSize && var3 * indexSize < scrMain.cmy + indexSize * 5 + 8) {
                            if (indexRow == var3) {
                                var1.setColor(Paint.COLORLIGHT);
                                var1.fillRect(xstart + 2, ystart + indexRow * indexSize + 2, popupW - 15, indexSize - 4);
                                var1.setColor(16777215);
                                var1.drawRect(xstart + 2, ystart + indexRow * indexSize + 2, popupW - 15, indexSize - 4);
                            } else {
                                var1.setColor(Paint.COLORBACKGROUND);
                                var1.fillRect(xstart + 2, ystart + var3 * indexSize + 2, popupW - 15, indexSize - 4);
                                var1.setColor(13932896);
                                var1.drawRect(xstart + 2, ystart + var3 * indexSize + 2, popupW - 15, indexSize - 4);
                            }

                            if (var4.type == 4) {
                                if (GameCanvas.gameTick % 10 > 7) {
                                    var5.drawString(var1, var4.friendName, xstart + 8, ystart + var3 * indexSize + indexSize / 2 - 6, 0);
                                } else {
                                    mFont.tahoma_7_yellow.drawString(var1, var4.friendName, xstart + 8, ystart + var3 * indexSize + indexSize / 2 - 6, 0);
                                }

                                mFont.tahoma_7_blue.drawString(var1, mResources.CONFIRM_FRIEND, xstart + popupW - 15, ystart + var3 * indexSize + indexSize / 2 - 6, 1);
                            } else {
                                var5.drawString(var1, var4.friendName, xstart + 8, ystart + var3 * indexSize + indexSize / 2 - 6, 0);
                            }
                        }

                        ++var7;
                    }

                    ++var3;
                }
            }

            paintNumCount(var1);
        }

    }

    private void paintTask(mGraphics var1) {
        if (isPaintTask) {
            indexRowMax = 0;
            resetTranslate(var1);
            Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
            paintTitle(var1, mResources.TASK[indexMenu], false);
            xstart = popupX + 10;
            ystart = popupY + 32;
            int var2;
            String var4;
            if (indexMenu == 0) {
                boolean var7 = false;
                scrMain.setStyle(indexRowMax, 12, popupX, popupY + 32, popupW, popupH - 40, true, 1);
                scrMain.setClip(var1);
                if (Char.getMyChar().taskMaint != null) {
                    int var9;
                    for (var9 = 0; var9 < Char.getMyChar().taskMaint.names.length; ++var9) {
                        mFont.tahoma_7b_white.drawString(var1, Char.getMyChar().taskMaint.names[var9], xstart, this.yPaint = ystart, 0);
                        ++indexRowMax;
                    }

                    var9 = 0;
                    var4 = null;

                    int var11;
                    for (var11 = 0; var11 < Char.getMyChar().taskMaint.subNames.length; ++var11) {
                        mFont var10;
                        if (Char.getMyChar().taskMaint.subNames[var11] != null) {
                            var9 = var11;
                            var4 = "- " + Char.getMyChar().taskMaint.subNames[var11];
                            if (Char.getMyChar().taskMaint.counts[var11] != -1) {
                                if (Char.getMyChar().taskMaint.index == var11) {
                                    var4 = var4 + " " + Char.getMyChar().taskMaint.count + "/" + Char.getMyChar().taskMaint.counts[var11];
                                    if (Char.getMyChar().taskMaint.count == Char.getMyChar().taskMaint.counts[var11]) {
                                        mFont.tahoma_7_white.drawString(var1, var4, xstart + 5, this.yPaint += 12, 0);
                                    } else {
                                        var10 = mFont.tahoma_7_grey;
                                        if (!var7) {
                                            var7 = true;
                                            var10 = mFont.tahoma_7_yellow;
                                        }

                                        var10.drawString(var1, var4, xstart + 5, this.yPaint += 12, 0);
                                    }
                                } else if (Char.getMyChar().taskMaint.index > var11) {
                                    var4 = var4 + " " + Char.getMyChar().taskMaint.counts[var11] + "/" + Char.getMyChar().taskMaint.counts[var11];
                                    mFont.tahoma_7_white.drawString(var1, var4, xstart + 5, this.yPaint += 12, 0);
                                } else {
                                    var4 = var4 + " 0/" + Char.getMyChar().taskMaint.counts[var11];
                                    var10 = mFont.tahoma_7_grey;
                                    if (!var7) {
                                        var7 = true;
                                        var10 = mFont.tahoma_7_yellow;
                                    }

                                    var10.drawString(var1, var4, xstart + 5, this.yPaint += 12, 0);
                                }
                            } else if (Char.getMyChar().taskMaint.index > var11) {
                                mFont.tahoma_7_white.drawString(var1, var4, xstart + 5, this.yPaint += 12, 0);
                            } else {
                                var10 = mFont.tahoma_7_grey;
                                if (!var7) {
                                    var7 = true;
                                    var10 = mFont.tahoma_7_yellow;
                                }

                                var10.drawString(var1, var4, xstart + 5, this.yPaint += 12, 0);
                            }

                            ++indexRowMax;
                        } else if (Char.getMyChar().taskMaint.index <= var11) {
                            var4 = "- " + Char.getMyChar().taskMaint.subNames[var9];
                            var10 = mFont.tahoma_7_grey;
                            if (!var7) {
                                var7 = true;
                                var10 = mFont.tahoma_7_yellow;
                            }

                            var10.drawString(var1, var4, xstart + 5, this.yPaint, 0);
                        }
                    }

                    this.yPaint += 5;

                    for (var11 = 0; var11 < Char.getMyChar().taskMaint.details.length; ++var11) {
                        mFont.tahoma_7_white.drawString(var1, Char.getMyChar().taskMaint.details[var11], xstart, this.yPaint += 12, 0);
                        ++indexRowMax;
                    }
                } else {
                    byte var8 = getTaskMapId();
                    byte var12 = getTaskNpcId();
                    String var5 = null;
                    if (var8 != -3 && var12 != -3) {
                        if (Char.getMyChar().taskMaint == null && Char.getMyChar().ctaskId == 9 && Char.getMyChar().nClass.classId == 0) {
                            var5 = mResources.TASK_INPUT_CLASS;
                        } else {
                            if (var12 < 0 || var8 < 0) {
                                return;
                            }

                            var5 = mResources.DES_TASK[0] + Npc.arrNpcTemplate[var12].name + mResources.DES_TASK[1] + TileMap.mapNames[var8] + mResources.DES_TASK[2];
                        }
                    } else {
                        var5 = mResources.DES_TASK[3];
                    }

                    String[] var6 = mFont.tahoma_7_white.splitFontArray(var5, 150);

                    for (var2 = 0; var2 < var6.length; ++var2) {
                        if (var2 == 0) {
                            mFont.tahoma_7_white.drawString(var1, var6[var2], xstart + 5, this.yPaint = ystart, 0);
                        } else {
                            mFont.tahoma_7_white.drawString(var1, var6[var2], xstart + 5, this.yPaint += 12, 0);
                        }

                        ++indexRowMax;
                    }
                }

                if (indexTitle == 1 && indexRow >= 0 && indexRowMax > 0) {
                    SmallImage.drawSmallImage(var1, 942, xstart - 8, ystart + 2 + indexRow * 12, 0, StaticObj.TOP_LEFT);
                }

                scrMain.setStyle(indexRowMax, 12, popupX, popupY + 32, popupW, popupH - 44, true, 1);
                return;
            }

            if (indexMenu == 1) {
                this.yPaint = ystart - 12;
                scrMain.setStyle(Char.getMyChar().taskOrders.size(), 12, popupX, popupY + 32, popupW, popupH - 44, true, 1);
                scrMain.setClip(var1);
                indexRowMax = 0;

                for (var2 = 0; var2 < Char.getMyChar().taskOrders.size(); ++var2) {
                    TaskOrder var3 = (TaskOrder) Char.getMyChar().taskOrders.elementAt(var2);
                    mFont.tahoma_7b_white.drawString(var1, var3.name, xstart + 5, this.yPaint += 12, 0);
                    var4 = "";
                    if (var3.taskId != 0 && var3.taskId != 3) {
                        if (var3.taskId == 1) {
                            var4 = mResources.KILLBOSS + " " + Mob.arrMobTemplate[var3.killId].name;
                        } else if (var3.taskId == 2) {
                            var4 = mResources.GIOITHIEU;
                        } else if (var3.taskId == 4) {
                            var4 = mResources.KILLBOSS1 + " " + Mob.arrMobTemplate[var3.killId].name;
                        } else if (var3.taskId == 5) {
                            var4 = mResources.KILLBOSS2 + " " + Mob.arrMobTemplate[var3.killId].name;
                        } else if (var3.taskId == 6) {
                            var4 = mResources.KILLBOSS3;
                        }
                    } else {
                        var4 = mResources.KILL + " " + Mob.arrMobTemplate[var3.killId].name;
                    }

                    if (var3.taskId == 6) {
                        if (var3.count == var3.maxCount) {
                            mFont.tahoma_7_white.drawString(var1, var4, xstart + 5, this.yPaint += 12, 0);
                        } else {
                            mFont.tahoma_7_yellow.drawString(var1, var4, xstart + 5, this.yPaint += 12, 0);
                        }
                    } else if (var3.count == var3.maxCount) {
                        mFont.tahoma_7_white.drawString(var1, var4 + " " + var3.count + "/" + var3.maxCount, xstart + 5, this.yPaint += 12, 0);
                    } else {
                        mFont.tahoma_7_yellow.drawString(var1, var4 + " " + var3.count + "/" + var3.maxCount, xstart + 5, this.yPaint += 12, 0);
                    }

                    indexRowMax += 3;
                    inforW = popupW - 25;
                    this.paintMultiLine(var1, mFont.tahoma_7_white, (String) var3.description, xstart + 5, this.yPaint += 12, 0);
                    this.yPaint += 12;
                }

                if (this.typeba > 0) {
                    mFont.tahoma_7_white.drawString(var1, mResources.noti_hiddenquest, xstart + 5, this.yPaint += 12, 0);
                    switch (this.typeba) {
                        case 1:
                            mFont.tahoma_7_white.drawString(var1, mResources.noti_aggressivepoint, xstart + 5, this.yPaint += 12, 0);
                            break;
                        case 2:
                            mFont.tahoma_7_white.drawString(var1, mResources.noti_cave, xstart + 5, this.yPaint += 12, 0);
                            break;
                        case 3:
                            mFont.tahoma_7_white.drawString(var1, mResources.noti_huntingwildbeast, xstart + 5, this.yPaint += 12, 0);
                            break;
                        case 4:
                            mFont.tahoma_7_white.drawString(var1, mResources.noti_upgrade, xstart + 5, this.yPaint += 12, 0);
                            break;
                        case 5:
                            mFont.tahoma_7_white.drawString(var1, mResources.noti_dailyquest, xstart + 5, this.yPaint += 12, 0);
                            break;
                        case 6:
                            mFont.tahoma_7_white.drawString(var1, mResources.noti_battlefield, xstart + 5, this.yPaint += 12, 0);
                            break;
                        case 7:
                            mFont.tahoma_7_white.drawString(var1, mResources.noti_sevenbeasts, xstart + 5, this.yPaint += 12, 0);
                            break;
                        case 8:
                            mFont.tahoma_7_white.drawString(var1, mResources.noti_luckycard, xstart + 5, this.yPaint += 12, 0);
                    }
                }

                if (indexTitle == 1 && indexRow >= 0 && indexRowMax > 0) {
                    SmallImage.drawSmallImage(var1, 942, xstart - 8, ystart + 2 + indexRow * 12, 0, StaticObj.TOP_LEFT);
                }

                ++indexRowMax;
                scrMain.setStyle(indexRowMax, 12, popupX, popupY + 32, popupW, popupH - 44, true, 1);
            }
        }

    }

    private static String[] splitMultiLine(mFont var0, String var1) {
        return var0.splitFontArray(var1, popupW - 20);
    }

    private void paintMultiLine(mGraphics var1, mFont var2, String[] var3, int var4, int var5, int var6) {
        var6 = var5;

        for (int var7 = 0; var7 < var3.length; ++var7) {
            String var8;
            if ((var8 = var3[var7]).startsWith("c")) {
                if (var8.startsWith("c0")) {
                    var8 = var8.substring(2);
                    var2 = mFont.tahoma_7_white;
                } else if (var8.startsWith("c1")) {
                    var8 = var8.substring(2);
                    var2 = mFont.tahoma_7_yellow;
                } else if (var8.startsWith("c2")) {
                    var8 = var8.substring(2);
                    var2 = mFont.tahoma_7_green;
                }
            }

            if (var7 == 0) {
                var2.drawString(var1, var8, var4, var5, 0);
            } else {
                if (var7 * scrMain.ITEM_SIZE + var6 >= scrMain.cmy - 12 && var7 * scrMain.ITEM_SIZE < scrMain.cmy + popupH - 44) {
                    var5 += 12;
                    var2.drawString(var1, var8, var4, var5, 0);
                } else {
                    var5 += 12;
                }

                this.yPaint += 12;
                ++indexRowMax;
            }
        }

    }

    private void paintMultiLine(mGraphics var1, mFont var2, String var3, int var4, int var5, int var6) {
        try {
            int var7 = GameCanvas.isTouch && GameCanvas.w >= 320 ? 20 : 10;
            int var8 = var5;
            String[] var10 = var2.splitFontArray(var3, inforW - var7);

            for (var7 = 0; var7 < var10.length; ++var7) {
                if (var7 == 0) {
                    var2.drawString(var1, var10[var7], var4, var5, var6);
                } else {
                    if (var7 * scrMain.ITEM_SIZE + var8 >= scrMain.cmy - 12 && var7 * scrMain.ITEM_SIZE < scrMain.cmy + popupH - 44) {
                        String var10002 = var10[var7];
                        var5 += 12;
                        var2.drawString(var1, var10002, var4, var5, var6);
                        this.yPaint += 12;
                    } else {
                        var5 += 12;
                    }

                    ++indexRowMax;
                }
            }

        } catch (Exception var9) {
            System.out.println("loi  " + var9.toString());
        }
    }

    private void paintMultiLine(mGraphics var1, mFont var2, String var3, int var4, int var5, int var6, int var7) {
        var6 = var5;
        String[] var8 = var2.splitFontArray(var3, var7);

        for (var7 = 0; var7 < var8.length; ++var7) {
            if (var7 == 0) {
                var2.drawString(var1, var8[var7], var4, var5, 0);
            } else {
                if (var7 * scrMain.ITEM_SIZE + var6 >= scrMain.cmy - 12 && var7 * scrMain.ITEM_SIZE < scrMain.cmy + popupH - 44) {
                    String var10002 = var8[var7];
                    var5 += 12;
                    var2.drawString(var1, var10002, var4, var5, 0);
                    this.yPaint += 12;
                } else {
                    var5 += 12;
                }

                ++indexRowMax;
            }
        }

    }

    private void paintItemInfo(mGraphics var1) {
        if (GameCanvas.isTouchControlLargeScreen && !isSmallUI() && (isOpenUI() || isPaintPopup() || isPaintUI())) {
            setInfoFrameForLargeScreen();
            paintInforFrame(var1);
            resetTranslate(var1);
            this.paintMultiLine(var1, mFont.tahoma_7_white, (String) mResources.CHOOSE_ITEM, inforX + inforW / 2, inforY + inforH / 2 - 20, 2);
        }

        if (isPaintItemInfo && this.itemFocus != null && this.itemFocus.template != null) {
            Item var2 = this.itemFocus;
            if (isViewNext && !this.itemFocus.isUpMax() && indexMenu == 0) {
                var2 = this.itemFocus.viewNext(this.itemFocus.upgrade + 1);
            }

            if (isPaintConvert && indexMenu == 0 && indexTitle == 1 && var2.isTypeBody() && var2.upgrade == 0 && arrItemConvert[0] != null && arrItemConvert[0].template.type == arrItemConvert[1].template.type && arrItemConvert[1].template.level >= arrItemConvert[0].template.level) {
                var2 = this.itemFocus.viewNext(arrItemConvert[0].upgrade);
            }

            resetTranslate(var1);
            int var3;
            int var4;
            if (var2.expires != 0L && var2.options != null && var2.options.size() > 0) {
                for (var4 = 0; var4 < var2.options.size(); ++var4) {
                    if ((var3 = ((ItemOption) var2.options.elementAt(var4)).getOptionString().length() * 5) > inforW && !GameCanvas.isTouchControlLargeScreen) {
                        inforW = var3;
                    }
                }
            }

            if ((var3 = mFont.tahoma_7b_white.getWidth(var2.template.name) + 10) > inforW && !GameCanvas.isTouchControlLargeScreen) {
                inforW = var3;
            }

            if (inforW > GameCanvas.w - 4) {
                inforW = GameCanvas.w - 4;
            }

            if (inforH > GameCanvas.h - 4) {
                inforW = GameCanvas.h - 4;
            }

            inforX = gW / 2 - inforW / 2;
            inforY = gH / 2 - inforH / 2;
            setInfoFrameForLargeScreen();
            if (inforX < 2) {
                inforX = 2;
            }

            if (inforY < 2) {
                inforY = 2;
            }

            paintInforFrame(var1);
            if (isPaintClan && indexMenu == 0) {
                if (Char.clan != null) {
                    this.yPaint = inforY - 9;
                    indexRowMax = 2;
                    scrInfo.setClip(var1, inforX, inforY + 2, inforW, inforH - 2);
                    inforW = mFont.tahoma_7_white.getWidth(mResources.CLAN_ITEM[Char.clan.itemLevel][1]) + 10;

                    for (var4 = 0; var4 < 2; ++var4) {
                        mFont.tahoma_7_white.drawString(var1, mResources.CLAN_ITEM[Char.clan.itemLevel][var4], inforX + 8, this.yPaint += 12, 0);
                    }

                    if (indexRow >= 0 && (!GameCanvas.isTouch || GameCanvas.isTouch && GameCanvas.w < 320)) {
                        SmallImage.drawSmallImage(var1, 942, inforX + 1, inforY + 5 + indexRow * 12, 0, StaticObj.TOP_LEFT);
                    }

                    scrInfo.setStyle(indexRowMax, 12, inforX, inforY + 2, inforW, inforH - 4, true, 1);
                }
            } else {
                scrInfo.setClip(var1, inforX, inforY + 2, inforW, inforH - 2);
                indexRowMax = 3;
                this.yPaint = inforY + 3;
                mFont var9 = mFont.tahoma_7b_white;
                if (var2.isTypeMounts()) {
                    if (var2.sys >= 1 && var2.sys < 4) {
                        var9 = mFont.tahoma_7b_blue;
                    } else if (var2.sys >= 4 && var2.sys < 8) {
                        var9 = mFont.tahoma_7b_green;
                    } else if (var2.sys >= 8 && var2.sys < 12) {
                        var9 = mFont.tahoma_7b_yellow;
                    } else if (var2.sys >= 12 && var2.sys < 15) {
                        var9 = mFont.tahoma_7b_purple;
                    } else if (var2.sys >= 15) {
                        var9 = mFont.tahoma_7b_red;
                    }
                } else if (var2.upgrade >= 1 && var2.upgrade < 4) {
                    var9 = mFont.tahoma_7b_blue;
                } else if (var2.upgrade >= 4 && var2.upgrade < 8) {
                    var9 = mFont.tahoma_7b_green;
                } else if (var2.upgrade >= 8 && var2.upgrade < 12) {
                    var9 = mFont.tahoma_7b_yellow;
                } else if (var2.upgrade >= 12 && var2.upgrade < 15) {
                    var9 = mFont.tahoma_7b_purple;
                } else if (var2.upgrade >= 15) {
                    var9 = mFont.tahoma_7b_red;
                }

                if (var2.img != null) {
                    var1.drawRegion(var2.img, 0, 0, mGraphics.getWidth(var2.img), mGraphics.getHeight(var2.img), 0, inforX + inforW / 2, this.yPaint + inforH - 10, 33);
                }

                if (var2.isTypeMounts()) {
                    this.paintMultiLine(var1, var9, (String) (var2.template.name + " + " + (var2.sys + 1)), inforX + 8, this.yPaint, 0);
                } else {
                    this.paintMultiLine(var1, var9, (String) (var2.template.name + (var2.upgrade > 0 ? " +" + var2.upgrade : "")), inforX + 8, this.yPaint, 0);
                }

                if (var2.upgrade >= 15 && !isChop && !var2.isTypeMounts()) {
                    if (var9.splitFontArray(var2.template.name + (var2.upgrade > 0 ? " +" + var2.upgrade : ""), inforW - (GameCanvas.isTouch && GameCanvas.w >= 320 ? 20 : 10)).length > 1) {
                        this.yPaint -= 12;
                    }

                    if (var2.isTypeMounts()) {
                        this.paintMultiLine(var1, mFont.tahoma_7b_white, (String) var2.template.name, inforX + 8, this.yPaint, 0);
                    } else {
                        this.paintMultiLine(var1, mFont.tahoma_7b_white, (String) (var2.template.name + (var2.upgrade > 0 ? " +" + var2.upgrade : "")), inforX + 8, this.yPaint, 0);
                    }
                }
                String result = "indexUI: " + var2.indexUI + " - ID: [" + var2.template.id + "]";

                mFont.tahoma_7_blue1.drawString(var1, result, inforX + 8, this.yPaint += 12, 0, mFont.tahoma_7);

                int var5;
                if (var2.isTypeBody()) {
                    this.yPaint += 12;
                    ++indexRowMax;
                    if (isChop && GameCanvas.gameTick % 5 == 0) {
                        isChop = !isChop;
                    } else if (!isChop && GameCanvas.gameTick % 5 == 0) {
                        isChop = !isChop;
                    }

                    var5 = var2.upgrade / 2 + 1;
                    if (var2.upgrade == 0) {
                        for (var4 = 0; var4 < var5; ++var4) {
                            SmallImage.drawSmallImage(var1, 633, inforX + 12 + var4 * 10, this.yPaint + 5, 0, StaticObj.VCENTER_HCENTER);
                        }
                    } else if (var2.upgrade >= 1 && var2.upgrade < 4) {
                        for (var4 = 0; var4 < var5; ++var4) {
                            SmallImage.drawSmallImage(var1, 625, inforX + 12 + var4 * 10, this.yPaint + 5, 0, StaticObj.VCENTER_HCENTER);
                        }

                        if (var2.upgrade == 3) {
                            SmallImage.drawSmallImage(var1, 635, inforX + 12 + var5 * 10, this.yPaint + 5, 0, StaticObj.VCENTER_HCENTER);
                        }
                    } else if (var2.upgrade >= 4 && var2.upgrade < 8) {
                        for (var4 = 0; var4 < var5; ++var4) {
                            SmallImage.drawSmallImage(var1, 626, inforX + 12 + var4 * 10, this.yPaint + 5, 0, StaticObj.VCENTER_HCENTER);
                        }

                        if (var2.upgrade % 2 != 0) {
                            SmallImage.drawSmallImage(var1, 636, inforX + 12 + var5 * 10, this.yPaint + 5, 0, StaticObj.VCENTER_HCENTER);
                        }
                    } else if (var2.upgrade >= 8 && var2.upgrade < 12) {
                        for (var4 = 0; var4 < var5; ++var4) {
                            if (isChop) {
                                SmallImage.drawSmallImage(var1, 627, inforX + 12 + var4 * 10, this.yPaint + 5, 0, StaticObj.VCENTER_HCENTER);
                            } else {
                                SmallImage.drawSmallImage(var1, 628, inforX + 12 + var4 * 10, this.yPaint + 5, 0, StaticObj.VCENTER_HCENTER);
                            }
                        }

                        if (var2.upgrade % 2 != 0) {
                            if (isChop) {
                                SmallImage.drawSmallImage(var1, 637, inforX + 12 + var5 * 10, this.yPaint + 5, 0, StaticObj.VCENTER_HCENTER);
                            } else {
                                SmallImage.drawSmallImage(var1, 638, inforX + 12 + var5 * 10, this.yPaint + 5, 0, StaticObj.VCENTER_HCENTER);
                            }
                        }
                    } else if (var2.upgrade >= 12 && var2.upgrade < 15) {
                        for (var4 = 0; var4 < var5; ++var4) {
                            if (isChop) {
                                SmallImage.drawSmallImage(var1, 629, inforX + 12 + var4 * 10, this.yPaint + 5, 0, StaticObj.VCENTER_HCENTER);
                            } else {
                                SmallImage.drawSmallImage(var1, 630, inforX + 12 + var4 * 10, this.yPaint + 5, 0, StaticObj.VCENTER_HCENTER);
                            }
                        }

                        if (var2.upgrade % 2 != 0) {
                            if (isChop) {
                                SmallImage.drawSmallImage(var1, 639, inforX + 12 + var5 * 10, this.yPaint + 5, 0, StaticObj.VCENTER_HCENTER);
                            } else {
                                SmallImage.drawSmallImage(var1, 640, inforX + 12 + var5 * 10, this.yPaint + 5, 0, StaticObj.VCENTER_HCENTER);
                            }
                        }
                    } else {
                        for (var4 = 0; var4 < var5; ++var4) {
                            if (isChop) {
                                SmallImage.drawSmallImage(var1, 631, inforX + 12 + var4 * 10, this.yPaint + 5, 0, StaticObj.VCENTER_HCENTER);
                            } else {
                                SmallImage.drawSmallImage(var1, 632, inforX + 12 + var4 * 10, this.yPaint + 5, 0, StaticObj.VCENTER_HCENTER);
                            }
                        }

                        if (var2.upgrade % 2 != 0) {
                            if (isChop) {
                                SmallImage.drawSmallImage(var1, 641, inforX + 12 + var5 * 10, this.yPaint + 5, 0, StaticObj.VCENTER_HCENTER);
                            } else {
                                SmallImage.drawSmallImage(var1, 642, inforX + 12 + var5 * 10, this.yPaint + 5, 0, StaticObj.VCENTER_HCENTER);
                            }
                        }
                    }
                } else if (var2.isTypeMounts()) {
                    this.yPaint += 12;
                    var5 = var2.sys + 1;

                    for (var4 = 0; var4 < var5; ++var4) {
                        SmallImage.drawSmallImage(var1, 633, inforX + 12 + var4 * 10, this.yPaint + 5, 0, StaticObj.VCENTER_HCENTER);
                    }
                }

                mFont.tahoma_7_white.drawString(var1, var2.isLock ? mResources.LOCKED : mResources.NOLOCK, inforX + 8, this.yPaint += 12, 0);
                String var10;
                if ((var2.isTypeBody() || var2.isTypeMounts()) && (var10 = var2.template.type == 12 ? mResources.SPECUPGRADE : (var2.template.level >= 10 && var2.template.type < 10 ? (var2.upgrade == 0 ? mResources.NOUPGRADE : null) : mResources.NOTUPGRADE)) != null) {
                    this.paintMultiLine(var1, mFont.tahoma_7_white, (String) var10, inforX + 8, this.yPaint += 12, 0);
                    ++indexRowMax;
                }

                if (var2.template.gender == 0 || var2.template.gender == 1) {
                    if (var2.template.gender == Char.getMyChar().cgender) {
                        mFont.tahoma_7_white.drawString(var1, mResources.GENDER[var2.template.gender], inforX + 8, this.yPaint += 12, 0);
                        ++indexRowMax;
                    } else {
                        mFont.tahoma_7_red.drawString(var1, mResources.GENDER[var2.template.gender], inforX + 8, this.yPaint += 12, 0);
                        ++indexRowMax;
                    }
                }

                if (Char.getMyChar().clevel != -1) {
                    if (Char.getMyChar().clevel >= var2.template.level) {
                        this.paintMultiLine(var1, mFont.tahoma_7_white, (String) (mResources.LEVELNEED + " " + var2.template.level), inforX + 8, this.yPaint += 12, 0);
                    } else {
                        this.paintMultiLine(var1, mFont.tahoma_7_red, (String) (mResources.LEVELNEED + " " + var2.template.level), inforX + 8, this.yPaint += 12, 0);
                    }
                }

                boolean var11;
                if ((var2.template.id < 40 || var2.template.id > 48) && var2.template.id != 311 && var2.template.id != 375 && var2.template.id != 397 && var2.template.id != 552 && var2.template.id != 558) {
                    if ((var2.template.id < 49 || var2.template.id > 57) && var2.template.id != 312 && var2.template.id != 376 && var2.template.id != 398 && var2.template.id != 553 && var2.template.id != 559) {
                        if ((var2.template.id < 58 || var2.template.id > 66) && var2.template.id != 313 && var2.template.id != 377 && var2.template.id != 399 && var2.template.id != 554 && var2.template.id != 560) {
                            if ((var2.template.id < 67 || var2.template.id > 75) && var2.template.id != 314 && var2.template.id != 378 && var2.template.id != 400 && var2.template.id != 555 && var2.template.id != 561) {
                                if ((var2.template.id < 76 || var2.template.id > 84) && var2.template.id != 315 && var2.template.id != 379 && var2.template.id != 401 && var2.template.id != 556 && var2.template.id != 562) {
                                    if (var2.template.id >= 85 && var2.template.id <= 93 || var2.template.id == 316 || var2.template.id == 380 || var2.template.id == 402 || var2.template.id == 557 || var2.template.id == 563) {
                                        var11 = false;
                                        if (Char.getMyChar().nClass.classId == 6) {
                                            mFont.tahoma_7_white.drawString(var1, mResources.CLASSNEED + " " + nClasss[6].name, inforX + 8, this.yPaint += 12, 0);
                                        } else {
                                            mFont.tahoma_7_red.drawString(var1, mResources.CLASSNEED + " " + nClasss[6].name, inforX + 8, this.yPaint += 12, 0);
                                        }

                                        ++indexRowMax;
                                    }
                                } else {
                                    var11 = false;
                                    if (Char.getMyChar().nClass.classId == 5) {
                                        mFont.tahoma_7_white.drawString(var1, mResources.CLASSNEED + " " + nClasss[5].name, inforX + 8, this.yPaint += 12, 0);
                                    } else {
                                        mFont.tahoma_7_red.drawString(var1, mResources.CLASSNEED + " " + nClasss[5].name, inforX + 8, this.yPaint += 12, 0);
                                    }

                                    ++indexRowMax;
                                }
                            } else {
                                var11 = false;
                                if (Char.getMyChar().nClass.classId == 4) {
                                    mFont.tahoma_7_white.drawString(var1, mResources.CLASSNEED + " " + nClasss[4].name, inforX + 8, this.yPaint += 12, 0);
                                } else {
                                    mFont.tahoma_7_red.drawString(var1, mResources.CLASSNEED + " " + nClasss[4].name, inforX + 8, this.yPaint += 12, 0);
                                }

                                ++indexRowMax;
                            }
                        } else {
                            var11 = false;
                            if (Char.getMyChar().nClass.classId == 3) {
                                mFont.tahoma_7_white.drawString(var1, mResources.CLASSNEED + " " + nClasss[3].name, inforX + 8, this.yPaint += 12, 0);
                            } else {
                                mFont.tahoma_7_red.drawString(var1, mResources.CLASSNEED + " " + nClasss[3].name, inforX + 8, this.yPaint += 12, 0);
                            }

                            ++indexRowMax;
                        }
                    } else {
                        var11 = false;
                        if (Char.getMyChar().nClass.classId == 2) {
                            mFont.tahoma_7_white.drawString(var1, mResources.CLASSNEED + " " + nClasss[2].name, inforX + 8, this.yPaint += 12, 0);
                        } else {
                            mFont.tahoma_7_red.drawString(var1, mResources.CLASSNEED + " " + nClasss[2].name, inforX + 8, this.yPaint += 12, 0);
                        }

                        ++indexRowMax;
                    }
                } else {
                    var11 = false;
                    if (Char.getMyChar().nClass.classId == 1) {
                        mFont.tahoma_7_white.drawString(var1, mResources.CLASSNEED + " " + nClasss[1].name, inforX + 8, this.yPaint += 12, 0);
                    } else {
                        mFont.tahoma_7_red.drawString(var1, mResources.CLASSNEED + " " + nClasss[1].name, inforX + 8, this.yPaint += 12, 0);
                    }

                    ++indexRowMax;
                }

                if (!var2.isTypeMounts()) {
                    if (var2.template.id == 420) {
                        if (Char.getMyChar().nClass.classId != 1 && Char.getMyChar().nClass.classId != 2) {
                            mFont.tahoma_7_red.drawString(var1, mResources.SYSITEM[1], inforX + 8, this.yPaint += 12, 0);
                        } else {
                            mFont.tahoma_7_white.drawString(var1, mResources.SYSITEM[1], inforX + 8, this.yPaint += 12, 0);
                        }

                        ++indexRowMax;
                    } else if (var2.template.id == 421) {
                        if (Char.getMyChar().nClass.classId != 3 && Char.getMyChar().nClass.classId != 4) {
                            mFont.tahoma_7_red.drawString(var1, mResources.SYSITEM[2], inforX + 8, this.yPaint += 12, 0);
                        } else {
                            mFont.tahoma_7_white.drawString(var1, mResources.SYSITEM[2], inforX + 8, this.yPaint += 12, 0);
                        }

                        ++indexRowMax;
                    } else if (var2.template.id == 422) {
                        if (Char.getMyChar().nClass.classId != 5 && Char.getMyChar().nClass.classId != 6) {
                            mFont.tahoma_7_red.drawString(var1, mResources.SYSITEM[3], inforX + 8, this.yPaint += 12, 0);
                        } else {
                            mFont.tahoma_7_white.drawString(var1, mResources.SYSITEM[3], inforX + 8, this.yPaint += 12, 0);
                        }

                        ++indexRowMax;
                    }
                }

                if (var2.expires > 0L) {
                    if (!var2.isTypeUIShop() && !var2.isTypeUIShopLock() && !var2.isTypeUIStore() && !var2.isTypeUIBook() && !var2.isTypeUIFashion() && !var2.isTypeUIClanShop() && var2.typeUI != 39) {
                        if ((var3 = mFont.tahoma_7.getWidth(mResources.EXPIRES + ": " + var2.getExpiresString()) + 10) > inforW && !GameCanvas.isTouchControlLargeScreen) {
                            inforW = var3;
                        }

                        this.paintMultiLine(var1, mFont.tahoma_7_yellow, (String) (mResources.EXPIRES + ": " + var2.getExpiresString()), inforX + 8, this.yPaint += 12, 0);
                    } else {
                        if ((var3 = mFont.tahoma_7.getWidth(mResources.EXPIRES + ": " + var2.getExpiresShopString()) + 10) > inforW && !GameCanvas.isTouchControlLargeScreen) {
                            inforW = var3;
                        }

                        this.paintMultiLine(var1, mFont.tahoma_7_yellow, (String) (mResources.EXPIRES + ": " + var2.getExpiresShopString()), inforX + 8, this.yPaint += 12, 0);
                    }

                    ++indexRowMax;
                }

                if (!var2.template.description.equals("")) {
                    this.paintMultiLine(var1, mFont.tahoma_7_white, (String) var2.template.description, inforX + 8, this.yPaint += 12, 0);
                    ++indexRowMax;
                }

                if (!var2.isTypeUIMe() && var2.typeUI != 37) {
                    if (var2.isTypeUIShop() || var2.isTypeUIShopLock() || var2.isTypeUIStore() || var2.isTypeUIBook() || var2.isTypeUIFashion() || var2.isTypeUIClanShop()) {
                        if (var2.buyCoin > 0) {
                            if (var2.isTypeUIClanShop()) {
                                if ((var3 = mFont.tahoma_7.getWidth(mResources.replace(mResources.COIN_BUY_CLAN, NinjaUtil.numberToString(String.valueOf(var2.buyCoin)))) + 10) > inforW && !GameCanvas.isTouchControlLargeScreen) {
                                    inforW = var3;
                                }

                                mFont.tahoma_7_yellow.drawString(var1, mResources.replace(mResources.COIN_BUY_CLAN, NinjaUtil.numberToString(String.valueOf(var2.buyCoin))), inforX + 8, this.yPaint += 12, 0);
                            } else {
                                mFont.tahoma_7_yellow.drawString(var1, mResources.replace(mResources.COIN_BUY, NinjaUtil.numberToString(String.valueOf(var2.buyCoin))), inforX + 8, this.yPaint += 12, 0);
                            }

                            ++indexRowMax;
                        } else if (var2.buyCoinLock > 0) {
                            mFont.tahoma_7_yellow.drawString(var1, mResources.replace(mResources.COIN_LOCK_BUY, NinjaUtil.numberToString(String.valueOf(var2.buyCoinLock))), inforX + 8, this.yPaint += 12, 0);
                            ++indexRowMax;
                        } else if (var2.buyGold > 0) {
                            mFont.tahoma_7_yellow.drawString(var1, mResources.replace(mResources.GOLD_BUY, NinjaUtil.numberToString(String.valueOf(var2.buyGold))), inforX + 8, this.yPaint += 12, 0);
                            ++indexRowMax;
                        }
                    }
                } else {
                    mFont.tahoma_7_yellow.drawString(var1, mResources.replace(mResources.COIN_LOCK_SALE, NinjaUtil.numberToString(String.valueOf(var2.saleCoinLock))), inforX + 8, this.yPaint += 12, 0);
                    ++indexRowMax;
                }

                if (var2.template.type == 33) {
                    mFont.tahoma_7_yellow.drawString(var1, mResources.Level + ": " + (var2.upgrade + 1), inforX + 8, this.yPaint += 12, 0);
                    ++indexRowMax;
                }

                if (var2.isTypeBody() && var2.sys != 0) {
                    mFont.tahoma_7_blue1.drawString(var1, mResources.SYSITEM[var2.sys], inforX + 8, this.yPaint += 12, 0);
                    ++indexRowMax;
                }

                if (var2.expires != 0L && var2.options != null && var2.options.size() > 0) {
                    var11 = false;
                    boolean var12 = false;

                    for (int var6 = 0; var6 < var2.options.size(); ++var6) {
                        ItemOption var7 = (ItemOption) var2.options.elementAt(var6);
                        if (!var11 && var7.optionTemplate.type == 2) {
                            var11 = true;
                            String var8 = mResources.LINE[0] + ": ";
                            if (var2.template.type == 1) {
                                var8 = var8 + mResources.BODY[var2.template.type] + "(" + mResources.KICKSYS[this.itemFocus.sys] + ")";
                            } else if (var2.template.type == 0) {
                                var8 = var8 + mResources.BODY[6] + "(" + mResources.KICKSYS[this.itemFocus.sys] + "), " + mResources.BODY[5] + "(" + mResources.KICKSYS[this.itemFocus.sys] + ")";
                            } else if (var2.template.type == 6) {
                                var8 = var8 + mResources.BODY[0] + "(" + mResources.KICKSYS[this.itemFocus.sys] + "), " + mResources.BODY[5] + "(" + mResources.KICKSYS[this.itemFocus.sys] + ")";
                            } else if (var2.template.type == 5) {
                                var8 = var8 + mResources.BODY[0] + "(" + mResources.KICKSYS[this.itemFocus.sys] + "), " + mResources.BODY[6] + "(" + mResources.KICKSYS[this.itemFocus.sys] + ")";
                            } else if (var2.template.type == 2) {
                                var8 = var8 + mResources.BODY[8] + "(" + mResources.KICKSYS[this.itemFocus.sys] + "), " + mResources.BODY[7] + "(" + mResources.KICKSYS[this.itemFocus.sys] + ")";
                            } else if (var2.template.type == 8) {
                                var8 = var8 + mResources.BODY[2] + "(" + mResources.KICKSYS[this.itemFocus.sys] + "), " + mResources.BODY[7] + "(" + mResources.KICKSYS[this.itemFocus.sys] + ")";
                            } else if (var2.template.type == 7) {
                                var8 = var8 + mResources.BODY[2] + "(" + mResources.KICKSYS[this.itemFocus.sys] + "), " + mResources.BODY[8] + "(" + mResources.KICKSYS[this.itemFocus.sys] + ")";
                            } else if (var2.template.type == 4) {
                                var8 = var8 + mResources.BODY[3] + "(" + mResources.KICKSYS[this.itemFocus.sys] + "), " + mResources.BODY[9] + "(" + mResources.KICKSYS[this.itemFocus.sys] + ")";
                            } else if (var2.template.type == 3) {
                                var8 = var8 + mResources.BODY[4] + "(" + mResources.KICKSYS[this.itemFocus.sys] + "), " + mResources.BODY[9] + "(" + mResources.KICKSYS[this.itemFocus.sys] + ")";
                            } else if (var2.template.type == 9) {
                                var8 = var8 + mResources.BODY[4] + "(" + mResources.KICKSYS[this.itemFocus.sys] + "), " + mResources.BODY[3] + "(" + mResources.KICKSYS[this.itemFocus.sys] + ")";
                            }

                            if ((var3 = mFont.tahoma_7_white.getWidth(var8) + 15) > inforW && !GameCanvas.isTouchControlLargeScreen) {
                                inforW = var3;
                            }

                            this.paintMultiLine(var1, mFont.tahoma_7_white, (String) var8, inforX + 8, this.yPaint += 12, 0);
                            ++indexRowMax;
                        }

                        if (!var12 && var7.optionTemplate.type > 2 && var7.optionTemplate.type < 8) {
                            var12 = true;
                            mFont.tahoma_7_white.drawString(var1, mResources.LINE[1], inforX + 8, this.yPaint += 12, 0);
                            ++indexRowMax;
                        }

                        if (var7.optionTemplate.id == 65) {
                            this.paintMultiLine(var1, mFont.tahoma_7_blue, (String) (var2.template.id == 485 ? NinjaUtil.replace(var7.getOptionString(), mResources.EXP, mResources.MACHINE) : var7.getOptionString()), inforX + 8, this.yPaint += 12, 0);
                        } else if (var7.optionTemplate.id == 66) {
                            this.paintMultiLine(var1, mFont.tahoma_7_blue1, (String) (var2.template.id == 485 ? NinjaUtil.replace(var7.getOptionString(), mResources.VITALITY, mResources.POWER) : var7.getOptionString()), inforX + 8, this.yPaint += 12, 0);
                        } else if (var7.optionTemplate.type == 0) {
                            this.paintMultiLine(var1, mFont.tahoma_7_blue1, (String) (var2.isTypeUIShopView() ? var7.getOptionShopString() : var7.getOptionString()), inforX + 8, this.yPaint += 12, 0);
                        } else if (var7.optionTemplate.type == 1) {
                            this.paintMultiLine(var1, mFont.tahoma_7_green, (String) (var2.isTypeUIShopView() ? var7.getOptionShopString() : var7.getOptionString()), inforX + 8, this.yPaint += 12, 0);
                        } else if (var7.optionTemplate.type == 8) {
                            if (var7.optionTemplate.id == 85) {
                                this.paintMultiLine(var1, mFont.tahoma_7_yellow, (String) (var2.isTypeUIShopView() ? var7.getOptionShopString() : NinjaUtil.replace(var7.optionTemplate.name, "#", String.valueOf(var7.param))), inforX + 8, this.yPaint += 12, 0);
                            } else {
                                mFont var10002 = mFont.tahoma_7b_blue;
                                var2.isTypeUIShopView();
                                this.paintMultiLine(var1, var10002, (String) var7.getOptionShopString(), inforX + 8, this.yPaint += 12, 0);
                            }
                        } else if (var7.optionTemplate.type == 2 && var2.typeUI == 5 && var7.active == 1 || var7.optionTemplate.type == 3 && var2.upgrade >= 4 || var7.optionTemplate.type == 4 && var2.upgrade >= 8 || var7.optionTemplate.type == 5 && var2.upgrade >= 12 || var7.optionTemplate.type == 6 && var2.upgrade >= 14 || var7.optionTemplate.type == 7 && var2.upgrade >= 16) {
                            this.paintMultiLine(var1, mFont.tahoma_7_green, (String) (var2.isTypeUIShopView() ? var7.getOptionShopString() : var7.getOptionString()), inforX + 8, this.yPaint += 12, 0);
                        } else {
                            this.paintMultiLine(var1, mFont.tahoma_7_grey, (String) (var2.isTypeUIShopView() ? var7.getOptionShopString() : var7.getOptionString()), inforX + 8, this.yPaint += 12, 0);
                        }

                        ++indexRowMax;
                    }
                }

                if (isPaintLuckySpin) {
                    if (var2.template.id == 12) {
                        mFont.tahoma_7_red.drawString(var1, NinjaUtil.numberToString(this.yenValue[indexSelect]) + " " + mResources.YEN, inforX + 8, this.yPaint += 12, 0);
                    }

                    if (var2.template.type >= 0 && var2.template.type <= 9) {
                        mFont.tahoma_7_yellow.drawString(var1, mResources.MAX_OPTIONS, inforX + 8, this.yPaint += 12, 0);
                    }

                    ++indexRowMax;
                }

                if (indexRow >= 0 && (!GameCanvas.isTouch || GameCanvas.isTouch && GameCanvas.w < 320)) {
                    SmallImage.drawSmallImage(var1, 942, inforX + 1, inforY + 5 + indexRow * 12, 0, StaticObj.TOP_LEFT);
                }

                scrInfo.setStyle(indexRowMax, 12, inforX, inforY + 2, inforW, inforH - 4, true, 1);
            }
        }
    }

    private static void paintInforFrame(mGraphics var0) {
        resetTranslate(var0);
        var0.setColor(0);
        var0.fillRect(inforX - 2, inforY - 2, inforW + 5, inforH + 5);
        var0.setColor(13606712);
        var0.drawRect(inforX - 1, inforY - 1, inforW + 2, inforH + 2);
        var0.setColor(Paint.COLORBACKGROUND);
        var0.fillRect(inforX, inforY, inforW, inforH);
    }

    private static void setInfoFrameForLargeScreen() {
        if (GameCanvas.isTouchControlLargeScreen && (!isPaintClan || indexMenu != 0)) {
            inforX = popupX + 175;
            inforW = popupW - 179;
            inforY = popupY + 33;
            inforH = 138;
            if (isPaintTrade && indexMenu == 0) {
                inforX = popupX + 6 + 3 * indexSize;
                inforW = popupW - (11 + 6 * indexSize);
            }

            if (isPaintInfoMe) {
                if (indexMenu == 4) {
                    inforX = popupX + 33;
                    inforY = popupY + 87;
                    inforW = popupW - 67;
                    inforH = 75;
                    return;
                }

                if (indexMenu == 5) {
                    inforH = 161;
                }
            }

        }
    }

    public final void setLCR() {
        super.center = null;
        if (indexTitle != 0 || indexMenu != 1 && indexMenu != 3 && indexMenu != 4) {
            SkillTemplate var1;
            Skill var2;
            switch (indexMenu) {
                case 0:
                    if (indexTitle == 1) {
                        if (getItemFocus(3) != null) {
                            super.left = this.cmdBagSelectItem;
                            if (GameCanvas.isTouch && GameCanvas.w < 320 || !GameCanvas.isTouch) {
                                super.center = this.cmdBagViewItemInfo;
                            }
                        } else {
                            isPaintItemInfo = false;
                            super.left = this.cmdBagSortItem;
                        }
                    }
                    break;
                case 1:
                    if (indexTitle == 1) {
                        super.left = null;
                        if (indexSelect >= 0) {
                            var1 = Char.getMyChar().nClass.skillTemplates[indexSelect];
                            if ((var2 = Char.getMyChar().getSkill(var1)) != null) {
                                if (var2.point < var1.maxPoint) {
                                    super.left = new Command(mResources.UPPOINT, 14001);
                                }

                                if (var2.template.type != 1 && var2.template.type != 4 && var2.template.type != 2 && var2.template.type != 3) {
                                    super.center = null;
                                } else {
                                    super.center = new Command(mResources.SHORCUT, 11081);
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    if (indexTitle >= 1) {
                        super.left = new Command(mResources.UPPOINT, 11084);
                        super.center = new Command("", 11084);
                    }
                    break;
                case 3:
                    super.left = null;
                    super.center = new Command(mResources.CHANGE, 110854);
                    break;
                case 4:
                    if (indexTitle == 1) {
                        super.left = null;

                        Item var3;
                        if ((var3 = getItemFocus(5)) != null) {
                            if (currentCharViewInfo.charID == Char.getMyChar().charID) {
                                super.left = new Command(mResources.SELECT, 11082);
                                if (GameCanvas.isTouchControlLargeScreen) {
                                    this.updateItemInfo((int) 5, (Item) var3);
                                } else {
                                    super.center = new Command(mResources.VIEW, 11083);
                                }
                            } else if (GameCanvas.isTouchControlLargeScreen) {
                                this.updateItemInfo((int) 5, (Item) var3);
                            } else {
                                super.center = new Command(mResources.VIEW, 11083);
                            }
                            if (!this.cmdTrangbi2.l) {
                                this.cmdTrangbi2.y -= 25;
                                this.cmdTrangbi2.l = true;
                            }
                        } else {
                            if (this.cmdTrangbi2.l) {
                                this.cmdTrangbi2.l = false;
                                this.cmdTrangbi2.y += 25;
                            }
                            isPaintItemInfo = false;

                        }

                    }
                    break;
                case 5:
                    super.left = null;
                    if (indexTitle == 1 && indexSelect >= 0 && currentCharViewInfo.arrItemMounts[indexSelect] != null) {
                        if (Char.getMyChar().charID == currentCharViewInfo.charID) {
                            super.left = new Command(mResources.MOVEOUT, 1516);
                        }

                        super.center = new Command(GameCanvas.isTouchControlLargeScreen ? "" : mResources.VIEW, 1515);
                    }
                    break;
                case 6:
                    if (indexBijuuMenu == 0) {
                        super.left = null;
                        if (indexTitle == 1 && indexSelect >= 0 && currentCharViewInfo.arrItemViThu[indexSelect] != null) {
                            if (Char.getMyChar().charID == currentCharViewInfo.charID) {
                                super.left = new Command(mResources.MOVEOUT, 508);
                            }

                            super.center = new Command(GameCanvas.isTouchControlLargeScreen ? "" : mResources.VIEW, 503);
                        }
                    } else if (indexBijuuMenu == 1) {
                        if (indexTitle >= 1) {
                            super.left = new Command(mResources.UPPOINT, 504);
                        }
                    } else {
                        if (indexTitle == 1) {
                            super.left = null;
                            if (indexSelect >= 0) {
                                var1 = Char.getMyChar().nClass.skillTemplates[indexSelect];
                                if ((var2 = Char.getMyChar().getSkill(var1)) != null) {
                                    if (var2.point < var1.maxPoint) {
                                        super.left = new Command(mResources.UPPOINT, 14001);
                                    }

                                    if (var2.template.type != 1 && var2.template.type != 4 && var2.template.type != 2 && var2.template.type != 3) {
                                        super.center = null;
                                    } else {
                                        super.center = new Command(mResources.SHORCUT, 11081);
                                    }
                                }
                            }
                        }

                        if (indexTitle == 1) {
                            super.left = null;
                            if (indexSelect >= 0) {
                                var1 = Char.getMyChar().nClass.skillTemplates[indexSelect];
                                if ((var2 = Char.getMyChar().getSkill(var1)) != null) {
                                    if (var2.point < var1.maxPoint) {
                                        super.left = new Command(mResources.UPPOINT, 505);
                                    }

                                    super.center = null;
                                }
                            }
                        }
                    }
            }

            if (indexMenu != 6 && currentCharViewInfo.charID == Char.getMyChar().charID) {
                super.right = new Command(mResources.BACK, 11086);
            } else {
                super.right = this.cmdCloseAll;
            }
        } else {
            super.left = null;
        }
    }

    public final void doOpenUI(int var1) {
        indexTitle = 0;
        super.right = this.cmdCloseAll;
        switch (var1) {
            case 2:
                indexMenu = 0;
                isPaintWeapon = true;
                if (arrItemWeapon == null) {
                    Service.gI().requestItem(2);
                } else {
                    LockGame.advBF();
                }
            case 3:
            case 5:
            case 30:
            case 39:
            case 41:
            case 42:
            case 51:
            default:
                break;
            case 4:
                indexMenu = 0;
                isPaintBox = true;
                if (Char.getMyChar().arrItemBox == null) {
                    Service.gI().requestItem(4);
                }
                break;
            case 6:
                indexMenu = 0;
                isPaintStack = true;
                if (arrItemStack == null) {
                    Service.gI().requestItem(6);
                }
                break;
            case 7:
                indexMenu = 0;
                isPaintStackLock = true;
                if (arrItemStackLock == null) {
                    Service.gI().requestItem(7);
                }
                break;
            case 8:
                indexMenu = 0;
                isPaintGrocery = true;
                if (arrItemGrocery == null) {
                    Service.gI().requestItem(8);
                }
                break;
            case 9:
                indexMenu = 0;
                isPaintGroceryLock = true;
                if (arrItemGroceryLock == null) {
                    Service.gI().requestItem(9);
                }
                break;
            case 10:
                indexMenu = 0;
                isPaintUpGrade = true;
                arrItemUpGrade = new Item[18];
                break;
            case 11:
                indexMenu = 0;
                isPaintUpPearl = true;
                isTypeXu = true;
                arrItemUpPeal = new Item[24];
                break;
            case 12:
                indexMenu = 0;
                isPaintUpPearl = true;
                isTypeXu = false;
                arrItemUpPeal = new Item[24];
                break;
            case 13:
                indexMenu = 0;
                isPaintSplit = true;
                arrItemSplit = new Item[24];
                break;
            case 14:
                isPaintStore = true;
                indexMenu = 0;
                if (arrItemStore == null) {
                    Service.gI().requestItem(14);
                } else {
                    LockGame.advBF();
                }
                break;
            case 15:
                isPaintStore = true;
                indexMenu = 1;
                if (arrItemBook == null) {
                    Service.gI().requestItem(15);
                } else {
                    LockGame.advBF();
                }
                break;
            case 16:
                indexMenu = 0;
                isPaintLien = true;
                if (arrItemLien == null) {
                    Service.gI().requestItem(16);
                } else {
                    LockGame.advBF();
                }
                break;
            case 17:
                indexMenu = 0;
                isPaintNhan = true;
                if (arrItemNhan == null) {
                    Service.gI().requestItem(17);
                } else {
                    LockGame.advBF();
                }
                break;
            case 18:
                indexMenu = 0;
                isPaintNgocBoi = true;
                if (arrItemNgocBoi == null) {
                    Service.gI().requestItem(18);
                } else {
                    LockGame.advBF();
                }
                break;
            case 19:
                indexMenu = 0;
                isPaintPhu = true;
                if (arrItemPhu == null) {
                    Service.gI().requestItem(19);
                } else {
                    LockGame.advBF();
                }
                break;
            case 20:
                indexMenu = 0;
                isPaintNonNam = true;
                if (arrItemNonNam == null) {
                    Service.gI().requestItem(20);
                } else {
                    LockGame.advBF();
                }
                break;
            case 21:
                indexMenu = 0;
                isPaintNonNu = true;
                if (arrItemNonNu == null) {
                    Service.gI().requestItem(21);
                } else {
                    LockGame.advBF();
                }
                break;
            case 22:
                indexMenu = 0;
                isPaintAoNam = true;
                if (arrItemAoNam == null) {
                    Service.gI().requestItem(22);
                } else {
                    LockGame.advBF();
                }
                break;
            case 23:
                indexMenu = 0;
                isPaintAoNu = true;
                if (arrItemAoNu == null) {
                    Service.gI().requestItem(23);
                } else {
                    LockGame.advBF();
                }
                break;
            case 24:
                indexMenu = 0;
                isPaintGangTayNam = true;
                if (arrItemGangTayNam == null) {
                    Service.gI().requestItem(24);
                } else {
                    LockGame.advBF();
                }
                break;
            case 25:
                indexMenu = 0;
                isPaintGangTayNu = true;
                if (arrItemGangTayNu == null) {
                    Service.gI().requestItem(25);
                } else {
                    LockGame.advBF();
                }
                break;
            case 26:
                indexMenu = 0;
                isPaintQuanNam = true;
                if (arrItemQuanNam == null) {
                    Service.gI().requestItem(26);
                } else {
                    LockGame.advBF();
                }
                break;
            case 27:
                indexMenu = 0;
                isPaintQuanNu = true;
                if (arrItemQuanNu == null) {
                    Service.gI().requestItem(27);
                } else {
                    LockGame.advBF();
                }
                break;
            case 28:
                indexMenu = 0;
                isPaintGiayNam = true;
                if (arrItemGiayNam == null) {
                    Service.gI().requestItem(28);
                } else {
                    LockGame.advBF();
                }
                break;
            case 29:
                indexMenu = 0;
                isPaintGiayNu = true;
                if (arrItemGiayNu == null) {
                    Service.gI().requestItem(29);
                } else {
                    LockGame.advBF();
                }
                break;
            case 31:
                indexMenu = 0;
                isPaintUpGrade = true;
                isPaintUpGradeGold = true;
                arrItemUpGrade = new Item[18];
                break;
            case 32:
                isPaintStore = true;
                indexMenu = 2;
                if (arrItemFashion == null) {
                    Service.gI().requestItem(32);
                }
                break;
            case 33:
                indexMenu = 0;
                isPaintConvert = true;
                arrItemConvert = new Item[3];
                break;
            case 34:
                isPaintStore = true;
                indexMenu = 3;
                if (arrItemClanShop == null) {
                    Service.gI().requestItem(34);
                }
                break;
            case 35:
                isPaintEliteShop = true;
                indexMenu = 0;
                if (arrItemElites == null) {
                    Service.gI().requestItem(35);
                }
                break;
            case 36:
                indexMenu = 0;
                isPaintAuctionSale = true;
                itemSell = null;
                this.tfText = new TField();
                this.tfText.setMaxTextLenght(9);
                this.tfText.getIputType(1);
                this.tfText.width = 100;
                this.tfText.height = mScreen.ITEM_HEIGHT + 2;
                break;
            case 37:
                isPaintAuctionBuy = true;
                this.updateCommandForUI();
                break;
            case 38:
                arrItemSprin = null;
                isPaintLuckySpin = true;
                indexTitle = 1;
                this.updateCommandForUI();
                break;
            case 40:
                isPaintAuto = true;
                indexTitle = 1;
                indexRow = 0;
                this.updateCommandForUI();
                break;
            case 43:
                indexMenu = 0;
                isPaintLuyenThach = true;
                arrItemUpPeal = new Item[24];
                break;
            case 44:
                indexMenu = 0;
                isPaintTinhluyen = true;
                arrItemSplit = new Item[24];
                break;
            case 45:
                indexMenu = 0;
                isPaintDichChuyen = true;
                arrItemSplit = new Item[24];
                break;
            case 46:
                indexMenu = 0;
                isPaintLuyenNgoc = true;
                arrItemSplit = new Item[24];
                break;
            case 47:
                indexMenu = 0;
                isPaintKhamNgoc = true;
                arrItemUpGrade = new Item[18];
                break;
            case 48:
                indexMenu = 0;
                isPaintGiaoDo = true;
                arrItemSplit = new Item[18];
                break;
            case 49:
                indexMenu = 0;
                isPaintGotNgoc = true;
                itemSplit = null;
                break;
            case 50:
                indexMenu = 0;
                isPaintThaoNgoc = true;
                itemSplit = null;
                break;
            case 52:
                isPaintStore = true;
                indexMenu = 52;
                Service.gI().requestItem(52);
                break;
            case 53:
                indexMenu = 0;
                isPaintCheDo = true;
                arrItemSplit = new Item[24];
        }

        setPopupSize(175, 200);
        GameScr var4 = this;
        this.nsoTP = new int[9];
        this.nsoTQ = new int[9];
        int var3 = popupX + 3;
        int var2 = popupY + 34 + indexSize;
        var4.nsoTP[0] = popupX + 74;
        var4.nsoTQ[0] = var2 + 4;
        var4.nsoTP[1] = var3 + 1;
        var4.nsoTQ[1] = var2 - indexSize;
        var4.nsoTP[2] = var3 + popupW / 2 - indexSize / 2 - 2;
        var4.nsoTQ[2] = var2 - indexSize;
        var4.nsoTP[3] = var4.nsoTP[1];
        var4.nsoTP[4] = var4.nsoTP[0];
        var4.nsoTP[5] = var4.nsoTP[2];
        var4.nsoTQ[3] = var4.nsoTQ[1] + indexSize * 3 - 2;
        var4.nsoTQ[4] = var4.nsoTQ[1] + indexSize * 3 - 2;
        var4.nsoTQ[5] = var4.nsoTQ[1] + indexSize * 3 - 2;
        var4.nsoTP[6] = var4.nsoTP[1];
        var4.nsoTP[7] = var4.nsoTP[0];
        var4.nsoTP[8] = var4.nsoTP[2];
        var4.nsoTQ[6] = var4.nsoTQ[1] + (indexSize << 2) + 10;
        var4.nsoTQ[7] = var4.nsoTQ[1] + (indexSize << 2) + 10;
        var4.nsoTQ[8] = var4.nsoTQ[1] + (indexSize << 2) + 10;
    }

    public static Char findCharInMap(int var0) {
        for (int var1 = 0; var1 < vCharInMap.size(); ++var1) {
            Char var2;
            if ((var2 = (Char) vCharInMap.elementAt(var1)).charID == var0) {
                return var2;
            }
        }

        return null;
    }

    public static BuNhin findBuNhinInMap(int var0) {
        return vBuNhin.size() > 0 ? (BuNhin) vBuNhin.elementAt(var0) : null;
    }

    public final void onChatFromMe(String var1, String var2) {
        if (!isPaintMessage || GameCanvas.isTouch) {
            ChatTextField.gI().isShow = false;
        }

        nsoMG = 5;
        if (!var1.equals("")) {
            if (var2.equals(mResources.PUBLICCHAT[0])) {
                if (!Code.chat(var1)) {
                    Service.gI().chat(var1);
                    return;
                }
            } else if (var2.equals(mResources.PARTYCHAT[0])) {
                if (vParty.size() == 0) {
                    ChatManager.gI().getCurrentChatTab().addInfo(mResources.NOT_IN_PARTY);
                } else {
                    Service.gI().chatParty(var1);
                }
            } else if (var2.equals(mResources.GLOBALCHAT[0])) {
                Service.gI().chatGlobal(var1);
            } else if (var2.equals(mResources.CLANCHAT[0])) {
                if (Char.getMyChar().cClanName.equals("")) {
                    ChatManager.gI().getCurrentChatTab().addInfo(mResources.NOT_IN_CLAN);
                } else {
                    Service.gI().chatClan(var1);
                }
            } else {
                ChatManager.gI().addChat(var2, Char.getMyChar().cName, var1);
                Service.gI().chatPrivate(var2, var1);
            }
        }
    }

    public final void onCancelChat() {
        if (isPaintMessage) {
            this.doCloseAlert();
            isPaintMessage = false;
            ChatTextField.gI().center = null;
        }

    }

    private void indexPointer(int var1, int var2, int var3, int var4, int var5) {
        if (isPaintUpPearl || isPaintLuyenThach || isPaintTinhluyen || isPaintDichChuyen || isPaintSplit || isPaintTrade || isPaintUpGrade || isPaintConvert || isPaintAuctionSale || isPaintLuyenNgoc || isPaintCheDo || isPaintKhamNgoc || isPaintGotNgoc || isPaintThaoNgoc) {
            int var6 = var3 * indexSize;
            var4 *= indexSize;
            scrMain.clear();
            if (GameCanvas.isPointerHoldIn(var1, var2, var6, var4)) {
                indexTitle = var5;
                if (GameCanvas.isPointerClick) {
                    if ((var1 = (GameCanvas.pxLast - var1) / indexSize + (GameCanvas.pyLast - var2) / indexSize * var3) / columns < rows) {
                        indexSelect = var1;
                    }

                    super.left = super.center = null;
                    if (isPaintTrade) {
                        if (indexSelect < 0) {
                            indexSelect = 11;
                        }

                        if (indexSelect > 11) {
                            indexSelect = 11;
                        }
                    }

                    this.updateCommandForUI();
                }
            }
        }

    }

    public final void actionPerform(int var1, Object var2) {
        String var3 = null;
        var3 = null;
        MyVector var4 = null;
        Member var9;
        Item var10;
        Npc var12;
        ChatTab var14;
        Object[] var15;
        int var16;
        Skill var17;
        Item var20;
        switch (var1) {
            case 1:
                GameCanvas.endDlg();
                return;
            case 2:
                GameCanvas.endDlg();
                super.left = super.center = null;
                this.updateCommandForUI();
                return;
            case 3:
                this.doCloseAlert();
                return;
            case 222:
                this.actSplitItemBag_luyenngoc();
                return;
            case 333:
                this.doOpenUI((int) 47);
                return;
            case 334:
                this.actUpgrade_HanhTrang();
                return;
            case 335:
                isViewNext = false;
                this.updateItemInfo((int) 3, (Item) itemSplit);
                return;
            case 336:
                isViewNext = false;
                this.updateItemInfo((int) 3, (Item) itemUpGrade);
                return;
            case 337:
                this.act_update_khamngoc();
                return;
            case 338:
                this.setCMD_act_KhamNgoc(0);
                return;
            case 339:
                this.actKhamNgocMoveOut(0);
                return;
            case 340:
                this.actKhamNgocMoveOut(1);
                return;
            case 341:
                this.khamngoc();
                return;
            case 342:
                actConfirmKhamNgoc();
                return;
            case 343:
                this.actKhamNgocMoveOut(2);
                return;
            case 344:
                this.setCMD_act_KhamNgoc(1);
                return;
            case 345:
                this.setCMD_act_KhamNgoc(2);
                return;
            case 400:
                this.act_update_giaodo();
                return;
            case 401:
                this.setCMD_act_GiaoDo();
                return;
            case 402:
                this.actGiaoDoMoveOut();
                return;
            case 403:
                sendGiaoDo();
                return;
            case 405:
                actSplitItemBag_gotngoc();
                return;
            case 500:
                this.actBijuuSelect();
                return;
            case 501:
                Service.gI().itemMonToBag(indexSelect);
                return;
            case 502:
                this.doBiJuu();
                return;
            case 503:
                this.updateItemInfo((int) 51, (Item) currentCharViewInfo.arrItemViThu[indexSelect]);
                return;
            case 504:
                actBijuuMenuPoint();
                return;
            case 505:
                actBijuuKyNang();
                return;
            case 508:
                Service.gI().doRemoveVithu(indexSelect);
                return;
            case 999:
                this.doOpenUI((int) 35);
                return;
            case 1000:
                Service.gI().rewardPB();
                this.resetButton();
                return;
            case 1500:
                (var4 = new MyVector()).addElement(new Command(mResources.MOVEOUT, 15001));
                if (Char.getMyChar().xu >= 5000) {
                    var4.addElement(new Command(mResources.SALE, 15002));
                }

                GameCanvas.menu.startAt(var4);
                return;
            case 1501:
                this.updateItemInfo((int) 3, (Item) itemSell);
                return;
            case 1502:
                this.tfText.nsoAA();
                return;
            case 1503:
                doBagToStand();
                return;
            case 1504:
                domenuItemStand();
                return;
            case 1505:
                this.updateItemInfo((int) 3, (Item) arrItemStands[indexSelect].item);
                return;
            case 1506:
                if (arrItemSprin != null) {
                    this.yenTemp = 0;
                    isPaintItemInfo = false;
                    indexCard = -1;
                    arrItemSprin = null;
                    gI().left = new Command(mResources.SELECT, 1506);
                    return;
                }

                indexCard = indexSelect;
                Service.gI().selectCard();
                GameCanvas.startWaitDlgWithoutCancel();
                return;
            case 1507:
                this.doviewCardsInfo();
                return;
            case 1508:
                var4 = new MyVector();
                if ((var20 = Char.clan.items[indexSelect]) != null) {
                    if (var20.template.id == 281) {
                        var4.addElement(new Command(mResources.USE, 15081));
                    } else {
                        var4.addElement(new Command(mResources.CLAN_BOX, 15082));
                    }

                    GameCanvas.menu.startAt(var4);
                    return;
                }
                break;
            case 1509:
                if (indexSelect >= 0 && Char.clan != null) {
                    this.updateItemInfo((int) 39, (Item) Char.clan.items[indexSelect]);
                    return;
                }

                isPaintItemInfo = false;
                return;
            case 1510:
                doAutoSelect();
                return;
            case 1511:
                var3 = GameCanvas.inputDlg.tfInput.getText();
                GameCanvas.endDlg();

                try {
                    if (var3.equals("")) {
                        GameCanvas.startOKDlg(mResources.INVALID_NUM);
                        return;
                    }

                    if ((var16 = (Integer.valueOf(var3)).intValue()) >= 10 && var16 <= 90) {
                        Char.aHpValue = var16;
                        return;
                    }

                    GameCanvas.startOKDlg(mResources.INVALID_NUM);
                    return;
                } catch (Exception var8) {
                    GameCanvas.startOKDlg(mResources.INVALID_NUM);
                    return;
                }
            case 1512:
                var3 = GameCanvas.inputDlg.tfInput.getText();
                GameCanvas.endDlg();

                try {
                    if (var3.equals("")) {
                        GameCanvas.startOKDlg(mResources.INVALID_NUM);
                        return;
                    }

                    if ((var16 = (Integer.valueOf(var3)).intValue()) >= 10 && var16 <= 90) {
                        Char.aMpValue = var16;
                        return;
                    }

                    GameCanvas.startOKDlg(mResources.INVALID_NUM);
                    return;
                } catch (Exception var7) {
                    GameCanvas.startOKDlg(mResources.INVALID_NUM);
                    return;
                }
            case 1515:
                this.updateItemInfo((int) 41, (Item) currentCharViewInfo.arrItemMounts[indexSelect]);
                return;
            case 1516:
                Service.gI().itemMonToBag(indexSelect);
                return;
            case 1600:
                doLuyenThach();
                return;
            case 1601:
                actLuyenThachSelect();
                return;
            case 1602:
                var20 = getItemFocus(43);
                this.updateItemInfo((int) 3, (Item) var20);
                return;
            case 1603:
                this.actgetLuyenThachItems();
                return;
            case 1604:
                var4 = new MyVector();
                if (arrItemSplit[indexSelect] != null) {
                    var4.addElement(new Command(mResources.MOVEOUT, 1605));
                }

                var4.addElement(new Command(mResources.BEGIN, 11105));
                GameCanvas.menu.startAt(var4);
                return;
            case 1605:
                this.actTinhLuyenMoveOut();
                return;
            case 1606:
                this.actDichChuyenTrangBiLeft();
                return;
            case 1700:
                this.luckyDraw_refresh();
                return;
            case 1701:
                luckyDraw_Tf();
                return;
            case 1702:
                this.doCloseLucky_Draw();
                return;
            case 2000:
                Service.gI().rewardCT();
                this.resetButton();
                return;
            case 2001:
                Service.gI().throwItem(indexSelect);
                return;
            case 2002:
                GameCanvas.endDlg();
                return;
            case 2003:
                if (indextabTrangbi == 0) {
                    indextabTrangbi = 16;
                    this.cmdTrangbi2.caption = mResources.tbi1;
                    return;
                } else {
                    indextabTrangbi = 0;
                    this.cmdTrangbi2.caption = mResources.tbi2;
                }
                if (!GameCanvas.isTouch) {
                    super.left = new Command(mResources.SELECT, 11082);
                    return;
                }
                break;
            case 2004:
                return;
            case 5021:
                this.doBiJuu_Point();
                return;
            case 5022:
                this.doBiJuu_Skill();
                return;
            case 5041:
                Service.gI().upPotential(indexTitle - 1, 1);
                this.setLCR();
                return;
            case 5042:
                this.doBijuuUpPoint();
                return;
            case 5043:
                actBijuuUpPoint();
                return;
            case 5051:
                Service.gI().upSkill(Char.getMyChar().nClass.skillTemplates[indexSelect].id, 1);
                this.setLCR();
                return;
            case 5052:
                this.doBijuuUpSkill();
                return;
            case 5053:
                actBijSkillUpPoint();
                break;
            case 9999:
                this.doOpenUI((int) 37);
                return;
            case 11000:
                actMenu();
                return;
            case 11001:
                Char.getMyChar().findNextFocusByKey();
                return;
            case 11002:
                actAddFriendAccept();
                return;
            case 11003:
                actSkillUpPoint();
                return;
            case 11004:
                this.actView((byte) 25);
                return;
            case 11005:
                actGangTayNuBuy();
                return;
            case 11006:
                actAddPotential();
                return;
            case 11007:
                this.actView((byte) 24);
                return;
            case 11008:
                actGangTayNamBuy();
                return;
            case 11009:
                this.actView((byte) 23);
                return;
            case 11010:
                actAoNuBuy();
                return;
            case 11011:
                this.actView((byte) 22);
                return;
            case 11012:
                actAoNamBuy();
                return;
            case 11013:
                this.actView((byte) 21);
                return;
            case 11014:
                actNonNuBuy();
                return;
            case 11015:
                this.actView((byte) 20);
                return;
            case 11016:
                actNonNamBuy();
                return;
            case 11017:
                this.actView((byte) 15);
                return;
            case 11018:
                actStoreLockBuy();
                return;
            case 11019:
                this.actView((byte) 14);
                return;
            case 11020:
                actStoreBuy();
                return;
            case 11021:
                svTitle = "";
                svAction = "";
                this.resetButton();
                return;
            case 11022:
                this.actBagSelectItem();
                return;
            case 11023:
                this.actBagViewItemInfo();
                return;
            case 11024:
                actBagThrowItem();
                return;
            case 11025:
                this.doCloseItemInfo();
                return;
            case 11026:
                actBagUseItem();
                return;
            case 11027:
                this.actTradeSelectInList();
                return;
            case 11028:
                this.actTradeSelectInBag();
                return;
            case 11029:
                this.actTradeSelectItem();
                return;
            case 11030:
                this.actTradeViewItemInfo();
                return;
            case 11032:
                this.actTradeLock();
                return;
            case 11033:
                this.actTradeAccept();
                return;
            case 11034:
                this.actUpgradeMoveOut();
                return;
            case 11035:
                this.actSplitMoveOut();
                return;
            case 11036:
                actionCoinTrade();
                return;
            case 11037:
                this.actTradeMoveOut();
                return;
            case 11038:
                actDead();
                return;
            case 11040:
                this.actleftItemInfo();
                return;
            case 11041:
                this.actrightItemInfo();
                return;
            case 11042:
                actCoinOut();
                return;
            case 11043:
                actCoinIn();
                return;
            case 11044:
                domenuFriendLeft();
                return;
            case 11045:
                domenuFindTeam();
                return;
            case 11046:
                domenuFindTeamCenter();
                return;
            case 11047:
                domenuTeamLeft();
                return;
            case 11048:
                actBoxSort();
                return;
            case 11049:
                actionCoinOut();
                return;
            case 11050:
                actionCoinIn();
                return;
            case 11051:
                actUseItem();
                return;
            case 11052:
                var10 = (Item) var2;
                Service.gI().useItemChangeMap(var10.indexUI, GameCanvas.menu.menuSelectedItem);
                return;
            case 11053:
                doItemChangeMap(var10 = (Item) var2);
                return;
            case 11054:
                this.doOpenUIZone();
                return;
            case 11055:
                doActionBuy(var10 = (Item) var2);
                return;
            case 11057:
                Npc var22 = (Npc) var2;
                Service.gI().getTask(var22.template.npcTemplateId, GameCanvas.menu.menuSelectedItem, -1);
                return;
            case 11058:
                var10 = (Item) var2;
                GameCanvas.endDlg();
                Service.gI().saleItem(var10.indexUI, Integer.parseInt(GameCanvas.inputDlg.tfInput.getText()));
                return;
            case 11059:
                this.actdoChooseSkill();
                return;
            case 11060:
                this.actdoMiniInfo();
                return;
            case 11061:
                actSaleConfirm(var10 = (Item) var2);
                return;
            case 11062:
                upPearl();
                return;
            case 11063:
                actConfirmUpgrade();
                return;
            case 11064:
                Service.gI().upPotential(indexTitle - 1, 1);
                this.setLCR();
                return;
            case 11065:
                this.doUpPotential();
                return;
            case 11066:
                this.doCloseAlert();
                isPaintMessage = false;
                isMessageMenu = false;
                ChatTextField.gI().center = null;
                return;
            case 11067:
                if (TileMap.zoneID != indexSelect) {
                    Service.gI().requestChangeZone(indexSelect, this.indexItemUse);
                    return;
                }

                InfoMe.addInfo(mResources.ZONE_HERE);
                return;
            case 11068:
                var3 = (String) var2;
                this.actOpenWeb(var3);
                return;
            case 11069:
                this.actOpenWebCancel();
                return;
            case 11070:
                Party var21;
                actRefresh_TeamLeader(var21 = (Party) var2);
                return;
            case 11071:
                Service.gI().outParty();
                return;
            case 11072:
                actSaleItem();
                return;
            case 11073:
                actionSale(Char.getMyChar().arrItemBag[indexSelect]);
                return;
            case 11074:
                MyVector var18;
                short var11 = Short.parseShort(String.valueOf((var18 = (MyVector) var2).elementAt(0)));
                String var19 = String.valueOf(var18.elementAt(1));
                this.actSendSMSLeft(var11, var19);
                return;
            case 11075:
                this.actSendSMSRight();
                return;
            case 11076:
                var3 = (String) var2;
                Service.gI().addParty(var3);
                return;
            case 11077:
                actConfirmRemoveFriend(var3 = (String) var2);
                return;
            case 11078:
                actSetEnemiesCommand();
                return;
            case 11079:
                actSetFriendCommand();
                return;
            case 11080:
                actSetPartyCommand(var3 = (String) var2);
                return;
            case 11081:
                actdoGan();
                return;
            case 11082:
                actTrangBiSelect();
                return;
            case 11083:
                this.actView((byte) 5);
                return;
            case 11084:
                actdoUpPoint();
                return;
            case 11085:
                actBuyQuanNam();
                return;
            case 11086:
                this.actTrangBiRight();
                return;
            case 11087:
                var10 = (Item) var2;
                GameCanvas.endDlg();
                Service.gI().splitItem(var10);
                return;
            case 11088:
                this.actView((byte) 26);
                return;
            case 11089:
                this.actView((byte) 27);
                return;
            case 11090:
                this.actView((byte) 28);
                return;
            case 11091:
                this.actView((byte) 29);
                return;
            case 11092:
                actBuyLeft(var10 = (Item) var2);
                return;
            case 11093:
                this.actView((byte) 2);
                return;
            case 11094:
                this.actView((byte) 6);
                return;
            case 11095:
                this.actView((byte) 7);
                return;
            case 11096:
                this.actView((byte) 8);
                return;
            case 11097:
                this.actView((byte) 9);
                return;
            case 11098:
                this.actUpgradeLeft();
                return;
            case 11099:
                isViewNext = false;
                this.updateItemInfo((int) 3, (Item) itemUpGrade);
                return;
            case 11100:
                actUpgradeBag();
                return;
            case 11101:
                var20 = getItemFocus(10);
                this.updateItemInfo((int) 3, (Item) var20);
                return;
            case 11102:
                this.actUpgrade_HanhTrang();
                return;
            case 11103:
                this.actSplitItem();
                return;
            case 11104:
                this.updateItemInfo((int) 3, (Item) ((Item) var2));
                return;
            case 11105:
                split();
                return;
            case 11106:
                this.actSplitItemBag();
                return;
            case 11107:
                actUpPearlSelect();
                return;
            case 11108:
                this.actView((byte) 3);
                return;
            case 11109:
                this.actUpPearlItems();
                return;
            case 11110:
                var20 = arrItemTradeOrder[indexSelect];
                this.updateItemInfo((int) 30, (Item) var20);
                return;
            case 11111:
                var20 = getItemFocus(4);
                this.updateItemInfo((int) 4, (Item) var20);
                return;
            case 11112:
                Service.gI().boxSort();
                return;
            case 11113:
                Service.gI().itemBagToBox(Char.getMyChar().arrItemBag[indexSelect].indexUI);
                return;
            case 11114:
                this.updateItemInfo((int) 3, (Item) Char.getMyChar().arrItemBag[indexSelect]);
                return;
            case 11115:
                actBuyItemUILeft();
                return;
            case 11116:
                actBuyItemLeft2();
                return;
            case 11120:
                var17 = (Skill) (var15 = (Object[]) var2)[0];
                var16 = Integer.parseInt((String) var15[1]);
                onScreenSkill[var16] = var17;
                saveOnScreenSkillToRMS();
                return;
            case 11121:
                var17 = (Skill) (var15 = (Object[]) var2)[0];
                var16 = Integer.parseInt((String) var15[1]);
                keySkill[var16] = var17;
                saveKeySkillToRMS();
                return;
            case 12000:
                this.actOpenAlertURL();
                return;
            case 12001:
                ChatManager.gI().switchToTab(((Integer) var2).intValue());
                this.openUIChatTab();
                return;
            case 12002:
            case 12004:
                var3 = (String) var2;
                if ((var14 = ChatManager.gI().findTab(var3)) == null) {
                    ChatManager.gI().addNewTab(var3);
                    ChatManager.gI().switchToLastTab();
                } else {
                    ChatManager.gI().switchToTab(var14);
                }

                this.openUIChatTab();
                isPaintFindTeam = false;
                isPaintClan = false;
                isPaintEnemies = false;
                isPaintFriend = false;
                isPaintTeam = false;
                ChatTextField.gI().center = null;
                return;
            case 12003:
                this.doShowFriendUI();
                return;
            case 12005:
                this.doShowChatTextFieldInMessage();
                return;
            case 12006:
                doShowBlockMessageMenu();
                return;
            case 12007:
                this.step = 1;
                this.strErrCard = "";
                this.doShowErrorInput();
                return;
            case 12008:
                domenuErrorAdim();
                return;
            case 12009:
                var3 = (String) var2;
                MyVector var13;
                (var13 = new MyVector()).addElement(new Command(mResources.CHAR_ORDER[7], 12002, var3));
                var13.addElement(new Command(mResources.TEAMLEADER_SELECT[2], 110803, var3));
                if (isPaintTeam) {
                    var13.addElement(new Command(mResources.CHAR_ORDER[6], 110804));
                }

                if (isPaintMessage) {
                    var13.addElement(new Command(mResources.MOVETO, 14020, var3));
                    var13.addElement(new Command(mResources.CHAR_ORDER[6], 1108041, var3));
                }

                GameCanvas.menu.startAt(var13);
                return;
            case 13001:
                this.actView((byte) 32);
                return;
            case 13002:
                actStoreFashionBuy();
                return;
            case 14001:
                actdoKyNang();
                return;
            case 14002:
                this.doUnfocusChar();
                return;
            case 14003:
                this.doCharFocusList();
                return;
            case 14004:
                domenuClanNotice();
                return;
            case 14005:
                this.domenuClanLeader();
                return;
            case 14006:
                actSetClanCommand(var3 = (String) var2);
                return;
            case 14007:
                domenuClanConfig();
                return;
            case 14008:
                GameCanvas.startYesNoDlg(mResources.MOVE_OUT_CLAN1, new Command(mResources.YES, 140081), new Command(mResources.NO, 1));
                return;
            case 14009:
                domenuClanPermission();
                return;
            case 14010:
                GameCanvas.inputDlg.show(mResources.INPUT_CLAN_CONTRIBUTE, new Command(mResources.ACCEPT, GameCanvas.instance, 88833, (Object) null), 1);
                return;
            case 14011:
                isMessageMenu = false;
                return;
            case 14012:
                this.actConvert_HanhTrang();
                return;
            case 14013:
                this.actConvertLeft();
                return;
            case 14014:
                this.actConvertMoveOut();
                return;
            case 14015:
                this.actItemConvertMoveOut();
                return;
            case 14016:
                this.updateItemInfo((int) 3, (Item) arrItemConvert[indexSelect]);
                return;
            case 14017:
                domenuEnemieLeft();
                return;
            case 14018:
                this.actView((byte) 34);
                return;
            case 14019:
                actClanStoreBuy();
                return;
            case 14020:
                if (isHaveVanBienLenh()) {
                    var3 = (String) var2;
                    Service.gI().textBoxId((short) 1, (String) var3);
                    return;
                }

                GameCanvas.startOKDlg(mResources.ALERT_MOVETO);
                return;
            case 14021:
                actSetDunListCommand();
                return;
            case 14022:
                actEliteShopBuy();
                return;
            case 14023:
                this.actView((byte) 35);
                return;
            case 14024:
                this.actSetRankedListCommand((byte) 1);
                return;
            case 14025:
                this.actSetRankedListCommand((byte) 0);
                return;
            case 15001:
                this.doStandToBag();
                return;
            case 15002:
                try {
                    if ((var1 = Integer.parseInt(this.tfText.getText())) <= 0) {
                        GameCanvas.startOKDlg(mResources.INVALID_NUM);
                    }

                    GameCanvas.startYesNoDlg(mResources.replace(mResources.SALE_ASK, NinjaUtil.numberToString(String.valueOf(var1))), new Command(mResources.YES, 150021), new Command(mResources.NO, 1));
                    return;
                } catch (Exception var6) {
                    GameCanvas.startOKDlg(mResources.INVALID_NUM);
                    return;
                }
            case 15041:
                domenuSortItemStand();
                return;
            case 15042:
                GameCanvas.startYesNoDlg(mResources.replace(mResources.BUY_ASK, NinjaUtil.numberToString(String.valueOf(arrItemStands[indexSelect].price))), new Command(mResources.YES, 150421), new Command(mResources.NO, 1));
                return;
            case 15081:
                Service.gI().useClanItem();
                return;
            case 15082:
                GameCanvas.inputDlg.show(mResources.INPUT_MEM_NAME, new Command(mResources.OK, GameCanvas.instance, 88843, new Integer(indexSelect)), 0);
                return;
            case 15130:
                Char.aFoodValue = 1;
                return;
            case 15131:
                Char.aFoodValue = 10;
                return;
            case 15132:
                Char.aFoodValue = 20;
                return;
            case 15133:
                Char.aFoodValue = 30;
                return;
            case 15134:
                Char.aFoodValue = 40;
                return;
            case 15135:
                Char.aFoodValue = 50;
                return;
            case 15136:
                Char.aFoodValue = 60;
                return;
            case 15137:
                Char.aFoodValue = 70;
                return;
            case 15138:
                Char.aFoodValue = 90;
                return;
            case 15140:
                Char.aTBValue = 1;
                return;
            case 15141:
                Char.aTBValue = 10;
                return;
            case 15142:
                Char.aTBValue = 20;
                return;
            case 15143:
                Char.aTBValue = 30;
                return;
            case 15144:
                Char.aTBValue = 40;
                return;
            case 15145:
                Char.aTBValue = 50;
                return;
            case 15146:
                Char.aTBValue = 60;
                return;
            case 15147:
                Char.aTBValue = 70;
                return;
            case 15148:
                Char.aTBValue = 90;
                return;
            case 15150:
                Char.aHpMpValue = 1;
                return;
            case 15151:
                Char.aHpMpValue = 10;
                return;
            case 15153:
                Char.aHpMpValue = 30;
                return;
            case 15155:
                Char.aHpMpValue = 50;
                return;
            case 15157:
                Char.aHpMpValue = 70;
                return;
            case 15158:
                Char.aHpMpValue = 90;
                return;
            case 15161:
                Char.aDaValue = 1;
                return;
            case 15162:
                Char.aDaValue = 2;
                return;
            case 15163:
                Char.aDaValue = 3;
                return;
            case 15164:
                Char.aDaValue = 4;
                return;
            case 15165:
                Char.aDaValue = 5;
                return;
            case 15166:
                Char.aDaValue = 6;
                return;
            case 15167:
                Char.aDaValue = 7;
                return;
            case 15174:
                Char.aLuyenDaValue = 4;
                return;
            case 15175:
                Char.aLuyenDaValue = 5;
                return;
            case 15176:
                Char.aLuyenDaValue = 6;
                return;
            case 15177:
                Char.aLuyenDaValue = 7;
                return;
            case 15178:
                Char.aLuyenDaValue = 8;
                return;
            case 15179:
                Char.aLuyenDaValue = 9;
                return;
            case 19874:
                CuongScr.advAA("Bạn có chắc muốn hủy hết d.s bán?", CuongScr.advAA("Đồng ý", 877), CuongScr.advAA("Đóng", 999));
                return;
            case 19875:
                InfoDlg.hide();
                isPaintAlert = true;
                this.isLockKey = true;
                indexRow = 0;
                setPopupSize(175, 200);
                super.right = new Command(mResources.CLOSE, 3);
                super.left = new Command("Xóa hết", 19876);
                super.center = null;
                this.textsTitle = "Acc nhận đồ";
                this.texts = AutoTrade.getTradeCharList();
                return;
            case 19876:
                CuongScr.advAA("Bạn có chắc muốn xóa hết d.s acc bán hàng?", CuongScr.advAA("Đồng ý", 878), CuongScr.advAA("Đóng", 999));
                break;
            case 110001:
                this.doMenuInforMe();
                return;
            case 110002:
                doShowMap();
                return;
            case 110003:
                doMenusynthesis();
                return;
            case 110004:
                actMenu4();
                return;
            case 110005:
                this.doOpenUI((int) 14);
                return;
            case 110006:
                actOrder();
                return;
            case 110007:
                this.doOpenUI((int) 7);
                return;
            case 110008:
                this.doOpenUI((int) 6);
                return;
            case 110009:
                this.doOpenUI((int) 9);
                return;
            case 110010:
                this.doOpenUI((int) 8);
                return;
            case 110011:
                this.doOpenUI((int) 10);
                return;
            case 110012:
                this.doOpenUI((int) 11);
                return;
            case 110013:
                this.doOpenUI((int) 12);
                return;
            case 110014:
                Npc npcne;
                if ((npcne = findNPC(5)) != null && (Math.abs(npcne.cx - Char.getMyChar().cx) > 22 || Math.abs(npcne.cy - Char.getMyChar().cy) > 22)) {
                    Char.moveToChar(npcne.cx, npcne.cy);
                }
                this.doOpenUI((int) 4);
                return;
            case 110015:
                this.doOpenUI((int) 13);
                return;
            case 110016:
                if ((npcne = findNPC(13)) != null && npcne.statusMe != 15) {
                    if (Math.abs(npcne.cx - Char.getMyChar().cx) > 22 || Math.abs(npcne.cy - Char.getMyChar().cy) > 22) {
                        Char.moveToChar(npcne.cx, npcne.cy);
                    }

                    Service.gI().openUIZone();
                    return;
                }

                if ((var1 = Char.getBagIndex(37)) < 0) {
                    var1 = Char.getBagIndex(35);
                }

                if (var1 >= 0) {
                    this.indexItemUse = var1;
                    Service.gI().openUIZone();
                }
                return;
            case 110017:
                this.openUITrade();
                return;
            case 110018:
                doShowListChatTab();
                return;
            case 110019:
                this.changeTaskInfo();
                return;
            case 110020:
                Code.TuSat();
                return;
            case 110021:
                doMenuAuto();
                return;
            case 110051:
                actBuy((byte) 25);
                return;
            case 110052:
                this.actBuys((byte) 25);
                return;
            case 110081:
                actBuy((byte) 24);
                return;
            case 110082:
                this.actBuys((byte) 24);
                return;
            case 110101:
                actBuy((byte) 23);
                return;
            case 110102:
                this.actBuys((byte) 23);
                return;
            case 110121:
                actBuy((byte) 22);
                return;
            case 110122:
                this.actBuys((byte) 22);
                return;
            case 110141:
                actBuy((byte) 21);
                return;
            case 110142:
                this.actBuys((byte) 21);
                return;
            case 110161:
                actBuy((byte) 20);
                return;
            case 110162:
                this.actBuys((byte) 20);
                return;
            case 110181:
                actBuy((byte) 15);
                return;
            case 110182:
                this.actBuys((byte) 15);
                return;
            case 110201:
                actBuy((byte) 14);
                return;
            case 110202:
                this.actBuys((byte) 14);
                return;
            case 110221:
                actBagSortItem();
                return;
            case 110244:
                actBagSplitItem();
                return;
            case 110261:
                MoAll();
                return;
            case 110262:
                Item itemne;
                if ((itemne = getItemFocus(3)) != null) {
                    Code.TuDung((int) itemne.template.id);
                }

                return;
            case 110263:
                if ((itemne = getItemFocus(3)) != null) {
                    Code.TatTuDung((int) itemne.template.id);
                }

                return;
            case 110264:
                if ((itemne = getItemFocus(3)) != null) {
                    Code.TuTinhLuyen(itemne);
                }

                return;
            case 110265:
                if ((itemne = getItemFocus(3)) != null) {
                    Code.TatTuTinhLuyen(itemne);
                }

                return;
            case 110266:
                GameCanvas.inputDlg.show("Giá bán", new Command("Đặt", 110268), 1);
                GameCanvas.inputDlg.tfInput.setText("5000");
                return;
            case 110267:
                if ((itemne = getItemFocus(3)) != null) {
                    Code.TatTuBanShinwa(itemne.template.id);
                }

                return;
            case 110268:
                if ((itemne = getItemFocus(3)) != null) {
                    int intne = 5000;

                    try {
                        intne = Integer.parseInt(GameCanvas.inputDlg.tfInput.getText());
                    } catch (NumberFormatException exbe) {
                    }

                    if (intne < 5000) {
                        paint("Giá > 5000k");
                    } else {
                        Code.advAC(itemne.template.id, intne);
                    }
                }

                GameCanvas.endDlg();
                return;
            case 110361:
                this.actionCoinTradeAccept();
                return;
            case 110382:
                Service.gI().returnTownFromDead();
                return;
            case 110383:
                Service.gI().wakeUpFromDead();
                return;
            case 110391:
                this.actmenuAttack(1);
                return;
            case 110392:
                this.actmenuAttack(2);
                return;
            case 110393:
                this.actmenuAttack(3);
                return;
            case 110394:
                this.actmenuAttack(4);
                return;
            case 110395:
                this.actmenuAttack(5);
                return;
            case 110396:
                this.actmenuAttack(6);
                return;
            case 110397:
                this.actmenuAttack(7);
                return;
            case 110398:
                this.actmenuAttack(8);
                return;
            case 110399:
                this.actmenuAttack(9);
                return;
            case 110441:
                this.doAddFriend();
                return;
            case 110451:
                actInputTeam();
                return;
            case 110452:
                actRefreshFindTeam();
                return;
            case 110471:
                actCreateTeam();
                return;
            case 110531:
                var10 = (Item) var2;
                Service.gI().useItemChangeMap(var10.indexUI, GameCanvas.menu.menuSelectedItem + 3);
                return;
            case 110561:
                GameCanvas.endDlg();
                this.updateCommandForUI();
                return;
            case 110562:
                doActionSaleOk(var10 = (Item) var2);
                return;
            case 110701:
                Service.gI().outParty();
                return;
            case 110702:
                Service.gI().lockParty(true);
                return;
            case 110703:
                Service.gI().lockParty(false);
                return;
            case 110721:
                Service.gI().saleItem(indexSelect, 1);
                return;
            case 110722:
                actionSale(Char.getMyChar().arrItemBag[indexSelect]);
                return;
            case 110723:
                Service.gI().saleItem(indexSelect, Char.getMyChar().arrItemBag[indexSelect].quantity);
                return;
            case 110771:
                var3 = (String) var2;
                GameCanvas.endDlg();
                Service.gI().removeFriend(var3);
                return;
            case 110791:
                var3 = (String) var2;
                Service.gI().addParty(var3);
                return;
            case 110792:
                actSetDeleteFriend(var3 = (String) var2);
                return;
            case 110801:
                Service.gI().moveMember(indexRow);
                return;
            case 110802:
                Service.gI().changeTeamLeader(indexRow);
                return;
            case 110803:
                var3 = (String) var2;
                Service.gI().addFriend(var3);
                return;
            case 110804:
                viewMemberInfo();
                return;
            case 110805:
                this.viewMemberClanInfo();
                return;
            case 110811:
                doSetKeySkill(Char.getMyChar().nClass.skillTemplates[indexSelect]);
                return;
            case 110812:
                doSetOnScreenSkill(Char.getMyChar().nClass.skillTemplates[indexSelect]);
                return;
            case 110821:
                Service.gI().itemBodyToBag(indexSelect + indextabTrangbi);
                return;
            case 110841:
                Service.gI().upPotential(indexTitle - 1, 1);
                this.setLCR();
                return;
            case 110842:
                this.doUpPotential();
                return;
            case 110851:
                var10 = (Item) var2;
                Service.gI().buyItem(var10.typeUI, var10.indexUI, 1);
                return;
            case 110852:
                actionBuy(var10 = (Item) var2);
                return;
            case 110854:
                actTrangBiCenter();
                return;
            case 110921:
                var10 = (Item) var2;
                Service.gI().buyItem(var10.typeUI, var10.indexUI, 1);
                return;
            case 110922:
                actionBuy(var10 = (Item) var2);
                return;
            case 110923:
                this.actView((byte) 16);
                return;
            case 110924:
                this.actView((byte) 17);
                return;
            case 110925:
                this.actView((byte) 18);
                return;
            case 110926:
                this.actView((byte) 19);
                return;
            case 110981:
                this.upGrade();
                return;
            case 110991:
                isViewNext = true;
                this.updateItemInfo((int) 3, (Item) itemUpGrade);
                return;
            case 111001:
                this.actItemUpgradeMoveOut();
                return;
            case 111031:
                if (isPaintTinhluyen) {
                    Service.gI().tinhluyen(itemSplit, arrItemSplit);
                    return;
                }

                if (isPaintDichChuyen) {
                    Service.gI().dichchuyen(itemSplit, arrItemSplit);
                    return;
                }

                if (isPaintLuyenNgoc) {
                    Service.gI().ngockham((byte) 1, (Item) null, itemSplit, arrItemSplit);
                    return;
                }

                if (isPaintGotNgoc) {
                    Service.gI().ngockham((byte) 2, (Item) null, itemSplit, (Item[]) null);
                    return;
                }

                if (isPaintThaoNgoc) {
                    Service.gI().ngockham((byte) 3, (Item) null, itemSplit, (Item[]) null);
                    return;
                }
                break;
            case 111071:
                this.actUpPearlMoveOut();
                return;
            case 111101:
                var20 = getItemFocus(4);
                Service.gI().itemBoxToBag(var20.indexUI);
                return;
            case 120051:
                var14 = (ChatTab) var2;
                ChatManager.gI().chatTabs.removeElement(var14);
                if (ChatManager.gI().currentTabIndex > ChatManager.gI().chatTabs.size() - 1) {
                    ChatManager.gI().switchToPreviousTab();
                }

                if (ChatManager.gI().getCurrentChatTab() != null) {
                    this.openUIChatTab();
                    return;
                }

                ChatTextField.gI().isShow = false;
                this.resetButton();
                return;
            case 120061:
                ChatManager.blockGlobalChat = !ChatManager.blockGlobalChat;
                GameCanvas.startOKDlg(mResources.BLOCK_GLOBAL_CHAT + (ChatManager.blockGlobalChat ? mResources.ON : mResources.OFF));
                return;
            case 120062:
                ChatManager.blockPrivateChat = !ChatManager.blockPrivateChat;
                GameCanvas.startOKDlg(mResources.BLOCK_PRIVATE_CHAT + (ChatManager.blockPrivateChat ? mResources.ON : mResources.OFF));
                return;
            case 120071:
                this.step = 2;
                if (GameCanvas.input2Dlg.tfInput.getText().equals("")) {
                    GameCanvas.startOKDlg(mResources.NOT_INPUT_CARDINFO);
                    return;
                }

                if (GameCanvas.input2Dlg.tfInput2.getText().equals("")) {
                    GameCanvas.startOKDlg(mResources.NOT_INPUT_CARDMONEY);
                    return;
                }

                this.strErrCard = "Loại thẻ: " + GameCanvas.input2Dlg.tfInput.getText();
                this.strErrCard = this.strErrCard + ", Mệnh giá: " + GameCanvas.input2Dlg.tfInput2.getText();
                GameCanvas.endDlg();
                this.doShowErrorInput();
                return;
            case 120072:
                if (GameCanvas.input2Dlg.tfInput.getText().equals("")) {
                    GameCanvas.startOKDlg(mResources.NOT_INPUT_CARDSERI);
                    return;
                }

                if (GameCanvas.input2Dlg.tfInput2.getText().equals("")) {
                    GameCanvas.startOKDlg(mResources.NOT_INPUT_CARDTIME);
                    return;
                }

                this.strErrCard = this.strErrCard + ", Số seri: " + GameCanvas.input2Dlg.tfInput.getText();
                this.strErrCard = this.strErrCard + ", Khoảng thời gian nạp: " + GameCanvas.input2Dlg.tfInput2.getText();
                Service.gI().adminChat(this.strErrCard);
                GameCanvas.endDlg();
                return;
            case 120081:
                GameCanvas.inputDlg.tfInput.setMaxTextLenght(11);
                GameCanvas.inputDlg.show(mResources.INPUT_REG_NUMPHONE, new Command("OK", (IActionListener) null, 120082, (Object) null), 1);
                return;
            case 120082:
                if ((var3 = GameCanvas.inputDlg.tfInput.getText()).equals("")) {
                    GameCanvas.startOKDlg(mResources.NOT_INPUT_NUMPHONE);
                    return;
                }

                Service.gI().adminChat("Số điện thoại đăng ký: " + var3);
                GameCanvas.endDlg();
                return;
            case 130011:
                var12 = (Npc) var2;
                Service.gI().getTask(var12.template.npcTemplateId, 0, -1);
                var12.chatPopup = null;
                this.resetButton();
                return;
            case 130012:
                (var12 = (Npc) var2).chatPopup = null;
                this.resetButton();
                return;
            case 130021:
                actBuy((byte) 32);
                return;
            case 130022:
                this.actBuys((byte) 32);
                return;
            case 140011:
                Service.gI().upSkill(Char.getMyChar().nClass.skillTemplates[indexSelect].id, 1);
                this.setLCR();
                return;
            case 140012:
                this.doUpSkill();
                return;
            case 140041:
                GameCanvas.inputDlg.tfInput.setMaxTextLenght(180);
                GameCanvas.inputDlg.show(mResources.INPUT_CLAN_TEXT, new Command(mResources.ACCEPT, GameCanvas.instance, 88832, (Object) null), 0);
                return;
            case 140042:
                Service.gI().clanUpLevel();
                return;
            case 140043:
                GameCanvas.inputDlg.show(mResources.INPUT_CLAN_MONEY, new Command(mResources.ACCEPT, GameCanvas.instance, 88834, (Object) null), 0);
                return;
            case 140044:
                Service.gI().unlockClanItem();
                return;
            case 140071:
                indexRow = 0;
                indexSelect = 0;
                scrMain.clear();
                isViewClanMemOnline = !isViewClanMemOnline;
                sortClan();
                return;
            case 140072:
                indexRow = 0;
                indexSelect = 0;
                scrMain.clear();
                isSortClanByPointWeek = !isSortClanByPointWeek;
                sortClan();
                return;
            case 140081:
                Service.gI().outClan();
                GameCanvas.endDlg();
                return;
            case 140091:
                Service.gI().changeClanType(((Member) vClan.elementAt(indexRow)).name, 3);
                return;
            case 140092:
                Service.gI().changeClanType(((Member) vClan.elementAt(indexRow)).name, 2);
                return;
            case 140093:
                GameCanvas.startYesNoDlg(mResources.CLEAR_CLAN_TYPE, new Command(mResources.YES, 1400931), new Command(mResources.NO, 1));
                return;
            case 140094:
                GameCanvas.startYesNoDlg(mResources.MOVE_OUT_CLAN, new Command(mResources.YES, 1400941), new Command(mResources.NO, 1));
                return;
            case 140095:
                var9 = (Member) vClan.elementAt(indexRow);
                Service.gI().inviteClanDun(var9.name);
                return;
            case 140096:
                (var4 = new MyVector()).addElement(new Command(mResources.INVITE_THIS_PERSON, 1400961));
                var4.addElement(new Command(mResources.INVITE_ALL, 1400962));
                GameCanvas.menu.startAt(var4);
                return;
            case 140101:
                (var20 = new Item()).template = ItemTemplates.get((short) 0);
                var20.expires = -1L;
                this.updateItemInfo((int) 39, (Item) var20);
                return;
            case 140131:
                GameCanvas.startYesNoDlg(mResources.CONFIRMCONVERT, new Command(mResources.YES, 140132), new Command(mResources.NO, 1));
                return;
            case 140132:
                Convert();
                return;
            case 140151:
                this.actItemConvertMoveOut2();
                return;
            case 140161:
                this.updateItemInfo((int) 3, (Item) arrItemConvert[2]);
                return;
            case 140191:
                actBuy((byte) 34);
                return;
            case 140192:
                this.actBuys((byte) 34);
                return;
            case 140221:
                actBuy((byte) 35);
                return;
            case 140222:
                this.actBuys((byte) 35);
                return;
            case 150021:
                GameCanvas.startWaitDlg();
                var1 = 0;

                try {
                    var1 = Integer.parseInt(this.tfText.getText());
                } catch (Exception var5) {
                }

                Service.gI().sendToSaleItem(itemSell, var1);
                return;
            case 150411:
                this.typeSortLevel = 0;
                this.typeSortName = 0;
                if (this.typeSortPrice == 0) {
                    this.typeSortPrice = 1;
                } else if (this.typeSortPrice == 1) {
                    this.typeSortPrice = 2;
                } else if (this.typeSortPrice == 2) {
                    this.typeSortPrice = 1;
                }

                this.sortItemStand();
                return;
            case 150412:
                this.typeSortLevel = 0;
                this.typeSortPrice = 0;
                if (this.typeSortName == 0) {
                    this.typeSortName = 1;
                } else if (this.typeSortName == 1) {
                    this.typeSortName = 2;
                } else if (this.typeSortName == 2) {
                    this.typeSortName = 1;
                }

                this.sortItemStand();
                return;
            case 150413:
                this.typeSortPrice = 0;
                this.typeSortName = 0;
                if (this.typeSortLevel == 0) {
                    this.typeSortLevel = 1;
                } else if (this.typeSortLevel == 1) {
                    this.typeSortLevel = 2;
                } else if (this.typeSortLevel == 2) {
                    this.typeSortLevel = 1;
                }

                this.sortItemStand();
                return;
            case 150421:
                GameCanvas.endDlg();
                Service.gI().buyItemAuction(arrItemStands[indexSelect].item.itemId);
                return;
            case 151301:
                Service.gI().sendCatkeo(Char.getMyChar().mobFocus.getTemplate().mobTemplateId);
                return;
            case 151710:
                Char.aLuyenDaValue = 10;
                return;
            case 151711:
                Char.aLuyenDaValue = 11;
                return;
            case 151712:
                Char.aLuyenDaValue = 12;
                return;
            case 909090:
                this.doOpenUI((int) 38);
                return;
            case 1100011:
                this.doBag();
                return;
            case 1100012:
                this.doskill();
                return;
            case 1100013:
                this.doTiemnangMe();
                return;
            case 1100014:
                this.doInfo();
                return;
            case 1100015:
                this.doTrangbi();
                return;
            case 1100016:
                this.doThucuoi();
                return;
            case 1100017:
                this.doBiJuu();
                return;
            case 1100032:
                this.doShowTaskUI();
                return;
            case 1100033:
                domenuClan();
                return;
            case 1100034:
                domenuLucky_Draw();
                return;
            case 1100041:
                actMenu41();
                return;
            case 1100061:
                this.doShowFindTeamUI();
                return;
            case 1100062:
                this.doShowTeamUI();
                return;
            case 1100063:
                this.doShowFriendUI();
                return;
            case 1100064:
                this.doShowEnemiesUI();
                return;
            case 1100065:
                actsubMenuOrder();
                return;
            case 1100067:
                domenuPrivateLock();
                return;
            case 1100068:
                this.doOpenUI((int) 40);
                return;
            case 1100069:
                MobTemplate mobTemplate;
                MyVector myVector;
                (myVector = new MyVector()).addElement(new Command("Tàn sát all", 1100070, (Object) null));

                for (int intne1 = 0; intne1 < vMobTemplate.size(); ++intne1) {
                    mobTemplate = (MobTemplate) vMobTemplate.elementAt(intne1);
                    myVector.addElement(new Command(mobTemplate.name, 1100070, mobTemplate));
                }

                GameCanvas.menu.startAt(myVector);
                return;
            case 1100070:
                Code.advAB((mobTemplate = (MobTemplate) var2) != null ? mobTemplate.mobTemplateId : -1, TileMap.mapID);
                return;
            case 1100071:
                final MyVector bh = new MyVector();
                final MyVector ep10 = new MyVector();
                for (int m = 0; m < vNpc.size(); ++m) {
                    final Npc ev4 = (Npc) vNpc.elementAt(m);
                    if (!ep10.contains(ev4.template)) {
                        ep10.addElement(ev4.template);

                        bh.addElement(String.valueOf(m) + ". " + ev4.template.name);
                    }
                }
                InfoDlg.hide();
                isPaintAlert = true;
                this.isLockKey = true;
                indexRow = 0;
                setPopupSize(175, 200);
                final Command t8 = null;
                super.left = t8;
                super.center = t8;
                super.right = new Command("Đóng", 3);
                super.left = new Command("Dịch chuyển", 1100072);
                this.textsTitle = "Danh sách NPC";
                this.texts = bh;

                return;
            case 1100072:
                final int int2 = Integer.parseInt(((String) this.texts.elementAt(indexRow)).substring(0, ((String) this.texts.elementAt(indexRow)).indexOf(". ")));
                this.doCloseAlert();
                final Npc ev5;
                if ((ev5 = (Npc) vNpc.elementAt(int2)) != null) {
                    if (Math.abs(ev5.cx - Char.getMyChar().cx) > 22) {
                        Char.moveToChar(ev5.cx, ev5.cy);
                    }
                    Service.gI().openMenu(ev5.template.npcTemplateId);
                }

                return;
            case 1100073:
                Code.endAuto();
                return;
            case 1100074:
                Code.AutoNVHN();
                return;
            case 1100075:
                Code.AutoTaThu();
                return;
            case 1100076:
                super.right = this.cmdCloseAll;
                indexMenu = 0;
                isPaintPickItem = true;
                setPopupSize(175, 200);
                return;
            case 1100077:
                Code.DelItemNhat(Code.arrItemNhat[indexSelect]);
                return;
            case 1100078:
                Code.SapXepItemNhat();
                return;
            case 1100079:
                Code.ThemItemNhat(Char.getMyChar().arrItemBag[indexSelect].template.id);
                return;
            case 1100080:
                if (Code.isAHutVP) {
                    paint("Bật nhặt xa");
                } else {
                    paint("Bật hút VP");
                }

                Code.isAHutVP = !Code.isAHutVP;
                return;
            case 1100081:
                GameCanvas.inputDlg.show("KC Nhặt", new Command("Đặt", 1100085), 1);
                GameCanvas.inputDlg.tfInput.setText(String.valueOf(Code.KCNhatValue));
                return;
            case 1100082:
                GameCanvas.inputDlg.show("KC Tàn sát", new Command("Đặt", 1100086), 1);
                GameCanvas.inputDlg.tfInput.setText(String.valueOf(Code.KCTSValue));
                return;
            case 1100083:
                Code.isADanhCVT = !Code.isADanhCVT;
                return;
            case 1100084:
                if (!(Code.isAGiuLV = !Code.isAGiuLV)) {
                    RMS.saveRMSInt("keepLevel", -1);
                    paint("Tắt giữ lv");
                    return;
                }

                RMS.saveRMSInt("keepLevel", 1);
                paint("Bật giữ lv");
                return;
            case 1100085:
                try {
                    Code.KCNhatValue = Integer.parseInt(GameCanvas.inputDlg.tfInput.getText());
                } catch (NumberFormatException var8) {
                }

                GameCanvas.endDlg();
                return;
            case 1100086:
                try {
                    Code.KCTSValue = Integer.parseInt(GameCanvas.inputDlg.tfInput.getText());
                } catch (NumberFormatException var7) {
                }

                GameCanvas.endDlg();
                return;
            case 1100087:
                GameCanvas.inputDlg.show("Độ Trễ", new Command("Đặt", 1100088), 1);
                GameCanvas.inputDlg.tfInput.setText(String.valueOf(Code.SPGameValue));
                return;
            case 1100088:
                var1 = Code.SPGameValue;

                try {
                    var1 = Integer.parseInt(GameCanvas.inputDlg.tfInput.getText());
                } catch (NumberFormatException var6) {
                }

                if (var1 >= 0 && var1 < 100) {
                    Code.SPGameValue = var1;
                } else {
                    paint("Tốc độ game từ 0 đến 99");
                }

                GameCanvas.endDlg();
                return;
            case 1100089:
                if (Code.isADanhCK = !Code.isADanhCK) {
                    GameCanvas.inputDlg.show("Mỗi khu cách nhau bằng dấu cách", new Command("Đặt", 1100090), 0);
                    GameCanvas.inputDlg.tfInput.setText(Code.advAK());
                }

                return;
            case 1100090:
                Code.advAE(GameCanvas.inputDlg.tfInput.getText());
                GameCanvas.endDlg();
                return;
            case 1100091:
                InfoDlg.hide();
                isPaintAlert = true;
                this.isLockKey = true;
                indexRow = 0;
                setPopupSize(175, 200);
                super.right = new Command(mResources.CLOSE, 3);
                super.left = new Command("Xóa hết", 19874);
                super.center = null;
                this.textsTitle = "Danh sách bán";
                this.texts = AutoSellPro.sellerAP();
                return;
            case 1100092:
                InfoDlg.hide();
                isPaintAlert = true;
                this.isLockKey = true;
                indexRow = 0;
                setPopupSize(175, 200);
                super.right = new Command(mResources.CLOSE, 3);
                super.left = super.center = null;
                this.textsTitle = "Danh sách shinwa";
                this.texts = Code.DSshinwa();
                return;
            case 1100093:
                InfoDlg.hide();
                isPaintAlert = true;
                this.isLockKey = true;
                indexRow = 0;
                setPopupSize(175, 200);
                super.right = new Command(mResources.CLOSE, 3);
                super.left = new Command(mResources.DELETE, 1100095);
                super.center = null;
                this.textsTitle = "Danh sách PK";
                this.texts = SavePK.DSPK();
                return;
            case 1100094:
                InfoDlg.hide();
                isPaintAlert = true;
                this.isLockKey = true;
                indexRow = 0;
                setPopupSize(175, 200);
                super.right = new Command(mResources.CLOSE, 3);
                super.left = super.center = null;
                this.textsTitle = "Danh sách HS";
                this.texts = Code.DSHoiSinh();
                return;
            case 1100095: {
                GameCanvas.startYesNoDlg("Bạn có chắc muốn xóa nhân vật này khỏi danh sách PK ?", new Command(mResources.COUNTINUE, 1100096), new Command(mResources.NO, GameCanvas.instance,  8882, null));
                break;
            }
            case 1100096: {
                SavePK.advAA.removeElementAt(indexRow);
                InfoDlg.hide();
                isPaintAlert = true;
                this.isLockKey = true;
                indexRow = 0;
                setPopupSize(175, 200);
                super.right = new Command(mResources.CLOSE, 3);
                super.left = new Command(mResources.DELETE, 1100095);
                super.center = null;
                this.textsTitle = "Danh sách PK";
                this.texts = SavePK.DSPK();
                GameCanvas.endDlg();
                break;
            }
            case 1100181:
                GameCanvas.startYesNoDlg(mResources.noti_reg, new Command(mResources.COUNTINUE, 1100182), new Command(mResources.NO, GameCanvas.instance, 8882, (Object) null));
                return;
            case 1100182:
                GameCanvas.currentDialog = null;
                GameCanvas.loginScr.switchToMe(true);
                return;
            case 1102211:
                try {
                    GameCanvas.inputDlg.show("Đặt giá" + (getItemFocus(3) != null ? " " + getItemFocus(3).template.name : ""), new Command("Đặt", 1102212), 1);
                    GameCanvas.inputDlg.tfInput.setText(ChatSell.advAA(getItemFocus(3).template.id).advAF());
                    return;
                } catch (Exception var1f5) {
                    return;
                }
            case 1102212:
                if (getItemFocus(3) != null) {
                    ChatSell.advAA(getItemFocus(3).template, GameCanvas.inputDlg.tfInput.getText());
                }

                GameCanvas.endDlg();
                return;
            case 1102213:
                if (getItemFocus(3) != null) {
                    ChatSell.advAA(getItemFocus(3).template);
                }

                return;
            case 1103991:
                this.actmenuAttack(10);
                return;
            case 1107921:
                var3 = (String) var2;
                GameCanvas.endDlg();
                Service.gI().removeFriend(var3);
                actRemoveWaitAcceptFriend(var3);
                return;
            case 1107931:
                var3 = (String) var2;
                Service.gI().addFriend(var3);
                return;
            case 1107932:
                actRemoveWaitAcceptFriend(var3 = (String) var2);
                return;
            case 1108041:
                var3 = (String) var2;
                Service.gI().viewInfo((String) var3, 0);
                gI().resetButton();
                return;
            case 1400931:
                Service.gI().changeClanType(((Member) vClan.elementAt(indexRow)).name, 0);
                GameCanvas.endDlg();
                return;
            case 1400941:
                Service.gI().moveOutClan(((Member) vClan.elementAt(indexRow)).name);
                GameCanvas.endDlg();
                return;
            case 1400961:
                var9 = (Member) vClan.elementAt(indexRow);
                Service.gI().inviteClanBattlefield(var9.name);
                return;
            case 1400962:
                Service.gI().inviteClanBattlefieldAll();
                return;
            case 11000651:
                actsubMenuOrder_PK(1);
                return;
            case 11000652:
                actsubMenuOrder_PK(2);
                return;
            case 11000653:
                actsubMenuOrder_PK(3);
                return;
            case 11000661:
                indexMenu = 0;
                this.doShowClan();
                return;
            case 11000662:
                indexMenu = 1;
                this.doShowClan();
                Service.gI().requestClanMember();
                return;
            case 11000663:
                indexMenu = 2;
                this.doShowClan();
                Service.gI().requestClanItem();
                return;
            case 11000664:
                indexMenu = 3;
                this.doShowClan();
                Service.gI().requestClanLog();
                return;
            case 11000665:
                if (isViewClanInvite = !isViewClanInvite) {
                    RMS.saveRMSInt(Char.getMyChar().cName + "vci", 1);
                    return;
                }

                RMS.saveRMSInt(Char.getMyChar().cName + "vci", 0);
                return;
            case 11000666:
                indexMenu = 4;
                this.doShowClan();
                Service.gI().requestClanItem();
                return;
            case 11000671:
                GameCanvas.startYesNoDlg(mResources.ACTIVE_PROTECT_ACC, 88836, (Object) null, 8882, (Object) null);
                return;
            case 11000672:
                GameCanvas.inputDlg.tfInput.setMaxTextLenght(6);
                GameCanvas.inputDlg.show(mResources.INPUT_PRIVATE_PASS, new Command(mResources.ACCEPT, GameCanvas.instance, 88837, (Object) null), 1);
                return;
            case 11000673:
                GameCanvas.input2Dlg.setTitle(mResources.OLD_PASS, mResources.NEW_PASS);
                GameCanvas.input2Dlg.tfInput.setMaxTextLenght(6);
                GameCanvas.input2Dlg.tfInput2.setMaxTextLenght(6);
                GameCanvas.input2Dlg.show(mResources.INPUT_PRIVATE_PASS, new Command(mResources.CLOSE, GameCanvas.instance, 8882, (Object) null), new Command(mResources.ACCEPT, GameCanvas.instance, 88838, (Object) null), 1, 1);
                return;
            case 11000674:
                GameCanvas.inputDlg.tfInput.setMaxTextLenght(6);
                GameCanvas.inputDlg.show(mResources.INPUT_PRIVATE_PASS, new Command(mResources.ACCEPT, GameCanvas.instance, 88839, (Object) null), 1);
                return;
            case 11000761:
                super.right = this.cmdCloseAll;
                indexMenu = 0;
                isPaintDelItem = true;
                setPopupSize(175, 200);
                return;
            case 11000771:
                Code.DelItemDel(Code.arrItemDel[indexSelect]);
                return;
            case 11000781:
                Code.SapXepItemDel();
                return;
            case 11000791:
                Code.ThemItemDel(Char.getMyChar().arrItemBag[indexSelect].template.id);
                return;
            case 11000792:
                Item item3 = getItemFocus(3);
                if (item3 != null) {
                    Code.gameAG(item3);
                }
                return;

            case 11000793:
                Item item2 = getItemFocus(3);
                if (item2 != null) {
                    Code.gameAH(item2);
                }
                return;

            case 11000799:
                MyVector var0 = new MyVector();
                var0.addElement(new Command("Lật Hình", 11000800));
                var0.addElement(new Command("Set Time Lật", 11000802));
                GameCanvas.menu.startAt(var0);
                return;
            case 11000800:
                GameCanvas.inputDlg.show("Nhập số phiếu cần lật", new Command("OK", 11000801), 1);

                return;
            case 11000801:
                AutoLatHinh.lap = Integer.parseInt(GameCanvas.inputDlg.tfInput.getText());
                (new Thread(new AutoLatHinh(AutoLatHinh.lap))).start();
                GameScr.paint("Auto Lật " + AutoLatHinh.lap + " Phiếu");
                GameCanvas.endDlg();
                return;
            case 11000802:
                GameCanvas.inputDlg.show("Tốc Độ Lật Hình", new Command("OK", 11000803), 1);

                return;
            case 11000803:
                AutoLatHinh.time = (long) Integer.parseInt(GameCanvas.inputDlg.tfInput.getText());
                GameScr.paint("Tốc độ lật hình của bạn là:" + AutoLatHinh.time);
                GameCanvas.endDlg();
                return;
            case 11000804:
                Item item4 = getItemFocus(3);
                if (item4 != null) {
                    Code.AB(item4);
                }
                return;
        }

    }

    private void actDichChuyenTrangBiLeft() {
        try {
            if (Char.getMyChar().arrItemBag[indexSelect].template.id == 454) {
                if (arrItemSplit == null) {
                    arrItemSplit = new Item[24];
                }

                for (int var3 = 0; var3 < arrItemSplit.length; ++var3) {
                    if (var3 == 20) {
                        GameCanvas.startOKDlg(mResources.CRYSTAL_FULL);
                        return;
                    }

                    if (arrItemSplit[var3] == null) {
                        arrItemSplit[var3] = Char.getMyChar().arrItemBag[indexSelect];
                        Char.getMyChar().arrItemBag[indexSelect] = null;
                        super.left = super.center = null;
                        this.updateCommandForUI();
                        return;
                    }
                }

            } else if (Char.getMyChar().arrItemBag[indexSelect].upgrade > 11) {
                if (itemSplit == null) {
                    itemSplit = Char.getMyChar().arrItemBag[indexSelect];
                    Char.getMyChar().arrItemBag[indexSelect] = null;
                } else {
                    Item var1 = Char.getMyChar().arrItemBag[indexSelect];
                    Char.getMyChar().arrItemBag[indexSelect] = null;
                    Char.getMyChar().arrItemBag[itemSplit.indexUI] = itemSplit;
                    itemSplit = var1;
                }

                Service.gI().requestItemInfo(itemSplit.typeUI, itemSplit.indexUI);
            } else {
                GameCanvas.startOKDlg(mResources.CAN_NOT_DICHCHUYEN);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
        }
    }

    private void actTinhLuyenMoveOut() {
        Item var1 = getItemFocus(44);
        arrItemSplit[indexSelect] = null;
        Char.getMyChar().arrItemBag[var1.indexUI] = var1;
        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private static void doAutoSelect() {
        switch (indexRow) {
            case 0:
                Char.isAHP = !Char.isAHP;
                if (typeActive == 1) {
                    Char.isAHP = false;
                    InfoMe.addInfo(mResources.AOPENACC, 20, mFont.tahoma_7_yellow);
                }

                return;
            case 1:
                Char.isAMP = !Char.isAMP;
                if (typeActive == 1) {
                    Char.isAMP = false;
                    InfoMe.addInfo(mResources.AOPENACC, 20, mFont.tahoma_7_yellow);
                }

                return;
            case 2:
                Char.isAFood = !Char.isAFood;
                if (typeActive == 1) {
                    Char.isAFood = false;
                    InfoMe.addInfo(mResources.AOPENACC, 20, mFont.tahoma_7_yellow);
                }

                return;
            case 3:
                Char.isABuff = !Char.isABuff;
                return;
            case 4:
                Char.isAKhienMana = !Char.isAKhienMana;
                return;
            case 5:
                Char.isADotQuai = !Char.isADotQuai;
                return;
            case 6:
                Char.isADungPT = !Char.isADungPT;
                return;
            case 7:
                if (Char.isAPickYen = !Char.isAPickYen) {
                    Char.isANoPick = false;
                }

                return;
            case 8:
                if (Char.isAPickYHM = !Char.isAPickYHM) {
                    Char.isANoPick = false;
                }

                return;
            case 9:
                if (Char.isAPickYHMS = !Char.isAPickYHMS) {
                    Char.isANoPick = false;
                }

                return;
            case 10:
                Char.isALuyenDa = !Char.isALuyenDa;
                return;
            case 11:
                if (Char.isAPickTB = !Char.isAPickTB) {
                    Char.isANoPick = false;
                }

                return;
            case 12:
                if (Char.isAPickTBLa = !Char.isAPickTBLa) {
                    Char.isAPickTB = true;
                    Char.isANoPick = false;
                }

                return;
            case 13:
                if (Char.isAPickVPNV = !Char.isAPickVPNV) {
                    Char.isANoPick = false;
                }

                return;
            case 14:
                if (Char.isAPickVPSK = !Char.isAPickVPSK) {
                    Char.isANoPick = false;
                }

                return;
            case 15:
                if (Char.isAPickAll = !Char.isAPickAll) {
                    Char.isANoPick = false;
                }

                return;
            case 16:
                if (Char.isAPickSVC = !Char.isAPickSVC) {
                    Char.isANoPick = false;
                }

                return;
            case 17:
                if (Char.isANoPick = !Char.isANoPick) {
                    Char.isAPickYHMS = false;
                    Char.isAPickYHM = false;
                    Char.isAPickYen = false;
                    Char.isAPickTB = false;
                    Char.isAPickTBLa = false;
                    Char.isAPickVPNV = false;
                    Char.isAPickVPSK = false;
                    Char.isAPickAll = false;
                    Char.isAPickSVC = false;
                }

                return;
            case 18:
                Char.isALuyenTTT = !Char.isALuyenTTT;
                return;
            case 19:
                Char.isALuyenTTC = !Char.isALuyenTTC;
                return;
            case 20:
                Char.isAReMap = !Char.isAReMap;
                return;
            case 21:
                Char.isATsMapTrong = !Char.isATsMapTrong;
                return;
            case 22:
                Char.isAMuaFood = !Char.isAMuaFood;
                return;
            case 23:
                Char.isANoMP = !Char.isANoMP;
                return;
            case 24:
                Char.isAReConnect = !Char.isAReConnect;
                return;
            case 25:
                Char.isAChuyenMapHetQuai = !Char.isAChuyenMapHetQuai;
                return;
            case 26:
                Char.isASanTaTl = !Char.isASanTaTl;
                return;
            case 27:
                Char.isADanhQuai = !Char.isADanhQuai;
                return;
            case 28:
                Char.isADanhTA = !Char.isADanhTA;
                return;
            case 29:
                Char.isADanhTL = !Char.isADanhTL;
                return;
            case 30:
                Char.isACongTN = !Char.isACongTN;
                return;
            case 31:
                Char.isACongKN = !Char.isACongKN;
                return;
            case 32:
                Char.isADanhNhom = !Char.isADanhNhom;
                return;
            case 33:
                Char.isANePk = !Char.isANePk;
                return;
            case 34:
                Char.isADungCoLenh = !Char.isADungCoLenh;
                return;
            case 35:
                Char.isAMuaCoLenh = !Char.isAMuaCoLenh;
                return;
            case 36:
                Char.isADungTTL = !Char.isADungTTL;
                return;
            case 37:
                Char.isAMuaTTL = !Char.isAMuaTTL;
                return;

            default:
        }
    }

    private void doviewCardsInfo() {
        if (arrItemSprin != null) {
            Item var1;
            (var1 = new Item()).template = ItemTemplates.get(arrItemSprin[indexSelect]);
            this.updateItemInfo((int) 38, (Item) var1);
        }

    }

    private void sortItemStand() {
        if (this.typeSortLevel != 0 || this.typeSortPrice != 0 || this.typeSortName != 0) {
            for (int var1 = 0; var1 < arrItemStands.length - 1; ++var1) {
                for (int var2 = var1 + 1; var2 < arrItemStands.length; ++var2) {
                    ItemStands var3;
                    if (this.typeSortPrice == 1) {
                        if (arrItemStands[var1].price < arrItemStands[var2].price) {
                            var3 = arrItemStands[var1];
                            arrItemStands[var1] = arrItemStands[var2];
                            arrItemStands[var2] = var3;
                        }
                    } else if (this.typeSortPrice == 2 && arrItemStands[var1].price > arrItemStands[var2].price) {
                        var3 = arrItemStands[var1];
                        arrItemStands[var1] = arrItemStands[var2];
                        arrItemStands[var2] = var3;
                    }

                    if (this.typeSortName == 1) {
                        if (!arrItemStands[var1].item.template.name.equals(arrItemStands[var2].item.template.name) && arrItemStands[var1].item.template.name.compareTo(arrItemStands[var2].item.template.name) > 0) {
                            var3 = arrItemStands[var1];
                            arrItemStands[var1] = arrItemStands[var2];
                            arrItemStands[var2] = var3;
                        }
                    } else if (this.typeSortName == 2 && !arrItemStands[var1].item.template.name.equals(arrItemStands[var2].item.template.name) && arrItemStands[var1].item.template.name.compareTo(arrItemStands[var2].item.template.name) < 0) {
                        var3 = arrItemStands[var1];
                        arrItemStands[var1] = arrItemStands[var2];
                        arrItemStands[var2] = var3;
                    }

                    if (this.typeSortLevel == 1) {
                        if (arrItemStands[var1].item.template.level < arrItemStands[var2].item.template.level) {
                            var3 = arrItemStands[var1];
                            arrItemStands[var1] = arrItemStands[var2];
                            arrItemStands[var2] = var3;
                        }
                    } else if (this.typeSortLevel == 2 && arrItemStands[var1].item.template.level > arrItemStands[var2].item.template.level) {
                        var3 = arrItemStands[var1];
                        arrItemStands[var1] = arrItemStands[var2];
                        arrItemStands[var2] = var3;
                    }
                }
            }

        }
    }

    private static void domenuSortItemStand() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.SORT_BY_PRICE, 150411));
        var0.addElement(new Command(mResources.SORT_BY_NAME, 150412));
        var0.addElement(new Command(mResources.SORT_BY_LEVEL, 150413));
        GameCanvas.menu.startAt(var0);
    }

    private static void domenuItemStand() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.SORT, 15041));
        var0.addElement(new Command(mResources.BUY, 15042));
        GameCanvas.menu.startAt(var0);
    }

    private void doStandToBag() {
        Char.getMyChar().arrItemBag[itemSell.indexUI] = itemSell;
        itemSell = null;
        super.left = super.center = null;
    }

    private static void doBagToStand() {
        Item var0;
        if ((var0 = Char.getMyChar().arrItemBag[indexSelect]) != null) {
            if (!var0.isLock && !var0.isExpires) {
                if (itemSell == null) {
                    itemSell = Char.getMyChar().arrItemBag[indexSelect];
                    Char.getMyChar().arrItemBag[indexSelect] = null;
                } else {
                    var0 = Char.getMyChar().arrItemBag[indexSelect];
                    Char.getMyChar().arrItemBag[indexSelect] = null;
                    Char.getMyChar().arrItemBag[itemSell.indexUI] = itemSell;
                    itemSell = var0;
                }
            } else {
                GameCanvas.startOKDlg(mResources.ONLY_NO_EXPIRE);
            }
        }
    }

    private static void actClanStoreBuy() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.BUY, 140191));
        var0.addElement(new Command(mResources.BUYS, 140192));
        GameCanvas.menu.startAt(var0);
    }

    private static void domenuErrorAdim() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.BAG_CODE, (IActionListener) null, 120081, (Object) null));
        var0.addElement(new Command(mResources.CARD, (IActionListener) null, 12007, (Object) null));
        GameCanvas.menu.startAt(var0);
    }

    private void doShowErrorInput() {
        if (this.step == 1) {
            GameCanvas.input2Dlg.setTitle(mResources.CARD_TYPE, mResources.CARD_MONEY);
            GameCanvas.input2Dlg.show(mResources.INPUT_CARDTYPE_MONEY, new Command(mResources.CLOSE, GameCanvas.gI(), 8882, (Object) null), new Command(mResources.NEXT, (IActionListener) null, 120071, (Object) null), 0, 0);
        } else {
            GameCanvas.input2Dlg.setTitle(mResources.CARD_SERI, mResources.CARD_TIME);
            GameCanvas.input2Dlg.show(mResources.INPUT_CARDSERI_TIME, new Command(mResources.CLOSE, GameCanvas.gI(), 8882, (Object) null), new Command(mResources.OK, (IActionListener) null, 120072, (Object) null), 0, 0);
        }
    }

    public static void actRemoveWaitAcceptFriend(String var0) {
        int var1;
        for (var1 = 0; var1 < vFriend.size(); ++var1) {
            Friend var2;
            if ((var2 = (Friend) vFriend.elementAt(var1)).friendName.equals(var0) && var2.type == 4) {
                vFriend.removeElementAt(var1);
                break;
            }
        }

        for (var1 = 0; var1 < vFriendWait.size(); ++var1) {
            if (((Friend) vFriendWait.elementAt(var1)).friendName.equals(var0)) {
                vFriendWait.removeElementAt(var1);
                return;
            }
        }

    }

    private static void domenuClanConfig() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.CLAN_MENU[0] + ": " + (isViewClanMemOnline ? mResources.OFF : mResources.ON), 140071));
        var0.addElement(new Command(mResources.CLAN_SORTTYPE, 140072));
        GameCanvas.menu.startAt(var0);
    }

    private static void domenuEnemieLeft() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.CLAN_MENU[0] + ": " + (isViewClanMemOnline ? mResources.OFF : mResources.ON), 140071));
        GameCanvas.menu.startAt(var0);
    }

    private static void domenuFriendLeft() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.ADDNEW, 110441));
        var0.addElement(new Command(mResources.CLAN_MENU[0] + ": " + (isViewClanMemOnline ? mResources.OFF : mResources.ON), 140071));
        GameCanvas.menu.startAt(var0);
    }

    private static void domenuPrivateLock() {
        MyVector var0 = new MyVector();
        if (typeActive == 0) {
            var0.addElement(new Command(mResources.ENABLE, 11000671));
        } else if (typeActive == 1) {
            var0.addElement(new Command(mResources.UNLOCK, 11000672));
        }

        if (typeActive == 1 || typeActive == 2) {
            var0.addElement(new Command(mResources.CANCEL_PRIVATE_PROTECT, 11000674));
            var0.addElement(new Command(mResources.CHANGE_PRIVATE_PASS, 11000673));
        }

        GameCanvas.menu.startAt(var0);
    }

    private static void domenuTeamLeft() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.CREATE_TEAM, 110471));
        var0.addElement(new Command(mResources.ACTIONS[4], 1100061));
        GameCanvas.menu.startAt(var0);
    }

    private static void Convert() {
        GameCanvas.endDlg();
        Service.gI().doConvertUpgrade(arrItemConvert[0].indexUI, arrItemConvert[1].indexUI, arrItemConvert[2].indexUI);
    }

    private static void domenuClanNotice() {
        MyVector var0 = new MyVector();
        if (Char.getMyChar().ctypeClan == 3 || Char.getMyChar().ctypeClan == 4) {
            if (indexTitle == 1) {
                var0.addElement(new Command(mResources.CLAN_MENU[8], 140044));
            }

            var0.addElement(new Command(mResources.CLAN_MENU[2], 140041));
            var0.addElement(new Command(mResources.CLAN_MENU[5], 140042));
            if (Char.getMyChar().ctypeClan == 4) {
                var0.addElement(new Command(mResources.CLAN_MENU[4], 140043));
            }

            var0.addElement(new Command(mResources.CHAR_ORDER[10] + ": " + (isViewClanInvite ? mResources.OFF : mResources.ON), 11000665));
        }

        GameCanvas.menu.startAt(var0);
    }

    private static void domenuFindTeamCenter() {
        Party var0;
        if ((var0 = (Party) vPtMap.elementAt(indexRow)) != null && !Char.getMyChar().cName.equals(var0.name)) {
            MyVector var1;
            (var1 = new MyVector()).addElement(new Command(mResources.CHAR_ORDER[6], 1108041, var0.name));
            var1.addElement(new Command(mResources.CHAT, 12002, var0.name));
            var1.addElement(new Command(mResources.TEAMLEADER_SELECT[2], 110803, var0.name));
            GameCanvas.menu.startAt(var1);
        }

    }

    private static void domenuFindTeam() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.REFRESH, 110452));
        if (vPtMap.size() > 0) {
            var0.addElement(new Command(mResources.INPUT_TEAM, 110451));
        }

        GameCanvas.menu.startAt(var0);
    }

    private static void domenuClanPermission() {
        Member var0 = (Member) vClan.elementAt(indexRow);
        MyVector var1;
        (var1 = new MyVector()).addElement(new Command(mResources.CLANS[1], 140091, var0.name));
        var1.addElement(new Command(mResources.CLANS[2], 140092, var0.name));
        GameCanvas.menu.startAt(var1);
    }

    private void viewMemberClanInfo() {
        Member var1;
        if (indexRow >= 0 && indexRow < vClan.size() && (var1 = curMemberSelected()) != null && !var1.name.equals("")) {
            Service.gI().viewInfo((String) var1.name, 0);
            isPaintClan = false;
            gI().resetButton();
        }

    }

    private void domenuClanLeader() {
        Member var2 = curMemberSelected();
        MyVector var1 = new MyVector();
        if (Char.getMyChar().ctypeClan == 4) {
            if (var2.type != 4) {
                if (var2.type != 3 && var2.type != 2) {
                    var1.addElement(new Command(mResources.SET_TYPE_CLAN, 14009, var2.name));
                } else {
                    var1.addElement(new Command(mResources.CLEAR_TYPE_CLAN, 140093, var2.name));
                }

                if (TileMap.mapID != 98 && TileMap.mapID != 104) {
                    var1.addElement(new Command(mResources.CLAN_MENU[6], 140095, var2.name));
                } else {
                    var1.addElement(new Command(mResources.CLAN_MENU[7], 140096, var2.name));
                }

                var1.addElement(new Command(mResources.FIRED_CLAN, 140094, var2.name));
            }

            var1.addElement(new Command(mResources.CONFIG, 14007));
        } else if (Char.getMyChar().ctypeClan == 3) {
            if (var2.type != 4 && !var2.name.equals(Char.getMyChar().cName)) {
                var1.addElement(new Command(mResources.FIRED_CLAN, 140094, var2.name));
                if (TileMap.mapID != 98 && TileMap.mapID != 104) {
                    var1.addElement(new Command(mResources.CLAN_MENU[6], 140095, var2.name));
                } else {
                    var1.addElement(new Command(mResources.CLAN_MENU[7], 140096, var2.name));
                }
            }

            var1.addElement(new Command(mResources.CONFIG, 14007));
            var1.addElement(new Command(mResources.CLAN_MENU[1], 14008, var2.name));
        } else {
            var1.addElement(new Command(mResources.CONFIG, 14007));
            var1.addElement(new Command(mResources.CLAN_MENU[1], 14008, var2.name));
        }

        GameCanvas.menu.startAt(var1);
    }

    private static boolean isHaveVanBienLenh() {
        for (int var0 = 0; var0 < Char.getMyChar().arrItemBag.length; ++var0) {
            Item var1;
            if ((var1 = Char.getMyChar().arrItemBag[var0]) != null && var1.template.id == 279 && var1.template.level <= Char.getMyChar().clevel) {
                return true;
            }
        }

        return false;
    }

    private static void actSetClanCommand(String var0) {
        MyVector var1;
        (var1 = new MyVector()).addElement(new Command(mResources.CHAR_ORDER[6], 110805));
        var1.addElement(new Command(mResources.CHAT, 12002, var0));
        var1.addElement(new Command(mResources.PT, 110791, var0));
        var1.addElement(new Command(mResources.MOVETO, 14020, var0));
        var1.addElement(new Command(mResources.TEAMLEADER_SELECT[2], 110803, var0));
        GameCanvas.menu.startAt(var1);
    }

    private void doShowClan() {
        isPaintClan = true;
        isRequestMember = true;
        isSortClanByPointWeek = false;
        this.arrClanInfo = this.arrClanDongGop = null;
        setPopupSize(175, 200);
        this.updateCommandForUI();
        super.right = this.cmdCloseAll;
        Service.gI().requestClanInfo();
    }

    private static void domenuClan() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.CLAN[0], 11000661));
        var0.addElement(new Command(mResources.CLAN[1], 11000662));
        var0.addElement(new Command(mResources.CLAN[2], 11000663));
        var0.addElement(new Command(mResources.CLAN[3], 11000664));
        var0.addElement(new Command(mResources.CLAN[4], 11000666));
        GameCanvas.menu.startAt(var0);
    }

    private void doUnfocusChar() {
        Char.getMyChar().charFocus = null;
        Char.isManualFocus = false;
        this.cLastFocusID = -1;
        isPaintCharInMap = false;
        this.resetButton();
    }

    private void doCharFocusList() {
        Char var1;
        if (!(var1 = (Char) vCharInMap.elementAt(indexRow)).isNhanbanz()) {
            this.cLastFocusID = var1.charID;
            Char.getMyChar().mobFocus = null;
            Char.getMyChar().deFocusNPC();
            Char.getMyChar().itemFocus = null;
            Char.getMyChar();
            Char.isManualFocus = true;
            isPaintCharInMap = false;
            Char.getMyChar().charFocus = var1;
        }

        this.resetButton();
    }

    private void changeTaskInfo() {
        if (indexMenu == 0) {
            indexMenu = 1;
        } else {
            indexMenu = 0;
        }

        indexRow = 0;
        this.idTypeTask = indexMenu;
    }

    private static void viewMemberInfo() {
        Party var0;
        if ((var0 = (Party) vParty.elementAt(indexRow)).c != null && var0.c != Char.getMyChar()) {
            Service.gI().viewInfo((String) var0.c.cName, 0);
            isPaintTeam = false;
            gI().resetButton();
        }

    }

    private static void actBuyItemLeft2() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.SORT, 110221));
        var0.addElement(new Command(mResources.GETINMONEY, 11050));
        GameCanvas.menu.startAt(var0);
    }

    private static void actBuyItemUILeft() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.SORT, 11048));
        var0.addElement(new Command(mResources.GETOUTMONEY, 11049));
        GameCanvas.menu.startAt(var0);
    }

    private void actgetLuyenThachItems() {
        if (Char.getMyChar().arrItemBag[indexSelect].template.type != 26 && Char.getMyChar().arrItemBag[indexSelect].template.id != 455 && Char.getMyChar().arrItemBag[indexSelect].template.id != 456) {
            if (Char.getMyChar().arrItemBag[indexSelect].template.id == 457) {
                GameCanvas.msgdlg.setInfo(mResources.ONLY_LUYENTHACH1, (Command) null, new Command(mResources.CLOSE, 2), (Command) null);
            } else {
                GameCanvas.msgdlg.setInfo(mResources.ONLY_LUYENTHACH2, (Command) null, new Command(mResources.CLOSE, 2), (Command) null);
            }
        } else {
            if (Char.getMyChar().arrItemBag[indexSelect].template.type == 26 && Char.getMyChar().arrItemBag[indexSelect].template.id < 10) {
                GameCanvas.startOKDlg(mResources.ONLY_LUYENTHACH5);
                return;
            }

            short var1 = 0;
            int var2 = 0;
            boolean var3 = arrItemUpPeal[12] != null;

            int var4;
            for (var4 = 0; var4 < arrItemUpPeal.length; ++var4) {
                if (arrItemUpPeal[var4] != null && arrItemUpPeal[var4].template.type != 26) {
                    var1 = arrItemUpPeal[var4].template.id;
                    ++var2;
                }
            }

            for (var4 = 0; var4 < arrItemUpPeal.length; ++var4) {
                if (arrItemUpPeal[var4] == null) {
                    if (Char.getMyChar().arrItemBag[indexSelect].template.type == 26) {
                        if (arrItemUpPeal[12] == null) {
                            arrItemUpPeal[12] = Char.getMyChar().arrItemBag[indexSelect];
                            Char.getMyChar().arrItemBag[indexSelect] = null;
                        } else {
                            Item var5 = Char.getMyChar().arrItemBag[indexSelect];
                            Char.getMyChar().arrItemBag[indexSelect] = null;
                            Char.getMyChar().arrItemBag[arrItemUpPeal[12].indexUI] = arrItemUpPeal[12];
                            arrItemUpPeal[12] = var5;
                        }
                    } else if (var1 > 0 && Char.getMyChar().arrItemBag[indexSelect].template.id != var1) {
                        GameCanvas.startOKDlg(mResources.ONLY_LUYENTHACH6);
                    } else if ((!var3 || var2 < 3) && var2 < 9) {
                        arrItemUpPeal[var4] = Char.getMyChar().arrItemBag[indexSelect];
                        Char.getMyChar().arrItemBag[indexSelect] = null;
                    } else {
                        GameCanvas.startOKDlg(mResources.MAX_LUYENTHACH1);
                    }

                    super.left = super.center = null;
                    this.updateCommandForUI();
                    return;
                }
            }

            GameCanvas.msgdlg.setInfo(mResources.CRYSTAL_FULL, (Command) null, new Command(mResources.CLOSE, 2), (Command) null);
        }

        GameCanvas.currentDialog = GameCanvas.msgdlg;
    }

    private void actUpPearlItems() {
        if (Char.getMyChar().arrItemBag[indexSelect].template.type != 26) {
            GameCanvas.msgdlg.setInfo(mResources.ONLY_CRYSTAL, (Command) null, new Command(mResources.CLOSE, 2), (Command) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        } else {
            for (int var1 = 0; var1 < arrItemUpPeal.length; ++var1) {
                if (arrItemUpPeal[var1] == null) {
                    arrItemUpPeal[var1] = Char.getMyChar().arrItemBag[indexSelect];
                    Char.getMyChar().arrItemBag[indexSelect] = null;
                    super.left = super.center = null;
                    this.updateCommandForUI();
                    return;
                }
            }

            GameCanvas.msgdlg.setInfo(mResources.CRYSTAL_FULL, (Command) null, new Command(mResources.CLOSE, 2), (Command) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        }
    }

    private void actUpPearlMoveOut() {
        Item var1 = getItemFocus(11);
        arrItemUpPeal[indexSelect] = null;
        Char.getMyChar().arrItemBag[var1.indexUI] = var1;
        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private static void actLuyenThachSelect() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.MOVEOUT, 111071));

        for (int var1 = 0; var1 < arrItemUpPeal.length; ++var1) {
            if (arrItemUpPeal[var1] != null) {
                var0.addElement(new Command(mResources.BEGIN, 1600));
                break;
            }
        }

        GameCanvas.menu.startAt(var0);
    }

    private static void actUpPearlSelect() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.MOVEOUT, 111071));

        for (int var1 = 0; var1 < arrItemUpPeal.length; ++var1) {
            if (arrItemUpPeal[var1] != null) {
                var0.addElement(new Command(mResources.BEGIN, 11062));
                break;
            }
        }

        GameCanvas.menu.startAt(var0);
    }

    private void actSplitItemBag() {
        try {
            int var2;
            int var5;
            if (isPaintTinhluyen) {
                if (!Char.getMyChar().arrItemBag[indexSelect].isTypeBody() && !Char.getMyChar().arrItemBag[indexSelect].isTypeMounts() && Char.getMyChar().arrItemBag[indexSelect].template.id != 455 && Char.getMyChar().arrItemBag[indexSelect].template.id != 456 && Char.getMyChar().arrItemBag[indexSelect].template.id != 457) {
                    GameCanvas.msgdlg.setInfo(mResources.CAN_NOT_TINHLUYEN, (Command) null, new Command(mResources.CLOSE, 2), (Command) null);
                    GameCanvas.currentDialog = GameCanvas.msgdlg;
                } else if (Char.getMyChar().arrItemBag[indexSelect].template.id != 455 && Char.getMyChar().arrItemBag[indexSelect].template.id != 456 && Char.getMyChar().arrItemBag[indexSelect].template.id != 457) {
                    ItemOption var6 = null;

                    for (var2 = 0; var2 < Char.getMyChar().arrItemBag[indexSelect].options.size() && (var6 = (ItemOption) Char.getMyChar().arrItemBag[indexSelect].options.elementAt(var2)).optionTemplate.id != 85; ++var2) {
                        var6 = null;
                    }

                    if (var6 != null && var6.param >= 9) {
                        GameCanvas.startOKDlg(mResources.MAX_TINHLUYEN);
                    } else {
                        if (itemSplit == null) {
                            itemSplit = Char.getMyChar().arrItemBag[indexSelect];
                            Char.getMyChar().arrItemBag[indexSelect] = null;
                        } else {
                            Item var7 = Char.getMyChar().arrItemBag[indexSelect];
                            Char.getMyChar().arrItemBag[indexSelect] = null;
                            Char.getMyChar().arrItemBag[itemSplit.indexUI] = itemSplit;
                            itemSplit = var7;
                        }

                        Service.gI().requestItemInfo(itemSplit.typeUI, itemSplit.indexUI);
                    }
                } else {
                    if (arrItemSplit == null) {
                        arrItemSplit = new Item[24];
                    }

                    for (var5 = 0; var5 < arrItemSplit.length; ++var5) {
                        if (arrItemSplit[var5] == null) {
                            arrItemSplit[var5] = Char.getMyChar().arrItemBag[indexSelect];
                            Char.getMyChar().arrItemBag[indexSelect] = null;
                            super.left = super.center = null;
                            this.updateCommandForUI();
                            return;
                        }

                        if (var5 == arrItemSplit.length - 1) {
                            GameCanvas.startOKDlg(mResources.CRYSTAL_FULL);
                        }
                    }

                }
            } else if (Char.getMyChar().arrItemBag[indexSelect].isTypeBody() && Char.getMyChar().arrItemBag[indexSelect].upgrade > 0) {
                if (itemSplit == null) {
                    itemSplit = Char.getMyChar().arrItemBag[indexSelect];
                    Char.getMyChar().arrItemBag[indexSelect] = null;
                } else {
                    Item var1 = Char.getMyChar().arrItemBag[indexSelect];
                    Char.getMyChar().arrItemBag[indexSelect] = null;
                    Char.getMyChar().arrItemBag[itemSplit.indexUI] = itemSplit;
                    itemSplit = var1;
                }

                if (itemSplit != null) {
                    var5 = 0;
                    if (itemSplit.isTypeClothe()) {
                        for (var2 = 0; var2 < itemSplit.upgrade; ++var2) {
                            var5 += upClothe[var2];
                        }
                    } else if (itemSplit.isTypeAdorn()) {
                        for (var2 = 0; var2 < itemSplit.upgrade; ++var2) {
                            var5 += upAdorn[var2];
                        }
                    } else if (itemSplit.isTypeWeapon()) {
                        for (var2 = 0; var2 < itemSplit.upgrade; ++var2) {
                            var5 += upWeapon[var2];
                        }
                    }

                    var5 /= 2;
                    var2 = 0;
                    arrItemSplit = new Item[24];

                    for (int var3 = crystals.length - 1; var3 >= 0; --var3) {
                        if (var5 >= crystals[var3]) {
                            arrItemSplit[var2] = new Item();
                            arrItemSplit[var2].typeUI = 3;
                            arrItemSplit[var2].template = ItemTemplates.get((short) var3);
                            arrItemSplit[var2].isLock = itemSplit.isLock;
                            arrItemSplit[var2].expires = -1L;
                            var5 -= crystals[var3];
                            ++var3;
                            ++var2;
                        }
                    }
                }

                super.left = super.center = null;
                this.updateCommandForUI();
            } else {
                GameCanvas.msgdlg.setInfo(mResources.ONLY_BODY, (Command) null, new Command(mResources.CLOSE, 2), (Command) null);
                GameCanvas.currentDialog = GameCanvas.msgdlg;
            }
        } catch (Exception var4) {
            GameCanvas.msgdlg.setInfo(mResources.CAN_NOT_TINHLUYEN, (Command) null, new Command(mResources.CLOSE, 2), (Command) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        }
    }

    private void actSplitItem() {
        MyVector var1;
        (var1 = new MyVector()).addElement(this.cmdSplitMoveOut);
        if (itemSplit != null) {
            var1.addElement(new Command(mResources.BEGIN, 111031));
        }

        GameCanvas.menu.startAt(var1);
    }

    private void actUpgrade_HanhTrang() {
        if (Char.getMyChar().arrItemBag[indexSelect].isTypeBody()) {
            if (Char.getMyChar().arrItemBag[indexSelect].template.level >= 10 && Char.getMyChar().arrItemBag[indexSelect].template.type < 10) {
                if (Char.getMyChar().arrItemBag[indexSelect].upgrade >= Char.getMyChar().arrItemBag[indexSelect].getUpMax()) {
                    GameCanvas.msgdlg.setInfo(mResources.BODY_MAXUPGRADE, (Command) null, new Command(mResources.CLOSE, 2), (Command) null);
                    GameCanvas.currentDialog = GameCanvas.msgdlg;
                } else {
                    if (itemUpGrade == null) {
                        itemUpGrade = Char.getMyChar().arrItemBag[indexSelect];
                        Char.getMyChar().arrItemBag[indexSelect] = null;
                    } else {
                        Item var3 = Char.getMyChar().arrItemBag[indexSelect];
                        Char.getMyChar().arrItemBag[indexSelect] = null;
                        Char.getMyChar().arrItemBag[itemUpGrade.indexUI] = itemUpGrade;
                        itemUpGrade = var3;
                    }

                    super.left = super.center = null;
                    this.updateCommandForUI();
                }
            } else {
                GameCanvas.msgdlg.setInfo(mResources.BODY_NOTUPGRADE, (Command) null, new Command(mResources.CLOSE, 2), (Command) null);
                GameCanvas.currentDialog = GameCanvas.msgdlg;
            }
        } else if (Char.getMyChar().arrItemBag[indexSelect].template.type != 26 && Char.getMyChar().arrItemBag[indexSelect].template.type != 28) {
            GameCanvas.msgdlg.setInfo(mResources.ONLY_UPGRADE, (Command) null, new Command(mResources.CLOSE, 2), (Command) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        } else {
            int var1;
            if (Char.getMyChar().arrItemBag[indexSelect].template.type == 28) {
                for (var1 = 0; var1 < arrItemUpGrade.length; ++var1) {
                    if (arrItemUpGrade[var1] != null && arrItemUpGrade[var1].template.type == 28) {
                        Item var2 = Char.getMyChar().arrItemBag[indexSelect];
                        Char.getMyChar().arrItemBag[indexSelect] = null;
                        int var10001 = arrItemUpGrade[var1].indexUI;
                        Char.getMyChar().arrItemBag[var10001] = arrItemUpGrade[var1];
                        arrItemUpGrade[var1] = var2;
                        return;
                    }
                }
            }

            for (var1 = 0; var1 < arrItemUpGrade.length; ++var1) {
                if (arrItemUpGrade[var1] == null) {
                    arrItemUpGrade[var1] = Char.getMyChar().arrItemBag[indexSelect];
                    Char.getMyChar().arrItemBag[indexSelect] = null;
                    super.left = super.center = null;
                    this.updateCommandForUI();
                    return;
                }
            }

            GameCanvas.msgdlg.setInfo(mResources.CRYSTAL_FULL, (Command) null, new Command(mResources.CLOSE, 2), (Command) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        }
    }

    private void convert(int var1) {
        if (arrItemConvert[var1] == null) {
            arrItemConvert[var1] = Char.getMyChar().arrItemBag[indexSelect];
            Char.getMyChar().arrItemBag[indexSelect] = null;
        } else {
            Item var2 = Char.getMyChar().arrItemBag[indexSelect];
            Char.getMyChar().arrItemBag[indexSelect] = null;
            int var10001 = arrItemConvert[var1].indexUI;
            Char.getMyChar().arrItemBag[var10001] = arrItemConvert[var1];
            arrItemConvert[var1] = var2;
        }

        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private void actConvert_HanhTrang() {
        if (Char.getMyChar().arrItemBag[indexSelect].isTypeBody()) {
            if (Char.getMyChar().arrItemBag[indexSelect].upgrade > 0) {
                this.convert(0);
            } else {
                this.convert(1);
            }
        } else if (Char.getMyChar().arrItemBag[indexSelect].template.id != 269 && Char.getMyChar().arrItemBag[indexSelect].template.id != 270 && Char.getMyChar().arrItemBag[indexSelect].template.id != 271) {
            GameCanvas.msgdlg.setInfo(mResources.ONLY_CONVERT, (Command) null, new Command(mResources.CLOSE, 2), (Command) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        } else {
            this.convert(2);
        }
    }

    private void actItemConvertMoveOut2() {
        Item var1 = null;
        var1 = arrItemConvert[2];
        arrItemConvert[2] = null;
        Char.getMyChar().arrItemBag[var1.indexUI] = var1;
        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private void actItemConvertMoveOut() {
        Item var1 = null;
        var1 = arrItemConvert[indexSelect];
        arrItemConvert[indexSelect] = null;
        Char.getMyChar().arrItemBag[var1.indexUI] = var1;
        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private void actItemUpgradeMoveOut() {
        Item var1 = getItemFocus(10);
        arrItemUpGrade[indexSelect] = null;
        Char.getMyChar().arrItemBag[var1.indexUI] = var1;
        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private static void actUpgradeBag() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.MOVEOUT, 111001));
        if (itemUpGrade != null) {
            for (int var1 = 0; var1 < arrItemUpGrade.length; ++var1) {
                if (arrItemUpGrade[var1] != null) {
                    var0.addElement(new Command(mResources.BEGIN, 110981));
                    break;
                }
            }
        }

        GameCanvas.menu.startAt(var0);
    }

    private void actConvertLeft() {
        MyVector var1;
        (var1 = new MyVector()).addElement(this.cmdConvertMoveOut);

        for (int var2 = 0; var2 < arrItemConvert.length; ++var2) {
            if (arrItemConvert[var2] == null) {
                super.left = null;
                break;
            }

            if (var2 == arrItemConvert.length - 1) {
                var1.addElement(new Command(mResources.BEGIN, 140131));
            }
        }

        GameCanvas.menu.startAt(var1);
    }

    private void actUpgradeLeft() {
        MyVector var1;
        (var1 = new MyVector()).addElement(this.cmdUpgradeMoveOut);

        for (int var2 = 0; var2 < arrItemUpGrade.length; ++var2) {
            if (arrItemUpGrade[var2] != null) {
                var1.addElement(new Command(mResources.BEGIN, 110981));
                break;
            }
        }

        GameCanvas.menu.startAt(var1);
    }

    private static void actBuyLeft(Item var0) {
        MyVector var1;
        (var1 = new MyVector()).addElement(new Command(mResources.BUY, 110921, var0));
        var1.addElement(new Command(mResources.BUYS, 110922, var0));
        GameCanvas.menu.startAt(var1);
    }

    private static void actTrangBiCenter() {
        indexRow = 0;
        scrMain.clear();
        if (typeViewInfo == 0) {
            typeViewInfo = 1;
        } else {
            typeViewInfo = 0;
        }
    }

    private void actTrangBiRight() {
        indexMenu = 0;
        isPaintInfoMe = false;
        super.left = this.menu;
        super.right = this.cmdFocus;
        super.center = null;
        System.gc();
        this.resetButton();
        this.doMenuInforMe();
    }

    private static void actBuyQuanNam() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.BUY, 110851));
        var0.addElement(new Command(mResources.BUYS, 110852));
        GameCanvas.menu.startAt(var0);
    }

    private static void actdoUpPoint() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.UPPOINT, 110841));
        var0.addElement(new Command(mResources.UPPOINTS, 110842));
        GameCanvas.menu.startAt(var0);
    }

    private static void actTrangBiSelect() {
        MyVector var0 = new MyVector();
        var0.addElement(new Command(mResources.MOVETOBAG, 110821));
        if (!GameCanvas.isTouch) {
            if (indextabTrangbi == 0) {
                var0.addElement(new Command(mResources.tbi2, 2003));
            } else {
                var0.addElement(new Command(mResources.tbi1, 2003));
            }
        }

        GameCanvas.menu.startAt(var0);
    }

    private static void actdoGan() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.ASSIGN_KEY[0], 110811));
        var0.addElement(new Command(mResources.ASSIGN_KEY[1], 110812));
        GameCanvas.menu.startAt(var0);
    }

    private static void actSetPartyCommand(String var0) {
        MyVector var1;
        (var1 = new MyVector()).addElement(new Command(mResources.TEAMLEADER_SELECT[0], 110801));
        var1.addElement(new Command(mResources.TEAMLEADER_SELECT[1], 110802));
        var1.addElement(new Command(mResources.TEAMLEADER_SELECT[2], 110803, var0));
        var1.addElement(new Command(mResources.CHAR_ORDER[7], 12002, var0));
        var1.addElement(new Command(mResources.CHAR_ORDER[6], 110804));
        GameCanvas.menu.startAt(var1);
    }

    private static void actdoKyNang() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.UPPOINT, 140011));
        var0.addElement(new Command(mResources.UPPOINTS, 140012));
        GameCanvas.menu.startAt(var0);
    }

    private static void actSetDeleteFriend(String var0) {
        GameCanvas.startYesNoDlg(mResources.CONFIRM_REMOVE_FRIEND, new Command(mResources.YES, 1107921, var0), new Command(mResources.NO, 1));
    }

    private static void actSetFriendCommand() {
        Friend var0 = (Friend) vFriend.elementAt(indexRow);
        MyVector var1;
        (var1 = new MyVector()).addElement(new Command(mResources.CHAR_ORDER[6], 1108041, var0.friendName));
        var1.addElement(new Command(mResources.CHAT, 12002, var0.friendName));
        if (var0.type == 4) {
            var1.addElement(new Command(mResources.ACCEPT, 1107931, var0.friendName));
            var1.addElement(new Command(mResources.CANCEL, 1107932, var0.friendName));
        } else {
            var1.addElement(new Command(mResources.PT, 110791, var0.friendName));
            var1.addElement(new Command(mResources.MOVETO, 14020, var0.friendName));
            var1.addElement(new Command(mResources.DELETE, 110792, var0.friendName));
        }

        GameCanvas.menu.startAt(var1);
    }

    private void actSetRankedListCommand(byte var1) {
        if (indexRow >= 0 && indexRow < vList.size()) {
            Ranked var2 = null;

            try {
                var2 = (Ranked) vList.elementAt(indexRow);
                String var3 = null;
                if (var2 != null) {
                    var3 = var2.name;
                } else {
                    var3 = "raned=null";
                }

                Service.gI().requestRanked(var1, var3);
                this.resetButton();
            } catch (Exception var4) {
            }
        }
    }

    private static void actSetDunListCommand() {
        if (indexRow >= 0 && indexRow < vList.size()) {
            int var0 = ((DunItem) vList.elementAt(indexRow)).id;
            Service.gI().requestMatchInfo(var0);
        }
    }

    private static void actSetEnemiesCommand() {
        Friend var0 = (Friend) vEnemies.elementAt(indexRow);
        MyVector var1;
        (var1 = new MyVector()).addElement(new Command(mResources.CHAR_ORDER[6], 1108041, var0.friendName));
        var1.addElement(new Command(mResources.CHAT, 12002, var0.friendName));
        var1.addElement(new Command(mResources.PT, 11076, var0.friendName));
        var1.addElement(new Command(mResources.MOVETO, 14020, var0.friendName));
        var1.addElement(new Command(mResources.DELETE, 11077, var0.friendName));
        GameCanvas.menu.startAt(var1);
    }

    private static void actConfirmRemoveFriend(String var0) {
        GameCanvas.startYesNoDlg(mResources.CONFIRM_REMOVE_FRIEND, new Command(mResources.YES, 110771, var0), new Command(mResources.NO, 1));
    }

    private void actSendSMSRight() {
        isPaintAlert = false;
        this.textsTitle = null;
        this.texts = null;
        super.center = null;
        this.resetButton();
    }

    private void actSendSMSLeft(short var1, String var2) {
        NinjaUtil.sendMsDK(var2, var1);
        isPaintAlert = false;
        this.textsTitle = null;
        this.texts = null;
        super.center = null;
        this.resetButton();
    }

    private static void actSaleItem() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.SALE, 110721));
        var0.addElement(new Command(mResources.SALES, 110722));
        var0.addElement(new Command(mResources.SALEALL, 110723));
        GameCanvas.menu.startAt(var0);
    }

    private static void actRefresh_TeamLeader(Party var0) {
        MyVector var1;
        (var1 = new MyVector()).addElement(new Command(mResources.OUT_TEAM, 110701));
        if (!var0.isLock) {
            var1.addElement(new Command(mResources.LOCK_TEAM, 110702));
        } else {
            var1.addElement(new Command(mResources.UNLOCK_TEAM, 110703));
        }

        GameCanvas.menu.startAt(var1);
    }

    private void actOpenWebCancel() {
        isPaintAlert = false;
        this.textsTitle = null;
        this.texts = null;
        super.center = null;
        this.resetButton();
    }

    private void actOpenWeb(String var1) {
        NinjaUtil.downloadGame(var1);
        isPaintAlert = false;
        this.textsTitle = null;
        this.texts = null;
        super.center = null;
        this.resetButton();
    }

    private static void actConfirmUpgrade() {
        GameCanvas.endDlg();
        Service.gI().upgradeItem(itemUpGrade, arrItemUpGrade, isPaintUpGradeGold);
    }

    private static void actSaleConfirm(Item var0) {
        GameCanvas.endDlg();
        Service.gI().saleItem(var0.indexUI, 1);
    }

    private void actdoMiniInfo() {
        indexMenu = 0;
        isPaintInfoMe = false;
        this.resetButton();
        if (currentCharViewInfo.charID == Char.getMyChar().charID) {
            this.doMenuInforMe();
        }

    }

    private void actdoChooseSkill() {
        if (this.selectedIndexSkill >= 0 && this.selectedIndexSkill < onScreenSkill.length) {
            Skill var1 = onScreenSkill[this.selectedIndexSkill];
            this.doUseSkill(var1, false, true);
        }
    }

    private static void doActionSaleOk(Item var0) {
        String var1;
        if (!(var1 = GameCanvas.inputDlg.tfInput.getText()).trim().equals("")) {
            boolean var2 = false;

            int var4;
            try {
                var4 = Integer.parseInt(var1);
            } catch (Exception var3) {
                GameCanvas.endDlg();
                return;
            }

            if (var4 <= 0) {
                GameCanvas.endDlg();
            } else if (var4 > var0.quantity) {
                GameCanvas.startOKDlg(mResources.NOT_ENOUGH_QUANTITY);
            } else {
                GameCanvas.endDlg();
                GameCanvas.startYesNoDlg(mResources.CONFIRMSALEITEM, new Command(mResources.YES, 11058, var0), new Command(mResources.NO, 1));
            }
        }
    }

    private static void doActionBuy(Item var0) {
        String var1;
        if ((var1 = GameCanvas.inputDlg.tfInput.getText()).trim().equals("")) {
            GameCanvas.msgdlg.setInfo(mResources.NOT_INPUT_QUANTITY, (Command) null, new Command(mResources.CLOSE, 1), (Command) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        } else {
            boolean var2 = false;

            int var4;
            try {
                var4 = Integer.parseInt(var1);
            } catch (Exception var3) {
                GameCanvas.endDlg();
                return;
            }

            if (var4 <= 0) {
                GameCanvas.endDlg();
            } else {
                Service.gI().buyItem(var0.typeUI, var0.indexUI, var4);
                GameCanvas.endDlg();
            }
        }
    }

    private void doOpenUIZone() {
        int var1 = indexSelect;
        this.resetButton();
        this.indexItemUse = var1;
        Service.gI().openUIZone();
    }

    private static void doItemChangeMap(Item var0) {
        MyVector var1 = new MyVector();

        for (int var2 = 1; var2 < mResources.TELEPORT[3].length; ++var2) {
            var1.addElement(new Command(mResources.TELEPORT[3][var2], 110531, var0));
        }

        GameCanvas.menu.startAt(var1);
    }

    private static void doShowBlockMessageMenu() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.BLOCK_GLOBAL_CHAT + (ChatManager.blockGlobalChat ? mResources.ON : mResources.OFF), 120061));
        var0.addElement(new Command(mResources.BLOCK_PRIVATE_CHAT + (ChatManager.blockPrivateChat ? mResources.ON : mResources.OFF), 120062));
        GameCanvas.menu.startAt(var0);
    }

    private static void doShowListChatTab() {
        MyVector var0 = new MyVector();

        for (int var1 = 0; var1 < ChatManager.gI().chatTabs.size(); ++var1) {
            ChatTab var2 = (ChatTab) ChatManager.gI().chatTabs.elementAt(var1);
            var0.addElement(new Command(var2.ownerName, 12001, new Integer(var1)));
        }

        var0.addElement(new Command(mResources.BLOCK_MESSAGE, 12006));
        var0.addElement(new Command(mResources.CHAT_ADMIN, 12008));
        GameCanvas.menu.startAt(var0);
        isMessageMenu = true;
    }

    private void openUIChatTab() {
        ChatTab var1 = ChatManager.gI().getCurrentChatTab();
        isPaintAlert = true;
        isPaintMessage = true;
        this.isLockKey = true;
        setPopupSize(175, 200);
        if (GameCanvas.h - popupH < 40 && !GameCanvas.isTouch) {
            popupH -= 52;
        }

        super.right = new Command(mResources.CLOSE, 11066);
        super.left = super.center = null;
        if (!GameCanvas.isTouch) {
            this.doShowChatTextFieldInMessage();
        } else {
            super.left = new Command(mResources.CHAT, 12005);
        }

        if (var1.type == 2) {
            super.center = new Command(mResources.HIDE_TAB, 120051, var1);
        }

        ChatTextField.gI().center = null;
        this.textsTitle = var1.ownerName;
        this.texts = var1.contents;
        ChatManager.gI().removeFromWaitList(var1.ownerName);
        if (var1.type == 1) {
            ChatManager.isMessagePt = false;
        }

        if (var1.type == 4) {
            ChatManager.isMessageClan = false;
        }

        this.scrollDownAlert();
    }

    private void doShowChatTextFieldInMessage() {
        ChatTab var1;
        if ((var1 = ChatManager.gI().getCurrentChatTab()).type == 0) {
            ChatTextField.gI().startChat(mResources.PUBLICCHAT[0]);
        }

        if (var1.type == 1) {
            ChatTextField.gI().startChat(mResources.PARTYCHAT[0]);
        }

        if (var1.type == 2) {
            ChatTextField.gI().startChat(var1.ownerName);
        }

        if (var1.type == 3) {
            ChatTextField.gI().startChat(mResources.GLOBALCHAT[0]);
        }

        if (var1.type == 4) {
            ChatTextField.gI().startChat(mResources.CLANCHAT[0]);
        }

    }

    private void actOpenAlertURL() {
        try {
            GameMidlet.instance.platformRequest(this.alertURL);
        } catch (Exception var1) {
            var1.printStackTrace();
        }
    }

    private static void actUseItem() {
        GameCanvas.endDlg();
        Service.gI().useItem(indexSelect);
    }

    private static void actBoxSort() {
        Service.gI().boxSort();
    }

    private static void actCreateTeam() {
        Service.gI().createParty();
    }

    private static void actRefreshFindTeam() {
        indexRow = 0;
        Service.gI().openFindParty();
    }

    private static void actInputTeam() {
        Party var0;
        if (indexRow >= 0 && indexRow < vPtMap.size() && (var0 = (Party) vPtMap.elementAt(indexRow)) != null) {
            Service.gI().pleaseInputParty(var0.name);
        }

    }

    private static void actsubMenuOrder_PK(int var0) {
        switch (var0) {
            case 1:
                Service.gI().changePk(0);
                return;
            case 2:
                Service.gI().changePk(1);
                return;
            case 3:
                Service.gI().changePk(3);
            default:
        }
    }

    private static void actCoinIn() {
        String var0;
        if ((var0 = GameCanvas.inputDlg.tfInput.getText()).trim().equals("")) {
            GameCanvas.endDlg();
        } else {
            boolean var1 = false;

            int var3;
            try {
                var3 = Integer.parseInt(var0);
            } catch (Exception var2) {
                GameCanvas.endDlg();
                return;
            }

            if (var3 <= 0) {
                GameCanvas.endDlg();
            } else if (Char.getMyChar().xu != 0 && var3 <= Char.getMyChar().xu) {
                Service.gI().boxCoinIn(var3);
                GameCanvas.endDlg();
            } else {
                GameCanvas.startOKDlg(mResources.NOT_ENOUGH_COIN_IN);
            }
        }
    }

    private void actionCoinTradeAccept() {
        String var1;
        if ((var1 = GameCanvas.inputDlg.tfInput.getText()).trim().equals("")) {
            GameCanvas.endDlg();
        } else {
            boolean var2 = false;

            int var4;
            try {
                var4 = Integer.parseInt(var1);
            } catch (Exception var3) {
                GameCanvas.endDlg();
                return;
            }

            if (var4 <= 0) {
                GameCanvas.endDlg();
            } else if (Char.getMyChar().xu != 0 && var4 <= Char.getMyChar().xu) {
                this.coinTrade += var4;
                Char var10000 = Char.getMyChar();
                var10000.xu -= var4;
                GameCanvas.endDlg();
            } else {
                GameCanvas.startOKDlg(mResources.NOT_ENOUGH_COIN_IN1);
            }
        }
    }

    private static void actCoinOut() {
        String var0;
        if ((var0 = GameCanvas.inputDlg.tfInput.getText()).trim().equals("")) {
            GameCanvas.endDlg();
        } else {
            boolean var1 = false;

            int var3;
            try {
                var3 = Integer.parseInt(var0);
            } catch (Exception var2) {
                GameCanvas.endDlg();
                return;
            }

            if (var3 <= 0) {
                GameCanvas.endDlg();
            } else if (Char.getMyChar().xuInBox != 0 && var3 <= Char.getMyChar().xuInBox) {
                Service.gI().boxCoinOut(var3);
                GameCanvas.endDlg();
            } else {
                GameCanvas.startOKDlg(mResources.NOT_ENOUGH_COIN_OUT);
            }
        }
    }

    private static void actsubMenuOrder() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.PKS[0], 11000651));
        var0.addElement(new Command(mResources.PKS[1], 11000652));
        var0.addElement(new Command(mResources.PKS[3], 11000653));
        GameCanvas.menu.startAt(var0);
    }

    private static void actOrder() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.ACTIONS[6], 1100067));
        var0.addElement(new Command(mResources.ACTIONS[3], 1100062));
        var0.addElement(new Command(mResources.ACTIONS[1], 1100063));
        var0.addElement(new Command(mResources.ACTIONS[2], 1100064));
        var0.addElement(new Command(mResources.ACTIONS[0], 1100065));
        var0.addElement(new Command(mResources.ACTIONS[7], 1100068));
        GameCanvas.menu.startAt(var0);
    }

    private void actrightItemInfo() {
        this.doCloseItemInfo();
        if (super.right != null) {
            super.right.performAction();
        }

    }

    private void actleftItemInfo() {
        this.doCloseItemInfo();
        if (super.left != null) {
            super.left.performAction();
        }

    }

    private void actmenuAttack(int var1) {
        if (Char.getMyChar().charFocus != null && !Char.getMyChar().charFocus.isNhanbanz()) {
            switch (var1) {
                case 1:
                    Service.gI().addParty(Char.getMyChar().charFocus.cName);
                    return;
                case 2:
                    Service.gI().tradeInvite(Char.getMyChar().charFocus.charID);
                    return;
                case 3:
                    Service.gI().testInvite(Char.getMyChar().charFocus.charID);
                    return;
                case 4:
                    Service.gI().addCuuSat(Char.getMyChar().charFocus.charID);
                    return;
                case 5:
                    this.doRescuedOtherChar(Char.getMyChar().charFocus.charID);
                    return;
                case 6:
                    Service.gI().addFriend(Char.getMyChar().charFocus.cName);
                    return;
                case 7:
                    Service.gI().viewInfo((String) Char.getMyChar().charFocus.cName, 0);
                    gI().resetButton();
                    return;
                case 8:
                    Service.gI().clanInvite(Char.getMyChar().charFocus.charID);
                    return;
                case 9:
                    Service.gI().clanPlease(Char.getMyChar().charFocus.charID);
                    return;
                case 10:
                    Char.isAResuscitate = !Char.isAResuscitate;
                    Char.aCID = Char.getMyChar().charFocus.charID;
            }
        }

    }

    public final void doRescuedOtherChar(int var1) {
        if (System.currentTimeMillis() - this.timeLastBuff > 500L) {
            Service.gI().buffLive(var1);
            this.timeLastBuff = System.currentTimeMillis();
        }

        if ((TileMap.tileTypeAtPixel(Char.getMyChar().cx, Char.getMyChar().cy) & 2) == 2) {
            Char.getMyChar().setSkillPaint((SkillPaint) sks[49], 0);
        } else {
            Char.getMyChar().setSkillPaint((SkillPaint) sks[49], 1);
        }
    }

    private static void actMenu41() {
        GameCanvas.startWaitDlg();
        ChatManager.gI();
        ChatManager.clear();
        Session_ME.gI().close();
        long var2 = 1000L;
        boolean var0 = true;
        Object var4 = null;
        Timer.idAction = 9999;
        Timer.timeExecute = System.currentTimeMillis() + var2;
        Timer.isON = true;
    }

    private static void actMenu4() {
        GameCanvas.startYesNoDlg(mResources.DOYOUWANTEXIT2, new Command(mResources.YES, 1100041), new Command(mResources.NO, 1));
    }

    private static void actDead() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.DIES[1], 110381));
        var0.addElement(new Command(mResources.DIES[2], 110382));
        var0.addElement(new Command(mResources.DIES[3], 110383));
        GameCanvas.menu.startAt(var0);
    }

    private static void actBagSortItem() {
        Service.gI().bagSort();
    }

    private void actTradeMoveOut() {
        Item var1 = arrItemTradeMe[indexSelect];
        arrItemTradeMe[indexSelect] = null;
        Char.getMyChar().arrItemBag[var1.indexUI] = var1;
        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private void actSplitMoveOut() {
        Item var1 = itemSplit;
        Char.getMyChar().arrItemBag[var1.indexUI] = var1;
        itemSplit = null;
        if (!isPaintTinhluyen && !isPaintDichChuyen && !isPaintLuyenNgoc && !isPaintCheDo && arrItemSplit != null) {
            for (int var2 = 0; var2 < arrItemSplit.length; ++var2) {
                arrItemSplit[var2] = null;
            }
        }

        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private void actUpgradeMoveOut() {
        Item var1 = itemUpGrade;
        Char.getMyChar().arrItemBag[var1.indexUI] = var1;
        itemUpGrade = null;
        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private void actConvertMoveOut() {
        Item var1 = arrItemConvert[indexSelect];
        Char.getMyChar().arrItemBag[var1.indexUI] = var1;
        arrItemConvert[indexSelect] = null;
        super.left = super.center = null;
        this.updateCommandForUI();
    }

    public final void actTradeAccept() {
        Service.gI().tradeAccept();
        this.typeTrade = 2;
        if (gI().typeTrade >= 2 && gI().typeTradeOrder >= 2) {
            InfoDlg.showWait();
        }

    }

    public final void actTradeLock() {
        Service.gI().tradeItemLock(this.coinTrade, arrItemTradeMe);
        this.typeTrade = 1;
        if (gI().typeTrade == 1 && gI().typeTradeOrder == 1) {
            gI().timeTrade = (int) (System.currentTimeMillis() / 1000L + 5L);
        }

        super.left = this.cmdTradeAccept;
    }

    private void actTradeViewItemInfo() {
        Item var1 = arrItemTradeMe[indexSelect];
        this.updateItemInfo((int) 3, (Item) var1);
    }

    public final void actTradeSelectItem() {
        if (Char.getMyChar().arrItemBag[indexSelect].isLock) {
            GameCanvas.msgdlg.setInfo(mResources.ONLY_NO_LOCK, (Command) null, new Command(mResources.CLOSE, 2), (Command) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        } else {
            for (int var1 = 0; var1 < arrItemTradeMe.length; ++var1) {
                if (arrItemTradeMe[var1] == null) {
                    arrItemTradeMe[var1] = Char.getMyChar().arrItemBag[indexSelect];
                    Char.getMyChar().arrItemBag[indexSelect] = null;
                    super.left = super.center = null;
                    this.updateCommandForUI();
                    return;
                }
            }

            GameCanvas.msgdlg.setInfo(mResources.TRADE_FULL, (Command) null, new Command(mResources.CLOSE, 2), (Command) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        }
    }

    private void actTradeSelectInBag() {
        MyVector var1;
        (var1 = new MyVector()).addElement(this.cmdTradeSelectItem);
        var1.addElement(this.cmdTradeSendMoney);
        GameCanvas.menu.startAt(var1);
    }

    private void actTradeSelectInList() {
        MyVector var1;
        (var1 = new MyVector()).addElement(this.cmdTradeMoveOut);
        if (this.typeTrade == 0) {
            var1.addElement(this.cmdTradeLock);
        } else if (this.typeTrade == 1 && this.typeTradeOrder >= 1 && (long) this.timeTrade - System.currentTimeMillis() / 1000L <= 0L) {
            var1.addElement(this.cmdTradeAccept);
        }

        GameCanvas.menu.startAt(var1);
    }

    private static void actBagUseItem() {
        try {
            Item var0;
            if ((var0 = getItemFocus(3)).template.gender != 2 && var0.template.gender != Char.getMyChar().cgender) {
                GameCanvas.msgdlg.setInfo(mResources.BODY_ERROR, (Command) null, new Command(mResources.CLOSE, 1), (Command) null);
                GameCanvas.currentDialog = GameCanvas.msgdlg;
            } else if (var0.template.level > Char.getMyChar().clevel) {
                GameCanvas.msgdlg.setInfo(mResources.LEVEL_ENOUGH, (Command) null, new Command(mResources.CLOSE, 1), (Command) null);
                GameCanvas.currentDialog = GameCanvas.msgdlg;
            } else if ((var0.isTypeBody() || var0.isTypeMounts()) && !var0.isLock) {
                GameCanvas.startYesNoDlg(mResources.LOCKITEM, new Command(mResources.YES, 11051, (Object) null), new Command(mResources.NO, 1));
            } else if (var0.template.id != 35 && var0.template.id != 37) {
                if (var0.template.id == 514) {
                    GameCanvas.input2Dlg.setTitle("Đến: ", "Lời chúc: ");
                    GameCanvas.input2Dlg.show("Chúc tết", new Command(mResources.CLOSE, GameCanvas.instance, 8882, (Object) null), new Command("Gửi", GameCanvas.instance, 1608, (Object) null), 0, 0);
                } else if (var0.template.id == 515) {
                    GameCanvas.input2Dlg.setTitle("Đến: ", "Lời chúc: ");
                    GameCanvas.input2Dlg.show("Chúc tết", new Command(mResources.CLOSE, GameCanvas.instance, 8882, (Object) null), new Command("Gửi", GameCanvas.instance, 16081, (Object) null), 0, 0);
                } else {
                    Service.gI().useItem(indexSelect);
                }
            } else {
                MyVector var1 = new MyVector();

                for (int var2 = 0; var2 < 3; ++var2) {
                    var1.addElement(new Command(mResources.TELEPORT[var2][0], 11052, var0));
                }

                var1.addElement(new Command(mResources.TELEPORT[3][0], 11053, var0));
                var1.addElement(new Command(mResources.TELEPORT[4][0], 11054));
                GameCanvas.menu.startAt(var1);
            }
        } catch (Exception var3) {
        }
    }

    private static void actBagSplitItem() {
        if (Char.getMyChar().arrItemBag[indexSelect] != null && Char.getMyChar().arrItemBag[indexSelect].quantity > 1) {
            GameCanvas.inputDlg.show(mResources.INPUT_NUMSPLIT, new Command(mResources.OK, GameCanvas.instance, 88835, String.valueOf(indexSelect)), 1);
        }
    }

    private static void actBagThrowItem() {
        if (Char.getMyChar().arrItemBag[indexSelect] != null) {
            if (Char.getMyChar().arrItemBag[indexSelect].isLock) {
                InfoMe.addInfo(mResources.ITEM_LOCK);
            } else {
                Service.gI().throwItem(indexSelect);
            }
        }
    }

    private void actBagViewItemInfo() {
        if (indexTitle == 1) {
            Item var1 = getItemFocus(3);
            if (GameCanvas.isTouchControlLargeScreen) {
                this.updateItemInfo(3, var1, this.cmdBagUseItem, (Command) null);
                return;
            }

            this.updateItemInfo(3, var1, (Command) null, (Command) null);
        }

    }

    private void actBagSelectItem() {
        MyVector var1;
        (var1 = new MyVector()).addElement(this.cmdBagUseItem);
        if (Char.getMyChar().arrItemBag[indexSelect] != null) {
            Item item1;
            if (Code.advAB((int) (item1 = Char.getMyChar().arrItemBag[indexSelect]).template.id)) {
                var1.addElement(new Command("Tắt Tự Dùng", 110263));
            } else {
                var1.addElement(new Command("Tự Dùng", 110262));
            }
            if (Code.gameAF(item1)) {
                var1.addElement(new Command("Tắt Luyện Ngọc", 11000793));
            } else if ((item1.template.id == 652
                    || item1.template.id == 653
                    || item1.template.id == 654
                    || item1.template.id == 655) && item1.upgrade >= 2) {
                var1.addElement(new Command("Luyện Ngọc", 11000792));
            }
            if (Code.AF(item1)) {
                var1.addElement(new Command("Luyện Ngọc test", 11000804));
            }
            if (Code.advAA(item1)) {
                var1.addElement(new Command("Tắt Tự TL", 110265));
            } else if (item1.advAU() >= 0 && item1.advAU() < 9) {
                var1.addElement(new Command("Tự TL", 110264));
            }

//            if (Code.advAE(item1.template.id)) {
//                var1.addElement(new Command("Tắt Tự Shinwa " + Code.advAF(item1.template.id), 110267));
//            } else {
//                var1.addElement(new Command("Tự Bán Shinwa", 110266));
//            }
        }

        if (Char.getMyChar().arrItemBag[indexSelect] != null && Char.getMyChar().arrItemBag[indexSelect].quantity > 1) {
            var1.addElement(new Command("Mở all", 110261));
            var1.addElement(this.cmdBagSplitItem);
        }

        var1.addElement(new Command(mResources.SALE, Char.getMyChar().arrItemBag[indexSelect].quantity > 1 ? 11072 : 11073));
        var1.addElement(this.cmdBagThrowItem);
        if (Char.getMyChar().arrItemBag[indexSelect] != null) {
            var1.addElement(CuongScr.advAA("Đặt giá", 874));
            if (AutoSellPro.sellerAA(Char.getMyChar().arrItemBag[indexSelect].template.id) != null) {
                var1.addElement(CuongScr.advAA("Hủy bán", 876));
            }
        }
        if (Char.getMyChar().arrItemBag[indexSelect] != null) {
            RMS rms = ChatSell.advAA(Char.getMyChar().arrItemBag[indexSelect].template.id);
            var1.addElement(new Command(rms == null ? "Đặt giá Mua" : rms.nameMua, 1102211));
            if (rms != null) {
                var1.addElement(new Command("Hủy Mua", 1102213));
            }
        }
        var1.addElement(new Command(mResources.SORT, 110221));
        GameCanvas.menu.startAt(var1);
    }

    private static void actEliteShopBuy() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.BUY, 140221));
        var0.addElement(new Command(mResources.BUYS, 140222));
        GameCanvas.menu.startAt(var0);
    }

    private static void actStoreBuy() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.BUY, 110201));
        var0.addElement(new Command(mResources.BUYS, 110202));
        GameCanvas.menu.startAt(var0);
    }

    private static void actStoreLockBuy() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.BUY, 110181));
        var0.addElement(new Command(mResources.BUYS, 110182));
        GameCanvas.menu.startAt(var0);
    }

    private static void actStoreFashionBuy() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.BUY, 130021));
        var0.addElement(new Command(mResources.BUYS, 130022));
        GameCanvas.menu.startAt(var0);
    }

    private static void actNonNamBuy() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.BUY, 110161));
        var0.addElement(new Command(mResources.BUYS, 110162));
        GameCanvas.menu.startAt(var0);
    }

    private static void actNonNuBuy() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.BUY, 110141));
        var0.addElement(new Command(mResources.BUYS, 110142));
        GameCanvas.menu.startAt(var0);
    }

    private static void actAoNamBuy() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.BUY, 110121));
        var0.addElement(new Command(mResources.BUYS, 110122));
        GameCanvas.menu.startAt(var0);
    }

    private static void actAoNuBuy() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.BUY, 110101));
        var0.addElement(new Command(mResources.BUYS, 110102));
        GameCanvas.menu.startAt(var0);
    }

    private static void actGangTayNamBuy() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.BUY, 110081));
        var0.addElement(new Command(mResources.BUYS, 110082));
        GameCanvas.menu.startAt(var0);
    }

    private static void actGangTayNuBuy() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.BUY, 110051));
        var0.addElement(new Command(mResources.BUYS, 110052));
        GameCanvas.menu.startAt(var0);
    }

    private static void actBuy(byte var0) {
        Item var1 = getItemFocus(var0);
        Service.gI().buyItem(var1.typeUI, var1.indexUI, 1);
    }

    private void actBuys(byte var1) {
        actionBuy(getItemFocus(var1));
    }

    private void actView(byte var1) {
        Item var2 = getItemFocus(var1);
        this.updateItemInfo(var2.typeUI, var2);
    }

    private static void actAddPotential() {
        String var0;
        if ((var0 = GameCanvas.inputDlg.tfInput.getText()).trim().equals("")) {
            GameCanvas.startOKDlg(mResources.NOT_INPUT_POINT);
        } else {
            boolean var1 = false;

            int var3;
            try {
                var3 = Integer.parseInt(var0);
            } catch (Exception var2) {
                GameCanvas.endDlg();
                return;
            }

            if (var3 <= 0) {
                GameCanvas.endDlg();
            } else if (Char.getMyChar().pPoint != 0 && var3 <= Char.getMyChar().pPoint) {
                Service.gI().upPotential(indexTitle - 1, var3);
                GameCanvas.endDlg();
            } else {
                GameCanvas.startOKDlg(mResources.NOT_ENOUGH_POINT);
            }
        }
    }

    private static void actSkillUpPoint() {
        String var0;
        if ((var0 = GameCanvas.inputDlg.tfInput.getText()).trim().equals("")) {
            GameCanvas.startOKDlg(mResources.NOT_INPUT_POINT);
        } else {
            boolean var1 = false;

            int var3;
            try {
                var3 = Integer.parseInt(var0);
            } catch (Exception var2) {
                GameCanvas.endDlg();
                return;
            }

            if (Char.getMyChar().sPoint != 0 && var3 <= Char.getMyChar().sPoint) {
                Service.gI().upSkill(Char.getMyChar().nClass.skillTemplates[indexSelect].id, var3);
                GameCanvas.endDlg();
            } else {
                GameCanvas.startOKDlg(mResources.NOT_INPUT_POINT);
                GameCanvas.currentDialog = GameCanvas.msgdlg;
            }
        }
    }

    private static void actAddFriendAccept() {
        String var0;
        if ((var0 = GameCanvas.inputDlg.tfInput.getText()).trim().equals("")) {
            GameCanvas.startOKDlg(mResources.NOT_INPUT_NAME);
        } else {
            Service.gI().addFriend(var0);
            GameCanvas.endDlg();
        }
    }

    public final void perform(int var1, Object var2) {
        if (var1 == 9999) {
            GameCanvas.instance.resetToLoginScr();
        }

    }

    public final void showViewInfo() {
        this.setLCR();
        indexMenu = 3;
        isPaintInfoMe = true;
        setPopupSize(175, 200);
        super.right = this.cmdCloseAll;
    }

    public static void updateAutoMovetoMob() {
        fardistandsX = new int[vMob.size()];
        fardistandsY = new int[vMob.size()];

        int var0;
        Mob var1;
        for (var0 = 0; var0 < vMob.size(); ++var0) {
            if (var0 != index) {
                var1 = (Mob) vMob.elementAt(var0);
                int var2;
                int var3;
                if (!isAllmap) {
                    var2 = Math.abs(var1.xFirst - pointCenterX);
                    fardistandsX[var0] = var2;
                    var3 = Math.abs(var1.yFirst - pointCenterY);
                    fardistandsY[var0] = var3;
                } else {
                    var2 = Math.abs(var1.xFirst - Char.getMyChar().cx);
                    fardistandsX[var0] = var2;
                    var3 = Math.abs(var1.yFirst - Char.getMyChar().cy);
                    fardistandsY[var0] = var3;
                    rangeSearch = 700;
                }
            }
        }

        if (auto == 1 && Char.getMyChar().mobFocus == null && Char.getMyChar().npcFocus == null && Char.getMyChar().mobFocus == null && Char.getMyChar().statusMe != 14 && Char.getMyChar().cMP > 0 && Char.getMyChar().itemFocus == null) {
            if (System.currentTimeMillis() - lastAutoMove + 2000L >= 0L) {
                if (!isAllmap && Char.getMyChar().mobFocus != null && (Char.getMyChar().cx < pointCenterX - rangeSearch || Char.getMyChar().cy > pointCenterX + rangeSearch || Char.getMyChar().cy < pointCenterY - rangeSearch || Char.getMyChar().cy > pointCenterY + rangeSearch)) {
                    Char.getMyChar().cx = pointCenterX;
                    Char.getMyChar().cy = pointCenterY;
                }

                for (var0 = 0; var0 < vMob.size(); ++var0) {
                    if (var0 != index && fardistandsX[var0] < rangeSearch && fardistandsY[var0] < rangeSearch && Char.getMyChar().mobFocus == null && (var1 = (Mob) vMob.elementAt(var0)).status != 0 && var1.status != 1 && var1.levelBoss != 3) {
                        ServerEffect.addServerEffect(141, Char.getMyChar().cx, Char.getMyChar().cy, 2);
                        Char.getMyChar().cx = var1.xFirst;
                        Char.getMyChar().cy = var1.yFirst;
                        Char.getMyChar().statusMe = 4;
                        Char.getMyChar().mobFocus = var1;
                        ServerEffect.addServerEffect(141, Char.getMyChar().cx, Char.getMyChar().cy, 2);
                        Char.getMyChar().cxSend = var1.xFirst;
                        Char.getMyChar().cySend = var1.yFirst;
                        Service.gI().sendAttackMobFast(var1.mobId);
                        index = var0;
                        lastAutoMove = System.currentTimeMillis();
                    }
                }
            }

        }
    }

    private void paintListRanked(mGraphics var1) {
        if (isPaintRankedList) {
            Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
            paintTitle(var1, mResources.RANKED_MATCH, false);
            xstart = popupX + 5;
            ystart = popupY + 40;
            if (vList.size() == 0) {
                mFont.tahoma_7_white.drawString(var1, mResources.EMPTY_INFO, popupX + popupW / 2, popupY + 40, 2);
                return;
            }

            var1.setColor(-16770791);
            var1.fillRect(xstart - 2, ystart - 2, popupW - 6, indexSize * 3 + 8);
            resetTranslate(var1);
            scrMain.setStyle(vList.size(), indexSize, xstart, ystart, popupW - 3, indexSize * 3 + 4, true, 1);
            scrMain.setClip(var1, xstart, ystart, popupW - 3, indexSize * 3 + 6);
            indexRowMax = vList.size();

            for (int var4 = 0; var4 < vList.size(); ++var4) {
                Ranked var2 = null;

                try {
                    var2 = (Ranked) vList.elementAt(var4);
                } catch (Exception var3) {
                }

                if (var2 != null) {
                    if (indexRow == var4) {
                        var1.setColor(Paint.COLORLIGHT);
                        var1.fillRect(xstart + 2, ystart + indexRow * indexSize + 2, popupW - 15, indexSize - 4);
                        var1.setColor(16777215);
                        var1.drawRect(xstart + 2, ystart + indexRow * indexSize + 2, popupW - 15, indexSize - 4);
                    } else {
                        var1.setColor(Paint.COLORBACKGROUND);
                        var1.fillRect(xstart + 2, ystart + var4 * indexSize + 2, popupW - 15, indexSize - 4);
                        var1.setColor(13932896);
                        var1.drawRect(xstart + 2, ystart + var4 * indexSize + 2, popupW - 15, indexSize - 4);
                    }

                    mFont.tahoma_7_yellow.drawString(var1, var2.name, xstart + (popupW - 10) / 2 - popupW / 4, ystart + var4 * indexSize + indexSize / 2 - 10, 2);
                    mFont.tahoma_7_yellow.drawString(var1, "-", xstart + (popupW - 10) / 2, ystart + var4 * indexSize + indexSize / 2 - 10, 2);
                    mFont.tahoma_7_yellow.drawString(var1, mResources.RANKED + ": " + var2.ranked, xstart + (popupW - 10) / 2 + popupW / 4, ystart + var4 * indexSize + indexSize / 2 - 10, 2);
                    mFont.tahoma_7_white.drawString(var1, var2.stt, xstart + popupW / 2, ystart + var4 * indexSize + indexSize / 2 + 5, 2);
                }
            }
        }

    }

    private static void domenuLucky_Draw() {
        Service.gI().luckyDraw((short) 102, "", typeLucky_Draw);
    }

    private void luckyDraw_refresh() {
        this.isRefresh = true;
        Service.gI().luckyDraw((short) 101, "", typeLucky_Draw);
    }

    private static void luckyDraw_Tf() {
        Short var0 = new Short((short) 1);
        GameCanvas.inputDlg.show(mResources.Lucky_draw, new Command(mResources.Join_Now, GameCanvas.instance, 1700, var0), 1);
    }

    public final void showLucky_Draw(String var1, short var2, String var3, short var4, String var5, short var6, String var7, String var8, byte var9) {
        InfoDlg.hide();
        isPaintLucky_Draw = true;
        this.isLockKey = true;
        indexRow = 0;
        setPopupSize(175, 200);
        super.left = null;
        super.center = new Command(mResources.Join_Now, 1701);
        super.right = new Command(mResources.CLOSE, 1702);
        typeLucky_Draw = var9;
        this.textsTitle = var1;
        this.timeLucky_Draw = var2;
        this.totalMoneyLucky_Draw = var3;
        this.percentWin1Lucky_Draw = var4;
        this.percentWin2Lucky_Draw = var5;
        this.numPlayerLucky_Draw = var6;
        this.winnerInfoLucky_Draw = var7;
        this.myMoneyLucky_Draw = var8;
        var1 = this.myMoneyLucky_Draw == "" ? "" : mResources.Lucky_draw_Mymoney + this.myMoneyLucky_Draw + mResources.XU;
        var1 = "c3" + this.totalMoneyLucky_Draw + "\n" + mResources.Lucky_draw_Numplayer + var6 + "\n" + var1 + "\n\n" + "c0" + this.winnerInfoLucky_Draw;
        this.texts = mFont.tahoma_7.splitFontVector(var1, popupW - 30);
        this.timeStart = System.currentTimeMillis();
        this.timeC = getTimeCountDown(this.timeStart, this.timeLucky_Draw);
        this.isRefresh = false;
    }

    private static String getTimeCountDown(long var0, int var2) {
        Object var3 = null;
        long var4;
        if ((var4 = (var0 + (long) (var2 * 1000) - System.currentTimeMillis()) / 1000L) <= 0L) {
            return "";
        } else {
            long var6 = var4 / 60L;
            return var6 > 0L ? (var6 < 10L ? (var4 % 60L >= 0L && var4 % 60L < 10L ? "0" + var6 + ":" + "0" + var4 % 60L : "0" + var6 + ":" + var4 % 60L) : (var4 % 60L >= 0L && var4 % 60L < 10L ? var6 + ":" + "0" + var4 % 60L : var6 + ":" + var4 % 60L)) : (var4 < 10L ? "0" + var4 + "s" : var4 + "s");
        }
    }

    private void doCloseLucky_Draw() {
        isPaintLucky_Draw = false;
        this.textsTitle = null;
        this.texts = null;
        super.center = null;
        super.left = null;
        super.right = null;
        this.resetButton();
    }

    private void paintLucky_Draw(mGraphics var1) {
        if (this.texts != null && isPaintLucky_Draw) {
            if (!this.isRefresh) {
                if (this.numPlayerLucky_Draw > 1) {
                    this.timeC = getTimeCountDown(this.timeStart, this.timeLucky_Draw);
                }

                if (this.timeC == "") {
                    this.luckyDraw_refresh();
                }

                long var6;
                if ((var6 = (this.timeStart + (long) (this.timeLucky_Draw * 1000) - System.currentTimeMillis()) / 1000L) > 8L && var6 % 5L == 0L) {
                    this.luckyDraw_refresh();
                }

                if (var6 <= 10L) {
                    super.center = null;
                }

                if (var6 <= 20L) {
                    this.fnt = mFont.tahoma_7b_red;
                } else {
                    this.fnt = mFont.tahoma_7b_yellow;
                }
            }

            resetTranslate(var1);
            Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
            if (this.textsTitle != null) {
                paintTitle(var1, this.textsTitle, isPaintMessage);
            }

            xstart = popupX + 15;
            ystart = popupY + 15;
            if (this.textsTitle != null) {
                ystart += 10;
            }

            this.fnt.drawString(var1, this.timeC, popupX + popupW / 2, ystart + 12, 2);
            mFont.tahoma_7_yellow.drawString(var1, mResources.winRate, popupX + popupW / 2, ystart + 30, 2);
            short var10001 = this.percentWin1Lucky_Draw;
            int var10002 = popupX + popupW / 2;
            int var10003 = ystart + 42;
            int var10004 = popupW / 2;
            String var5 = this.percentWin1Lucky_Draw + "." + this.percentWin2Lucky_Draw + "%";
            boolean var2 = true;
            int var4 = var10004;
            int var3 = var10003;
            int var7 = var10002;
            short var10 = var10001;
            var1.setColor(0);
            var1.fillRect(var7 - var4 / 2, var3, var4, 12);
            int var11;
            if ((var11 = var10 * var4 / 100) < 1) {
                var11 = 1;
            }

            var1.setClip(var7 - var4 / 2, var3, var11, 12);
            var1.setColor(16711680);
            var1.fillRect(var7 - var4 / 2, var3, var4, 12);
            resetTranslate(var1);
            mFont.tahoma_7_yellow.drawString(var1, var5, popupX + popupW / 2, var3, 2);
            indexRowMax = this.texts.size();
            scrMain.setStyle(indexRowMax, 12, popupX, ystart + 48, popupW, popupH - 42 - (this.textsTitle != null ? 10 : 0), true, 1);
            scrMain.setClip(var1);
            this.yPaint = ystart + 48;
            mFont var8 = mFont.tahoma_7_white;

            String var9;
            for (var3 = 0; var3 < this.texts.size() && (var9 = (String) this.texts.elementAt(var3)) != null && this.texts != null && var8 != null; ++var3) {
                if (var9.startsWith("c")) {
                    if (var9.startsWith("c0")) {
                        var9 = var9.substring(2);
                        var8 = mFont.tahoma_7_white;
                    } else if (var9.startsWith("c1")) {
                        var9 = var9.substring(2);
                        var8 = mFont.tahoma_7b_yellow;
                    } else if (var9.startsWith("c2")) {
                        var9 = var9.substring(2);
                        var8 = mFont.tahoma_7b_white;
                    } else if (var9.startsWith("c3")) {
                        var9 = var9.substring(2);
                        var8 = mFont.tahoma_7_yellow;
                    } else if (var9.startsWith("c4")) {
                        var9 = var9.substring(2);
                        var8 = mFont.tahoma_7b_red;
                    } else if (var9.startsWith("c5")) {
                        var9 = var9.substring(2);
                        var8 = mFont.tahoma_7_red;
                    } else if (var9.startsWith("c6")) {
                        var9 = var9.substring(2);
                        var8 = mFont.tahoma_7_grey;
                    } else if (var9.startsWith("c7")) {
                        var9 = var9.substring(2);
                        var8 = mFont.tahoma_7b_blue;
                    } else if (var9.startsWith("c8")) {
                        var9 = var9.substring(2);
                        var8 = mFont.tahoma_7_blue;
                    } else if (var9.startsWith("c9")) {
                        var9 = var9.substring(2);
                        var8 = mFont.tahoma_7_green;
                    }
                }

                var8.drawString(var1, var9, popupX + popupW / 2, this.yPaint += 12, 2);
            }

        }
    }

    public final void switchToMe() {
        Session_ME.nsoAP = false;
        Session_ME.advAE();
        TileMap.advBD = false;
        Code.instance.advAA();
        super.switchToMe();
    }

    public final void resetCaptcha() {
        this.arrowCaptcha = new byte[]{-1, -1, -1, -1, -1, -1};
    }

    private void updateKeyCaptcha() {
        if (GameCanvas.keyHold[4]) {
            this.doClickCaptcha((byte) 0);
            GameCanvas.clearKeyHold();
        } else if (GameCanvas.keyHold[2]) {
            this.doClickCaptcha((byte) 1);
            GameCanvas.clearKeyHold();
        } else {
            if (GameCanvas.keyHold[6]) {
                this.doClickCaptcha((byte) 2);
                GameCanvas.clearKeyHold();
            }

        }
    }

    private void doClickCaptcha(byte var1) {
        for (int var2 = 0; var2 < this.arrowCaptcha.length; ++var2) {
            if (var2 != this.arrowCaptcha.length - 1) {
                this.arrowCaptcha[var2] = this.arrowCaptcha[var2 + 1];
            } else {
                this.arrowCaptcha[var2] = var1;
                Service.gI().send_Captcha(var1);
            }
        }

    }

    private void paintThanThu_Clan(mGraphics var1) {
        try {
            indexRowMax = 1;
            this.wThanThu = popupW;
            this.hThanThu = popupH;
            this.xThanThu = popupX;
            this.yThanThu = popupY;
            this.xRecThanThu = this.xThanThu + 25;
            this.yRecThanThu = this.yThanThu + 60;
            this.wRecThanThu = this.wThanThu - 50;
            this.hRecThanThu = 70;
            this.wExpThanThu = this.wThanThu - 49;
            this.hExpThanThu = 10;
            this.xExpThanThu = GameCanvas.hw - this.wExpThanThu / 2;
            this.yExpThanThu = this.yRecThanThu + this.hRecThanThu - this.hExpThanThu;
            this.wSelectThanThu = 18;
            this.xSelectThanThu = GameCanvas.hw - (this.clan_thanthu.size() - 1) * ((this.wSelectThanThu + 5) / 2);
            this.ySelectThanThu = this.yThanThu + this.hThanThu - this.wSelectThanThu / 2 - 5;
            Clan_ThanThu var2;
            if (this.clan_thanthu.size() > 0 && this.indexThanThu <= this.clan_thanthu.size()) {
                var2 = (Clan_ThanThu) this.clan_thanthu.elementAt(this.indexThanThu);
            } else {
                var2 = null;
            }

            if (var2 == null) {
                var1.setColor(13606712);
                var1.drawRect(this.xRecThanThu - 1, this.yRecThanThu - 1, this.wRecThanThu + 1, this.hRecThanThu + 1);
                var1.setClip(this.xRecThanThu, this.yRecThanThu, this.wRecThanThu, this.hRecThanThu);
                var1.setColor(6425);
                var1.fillRect(this.xRecThanThu, this.yRecThanThu, this.wRecThanThu, this.hRecThanThu);
            } else {
                mFont.tahoma_7b_white.drawString(var1, var2.name, GameCanvas.hw, this.yThanThu + 35, 2);
                var1.setColor(13606712);
                var1.drawRect(this.xRecThanThu - 1, this.yRecThanThu - 1, this.wRecThanThu + 1, this.hRecThanThu + 1);
                var1.setClip(this.xRecThanThu, this.yRecThanThu, this.wRecThanThu, this.hRecThanThu);
                var1.setColor(6425);
                var1.fillRect(this.xRecThanThu, this.yRecThanThu, this.wRecThanThu, this.hRecThanThu);
                SmallImage.drawSmallImage(var1, var2.idThanThu, this.xRecThanThu + this.wRecThanThu / 2, this.yRecThanThu + this.hRecThanThu / 2 - 10, 0, 3);
                resetTranslate(var1);
                int var3;
                if (var2.time_aptrung >= 0) {
                    this.strTime = Res.getTimeCountDown(var2.timeStartThanThu, var2.time_aptrung);
                    if (!this.strTime.equals("")) {
                        mFont.tahoma_7_yellow.drawString(var1, var2.str_trungno + " " + this.strTime, this.xRecThanThu, this.yExpThanThu + 15, 0);
                    } else {
                        --this.countSendRequests;
                        if (this.countSendRequests <= 0) {
                            Service.gI().requestClanItem();
                            this.countSendRequests = 100;
                        }
                    }
                } else {
                    for (var3 = 0; var3 < var2.stars; ++var3) {
                        SmallImage.drawSmallImage(var1, 628, this.xThanThu + 95 + var3 * 12 - var2.stars * 6, this.yThanThu + 50, 0, 3);
                    }

                    var3 = var2.curExp * this.wExpThanThu / var2.maxExp;
                    var1.setColor(2506246);
                    var1.fillRect(this.xExpThanThu, this.yExpThanThu, this.wExpThanThu, this.hExpThanThu);
                    var1.setColor(371981);
                    var1.fillRect(this.xExpThanThu, this.yExpThanThu, var3, this.hExpThanThu);
                    var1.setColor(13606712);
                    var1.drawRect(this.xExpThanThu, this.yExpThanThu, this.wExpThanThu, this.hExpThanThu);
                    mFont.tahoma_7_white.drawString(var1, var2.curExp + "/" + var2.maxExp, this.xExpThanThu + this.wExpThanThu / 2, this.yExpThanThu, 2);

                    for (int var4 = 0; var4 < var2.vecInfo.size(); ++var4) {
                        String var6 = (String) var2.vecInfo.elementAt(var4);
                        mFont.tahoma_7_yellow.drawString(var1, var6, this.xRecThanThu + this.wRecThanThu / 2, this.yExpThanThu + 15 + var4 * 10, 2);
                    }
                }

                for (var3 = 0; var3 < this.clan_thanthu.size(); ++var3) {
                    Clan_ThanThu var7;
                    if (this.clan_thanthu.size() > 0 && var3 <= this.clan_thanthu.size()) {
                        var7 = (Clan_ThanThu) this.clan_thanthu.elementAt(var3);
                    } else {
                        var7 = null;
                    }

                    if (var7 != null) {
                        var1.setColor(0);
                        var1.fillRect(this.xSelectThanThu + var3 * (this.wSelectThanThu + 5) - this.wSelectThanThu / 2, this.ySelectThanThu - this.wSelectThanThu / 2, this.wSelectThanThu, this.wSelectThanThu);
                        SmallImage.drawSmallImage(var1, 154, this.xSelectThanThu + var3 * (this.wSelectThanThu + 5), this.ySelectThanThu, 0, 3);
                        var1.setColor(12281361);
                        var1.drawRect(this.xSelectThanThu + var3 * (this.wSelectThanThu + 5) - this.wSelectThanThu / 2, this.ySelectThanThu - this.wSelectThanThu / 2, this.wSelectThanThu, this.wSelectThanThu);
                        SmallImage.drawSmallImage(var1, var7.idIconItem, this.xSelectThanThu + var3 * (this.wSelectThanThu + 5), this.ySelectThanThu, 0, 3);
                    }
                }

                var1.setColor(16777215);
                var1.drawRect(this.xSelectThanThu + this.indexThanThu * (this.wSelectThanThu + 5) - this.wSelectThanThu / 2, this.ySelectThanThu - this.wSelectThanThu / 2, this.wSelectThanThu, this.wSelectThanThu);
            }
        } catch (Exception var5) {
            System.out.println("e:" + var5.toString());
        }
    }

    public final void addInfo_ThanThu(Clan_ThanThu var1) {
        this.clan_thanthu.addElement(var1);
    }

    public final void clearVecThanThu() {
        this.clan_thanthu.removeAllElements();
    }

    private void actSplitItemBag_luyenngoc() {
        try {
            if (isPaintLuyenNgoc && Char.getMyChar().arrItemBag[indexSelect].isTypeNgocKham()) {
                if (itemSplit == null) {
                    if (Char.getMyChar().arrItemBag[indexSelect].upgrade < 10) {
                        itemSplit = Char.getMyChar().arrItemBag[indexSelect];
                        Char.getMyChar().arrItemBag[indexSelect] = null;
                        return;
                    }

                    GameCanvas.msgdlg.setInfo(mResources.CAN_NOT_LUYENNGOC, (Command) null, new Command(mResources.CLOSE, 2), (Command) null);
                    GameCanvas.currentDialog = GameCanvas.msgdlg;
                    return;
                }

                if (arrItemSplit == null) {
                    arrItemSplit = new Item[24];
                }

                for (int var1 = 0; var1 < arrItemSplit.length; ++var1) {
                    if (arrItemSplit[var1] == null) {
                        arrItemSplit[var1] = Char.getMyChar().arrItemBag[indexSelect];
                        Char.getMyChar().arrItemBag[indexSelect] = null;
                        super.left = super.center = null;
                        this.updateCommandForUI();
                        return;
                    }

                    if (var1 == arrItemSplit.length - 1) {
                        GameCanvas.startOKDlg(mResources.CRYSTAL_FULL);
                    }
                }

                return;
            }
        } catch (Exception var2) {
            GameCanvas.msgdlg.setInfo(mResources.CAN_NOT_LUYENNGOC, (Command) null, new Command(mResources.CLOSE, 2), (Command) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
            var2.printStackTrace();
        }

    }

    private void act_update_khamngoc() {
        Item var3;
        if (Char.getMyChar().arrItemBag[indexSelect].isTypeNgocKham()) {
            if (itemSplit == null) {
                itemSplit = Char.getMyChar().arrItemBag[indexSelect];
                Char.getMyChar().arrItemBag[indexSelect] = null;
            } else {
                var3 = Char.getMyChar().arrItemBag[indexSelect];
                Char.getMyChar().arrItemBag[indexSelect] = null;
                Char.getMyChar().arrItemBag[itemSplit.indexUI] = itemSplit;
                itemSplit = var3;
            }

            super.left = super.center = null;
            this.updateCommandForUI();
        } else if (Char.getMyChar().arrItemBag[indexSelect].isTypeBody()) {
            if (itemUpGrade == null) {
                itemUpGrade = Char.getMyChar().arrItemBag[indexSelect];
                Char.getMyChar().arrItemBag[indexSelect] = null;
            } else {
                var3 = Char.getMyChar().arrItemBag[indexSelect];
                Char.getMyChar().arrItemBag[indexSelect] = null;
                Char.getMyChar().arrItemBag[itemUpGrade.indexUI] = itemUpGrade;
                itemUpGrade = var3;
            }

            super.left = super.center = null;
            this.updateCommandForUI();
        } else if (Char.getMyChar().arrItemBag[indexSelect].template.type != 26 && Char.getMyChar().arrItemBag[indexSelect].template.type != 28) {
            GameCanvas.msgdlg.setInfo(mResources.ONLY_UPGRADE, (Command) null, new Command(mResources.CLOSE, 2), (Command) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        } else {
            int var1;
            if (Char.getMyChar().arrItemBag[indexSelect].template.type == 28) {
                for (var1 = 0; var1 < arrItemUpGrade.length; ++var1) {
                    if (arrItemUpGrade[var1] != null && arrItemUpGrade[var1].template.type == 28) {
                        Item var2 = Char.getMyChar().arrItemBag[indexSelect];
                        Char.getMyChar().arrItemBag[indexSelect] = null;
                        int var10001 = arrItemUpGrade[var1].indexUI;
                        Char.getMyChar().arrItemBag[var10001] = arrItemUpGrade[var1];
                        arrItemUpGrade[var1] = var2;
                        return;
                    }
                }
            }

            for (var1 = 0; var1 < arrItemUpGrade.length; ++var1) {
                if (arrItemUpGrade[var1] == null) {
                    arrItemUpGrade[var1] = Char.getMyChar().arrItemBag[indexSelect];
                    Char.getMyChar().arrItemBag[indexSelect] = null;
                    super.left = super.center = null;
                    this.updateCommandForUI();
                    return;
                }
            }

            GameCanvas.msgdlg.setInfo(mResources.CRYSTAL_FULL, (Command) null, new Command(mResources.CLOSE, 2), (Command) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        }
    }

    private void setCMD_act_KhamNgoc(int var1) {
        MyVector var2 = new MyVector();
        if (var1 == 0) {
            var2.addElement(this.cmdKhamNgocMoveOut_Ngoc);
        } else if (var1 == 1) {
            var2.addElement(this.cmdKhamNgocMoveOut_Item);
        } else if (var1 == 2) {
            var2.addElement(this.cmdKhamNgocMoveOut_Stone);
        }

        if (itemUpGrade != null && itemSplit != null) {
            for (int var3 = 0; var3 < arrItemUpGrade.length; ++var3) {
                if (arrItemUpGrade[var3] != null) {
                    var2.addElement(new Command(mResources.BEGIN, 341));
                    break;
                }
            }
        }

        GameCanvas.menu.startAt(var2);
    }

    private void actKhamNgocMoveOut(int var1) {
        Item var2 = itemSplit;
        if (var1 == 1) {
            var2 = itemUpGrade;
            itemUpGrade = null;
        } else if (var1 == 2) {
            var2 = getItemFocus(47);
            arrItemUpGrade[indexSelect] = null;
        } else {
            itemSplit = null;
        }

        Char.getMyChar().arrItemBag[var2.indexUI] = var2;
        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private void khamngoc() {
        int var3 = 0;

        for (int var1 = 0; var1 < arrItemUpGrade.length; ++var1) {
            if (arrItemUpGrade[var1] != null && arrItemUpGrade[var1].template.type == 26) {
                var3 += crystals[arrItemUpGrade[var1].template.id];
            }
        }

        boolean var4 = false;
        int var2 = 0;
        if (itemSplit != null) {
            if (coinUpWeapons[itemSplit.upgrade] > Char.getMyChar().xu + Char.getMyChar().yen) {
                var4 = true;
            }

            var2 = var3 * 100 / upWeapon[itemSplit.upgrade];
        }

        if (var4) {
            InfoMe.addInfo(mResources.NOT_ENOUGH_COIN_UPGRADE, 15, mFont.tahoma_7_red);
        } else if (var2 > 250) {
            GameCanvas.startYesNoDlg(mResources.PERCENT_BIG, new Command(mResources.YES, 342), new Command(mResources.NO, 1));
        } else {
            if (itemSplit != null && itemUpGrade != null && arrItemUpGrade.length > 0) {
                if (!itemUpGrade.isLock) {
                    GameCanvas.startYesNoDlg(mResources.CONFIRMUPGRADE, new Command(mResources.YES, 342), new Command(mResources.NO, 1));
                    return;
                }

                Service.gI().ngockham((byte) 0, itemUpGrade, itemSplit, arrItemUpGrade);
            }

        }
    }

    private static void actConfirmKhamNgoc() {
        GameCanvas.endDlg();
        if (itemSplit != null && itemUpGrade != null && arrItemUpGrade.length > 0) {
            Service.gI().ngockham((byte) 0, itemUpGrade, itemSplit, arrItemUpGrade);
        }

    }

    private void paintLuyenNgoc(mGraphics var1) {
        if (isPaintLuyenNgoc) {
            if (indexMenu == 0) {
                String[] var2 = mResources.TITLELUYENNGOC;
                var1 = var1;
                GameScr var14 = this;

                try {
                    Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
                    paintTitle(var1, var2[indexMenu], var2.length > 1);
                    xstart = popupX + 3;
                    ystart = popupY + 34 + indexSize;
                    int var15 = popupX + 74;
                    int var3 = ystart - indexSize - 3;
                    rows = 4;
                    int var6;
                    int var7;
                    if (itemSplit != null) {
                        var14.paintItem(var1, itemSplit, var15, var3);
                        int var10002 = var15 + 35;
                        var7 = var3 + 25;
                        var6 = var10002;
                        GameScr var4 = var14;
                        int var8 = var14.arrNgocKhamEXP[itemSplit.upgrade][0];
                        int var9 = 0;
                        ItemOption var10 = null;
                        int var11;
                        if (itemSplit.options != null) {
                            for (var11 = 0; var11 < itemSplit.options.size(); ++var11) {
                                if ((var10 = (ItemOption) itemSplit.options.elementAt(var11)).optionTemplate.id == 104) {
                                    var9 = var10.param;
                                }
                            }
                        }

                        var11 = 0;

                        int var18;
                        for (var18 = 0; var18 < arrItemSplit.length; ++var18) {
                            Item var12;
                            if ((var12 = arrItemSplit[var18]) != null) {
                                var11 += var4.arrNgocKhamEXP[var12.upgrade][1];
                            }
                        }

                        boolean var19 = false;
                        var1.setColor(0);
                        var1.fillRect(var6, var7 - 5, 60, 5);
                        if ((var18 = var9 * 60 / var8) <= 0) {
                            var18 = 0;
                        } else if (var18 > 60) {
                            var18 = 60;
                        }

                        var1.setColor(-16711936);
                        var1.fillRect(var6, var7 - 5, var18, 5);
                        int var20;
                        if ((var20 = var11 * 60 / var8) >= 60 - var18) {
                            var20 = 60 - var18;
                        }

                        var1.setColor(-16346586);
                        var1.fillRect(var6 + var18, var7 - 5, var20, 5);
                        mFont.tahoma_7_yellow.drawString(var1, var11 + var9 + "/" + var8, var6 + 30, var7 - 5 - 15, 2);
                    } else {
                        var1.setColor(6425);
                        var1.fillRect(var15 - 1, var3 - 1, indexSize + 3, indexSize + 3);
                        SmallImage.drawSmallImage(var1, 154, var15 + indexSize / 2, var3 + indexSize / 2, 0, 3);
                    }

                    var1.setColor(12281361);
                    var1.drawRect(var15, var3, indexSize, indexSize);
                    var1.setColor(6425);
                    var1.fillRect(xstart - 1, ystart - 1, indexSize * columns + 3, indexSize * rows + 3);
                    int var16 = 0;

                    while (true) {
                        int var5;
                        if (var16 >= rows) {
                            for (var16 = 0; var16 < arrItemSplit.length; ++var16) {
                                Item var17;
                                if ((var17 = arrItemSplit[var16]) != null) {
                                    var6 = var16 / columns;
                                    var7 = var16 - var6 * columns;
                                    if (!var17.isLock) {
                                        var1.setColor(12083);
                                        var1.fillRect(xstart + var7 * indexSize + 1, ystart + var6 * indexSize + 1, indexSize - 1, indexSize - 1);
                                    }

                                    var14.paintItem(var1, var17, xstart + var7 * indexSize, ystart + var6 * indexSize);
                                    if (var17.quantity > 1) {
                                        mFont.number_yellow.drawString(var1, String.valueOf(var17.quantity), xstart + var7 * indexSize + indexSize, ystart + var6 * indexSize + indexSize - mFont.number_yellow.getHeight(), 1);
                                    }
                                }
                            }

                            if (indexTitle == 1) {
                                var1.setColor(16777215);
                                var1.drawRect(var15, var3, indexSize, indexSize);
                                return;
                            }

                            if (indexTitle == 2) {
                                var16 = indexSelect / columns;
                                var5 = indexSelect - var16 * columns;
                                var1.setColor(16777215);
                                var1.drawRect(xstart + var5 * indexSize, ystart + var16 * indexSize, indexSize, indexSize);
                                return;
                            }
                            break;
                        }

                        for (var5 = 0; var5 < columns; ++var5) {
                            SmallImage.drawSmallImage(var1, 154, xstart + var5 * indexSize + indexSize / 2, ystart + var16 * indexSize + indexSize / 2, 0, 3);
                            var1.setColor(12281361);
                            var1.drawRect(xstart + var5 * indexSize, ystart + var16 * indexSize, indexSize, indexSize);
                        }

                        ++var16;
                    }
                } catch (Exception var13) {
                    var13.printStackTrace();
                }

                return;
            } else if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLELUYENNGOC);
            }
        }

    }

    private void paintCheDo(mGraphics var1) {
        if (isPaintCheDo) {
            if (indexMenu == 0) {
                String[] var2 = mResources.TITLECHEDO;
                var1 = var1;
                GameScr var9 = this;

                try {
                    Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
                    paintTitle(var1, var2[indexMenu], var2.length > 1);
                    xstart = popupX + 3;
                    ystart = popupY + 34 + indexSize;
                    int var10 = popupX + 74;
                    int var3 = ystart - indexSize - 3;
                    rows = 4;

                    int var4;
                    for (var4 = 0; var4 < var9.nsoTP.length; ++var4) {
                        var1.setColor(6425);
                        var1.fillRect(var9.nsoTP[var4] - 1, var9.nsoTQ[var4] - 1, indexSize + 3, indexSize + 3);
                        var1.setColor(12281361);
                        var1.drawRect(var9.nsoTP[var4], var9.nsoTQ[var4], indexSize, indexSize);
                        SmallImage.drawSmallImage(var1, 154, var9.nsoTP[var4] + indexSize / 2, var9.nsoTQ[var4] + indexSize / 2, 0, 3);
                    }

                    for (var4 = 0; var4 < arrItemSplit.length; ++var4) {
                        Item var5;
                        if ((var5 = arrItemSplit[var4]) != null) {
                            int var6 = var4 / columns;
                            int var7 = var4 - var6 * columns;
                            if (!var5.isLock) {
                                var1.setColor(12083);
                                var1.fillRect(xstart + var7 * indexSize + 1, ystart + var6 * indexSize + 1, indexSize - 1, indexSize - 1);
                            }

                            var9.paintItem(var1, var5, xstart + var7 * indexSize, ystart + var6 * indexSize);
                            if (var5.quantity > 1) {
                                mFont.number_yellow.drawString(var1, String.valueOf(var5.quantity), xstart + var7 * indexSize + indexSize, ystart + var6 * indexSize + indexSize - mFont.number_yellow.getHeight(), 1);
                            }
                        }
                    }

                    if (indexMenu == 0 && var9.nsoTR >= 0) {
                        var1.setColor(16777215);
                        var1.drawRect(var9.nsoTP[var9.nsoTR], var9.nsoTQ[var9.nsoTR], indexSize, indexSize);
                    }

                    if (indexTitle != 1) {
                        return;
                    }

                    var1.setColor(16777215);
                    var1.drawRect(var10, var3, indexSize, indexSize);
                } catch (Exception var8) {
                    var8.printStackTrace();
                    return;
                }
            } else if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLECHEDO);
            }
        }

    }

    private void paintKhamNgoc(mGraphics var1) {
        if (isPaintKhamNgoc) {
            if (indexMenu == 0) {
                String[] var2 = mResources.TITLEKHAMNGOC;
                var1 = var1;
                GameScr var9 = this;

                try {
                    rows = 3;
                    Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
                    paintTitle(var1, var2[indexMenu], var2.length > 1);
                    xstart = popupX + 3;
                    ystart = popupY + 34 + indexSize;
                    int var11 = popupX + 45;
                    int var3 = popupX + 100;
                    int var4 = ystart - indexSize - 3;
                    if (itemSplit != null) {
                        var9.paintItem(var1, itemSplit, var11, var4);
                    } else {
                        var1.setColor(6425);
                        var1.fillRect(var11 - 1, var4 - 1, indexSize + 3, indexSize + 3);
                        SmallImage.drawSmallImage(var1, 154, var11 + indexSize / 2, var4 + indexSize / 2, 0, 3);
                    }

                    var1.setColor(12281361);
                    var1.drawRect(var11, var4, indexSize, indexSize);
                    if (itemUpGrade != null) {
                        var9.paintItem(var1, itemUpGrade, var3, var4);
                    } else {
                        var1.setColor(6425);
                        var1.fillRect(var3 - 1, var4 - 1, indexSize + 3, indexSize + 3);
                        SmallImage.drawSmallImage(var1, 154, var3 + indexSize / 2, var4 + indexSize / 2, 0, 3);
                    }

                    var1.setColor(12281361);
                    var1.drawRect(var11, var4, indexSize, indexSize);
                    var1.drawRect(var3, var4, indexSize, indexSize);
                    mFont.tahoma_7b_yellow.drawString(var1, "+", var11 + indexSize + 15, var4 + indexSize / 2 - 5, 2);
                    if (indexTitle == 1) {
                        if (indexSelect == 0) {
                            var1.setColor(16777215);
                            var1.drawRect(var11, var4, indexSize, indexSize);
                        }

                        if (indexSelect == 1) {
                            var1.setColor(16777215);
                            var1.drawRect(var3, var4, indexSize, indexSize);
                        }
                    }

                    int var10;
                    for (var10 = 0; var10 < rows; ++var10) {
                        for (var11 = 0; var11 < columns; ++var11) {
                            var1.setColor(6425);
                            var1.fillRect(xstart + var11 * indexSize, ystart + var10 * indexSize, indexSize + 3, indexSize + 3);
                            SmallImage.drawSmallImage(var1, 154, xstart + var11 * indexSize + indexSize / 2, ystart + var10 * indexSize + indexSize / 2, 0, 3);
                            var1.setColor(12281361);
                            var1.drawRect(xstart + var11 * indexSize, ystart + var10 * indexSize, indexSize, indexSize);
                        }
                    }

                    if (indexTitle == 2) {
                        var10 = indexSelect / columns;
                        var11 = indexSelect - var10 * columns;
                        var1.setColor(16777215);
                        var1.drawRect(xstart + var11 * indexSize, ystart + var10 * indexSize, indexSize, indexSize);
                    }

                    int var6;
                    for (var10 = 0; var10 < arrItemUpGrade.length; ++var10) {
                        Item var12;
                        if ((var12 = arrItemUpGrade[var10]) != null) {
                            int var5 = var10 / columns;
                            var6 = var10 - var5 * columns;
                            if (!var12.isLock) {
                                var1.setColor(12083);
                                var1.fillRect(xstart + var6 * indexSize + 1, ystart + var5 * indexSize + 1, indexSize - 1, indexSize - 1);
                            }

                            SmallImage.drawSmallImage(var1, var12.template.iconID, xstart + var6 * indexSize + indexSize / 2, ystart + var5 * indexSize + indexSize / 2, 0, 3);
                        }
                    }

                    if (itemUpGrade != null && itemSplit != null) {
                        var10 = 0;

                        for (var11 = 0; var11 < arrItemUpGrade.length; ++var11) {
                            if (arrItemUpGrade[var11] != null && arrItemUpGrade[var11].template.type == 26) {
                                var10 += crystals[arrItemUpGrade[var11].template.id];
                            }
                        }

                        if ((var11 = var10 * 100 / upWeapon[itemSplit.upgrade]) > maxPercents[itemSplit.upgrade]) {
                            var11 = maxPercents[itemSplit.upgrade];
                        }

                        if (isPaintUpGradeGold) {
                            var11 = (int) ((double) var11 * 1.5D);
                        }

                        mFont var14 = mFont.tahoma_7_yellow;
                        var6 = 0;
                        var9 = null;
                        if (itemSplit.options != null) {
                            for (int var7 = 0; var7 < itemSplit.options.size(); ++var7) {
                                ItemOption var13;
                                if ((var13 = (ItemOption) itemSplit.options.elementAt(var7)).optionTemplate.id == 123) {
                                    var6 = var13.param;
                                }
                            }
                        } else {
                            Service.gI().requestItemInfo(itemSplit.typeUI, itemSplit.indexUI);
                        }

                        if (var6 > Char.getMyChar().xu + Char.getMyChar().yen) {
                            var14 = mFont.tahoma_7_red;
                        }

                        var14.drawString(var1, mResources.replace(mResources.COINLOCKNEED, NinjaUtil.numberToString(String.valueOf(var6))), xstart, ystart + rows * indexSize + 5, 0);
                        mFont.tahoma_7_yellow.drawString(var1, mResources.PERCENT + ": " + var11 + "%", xstart, ystart + rows * indexSize + 17, 0);
                    } else {
                        for (var10 = 0; var10 < mResources.HELPKHAMNGOC.length; ++var10) {
                            mFont.tahoma_7_white.drawString(var1, mResources.HELPKHAMNGOC[var10], xstart, ystart + rows * indexSize + 5 + var10 * 12, 0);
                        }
                    }

                    if (effUpok == null) {
                        return;
                    }

                    SmallImage.drawSmallImage(var1, effUpok.arrEfInfo[indexEff].idImg, var3 + indexSize / 2 + effUpok.arrEfInfo[indexEff].dx + 1, var4 + indexSize / 2 + 9 + effUpok.arrEfInfo[indexEff].dy, 0, 3);
                    if (GameCanvas.gameTick % 2 != 0 || ++indexEff < effUpok.arrEfInfo.length) {
                        return;
                    }

                    indexEff = 0;
                    effUpok = null;
                } catch (Exception var8) {
                    var8.printStackTrace();
                    return;
                }
            } else if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLEKHAMNGOC);
            }
        }

    }

    private void paintGotNgoc(mGraphics var1) {
        if (isPaintGotNgoc) {
            if (indexMenu == 0) {
                this.paintGotNgoc(var1, mResources.TITLEGOTNGOC, (byte) 0);
                return;
            }

            if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLEGOTNGOC);
            }
        }

    }

    private void paintThaoNgoc(mGraphics var1) {
        if (isPaintThaoNgoc) {
            if (indexMenu == 0) {
                this.paintGotNgoc(var1, mResources.TITLETHAONGOC, (byte) 1);
                return;
            }

            if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLETHAONGOC);
            }
        }

    }

    private void paintGotNgoc(mGraphics var1, String[] var2, byte var3) {
        try {
            rows = 5;
            Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
            this.paintItemFrame(var1, var2, false);
            var1.setColor(6693376);
            var1.fillRect(popupX + 3, popupY + 32, 168, 140);
            var1.setColor(13408563);
            var1.drawRect(popupX + 3, popupY + 32, 168, 140);
            int var11 = popupX + 74;
            int var4 = popupY + 40 + indexSize;
            if (itemSplit != null) {
                var1.setColor(6425);
                var1.fillRect(var11 - 1, var4 - 1, indexSize + 3, indexSize + 3);
                SmallImage.drawSmallImage(var1, 154, var11 + indexSize / 2, var4 + indexSize / 2, 0, 3);
                this.paintItem(var1, itemSplit, var11, var4);
                if (itemSplit.quantity > 1) {
                    mFont.number_yellow.drawString(var1, "" + itemSplit.quantity, var11 + indexSize, var4 + indexSize / 2 + 6, 1);
                }

                var1.setColor(indexTitle == 1 ? 16777215 : 12281361);
                var1.drawRect(var11, var4, indexSize, indexSize);
            } else {
                var1.setColor(6425);
                var1.fillRect(var11 - 1, var4 - 1, indexSize + 3, indexSize + 3);
                SmallImage.drawSmallImage(var1, 154, var11 + indexSize / 2, var4 + indexSize / 2, 0, 3);
                var1.setColor(12281361);
                var1.drawRect(var11, var4, indexSize, indexSize);
            }

            if (itemSplit != null) {
                int var8 = 0;
                ItemOption var5 = null;
                if (itemSplit.options != null) {
                    for (int var6 = 0; var6 < itemSplit.options.size(); ++var6) {
                        if ((var5 = (ItemOption) itemSplit.options.elementAt(var6)).optionTemplate.id == 122) {
                            var8 = var5.param;
                        }
                    }
                } else {
                    Service.gI().requestItemInfo(itemSplit.typeUI, itemSplit.indexUI);
                }

                String var14 = mResources.MONEY_SELL2;
                String var9 = var8 + mResources.YEN;
                String var13 = mResources.HELP_THAONGOC;
                if (var3 == 0) {
                    var14 = mResources.MONEY_SELL;
                    var9 = coinGotngoc[itemSplit.upgrade] + mResources.XU;
                    var13 = mResources.HELP_GOTNGOC;
                }

                mFont.tahoma_7_white.drawString(var1, var14, var11 + indexSize / 2, var4 + 3 * indexSize / 2 + 2, 2);
                mFont.tahoma_7_yellow.drawString(var1, var9, var11 + indexSize / 2, var4 + 3 * indexSize / 2 + 14, 2);
                String[] var10 = mFont.tahoma_7_white.splitFontArray(var13, 130);

                for (int var12 = 0; var12 < var10.length; ++var12) {
                    mFont.tahoma_7_white.drawString(var1, var10[var12], var11 + indexSize / 2, popupY + popupH - 25 + var12 * 12 - 2, 2);
                }

                return;
            }
        } catch (Exception var7) {
            var7.printStackTrace();
        }

    }

    private static void actSplitItemBag_gotngoc() {
        try {
            if (isPaintGotNgoc) {
                if (Char.getMyChar().arrItemBag[indexSelect].isTypeNgocKham()) {
                    itemSplit = Char.getMyChar().arrItemBag[indexSelect];
                    Char.getMyChar().arrItemBag[indexSelect] = null;
                    return;
                }
            } else if (isPaintThaoNgoc && Char.getMyChar().arrItemBag[indexSelect].isTypeBody()) {
                itemSplit = Char.getMyChar().arrItemBag[indexSelect];
                Char.getMyChar().arrItemBag[indexSelect] = null;
                return;
            }
        } catch (Exception var1) {
            GameCanvas.msgdlg.setInfo(mResources.CAN_NOT_GOTNGOC, (Command) null, new Command(mResources.CLOSE, 2), (Command) null);
            GameCanvas.currentDialog = GameCanvas.msgdlg;
        }

    }

    private void paintGiaoDo(mGraphics var1) {
        if (isPaintGiaoDo) {
            if (indexMenu == 0) {
                Item[] var3 = arrItemSplit;
                String[] var2 = mResources.TITLEGIAODO;
                var1 = var1;
                GameScr var7 = this;

                try {
                    resetTranslate(var1);
                    var7.paintItemFrame(var1, var2, true);
                    if (var3 == null) {
                        GameCanvas.paintShukiren(popupX + 90, popupY + 75, var1, false);
                        mFont.tahoma_7b_white.drawString(var1, mResources.PLEASEWAIT, popupX + 90, popupY + 90, 2);
                        return;
                    }

                    if (var3.length <= 30) {
                        rows = 5;
                    } else if (var3.length % columns == 0) {
                        rows = var3.length / columns;
                    } else {
                        rows = var3.length / columns + 1;
                    }

                    scrMain.setStyle(rows, indexSize, xstart, ystart, columns * indexSize, 5 * indexSize, true, 6);
                    scrMain.setClip(var1, xstart, ystart, scrMain.width + 2, scrMain.height + 2);

                    int var8;
                    int var9;
                    for (var8 = 0; var8 < rows; ++var8) {
                        for (var9 = 0; var9 < columns; ++var9) {
                            SmallImage.drawSmallImage(var1, 154, xstart + var9 * indexSize + indexSize / 2, ystart + var8 * indexSize + indexSize / 2, 0, 3);
                            var1.setColor(12281361);
                            var1.drawRect(xstart + var9 * indexSize, ystart + var8 * indexSize, indexSize, indexSize);
                        }
                    }

                    for (var8 = 0; var8 < var3.length; ++var8) {
                        Item var10;
                        if ((var10 = var3[var8]) != null) {
                            int var4 = var8 / columns;
                            int var5 = var8 - var4 * columns;
                            if (!var10.isLock) {
                                var1.setColor(12083);
                                var1.fillRect(xstart + var5 * indexSize + 1, ystart + var4 * indexSize + 1, indexSize - 1, indexSize - 1);
                                SmallImage.drawSmallImage(var1, 154, xstart + var5 * indexSize + indexSize / 2, ystart + var4 * indexSize + indexSize / 2, 0, 3);
                            }

                            SmallImage.drawSmallImage(var1, var10.template.iconID, xstart + var5 * indexSize + indexSize / 2, ystart + var4 * indexSize + indexSize / 2, 0, 3);
                        }
                    }

                    if (indexTitle > 0 && indexSelect >= 0) {
                        var8 = indexSelect / columns;
                        var9 = indexSelect - var8 * columns;
                        var1.setColor(16777215);
                        var1.drawRect(xstart + var9 * indexSize, ystart + var8 * indexSize, indexSize, indexSize);
                        paintSelectHighlight(xstart + var9 * indexSize, ystart + var8 * indexSize, var1);
                        return;
                    }
                } catch (Exception var6) {
                }

                return;
            } else if (indexMenu == 1) {
                this.paintBag(var1, mResources.TITLEGIAODO);
            }
        }

    }

    private void act_update_giaodo() {
        for (int var1 = 0; var1 < arrItemSplit.length; ++var1) {
            if (arrItemSplit[var1] == null) {
                arrItemSplit[var1] = Char.getMyChar().arrItemBag[indexSelect];
                Char.getMyChar().arrItemBag[indexSelect] = null;
                super.left = super.center = null;
                this.updateCommandForUI();
                return;
            }
        }

    }

    private void setCMD_act_GiaoDo() {
        MyVector var1 = new MyVector();

        for (int var2 = 0; var2 < arrItemSplit.length; ++var2) {
            if (arrItemSplit[var2] != null) {
                var1.addElement(this.cmdGiaoDoMoveOut);
                break;
            }
        }

        if (arrItemSplit.length > 0) {
            var1.addElement(new Command(mResources.TITLEGIAODO[0], 403));
        }

        GameCanvas.menu.startAt(var1);
    }

    private void actGiaoDoMoveOut() {
        Item var1 = getItemFocus(48);
        arrItemSplit[indexSelect] = null;
        Char.getMyChar().arrItemBag[var1.indexUI] = var1;
        super.left = super.center = null;
        this.updateCommandForUI();
    }

    private static void sendGiaoDo() {
        Service.gI().giaodo(arrItemSplit);
    }

    private void paintBijuu(mGraphics var1) {
        if (indexMenu == 6) {
            var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
            Paint.paintFrame(popupX, popupY, popupW, popupH, var1);
            var1.setColor(Paint.COLORBACKGROUND);
            paintTitle(var1, mResources.MENUME[indexMenu], true);
            resetTranslate(var1);
            var1.setColor(0);
            var1.fillRect(popupX + 2, popupY + 31, 171, popupH - 34);
            var1.setColor(13606712);
            var1.drawRect(popupX + 3, popupY + 32, 168, popupH - 37);
            var1.setColor(Paint.COLORBACKGROUND);
            var1.fillRect(popupX + 4, popupY + 34, 166, popupH - 39);
            int var2;
            int var3;
            if (currentCharViewInfo.arrItemViThu[4] != null) {
                mFont.tahoma_7b_white.drawString(var1, currentCharViewInfo.arrItemViThu[4].template.name, popupX + 90, ystart + 2, 2);
                var2 = currentCharViewInfo.arrItemViThu[4].sys + 1;

                for (var3 = 0; var3 < var2; ++var3) {
                    SmallImage.drawSmallImage(var1, 628, popupX + 90 + var3 * 12 - var2 * 6, ystart + 20, 0, 3);
                }
            }

            for (var2 = 0; var2 < currentCharViewInfo.arrItemViThu.length - 1; ++var2) {
                if (currentCharViewInfo.arrItemViThu[var2] != null) {

                    this.paintItem(var1, currentCharViewInfo.arrItemViThu[var2], this.xMounts[var2], this.yMounts[var2]);
                    if (var2 == 1 || var2 == 3) {
                        GameScr.showTinhLuyen(var1, GameScr.currentCharViewInfo.arrItemViThu[var2], this.xMounts[var2] + 15, this.yMounts[var2] + 28, false);
                    } else if (var2 == 0 || var2 == 2) {
                        GameScr.showTinhLuyen(var1, GameScr.currentCharViewInfo.arrItemViThu[var2], this.xMounts[var2] + 15, this.yMounts[var2] - 11, false);
                    }
                } else {
                    var1.setColor(6425);
                    var1.fillRect(this.xMounts[var2] - 1, this.yMounts[var2] - 1, indexSize + 3, indexSize + 3);
                    mFont.tahoma_7_grey.drawString(var1, mResources.ITEMNAME[var2 + 24][0], this.xMounts[var2] + indexSize / 2, this.yMounts[var2] + indexSize / 2 - 10, 2);
                    mFont.tahoma_7_grey.drawString(var1, mResources.ITEMNAME[var2 + 24][1], this.xMounts[var2] + indexSize / 2, this.yMounts[var2] + indexSize / 2 + 2, 2);
                }

                if (indexSelect == var2 && indexTitle == 1 && indexSelect < 4) {
                    var1.setColor(16777215);
                } else {
                    var1.setColor(12281361);
                }

                var1.drawRect(this.xMounts[var2], this.yMounts[var2], indexSize, indexSize);
            }

            var2 = this.xMounts[0] + indexSize + 7;
            var3 = this.yMounts[0] - 5;
            var1.setColor(6425);
            var1.fillRect(var2, var3, 84, 75);
            if (indexSelect == 4) {
                var1.setColor(16777215);
            } else {
                var1.setColor(12281361);
            }

            var1.drawRect(var2, var3, 84, 75);
            if (currentCharViewInfo.mobVithu != null) {
                currentCharViewInfo.mobVithu.paintBottomEff(var1, var2 + 35, var3 + 55);
                currentCharViewInfo.mobVithu.paintTopMobNew(var1, var2 + 35, var3 + 55);
            }

            int var6 = 0;
            var2 = 0;
            var3 = 0;
            int var4;
            if (currentCharViewInfo.arrItemViThu[4] != null) {
                if (currentCharViewInfo.arrItemViThu[4].options != null) {
                    for (var4 = 0; var4 < currentCharViewInfo.arrItemViThu[4].options.size(); ++var4) {
                        ItemOption var5;
                        if ((var5 = (ItemOption) currentCharViewInfo.arrItemViThu[4].options.elementAt(var4)).optionTemplate.id == 151) {
                            var6 = var5.param;
                        } else if (var5.optionTemplate.id == 150) {
                            var2 = var5.param;
                        }
                    }
                }

                var3 = currentCharViewInfo.arrItemViThu[4].upgrade;
            }

            var4 = xstart + 5;
            int var7 = ystart + 112;
            mFont.tahoma_7b_white.drawString(var1, mResources.Level + ": ", var4, var7, 0);
            mFont.tahoma_7b_white.drawString(var1, String.valueOf(var3), var4 + 70, var7, 0);
            mFont var10000 = mFont.tahoma_7b_white;
            String var10002 = mResources.NAMEPOTENTIAL[2] + ": ";
            var7 += 15;
            var10000.drawString(var1, var10002, var4, var7, 0);
            mFont.tahoma_7b_white.drawString(var1, String.valueOf(var2), var4 + 70, var7, 0);
            var10000 = mFont.tahoma_7b_white;
            var10002 = mResources.EXP + ": ";
            var7 += 17;
            var10000.drawString(var1, var10002, var4, var7, 0);
            mFont.tahoma_7b_white.drawString(var1, String.valueOf(var6), var4 + 70, var7, 0);
        }
    }

    private void actBijuuSelect() {
        MyVector var1 = new MyVector();
        if (indexBijuuMenu == 0) {
            var1.addElement(new Command(mResources.POTENTIAL_POINT, 5021));
            var1.addElement(new Command(mResources.MENUME[1], 5022));
            var1.addElement(this.cmdCloseAll);
        } else if (indexBijuuMenu == 1) {
            var1.addElement(new Command(mResources.MENUME[indexMenu], 502));
            var1.addElement(new Command(mResources.MENUME[1], 5022));
            var1.addElement(this.cmdCloseAll);
        } else if (indexBijuuMenu == 2) {
            var1.addElement(new Command(mResources.MENUME[indexMenu], 502));
            var1.addElement(new Command(mResources.POTENTIAL_POINT, 5021));
            var1.addElement(this.cmdCloseAll);
        }

        GameCanvas.menu.startAt(var1);
    }

    private static void actBijuuMenuPoint() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.UPPOINT, 5041));
        var0.addElement(new Command(mResources.UPPOINTS, 5042));
        GameCanvas.menu.startAt(var0);
    }

    private void doBijuuUpPoint() {
        if (indexTitle > 0 && indexTitle <= 4 || GameCanvas.isTouch) {
            GameCanvas.inputDlg.show(mResources.INPUT_POINT, this.cmdBijuuAddPoint, 1);
        }
    }

    private static void actBijuuUpPoint() {
        String var0;
        if ((var0 = GameCanvas.inputDlg.tfInput.getText()).trim().equals("")) {
            GameCanvas.startOKDlg(mResources.NOT_INPUT_POINT);
        } else {
            boolean var1 = false;

            int var3;
            try {
                var3 = Integer.parseInt(var0);
            } catch (Exception var2) {
                GameCanvas.endDlg();
                return;
            }

            if (var3 <= 0) {
                GameCanvas.endDlg();
            } else if (Char.getMyChar().pPoint != 0 && var3 <= Char.getMyChar().pPoint) {
                Service.gI().upPotential(indexTitle - 1, var3);
                GameCanvas.endDlg();
            } else {
                GameCanvas.startOKDlg(mResources.NOT_ENOUGH_POINT);
            }
        }
    }

    private static void actBijuuKyNang() {
        MyVector var0;
        (var0 = new MyVector()).addElement(new Command(mResources.UPPOINT, 5051));
        var0.addElement(new Command(mResources.UPPOINTS, 5052));
        GameCanvas.menu.startAt(var0);
    }

    private void doBijuuUpSkill() {
        if (indexTitle > 0 && indexTitle <= 4) {
            GameCanvas.inputDlg.show(mResources.INPUT_POINT, this.cmdBijuuSkillUp, 1);
        }
    }

    private static void actBijSkillUpPoint() {
        String var0;
        if ((var0 = GameCanvas.inputDlg.tfInput.getText()).trim().equals("")) {
            GameCanvas.startOKDlg(mResources.NOT_INPUT_POINT);
        } else {
            boolean var1 = false;

            int var3;
            try {
                var3 = Integer.parseInt(var0);
            } catch (Exception var2) {
                GameCanvas.endDlg();
                return;
            }

            if (Char.getMyChar().sPoint != 0 && var3 <= Char.getMyChar().sPoint) {
                Service.gI().upSkill(Char.getMyChar().nClass.skillTemplates[indexSelect].id, var3);
                GameCanvas.endDlg();
            } else {
                GameCanvas.startOKDlg(mResources.NOT_INPUT_POINT);
                GameCanvas.currentDialog = GameCanvas.msgdlg;
            }
        }
    }

    static void advAA(GameScr var0, byte var1) {
        var0.doClickCaptcha(var1);
    }

    public static void advAA(Mob var0, int var1) {
        MobTemplate var2;
        if ((var2 = Mob.arrMobTemplate[var0.templateId]).type != 0) {
            var0.dir = var1 % 3 == 0 ? -1 : 1;
            var0.x += 10 - var1 % 20;
        }

        Auto.advAA(var0);
        if (!vMobTemplate.contains(var2) && !var0.isBoss && (var0.templateId != 179 && var0.templateId != 175 && var0.templateId != 202 || var0.status != 8)) {
            vMobTemplate.addElement(var2);
        }

        vMob.addElement(var0);
    }

    public static Char advAA(String var0) {
        for (int var1 = 0; var1 < vCharInMap.size(); ++var1) {
            Char var2;
            if ((var2 = (Char) vCharInMap.elementAt(var1)).cName.equals(var0)) {
                return var2;
            }
        }

        return null;
    }

    public static void advAH(int var0) {
        Npc var1;
        if ((var1 = findNPC(var0)) != null) {
            Char.moveToChar(var1.cx, var1.cy);
            Char.getMyChar().npcFocus = var1;
            Service.gI().openMenu(var1.template.npcTemplateId);
        }

    }

    public static void pickNPC(int var0, int var1, int var2) {
        if (System.currentTimeMillis() < 500L) {
            Auto.sleep(500L - System.currentTimeMillis());
        }

        Npc var3;
        if ((var3 = findNPC(var0)) != null) {
            Char.moveToChar(var3.cx, var3.cy);
            Char.getMyChar().npcFocus = var3;
            Service.gI().menu((byte) 0, var0, var1, var2);
        }

    }

    public static Npc findNPC(int var0) {
        Char var1 = Char.getMyChar();
        MyVector var2 = vNpc;
        int var3 = -1;
        Npc var4 = null;

        for (int var5 = 0; var5 < var2.size(); ++var5) {
            Npc var6;
            if ((var6 = (Npc) var2.elementAt(var5)) != null && var0 == var6.template.npcTemplateId) {
                int var7 = Res.distance(var1.cx, var1.cy, var6.cx, var6.cy);
                if (var3 == -1 || var7 < var3) {
                    var3 = var7;
                    var4 = var6;
                }
            }
        }

        return var4;
    }

    public static void paint(String var0) {
        ChatPopup.addChatPopupMultiLine("[cuongcute] " + var0, 1000, Char.getMyChar());
    }

    public final void advAA(Image var1) {
        var1.getRGB(this.advGN, 0, 60, 0, 15, 60, 10);
        (new Thread(new AutoDietMa(this))).start();
    }

    private static void MoAll() {
        Item var0;
        if ((var0 = getItemFocus(3)) != null) {
            if (var0.template.level > Char.getMyChar().clevel) {
                GameCanvas.msgdlg.setInfo(mResources.NOT_SELL, (Command) null, new Command(mResources.Rule, 1), (Command) null);
                GameCanvas.currentDialog = GameCanvas.msgdlg;
                return;
            }

            (new Thread(new AutoMoAll(var0))).start();
        }

    }

    public static void AutoDoiKhu(int var0) {
        (new Thread(new AutoDoiKhu(var0))).start();
    }

}
