
public final class ChatSell {

    private static MyVector advAB = new MyVector();
    public static int advAA = -1;

    public static void advAA(ItemTemplate var0, String var1) {
        RMS var3;
        if ((var3 = RMS.advAA(var0, var1)) != null) {
            for (int var2 = 0; var2 < advAB.size(); ++var2) {
                if (((RMS) advAB.elementAt(var2)).template.id == var0.id) {
                    advAB.setElementAt(var3, var2);
                    return;
                }
            }

            advAB.addElement(var3);
        }

    }

    public static void advAA(ItemTemplate var0) {
        for (int var1 = 0; var1 < advAB.size(); ++var1) {
            if (((RMS) advAB.elementAt(var1)).template.id == var0.id) {
                advAB.removeElementAt(var1);
                return;
            }
        }

    }

    public static RMS advAA(short var0) {
        for (int var1 = 0; var1 < advAB.size(); ++var1) {
            RMS var2;
            if ((var2 = (RMS) advAB.elementAt(var1)).template.id == var0) {
                return var2;
            }
        }

        return null;
    }

    public static RMS advAA(String var0) {
        for (int var1 = 0; var1 < advAB.size(); ++var1) {
            RMS var2;
            if ((var2 = (RMS) advAB.elementAt(var1)).nameMua.equals(var0)) {
                return var2;
            }
        }

        return null;
    }

    public static MyVector DanhSach() {
        MyVector var0 = new MyVector();

        for (int var1 = 0; var1 < advAB.size(); ++var1) {
            RMS var2 = (RMS) advAB.elementAt(var1);
            var0.addElement(var1 + ". " + var2.template.name + " id " + var2.nameMua);
            if (var2.giaTrenItem > 0) {
                var0.addElement("Mua " + var2.giaMua + "k/" + var2.giaTrenItem + " max " + var2.soLuongMua);
            }
        }

        return var0;
    }

    public static String advAB() {
        if (advAB.size() == 0) {
            return "";
        } else {
            if (advAA >= advAB.size() || advAA < 0) {
                advAA = 0;
            }

            int var0 = advAA;

            do {
                RMS var1 = (RMS) advAB.elementAt(advAA = (advAA + 1) % advAB.size());
                boolean var3 = var1.advAC();

                if (var3) {
                    return "@" + Char.getMyChar().cName + " mua " + var1.nameMua + " " + var1.giaMua + "k " + var1.giaTrenItem + " cái, bán pm hoặc gd";
                }
            } while (var0 != advAA);

            return "";
        }
    }

    public static void advAB(String var0) {
        for (int var1 = 0; var1 < advAB.size(); ++var1) {
            RMS var2;
            if (Char.getBagItem((var2 = (RMS) advAB.elementAt(var1)).template.id) != null) {
                boolean var4 = var2.advAC();
                if (var4) {
                    Code.advAA(var0, "id: " + var2.nameMua + " " + var2.template.name + " mua: " + var2.giaMua + "k/" + var2.giaTrenItem + " cái. Còn mua: " + var2.advAE());
                }
            }
        }

    }

    public static boolean advAC() {
        for (int var0 = 0; var0 < advAB.size(); ++var0) {
            if (((RMS) advAB.elementAt(var0)).advAC()) {
                return true;
            }
        }

        return false;
    }

}
