// Decompiled with: CFR 0.152
// Class Version: 6

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.ItemStateListener;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.MIDlet;

public final class FormPK
        extends Form
        implements CommandListener,
        ItemStateListener {

    private final Command AG;
    private static FormPK AH;
    public static boolean AA;
    public static boolean AB;
    public static boolean AC;
    public static boolean AD;
    public static int AE;
    public static int AF;
    private ChoiceGroup AI = new ChoiceGroup("Tùy chọn PK", 1, new String[]{"PK ngẫu nhiên", "PK trong danh sách"}, null);
    private ChoiceGroup AJ = new ChoiceGroup("Tùy chọn khác", 2, new String[]{"Dịch chuyển đến đối tượng", "PK đối tượng gần nhất", "Tự động dùng Hoàn lương chi thảo"}, null);
    private TextField AK;
    private TextField AL = new TextField("Sử dụng HLCT khi hiếu chiến đạt:", String.valueOf(AF), 2, 1);

    private static FormPK AB() {
        if (AH == null) {
            AH = new FormPK();
        }
        return AH;
    }

    public static void AA() {
        Display display = Display.getDisplay((MIDlet) GameMidlet.instance);
        if (AH == null) {
            AH = new FormPK();
        }
        display.setCurrent((Displayable) AH);
    }

    public FormPK() {
        super("Cài đặt Auto PK Người");
        this.AK = new TextField("Số lượng HLCT sử dụng 1 lần:", String.valueOf(AE), 2, 1);
        this.AG = new Command("Save", 4, 1);
        FormPK formPK = this;
        super.append((Item) formPK.AI);
        FormPK formPK2 = this;
        super.append((Item) formPK2.AJ);
        if (AB) {
            FormPK formPK3 = this;
            super.append((Item) formPK3.AL);
            FormPK formPK4 = this;
            super.append((Item) formPK4.AK);
        }
        FormPK formPK5 = this;
        super.addCommand(formPK5.AG);
        super.addCommand(new Command("Canel", 3, 1));
        FormPK formPK6 = this;
        formPK6.setCommandListener(formPK6);
        FormPK formPK7 = this;
        formPK7.setItemStateListener(formPK7);
        this.AI.setSelectedIndex(AA ? 1 : 0, true);
        this.AJ.setSelectedIndex(0, AC);
        this.AJ.setSelectedIndex(1, AD);
        this.AJ.setSelectedIndex(2, AB);
    }

    public final void commandAction(Command command, Displayable displayable) {
        if (command == this.AG) {
            AA = this.AI.getSelectedIndex() != 0;
            AC = this.AJ.isSelected(0);
            AD = this.AJ.isSelected(1);
            AB = this.AJ.isSelected(2);
            AF = Integer.parseInt(this.AL.getString());
            AE = Integer.parseInt(this.AK.getString());
            if (AF < 0) {
                Display.getDisplay((MIDlet) GameMidlet.instance).setCurrent((Displayable) new Alert("Lỗi", "Hiếu chiến phải lớn hơn 0", null, AlertType.ERROR));
                return;
            }
            if (AE < 0) {
                Display.getDisplay((MIDlet) GameMidlet.instance).setCurrent((Displayable) new Alert("Lỗi", "Số lượng sử dụng HLCT phải lớn hơn 0", null, AlertType.ERROR));
                return;
            }
            Char.SaveAuto();
            GameCanvas.startOKDlg("Lưu cài đặt thành công");
        }
        Display.getDisplay((MIDlet) GameMidlet.instance).setCurrent((Displayable) MotherCanvas.gI());
        MotherCanvas.gI().setFullScreenMode(true);
    }

    public final void itemStateChanged(Item item) {
        if (item == this.AJ) {
            if (this.AJ.isSelected(2)) {
                if (super.size() == 2 || super.size() > 2 && super.get(2) != this.AL) {
                    super.insert(2, (Item) this.AL);
                    super.insert(3, (Item) this.AK);
                    return;
                }
            } else if (!this.AJ.isSelected(2) && super.size() > 2 && super.get(2) != null && super.get(2) == this.AL) {
                super.delete(3);
                super.delete(2);
            }
        }
    }
}
