public final class ChatTab {
   public int type;
   public String ownerName;
   public MyVector contents = new MyVector();
   public long advAD = 0L;

   public ChatTab(String var1, int var2) {
      this.ownerName = var1;
      this.type = var2;
   }

   public ChatTab() {
   }

   public final void addChat(String var1, String var2) {
      boolean var3 = false;
      if (GameScr.isPaintMessage && ChatManager.gI().getCurrentChatTab() == this && GameScr.indexRow == this.contents.size() - 1) {
         var3 = true;
      }

      this.contents.addElement("c3@" + var1);
      MyVector var4 = mFont.tahoma_7_white.splitFontVector(var2, 160);

      for(int var5 = 0; var5 < var4.size(); ++var5) {
         this.contents.addElement("c0" + var4.elementAt(var5));
      }

      if (var3) {
         GameScr.gI().scrollDownAlert();
      }

      this.clear();
   }

   public void clear() {
      while(this.contents.size() > 50) {
         this.contents.removeElementAt(1);
      }

   }

   public final void addInfo(String var1) {
      boolean var2 = false;
      if (GameScr.isPaintMessage && ChatManager.gI().getCurrentChatTab() == this && GameScr.indexRow == this.contents.size() - 1) {
         var2 = true;
      }

      MyVector var4 = mFont.tahoma_7_white.splitFontVector(var1, 160);

      for(int var3 = 0; var3 < var4.size(); ++var3) {
         this.contents.addElement(var4.elementAt(var3));
      }

      if (var2) {
         GameScr.gI().scrollDownAlert();
      }

      this.clear();
   }
}
