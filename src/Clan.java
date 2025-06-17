public final class Clan {
   public String name = "";
   public int exp;
   public int expNext;
   public int level;
   public int itemLevel;
   public int openDun;
   public int coin;
   public int freeCoin;
   public int coinUp;
   public String main_name = "";
   public String reg_date = "";
   public String log = "";
   public String alert = "";
   public int total;
   public int use_card;
   public Item[] items;

   public Clan() {
      new MyVector();
   }

   public final void writeLog(String var1) {
      String[] var8 = NinjaUtil.split(var1, "\n");
      this.log = "";

      try {
         for(int var2 = 0; var2 < var8.length; ++var2) {
            String var3;
            if (!(var3 = var8[var2].trim()).equals("")) {
               try {
                  String[] var9;
                  String var4 = (var9 = NinjaUtil.split(var3, ","))[0];
                  int var5;
                  if ((var5 = Integer.parseInt(var9[1])) == 0) {
                     var4 = "c0" + var4;
                     var4 = var4 + mResources.CLAN_ACTIVITY[1] + " " + NinjaUtil.numberToString(var9[2]) + " " + mResources.CLAN_ACTIVITY[0] + " " + var9[3];
                  } else if (var5 == 1) {
                     var4 = "c1" + var4;
                     var4 = var4 + " " + mResources.CLAN_ACTIVITY[2] + " " + NinjaUtil.numberToString(var9[2]) + " " + mResources.CLAN_ACTIVITY[0] + " " + var9[3];
                  } else if (var5 == 2) {
                     var4 = "c2" + var4;
                     var4 = var4 + " " + mResources.CLAN_ACTIVITY[3] + " " + NinjaUtil.numberToString(var9[2]) + " " + mResources.CLAN_ACTIVITY[0] + " " + var9[3];
                  } else if (var5 == 3) {
                     var4 = "c1" + var4;
                     var4 = var4 + " " + mResources.CLAN_ACTIVITY[4] + " " + NinjaUtil.numberToString(var9[2]) + " " + mResources.CLAN_ACTIVITY[0] + " " + var9[3];
                  } else if (var5 == 4) {
                     var4 = "c1" + var4;
                     var4 = var4 + mResources.CLAN_ACTIVITY[5] + " " + NinjaUtil.numberToString(var9[2]) + " " + mResources.CLAN_ACTIVITY[0] + " " + var9[3];
                  } else if (var5 == 5) {
                     var4 = "c2" + var4;
                     var4 = var4 + " " + mResources.CLAN_ACTIVITY[6] + " " + NinjaUtil.numberToString(var9[2]) + " " + mResources.CLAN_ACTIVITY[0] + " " + var9[3];
                  }

                  this.log = this.log + var4 + "\n";
               } catch (Exception var6) {
               }
            }
         }

      } catch (Exception var7) {
      }
   }
}
