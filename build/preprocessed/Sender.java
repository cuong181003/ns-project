final class Sender implements Runnable {
   final Session_ME session;

   public Sender(Session_ME var1) {
      this.session = var1;
      Session_ME.nsoAA(var1, new MyVector());
   }

   public final void run() {
      while(this.session.connected) {
         try {
            if (this.session.getKeyComplete) {
               while(Session_ME.nsoAB(this.session).size() > 0) {
                  GameScr.gI();
                  Message var1 = (Message)Session_ME.nsoAB(this.session).elementAt(0);
                  Session_ME.nsoAB(this.session).removeElementAt(0);
                  Session_ME.nsoAA(this.session, var1);
               }
            }

            try {
               Thread.sleep(10L);
            } catch (InterruptedException var2) {
            }
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }

   }
}
