
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;
import javax.microedition.lcdui.Image;

public final class TileMap {

    public static int tmw;
    public static int tmh;
    public static int pxw;
    public static int pxh;
    public static int tileID;
    public static char[] maps;
    public static int[] types;
    private static Image imgTileAA;
    private static Image imgTileAB;
    public static Image imgMiniMap;
    private static Image imgWaterfall;
    private static Image imgTopWaterfall;
    private static Image imgWaterflow;
    private static Image imguwt;
    private static Image imgflowRiver;
    public static byte size = 24;
    private static int bx;
    private static int dbx;
    private static int fx;
    private static int dfx;
    public static String mapName1 = null;
    public static String mapName = "";
    public static byte zoneID;
    public static byte bgID;
    public static byte typeMap;
    public static short mapID;
    private static int cmtoYmini;
    private static int cmyMini;
    private static int cmdyMini;
    private static int cmvyMini;
    private static int cmtoXMini;
    private static int cmxMini;
    private static int cmdxMini;
    private static int cmvxMini;
    public static int wMiniMap;
    public static int hMiniMap;
    public static int posMiniMapX;
    public static int posMiniMapY;
    public static Vector vGo = new Vector();
    public static String[] mapNames;
    public static mHashtable1 locationStand = new mHashtable1();
    public static mHashtable1 itemMap = new mHashtable1();
    private static int defaultSolidTile;
    public static int sizeMiniMap = 2;
    public static int gssx;
    public static int gssxe;
    public static int gssy;
    public static int gssye;
    public static int countx;
    public static int county;
    private static int[] colorMini = new int[]{5257738, 8807192};
    public static short[][] shorts;
    private static boolean[] booleans;
    private static int[] ints;
    private static short[] shorts1;
    public static int advBC;
    public static boolean advBD;
    public static boolean advBE;
    private static Object advCC;
    private static byte[][] advCD;
    private static Image[] advCE;
    private static Image[] advCF;

    static {
        shorts = new short[166][];
        booleans = new boolean[166];
        ints = new int[166];
        shorts1 = new short[166];
        shorts[0] = new short[]{27};
        shorts[1] = new short[]{2, 3, 27, 72, 91, 94, 105, 114, 125, 157, 139, 113, 80};
        shorts[2] = new short[]{6, 1};
        shorts[3] = new short[]{1, 4};
        shorts[4] = new short[]{3, 5};
        shorts[5] = new short[]{7, 4};
        shorts[6] = new short[]{7, 2, 20, 21};
        shorts[7] = new short[]{6, 5, 8};
        shorts[8] = new short[]{7, 9};
        shorts[9] = new short[]{8, 10};
        shorts[10] = new short[]{9, 11, 17, 22, 32, 38, 43, 48, 139};
        shorts[11] = new short[]{12, 10};
        shorts[12] = new short[]{11, 57};
        shorts[13] = new short[]{57, 14};
        shorts[14] = new short[]{13, 15};
        shorts[15] = new short[]{14, 16};
        shorts[16] = new short[]{15, 17};
        shorts[17] = new short[]{16, 18, 10, 22, 32, 38, 43, 48, 139};
        shorts[18] = new short[]{17, 19};
        shorts[19] = new short[]{18, 58};
        shorts[20] = new short[]{6};
        shorts[21] = new short[]{22, 6};
        shorts[22] = new short[]{23, 21, 10, 17, 32, 38, 43, 48, 139};
        shorts[23] = new short[]{22, 69, 25};
        shorts[24] = new short[]{59, 36};
        shorts[25] = new short[]{23, 26};
        shorts[26] = new short[]{27, 25};
        shorts[27] = new short[]{26, 28, 1, 72, 91, 94, 105, 114, 125, 157, 139, 113, 80};
        shorts[28] = new short[]{27, 60};
        shorts[29] = new short[]{60, 30};
        shorts[30] = new short[]{29, 31};
        shorts[31] = new short[]{32, 30};
        shorts[32] = new short[]{31, 61, 10, 17, 22, 38, 43, 48, 139};
        shorts[33] = new short[]{61, 34};
        shorts[34] = new short[]{35, 33};
        shorts[35] = new short[]{34, 66};
        shorts[36] = new short[]{37, 24};
        shorts[37] = new short[]{36};
        shorts[38] = new short[]{67, 68, 10, 17, 22, 32, 43, 48, 139};
        shorts[39] = new short[]{72, 46, 40};
        shorts[40] = new short[]{39, 65, 41};
        shorts[41] = new short[]{42, 40, 43};
        shorts[42] = new short[]{62, 41};
        shorts[43] = new short[]{41, 44, 10, 17, 22, 32, 38, 48, 139};
        shorts[44] = new short[]{43, 45};
        shorts[45] = new short[]{44, 53};
        shorts[46] = new short[]{63, 39, 47};
        shorts[47] = new short[]{46, 48};
        shorts[48] = new short[]{47, 50, 10, 17, 22, 32, 38, 43, 139};
        shorts[49] = new short[]{50, 51};
        shorts[50] = new short[]{48, 49};
        shorts[51] = new short[]{52, 49};
        shorts[52] = new short[]{51, 64};
        shorts[53] = new short[]{54, 45};
        shorts[54] = new short[]{55, 53};
        shorts[55] = new short[]{54};
        shorts[56] = new short[]{72};
        shorts[57] = new short[]{12, 13};
        shorts[58] = new short[]{19};
        shorts[59] = new short[]{68, 24};
        shorts[60] = new short[]{28, 29};
        shorts[61] = new short[]{33, 32};
        shorts[62] = new short[]{42};
        shorts[63] = new short[]{46};
        shorts[64] = new short[]{52};
        shorts[65] = new short[]{40};
        shorts[66] = new short[]{67, 35};
        shorts[67] = new short[]{66, 38};
        shorts[68] = new short[]{59, 38};
        shorts[69] = new short[]{70, 23};
        shorts[70] = new short[]{69, 71};
        shorts[71] = new short[]{72, 70};
        shorts[72] = new short[]{71, 39, 1, 27, 91, 94, 105, 114, 125, 157, 139, 113, 80};
        shorts[73] = new short[]{1};
        shorts[74] = new short[0];
        shorts[75] = new short[0];
        shorts[76] = new short[0];
        shorts[77] = new short[0];
        shorts[78] = new short[0];
        shorts[79] = new short[0];
        shorts[80] = new short[]{81, 82, 83};
        shorts[81] = new short[]{80, 84};
        shorts[82] = new short[]{80, 85};
        shorts[83] = new short[]{80, 86};
        shorts[84] = new short[]{81, 87};
        shorts[85] = new short[]{82, 88};
        shorts[86] = new short[]{83, 89};
        shorts[87] = new short[]{84, 90};
        shorts[88] = new short[]{85, 90};
        shorts[89] = new short[]{86, 90};
        shorts[90] = new short[0];
        shorts[91] = new short[]{92};
        shorts[92] = new short[]{91, 93};
        shorts[93] = new short[]{92};
        shorts[94] = new short[]{95};
        shorts[95] = new short[]{94, 96};
        shorts[96] = new short[]{95, 97};
        shorts[97] = new short[]{96};
        shorts[98] = new short[]{99};
        shorts[99] = new short[]{98, 101, 100, 102};
        shorts[100] = new short[]{99, 103};
        shorts[101] = new short[]{99, 103};
        shorts[102] = new short[]{99, 103};
        shorts[103] = new short[]{101, 102, 104, 100};
        shorts[104] = new short[]{103};
        shorts[105] = new short[]{107, 106, 108};
        shorts[106] = new short[]{105, 109};
        shorts[107] = new short[]{105, 109};
        shorts[108] = new short[]{105, 109};
        shorts[109] = new short[]{106, 107, 108};
        shorts[110] = new short[0];
        shorts[111] = new short[0];
        shorts[112] = new short[]{113};
        shorts[113] = new short[]{112};
        shorts[114] = new short[]{115};
        shorts[115] = new short[]{114, 116};
        shorts[116] = new short[]{115};
        shorts[117] = new short[0];
        shorts[118] = new short[0];
        shorts[119] = new short[0];
        shorts[120] = new short[0];
        shorts[121] = new short[0];
        shorts[122] = new short[0];
        shorts[123] = new short[0];
        shorts[124] = new short[0];
        shorts[125] = new short[]{126};
        shorts[126] = new short[]{125, 127};
        shorts[127] = new short[]{126, 128};
        shorts[128] = new short[]{127};
        shorts[129] = new short[0];
        shorts[130] = new short[0];
        shorts[131] = new short[0];
        shorts[132] = new short[0];
        shorts[133] = new short[0];
        shorts[134] = new short[]{138};
        shorts[135] = new short[]{138};
        shorts[136] = new short[]{138};
        shorts[137] = new short[]{138};
        shorts[138] = new short[]{134, 135, 136, 137};
        shorts[139] = new short[]{140};
        shorts[140] = new short[]{139, 141};
        shorts[141] = new short[]{140, 142};
        shorts[142] = new short[]{141, 143};
        shorts[143] = new short[]{142, 144};
        shorts[144] = new short[]{143, 145};
        shorts[145] = new short[]{144, 146};
        shorts[146] = new short[]{145, 147};
        shorts[147] = new short[]{146, 148};
        shorts[148] = new short[]{147};
        shorts[149] = new short[0];
        shorts[150] = new short[0];
        shorts[151] = new short[0];
        shorts[152] = new short[0];
        shorts[153] = new short[0];
        shorts[154] = new short[0];
        shorts[155] = new short[0];
        shorts[156] = new short[0];
        shorts[157] = new short[]{158, 159};
        shorts[158] = new short[]{157, 159};
        shorts[159] = new short[]{158, 157};
        shorts[162] = new short[]{165, 163, 164};
        shorts[163] = new short[]{162};
        shorts[165] = new short[]{162};
        shorts[164] = new short[]{162};
        advBC = -1;
        advBD = false;
        advBE = false;
        advCC = new Object();
        advCD = new byte[166][];

        for (int var0 = 0; var0 < 166; ++var0) {
            int var1 = var0;
            InputStream var2 = null;

            try {
                var2 = "".getClass().getResourceAsStream("/map/" + var1);
                advCD[var1] = new byte[var2.available()];
                var2.read(advCD[var1]);
                var2.close();
            } catch (Exception var9) {
                var9.printStackTrace();
            } finally {
                try {
                    var2.close();
                } catch (Exception var8) {
                }

            }
        }

        advCE = new Image[5];
        advCF = new Image[5];
    }

    public static void setPosMiniMap(int var0, int var1, int var2, int var3) {
        wMiniMap = var2;
        hMiniMap = var3;
        posMiniMapX = var0;
        posMiniMapY = var1;
    }

    public static void updateMiniMap() {
        cmtoXMini = Char.getMyChar().cx / 12;
        cmtoYmini = Char.getMyChar().cy / 12;
        if (cmtoXMini > tmw * sizeMiniMap - wMiniMap / 2) {
            cmtoXMini = tmw * sizeMiniMap - wMiniMap;
        } else if (cmtoXMini < wMiniMap / 2) {
            cmtoXMini = 0;
        } else {
            cmtoXMini -= wMiniMap / 2;
        }

        if (cmtoYmini < hMiniMap / 2) {
            cmtoYmini = 0;
        } else {
            cmtoYmini -= hMiniMap / 2;
        }

        if (cmtoYmini > tmh * sizeMiniMap - hMiniMap) {
            cmtoYmini = tmh * sizeMiniMap - hMiniMap;
        }

    }

    public static void updateCmMiniMap() {
        if (tmw * sizeMiniMap >= wMiniMap || tmh * sizeMiniMap >= hMiniMap) {
            if (cmyMini != cmtoYmini) {
                cmvyMini = cmtoYmini - cmyMini << 2;
                cmdyMini += cmvyMini;
                cmyMini += cmdyMini >> 4;
                cmdyMini &= 15;
            }

            if (cmxMini != cmtoXMini) {
                cmvxMini = cmtoXMini - cmxMini << 2;
                cmdxMini += cmvxMini;
                cmxMini += cmdxMini >> 4;
                cmdxMini &= 15;
            }
        }

    }

    public static void freeTilemap() {
        imgTileAA = null;
        System.gc();
    }

    static final void loadTileImage() {
        if (imguwt == null) {
            imguwt = GameCanvas.loadImage("/t/uwt.png");
        }

        if (imgWaterfall == null) {
            imgWaterfall = GameCanvas.loadImage("/t/wtf.png");
        }

        if (imgTopWaterfall == null) {
            imgTopWaterfall = GameCanvas.loadImage("/t/twtf.png");
        }

        if (imgWaterflow == null) {
            imgWaterflow = GameCanvas.loadImage("/t/wts.png");
        }

        if (imgflowRiver == null) {
            imgflowRiver = GameCanvas.loadImage("/t/wts1.png");
        }

        System.gc();
    }

    public static void loadMap(int var0) {
        pxh = tmh * size;
        pxw = tmw * size;

        try {
            for (int var1 = 0; var1 < tmw * tmh; ++var1) {
                int[] var10000;
                if (locationStand != null ? locationStand.mget(String.valueOf(var1)) != null : false) {
                    var10000 = types;
                    var10000[var1] |= 2;
                }

                if (var0 == 4) {
                    if (maps[var1] == 1 || maps[var1] == 2 || maps[var1] == 3 || maps[var1] == 4 || maps[var1] == 5 || maps[var1] == 6 || maps[var1] == '\t' || maps[var1] == '\n' || maps[var1] == 'O' || maps[var1] == 'P' || maps[var1] == '\r' || maps[var1] == 14 || maps[var1] == '+' || maps[var1] == ',' || maps[var1] == '-' || maps[var1] == '2') {
                        var10000 = types;
                        var10000[var1] |= 2;
                    }

                    if (maps[var1] == '\t' || maps[var1] == 11) {
                        var10000 = types;
                        var10000[var1] |= 4;
                    }

                    if (maps[var1] == '\n' || maps[var1] == '\f') {
                        var10000 = types;
                        var10000[var1] |= 8;
                    }

                    if (maps[var1] == '\r' || maps[var1] == 14) {
                        var10000 = types;
                        var10000[var1] |= 1024;
                    }

                    if (maps[var1] == 'L' || maps[var1] == 'M') {
                        var10000 = types;
                        var10000[var1] |= 64;
                        if (maps[var1] == 'N') {
                            var10000 = types;
                            var10000[var1] |= 4096;
                        }
                    }
                }

                if (var0 == 1) {
                    if (maps[var1] == 22) {
                        defaultSolidTile = maps[var1] - 1;
                    }

                    if (maps[var1] == 1 || maps[var1] == 2 || maps[var1] == 3 || maps[var1] == 4 || maps[var1] == 5 || maps[var1] == 6 || maps[var1] == 7 || maps[var1] == '$' || maps[var1] == '%' || maps[var1] == '6' || maps[var1] == '[' || maps[var1] == '\\' || maps[var1] == ']' || maps[var1] == '^' || maps[var1] == 'I' || maps[var1] == 'J' || maps[var1] == 'a' || maps[var1] == 'b' || maps[var1] == 't' || maps[var1] == 'u' || maps[var1] == 'v' || maps[var1] == 'x' || maps[var1] == '=') {
                        var10000 = types;
                        var10000[var1] |= 2;
                    }

                    if (maps[var1] == 2 || maps[var1] == 3 || maps[var1] == 4 || maps[var1] == 5 || maps[var1] == 6 || maps[var1] == 20 || maps[var1] == 21 || maps[var1] == 22 || maps[var1] == 23 || maps[var1] == '$' || maps[var1] == '%' || maps[var1] == '&' || maps[var1] == '\'' || maps[var1] == '=') {
                        var10000 = types;
                        var10000[var1] |= 4096;
                    }

                    if (maps[var1] == '\b' || maps[var1] == '\t' || maps[var1] == '\n' || maps[var1] == '\f' || maps[var1] == '\r' || maps[var1] == 14 || maps[var1] == 30) {
                        var10000 = types;
                        var10000[var1] |= 16;
                    }

                    if (maps[var1] == 17) {
                        var10000 = types;
                        var10000[var1] |= 32;
                    }

                    if (maps[var1] == 18) {
                        var10000 = types;
                        var10000[var1] |= 128;
                    }

                    if (maps[var1] == '%' || maps[var1] == '&' || maps[var1] == '=') {
                        var10000 = types;
                        var10000[var1] |= 4;
                    }

                    if (maps[var1] == '$' || maps[var1] == '\'' || maps[var1] == '=') {
                        var10000 = types;
                        var10000[var1] |= 8;
                    }

                    if (maps[var1] == 19) {
                        var10000 = types;
                        var10000[var1] |= 64;
                        if ((types[var1 - tmw] & 4096) == 4096) {
                            var10000 = types;
                            var10000[var1] |= 4096;
                        }
                    }

                    if (maps[var1] == '#') {
                        var10000 = types;
                        var10000[var1] |= 2048;
                    }

                    if (maps[var1] == 7) {
                        var10000 = types;
                        var10000[var1] |= 1024;
                    }

                    if (maps[var1] == ' ' || maps[var1] == '!' || maps[var1] == '"') {
                        var10000 = types;
                        var10000[var1] |= 256;
                    }
                }

                if (var0 == 2) {
                    if (maps[var1] == 22 || maps[var1] == 'g' || maps[var1] == 'o') {
                        defaultSolidTile = maps[var1] - 1;
                    }

                    if (maps[var1] == 1 || maps[var1] == 2 || maps[var1] == 3 || maps[var1] == 4 || maps[var1] == 5 || maps[var1] == 6 || maps[var1] == 7 || maps[var1] == '$' || maps[var1] == '%' || maps[var1] == '6' || maps[var1] == '=' || maps[var1] == 'I' || maps[var1] == 'L' || maps[var1] == 'M' || maps[var1] == 'N' || maps[var1] == 'O' || maps[var1] == 'R' || maps[var1] == 'S' || maps[var1] == 'b' || maps[var1] == 'c' || maps[var1] == 'd' || maps[var1] == 'f' || maps[var1] == 'g' || maps[var1] == 'l' || maps[var1] == 'm' || maps[var1] == 'n' || maps[var1] == 'p' || maps[var1] == 'q' || maps[var1] == 't' || maps[var1] == 'u' || maps[var1] == '}' || maps[var1] == '~' || maps[var1] == 127 || maps[var1] == 129 || maps[var1] == 130) {
                        var10000 = types;
                        var10000[var1] |= 2;
                    }

                    if (maps[var1] == 1 || maps[var1] == 3 || maps[var1] == 4 || maps[var1] == 5 || maps[var1] == 6 || maps[var1] == 20 || maps[var1] == 21 || maps[var1] == 22 || maps[var1] == 23 || maps[var1] == '$' || maps[var1] == '%' || maps[var1] == '&' || maps[var1] == '\'' || maps[var1] == '7' || maps[var1] == 'm' || maps[var1] == 'o' || maps[var1] == 'p' || maps[var1] == 'q' || maps[var1] == 'r' || maps[var1] == 's' || maps[var1] == 't' || maps[var1] == 127 || maps[var1] == 129 || maps[var1] == 130) {
                        var10000 = types;
                        var10000[var1] |= 4096;
                    }

                    if (maps[var1] == '\b' || maps[var1] == '\t' || maps[var1] == '\n' || maps[var1] == '\f' || maps[var1] == '\r' || maps[var1] == 14 || maps[var1] == 30 || maps[var1] == 135) {
                        var10000 = types;
                        var10000[var1] |= 16;
                    }

                    if (maps[var1] == 17) {
                        var10000 = types;
                        var10000[var1] |= 32;
                    }

                    if (maps[var1] == 18) {
                        var10000 = types;
                        var10000[var1] |= 128;
                    }

                    if (maps[var1] == '=' || maps[var1] == '%' || maps[var1] == '&' || maps[var1] == 127 || maps[var1] == 130 || maps[var1] == 131) {
                        var10000 = types;
                        var10000[var1] |= 4;
                    }

                    if (maps[var1] == '=' || maps[var1] == '$' || maps[var1] == '\'' || maps[var1] == 127 || maps[var1] == 129 || maps[var1] == 132) {
                        var10000 = types;
                        var10000[var1] |= 8;
                    }

                    if (maps[var1] == 19) {
                        var10000 = types;
                        var10000[var1] |= 64;
                        if ((types[var1 - tmw] & 4096) == 4096) {
                            var10000 = types;
                            var10000[var1] |= 4096;
                        }
                    }

                    if (maps[var1] == 134) {
                        var10000 = types;
                        var10000[var1] |= 64;
                        if ((types[var1 - tmw] & 4096) == 4096) {
                            var10000 = types;
                            var10000[var1] |= 4096;
                        }
                    }

                    if (maps[var1] == '#') {
                        var10000 = types;
                        var10000[var1] |= 2048;
                    }

                    if (maps[var1] == 7) {
                        var10000 = types;
                        var10000[var1] |= 1024;
                    }

                    if (maps[var1] == ' ' || maps[var1] == '!' || maps[var1] == '"') {
                        var10000 = types;
                        var10000[var1] |= 256;
                    }

                    if (maps[var1] == '=' || maps[var1] == 127) {
                        var10000 = types;
                        var10000[var1] |= 8192;
                    }
                }

                if (var0 == 3) {
                    if (maps[var1] == '\f' || maps[var1] == '3' || maps[var1] == 'X' || maps[var1] == 't' || maps[var1] == 128) {
                        defaultSolidTile = maps[var1] - 1;
                    }

                    if (maps[var1] == 'm' || maps[var1] == 'n') {
                        defaultSolidTile = maps[var1];
                    }

                    if (maps[var1] == 1 || maps[var1] == 2 || maps[var1] == 3 || maps[var1] == 4 || maps[var1] == 5 || maps[var1] == 6 || maps[var1] == 7 || maps[var1] == 11 || maps[var1] == 14 || maps[var1] == 17 || maps[var1] == '+' || maps[var1] == '3' || maps[var1] == '?' || maps[var1] == 'A' || maps[var1] == 'C' || maps[var1] == 'D' || maps[var1] == 'G' || maps[var1] == 'H' || maps[var1] == 'S' || maps[var1] == 'T' || maps[var1] == 'U' || maps[var1] == 'W' || maps[var1] == '[' || maps[var1] == '^' || maps[var1] == 'a' || maps[var1] == 'b' || maps[var1] == 'j' || maps[var1] == 'k' || maps[var1] == 'o' || maps[var1] == 'q' || maps[var1] == 'u' || maps[var1] == 'v' || maps[var1] == 'w' || maps[var1] == '}' || maps[var1] == '~' || maps[var1] == 129 || maps[var1] == 130 || maps[var1] == 131 || maps[var1] == 133 || maps[var1] == 136 || maps[var1] == 138 || maps[var1] == 139 || maps[var1] == 142) {
                        var10000 = types;
                        var10000[var1] |= 2;
                    }

                    if (maps[var1] == '|' || maps[var1] == 't' || maps[var1] == '{' || maps[var1] == ',' || maps[var1] == '\f' || maps[var1] == 15 || maps[var1] == 16 || maps[var1] == '-' || maps[var1] == '\n' || maps[var1] == '\t') {
                        var10000 = types;
                        var10000[var1] |= 4096;
                    }

                    if (maps[var1] == 23) {
                        var10000 = types;
                        var10000[var1] |= 32;
                    }

                    if (maps[var1] == 24) {
                        var10000 = types;
                        var10000[var1] |= 128;
                    }

                    if (maps[var1] == 6 || maps[var1] == 15 || maps[var1] == '3' || maps[var1] == '_' || maps[var1] == 'a' || maps[var1] == 'j' || maps[var1] == 'o' || maps[var1] == '{' || maps[var1] == '}' || maps[var1] == 138 || maps[var1] == 140) {
                        var10000 = types;
                        var10000[var1] |= 4;
                    }

                    if (maps[var1] == 7 || maps[var1] == 16 || maps[var1] == '3' || maps[var1] == '`' || maps[var1] == 'b' || maps[var1] == 'k' || maps[var1] == 'o' || maps[var1] == '|' || maps[var1] == '~' || maps[var1] == 139 || maps[var1] == 141) {
                        var10000 = types;
                        var10000[var1] |= 8;
                    }

                    if (maps[var1] == 25) {
                        var10000 = types;
                        var10000[var1] |= 64;
                        if ((types[var1 - tmw] & 4096) == 4096) {
                            var10000 = types;
                            var10000[var1] |= 4096;
                        }
                    }

                    if (maps[var1] == '"') {
                        var10000 = types;
                        var10000[var1] |= 2048;
                    }

                    if (maps[var1] == 17) {
                        var10000 = types;
                        var10000[var1] |= 1024;
                    }

                    if (maps[var1] == '!' || maps[var1] == 'g' || maps[var1] == 'h' || maps[var1] == 'i' || maps[var1] == 26 || maps[var1] == '!') {
                        var10000 = types;
                        var10000[var1] |= 256;
                    }

                    if (maps[var1] == '3' || maps[var1] == 'o' || maps[var1] == 'D') {
                        var10000 = types;
                        var10000[var1] |= 8192;
                    }

                    if (maps[var1] == 'R' || maps[var1] == 'n' || maps[var1] == 143) {
                        var10000 = types;
                        var10000[var1] |= 16384;
                    }

                    if (maps[var1] == 'q') {
                        var10000 = types;
                        var10000[var1] |= 65536;
                    }

                    if (maps[var1] == 142) {
                        var10000 = types;
                        var10000[var1] |= 32768;
                    }

                    if (maps[var1] == '(' || maps[var1] == ')') {
                        var10000 = types;
                        var10000[var1] |= 131072;
                    }

                    if (maps[var1] == 'n') {
                        var10000 = types;
                        var10000[var1] |= 262144;
                    }

                    if (maps[var1] == 143) {
                        var10000 = types;
                        var10000[var1] |= 524288;
                    }
                }
            }

            imgMiniMap = Image.createImage(tmw * sizeMiniMap * mGraphics.zoomLevel, tmh * sizeMiniMap * mGraphics.zoomLevel);
            mGraphics var5;
            (var5 = new mGraphics(imgMiniMap.getGraphics())).setColor(0);
            var5.fillRect(0, 0, tmw * sizeMiniMap, tmh * sizeMiniMap);

            for (var0 = 0; var0 < tmw; ++var0) {
                for (int var2 = 0; var2 < tmh; ++var2) {
                    int var3;
                    if ((var3 = maps[var2 * tmw + var0] - 1) != -1) {
                        var5.drawRegion(imgTileAB, 0, var3 * sizeMiniMap, sizeMiniMap, sizeMiniMap, 0, var0 * sizeMiniMap, var2 * sizeMiniMap, 0);
                    }
                }
            }

            if (!GameCanvas.lowGraphic) {
                if (mapID == 0 || mapID <= 4 || mapID >= 16 && mapID <= 18 || mapID >= 24 && mapID <= 27 || mapID == 22 || mapID == 33 || mapID == 34 || mapID == 38 || mapID == 57 || mapID == 58 || mapID == 60 || mapID == 68 || mapID >= 70 && mapID <= 75 || mapID == 81) {
                    Effect2.vAnimateEffect.addElement(new AnimateEffect((byte) 1, true, 10));
                }

                if (mapID >= 39 && mapID <= 44 || mapID >= 46 && mapID <= 48 || mapID == 56 || mapID >= 62 && mapID <= 65) {
                    Effect2.vAnimateEffect.addElement(new AnimateEffect((byte) 3, true, Res.random(150, 200)));
                    return;
                }
            }
        } catch (Exception var4) {
            System.out.println("Error Load Map");
            var4.printStackTrace();
            GameMidlet midlet = GameMidlet.instance;
            MotherCanvas.bRun = false;
            System.gc();
            midlet.notifyDestroyed();
        }

    }

    public static final void paintTilemap(mGraphics var0) {
        for (int var2 = GameScr.gssx; var2 < GameScr.gssxe; ++var2) {
            for (int var3 = GameScr.gssy; var3 < GameScr.gssye; ++var3) {
                int var1 = maps[var3 * tmw + var2] - 1;
                if ((tileTypeAt(var2, var3) & 256) != 256) {
                    if (tileID == 4 && (tileTypeAt(var2, var3) & 64) == 64) {
                        var1 = var3 - 1;
                        if ((var1 = maps[var1 * tmw + var2] - 1) == 15) {
                            var0.drawRegion(imgTileAA, 0, 17 * size, 24, 24, 0, var2 * size, var3 * size, 0);
                            continue;
                        }

                        if (var1 == 5) {
                            var0.drawRegion(imgTileAA, 0, 7 * size, 24, 24, 0, var2 * size, var3 * size, 0);
                            continue;
                        }

                        if (var1 == 18 || var1 == 22 || var1 == 15) {
                            var0.drawRegion(imgTileAA, 0, 17 * size, 24, 24, 0, var2 * size, var3 * size, 0);
                            continue;
                        }

                        if (var1 == 44 || var1 == 52 || var1 == 51) {
                            var0.drawRegion(imgTileAA, 0, 56 * size, 24, 24, 0, var2 * size, var3 * size, 0);
                            continue;
                        }

                        if (var1 == 24 || var1 == 23 || var1 == 20 || var1 == 21 || var1 == 19 || var1 == 12 || var1 == 13) {
                            continue;
                        }

                        if (var1 != -1) {
                            var0.drawRegion(imgTileAA, 0, var1 * size, 24, 24, 0, var2 * size, var3 * size, 0);
                        } else if (var1 == -1) {
                            continue;
                        }
                    }

                    if (tileID == 1) {
                        if ((tileTypeAt(var2, var3) & 32) == 32) {
                            var0.drawRegion(imgWaterfall, 0, 24 * (GameCanvas.gameTick % 4), 24, 24, 0, var2 * size, var3 * size, 0);
                            continue;
                        }

                        if ((tileTypeAt(var2, var3) & 64) == 64 || (tileTypeAt(var2, var3) & 2048) == 2048) {
                            if ((tileTypeAt(var2, var3 - 1) & 32) == 32) {
                                var0.drawRegion(imgWaterfall, 0, 24 * (GameCanvas.gameTick % 4), 24, 24, 0, var2 * size, var3 * size, 0);
                                continue;
                            }

                            if ((tileTypeAt(var2, var3 - 1) & 4096) == 4096) {
                                var0.drawRegion(imgTileAA, 0, 504, 24, 24, 0, var2 * size, var3 * size, 0);
                                continue;
                            }
                        }
                    }

                    if (tileID == 2) {
                        if ((tileTypeAt(var2, var3) & 32) == 32) {
                            var0.drawRegion(imgWaterfall, 0, 24 * (GameCanvas.gameTick % 8 >> 1), 24, 24, 0, var2 * size, var3 * size, 0);
                            continue;
                        }

                        if (var1 == 17) {
                            var0.drawRegion(imgTopWaterfall, 0, 24 * (GameCanvas.gameTick % 8 >> 1), 24, 24, 0, var2 * size, var3 * size, 0);
                            continue;
                        }

                        if (var1 == 133) {
                            var0.drawRegion(imgTileAA, 0, 132 * size, 24, 24, 0, var2 * size, var3 * size, 0);
                            continue;
                        }

                        if ((tileTypeAt(var2, var3) & 64) == 64 || (tileTypeAt(var2, var3) & 2048) == 2048) {
                            if ((tileTypeAt(var2, var3 - 1) & 32) == 32) {
                                var0.drawRegion(imgWaterfall, 0, 24 * (GameCanvas.gameTick % 4), 24, 24, 0, var2 * size, var3 * size, 0);
                                continue;
                            }

                            if ((tileTypeAt(var2, var3 - 1) & 4096) == 4096) {
                                if ((var1 = tileAt(var2, var3 - 1)) == 55) {
                                    var1 = 54;
                                } else if (var1 != 19 && var1 != 35) {
                                    if (var1 < 40) {
                                        var1 = 21;
                                    } else {
                                        var1 = 110;
                                    }
                                } else if ((var1 = tileAt(var2, var3 - 2)) == 55) {
                                    var1 = 54;
                                } else if (var1 < 40) {
                                    var1 = 21;
                                }

                                var0.drawRegion(imgTileAA, 0, var1 * 24, 24, 24, 0, var2 * size, var3 * size, 0);
                                continue;
                            }
                        }
                    }

                    if (tileID == 3) {
                        if ((tileTypeAt(var2, var3) & 32) == 32) {
                            var0.drawRegion(imgWaterfall, 0, 24 * (GameCanvas.gameTick % 8 >> 1), 24, 24, 0, var2 * size, var3 * size, 0);
                            continue;
                        }

                        if (var1 == 23) {
                            var0.drawRegion(imgTopWaterfall, 0, 24 * (GameCanvas.gameTick % 8 >> 1), 24, 24, 0, var2 * size, var3 * size, 0);
                            continue;
                        }

                        if ((tileTypeAt(var2, var3) & 64) == 64 || (tileTypeAt(var2, var3) & 2048) == 2048) {
                            if ((tileTypeAt(var2, var3 - 1) & 32) == 32) {
                                var0.drawRegion(imgWaterfall, 0, 24 * (GameCanvas.gameTick % 4), 24, 24, 0, var2 * size, var3 * size, 0);
                                continue;
                            }

                            if ((tileTypeAt(var2, var3 - 1) & 4096) == 4096) {
                                if ((var1 = tileAt(var2, var3 - 1)) == 25) {
                                    var1 = tileAt(var2, var3 - 2);
                                }

                                if (var1 == 45) {
                                    var1 = 44;
                                }

                                --var1;
                                var0.drawRegion(imgTileAA, 0, var1 * 24, 24, 24, 0, var2 * size, var3 * size, 0);
                                continue;
                            }
                        }
                    }

                    if ((tileTypeAt(var2, var3) & 16) == 16) {
                        dbx = (bx = var2 * size - GameScr.cmx) - GameScr.gW2;
                        fx = (dfx = (size - 2) * dbx / size) + GameScr.gW2;
                        var0.drawRegion(imgTileAA, 0, var1 * size, 24, 24, 0, fx + GameScr.cmx, var3 * size, 0);
                    } else if ((tileTypeAt(var2, var3) & 512) == 512) {
                        if (var1 != -1) {
                            var0.drawRegion(imgTileAA, 0, var1 * size, 24, 1, 0, var2 * size, var3 * size, 0);
                            var0.drawRegion(imgTileAA, 0, var1 * size, 24, 24, 0, var2 * size, var3 * size + 1, 0);
                        }
                    } else if (var1 != -1) {
                        var0.drawRegion(imgTileAA, 0, var1 * size, 24, 24, 0, var2 * size, var3 * size, 0);
                    }
                }
            }
        }

    }

    public static final void paintMiniMap(mGraphics graphics) {
        if (GameCanvas.w > 176) {
            Res.resetTrans(graphics);
            graphics.translate(posMiniMapX + 1, posMiniMapY + 2);

            graphics.setColor(0);
            graphics.fillRect(-2, -2, wMiniMap + 2, hMiniMap);
            graphics.setClip(-2, -2, wMiniMap + 4, hMiniMap + 4);

            int intNe3;
            for (intNe3 = 0; intNe3 < 2; ++intNe3) {
                graphics.setColor(colorMini[intNe3]);
                graphics.drawRect(intNe3 - 2, intNe3 - 2, wMiniMap + 2 - (intNe3 << 1), hMiniMap - (intNe3 << 1));
            }

            graphics.setClip(0, 0, wMiniMap - 2, hMiniMap - 3);
            if (mGraphics.getWidth(imgMiniMap) > wMiniMap || mGraphics.getHeight(imgMiniMap) > hMiniMap) {
                graphics.translate(-cmxMini, -cmyMini);
            }

            graphics.drawImage(imgMiniMap, 0, 0, 0);
            int intNe1;
            int intNe2;
            for (intNe1 = 0; intNe1 < Auto.advAQ.size(); ++intNe1) {
                Mob mob;
                intNe3 = (mob = (Mob) Auto.advAQ.elementAt(intNe1)).x / 12;
                intNe2 = mob.y / 12;
                if (intNe3 < cmvxMini) {
                    intNe3 = cmvxMini;
                }

                if (intNe2 < cmvyMini) {
                    intNe2 = cmvyMini;
                }

                if (intNe3 > cmvxMini + wMiniMap) {
                    intNe3 = cmvxMini + wMiniMap;
                }

                if (intNe2 > cmvyMini + hMiniMap) {
                    intNe2 = cmvyMini + hMiniMap;
                }

                if (GameCanvas.gameTick % 10 < 8) {
                    graphics.setColor(16777215);
                    graphics.fillRect(intNe3 - 2, intNe2 - 2, 5, 5);
                    graphics.setColor(mob.levelBoss == 1 ? 255 : (mob.levelBoss == 2 ? 16711935 : '\uffff'));
                    graphics.fillRect(intNe3 - 1, intNe2 - 1, 3, 3);
                }
            }

            intNe3 = Char.getMyChar().cx / 12;
            intNe2 = Char.getMyChar().cy / 12;
            graphics.setColor(16777215);
            graphics.fillRect(intNe3 - 2, intNe2 - 2, 5, 5);
            graphics.setColor(16711680);
            graphics.fillRect(intNe3 - 1, intNe2 - 1, 3, 3);
            if (Code.isADanhCVT) {
                for (intNe1 = 0; intNe1 < Code.cxViTri.size(); ++intNe1) {
                    intNe3 = ((Integer) Code.cxViTri.elementAt(intNe1)).intValue() / 12;
                    intNe2 = ((Integer) Code.cyViTri.elementAt(intNe1)).intValue() / 12;
                    if (Code.advAT == intNe1) {
                        graphics.setColor(16777215);
                        graphics.fillRect(intNe3 - 2, intNe2 - 2, 5, 5);
                    }

                    graphics.setColor(16777215);
                    graphics.fillRect(intNe3 - 1, intNe2 - 1, 3, 3);
                }
            }

            for (intNe3 = 0; intNe3 < GameScr.vParty.size(); ++intNe3) {
                Party var4;
                if ((var4 = (Party) GameScr.vParty.elementAt(intNe3)).c != null && var4.c != Char.getMyChar()) {
                    intNe3 = var4.c.cx / 12;
                    intNe2 = var4.c.cy / 12;
                    if (intNe3 < cmxMini) {
                        intNe3 = cmxMini;
                    }

                    if (intNe2 < cmyMini) {
                        intNe2 = cmyMini;
                    }

                    if (intNe3 > cmxMini + wMiniMap) {
                        intNe3 = cmxMini + wMiniMap;
                    }

                    if (intNe2 > cmyMini + hMiniMap) {
                        intNe2 = cmyMini + hMiniMap;
                    }

                    if (GameCanvas.gameTick % 10 < 8) {
                        graphics.setColor(16777215);
                        graphics.fillRect(intNe3 - 2, intNe2 - 2, 5, 5);
                        graphics.setColor(65280);
                        graphics.fillRect(intNe3 - 1, intNe2 - 1, 3, 3);
                    }
                }
            }

            Res.resetTrans(graphics);
            if (GameCanvas.isTouch) {
                graphics.drawImage(GameScr.imgMapBorder, posMiniMapX - 1, posMiniMapY, 0);
                mFont.tahoma_7_yellow.drawString(graphics, "Map : " + mapID, posMiniMapX - 1, posMiniMapY, 0, mFont.tahoma_7);
                mFont.tahoma_7_yellow.drawString(graphics, "Khu : " + zoneID, posMiniMapX - 1, posMiniMapY += 12, 0, mFont.tahoma_7);
                mFont.tahoma_7_yellow.drawString(graphics, "XY: " + Char.getMyChar().cx + "-" + Char.getMyChar().cy, posMiniMapX - 1, posMiniMapY += 12, 0, mFont.tahoma_7);

            }

        }
    }

    public static final void paintOutTilemap(mGraphics var0) {
        if (!GameCanvas.lowGraphic) {
            int var1;
            int var2;
            for (var1 = GameScr.gssx; var1 < GameScr.gssxe; ++var1) {
                for (var2 = GameScr.gssy; var2 < GameScr.gssye; ++var2) {
                    Image var3 = null;
                    if (tileID == 4) {
                        var3 = imgflowRiver;
                    } else {
                        var3 = imgWaterflow;
                    }

                    if ((tileTypeAt(var1, var2) & 2048) == 2048) {
                        var0.drawImage(imguwt, var1, var2, 0);
                    }

                    if ((tileTypeAt(var1, var2) & 64) == 64) {
                        var0.drawRegion(var3, 0, (GameCanvas.gameTick % 8 >> 2) * 24, 24, 24, 0, var1 * size, var2 * size, 0);
                    }

                    if ((tileTypeAt(var1, var2) & 256) == 256) {
                        var0.drawRegion(imgTileAA, 0, (maps[var2 * tmw + var1] - 1) * size, 24, 24, 0, var1 * size, var2 * size, 0);
                    }
                }
            }

            if (tileID != 4 && GameCanvas.isTouch && GameCanvas.isTouchControl && GameScr.gssye >= tmh - 2) {
                for (var1 = GameScr.gssx; var1 < GameScr.gssxe; ++var1) {
                    var2 = tmh - 2;
                    int var5 = maps[var2 * tmw + var1] - 1;
                    int var4;
                    if ((tileTypeAt(var1, var2) & 32) == 32) {
                        for (var4 = 1; var4 <= 4; ++var4) {
                            var0.drawRegion(imgWaterfall, 0, 24 * (GameCanvas.gameTick % 4), 24, 24, 0, var1 * size, (var2 + var4) * size, 0);
                        }
                    } else {
                        if (mapID == 64) {
                            defaultSolidTile = 115;
                        }

                        if ((tileTypeAt(var1, var2) & 2) == 2 || (tileTypeAt(var1, var2) & 64) == 64) {
                            var5 = defaultSolidTile;
                        }

                        if (var5 >= 0) {
                            for (var4 = 1; var4 <= 4; ++var4) {
                                var0.drawRegion(imgTileAA, 0, var5 * size, 24, 24, 0, var1 * size, (var2 + var4) * size, 0);
                            }
                        }
                    }
                }
            }

        }
    }

    private static int tileAt(int var0, int var1) {
        try {
            return maps[var1 * tmw + var0];
        } catch (Exception var2) {
            return 1000;
        }
    }

    private static int tileTypeAt(int var0, int var1) {
        try {
            return types[var1 * tmw + var0];
        } catch (Exception var2) {
            return 1000;
        }
    }

    public static final int tileTypeAtPixel(int var0, int var1) {
        try {
            return types[var1 / size * tmw + var0 / size];
        } catch (Exception var2) {
            return 1000;
        }
    }

    public static final boolean tileTypeAt(int var0, int var1, int var2) {
        try {
            return (types[var1 / size * tmw + var0 / size] & var2) == var2;
        } catch (Exception var3) {
            return false;
        }
    }

    public static final void setTileTypeAtPixel(int var0, int var1, int var2) {
        int[] var10000 = types;
        int var10001 = var1 / size * tmw + var0 / size;
        var10000[var10001] |= 512;
    }

    public static final void killTileTypeAt(int var0, int var1, int var2) {
        int[] var10000 = types;
        int var10001 = var1 / size * tmw + var0 / size;
        var10000[var10001] &= -513;
    }

    public static final int tileYofPixel(int var0) {
        return var0 / size * size;
    }

    public static final int tileXofPixel(int var0) {
        return var0 / size * size;
    }

    public static void advAE() {
        if (GameCanvas.gameTick % 700 == 0 && mapID != 0 && mapID > 4 && (mapID < 16 || mapID > 18) && (mapID < 24 || mapID > 27) && mapID != 22 && mapID != 33 && mapID != 34 && mapID != 38 && mapID != 57 && mapID != 58 && mapID != 60 && mapID != 68 && (mapID < 70 || mapID > 75) && mapID != 81) {
            if (mapID >= 39 && mapID <= 44 || mapID >= 46 && mapID <= 48 || mapID == 56 || mapID >= 62 && mapID <= 65) {
                return;
            }

            if (mapID == 29 || mapID == 35) {
                return;
            }

            if (mapID == 50 || mapID == 51 || mapID == 52) {
                return;
            }

            if (mapID == 64) {
                if (Res.random(0, 8) % 2 == 0) {
                    return;
                }

                return;
            }
        }

    }

    public static boolean isLang(int var0) {
        return var0 == 10 || var0 == 17 || var0 == 22 || var0 == 32 || var0 == 38 || var0 == 43 || var0 == 48 || var0 == 138;
    }

    public static boolean isLangCo(int var0) {
        return var0 >= 134 && var0 <= 138;
    }

    public static boolean isTruong(int var0) {
        return var0 == 1 || var0 == 27 || var0 == 72;
    }

    public static boolean isHang(int var0) {
        return var0 == 91 || var0 == 92 || var0 == 93 || var0 == 94 || var0 == 95 || var0 == 96 || var0 == 97 || var0 == 105 || var0 == 106 || var0 == 107 || var0 == 108 || var0 == 109 || var0 == 114 || var0 == 115 || var0 == 116 || var0 == 125 || var0 == 126 || var0 == 127 || var0 == 128 || var0 == 157 || var0 == 158 || var0 == 159;
    }

    public static int advAH(int var0) {
        if (isHang(var0)) {
            switch (var0) {
                case 91:
                    return 92;
                case 92:
                    return 93;
                case 94:
                    return 95;
                case 95:
                    return 96;
                case 96:
                    return 97;
                case 105:
                    return 106;
                case 106:
                    return 107;
                case 107:
                    return 108;
                case 108:
                    return 109;
                case 114:
                    return 115;
                case 115:
                    return 116;
                case 125:
                    return 126;
                case 126:
                    return 127;
                case 127:
                    return 128;
                case 157:
                    return 158;
                case 158:
                    return 159;
                case 159:
                    return 157;
            }
        }

        return -1;
    }

    public static int advAI(int var0) {
        if (isHang(var0)) {
            switch (var0) {
                case 92:
                    return 91;
                case 93:
                    return 92;
                case 95:
                    return 94;
                case 96:
                    return 95;
                case 97:
                    return 96;
                case 106:
                    return 105;
                case 107:
                    return 106;
                case 108:
                    return 107;
                case 109:
                    return 108;
                case 115:
                    return 114;
                case 116:
                    return 115;
                case 126:
                    return 125;
                case 127:
                    return 126;
                case 128:
                    return 127;
                case 158:
                    return 157;
                case 159:
                    return 158;
            }
        }

        return -1;
    }

    public static void advAJ(int var0) {
        Waypoint var3;
        int var1 = (var3 = (Waypoint) vGo.elementAt(var0)).minX;
        int var2 = var3.minY;
        if (var3.minY != 0 && var3.maxY < pxh - 24) {
            if (var3.maxX <= pxw / 2) {
                var1 = var3.maxX + 12;
                var2 = var3.maxY;
            } else if (var3.minX >= pxw / 2) {
                var1 = var3.minX - 12;
                var2 = var3.maxY;
            }
        } else if (var3.maxY <= pxh / 2) {
            var1 = (var3.maxX + var3.minX) / 2;
            var2 = var3.maxY + 24;
        } else if (var3.minY >= pxh / 2) {
            var1 = (var3.maxX + var3.minX) / 2 + 24;
            var2 = var3.maxY - 48;
        }

        if (mapID != 114 && mapID != 115 && mapID != 116) {
            Char.moveToChar(var1, var2);
        } else {
            Char.advAE(var1, var2);
        }

        CuongScr.sleep(10L);
        Service.gI().requestChangeMap();
    }

    public static void advAF() {
        advBE = true;
        synchronized (advCC) {
            try {
                advCC.wait(10000L);
            } catch (InterruptedException var1) {
            }

        }
    }

    public static void advAG() {
        if (advBE) {
            advBE = false;
            synchronized (advCC) {
                advCC.notifyAll();
            }
        }
    }

    public static boolean advAK(int intNe) {
        short sNe = TileMap.mapID;
        TileMap.advBC = intNe;
        short sNe1 = sNe;
        MyVector myVector = null;

        if (sNe >= 0 && sNe1 < TileMap.shorts.length && intNe >= 0 && intNe < TileMap.shorts.length) {
            if (TileMap.shorts[sNe1].length <= 0) {
                myVector = null;
            } else {
                TaskOrder taskOrder = Char.getTaskOrder(0);
                for (int i1 = 0; i1 < TileMap.booleans.length; ++i1) {
                    TileMap.booleans[i1] = true;
                    TileMap.ints[i1] = -1;
                    TileMap.shorts1[i1] = -1;
                }
                TileMap.ints[sNe1] = 0;
                while (TileMap.booleans[intNe]) {
                    int int1 = -1;
                    short sNe2 = -1;
                    for (int i2 = 0; i2 < TileMap.shorts.length; ++i2) {
                        if (TileMap.booleans[i2] && TileMap.ints[i2] != -1 && (TileMap.ints[i2] < int1 || int1 == -1)) {
                            int1 = TileMap.ints[i2];
                            sNe2 = (short) i2;
                        }
                    }
                    if (sNe2 == -1) {
                        myVector = null;
                        break;
                    }
                    TileMap.booleans[sNe2] = false;
                    boolean boolNe1 = isTruong(sNe2);
                    short[] sNe3 = TileMap.shorts[sNe2];
                    for (int i3 = 0; i3 < sNe3.length; ++i3) {
                        short sNe4 = sNe3[i3];
                        if (TileMap.booleans[sNe4]) {
                            boolean boolNe2 = false;
                            if (Char.getMyChar().isHuman) {
                                int int2 = Char.getMyChar().ctaskId;
                                if ((sNe4 == 1 || sNe4 == 27 || sNe4 == 72) && int2 < 6) {
                                    boolNe2 = false;
                                } else if ((sNe4 == 10 || sNe4 == 32 || sNe4 == 48) && int2 < 17) {
                                    boolNe2 = false;
                                } else if (sNe4 == 38 && int2 < 28) {
                                    boolNe2 = false;
                                } else if (sNe4 == 43 && int2 < 33) {
                                    boolNe2 = false;
                                } else if (sNe4 == 17 && int2 < 38) {
                                    boolNe2 = false;
                                } else if (sNe4 == 7 && int2 < 15) {
                                    boolNe2 = false;
                                } else {
                                    boolNe2 = true;
                                }
                            } else {
                                boolNe2 = true;
                            }
                            if (boolNe2 && (!boolNe1 || !isTruong(sNe4) || Char.getMyChar().ctaskId >= 9) && (TileMap.ints[sNe4] == -1 || TileMap.ints[sNe4] > TileMap.ints[sNe2] + 1)) {
                                TileMap.ints[sNe4] = TileMap.ints[sNe2] + 1;
                                TileMap.shorts1[sNe4] = sNe2;
                            }
                        }
                    }
                    if (boolNe1 && taskOrder != null && TileMap.booleans[taskOrder.mapId] && (TileMap.ints[taskOrder.mapId] == -1 || TileMap.ints[taskOrder.mapId] > TileMap.ints[sNe2] + 1)) {
                        TileMap.ints[taskOrder.mapId] = TileMap.ints[sNe2] + 1;
                        TileMap.shorts1[taskOrder.mapId] = sNe2;
                    }
                    if (boolNe1) {
                        short sNe5 = (short) (GameScr.advGP ? 98 : 104);
                        if (TileMap.ints[sNe5] == -1 || TileMap.ints[sNe5] > TileMap.ints[sNe2] + 1) {
                            TileMap.ints[sNe5] = TileMap.ints[sNe2] + 1;
                            TileMap.shorts1[sNe5] = sNe2;
                        }
                    }
                    if (Char.isADungCoLenh && (TileMap.ints[138] == -1 || TileMap.ints[138] > TileMap.ints[sNe2] + 1)) {
                        TileMap.ints[138] = TileMap.ints[sNe2] + 1;
                        TileMap.shorts1[138] = sNe2;
                    }
                    if (Char.isADungTTL && (TileMap.ints[162] == -1 || TileMap.ints[162] > TileMap.ints[sNe2] + 1)) {
                        TileMap.ints[162] = TileMap.ints[sNe2] + 1;
                        TileMap.shorts1[162] = sNe2;
                    }
                }
                if (TileMap.ints[intNe] != -1) {
                    MyVector myVector2 = new MyVector();
                    myVector2.addElement(new Integer(intNe));
                    for (int i6 = intNe; i6 != sNe1; i6 = TileMap.shorts1[i6]) {
                        int int3 = TileMap.shorts1[i6];
                        if (isLang(int3)) {
                            if (isLang(i6) && i6 != 138 && i6 != 162) {
                                byte by1 = 1;
                                if (i6 == 10) {
                                    by1 = 1;
                                } else if (i6 == 17) {
                                    by1 = 2;
                                } else if (i6 == 22) {
                                    by1 = 3;
                                } else if (i6 == 32) {
                                    by1 = 4;
                                } else if (i6 == 38) {
                                    by1 = 5;
                                } else if (i6 == 43) {
                                    by1 = 6;
                                } else if (i6 == 48) {
                                    by1 = 7;
                                }
                                int3 = (int3 | Integer.MIN_VALUE | 0x7000000 | (by1 << 20 & 0xF00000));
                            } else if (i6 == 139) {
                                int3 = (int3 | Integer.MIN_VALUE | 0x5000000 | 0x200000);
                            }
                        } else if (isTruong(int3)) {
                            if (isTruong(i6)) {
                                byte by2 = 0;
                                if (i6 == 1) {
                                    by2 = 0;
                                } else if (i6 == 27) {
                                    by2 = 1;
                                } else if (i6 == 72) {
                                    by2 = 2;
                                }
                                int3 = (int3 | Integer.MIN_VALUE | 0x8000000 | (by2 << 20 & 0xF00000));
                            } else if (taskOrder != null && i6 == taskOrder.mapId) {
                                int3 = (int3 | Integer.MIN_VALUE | 0x19000000 | (GameScr.advGO << 20 & 0xF00000) | 0x30000);
                            } else {
                                switch (i6) {
                                    case 80:
                                        int3 = (int3 | Integer.MIN_VALUE | 0x100000 | 0x10000);
                                    case 91:
                                        int3 = (int3 | Integer.MIN_VALUE | 0x200000 | 0x10000);
                                    case 94:
                                        int3 = (int3 | Integer.MIN_VALUE | 0x200000 | 0x20000);
                                    case 98: {
                                        int3 = (int3 | Integer.MIN_VALUE | 0x19000000 | (GameScr.advGO + 2 << 20 & 0xF00000));
                                    }
                                    case 104: {
                                        int3 = (int3 | Integer.MIN_VALUE | 0x19000000 | (GameScr.advGO + 2 << 20 & 0xF00000) | 0x10000);
                                    }
                                    case 105:
                                        int3 = (int3 | Integer.MIN_VALUE | 0x200000 | 0x30000);
                                    case 113: {
                                        int3 = (int3 | Integer.MIN_VALUE | 0x19000000 | (GameScr.advGO + 3 << 20 & 0xF00000));
                                    }
                                    case 114:
                                        int3 = (int3 | Integer.MIN_VALUE | 0x200000 | 0x40000);
                                    case 125:
                                        int3 = (int3 | Integer.MIN_VALUE | 0x200000 | 0x50000);
                                    case 139:
                                        int3 = (int3 | Integer.MIN_VALUE | 0x5000000 | 0x200000);
                                    case 157:
                                        int3 = (int3 | Integer.MIN_VALUE | 0x200000 | 0x60000);
                                }
                            }
                        }
                        myVector2.addElement(new Integer(int3));
                    }
                    final MyVector myVector3 = new MyVector();
                    for (int i6 = myVector2.size() - 1; i6 >= 0; --i6) {
                        myVector3.addElement(myVector2.elementAt(i6));
                    }
                    myVector = myVector3;
                } else {
                    myVector = null;
                }
            }
        } else {
            myVector = null;
        }

        MyVector myVector4 = myVector;
        if (myVector == null) {
            InfoMe.addInfo("Không thể chuyển map!", 50, mFont.tahoma_7_yellow);
            return false;
        }
        TileMap.advBD = true;
        try {
            for (int i7 = TileMap.mapID, i8 = 1; i8 < myVector4.size() && TileMap.advBD && i7 == TileMap.mapID; ++i8) {
                int int5 = ((Integer) myVector4.elementAt(i8 - 1)).intValue();
                i7 = (((Integer) myVector4.elementAt(i8)).intValue() & 0xFFFF);
                if (int5 < 0) {
                    int int6 = int5 >> 24 & 0x7F;
                    int int7 = int5 >> 20 & 0xF;
                    int5 = (int5 >> 16 & 0xF);
                    GameScr.pickNPC(int6, int7, int5);
                } else if ((int5 < 134 || int5 > 138) && i7 == 138) {
                    if (Char.getMyChar().cPk > 0) {
                        InfoMe.addInfo("Hiếu chiến quá cao!", 50, mFont.tahoma_7_yellow);
                        return false;
                    }
                    Item item1;
                    if ((item1 = Char.getBagItem(490)) == null || item1.template.id != 490) {
                        if (Char.isAMuaCoLenh && Char.getMyChar().luong >= 10) {
                            Service.gI().muaItem(14, 28, 2);
                            LockGame.advAG();
                            return false;
                        }
                        InfoMe.addInfo("Không đủ cổ lệnh!", 50, mFont.tahoma_7_yellow);
                        return false;
                    } else {
                        System.out.println("Dung co lenh");
                        Service.gI().useItem(item1.indexUI);
                    }
                } else if ((int5 < 162 || int5 > 166) && i7 == 162) {
                    if (Char.getMyChar().cPk > 0) {
                        InfoMe.addInfo("Hiếu chiến quá cao!", 50, mFont.tahoma_7_yellow);
                        return false;
                    }
                    Item item1;
                    if ((item1 = Char.getBagItem(833)) == null || item1.template.id != 833) {
                        if (Char.isAMuaTTL && Char.getMyChar().luong >= 10) {
                            Service.gI().muaItem(14, 40, 2);
                            LockGame.advAG();
                            return false;
                        }
                        InfoMe.addInfo("Không đủ truyền thuyết lệnh!", 50, mFont.tahoma_7_yellow);
                        return false;
                    } else {
                        System.out.println("Dung truyen thuyet lenh");
                        Service.gI().useItem(item1.indexUI);
                    }
                } else if (int5 != 0 && int5 != 56 && int5 != 73) {
                    int int8 = -1;
                    for (int i9 = 0; i9 < TileMap.shorts[int5].length; ++i9) {
                        if (TileMap.shorts[int5][i9] == i7) {
                            int8 = i9;
                            break;
                        }
                    }
                    if (int8 == -1) {
                        InfoMe.addInfo("Không thể chuyển map!", 50, mFont.tahoma_7_yellow);
                        return false;
                    }
                    advAJ(int8);
                } else {
                    Npc npc1;
                    if ((npc1 = (Npc) GameScr.vNpc.elementAt(0)) != null && npc1.statusMe != 15) {
                        Char.moveToChar(npc1.cx, npc1.cy);
                        Char.getMyChar().npcFocus = npc1;
                        Service.gI().requestItem(npc1.template.npcTemplateId);
                        Service.gI().menu((byte) 0, npc1.template.npcTemplateId, 0, 0);
                        Service.gI().getTask(npc1.template.npcTemplateId, 0, -1);
                    }
                }
                if (TileMap.mapID != i7) {
                    advAF();
                    Thread.sleep(Code.SPNextMapValue);
                } else {
                    Thread.sleep(100L);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        TileMap.advBD = false;
        return TileMap.mapID == intNe;
    }

    public static void gomap(int var0) {
        GameCanvas.startWaitDlgWithoutCancel();
        (new Thread(new AutoGoMap(var0))).start();
    }

    public static void advAM(int var0) {
        GameCanvas.startWaitDlgWithoutCancel();
        (new Thread(new AutoNextMap(var0))).start();
    }

    public static int advAD(int var0, int var1) {
        var1 = tileYofPixel(var1);
        if (!tileTypeAt(var0, var1, 2)) {
            for (int var2 = 0; var2 < 7; ++var2) {
                int var3;
                if ((var3 = var1 - 48 + var2 * 24) > 0 && var3 < pxh && tileTypeAt(var0, var3, 2)) {
                    return var3;
                }
            }
        }

        return var1;
    }

    public static int advAE(int var0, int var1) {
        if ((tileTypeAtPixel(var0, var1 - 16) & 16386) != 0) {
            var1 = tileYofPixel(var1);

            int var2;
            int var3;
            for (var2 = 24; var2 < 240; var2 += 24) {
                var3 = tileTypeAtPixel(var0, var1 - var2);
                if (var1 - var2 > 0 && (var3 & 16386) == 0) {
                    return var1 - var2 + 24;
                }
            }

            for (var2 = 24; var2 < 120; var2 += 24) {
                var3 = tileTypeAtPixel(var0, var1 + var2);
                if (var1 + var2 < pxh && (var3 & 16386) == 0) {
                    return var1 + var2;
                }
            }
        }

        return var1;
    }

    public static boolean advAA(int var0, int var1, int[] var2) {
        var1 = tileYofPixel(var1);
        if (tileTypeAt(var0, var1, 2)) {
            var2[0] = var0;
            var2[1] = var1;
            return true;
        } else {
            for (int var3 = 0; var3 < 5; ++var3) {
                int var4 = var1 + var3 * 24;

                for (int var5 = 0; var5 < 5; ++var5) {
                    int var6 = var0 - 48 + var5 * 24;
                    if (var4 < pxh && var6 > 24 && var6 < pxw - 24 && tileTypeAt(var6, var4, 2)) {
                        var2[0] = var6;
                        var2[1] = var4;
                        return true;
                    }
                }
            }

            return false;
        }
    }

    public static void advAA(int var0, InputStream var1) {
        try {
            if (advCD.length <= var0) {
                byte[][] var2 = new byte[var0 + 10][];
                System.arraycopy(advCD, 0, var2, 0, advCD.length);
                advCD = var2;
            }

            advCD[var0] = new byte[var1.available()];
            var1.read(advCD[var0]);
        } catch (Exception var3) {
        }
    }

    public static void loadMapFromResource() {
        try {
            ByteArrayInputStream var0 = new ByteArrayInputStream(advCD[mapID]);
            DataInputStream var2;
            tmw = (char) (var2 = new DataInputStream(var0)).readUnsignedByte();
            tmh = (char) var2.readUnsignedByte();
            maps = new char[var2.available()];

            for (int var1 = 0; var1 < tmw * tmh; ++var1) {
                maps[var1] = (char) var2.readUnsignedByte();
            }

            types = new int[maps.length];
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void advAI() {
        for (int var0 = 1; var0 < advCE.length; ++var0) {
            advCE[var0] = GameCanvas.loadImage("/t/" + var0 + ".png");
            advCF[var0] = GameCanvas.loadImage("/t/mini_" + var0 + ".png");
        }

    }

    public static void loadTileUse() {
        imgTileAA = null;
        System.gc();
        imgTileAA = advCE[tileID];
        imgTileAB = advCF[tileID];
    }
}
