
public final class AutoTanSat extends Auto {

    public int advAA;

    public final void advAA(int var1, int var2, int var3) {
        super.update();
        super.mapID = var2;
        super.zoneID = var3;
        super.advAG = TileMap.isHang(var2);
        this.advAA = var1;
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
            if (Char.isALuyenDa && Code.advAH() && Char.getBagNum() < 5 && !TileMap.isLangCo(TileMap.mapID)) {
                Auto.advAP();
                return;
            }

            this.advAB(this.advAA, this.advAA(Char.isADanhQuai, Char.isADanhTA, Char.isADanhTL));
            this.advAC(-1);
            return;
        }

        this.remap(super.mapID, super.zoneID, super.cx, super.cy);

    }

    public final String toString() {
        return this.advAA >= 0 && this.advAA < Mob.arrMobTemplate.length ? "Tàn sát " + Mob.arrMobTemplate[this.advAA].name : "Tàn sát";
    }
}
