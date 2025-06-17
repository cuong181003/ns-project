
import java.io.InputStream;
import javax.microedition.rms.RecordStore;

public final class RMS {

    public ItemTemplate template;
    public String nameMua;
    public int giaTrenItem;
    public int giaMua;
    public int soLuongMua;

    public static InputStream advAA(String var0) {
        return "".getClass().getResourceAsStream(var0);
    }

    public static void saveRMS(String var0, byte[] var1) {
        try {
            RecordStore var3;
            if ((var3 = RecordStore.openRecordStore("vj" + var0, true)).getNumRecords() > 0) {
                var3.setRecord(1, var1, 0, var1.length);
            } else {
                var3.addRecord(var1, 0, var1.length);
            }

            var3.closeRecordStore();
        } catch (Exception var2) {
        }
    }

    public static byte[] loadRMS(String var0) {
        try {
            RecordStore var3;
            byte[] var1 = (var3 = RecordStore.openRecordStore("vj" + var0, false)).getRecord(1);
            var3.closeRecordStore();
            return var1;
        } catch (Exception var2) {
            return null;
        }
    }

    public static void saveRMSInt(String var0, int var1) {
        try {
            saveRMS(var0, new byte[]{(byte) var1});
        } catch (Exception var2) {
        }
    }

    public static void saveRMSString(String var0, String var1) {
        try {
            saveRMS(var0, var1.getBytes("UTF-8"));
        } catch (Exception var2) {
            var2.printStackTrace();
        }
    }

    public static String loadRMSString(String var0) {
        byte[] var3;
        if ((var3 = loadRMS(var0)) == null) {
            return null;
        } else {
            try {
                return new String(var3, "UTF-8");
            } catch (Exception var2) {
                return new String(var3);
            }
        }
    }

    public static int loadRMSInt(String var0) {
        byte[] var1;
        return (var1 = loadRMS(var0)) == null ? -1 : var1[0];
    }

    public static void deleteRecord(String var0) {
        try {
            RecordStore.deleteRecordStore("vj" + var0);
        } catch (Exception var1) {
        }
    }

    public static void saveRMSImage(String var0, byte[] var1) {
        try {
            RecordStore var3;
            if ((var3 = RecordStore.openRecordStore("vj" + var0, true)).getNumRecords() > 0) {
                var3.setRecord(1, var1, 0, var1.length);
            } else {
                var3.addRecord(var1, 0, var1.length);
            }

            var3.closeRecordStore();
        } catch (Exception var2) {
            var2.printStackTrace();
        }
    }

    public static void clearRMS() {
        deleteRecord("nj_arrow");
        deleteRecord("nj_effect");
        deleteRecord("nj_image");
        deleteRecord("nj_part");
        deleteRecord("nj_skill");
        deleteRecord("data");
        deleteRecord("dataVersion");
        deleteRecord("map");
        deleteRecord("mapVersion");
        deleteRecord("skill");
        deleteRecord("killVersion");
        deleteRecord("item");
        deleteRecord("itemVersion");
    }

    public static RMS advAA(ItemTemplate var0, String var1) {
        RMS var2;
        (var2 = new RMS()).template = var0;
        String[] var5 = Code.split(var1, " ");
        var2.nameMua = var5[0];

        try {
            var2.giaMua = Integer.parseInt(var5[4]);
            var2.giaTrenItem = Integer.parseInt(var5[5]);
            var2.soLuongMua = Integer.parseInt(var5[6]);
        } catch (Exception var3) {
            var2.giaMua = 0;
            var2.giaTrenItem = 0;
        }

        return var2.giaTrenItem == 0 ? null : var2;
    }

    public final boolean advAC() {
        return this.giaTrenItem > 0 && Char.getBagNum(this.template.id) < this.soLuongMua;
    }

    public final int advAE() {
        return this.giaTrenItem > 0 && Char.getBagNum(this.template.id) < this.soLuongMua ? this.soLuongMua - Char.getBagNum(this.template.id) : 0;
    }

    public final String advAF() {
        return this.nameMua + " " + this.giaMua + " " + this.giaTrenItem + " " + this.soLuongMua;
    }
}
