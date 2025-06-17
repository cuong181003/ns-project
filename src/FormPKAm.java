import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;

public final class FormPKAm extends Form implements CommandListener {
   private final TextField advAA;
   private final TextField advAB;
   private final TextField advAC;
   private final TextField advAD;
   private final TextField advAE;
   private final TextField advAF;
   private final ChoiceGroup advAG;
   private final javax.microedition.lcdui.Command advAH;

   public FormPKAm() {
      super("Cài khu chờ pk và đánh pk");
      this.append(this.advAG = new ChoiceGroup("Tự đi PK âm", 1, new String[]{"Bật", "Tắt"}, (Image[])null));
      this.append(this.advAF = new TextField("Bao nhiêu % thì tự đi PK:", String.valueOf(Code.PKAmValue), 2, 2));
      this.append(this.advAA = new TextField("Khu chờ PK:", String.valueOf(Code.advBU), 2, 2));
      this.append(this.advAB = new TextField("Khu đánh PK:", String.valueOf(Code.advBV), 2, 2));
      this.append(this.advAC = new TextField("ID map PK - (map hiện tại: " + TileMap.mapID + ")", Code.advBW != -1 ? String.valueOf(Code.advBW) : "70", 3, 2));
      this.append(this.advAD = new TextField("Vị trí X - (vt hiện tại: " + Char.getMyChar().cx + ")", Code.advBX != -1 ? String.valueOf(Code.advBX) : "1500", 9, 2));
      this.append(this.advAE = new TextField("Vị trí Y - (vt hiện tại: " + Char.getMyChar().cy + ")", Code.advBY != -1 ? String.valueOf(Code.advBY) : "528", 9, 2));
      this.addCommand(this.advAH = new javax.microedition.lcdui.Command("Save", 4, 0));
      this.addCommand(new javax.microedition.lcdui.Command("Cancel", 7, 0));
      this.setCommandListener(this);
      this.advAG.setSelectedIndex(Code.isAGiuLV ? 0 : 1, true);
   }

   public final void advAA() {
      Display.getDisplay(GameMidlet.instance).setCurrent(this);
   }

   public final void commandAction(javax.microedition.lcdui.Command var1, Displayable var2) {
      if (var1 == this.advAH) {
         label96: {
            ByteArrayOutputStream var12 = new ByteArrayOutputStream();
            DataOutputStream var13 = new DataOutputStream(var12);

            try {
               Code.advBU = Byte.parseByte(this.advAA.getString());
               Code.advBV = Byte.parseByte(this.advAB.getString());
               Code.advBW = Short.parseShort(this.advAC.getString());
               Code.advBX = Integer.parseInt(this.advAD.getString());
               Code.advBY = Integer.parseInt(this.advAE.getString());
               Code.PKAmValue = Long.parseLong(this.advAF.getString());
               Code.isAGiuLV = this.advAG.getSelectedIndex() == 0;
               RMS.saveRMSInt("keepLevel", Code.isAGiuLV ? 1 : -1);
               var13.writeByte(Code.advBU);
               var13.writeByte(Code.advBV);
               var13.writeShort(Code.advBW);
               var13.writeInt(Code.advBX);
               var13.writeInt(Code.advBY);
               var13.writeLong(Code.PKAmValue);
               RMS.saveRMS("chipPkam", var12.toByteArray());
               var13.flush();
               var12.flush();
               GameCanvas.startOKDlg("Lưu cài đặt thành công");
               break label96;
            } catch (Exception var10) {
               Display.getDisplay(GameMidlet.instance).setCurrent(new Alert("Lỗi", "Có lỗi xảy ra. Hãy xem lại cài đặt!", (Image)null, AlertType.ERROR));
            } finally {
               try {
                  var13.close();
                  var12.close();
               } catch (IOException var9) {
               }

            }

            return;
         }
      }

      Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.gI());
   }
}
