import javax.microedition.lcdui.Image;

public final class Input2Dlg extends Dialog implements IActionListener {
   private String[] info;
   public TField tfInput;
   public TField tfInput2;
   private int padLeft;
   private int focus;
   private int line;
   private int titleLenght;

   public Input2Dlg() {
      new Command("", 1000, (Object)null);
      this.tfInput = new TField();
      this.tfInput2 = new TField();
   }

   public final void setTitle(String var1, String var2) {
      this.titleLenght = mFont.tahoma_8b.getWidth(var1) > mFont.tahoma_8b.getWidth(var2) ? mFont.tahoma_8b.getWidth(var1) : mFont.tahoma_8b.getWidth(var2);
      this.padLeft = 40;
      this.focus = 0;
      if (GameCanvas.w <= 176) {
         this.padLeft = 10;
      }

      this.tfInput.x = this.padLeft + this.titleLenght + 10;
      this.tfInput.y = GameCanvas.h - 2 * mScreen.ITEM_HEIGHT - 50;
      this.tfInput.width = GameCanvas.w - 2 * this.padLeft - this.titleLenght - 20;
      this.tfInput.height = mScreen.ITEM_HEIGHT + 2;
      this.tfInput.isFocus = true;
      this.tfInput.title = var1;
      this.tfInput2.x = this.padLeft + this.titleLenght + 10;
      this.tfInput2.y = GameCanvas.h - mScreen.ITEM_HEIGHT - 43;
      this.tfInput2.width = GameCanvas.w - 2 * this.padLeft - this.titleLenght - 20;
      this.tfInput2.height = mScreen.ITEM_HEIGHT + 2;
      this.tfInput2.title = var2;
      super.right = this.tfInput.cmdClear;
   }

   public final void show(String var1, Command var2, Command var3, int var4, int var5) {
      this.tfInput.setText("");
      this.tfInput.getIputType(var4);
      this.tfInput2.setText("");
      this.tfInput2.getIputType(var5);
      this.info = mFont.tahoma_8b.splitFontArray(var1, GameCanvas.w - this.padLeft * 3);
      MyVector var6 = mFont.tahoma_8b.splitFontVector(var1, GameCanvas.w - this.padLeft * 3);
      this.line = var6.size();
      super.left = var2;
      super.center = var3;
      GameCanvas.currentDialog = this;
   }

   public final void paint(mGraphics var1) {
      GameCanvas.paintz.paintInputDlg(var1, this.padLeft, GameCanvas.h - 85 - mScreen.cmdH - this.line * 13, GameCanvas.w - (this.padLeft << 1), 80 + this.line * 13, this.info, (Image)null);
      mFont.tahoma_8b.drawString(var1, this.tfInput.title + ": ", this.tfInput.x - this.titleLenght - 5, this.tfInput.y + 5, 0);
      this.tfInput.paint(var1);
      var1.setClip(0, 0, GameCanvas.w, GameCanvas.h);
      mFont.tahoma_8b.drawString(var1, this.tfInput2.title + ": ", this.tfInput2.x - this.titleLenght - 5, this.tfInput2.y + 5, 0);
      this.tfInput2.paint(var1);
      super.paint(var1);
   }

   public final void keyPress(int var1) {
      if (this.focus == 0) {
         this.tfInput.keyPressed(var1);
      } else {
         this.tfInput2.keyPressed(var1);
      }

      super.keyPress(var1);
   }

   public final void update() {
      if (GameCanvas.keyPressedz[2]) {
         this.focus = 0;
      }

      if (GameCanvas.keyPressedz[8]) {
         this.focus = 1;
      }

      if (this.focus == 0) {
         this.tfInput.isFocus = true;
         this.tfInput2.isFocus = false;
         super.right = this.tfInput.cmdClear;
         this.tfInput.update();
      } else {
         this.tfInput.isFocus = false;
         this.tfInput2.isFocus = true;
         super.right = this.tfInput2.cmdClear;
         this.tfInput2.update();
      }

      if (GameCanvas.isTouch && GameCanvas.isPointerJustRelease && GameCanvas.isPointerClick) {
         if (GameCanvas.isPointerHoldIn(this.tfInput.x, this.tfInput.y, this.tfInput.width, this.tfInput.height)) {
            this.focus = 0;
         }

         if (GameCanvas.isPointerHoldIn(this.tfInput2.x, this.tfInput2.y, this.tfInput2.width, this.tfInput2.height)) {
            this.focus = 1;
         }
      }

      if (super.left != null) {
         super.left.x = GameCanvas.w / 2 - 160;
         super.left.y = GameCanvas.h - 26;
      }

      if (super.center != null) {
         super.center.x = GameCanvas.w / 2 - 35;
         super.center.y = GameCanvas.h - 26;
      }

      if (super.right != null) {
         super.right.x = GameCanvas.w / 2 + 88;
         super.right.y = GameCanvas.h - 26;
      }

      super.update();
   }

   public final void perform(int var1, Object var2) {
   }
}
