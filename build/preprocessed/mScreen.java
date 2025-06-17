public class mScreen {
   public Command left;
   public Command center;
   public Command right;
   public static final int ITEM_HEIGHT;
   public static int cmdW;
   public static int cmdH;
   public static int keyTouch;

   static {
      ITEM_HEIGHT = mFont.tahoma_8b.getHeight() + 8;
      cmdW = 70 * mGraphics.zoomLevel;
      cmdH = 22;
      keyTouch = -1;
   }

   public void switchToMe() {
      GameCanvas.clearKeyPressed();
      GameCanvas.clearKeyHold();
      if (GameCanvas.currentScreen != null) {
         GameCanvas.currentScreen.unLoad();
      }

      GameCanvas.currentScreen = this;
      boolean var1 = true;
      MotherCanvas.instance.setFullScreenMode(true);
   }

   public void unLoad() {
   }

   public static void initPos() {
      if (GameCanvas.isTouch) {
         cmdH = 26;
      } else {
         cmdH = 24;
      }
   }

   public void keyPress(int var1) {
   }

   public void update() {
   }

   public void updateKey() {
      if (GameCanvas.keyPressedz[5] || getCmdPointerLast(GameCanvas.currentScreen.center)) {
         GameCanvas.keyPressedz[5] = false;
         keyTouch = -1;
         GameCanvas.isPointerJustRelease = false;
         if (this.center != null) {
            this.center.performAction();
         }
      }

      if (GameCanvas.keyPressedz[12] || getCmdPointerLast(GameCanvas.currentScreen.left)) {
         GameCanvas.keyPressedz[12] = false;
         keyTouch = -1;
         GameCanvas.isPointerJustRelease = false;
         if (ChatTextField.gI().isShow) {
            if (ChatTextField.gI().left != null) {
               ChatTextField.gI().left.performAction();
            }
         } else if (this.left != null) {
            this.left.performAction();
         }
      }

      if (GameCanvas.keyPressedz[13] || getCmdPointerLast(GameCanvas.currentScreen.right)) {
         GameCanvas.keyPressedz[13] = false;
         keyTouch = -1;
         GameCanvas.isPointerJustRelease = false;
         if (ChatTextField.gI().isShow) {
            if (ChatTextField.gI().right != null) {
               ChatTextField.gI().right.performAction();
               return;
            }
         } else if (this.right != null) {
            this.right.performAction();
         }
      }

   }

   public static boolean getCmdPointerLast(Command var0) {
      if (var0 == null) {
         return false;
      } else if (var0.x != 0 && var0.y != 0) {
         return var0.input();
      } else {
         if (GameCanvas.currentDialog != null) {
            if (GameCanvas.currentDialog.center != null && GameCanvas.isPointerHoldIn(GameCanvas.w - cmdW >> 1, GameCanvas.h - cmdH - 5, cmdW, cmdH + 10)) {
               keyTouch = 1;
               if (var0 == GameCanvas.currentDialog.center && GameCanvas.isPointerClick && GameCanvas.isPointerJustRelease) {
                  return true;
               }
            }

            if (GameCanvas.currentDialog.left != null && GameCanvas.isPointerHoldIn(0, GameCanvas.h - cmdH - 5, cmdW, cmdH + 10)) {
               keyTouch = 0;
               if (var0 == GameCanvas.currentDialog.left && GameCanvas.isPointerClick && GameCanvas.isPointerJustRelease) {
                  return true;
               }
            }

            if (GameCanvas.currentDialog.right != null && GameCanvas.isPointerHoldIn(GameCanvas.w - cmdW, GameCanvas.h - cmdH - 5, cmdW, cmdH + 10)) {
               keyTouch = 2;
               if ((var0 == GameCanvas.currentDialog.right || var0 == ChatTextField.gI().right) && GameCanvas.isPointerClick && GameCanvas.isPointerJustRelease) {
                  return true;
               }
            }
         } else {
            if (var0 == GameCanvas.currentScreen.left && GameCanvas.isPointerHoldIn(0, GameCanvas.h - cmdH - 5, cmdW, cmdH + 10)) {
               keyTouch = 0;
               if (GameCanvas.isPointerClick && GameCanvas.isPointerJustRelease) {
                  return true;
               }
            }

            if (var0 == GameCanvas.currentScreen.right && GameCanvas.isPointerHoldIn(GameCanvas.w - cmdW, GameCanvas.h - cmdH - 5, cmdW, cmdH + 10)) {
               keyTouch = 2;
               if (GameCanvas.isPointerClick && GameCanvas.isPointerJustRelease) {
                  return true;
               }
            }

            if ((var0 == GameCanvas.currentScreen.center || ChatPopup.currentMultilineChatPopup != null) && GameCanvas.isPointerHoldIn(GameCanvas.w - cmdW >> 1, GameCanvas.h - cmdH - 5, cmdW, cmdH + 10)) {
               keyTouch = 1;
               if (GameCanvas.isPointerClick && GameCanvas.isPointerJustRelease) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public void paint(mGraphics var1) {
      var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
      var1.setClip(0, 0, GameCanvas.w, GameCanvas.h + 1);
      Paint.nsoAA(var1);
      if (ChatPopup.currentMultilineChatPopup != null) {
         Paint.paintCmdBar(var1, (Command)null, ChatPopup.currentMultilineChatPopup.cmdNextLine, (Command)null);
      } else if (ChatTextField.gI().isShow) {
         Paint.paintCmdBar(var1, ChatTextField.gI().left, ChatTextField.gI().center, ChatTextField.gI().right);
      } else {
         if (GameCanvas.currentDialog == null && !GameCanvas.menu.showMenu) {
            Paint.paintCmdBar(var1, this.left, this.center, this.right);
         }

      }
   }
}
