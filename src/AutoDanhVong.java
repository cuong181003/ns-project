
public final class AutoDanhVong extends Auto {

    public static int advAA = -2;
    private static int advAZ;
    private static int advBA;
    private static int advBB;
    private static int advBC;
    public static ItemTemplate advAB;
    public static Item advAC = null;
    private static Item advBD = null;
    private static Item advBE = null;
    private static boolean advBF = false;
    private static boolean advBG = false;
    private static boolean advBH = false;
    private static int advBI = 0;
    private static int advBJ = 0;
    private static byte advBK = 0;
    private static String[] advBL;
    private static String[] advBM;
    private static String[] advBN;
    private static String[] advBO;
    private static String[] advBP;
    private static String[] advBQ;
    private static String[] advBR;
    private static String[] advBS;
    private static String[] advBT;
    private static String[] advBU;
    private static String[] advBV;
    private static String[] advBW;
    private static final Object advBX = new Object();
    private static boolean advBY = false;
    private static boolean advBZ = false;
    private static boolean advCA = false;
    private static boolean advCB = false;
    private static boolean advCC = false;
    private static boolean advCD;
    private static byte advCE;
    private static int advCF = -1;
    private TaskOrder advCG;

    public static void advAA() {
        advBY = true;
        synchronized (advBX) {
            try {
                advBX.wait(2000L);
            } catch (InterruptedException var2) {
            }

        }
    }

    public static void advAB() {
        if (advBY) {
            synchronized (advBX) {
                advBX.notifyAll();
            }

            advBY = false;
        }

    }

    private static boolean advAU() {
        advCC = true;
        long var0 = System.currentTimeMillis();
        synchronized (advBX) {
            try {
                advBX.wait(5000L);
            } catch (InterruptedException var3) {
            }
        }

        return System.currentTimeMillis() - var0 < 5000L;
    }

    public static void advAC() {
        if (advCC) {
            synchronized (advBX) {
                advBX.notifyAll();
            }

            advCC = false;
        }

    }

    private static boolean advAV() {
        advBZ = true;
        long var0 = System.currentTimeMillis();
        synchronized (advBX) {
            try {
                advBX.wait(5000L);
            } catch (InterruptedException var3) {
            }
        }

        return System.currentTimeMillis() - var0 < 5000L;
    }

    public static void advAD() {
        if (advBZ) {
            synchronized (advBX) {
                advBX.notifyAll();
            }

            advBZ = false;
        }

    }

    public static boolean advAE() {
        advCA = true;
        long var0 = System.currentTimeMillis();
        synchronized (advBX) {
            try {
                advBX.wait(5000L);
            } catch (InterruptedException var3) {
            }
        }

        return System.currentTimeMillis() - var0 < 5000L;
    }

    public static void advAF() {
        if (advCA) {
            synchronized (advBX) {
                advBX.notifyAll();
            }

            advCA = false;
        }

    }

    public static boolean advAG() {
        advCB = true;
        long var0 = System.currentTimeMillis();
        synchronized (advBX) {
            try {
                advBX.wait(5000L);
            } catch (InterruptedException var3) {
            }
        }

        return System.currentTimeMillis() - var0 < 5000L;
    }

    public static void advAH() {
        if (advCB) {
            synchronized (advBX) {
                advBX.notifyAll();
            }

            advCB = false;
        }

    }

    public final void update() {
        super.update();
        this.advAW();
    }

    private void advAW() {
        advAA = -2;
        advBE = null;
        advAC = null;
        advBD = null;
        advBF = false;
        advBG = false;
        advBH = false;
        advCD = false;
        advAF();
        advAH();
        advAD();
        advAC();
        if (FormDanhVong.advAE <= 0) {
            this.advCG = Char.getTaskOrder(0);
        } else {
            super.advAG = TileMap.isHang(FormDanhVong.advAE);
        }

        if (Session_ME.IP.equals(advBL[0]) || Session_ME.IP.equals(advBL[1])) {
            advBK = 1;
        }

        if (advCF == -1) {
            advAZ = 0;
            advBA = 0;
            advCE = 0;
            advCF = Code.advAH(advBK).get(5);
        } else {
            int var1;
            if ((var1 = Code.advAH(advBK).get(5)) != advCF) {
                advAZ = 0;
                advBA = 0;
                advCE = 0;
                advCF = var1;
            }

        }
    }

    private static int advAB(byte var0) {
        if (var0 > 0 && var0 < 20) {
            return 4;
        } else if (var0 >= 20 && var0 < 40) {
            return 8;
        } else if (var0 >= 40 && var0 < 50) {
            return 12;
        } else {
            return var0 >= 50 && var0 < 60 ? 14 : 16;
        }
    }

    public static void advAA(String var0) {
        if (advAA >= 0) {
            if (var0.startsWith("-") || var0.indexOf(advBM[advBK]) != -1) {
                advAB = null;
                advBF = false;
                advAA = -1;
                LockGame.advBF();
                return;
            }
        } else {
            if (advAA == -2 && var0.startsWith(advBN[advBK])) {
                advAB = null;
                advAA = -1;
                LockGame.advBF();
                return;
            }

            advBF = false;
            String[] var9 = Code.split(var0, "\n");
            System.out.println("Nhiệm vụ: " + var9[0]);
            if (var9[0].equals(advBO[advBK])) {
                advAA = 1;
            } else if (var9[0].equals(advBP[advBK]) && !FormDanhVong.advAS) {
                advAA = 2;
            } else if (var9[0].equals(advBQ[advBK]) && !FormDanhVong.advAT) {
                advAA = 3;
            } else if (var9[0].startsWith(advBV[advBK]) && FormDanhVong.advAK != 0) {
                advAA = 4;
            } else if (var9[0].equals(advBR[advBK])) {
                advAA = 5;
            } else {
                advAA = 0;
            }

            if (advAA != 0) {
                String var1;
                String var2;
                int var3;
                String var4;
                String var11;
                if (advAA < 4) {
                    if (var9[1].startsWith(advBS[advBK]) && var9[2].startsWith("- " + advBT[advBK] + " ")) {
                        if (advBK != 0) {
                            if (var9[1].indexOf("item") != -1) {
                                var1 = var9[1].substring(11, var9[1].length() - 1);
                            } else {
                                var1 = var9[1].substring(6, var9[1].length() - 1);
                            }

                            var3 = (var2 = var9[2].substring(9).trim()).indexOf(47);
                        } else {
                            var1 = var9[1].substring(19, var9[1].length() - 1);
                            var3 = (var2 = var9[2].substring(12).trim()).indexOf(47);
                        }

                        var4 = var2.substring(0, var3);
                        var11 = var2.substring(var3 + 1, var2.indexOf(32));

                        try {
                            advBI = advBB = Integer.parseInt(var4);
                            advBJ = advBC = Integer.parseInt(var11);
                            System.out.println("Item=" + var1 + " gender=" + Char.getMyChar().cgender);
                            if ((advAB = ItemTemplates.advAA(var1, (byte) Char.getMyChar().cgender)) == null) {
                                throw new Exception();
                            }

                            System.out.println("ID=" + advAB.id + " type=" + advAB.type + " name=" + advAB.name + " mumb: " + var4 + " max: " + var11);
                            if (var9.length >= 4 && var9[3].equals("- Hoàn thành nhiệm vụ, hãy gặp Ameji để trả nhiệm vụ")) {
                                advBF = true;
                            } else {
                                advCD = false;
                            }
                        } catch (Exception var8) {
                            GameScr.paint("Lỗi nv!");
                            advBG = true;
                        }
                    } else {
                        GameScr.paint("Lỗi nv!");
                        advBG = true;
                    }
                } else if (advAA == 4) {
                    if (!var9[1].startsWith("- " + advBV[advBK] + " ")) {
                        GameScr.paint("Lỗi nv!");
                        advBG = true;
                    } else {
                        int var10 = var9[1].indexOf(advBW[advBK]);
                        String var5;
                        if (advBK != 0) {
                            if (var9[1].indexOf("item") != -1) {
                                var2 = var9[1].substring(15, var10).trim();
                                var5 = var9[1].substring(15, var10 - 1);
                            } else {
                                var2 = var9[1].substring(10, var10).trim();
                                var5 = var9[1].substring(10, var10 - 1);
                            }

                            var10 = (var11 = var9[1].substring(var10 + 9).trim()).indexOf(47);
                        } else {
                            var5 = var9[1].substring(20, var10 - 1);
                            var2 = var9[1].substring(20, var10).trim();
                            var10 = (var11 = var9[1].substring(var10 + 8).trim()).indexOf(47);
                        }

                        var4 = var11.substring(0, var10);
                        var11 = var11.substring(var10 + 1);

                        try {
                            advBI = advBB = Integer.parseInt(var4);
                            advBJ = advBC = Integer.parseInt(var11);
                            System.out.println("Item=" + var2 + " gender=" + Char.getMyChar().cgender);
                            if ((advAB = ItemTemplates.advAA(var2, (byte) Char.getMyChar().cgender)) == null && (advAB = ItemTemplates.advAA(var5, (byte) Char.getMyChar().cgender)) == null) {
                                throw new Exception();
                            }

                            System.out.println("ID=" + advAB.id + " type=" + advAB.type + " name=" + advAB.name + " mumb: " + var4 + " max: " + var11);
                            if (var9.length >= 3 && var9[2].equals("- Hoàn thành nhiệm vụ, hãy gặp Ameji để trả nhiệm vụ")) {
                                advBF = true;
                            } else if (advAB(advAB.level) < advBC) {
                                advAA = 0;
                                System.out.println("Max nâng cấp " + advAB(advAB.level) + " / nv yêu cầu " + advBC + ": " + advAB.name);
                            } else {
                                advCD = false;
                            }
                        } catch (Exception var7) {
                            GameScr.paint("Lỗi nv!");
                            advBG = true;
                        }
                    }
                } else if (advAA == 5) {
                    label129:
                    {
                        if (var9[1].startsWith(advBS[advBK]) && var9[2].startsWith(advBU[advBK])) {
                            if (advBK != 0) {
                                if (var9[1].indexOf("item") != -1) {
                                    var1 = var9[1].substring(11, var9[1].length() - 1);
                                } else {
                                    var1 = var9[1].substring(6, var9[1].length() - 1);
                                }

                                var3 = (var2 = var9[2].substring(6).trim()).indexOf(47);
                            } else {
                                var1 = var9[1].substring(19, var9[1].length() - 1);
                                var3 = (var2 = var9[2].substring(14).trim()).indexOf(47);
                            }

                            var4 = var2.substring(0, var3);
                            var11 = var2.substring(var3 + 1, var2.indexOf(32));

                            try {
                                advBI = advBB = Integer.parseInt(var4);
                                advBJ = advBC = Integer.parseInt(var11);
                                System.out.println("Item=" + var1 + " gender=" + Char.getMyChar().cgender);
                                if ((advAB = ItemTemplates.advAA(var1, (byte) Char.getMyChar().cgender)) == null) {
                                    throw new Exception();
                                }

                                System.out.println("ID=" + advAB.id + " type=" + advAB.type + " name=" + advAB.name + " mumb: " + var4 + " max: " + var11);
                                if (var9.length >= 4 && var9[3].equals("- Hoàn thành nhiệm vụ, hãy gặp Ameji để trả nhiệm vụ")) {
                                    advBF = true;
                                } else {
                                    Code.autoLoiWin.advAA();
                                }
                                break label129;
                            } catch (Exception var6) {
                            }
                        }

                        GameScr.paint("Lỗi nv!");
                        advBG = true;
                    }
                }

                if (advAB != null && advAB.level > Char.getMyChar().clevel) {
                    advAA = 0;
                }
            }

            LockGame.advBF();
        }

    }

    public static boolean advAB(String var0) {
        if (!var0.equals("Con đã hoàn thành đủ số nhiệm vụ cho ngày hôm nay rồi")) {
            if (var0.equals("Mỗi ngày chỉ có thể sử dụng vật phẩm này 6 lần")) {
                advBH = true;
                advCE = FormDanhVong.advAR;
                return true;
            } else if (var0.equals("Hoàn thành nhiệm vụ, hãy gặp Ameji để trả nhiệm vụ")) {
                advBB = advBC;
                advBI = advBJ;
                if (advAA >= 4) {
                    advBF = true;
                }

                if (advAA <= 4) {
                    advCD = false;
                }

                return true;
            } else {
                int var1;
                int var2;
                if (var0.indexOf(advBS[advBK]) != -1) {
                    if (advAA < 4) {
                        var1 = var0.indexOf(advBT[advBK]);
                        var2 = var0.indexOf(47);
                        if (advBK != 0) {
                            var0 = var0.substring(var1 + 7, var2);
                        } else {
                            var0 = var0.substring(var1 + 10, var2);
                        }

                        try {
                            advBI = Integer.parseInt(var0);
                        } catch (NumberFormatException var5) {
                        }
                    } else if (advAA == 5) {
                        var1 = var0.indexOf(advBU[advBK]);
                        var2 = var0.indexOf(47);
                        if (advBK != 0) {
                            var0 = var0.substring(var1 + 6, var2);
                        } else {
                            var0 = var0.substring(var1 + 14, var2);
                        }

                        try {
                            advBI = Integer.parseInt(var0);
                        } catch (NumberFormatException var4) {
                        }
                    }
                } else if (var0.indexOf(advBV[advBK]) != -1 && advAA == 4) {
                    var1 = var0.indexOf(advBW[advBK]);
                    var2 = var0.indexOf(47);
                    if (advBK != 0) {
                        var0 = var0.substring(var1 + 9, var2);
                    } else {
                        var0 = var0.substring(var1 + 8, var2);
                    }

                    try {
                        advBI = Integer.parseInt(var0);
                    } catch (NumberFormatException var3) {
                    }
                }

                return true;
            }
        } else {
            advBH = true;
            if (FormDanhVong.advAR > 0 && advCE < FormDanhVong.advAR) {
                GameScr.paint("Đang kiểm tra danh vọng phù");
            } else {
                GameScr.paint("Xong");
            }

            return true;
        }
    }

    private boolean advAX() {
        byte var1;
        switch (FormDanhVong.advAN) {
            case 0:
                var1 = -1;
                break;
            case 1:
                var1 = 40;
                break;
            case 2:
            default:
                var1 = 50;
                break;
            case 3:
                var1 = 60;
                break;
            case 4:
                var1 = 70;
                break;
            case 5:
                var1 = 0;
        }

        if (var1 < 0 || var1 > 0 && advAB.level >= var1) {
            GameScr.paint("Thiếu item: " + advAB.name);
            System.out.println("Thiếu item: " + advAB.name);
            if (FormDanhVong.advAO != 0) {
                advAA = 0;
                advCD = true;
                return false;
            } else {
                return true;
            }
        } else if (!TileMap.isTruong(TileMap.mapID)) {
            this.remap(FormDanhVong.advAC, -2, -1, -1);
            return false;
        } else {
            System.out.println("Mua: " + advAB.name);
            if (advAB.type == 1) {
                GameScr.pickNPC(0, 0, 0);
            } else if (advAB.type == 8) {
                GameScr.pickNPC(1, 0, 4);
            } else if (advAB.type == 6) {
                GameScr.pickNPC(1, 0, 3);
            } else if (advAB.type == 4) {
                GameScr.pickNPC(1, 0, 2);
            } else if (advAB.type == 2) {
                GameScr.pickNPC(1, 0, 1);
            } else if (advAB.type == 0) {
                GameScr.pickNPC(1, 0, 0);
            } else if (advAB.type == 9) {
                GameScr.pickNPC(2, 0, 3);
            } else if (advAB.type == 7) {
                GameScr.pickNPC(2, 0, 2);
            } else if (advAB.type == 5) {
                GameScr.pickNPC(2, 0, 1);
            } else if (advAB.type == 3) {
                GameScr.pickNPC(2, 0, 0);
            }

            if (!LockGame.advBE()) {
                System.out.println("Lỗi mua item: " + advAB.type + " / " + advAB.name);
                GameScr.paint("Lỗi mua item: " + advAB.name);
                return true;
            } else {
                byte var10000 = advAB.type;
                int var2 = Char.getMyChar().cgender;
                Item[] var6;
                switch (var10000) {
                    case 0:
                        var6 = var2 == 1 ? GameScr.arrItemNonNam : GameScr.arrItemNonNu;
                        break;
                    case 1:
                        var6 = GameScr.arrItemWeapon;
                        break;
                    case 2:
                        var6 = var2 == 1 ? GameScr.arrItemAoNam : GameScr.arrItemAoNu;
                        break;
                    case 3:
                        var6 = GameScr.arrItemLien;
                        break;
                    case 4:
                        var6 = var2 == 1 ? GameScr.arrItemGangTayNam : GameScr.arrItemGangTayNu;
                        break;
                    case 5:
                        var6 = GameScr.arrItemNhan;
                        break;
                    case 6:
                        var6 = var2 == 1 ? GameScr.arrItemQuanNam : GameScr.arrItemQuanNu;
                        break;
                    case 7:
                        var6 = GameScr.arrItemNgocBoi;
                        break;
                    case 8:
                        var6 = var2 == 1 ? GameScr.arrItemGiayNam : GameScr.arrItemGiayNu;
                        break;
                    case 9:
                        var6 = GameScr.arrItemPhu;
                        break;
                    default:
                        var6 = null;
                }

                Item[] var5 = var6;
                if (var6 == null) {
                    System.out.println("Lỗi mua item: " + advAB.type + " / " + advAB.name);
                    GameScr.paint("Lỗi mua item: " + advAB.name);
                    return true;
                } else {
                    Item var4 = null;

                    for (int var3 = 0; var3 < var5.length; ++var3) {
                        if (var5[var3].template.id == advAB.id) {
                            var4 = var5[var3];
                            break;
                        }
                    }

                    if (var4 != null) {
                        Service.gI().requestItemInfo(var4.typeUI, var4.indexUI);
                        if (LockGame.advAS() && var4.buyCoin > Char.getMyChar().xu) {
                            System.out.println("Không đủ xu: " + var4.template.name);
                            GameScr.paint("Ko đủ xu mua: " + var4.template.name);
                            return true;
                        }

                        Service.gI().muaItem(var4.typeUI, var4.indexUI, 1);
                        LockGame.advAG();
                    }

                    return false;
                }
            }
        }
    }

    private boolean advAY() {
        if ((advBE = Char.getMyChar().arrItemBody[advAB.type]) != null) {
            System.out.println("Đang mặc: index=" + advBE.indexUI + " name=" + advBE.template.name);
        }

        if ((advBD = Char.getBagItem(advAB.id)) != null) {
            System.out.println("Hành trang: index=" + advBD.indexUI + " name=" + advBD.template.name);
            Service.gI().useItem(advBD.indexUI);
            if (LockGame.advAQ()) {
                return false;
            } else {
                advBD = null;
                System.out.println("Lỗi mặc item: " + advAB.name);
                return true;
            }
        } else if ((advAC = Char.advAL(advAB.id)) != null) {
            System.out.println("Trong rương: index=" + advAC.indexUI + " name=" + advAC.template.name);
            if (Char.getBagNum() > 0) {
                GameScr.pickNPC(5, 0, 0);
                if (advAE()) {
                    GameScr.pickNPC(5, 0, 0);
                }

                if (advAG()) {
                    Service.gI().itemBoxToBag(advAC.indexUI);
                    if (advAV()) {
                        Service.gI().useItem(advAC.indexUI);
                        if (LockGame.advAQ()) {
                            sleep(1000L);
                            GameScr.gI().resetButton();
                            return false;
                        }
                    }
                }
            }

            advAC = null;
            System.out.println("Lỗi lấy item trong rương: " + advAB.name);
            return true;
        } else {
            return this.advAX();
        }
    }

    private boolean advAZ() {
        if ((advAC = Char.advAL(advAB.id)) != null) {
            if (advAC.upgrade > advBC && advAC.upgrade > FormDanhVong.advAM) {
                advAC = null;
                return this.advAX();
            } else {
                System.out.println("Trong rương: index=" + advAC.indexUI + " name=" + advAC.template.name + " level=" + advAC.upgrade);
                if (Char.getBagNum() > 0) {
                    GameScr.pickNPC(5, 0, 0);
                    if (advAE()) {
                        GameScr.pickNPC(5, 0, 0);
                    }

                    if (advAG()) {
                        Service.gI().itemBoxToBag(advAC.indexUI);
                        if (advAV()) {
                            sleep(1000L);
                            GameScr.gI().resetButton();
                            return false;
                        }
                    }
                }

                advAC = null;
                System.out.println("Lỗi lấy item trong rương: " + advAB.name);
                return true;
            }
        } else {
            return this.advAX();
        }
    }

    private static int advAA(short var0) {
        for (int var1 = 0; var1 < Char.getMyChar().arrItemBag.length; ++var1) {
            if (Char.getMyChar().arrItemBag[var1] != null && Char.getMyChar().arrItemBag[var1].template.id == var0 && (Char.getMyChar().arrItemBag[var1].upgrade <= advBC || Char.getMyChar().arrItemBag[var1].upgrade <= FormDanhVong.advAM)) {
                return var1;
            }
        }

        return -1;
    }

    protected final void auto() {
        if (Auto.isMyCharInactive()) {
            if (TileMap.isTruong(TileMap.mapID) || TileMap.isLang(TileMap.mapID)) {
                Auto.advAA(false);
                return;
            }

            if (Char.isAReMap) {
                Auto.advAA(true);
                return;
            }
        } else {
            int var1;
            Item var9;
            if (advBH) {
                if (FormDanhVong.advAR > 0 && advCE < FormDanhVong.advAR) {
                    if ((var9 = Char.getBagItem(705)) != null) {
                        Service.gI().useItem(var9.indexUI);
                        if (advAU()) {
                            ++advCE;
                            this.advAW();
                            advCD = true;
                        }

                        return;
                    }

                    if (Char.getMyChar().luong >= 5) {
                        if (!TileMap.isTruong(TileMap.mapID) && !TileMap.isLang(TileMap.mapID)) {
                            this.remap(FormDanhVong.advAC, -2, -1, -1);
                            return;
                        }

                        GameScr.pickNPC(26, 0, 0);
                        LockGame.advBE();
                        if (GameScr.arrItemStore != null) {
                            for (var1 = 0; var1 < GameScr.arrItemStore.length; ++var1) {
                                if (GameScr.arrItemStore[var1].template.id == 705) {
                                    Service.gI().muaItem(GameScr.arrItemStore[var1].typeUI, GameScr.arrItemStore[var1].indexUI, 1);
                                    LockGame.advAG();
                                    GameScr.gI().resetButton();
                                    return;
                                }
                            }
                        }
                    }
                }

                if (super.T != null && !(super.T instanceof AutoDanhVong)) {
                    if (FormDanhVong.advAJ > 0 && (TileMap.isLang(FormDanhVong.advAJ) || TileMap.isTruong(FormDanhVong.advAJ))) {
                        if (TileMap.mapID != FormDanhVong.advAJ) {
                            this.remap(FormDanhVong.advAJ, -2, -1, -1);
                        }

                        GameScr.pickNPC(5, 1, 0);
                        if (LockGame.advAY()) {
                            Auto.sleep(1000L);
                        }
                    }

                    Code.java_AC();
                    return;
                }

                Code.endAuto();
                return;
            }

            if ((var1 = Code.advAH(advBK).get(5)) != advCF) {
                advAZ = 0;
                advBA = 0;
                advCE = 0;
                advCF = var1;
            }

            if (advAA > 0 && !advBF && !advBG) {
                if (advAA < 4) {
                    if (Char.getMyChar().arrItemBody[advAB.type] != null && Char.getMyChar().arrItemBody[advAB.type].template.id == advAB.id) {
                        if (FormDanhVong.advAE <= 0) {
                            if (this.advCG == null) {
                                GameScr.pickNPC(25, GameScr.advGO, 0);
                                LockGame.advAK();
                                this.advCG = Char.getTaskOrder(0);
                            }

                            if (this.advCG != null) {
                                advCD = true;
                                FormDanhVong.advAE = this.advCG.mapId;
                                super.advAG = TileMap.isHang(FormDanhVong.advAE);
                            }
                        }

                        if (FormDanhVong.advAE <= 0) {
                            GameScr.paint("Chưa đặt map hoặc k có nvhn");
                            advBG = true;
                            return;
                        }

                        if (TileMap.mapID == FormDanhVong.advAE) {
                            if (FormDanhVong.advAF >= 0 && !super.advAG && super.zoneID != TileMap.zoneID) {
                                Auto.advAA(FormDanhVong.advAF);
                                super.zoneID = FormDanhVong.advAF;
                            }

                            if (advBB < advBC) {
                                if (FormDanhVong.advAP == 0) {
                                    this.advAB(-1, advAA == 2 ? 3 : (advAA == 3 ? 5 : 1));
                                } else {
                                    if (!Char.isASanTaTl) {
                                        Char.isASanTaTl = true;
                                    }

                                    this.advAB(-1, this.advAA(Char.isADanhQuai, Char.isADanhTA, Char.isADanhTL));
                                }

                                this.advAC(-1);
                                return;
                            }

                            advBF = true;
                            if (Char.isAReMap) {
                                Auto.advAP();
                                return;
                            }

                            this.remap(FormDanhVong.advAC, -2, -1, -1);
                            return;
                        }

                        if (!advCD && FormDanhVong.advAJ > 0 && (TileMap.isLang(FormDanhVong.advAJ) || TileMap.isTruong(FormDanhVong.advAJ))) {
                            if (TileMap.mapID != FormDanhVong.advAJ) {
                                this.remap(FormDanhVong.advAJ, -2, -1, -1);
                            }

                            GameScr.pickNPC(5, 1, 0);
                            if (LockGame.advAY()) {
                                advCD = true;
                                Auto.sleep(1000L);
                            }
                        }

                        this.remap(FormDanhVong.advAE, FormDanhVong.advAF, -1, -1);
                        return;
                    }

                    if (this.advAY()) {
                        advBG = true;
                        advCD = true;
                        return;
                    }
                } else {
                    if (advAA == 4) {
                        if (FormDanhVong.advAK == 1) {
                            GameScr.paint("Dừng auto nv nâng cấp: " + advAB.name);
                            advBG = true;
                            return;
                        }

                        if (FormDanhVong.advAL < advBC) {
                            advAA = 0;
                            return;
                        }

                        if ((var1 = advAA(advAB.id)) < 0) {
                            if (this.advAZ()) {
                                advBG = true;
                                advCD = true;
                                return;
                            }
                        } else if (advBB < advBC) {
                            Char var2;
                            var9 = (var2 = Char.getMyChar()).arrItemBag[var1];
                            int var3 = 0;
                            int var4 = 0;
                            if (var9.isTypeClothe()) {
                                var3 = GameScr.upClothe[var9.upgrade];
                                var4 = GameScr.coinUpClothes[var9.upgrade];
                            } else if (var9.isTypeAdorn()) {
                                var3 = GameScr.upAdorn[var9.upgrade];
                                var4 = GameScr.coinUpAdorns[var9.upgrade];
                            } else if (var9.isTypeWeapon()) {
                                var3 = GameScr.upWeapon[var9.upgrade];
                                var4 = GameScr.coinUpWeapons[var9.upgrade];
                            }

                            int var5 = GameScr.maxPercents[var9.upgrade];
                            float var6;
                            if (((var6 = (float) (Char.getBagLT() * 100 / var3)) >= (float) var5 * 0.9F || Char.getBagNum() <= 2 && var6 > 0.0F) && var4 <= var2.yen) {
                                if (Char.isAReMap && !TileMap.isLang(TileMap.mapID) && !TileMap.isTruong(TileMap.mapID)) {
                                    Auto.advAP();
                                    Auto.sleep(500L);
                                    return;
                                }

                                if (!TileMap.isLang(TileMap.mapID)) {
                                    if (FormDanhVong.advAJ > 0 && TileMap.isLang(FormDanhVong.advAJ)) {
                                        this.remap(FormDanhVong.advAJ, -2, -1, -1);
                                        return;
                                    }

                                    this.remap(22, -2, -1, -1);
                                    return;
                                }

                                GameScr.pickNPC(6, 0, 0);
                                LockGame.advAQ();
                                GameScr.itemUpGrade = var9;
                                GameScr.arrItemUpGrade = new Item[18];
                                var1 = 0;
                                var4 = 0;
                                var6 = 0.0F;

                                for (int var7 = 0; var7 < var2.arrItemBag.length; ++var7) {
                                    Item var8;
                                    if ((var8 = var2.arrItemBag[var7]) != null && var8.template.type == 26 && var8.template.id <= 4) {
                                        GameScr.indexSelect = var7;
                                        GameScr.arrItemUpGrade[var1] = var8;
                                        var2.arrItemBag[var7] = null;
                                        if ((var6 = (float) ((var4 += GameScr.crystals[var8.template.id]) * 100 / var3)) >= (float) var5 * 0.9F || var1 >= 17) {
                                            break;
                                        }

                                        ++var1;
                                    }
                                }

                                if (var6 > 0.0F) {
                                    sleep(1000L);
                                    Service.gI().upgradeItem(GameScr.itemUpGrade, GameScr.arrItemUpGrade);
                                    if (LockGame.advAQ()) {
                                        sleep(1000L);
                                    }
                                }

                                GameScr.itemUpGrade = null;
                                return;
                            }

                            if (GameScr.isPaintUI()) {
                                GameScr.gI().resetButton();
                                sleep(1500L);
                            }

                            if (Char.getBagNum() <= 2) {
                                advBG = true;
                                GameScr.paint("Hành trang không đủ chỗ trống");
                                System.out.println("Lỗi nv nâng cấp: Full hành trang");
                                return;
                            }

                            if (FormDanhVong.advAE <= 0) {
                                if (this.advCG == null) {
                                    GameScr.pickNPC(25, GameScr.advGO, 0);
                                    LockGame.advAK();
                                    this.advCG = Char.getTaskOrder(0);
                                }

                                if (this.advCG != null) {
                                    advCD = true;
                                    FormDanhVong.advAE = this.advCG.mapId;
                                    super.advAG = TileMap.isHang(FormDanhVong.advAE);
                                }
                            }

                            if (FormDanhVong.advAE <= 0) {
                                GameScr.paint("Chưa đặt map hoặc k có nvhn");
                                advBG = true;
                                return;
                            }

                            if (TileMap.mapID == FormDanhVong.advAE) {
                                if (FormDanhVong.advAF >= 0 && !super.advAG && super.zoneID != TileMap.zoneID) {
                                    Auto.advAA(FormDanhVong.advAF);
                                    super.zoneID = FormDanhVong.advAF;
                                }

                                this.advAC(-1);
                                if (FormDanhVong.advAP == 0) {
                                    this.advAB(-1, 1);
                                    return;
                                }

                                this.advAB(-1, this.advAA(Char.isADanhQuai, Char.isADanhTA, Char.isADanhTL));
                                return;
                            }

                            if (!advCD && FormDanhVong.advAJ > 0 && (TileMap.isLang(FormDanhVong.advAJ) || TileMap.isTruong(FormDanhVong.advAJ))) {
                                if (TileMap.mapID != FormDanhVong.advAJ) {
                                    this.remap(FormDanhVong.advAJ, -2, -1, -1);
                                }

                                GameScr.pickNPC(5, 1, 0);
                                if (LockGame.advAY()) {
                                    advCD = true;
                                    Auto.sleep(1000L);
                                }
                            }

                            this.remap(FormDanhVong.advAE, FormDanhVong.advAF, -1, -1);
                        }

                        return;
                    }

                    if (advAA == 5) {
                        if (FormDanhVong.advAB == null || FormDanhVong.advAB.length() == 0) {
                            GameScr.paint("Hãy chat ld để set thông tin");
                            advBG = true;
                            return;
                        }

                        if (Char.getMyChar().arrItemBody[advAB.type] != null && Char.getMyChar().arrItemBody[advAB.type].template.id == advAB.id) {
                            if (advBB < advBC) {
                                Code.autoLoiWin.auto();
                                return;
                            }
                        } else if (this.advAY()) {
                            advBG = true;
                            return;
                        }
                    }
                }
            } else {
                if (!TileMap.isTruong(TileMap.mapID)) {
                    if (TileMap.mapID != 111) {
                        if (TileMap.mapID == 129 || TileMap.mapID == 149) {
                            Auto.sleep(1000L);
                            Auto.advAP();
                            return;
                        }

                        this.remap(FormDanhVong.advAC, -2, -1, -1);
                    }

                    return;
                }

                if (!advCD && FormDanhVong.advAJ > 0 && (TileMap.isLang(FormDanhVong.advAJ) || TileMap.isTruong(FormDanhVong.advAJ))) {
                    GameScr.pickNPC(5, 1, 0);
                    if (LockGame.advAY()) {
                        advCD = true;
                        Auto.sleep(1000L);
                    }
                }

                if (advAA == -2) {
                    GameScr.paint("Xem Info NVDV " + (advAZ + 1));
                    GameScr.pickNPC(2, 1, 7);
                    LockGame.advBE();
                    return;
                }

                if (advAA == -1) {
                    GameScr.paint("Nhận NVDV " + (advAZ + 1));
                    GameScr.pickNPC(2, 1, 0);
                    LockGame.advBE();
                    return;
                }

                if (advAA == 0) {
                    System.out.println("HuyNV");
                    GameScr.paint("Hủy NVDV " + (advAZ + 1));
                    GameScr.advAH(2);
                    Service.gI().sendUIConfirmID(8);
                    LockGame.advBE();
                    ++advAZ;
                    return;
                }

                if (advBG || advBF) {
                    if (advAC != null) {
                        if (advBE != null) {
                            System.out.println("Mặc lại đồ: " + advBE.template.name + " index=" + advBE.indexUI);
                            var1 = advBE.indexUI;
                            Service.gI().useItem(var1);
                            if (LockGame.advAQ()) {
                                if (Char.getMyChar().arrItemBox == null) {
                                    Service.gI().requestItem(4);
                                    LockGame.advAS();
                                }

                                if (Char.getBoxNum() > 0) {
                                    System.out.println("Cất vào rương: " + Char.getMyChar().arrItemBag[var1].template.name);
                                    GameScr.pickNPC(5, 0, 0);
                                    if (advAE()) {
                                        GameScr.pickNPC(5, 0, 0);
                                    }

                                    if (advAG()) {
                                        Service.gI().itemBagToBox(var1);
                                        advAA();
                                        GameScr.gI().resetButton();
                                    }
                                }
                            }

                            advBE = null;
                        } else {
                            if (Char.getMyChar().arrItemBox == null) {
                                Service.gI().requestItem(4);
                                LockGame.advAS();
                            }

                            if (Char.getBoxNum() > 0) {
                                System.out.println("Cất vào rương: " + advAC.template.name);
                                GameScr.pickNPC(5, 0, 0);
                                if (advAE()) {
                                    GameScr.pickNPC(5, 0, 0);
                                }

                                if (advAG()) {
                                    Service.gI().itemBagToBox(advAC.indexUI);
                                    advAA();
                                    GameScr.gI().resetButton();
                                }
                            }
                        }

                        advAC = null;
                    } else if (advBD != null) {
                        if (advBE != null) {
                            System.out.println("Mặc lại đồ: " + advBE.template.name + " index=" + advBE.indexUI);
                            Service.gI().useItem(advBE.indexUI);
                            LockGame.advAQ();
                            advBE = null;
                        }

                        advBD = null;
                    }

                    if (advBF) {
                        if (advAA == 4) {
                            GameScr.gI().resetButton();
                            sleep(1500L);
                        }

                        if (Char.getBagNum() <= 0) {
                            advBF = false;
                            advBG = true;
                            GameScr.paint("Hành trang đầy");
                            return;
                        }

                        GameScr.paint("Hoàn thành NVDV " + (advAZ + 1));
                        GameScr.pickNPC(2, 1, 1);
                        LockGame.advBE();
                        ++advAZ;
                        ++advBA;
                        return;
                    }

                    if (super.T != null && !(super.T instanceof AutoDanhVong)) {
                        Auto.sleep(3000L);
                        if (FormDanhVong.advAJ > 0 && (TileMap.isLang(FormDanhVong.advAJ) || TileMap.isTruong(FormDanhVong.advAJ))) {
                            if (TileMap.mapID != FormDanhVong.advAJ) {
                                this.remap(FormDanhVong.advAJ, -2, -1, -1);
                            }

                            GameScr.pickNPC(5, 1, 0);
                            if (LockGame.advAY()) {
                                Auto.sleep(1000L);
                            }
                        }

                        Code.java_AC();
                        return;
                    }

                    Code.endAuto();
                }
            }
        }

    }

    public final String toString() {
        String var1 = "Auto DV " + advBA + "/" + advAZ;
        if (advAA > 0 && advAA <= 5) {
            switch (advAA) {
                case 1:
                    var1 = var1 + " - Đánh quái thường: ";
                    break;
                case 2:
                    var1 = var1 + " - Đánh tinh anh: ";
                    break;
                case 3:
                    var1 = var1 + " - Đánh thủ lĩnh: ";
                    break;
                case 4:
                    var1 = var1 + " - Nâng cấp: ";
                    break;
                case 5:
                    var1 = var1 + " - Lôi đài: ";
            }

            var1 = var1 + advBI + "/" + advBJ;
        }

        return var1;
    }

    static {
        String var0 = String.valueOf((char) 59);
        advBL = Code.split("13.251.169.132;54.151.133.77", var0);
        advBM = Code.split("Đã hủy nhiệm vụ; canceled", var0);
        advBN = Code.split("- Có thể nhận thêm; - Can take", var0);
        advBO = Code.split("Tiêu diệt quái; Defeat monster", var0);
        advBP = Code.split("Tiêu diệt tinh anh; Defeat Elites monster", var0);
        advBQ = Code.split("Tiêu diệt thủ lĩnh; Defeat Chief monster", var0);
        advBR = Code.split("Chiến thắng lôi đài; Win battle", var0);
        advBS = Code.split("- Sử dụng trang bị; - Use", var0);
        advBT = Code.split("Tiêu diệt; Defeat", var0);
        advBU = Code.split("- Chiến thắng; - Win", var0);
        advBV = Code.split("Nâng cấp trang bị; Upgrade", var0);
        advBW = Code.split("Lên cấp; To level", var0);
    }
}
