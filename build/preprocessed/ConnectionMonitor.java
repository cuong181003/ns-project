final class ConnectionMonitor implements Runnable {
   public final void run() {
      try {
         Thread.sleep(20000L);
      } catch (InterruptedException var2) {
      }

      if (Session_ME.instance.connecting) {
         try {
            Session_ME.instance.sc.close();
         } catch (Exception var1) {
         }

         Session_ME.nsoAP = true;
         Session_ME.instance.connecting = false;
         Session_ME.instance.connected = false;
         Session_ME.instance.messageHandler.onConnectionFail();
      }

   }
}
