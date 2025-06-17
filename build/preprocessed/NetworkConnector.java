import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

final class NetworkConnector implements Runnable {
   private final String nsoAA;
   private Session_ME session;

   NetworkConnector(Session_ME var1, String var2) {
      this.session = var1;
//      this.nsoAA = "socket://127.0.0.1:14444";
this.nsoAA =var2;
   }

   public final void run() {
      Session_ME.nsoAP = false;
      (new Thread(new ConnectionMonitor())).start();
      this.session.connecting = true;
      Thread.currentThread().setPriority(1);
      this.session.connected = true;

      try {
         String var2 = this.nsoAA;
         this.session.sc = (SocketConnection)Connector.open(var2);
         Session_ME.nsoAA(this.session, this.session.sc.openDataOutputStream());
         this.session.dis = this.session.sc.openDataInputStream();
         (new Thread(Session_ME.nsoAA(this.session))).start();
         this.session.nsoAI = new Thread(new MessageCollector(this.session));
         this.session.nsoAI.start();
         this.session.timeConnected = System.currentTimeMillis();
         Session_ME.nsoAA(this.session, new Message((byte)-27));
         this.session.connecting = false;
         Controller var1 = this.session.messageHandler;
      } catch (Exception var4) {
         try {
            Thread.sleep(500L);
         } catch (InterruptedException var3) {
         }

         if (!Session_ME.nsoAP) {
            if (this.session.messageHandler != null) {
               this.session.close();
               this.session.messageHandler.onConnectionFail();
            }

         }
      }
   }
}
