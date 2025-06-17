public final class SendSMS {
   public static void sendSMSRe(String var0, String var1, Command var2, Command var3) {
      (new Thread(new SMS(var1, var0, var1, var2, var3))).start();
   }

   public static void nsoAA() {
      Session_ME.instance.initThread.start();
   }
}
