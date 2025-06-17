import java.util.Enumeration;
import java.util.Hashtable;

final class AutoNTGT1 implements Runnable {
   private final String ntgtAB;
   private final MyVector ntgtAC;
   public static final Hashtable ntgtAA = new Hashtable();

   public AutoNTGT1(String var1, MyVector var2) {
      this.ntgtAB = var1;
      this.ntgtAC = var2;
   }

   public final void ntgtAA() {
      (new Thread(this)).start();
   }

   public final void run() {
      synchronized(ntgtAA) {
         boolean var2 = false;
         String var4;
         if (!ntgtAA.isEmpty()) {
            if (!ntgtAA.containsKey(this.ntgtAB)) {
               var2 = true;
            }

            Enumeration var3 = ntgtAA.keys();

            while(var3.hasMoreElements()) {
               var4 = (String)var3.nextElement();

               try {
                  long var5 = Long.parseLong((String)ntgtAA.get(var4));
                  if (System.currentTimeMillis() - var5 > 10000L) {
                     if (!var2 && var4.equals(this.ntgtAB)) {
                        var2 = true;
                     }

                     ntgtAA.remove(var4);
                  }
               } catch (NumberFormatException var8) {
               }
            }
         } else {
            var2 = true;
         }

         if (var2 && this.ntgtAC != null && !this.ntgtAC.isEmpty()) {
            for(int var10 = 0; var10 < this.ntgtAC.size(); ++var10) {
               var4 = (String)this.ntgtAC.elementAt(var10);
               Code.sellerAB(this.ntgtAB, var4);

               try {
                  ntgtAA.wait(100L);
               } catch (InterruptedException var7) {
               }
            }

            ntgtAA.put(this.ntgtAB, String.valueOf(System.currentTimeMillis()));
         }

      }
   }
}
