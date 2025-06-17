import javax.microedition.lcdui.Image;

public final class Menu implements IActionListener {
   public boolean showMenu;
   private MyVector menuItems;
   public int menuSelectedItem;
   private int menuX;
   private int menuY;
   private int menuW;
   private int menuH;
   private int menuTemY;
   private static int cmtoX;
   private static int cmx;
   private static int cmxLim;
   private static int xc;
   private Command left;
   private Command right;
   private Command center;
   private static Image imgbtnlBig0 = GameCanvas.loadImage("/hd/btnlBig0.png");
   private static Image imgbtnlBig1 = GameCanvas.loadImage("/hd/btnlBig1.png");
   boolean disableClose;
   public boolean showbyServer;
   private int w;
   private int pointerDownTime;
   private int pointerDownFirstX;
   private int[] pointerDownLastX;
   private boolean pointerIsDowning;
   private boolean isDownWhenRunning;
   private int waitToPerform;
   private int cmRun;
   public byte wait;
   private int cmvx;
   private int cmdx;

   public Menu() {
      this.left = new Command(mResources.SELECT, 0);
      this.right = GameCanvas.isTouch ? null : new Command(mResources.CLOSE, 0, GameCanvas.w - 71, GameCanvas.h - mScreen.cmdH + 1);
      this.center = null;
      this.pointerDownLastX = new int[3];
   }

   public final void startAt(MyVector var1) {
      this.disableClose = false;
      this.showbyServer = false;
      ChatPopup.currentMultilineChatPopup = null;
      InfoDlg.hide();
      if (var1.size() != 0) {
         this.menuItems = var1;
         this.menuW = 60;
         this.menuH = 60;

         for(int var2 = 0; var2 < var1.size(); ++var2) {
            Command var3 = (Command)var1.elementAt(var2);
            if (mFont.tahoma_7_yellow.getWidth(var3.caption) > this.menuW - 8) {
               var3.subCaption = mFont.tahoma_7_yellow.splitFontArray(var3.caption, this.menuW - 8);
            }
         }

         this.menuX = (GameCanvas.w - var1.size() * this.menuW) / 2;
         if (this.menuX < 1) {
            this.menuX = 1;
         }

         this.menuY = GameCanvas.h - this.menuH - (Paint.hTab + 1);
         if (GameCanvas.isTouch) {
            this.menuY -= 3;
         }

         this.menuTemY = this.menuY;
         this.showMenu = true;
         this.menuSelectedItem = 0;
         if ((cmxLim = this.menuItems.size() * this.menuW - GameCanvas.w) < 0) {
            cmxLim = 0;
         }

         cmtoX = 0;
         cmx = 0;
         xc = 50;
         this.w = var1.size() * this.menuW - 1;
         if (this.w > GameCanvas.w - 2) {
            this.w = GameCanvas.w - 2;
         }

         if (GameCanvas.isTouch) {
            this.menuSelectedItem = -1;
         }

      }
   }

   public final void updateMenuKey() {
      if (this.showMenu) {
         if (this.wait > 0) {
            --this.wait;
         }

         boolean var1 = false;
         if (!GameCanvas.keyPressedz[2] && !GameCanvas.keyPressedz[4]) {
            if (!GameCanvas.keyPressedz[8] && !GameCanvas.keyPressedz[6]) {
               if (GameCanvas.keyPressedz[5]) {
                  if (this.center != null) {
                     if (this.center.idAction > 0) {
                        if (this.center.actionListener == GameScr.gI()) {
                           GameScr.gI().actionPerform(this.center.idAction, this.center.p);
                        } else {
                           this.perform(this.center.idAction, this.center.p);
                        }
                     }
                  } else {
                     this.waitToPerform = 2;
                  }
               } else if (GameCanvas.keyPressedz[12]) {
                  if (this.left.idAction > 0) {
                     this.perform(this.left.idAction, this.left.p);
                  } else {
                     this.waitToPerform = 2;
                  }
               } else if (!this.disableClose && (GameCanvas.keyPressedz[13] || mScreen.getCmdPointerLast(this.right))) {
                  this.showMenu = false;
                  InfoDlg.hide();
                  if (this.showbyServer) {
                     Service.gI().menu((byte)1, Char.getMyChar().npcFocus.template.npcTemplateId, GameCanvas.menu.menuSelectedItem, 0);
                     this.showbyServer = false;
                  }
               }
            } else {
               var1 = true;
               ++this.menuSelectedItem;
               if (this.menuSelectedItem > this.menuItems.size() - 1) {
                  this.menuSelectedItem = 0;
               }
            }
         } else {
            var1 = true;
            --this.menuSelectedItem;
            if (this.menuSelectedItem < 0) {
               this.menuSelectedItem = this.menuItems.size() - 1;
            }
         }

         this.center = null;
         if (GameScr.isMessageMenu && !GameCanvas.isTouch) {
            ChatTab var2 = null;
            Command var3 = null;
            if (this.menuSelectedItem != -1) {
               var3 = (Command)this.menuItems.elementAt(this.menuSelectedItem);
               if ((var2 = ChatManager.gI().findTab(var3.caption)) != null && var2.type == 2) {
                  this.center = new Command(mResources.HIDE_TAB, this, 1000, var2);
               }
            }
         }

         if (var1) {
            if ((cmtoX = this.menuSelectedItem * this.menuW + this.menuW - GameCanvas.w / 2) > cmxLim) {
               cmtoX = cmxLim;
            }

            if (cmtoX < 0) {
               cmtoX = 0;
            }

            if (this.menuSelectedItem == this.menuItems.size() - 1 || this.menuSelectedItem == 0) {
               cmx = cmtoX;
            }
         }

         if (this.wait <= 0 && !this.disableClose && GameCanvas.isPointerJustRelease && !GameCanvas.isPointer(this.menuX, this.menuY, this.w, this.menuH) && !this.pointerIsDowning) {
            this.pointerDownTime = this.pointerDownFirstX = 0;
            this.pointerIsDowning = false;
            this.showMenu = false;
            GameCanvas.isPointerJustRelease = false;
            if (this.showbyServer) {
               Service.gI().menu((byte)1, Char.getMyChar().npcFocus.template.npcTemplateId, GameCanvas.menu.menuSelectedItem, 0);
               this.showbyServer = false;
            }

         } else {
            int var4;
            int var5;
            if (GameCanvas.isPointerDown) {
               if (!this.pointerIsDowning && GameCanvas.isPointer(this.menuX, this.menuY, this.w, this.menuH)) {
                  for(var4 = 0; var4 < this.pointerDownLastX.length; ++var4) {
                     this.pointerDownLastX[0] = GameCanvas.px;
                  }

                  this.pointerDownFirstX = GameCanvas.px;
                  this.pointerIsDowning = true;
                  this.isDownWhenRunning = this.cmRun != 0;
                  this.cmRun = 0;
               } else if (this.pointerIsDowning) {
                  ++this.pointerDownTime;
                  if (this.pointerDownTime > 5 && this.pointerDownFirstX == GameCanvas.px && !this.isDownWhenRunning) {
                     this.pointerDownFirstX = -1000;
                     this.menuSelectedItem = (cmtoX + GameCanvas.px - this.menuX) / this.menuW;
                  }

                  if ((var4 = GameCanvas.px - this.pointerDownLastX[0]) != 0 && this.menuSelectedItem != -1) {
                     this.menuSelectedItem = -1;
                  }

                  for(var5 = this.pointerDownLastX.length - 1; var5 > 0; --var5) {
                     this.pointerDownLastX[var5] = this.pointerDownLastX[var5 - 1];
                  }

                  this.pointerDownLastX[0] = GameCanvas.px;
                  if ((cmtoX -= var4) < 0) {
                     cmtoX = 0;
                  }

                  if (cmtoX > cmxLim) {
                     cmtoX = cmxLim;
                  }

                  if (cmx < 0 || cmx > cmxLim) {
                     var4 /= 2;
                  }

                  cmx -= var4;
               }
            }

            if (GameCanvas.isPointerJustRelease && this.pointerIsDowning) {
               var4 = GameCanvas.px - this.pointerDownLastX[0];
               GameCanvas.isPointerJustRelease = false;
               if (Res.abs(var4) < 20 && Res.abs(GameCanvas.px - this.pointerDownFirstX) < 20 && !this.isDownWhenRunning) {
                  this.cmRun = 0;
                  cmtoX = cmx;
                  this.pointerDownFirstX = -1000;
                  this.menuSelectedItem = (cmtoX + GameCanvas.px - this.menuX) / this.menuW;
                  this.pointerDownTime = 0;
                  this.waitToPerform = 10;
               } else if (this.menuSelectedItem != -1 && this.pointerDownTime > 5) {
                  this.pointerDownTime = 0;
                  this.waitToPerform = 1;
               } else if (this.menuSelectedItem == -1 && !this.isDownWhenRunning) {
                  if (cmx < 0) {
                     cmtoX = 0;
                  } else if (cmx > cmxLim) {
                     cmtoX = cmxLim;
                  } else {
                     byte var6;
                     if ((var5 = GameCanvas.px - this.pointerDownLastX[0] + (this.pointerDownLastX[0] - this.pointerDownLastX[1]) + (this.pointerDownLastX[1] - this.pointerDownLastX[2])) > 10) {
                        var6 = 10;
                     } else if (var5 < -10) {
                        var6 = -10;
                     } else {
                        var6 = 0;
                     }

                     this.cmRun = -var6 * 100;
                  }
               }

               this.pointerIsDowning = false;
               this.pointerDownTime = 0;
               GameCanvas.isPointerJustRelease = false;
            }

            GameCanvas.clearKeyPressed();
            GameCanvas.clearKeyHold();
         }
      }
   }

   public final void paintMenu(mGraphics var1) {
      try {
         var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
         var1.translate(-cmx, 0);
         int var2;
         String[] var3;
         int var4;
         int var5;
         if (GameCanvas.isTouch) {
            for(var2 = 0; var2 < this.menuItems.size(); ++var2) {
               if (var2 == this.menuSelectedItem) {
                  var1.drawImage(imgbtnlBig1, this.menuX + var2 * this.menuW + 1, this.menuTemY + 1, 0);
               } else {
                  var1.drawImage(imgbtnlBig0, this.menuX + var2 * this.menuW + 1, this.menuTemY + 1, 0);
               }

               if ((var3 = ((Command)this.menuItems.elementAt(var2)).subCaption) == null) {
                  var3 = new String[]{((Command)this.menuItems.elementAt(var2)).caption};
               }

               var4 = this.menuTemY + (this.menuH - var3.length * 14) / 2 + 1;

               for(var5 = 0; var5 < var3.length; ++var5) {
                  if (GameScr.isMessageMenu) {
                     if (ChatManager.gI().postWaitPerson(var3[var5])) {
                        if (GameCanvas.gameTick % 10 > 5) {
                           mFont.tahoma_7_red.drawString(var1, var3[var5], this.menuX + var2 * this.menuW + this.menuW / 2 - 2, var4 + var5 * 14, 2);
                        } else {
                           mFont.tahoma_7_yellow.drawString(var1, var3[var5], this.menuX + var2 * this.menuW + this.menuW / 2 - 2, var4 + var5 * 14, 2);
                        }
                     } else {
                        mFont.tahoma_7_yellow.drawString(var1, var3[var5], this.menuX + var2 * this.menuW + this.menuW / 2 - 2, var4 + var5 * 14, 2);
                     }
                  } else {
                     mFont.tahoma_7_yellow.drawString(var1, var3[var5], this.menuX + var2 * this.menuW + this.menuW / 2 - 2, var4 + var5 * 14, 2);
                  }
               }
            }
         } else {
            for(var2 = 0; var2 < this.menuItems.size(); ++var2) {
               if (var2 == this.menuSelectedItem) {
                  var1.drawImage(imgbtnlBig1, this.menuX + var2 * this.menuW + 1, this.menuTemY + 1 - 23, 0);
               } else {
                  var1.drawImage(imgbtnlBig0, this.menuX + var2 * this.menuW + 1, this.menuTemY + 1 - 23, 0);
               }

               if ((var3 = ((Command)this.menuItems.elementAt(var2)).subCaption) == null) {
                  var3 = new String[]{((Command)this.menuItems.elementAt(var2)).caption};
               }

               var4 = this.menuTemY + (this.menuH - var3.length * 14) / 2 + 1 - 23;

               for(var5 = 0; var5 < var3.length; ++var5) {
                  if (GameScr.isMessageMenu) {
                     if (ChatManager.gI().postWaitPerson(var3[var5])) {
                        if (GameCanvas.gameTick % 10 > 5) {
                           mFont.tahoma_7_red.drawString(var1, var3[var5], this.menuX + var2 * this.menuW + this.menuW / 2 - 2, var4 + var5 * 14, 2);
                        } else {
                           mFont.tahoma_7_yellow.drawString(var1, var3[var5], this.menuX + var2 * this.menuW + this.menuW / 2 - 2, var4 + var5 * 14, 2);
                        }
                     } else {
                        mFont.tahoma_7_yellow.drawString(var1, var3[var5], this.menuX + var2 * this.menuW + this.menuW / 2 - 2, var4 + var5 * 14, 2);
                     }
                  } else {
                     mFont.tahoma_7_yellow.drawString(var1, var3[var5], this.menuX + var2 * this.menuW + this.menuW / 2 - 2, var4 + var5 * 14, 2);
                  }
               }
            }
         }

         var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   public final void updateMenu() {
      if (this.cmRun != 0 && !this.pointerIsDowning) {
         if ((cmtoX += this.cmRun / 100) < 0) {
            cmtoX = 0;
         } else if (cmtoX > cmxLim) {
            cmtoX = cmxLim;
         } else {
            cmx = cmtoX;
         }

         this.cmRun = this.cmRun * 9 / 10;
         if (this.cmRun < 100 && this.cmRun > -100) {
            this.cmRun = 0;
         }
      }

      if (cmx != cmtoX && !this.pointerIsDowning) {
         this.cmvx = cmtoX - cmx << 2;
         this.cmdx += this.cmvx;
         cmx += this.cmdx >> 4;
         this.cmdx &= 15;
      }

      if (this.menuTemY > this.menuY) {
         int var1;
         if ((var1 = this.menuTemY - this.menuY >> 1) < 1) {
            var1 = 1;
         }

         this.menuTemY -= var1;
      }

      if (xc != 0 && (xc >>= 1) < 0) {
         xc = 0;
      }

      if (this.waitToPerform > 0) {
         --this.waitToPerform;
         GameScr.isMessageMenu = false;
         if (this.waitToPerform == 0) {
            this.showMenu = false;
            Command var2;
            if (this.menuSelectedItem >= 0 && (var2 = (Command)this.menuItems.elementAt(this.menuSelectedItem)) != null) {
               var2.performAction();
            }
         }
      }

   }

   public final void perform(int var1, Object var2) {
      if (var1 == 1000) {
         ChatTab var4 = (ChatTab)var2;
         this.menuItems.removeAllElements();
         ChatManager.gI().removeFromWaitList(var4.ownerName);
         ChatManager.gI().chatTabs.removeElement(var4);

         for(var1 = 0; var1 < ChatManager.gI().chatTabs.size(); ++var1) {
            ChatTab var5 = (ChatTab)ChatManager.gI().chatTabs.elementAt(var1);
            this.menuItems.addElement(new Command(var5.ownerName, (IActionListener)null, 12001, new Integer(var1)));
         }

         this.menuItems.addElement(new Command(mResources.BLOCK_MESSAGE, (IActionListener)null, 12006, (Object)null));
         this.menuItems.addElement(new Command(mResources.CHAT_ADMIN, (IActionListener)null, 12008, (Object)null));

         for(var1 = 0; var1 < this.menuItems.size(); ++var1) {
            Command var6 = (Command)this.menuItems.elementAt(var1);
            if (mFont.tahoma_7_yellow.getWidth(var6.caption) > this.menuW - 8) {
               var6.subCaption = mFont.tahoma_7_yellow.splitFontArray(var6.caption, this.menuW - 8);
            }
         }

         cmxLim = this.menuItems.size() * this.menuW - GameCanvas.w;
         if ((cmtoX = this.menuSelectedItem * this.menuW + this.menuW - GameCanvas.w / 2) > cmxLim) {
            cmtoX = cmxLim;
         }

         if (cmtoX < 0) {
            cmtoX = 0;
         }

         if (this.menuSelectedItem == this.menuItems.size() - 1 || this.menuSelectedItem == 0) {
            cmx = cmtoX;
         }
      }

   }
}
