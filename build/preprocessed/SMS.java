import javax.microedition.io.Connector;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

final class SMS implements Runnable {
   private final String nsoAA;
   private final String nsoAB;
   private final String nsoAC;
   private final Command nsoAD;
   private final Command nsoAE;

   SMS(String var1, String var2, String var3, Command var4, Command var5) {
      this.nsoAA = var1;
      this.nsoAB = var2;
      this.nsoAC = var3;
      this.nsoAD = var4;
      this.nsoAE = var5;
   }

   public final void run() {
      try {
         MessageConnection var1 = null;
         TextMessage var2;
         (var2 = (TextMessage)(var1 = (MessageConnection)Connector.open(this.nsoAA)).newMessage("text")).setAddress(this.nsoAA);
         var2.setPayloadText(this.nsoAB);
         var1.send(var2);
         System.out.println("SMS data: " + this.nsoAB + ", to: " + this.nsoAC);
         this.nsoAD.performAction();
      } catch (Exception var3) {
         this.nsoAE.performAction();
      }
   }
}
