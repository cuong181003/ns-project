// Decompiled with: Procyon 0.6.0
// Class Version: 6

public final class AutoLuyenNgoc extends Auto {

    public static boolean AA;
    public static Item item;
    public static boolean AC;

    public final void auto() {
        try {
            if (AutoLuyenNgoc.item != null && !AutoLuyenNgoc.AA) {
                if (TileMap.mapID != 22) {
                    
                    GameScr.paint("Di chuyển đếm map Làng Tone.");
                    TileMap.gomap(22);
                    Thread.sleep(3000L);
                } else {
                    if (!AutoLuyenNgoc.AC) {
                        GameScr.gI().resetButton();
                        GameScr.pickNPC(6, 4, 0);
                    }
                    Thread.sleep(1000L);
                    if (GameCanvas.currentDialog != null) {
                        GameCanvas.currentDialog = null;
                    }
                    GameScr.itemSplit = AutoLuyenNgoc.item;
                    Char.getMyChar().arrItemBag[AutoLuyenNgoc.item.indexUI] = null;
                    int n = 0;
                    for (int i = 0; i < GameScr.arrItemSplit.length; ++i) {
                        for (int j = n; j < Char.getMyChar().arrItemBag.length; ++j) {
                            final Item item;
                            if ((item = Char.getMyChar().arrItemBag[j]) != null && Code.AF(item) && item.upgrade == 1 && item.indexUI != AutoLuyenNgoc.item.indexUI) {
                                GameScr.arrItemSplit[i] = item;
                                Char.getMyChar().arrItemBag[j] = null;
                                n = j + 1;
                                break;
                            }
                        }
                        Thread.sleep(50L);
                    }
                    Thread.sleep(1000L);
                    if (n == 0) {
                        AutoLuyenNgoc.AA = true;
                        Thread.sleep(1000L);
                    } else {
                        Service.gI().ngockham((byte) 1, null, GameScr.itemSplit, GameScr.arrItemSplit);
                    }
                    AutoLuyenNgoc.AC = true;
                }
            } else {
                Code.endAuto();
                GameScr.gI().resetButton();
                if (AutoLuyenNgoc.item != null) {
                    GameScr.paint("Hoàn thành quá trình tự động luyện ngọc.");
                    return;
                }
                GameScr.paint("Đã gặp lỗi, vui lòng thao tác lại.");
            }
        } catch (final Exception ex) {
        }
    }

    public final String toString() {
        if (AutoLuyenNgoc.item == null) {
            return "Auto luyện ngọc đang gặp lỗi, hãy thao tác lại";
        }
        return new StringBuffer("Auto luyện ").append(AutoLuyenNgoc.item.template.name).append(" cấp ").append(AutoLuyenNgoc.item.upgrade).append(" - Vị trí: ").append(AutoLuyenNgoc.item.indexUI).toString();
    }

    static {
        AutoLuyenNgoc.AA = false;
        AutoLuyenNgoc.item = null;
        AutoLuyenNgoc.AC = false;
    }
}
