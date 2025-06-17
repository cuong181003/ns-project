
import java.util.Enumeration;

public final class ItemTemplates {

    public static mHashtable itemTemplates = new mHashtable();
    public static mHashtable1 itemTemplates1 = new mHashtable1();

    public static void add(ItemTemplate var0) {
        itemTemplates.put(new Short(var0.id), var0);
    }

    public static ItemTemplate advAA(String var0, byte var1) {
        Enumeration var2 = itemTemplates1.elements();

        ItemTemplate var3;
        do {
            do {
                if (!var2.hasMoreElements()) {
                    return null;
                }
            } while (!(var3 = (ItemTemplate) var2.nextElement()).name.equals(var0));
        } while (var3.gender != 2 && var3.gender != var1);

        return var3;
    }

    public static ItemTemplate get(short var0) {
        return (ItemTemplate) itemTemplates.get(new Short(var0));
    }

    public static short getIcon(short var0) {
        return get(var0).iconID;
    }
}
