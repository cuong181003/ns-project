import java.io.DataInputStream;
import java.io.IOException;
import java.util.Random;

public final class NinjaUtil {
    private static Random randomz = new Random();

    public static int randomNumber(int var0) {
        return randomz.nextInt(var0);
    }

    public static int random(int var0, int var1) {
        return -7 + randomz.nextInt(14);
    }

    public static byte[] readByteArray_Int(Message var0) {
        try {
            DataInputStream reader = var0.reader();
            
            if (reader.available() < 4) {
                System.err.println("Không đủ dữ liệu để đọc một số nguyên!");
                return new byte[0];
            }
            
            int length = reader.readInt();
            if (length < 0) {
                throw new IOException("Kích thước mảng không hợp lệ: " + length);
            }

            if (reader.available() < length) {
                System.err.println("Không đủ dữ liệu để đọc mảng byte!");
                return new byte[0];
            }

            byte[] var1 = new byte[length];
            reader.readFully(var1);
            return var1;
        } catch (IOException e) {
            e.printStackTrace();
            return new byte[0]; 
        }
    }

    public static byte[] readByteArray(Message var0) {
        try {
            DataInputStream reader = var0.reader();
            
            if (reader.available() < 4) {
                System.err.println("Không đủ dữ liệu để đọc một số nguyên!");
                return new byte[0];
            }

            int length = reader.readInt();
            if (length < 0) {
                throw new IOException("Kích thước mảng không hợp lệ: " + length);
            }

            if (reader.available() < length) {
                System.err.println("Không đủ dữ liệu để đọc mảng byte!");
                return new byte[0];
            }

            byte[] var1 = new byte[length];
            reader.readFully(var1);
            return var1;
        } catch (IOException e) {
            e.printStackTrace();
            return new byte[0];
        }
    }

    public static byte[] readByteArray(DataInputStream var0) {
        try {
            if (var0.available() < 4) {
                System.err.println("Không đủ dữ liệu để đọc một số nguyên!");
                return new byte[0];
            }

            int length = var0.readInt();
            if (length < 0) {
                throw new IOException("Kích thước mảng không hợp lệ: " + length);
            }

            if (var0.available() < length) {
                System.err.println("Không đủ dữ liệu để đọc mảng byte!");
                return new byte[0];
            }

            byte[] var1 = new byte[length];
            var0.readFully(var1);
            return var1;
        } catch (IOException e) {
            e.printStackTrace();
            return new byte[0];
        }
    }

    public static String replace(String var0, String var1, String var2) {
        StringBuffer sb = new StringBuffer();
        int index = var0.indexOf(var1);
        while (index != -1) {
            sb.append(var0.substring(0, index)).append(var2);
            var0 = var0.substring(index + var1.length());
            index = var0.indexOf(var1);
        }
        sb.append(var0);
        return sb.toString();
    }

    public static String numberToString(String var0) {
        if (var0.equals("")) return "";
        
        StringBuffer result = new StringBuffer();
        boolean isNegative = var0.charAt(0) == '-';
        if (isNegative) var0 = var0.substring(1);

        int count = 0;
        for (int i = var0.length() - 1; i >= 0; i--) {
            if (count > 0 && count % 3 == 0) {
                result.insert(0, '.');
            }
            result.insert(0, var0.charAt(i));
            count++;
        }

        if (isNegative) {
            result.insert(0, '-');
        }

        return result.toString();
    }

    public static void sendMsDK(String var0, short var1) {
        SendSMS.sendSMSRe(var0, "sms://" + var1, new Command("", GameCanvas.gI(), 88827, null), new Command("", GameCanvas.gI(), 88828, null));
    }

    public static void downloadGame(String var0) {
        try {
            GameMidlet.instance.platformRequest(var0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            GameMidlet.instance.notifyDestroyed();
        }
    }

    public static String getTime(int seconds) {
        int minutes = seconds / 60;
        int hours = minutes / 60;
        int days = hours / 24;
        
        minutes %= 60;
        hours %= 24;
        
        StringBuffer result = new StringBuffer();
        if (days > 0) {
            result.append(days).append("d").append(hours).append("h");
        } else if (hours > 0) {
            result.append(hours).append("h").append(minutes).append("'");
        } else {
            if (minutes < 10) result.append("0");
            result.append(minutes).append(":");
            if (seconds % 60 < 10) result.append("0");
            result.append(seconds % 60);
        }
        
        return result.toString();
    }

    public static String[] split(String str, String delimiter) {
        MyVector vector = new MyVector();
        int index = str.indexOf(delimiter);
        while (index >= 0) {
            vector.addElement(str.substring(0, index));
            str = str.substring(index + delimiter.length());
            index = str.indexOf(delimiter);
        }
        vector.addElement(str);

        String[] result = new String[vector.size()];
        for (int i = 0; i < vector.size(); i++) {
            result[i] = (String) vector.elementAt(i);
        }
        return result;
    }
}
