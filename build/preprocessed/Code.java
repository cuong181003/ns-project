
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;
import java.util.Vector;
import javax.microedition.lcdui.Display;

public final class Code implements Runnable {

    public static Code instance;
    private static boolean advCJ;
    private static Thread advCK;
    public static Auto auto;
    private static AutoTanSat autoTanSat;
    public static AutoStanima autoStanima;
    public static AutoNVHN autoNVHN;
    public static AutoTaThu autoTaThu;
    private static AutoTuDanh autoTuDanh;
    private static AutoBuff autoBuff;
    public static AutoSell autoSell;
    private static AutoDanhVong autoDanhVong;
    public static AutoLoiWin autoLoiWin;
    public static AutoLoiLoss autoLoiLoss;
    private static AutoPKAm autoPKAm;
    private static AutoChoPK autoChoPK;
    private static AutoDanhPK autoDanhPK;
    private static AutoPK autoPK = new AutoPK();
    public static String cNameLeader;
    public static MyVector vParty;
    public static MyVector advAK;
    private static long advCS;
    private static long advCT;
    public static short[] arrItemNhat;
    public static short[] arrItemDel;
    public static int KCNhatValue;
    public static int KCTSValue;
    public static int cxValue;
    public static int cyValue;
    public static boolean isAHutVP;
    public static boolean isADanhCVT;
    public static boolean isAPlayerPK;
    public static int advAT;
    public static MyVector cxViTri;
    public static MyVector cyViTri;
    public static boolean isADanhCK;
    public static int advAX;
    public static int[] advAY;
    public static boolean isAGiuLV;
    public static int SPGameValue;
    private static long advCU;
    private static MyVector advCV;
    private static MyVector advCW;
    public static MyVector vTinhLuyen = new MyVector();

    private static long advCX;
    public static MyVector advBB;
    public static MyVector advBC;
    public static MyVector luyenngoc = new MyVector();
    public static long advBD;
    public static long TimeUpValue;
    public static boolean bosstape;
    public static boolean skilltape;
    public static boolean isAspeed;
    public static int speedValue;
    public static boolean isAngang;
    public static int ngangValue;
    public static boolean isAcao;
    public static int caoValue;
    public static boolean isAlan;
    public static int lanValue;
    public static boolean isPk;
    private static String[] advCY;
    public static byte advBU;
    public static byte advBV;
    public static short advBW;
    public static int advBX;
    public static int advBY;
    public static long PKAmValue;
    public static boolean advCA;
    public static boolean locdo;
    private static long advCZ;
    private static final Random advDA = new Random();
    private long advDB = 0L;
    public static int advCC;
    private int advDC;
    private int advDD;
    public long advCD;
    public static long SPNextMapValue = 1L;
    public static boolean isADapDo = false;
    public static int CapDoValue = 7;
    public static int advCH = -1;
    public static int advCI = 5;
    private static final String[] sellerDG = new String[]{"van ly doc hanh", "i love cuongcute", "buon nhu cho can", "em chi di buff thoi"};
    private long sellerDH = 0L;
    private static final Random sellerDC = new Random();
    private static long sellerDB;
    public static String cNamePK = "admin;2";
    public static int Q = 0;
    private static AutoLuyenNgoc vLuyenNgoc = new AutoLuyenNgoc();

    ; 
    private static void advAQ() {
        instance = new Code();
        advCJ = false;
        autoTanSat = new AutoTanSat();
        autoStanima = new AutoStanima();
        autoNVHN = new AutoNVHN();
        autoTaThu = new AutoTaThu();
        autoTuDanh = new AutoTuDanh();
        autoBuff = new AutoBuff();
        autoSell = new AutoSell();
        autoDanhVong = new AutoDanhVong();
        autoLoiWin = new AutoLoiWin();
        autoLoiLoss = new AutoLoiLoss();
        autoPKAm = new AutoPKAm();
        autoChoPK = new AutoChoPK();
        autoDanhPK = new AutoDanhPK();
        advCS = 0L;
        advCT = 0L;
        arrItemNhat = new short[200];
        arrItemDel = new short[200];
        KCNhatValue = -1;
        KCTSValue = -1;
        cxValue = -1;
        cyValue = -1;
        isAHutVP = false;
        isADanhCVT = false;
        isAPlayerPK = false;
        cxViTri = new MyVector();
        cyViTri = new MyVector();
        isADanhCK = false;
        advAY = new int[0];
        isAGiuLV = RMS.loadRMSInt("keepLevel") == 1;
        SPGameValue = 30;
        advCU = 0L;
        advCV = new MyVector();
        advCW = new MyVector();
        advCX = 0L;
        advBB = new MyVector();
        advBC = new MyVector();
        advCC = -1;

        int var0;
        for (var0 = 0; var0 < arrItemNhat.length; ++var0) {
            arrItemNhat[var0] = -1;
        }

        for (var0 = 0; var0 < arrItemDel.length; ++var0) {
            arrItemDel[var0] = -1;
        }

        cNameLeader = null;
        vParty = new MyVector();
        advAK = new MyVector();

        try {
            ByteArrayInputStream var7 = new ByteArrayInputStream(RMS.loadRMS("V6Group"));
            DataInputStream var1;
            if ((cNameLeader = (var1 = new DataInputStream(var7)).readUTF()).equals("")) {
                cNameLeader = null;
            }

            byte var2 = var1.readByte();

            int var3;
            for (var3 = 0; var3 < var2; ++var3) {
                vParty.addElement(var1.readUTF());
            }

            int var9 = var1.readInt();

            for (var3 = 0; var3 < var9; ++var3) {
                advAK.addElement(var1.readUTF());
            }

            var1.close();
            var7.close();
        } catch (Exception var6) {
        }

        FormDanhVong.advAA();

        try {
            advCY = split(advAK("text.txt"), "\n");
        } catch (Exception var4) {
            advCY = new String[0];
        }

        advBD = 0L;
        TimeUpValue = 0L;
        bosstape = false;
        skilltape = false;
        isAspeed = false;
        speedValue = 5;
        isAngang = false;
        ngangValue = 100;
        isAcao = false;
        caoValue = 100;
        isAlan = false;
        lanValue = 100;
        isPk = false;
        advCA = RMS.loadRMSInt("saveItem") == 1;
        locdo = RMS.loadRMSInt("delItem") == 1;
        advBU = 10;
        advBV = 15;
        advBW = -1;
        advBX = -1;
        advBY = -1;
        PKAmValue = 50L;
        String var8;
        if ((var8 = RMS.loadRMSString("nmSleep")) != null) {
            try {
                SPNextMapValue = Long.parseLong(var8);
                return;
            } catch (NumberFormatException var5) {
            }
        }

    }

    public static int advAA(int var0, int var1) {
        Calendar var2 = advAH(0);
        if (var0 >= 0 && var1 >= 0) {
            int var3 = var2.get(11);
            int var4 = var2.get(12);
            if (var0 == 0) {
                return var3 == 0 && var4 < var1 ? var2.get(5) - 1 : var2.get(5);
            } else {
                return var3 >= var0 && (var3 != var0 || var4 >= var1) ? var2.get(5) : var2.get(5) - 1;
            }
        } else {
            return var2.get(5);
        }
    }

    public final void advAA() {
        if (advCC == -1) {
            advCC = advAA(FormDanhVong.advAH, FormDanhVong.advAI);
        }

        if (!advCJ) {

            if (auto != null) {
                auto.advAM();
                if (auto == autoLoiWin || auto == autoDanhVong && AutoDanhVong.advAA == 5) {
                    autoLoiWin.advAA();
                } else if (auto == autoLoiLoss) {
                    autoLoiLoss.advAA();
                    autoLoiLoss.advAC = true;
                }
            }

            this.advCD = advCU = System.currentTimeMillis();
            advCJ = true;
            (advCK = new Thread(this)).start();
        }

    }

    public static void advAB() {
        advCJ = false;
        if (advCK != null) {
            LockGame.java_BK();
            AutoNTGT.ntgtAC();
            advCK.interrupt();
        }

    }

    public static void setAuto(Auto var0) {
        var0.T = auto;
        auto = var0;
    }

    public static void java_AC() {
        LockGame.java_BK();
        auto = auto.T;
    }

    public static void advAB(int var0, int var1) {
        autoTanSat.advAA(var0, var1, Char.isATsMapTrong ? -1 : TileMap.zoneID);
        setAuto((Auto) autoTanSat);
    }

    private static void advAD(int var0, int var1) {
        autoStanima.advAA(var0, var1, Char.isATsMapTrong ? -1 : TileMap.zoneID, false, false);
        setAuto((Auto) autoStanima);
    }

    private static void advAA(boolean var0, boolean var1) {
        autoStanima.advAA(-1, TileMap.mapID, TileMap.zoneID, var0, var1);
        autoStanima.advAD = true;
        setAuto((Auto) autoStanima);
    }

    public static void AutoNVHN() {
        autoNVHN.update();
        setAuto((Auto) autoNVHN);
    }

    public static void AutoTaThu() {
        autoTaThu.update();
        setAuto((Auto) autoTaThu);
    }

    private static void advAR() {
        autoTuDanh.update();
        setAuto((Auto) autoTuDanh);
    }

    private static void advAB(boolean var0, boolean var1) {
        autoBuff.advAA(TileMap.mapID, TileMap.zoneID, var0, var1);
        setAuto((Auto) autoBuff);
    }

    private static void advAS() {
        autoSell.update();
        setAuto((Auto) autoSell);
    }

    private static void advAT() {
        autoDanhVong.update();
        setAuto((Auto) autoDanhVong);
    }

    private static void advAU() {
        autoPKAm.advAA();
        setAuto((Auto) autoPKAm);
    }
    public static void AB(final Item item) {
        AutoLuyenNgoc.item = item;
        AutoLuyenNgoc.AC = false;
        AutoLuyenNgoc.AA = false;
        setAuto(Code.vLuyenNgoc);
    }
    public static void endAuto() {
        LockGame.java_BK();
        AutoNTGT.ntgtAC();
        auto = null;
    }

    public static MyVector DSHoiSinh() {
        MyVector var0 = new MyVector();

        for (int var1 = 0; var1 < advAK.size(); ++var1) {
            var0.addElement(var1 + ". " + (String) advAK.elementAt(var1));
        }

        return var0;
    }

    private static void advAI(String var0) {
        if (!advAK.contains(var0)) {
            advAK.addElement(var0);
            saveParty();
        }

    }

    private static void advAJ(String var0) {
        if (advAK.contains(var0)) {
            advAK.removeElement(var0);
            saveParty();
        }

    }

    private static void advAW() {
        advAK.removeAllElements();
        saveParty();
    }

    public static boolean advAA(String var0) {
        return advAK.contains(var0);
    }

    private static void saveParty() {
        ByteArrayOutputStream var0 = new ByteArrayOutputStream();
        DataOutputStream var1 = new DataOutputStream(var0);

        try {
            var1.writeUTF(cNameLeader == null ? "" : cNameLeader);
            var1.writeByte(vParty.size());

            int var2;
            for (var2 = 0; var2 < vParty.size(); ++var2) {
                var1.writeUTF((String) vParty.elementAt(var2));
            }

            var1.writeInt(advAK.size());

            for (var2 = 0; var2 < advAK.size(); ++var2) {
                var1.writeUTF((String) advAK.elementAt(var2));
            }

            var1.flush();
            var0.flush();
            RMS.saveRMS("V6Group", var0.toByteArray());
        } catch (Exception var3) {
        }
    }

    public static void advAA(byte var0, byte[] var1) {
        if (auto != null) {
            try {
                auto.advAA(var0);
                auto.advAA(var1);
                auto.advAN();
                return;
            } catch (Exception var2) {
            }
        }

    }

    public static boolean AF(final Item item) {
        return item.template.id >= 652 && item.template.id <= 655;
    }

    public static void advAA(int var0) {
        if (auto != null && Char.getMyChar().myskill != null && Char.getMyChar().charID == var0 && Char.getMyChar().cMP > Char.getMyChar().myskill.manaUse) {
            Char var10000 = Char.getMyChar();
            var10000.cMP -= Char.getMyChar().myskill.manaUse;
        }

    }

    public static boolean advAB(String var0) {
        if (cNameLeader != null && !advAD(var0)) {
            String var1;
            if ((var1 = Char.getMyChar().cName).equals(cNameLeader)) {
                if (advAC(var0)) {
                    return true;
                }
            } else if (GameScr.vParty.size() > 1 && var1.equals(((Party) GameScr.vParty.firstElement()).name) && var0.equals(cNameLeader)) {
                return true;
            }

            return false;
        } else {
            return false;
        }
    }

    public static boolean advAC(String var0) {
        for (int var1 = 0; var1 < vParty.size(); ++var1) {
            if (var0.equals(vParty.elementAt(var1))) {
                return true;
            }
        }

        return false;
    }

    public static boolean advAD(String var0) {
        if (var0.equals(Char.getMyChar().cName)) {
            return true;
        } else {
            for (int var1 = 0; var1 < GameScr.vParty.size(); ++var1) {
                if (((Party) GameScr.vParty.elementAt(var1)).name.equals(var0)) {
                    return true;
                }
            }

            return false;
        }
    }

    public static boolean advAH() {
        for (int var0 = 0; var0 < Char.aLuyenDaValue - 1; ++var0) {
            if (Char.getBagNum(var0) >= 4) {
                return true;
            }
        }

        return false;
    }

    private static int advAI(int var0) {
        int var1 = 0;
        Char var2 = Char.getMyChar();

        for (int var3 = 0; var3 < var2.arrItemBag.length; ++var3) {
            Item var4;
            if ((var4 = var2.arrItemBag[var3]) != null && var4.template.type == 18 && var4.template.level == var0) {
                ++var1;
            }
        }

        return var1;
    }

    public final void run() {
        try {
            while (advCJ) {
                long var1 = System.currentTimeMillis();

                try {
                    Char var3 = Char.getMyChar();
                    int var4 = Char.getBagNum();
                    int var5;
                    int var6;
                    Effect var21;
                    if (auto != null) {
                        if (isAGiuLV && !(auto instanceof AutoPKAm) && (!(auto instanceof AutoStanima) || autoStanima.advAA != 2) && Char.getMyChar().cExpR * 100L / GameScr.exps[Char.getMyChar().clevel] >= PKAmValue) {
                            AutoPKAm.advAA = auto;
                            advAU();
                            continue;
                        }

                        int var10;
                        if (FormDanhVong.isADanhVong && FormDanhVong.advAH >= 0 && FormDanhVong.advAI >= 0 && !(auto instanceof AutoDanhVong) && !(auto instanceof AutoPKAm) && (!(auto instanceof AutoStanima) || autoStanima.advAA != 2)) {
                            Calendar var9;
                            var10 = (var9 = advAH(0)).get(5);
                            int var8 = var9.get(11);
                            var6 = var9.get(12);
                            if (var10 != advCC && (var8 > FormDanhVong.advAH || var8 == FormDanhVong.advAH && var6 >= FormDanhVong.advAI)) {
                                advCC = var10;
                                advAT();
                                continue;
                            }
                        }

                        if (cNameLeader != null && System.currentTimeMillis() - advCS > 5000L) {
                            if (cNameLeader.equals(var3.cName)) {
                                if (!Auto.advAN && GameScr.vParty.size() <= 0) {
                                    Service.gI().createParty();
                                }
                            } else if (GameScr.advAA(cNameLeader) != null && GameScr.vParty.size() == 0) {
                                Service.gI().pleaseInputParty(cNameLeader);
                            }

                            advCS = System.currentTimeMillis();
                        }

                        if (TimeUpValue > 0L) {
                            long var24;
                            if ((var24 = System.currentTimeMillis()) - advBD >= TimeUpValue) {
                                TimeUpValue = 0L;
                                LockGame.java_BK();
                                auto = null;
                                Session_ME.instance.cleanNetwork();
                                Controller.gI().advAD();
                                return;
                            }

                            TimeUpValue -= var24 - advBD;
                            advBD = var24;
                        }

                        auto.auto();
                        if (var3.isHuman == Auto.advAN && (var3.myskill == null || var3.myskill.template.id != Auto.advAO.template.id)) {
                            var3.myskill = Auto.advAO;
                        }

                        if (Char.isANoMP && Auto.advAP) {
                            Auto.advAP = false;
                            if (!(auto instanceof AutoTaThu) && !(auto instanceof AutoPKBoss) && !TileMap.isLangCo(TileMap.mapID) && var3.arrItemBody[15] == null) {
                                Auto.advAP();
                            }
                        }

                        boolean var25;
                        if (var3.statusMe != 14 && var3.statusMe != 5 && var3.cHP > 0) {
                            if (Char.isAMP && System.currentTimeMillis() - advCT > 500L && Char.getMyChar().cMP < Char.getMyChar().cMaxMP * Char.aMpValue / 100) {
                                Char.getMyChar().doUsePotion(17);
                                advCT = System.currentTimeMillis();
                            }

                            if (Char.isAHP && System.currentTimeMillis() - var3.lastUseHP > 2000L && Char.getMyChar().cHP < Char.getMyChar().cMaxHP * Char.aHpValue / 100) {
                                var25 = false;
                                var5 = (int) (System.currentTimeMillis() / 1000L);

                                for (var10 = 0; var10 < Char.getMyChar().vEff.size(); ++var10) {
                                    if ((var21 = (Effect) Char.getMyChar().vEff.elementAt(var10)).template.id == 21 && var21.timeLenght - (var5 - var21.timeStart) >= 2) {
                                        var25 = true;
                                        break;
                                    }
                                }

                                if (!var25) {
                                    Char.getMyChar().doUsePotion(16);
                                    var3.lastUseHP = System.currentTimeMillis();
                                }
                            }
                        }

                        if (var3.sPoint > 0 && (Char.isACongKN || auto instanceof As20) && Auto.advAO != null && Auto.advAO.point < Auto.advAO.template.maxPoint) {
                            SkillTemplate var22 = Auto.advAO.template;
                            var5 = 0;

                            for (var10 = Auto.advAO.point + 1; var10 <= var22.maxPoint && var22.skills[var10].level <= var3.clevel && var5 < var3.sPoint; ++var10) {
                                ++var5;
                            }

                            if (var5 > 0) {
                                GameScr.paint("Cộng skill " + var22.name + " " + var5 + " điểm");
                                Service.gI().upSkill(var22.id, var5);
                                if (LockGame.advAU()) {
                                    Session_ME.gI().reLogin();
                                }
                            }
                        }

                        if (var3.pPoint > 0 && (Char.isACongTN || auto instanceof As20)) {
                            var6 = var3.isUseLongRangeWeapon() ? 3 : 0;
                            if (var3.pPoint >= 100) {
                                GameScr.paint("Cộng tiềm năng " + mResources.NAMEPOTENTIAL[var6] + " 60 điểm, " + mResources.NAMEPOTENTIAL[2] + " 40 điểm");
                                Service.gI().upPotential(2, 40);
                                Service.gI().upPotential(var6, 60);
                            } else {
                                GameScr.paint("Cộng tiềm năng " + mResources.NAMEPOTENTIAL[var6] + " " + var3.pPoint + " điểm");
                                Service.gI().upPotential(var6, var3.pPoint);
                            }

                            LockGame.advAW();
                        }
                        TileMap.shorts[138] = new short[]{(short) Auto.mapid};

                        int var11;
                        int var13;
                        Item var14;
                        Item var23;
                        if (advCW.size() > 0) {
                            int[] var17 = new int[]{150000, 247500, 408375, 673819, 1111801, 2056832, 4010822, 7420021, 12243035};
                            byte[] var7 = new byte[]{3, 5, 9, 4, 7, 10, 5, 7, 9};

                            for (var10 = 0; var10 < advCW.size(); ++var10) {
                                var5 = (var23 = (Item) advCW.elementAt(var10)).advAU();
                                if (var23.advAW) {
                                    if (System.currentTimeMillis() - var23.advAY > 1L || var23.advAX < var5) {
                                        var23.advAW = false;
                                    }
                                } else if (var5 >= 0 && var5 < 9) {
                                    MyVector var26 = Char.getBagItems(var5 < 3 ? 455 : (var5 < 6 ? 456 : 457));
                                    var11 = var17[var5];
                                    byte var12 = var7[var5];
                                    if (var3.yen >= var11 && var26.size() >= var12) {
                                        Item[] var28 = new Item[24];

                                        for (var13 = 0; var13 < var12; ++var13) {
                                            var14 = (Item) var26.elementAt(var26.size() - 1);
                                            var28[var13] = var14;
                                            var3.arrItemBag[var14.indexUI] = null;
                                            var26.removeElementAt(var26.size() - 1);
                                        }

                                        Service.gI().tinhluyenNoMsg(var23, var28);
                                        var23.advAW = true;
                                        var23.advAX = var5;
                                        var23.advAY = System.currentTimeMillis();
                                    }
                                } else {
                                    advCW.removeElementAt(var10--);
                                }
                            }
                        }

                        MyVector var18;
                        Item[] var19;
                        if (Char.isALuyenTTT && var4 > 0) {
                            var18 = Char.getBagItems(455);

                            while (var18.size() >= 9) {
                                var19 = new Item[24];

                                for (var10 = 0; var10 < 9; ++var10) {
                                    var23 = (Item) var18.elementAt(var18.size() - 1);
                                    var19[var10] = var23;
                                    var3.arrItemBag[var23.indexUI] = null;
                                    var18.removeElementAt(var18.size() - 1);
                                }

                                Service.gI().luyenthachNoMsg(var19);
                            }

                            var4 = Char.getBagNum();
                        }

                        if (Char.isALuyenTTC && var4 > 0) {
                            var18 = Char.getBagItems(456);

                            while (var18.size() >= 9) {
                                var19 = new Item[24];

                                for (var10 = 0; var10 < 9; ++var10) {
                                    var23 = (Item) var18.elementAt(var18.size() - 1);
                                    var19[var10] = var23;
                                    var3.arrItemBag[var23.indexUI] = null;
                                    var18.removeElementAt(var18.size() - 1);
                                }

                                Service.gI().luyenthachNoMsg(var19);
                            }

                            var4 = Char.getBagNum();
                        }

                        if (System.currentTimeMillis() - advCX > 2000L) {
                            for (var6 = 0; var6 < advBB.size(); ++var6) {
                                Integer var27 = (Integer) advBB.elementAt(var6);
                                Integer var30 = (Integer) advBC.elementAt(var6);
                                var5 = var27.intValue();
                                if ((var10 = var30.intValue()) < 5000) {
                                    advBB.removeElementAt(var6);
                                    advBC.removeElementAt(var6);
                                    --var6;
                                } else if ((var23 = Char.getBagItemLock(var5)) != null) {
                                    Service.gI().sendToSaleItem(var23, var10);
                                }
                            }

                            var4 = Char.getBagNum();
                            advCX = System.currentTimeMillis();
                        }

                        if (TileMap.mapID != 138 && TileMap.isLangCo(TileMap.mapID) && (!Char.isBagHas(35) && !Char.isBagHas(37) || Char.isAFood && Char.isAMuaFood && Char.aFoodValue <= 50 && var4 > 1 && advAI(Char.aFoodValue) == 0)) {
                            TileMap.advAJ(0);
                            TileMap.advAF();
                        }

                        var25 = TileMap.isTruong(TileMap.mapID);
                        if (TileMap.isLang(TileMap.mapID) || var25) {
                            if (isADapDo && !(auto instanceof AutoDanhVong) && !(auto instanceof As10) && var4 > 1 && var3.ctaskId > 9) {
                                advAZ();
                                if (var25 && !TileMap.isTruong(TileMap.mapID)) {
                                    Auto.advAP();
                                }

                                var4 = Char.getBagNum();
                            }

                            if (Char.isALuyenDa && !isADapDo && !(auto instanceof AutoDanhVong) && !(auto instanceof As10) && var4 > 0 && var4 < 10 && var3.ctaskId > 9 && advAH()) {
                                advAA(Char.aLuyenDaValue - 1, true);
                                var4 = Char.getBagNum();
                            }

                            if (advCA && (auto instanceof AutoDanhVong && var4 <= 0 || !(auto instanceof AutoDanhVong) && var4 <= 2)) {
                                int var31 = 0;

                                for (var11 = 0; var11 < Char.getMyChar().arrItemBag.length; ++var11) {
                                    Item var33;
                                    if ((var33 = Char.getMyChar().arrItemBag[var11]) != null && var33.isTypeBody()) {
                                        ++var31;
                                    }
                                }

                                if (var31 > 0) {
                                    if (Char.getMyChar().arrItemBox == null) {
                                        Service.gI().requestItem(4);
                                        LockGame.advAS();
                                    }

                                    if ((var11 = Char.getBoxNum()) > 0) {
                                        GameScr.pickNPC(5, 0, 0);
                                        if (AutoDanhVong.advAE()) {
                                            GameScr.pickNPC(5, 0, 0);
                                        }

                                        if (AutoDanhVong.advAG()) {
                                            for (var13 = Char.getMyChar().arrItemBag.length - 1; var13 >= 0; --var13) {
                                                if ((var14 = Char.getMyChar().arrItemBag[var13]) != null && var14.isTypeBody() && (!(auto instanceof AutoDanhVong) || AutoDanhVong.advAB.id != var14.template.id)) {
                                                    Service.gI().itemBagToBox(var14.indexUI);
                                                    AutoDanhVong.advAA();
                                                    --var11;
                                                }

                                                if (var11 <= 0) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                            if ((Char.isAMuaFood || auto instanceof As10) && var4 > 1 && var3.ctaskId > 3 && (var10 = auto instanceof As10 ? (var3.ctaskId >= 9 ? 10 : 1) : Char.aFoodValue) <= 50 && advAI(var10) == 0) {
                                var5 = 2;

                                for (var6 = 0; var6 < var3.vEff.size(); ++var6) {
                                    if (((Effect) var3.vEff.elementAt(var6)).template.type == 0) {
                                        --var5;
                                        break;
                                    }
                                }

                                GameScr.pickNPC(4, 0, 0);
                                if (var10 == 50) {
                                    Service.gI().muaItem(9, 7, var5);
                                } else {
                                    Service.gI().muaItem(9, var10 / 10, var5);
                                }

                                LockGame.advAG();
                            }

                            if (TileMap.mapID == 138 && var4 > 1 && !Char.isBagHas(35) && !Char.isBagHas(37)) {
                                GameScr.pickNPC(4, 0, 0);
                                Service.gI().muaItem(9, 6, 1);
                                LockGame.advAG();
                                ++var4;
                            }
                        }

                        if (locdo && !(auto instanceof AutoDanhVong)) {
                            for (var6 = 0; var6 < var3.arrItemBag.length; ++var6) {
                                Item var32;
                                if (advAD(var32 = var3.arrItemBag[var6])) {
                                    var32.advAU = System.currentTimeMillis();
                                    Service.gI().delItem(var32.indexUI, 1);
                                }
                            }
                        }
                    }

                    int var20;
                    if (isAHutVP) {
                        var6 = 100;
                        ItemMap var29 = null;
                        var20 = 0;

                        while (true) {
                            if (var20 >= GameScr.vItemMap.size()) {
                                if (var29 != null) {
                                    Service.gI().pickItem(var29.itemMapID);
                                    Auto.sleep(50L);
                                }
                                break;
                            }

                            ItemMap var34 = (ItemMap) GameScr.vItemMap.elementAt(var20);
                            var5 = Res.distance(var3.cx, var3.cy, var34.xEnd, var34.yEnd);
                            if ((var6 == -1 || var5 < var6) && (advAA(var34.template) || var3.nClass.classId == 1 && var34.template.id == 218) && (var4 > 2 || var34.template.type == 19 || var34.template.isUpToUp && Char.isBagHas(var34.template.id))) {
                                var6 = var5;
                                var29 = var34;
                            }

                            ++var20;
                        }
                    }
                    if (luyenngoc.size() > 0) {
                        for (int i = 0; i < luyenngoc.size(); ++i) {
                            GameScr.gI().doCloseAlert();
                            //  Service.gI().muaItem(14, 85, 12);

                            GameScr.gI().doOpenUI(46);

                            GameScr.itemSplit = (Item) luyenngoc.elementAt(i);
                            if (Char.getBagItems(652).size() > 2
                                    || Char.getBagItems(653).size() > 2
                                    || Char.getBagItems(654).size() > 2
                                    || Char.getBagItems(655).size() > 2) {
                                GameScr.arrItemSplit = new Item[24];
                                int i1 = 0;
                                for (int j = 0; j < Char.getMyChar().arrItemBag.length; ++j) {
                                    if (i1 >= 24
                                            || Char.getMyChar().arrItemBag[j] == null
                                            || Char.getMyChar().arrItemBag[j].upgrade >= 2
                                            || Char.getMyChar().arrItemBag[j].upgrade != 1
                                            || Char.getMyChar().arrItemBag[j].isLock
                                            || Char.getMyChar().arrItemBag[j].template.id != 652
                                            && Char.getMyChar().arrItemBag[j].template.id != 653
                                            && Char.getMyChar().arrItemBag[j].template.id != 654
                                            && Char.getMyChar().arrItemBag[j].template.id != 655) {
                                        continue;
                                    }
                                    GameScr.arrItemSplit[i1++] = Char.getMyChar().arrItemBag[j];
                                    Char.getMyChar().arrItemBag[Char.getMyChar().arrItemBag[j].indexUI] = null;
                                }
                                CuongScr.sleep(600L);
                                Service.gI().ngockham((byte) 1, null, GameScr.itemSplit, GameScr.arrItemSplit);

                                CuongScr.sleep(700L);

                                continue;
                            }
                            luyenngoc.removeElementAt(i--);
                        }
                    }
                    if (var3.cHP > 0 && var3.statusMe != 14 && var3.statusMe != 5 && System.currentTimeMillis() - advCU > 2000L) {
                        var6 = 0;

                        while (true) {
                            if (var6 >= advCV.size()) {
                                advCU = System.currentTimeMillis();
                                break;
                            }

                            label391:
                            {
                                ItemTemplate var35 = ItemTemplates.get((short) (var5 = ((Integer) advCV.elementAt(var6)).intValue()));
                                if (Char.isBagHas(var5)) {
                                    for (var20 = 0; var20 < var3.vEff.size(); ++var20) {
                                        if ((var21 = (Effect) var3.vEff.elementAt(var20)) != null && var21.template.iconId == var35.iconID) {
                                            break label391;
                                        }
                                    }

                                    if ((var20 = Char.getBagIndex(var5)) >= 0) {
                                        Service.gI().useItem(var20);
                                        break label391;
                                    }
                                }

                                advCV.removeElementAt(var6);
                                --var6;
                            }

                            ++var6;
                        }
                    }

                    if ((auto instanceof AutoTanSat || auto instanceof AutoTuDanh) && !AutoTrade.allowedTradeChars.isEmpty() && System.currentTimeMillis() - AutoTrade.gI().waitAcceptStart > (long) AutoSellPro.sellerBL * 60000L && System.currentTimeMillis() - AutoTrade.gI().waitLockStart > 60000L && Char.getBagNum() <= 2) {
                        if (AutoTrade.gI().addedItemCount >= AutoTrade.allowedTradeChars.size()) {
                            AutoTrade.gI().addedItemCount = 0;
                        }

                        String str4;
                        if ((str4 = (String) AutoTrade.allowedTradeChars.elementAt(AutoTrade.gI().addedItemCount)) != null && str4.length() > 0) {
                            if (AutoTrade.gI().lastTradeAccepted == AutoTrade.gI().addedItemCount) {
                                AutoTrade.gI().lastTradeAccepted = -1;
                                AutoTrade.gI().waitAcceptStart = System.currentTimeMillis();
                            } else {
                                AutoTrade.gI().waitLockStart = System.currentTimeMillis();
                                if (AutoTrade.gI().lastTradeAccepted == -1 || AutoTrade.gI().lastTradeAccepted > AutoTrade.allowedTradeChars.size() - 1) {
                                    AutoTrade.gI().lastTradeAccepted = AutoTrade.gI().addedItemCount;
                                }

                                ++AutoTrade.gI().addedItemCount;
                                sellerAB(str4, "em an com chua");
                            }
                        }
                    }
                    if (isAGiuLV && var3.cExpR * 100L / GameScr.exps[var3.clevel] >= 95L) {
                        LockGame.java_BK();
                        auto = null;
                        Session_ME.gI().close();
                        GameCanvas.instance.resetToLoginScr();
                    }
                } catch (Exception var15) {
                }

                if (Char.getMyChar().isCaptcha) {
                    LockGame.advAI();
                }

                Auto.sleep((var1 = System.currentTimeMillis() - var1) < 100L ? 100L - var1 : 0L);
            }

        } catch (Exception var16) {
        }
    }

    public static boolean gameAF(Item item) {
        return luyenngoc.contains(item);
    }

    public static void gameAG(Item item) {
        if (!luyenngoc.contains(item)) {
            luyenngoc.addElement(item);
        }
    }

    public static void gameAH(Item item) {
        luyenngoc.removeElement(item);
    }

    public static boolean advAB(int var0) {
        return advCV.contains(new Integer(var0));
    }

    public static void TuDung(int var0) {
        Integer var1 = new Integer(var0);
        if (!advCV.contains(var1)) {
            advCV.addElement(var1);
        }

    }

    public static void TatTuDung(int var0) {
        advCV.removeElement(new Integer(var0));
    }

    public static boolean advAA(Item var0) {
        return advCW.contains(var0);
    }

    public static void TuTinhLuyen(Item var0) {
        if (!advCW.contains(var0)) {
            advCW.addElement(var0);
        }

    }

    public static void TatTuTinhLuyen(Item var0) {
        advCW.removeElement(var0);
    }

    public static boolean advAE(int var0) {
        return advBB.contains(new Integer(var0));
    }

    public static int advAF(int var0) {
        Integer var1 = (Integer) advBC.elementAt(var0);
        return advBB.indexOf(new Integer(var0)) >= 0 ? var1.intValue() : 0;
    }

    public static void advAC(int var0, int var1) {
        Integer var2 = new Integer(var0);
        if (!advBB.contains(var2)) {
            advBB.addElement(var2);
            advBC.addElement(new Integer(var1));
        }

    }

    public static void TatTuBanShinwa(int var0) {
        if ((var0 = advBB.indexOf(new Integer(var0))) >= 0) {
            advBB.removeElementAt(var0);
            advBC.removeElementAt(var0);
        }

    }

    public static MyVector DSshinwa() {
        MyVector var0 = new MyVector();

        for (int var1 = 0; var1 < advBB.size(); ++var1) {
            int var2 = ((Integer) advBB.elementAt(var1)).intValue();
            int var3 = ((Integer) advBC.elementAt(var1)).intValue();
            ItemTemplate var4 = ItemTemplates.get((short) var2);
            var0.addElement(var1 + ". " + var4.name + " id " + var2 + " giá " + var3);
        }

        return var0;
    }

    public static void tinhluyen() {
        Char var0 = Char.getMyChar();

        for (int var1 = 0; var1 < vTinhLuyen.size(); ++var1) {
            Item var2;
            if ((var2 = (Item) vTinhLuyen.elementAt(var1)).indexUI >= 0 && var2.indexUI < var0.arrItemBody.length) {
                if (var0.arrItemBody[var2.indexUI] != null && var0.arrItemBody[var2.indexUI].advAU() >= 0 && var0.arrItemBody[var2.indexUI].advAU() < 9) {
                    vTinhLuyen.setElementAt(var0.arrItemBag[var2.indexUI], var1);
                }
            }
        }
    }

    public static void advAJ() {
        Char var0 = Char.getMyChar();

        for (int var1 = 0; var1 < advCW.size(); ++var1) {
            Item var2;
            if ((var2 = (Item) advCW.elementAt(var1)).indexUI >= 0 && var2.indexUI < var0.arrItemBag.length) {
                if (var0.arrItemBag[var2.indexUI] != null && var0.arrItemBag[var2.indexUI].advAU() >= 0 && var0.arrItemBag[var2.indexUI].advAU() < 9) {
                    advCW.setElementAt(var0.arrItemBag[var2.indexUI], var1);
                } else {
                    advCW.removeElementAt(var1--);
                }
            }
        }
    }

    public static String advAK() {
        String var0 = "";

        for (int var1 = 0; var1 < advAY.length; ++var1) {
            var0 = var0 + (var1 == advAY.length - 1 ? String.valueOf(advAY[var1]) : advAY[var1] + " ");
        }

        return var0;
    }

    public static void advAE(String var0) {
        String[] var4;
        int[] var1 = new int[(var4 = split(var0, " ")).length];

        for (int var2 = 0; var2 < var4.length; ++var2) {
            try {
                var1[var2] = Integer.parseInt(var4[var2]);
            } catch (NumberFormatException var3) {
                var1[var2] = -1;
            }
        }

        advAY = var1;
    }

    public static void ThemItemNhat(short var0) {
        int var1;
        for (var1 = 0; var1 < arrItemNhat.length; ++var1) {
            if (arrItemNhat[var1] == var0) {
                return;
            }
        }

        var1 = -1;

        for (int var2 = 0; var2 < arrItemNhat.length; ++var2) {
            if (arrItemNhat[var2] < 0) {
                var1 = var2;
                break;
            }
        }

        if (var1 == -1) {
            var1 = arrItemNhat.length;
            short[] var4;
            System.arraycopy(var4 = new short[arrItemNhat.length + 10], 0, arrItemNhat, 0, arrItemNhat.length);

            for (int var3 = arrItemNhat.length; var3 < var4.length; ++var3) {
                var4[var3] = -1;
            }

            arrItemNhat = var4;
        }

        arrItemNhat[var1] = var0;
    }

    public static void DelItemNhat(short var0) {
        for (int var1 = 0; var1 < arrItemNhat.length; ++var1) {
            if (arrItemNhat[var1] == var0) {
                arrItemNhat[var1] = -1;
            }
        }

    }

    public static void SapXepItemNhat() {
        for (int var0 = 0; var0 < arrItemNhat.length; ++var0) {
            if (arrItemNhat[var0] > 0) {
                for (int var1 = 0; var1 <= var0; ++var1) {
                    if (arrItemNhat[var1] == -1) {
                        arrItemNhat[var1] = arrItemNhat[var0];
                        arrItemNhat[var0] = -1;
                        break;
                    }
                }
            }
        }

    }

    public static void ThemItemDel(short var0) {
        int var1;
        for (var1 = 0; var1 < arrItemDel.length; ++var1) {
            if (arrItemDel[var1] == var0) {
                return;
            }
        }

        var1 = -1;

        for (int var2 = 0; var2 < arrItemDel.length; ++var2) {
            if (arrItemDel[var2] < 0) {
                var1 = var2;
                break;
            }
        }

        if (var1 == -1) {
            var1 = arrItemDel.length;
            short[] var4;
            System.arraycopy(var4 = new short[arrItemDel.length + 10], 0, arrItemDel, 0, arrItemDel.length);

            for (int var3 = arrItemDel.length; var3 < var4.length; ++var3) {
                var4[var3] = -1;
            }

            arrItemDel = var4;
        }

        arrItemDel[var1] = var0;
    }

    public static void DelItemDel(short var0) {
        for (int var1 = 0; var1 < arrItemDel.length; ++var1) {
            if (arrItemDel[var1] == var0) {
                arrItemDel[var1] = -1;
            }
        }

    }

    public static void SapXepItemDel() {
        for (int var0 = 0; var0 < arrItemDel.length; ++var0) {
            if (arrItemDel[var0] > 0) {
                for (int var1 = 0; var1 <= var0; ++var1) {
                    if (arrItemDel[var1] == -1) {
                        arrItemDel[var1] = arrItemDel[var0];
                        arrItemDel[var0] = -1;
                        break;
                    }
                }
            }
        }

    }

    public static boolean advAA(ItemTemplate var0) {
        if (auto instanceof As20) {
            if (var0.type == 19) {
                return true;
            } else if ((var0.type == 16 || var0.type == 17) && var0.level == 10) {
                return true;
            } else {
                Char var3 = Char.getMyChar();
                if (Char.getBagNum() <= 6) {
                    return false;
                } else if ((var3.ctaskId < 13 || var3.ctaskId == 13 && var3.arrItemBody[1] != null && var3.arrItemBody[1].upgrade < 2) && var0.type == 26 && var0.id > 0) {
                    return true;
                } else {
                    int var2 = var3.cgender == 1 ? 124 : 125;
                    return var3.ctaskId <= 12 && (var0.id == 174 && !Char.isBagHas(174) || var0.id == var2 && !Char.isBagHas(var2));
                }
            }
        } else if (auto instanceof As10) {
            return var0.type == 19;
        } else if (var0.type == 19) {
            return Char.isAPickYen;
        } else if (var0.type != 16 && var0.type != 17) {
            if (var0.type == 26) {
                return Char.isAPickYHMS && var0.id >= Char.aDaValue - 1;
            } else if (var0.advAA()) {
                return (Char.isAPickTB || auto instanceof AutoStanima) && var0.level >= Char.aTBValue;
            } else if (var0.advAB()) {
                return Char.isAPickVPNV;
            } else {
                if (var0.type == 27) {
                    if (var0.description.startsWith("Vật phẩm sự kiện") || var0.description.startsWith("Vật phẩm Sự kiện")) {
                        return Char.isAPickVPSK;
                    }

                    if (var0.name.startsWith("Sách võ công")) {
                        return Char.isAPickSVC;
                    }

                    if (TileMap.isLangCo(TileMap.mapID) && var0.id == 38) {
                        return false;
                    }
                }

                for (int var1 = 0; var1 < arrItemNhat.length; ++var1) {
                    if (arrItemNhat[var1] > 0 && var0.id == arrItemNhat[var1]) {
                        return true;
                    }
                }

                return Char.isAPickAll;
            }
        } else {
            return Char.isAPickYHM && var0.level >= Char.aHpMpValue;
        }
    }

    public static boolean advAD(Item var0) {
        if (auto instanceof As10) {
            return false;
        } else if (var0 == null) {
            return false;
        } else if (var0.upgrade > 0) {
            var0.advAV = true;
            return false;
        } else {
            for (int var1 = 0; var1 < arrItemDel.length; ++var1) {
                if (arrItemDel[var1] > 0 && var0.template.id == arrItemDel[var1]) {
                    return true;
                }
            }

            if (!var0.advAV && System.currentTimeMillis() - var0.advAU >= 5000L) {
                if (auto instanceof AutoStanima && !Char.isAPickTB && var0.template.type < 10 && var0.template.level < 70) {
                    return true;
                } else if (var0.template.type == 26 && var0.template.id < (Char.isAPickYHMS ? Char.aDaValue : Char.aLuyenDaValue) - 1) {
                    return true;
                } else {
                    if (var0.template.type < 10 || var0.template.type >= 29 && var0.template.type <= 32) {
                        if (var0.template.type < 10 && !Char.isAPickTB) {
                            if (var0.template.level < 50) {
                                return true;
                            }

                            return false;
                        }

                        if (!var0.advAS && System.currentTimeMillis() - var0.advAT > 5000L) {
                            var0.advAT = System.currentTimeMillis();
                            Service.gI().requestItemInfo(var0.typeUI, var0.indexUI);
                            if (!LockGame.advAS() || !var0.advAS) {
                                return false;
                            }
                        }

                        if (var0.advAB(85)) {
                            var0.advAV = true;
                            return false;
                        }

                        if (var0.template.type >= 29 && var0.template.type <= 32) {
                            if (var0.saleCoinLock != 0) {
                                var0.advAV = true;
                                return false;
                            }

                            return true;
                        }

                        if (var0.saleCoinLock == 5) {
                            return true;
                        }

                        boolean var5;
                        label160:
                        {
                            Item var4 = var0;
                            if (var0.options != null) {
                                for (int var2 = 0; var2 < var4.options.size(); ++var2) {
                                    ItemOption var3;
                                    if ((var3 = (ItemOption) var4.options.elementAt(var2)) != null && var3.optionTemplate.type == 2) {
                                        var5 = true;
                                        break label160;
                                    }
                                }
                            }

                            var5 = false;
                        }

                        if (!var5) {
                            return true;
                        }

                        if (var0.template.type == 1) {
                            if (var0.advAB(0) && var0.advAB(1)) {
                                if (!var0.advAB(8) && !var0.advAB(9)) {
                                    return true;
                                }

                                if (!var0.advAB(10)) {
                                    return true;
                                }

                                var0.advAV = true;
                                return false;
                            }

                            return true;
                        }

                        if (!var0.advAB(6) || !var0.advAB(7)) {
                            return true;
                        }

                        if (var0.advAC(0) < 2) {
                            return true;
                        }

                        if (var0.template.type == 8 && !var0.advAB(16)) {
                            return true;
                        }

                        if (Char.isAPickTBLa) {
                            if (var0.advAC(0) <= 2 && var0.advAC(1) <= 2 && var0.advAC(2) <= 2 && var0.advAC(3) <= 1 && var0.advAC(4) <= 1 && var0.advAC(5) <= 1 && var0.advAC(6) <= 1 && var0.advAC(7) <= 1) {
                                return true;
                            }

                            var0.advAV = true;
                            return false;
                        }
                    }

                    var0.advAV = true;
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    public static void TuSat() {
        Char var0 = Char.getMyChar();
        if (!Char.isBagHas(37) && !Char.isBagHas(35)) {
            Npc var1;
            if ((var1 = GameScr.findNPC(13)) != null && Math.abs(var1.cx - var0.cx) <= 200 && Math.abs(var1.cy - var0.cy) <= 200) {
                Char.moveToChar(var1.cx > 200 ? var1.cx - 200 : var1.cx + 200, var1.cy);
            }

            Service.gI().openUIZone();
        } else {
            Char.moveToChar(var0.cx, TileMap.pxh);
        }
    }

    public static boolean chat(String str) {
        int int2 = 0;
        StringBuffer var2 = new StringBuffer();
        StringBuffer var3 = new StringBuffer();

        int var4;
        label1149:
        for (var4 = 0; var4 < str.length(); ++var4) {
            char var5;
            if ((var5 = str.charAt(var4)) >= '0' && var5 <= '9' || var5 == ' ') {
                while (true) {
                    if (var4 >= str.length() || (var5 = str.charAt(var4)) < '0' || var5 > '9') {
                        break label1149;
                    }

                    var3.append(var5);
                    ++var4;
                }
            }

            var2.append(var5);
        }

        String strNew = var2.toString().toLowerCase();
        if (var3.length() > 0) {
            try {
                int2 = Integer.parseInt(var3.toString());
            } catch (NumberFormatException var16) {
            }
        }
        String[] str1;
        int int1;
        String str2;
        String str3;
        if (str.startsWith("addb")) {
            if ((str1 = split(str, " ")).length > 1) {
                str2 = "";

                for (int1 = 1; int1 < str1.length; ++int1) {
                    if ((str3 = str1[int1].trim()).length() > 0) {
                        AutoTrade.addTradeChar(str3);
                        if (str2.length() > 0) {
                            str2 = str2 + ", ";
                        }

                        str2 = str2 + str3;
                    }
                }

                AutoTrade.saveTradeCharList();
                GameScr.paint("Thêm " + str2 + " vào d.s acc bán hàng");
            } else if (Char.getMyChar().charFocus != null) {
                if (AutoTrade.addTradeChar(Char.getMyChar().charFocus.cName)) {
                    AutoTrade.saveTradeCharList();
                }

                GameScr.paint("Thêm " + Char.getMyChar().charFocus.cName + " vào d.s acc bán hàng");
            }

            return true;
        } else if (str.startsWith("rmb")) {
            if ((str1 = split(str, " ")).length > 1) {
                str2 = "";

                for (int1 = 1; int1 < str1.length; ++int1) {
                    if ((str3 = str1[int1].trim()).length() > 0 && AutoTrade.removeTradeChar(str3)) {
                        if (str2.length() > 0) {
                            str2 = str2 + ", ";
                        }

                        str2 = str2 + str3;
                    }
                }

                if (str2.length() > 0) {
                    AutoTrade.saveTradeCharList();
                    GameScr.paint("Xóa " + str2 + " khỏi d.s acc bán hàng");
                }
            } else if (Char.getMyChar().charFocus != null && AutoTrade.removeTradeChar(Char.getMyChar().charFocus.cName)) {
                AutoTrade.saveTradeCharList();
                GameScr.paint("Xóa " + Char.getMyChar().charFocus.cName + " khỏi d.s acc bán hàng");
            }

            return true;
        } else if (str.startsWith("xdg")) {
            if ((str1 = split(str, " ")).length > 1) {
                str2 = str1[1].trim();
                if (AutoSellPro.sellerAA.containsKey(str2)) {
                    ItemSell itemSell = (ItemSell) AutoSellPro.sellerAA.get(str2);
                    AutoSellPro.sellerAA.remove(str2);
                    GameScr.paint("Hủy bán: " + itemSell.template.name);
                }
            } else {
                CuongScr.advAA("Bạn có chắc muốn hủy hết d.s item bán?", CuongScr.advAA("Đồng ý", 877), CuongScr.advAA("Đóng", 999));
            }

            return true;
        } else if (strNew.equals("sell")) {
            (new FormSell()).sellerAA();
            return true;
        } else if (strNew.equals("buy")) {
            GameScr.paint("Auto Buy");
            advAS();
            return true;
        } else if (strNew.equals("call")) {
            AutoSellPro.sellerAO().sellerBK = 0L;
            return true;
        }
        if (strNew.equals("ntgt")) {
            if (Code.auto != null) {
                GameScr.paint("Tắt Auto");
                Code.endAuto();
            }
            GameScr.paint("Bật auto bán NTGT");
            AutoNTGT.ntgtAP().update();
            Code.setAuto((Auto) AutoNTGT.ntgtAP());
            return true;
        }
        if (strNew.equals("acd")) {
            if (!(advCA = !advCA)) {
                RMS.saveRMSInt("saveItem", -1);
                GameScr.paint("Tắt auto cất đồ");
            } else {
                RMS.saveRMSInt("saveItem", 1);
                GameScr.paint("Bật auto cất đồ");
            }

            return true;
        } else if (strNew.equals("locdo")) {
            if (!(locdo = !locdo)) {
                RMS.saveRMSInt("delItem", -1);
                GameScr.paint("Tắt auto lọc đồ");
            } else {
                RMS.saveRMSInt("delItem", 1);
                GameScr.paint("Bật auto lọc đồ");
            }

            return true;
        } else if (strNew.equals("uppk")) {
            (new FormPKAm()).advAA();
            return true;
        } else if (strNew.equals("pkn")) {
            if (!(isAPlayerPK = !isAPlayerPK)) {
                GameScr.paint("pk tất cả");
            } else {
                GameScr.paint("pk người bật pk");
            }
            return true;
        } else if (strNew.equals("adpk")) {
            if (auto instanceof AutoDanhPK) {
                GameScr.paint("Tắt auto đánh ai bật pk");
                endAuto();
            } else {
                GameScr.paint("Bật auto đánh ai bật pk");
                autoDanhPK.advAA();
                setAuto((Auto) autoDanhPK);
            }

            return true;
        } else if (strNew.equals("pka")) {
            if (auto instanceof AutoPK) {
                GameScr.paint("Tắt auto pk");
                endAuto();
            } else {
                GameScr.paint("Bật auto pk");
                autoPK.update();
                setAuto((Auto) autoPK);
            }

            return true;
        } else if (strNew.equals("acpk")) {
            if (auto instanceof AutoChoPK) {
                GameScr.paint("Tắt auto chờ pk");
                endAuto();
            } else {
                GameScr.paint("Bật auto chờ pk");
                autoChoPK.advAA();
                setAuto((Auto) autoChoPK);
            }

            return true;
        } else if (strNew.equals("atpk")) {
            if (auto instanceof AutoPKAm) {
                GameScr.paint("Tắt auto pk âm kinh nghiệm");
                endAuto();
            } else {
                GameScr.paint("Bật auto pk âm kinh nghiệm");
                if (auto != null) {
                    AutoPKAm.advAA = auto;
                }

                isAGiuLV = true;
                advAU();
            }

            return true;
        } else if (strNew.equals("s")) {
            if (int2 == 0) {
                GameScr.paint("Chạy đi đou với tốc độ 0?");
            } else if (int2 > 100) {
                GameScr.paint("Tốc giày nên để <= 100 để ko bị giật!");
            } else {
                GameScr.paint("Fake tốc chạy " + int2);
                speedValue = int2;
                isAspeed = true;
            }

            return true;
        } else if (strNew.equals("rs")) {
            GameScr.paint("Reset tốc chạy");
            isAspeed = false;
            return true;
        } else if (strNew.equals("n")) {
            if (int2 == 0) {
                int2 = 100;
            }

            GameScr.paint("Fake tầm ngang " + int2);
            isAngang = true;
            ngangValue = int2;
            return true;
        } else if (strNew.equals("c")) {
            if (int2 == 0) {
                int2 = 100;
            }

            GameScr.paint("Fake tầm cao " + int2);
            isAcao = true;
            caoValue = int2;
            return true;
        } else if (strNew.equals("m")) {
            if (int2 == 0) {
                int2 = 1;
            }

            GameScr.paint("Fake lan " + int2);
            isAlan = true;
            lanValue = int2;
            return true;
        } else if (strNew.equals("rsk")) {
            GameScr.paint("Reset fake tầm lan skill");
            isAlan = false;
            isAngang = false;
            isAcao = false;
            return true;
        } else if (!strNew.equals("bang") && !strNew.equals("fz")) {
            if (!strNew.equals("bangb") && !strNew.equals("fb")) {
                if (!strNew.equals("bangs") && !strNew.equals("fs")) {
                    if (!strNew.equals("pbang") && !strNew.equals("wz")) {
                        if (strNew.equals("u")) {
                            if (int2 == 0) {
                                int2 = 50;
                            }

                            GameScr.paint("Khinh kông " + int2);
                            Char.moveToChar(Char.getMyChar().cx, Char.getMyChar().cy - int2);
                            return true;
                        } else if (strNew.equals("d")) {
                            if (int2 == 0) {
                                int2 = 50;
                            }

                            GameScr.paint("Độn thổ " + int2);
                            Char.moveToChar(Char.getMyChar().cx, Char.getMyChar().cy + int2);
                            return true;
                        } else if (strNew.equals("l")) {
                            if (int2 == 0) {
                                int2 = 50;
                            }

                            GameScr.paint("Dịch trái " + int2);
                            Char.moveToChar(Char.getMyChar().cx - int2, Char.getMyChar().cy);
                            return true;
                        } else if (strNew.equals("r")) {
                            if (int2 == 0) {
                                int2 = 50;
                            }

                            GameScr.paint("Dịch phải " + int2);
                            Char.moveToChar(Char.getMyChar().cx + int2, Char.getMyChar().cy);
                            return true;
                        } else {
                            Char var22;
                            if (strNew.equals("g")) {
                                if ((var22 = Char.getMyChar()).charFocus != null) {
                                    GameScr.paint("MoveTo " + var22.charFocus.cName);
                                    Char.moveToChar(var22.charFocus.cx, var22.charFocus.cy);
                                } else if (var22.npcFocus != null) {
                                    GameScr.paint("MoveTo " + var22.npcFocus.cName);
                                    Char.moveToChar(var22.npcFocus.cx, var22.npcFocus.cy);
                                } else if (var22.mobFocus != null) {
                                    GameScr.paint("MoveTo " + var22.mobFocus.getTemplate().name);
                                    Char.moveToChar(var22.mobFocus.xFirst, var22.mobFocus.yFirst);
                                } else if (var22.itemFocus != null) {
                                    GameScr.paint("MoveTo " + var22.itemFocus.template.name);
                                    Char.moveToChar(var22.itemFocus.x, var22.itemFocus.y);
                                }

                                return true;
                            } else if (strNew.equals("ta")) {
                                GameScr.gI().doOpenUI((int) 9);
                                return true;
                            } else if (strNew.equals("sw")) {
                                GameScr.gI().doOpenUI((int) 36);
                                return true;
                            } else if (strNew.equals("up")) {
                                FormTimeUp.advAA().advAB();
                                return true;
                            } else if (strNew.equals("aq")) {
                                if ((var22 = Char.getMyChar()).mobFocus != null) {
                                    GameScr.vMob.removeElement(var22.mobFocus);
                                }

                                return true;
                            } else if (strNew.equals("z")) {
                                GameScr.paint((Char.isAChuyenMapHetQuai ? "Tắt" : "Bật") + " auto chuyển map");
                                Char.isAChuyenMapHetQuai = !Char.isAChuyenMapHetQuai;
                                return true;
                            } else if (strNew.equals("rm")) {
                                GameScr.paint((Char.isAReMap ? "Tắt" : "Bật") + " auto next map");
                                Char.isAReMap = !Char.isAReMap;
                                return true;
                            } else if (strNew.equals("x")) {
                                if (int2 == 0) {
                                    int2 = -1;
                                }

                                GameScr.paint("KC Nhặt " + int2);
                                KCNhatValue = int2;
                                return true;
                            } else if (strNew.equals("kts")) {
                                if (int2 == 0) {
                                    int2 = -1;
                                }

                                GameScr.paint("KC Tàn sát " + int2);
                                cxValue = Char.getMyChar().cx;
                                cyValue = Char.getMyChar().cy;
                                KCTSValue = int2;
                                return true;
                            } else {
                                Mob var19;
                                if (strNew.equals("ts")) {
                                    if ((var19 = Mob.findMobByLevel(int2)) == null) {
                                        GameScr.paint("Tàn sát all");
                                        advAB(-1, TileMap.mapID);
                                    } else {
                                        GameScr.paint("Tàn sát " + var19.getTemplate().name + " lv " + int2);
                                        advAB(var19.templateId, TileMap.mapID);
                                    }

                                    return true;
                                } else {
                                    MobTemplate var10000;
                                    MobTemplate var17;
                                    if (strNew.equals("tsx")) {
                                        var10000 = int2 >= 0 && int2 < Mob.arrMobTemplate.length ? Mob.arrMobTemplate[int2] : null;
                                        var17 = var10000;
                                        if (var10000 == null) {
                                            GameScr.paint("Tàn sát all");
                                            advAB(-1, TileMap.mapID);
                                        } else {
                                            GameScr.paint("Tàn sát " + var17.name + " id " + int2);
                                            advAB(var17.mobTemplateId, TileMap.mapID);
                                        }

                                        return true;
                                    } else if (strNew.equals("tsa")) {
                                        GameScr.paint("Tàn sát all");
                                        advAB(-1, TileMap.mapID);
                                        return true;
                                    } else if (strNew.equals("anv")) {
                                        GameScr.paint("Auto Nhiệm Vụ Hằng Ngày");
                                        AutoNVHN();
                                        return true;
                                    } else if (strNew.equals("att")) {
                                        GameScr.paint("Auto Tà Thú");
                                        AutoTaThu();
                                        return true;
                                    } else if (strNew.equals("ak")) {
                                        if (auto == autoTuDanh) {
                                            GameScr.paint("Tắt tự đánh");
                                            endAuto();
                                        } else {
                                            GameScr.paint("Bật tự đánh");
                                            advAR();
                                        }

                                        return true;
                                    } else if (strNew.equals("pk")) {
                                        isPk = !isPk;
                                        GameScr.paint((isPk ? " Bật " : " Tắt ") + "auto pk!");
                                        return true;
                                    } else if (strNew.equals("adv")) {
                                        advAT();
                                        GameScr.paint("Auto Danh Vọng");
                                        return true;
                                    } else if (!strNew.equals("ld") && !strNew.equals("dv")) {
                                        if (strNew.equals("nw")) {
                                            if (auto == autoLoiWin) {
                                                GameScr.paint("Tắt auto lôi đài win");
                                                LockGame.java_BK();
                                                auto = null;
                                            } else {
                                                GameScr.paint("Bật auto lôi đài win");
                                                autoLoiWin.advAA();
                                                setAuto((Auto) autoLoiWin);
                                            }

                                            return true;
                                        } else if (strNew.equals("nl")) {
                                            if (auto == autoLoiLoss) {
                                                GameScr.paint("Tắt auto lôi đài lose");
                                                LockGame.java_BK();
                                                auto = null;
                                            } else {
                                                GameScr.paint("Bật auto lôi đài lose");
                                                autoLoiLoss.advAA();
                                                setAuto((Auto) autoLoiLoss);
                                            }

                                            return true;
                                        } else if (!strNew.equals("e") && !strNew.equals("pe")) {
                                            if (strNew.equals("k")) {
                                                GameScr.paint("Chuyển Khu: " + int2);
                                                GameScr.gI();
                                                GameScr.AutoDoiKhu(int2);
                                                return true;
                                            } else if (strNew.equals("ltd")) {
                                                if (!TileMap.isTruong(TileMap.mapID) && !TileMap.isLang(TileMap.mapID)) {
                                                    GameScr.paint("Hãy đứng ở làng hoặc trường để lưu tọa độ");
                                                } else {
                                                    GameScr.advAH(5);
                                                    Service.gI().openMenu(5);
                                                    Service.gI().menu((byte) 0, 5, 1, 0);
                                                }

                                                return true;
                                            } else if (strNew.equals("nm")) {
                                                GameScr.paint("Next map: " + int2);
                                                TileMap.advAM(int2);
                                                return true;
                                            } else if (strNew.equals("gm")) {
                                                if (int2 < TileMap.mapNames.length && int2 >= 0) {
                                                    GameScr.paint("Go to: " + TileMap.mapNames[int2]);
                                                    TileMap.gomap(int2);
                                                    return true;
                                                } else {
                                                    return true;
                                                }
                                            } else if (strNew.equals("npc")) {
                                                if (int2 < Npc.arrNpcTemplate.length) {
                                                    GameScr.paint("Act NPC: " + Npc.arrNpcTemplate[int2].name);
                                                    GameScr.advAH(int2);
                                                }

                                                return true;
                                            } else if (strNew.equals("hs")) {
                                                GameScr.paint("Next to hirosaki");
                                                TileMap.gomap(1);
                                                return true;
                                            } else if (strNew.equals("hr")) {
                                                GameScr.paint("Next to haruna");
                                                TileMap.gomap(27);
                                                return true;
                                            } else if (strNew.equals("oz")) {
                                                GameScr.paint("Next to Ozawa(Oozaka)");
                                                TileMap.gomap(72);
                                                return true;
                                            } else if (strNew.equals("kj")) {
                                                GameScr.paint("Next to Kojin");
                                                TileMap.gomap(10);
                                                return true;
                                            } else if (strNew.equals("sz")) {
                                                GameScr.paint("Next to Sanzu");
                                                TileMap.gomap(17);
                                                return true;
                                            } else if (strNew.equals("tn")) {
                                                GameScr.paint("Next to Tone");
                                                TileMap.gomap(22);
                                                return true;
                                            } else if (strNew.equals("lc")) {
                                                GameScr.paint("Next to Chài");
                                                TileMap.gomap(32);
                                                return true;
                                            } else if (strNew.equals("ck")) {
                                                GameScr.paint("Next to Chakumi");
                                                TileMap.gomap(38);
                                                return true;
                                            } else if (strNew.equals("eg")) {
                                                GameScr.paint("Next to Echigo");
                                                TileMap.gomap(43);
                                                return true;
                                            } else if (strNew.equals("os")) {
                                                GameScr.paint("Next to Oshin");
                                                TileMap.gomap(48);
                                                return true;
                                            } else if (strNew.equals("mnv")) {
                                                GameScr.paint("Next to Map Nhiệm Vụ");
                                                TileMap.gomap(GameScr.getTaskMapId());
                                                return true;
                                            } else if (strNew.equals("mnvp")) {
                                                GameScr.paint("Next to Map Nhiệm Vụ Phụ");
                                                TaskOrder var27;
                                                if ((var27 = Char.getTaskOrder(0)) != null) {
                                                    TileMap.gomap(var27.mapId);
                                                }

                                                return true;
                                            } else {
                                                ItemMap var25;
                                                if (strNew.equals("add")) {
                                                    GameScr.paint("Thêm vật phẩm vào ds nhặt");
                                                    if ((var25 = Char.getMyChar().itemFocus) != null) {
                                                        ThemItemNhat(var25.template.id);
                                                    }

                                                    return true;
                                                } else if (strNew.equals("del")) {
                                                    GameScr.paint("Xóa vật phẩm khỏi ds nhặt");
                                                    if ((var25 = Char.getMyChar().itemFocus) != null) {
                                                        DelItemNhat(var25.template.id);
                                                    }

                                                    return true;
                                                } else {
                                                    ItemTemplate var23;
                                                    if (strNew.equals("ait")) {
                                                        if ((var23 = ItemTemplates.get((short) int2)) != null) {
                                                            GameScr.paint("Thêm " + var23.name + " vào ds nhặt");
                                                            ThemItemNhat(var23.id);
                                                        }

                                                        return true;
                                                    } else if (strNew.equals("dit")) {
                                                        if ((var23 = ItemTemplates.get((short) int2)) != null) {
                                                            GameScr.paint("Xóa " + var23.name + " khỏi ds nhặt");
                                                            DelItemNhat(var23.id);
                                                        }

                                                        return true;
                                                    } else if (strNew.equals("ajt")) {
                                                        if ((var23 = ItemTemplates.get((short) int2)) != null) {
                                                            GameScr.paint("Thêm " + var23.name + " vào ds nhặt");
                                                            ThemItemDel(var23.id);
                                                        }

                                                        return true;
                                                    } else if (strNew.equals("djt")) {
                                                        if ((var23 = ItemTemplates.get((short) int2)) != null) {
                                                            GameScr.paint("Xóa " + var23.name + " khỏi ds nhặt");
                                                            DelItemDel(var23.id);
                                                        }

                                                        return true;
                                                    } else if (strNew.equals("cnhat")) {
                                                        if (isAHutVP) {
                                                            GameScr.paint("Bật nhặt xa");
                                                        } else {
                                                            GameScr.paint("Bật hút VP");
                                                        }

                                                        isAHutVP = !isAHutVP;
                                                        return true;
                                                    } else if (strNew.equals("ruong")) {
                                                        GameScr.gI().doBag();
                                                        return true;
                                                    } else if (strNew.equals("vpnhat")) {
                                                        GameScr.gI().doOpenUI((int) 46);
                                                        return true;
                                                    } else if (strNew.equals("die")) {
                                                        TuSat();
                                                        return true;
                                                    } else if (strNew.equals("dcvt")) {
                                                        if (isADanhCVT) {
                                                            GameScr.paint("Tắt đánh chuyển vị trí");
                                                        } else {
                                                            GameScr.paint("Bật đánh chuyển vị trí");
                                                        }

                                                        isADanhCVT = !isADanhCVT;
                                                        if (Char.isADanhNhom) {
                                                            Service.gI().chatParty("dcvt " + (isADanhCVT ? 1 : 0));
                                                        }

                                                        return true;
                                                    } else if (strNew.equals("avt")) {
                                                        GameScr.paint("Thêm vị trí " + cxViTri.size());
                                                        cxViTri.addElement(new Integer(Char.getMyChar().cx));
                                                        cyViTri.addElement(new Integer(Char.getMyChar().cy));
                                                        if (Char.isADanhNhom) {
                                                            Service.gI().chatParty("avt " + Char.getMyChar().cx + " " + Char.getMyChar().cy);
                                                        }

                                                        return true;
                                                    } else if (strNew.equals("dvt")) {
                                                        GameScr.paint("Xóa hết vị trí");
                                                        cxViTri.removeAllElements();
                                                        cyViTri.removeAllElements();
                                                        if (Char.isADanhNhom) {
                                                            Service.gI().chatParty("dvt");
                                                        }

                                                        return true;
                                                    } else if (strNew.equals("dvtx")) {
                                                        GameScr.paint("Xóa vị trí " + int2);
                                                        cxViTri.removeElementAt(int2);
                                                        cyViTri.removeElementAt(int2);
                                                        if (Char.isADanhNhom) {
                                                            Service.gI().chatParty("dtvx " + int2);
                                                        }

                                                        return true;
                                                    } else if (strNew.equals("dck")) {
                                                        if (isADanhCK = !isADanhCK) {
                                                            GameScr.paint("Tắt đánh chuyển khu");
                                                        } else {
                                                            GameScr.paint("Bật đánh chuyển khu");
                                                            GameCanvas.inputDlg.show("Khu", new Command("Đặt", 1100090), 1);
                                                            GameCanvas.inputDlg.tfInput.setText(advAK());
                                                        }

                                                        return true;
                                                    } else if (strNew.equals("glv")) {
                                                        if (isAGiuLV) {
                                                            RMS.saveRMSInt("keepLevel", -1);
                                                            GameScr.paint("Tắt giữ lv");
                                                        } else {
                                                            RMS.saveRMSInt("keepLevel", 1);
                                                            GameScr.paint("Bật giữ lv");
                                                        }

                                                        isAGiuLV = !isAGiuLV;
                                                        return true;
                                                    } else if (strNew.equals("addn")) {
                                                        GameScr.paint("Thêm nhóm");
                                                        if ((var22 = Char.getMyChar().charFocus) != null) {
                                                            if (!advAC(var22.cName)) {
                                                                vParty.addElement(var22.cName);
                                                            }

                                                            Service.gI().addParty(var22.cName);
                                                        }

                                                        return true;
                                                    } else if (strNew.equals("cn")) {
                                                        GameScr.paint("Xóa nhóm");
                                                        cNameLeader = null;
                                                        vParty.removeAllElements();
                                                        saveParty();
                                                        return true;
                                                    } else if (strNew.equals("pt")) {
                                                        if (!Char.getMyChar().cName.equals(cNameLeader)) {
                                                            GameScr.paint("Bạn không là nhóm trưởng");
                                                            return true;
                                                        } else {
                                                            GameScr.paint("PT nhóm");

                                                            for (var4 = 0; var4 < vParty.size(); ++var4) {
                                                                if (!advAD(str = (String) vParty.elementAt(var4))) {
                                                                    Service.gI().addParty(str);
                                                                }

                                                                if (auto instanceof AutoPKBoss) {
                                                                    Service.gI().chatPrivate(str, "pkm " + auto.mapID);
                                                                    Service.gI().chatPrivate(str, "pkk " + auto.zoneID);
                                                                } else if (auto != null) {
                                                                    Service.gI().chatPrivate(str, "map " + auto.mapID);
                                                                    Service.gI().chatPrivate(str, "khu " + auto.zoneID);
                                                                }
                                                            }

                                                            return true;
                                                        }
                                                    } else if (strNew.equals("sn")) {
                                                        GameScr.paint("Lưu nhóm");
                                                        saveParty();
                                                        return true;
                                                    } else if (strNew.equals("tsn")) {
                                                        if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).charId == Char.getMyChar().charID) {
                                                            if ((var19 = Mob.findMobByLevel(int2)) == null) {
                                                                GameScr.paint("Tàn sát nhóm all");
                                                                advAB(-1, TileMap.mapID);
                                                            } else {
                                                                GameScr.paint("Tàn sát nhóm " + var19.getTemplate().name + " lv " + int2);
                                                                advAB(var19.templateId, TileMap.mapID);
                                                            }

                                                            autoTanSat.advAD = true;
                                                            Service.gI().chatParty("ts " + autoTanSat.mapID + " " + autoTanSat.zoneID + " " + autoTanSat.advAA);
                                                            return true;
                                                        } else {
                                                            GameScr.paint("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                                            return true;
                                                        }
                                                    } else if (strNew.equals("tsnx")) {
                                                        if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).charId == Char.getMyChar().charID) {
                                                            var10000 = int2 >= 0 && int2 < Mob.arrMobTemplate.length ? Mob.arrMobTemplate[int2] : null;
                                                            var17 = var10000;
                                                            if (var10000 == null) {
                                                                GameScr.paint("Tàn sát nhóm all");
                                                                advAB(-1, TileMap.mapID);
                                                            } else {
                                                                GameScr.paint("Tàn sát nhóm " + var17.name + " id " + int2);
                                                                advAB(var17.mobTemplateId, TileMap.mapID);
                                                            }

                                                            autoTanSat.advAD = true;
                                                            Service.gI().chatParty("ts " + autoTanSat.mapID + " " + autoTanSat.zoneID + " " + autoTanSat.advAA);
                                                            return true;
                                                        } else {
                                                            GameScr.paint("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                                            return true;
                                                        }
                                                    } else if (strNew.equals("tsan")) {
                                                        if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).charId == Char.getMyChar().charID) {
                                                            GameScr.paint("Tàn sát nhóm all");
                                                            advAB(-1, TileMap.mapID);
                                                            autoTanSat.advAD = true;
                                                            Service.gI().chatParty("tsa " + autoTanSat.mapID + " " + autoTanSat.zoneID);
                                                            return true;
                                                        } else {
                                                            GameScr.paint("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                                            return true;
                                                        }
                                                    } else if (strNew.equals("attn")) {
                                                        if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).charId == Char.getMyChar().charID) {
                                                            GameScr.paint("Auto Tà Thú Nhóm");
                                                            AutoTaThu();
                                                            autoTaThu.advAD = true;
                                                            Service.gI().chatParty("att " + autoTaThu.mapID + " " + autoTaThu.zoneID + " " + autoTaThu.advAA);
                                                            return true;
                                                        } else {
                                                            GameScr.paint("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                                            return true;
                                                        }
                                                    } else if (strNew.equals("buff")) {
                                                        GameScr.paint("Bật Buff HS Xa");
                                                        advAB(true, true);
                                                        return true;
                                                    } else if (strNew.equals("bux")) {
                                                        GameScr.paint("Bật Buff Xa");
                                                        advAB(true, false);
                                                        return true;
                                                    } else if (strNew.equals("hsx")) {
                                                        GameScr.paint("Bật HS Xa");
                                                        advAB(false, true);
                                                        return true;
                                                    } else {
                                                        int var18;
                                                        if (strNew.equals("cy")) {
                                                            if (auto == null) {
                                                                GameScr.paint("Bạn chưa up yên");
                                                            } else {
                                                                var18 = Char.getMyChar().yen - auto.advAJ;
                                                                int2 = (int) ((System.currentTimeMillis() - auto.advAL) / 1000L);
                                                                GameScr.paint("Up " + var18 + " trong " + NinjaUtil.getTime(int2) + " perh=" + var18 / int2 * 3600);
                                                            }

                                                            return true;
                                                        } else if (strNew.equals("clv")) {
                                                            if (auto == null) {
                                                                GameScr.paint("Bạn chưa up level");
                                                            } else {
                                                                long var31;
                                                                float var21 = (float) ((var31 = Char.getMyChar().cEXP - auto.advAK) * 10000L / GameScr.exps[Char.getMyChar().clevel]) / 100.0F;
                                                                var18 = (int) ((System.currentTimeMillis() - auto.advAL) / 1000L);
                                                                long var33;
                                                                float var26 = (float) ((var33 = var31 * 3600L / (long) var18) * 10000L / GameScr.exps[Char.getMyChar().clevel]) / 100.0F;
                                                                GameScr.paint("Up " + var31 + " - " + var21 + "% trong " + NinjaUtil.getTime(var18) + " perh=" + var33 + " - " + var26 + "%");
                                                            }

                                                            return true;
                                                        } else if (strNew.equals("st")) {
                                                            if ((var19 = Mob.findMobByLevel(int2)) == null) {
                                                                GameScr.paint("Stanima all");
                                                                advAD(-1, TileMap.mapID);
                                                            } else {
                                                                GameScr.paint("Stanima " + var19.getTemplate().name + " lv " + int2);
                                                                advAD(var19.templateId, TileMap.mapID);
                                                            }

                                                            return true;
                                                        } else if (strNew.equals("sta")) {
                                                            GameScr.paint("Stanima all");
                                                            advAD(-1, TileMap.mapID);
                                                            return true;
                                                        } else if (strNew.equals("stn")) {
                                                            if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).charId == Char.getMyChar().charID) {
                                                                if ((var19 = Mob.findMobByLevel(int2)) == null) {
                                                                    GameScr.paint("Stanima nhóm all");
                                                                    advAD(-1, TileMap.mapID);
                                                                } else {
                                                                    GameScr.paint("Stanima nhóm " + var19.getTemplate().name + " lv " + int2);
                                                                    advAD(var19.templateId, TileMap.mapID);
                                                                }

                                                                autoStanima.advAD = true;
                                                                Service.gI().chatParty("st " + autoStanima.mapID + " " + autoStanima.zoneID + " " + autoStanima.advAB);
                                                                return true;
                                                            } else {
                                                                GameScr.paint("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                                                return true;
                                                            }
                                                        } else if (strNew.equals("stan")) {
                                                            if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).charId == Char.getMyChar().charID) {
                                                                GameScr.paint("Stanima nhóm all");
                                                                advAD(-1, TileMap.mapID);
                                                                autoStanima.advAD = true;
                                                                Service.gI().chatParty("sta " + autoStanima.mapID + " " + autoStanima.zoneID);
                                                                return true;
                                                            } else {
                                                                GameScr.paint("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                                                return true;
                                                            }
                                                        } else if (strNew.equals("stx")) {
                                                            var10000 = int2 >= 0 && int2 < Mob.arrMobTemplate.length ? Mob.arrMobTemplate[int2] : null;
                                                            var17 = var10000;
                                                            if (var10000 == null) {
                                                                GameScr.paint("Tàn sát all");
                                                                advAB(-1, TileMap.mapID);
                                                            } else {
                                                                GameScr.paint("Tàn sát " + var17.name + " id " + int2);
                                                                advAD(var17.mobTemplateId, TileMap.mapID);
                                                            }

                                                            return true;
                                                        } else if (!strNew.equals("stnx")) {
                                                            if (!strNew.equals("sts")) {
                                                                if (strNew.equals("stb")) {
                                                                    if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).charId != Char.getMyChar().charID) {
                                                                        if (Char.getMyChar().nClass.classId != 6) {
                                                                            GameScr.paint("Bạn không phải là quạt");
                                                                            return true;
                                                                        } else {
                                                                            GameScr.paint("Stanima Buff HS");
                                                                            advAA(true, true);
                                                                            return true;
                                                                        }
                                                                    } else {
                                                                        GameScr.paint("Chưa có nhóm hoặc bạn là nhóm trưởng");
                                                                        return true;
                                                                    }
                                                                } else if (strNew.equals("stbx")) {
                                                                    if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).charId != Char.getMyChar().charID) {
                                                                        if (Char.getMyChar().nClass.classId != 6) {
                                                                            GameScr.paint("Bạn không phải là quạt");
                                                                            return true;
                                                                        } else {
                                                                            GameScr.paint("Stanima Buff");
                                                                            advAA(true, false);
                                                                            return true;
                                                                        }
                                                                    } else {
                                                                        GameScr.paint("Chưa có nhóm hoặc bạn là nhóm trưởng");
                                                                        return true;
                                                                    }
                                                                } else if (strNew.equals("sths")) {
                                                                    if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).charId != Char.getMyChar().charID) {
                                                                        if (Char.getMyChar().nClass.classId != 6) {
                                                                            GameScr.paint("Bạn không phải là quạt");
                                                                            return true;
                                                                        } else {
                                                                            GameScr.paint("Stanima HS");
                                                                            advAA(false, true);
                                                                            return true;
                                                                        }
                                                                    } else {
                                                                        GameScr.paint("Chưa có nhóm hoặc bạn là nhóm trưởng");
                                                                        return true;
                                                                    }
                                                                } else if (strNew.equals("pkb")) {
                                                                    GameScr.paint("PK Thần Thú");
                                                                    setAuto((Auto) (new AutoPKBoss(TileMap.mapID)));
                                                                    if (cNameLeader != null && Char.getMyChar().cName.equals(cNameLeader) && GameScr.vParty.size() > 1) {
                                                                        Service.gI().chatParty("pkm " + TileMap.mapID);
                                                                    }

                                                                    return true;
                                                                } else if (strNew.equals("pkk")) {
                                                                    GameScr.paint("PK Thần Thú");
                                                                    AutoPKBoss var30;
                                                                    (var30 = new AutoPKBoss(TileMap.mapID)).zoneID = int2;
                                                                    setAuto((Auto) var30);
                                                                    if (cNameLeader != null && Char.getMyChar().cName.equals(cNameLeader) && GameScr.vParty.size() > 1) {
                                                                        Service.gI().chatParty("pkm " + TileMap.mapID);
                                                                        Service.gI().chatParty("pkk " + int2);
                                                                    }

                                                                    return true;
                                                                } else if (strNew.equals("lb")) {
                                                                    str = "";

                                                                    for (int2 = 0; int2 < GameScr.vMob.size(); ++int2) {
                                                                        Mob var29;
                                                                        if ((var29 = (Mob) GameScr.vMob.elementAt(int2)).isBoss) {
                                                                            str = str + var29.getTemplate().name + " lv: " + var29.level + ", ";
                                                                        }
                                                                    }

                                                                    GameScr.paint("Mob: " + str);
                                                                    return true;
                                                                } else if (strNew.equals("tb")) {
                                                                    (new Thread(new AutoTimBoss())).start();
                                                                    return true;
                                                                } else if (strNew.equals("asell")) {
                                                                    if (auto != null && auto instanceof AutoSellPro) {
                                                                        GameScr.paint("Tắt Auto Sell");
                                                                        endAuto();
                                                                    } else if (!AutoSellPro.sellerAA.isEmpty()) {
                                                                        GameScr.paint("Bật Auto Sell");
                                                                        AutoSellPro.sellerAO().update();
                                                                        setAuto((Auto) AutoSellPro.sellerAO());
                                                                    } else {
                                                                        GameCanvas.startOKDlg("Bạn chưa đặt giá vật phẩm nào");
                                                                    }

                                                                    return true;
                                                                } else if (strNew.equals("h")) {
                                                                    Calendar var28 = advAH(0);
                                                                    GameScr.paint("Time " + var28.get(11) + ":" + var28.get(12) + ":" + var28.get(13));
                                                                    return true;
                                                                } else if (strNew.equals("dt")) {
                                                                    setAuto((Auto) (new AutoDanTre()));
                                                                    return true;
                                                                } else if (strNew.equals("dh")) {
                                                                    setAuto((Auto) (new AutoDanhHeo()));
                                                                    return true;
                                                                } else if (strNew.equals("nv")) {
                                                                    setAuto((Auto) (new AutoTraNV()));
                                                                    return true;
                                                                } else if (strNew.equals("f")) {
                                                                    GameScr.gI().doOpenUI(int2);
                                                                    return true;
                                                                } else if (str.equals("hd9x")) {
                                                                    GameScr.paint("Hang động 9x");
                                                                    setAuto((Auto) (new AutoHd9x()));
                                                                    if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).charId == Char.getMyChar().charID) {
                                                                        Service.gI().chatParty("hd9x");
                                                                    }

                                                                    return true;
                                                                } else {
                                                                    if (str.length() == 4) {
                                                                        if (str.equals("as10")) {
                                                                            setAuto((Auto) (new As10()));
                                                                            return true;
                                                                        }

                                                                        if (str.equals("as20")) {
                                                                            setAuto((Auto) (new As20(0)));
                                                                            return true;
                                                                        }

                                                                        if (str.equals("a20k")) {
                                                                            setAuto((Auto) (new As20(1)));
                                                                            return true;
                                                                        }

                                                                        if (str.equals("a20t")) {
                                                                            setAuto((Auto) (new As20(2)));
                                                                            return true;
                                                                        }

                                                                        if (str.equals("a20u")) {
                                                                            setAuto((Auto) (new As20(3)));
                                                                            return true;
                                                                        }

                                                                        if (str.equals("a20c")) {
                                                                            setAuto((Auto) (new As20(4)));
                                                                            return true;
                                                                        }

                                                                        if (str.equals("a20d")) {
                                                                            setAuto((Auto) (new As20(5)));
                                                                            return true;
                                                                        }

                                                                        if (str.equals("a20q")) {
                                                                            setAuto((Auto) (new As20(6)));
                                                                            return true;
                                                                        }
                                                                    } else {
                                                                        if (strNew.equals("boss")) {
                                                                            GameScr.paint("Auto Boss " + int2);
                                                                            setAuto((Auto) (new AutoChoBoss(int2)));
                                                                            return true;
                                                                        }

                                                                        if (strNew.equals("kpk")) {
                                                                            GameScr.paint("Khu PK " + int2);
                                                                            Auto.advAR = int2;
                                                                            return true;
                                                                        }

                                                                        if (strNew.equals("cpk")) {
                                                                            GameScr.paint("Xóa ds PK");
                                                                            SavePK.advAB();
                                                                            return true;
                                                                        }

                                                                        String[] var6;
                                                                        if (str.startsWith("apk")) {
                                                                            if ((var6 = split(str, " ")).length > 1) {
                                                                                GameScr.paint("Thêm " + var6[1] + " vào ds PK");
                                                                                SavePK.advAA(var6[1]);
                                                                            } else if (Char.getMyChar().charFocus != null) {
                                                                                GameScr.paint("Thêm " + Char.getMyChar().charFocus.cName + " vào ds PK");
                                                                                SavePK.advAA(Char.getMyChar().charFocus.cName);
                                                                            }

                                                                            return true;
                                                                        }

                                                                        if (str.startsWith("dpk")) {
                                                                            if ((var6 = split(str, " ")).length > 1) {
                                                                                GameScr.paint("Xóa " + var6[1] + " khỏi ds PK");
                                                                                SavePK.advAB(var6[1]);
                                                                            } else if (Char.getMyChar().charFocus != null) {
                                                                                GameScr.paint("Xóa " + Char.getMyChar().charFocus.cName + " khỏi ds PK");
                                                                                SavePK.advAB(Char.getMyChar().charFocus.cName);
                                                                            }

                                                                            return true;
                                                                        }

                                                                        if (strNew.equals("chs")) {
                                                                            GameScr.paint("Xóa ds HS");
                                                                            advAW();
                                                                            return true;
                                                                        }

                                                                        if (str.startsWith("ahs")) {
                                                                            if ((var6 = split(str, " ")).length > 1) {
                                                                                GameScr.paint("Thêm " + var6[1] + " vào ds HS");
                                                                                advAI(var6[1]);
                                                                            } else if (Char.getMyChar().charFocus != null) {
                                                                                GameScr.paint("Thêm " + Char.getMyChar().charFocus.cName + " vào ds HS");
                                                                                advAI(Char.getMyChar().charFocus.cName);
                                                                            }

                                                                            return true;
                                                                        }

                                                                        if (strNew.equals("dhs")) {
                                                                            if ((var6 = split(str, " ")).length > 1) {
                                                                                GameScr.paint("Xóa " + var6[1] + " khỏi ds HS");
                                                                                advAJ(var6[1]);
                                                                            } else if (Char.getMyChar().charFocus != null) {
                                                                                GameScr.paint("Xóa " + Char.getMyChar().charFocus.cName + " khỏi ds PK");
                                                                                advAJ(Char.getMyChar().charFocus.cName);
                                                                            }

                                                                            return true;
                                                                        }

                                                                        if (str.startsWith("a20s")) {
                                                                            if ((var6 = split(str, " ")).length > 1) {
                                                                                setAuto((Auto) (new As20S(var6[1])));
                                                                            }

                                                                            return true;
                                                                        }

                                                                        ItemTemplate var7;
                                                                        ItemTemplate itemTemplate;
                                                                        if (str.startsWith("dg")) {
                                                                            String[] str5;
                                                                            if ((str5 = split(str, " ")).length >= 4) {
                                                                                try {
                                                                                    itemTemplate = ItemTemplates.get(Short.parseShort(str5[1]));
                                                                                    String str6 = str5[2].trim();
                                                                                    int2 = Integer.parseInt(str5[3]);
                                                                                    if (itemTemplate != null && str6.length() > 0 && int2 > 0) {
                                                                                        AutoSellPro.sellerAA.put(str6, new ItemSell(itemTemplate, int2, str6));
                                                                                        AutoSellPro.sellerAN();
                                                                                        GameScr.paint("Mã VP: " + str6 + " (" + itemTemplate.name + ") bán: " + NinjaUtil.numberToString(String.valueOf(int2)) + "xu/1cái");
                                                                                    } else if (itemTemplate == null) {
                                                                                        GameCanvas.startOKDlg("Vật phẩm có id: " + str5[1] + " ko tồn tại!");
                                                                                        return true;
                                                                                    }

                                                                                    return true;
                                                                                } catch (Exception ex) {
                                                                                }
                                                                            }

                                                                            GameCanvas.startOKDlg("Cú pháp sai! Hãy chat đúng:\n''dg idvp mãvp giábán''");
                                                                            return true;
                                                                        }
                                                                        int var20;
                                                                        if (str.startsWith("asw")) {
                                                                            var6 = split(str, " ");

                                                                            try {
                                                                                int2 = Integer.parseInt(var6[1]);
                                                                                var20 = Integer.parseInt(var6[2]);
                                                                                ItemTemplate var32 = ItemTemplates.get((short) int2);
                                                                                GameScr.paint("Thêm: " + var32.name + " giá: " + var20 + " vào ds bán Shinwa");
                                                                                advAC(int2, var20);
                                                                            } catch (NumberFormatException var11) {
                                                                            }

                                                                            return true;
                                                                        }

                                                                        if (str.startsWith("rsw")) {
                                                                            var6 = split(str, " ");

                                                                            try {
                                                                                var7 = ItemTemplates.get((short) (int2 = Integer.parseInt(var6[1])));
                                                                                if (advAE(int2)) {
                                                                                    var18 = advAF(int2);
                                                                                    GameScr.paint("Xóa: " + var7.name + " giá: " + var18 + " khỏi ds bán Shinwa");
                                                                                    TatTuBanShinwa(int2);
                                                                                } else {
                                                                                    GameScr.paint("Item " + var7.name + " chưa có trong ds bán Shinwa");
                                                                                }
                                                                            } catch (NumberFormatException var12) {
                                                                            }

                                                                            return true;
                                                                        }

                                                                        if (str.startsWith("tnx")) {
                                                                            if (TileMap.isTruong(TileMap.mapID)) {
                                                                                var6 = split(str, " ");

                                                                                try {
                                                                                    int2 = Integer.parseInt(var6[1]);
                                                                                } catch (NumberFormatException var15) {
                                                                                    return false;
                                                                                }

                                                                                int var8;
                                                                                try {
                                                                                    var8 = Integer.parseInt(var6[2]);
                                                                                } catch (NumberFormatException var14) {
                                                                                    var8 = 0;
                                                                                }

                                                                                var20 = var8;

                                                                                try {
                                                                                    var8 = Integer.parseInt(var6[3]);
                                                                                } catch (NumberFormatException var13) {
                                                                                    var8 = 0;
                                                                                }

                                                                                GameScr.paint("Auto làm " + int2 + " tiên nữ");
                                                                                (new Thread(new AutoNPC(int2, var20, var8))).start();
                                                                                return true;
                                                                            }

                                                                            GameScr.paint("Hãy đứng Trường để auto làm tiên nữ");
                                                                        }
                                                                    }

                                                                    return false;
                                                                }
                                                            } else {
                                                                if (auto != null && auto instanceof AutoStanima) {
                                                                    GameScr.paint("Step Stanima");
                                                                    autoStanima.advAA();
                                                                    if (Char.getMyChar().cName.equals(cNameLeader) && GameScr.vParty.size() > 0) {
                                                                        Service.gI().chatParty("sts");
                                                                    }
                                                                } else {
                                                                    GameScr.paint("Chưa bật chức năng Stanima");
                                                                }

                                                                return true;
                                                            }
                                                        } else if (GameScr.vParty.size() > 0 && ((Party) GameScr.vParty.firstElement()).charId == Char.getMyChar().charID) {
                                                            var10000 = int2 >= 0 && int2 < Mob.arrMobTemplate.length ? Mob.arrMobTemplate[int2] : null;
                                                            var17 = var10000;
                                                            if (var10000 == null) {
                                                                GameScr.paint("Stanima nhóm all");
                                                                advAD(-1, TileMap.mapID);
                                                            } else {
                                                                GameScr.paint("Stanima nhóm " + var17.name + " id " + int2);
                                                                advAD(var17.mobTemplateId, TileMap.mapID);
                                                            }

                                                            autoStanima.advAD = true;
                                                            Service.gI().chatParty("st " + autoStanima.mapID + " " + autoStanima.zoneID + " " + autoStanima.advAB);
                                                            return true;
                                                        } else {
                                                            GameScr.paint("Chưa có nhóm hoặc bạn không là nhóm trưởng");
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            GameScr.paint("End Auto");
                                            endAuto();
                                            if (Char.isADanhNhom) {
                                                Service.gI().chatParty("pe");
                                            }

                                            return true;
                                        }
                                    } else {
                                        Display.getDisplay(GameMidlet.instance).setCurrent(FormDanhVong.advAB());
                                        return true;
                                    }
                                }
                            }
                        }
                    } else {
                        GameScr.paint("Phá băng");
                        bosstape = false;
                        skilltape = false;
                        return true;
                    }
                } else {
                    GameScr.paint("Băng skill");
                    skilltape = true;
                    return true;
                }
            } else {
                GameScr.paint("Băng boss");
                bosstape = true;
                return true;
            }
        } else {
            GameScr.paint("Đóng băng");
            bosstape = true;
            skilltape = true;
            return true;
        }
    }

    private static void advAZ() {
        while (true) {
            int var7 = 0;

            int var9;
            Item var10000;
            while (true) {
                if (var7 >= Char.getMyChar().arrItemBody.length) {
                    var10000 = null;
                    break;
                }

                if (Char.getMyChar().arrItemBody[var7] != null && advAE(Char.getMyChar().arrItemBody[var7])) {
                    Item var8 = Char.getMyChar().arrItemBody[var7];

                    for (var9 = var7 + 1; var9 < Char.getMyChar().arrItemBody.length; ++var9) {
                        if (Char.getMyChar().arrItemBody[var9] != null && advAE(Char.getMyChar().arrItemBody[var9]) && Char.getMyChar().arrItemBody[var9].upgrade < var8.upgrade) {
                            var8 = Char.getMyChar().arrItemBody[var9];
                        }
                    }

                    var10000 = var8;
                    break;
                }

                ++var7;
            }

            Item var0 = var10000;
            if (var10000 == null) {
                if (Char.isALuyenDa) {
                    advAA(Char.aLuyenDaValue - 1, true);
                }

                return;
            }

            if (var0.upgrade == upgrade_2.gI().advAK - 1) {
                advAE(var0.upgrade, upgrade_2.gI().advAI);
                return;
            }

            if (var0.upgrade == upgrade_2.gI().advAN + 1) {
                advAE(var0.upgrade, upgrade_2.gI().advAI);
                return;
            }

            if (var0.upgrade == upgrade_2.gI().advAM) {
                advAE(var0.upgrade, advCI);
                return;
            }

            int var2;
            int var3;
            if (var0.upgrade == upgrade_2.gI().advAN) {
                if (var0.isTypeWeapon()) {
                    var2 = upgrade_2.gI().advAI;
                    var3 = upgrade_2.gI().advAM;
                } else {
                    var2 = upgrade_2.gI().advAO - 10;
                    var3 = upgrade_2.gI().advAI;
                }
            } else if (var0.upgrade == upgrade_2.gI().advAI) {
                var2 = upgrade_2.gI().advAJ;
                var3 = upgrade_2.gI().advAO - 10;
            } else if (var0.upgrade == upgrade_2.gI().advAJ + 1) {
                var2 = upgrade_2.gI().advAJ;
                if (var0.isTypeWeapon()) {
                    var3 = upgrade_2.gI().advAO - 10;
                } else {
                    var3 = upgrade_2.gI().advAJ;
                }
            } else if (var0.upgrade == upgrade_2.gI().advAJ) {
                var2 = upgrade_2.gI().advAH - 10;
                var3 = upgrade_2.gI().advAJ;
            } else if (var0.upgrade == upgrade_2.gI().advAH - 10) {
                var2 = upgrade_2.gI().advAL;
                var3 = upgrade_2.gI().advAJ;
            } else if (var0.upgrade == upgrade_2.gI().advAL) {
                if (var0.isTypeWeapon()) {
                    var2 = upgrade_2.gI().advAG + 1;
                } else {
                    var2 = upgrade_2.gI().advAG;
                }

                var3 = upgrade_2.gI().advAJ;
            } else {
                var2 = upgrade_2.gI().advAG;
                var3 = upgrade_2.gI().advAJ;
            }

            upgrade_1 var1;
            int var4 = (var1 = new upgrade_1(var0)).advAA;
            int var5 = var1.advAB;
            int var6 = var1.advAC;
            var7 = var3;
            int var11 = var2;
            int var15 = 0;

            for (var9 = 0; var9 < Char.getMyChar().arrItemBag.length; ++var9) {
                Item var10;
                if ((var10 = Char.getMyChar().arrItemBag[var9]) != null && var10.template.type == 26 && var10.template.id >= var11 && var10.template.id <= var7) {
                    var15 += GameScr.crystals[var10.template.id];
                }
            }

            if ((float) (var15 * 100 / var4) >= (float) var6 && var5 <= Char.getMyChar().yen) {
                GameScr.indexSelect = var0.indexUI;
                Service.gI().itemBodyToBag(var0.indexUI);
                Item var12;
                if (LockGame.advAQ() && advCH >= 0 && (var12 = Char.getMyChar().arrItemBag[advCH]) != null) {
                    advCH = -1;
                    if (TileMap.isTruong(TileMap.mapID)) {
                        if ((var0 = Char.getBagItem(37)) == null && (var0 = Char.getBagItem(35)) == null) {
                            GameScr.pickNPC(4, 0, 0);
                            Service.gI().muaItem(9, 6, 1);
                            LockGame.advAG();
                            Auto.sleep(100L);
                            var0 = Char.getBagItem(35);
                        }

                        if (var0 != null) {
                            Service.gI().useItemChangeMap(var0.indexUI, 5);
                            TileMap.advAF();
                        }
                    }

                    if (TileMap.isLang(TileMap.mapID)) {
                        GameScr.pickNPC(upgrade_2.gI().advAI, upgrade_2.gI().advAG, upgrade_2.gI().advAG);
                        LockGame.advAQ();
                        GameScr.itemUpGrade = var12;
                        Char.getMyChar().arrItemBag[var12.indexUI] = null;
                        GameScr.arrItemUpGrade = new Item[18];
                        int var13 = 0;
                        var5 = 0;
                        float var14 = 0.0F;

                        for (var15 = 0; var15 < Char.getMyChar().arrItemBag.length; ++var15) {
                            Item var16;
                            if ((var16 = Char.getMyChar().arrItemBag[var15]) != null && var16.template.type == 26 && var16.template.id >= var2 && var16.template.id <= var3) {
                                GameScr.indexSelect = var16.indexUI;
                                GameScr.arrItemUpGrade[var13] = var16;
                                Char.getMyChar().arrItemBag[var15] = null;
                                if ((var14 = (float) ((var5 += GameScr.crystals[var16.template.id]) * 100 / var4)) >= (float) var6 || var13 >= 17) {
                                    break;
                                }

                                ++var13;
                            }
                        }

                        if (var14 > 0.0F) {
                            Auto.sleep(1000L);
                            Service.gI().upgradeItem(GameScr.itemUpGrade, GameScr.arrItemUpGrade);
                            if (LockGame.advAQ()) {
                                Auto.sleep(1000L);
                            }
                        }

                        if (GameScr.isPaintUI()) {
                            GameScr.gI().resetButton();
                        }

                        if (Char.getMyChar().arrItemBag[var12.indexUI] != null) {
                            GameScr.indexSelect = var12.indexUI;
                            Service.gI().useItem(var12.indexUI);
                            if (LockGame.advAQ()) {
                                Auto.sleep(1000L);
                                continue;
                            }
                        }

                        return;
                    }
                } else if (advCH >= 0) {
                    var12 = Char.getMyChar().arrItemBag[advCH];
                    advCH = -1;
                    if (var12 != null && var12.template.id == var0.template.id) {
                        Service.gI().useItem(var12.indexUI);
                        LockGame.advAQ();
                        return;
                    }
                }
            } else if (var2 > 0) {
                advAA(var2, false);
            }

            return;
        }
    }

    private static void advAE(int var0, int var1) {
        MyVector var2 = new MyVector();
        int var3 = 0;
        int var4 = 0;

        int var5;
        Item var6;
        for (var5 = 0; var5 < Char.getMyChar().arrItemBody.length; ++var5) {
            if ((var6 = Char.getMyChar().arrItemBody[var5]) != null && var6.upgrade == var0 && advAE(var6)) {
                var2.addElement(var6);
                upgrade_1 var7 = new upgrade_1(var6);
                var4 += var7.advAB;
                if (var0 == upgrade_2.gI().advAK - 1) {
                    if (var6.isTypeClothe()) {
                        var3 += upgrade_2.gI().advAG + 1;
                    } else if (var6.isTypeAdorn()) {
                        var3 += upgrade_2.gI().advAL;
                    } else if (var6.isTypeWeapon()) {
                        var3 += upgrade_2.gI().advAJ;
                    }
                } else if (var0 == upgrade_2.gI().advAN + 1) {
                    if (!var6.isTypeClothe() && !var6.isTypeAdorn()) {
                        if (var6.isTypeWeapon()) {
                            var3 += upgrade_2.gI().advAH - 10;
                        }
                    } else {
                        var3 += upgrade_2.gI().advAL - 1;
                    }
                } else if (var0 == upgrade_2.gI().advAM) {
                    if (var1 == upgrade_2.gI().advAI) {
                        if (!var6.isTypeClothe() && !var6.isTypeAdorn()) {
                            if (var6.isTypeWeapon()) {
                                var3 += upgrade_2.gI().advAL;
                            }
                        } else {
                            var3 += upgrade_2.gI().advAG + 1;
                        }
                    } else if (var6.isTypeClothe()) {
                        var3 += upgrade_2.gI().advAL;
                    } else if (var6.isTypeAdorn()) {
                        var3 += upgrade_2.gI().advAH - 10;
                    } else if (var6.isTypeWeapon()) {
                        var3 += upgrade_2.gI().advAM;
                    }
                }
            }
        }

        int var8 = 0;

        int var9;
        Item var10;
        for (var9 = 0; var9 < Char.getMyChar().arrItemBag.length; ++var9) {
            if ((var10 = Char.getMyChar().arrItemBag[var9]) != null && var10.template.type == 26 && var10.template.id == var1) {
                ++var8;
            }
        }

        if (var3 > 0 && var8 >= var3 && var4 <= Char.getMyChar().yen) {
            if (TileMap.isTruong(TileMap.mapID)) {
                if ((var6 = Char.getBagItem(37)) == null && (var6 = Char.getBagItem(35)) == null) {
                    GameScr.pickNPC(4, 0, 0);
                    Service.gI().muaItem(9, 6, 1);
                    LockGame.advAG();
                    Auto.sleep(100L);
                    var6 = Char.getBagItem(35);
                }

                if (var6 != null) {
                    Service.gI().useItemChangeMap(var6.indexUI, 5);
                    TileMap.advAF();
                }
            }

            if (TileMap.isLang(TileMap.mapID)) {
                for (var0 = 0; var0 < var2.size(); ++var0) {
                    var6 = (Item) var2.elementAt(var0);
                    upgrade_1 var11;
                    var4 = (var11 = new upgrade_1(var6)).advAA;
                    var5 = var11.advAB;
                    var3 = var11.advAC;
                    var8 = 0;

                    for (var9 = 0; var9 < Char.getMyChar().arrItemBag.length; ++var9) {
                        if ((var10 = Char.getMyChar().arrItemBag[var9]) != null && var10.template.type == 26 && var10.template.id == var1) {
                            var8 += GameScr.crystals[var10.template.id];
                        }
                    }

                    if ((float) (var8 * 100 / var4) >= (float) var3 && var5 <= Char.getMyChar().yen) {
                        GameScr.indexSelect = var6.indexUI;
                        Service.gI().itemBodyToBag(var6.indexUI);
                        Item var12;
                        if (!LockGame.advAQ() || advCH < 0 || (var12 = Char.getMyChar().arrItemBag[advCH]) == null) {
                            if (advCH >= 0) {
                                var12 = Char.getMyChar().arrItemBag[advCH];
                                advCH = -1;
                                if (var12 != null && var12.template.id == var6.template.id) {
                                    Service.gI().useItem(var12.indexUI);
                                    LockGame.advAQ();
                                }
                            }

                            return;
                        }

                        advCH = -1;
                        GameScr.pickNPC(upgrade_2.gI().advAI, upgrade_2.gI().advAG, upgrade_2.gI().advAG);
                        LockGame.advAQ();
                        GameScr.itemUpGrade = var12;
                        Char.getMyChar().arrItemBag[var12.indexUI] = null;
                        GameScr.arrItemUpGrade = new Item[18];
                        var5 = 0;
                        int var13 = 0;
                        float var14 = 0.0F;

                        for (var9 = 0; var9 < Char.getMyChar().arrItemBag.length; ++var9) {
                            if ((var10 = Char.getMyChar().arrItemBag[var9]) != null && var10.template.type == 26 && var10.template.id == var1) {
                                GameScr.indexSelect = var10.indexUI;
                                GameScr.arrItemUpGrade[var5] = var10;
                                Char.getMyChar().arrItemBag[var9] = null;
                                if ((var14 = (float) ((var13 += GameScr.crystals[var10.template.id]) * 100 / var4)) >= (float) var3 || var5 >= 17) {
                                    break;
                                }

                                ++var5;
                            }
                        }

                        if (var14 > 0.0F) {
                            Auto.sleep(1000L);
                            Service.gI().upgradeItem(GameScr.itemUpGrade, GameScr.arrItemUpGrade);
                            if (LockGame.advAQ()) {
                                Auto.sleep(1000L);
                            }
                        }

                        if (GameScr.isPaintUI()) {
                            GameScr.gI().resetButton();
                        }

                        if (Char.getMyChar().arrItemBag[var12.indexUI] != null) {
                            GameScr.indexSelect = var12.indexUI;
                            Service.gI().useItem(var12.indexUI);
                            if (LockGame.advAQ()) {
                                Auto.sleep(1000L);
                            }
                        }
                    }
                }

                return;
            }
        } else {
            advAA(var1, false);
        }

    }

    private static void advAA(int var0, boolean var1) {
        int var2 = Char.getBagNum();
        boolean var3 = TileMap.isTruong(TileMap.mapID);
        Char var4 = Char.getMyChar();
        if (var2 > 0 && var4.ctaskId > 9) {
            int var5 = 0;

            boolean var10000;
            while (true) {
                if (var5 >= var0) {
                    var10000 = false;
                    break;
                }

                if (Char.getBagNum(var5) >= 4) {
                    var10000 = true;
                    break;
                }

                ++var5;
            }

            if (var10000) {
                if (var3) {
                    Item var9;
                    if ((var9 = Char.getBagItem(37)) == null && (var9 = Char.getBagItem(35)) == null) {
                        GameScr.pickNPC(4, 0, 0);
                        Service.gI().muaItem(9, 6, 1);
                        LockGame.advAG();
                        Auto.sleep(100L);
                        var9 = Char.getBagItem(35);
                    }

                    if (var9 != null) {
                        Service.gI().useItemChangeMap(var9.indexUI, 5);
                        TileMap.advAF();
                    }
                }

                if (TileMap.isLang(TileMap.mapID)) {
                    GameScr.pickNPC(6, 1, 1);
                    LockGame.advAQ();
                    Vector var10 = new Vector();

                    int var6;
                    Item var7;
                    label132:
                    for (var6 = 0; var6 < var0; ++var6) {
                        var10.removeAllElements();

                        for (var5 = 0; var5 < var4.arrItemBag.length; ++var5) {
                            if ((var7 = var4.arrItemBag[var5]) != null && var7.template.id == var6) {
                                var10.addElement(var7);
                            }
                        }

                        while (var10.size() >= 4) {
                            var5 = 1;

                            int var11;
                            for (var11 = var6; var11 < var0 && GameScr.coinUpCrystals[var11] <= var4.yen && var5 << 2 <= var10.size() && var5 < 16; ++var11) {
                                var5 <<= 2;
                            }

                            if (var5 == 1) {
                                break label132;
                            }

                            GameScr.arrItemUpPeal = new Item[24];

                            for (var11 = 0; var11 < var5; ++var11) {
                                Item var8 = (Item) var10.elementAt(0);
                                GameScr.arrItemUpPeal[var11] = var8;
                                var4.arrItemBag[var8.indexUI] = null;
                                var10.removeElementAt(0);
                            }

                            Service.gI().crystalCollectLockNomsg(GameScr.arrItemUpPeal);
                            LockGame.advAA();
                            if (GameScr.arrItemUpPeal[0] != null) {
                                var4.arrItemBag[GameScr.arrItemUpPeal[0].indexUI] = GameScr.arrItemUpPeal[0];
                            }
                        }
                    }

                    if (GameScr.isPaintUI()) {
                        GameScr.gI().resetButton();
                        Auto.sleep(1000L);
                    }

                    if (var1) {
                        if (Char.getMyChar().arrItemBox == null) {
                            Service.gI().requestItem(4);
                            LockGame.advAS();
                        }

                        if ((var6 = Char.getBoxNum()) > 0) {
                            GameScr.pickNPC(5, 0, 0);
                            if (AutoDanhVong.advAE()) {
                                GameScr.pickNPC(5, 0, 0);
                            }

                            if (AutoDanhVong.advAG()) {
                                for (int var12 = 0; var12 < var4.arrItemBag.length; ++var12) {
                                    if ((var7 = var4.arrItemBag[var12]) != null && var7.template.id == var0) {
                                        Service.gI().itemBagToBox(var7.indexUI);
                                        AutoDanhVong.advAA();
                                        --var6;
                                    }

                                    if (var6 <= 0) {
                                        break;
                                    }
                                }
                            }

                            if (GameScr.isPaintUI()) {
                                GameScr.gI().resetButton();
                                Auto.sleep(1000L);
                            }
                        }
                    }

                    Service.gI().bagSort();
                    LockGame.advAQ();
                    if (var3) {
                        Auto.advAP();
                    }
                }
            }
        }

    }

    private static boolean advAE(Item var0) {
        if (var0.template.type >= 0 && var0.template.type <= 9) {
            return var0.upgrade < CapDoValue && var0.getUpMax() >= CapDoValue && var0.upgrade < var0.getUpMax();
        } else {
            return false;
        }
    }

    public static void advAG(String var0) {
        for (int var1 = 0; var1 < advCY.length; ++var1) {
            advAA(var0, advCY[var1].trim());
        }

    }

    public static void advAA(String var0, String var1) {
        ChatManager.gI().addChat(var0, Char.getMyChar().cName, var1);
        Service.gI().chatPrivate(var0, var1);

        try {
            Thread.sleep(20L);
        } catch (InterruptedException var2) {
        }
    }

    private static String advAK(String var0) {
        InputNE var5 = new InputNE(RMS.advAA("/" + var0));
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();

        try {
            byte[] var3 = new byte[1024];

            int var2;
            while ((var2 = var5.read(var3)) != -1) {
                var1.write(var3, 0, var2);
            }

            var0 = new String(var1.toByteArray(), "UTF-8");
        } catch (Exception var4) {
            var0 = "";
        }

        return var0;
    }

    public final void advAO() {
        if (System.currentTimeMillis() - this.advDB > 60000L) {
            this.advDB = System.currentTimeMillis();
            MyVector var1;
            (var1 = new MyVector()).addElement(Char.getMyChar());
            Service.gI().sendPlayerAttack((MyVector) (new MyVector()), (MyVector) var1, (int) 2);
        }

    }

    public static void advAH(String var0) {
        if (System.currentTimeMillis() - advCZ >= 5000L) {
            advCZ = System.currentTimeMillis();
            Calendar var1 = advAH(0);
            var0 = "@" + (10 + advDA.nextInt(89)) + " " + var0 + " " + var1.get(11) + ":" + var1.get(12) + ":" + var1.get(13);
            Service.gI().chat(var0);
        }
    }

    public static Calendar advAH(int var0) {
        Calendar var1 = Calendar.getInstance();
        if (var0 == 0) {
            var1.setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
        }

        return var1;
    }

    public static Calendar MuiGio() {
        Calendar var0;
        (var0 = Calendar.getInstance()).setTimeZone(TimeZone.getTimeZone("Asia/Ho_Chi_Minh"));
        return var0;
    }

    public static String advAA(int[] var0) {
        int var1 = var0.length - 1;
        int var2 = 0;
        StringBuffer var3 = new StringBuffer();

        for (int var4 = 0; var4 < var1; ++var4) {
            var2 += var0[var4];
            var3.append((char) (var0[var4] - var1));
        }

        return (var2 - var0[var1]) % var1 == 0 ? var3.toString() : null;
    }

    public static void sellerAB(String var0, String var1) {
        var1 = "@" + randomz(10, 99) + ": " + var1;
        ChatManager.gI().addChat(var0, Char.getMyChar().cName, var1);
        Service.gI().chatPrivate(var0, var1);
    }

    private void sellerBB() {
        if (System.currentTimeMillis() - this.sellerDH >= 45000L) {
            this.sellerDH = System.currentTimeMillis();
            sellerAJ(sellerDG[randomz(0, sellerDG.length - 1)]);
        }

    }

    public static String sellerAI(String var0) {
        int var1 = var0.indexOf(36);
        int var2 = var0.indexOf(35);
        return var1 != -1 && var2 != -1 ? var0.substring(var1 + 1, var2) : null;
    }

    public static int randomz(int var0, int var1) {
        if (var0 < var1) {
            return var0 + sellerDC.nextInt(var1 - var0 + 1);
        } else {
            return var0 > var1 ? var1 + sellerDC.nextInt(var0 - var1 + 1) : var0;
        }
    }

    public static void sellerAJ(String var0) {
        if (System.currentTimeMillis() - sellerDB >= 5000L) {
            sellerDB = System.currentTimeMillis();
            var0 = "@" + randomz(10, 99) + ": " + var0;
            Service.gI().chat(var0);
        }
    }

    public static void advAB(String str10, String str11) {
        if (Char.isADanhNhom && cNameLeader != null && str10.equals(cNameLeader) && !Char.getMyChar().cName.equals(cNameLeader)) {
            advAD(str10, str11);
        }
        if (auto != null && auto instanceof AutoSellPro) {
            AutoSellPro.sellerAO().sellerAA(str10, str11);
        } else if (auto != null && auto instanceof AutoTrade) {
            if (AutoTrade.gI().targetChar != null && str11.startsWith("@cmdmax") && str10.equals(AutoTrade.gI().targetChar.cName)) {
                try {
                    AutoTrade.gI().itemLimitPerTrade = Integer.parseInt(sellerAI(str11));
                    return;
                } catch (NumberFormatException var12) {
                }
            }

        } else if (auto == null || !(auto instanceof AutoTanSat) && !(auto instanceof AutoTuDanh) || !AutoTrade.gI().handleTradeCommand(str10, str11)) {
            Char aChar;
            if (auto != null && auto instanceof AutoNTGT) {
                AutoNTGT ntgt1 = AutoNTGT.ntgtAP();
                String str1 = str11;
                str11 = str10;
                AutoNTGT ntgt2 = ntgt1;
                if (!str1.equals("Hiện tại không online.")) {
                    str1 = str1.toLowerCase().trim();
                    String str2 = "";
                    if (str1.startsWith("ntgt") && (str1.length() == 5 || str1.length() == 6)) {
                        str2 = AutoNTGT.ntgtAA(str1.substring(4));
                    } else if (str1.startsWith("nt") && (str1.length() == 3 || str1.length() == 4)) {
                        str2 = AutoNTGT.ntgtAA(str1.substring(2));
                    } else {
                        char var21;
                        if (str1.startsWith("n") && (str1.length() == 2 || str1.length() == 3) && ((var21 = str1.charAt(1)) == ' ' || var21 >= '0' && var21 <= '9')) {
                            str2 = AutoNTGT.ntgtAA(str1.substring(1));
                        }
                    }

                    if (str2.equals("")) {
                        ntgt2.ntgtAF(str11);
                        return;
                    }

                    byte byte1;
                    try {
                        byte1 = Byte.parseByte(str2);
                    } catch (NumberFormatException var12) {
                        byte1 = -1;
                    }

                    if (byte1 <= 0) {
                        ntgt2.ntgtAF(str11);
                        return;
                    }

                    if (ntgt2.ntgtAB != null) {
                        if (!ntgt2.ntgtAB.cName.equals(str11)) {
                            sellerAB(str11, "Mình đang giao dịch với người khác bạn chờ chút nhé!");
                        }

                        return;
                    }

                    if (byte1 > ntgt2.ntgtBQ.length) {
                        sellerAB(str11, "Mình chỉ bán NTGT từ cấp 1 đến cấp " + ntgt2.ntgtBQ.length);
                        return;
                    }

                    if ((aChar = GameScr.advAA(str11)) != null) {
                        boolean bool1 = aChar.cClanName.equals("");
                        if (AutoNTGT.ntgtAD(str11) != null) {
                            sellerAB(str11, "Bạn không thể mua nhẫn. Hãy giao dịch với mình để nhận lại xu!");
                            return;
                        }

                        if (AutoNTGT.ntgtAB(str11) == null && AutoNTGT.ntgtAC(str11) == null) {
                            if (bool1) {
                                if (AutoNTGT.ntgtBG) {
                                    sellerAB(str11, "Mình chỉ bán nhẫn cho thành viên trong gia tộc!");
                                    return;
                                }

                                if (ntgt2.ntgtBI >= AutoNTGT.ntgtBH) {
                                    sellerAB(str11, "Mỗi ngày mình chỉ bán " + AutoNTGT.ntgtBH + " nhẫn cho người ngoài gia tộc. Mai quay lại nhé!");
                                    return;
                                }

                                if (Char.clan.total >= Char.clan.level * 5 + 45) {
                                    sellerAB(str11, "Gia tộc mình đã full thành viên không thể bán NTGT cho người ngoài!");
                                    return;
                                }
                            } else if (!aChar.cClanName.equals(Char.getMyChar().cClanName)) {
                                sellerAB(str11, "Bạn đang ở gia tộc khác không thể mua NTGT của gia tộc mình!");
                                return;
                            }

                            AutoNTGT.ntgtAA.put(str11, new AutoNTGT2(System.currentTimeMillis(), byte1, str11, bool1));
                            sellerAB(str11, "Bạn đặt mua NTGT " + byte1 + " với giá " + NinjaUtil.numberToString(String.valueOf(ntgt2.ntgtBQ[byte1 - 1])) + " xu. Hãy giao dịch và chuyển xu cho mình!");
                            sellerAB(str11, "Bạn có thời gian " + AutoNTGT.ntgtAD + " phút để chuyển xu.");
                            ntgt2.ntgtBP = false;
                            return;
                        }

                        sellerAB(str11, "Mình đã nhận xu của bạn. Hãy giao dịch với mình để nhận lại nhẫn!");
                        return;
                    }

                    sellerAB(str11, "Bạn phải đến " + TileMap.mapName + " khu " + TileMap.zoneID + " để mua nhẫn!");
                }

            }
            if (!str11.equals("Hiện tại không online.")) {
                if (str11.toLowerCase().equals("mapup")) {
                    advAA(str10, "Tọa độ: " + Char.getMyChar().cx + "-" + Char.getMyChar().cy + " map " + TileMap.mapID + ": " + TileMap.mapNames[TileMap.mapID] + " khu: " + TileMap.zoneID + (auto != null ? ". Đang bật: " + auto.toString() : ""));
                } else {
                    ChatTab var2;
                    boolean var13;
                    if ((var2 = ChatManager.gI().findTab(str10)) == null) {
                        var13 = true;
                    } else if (System.currentTimeMillis() - var2.advAD > 1000L) {
                        var2.advAD = System.currentTimeMillis();
                        var13 = true;
                    } else {
                        var13 = false;
                    }

                    if (var13) {
                        Char var14 = Char.getMyChar();
                        if (str11.toLowerCase().equals("yenxu")) {
                            advAA(str10, "Yên: " + var14.yen + " Xu: " + var14.xu + " Lượng: " + var14.luong);
                            if (auto != null) {
                                int var4 = Char.getMyChar().yen - auto.advAJ;
                                int var5 = (int) ((System.currentTimeMillis() - auto.advAL) / 1000L);
                                advAA(str10, "Up " + var4 + " trong " + NinjaUtil.getTime(var5) + " perh=" + var4 / var5 * 3600);
                                return;
                            }
                        } else {
                            if (str11.toLowerCase().equals("level")) {
                                long var16;
                                long var6 = (var16 = (Char.getMyChar().cExpDown > 0L ? Char.getMyChar().cExpDown : Char.getMyChar().cExpR) * 10000L / GameScr.exps[Char.getMyChar().clevel]) % 100L;
                                advAA(str10, "LV: " + var14.clevel + " + " + (Char.getMyChar().cExpDown > 0L ? "-" : "") + var16 / 100L + "." + (var6 < 10L ? "0" + var6 : String.valueOf(var6)) + "%");
                                if (auto != null) {
                                    long var8;
                                    float var12 = (float) ((var8 = Char.getMyChar().cEXP - auto.advAK) * 10000L / GameScr.exps[Char.getMyChar().clevel]) / 100.0F;
                                    int var15 = (int) ((System.currentTimeMillis() - auto.advAL) / 1000L);
                                    long var10;
                                    float var3 = (float) ((var10 = var8 * 3600L / (long) var15) * 10000L / GameScr.exps[Char.getMyChar().clevel]) / 100.0F;
                                    advAA(str10, "Up " + var8 + " - " + var12 + "% trong " + NinjaUtil.getTime(var15) + " perh=" + var10 + " - " + var3 + "%");
                                }

                                return;
                            }

                            if (auto != null && TimeUpValue > 0L) {
                                if (str11.toLowerCase().equals("time")) {
                                    advAA(str10, "Thời gian còn lại: " + NinjaUtil.getTime((int) (TimeUpValue / 1000L)));
                                    return;
                                }
                            } else {
                                if (auto instanceof AutoSell) {
                                    autoSell.advAA(str10, str11);
                                    return;
                                }

                                if (str11.equals(SelectServerScr.pass)) {
                                    LockGame.java_BK();
                                    auto = null;
                                    Session_ME.gI().close();
                                    GameCanvas.instance.resetToLoginScr();
                                }
                            }
                        }
                    }

                }
            }

        }
    }

    public static String[] split(String var0, String var1) {
        int var2 = 0;
        int var3 = var1.length();

        int var4;
        for (var4 = var0.indexOf(var1, 0); var4 != -1; ++var2) {
            var4 += var3;
            var4 = var0.indexOf(var1, var4);
        }

        String[] var7 = new String[var2 + 1];
        var4 = var0.indexOf(var1);
        int var5 = 0;

        int var6;
        for (var6 = 0; var4 != -1; ++var6) {
            var7[var6] = var0.substring(var5, var4);
            var5 = var4 + var3;
            var4 = var0.indexOf(var1, var5);
        }

        var7[var6] = var0.substring(var5, var0.length());
        return var7;
    }

    public static void advAD(String var0, String var1) {
        if (Char.isADanhNhom && cNameLeader != null && var0.equals(cNameLeader) && !Char.getMyChar().cName.equals(cNameLeader)) {
            String[] var5 = split(var1, " ");

            try {
                if (var5[0].equals("dcvt")) {
                    isADanhCVT = Integer.parseInt(var5[1]) == 1;
                    return;
                }

                if (var5[0].equals("avt")) {
                    GameScr.paint("Thêm vị trí " + cxViTri.size());
                    cxViTri.addElement(Integer.valueOf(var5[1]));
                    cyViTri.addElement(Integer.valueOf(var5[2]));
                    return;
                }

                if (var5[0].equals("dvt")) {
                    GameScr.paint("Xóa hết vị trí");
                    cxViTri.removeAllElements();
                    cyViTri.removeAllElements();
                    return;
                }

                int var6;
                if (var5[0].equals("dvtx")) {
                    var6 = Integer.parseInt(var5[1]);
                    GameScr.paint("Xóa vị trí " + var6);
                    cxViTri.removeElementAt(var6);
                    cyViTri.removeElementAt(var6);
                    return;
                }

                if (var5[0].equals("pe")) {
                    GameScr.paint("End Auto");
                    LockGame.java_BK();
                    auto = null;
                    return;
                }

                if (var5[0].equals("tsa")) {
                    if (auto == autoBuff) {
                        autoBuff.mapID = Integer.parseInt(var5[1]);
                        autoBuff.zoneID = Integer.parseInt(var5[2]);
                        return;
                    }

                    autoTanSat.advAA(-1, Integer.parseInt(var5[1]), Integer.parseInt(var5[2]));
                    autoTanSat.advAD = true;
                    setAuto((Auto) autoTanSat);
                    return;
                }

                if (var5[0].equals("ts")) {
                    if (auto == autoBuff) {
                        autoBuff.mapID = Integer.parseInt(var5[1]);
                        autoBuff.zoneID = Integer.parseInt(var5[2]);
                        return;
                    }

                    autoTanSat.advAA(Integer.parseInt(var5[3]), Integer.parseInt(var5[1]), Integer.parseInt(var5[2]));
                    autoTanSat.advAD = true;
                    setAuto((Auto) autoTanSat);
                    return;
                }

                int var2;
                if (var5[0].equals("att")) {
                    if (auto == autoBuff) {
                        autoBuff.mapID = Integer.parseInt(var5[1]);
                        autoBuff.zoneID = Integer.parseInt(var5[2]);
                        return;
                    }

                    var6 = Integer.parseInt(var5[1]);
                    var2 = Integer.parseInt(var5[3]);
                    TaskOrder var3;
                    if ((var3 = Char.getTaskOrder(1)) != null && var3.mapId == var6) {
                        autoTaThu.update();
                    } else {
                        autoTaThu.advAC(var6, var2);
                    }

                    autoTaThu.zoneID = Integer.parseInt(var5[2]);
                    autoTaThu.advAD = true;
                    setAuto((Auto) autoTaThu);
                    return;
                }

                if (var5[0].equals("sta")) {
                    if (auto == autoBuff) {
                        autoBuff.mapID = Integer.parseInt(var5[1]);
                        autoBuff.zoneID = Integer.parseInt(var5[2]);
                        return;
                    }

                    autoStanima.advAA(-1, Integer.parseInt(var5[1]), Integer.parseInt(var5[2]), false, false);
                    autoStanima.advAD = true;
                    setAuto((Auto) autoStanima);
                    return;
                }

                if (var5[0].equals("st")) {
                    if (auto == autoBuff) {
                        autoBuff.mapID = Integer.parseInt(var5[1]);
                        autoBuff.zoneID = Integer.parseInt(var5[2]);
                        return;
                    }

                    autoStanima.advAA(Integer.parseInt(var5[3]), Integer.parseInt(var5[1]), Integer.parseInt(var5[2]), false, false);
                    autoStanima.advAD = true;
                    setAuto((Auto) autoStanima);
                    return;
                }

                if (var5[0].equals("hd9x")) {
                    setAuto((Auto) (new AutoHd9x()));
                    return;
                }

                if (var5[0].equals("pkms")) {
                    if (auto instanceof AutoPKBossS) {
                        AutoPKBossS var8;
                        (var8 = (AutoPKBossS) auto).mapID = Integer.parseInt(var5[1]);
                        var8.advAB = Integer.parseInt(var5[2]);
                        var8.advAA = 3;
                        return;
                    }
                } else if (var5[0].equals("pkes")) {
                    if (auto instanceof AutoPKBossS) {
                        ((AutoPKBossS) auto).advAA = 4;
                        return;
                    }
                } else {
                    if (var5[0].equals("pkm")) {
                        if (auto == autoBuff) {
                            autoBuff.mapID = Integer.parseInt(var5[1]);
                            return;
                        }

                        Auto var7 = auto instanceof AutoPKBoss ? auto.T : auto;
                        setAuto((Auto) (new AutoPKBoss(Integer.parseInt(var5[1]))));
                        auto.T = var7;
                        return;
                    }

                    if (var5[0].equals("pkk")) {
                        if (auto instanceof AutoPKBoss || auto == autoBuff) {
                            auto.zoneID = Integer.parseInt(var5[1]);
                            return;
                        }
                    } else if (var5[0].equals("pke")) {
                        if (auto instanceof AutoPKBoss) {
                            java_AC();
                            return;
                        }
                    } else if (auto != null) {
                        if (var5[0].equals("map")) {
                            auto.mapID = Integer.parseInt(var5[1]);
                            return;
                        }

                        if (var5[0].equals("khu")) {
                            var2 = Integer.parseInt(var5[1]);
                            if (!(auto instanceof AutoNVHN)) {
                                auto.zoneID = var2;
                            }

                            return;
                        }

                        if (auto instanceof AutoTaThu) {
                            if (var5[0].equals("waitGr")) {
                                AutoTaThu.advAC = System.currentTimeMillis();
                                AutoTaThu.advAB = true;
                                return;
                            }

                            if (var5[0].equals("notifyGr")) {
                                AutoTaThu.advAB = false;
                                return;
                            }
                        } else if (auto instanceof AutoStanima && var5[0].equals("sts")) {
                            autoStanima.advAA();
                        }
                    }
                }

                return;
            } catch (NumberFormatException var4) {
            }
        }

    }

    static {
        try {
            advAQ();
            byte[] advAB;
            if ((advAB = RMS.loadRMS("chipPkam")) != null) {
                ByteArrayInputStream in = new ByteArrayInputStream(advAB);
                DataInputStream dataInputStream = new DataInputStream(in);
                try {
                    Code.advBU = dataInputStream.readByte();
                    Code.advBV = dataInputStream.readByte();
                    Code.advBW = dataInputStream.readShort();
                    Code.advBX = dataInputStream.readInt();
                    Code.advBY = dataInputStream.readInt();
                    Code.PKAmValue = dataInputStream.readLong();
                    try {
                        dataInputStream.close();
                        in.close();
                    } catch (IOException ex) {
                    }
                } catch (final IOException ex2) {
                    RMS.deleteRecord("chipPkam");
                    try {
                        dataInputStream.close();
                        in.close();
                    } catch (IOException ex3) {
                    }
                } finally {
                    try {
                        dataInputStream.close();
                        in.close();
                    } catch (IOException ex4) {
                    }
                }
            }
        } catch (final Exception ex5) {
        }
    }
}
