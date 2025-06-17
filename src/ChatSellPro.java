import java.util.Enumeration;
import java.util.Hashtable;

final class ChatSellPro implements Runnable {
   private final String sellerAB;
   public static boolean sellerAA = false;
   private static Hashtable sellerAC = new Hashtable();

   public ChatSellPro(String var1) {
      this.sellerAB = var1;
   }

   public final synchronized void sellerAA() {
      if (!sellerAA) {
         if (!sellerAC.isEmpty() && sellerAC.containsKey(this.sellerAB)) {
            try {
               long var1 = Long.parseLong((String)sellerAC.get(this.sellerAB));
               if (System.currentTimeMillis() - var1 > 5000L) {
                  sellerAA = true;
                  (new Thread(this)).start();
               }

            } catch (Exception var3) {
               sellerAC.remove(this.sellerAB);
            }
         } else {
            sellerAA = true;
            (new Thread(this)).start();
         }
      }
   }

   public final void run() {
      try {
         Thread.sleep(50L);
      } catch (InterruptedException var6) {
      }

      if (!sellerAC.isEmpty()) {
         Enumeration var1 = sellerAC.keys();

         while(var1.hasMoreElements()) {
            String var2 = (String)var1.nextElement();

            try {
               long var3 = Long.parseLong((String)sellerAC.get(var2));
               if (System.currentTimeMillis() - var3 > 5000L) {
                  sellerAC.remove(var2);
               }
            } catch (Exception var5) {
            }
         }
      }

      if (!AutoSellPro.sellerAA.isEmpty()) {
         Code.sellerAB(this.sellerAB, "bán hàng auto. " + TileMap.mapName + " khu " + TileMap.zoneID + " tọa độ: " + Char.getMyChar().cx + "-" + Char.getMyChar().cy);
         String var7 = null;
         Enumeration var8 = AutoSellPro.sellerAA.keys();

         while(var8.hasMoreElements()) {
            String var9 = (String)var8.nextElement();
            ItemSell var4;
            if ((var4 = (ItemSell)AutoSellPro.sellerAA.get(var9)) != null) {
               if (var7 == null) {
                  var7 = var9;
               }

               AutoSellPro.sellerAO();
               int var10 = AutoSellPro.sellerAB(var4.template.id);
               Auto.sleep(50L);
               Code.sellerAB(this.sellerAB, "mãvp: " + var4.name + " (" + var4.template.name + ") bán: " + NinjaUtil.numberToString(String.valueOf(var4.id)) + "xu/1cái. còn " + var10 + " cái");
            }
         }

         if (var7 != null) {
            Auto.sleep(50L);
            Code.sellerAB(this.sellerAB, "chat ''mua solg mãvp'' để mua. vd: ''mua 12 " + var7 + "''");
         }

         sellerAC.put(this.sellerAB, String.valueOf(System.currentTimeMillis()));
      }

      sellerAA = false;
   }
}
