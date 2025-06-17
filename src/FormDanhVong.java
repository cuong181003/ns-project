import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
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
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.TextField;

public final class FormDanhVong extends Form implements CommandListener, ItemStateListener {
   public static boolean isADanhVong = false;
   public static String advAB = "";
   public static int advAC = 72;
   public static int advAD = 22;
   public static int advAE = -1;
   public static int advAF = -1;
   public static int advAG = 1000;
   public static int advAH = -1;
   public static int advAI = -1;
   public static short advAJ = -1;
   public static byte advAK = 0;
   public static byte advAL = 5;
   public static int advAM = 7;
   public static byte advAN = 2;
   public static byte advAO = 0;
   public static byte advAP = 0;
   public static boolean advAQ = false;
   public static byte advAR = 0;
   public static boolean advAS = false;
   public static boolean advAT = true;
   private final TextField advAU;
   private final TextField advAV;
   private final TextField advAW;
   private final TextField advAX;
   private final TextField advAY;
   private final TextField advAZ;
   private final ChoiceGroup advBA;
   private final ChoiceGroup advBB;
   private final ChoiceGroup advBC;
   private final ChoiceGroup advBD;
   private final ChoiceGroup advBE;
   private final ChoiceGroup advBF;
   private final ChoiceGroup advBG;
   private final TextField advBH;
   private final TextField advBI;
   private final TextField advBJ;
   private final TextField advBK;
   private final TextField advBL;
   private final TextField advBM;
   private final javax.microedition.lcdui.Command advBN;
   private static FormDanhVong advBO;

   public static void advAA() {
      byte[] var0;
      if ((var0 = RMS.loadRMS("chipAutodv")) != null) {
         ByteArrayInputStream var11 = new ByteArrayInputStream(var0);
         DataInputStream var1 = new DataInputStream(var11);

         try {
            advAB = var1.readUTF();
            advAC = var1.readInt();
            advAD = var1.readInt();
            advAE = var1.readInt();
            advAF = var1.readInt();
            advAG = var1.readInt();
            advAH = var1.readInt();
            advAI = var1.readInt();
            isADanhVong = var1.readBoolean();
            advAJ = var1.readShort();
            advAN = var1.readByte();
            advAK = var1.readByte();
            advAL = var1.readByte();
            advAO = var1.readByte();
            advAM = var1.readInt();
            advAP = var1.readByte();
            advAQ = var1.readBoolean();
            advAR = var1.readByte();
            advAS = var1.readBoolean();
            advAT = var1.readBoolean();
         } catch (Exception var9) {
            RMS.deleteRecord("chipAutodv");
         } finally {
            try {
               var1.close();
               var11.close();
            } catch (IOException var8) {
            }

         }
      }

      advBO = new FormDanhVong();
   }

   public static FormDanhVong advAB() {
      return advBO;
   }

   private FormDanhVong() {
      super("Cài đặt");
      this.advAY = new TextField("Nâng cấp max: ", String.valueOf(advAL), 2, 2);
      this.advAZ = new TextField("Chỉ đập đồ đang + <= ", String.valueOf(advAM), 2, 2);
      this.append(this.advBA = new ChoiceGroup("Tự đi làm DV?", 1, new String[]{"Bật", "Tắt"}, (Image[])null));
      this.append(this.advAV = new TextField("Giờ Auto DV: ", String.valueOf(advAH), 2, 2));
      this.append(this.advAW = new TextField("Phút Auto DV: ", String.valueOf(advAI), 2, 2));
      this.append(this.advAU = new TextField("Xu cược lôi đài: ", String.valueOf(advAG), 10, 2));
      this.append(this.advBI = new TextField("Đối thủ là: ", advAB, 32, 0));
      this.append(this.advBJ = new TextField("Map lôi đài: ", String.valueOf(advAC), 3, 2));
      this.append(this.advBK = new TextField("Khu lôi đài: ", String.valueOf(advAD), 3, 2));
      this.append(this.advBL = new TextField("Map danh vọng: ", String.valueOf(advAE), 3, 2));
      this.append(this.advBM = new TextField("Khu danh vọng: ", String.valueOf(advAF), 3, 0));
      this.append(this.advAX = new TextField("Map LTĐ (nv đánh quái): ", String.valueOf(advAJ), 3, 2));
      this.append(this.advBC = new ChoiceGroup("Auto mua đồ?", 1, new String[]{"Ko tự mua", "Dưới 4X", "Dưới 5X", "Dưới 6X", "Dưới 7X", "Mua tất cả"}, (Image[])null));
      this.append(this.advBB = new ChoiceGroup("NV nâng cấp TB?", 1, new String[]{"Huỷ nhiệm vụ", "Dừng auto", "Nhận và làm"}, (Image[])null));
      this.append(this.advBD = new ChoiceGroup("Nếu thiếu item thì?", 1, new String[]{"Dừng auto", "Huỷ nhiệm vụ"}, (Image[])null));
      this.append(this.advBG = new ChoiceGroup("Nhiệm vụ TA TL?", 2, new String[]{"Huỷ nv đánh TA", "Huỷ nv đánh TL"}, (Image[])null));
      this.append(this.advBE = new ChoiceGroup("Nhiệm vụ đánh quái?", 1, new String[]{"Bỏ qua boss", "Bem hết"}, (Image[])null));
      this.append(this.advBH = new TextField("Auto danh vọng phù: ", String.valueOf(advAR), 1, 2));
      this.append(this.advBF = new ChoiceGroup("Acc phụ thua LĐ", 2, new String[]{"Tự thoát ra vào lại"}, (Image[])null));
      if (advAK == 2) {
         super.insert(12, this.advAY);
         super.insert(13, this.advAZ);
      }

      super.addCommand(this.advBN = new javax.microedition.lcdui.Command("Save", 4, 1));
      super.addCommand(new javax.microedition.lcdui.Command("Cancel", 3, 1));
      super.setCommandListener(this);
      super.setItemStateListener(this);
      this.advBA.setSelectedIndex(isADanhVong ? 0 : 1, true);
      this.advBC.setSelectedIndex(advAN, true);
      this.advBB.setSelectedIndex(advAK, true);
      this.advBD.setSelectedIndex(advAO, true);
      this.advBE.setSelectedIndex(advAP, true);
      this.advBF.setSelectedIndex(0, advAQ);
      this.advBG.setSelectedIndex(0, advAS);
      this.advBG.setSelectedIndex(1, advAT);
   }

   public final void commandAction(javax.microedition.lcdui.Command var1, Displayable var2) {
      if (var1 == this.advBN) {
         try {
            label185: {
               if (isADanhVong = this.advBA.getSelectedIndex() == 0) {
                  label183: {
                     int var14 = Integer.parseInt(this.advAV.getString());
                     int var16 = Integer.parseInt(this.advAW.getString());
                     if (var14 >= 0 && var14 <= 23) {
                        if (var16 >= 0 && var16 <= 59) {
                           advAH = var14;
                           advAI = var16;
                           break label183;
                        }

                        Display.getDisplay(GameMidlet.instance).setCurrent(new Alert("Lỗi", "Phút phải từ 0 đến 59", (Image)null, AlertType.ERROR));
                        return;
                     }

                     Display.getDisplay(GameMidlet.instance).setCurrent(new Alert("Lỗi", "Giờ phải từ 0 đến 23", (Image)null, AlertType.ERROR));
                     return;
                  }
               }

               advAG = Integer.parseInt(this.advAU.getString());
               advAJ = Short.parseShort(this.advAX.getString());
               advAN = (byte)this.advBC.getSelectedIndex();
               advAK = (byte)this.advBB.getSelectedIndex();
               advAL = Byte.parseByte(this.advAY.getString());
               advAM = Integer.parseInt(this.advAZ.getString());
               advAB = this.advBI.getString().trim();
               advAC = Integer.parseInt(this.advBJ.getString());
               advAD = Integer.parseInt(this.advBK.getString());
               advAE = Integer.parseInt(this.advBL.getString());
               advAF = Integer.parseInt(this.advBM.getString());
               advAO = (byte)this.advBD.getSelectedIndex();
               advAP = (byte)this.advBE.getSelectedIndex();
               advAQ = this.advBF.isSelected(0);
               advAR = Byte.parseByte(this.advBH.getString());
               advAS = this.advBG.isSelected(0);
               advAT = this.advBG.isSelected(1);
               if (!TileMap.isTruong(advAC)) {
                  Display.getDisplay(GameMidlet.instance).setCurrent(new Alert("Lỗi", "Map lôi đài phải là map Trường!", (Image)null, AlertType.ERROR));
                  return;
               }

               if (advAR > 6) {
                  advAR = 6;
               }

               if (advAQ) {
                  Code.autoLoiLoss.advAA = false;
               }

               if (advAC == 0) {
                  advAC = -1;
               }

               if (!TileMap.isLang(advAJ) && !TileMap.isTruong(advAJ)) {
                  advAJ = -1;
               }

               ByteArrayOutputStream var15 = new ByteArrayOutputStream();
               DataOutputStream var17 = new DataOutputStream(var15);

               try {
                  var17.writeUTF(advAB);
                  var17.writeInt(advAC);
                  var17.writeInt(advAD);
                  var17.writeInt(advAE);
                  var17.writeInt(advAF);
                  var17.writeInt(advAG);
                  var17.writeInt(advAH);
                  var17.writeInt(advAI);
                  var17.writeBoolean(isADanhVong);
                  var17.writeShort(advAJ);
                  var17.writeByte(advAN);
                  var17.writeByte(advAK);
                  var17.writeByte(advAL);
                  var17.writeByte(advAO);
                  var17.writeInt(advAM);
                  var17.writeByte(advAP);
                  var17.writeBoolean(advAQ);
                  var17.writeByte(advAR);
                  var17.writeBoolean(advAS);
                  var17.writeBoolean(advAT);
                  RMS.saveRMS("chipAutodv", var15.toByteArray());
                  Code.advCC = Code.advAA(advAH, advAI);
                  GameCanvas.startOKDlg("Lưu cài đặt thành công");
                  var17.flush();
                  var15.flush();
                  break label185;
               } catch (Exception var11) {
                  Display.getDisplay(GameMidlet.instance).setCurrent(new Alert("Lỗi", "Có lỗi xảy ra. Hãy xem lại cài đặt!", (Image)null, AlertType.ERROR));
               } finally {
                  try {
                     var15.close();
                     var17.close();
                  } catch (IOException var10) {
                  }

               }

               return;
            }
         } catch (Exception var13) {
            Display.getDisplay(GameMidlet.instance).setCurrent(new Alert("Lỗi", "Có lỗi xảy ra. Hãy xem lại cài đặt!", (Image)null, AlertType.ERROR));
            return;
         }
      }

      Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.instance);
      MotherCanvas.instance.setFullScreenMode(true);
   }

   public final void itemStateChanged(javax.microedition.lcdui.Item var1) {
      if (var1 == this.advBB) {
         if (this.advBB.getSelectedIndex() == 2) {
            if (super.get(12) != this.advAY) {
               super.insert(12, this.advAY);
            }

            if (super.get(13) != this.advAZ) {
               super.insert(13, this.advAZ);
               return;
            }
         } else {
            if (super.size() >= 14 && super.get(13) == this.advAZ) {
               super.delete(13);
            }

            if (super.size() >= 13 && super.get(12) == this.advAY) {
               super.delete(12);
            }
         }
      }

   }
}
