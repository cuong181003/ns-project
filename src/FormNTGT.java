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

public final class FormNTGT extends Form implements CommandListener, ItemStateListener {
   private final javax.microedition.lcdui.Command ntgtAA;
   private final ChoiceGroup ntgtAB;
   private final ChoiceGroup ntgtAC;
   private final ChoiceGroup ntgtAD;
   private final TextField ntgtAE;
   private final TextField ntgtAF;
   private final TextField ntgtAG;
   private final TextField ntgtAH;
   private final TextField ntgtAI;
   private final TextField[] ntgtAJ;
   private final TextField ntgtAK;
   private final TextField ntgtAL;

   public FormNTGT() {
      super("AngelChip Auto");
      this.ntgtAJ = new TextField[AutoNTGT.ntgtBE.length];
      this.ntgtAL = new TextField("Bán cho người ngoài max?", String.valueOf(AutoNTGT.ntgtBH), 3, 2);
      this.ntgtAD = new ChoiceGroup("Auto trục xuất?", 1, new String[]{"Trục xuất", "Giữ lại"}, (Image[])null);
      if (AutoNTGT.ntgtBM == null) {
         AutoNTGT.ntgtBM = (Char.getMyChar().cClanName.length() > 0 ? "Clan [" + Char.getMyChar().cClanName + "] " : "Bot ") + "bán NTGT tự động tại: " + TileMap.mapName + " khu " + TileMap.zoneID + "/n/Số lượng có hạn, ae nhanh đến mua kẻo hết";
      }

      this.append(this.ntgtAB = new ChoiceGroup("Cài đặt bán", 1, new String[]{"Chỉ bán cho thành viên", "Bán cho tất cả"}, (Image[])null));
      if (!AutoNTGT.ntgtBG) {
         this.append(this.ntgtAL);
         this.append(this.ntgtAD);
      }

      for(int var1 = 0; var1 < this.ntgtAJ.length; ++var1) {
         this.append(this.ntgtAJ[var1] = new TextField("Giá NTGT " + (var1 + 1) + ":", String.valueOf(AutoNTGT.ntgtBE[var1]), 9, 2));
      }

      this.append(this.ntgtAK = new TextField("Chia tiền lời cho GT (%):", String.valueOf(AutoNTGT.ntgtBJ), 3, 2));
      this.append(this.ntgtAE = new TextField("Tự góp xu mỗi ngày?:", String.valueOf(AutoNTGT.ntgtBR), 9, 2));
      this.append(this.ntgtAC = new ChoiceGroup("Tùy chọn", 2, new String[]{"Auto chat", "Auto msg", "Ghi lại lịch sử GD"}, (Image[])null));
      this.append(this.ntgtAG = new TextField("Nội dung msg hướng dẫn:", AutoNTGT.ntgtBL, 1024, 0));
      this.append(this.ntgtAF = new TextField("Nội dung auto msg:", AutoNTGT.ntgtBM, 1024, 0));
      this.append(this.ntgtAH = new TextField("Nội dung auto chat:", AutoNTGT.ntgtAE, 1024, 0));
      this.append(this.ntgtAI = new TextField("Quãng nghỉ chat (ms):", String.valueOf(AutoNTGT.ntgtAF), 5, 2));
      this.append("- Lưu ý: Mỗi nội dung msg hoặc chat cách nhau bằng ký hiệu \"/n/\"");
      this.addCommand(this.ntgtAA = new javax.microedition.lcdui.Command("Lưu", 4, 0));
      this.addCommand(new javax.microedition.lcdui.Command("Hủy", 3, 1));
      this.setCommandListener(this);
      this.setItemStateListener(this);
      this.ntgtAB.setSelectedIndex(AutoNTGT.ntgtBG ? 0 : 1, true);
      this.ntgtAD.setSelectedIndex(AutoNTGT.ntgtBK ? 0 : 1, true);
      this.ntgtAC.setSelectedIndex(0, AutoNTGT.ntgtBF);
      this.ntgtAC.setSelectedIndex(1, AutoNTGT.ntgtBN);
      this.ntgtAC.setSelectedIndex(2, AutoNTGT.ntgtBS);
   }

   public final void ntgtAA() {
      Display.getDisplay(GameMidlet.instance).setCurrent(this);
   }

   public final void commandAction(javax.microedition.lcdui.Command var1, Displayable var2) {
      if (var1 == this.ntgtAA) {
         try {
            AutoNTGT.ntgtBH = Integer.parseInt(this.ntgtAL.getString().trim());

            for(int var4 = 0; var4 < this.ntgtAJ.length; ++var4) {
               AutoNTGT.ntgtBE[var4] = Integer.parseInt(this.ntgtAJ[var4].getString().trim());
            }

            AutoNTGT.ntgtBJ = Integer.parseInt(this.ntgtAK.getString().trim());
            AutoNTGT.ntgtAF = (long)Integer.parseInt(this.ntgtAI.getString().trim());
            AutoNTGT.ntgtBR = Integer.parseInt(this.ntgtAE.getString().trim());
            AutoNTGT.ntgtBG = this.ntgtAB.isSelected(0);
            AutoNTGT.ntgtBK = this.ntgtAD.isSelected(0);
            AutoNTGT.ntgtBF = this.ntgtAC.isSelected(0);
            AutoNTGT.ntgtBN = this.ntgtAC.isSelected(1);
            AutoNTGT.ntgtBS = this.ntgtAC.isSelected(2);
            AutoNTGT.ntgtBM = this.ntgtAF.getString().trim();
            AutoNTGT.ntgtBL = this.ntgtAG.getString().trim();
            AutoNTGT.ntgtAE = this.ntgtAH.getString().trim();
            if (AutoNTGT.ntgtAF < 6000L) {
               AutoNTGT.ntgtAF = 6000L;
            }

            AutoNTGT.ntgtAO();
            GameCanvas.startOKDlg("Lưu cài đặt thành công");
         } catch (NumberFormatException var3) {
            Display.getDisplay(GameMidlet.instance).setCurrent(new Alert("Lỗi", "Có lỗi xảy ra. Hãy xem lại cài đặt!", (Image)null, AlertType.ERROR));
            return;
         }
      }

      Display.getDisplay(GameMidlet.instance).setCurrent(MotherCanvas.gI());
   }

   public final void itemStateChanged(javax.microedition.lcdui.Item var1) {
      if (var1 == this.ntgtAB) {
         if (this.ntgtAB.isSelected(1)) {
            if (this.ntgtAA(this.ntgtAL) == -1) {
               this.insert(this.ntgtAA(this.ntgtAB) + 1, this.ntgtAL);
            }

            if (this.ntgtAA(this.ntgtAD) == -1) {
               this.insert(this.ntgtAA(this.ntgtAB) + 2, this.ntgtAD);
               return;
            }
         } else {
            int var2;
            if ((var2 = this.ntgtAA(this.ntgtAD)) != -1) {
               this.delete(var2);
            }

            if ((var2 = this.ntgtAA(this.ntgtAL)) != -1) {
               this.delete(var2);
            }
         }
      }

   }

   private int ntgtAA(javax.microedition.lcdui.Item var1) {
      for(int var2 = 0; var2 < this.size(); ++var2) {
         if (this.get(var2) == var1) {
            return var2;
         }
      }

      return -1;
   }
}
