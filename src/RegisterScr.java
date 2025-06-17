public final class RegisterScr extends mScreen implements IActionListener {
   public static RegisterScr instance;
   private int xPanel;
   private int yPanel;
   private int wPanel;
   private int hPanel;
   private int wC;
   private int xT;
   private int focus;
   private TField[] tf = new TField[7];
   private String[] menuName = new String[]{"Họ và tên", "Ngày-tháng-năm sinh", "Địa chỉ thường trú", "CMND", "Ngày cấp(dd-mm-yyyy)", "Nơi cấp", "Số điện thoại, địa chỉ thư điện tử (nếu có).", "* Dưới 18 tuổi chỉ có thể chơi 180p 1 ngày"};
   private String[] menuInfo = new String[]{"", "", "", "", "", "", "", ""};
   public Scroll scroll = new Scroll();

   public RegisterScr() {
      instance = this;
      this.xPanel = GameCanvas.hw - 100;
      this.yPanel = 10;
      this.wPanel = 200;
      this.hPanel = GameCanvas.h - 40;
      this.wC = this.wPanel - 40;
      this.xT = GameCanvas.hw - this.wC / 2;

      for(int var1 = 0; var1 < this.tf.length; ++var1) {
         this.tf[var1] = new TField();
         this.tf[var1].name = this.menuName[var1];
         this.tf[var1].x = this.xT;
         this.tf[var1].y = (var1 + 1) * 50;
         this.tf[var1].width = this.wC;
         this.tf[var1].height = mScreen.ITEM_HEIGHT + 2;
         this.tf[var1].isFocus = false;
         this.tf[var1].getIputType(3);
         this.tf[var1].setText(this.menuInfo[var1]);
         if (var1 == 0) {
            this.tf[var1].isFocus = true;
         }
      }

      super.left = new Command(mResources.REGISTER, this, 1, (Object)null);
   }

   public final void update() {
      super.update();
      if (++GameScr.cmx > GameCanvas.w * 3 + 100) {
         GameScr.cmx = 100;
      }

      int var1;
      for(var1 = 0; var1 < this.tf.length; ++var1) {
         this.tf[var1].update();
      }

      new ScrollResult();
      ScrollResult var2 = null;
      if ((var2 = this.scroll.updateKey()).isDowning || var2.isFinish) {
         this.focus = (byte)var2.selected;
      }

      this.scroll.updatecm();
      var2.getClass();
      if (this.focus == -1) {
         for(var1 = 0; var1 < this.tf.length; ++var1) {
            this.tf[var1].isFocus = false;
         }
      }

   }

   public final void keyPress(int var1) {
      super.keyPress(var1);

      for(int var2 = 0; var2 < this.tf.length; ++var2) {
         if (this.tf[var2].isFocus) {
            this.tf[var2].keyPressed(var1);
         }
      }

   }

   public final void updateKey() {
      if (GameCanvas.keyPressedz[2]) {
         --this.focus;
         if (this.focus < 0) {
            this.focus = this.menuName.length;
         }

         this.scroll.moveTo(this.focus * this.scroll.ITEM_SIZE);
      } else if (GameCanvas.keyPressedz[8]) {
         ++this.focus;
         if (this.focus > this.menuName.length) {
            this.focus = 0;
         }

         this.scroll.moveTo(this.focus * this.scroll.ITEM_SIZE);
      }

      int var1;
      if (GameCanvas.keyPressedz[2] || GameCanvas.keyPressedz[8]) {
         GameCanvas.clearKeyPressed();

         for(var1 = 0; var1 < this.tf.length; ++var1) {
            this.tf[var1].isFocus = false;
         }

         if (this.focus < this.tf.length) {
            this.tf[this.focus].isFocus = true;
         }

         this.scroll.moveTo(this.focus * this.scroll.ITEM_SIZE);
      }

      if (GameCanvas.isPointerHoldIn(this.xPanel, this.yPanel, this.wPanel, this.hPanel) && GameCanvas.isPointerJustRelease) {
         for(var1 = 0; var1 < this.tf.length; ++var1) {
            if (GameCanvas.isPointerHoldIn(this.tf[var1].x, this.tf[var1].y, this.tf[var1].width, this.tf[var1].height)) {
               this.focus = var1;
            }
         }
      }

      super.updateKey();
      GameCanvas.clearKeyPressed();
   }

   public final void paint(mGraphics var1) {
      var1.setColor(0);
      var1.fillRect(0, 0, GameCanvas.w, GameCanvas.h);
      GameCanvas.paintBGGameScr(var1);
      Paint.paintFrame(this.xPanel, this.yPanel, this.wPanel, this.hPanel, var1);
      mFont.tahoma_7b_white.drawString(var1, mResources.REGISTER, GameCanvas.hw, this.yPanel + 10, 2);
      this.scroll.setStyle(this.menuName.length, 50, this.xPanel, this.yPanel + 25, this.wPanel, this.hPanel - 25, true, 0);
      this.scroll.setClip(var1, this.xPanel, this.yPanel + 25, this.wPanel, this.hPanel - 25);

      int var2;
      for(var2 = 0; var2 < this.menuName.length; ++var2) {
         if (var2 != this.menuName.length - 1) {
            mFont.tahoma_7_yellow.drawString(var1, this.menuName[var2], GameCanvas.hw, (var2 + 1) * 50 - 13, 2);
         } else {
            mFont.tahoma_7_red.drawString(var1, this.menuName[var2], GameCanvas.hw, (var2 + 1) * 50 - 13, 2);
         }
      }

      for(var2 = 0; var2 < this.tf.length; ++var2) {
         this.tf[var2].paint_NonSetClip(var1);
      }

      super.paint(var1);
   }

   public final void switchToMe() {
      super.switchToMe();
      this.scroll.clear();
   }

   public final void perform(int var1, Object var2) {
      switch(var1) {
      case 1:
         Service.gI().info_Kiemduyet(this.tf[0].getText(), this.tf[1].getText(), this.tf[2].getText(), this.tf[3].getText(), this.tf[4].getText(), this.tf[5].getText(), this.tf[6].getText());
         GameCanvas.isKiemduyet_info = false;
         GameScr.gI().switchToMe();
      default:
      }
   }
}
