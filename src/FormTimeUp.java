import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.TextField;

public final class FormTimeUp extends Form implements CommandListener {
   private TextField advAA;
   private TextField advAB;
   private TextField advAC;
   private javax.microedition.lcdui.Command advAD;
   private static FormTimeUp advAE;

   public FormTimeUp() {
      super("Cài up time - Cài all 0 để up full time");
      this.append(this.advAA = new TextField("Ngày up", "", 3, 2));
      this.append(this.advAB = new TextField("Giờ up", "", 3, 2));
      this.append(this.advAC = new TextField("Phút up", "", 3, 2));
      this.addCommand(this.advAD = new javax.microedition.lcdui.Command("Lưu", 4, 0));
      this.addCommand(new javax.microedition.lcdui.Command("Thoát", 7, 0));
      this.setCommandListener(this);
   }

   public static FormTimeUp advAA() {
      if (advAE == null) {
         advAE = new FormTimeUp();
      }

      return advAE;
   }

   public final void advAB() {
      long var2 = Code.TimeUpValue / 60000L;
      this.advAC.setString(String.valueOf(var2 % 60L));
      var2 /= 60L;
      this.advAB.setString(String.valueOf(var2 % 60L));
      var2 /= 60L;
      this.advAA.setString(String.valueOf(var2));
      Display.getDisplay(GameMidlet.instance).setCurrent(this);
   }

   public final void commandAction(javax.microedition.lcdui.Command var1, Displayable var2) {
      if (var1 == this.advAD) {
         int var5 = 0;
         int var6 = 0;
         int var3 = 0;

         try {
            var5 = Integer.parseInt(this.advAA.getString());
            var6 = Integer.parseInt(this.advAB.getString());
            var3 = Integer.parseInt(this.advAC.getString());
         } catch (Exception var4) {
         }

         Code.TimeUpValue = ((long)(var5 * 24 + var6) * 60L + (long)var3) * 60L * 1000L;
      }

      Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.instance);
      MotherCanvas.instance.setFullScreenMode(true);
   }
}
