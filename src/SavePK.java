import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class SavePK {
   public static MyVector advAA;

   static {
      (advAA = new MyVector()).removeAllElements();

      try {
         ByteArrayInputStream var0 = new ByteArrayInputStream(RMS.loadRMS("V6PKS"));
         DataInputStream var1;
         int var2 = (var1 = new DataInputStream(var0)).readInt();

         for(int var3 = 0; var3 < var2; ++var3) {
            advAA.addElement(var1.readUTF());
         }

         var1.close();
         var0.close();
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   private static void advAC() {
      ByteArrayOutputStream var0 = new ByteArrayOutputStream();
      DataOutputStream var1 = new DataOutputStream(var0);

      try {
         var1.writeInt(advAA.size());

         for(int var2 = 0; var2 < advAA.size(); ++var2) {
            var1.writeUTF((String)advAA.elementAt(var2));
         }

         var1.flush();
         var0.flush();
         RMS.saveRMS("V6PKS", var0.toByteArray());
      } catch (Exception var3) {
         var3.printStackTrace();
      }
   }

   public static MyVector DSPK() {
      MyVector var0 = new MyVector();

      for(int var1 = 0; var1 < advAA.size(); ++var1) {
         var0.addElement(var1 + ". " + (String)advAA.elementAt(var1));
      }

      return var0;
   }

   public static void advAA(String var0) {
      if (!advAA.contains(var0)) {
         advAA.addElement(var0);
         advAC();
      }

   }

   public static void advAB(String var0) {
      if (advAA.contains(var0)) {
         advAA.removeElement(var0);
         advAC();
      }

   }

   public static void advAB() {
      advAA.removeAllElements();
      advAC();
   }

   public static boolean advAC(String var0) {
      return advAA.contains(var0);
   }
}
