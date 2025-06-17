import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.ItemStateListener;

public final class FormDapDo extends Form implements CommandListener, ItemStateListener {
   private final ChoiceGroup advAA;
   private final ChoiceGroup advAB;
   private final ChoiceGroup advAC;
   private final javax.microedition.lcdui.Command advAD;

   public FormDapDo() {
      super("Cài đặt auto nâng cấp");
      this.append(this.advAA = new ChoiceGroup("Bật / Tắt Auto", 1, new String[]{"Bật", "Tắt"}, (Image[])null));
      this.append(this.advAB = new ChoiceGroup("Max nâng cấp", 1, new String[]{"+4", "+5", "+6", "+7", "+8", "+9", "+10", "+11"}, (Image[])null));
      this.advAC = new ChoiceGroup("Nâng cấp +8 dùng đá", 1, new String[]{"Đá 6", "Đá 7"}, (Image[])null);
      if (Code.CapDoValue >= 8) {
         this.append(this.advAC);
      }

      this.addCommand(this.advAD = new javax.microedition.lcdui.Command("Save", 4, 0));
      this.addCommand(new javax.microedition.lcdui.Command("Cancel", 7, 1));
      this.setCommandListener(this);
      this.setItemStateListener(this);
      this.advAA.setSelectedIndex(Code.isADapDo ? 0 : 1, true);
      this.advAB.setSelectedIndex(Code.CapDoValue - 4, true);
      this.advAC.setSelectedIndex(Code.advCI == 6 ? 1 : 0, true);
   }

   public final void commandAction(javax.microedition.lcdui.Command var1, Displayable var2) {
      if (var1 == this.advAD) {
         try {
            Code.isADapDo = this.advAA.isSelected(0);
            Code.CapDoValue = this.advAB.getSelectedIndex() + 4;
            Code.advCI = this.advAC.isSelected(1) ? 6 : 5;
            GameCanvas.startOKDlg("Lưu cài đặt thành công");
         } catch (Exception var3) {
            Display.getDisplay(GameMidlet.instance).setCurrent(new Alert("Lỗi", "Có lỗi xảy ra. Hãy xem lại cài đặt!", (Image)null, AlertType.ERROR));
            return;
         }
      }

      Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.gI());
   }

   public final void itemStateChanged(javax.microedition.lcdui.Item var1) {
      if (var1 == this.advAB) {
         if (this.advAB.getSelectedIndex() >= 4) {
            if (this.size() < 3) {
               this.append(this.advAC);
               return;
            }
         } else if (this.size() >= 3 && this.get(2) == this.advAC) {
            this.delete(2);
         }
      }

   }
}
