
public final class Skill {

    public SkillTemplate template;
    public short skillId;
    public int point;
    public int level;
    public int coolDown;
    public long lastTimeUseThisSkill;
    public int dx;
    public int dy;
    public int maxFight;
    public int manaUse;
    public SkillOption[] options;
    public boolean paintCanNotUseSkill = false;

    public final void paint(int var1, int var2, mGraphics var3) {
        SmallImage.drawSmallImage(var3, this.template.iconId, var1, var2, 0, StaticObj.VCENTER_HCENTER);
        long var6;
        if ((var6 = System.currentTimeMillis() - this.lastTimeUseThisSkill) < (long) this.coolDown) {
            var3.setColor(3355443);
            if (this.paintCanNotUseSkill && GameCanvas.gameTick % 6 > 2) {
                var3.setColor(4473924);
            }

            int var8 = (int) (var6 * 18L / (long) this.coolDown);
            var3.fillRect(var1 - 9, var2 - 9 + var8, 18, 18 - var8);
        } else {
            this.paintCanNotUseSkill = false;
        }
    }

    public final boolean isCooldown() {
        return System.currentTimeMillis() - this.lastTimeUseThisSkill < (long) this.coolDown;
    }

    public final int advAB() {
        return Code.isAngang ? Code.ngangValue : this.dx;
    }

    public final int advAC() {
        return Code.isAcao ? Code.caoValue : this.dy;
    }

    public final int advAD() {
        return Code.isAlan ? Code.lanValue : this.maxFight;
    }
}
