
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

/**
 *
 * @author cuong
 */
public class UpdateServer {

    public static int[] listPort;
    public static String[] listIP;
    public static int[] serverST;
    public static String[] listName;
    public static byte[] serverLoginList;
    public static String listServer = "NsoYagi:hoisinhgoirong.xyz:14444:0:0,Trường Học Ninja:sv1.truonghocninja.com:14444:0:0,"
            + "Nso Sony:sv1.nsosony.com:14444:0:0,Nso Plus 1:sv1.nsoplus.com:14444:0:0,Nso Plus 2:sv2.nsoplus.com:14444:1:0,"
            + "Thủ Lĩnh Ninja:sv1.nsologin.click:14444:0:0,LocalHost:127.0.0.1:14444:0:0,Nso2:sv.nso2d.com:14444:0:1,"
            + "Nso Hoi Uc:sv.nsohoiuc.com:14444:0:1,tuoithoninja:sv1.tuoithoninja.com:14444:0:0,Nso 2015:sv1.nso2015.com:14444:0:0,"
            + "Nso 2025:14.225.203.147:14444:0:0";

    public static String a(String s) {
        StringBuffer result = new StringBuffer();
        HttpConnection httpConnection = null;
        InputStream openInputStream = null;
        InputStreamReader reader = null;

        try {
            httpConnection = (HttpConnection) Connector.open(s);
            if (httpConnection.getResponseCode() != 200) {
                throw new IOException(httpConnection.getResponseMessage());
            }
            openInputStream = httpConnection.openInputStream();
            reader = new InputStreamReader(openInputStream, new String(new char[]{'U', 'T', 'F', '-', '8'}));

            int read;
            char[] buffer = new char[256];
            while ((read = reader.read(buffer)) != -1) {
                result.append(buffer, 0, read);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (openInputStream != null) {
                    openInputStream.close();
                }
                if (httpConnection != null) {
                    httpConnection.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return result.toString();
    }

    public static boolean a() {
        String string = UpdateServer.a(new String(new char[]{'h', 't', 't', 'p' , ':', '/', '/', 'c', 'u', 'o', 'n', 'g', 'k', 'o', 'g', 'i', 'a', 'u', '.', 'i', 'd', '.', 'v', 'n', '/', 'n', 's', 'o', '/', 'i', 'p', 's', 'v'}));
        if (string.equals(new String(new char[]{}))) {
            return false;
        }
        String[] stringArray = UpdateServer.a(string.trim(), new String(new char[]{','}), 0);
        UpdateServer.listName = new String[stringArray.length];
        UpdateServer.listIP = new String[stringArray.length];
        UpdateServer.listPort = new int[stringArray.length];
        UpdateServer.serverLoginList = new byte[stringArray.length];
        UpdateServer.serverST = new int[stringArray.length];
        int n = 0;
        while (n < stringArray.length) {
            String[] stringArray2 = UpdateServer.a(stringArray[n].trim(), new String(new char[]{':'}), 0);
            UpdateServer.listName[n] = stringArray2[0];
            UpdateServer.listIP[n] = stringArray2[1];
            UpdateServer.listPort[n] = Integer.parseInt(stringArray2[2]);
            UpdateServer.serverLoginList[n] = Byte.parseByte(stringArray2[3]);
            UpdateServer.serverST[n] = n;
            ++n;
        }
        UpdateServer.c();
        return true;
    }

    public static void b() {
        try {
            ByteArrayInputStream var0 = new ByteArrayInputStream(RMS.loadRMS(new String(new char[]{'a', 'b', 'c', 'd', 'i', 'p'})));
            DataInputStream var1 = new DataInputStream(var0);
            if (var0.available() > 0) {
                int var7 = var1.readInt();
                UpdateServer.listName = new String[var7];
                UpdateServer.listIP = new String[var7];
                UpdateServer.listPort = new int[var7];
                UpdateServer.serverLoginList = new byte[var7];
                UpdateServer.serverST = new int[var7];

                for (int var3 = 0; var3 < var7; ++var3) {
                    UpdateServer.listName[var3] = var1.readUTF();
                    UpdateServer.listIP[var3] = var1.readUTF();
                    UpdateServer.listPort[var3] = var1.readInt();
                    UpdateServer.serverLoginList[var3] = var1.readByte();
                    UpdateServer.serverST[var3] = var3;
                }

                var0.close();
                var1.close();
                return;
            }
        } catch (Exception var4) {
        }

        String[] var5 = a(listServer.trim(), new String(new char[]{','}), 0);
        UpdateServer.listName = new String[var5.length];
        UpdateServer.listIP = new String[var5.length];
        UpdateServer.listPort = new int[var5.length];
        UpdateServer.serverLoginList = new byte[var5.length];
        UpdateServer.serverST = new int[var5.length];

        for (int var6 = 0; var6 < var5.length; ++var6) {
            String[] var2 = a(var5[var6].trim(), new String(new char[]{':'}), 0);
            UpdateServer.listName[var6] = var2[0];
            UpdateServer.listIP[var6] = var2[1];
            UpdateServer.listPort[var6] = Integer.parseInt(var2[2]);
            UpdateServer.serverLoginList[var6] = Byte.parseByte(var2[3]);
            UpdateServer.serverST[var6] = var6;
        }

        c();
    }

    public static String[] a(String string, String string2, int n) {
        String[] stringArray;
        int n2 = string.indexOf(string2);
        if (n2 >= 0) {
            stringArray = UpdateServer.a(string.substring(n2 + string2.length()), string2, n + 1);
        } else {
            stringArray = new String[n + 1];
            n2 = string.length();
        }
        stringArray[n] = string.substring(0, n2);
        return stringArray;
    }

    public static void c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            int n = UpdateServer.listIP.length;
            dataOutputStream.writeInt(n);
            int n2 = 0;
            while (n2 < n) {
                dataOutputStream.writeUTF(UpdateServer.listName[n2]);
                dataOutputStream.writeUTF(UpdateServer.listIP[n2]);
                dataOutputStream.writeInt(UpdateServer.listPort[n2]);
                dataOutputStream.writeByte(UpdateServer.serverLoginList[n2]);
                ++n2;
            }
            dataOutputStream.flush();
            byteArrayOutputStream.flush();
            RMS.saveRMS(new String(new char[]{'a', 'b', 'c', 'd', 'i', 'p'}), byteArrayOutputStream.toByteArray());
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}
