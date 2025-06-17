
import java.io.IOException;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Image;

public final class CuongScr implements IActionListener {

    private static CuongScr advAB = new CuongScr();
    public static byte advAA = (byte) RMS.loadRMSInt("blackBG");

    public static CuongScr advAA() {
        return advAB;
    }

    public static void sleep(long var0) {
        try {
            Thread.sleep(var0);
        } catch (InterruptedException var2) {
        }
    }

    public static Image advAA(String var0) {
        if (advAA != -1 && var0.indexOf("/bg/") != -1) {
            var0 = "/x" + mGraphics.zoomLevel + "/dot.png";
        }
        try {
            return Image.createImage(var0);
        } catch (IOException ex) {
            return null;
        }
    }

    public static void advAA(String var0, Command var1) {
        GameCanvas.msgdlg.setInfo(var0, (Command) null, var1, (Command) null);
        GameCanvas.currentDialog = GameCanvas.msgdlg;
    }

    public static void advAA(String var0, Command var1, Command var2) {
        GameCanvas.msgdlg.setInfo(var0, var1, (Command) null, var2);
        GameCanvas.currentDialog = GameCanvas.msgdlg;
    }

    public static Command advAA(String var0, int var1) {
        return new Command(var0, advAB, var1, (Object) null);
    }

    public final void perform(int var1, Object var2) {

        MyVector myVector;
        switch (var1) {
            case 1:
                GameCanvas.startOKDlg("Chức năng đang bị khoá!");
                return;
            case 2:
                Display.getDisplay(GameMidlet.instance).setCurrent(FormDanhVong.advAB());
                return;
            case 3:
                (new FormPKAm()).advAA();
                return;
            case 4:
                Display.getDisplay(GameMidlet.instance).setCurrent(new FormDapDo());
                return;
            case 5:
                Char.isANameMob = !Char.isANameMob;
                Char.SaveAuto();
                return;
            case 6:
                (new FormNTGT()).ntgtAA();
                return;
            case 7:
                FormPK.AA();
                return;
            case 8:
                FormSell.sellerAA((new FormSell()).sellerAA);
                return;

            case 93:
                GameCanvas.inputDlg.show("Tốc độ next map (millisecond)", new Command("Đặt", this, 94, (Object) null), 1);
                GameCanvas.inputDlg.tfInput.setText(String.valueOf(Code.SPNextMapValue));
                return;
            case 94:
                long var3 = Code.SPNextMapValue;

                try {
                    var3 = Long.parseLong(GameCanvas.inputDlg.tfInput.getText());
                } catch (NumberFormatException var5) {
                }

                if (var3 > 0L) {
                    Code.SPNextMapValue = var3;
                    RMS.saveRMSString("nmSleep", String.valueOf(Code.SPNextMapValue));
                }

                GameCanvas.endDlg();
                return;
            case 95:
                (myVector = new MyVector()).addElement(advAA("Bật", 951));
                myVector.addElement(advAA("Tắt", 952));
                GameCanvas.menu.startAt(myVector);
                return;
            case 96:
                (myVector = new MyVector()).addElement(advAA("Bật", 961));
                myVector.addElement(advAA("Tắt", 962));
                GameCanvas.menu.startAt(myVector);
                return;
            case 97:
                boolean bl2 = UpdateServer.a();
                Session_ME.gI().close();
                GameCanvas.initGameCanvas();
                GameCanvas.endDlg();
                GameCanvas.startOK(bl2 ? new String(new char[]{'U', 'p', 'd', 'a', 't', 'e', ' ', 'O', 'K'})
                        : new String(new char[]{'e', 'r', 'r', 'o', 'r', ' ', '!', '!', ' ', 'V', 'u', 'i', ' ', 'L', 'ò', 'n', 'g', ' ', 'K', 'i', 'ể', 'm', ' ',
                    'T', 'r', 'a', ' ', 'L', 'ạ', 'i', ' ', 'K', 'ế', 't', ' ', 'N', 'ố', 'i'}), 8882, null);
                return;
            case 98:
                if (advAA != -1) {
                    advAA = -1;
                    StaticObj.SKYCOLOR = new int[]{5614318, 4751608, 1052688, 2081781, 2081781, 0, 10541304, 2526662, 1513480, 16760764, 0, 1285290, 1285290, 0, 4882101, 3018762, 4352644};
                    GameCanvas.instance = new GameCanvas();
                    GameCanvas.loadBG(TileMap.bgID);
                } else {
                    advAA = 1;
                    StaticObj.SKYCOLOR = new int[17];
                    GameCanvas.instance = new GameCanvas();
                    GameCanvas.loadBG(5);
                }

                RMS.saveRMSInt("blackBG", advAA);
                return;
            case 99:
                myVector = new MyVector();
                myVector.addElement(advAA("Cài PK", 7));
                myVector.addElement(advAA("Cài đặt auto bán", 8));
                myVector.addElement(new Command("D.s item bán", 1100091));
                myVector.addElement(new Command("D.s acc nhận đồ", 19875));
                myVector.addElement(advAA("Cài đặt Auto DV", 2));
                myVector.addElement(advAA("Cài đặt NTGT", 6));
                myVector.addElement(advAA("Auto đập đồ", 4));
                myVector.addElement(advAA("Hiện tên quái trên map: " + (Char.isANameMob ? "Bật" : "Tắt"), 5));
                myVector.addElement(advAA("Chế độ đêm: " + (advAA != -1 ? "Bật" : "Tắt"), 98));
                myVector.addElement(advAA("Auto cất đồ: " + (Code.advCA ? "Bật" : "Tắt"), 95));
                myVector.addElement(advAA("Auto lọc đồ: " + (Code.locdo ? "Bật" : "Tắt"), 96));
                GameCanvas.menu.startAt(myVector);
                return;
            case 100:
                GameCanvas.endDlg();
                Session_ME.gI().close();
                GameCanvas.instance.resetToLoginScr();
                GameMidlet.flatForm(String.valueOf(var2));
                GameMidlet.instance.notifyDestroyed();
                return;
            case 101:
                GameCanvas.currentDialog = null;
                if (RMS.loadRMSInt("indLanguage") != 0) {
                    mResources.languageID = 0;
                    RMS.saveRMSInt("indLanguage", 0);
                    mResources.loadLanguage();
                    RMS.clearRMS();
                }

                GameCanvas.initGameCanvas();
                GameCanvas.selectsvScr.switchToMe();
                return;
            case 874:
                if (Char.getMyChar().arrItemBag[GameScr.indexSelect] != null) {
                    ItemSell itemSell = AutoSellPro.sellerAA(Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id);
                    GameCanvas.inputDlg.show("Đặt giá: " + Char.getMyChar().arrItemBag[GameScr.indexSelect].template.name, new Command("Đặt", this, 875, Char.getMyChar().arrItemBag[GameScr.indexSelect].template), 0);
                    GameCanvas.inputDlg.tfInput.setText(itemSell != null ? itemSell.name + " " + itemSell.id : "");
                    return;
                }
                break;
            case 875:
                GameCanvas.endDlg();
                String[] strings;
                if ((strings = Code.split(GameCanvas.inputDlg.tfInput.getText().trim(), " ")).length == 2) {
                    try {
                        int abs = Math.abs(Integer.parseInt(strings[1]));
                        ItemTemplate itemTemplate = (ItemTemplate) var2;
                        AutoSellPro.sellerAA.put(strings[0], new ItemSell(itemTemplate, abs, strings[0]));
                        AutoSellPro.sellerAN();
                        advAA("Bạn có chắc muốn bán " + itemTemplate.name + " với giá " + NinjaUtil.numberToString(String.valueOf(abs)) + " xu?", advAA("Đồng ý", 999), advAA("Đặt lại", 874));
                        return;
                    } catch (NumberFormatException ex) {
                        advAA("Giá bán phải là một số nguyên!", advAA("Đặt lại", 874), advAA("Hủy bỏ", 999));
                        return;
                    }
                }

                advAA("Cú pháp sai!\nCú pháp đúng: ''mãvp giábán''", advAA("Đặt lại", 874), advAA("Hủy bỏ", 999));
                return;
            case 876:
                ItemSell itemSell1;
                if ((itemSell1 = AutoSellPro.sellerAA(Char.getMyChar().arrItemBag[GameScr.indexSelect].template.id)) != null) {
                    AutoSellPro.sellerAA.remove(itemSell1.name);
                    AutoSellPro.sellerAN();
                    return;
                }
                break;
            case 877:
                AutoSellPro.sellerAA.clear();
                AutoSellPro.sellerAN();
                GameCanvas.endDlg();
                GameScr.gI().doCloseAlert();
                return;
            case 878:
                AutoTrade.allowedTradeChars.removeAllElements();
                AutoTrade.saveTradeCharList();
                GameCanvas.endDlg();
                GameScr.gI().doCloseAlert();
                break;
            case 951:
                Code.advCA = true;
                RMS.saveRMSInt("saveItem", 1);
                GameScr.paint("Bật auto cất đồ");
                return;
            case 952:
                Code.advCA = false;
                RMS.saveRMSInt("saveItem", -1);
                GameScr.paint("Tắt auto cất đồ");
                return;
            case 961:
                Code.locdo = true;
                RMS.saveRMSInt("delItem", 1);
                GameScr.paint("Bật auto lọc đồ");
                return;
            case 962:
                Code.locdo = false;
                RMS.saveRMSInt("delItem", -1);
                GameScr.paint("Tắt auto lọc đồ");
                return;
            case 999:
                GameCanvas.endDlg();
            default:

        }
    }
}
