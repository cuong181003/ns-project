import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public final class DataSkillEff {
   public long timeRemove;
   public MyVector listFrame = new MyVector();
   private SmallImage[] smallImage;
   private byte[][] frameChar;
   public byte[] sequence;
   private byte Frame;
   private byte f;
   public boolean isLoadData;
   public short idEff;
   private byte typeupdate;
   private byte[] indexSplash;
   private boolean isHorse;
   public boolean isHead;
   public byte[] ActionStand;
   public byte[] ActionMove;
   public byte[] ActionJum;
   public byte[] ActionFall;
   public byte[] FrameChar;
   public byte[] Dx_Char;
   public byte[] Dy_Char;
   public byte nHorseFrame;
   public byte dxHorse;
   public byte dyHorse;
   private MyVector v1;
   private MyVector v2;
   private MyVector v3;
   private MyVector v4;
   private MyVector v5;
   private MyVector v6;
   private MyVector v7;
   public long timelive;
   private long timeWait;
   public int miliSecondWait;
   public boolean wantDetroy;
   private boolean wait;

   static {
      new mHashtable();
   }

   public DataSkillEff() {
      new MyVector();
      this.frameChar = new byte[4][];
      new MyVector();
      this.idEff = 0;
      this.typeupdate = 0;
      this.indexSplash = new byte[4];
      this.isHead = false;
      this.v1 = new MyVector();
      this.v2 = new MyVector();
      this.v3 = new MyVector();
      this.v4 = new MyVector();
      this.v5 = new MyVector();
      this.v6 = new MyVector();
      this.v7 = new MyVector();
      new MyVector();
   }

   public DataSkillEff(short var1, boolean var2) {
      new MyVector();
      this.frameChar = new byte[4][];
      new MyVector();
      this.idEff = 0;
      this.typeupdate = 0;
      this.indexSplash = new byte[4];
      this.isHead = false;
      this.v1 = new MyVector();
      this.v2 = new MyVector();
      this.v3 = new MyVector();
      this.v4 = new MyVector();
      this.v5 = new MyVector();
      this.v6 = new MyVector();
      this.v7 = new MyVector();
      new MyVector();
      this.idEff = var1;
      this.isHorse = var2;
      this.loadnew((byte[])null);
   }

   private void loadnew(byte[] var1) {
      try {
         EffectData var2;
         if ((var2 = (EffectData)GameData.listbyteData.get("" + this.idEff)) != null && var2.data != null) {
            var1 = var2.data;
         }

         if (var2 == null) {
            var2 = new EffectData();
            GameData.listbyteData.put("" + this.idEff, var2);
            Service.gI().doGetByteData(this.idEff);
            System.currentTimeMillis();
         }

         if (var1 != null && var1.length > 0) {
            this.loadData(var1);
            return;
         }
      } catch (Exception var3) {
      }

   }

   private void loadData(byte[] var1) {
      if (var1 != null) {
         DataInputStream var2 = null;

         try {
            this.listFrame.removeAllElements();
            this.smallImage = null;
            byte var18 = (var2 = new DataInputStream(new ByteArrayInputStream(var1))).readByte();
            this.smallImage = new SmallImage[var18];

            int var3;
            for(var3 = 0; var3 < var18; ++var3) {
               this.smallImage[var3] = new SmallImage(var2.readUnsignedByte(), var2.readUnsignedByte(), var2.readUnsignedByte(), var2.readUnsignedByte(), var2.readUnsignedByte());
            }

            short var19 = var2.readShort();

            for(var3 = 0; var3 < var19; ++var3) {
               byte var4 = var2.readByte();
               MyVector var5 = new MyVector();
               MyVector var6 = new MyVector();

               for(int var7 = 0; var7 < var4; ++var7) {
                  PartFrame var8;
                  (var8 = new PartFrame(var2.readShort(), var2.readShort(), var2.readByte())).flip = var2.readByte();
                  var8.onTop = var2.readByte();
                  if (var8.onTop == 0) {
                     var5.addElement(var8);
                  } else {
                     var6.addElement(var8);
                  }
               }

               this.listFrame.addElement(new FrameEff(var5, var6));
            }

            short var20 = (short)var2.readUnsignedByte();
            this.sequence = new byte[var20];
            int var21 = 0;

            int var23;
            for(var23 = 0; var23 < var20; ++var23) {
               this.sequence[var23] = (byte)var2.readShort();
               if (this.isHorse) {
                  if (var21 == 2 && this.sequence[var23] != -1) {
                     this.v1.addElement(String.valueOf(this.sequence[var23]));
                  }

                  if (var21 == 3 && this.sequence[var23] != -1) {
                     this.v2.addElement(String.valueOf(this.sequence[var23]));
                  }

                  if (var21 == 4 && this.sequence[var23] != -1) {
                     this.v3.addElement(String.valueOf(this.sequence[var23]));
                  }

                  if (var21 == 5 && this.sequence[var23] != -1) {
                     this.v4.addElement(String.valueOf(this.sequence[var23]));
                  }

                  if (var21 == 6 && this.sequence[var23] != -1) {
                     this.v5.addElement(String.valueOf(this.sequence[var23]));
                  }

                  if (var21 == 7 && this.sequence[var23] != -1) {
                     this.v6.addElement(String.valueOf(this.sequence[var23]));
                  }

                  if (var21 == 8 && this.sequence[var23] != -1) {
                     this.v7.addElement(String.valueOf(this.sequence[var23]));
                  }

                  if (this.sequence[var23] == -1) {
                     ++var21;
                  }
               }
            }

            if (this.isHorse) {
               this.nHorseFrame = this.sequence[0];
               this.dxHorse = this.sequence[2];
               this.dyHorse = this.sequence[3];
               this.FrameChar = vector2arr(this.v1);
               this.ActionStand = vector2arr(this.v2);
               this.ActionMove = vector2arr(this.v3);
               this.ActionJum = vector2arr(this.v4);
               this.ActionFall = vector2arr(this.v5);
               this.Dx_Char = vector2arr(this.v6);
               if (this.Dx_Char == null || this.Dx_Char.length == 0) {
                  this.Dx_Char = new byte[this.nHorseFrame];
               }

               this.Dy_Char = vector2arr(this.v7);
               if (this.Dy_Char == null || this.Dy_Char.length == 0) {
                  this.Dy_Char = new byte[this.nHorseFrame];
               }

               this.v1.removeAllElements();
               this.v2.removeAllElements();
               this.v3.removeAllElements();
               this.v4.removeAllElements();
               this.v5.removeAllElements();
               this.v6.removeAllElements();
               this.v7.removeAllElements();
            }

            var2.readByte();
            byte var22 = var2.readByte();
            this.frameChar[0] = new byte[var22];

            for(var23 = 0; var23 < var22; ++var23) {
               this.frameChar[0][var23] = var2.readByte();
            }

            var22 = var2.readByte();
            this.frameChar[1] = new byte[var22];

            for(var23 = 0; var23 < var22; ++var23) {
               this.frameChar[1][var23] = var2.readByte();
            }

            var22 = var2.readByte();
            this.frameChar[3] = new byte[var22];

            for(var23 = 0; var23 < var22; ++var23) {
               this.frameChar[3][var23] = var2.readByte();
            }

            this.isLoadData = true;

            try {
               this.indexSplash[0] = (byte)(this.frameChar[0].length - 7);
               this.indexSplash[1] = (byte)(this.frameChar[1].length - 7);
               this.indexSplash[2] = (byte)(this.frameChar[3].length - 7);
               this.indexSplash[3] = (byte)(this.frameChar[3].length - 7);
            } catch (Exception var15) {
            }

            this.indexSplash[0] = var2.readByte();
            this.indexSplash[1] = var2.readByte();
            this.indexSplash[2] = var2.readByte();
            this.indexSplash[3] = this.indexSplash[2];
         } catch (Exception var16) {
         } finally {
            try {
               var2.close();
            } catch (Exception var14) {
            }

         }

      }
   }

   public DataSkillEff(short var1, long var2, int var4, boolean var5) {
      new MyVector();
      this.frameChar = new byte[4][];
      new MyVector();
      this.idEff = 0;
      this.typeupdate = 0;
      this.indexSplash = new byte[4];
      this.isHead = false;
      this.v1 = new MyVector();
      this.v2 = new MyVector();
      this.v3 = new MyVector();
      this.v4 = new MyVector();
      this.v5 = new MyVector();
      this.v6 = new MyVector();
      this.v7 = new MyVector();
      new MyVector();
      this.idEff = var1;
      this.timelive = var2;
      this.miliSecondWait = var4;
      this.isHead = var5;
      this.loadnew((byte[])null);
      if (var2 == -1L) {
         this.typeupdate = 3;
      } else if (var2 == 0L) {
         this.typeupdate = 1;
      } else {
         this.timelive += System.currentTimeMillis();
         this.typeupdate = 2;
      }
   }

   public final void setTypeEff(long var1) {
      if (var1 == -1L) {
         this.typeupdate = 3;
      } else if (var1 == 0L) {
         this.typeupdate = 1;
      } else {
         this.typeupdate = 2;
      }
   }

   private static byte[] vector2arr(MyVector var0) {
      Object var1 = null;
      byte[] var3 = new byte[var0.size()];

      for(int var2 = 0; var2 < var3.length; ++var2) {
         var3[var2] = Byte.parseByte((String)var0.elementAt(var2));
      }

      return var3;
   }

   private boolean isHavedata() {
      if (this.isLoadData) {
         return true;
      } else {
         this.loadnew((byte[])null);
         return false;
      }
   }

   public final void paintBottomEff_new(mGraphics var1, int var2, int var3, int var4, int var5) {
      if (this.isHavedata()) {
         if (var4 < this.listFrame.size()) {
            FrameEff var17 = (FrameEff)this.listFrame.elementAt(var4);

            try {
               MyVector var18 = var17.listPartBottom;

               for(int var6 = 0; var6 < var18.size(); ++var6) {
                  PartFrame var7 = (PartFrame)var18.elementAt(var6);
                  SmallImage var8 = this.smallImage[var7.idSmallImg];
                  ImageIcon var9;
                  if ((var9 = GameData.getImgIcon((short)this.idEff)) != null && var9.img != null) {
                     int var10 = var7.dx;
                     int var11 = var8.w;
                     int var12 = var8.h;
                     short var13 = var8.x;
                     short var19 = var8.y;
                     int var14 = var9.img.getWidth();
                     int var15 = var9.img.getHeight();
                     if (var13 > var14) {
                        var13 = 0;
                     }

                     if (var19 > var15) {
                        var19 = 0;
                     }

                     if (var13 + var11 > var14) {
                        var11 = var14 - var13;
                     }

                     if (var19 + var12 > var15) {
                        var12 = var15 - var19;
                     }

                     var14 = var7.flip == 1 ? 2 : 0;
                     if (var5 == 2 || var5 == 6) {
                        if (var14 == 2) {
                           var14 = 0;
                        } else {
                           var14 = 2;
                        }

                        var10 = -(var10 + var11);
                     }

                     var1.drawRegion(var9.img, var13, var19, var11, var12, var14, var2 + var10, var3 + var7.dy, 0);
                  }
               }

               return;
            } catch (Exception var16) {
               var16.printStackTrace();
            }
         }

      }
   }

   public final void paintTopEff_new(mGraphics var1, int var2, int var3, int var4, int var5) {
      if (this.isHavedata()) {
         if (var4 < this.listFrame.size()) {
            FrameEff var17 = (FrameEff)this.listFrame.elementAt(var4);

            try {
               MyVector var18 = var17.listPartTop;

               for(int var6 = 0; var6 < var18.size(); ++var6) {
                  PartFrame var7 = (PartFrame)var18.elementAt(var6);
                  SmallImage var8 = this.smallImage[var7.idSmallImg];
                  ImageIcon var9;
                  if ((var9 = GameData.getImgIcon((short)this.idEff)) != null && var9.img != null) {
                     int var10 = var7.dx;
                     int var11 = var8.w;
                     int var12 = var8.h;
                     short var13 = var8.x;
                     short var19 = var8.y;
                     int var14 = var9.img.getWidth();
                     int var15 = var9.img.getHeight();
                     if (var13 > var14) {
                        var13 = 0;
                     }

                     if (var19 > var15) {
                        var19 = 0;
                     }

                     if (var13 + var11 > var14) {
                        var11 = var14 - var13;
                     }

                     if (var19 + var12 > var15) {
                        var12 = var15 - var19;
                     }

                     var14 = var7.flip == 1 ? 2 : 0;
                     if (var5 == 2 || var5 == 6) {
                        if (var14 == 2) {
                           var14 = 0;
                        } else {
                           var14 = 2;
                        }

                        var10 = -(var10 + var11);
                     }

                     var1.drawRegion(var9.img, var13, var19, var11, var12, var14, var2 + var10, var3 + var7.dy, 0);
                  }
               }

               return;
            } catch (Exception var16) {
               var16.printStackTrace();
            }
         }

      }
   }

   public final void paintTopEff(mGraphics var1, int var2, int var3) {
      try {
         if (!this.isHavedata()) {
            return;
         }

         if (this.wait) {
            return;
         }

         if (this.Frame < this.listFrame.size()) {
            MyVector var4 = ((FrameEff)this.listFrame.elementAt(this.Frame)).listPartTop;

            for(int var5 = 0; var5 < var4.size(); ++var5) {
               PartFrame var6 = (PartFrame)var4.elementAt(var5);
               SmallImage var7 = this.smallImage[var6.idSmallImg];
               ImageIcon var8;
               if ((var8 = GameData.getImgIcon((short)this.idEff)) != null && var8.img != null) {
                  short var9 = var6.dx;
                  int var10 = var7.w;
                  int var11 = var7.h;
                  short var12 = var7.x;
                  short var14 = var7.y;
                  if (var12 > var8.img.getWidth()) {
                     var12 = 0;
                  }

                  if (var14 > var8.img.getHeight()) {
                     var14 = 0;
                  }

                  if (var12 + var10 > var8.img.getWidth()) {
                     var10 = var8.img.getWidth() - var12;
                  }

                  if (var14 + var11 > var8.img.getHeight()) {
                     var11 = var8.img.getHeight() - var14;
                  }

                  var1.drawRegion(var8.img, var12, var14, var10, var11, var6.flip == 1 ? 2 : 0, var2 + var9, var3 + var6.dy, 0);
               }
            }

            return;
         }
      } catch (Exception var13) {
         var13.printStackTrace();
         System.err.println("Err DataSkillEff  paintBottomEff:" + this.idEff);
      }

   }

   public final void paintBottomEff(mGraphics var1, int var2, int var3) {
      try {
         if (!this.isHavedata()) {
            return;
         }

         if (this.wait) {
            return;
         }

         if (this.Frame < this.listFrame.size()) {
            MyVector var4 = ((FrameEff)this.listFrame.elementAt(this.Frame)).listPartBottom;

            for(int var5 = 0; var5 < var4.size(); ++var5) {
               PartFrame var6 = (PartFrame)var4.elementAt(var5);
               SmallImage var7 = this.smallImage[var6.idSmallImg];
               ImageIcon var8;
               if ((var8 = GameData.getImgIcon((short)this.idEff)) != null && var8.img != null) {
                  short var9 = var6.dx;
                  int var10 = var7.w;
                  int var11 = var7.h;
                  short var12 = var7.x;
                  short var14 = var7.y;
                  if (var12 > var8.img.getWidth()) {
                     var12 = 0;
                  }

                  if (var14 > var8.img.getHeight()) {
                     var14 = 0;
                  }

                  if (var12 + var10 > var8.img.getWidth()) {
                     var10 = var8.img.getWidth() - var12;
                  }

                  if (var14 + var11 > var8.img.getHeight()) {
                     var11 = var8.img.getHeight() - var14;
                  }

                  var1.drawRegion(var8.img, var12, var14, var10, var11, var6.flip == 1 ? 2 : 0, var2 + var9, var3 + var6.dy, 0);
               }
            }

            return;
         }
      } catch (Exception var13) {
         var13.printStackTrace();
         System.err.println("Err DataSkillEff  paintBottomEff:" + this.idEff);
      }

   }

   private void setWait(boolean var1) {
      if (this.miliSecondWait > 0) {
         this.wait = var1;
         if (this.wait) {
            this.timeWait = System.currentTimeMillis() + (long)this.miliSecondWait;
            return;
         }
      } else {
         this.wait = false;
      }

   }

   public final void update() {
      if (this.listFrame.size() > 0) {
         try {
            if (!this.wait) {
               switch(this.typeupdate) {
               case 0:
                  ++this.f;
                  if (this.f > this.sequence.length) {
                     this.wantDetroy = true;
                     this.f = 0;
                  }

                  this.Frame = this.sequence[this.f];
                  return;
               case 1:
                  ++this.f;
                  if (this.f > this.sequence.length) {
                     this.f = 0;
                     this.wantDetroy = true;
                  }

                  this.Frame = this.sequence[this.f];
                  return;
               case 2:
                  ++this.f;
                  if (this.timelive - System.currentTimeMillis() < 0L) {
                     this.wantDetroy = true;
                  }

                  if (this.f > this.sequence.length) {
                     this.f = 0;
                  }

                  this.Frame = this.sequence[this.f];
                  return;
               case 3:
                  ++this.f;
                  if (this.f > this.sequence.length) {
                     this.f = 0;
                     this.setWait(true);
                  }

                  this.Frame = this.sequence[this.f];
                  return;
               default:
                  return;
               }
            }

            if (this.timeWait - System.currentTimeMillis() < 0L) {
               this.setWait(false);
               return;
            }
         } catch (Exception var1) {
         }

      }
   }
}
