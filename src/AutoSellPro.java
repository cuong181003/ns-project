import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

public final class AutoSellPro extends Auto {
   private static AutoSellPro sellerBN;
   public static Hashtable sellerAA = new Hashtable();
   private ItemSell sellerBO;
   public Char sellerAY;
   private int sellerBP;
   public long sellerAZ;
   public static String sellerBA;
   public static MyVector sellerBB = new MyVector();
   public static MyVector sellerBC = new MyVector();
   public static String[] sellerBD = null;
   public static String sellerBE = "";
   public static boolean sellerBF;
   public static long sellerBG = 6000L;
   public static long sellerBH = 0L;
   public static boolean sellerBI;
   private int sellerBQ = 0;
   public int sellerBJ = 0;
   private long sellerBR = 0L;
   public long sellerBK = 0L;
   private long sellerBS = 0L;
   public static int sellerBL = 30;
   private long sellerBT = 0L;
   private long sellerBU = 0L;
   private int sellerBV = -1;
   private int sellerBW = -1;
   public int sellerBM = 0;
   private int sellerBX = -1;
   private String sellerBY = null;
   private boolean sellerBZ = false;
   private int sellerCA = -1;

   private static void sellerAQ() {
      String var0;
      if ((var0 = RMS.loadRMSString("chipSellData")) != null && var0.length() > 0) {
         String[] var6 = Code.split(var0, "|");

         for(int var1 = 0; var1 < var6.length; ++var1) {
            String[] var2 = Code.split(var6[var1], ":");

            try {
               ItemTemplate var3 = ItemTemplates.get(Short.parseShort(var2[1]));
               int var4 = Integer.parseInt(var2[2]);
               if (var2[0].length() > 0 && var3 != null && var4 > 0) {
                  sellerAA.put(var2[0], new ItemSell(var3, var4, var2[0]));
               }
            } catch (NumberFormatException var5) {
            }
         }
      }

   }

   public static void sellerAN() {
      String var0 = "";
      if (!sellerAA.isEmpty()) {
         int var1 = 0;
         Enumeration var2 = sellerAA.keys();

         while(var2.hasMoreElements()) {
            String var3 = (String)var2.nextElement();
            ItemSell var4;
            if ((var4 = (ItemSell)sellerAA.get(var3)) != null) {
               if (var1 > 0) {
                  var0 = var0 + "|";
               }

               var0 = var0 + var3 + ":" + var4.template.id + ":" + var4.id;
               ++var1;
            }
         }
      }

      if (var0.length() > 0) {
         RMS.saveRMSString("chipSellData", var0);
      } else {
         RMS.deleteRecord("chipSellData");
      }
   }

   private static MyVector sellerAC(String var0) {
      MyVector var1 = new MyVector();
      if (var0 != null && var0.length() > 0) {
         String[] var4 = Code.split(var0, ";");

         for(int var2 = 0; var2 < var4.length; ++var2) {
            String var3;
            if ((var3 = var4[var2].trim()).length() > 0) {
               var1.addElement(sellerAA(var3));
            }
         }
      }

      return var1;
   }

   public static String sellerAA(String var0) {
      int var1;
      if ((var1 = var0.lastIndexOf(93)) != -1) {
         var0 = var0.substring(var1 + 1);
      }

      return var0;
   }

   public static AutoSellPro sellerAO() {
      if (sellerBN == null) {
         sellerBN = new AutoSellPro();
      }

      return sellerBN;
   }

   public final void update() {
      super.update();
      super.mapID = TileMap.mapID;
      super.zoneID = TileMap.zoneID;
      super.advAG = TileMap.isHang(TileMap.mapID);
      this.sellerBV = Char.getMyChar().cx;
      this.sellerBW = Char.getMyChar().cy;
      this.sellerBK = System.currentTimeMillis();
      this.sellerAR();
   }

   private void sellerAR() {
      if (GameCanvas.currentDialog != null) {
         GameCanvas.endDlg();
         if (this.sellerBM == 43) {
            Service.gI().cancelInviteTrade();
         }
      } else if (GameScr.isPaintTrade) {
         Service.gI().cancelTrade();
      } else {
         GameScr.gI().resetButton();
      }

      this.sellerBP = 0;
      this.sellerBM = 0;
      this.sellerBX = -1;
      this.sellerBY = null;
      this.sellerAY = null;
      this.sellerAZ = 0L;
      this.sellerBR = 0L;
      this.sellerBU = 0L;
      this.sellerBO = null;
      if (this.sellerBZ) {
         this.sellerBZ = false;
         Service.gI().bagSort();
      }

   }

   public final void sellerAA(String var1, String var2) {
      if (!sellerAA.isEmpty()) {
         if (var2.equals("Hiện tại không online.")) {
            if (sellerAE(var1)) {
               this.sellerBS = System.currentTimeMillis() - 55000L;
            }

         } else if (var2.indexOf("em an com chua") != -1 && sellerAE(var1)) {
            if (sellerAT() > 2) {
               Code.advAA(var1, "@cmdcall $" + TileMap.mapID + ":" + TileMap.zoneID + ":" + (sellerAT() - 2) + " " + sellerAV() + "# " + Code.randomz(10, 99));
            } else {
               Code.sellerAB(var1, "em an com roi");
            }
         } else if (var2.indexOf("chua co hang goi cc") != -1 && sellerAE(var1)) {
            this.sellerBS = System.currentTimeMillis() - 55000L;
         } else if (!var2.startsWith("buy") && !var2.startsWith("mua")) {
            sellerAB(var1);
         } else if (this.sellerAY != null) {
            if (!this.sellerAY.cName.equals(var1)) {
               Code.sellerAB(var1, "Mình đang giao dịch với người khác bạn chờ chút nhé!");
            }

         } else {
            long var3;
            if ((var3 = System.currentTimeMillis() - this.sellerBR) <= 34000L) {
               Code.sellerAB(var1, "Mình chỉ có thể giao dịch sau " + (35 - (int)(var3 / 1000L)) + " giây nữa.");
            } else {
               String[] var6;
               if ((var6 = Code.split(var2, " ")).length >= 3) {
                  if (!sellerAA.containsKey(var6[2])) {
                     sellerAB(var1);
                     return;
                  }

                  try {
                     int var7;
                     if ((var7 = Integer.parseInt(var6[1])) <= 0) {
                        sellerAB(var1);
                        return;
                     }

                     this.sellerBO = (ItemSell)sellerAA.get(var6[2]);
                     if (this.sellerBO != null) {
                        this.sellerBP = this.sellerBO.template.isUpToUp ? var7 : (var7 < 12 ? var7 : 12);
                        this.sellerBY = var1;
                        this.sellerBM = 1;
                        return;
                     }

                     sellerAA.remove(var6[2]);
                     sellerAN();
                     System.out.println("Lỗi get data");
                     return;
                  } catch (NumberFormatException var5) {
                  }
               }

               sellerAB(var1);
            }
         }
      }
   }

   public static ItemSell sellerAA(short var0) {
      if (!sellerAA.isEmpty()) {
         Enumeration var1 = sellerAA.keys();

         while(var1.hasMoreElements()) {
            String var2 = (String)var1.nextElement();
            ItemSell var3;
            if ((var3 = (ItemSell)sellerAA.get(var2)) != null && var3.template.id == var0) {
               return var3;
            }
         }
      }

      return null;
   }

   public static MyVector sellerAP() {
      MyVector var0 = new MyVector();
      if (!sellerAA.isEmpty()) {
         int var1 = 1;
         Enumeration var2 = sellerAA.keys();

         while(var2.hasMoreElements()) {
            String var3 = (String)var2.nextElement();
            ItemSell var4;
            if ((var4 = (ItemSell)sellerAA.get(var3)) != null) {
               var0.addElement(var1 + ". Mã VP: " + var4.name + " (" + var4.template.name + ")");
               var0.addElement("- Giá bán: " + NinjaUtil.numberToString(String.valueOf(var4.id)) + " xu / 1 cái");
               ++var1;
            }
         }
      }

      return var0;
   }

   public final void sellerAA(int var1, String var2) {
      this.sellerBX = var1;
      this.sellerBY = var2;
      this.sellerBM = 43;
   }

   private Char sellerAS() {
      if (this.sellerBX != -1) {
         return GameScr.findCharInMap(this.sellerBX);
      } else {
         return this.sellerBY != null && this.sellerBY.length() > 0 ? GameScr.advAA(this.sellerBY) : null;
      }
   }

   private static boolean sellerAD(String var0) {
      return sellerBB.size() > 0 && sellerBB.contains(sellerAA(var0));
   }

   private static boolean sellerAE(String var0) {
      return sellerBC.size() > 0 && sellerBC.contains(sellerAA(var0));
   }

   private static boolean sellerAF(String var0) {
      return sellerBA != null && sellerAA(sellerBA).equals(sellerAA(var0));
   }

   public static void sellerAB(String var0) {
      if (!sellerAA.isEmpty()) {
         if (!ChatSellPro.sellerAA) {
            (new ChatSellPro(var0)).sellerAA();
         }
      }
   }

   public static int sellerAB(short var0) {
      int var1 = 0;

      for(int var2 = 0; var2 < Char.getMyChar().arrItemBag.length; ++var2) {
         Item var3;
         if ((var3 = Char.getMyChar().arrItemBag[var2]) != null && !var3.isLock && var3.template.id == var0) {
            if (var3.template.isUpToUp) {
               var1 += var3.quantity;
            } else {
               ++var1;
            }
         }
      }

      return var1;
   }

   private static int sellerAT() {
      int var0 = 0;

      for(int var1 = 0; var1 < Char.getMyChar().arrItemBag.length; ++var1) {
         if (Char.getMyChar().arrItemBag[var1] == null) {
            ++var0;
         }
      }

      return var0;
   }

   private static boolean sellerAU() {
      if (!sellerAA.isEmpty()) {
         Enumeration var0 = sellerAA.keys();

         while(var0.hasMoreElements()) {
            String var1 = (String)var0.nextElement();
            ItemSell var2;
            if ((var2 = (ItemSell)sellerAA.get(var1)) != null && sellerAB(var2.template.id) > 0) {
               return true;
            }
         }
      }

      return false;
   }

   private static int sellerAA(short var0, int var1) {
      for(int var2 = 0; var2 < Char.getMyChar().arrItemBag.length; ++var2) {
         Item var3;
         if ((var3 = Char.getMyChar().arrItemBag[var2]) != null && !var3.isLock && var3.template.id == var0 && var3.quantity == var1) {
            return var3.indexUI;
         }
      }

      return -1;
   }

   private static String sellerAV() {
      String var0 = "";
      if (!sellerAA.isEmpty()) {
         int var1 = 0;
         Enumeration var2 = sellerAA.keys();

         while(var2.hasMoreElements()) {
            String var3 = (String)var2.nextElement();
            ItemSell var4;
            if ((var4 = (ItemSell)sellerAA.get(var3)) != null) {
               if (var1 > 0) {
                  var0 = var0 + ":";
               }

               var0 = var0 + String.valueOf(var4.template.id);
               ++var1;
            }
         }
      }

      return var0;
   }

   public final void auto() {
      if (Auto.isMyCharInactive()) {
         this.sellerAR();
         Auto.advAA(true);
      } else if (sellerAA.isEmpty()) {
         GameScr.paint("Bạn không bán vật phẩm nào!");
         Code.endAuto();
      } else if (super.mapID == TileMap.mapID && super.zoneID == TileMap.zoneID) {
         if (this.sellerBX == -1 && (this.sellerBY == null || this.sellerBY.equals(""))) {
            if (GameCanvas.currentDialog != null) {
               GameCanvas.endDlg();
               if (this.sellerBM == 43) {
                  Service.gI().cancelInviteTrade();
               }
            }

            if (GameScr.isPaintTrade) {
               GameScr.gI().resetButton();
            }

            if (this.sellerBV != -1 && this.sellerBW != -1 && (Math.abs(this.sellerBV - Char.getMyChar().cx) > 24 || Math.abs(this.sellerBW - Char.getMyChar().cy) > 24)) {
               Char.moveToChar(this.sellerBV, this.sellerBW);
            } else {
               Code.instance.advAO();
               if (sellerBC != null && sellerBC.size() > 0 && System.currentTimeMillis() - this.sellerBK > (long)sellerBL * 60000L && System.currentTimeMillis() - this.sellerBS > 60000L) {
                  if (sellerAT() > 2) {
                     if (this.sellerBJ >= sellerBC.size()) {
                        this.sellerBJ = 0;
                     }

                     String var7;
                     if ((var7 = (String)sellerBC.elementAt(this.sellerBJ)) == null || var7.length() <= 0) {
                        return;
                     }

                     if (this.sellerCA != this.sellerBJ) {
                        this.sellerBS = System.currentTimeMillis();
                        if (this.sellerCA == -1 || this.sellerCA > sellerBC.size() - 1) {
                           this.sellerCA = this.sellerBJ;
                        }

                        ++this.sellerBJ;
                        Code.advAA(var7, "@cmdcall $" + TileMap.mapID + ":" + TileMap.zoneID + ":" + (sellerAT() - 2) + " " + sellerAV() + "# " + Code.randomz(10, 99));
                        return;
                     }

                     this.sellerCA = -1;
                  }

                  this.sellerBK = System.currentTimeMillis();
               } else {
                  this.sellerAX();
               }
            }
         } else {
            this.sellerAY = this.sellerAS();

            try {
               int var10001;
               long var2;
               long var4;
               switch(this.sellerBM) {
               case -57:
                  if (System.currentTimeMillis() - this.sellerBU > 2000L) {
                     this.sellerAR();
                  }
                  break;
               case -46:
                  if (this.sellerAY == null) {
                     this.sellerAR();
                     return;
                  }

                  if (System.currentTimeMillis() - this.sellerBT > 16000L) {
                     this.sellerAR();
                     return;
                  }
                  break;
               case -45:
                  if (this.sellerAY == null) {
                     this.sellerAR();
                     return;
                  }

                  if (System.currentTimeMillis() - this.sellerAZ > 30000L) {
                     Code.sellerAB(this.sellerAY.cName, "Bạn không đồng ý giao dịch?");
                     this.sellerAR();
                     return;
                  }
                  break;
               case -43:
                  if (this.sellerAY == null) {
                     this.sellerAR();
                     return;
                  }

                  if (System.currentTimeMillis() - this.sellerAZ > 10000L) {
                     this.sellerAR();
                     return;
                  }
                  break;
               case -37:
                  if (this.sellerAY == null) {
                     this.sellerAR();
                     return;
                  }

                  if (System.currentTimeMillis() - this.sellerAZ >= 60000L) {
                     Code.advAA(this.sellerAY.cName, "Bạn không khóa giao dịch?");
                     this.sellerAR();
                     return;
                  }
                  break;
               case -1:
                  if (this.sellerAY == null) {
                     this.sellerAR();
                     return;
                  }

                  if (System.currentTimeMillis() - this.sellerAZ >= 35000L) {
                     Code.sellerAB(this.sellerAY.cName, "Bạn không đồng ý lời mời giao dịch?");
                     this.sellerAR();
                     return;
                  }
                  break;
               case 1:
                  if (this.sellerAY == null) {
                     if (this.sellerBY != null && this.sellerBY.length() > 0) {
                        Code.sellerAB(this.sellerBY, "Hãy đến " + TileMap.mapName + " khu " + TileMap.zoneID + " để giao dịch!");
                     }

                     this.sellerAR();
                     return;
                  }

                  int var1;
                  if ((var1 = sellerAB(this.sellerBO.template.id)) == 0) {
                     if (!sellerAU() && sellerAT() > 2) {
                        if ((var2 = System.currentTimeMillis() - this.sellerBK) >= 300000L) {
                           this.sellerBK = 0L;
                        } else {
                           var4 = 300000L - var2;
                           this.sellerBK = System.currentTimeMillis() - ((long)sellerBL * 60000L - var4);
                        }
                     }

                     Code.sellerAB(this.sellerAY.cName, "Mình đã hết hàng, bạn quay lại sau nhé!");
                     this.sellerAR();
                     return;
                  }

                  if (this.sellerBP > var1) {
                     Code.sellerAB(this.sellerAY.cName, "Mình chỉ còn " + var1 + " vật phẩm, nếu cần hãy chat: mua " + var1 + " " + this.sellerBO.name);
                     this.sellerAR();
                     return;
                  }

                  if (this.sellerBO.template.isUpToUp && sellerAA(this.sellerBO.template.id, this.sellerBP) == -1) {
                     Item var9 = null;

                     for(int var11 = 0; var11 < Char.getMyChar().arrItemBag.length; ++var11) {
                        Item var5;
                        if ((var5 = Char.getMyChar().arrItemBag[var11]) != null && !var5.isLock && var5.template.id == this.sellerBO.template.id && var5.quantity > this.sellerBP) {
                           var9 = var5;
                           break;
                        }
                     }

                     if (var9 == null) {
                        Code.advAA(this.sellerAY.cName, "Lỗi chọn vật phẩm. Hãy thử lại!");
                        this.sellerBZ = true;
                        this.sellerAR();
                        return;
                     }

                     Service.gI().inputNumSplit(var9.indexUI, this.sellerBP);
                     LockGame.advAS();
                     if (sellerAA(this.sellerBO.template.id, this.sellerBP) == -1) {
                        Code.advAA(this.sellerAY.cName, "Lỗi chọn vật phẩm. Hãy thử lại!");
                        this.sellerAR();
                        return;
                     }

                     this.sellerBZ = true;
                  }

                  if ((Math.abs(Char.getMyChar().cx - this.sellerAY.cx) > 60 || Math.abs(Char.getMyChar().cy - this.sellerAY.cy) > 40) && !Char.advAD(this.sellerAY.cx, this.sellerAY.cy)) {
                     Code.sellerAB(this.sellerAY.cName, "Hãy đứng ở nơi dễ giao dịch");
                     this.sellerAR();
                     return;
                  }

                  Code.sellerAB(this.sellerAY.cName, "Bạn mua (" + this.sellerBP + ") " + this.sellerBO.template.name + " cần phải trả " + NinjaUtil.numberToString(String.valueOf(this.sellerBP * this.sellerBO.id)) + " xu.");
                  Auto.sleep(3000L);
                  this.sellerBM = -1;
                  this.sellerAZ = System.currentTimeMillis();
                  this.sellerBR = System.currentTimeMillis();
                  Service.gI().tradeInvite(this.sellerAY.charID);
                  return;
               case 37:
                  if (this.sellerAY == null) {
                     this.sellerAR();
                     return;
                  }

                  if (GameScr.isPaintTrade && GameScr.arrItemTradeOrder != null) {
                     if (!sellerAE(this.sellerAY.cName) && !sellerAF(this.sellerAY.cName) && !sellerAD(this.sellerAY.cName)) {
                        int var8;
                        if (this.sellerBO.template.isUpToUp) {
                           if ((var8 = sellerAA(this.sellerBO.template.id, this.sellerBP)) != -1) {
                              GameScr.indexSelect = var8;
                              GameScr.gI().actTradeSelectItem();
                              Auto.sleep(1000L);
                              this.sellerBM = -37;
                              this.sellerAZ = System.currentTimeMillis();
                              GameScr.gI().actTradeLock();
                              return;
                           }

                           Code.advAA(this.sellerAY.cName, "Lỗi chọn vật phẩm 2");
                           this.sellerAR();
                           return;
                        }

                        var8 = 0;

                        for(int var3 = 0; var3 < Char.getMyChar().arrItemBag.length; ++var3) {
                           Item var10;
                           if ((var10 = Char.getMyChar().arrItemBag[var3]) != null && !var10.isLock && var10.template.id == this.sellerBO.template.id) {
                              GameScr.indexSelect = var3;
                              GameScr.gI().actTradeSelectItem();
                              ++var8;
                              if (var8 >= this.sellerBP || var8 >= 12) {
                                 break;
                              }
                           }
                        }

                        Auto.sleep(1000L);
                        this.sellerBM = -37;
                        this.sellerAZ = System.currentTimeMillis();
                        GameScr.gI().actTradeLock();
                        return;
                     }

                     if (sellerAF(this.sellerAY.cName)) {
                        GameScr.gI().coinTrade = Char.getMyChar().xu;
                        Char.getMyChar().xu = 0;
                     }

                     this.sellerBM = -37;
                     this.sellerAZ = System.currentTimeMillis();
                     return;
                  }

                  if (System.currentTimeMillis() - this.sellerAZ > 35000L) {
                     this.sellerAR();
                     return;
                  }
                  break;
               case 43:
                  if (this.sellerAY == null) {
                     this.sellerAR();
                     return;
                  }

                  if (!sellerAE(this.sellerAY.cName) && !sellerAF(this.sellerAY.cName) && !sellerAD(this.sellerAY.cName)) {
                     Auto.sleep(1000L);
                     sellerAB(this.sellerAY.cName);
                     this.sellerAR();
                     return;
                  }

                  if (sellerAE(this.sellerAY.cName)) {
                     Code.advAA(this.sellerAY.cName, "@cmdmax $" + (sellerAT() - 2) + "# " + Code.randomz(10, 99));
                  }

                  Auto.sleep(1000L);
                  this.sellerBM = -43;
                  this.sellerAZ = System.currentTimeMillis();
                  Service.gI().acceptInviteTrade(this.sellerAY.charID);
                  return;
               case 45:
                  if (this.sellerAY == null) {
                     this.sellerAR();
                     return;
                  }

                  if (GameScr.gI().typeTradeOrder > 0) {
                     if (!sellerAE(this.sellerAY.cName) && !sellerAF(this.sellerAY.cName) && !sellerAD(this.sellerAY.cName)) {
                        var10001 = this.sellerBP * this.sellerBO.id;
                        if (GameScr.gI().coinTradeOrder < var10001) {
                           Code.sellerAB(this.sellerAY.cName, "Bạn cần phải giao dịch " + NinjaUtil.numberToString(String.valueOf(this.sellerBP * this.sellerBO.id)) + " xu.");
                           this.sellerAR();
                           return;
                        }

                        if (sellerAW()) {
                           Code.sellerAB(this.sellerAY.cName, "Chỉ giao dịch xu. Please!");
                           this.sellerAR();
                           return;
                        }
                     }

                     if (GameScr.gI().typeTrade == 0) {
                        Auto.sleep(1000L);
                        GameScr.gI().actTradeLock();
                     }

                     this.sellerBM = -45;
                     this.sellerAZ = System.currentTimeMillis();
                     this.sellerBT = System.currentTimeMillis();
                     return;
                  }

                  if (System.currentTimeMillis() - this.sellerAZ > 10000L) {
                     this.sellerAR();
                     return;
                  }
                  break;
               case 46:
                  if (this.sellerAY == null) {
                     this.sellerAR();
                     return;
                  }

                  if (GameScr.gI().typeTradeOrder >= 2 && System.currentTimeMillis() - this.sellerBT >= 6000L) {
                     if (!sellerAE(this.sellerAY.cName) && !sellerAF(this.sellerAY.cName) && !sellerAD(this.sellerAY.cName)) {
                        var10001 = this.sellerBP * this.sellerBO.id;
                        if (GameScr.gI().coinTradeOrder < var10001) {
                           Code.sellerAB(this.sellerAY.cName, "Không làm mà muốn có ăn thì chỉ có ăn cứt thôi, ăn cái đầu buồi!");
                           this.sellerAR();
                           return;
                        }

                        if (sellerAW()) {
                           Code.sellerAB(this.sellerAY.cName, "Chỉ giao dịch xu. Please!");
                           this.sellerAR();
                           return;
                        }
                     }

                     this.sellerBM = -46;
                     this.sellerAZ = System.currentTimeMillis();
                     GameScr.gI().actTradeAccept();
                     return;
                  }

                  if (System.currentTimeMillis() - this.sellerAZ > 16000L) {
                     this.sellerAR();
                     return;
                  }
                  break;
               case 57:
                  this.sellerBU = System.currentTimeMillis();
                  this.sellerBM = -57;
                  return;
               case 58:
                  this.sellerBZ = false;
                  if (this.sellerAY == null) {
                     this.sellerAR();
                     return;
                  }

                  if (sellerAE(this.sellerAY.cName)) {
                     this.sellerBS = System.currentTimeMillis();
                  } else if (!sellerAF(this.sellerAY.cName) && !sellerAD(this.sellerAY.cName)) {
                     if (!sellerAU() && sellerAT() > 2) {
                        if ((var2 = System.currentTimeMillis() - this.sellerBK) >= 300000L) {
                           this.sellerBK = 0L;
                        } else {
                           var4 = 300000L - var2;
                           this.sellerBK = System.currentTimeMillis() - ((long)sellerBL * 60000L - var4);
                        }
                     }

                     Code.sellerAB(this.sellerAY.cName, "Cám ơn bạn đã mua hàng. Lần sau lại quay lại nhé!");
                  }

                  this.sellerAR();
                  return;
               }

            } catch (Exception var6) {
            }
         }
      } else {
         super.remap(super.mapID, super.zoneID, this.sellerBV, this.sellerBW);
      }
   }

   private static boolean sellerAW() {
      if (GameScr.arrItemTradeOrder != null) {
         for(int var0 = 0; var0 < GameScr.arrItemTradeOrder.length; ++var0) {
            if (GameScr.arrItemTradeOrder[var0] != null) {
               return true;
            }
         }
      }

      return false;
   }

   private void sellerAX() {
      if (sellerBI && sellerBD != null && System.currentTimeMillis() - sellerBH > sellerBG) {
         if (this.sellerBQ >= sellerBD.length) {
            this.sellerBQ = 0;
         }

         Code.sellerAJ(sellerBD[this.sellerBQ]);
         ++this.sellerBQ;
         sellerBH = System.currentTimeMillis();
      }

   }

   public final String toString() {
      return "Auto bán hàng";
   }

   static {
      byte[] var0;
      if ((var0 = RMS.loadRMS("AutoSellSettings")) != null) {
         ByteArrayInputStream var11 = new ByteArrayInputStream(var0);
         DataInputStream var1 = new DataInputStream(var11);

         try {
            sellerBL = var1.readInt();
            sellerBC = sellerAC(var1.readUTF());
            sellerBA = var1.readUTF();
            sellerBB = sellerAC(var1.readUTF());
            sellerBE = var1.readUTF();
            sellerBI = var1.readBoolean();
            sellerBG = var1.readLong();
            sellerBF = var1.readBoolean();
         } catch (IOException var9) {
            RMS.deleteRecord("AutoSellSettings");
         } finally {
            try {
               var1.close();
               var11.close();
            } catch (IOException var8) {
            }

         }
      }

      if (sellerBE != null && sellerBE.length() > 0) {
         sellerBD = Code.split(sellerBE, "/n/");
      }

      sellerAQ();
   }
}
