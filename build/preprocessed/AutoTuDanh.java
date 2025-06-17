
public final class AutoTuDanh extends Auto {

    public final void update() {
        super.update();
        super.mapID = TileMap.mapID;
        super.zoneID = TileMap.zoneID;
        super.cx = Char.getMyChar().cx;
        super.cy = Char.getMyChar().cy;
    }

    public final void auto() {
        LangCo();
        if (Auto.isMyCharInactive()) {
            if (Char.isAReMap) {
                Auto.advAA(true);
                return;
            }
        }
        ressetcPk();
        if (!Auto.advAN && Char.getMyChar().isHuman) {
            this.advAS();
            return;
        }

        if (super.mapID == TileMap.mapID && (super.advAG || super.zoneID == TileMap.zoneID)) {
            this.advAC(-1);
            this.advAB(-1, -1);
            return;
        }

        if (Char.isAReMap) {
            this.remap(super.mapID, super.zoneID, super.cx, super.cy);
        }

    }

    protected final Mob advAA(Char var1, int var2, int var3, Char var4, boolean var5) {
        if (Code.isADanhCVT && Code.cxViTri.size() > 0) {
            this.advAA(var3, var5);
            return Auto.advAA(var1.cx, var1.cy);
        } else {
            return Auto.advAA(var1.cx, var1.cy);
        }
    }

    public final String toString() {
        return "Tự đánh";
    }
}
