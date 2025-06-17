
import javax.microedition.lcdui.Image;

public final class Mob extends MainObject {

    public static MobTemplate[] arrMobTemplate;
    public int hp;
    public int maxHp;
    public int x;
    public int y;
    private int frame;
    public int dir = 1;
    private int dirV = 1;
    public int status;
    private int p1;
    private int p2;
    private int p3;
    public int xFirst;
    public int yFirst;
    public int w;
    public int h;
    private int timeStatus;
    public short mobId;
    public boolean isDisable;
    public boolean isDontMove;
    public boolean isFire;
    public boolean isIce;
    public boolean isWind;
    private MyVector vMobMove = new MyVector();
    public int templateId;
    private Char cFocus;
    private BuNhin bFocus;
    public int dame;
    public int dameMp;
    public int sys;
    private int typeAtt;
    public short levelBoss;
    public short level;
    public boolean isBoss;
    private long timeStartDie = 0L;
    private int frameIndex = 0;
    public static Char interestChar;
    public static MyVector vEggMonter = new MyVector();
    private static EggMonters egg;
    private static long timewait;
    private boolean removeWhenDie;
    public boolean isBusyAttackSomeOne = true;
    private long timeCurrent;
    public Char owner;
    private boolean isright;
    private boolean isleft;
    public Char injureBy;
    public boolean injureThenDie;
    private Mob mobToAttack;
    private Char charToAttack;
    private short idSkill_atk;
    private byte typeAtk;
    private byte typeTool;
    private byte indexlongden;
    private static byte[][] idframe = new byte[][]{{3, 4, 5, 6}, new byte[1], {2, 2, 2, 2, 3, 3, 3, 3}, {0, 1}, {0, 1}, {3, 4, 5}, new byte[1], {3, 3, 4, 4, 5, 5}, new byte[1], {3, 4, 5}, {0, 1, 2, 3, 4}, {3, 4, 5}, {4, 5, 6}, new byte[1], {0, 1}, {0, 1}, {3, 3, 4, 4, 5, 5}, {0, 1, 2}, {0, 1, 2}, {5, 6, 7, 8}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {3, 4, 5, 6}, {0, 1, 2}, {0, 1, 2, 3}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}, new byte[1], new byte[1], new byte[1], new byte[1], {0, 1, 2}, new byte[1], new byte[1], {0, 0, 1, 1, 2, 2}, {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 1}, {0, 1}};
    private static byte[][] idframeAppear = new byte[][]{{0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, new byte[1]};
    private static byte[][] idframeDisappear = new byte[][]{{5, 4, 3, 2, 1}, new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], {5, 4, 3, 2, 1}, {5, 4, 3, 2, 1}, {5, 4, 3, 2, 1}, new byte[0], {5, 4, 3, 2, 1}, new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], new byte[0], {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, new byte[1]};
    private int tt;

    public Mob(short var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, int var7, int var8, int var9, int var10, int var11, short var12, short var13, byte var14, byte var15, boolean var16, boolean var17) {
        byte[] var10000 = new byte[]{-1, 1};
        this.injureThenDie = false;
        this.indexlongden = -1;
        this.tt = 0;
        this.isDisable = var2;
        this.isDontMove = var3;
        this.isFire = var4;
        this.isIce = var5;
        this.isWind = var6;
        this.sys = var8;
        this.mobId = var1;
        this.templateId = var7;
        this.hp = var9;
        this.level = (short) var10;
        this.xFirst = this.x = var12;
        this.yFirst = this.y = var13;
        if (var7 != 168 && var7 != 179 && var7 != 175 && var7 != 177 && var7 != 202) {
            this.status = var14;
        } else {
            this.status = 8;
        }

        this.maxHp = var11;
        this.levelBoss = var15;
        this.isBoss = var16;
        if (var7 == 202) {
            egg = new EggMonters(this.xFirst, this.yFirst - 100);
            vEggMonter.addElement(egg);
            EggMonters.ownerEgg = this;
        }

        if (arrMobTemplate[var7].imgs == null) {
            arrMobTemplate[var7].imgs = new Image[0];
            Service.gI().requestModTemplate(var7);
        }

        timewait = (long) Res.random(2000, 3500);
        this.removeWhenDie = var17;
    }

    public final void update() {
        boolean var10000;
        if (arrMobTemplate[this.templateId] == null) {
            var10000 = false;
        } else if (arrMobTemplate[this.templateId].imgs == null) {
            var10000 = false;
        } else {
            label983:
            {
                if (!this.isBoss) {
                    if (this.frame >= arrMobTemplate[this.templateId].imgs.length) {
                        var10000 = false;
                        break label983;
                    }

                    if (arrMobTemplate[this.templateId].imgs[this.frame] == null) {
                        var10000 = false;
                        break label983;
                    }
                }

                var10000 = this.status != 0;
            }
        }

        if (var10000) {
            if (this.cFocus == null && (this.templateId == 168 || this.templateId == 179 || this.templateId == 175)) {
                this.status = 8;
            }

            if (this.vMobMove != null || arrMobTemplate[this.templateId].rangeMove == 0) {
                if (this.status != 3 && this.isBusyAttackSomeOne) {
                    if (this.cFocus != null) {
                        this.cFocus.doInjure(this.dame, this.dameMp, this.isBoss, this.getTemplate().mobTemplateId);
                        this.cFocus = null;
                    }

                    this.isBusyAttackSomeOne = false;
                }

                if (this.hp <= 0 && this.mobId != -1) {
                    this.status = 1;
                }

                int var10001;
                Mob var5;
                label919:
                switch (this.status) {
                    case 1:
                        this.isDisable = false;
                        this.isDontMove = false;
                        this.isFire = false;
                        this.isIce = false;
                        this.isWind = false;
                        if (this.templateId != 98 && this.templateId != 99) {
                            ++this.p1;
                            this.y += this.p1;
                            if (interestChar != null) {
                                if (interestChar.myskill != null) {
                                    if (interestChar.myskill.template.id > 72) {
                                        if (GameCanvas.gameTick % 9 == 0) {
                                            if (this.p2 > 1) {
                                                this.p2 += 5;
                                            } else if (this.p2 < -1) {
                                                this.p2 -= 5;
                                            }
                                        }
                                    } else if (GameCanvas.gameTick % 2 == 0) {
                                        if (this.p2 > 1) {
                                            --this.p2;
                                        } else if (this.p2 < -1) {
                                            ++this.p2;
                                        }
                                    }
                                }
                            } else if (Char.getMyChar() != null && Char.getMyChar().myskill != null) {
                                if (Char.getMyChar().myskill.template.id > 72) {
                                    if (GameCanvas.gameTick % 9 == 0) {
                                        if (this.p2 > 1) {
                                            this.p2 += 5;
                                        } else if (this.p2 < -1) {
                                            this.p2 -= 5;
                                        }
                                    }
                                } else if (GameCanvas.gameTick % 2 == 0) {
                                    if (this.p2 > 1) {
                                        --this.p2;
                                    } else if (this.p2 < -1) {
                                        ++this.p2;
                                    }
                                }
                            }

                            this.x += this.p2;
                            if (this.templateId != 209 && this.templateId != 210) {
                                if (this.templateId != 168 && this.templateId != 176 && this.templateId != 177 && this.templateId != 179 && this.templateId != 180 && this.templateId != 191) {
                                    if (this.templateId != 178 && this.templateId != 181 && this.templateId != 183 && this.templateId != 185 && this.templateId != 188 && this.templateId != 192 && this.templateId != 194) {
                                        if (this.templateId != 173 && this.templateId != 184) {
                                            if (this.templateId == 175) {
                                                var5 = this;
                                                var10001 = 8;
                                            } else if (this.templateId != 170 && this.templateId != 195 && this.templateId != 196 && this.templateId != 197 && this.templateId != 186 && this.templateId != 189 && this.templateId != 190) {
                                                if (this.templateId == 187) {
                                                    var5 = this;
                                                    var10001 = 9;
                                                } else if (this.templateId == 193) {
                                                    var5 = this;
                                                    var10001 = 5;
                                                } else if (this.templateId == 174) {
                                                    var5 = this;
                                                    var10001 = 10;
                                                } else {
                                                    var5 = this;
                                                    var10001 = this.isBoss ? 10 : 2;
                                                }
                                            } else {
                                                var5 = this;
                                                var10001 = 3;
                                            }
                                        } else {
                                            var5 = this;
                                            var10001 = 6;
                                        }
                                    } else {
                                        var5 = this;
                                        var10001 = 4;
                                    }
                                } else {
                                    var5 = this;
                                    var10001 = 7;
                                }
                            } else {
                                var5 = this;
                                var10001 = 6;
                            }

                            var5.frame = var10001;
                            if (this.y > GameScr.gssye * 24 || this.x < GameScr.gssx * 24 || this.x > GameScr.gssxe * 24) {
                                this.p1 = 0;
                                this.p2 = 0;
                                this.x = this.y = 0;
                                this.hp = this.getTemplate().hp;
                                this.status = 0;
                                if (this.templateId < 168) {
                                    this.frame = 0;
                                } else {
                                    this.frame = this.setFrameAppear(GameCanvas.gameTick);
                                }

                                this.timeStatus = 0;
                                return;
                            }

                            if (this.p3 == 0 && (TileMap.tileTypeAtPixel(this.x, this.y) & 2) == 2) {
                                this.p1 = this.p1 > 4 ? -4 : -this.p1;
                                this.p3 = 16;
                            }

                            if (this.p3 > 0) {
                                --this.p3;
                            }
                        } else if (System.currentTimeMillis() - this.timeStartDie > 1200L) {
                            this.status = 0;
                        }
                        break;
                    case 2:
                        this.timeStatus = 0;
                        if (this.isBoss && this.templateId > 210) {
                            if (arrMobTemplate[this.templateId].frameBossMove != null) {
                                ++this.p1;
                                if (GameCanvas.gameTick % 2 == 0) {
                                    ++this.frameIndex;
                                }

                                if (this.frameIndex >= arrMobTemplate[this.templateId].frameBossMove.length) {
                                    this.frameIndex = 0;
                                }

                                this.frame = arrMobTemplate[this.templateId].frameBossMove[this.frameIndex];
                                if (this.p1 > 10 + this.mobId % 10 && System.currentTimeMillis() - (this.timeCurrent + timewait) >= 0L) {
                                    this.status = 5;
                                    this.p1 = 0;
                                }
                            }
                        } else {
                            switch (arrMobTemplate[this.templateId].type) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                    if (this.templateId != 209 && this.templateId != 210) {
                                        if (this.templateId != 173 && this.templateId != 175 && this.templateId != 176 && this.templateId != 177 && this.templateId != 179 && this.templateId != 180 && this.templateId != 181 && this.templateId != 183 && this.templateId != 184 && this.templateId != 185) {
                                            if (this.templateId != 168 && this.templateId != 179) {
                                                if (this.templateId == 174) {
                                                    this.frame = 4;
                                                } else {
                                                    int var7 = this.templateId;
                                                    boolean var6 = true;
                                                    this.frame = 0;
                                                }
                                            } else {
                                                this.frame = 6;
                                            }
                                        } else {
                                            this.frame = 1;
                                        }
                                    } else {
                                        this.frame = 1;
                                    }

                                    ++this.p1;
                                    if (this.p1 > 10 + this.mobId % 10 && System.currentTimeMillis() - (this.timeCurrent + timewait) >= 0L) {
                                        this.status = 5;
                                    }

                                    if (this.isBoss) {
                                        this.frame = GameCanvas.gameTick % 101 > 1 ? 0 : 1;
                                    }
                                    break label919;
                                case 4:
                                case 5:
                                    if (!this.isBoss) {
                                        if (this.templateId < 168) {
                                            this.frame = GameCanvas.gameTick % 4 > 1 ? 0 : 1;
                                        } else {
                                            this.frame = this.setFrameMove(GameCanvas.gameTick);
                                        }
                                    } else {
                                        this.frame = arrMobTemplate[this.templateId].frameBossMove[this.frameIndex];
                                    }

                                    ++this.p1;
                                    if (this.p1 > this.mobId % 3) {
                                        this.status = 5;
                                    }
                            }
                        }
                        break;
                    case 3:
                        if (this.mobToAttack == null && this.charToAttack == null) {
                            if (this.idSkill_atk < 0) {
                                int var2;
                                int var3;
                                if (this.isBoss && this.templateId > 210) {
                                    if (arrMobTemplate[this.templateId].frameBossAttack != null) {
                                        if (this.p1 == 0) {
                                            var2 = 0;
                                            var3 = 0;
                                            if (this.typeAtt == 0) {
                                                var2 = this.cFocus.cx;
                                                var3 = this.cFocus.cy;
                                            } else if (this.typeAtt == 1) {
                                                var2 = this.bFocus.x;
                                                var3 = this.bFocus.y;
                                            }

                                            if (GameCanvas.gameTick % 2 == 0) {
                                                ++this.frameIndex;
                                            }

                                            if (Res.abs(var2 - this.x) >= 48 && Res.abs(var3 - this.y) >= 10) {
                                                if (this.frameIndex >= arrMobTemplate[this.templateId].frameBossAttack[1].length) {
                                                    this.p1 = 1;
                                                    this.frameIndex = 0;
                                                }

                                                this.frame = arrMobTemplate[this.templateId].frameBossAttack[1][this.frameIndex];
                                            } else {
                                                if (this.frameIndex >= arrMobTemplate[this.templateId].frameBossAttack[0].length) {
                                                    this.p1 = 1;
                                                    this.frameIndex = 0;
                                                }

                                                this.frame = arrMobTemplate[this.templateId].frameBossAttack[0][this.frameIndex];
                                            }
                                        } else if (this.p1 == 1) {
                                            if (arrMobTemplate[this.templateId].type != 0 && !this.isDontMove && !this.isIce && !this.isWind) {
                                                this.x += (this.xFirst - this.x) / 4;
                                                this.y += (this.yFirst - this.y) / 4;
                                            }

                                            if (Res.abs(this.xFirst - this.x) < 5 && Res.abs(this.yFirst - this.y) < 5) {
                                                this.status = 2;
                                                this.frameIndex = 0;
                                                this.p1 = 0;
                                                this.p2 = 0;
                                            }
                                        }
                                    }
                                } else {
                                    if (this.templateId != 209 && this.templateId != 210) {
                                        if (this.templateId != 176 && this.templateId != 177 && this.templateId != 179) {
                                            if (this.templateId == 175) {
                                                var5 = this;
                                                var10001 = 7;
                                            } else if (this.templateId != 180 && this.templateId != 181 && this.templateId != 183 && this.templateId != 184 && this.templateId != 173 && this.templateId != 188 && this.templateId != 192 && this.templateId != 194 && this.templateId != 202) {
                                                if (this.templateId == 193) {
                                                    var5 = this;
                                                    var10001 = 4;
                                                } else if (this.templateId != 187 && this.templateId != 168 && this.templateId != 175 && this.templateId != 176 && this.templateId != 179 && this.templateId != 174) {
                                                    var5 = this;
                                                    var10001 = GameCanvas.gameTick % 4 > 1 ? (arrMobTemplate[this.templateId].type == 5 ? 3 : 0) : 1;
                                                } else {
                                                    var5 = this;
                                                    var10001 = this.setFrameAtt(GameCanvas.gameTick);
                                                }
                                            } else {
                                                var5 = this;
                                                var10001 = 3;
                                            }
                                        } else {
                                            var5 = this;
                                            var10001 = 6;
                                        }
                                    } else {
                                        var5 = this;
                                        var10001 = 6;
                                    }

                                    var5.frame = var10001;
                                    if (this.p1 == 0) {
                                        var2 = 0;
                                        var3 = 0;
                                        if (this.typeAtt == 0) {
                                            var2 = this.cFocus.cx;
                                            var3 = this.cFocus.cy;
                                        } else if (this.typeAtt == 1) {
                                            var2 = this.bFocus.x;
                                            var3 = this.bFocus.y;
                                        }

                                        if (Res.abs(var2 - this.x) < 24 || Res.abs(var2 - this.x) < 5 || arrMobTemplate[this.templateId].type == 0) {
                                            if (this.templateId != 168 && this.templateId != 176 && this.templateId != 177 && this.templateId != 179) {
                                                if (this.templateId == 175) {
                                                    var5 = this;
                                                    var10001 = 7;
                                                } else {
                                                    label1062:
                                                    {
                                                        if (this.templateId != 180 && this.templateId != 181 && this.templateId != 183 && this.templateId != 184 && this.templateId != 173 && this.templateId != 202) {
                                                            if (this.templateId == 187 || this.templateId == 168 || this.templateId == 179 || this.templateId == 174) {
                                                                var5 = this;
                                                                var10001 = this.setFrameAtt(GameCanvas.gameTick);
                                                                break label1062;
                                                            }

                                                            var5 = this;
                                                            if (arrMobTemplate[this.templateId].imgs.length == 3) {
                                                                var10001 = 0;
                                                                break label1062;
                                                            }
                                                        } else {
                                                            var5 = this;
                                                        }

                                                        var10001 = 3;
                                                    }
                                                }
                                            } else {
                                                var5 = this;
                                                var10001 = 6;
                                            }

                                            var5.frame = var10001;
                                        }

                                        if (this.isBoss && (Res.abs(var2 - this.x) < 48 || Res.abs(var2 - this.x) < 10 || arrMobTemplate[this.templateId].type == 0)) {
                                            this.frame = arrMobTemplate[this.templateId].imgs.length == 3 ? 0 : 3;
                                        }

                                        if (this.isBoss) {
                                            ++this.frameIndex;
                                            if (Res.abs(var2 - this.x) >= 48 && Res.abs(var3 - this.y) >= 10) {
                                                if (this.frameIndex >= arrMobTemplate[this.templateId].frameBossAttack[1].length) {
                                                    this.frameIndex = 0;
                                                }

                                                this.frame = arrMobTemplate[this.templateId].frameBossAttack[1][this.frameIndex];
                                            } else {
                                                if (this.frameIndex >= arrMobTemplate[this.templateId].frameBossAttack[0].length) {
                                                    this.frameIndex = 0;
                                                }

                                                this.frame = arrMobTemplate[this.templateId].frameBossAttack[0][this.frameIndex];
                                            }
                                        }

                                        if (this.frame == 3 || this.frame == 6 || this.frame == 7) {
                                            this.p1 = 1;
                                        }

                                        if (arrMobTemplate[this.templateId].type != 0 && !this.isDontMove && this.isIce && this.isWind) {
                                            this.x += (var2 - this.x) / 3;
                                        }

                                        if (this.x > this.xFirst + arrMobTemplate[this.templateId].rangeMove) {
                                            this.p1 = 1;
                                        }

                                        if (this.x < this.xFirst - arrMobTemplate[this.templateId].rangeMove) {
                                            this.p1 = 1;
                                        }

                                        if ((arrMobTemplate[this.templateId].type == 4 || arrMobTemplate[this.templateId].type == 5) && !this.isDontMove) {
                                            this.y += (var3 - this.y) / 20;
                                        }

                                        ++this.p2;
                                        if (this.isBoss && Res.abs(var2 - this.x) < 48 && Res.abs(var3 - this.y) < 15 || Res.abs(var2 - this.x) < 12 && Res.abs(var3 - this.y) < 12 || this.p2 > 12 || this.p1 == 1 || arrMobTemplate != null && arrMobTemplate[this.templateId].frameBossAttack != null && this.frameIndex == arrMobTemplate[this.templateId].frameBossAttack[0].length - 2 && (this.getTemplate().mobTemplateId == 166 || this.getTemplate().mobTemplateId == 167)) {
                                            label1057:
                                            {
                                                this.p1 = 1;
                                                if (this.typeAtt == 0) {
                                                    if (this.isBoss && Res.abs(var2 - this.x) < 48 && Res.abs(var3 - this.y) < 15) {
                                                        this.cFocus.doInjure(this.dame, this.dameMp, this.isBoss, this.getTemplate().mobTemplateId);
                                                        this.isBusyAttackSomeOne = false;
                                                        if (this.getTemplate().mobTemplateId == 210) {
                                                            if (this.cFocus.cx > this.x) {
                                                                ServerEffect.addServerEffect(142, this.x, this.y, 1);
                                                            } else {
                                                                ServerEffect.addServerEffect(142, this.x, this.y, 1, (byte) -1);
                                                            }
                                                            break label1057;
                                                        }

                                                        if (this.getTemplate().mobTemplateId == 209) {
                                                            if (this.cFocus.cx > this.x) {
                                                                ServerEffect.addServerEffect(108, this.x, this.y, 1);
                                                            } else {
                                                                ServerEffect.addServerEffect(108, this.x, this.y, 1, (byte) -1);
                                                            }
                                                            break label1057;
                                                        }

                                                        if (this.getTemplate().mobTemplateId == 114) {
                                                            ServerEffect.addServerEffect(79, this.cFocus, 3);
                                                            break label1057;
                                                        }

                                                        if (this.getTemplate().mobTemplateId == 115) {
                                                            if (this.cFocus == Char.getMyChar()) {
                                                                GameScr.shaking = 1;
                                                            }

                                                            GameScr.count = 0;
                                                            ServerEffect.addServerEffect(81, this.cFocus.cx, this.yFirst + TileMap.size, 2);
                                                            ServerEffect.addServerEffect(81, this.cFocus.cx - 40, this.yFirst + TileMap.size, 2);
                                                            ServerEffect.addServerEffect(81, this.cFocus.cx + 40, this.yFirst + TileMap.size, 2);
                                                            break label1057;
                                                        }

                                                        if (this.getTemplate().mobTemplateId == 116) {
                                                            if (this.cFocus == Char.getMyChar()) {
                                                                GameScr.shaking = 1;
                                                                GameScr.count = 0;
                                                            }

                                                            if (this.cFocus.cx > this.x) {
                                                                ServerEffect.addServerEffect(86, this.x, this.y - this.h / 2 + 5, 1);
                                                            } else {
                                                                ServerEffect.addServerEffect(88, this.x, this.y - this.h / 2 + 5, 1);
                                                            }

                                                            ServerEffect.addServerEffect(87, this.cFocus.cx, this.cFocus.cy - this.cFocus.ch / 2, 2);
                                                            ServerEffect.addServerEffect(87, this.cFocus.cx - 40, this.cFocus.cy - this.cFocus.ch / 2, 2);
                                                            ServerEffect.addServerEffect(87, this.cFocus.cx + 40, this.cFocus.cy - this.cFocus.ch / 2, 2);
                                                            break label1057;
                                                        }

                                                        if (this.getTemplate().mobTemplateId == 138) {
                                                            if (this.cFocus.cx > this.x) {
                                                                ServerEffect.addServerEffect(89, this.x + this.w / 2, this.y - this.h / 2 - 5, 1);
                                                            } else {
                                                                ServerEffect.addServerEffect(89, this.x - this.w / 2, this.y - this.h / 2 - 5, 1, (byte) -1);
                                                            }

                                                            ServerEffect.addServerEffect(90, this.cFocus, 2);
                                                            break label1057;
                                                        }

                                                        if (this.getTemplate().mobTemplateId == 139) {
                                                            if (this.cFocus == Char.getMyChar()) {
                                                                GameScr.shaking = 1;
                                                                GameScr.count = 0;
                                                            }

                                                            ServerEffect.addServerEffect(91, this.cFocus, 2);
                                                            break label1057;
                                                        }

                                                        if (this.getTemplate().mobTemplateId != 140 && this.getTemplate().mobTemplateId != 161) {
                                                            if (this.getTemplate().mobTemplateId != 141 && this.getTemplate().mobTemplateId != 162) {
                                                                if (this.getTemplate().mobTemplateId != 144 && this.getTemplate().mobTemplateId != 163) {
                                                                    if (this.getTemplate().mobTemplateId == 160) {
                                                                        if (this.cFocus.cx > this.x) {
                                                                            ServerEffect.addServerEffect(123, this.x + this.w / 2, this.y - 5, 1);
                                                                        } else {
                                                                            ServerEffect.addServerEffect(123, this.x - this.w / 2, this.y - 5, 1, (byte) -1);
                                                                        }

                                                                        ServerEffect.addServerEffect(91, this.cFocus, 1);
                                                                        break label1057;
                                                                    }

                                                                    if (this.getTemplate().mobTemplateId != 164 && this.getTemplate().mobTemplateId != 165) {
                                                                        if (this.getTemplate().mobTemplateId == 167) {
                                                                            if (this.cFocus.cx > this.x) {
                                                                                ServerEffect.addServerEffect(125, this.x + this.w / 2, this.y, 1);
                                                                            } else {
                                                                                ServerEffect.addServerEffect(125, this.x - this.w / 2, this.y, 1, (byte) -1);
                                                                            }
                                                                        } else if (this.getTemplate().mobTemplateId == 166) {
                                                                            if (this.cFocus.cx > this.x) {
                                                                                ServerEffect.addServerEffect(108, this.x + this.w / 2, this.y, 1);
                                                                            } else {
                                                                                ServerEffect.addServerEffect(108, this.x - this.w / 2, this.y, 1, (byte) -1);
                                                                            }
                                                                        } else if (this.getTemplate().mobTemplateId == 198) {
                                                                            if (this.cFocus.cx > this.x) {
                                                                                ServerEffect.addServerEffect(143, this.x + this.w / 2, this.y, 1);
                                                                            } else {
                                                                                ServerEffect.addServerEffect(143, this.x - this.w / 2, this.y, 1, (byte) -1);
                                                                            }
                                                                        } else if (this.getTemplate().mobTemplateId == 199) {
                                                                            if (this.cFocus.cx > this.x) {
                                                                                ServerEffect.addServerEffect(144, this.x + this.w / 2, this.y, 1);
                                                                            } else {
                                                                                ServerEffect.addServerEffect(144, this.x - this.w / 2, this.y, 1, (byte) -1);
                                                                            }
                                                                        } else if (this.getTemplate().mobTemplateId == 200) {
                                                                            if (this.cFocus.cx > this.x) {
                                                                                ServerEffect.addServerEffect(142, this.x + this.w / 2, this.y, 1);
                                                                            } else {
                                                                                ServerEffect.addServerEffect(142, this.x - this.w / 2, this.y, 1, (byte) -1);
                                                                            }
                                                                        } else if (this.getTemplate().mobTemplateId == 201) {
                                                                            if (this.cFocus.cx > this.x) {
                                                                                ServerEffect.addServerEffect(144, this.x + this.w / 2, this.y, 1);
                                                                            } else {
                                                                                ServerEffect.addServerEffect(144, this.x - this.w / 2, this.y, 1, (byte) -1);
                                                                            }
                                                                        } else if (this.getTemplate().mobTemplateId == 203) {
                                                                            if (this.cFocus.cx > this.x) {
                                                                                ServerEffect.addServerEffect(159, this.x + this.w / 2, this.y, 1);
                                                                                ServerEffect.addServerEffect(156, this.cFocus.cx, this.cFocus.cy, 1);
                                                                            } else {
                                                                                ServerEffect.addServerEffect(159, this.x - this.w / 2, this.y, 1, (byte) -1);
                                                                                ServerEffect.addServerEffect(156, this.cFocus.cx, this.cFocus.cy, -1);
                                                                            }
                                                                        } else if (this.getTemplate().mobTemplateId == 204) {
                                                                            if (this.cFocus.cx > this.x) {
                                                                                ServerEffect.addServerEffect(159, this.x + this.w / 2, this.y, 1);
                                                                                ServerEffect.addServerEffect(173, this.cFocus.cx, this.cFocus.cy, 1);
                                                                            } else {
                                                                                ServerEffect.addServerEffect(159, this.x - this.w / 2, this.y, 1, (byte) -1);
                                                                                ServerEffect.addServerEffect(173, this.cFocus.cx, this.cFocus.cy, -1);
                                                                            }
                                                                        }
                                                                        break label1057;
                                                                    }

                                                                    if (this.cFocus.cx > this.x) {
                                                                        ServerEffect.addServerEffect(125, this.x + this.w / 2, this.y, 1);
                                                                    } else {
                                                                        ServerEffect.addServerEffect(125, this.x - this.w / 2, this.y, 1, (byte) -1);
                                                                    }

                                                                    ServerEffect.addServerEffect(90, this.cFocus, 1);
                                                                    break label1057;
                                                                }

                                                                if (this.cFocus == Char.getMyChar()) {
                                                                    GameScr.shaking = 1;
                                                                    GameScr.count = 0;
                                                                }

                                                                ServerEffect.addServerEffect(112, this.cFocus, 2);
                                                                ServerEffect.addServerEffect(109, this.cFocus.cx - 40, this.cFocus.cy - 40, 1);
                                                                ServerEffect.addServerEffect(109, this.cFocus.cx + 40, this.cFocus.cy - 40, 1);
                                                                ServerEffect.addServerEffect(109, this.cFocus.cx - 20, this.cFocus.cy, 2);
                                                                ServerEffect.addServerEffect(109, this.cFocus.cx + 20, this.cFocus.cy, 2);
                                                                break label1057;
                                                            }

                                                            if (this.cFocus.cx > this.x) {
                                                                ServerEffect.addServerEffect(108, this.x + this.w / 2, this.y, 1);
                                                            } else {
                                                                ServerEffect.addServerEffect(108, this.x - this.w / 2, this.y, 1, (byte) -1);
                                                            }

                                                            ServerEffect.addServerEffect(122, this.x, this.y, 1, (byte) this.dir);
                                                            ServerEffect.addServerEffect(91, this.cFocus, 1);
                                                            break label1057;
                                                        }

                                                        if (this.cFocus == Char.getMyChar()) {
                                                            GameScr.shaking = 1;
                                                            GameScr.count = 0;
                                                        }

                                                        ServerEffect.addServerEffect(112, this.cFocus, 2);
                                                        ServerEffect.addServerEffect(109, this.cFocus.cx - 40, this.cFocus.cy - 40, 1);
                                                        ServerEffect.addServerEffect(109, this.cFocus.cx + 40, this.cFocus.cy - 40, 1);
                                                        ServerEffect.addServerEffect(109, this.cFocus.cx - 20, this.cFocus.cy, 2);
                                                        ServerEffect.addServerEffect(109, this.cFocus.cx + 20, this.cFocus.cy, 2);
                                                        break label1057;
                                                    }

                                                    if (Res.abs(var2 - this.x) >= 24 || Res.abs(var3 - this.y) >= 15) {
                                                        if (this.isBoss) {
                                                            if (this.getTemplate().mobTemplateId == 210) {
                                                                if (this.cFocus.cx > this.x) {
                                                                    ServerEffect.addServerEffect(178, this.cFocus.cx, this.cFocus.cy, 1);
                                                                } else {
                                                                    ServerEffect.addServerEffect(178, this.cFocus.cx, this.cFocus.cy, 1, (byte) -1);
                                                                }
                                                            } else if (this.getTemplate().mobTemplateId == 209) {
                                                                if (this.cFocus.cx > this.x) {
                                                                    ServerEffect.addServerEffect(179, this.cFocus.cx, this.cFocus.cy, 1);
                                                                } else {
                                                                    ServerEffect.addServerEffect(179, this.cFocus.cx, this.cFocus.cy, 1, (byte) -1);
                                                                }
                                                            } else if (this.getTemplate().mobTemplateId != 114 && this.getTemplate().mobTemplateId != 115) {
                                                                if (this.getTemplate().mobTemplateId == 116) {
                                                                    ServerEffect.addServerEffect(84, this.cFocus, 2);
                                                                    this.isBusyAttackSomeOne = false;
                                                                    this.cFocus.doInjure(this.dame, this.dameMp, this.isBoss, this.getTemplate().mobTemplateId);
                                                                } else if (this.getTemplate().mobTemplateId == 138) {
                                                                    if (this.cFocus == Char.getMyChar()) {
                                                                        GameScr.shaking = 1;
                                                                        GameScr.count = 0;
                                                                    }

                                                                    ServerEffect.addServerEffect(83, this.cFocus, 2);
                                                                    this.isBusyAttackSomeOne = false;
                                                                    this.cFocus.doInjure(this.dame, this.dameMp, this.isBoss, this.getTemplate().mobTemplateId);
                                                                } else if (this.getTemplate().mobTemplateId == 139) {
                                                                    MonsterDart.addMonsterDart(this.x + (this.dir - 1) * 30, this.y - 30, this.isBoss, this.levelBoss, this.getTemplate().mobTemplateId, this.dame, this.dameMp, this.cFocus);
                                                                } else if (this.getTemplate().mobTemplateId != 140 && this.getTemplate().mobTemplateId != 161) {
                                                                    if (this.getTemplate().mobTemplateId != 141 && this.getTemplate().mobTemplateId != 162) {
                                                                        if (this.getTemplate().mobTemplateId != 144 && this.getTemplate().mobTemplateId != 163) {
                                                                            if (this.getTemplate().mobTemplateId == 160) {
                                                                                ServerEffect.addServerEffect(124, this.cFocus, 2);
                                                                                this.isBusyAttackSomeOne = false;
                                                                                this.cFocus.doInjure(this.dame, this.dameMp, this.isBoss, this.getTemplate().mobTemplateId);
                                                                            } else if (this.getTemplate().mobTemplateId != 164 && this.getTemplate().mobTemplateId != 165) {
                                                                                if (this.getTemplate().mobTemplateId == 167) {
                                                                                    ServerEffect.addServerEffect(112, this.cFocus.cx + 5, this.cFocus.cy, 1);
                                                                                    ServerEffect.addServerEffect(112, this.cFocus.cx - 5, this.cFocus.cy, 1);
                                                                                    ServerEffect.addServerEffect(112, this.cFocus, 1);
                                                                                    this.isBusyAttackSomeOne = false;
                                                                                    this.cFocus.doInjure(this.dame, this.dameMp, this.isBoss, this.getTemplate().mobTemplateId);
                                                                                } else if (this.getTemplate().mobTemplateId == 166) {
                                                                                    ServerEffect.addServerEffect(92, this.cFocus.cx + 5, this.cFocus.cy, 1);
                                                                                    ServerEffect.addServerEffect(92, this.cFocus.cx - 5, this.cFocus.cy, 1);
                                                                                    ServerEffect.addServerEffect(92, this.cFocus, 1);
                                                                                    this.isBusyAttackSomeOne = false;
                                                                                    this.cFocus.doInjure(this.dame, this.dameMp, this.isBoss, this.getTemplate().mobTemplateId);
                                                                                } else if (this.getTemplate().mobTemplateId == 198) {
                                                                                    ServerEffect.addServerEffect(142, this.cFocus.cx + 5, this.cFocus.cy, 1);
                                                                                    ServerEffect.addServerEffect(142, this.cFocus.cx - 5, this.cFocus.cy, 1);
                                                                                    ServerEffect.addServerEffect(142, this.cFocus, 1);
                                                                                    this.isBusyAttackSomeOne = false;
                                                                                    this.cFocus.doInjure(this.dame, this.dameMp, this.isBoss, this.getTemplate().mobTemplateId);
                                                                                } else if (this.getTemplate().mobTemplateId == 199) {
                                                                                    ServerEffect.addServerEffect(143, this.cFocus.cx + 5, this.cFocus.cy, 1);
                                                                                    ServerEffect.addServerEffect(143, this.cFocus.cx - 5, this.cFocus.cy, 1);
                                                                                    ServerEffect.addServerEffect(143, this.cFocus, 1);
                                                                                    this.isBusyAttackSomeOne = false;
                                                                                    this.cFocus.doInjure(this.dame, this.dameMp, this.isBoss, this.getTemplate().mobTemplateId);
                                                                                } else if (this.getTemplate().mobTemplateId == 200) {
                                                                                    ServerEffect.addServerEffect(144, this.cFocus.cx + 5, this.cFocus.cy, 1);
                                                                                    ServerEffect.addServerEffect(144, this.cFocus.cx - 5, this.cFocus.cy, 1);
                                                                                    ServerEffect.addServerEffect(144, this.cFocus, 1);
                                                                                    this.isBusyAttackSomeOne = false;
                                                                                    this.cFocus.doInjure(this.dame, this.dameMp, this.isBoss, this.getTemplate().mobTemplateId);
                                                                                } else if (this.getTemplate().mobTemplateId == 201) {
                                                                                    ServerEffect.addServerEffect(108, this.cFocus.cx + 5, this.cFocus.cy, 1);
                                                                                    ServerEffect.addServerEffect(108, this.cFocus.cx - 5, this.cFocus.cy, 1);
                                                                                    ServerEffect.addServerEffect(108, this.cFocus, 1);
                                                                                    this.isBusyAttackSomeOne = false;
                                                                                    this.cFocus.doInjure(this.dame, this.dameMp, this.isBoss, this.getTemplate().mobTemplateId);
                                                                                } else if (this.getTemplate().mobTemplateId == 203) {
                                                                                    ServerEffect.addServerEffect(149, this.cFocus.cx + 5, this.cFocus.cy, 1);
                                                                                    ServerEffect.addServerEffect(149, this.cFocus.cx - 5, this.cFocus.cy, 1);
                                                                                    ServerEffect.addServerEffect(149, this.cFocus, 1);
                                                                                    ServerEffect.addServerEffect(156, this.cFocus, 1);
                                                                                    this.isBusyAttackSomeOne = false;
                                                                                    this.cFocus.doInjure(this.dame, this.dameMp, this.isBoss, this.getTemplate().mobTemplateId);
                                                                                } else if (this.getTemplate().mobTemplateId == 204) {
                                                                                    ServerEffect.addServerEffect(153, this.cFocus.cx + 5, this.cFocus.cy, 1);
                                                                                    ServerEffect.addServerEffect(153, this.cFocus.cx - 5, this.cFocus.cy, 1);
                                                                                    ServerEffect.addServerEffect(153, this.cFocus, 1);
                                                                                    ServerEffect.addServerEffect(173, this.cFocus, 1);
                                                                                    this.isBusyAttackSomeOne = false;
                                                                                    this.cFocus.doInjure(this.dame, this.dameMp, this.isBoss, this.getTemplate().mobTemplateId);
                                                                                }
                                                                            } else {
                                                                                ServerEffect.addServerEffect(126, this.cFocus, 1);
                                                                                this.isBusyAttackSomeOne = false;
                                                                                this.cFocus.doInjure(this.dame, this.dameMp, this.isBoss, this.getTemplate().mobTemplateId);
                                                                            }
                                                                        } else {
                                                                            MonsterDart.addMonsterDart(this.x + (this.dir - 1) * 15, this.y - 20, this.isBoss, this.levelBoss, this.getTemplate().mobTemplateId, this.dame, this.dameMp, this.cFocus);
                                                                        }
                                                                    } else {
                                                                        if (this.cFocus == Char.getMyChar()) {
                                                                            GameScr.shaking = 1;
                                                                            GameScr.count = 0;
                                                                        }

                                                                        ServerEffect.addServerEffect(121, this.cFocus, 1);
                                                                        this.isBusyAttackSomeOne = false;
                                                                        this.cFocus.doInjure(this.dame, this.dameMp, this.isBoss, this.getTemplate().mobTemplateId);
                                                                    }
                                                                } else {
                                                                    if (this.cFocus == Char.getMyChar()) {
                                                                        GameScr.shaking = 1;
                                                                        GameScr.count = 0;
                                                                    }

                                                                    ServerEffect.addServerEffect(110, this.cFocus, 2);
                                                                    ServerEffect.addServerEffect(104, this.cFocus.cx - 20, this.cFocus.cy, 2);
                                                                    ServerEffect.addServerEffect(104, this.cFocus.cx + 20, this.cFocus.cy, 2);
                                                                    this.isBusyAttackSomeOne = false;
                                                                    this.cFocus.doInjure(this.dame, this.dameMp, this.isBoss, this.getTemplate().mobTemplateId);
                                                                }
                                                            } else {
                                                                MonsterDart.addMonsterDart(this.x + (this.dir - 1) * 15, this.y - 20, this.isBoss, this.levelBoss, this.getTemplate().mobTemplateId, this.dame, this.dameMp, this.cFocus);
                                                            }
                                                        } else {
                                                            MonsterDart.addMonsterDart(this.x - 5, this.y + this.dir * 10, this.isBoss, this.level, this.getTemplate().mobTemplateId, this.dame, this.dameMp, this.cFocus);
                                                        }

                                                        this.isBusyAttackSomeOne = false;
                                                        break label1057;
                                                    }

                                                    this.cFocus.doInjure(this.dame, this.dameMp, this.isBoss, this.getTemplate().mobTemplateId);
                                                } else {
                                                    if (this.typeAtt != 1) {
                                                        break label1057;
                                                    }

                                                    if (Res.abs(var2 - this.x) < 24 && Res.abs(var3 - this.y) < 15) {
                                                        this.bFocus.isInjure = true;
                                                    } else if (this.isBoss) {
                                                        MonsterDart.addMonsterDart(this.x - 5, this.y + this.dir * 10 - 20, this.bFocus);
                                                    } else {
                                                        MonsterDart.addMonsterDart(this.x - 5, this.y + this.dir * 10, this.bFocus);
                                                    }
                                                }

                                                this.isBusyAttackSomeOne = false;
                                            }
                                        }

                                        this.dir = this.x < var2 ? 1 : -1;
                                    } else if (this.p1 == 1) {
                                        if (arrMobTemplate[this.templateId].type != 0 && !this.isDontMove && !this.isIce && !this.isWind) {
                                            this.x += (this.xFirst - this.x) / 4;
                                            this.y += (this.yFirst - this.y) / 4;
                                        }

                                        if (Res.abs(this.xFirst - this.x) < 5 && Res.abs(this.yFirst - this.y) < 5) {
                                            this.status = 2;
                                            this.p1 = 0;
                                            this.p2 = 0;
                                        }
                                    }
                                }
                            } else {
                                this.updateTypeMobAttk();
                            }
                        } else {
                            this.updateAttk_Thunuoi();
                        }
                        break;
                    case 4:
                        this.timeStatus = 0;
                        this.frame = 0;
                        ++this.p1;
                        if (this.p1 > 40 + this.mobId % 5) {
                            this.y -= 2;
                            this.status = 5;
                            this.p1 = 0;
                        }
                        break;
                    case 5:
                        try {
                            if (GameCanvas.gameTick % 4 == 0 && this.isBoss) {
                                ++this.frameIndex;
                                if (this.frameIndex > arrMobTemplate[this.templateId].frameBossMove.length - 1) {
                                    this.frameIndex = 0;
                                }
                            }
                        } catch (Exception var4) {
                        }

                        this.timeStatus = 0;
                        this.updateMobWalk();
                        break;
                    case 6:
                        this.timeStatus = 0;
                        ++this.p1;
                        this.y += this.p1;
                        if (this.y >= this.yFirst) {
                            this.y = this.yFirst;
                            this.p1 = 0;
                            this.status = 5;
                        }
                        break;
                    case 7:
                        this.updateInjure();
                        break;
                    case 8:
                        this.frame = 0;
                        break;
                    case 9:
                        this.frame = this.setFrameDisappear(GameCanvas.gameTick);
                        if (this.frame == 1) {
                            this.status = 8;
                        }
                }

                this.setatk_mob();
                if (this.removeWhenDie && this.hp <= 0) {
                    GameScr.vMob.removeElement(this);
                    if (this.levelBoss > 0) {
                        Auto.advAB(this);
                    }
                }

                this.updateDataEff((byte) 1, this.status);
            }
        }
    }

    public final void setInjure() {
        if (this.hp > 0) {
            this.timeStatus = 4;
            this.status = 7;
        }

    }

    public final void setAttack(Char var1) {
        this.isBusyAttackSomeOne = true;
        this.cFocus = var1;
        this.p1 = 0;
        this.p2 = 0;
        this.status = 3;
        if (this.templateId != 209 && this.templateId != 210) {
            if (this.templateId != 168 && this.templateId != 176 && this.templateId != 177 && this.templateId != 179) {
                if (this.templateId != 169 && this.templateId != 171 && this.templateId != 172 && this.templateId != 182) {
                    if (this.templateId == 175) {
                        this.frameIndex = 7;
                    } else if (this.templateId != 181 && this.templateId != 185 && this.templateId != 188 && this.templateId != 194 && this.templateId != 192) {
                        if (this.templateId != 183 && this.templateId != 170 && this.templateId != 193) {
                            if (this.templateId != 187 && this.templateId != 168 && this.templateId != 175 && this.templateId != 176 && this.templateId != 179 && this.templateId != 174) {
                                this.frameIndex = 0;
                            } else {
                                this.frameIndex = this.setFrameAtt(GameCanvas.gameTick);
                            }
                        } else {
                            this.frameIndex = 4;
                        }
                    } else {
                        this.frameIndex = 3;
                    }
                } else {
                    this.frameIndex = 2;
                }
            } else {
                this.frameIndex = 6;
            }
        } else {
            this.frameIndex = 0;
        }

        this.typeAtt = 0;
    }

    public final void setAttack(BuNhin var1) {
        this.bFocus = var1;
        this.p1 = 0;
        this.p2 = 0;
        this.status = 3;
        this.typeAtt = 1;
    }

    private void updateInjure() {
        if (!Code.bosstape) {
            this.frame = this.isBoss ? (this.getTemplate().mobTemplateId == 204 ? 9 : (this.getTemplate().mobTemplateId == 203 ? 9 : (this.getTemplate().mobTemplateId == 139 ? 4 : (this.getTemplate().mobTemplateId == 160 ? 12 : 10)))) : 2;
            if (this.getTemplate().mobTemplateId != 209 && this.getTemplate().mobTemplateId != 210) {
                if (this.getTemplate().mobTemplateId == 141) {
                    this.frame = 13;
                } else if (this.getTemplate().mobTemplateId != 169 && this.getTemplate().mobTemplateId != 170 && this.getTemplate().mobTemplateId != 171 && this.getTemplate().mobTemplateId != 172 && this.getTemplate().mobTemplateId != 182) {
                    if (this.getTemplate().mobTemplateId != 168 && this.getTemplate().mobTemplateId != 176 && this.getTemplate().mobTemplateId != 177 && this.getTemplate().mobTemplateId != 179 && this.getTemplate().mobTemplateId != 180) {
                        if (this.getTemplate().mobTemplateId != 173 && this.getTemplate().mobTemplateId != 184) {
                            if (this.getTemplate().mobTemplateId != 181 && this.getTemplate().mobTemplateId != 178 && this.getTemplate().mobTemplateId != 185 && this.getTemplate().mobTemplateId != 202) {
                                if (this.getTemplate().mobTemplateId == 174) {
                                    this.frame = 10;
                                } else if (this.getTemplate().mobTemplateId == 183) {
                                    this.frame = 5;
                                } else if (this.getTemplate().mobTemplateId == 175) {
                                    this.frame = 8;
                                }
                            } else {
                                this.frame = 4;
                            }
                        } else {
                            this.frame = 6;
                        }
                    } else {
                        this.frame = 7;
                    }
                } else {
                    this.frame = 3;
                }
            } else {
                this.frame = 3;
            }

            --this.timeStatus;
            if (this.timeStatus > 0) {
                if (arrMobTemplate[this.templateId].type != 0 && this.x > this.xFirst - arrMobTemplate[this.templateId].rangeMove) {
                    arrMobTemplate[this.templateId].getClass();
                }

            } else {
                if ((this.injureBy == null || !this.injureThenDie) && this.hp != 0) {
                    this.status = 5;
                    if (this.injureBy != null) {
                        this.dir = -this.injureBy.cdir;
                        if (Res.abs(this.x - this.injureBy.cx) < 24) {
                            this.status = 2;
                        }
                    }

                    this.p1 = this.p2 = this.p3 = 0;
                    this.timeStatus = 0;
                } else {
                    this.status = 1;
                    this.p2 = this.injureBy.cdir << 3;
                    this.p1 = -5;
                    this.p3 = 0;
                }

                this.injureBy = null;
            }
        }

    }

    private void updateTypeMobAttk() {
        if (this.p1 == 0) {
            boolean var1 = false;
            boolean var2 = false;
            int var3 = this.cFocus.cx;
            int var4 = this.cFocus.cy;
            this.typeAtt = this.typeAtk;
            if (arrMobTemplate[this.templateId].speed > 0) {
                this.dir = this.x >= var3 ? 0 : 1;
            }

            if (this.isBoss) {
                ++this.frameIndex;
                if (this.frameIndex >= arrMobTemplate[this.templateId].frameBossAttack[this.typeAtt].length) {
                    this.frameIndex = 0;
                    this.status = 2;
                    this.mobToAttack = null;
                    this.charToAttack = null;
                    this.p1 = 0;
                    this.p2 = 0;
                }

                if (this.frameIndex == arrMobTemplate[this.templateId].frameBossAttack[this.typeAtt].length - 1) {
                    if (this.typeTool == 0) {
                        ServerEffect.addServerEffect(this.idSkill_atk, var3, var4, 1, (byte) (this.dir == 0 ? -1 : 1));
                    } else if (this.typeTool == 1 && this.idSkill_atk > -1) {
                        EffectAuto.addEffectAuto(this.idSkill_atk, var3, var4, (byte) 1, (short) -1, this.dir == 0 ? -1 : 1);
                    }
                }

                this.frame = arrMobTemplate[this.templateId].frameBossAttack[this.typeAtk][this.frameIndex];
            } else {
                ServerEffect.addServerEffect(this.idSkill_atk, var3, var4, 1, (byte) (this.dir == 0 ? -1 : 1));
            }

            if (arrMobTemplate[this.templateId].type != 0 && !this.isDontMove && this.isIce && this.isWind) {
                this.x += (var3 - this.x) / 3;
            }

            if (this.x > this.xFirst + arrMobTemplate[this.templateId].rangeMove) {
                this.p1 = 1;
            }

            if (this.x < this.xFirst - arrMobTemplate[this.templateId].rangeMove) {
                this.p1 = 1;
                return;
            }
        } else if (this.p1 == 1) {
            if (arrMobTemplate[this.templateId].type != 0 && !this.isDontMove && !this.isIce && !this.isWind) {
                this.x += (this.xFirst - this.x) / 4;
                this.y += (this.yFirst - this.y) / 4;
            }

            if (Res.abs(this.xFirst - this.x) < 5 && Res.abs(this.yFirst - this.y) < 5) {
                this.status = 2;
                this.frameIndex = 0;
                this.p1 = 0;
                this.p2 = 0;
            }
        }

    }

    public static int getDistance(int var0, int var1, int var2, int var3) {
        int var10000 = var0 - var2;
        var1 -= var3;
        var0 = var10000;
        if ((var0 = var10000 * var0 + var1 * var1) <= 0) {
            return 0;
        } else {
            var1 = (var0 + 1) / 2;

            do {
                var2 = var1;
                var1 = var1 / 2 + var0 / (var1 * 2);
            } while (Math.abs(var2 - var1) > 1);

            return var1;
        }
    }

    private void updateMobWalk() {
        try {
            if (Code.bosstape) {
                return;
            }
            if (this.injureThenDie) {
                this.status = 1;
                this.p2 = this.injureBy.cdir << 3;
                this.p1 = -5;
                this.p3 = 0;
            }

            if (this.isIce) {
                return;
            }

            if (this.isDontMove || this.isWind) {
                this.frame = 0;
                return;
            }

            byte var1;
            switch (arrMobTemplate[this.templateId].type) {
                case 0:
                    if (this.templateId == 176) {
                        this.status = 9;
                    }

                    this.frame = 0;
                    return;
                case 1:
                case 2:
                case 3:
                    if ((var1 = arrMobTemplate[this.templateId].speed) == 1) {
                        if (GameCanvas.gameTick % 2 == 1) {
                            return;
                        }
                    } else if (var1 > 2) {
                        var1 = (byte) (var1 + this.mobId % 2);
                    } else if (GameCanvas.gameTick % 2 == 1 && arrMobTemplate[this.templateId].speed != 0) {
                        --var1;
                    }

                    this.x += var1 * this.dir;
                    if (Res.random(0, arrMobTemplate[this.templateId].rangeMove) == arrMobTemplate[this.templateId].rangeMove / 3) {
                        this.status = 2;
                        this.timeCurrent = System.currentTimeMillis();
                    }

                    if (this.x > this.xFirst + arrMobTemplate[this.templateId].rangeMove) {
                        this.dir = -1;
                        if (this.templateId == 168 || this.templateId == 177) {
                            this.status = 9;
                            this.p1 = 0;
                        }
                    } else if (this.x < this.xFirst - arrMobTemplate[this.templateId].rangeMove) {
                        this.dir = 1;
                        if (this.templateId == 168 || this.templateId == 177) {
                            this.status = 9;
                            this.p1 = 0;
                        }
                    }

                    if (!this.isBoss) {
                        if (this.templateId < 168) {
                            this.frame = GameCanvas.gameTick % 4 > 1 ? 0 : 1;
                            return;
                        }

                        this.frame = this.setFrameMove(GameCanvas.gameTick);
                        return;
                    }

                    this.frame = arrMobTemplate[this.templateId].frameBossMove[this.frameIndex];
                    return;
                case 4:
                    if (this.templateId < 236) {
                        var1 = (byte) (arrMobTemplate[this.templateId].speed + this.mobId % 2);
                        this.x += var1 * this.dir;
                        if (GameCanvas.gameTick % 10 > 2 && this.templateId != 205 && this.templateId != 206 && this.templateId != 207 && this.templateId != 208) {
                            this.indexlongden = -1;
                            this.y += var1 * this.dirV;
                        }

                        if (this.x > this.xFirst + arrMobTemplate[this.templateId].rangeMove) {
                            this.dir = -1;
                            if (this.templateId == 179 || this.templateId == 175) {
                                this.status = 9;
                            }

                            this.p1 = 0;
                        } else if (this.x < this.xFirst - arrMobTemplate[this.templateId].rangeMove) {
                            this.dir = 1;
                            if (this.templateId == 179 || this.templateId == 175) {
                                this.status = 9;
                            }

                            this.p1 = 0;
                        }

                        if (this.y > this.yFirst + 24) {
                            this.dirV = -1;
                        } else if (this.y < this.yFirst - (20 + GameCanvas.gameTick % 10)) {
                            this.dirV = 1;
                        }

                        if (this.isBoss) {
                            this.frame = arrMobTemplate[this.templateId].frameBossMove[this.frameIndex];
                            return;
                        }

                        if (this.templateId < 168) {
                            this.frame = GameCanvas.gameTick % 4 > 1 ? 0 : 1;
                        } else {
                            this.frame = this.setFrameMove(GameCanvas.gameTick);
                        }
                        break;
                    } else {
                        if (this.owner != null) {
                            var1 = arrMobTemplate[this.templateId].speed;
                            byte var2 = arrMobTemplate[this.templateId].speed;
                            if (this.owner.statusMe != 1 && this.owner.statusMe != 6 && getDistance(this.x, this.y, this.owner.cx, this.owner.cy) > arrMobTemplate[this.templateId].rangeMove) {
                                var1 = (byte) (arrMobTemplate[this.templateId].speed + 2);
                            }

                            var1 = (byte) (var1 + this.mobId % 2);
                            var2 = (byte) (var2 + this.mobId % 2);
                            if (this.owner.statusMe != 1 && this.owner.statusMe != 6) {
                                this.isleft = false;
                                this.isright = false;
                                if (this.x <= this.xFirst + arrMobTemplate[this.templateId].rangeMove) {
                                    if (this.x < this.xFirst - arrMobTemplate[this.templateId].rangeMove) {
                                        this.dir = 1;
                                        if (this.templateId == 179 || this.templateId == 175) {
                                            this.status = 9;
                                        }

                                        this.p1 = 0;
                                    }
                                } else {
                                    this.dir = -1;
                                    if (this.templateId == 179 || this.templateId == 175) {
                                        this.status = 9;
                                    }

                                    this.p1 = 0;
                                }
                            } else if (this.x - this.xFirst >= arrMobTemplate[this.templateId].rangeMove) {
                                this.isright = true;
                                this.isleft = false;
                            } else if (this.xFirst - this.x >= arrMobTemplate[this.templateId].rangeMove) {
                                this.isleft = true;
                                this.isright = false;
                            }

                            if (this.isright) {
                                this.dir = -1;
                            }

                            if (this.isleft) {
                                this.dir = 1;
                            }

                            this.x += var1 * this.dir;
                            if (GameCanvas.gameTick % 10 > 2 && this.templateId != 205 && this.templateId != 206 && this.templateId != 207 && this.templateId != 208) {
                                this.indexlongden = -1;
                                this.y += var2 * this.dirV;
                            }

                            if (this.y > this.yFirst + 24) {
                                this.dirV = -1;
                            } else if (this.y < this.yFirst - (20 + GameCanvas.gameTick % 10)) {
                                this.dirV = 1;
                            }

                            if (!this.isBoss) {
                                if (this.templateId < 168) {
                                    this.frame = GameCanvas.gameTick % 4 > 1 ? 0 : 1;
                                    break;
                                }

                                this.frame = this.setFrameMove(GameCanvas.gameTick);
                            }
                        }

                        return;
                    }
                case 5:
                    var1 = (byte) (arrMobTemplate[this.templateId].speed + this.mobId % 2);
                    this.x += var1 * this.dir;
                    var1 = (byte) (var1 + (GameCanvas.gameTick + this.mobId) % 2);
                    if (GameCanvas.gameTick % 10 > 2) {
                        this.y += var1 * this.dirV;
                    }

                    if (this.x > this.xFirst + arrMobTemplate[this.templateId].rangeMove) {
                        this.dir = -1;
                        if (this.templateId != 179 && this.templateId != 175) {
                            this.status = 2;
                        } else {
                            this.status = 9;
                        }

                        this.p1 = 0;
                    } else if (this.x < this.xFirst - arrMobTemplate[this.templateId].rangeMove) {
                        this.dir = 1;
                        if (this.templateId != 179 && this.templateId != 175) {
                            this.status = 2;
                        } else {
                            this.status = 9;
                        }

                        this.p1 = 0;
                    }

                    if (this.y > this.yFirst + 24) {
                        this.dirV = -1;
                    } else if (this.y < this.yFirst - (20 + GameCanvas.gameTick % 10)) {
                        this.dirV = 1;
                    }

                    if (TileMap.tileTypeAt(this.x, this.y, 2)) {
                        if (GameCanvas.gameTick % 10 > 5) {
                            this.y = TileMap.tileYofPixel(this.y);
                            this.status = 4;
                            this.p1 = 0;
                        }

                        this.dirV = -1;
                    }

                    if (!this.isBoss) {
                        if (this.templateId < 168) {
                            this.frame = GameCanvas.gameTick % 4 > 1 ? 3 : 1;
                            return;
                        }

                        this.frame = this.setFrameMove(GameCanvas.gameTick);
                        return;
                    }

                    this.frame = arrMobTemplate[this.templateId].frameBossMove[this.frameIndex];
                default:
                    return;
            }
        } catch (Exception var3) {
        }

    }

    public final MobTemplate getTemplate() {
        return arrMobTemplate[this.templateId];
    }

    public final boolean isPaint() {
        if (this.x < GameScr.cmx) {
            return false;
        } else if (this.x > GameScr.cmx + GameScr.gW) {
            return false;
        } else if (this.y < GameScr.cmy) {
            return false;
        } else if (this.y > GameScr.cmy + GameScr.gH + 30) {
            return false;
        } else if (arrMobTemplate[this.templateId] == null) {
            return false;
        } else {
            if (!this.isBoss) {
                if (this.frame >= arrMobTemplate[this.templateId].imgs.length) {
                    return false;
                }

                if (arrMobTemplate[this.templateId].imgs[this.frame] == null) {
                    return false;
                }

                if (this.templateId != 179 && this.templateId != 175 && this.templateId != 202) {
                    if (this.templateId == 176 && (this.frame == 1 || this.frame == 0)) {
                        return false;
                    }
                } else if (this.status == 8) {
                    return false;
                }
            }

            return this.status != 0;
        }
    }

    public final void paint(mGraphics var1) {
        if (this.isPaint()) {
            int var2 = this.y;
            if (this.templateId == 205 || this.templateId == 206 || this.templateId == 207 || this.templateId == 208) {
                ++this.indexlongden;
                if (this.indexlongden > Char.locate.length - 1) {
                    this.indexlongden = 0;
                }
            }

            if (this.indexlongden > -1) {
                var2 += Char.locate[this.indexlongden];
            }

            MobTemplate var3 = arrMobTemplate[this.templateId];
            if (!this.isBoss) {
                if (this.w == 0) {
                    this.w = mGraphics.getWidth(var3.imgs[0]);
                }

                if (this.h == 0) {
                    this.h = mGraphics.getHeight(var3.imgs[0]);
                }
            } else {
                this.w = 40;
                this.h = 40;
            }

            this.paintBottomDataEff(var1, this.x, var2, 0);

            int var4;
            int var6;
            try {
                var4 = this.dir > 0 ? 0 : 2;
                if (this.templateId == 219) {
                    var4 = 0;
                }

                if ((this.templateId == 98 || this.templateId == 99) && this.status == 1) {
                    long var20;
                    if ((var20 = System.currentTimeMillis()) - this.timeStartDie < 400L) {
                        var1.drawRegion(var3.imgs[this.frame], 0, 0, mGraphics.getWidth(var3.imgs[this.frame]), mGraphics.getHeight(var3.imgs[this.frame]), var4, this.x, var2, StaticObj.BOTTOM_HCENTER);
                    } else if (var20 - this.timeStartDie < 800L) {
                        var1.drawRegion(var3.imgs[this.frame], 0, 0, mGraphics.getWidth(var3.imgs[this.frame]), 3 * mGraphics.getHeight(var3.imgs[this.frame]) / 5, var4, this.x, var2, StaticObj.BOTTOM_HCENTER);
                    } else if (var20 - this.timeStartDie < 1200L) {
                        var1.drawRegion(var3.imgs[this.frame], 0, 0, mGraphics.getWidth(var3.imgs[this.frame]), mGraphics.getHeight(var3.imgs[this.frame]) / 3, var4, this.x, var2, StaticObj.BOTTOM_HCENTER);
                    }

                    if (GameCanvas.gameTick % 8 < 2) {
                        SmallImage.drawSmallImage(var1, 457, this.x, var2, 0, StaticObj.BOTTOM_HCENTER);
                    } else if (GameCanvas.gameTick % 8 < 4) {
                        SmallImage.drawSmallImage(var1, 458, this.x, var2, 0, StaticObj.BOTTOM_HCENTER);
                    } else if (GameCanvas.gameTick % 8 < 6) {
                        SmallImage.drawSmallImage(var1, 459, this.x, var2, 0, StaticObj.BOTTOM_HCENTER);
                    }
                } else if (this.isBoss) {
                    if (this.getTemplate().frameBoss != null) {
                        Frame var5;
                        byte var8;
                        MobTemplate var10000;
                        if (this.templateId < 236) {
                            var5 = this.getTemplate().frameBoss[this.frame];

                            for (var6 = 0; var6 < var5.dx.length; ++var6) {
                                var10000 = this.getTemplate();
                                var8 = var5.idImg[var6];
                                ImageInfo var17 = var10000.imginfo[var8];
                                if (this.dir > 0) {
                                    var1.drawRegion(this.getTemplate().imgs[0], var17.x0, var17.y0, var17.w, var17.h, 0, this.x + var5.dx[var6], var2 + var5.dy[var6] - 1, 20);
                                } else {
                                    var1.drawRegion(this.getTemplate().imgs[0], var17.x0, var17.y0, var17.w, var17.h, 2, this.x - var5.dx[var6], var2 + var5.dy[var6] - 1, 24);
                                }
                            }
                        } else {
                            mGraphics var19 = var1;
                            Mob var16 = this;

                            try {
                                if (GameCanvas.gameTick % 2 == 0 && var16.status != 3) {
                                    ++var16.tt;
                                    if (var16.tt > var16.getTemplate().frameBossMove.length - 1) {
                                        var16.tt = 0;
                                    }

                                    var16.frame = var16.getTemplate().frameBossMove[var16.tt];
                                }

                                var5 = var16.getTemplate().frameBoss[var16.frame];

                                for (var6 = 0; var6 < var5.dx.length; ++var6) {
                                    if (var5.onTop[var6] != 0) {
                                        var10000 = var16.getTemplate();
                                        var8 = var5.idImg[var6];
                                        ImageInfo var7;
                                        int var24 = (var7 = var10000.imginfo[var8]).x0;
                                        int var9 = var7.y0;
                                        int var10 = var7.w;
                                        int var23 = var7.h;
                                        int var11 = var5.dx[var6];
                                        short var12 = var5.dy[var6];
                                        if (var24 > var16.getTemplate().imgs[0].getWidth()) {
                                            var24 = 0;
                                        }

                                        if (var9 > var16.getTemplate().imgs[0].getHeight()) {
                                            var9 = 0;
                                        }

                                        if (var24 + var10 > var16.getTemplate().imgs[0].getWidth()) {
                                            var10 = var16.getTemplate().imgs[0].getWidth() - var24;
                                        }

                                        if (var9 + var23 > var16.getTemplate().imgs[0].getHeight()) {
                                            var23 = var16.getTemplate().imgs[0].getHeight() - var9;
                                        }

                                        int var13 = var5.flip[var6] == 1 ? 2 : 0;
                                        if (var16.dir == 1) {
                                            if (var13 == 2) {
                                                var13 = 0;
                                                var11 += var10;
                                            } else {
                                                var13 = 2;
                                                var11 = -(var11 + var10);
                                            }
                                        }

                                        var19.drawRegion(var16.getTemplate().imgs[0], var24, var9, var10, var23, var13, var16.x + var11, var16.y + var12, 0);
                                    }
                                }
                            } catch (Exception var14) {
                                var14.printStackTrace();
                                System.err.println("Err paintTopMobNew:" + this.templateId);
                            }

                            this.paintBottomEff(var1);
                        }
                    }
                } else if (this.templateId == 168 && this.status != 8) {
                    var1.drawRegion(var3.imgs[this.frame], 0, 0, mGraphics.getWidth(var3.imgs[this.frame]), mGraphics.getHeight(var3.imgs[this.frame]), var4, this.x, var2, StaticObj.BOTTOM_HCENTER);
                } else {
                    var1.drawRegion(var3.imgs[this.frame], 0, 0, mGraphics.getWidth(var3.imgs[this.frame]), mGraphics.getHeight(var3.imgs[this.frame]), var4, this.x, var2, StaticObj.BOTTOM_HCENTER);
                }

                this.paintTopDataEff(var1, this.x, var2, 0);
            } catch (Exception var15) {
                var15.printStackTrace();
            }

            var4 = var2;
            int var21;
            if (Char.getMyChar().mobFocus != null && Char.getMyChar().mobFocus.equals(this) && this.status != 1) {
                int var18;
                byte var22;
                if (this.isBoss) {
                    if ((var21 = this.maxHp) < this.hp) {
                        var21 = this.hp;
                    }

                    var6 = (int) ((long) this.hp * 100L / (long) var21);
                    var18 = this.w;
                    var22 = 4;
                    if (this.levelBoss == 1 || this.levelBoss == 2 || this.levelBoss == 3 || this.isBoss) {
                        var22 = 6;
                        var18 += var18 / 2;
                    }

                    var18 += 2;
                    if ((var6 = var18 * var6 / 100) < 2) {
                        var6 = 2;
                    }

                    if (this.templateId == 140 || this.templateId == 160) {
                        var4 = var2 - 20;
                    }

                    if (!Char.isANameMob) {
                        if (this.templateId != 142 && this.templateId != 143) {
                            var1.setColor(16777215);
                            var1.fillRect(this.x - var18 / 2 - 1, var4 - this.h - 12, var18, var22);
                            var1.setColor(this.getHPColor());
                            var1.fillRect(this.x - var18 / 2 - 1, var4 - this.h - 12, var6, var22);
                            var1.setColor(0);
                            var1.drawRect(this.x - var18 / 2 - 1, var4 - this.h - 12, var18, var22);
                        }
                    } else {
                        SmallImage.drawSmallImage(var1, 988, this.x, var4 - this.h, 0, 33);
                    }
                } else {
                    if ((var21 = this.maxHp) < this.hp) {
                        var21 = this.hp;
                    }

                    var6 = (int) ((long) this.hp * 100L / (long) var21);
                    var18 = this.w;
                    if (this.templateId > 167) {
                        var18 = this.w / 2;
                    }

                    var22 = 4;
                    if (this.levelBoss == 1 || this.levelBoss == 2 || this.levelBoss == 3 || this.isBoss) {
                        var22 = 6;
                        var18 += var18 / 2;
                    }

                    var18 += 2;
                    if ((var6 = var18 * var6 / 100) < 2) {
                        var6 = 2;
                    }

                    if (this.templateId == 140 || this.templateId == 160) {
                        var4 = var2 - 20;
                    }

                    if (!Char.isANameMob) {

                        if (this.templateId != 142 && this.templateId != 143) {
                            var1.setColor(16777215);
                            var1.fillRect(this.x - var18 / 2 - 1, var4 - this.h - 12, var18, var22);
                            var1.setColor(this.getHPColor());
                            var1.fillRect(this.x - var18 / 2 - 1, var4 - this.h - 12, var6, var22);
                            var1.setColor(0);
                            var1.drawRect(this.x - var18 / 2 - 1, var4 - this.h - 12, var18, var22);
                        }
                    } else {
                        SmallImage.drawSmallImage(var1, 988, this.x, var4 - this.h, 0, 33);
                    }
                }

                if (this.levelBoss > 0) {
                    if (this.levelBoss == 1) {
                        mFont.tahoma_7_yellow.drawString(var1, mResources.BOSS[this.levelBoss], this.x, var4 - this.h - 26, 2, mFont.tahoma_7_grey);
                    } else if (this.levelBoss == 2) {
                        mFont.tahoma_7_yellow.drawString(var1, mResources.BOSS[this.levelBoss], this.x, var4 - this.h - 26, 2, mFont.tahoma_7_grey);
                    } else if (this.levelBoss == 3) {
                        mFont.tahoma_7_blue1.drawString(var1, mResources.BOSS[this.levelBoss], this.x, var4 - this.h - 26, 2, mFont.tahoma_7_grey);
                    }

                    if (this.isDisable) {
                        SmallImage.drawSmallImage(var1, 494, this.x, var4 - this.h - 28, 0, 33);
                    }
                } else if (this.isDisable) {
                    SmallImage.drawSmallImage(var1, 494, this.x, var4 - this.h - 15, 0, 33);
                }
            } else if (this.levelBoss > 0) {
                if (this.levelBoss == 1) {
                    mFont.tahoma_7_yellow.drawString(var1, mResources.BOSS[this.levelBoss], this.x, var2 - this.h - 20, 2, mFont.tahoma_7_grey);
                    if (Char.isANameMob) {
                        mFont.tahoma_7b_white.drawString(var1, this.arrMobTemplate[this.templateId].name + "(" + this.arrMobTemplate[this.templateId].mobTemplateId + ")", x, y - h - 15 - mFont.tahoma_7.getHeight(), 2, mFont.tahoma_7_grey);
                    }
                } else if (this.levelBoss == 2) {
                    mFont.tahoma_7_yellow.drawString(var1, mResources.BOSS[this.levelBoss], this.x, var2 - this.h - 20, 2, mFont.tahoma_7_grey);
                    if (Char.isANameMob) {
                        mFont.tahoma_7b_white.drawString(var1, this.arrMobTemplate[this.templateId].name + "(" + this.arrMobTemplate[this.templateId].mobTemplateId + ")", x, y - h - 15 - mFont.tahoma_7.getHeight(), 2, mFont.tahoma_7_grey);
                    }
                } else if (this.levelBoss == 3) {
                    mFont.tahoma_7_blue1.drawString(var1, mResources.BOSS[this.levelBoss], this.x, var2 - this.h - 20, 2, mFont.tahoma_7_grey);
                    if (Char.isANameMob) {
                        mFont.tahoma_7b_white.drawString(var1, this.arrMobTemplate[this.templateId].name + "(" + this.arrMobTemplate[this.templateId].mobTemplateId + ")", x, y - h - 15 - mFont.tahoma_7.getHeight(), 2, mFont.tahoma_7_grey);
                    }
                }

                if (this.isDisable) {
                    SmallImage.drawSmallImage(var1, 494, this.x, var2 - this.h - 22, 0, 33);
                }
            }
            if (Char.isANameMob) {
                if (this.levelBoss == 0) {
                    mFont.tahoma_7b_white.drawString(var1, this.arrMobTemplate[this.templateId].name + "(" + this.arrMobTemplate[this.templateId].mobTemplateId + ")", x, y - h - 15 - mFont.tahoma_7.getHeight(), 2, mFont.tahoma_7_grey);
                }
            } else if (this.isDisable) {
                SmallImage.drawSmallImage(var1, 494, this.x, var2 - this.h - 5, 0, 33);
            }

            if (this.isDontMove) {
                if (GameCanvas.gameTick % 2 == 0) {
                    SmallImage.drawSmallImage(var1, 1082, this.x, var2 - this.h / 2, 0, 3);
                } else {
                    SmallImage.drawSmallImage(var1, 1084, this.x, var2 - this.h / 2, 0, 3);
                }
            }

            if (this.isIce) {
                SmallImage.drawSmallImage(var1, 290, this.x, var2, 0, 33);
            }

            if (this.isWind) {
                if ((var21 = GameCanvas.gameTick % 6) != 0 && var21 != 1) {
                    if (var21 != 2 && var21 != 3) {
                        if (var21 == 4 || var21 == 5) {
                            SmallImage.drawSmallImage(var1, 1000, this.x, var2 - this.h - 5, 0, 3);
                        }
                    } else {
                        SmallImage.drawSmallImage(var1, 999, this.x, var2 - this.h - 5, 0, 3);
                    }
                } else {
                    SmallImage.drawSmallImage(var1, 998, this.x, var2 - this.h - 5, 0, 3);
                }
            }

            if (this.isFire) {
                if ((var21 = GameCanvas.gameTick % 16) == 0) {
                    SmallImage.drawSmallImage(var1, 1013, this.x - this.w / 2, var2 - this.h + this.h / 4, 0, 3);
                    return;
                }

                if (var21 == 1) {
                    SmallImage.drawSmallImage(var1, 1014, this.x - this.w / 2, var2 - this.h + this.h / 4, 0, 3);
                    return;
                }

                if (var21 == 2) {
                    SmallImage.drawSmallImage(var1, 1015, this.x - this.w / 2, var2 - this.h + this.h / 4, 0, 3);
                    return;
                }

                if (var21 == 3) {
                    SmallImage.drawSmallImage(var1, 1016, this.x - this.w / 2, var2 - this.h + this.h / 4, 0, 3);
                    return;
                }

                if (var21 == 4) {
                    SmallImage.drawSmallImage(var1, 1013, this.x + this.w / 2, var2 - this.h, 0, 3);
                    return;
                }

                if (var21 == 5) {
                    SmallImage.drawSmallImage(var1, 1014, this.x + this.w / 2, var2 - this.h, 0, 3);
                    return;
                }

                if (var21 == 6) {
                    SmallImage.drawSmallImage(var1, 1015, this.x + this.w / 2, var2 - this.h, 0, 3);
                    return;
                }

                if (var21 == 7) {
                    SmallImage.drawSmallImage(var1, 1016, this.x + this.w / 2, var2 - this.h, 0, 3);
                    return;
                }

                if (var21 == 8) {
                    SmallImage.drawSmallImage(var1, 1013, this.x - this.w / 2, var2, 0, 3);
                    return;
                }

                if (var21 == 9) {
                    SmallImage.drawSmallImage(var1, 1014, this.x - this.w / 2, var2, 0, 3);
                    return;
                }

                if (var21 == 10) {
                    SmallImage.drawSmallImage(var1, 1015, this.x - this.w / 2, var2, 0, 3);
                    return;
                }

                if (var21 == 11) {
                    SmallImage.drawSmallImage(var1, 1016, this.x - this.w / 2, var2, 0, 3);
                    return;
                }

                if (var21 == 12) {
                    SmallImage.drawSmallImage(var1, 1013, this.x + this.w / 2, var2 - this.h / 4, 0, 3);
                    return;
                }

                if (var21 == 13) {
                    SmallImage.drawSmallImage(var1, 1014, this.x + this.w / 2, var2 - this.h / 4, 0, 3);
                    return;
                }

                if (var21 == 14) {
                    SmallImage.drawSmallImage(var1, 1015, this.x + this.w / 2, var2 - this.h / 4, 0, 3);
                    return;
                }

                if (var21 == 15) {
                    SmallImage.drawSmallImage(var1, 1016, this.x + this.w / 2, var2 - this.h / 4, 0, 3);
                }
            }

        }
    }

    public final int getHPColor() {
        if (this.sys <= 1) {
            return 16711680;
        } else if (this.sys == 2) {
            return 33023;
        } else {
            return this.sys == 3 ? 7443811 : 16711680;
        }
    }

    public final void startDie() {
        this.hp = 0;
        this.timeStartDie = System.currentTimeMillis();
        if (this.injureBy != null) {
            this.injureThenDie = true;
        } else {
            this.injureThenDie = true;
            this.hp = 0;
            this.status = 1;
            this.p1 = -5;
            this.p2 = -this.dir << 2;
            this.p3 = 0;
        }
    }

    public final void attackOtherMob(Mob var1) {
        this.mobToAttack = var1;
    }

    public final void attackOtherChar(Char var1) {
        this.charToAttack = var1;
    }

    private void setatk_mob() {
        int var1;
        int var2;
        if (this.mobToAttack != null) {
            if (this.isBoss) {
                this.status = 3;
            } else {
                var1 = this.mobToAttack.x - this.x;
                var2 = this.mobToAttack.y - this.y;
                this.x += var1 / 4;
                this.y += var2 / 4;
                this.dir = this.x >= this.mobToAttack.x ? 0 : 1;
                if (this.mobToAttack.status == 1 || this.mobToAttack.status == 0 || Res.abs(var1) < 20 && Res.abs(var2) < 20) {
                    if (this.typeTool == 0) {
                        ServerEffect.addServerEffect(this.idSkill_atk == -1 ? 59 : this.idSkill_atk, this.mobToAttack.x, this.mobToAttack.y, this.dir == 0 ? -1 : 1);
                    } else if (this.typeTool == 1 && this.idSkill_atk > -1) {
                        EffectAuto.addEffectAuto(this.idSkill_atk, this.mobToAttack.x, this.mobToAttack.y, (byte) 1, (short) -1, this.dir == 0 ? -1 : 1);
                    }

                    this.mobToAttack = null;
                }
            }
        }

        if (this.charToAttack != null) {
            if (this.isBoss) {
                this.status = 3;
                return;
            }

            var1 = this.charToAttack.cx - this.x;
            var2 = this.charToAttack.cy - this.y;
            this.x += var1 / 4;
            this.y += var2 / 4;
            this.dir = this.x >= this.charToAttack.cx ? 0 : 1;
            if (this.charToAttack.statusMe == 5 || this.charToAttack.statusMe == 14 || Res.abs(var1) < 20 && Res.abs(var2) < 20) {
                if (this.typeTool == 0) {
                    ServerEffect.addServerEffect(this.idSkill_atk == -1 ? 59 : this.idSkill_atk, this.charToAttack.cx, this.charToAttack.cy, this.dir == 0 ? -1 : 1);
                } else if (this.typeTool == 1 && this.idSkill_atk > -1) {
                    EffectAuto.addEffectAuto(this.idSkill_atk, this.charToAttack.cx, this.charToAttack.cy, (byte) 1, (short) -1, this.dir == 0 ? -1 : 1);
                }

                this.charToAttack = null;
            }
        }

    }

    public final void setTypeAtk(short var1, byte var2, byte var3) {
        this.idSkill_atk = var1;
        this.typeAtk = var2;
        this.typeTool = var3;
    }

    public final void attackOtherInRange() {
        if (this.templateId == 116) {
            ServerEffect.addServerEffect(84, Char.getMyChar(), 1);
        } else if (this.templateId == 115) {
            ServerEffect.addServerEffect(81, Char.getMyChar(), 1);
        } else if (this.templateId == 138) {
            ServerEffect.addServerEffect(90, Char.getMyChar(), 1);
        } else if (this.templateId == 139) {
            ServerEffect.addServerEffect(91, Char.getMyChar(), 1);
        } else if (this.templateId != 140 && this.templateId != 161) {
            if (this.templateId != 141 && this.templateId != 162) {
                if (this.templateId != 144 && this.templateId != 163) {
                    if (this.templateId == 160) {
                        ServerEffect.addServerEffect(124, Char.getMyChar(), 1);
                    } else if (this.templateId != 164 && this.templateId != 165) {
                        if (this.templateId == 166) {
                            ServerEffect.addServerEffect(103, this.cFocus, 1);
                        } else {
                            if (this.templateId == 166) {
                                ServerEffect.addServerEffect(105, this.cFocus, 1);
                            }

                        }
                    } else {
                        ServerEffect.addServerEffect(126, this.cFocus, 1);
                    }
                } else {
                    ServerEffect.addServerEffect(121, Char.getMyChar(), 1);
                }
            } else {
                ServerEffect.addServerEffect(121, Char.getMyChar(), 1);
            }
        } else {
            ServerEffect.addServerEffect(110, Char.getMyChar(), 2);
        }
    }

    private int setFrameMove(int var1) {
        var1 %= idframe[this.templateId - 168].length;
        return this.templateId != 198 && this.templateId != 199 && this.templateId != 200 && this.templateId != 201 && this.templateId != 203 && this.templateId != 204 ? idframe[this.templateId - 168][var1] : 0;
    }

    private int setFrameAppear(int var1) {
        try {
            var1 %= idframeAppear[this.templateId - 168].length;
            return idframeAppear[this.templateId - 168][var1];
        } catch (Exception var2) {
            return 0;
        }
    }

    private int setFrameAtt(int var1) {
        var1 %= 5;
        if (this.templateId == 178) {
            switch (var1) {
                case 0:
                    return 5;
                case 1:
                    return 6;
                case 2:
                    return 7;
                case 3:
                    return 8;
            }
        } else if (this.templateId == 168) {
            switch (var1) {
                case 0:
                    return 1;
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 5;
            }
        } else if (this.templateId == 179) {
            switch (var1) {
                case 0:
                    return 0;
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 5;
            }
        } else if (this.templateId == 175) {
            switch (var1) {
                case 0:
                    return 0;
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 5;
            }
        } else if (this.templateId == 176) {
            switch (var1) {
                case 0:
                    return 2;
                case 1:
                    return 3;
                case 2:
                    return 4;
                case 3:
                    return 5;
                case 4:
                    return 6;
            }
        } else if (this.templateId == 177) {
            switch (var1) {
                case 0:
                    return 1;
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 5;
            }
        } else if (this.templateId == 174) {
            switch (var1) {
                case 0:
                    return 5;
                case 1:
                    return 6;
                case 2:
                    return 7;
                case 3:
                    return 8;
                case 4:
                    return 9;
            }
        }

        return 0;
    }

    private int setFrameDisappear(int var1) {
        try {
            var1 %= idframeDisappear[this.templateId - 168].length;
            return idframeDisappear[this.templateId - 168][var1];
        } catch (Exception var2) {
            return 0;
        }
    }

    private void updateAttk_Thunuoi() {
        if (this.p1 == 0) {
            int var1 = 0;
            int var2 = 0;
            if (this.mobToAttack != null) {
                var1 = this.mobToAttack.x;
                var2 = this.mobToAttack.y;
            }

            if (this.charToAttack != null) {
                var1 = this.charToAttack.cx;
                var2 = this.charToAttack.cy;
            }

            this.typeAtt = this.typeAtk;
            this.dir = this.x >= var1 ? 0 : 1;
            if (this.isBoss) {
                ++this.frameIndex;
                if (this.frameIndex >= arrMobTemplate[this.templateId].frameBossAttack[this.typeAtt].length) {
                    this.frameIndex = 0;
                    this.status = 2;
                    this.mobToAttack = null;
                    this.charToAttack = null;
                    this.p1 = 0;
                    this.p2 = 0;
                }

                if (this.frameIndex == arrMobTemplate[this.templateId].frameBossAttack[this.typeAtt].length - 2) {
                    if (this.typeTool == 0) {
                        ServerEffect.addServerEffect(this.idSkill_atk == -1 ? 59 : this.idSkill_atk, var1, var2, 1, (byte) (this.dir == 0 ? -1 : 1));
                    } else if (this.typeTool == 1 && this.idSkill_atk > -1) {
                        EffectAuto.addEffectAuto(this.idSkill_atk, var1, var2, (byte) 1, (short) -1, this.dir == 0 ? -1 : 1);
                    }
                }

                this.frame = arrMobTemplate[this.templateId].frameBossAttack[this.typeAtk][this.frameIndex];
            }

            if (arrMobTemplate[this.templateId].type != 0 && !this.isDontMove && this.isIce && this.isWind) {
                this.x += (var1 - this.x) / 3;
            }

            if (this.x > this.xFirst + arrMobTemplate[this.templateId].rangeMove) {
                this.p1 = 1;
            }

            if (this.x < this.xFirst - arrMobTemplate[this.templateId].rangeMove) {
                this.p1 = 1;
                return;
            }
        } else if (this.p1 == 1) {
            if (arrMobTemplate[this.templateId].type != 0 && !this.isDontMove && !this.isIce && !this.isWind) {
                this.x += (this.xFirst - this.x) / 4;
                this.y += (this.yFirst - this.y) / 4;
            }

            if (Res.abs(this.xFirst - this.x) < 5 && Res.abs(this.yFirst - this.y) < 5) {
                this.status = 2;
                this.frameIndex = 0;
                this.p1 = 0;
                this.p2 = 0;
            }
        }

    }

    public static Mob get_Mob(int var0) {
        for (int var1 = GameScr.vMob.size() - 1; var1 >= 0; --var1) {
            Mob var2;
            if ((var2 = (Mob) GameScr.vMob.elementAt(var1)) != null && var2.mobId == var0) {
                return var2;
            }
        }

        return null;
    }

    public final void paintTopMobNew(mGraphics var1, int var2, int var3) {
        try {
            if (GameCanvas.gameTick % 2 == 0 && this.status != 3) {
                ++this.tt;
                if (this.tt > this.getTemplate().frameBossMove.length - 1) {
                    this.tt = 0;
                }

                this.frame = this.getTemplate().frameBossMove[this.tt];
            }

            Frame var4 = this.getTemplate().frameBoss[this.frame];

            for (int var5 = 0; var5 < var4.dx.length; ++var5) {
                if (var4.onTop[var5] != 0) {
                    MobTemplate var10000 = this.getTemplate();
                    byte var7 = var4.idImg[var5];
                    ImageInfo var6;
                    int var14 = (var6 = var10000.imginfo[var7]).x0;
                    int var8 = var6.y0;
                    int var9 = var6.w;
                    int var13 = var6.h;
                    short var10 = var4.dx[var5];
                    short var11 = var4.dy[var5];
                    if (var14 > this.getTemplate().imgs[0].getWidth()) {
                        var14 = 0;
                    }

                    if (var8 > this.getTemplate().imgs[0].getHeight()) {
                        var8 = 0;
                    }

                    if (var14 + var9 > this.getTemplate().imgs[0].getWidth()) {
                        var9 = this.getTemplate().imgs[0].getWidth() - var14;
                    }

                    if (var8 + var13 > this.getTemplate().imgs[0].getHeight()) {
                        var13 = this.getTemplate().imgs[0].getHeight() - var8;
                    }

                    int var15 = -(var10 + var9);
                    var1.drawRegion(this.getTemplate().imgs[0], var14, var8, var9, var13, 2, var2 + var15, var3 + var11, 0);
                }
            }

        } catch (Exception var12) {
            var12.printStackTrace();
            System.err.println("Err paintTopMobNew:" + this.templateId);
        }
    }

    public final void paintBottomEff(mGraphics var1, int var2, int var3) {
        try {
            Frame var4 = this.getTemplate().frameBoss[this.frame];

            for (int var5 = 0; var5 < var4.dx.length; ++var5) {
                if (var4.onTop[var5] == 0) {
                    MobTemplate var10000 = this.getTemplate();
                    byte var7 = var4.idImg[var5];
                    ImageInfo var6;
                    int var14 = (var6 = var10000.imginfo[var7]).x0;
                    int var8 = var6.y0;
                    int var9 = var6.w;
                    int var13 = var6.h;
                    short var10 = var4.dx[var5];
                    short var11 = var4.dy[var5];
                    if (var14 > this.getTemplate().imgs[0].getWidth()) {
                        var14 = 0;
                    }

                    if (var8 > this.getTemplate().imgs[0].getHeight()) {
                        var8 = 0;
                    }

                    if (var14 + var9 > this.getTemplate().imgs[0].getWidth()) {
                        var9 = this.getTemplate().imgs[0].getWidth() - var14;
                    }

                    if (var8 + var13 > this.getTemplate().imgs[0].getHeight()) {
                        var13 = this.getTemplate().imgs[0].getHeight() - var8;
                    }

                    int var15 = -(var10 + var9);
                    var1.drawRegion(this.getTemplate().imgs[0], var14, var8, var9, var13, 2, var2 + var15, var3 + var11, 0);
                }
            }

        } catch (Exception var12) {
            var12.printStackTrace();
            System.err.println("Err DataSkillEff  paintBottomEff:" + this.templateId);
        }
    }

    private void paintBottomEff(mGraphics var1) {
        try {
            Frame var2 = this.getTemplate().frameBoss[this.frame];

            for (int var3 = 0; var3 < var2.dx.length; ++var3) {
                if (var2.onTop[var3] == 0) {
                    MobTemplate var10000 = this.getTemplate();
                    byte var5 = var2.idImg[var3];
                    ImageInfo var4;
                    int var13 = (var4 = var10000.imginfo[var5]).x0;
                    int var6 = var4.y0;
                    int var7 = var4.w;
                    int var12 = var4.h;
                    int var8 = var2.dx[var3];
                    short var9 = var2.dy[var3];
                    if (var13 > this.getTemplate().imgs[0].getWidth()) {
                        var13 = 0;
                    }

                    if (var6 > this.getTemplate().imgs[0].getHeight()) {
                        var6 = 0;
                    }

                    if (var13 + var7 > this.getTemplate().imgs[0].getWidth()) {
                        var7 = this.getTemplate().imgs[0].getWidth() - var13;
                    }

                    if (var6 + var12 > this.getTemplate().imgs[0].getHeight()) {
                        var12 = this.getTemplate().imgs[0].getHeight() - var6;
                    }

                    int var10 = var2.flip[var3] == 1 ? 2 : 0;
                    if (this.dir == 1) {
                        if (var10 == 2) {
                            var10 = 0;
                            var8 += var7;
                        } else {
                            var10 = 2;
                            var8 = -(var8 + var7);
                        }
                    }

                    var1.drawRegion(this.getTemplate().imgs[0], var13, var6, var7, var12, var10, this.x + var8, this.y + var9, 0);
                }
            }

        } catch (Exception var11) {
            var11.printStackTrace();
            System.err.println("Err DataSkillEff  paintBottomEff:" + this.templateId);
        }
    }

    public static Mob findMobByLevel(int var0) {
        for (int var1 = GameScr.vMob.size() - 1; var1 >= 0; --var1) {
            Mob var2;
            if ((var2 = (Mob) GameScr.vMob.elementAt(var1)) != null && var2.level == var0 && !var2.isBoss) {
                return var2;
            }
        }

        return null;
    }
}
