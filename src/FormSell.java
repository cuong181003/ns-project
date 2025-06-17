import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextField;

public final class FormSell implements CommandListener {
   Form sellerAA = new Form("AutoSell");
   private javax.microedition.lcdui.Command sellerAB = new javax.microedition.lcdui.Command("Lưu", 4, 0);
   private javax.microedition.lcdui.Command sellerAC = new javax.microedition.lcdui.Command("Hủy", 3, 1);
   private TextField sellerAD;
   private TextField sellerAE;
   private TextField sellerAF;
   private TextField sellerAG;
   private ChoiceGroup sellerAH;
   private ChoiceGroup sellerAI;
   private TextField sellerAJ;
   private TextField sellerAK;

   public FormSell() {
      this.sellerAK = new TextField("Gọi acc kiếm đồ (phút):", String.valueOf(AutoSellPro.sellerBL), 4, 2);
      this.sellerAD = new TextField("D.s acc kiếm đồ:", sellerAC(), 1024, 524288);
      this.sellerAE = new TextField("Acc rút xu:", AutoSellPro.sellerBA, 32, 524288);
      this.sellerAF = new TextField("D.s acc bơm đồ:", sellerAB(), 1024, 524288);
      this.sellerAG = new TextField("Nội dung chat:", AutoSellPro.sellerBE, 1024, 524288);
      this.sellerAJ = new TextField("Quãng nghỉ chat (ms):", String.valueOf(AutoSellPro.sellerBG), 10, 2);
      this.sellerAH = new ChoiceGroup("Auto chat", 1, new String[]{"Bật", "Tắt"}, new Image[2]);
      this.sellerAI = new ChoiceGroup("Auto tin nhắn riêng", 1, new String[]{"Bật", "Tắt"}, new Image[2]);
      this.sellerAA.append(this.sellerAK);
      this.sellerAA.append(this.sellerAD);
      this.sellerAA.append("Mỗi Acc kiếm đồ cách nhau bằng dấu chấm phẩy ;");
      this.sellerAA.append(this.sellerAF);
      this.sellerAA.append("Mỗi Acc bơm đồ cách nhau bằng dấu chấm phẩy ;");
      this.sellerAA.append(this.sellerAE);
      this.sellerAA.append(this.sellerAH);
      this.sellerAA.append(this.sellerAG);
      this.sellerAA.append("Mỗi tin nhắn cách nhau bàng ký hiệu /n/");
      this.sellerAA.append(this.sellerAJ);
      this.sellerAA.append(this.sellerAI);
      this.sellerAA.addCommand(this.sellerAB);
      this.sellerAA.addCommand(this.sellerAC);
      this.sellerAA.setCommandListener(this);
      if (AutoSellPro.sellerBI) {
         this.sellerAH.setSelectedIndex(0, true);
      } else {
         this.sellerAH.setSelectedIndex(1, true);
      }

      if (AutoSellPro.sellerBF) {
         this.sellerAI.setSelectedIndex(0, true);
      } else {
         this.sellerAI.setSelectedIndex(1, true);
      }
   }

   private static String sellerAB() {
      String var0 = "";

      for(int var1 = 0; var1 < AutoSellPro.sellerBB.size(); ++var1) {
         String var2;
         if ((var2 = (String)AutoSellPro.sellerBB.elementAt(var1)).length() > 0) {
            var0 = var0 + var2;
            if (var1 < AutoSellPro.sellerBB.size() - 1) {
               var0 = var0 + ";";
            }
         }
      }

      return var0;
   }

   private static String sellerAC() {
      String var0 = "";

      for(int var1 = 0; var1 < AutoSellPro.sellerBC.size(); ++var1) {
         String var2;
         if ((var2 = (String)AutoSellPro.sellerBC.elementAt(var1)).length() > 0) {
            var0 = var0 + var2;
            if (var1 < AutoSellPro.sellerBC.size() - 1) {
               var0 = var0 + ";";
            }
         }
      }

      return var0;
   }

   public final void sellerAA() {
      sellerAA(this.sellerAA);
   }

   static void sellerAA(Displayable var0) {
      Display.getDisplay(GameMidlet.instance).setCurrent(var0);
   }

   public final void commandAction(javax.microedition.lcdui.Command var1, Displayable var2) {
      if (var1 == this.sellerAB) {
         String var18 = this.sellerAK.getString().trim();

         try {
            AutoSellPro.sellerBL = Integer.parseInt(var18);
         } catch (NumberFormatException var17) {
            AutoSellPro.sellerBL = 0;
         }

         AutoSellPro.sellerBC.removeAllElements();
         AutoSellPro.sellerAO().sellerBJ = 0;
         var18 = this.sellerAD.getString().trim();
         String var20 = "";
         String var4;
         if (var18.length() > 0) {
            String[] var19 = Code.split(var18, ";");

            for(int var3 = 0; var3 < var19.length; ++var3) {
               if ((var4 = var19[var3].trim()).length() > 0) {
                  AutoSellPro.sellerBC.addElement(AutoSellPro.sellerAA(var4));
                  var20 = var20 + var4;
                  if (var3 < var19.length - 1) {
                     var20 = var20 + ";";
                  }
               }
            }
         }

         AutoSellPro.sellerBA = this.sellerAE.getString().trim();
         AutoSellPro.sellerBB.removeAllElements();
         var18 = this.sellerAF.getString().trim();
         String var23 = "";
         if (var18.length() > 0) {
            String[] var24 = Code.split(var18, ";");

            for(int var21 = 0; var21 < var24.length; ++var21) {
               String var5;
               if ((var5 = var24[var21].trim()).length() > 0) {
                  AutoSellPro.sellerBB.addElement(AutoSellPro.sellerAA(var5));
                  var23 = var23 + var5;
                  if (var21 < var24.length - 1) {
                     var23 = var23 + ";";
                  }
               }
            }
         }

         if ((AutoSellPro.sellerBE = this.sellerAG.getString().trim()).length() > 0) {
            AutoSellPro.sellerBD = Code.split(AutoSellPro.sellerBE, "/n/");
         } else {
            AutoSellPro.sellerBD = null;
         }

         AutoSellPro.sellerBI = this.sellerAH.isSelected(0);
         var4 = this.sellerAJ.getString().trim();

         try {
            AutoSellPro.sellerBG = (long)Integer.parseInt(var4);
         } catch (NumberFormatException var16) {
         }

         if (AutoSellPro.sellerBG < 6000L) {
            AutoSellPro.sellerBG = 6000L;
         }

         AutoSellPro.sellerBF = this.sellerAI.isSelected(0);
         AutoSellPro.sellerBH = System.currentTimeMillis();
         ByteArrayOutputStream var22 = new ByteArrayOutputStream();
         DataOutputStream var25 = new DataOutputStream(var22);

         try {
            var25.writeInt(AutoSellPro.sellerBL);
            var25.writeUTF(var20);
            var25.writeUTF(AutoSellPro.sellerBA);
            var25.writeUTF(var23);
            var25.writeUTF(AutoSellPro.sellerBE);
            var25.writeBoolean(AutoSellPro.sellerBI);
            var25.writeLong(AutoSellPro.sellerBG);
            var25.writeBoolean(AutoSellPro.sellerBF);
            var25.flush();
            var22.flush();
            RMS.saveRMS("AutoSellSettings", var22.toByteArray());
            GameCanvas.startOKDlg("Lưu cài đặt thành công!");
         } catch (IOException var14) {
         } finally {
            try {
               var22.close();
               var25.close();
            } catch (IOException var13) {
            }

         }
      }

      sellerAA(MotherCanvas.gI());
   }
}
