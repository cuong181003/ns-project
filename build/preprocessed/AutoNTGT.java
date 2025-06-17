
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;

public final class AutoNTGT extends Auto {

    private static AutoNTGT ntgtBT;
    static final Hashtable ntgtAA = new Hashtable();
    private static final Hashtable ntgtBU = new Hashtable();
    private static final Hashtable ntgtBV = new Hashtable();
    private static final Hashtable ntgtBW = new Hashtable();
    public Char ntgtAB;
    public long ntgtAC;
    private long ntgtBX;
    private long ntgtBY;
    static int ntgtAD = 5;
    private String[] ntgtBZ;
    public static String ntgtAE = "ban ntgt 1-2-3-4-5/n/chat nx de mua, x là lv nhan/n/hoac chat bat ky de xem hd";
    public static long ntgtAF = 6000L;
    public static int[] ntgtBE = new int[]{50000, 100000, 150000, 250000, 350000};
    public static boolean ntgtBF = true;
    public static boolean ntgtBG = false;
    public static int ntgtBH = 5;
    int ntgtBI;
    public static int ntgtBJ = 0;
    public static boolean ntgtBK = true;
    private int ntgtCA;
    private int ntgtCB;
    private long ntgtCC;
    private String[] ntgtCD;
    private String[] ntgtCE;
    public static String ntgtBL = "Chat nX hoặc ntX, ntgtX (X là LV nhẫn muốn mua). Vd: n5, nt5, ntgt5/n/Nếu đã đưa xu cho Bot mà chưa nhận dc nhẫn, giao dịch với Bot để nhận lại";
    public static String ntgtBM = null;
    public static boolean ntgtBN = false;
    public int ntgtBO;
    private int ntgtCF;
    private String ntgtCG;
    private int ntgtCH = -1;
    private int ntgtCI = -1;
    boolean ntgtBP;
    private static final Object ntgtCJ = new Object();
    private static boolean ntgtCK = false;
    private static boolean ntgtCL = false;
    int[] ntgtBQ;
    private int ntgtCM;
    private AutoNTGT2 ntgtCN;
    private boolean ntgtCO;
    private String ntgtCP;
    public static int ntgtBR = 0;
    private boolean ntgtCQ;
    public static boolean ntgtBS = false;

    private static boolean ntgtAB(long var0) {
        ntgtCK = true;
        long var2 = System.currentTimeMillis();
        synchronized (ntgtCJ) {
            try {
                ntgtCJ.wait(var0);
            } catch (InterruptedException var5) {
            }
        }

        return System.currentTimeMillis() - var2 < var0;
    }

    public static void ntgtAC() {
        if (ntgtCK) {
            synchronized (ntgtCJ) {
                ntgtCJ.notifyAll();
            }

            ntgtCK = false;
        }

    }

    private static boolean ntgtAC(long var0) {
        ntgtCL = true;
        long var2 = System.currentTimeMillis();
        synchronized (ntgtCJ) {
            try {
                ntgtCJ.wait(var0);
            } catch (InterruptedException var5) {
            }
        }

        return System.currentTimeMillis() - var2 < var0;
    }

    private static void ntgtAQ() {
        if (ntgtCL) {
            synchronized (ntgtCJ) {
                ntgtCJ.notifyAll();
            }

            ntgtCL = false;
        }

    }

    private static void ntgtAR() {
        byte[] var0;
        if ((var0 = RMS.loadRMS("ChipNTGT")) != null) {
            ByteArrayInputStream var11 = new ByteArrayInputStream(var0);
            DataInputStream var1 = new DataInputStream(var11);

            try {
                ntgtBH = var1.readInt();

                for (int var2 = 0; var2 < ntgtBE.length; ++var2) {
                    ntgtBE[var2] = var1.readInt();
                }

                ntgtBJ = var1.readInt();
                ntgtAF = (long) var1.readInt();
                ntgtBR = var1.readInt();
                ntgtBG = var1.readBoolean();
                ntgtBK = var1.readBoolean();
                ntgtBF = var1.readBoolean();
                ntgtBN = var1.readBoolean();
                ntgtBS = var1.readBoolean();
                ntgtBM = var1.readUTF();
                ntgtBL = var1.readUTF();
                ntgtAE = var1.readUTF();
                return;
            } catch (IOException var9) {
                RMS.deleteRecord("ChipNTGT");
            } finally {
                try {
                    var1.close();
                    var11.close();
                } catch (IOException var8) {
                }

            }

        }
    }

    public static void ntgtAO() {
        ByteArrayOutputStream var0 = new ByteArrayOutputStream();
        DataOutputStream var1 = new DataOutputStream(var0);

        try {
            var1.writeInt(ntgtBH);

            for (int var2 = 0; var2 < ntgtBE.length; ++var2) {
                var1.writeInt(ntgtBE[var2]);
            }

            var1.writeInt(ntgtBJ);
            var1.writeInt((int) ntgtAF);
            var1.writeInt(ntgtBR);
            var1.writeBoolean(ntgtBG);
            var1.writeBoolean(ntgtBK);
            var1.writeBoolean(ntgtBF);
            var1.writeBoolean(ntgtBN);
            var1.writeBoolean(ntgtBS);
            var1.writeUTF(ntgtBM);
            var1.writeUTF(ntgtBL);
            var1.writeUTF(ntgtAE);
            var1.flush();
            var0.flush();
            RMS.saveRMS("ChipNTGT", var0.toByteArray());
            return;
        } catch (IOException var9) {
        } finally {
            try {
                var0.close();
                var1.close();
            } catch (IOException var8) {
            }

        }

    }

    public AutoNTGT() {
        this.ntgtCC = this.ntgtBX = this.ntgtBY = 0L;
        this.ntgtCO = false;
        this.ntgtCP = null;
        this.ntgtCA = -1;
        this.ntgtCB = 0;
        this.ntgtBI = 0;
        this.ntgtCQ = false;
    }

    public static AutoNTGT ntgtAP() {
        if (ntgtBT == null) {
            ntgtBT = new AutoNTGT();
        }

        return ntgtBT;
    }

    public final void update() {
        super.update();
        super.mapID = TileMap.mapID;
        super.zoneID = TileMap.zoneID;
        super.advAG = TileMap.isHang(TileMap.mapID);
        this.ntgtCH = Char.getMyChar().cx;
        this.ntgtCI = Char.getMyChar().cy;
        this.ntgtBP = false;
        this.ntgtBQ = null;
        this.ntgtCM = 0;
        this.ntgtBZ = Code.split(ntgtAE, "/n/");
        this.ntgtCD = Code.split(ntgtBL, "/n/");
        if (ntgtBM == null) {
            ntgtBM = (Char.getMyChar().cClanName.length() > 0 ? "Clan [" + Char.getMyChar().cClanName + "] " : "Bot ") + "bán NTGT tự động tại: " + TileMap.mapName + " khu " + TileMap.zoneID + "/n/Số lượng có hạn, ae nhanh đến mua kẻo hết";
        }

        this.ntgtCE = Code.split(ntgtBM, "/n/");
        this.ntgtAT();
        if (this.ntgtCA == -1) {
            this.ntgtCB = 0;
            this.ntgtBI = 0;
            this.ntgtCA = Code.MuiGio().get(5);
            this.ntgtCQ = RMS.loadRMSInt(Char.getMyChar().cName + "_" + GameCanvas.menu.menuSelectedItem + "_contribute") == Code.MuiGio().get(5);
        } else {
            int var1;
            if ((var1 = Code.MuiGio().get(5)) != this.ntgtCA) {
                this.ntgtCB = 0;
                this.ntgtBI = 0;
                this.ntgtCA = var1;
                this.ntgtCQ = false;
            }
        }

        Char.isABuff = false;
    }

    private static boolean ntgtAS() {
        if (ntgtBS) {
            try {
                Class.forName("java.nio.file.Files");
                Class.forName("java.nio.file.Paths");
                Class.forName("java.nio.file.StandardOpenOption");
            } catch (ClassNotFoundException var0) {
                ntgtBS = false;
            }
        }

        return ntgtBS;
    }

    private static void ntgtAH(String var0) {
        if (ntgtAS()) {
            SaveFileNTGT.ntgtAA().ntgtAA(Char.getMyChar().cClanName + "_" + Char.getMyChar().cName, var0);
        }

    }

    private void ntgtAT() {
        if (GameCanvas.currentDialog != null) {
            GameCanvas.endDlg();
            if (this.ntgtBO == 43) {
                Service.gI().cancelInviteTrade();
            }
        } else {
            GameScr.gI().resetButton();
        }

        this.ntgtBO = 0;
        this.ntgtCF = -1;
        this.ntgtCG = null;
        this.ntgtAB = null;
        this.ntgtCN = null;
        this.ntgtAC = 0L;
    }

    static String ntgtAA(String var0) {
        String var1 = "";
        if (!var0.equals("")) {
            for (int var2 = 0; var2 < var0.length(); ++var2) {
                char var3;
                if ((var3 = var0.charAt(var2)) >= '0' && var3 <= '9') {
                    var1 = var1 + var3;
                }
            }
        }

        return var1;
    }

    public final void ntgtAA(int var1, String var2) {
        this.ntgtCF = var1;
        this.ntgtCG = var2;
        this.ntgtBO = 43;
    }

    private Char ntgtAU() {
        if (this.ntgtCF != -1) {
            return GameScr.findCharInMap(this.ntgtCF);
        } else {
            return this.ntgtCG != null && this.ntgtCG.length() > 0 ? GameScr.advAA(this.ntgtCG) : null;
        }
    }

    private static AutoNTGT2 ntgtAI(String var0) {
        return !ntgtAA.isEmpty() && ntgtAA.containsKey(var0) ? (AutoNTGT2) ntgtAA.get(var0) : null;
    }

    static AutoNTGT2 ntgtAB(String var0) {
        return !ntgtBU.isEmpty() && ntgtBU.containsKey(var0) ? (AutoNTGT2) ntgtBU.get(var0) : null;
    }

    static AutoNTGT2 ntgtAC(String var0) {
        return !ntgtBV.isEmpty() && ntgtBV.containsKey(var0) ? (AutoNTGT2) ntgtBV.get(var0) : null;
    }

    static AutoNTGT2 ntgtAD(String var0) {
        return !ntgtBW.isEmpty() && ntgtBW.containsKey(var0) ? (AutoNTGT2) ntgtBW.get(var0) : null;
    }

    private static boolean ntgtAV() {
        if (GameScr.arrItemTradeOrder != null) {
            for (int var0 = 0; var0 < GameScr.arrItemTradeOrder.length; ++var0) {
                if (GameScr.arrItemTradeOrder[var0] != null) {
                    return true;
                }
            }
        }

        return false;
    }

    protected final void auto() {
        if (Auto.isMyCharInactive()) {
            this.ntgtAT();
            Auto.advAA(true);
        } else if (Char.getMyChar().ctypeClan < 3) {
            GameScr.gI().actionPerform(1100014, null);
            GameCanvas.startOKDlg("Bạn phải là trưởng tộc hoặc phó tộc!");
        } else if (!this.ntgtBP) {
            Service.gI().requestClanInfo();
            if (ntgtAB(10000L)) {
                this.ntgtBP = true;
                if (Char.clan != null) {
                    int var5 = Char.clan.itemLevel <= ntgtBE.length ? Char.clan.itemLevel : ntgtBE.length;
                    this.ntgtBQ = new int[var5];
                    System.arraycopy(ntgtBE, 0, this.ntgtBQ, 0, var5);
                }

            } else {
                GameScr.paint("Lỗi tải dữ liệu gia tộc");
            }
        } else if (this.ntgtBQ == null) {
            GameCanvas.startOKDlg("Có lỗi xảy ra!");
        } else if (super.mapID == TileMap.mapID && super.zoneID == TileMap.zoneID) {
            if (this.ntgtCF != -1 || this.ntgtCG != null && !this.ntgtCG.equals("")) {
                this.ntgtAW();
            } else {
                if (GameCanvas.currentDialog != null) {
                    GameCanvas.endDlg();
                    if (this.ntgtBO == 43) {
                        Service.gI().cancelInviteTrade();
                    }
                }

                if (GameScr.isPaintTrade) {
                    GameScr.gI().resetButton();
                }

                if (this.ntgtCH == -1 || this.ntgtCI == -1 || Math.abs(this.ntgtCH - Char.getMyChar().cx) <= 24 && Math.abs(this.ntgtCI - Char.getMyChar().cy) <= 24) {
                    if (ntgtBR > 0 && !this.ntgtCQ && Char.getMyChar().xu > ntgtBR) {
                        this.ntgtCQ = true;
                        Service.gI().inputCoinClan(ntgtBR);
                        RMS.saveRMSInt(Char.getMyChar().cName + "_" + GameCanvas.menu.menuSelectedItem + "_contribute", Code.MuiGio().get(5));
                    }

                    if (!ntgtAA.isEmpty()) {
                        Enumeration var2 = ntgtAA.keys();

                        while (var2.hasMoreElements()) {
                            String var1 = (String) var2.nextElement();
                            AutoNTGT2 var3 = (AutoNTGT2) ntgtAA.get(var1);
                            if (System.currentTimeMillis() - var3.ntgtAA > (long) (ntgtAD * 60 * 1000)) {
                                ntgtAA.remove(var1);
                            }
                        }
                    }

                    if (ntgtBF && this.ntgtBZ != null && this.ntgtBZ.length > 0 && System.currentTimeMillis() - this.ntgtCC > ntgtAF) {
                        this.ntgtCC = System.currentTimeMillis();
                        if (this.ntgtCM >= this.ntgtBZ.length) {
                            this.ntgtCM = 0;
                        }

                        Code var10000 = Code.instance;
                        Code.sellerAJ(this.ntgtBZ[this.ntgtCM]);
                        ++this.ntgtCM;
                    }

                    Code.instance.advAO();
                } else {
                    Char.moveToChar(this.ntgtCH, this.ntgtCI);
                }
            }
        } else {
            super.remap(super.mapID, super.zoneID, this.ntgtCH, this.ntgtCI);
        }
    }

    public final void ntgtAE(String var1) {
        if (ntgtCL && this.ntgtCP != null) {
            if (var1.equals(this.ntgtCP + " rời khỏi gia tộc chưa đến 1 ngày nên không thể vào gia tộc.")) {
                this.ntgtCO = true;
                this.ntgtCP = null;
                ntgtAQ();
                return;
            }

            if (var1.startsWith(this.ntgtCP + " đã gia nhập gia tộc")) {
                this.ntgtBP = false;
                this.ntgtCO = false;
                this.ntgtCP = null;
                ntgtAQ();
                return;
            }

            if (var1.startsWith(this.ntgtCP + " đã rời khỏi gia tộc")) {
                this.ntgtBP = false;
                this.ntgtCO = true;
                this.ntgtCP = null;
                ntgtAQ();
                return;
            }

            if (var1.equals("Mỗi ngày chỉ trục xuất tối đa 5 thành viên.")) {
                this.ntgtCO = false;
                this.ntgtCP = null;
                ntgtAQ();
                return;
            }
        }

        if (ntgtCK) {
            if (var1.toLowerCase().indexOf("đã nhận được nhẫn thuật gia tộc") != -1) {
                ntgtAC();
                return;
            }

            if (var1.startsWith(Char.getMyChar().cName + " đã đóng góp")) {
                ntgtAC();
                return;
            }
        }

    }

    private boolean ntgtAA(String var1, int var2) {
        Service.gI().requestClanItem();
        if (ntgtAB(5000L)) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException var7) {
            }
        }

        short[] var3 = new short[]{423, 424, 425, 426, 427};
        if (Char.clan != null && Char.clan.items != null) {
            for (int var4 = 0; var4 < Char.clan.items.length; ++var4) {
                Item var5;
                if ((var5 = Char.clan.items[var4]) != null && var5.template.id == var3[var2]) {
                    ++this.ntgtBI;
                    GameScr.indexSelect = var4;
                    Service.gI().sendClanItem(var1);

                    try {
                        Thread.sleep(500L);
                    } catch (InterruptedException var6) {
                    }

                    Code.sellerAB(var1, "Phát nhẫn thành công. Chúc bạn chơi game vui vẻ!");
                    return true;
                }
            }
        }

        return false;
    }

    private void ntgtAB(int var1, boolean var2) {
        int var3 = (new int[]{10000, 50000, 100000, 200000, 300000})[var1];
        if (var2) {
            var3 += 10000;
        }

        if (ntgtBJ > 0 && this.ntgtBQ[var1] > var3) {
            var1 = this.ntgtBQ[var1] - var3;
            var3 += ntgtBJ * var1 / 100;
        }

        if (Char.getMyChar().xu > var3) {
            Service.gI().inputCoinClan(var3);
            if (ntgtAB(5000L)) {
                ntgtAH("- Góp xu: " + NinjaUtil.numberToString(String.valueOf(var3)) + " xu\r\n");

                try {
                    Thread.sleep(500L);
                    return;
                } catch (InterruptedException var4) {
                }
            }
        }

    }

    private void ntgtAD(int var1) {
        int[] var2 = new int[]{10000, 50000, 100000, 200000, 300000};
        if (Char.clan.coin < var2[var1]) {
            System.err.println(" ---- Gia tộc hết xu  ----");
            GameScr.paint("Gia tộc không đủ ngân sách");
            this.ntgtAT();
            Code.endAuto();
        } else {
            GameScr.pickNPC(26, 3, 0);
            LockGame.advAQ();
            Service.gI().buyItem(34, var1, 1);
            if (ntgtAB(5000L)) {
                try {
                    Thread.sleep(500L);
                    return;
                } catch (InterruptedException var3) {
                }
            }

        }
    }

    private boolean ntgtAJ(String var1) {
        boolean var2 = false;
        if (ntgtBK && this.ntgtCB < 5) {
            this.ntgtCO = false;
            this.ntgtCP = var1;

            try {
                Thread.sleep(500L);
            } catch (InterruptedException var3) {
            }

            Service.gI().moveOutClan(var1);
            if (ntgtAC(10000L)) {
                if (this.ntgtCO) {
                    ++this.ntgtCB;
                    var2 = true;
                } else {
                    this.ntgtCB = 5;
                }
            }
        }

        return var2;
    }

    private void ntgtAW() {
        int var1;
        if ((var1 = Code.MuiGio().get(5)) != this.ntgtCA) {
            this.ntgtCA = var1;
            this.ntgtCB = 0;
            this.ntgtBI = 0;
            this.ntgtCQ = false;
        }

        this.ntgtAB = this.ntgtAU();
        int var2;
        switch (this.ntgtBO) {
            case -57:
                if (System.currentTimeMillis() - this.ntgtBY >= 5000L) {
                    this.ntgtAT();
                    return;
                }
                break;
            case -46:
                if (this.ntgtAB != null && this.ntgtCN != null) {
                    if (System.currentTimeMillis() - this.ntgtBX > 10000L) {
                        Code.sellerAB(this.ntgtAB.cName, "Có lỗi xảy ra!");
                        this.ntgtAT();
                        return;
                    }
                    break;
                }

                this.ntgtAT();
                return;
            case -45:
                if (this.ntgtAB != null && this.ntgtCN != null) {
                    if (System.currentTimeMillis() - this.ntgtAC > 30000L) {
                        Code.sellerAB(this.ntgtAB.cName, "Bạn không đồng ý giao dịch?");
                        this.ntgtAT();
                        return;
                    }
                    break;
                }

                this.ntgtAT();
                return;
            case -43:
                if (this.ntgtAB == null || this.ntgtCN == null) {
                    this.ntgtAT();
                    return;
                }

                if (System.currentTimeMillis() - this.ntgtAC > 10000L) {
                    this.ntgtAT();
                    return;
                }
                break;
            case -37:
                if (this.ntgtAB != null && this.ntgtCN != null) {
                    if (System.currentTimeMillis() - this.ntgtAC >= 60000L) {
                        Code.advAA(this.ntgtAB.cName, "Bạn không khóa giao dịch?");
                        this.ntgtAT();
                        return;
                    }
                    break;
                }

                this.ntgtAT();
                return;
            case 37:
                if (this.ntgtAB != null && this.ntgtCN != null) {
                    if (GameScr.isPaintTrade && GameScr.arrItemTradeOrder != null) {
                        if (this.ntgtCN.ntgtAB == 1) {
                            var2 = this.ntgtBQ[this.ntgtCN.ntgtAA() - 1];
                            if (Char.getMyChar().xu < var2) {
                                this.ntgtAT();
                                Code.endAuto();
                                return;
                            }

                            GameScr.gI().coinTrade = var2;
                            Char.getMyChar().xu -= var2;
                        }

                        Auto.sleep(1000L);
                        this.ntgtBO = -37;
                        this.ntgtAC = System.currentTimeMillis();
                        GameScr.gI().actTradeLock();
                        return;
                    }

                    if (System.currentTimeMillis() - this.ntgtAC > 10000L) {
                        this.ntgtAT();
                        return;
                    }
                    break;
                }

                this.ntgtAT();
                return;
            case 43:
                if (this.ntgtAB == null) {
                    this.ntgtAT();
                    return;
                }

                if ((this.ntgtCN = ntgtAD(this.ntgtAB.cName)) != null) {
                    this.ntgtCN.ntgtAB = 1;
                } else if ((this.ntgtCN = ntgtAI(this.ntgtAB.cName)) != null) {
                    if (this.ntgtAB.cClanName.equals("")) {
                        if (ntgtBG) {
                            Code.sellerAB(this.ntgtAB.cName, "Mình chỉ bán nhẫn cho thành viên trong gia tộc!");
                            ntgtAA.remove(this.ntgtAB.cName);
                            this.ntgtAT();
                            return;
                        }

                        if (Char.clan.total >= Char.clan.level * 5 + 45) {
                            Code.sellerAB(this.ntgtAB.cName, "Gia tộc mình đã full thành viên. Bạn quay lại sau nhé");
                            ntgtAA.remove(this.ntgtAB.cName);
                            this.ntgtAT();
                            return;
                        }

                        if (this.ntgtBI >= ntgtBH) {
                            Code.sellerAB(this.ntgtAB.cName, "Mỗi ngày mình chỉ bán " + ntgtBH + " nhẫn cho người ngoài gia tộc. Mai quay lại nhé!");
                            ntgtAA.remove(this.ntgtAB.cName);
                            this.ntgtAT();
                            return;
                        }

                        this.ntgtCN.ntgtAB = 0;
                    } else {
                        if (!this.ntgtAB.cClanName.equals(Char.getMyChar().cClanName)) {
                            Code.sellerAB(this.ntgtAB.cName, "Bạn đang ở gia tộc khác không thể mua NTGT của gia tộc mình!");
                            ntgtAA.remove(this.ntgtAB.cName);
                            this.ntgtAT();
                            return;
                        }

                        this.ntgtCN.ntgtAB = 0;
                    }
                } else {
                    AutoNTGT2 var3;
                    if ((var3 = ntgtAB(this.ntgtAB.cName)) != null) {
                        if (this.ntgtAB.cClanName.equals("")) {
                            if (Char.clan.total >= Char.clan.level * 5 + 45) {
                                ntgtBU.remove(var3.ntgtAC());
                                Code.sellerAB(var3.ntgtAC(), "Gia tộc mình đã full thành viên. Hãy nhận lại xu!");
                                ntgtBW.put(var3.ntgtAC(), var3);
                                this.ntgtCN = var3;
                                this.ntgtCN.ntgtAB = 1;
                            } else {
                                this.ntgtCO = false;
                                this.ntgtCP = this.ntgtAB.cName;
                                Service.gI().clanInvite(this.ntgtAB.charID);
                                if (!ntgtAC(15000L)) {
                                    Code.sellerAB(var3.ntgtAC(), "Bạn không đồng ý vào gia tộc. Không thể nhận nhẫn!");
                                    Auto.sleep(100L);
                                    Code.sellerAB(this.ntgtAB.cName, "Giao dịch lại với Bot để Bot trả nhẫn (ko mất thêm phí)");
                                    this.ntgtAT();
                                    return;
                                }

                                ntgtBU.remove(var3.ntgtAC());
                                if (!this.ntgtCO) {
                                    ntgtAH("\r\n==========" + ntgtAX() + "==========\r\n- IG: " + this.ntgtAB.cName + " (chưa vào gia tộc)\r\n- Mua: Nhẫn cấp " + var3.ntgtAA() + "\r\n- Giá: " + NinjaUtil.numberToString(String.valueOf(this.ntgtBQ[var3.ntgtAA() - 1])) + " xu\r\n- Mời vào gia tộc: Thành công\r\n");
                                    var2 = var3.ntgtAA() - 1;
                                    if (!this.ntgtAA(var3.ntgtAC(), var2)) {
                                        Code.sellerAB(var3.ntgtAC(), "Hãy chờ mình đi mua nhẫn đừng đi đâu nhé!");
                                        this.ntgtAB(var2, ntgtBK && this.ntgtCB < 5);
                                        this.ntgtAD(var2);
                                        if (!this.ntgtAA(var3.ntgtAC(), var2)) {
                                            ntgtBV.put(var3.ntgtAC(), var3);
                                            ntgtAH("- Giao nhẫn: Đang chờ...\r\n");
                                        } else if (this.ntgtAJ(var3.ntgtAC())) {
                                            ntgtAH("- Giao nhẫn: Thành công\r\n- Trục xuất: Đã trục xuất\r\n");
                                        } else {
                                            ntgtAH("- Giao nhẫn: Thành công\r\n- Trục xuất: Không trục xuất\r\n");
                                        }
                                    } else if (this.ntgtAJ(var3.ntgtAC())) {
                                        ntgtAH("- Giao nhẫn: Thành công\r\n- Trục xuất: Đã trục xuất\r\n");
                                    } else {
                                        ntgtAH("- Giao nhẫn: Thành công\r\n- Trục xuất: Không trục xuất\r\n");
                                    }

                                    this.ntgtAT();
                                    return;
                                }

                                Code.sellerAB(var3.ntgtAC(), "Bạn mới rời gia tộc chưa đến 1 ngày không thể vào lại gia tộc. Hãy nhận lại xu!");
                                ntgtBW.put(var3.ntgtAC(), var3);
                                this.ntgtCN = var3;
                                this.ntgtCN.ntgtAB = 1;
                            }
                        } else if (this.ntgtAB.cClanName.equals(Char.getMyChar().cClanName)) {
                            ntgtBU.remove(this.ntgtAB.cName);
                            ntgtAH("\r\n==========" + ntgtAX() + "==========\r\n- IG: " + this.ntgtAB.cName + " (" + (var3.ntgtAB() ? "chưa vào gia tộc" : "Thành viên cũ") + ")\r\n- Mua: Nhẫn cấp " + var3.ntgtAA() + "\r\n- Giá: " + NinjaUtil.numberToString(String.valueOf(this.ntgtBQ[var3.ntgtAA() - 1])) + " xu\r\n" + (var3.ntgtAB() ? "- Mời vào gia tộc: Thành công\r\n" : ""));
                            var2 = var3.ntgtAA() - 1;
                            if (!this.ntgtAA(var3.ntgtAC(), var2)) {
                                Code.sellerAB(var3.ntgtAC(), "Hãy chờ mình đi mua nhẫn đừng đi đâu nhé!");
                                this.ntgtAB(var2, false);
                                this.ntgtAD(var2);
                                if (!this.ntgtAA(var3.ntgtAC(), var2)) {
                                    ntgtBV.put(var3.ntgtAC(), var3);
                                    ntgtAH("- Giao nhẫn: Đang chờ...\r\n");
                                } else if (this.ntgtAJ(var3.ntgtAC())) {
                                    ntgtAH("- Giao nhẫn: Thành công\r\n- Trục xuất: Đã trục xuất\r\n");
                                } else {
                                    ntgtAH("- Giao nhẫn: Thành công\r\n- Trục xuất: Không trục xuất\r\n");
                                }
                            } else if (this.ntgtAJ(var3.ntgtAC())) {
                                ntgtAH("- Giao nhẫn: Thành công\r\n- Trục xuất: Đã trục xuất\r\n");
                            } else {
                                ntgtAH("- Giao nhẫn: Thành công\r\n- Trục xuất: Không trục xuất\r\n");
                            }

                            this.ntgtAT();
                            return;
                        }
                    } else if ((var3 = ntgtAC(this.ntgtAB.cName)) != null && !this.ntgtAB.cClanName.equals("") && this.ntgtAB.cClanName.equals(Char.getMyChar().cClanName)) {
                        ntgtAH("\r\n==========" + ntgtAX() + "==========\r\n- IG: " + this.ntgtAB.cName + " (chưa vào gia tộc)\r\n- Mua: Nhẫn cấp " + var3.ntgtAA() + "\r\n- Giá: " + NinjaUtil.numberToString(String.valueOf(this.ntgtBQ[var3.ntgtAA() - 1])) + " xu\r\n");
                        var2 = var3.ntgtAA() - 1;
                        if (this.ntgtAA(var3.ntgtAC(), var2)) {
                            ntgtBV.remove(var3.ntgtAC());
                            ntgtAH("- Giao nhẫn: Thành công\r\n- Trục xuất: Không trục xuất\r\n");
                        } else {
                            Code.sellerAB(var3.ntgtAC(), "Hãy chờ mình đi mua nhẫn đừng đi đâu nhé!");
                            this.ntgtAB(var2, false);
                            this.ntgtAD(var2);
                            if (this.ntgtAA(var3.ntgtAC(), var2)) {
                                ntgtBV.remove(var3.ntgtAC());
                                ntgtAH("- Giao nhẫn: Thành công\r\n- Trục xuất: Không trục xuất\r\n");
                            } else {
                                ntgtAH("- Giao nhẫn: Thất bại (có lỗi xảy ra)\r\n");
                            }
                        }

                        this.ntgtAT();
                        return;
                    }
                }

                if (this.ntgtCN != null) {
                    Auto.sleep(1000L);
                    this.ntgtBO = -43;
                    this.ntgtAC = System.currentTimeMillis();
                    Service.gI().acceptInviteTrade(this.ntgtAB.charID);
                    return;
                }

                Auto.sleep(1000L);
                this.ntgtAF(this.ntgtAB.cName);
                this.ntgtAT();
                return;
            case 45:
                if (this.ntgtAB != null && this.ntgtCN != null) {
                    if (GameScr.gI().typeTradeOrder > 0) {
                        if (this.ntgtCN.ntgtAB != 1) {
                            var2 = this.ntgtBQ[this.ntgtCN.ntgtAA() - 1];
                            if (GameScr.gI().coinTradeOrder < var2) {
                                Code.sellerAB(this.ntgtAB.cName, "Bạn cần phải giao dịch " + NinjaUtil.numberToString(String.valueOf(var2)) + " xu.");
                                this.ntgtAT();
                                return;
                            }
                        }

                        if (ntgtAV()) {
                            Code.sellerAB(this.ntgtAB.cName, "Không thêm vật phẩm vào giao dịch này. Please!");
                            this.ntgtAT();
                            return;
                        }

                        if (GameScr.gI().typeTrade == 0) {
                            Auto.sleep(1000L);
                            GameScr.gI().actTradeLock();
                        }

                        this.ntgtBO = -45;
                        this.ntgtAC = System.currentTimeMillis();
                        this.ntgtBX = System.currentTimeMillis();
                        return;
                    }

                    if (System.currentTimeMillis() - this.ntgtAC > 10000L) {
                        this.ntgtAT();
                        return;
                    }
                    break;
                }

                this.ntgtAT();
                return;
            case 46:
                if (this.ntgtAB == null || this.ntgtCN == null) {
                    this.ntgtAT();
                    return;
                }

                if (GameScr.gI().typeTradeOrder >= 2 && System.currentTimeMillis() - this.ntgtBX >= 6000L) {
                    if (this.ntgtCN.ntgtAB != 1) {
                        var2 = this.ntgtBQ[this.ntgtCN.ntgtAA() - 1];
                        if (GameScr.gI().coinTradeOrder < var2) {
                            Code.sellerAB(this.ntgtAB.cName, "Không làm mà muốn có ăn thì chỉ có ăn cứt thôi, ăn cái đầu buồi!");
                            this.ntgtAT();
                            return;
                        }
                    }

                    if (ntgtAV()) {
                        Code.sellerAB(this.ntgtAB.cName, "Không thêm vật phẩm vào giao dịch này. Please!");
                        this.ntgtAT();
                        return;
                    }

                    this.ntgtBO = -46;
                    this.ntgtAC = System.currentTimeMillis();
                    GameScr.gI().actTradeAccept();
                    return;
                }

                if (System.currentTimeMillis() - this.ntgtAC > 10000L) {
                    this.ntgtAT();
                    return;
                }
                break;
            case 57:
                this.ntgtBY = System.currentTimeMillis();
                this.ntgtBO = -57;
                return;
            case 58:
                if (this.ntgtAB != null && this.ntgtCN != null) {
                    ntgtAH("\r\n==========" + ntgtAX() + "==========\r\n- IG: " + this.ntgtAB.cName + " (" + (this.ntgtCN.ntgtAB() ? "chưa vào gia tộc" : "thành viên cũ") + ")\r\n- Mua: Nhẫn cấp " + this.ntgtCN.ntgtAA() + "\r\n- Giá: " + NinjaUtil.numberToString(String.valueOf(this.ntgtBQ[this.ntgtCN.ntgtAA() - 1])) + " xu\r\n");
                    if (this.ntgtCN.ntgtAB == 1) {
                        ntgtBW.remove(this.ntgtAB.cName);
                        Code.sellerAB(this.ntgtAB.cName, "Cám ơn bạn ủng hộ. Hãy quay lại mua vào lúc khác bạn nhé!");
                        ntgtAH("- Trả lại xu: Đã trả lại xu\r\n- Lý do: Ko thể mời vào gia tộc\r\n");
                    } else {
                        ntgtAH("- Trạng thái: Đã nhận được xu\r\n");
                        ntgtAA.remove(this.ntgtAB.cName);
                        if (!this.ntgtAB.cClanName.equals("") && this.ntgtAB.cClanName.equals(Char.getMyChar().cClanName)) {
                            var2 = this.ntgtCN.ntgtAA() - 1;
                            if (!this.ntgtAA(this.ntgtCN.ntgtAC(), var2)) {
                                Code.sellerAB(this.ntgtCN.ntgtAC(), "Hãy chờ mình đi mua nhẫn đừng đi đâu nhé!");
                                this.ntgtAB(var2, false);
                                this.ntgtAD(var2);
                                if (!this.ntgtAA(this.ntgtCN.ntgtAC(), var2)) {
                                    ntgtBV.put(this.ntgtCN.ntgtAC(), this.ntgtCN);
                                    ntgtAH("- Giao nhẫn: Đang chờ...\r\n");
                                } else {
                                    ntgtAH("- Giao nhẫn: Thành công\r\n- Trục xuất: Không trục xuất\r\n");
                                }
                            } else {
                                ntgtAH("- Giao nhẫn: Thành công\r\n- Trục xuất: Không trục xuất\r\n");
                            }
                        } else if (this.ntgtAB.cClanName.equals("")) {
                            this.ntgtCO = false;
                            this.ntgtCP = this.ntgtAB.cName;
                            Auto.sleep(500L);
                            Service.gI().clanInvite(this.ntgtAB.charID);
                            if (ntgtAC(15000L)) {
                                if (this.ntgtCO) {
                                    Code.sellerAB(this.ntgtAB.cName, "Bạn không thể vào gia tộc trong 24h. Hãy giao dịch lại với mình để nhận lại xu!");
                                    ntgtBW.put(this.ntgtAB.cName, this.ntgtCN);
                                    ntgtAH("- Mời vào gia tộc: Thất bại\r\n- Trả lại xu: Đang chờ...\r\n");
                                } else {
                                    ntgtAH("- Mời vào gia tộc: Thành công\r\n");
                                    var2 = this.ntgtCN.ntgtAA() - 1;
                                    if (!this.ntgtAA(this.ntgtCN.ntgtAC(), var2)) {
                                        Code.sellerAB(this.ntgtCN.ntgtAC(), "Hãy chờ mình đi mua nhẫn đừng đi đâu nhé!");
                                        this.ntgtAB(var2, ntgtBK && this.ntgtCB < 5);
                                        this.ntgtAD(var2);
                                        if (!this.ntgtAA(this.ntgtCN.ntgtAC(), var2)) {
                                            ntgtBV.put(this.ntgtCN.ntgtAC(), this.ntgtCN);
                                            ntgtAH("- Giao nhẫn: Đang chờ...\r\n");
                                        } else if (this.ntgtAJ(this.ntgtCN.ntgtAC())) {
                                            ntgtAH("- Giao nhẫn: Thành công\r\n- Trục xuất: Đã trục xuất\r\n");
                                        } else {
                                            ntgtAH("- Giao nhẫn: Thành công\r\n- Trục xuất: Không trục xuất\r\n");
                                        }
                                    } else if (this.ntgtAJ(this.ntgtCN.ntgtAC())) {
                                        ntgtAH("- Trạng thái: Thành công\r\n- Trục xuất: Đã trục xuất\r\n");
                                    } else {
                                        ntgtAH("- Trạng thái: Thành công\r\n- Trục xuất: Không trục xuất\r\n");
                                    }
                                }
                            } else {
                                ntgtBU.put(this.ntgtAB.cName, this.ntgtCN);
                                Code.sellerAB(this.ntgtAB.cName, "Bạn không đồng ý vào gia tộc. Không thể nhận nhẫn!");
                                Auto.sleep(100L);
                                Code.sellerAB(this.ntgtAB.cName, "Giao dịch lại với Bot để Bot trả nhẫn (ko mất thêm phí)");
                                ntgtAH("- Mời vào gia tộc: Đang chờ...\r\n");
                            }
                        }
                    }

                    this.ntgtAT();
                    return;
                }

                this.ntgtAT();
                return;
            default:
                if (System.currentTimeMillis() - this.ntgtAC > 180000L) {
                    this.ntgtAT();
                }
        }

    }

    private static String ntgtAX() {
        Calendar var0 = Code.MuiGio();
        return " [ " + var0.get(5) + "-" + var0.get(2) + "-" + var0.get(1) + " " + var0.get(11) + ":" + var0.get(12) + ":" + var0.get(13) + " ] ";
    }

    private static boolean ntgtAK(String var0) {
        if (!AutoNTGT1.ntgtAA.isEmpty() && AutoNTGT1.ntgtAA.containsKey(var0)) {
            try {
                long var1 = Long.parseLong((String) AutoNTGT1.ntgtAA.get(var0));
                if (System.currentTimeMillis() - var1 <= 10000L) {
                    AutoNTGT1.ntgtAA.put(var0, String.valueOf(System.currentTimeMillis()));
                    return true;
                }
            } catch (NumberFormatException var3) {
                AutoNTGT1.ntgtAA.remove(var0);
            }
        }

        return false;
    }

    final void ntgtAF(String var1) {
        if (!ntgtAK(var1)) {
            MyVector var2 = new MyVector();
            if (this.ntgtCD != null && this.ntgtCD.length > 0) {
                for (int var3 = 0; var3 < this.ntgtCD.length; ++var3) {
                    var2.addElement(this.ntgtCD[var3]);
                }

                (new AutoNTGT1(var1, var2)).ntgtAA();
            }

        }
    }

    public final void ntgtAG(String var1) {
        if (!ntgtAK(var1)) {
            MyVector var2 = new MyVector();
            if (this.ntgtCE != null && this.ntgtCE.length > 0) {
                for (int var3 = 0; var3 < this.ntgtCE.length; ++var3) {
                    var2.addElement(this.ntgtCE[var3]);
                }

                (new AutoNTGT1(var1, var2)).ntgtAA();
            }

        }
    }

    public final String toString() {
        return "Auto NTGT";
    }

    static {
        ntgtAR();
    }
}
