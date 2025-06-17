public final class CharPartInfo {
   public static mHashtable head_jump = new mHashtable();
   public static mHashtable head_normal = new mHashtable();
   public static mHashtable head_boc_dau = new mHashtable();
   public static mHashtable body_jump = new mHashtable();
   public static mHashtable body_normal = new mHashtable();
   public static mHashtable body_boc_dau = new mHashtable();
   private static mHashtable leg = new mHashtable();
   public mHashtable item = new mHashtable();
   public static mHashtable newMount = new mHashtable();
   public int dx = 0;
   public int dy = 0;
   public int idSmall;

   public static void doSetInfo(Message var0) {
      try {
         head_boc_dau.h.clear();
         head_jump.h.clear();
         head_normal.h.clear();
         body_boc_dau.h.clear();
         body_jump.h.clear();
         body_normal.h.clear();
         newMount.h.clear();
         int var1 = var0.reader().readUnsignedByte();

         int var2;
         byte var3;
         short var4;
         short var5;
         CharPartInfo var6;
         short var7;
         short var8;
         short var9;
         CharPartInfo var10;
         int var13;
         for(var2 = 0; var2 < var1; ++var2) {
            var3 = var0.reader().readByte();
            var4 = var0.reader().readShort();
            var5 = var0.reader().readShort();
            (var6 = new CharPartInfo()).idSmall = var5;

            for(var13 = 0; var13 < var3 - 2; var13 += 3) {
               var7 = var0.reader().readShort();
               var8 = var0.reader().readShort();
               var9 = var0.reader().readShort();
               (var10 = new CharPartInfo()).dx = var8;
               var10.dy = var9;
               var6.item.put(String.valueOf(var7), var10);
            }

            head_jump.put(String.valueOf(var4), var6);
         }

         for(var2 = 0; var2 < var1; ++var2) {
            var3 = var0.reader().readByte();
            var4 = var0.reader().readShort();
            var5 = var0.reader().readShort();
            (var6 = new CharPartInfo()).idSmall = var5;

            for(var13 = 0; var13 < var3 - 2; var13 += 3) {
               var7 = var0.reader().readShort();
               var8 = var0.reader().readShort();
               var9 = var0.reader().readShort();
               (var10 = new CharPartInfo()).dx = var8;
               var10.dy = var9;
               var6.item.put(String.valueOf(var7), var10);
            }

            head_normal.put(String.valueOf(var4), var6);
         }

         for(var2 = 0; var2 < var1; ++var2) {
            var3 = var0.reader().readByte();
            var4 = var0.reader().readShort();
            var5 = var0.reader().readShort();
            (var6 = new CharPartInfo()).idSmall = var5;

            for(var13 = 0; var13 < var3 - 2; var13 += 3) {
               var7 = var0.reader().readShort();
               var8 = var0.reader().readShort();
               var9 = var0.reader().readShort();
               (var10 = new CharPartInfo()).dx = var8;
               var10.dy = var9;
               var6.item.put(String.valueOf(var7), var10);
            }

            head_boc_dau.put(String.valueOf(var4), var6);
         }

         var1 = var0.reader().readUnsignedByte();

         for(var2 = 0; var2 < var1; var2 += 2) {
            short var12 = var0.reader().readShort();
            var4 = var0.reader().readShort();
            CharPartInfo var16;
            (var16 = new CharPartInfo()).idSmall = var4;
            leg.put(String.valueOf(var12), var16);
         }

         var1 = var0.reader().readUnsignedByte();

         for(var2 = 0; var2 < var1; ++var2) {
            var3 = var0.reader().readByte();
            var4 = var0.reader().readShort();
            var5 = var0.reader().readShort();
            (var6 = new CharPartInfo()).idSmall = var5;

            for(var13 = 0; var13 < var3 - 2; var13 += 3) {
               var7 = var0.reader().readShort();
               var8 = var0.reader().readShort();
               var9 = var0.reader().readShort();
               (var10 = new CharPartInfo()).dx = var8;
               var10.dy = var9;
               var6.item.put(String.valueOf(var7), var10);
            }

            body_jump.put(String.valueOf(var4), var6);
         }

         for(var2 = 0; var2 < var1; ++var2) {
            var3 = var0.reader().readByte();
            var4 = var0.reader().readShort();
            var5 = var0.reader().readShort();
            (var6 = new CharPartInfo()).idSmall = var5;

            for(var13 = 0; var13 < var3 - 2; var13 += 3) {
               var7 = var0.reader().readShort();
               var8 = var0.reader().readShort();
               var9 = var0.reader().readShort();
               (var10 = new CharPartInfo()).dx = var8;
               var10.dy = var9;
               var6.item.put(String.valueOf(var7), var10);
            }

            body_normal.put(String.valueOf(var4), var6);
         }

         for(var2 = 0; var2 < var1; ++var2) {
            var3 = var0.reader().readByte();
            var4 = var0.reader().readShort();
            var5 = var0.reader().readShort();
            (var6 = new CharPartInfo()).idSmall = var5;

            for(var13 = 0; var13 < var3 - 2; var13 += 3) {
               var7 = var0.reader().readShort();
               var8 = var0.reader().readShort();
               var9 = var0.reader().readShort();
               (var10 = new CharPartInfo()).dx = var8;
               var10.dy = var9;
               var6.item.put(String.valueOf(var7), var10);
            }

            body_boc_dau.put(String.valueOf(var4), var6);
         }

         byte var15 = var0.reader().readByte();

         for(int var14 = 0; var14 < var15; ++var14) {
            var4 = var0.reader().readShort();
            int[][] var17 = new int[6][];

            for(var13 = 0; var13 < 6; ++var13) {
               byte var18 = var0.reader().readByte();
               var17[var13] = new int[var18];

               for(int var19 = 0; var19 < var18; ++var19) {
                  var17[var13][var19] = var0.reader().readShort();
               }
            }

            newMount.put(String.valueOf(var4), var17);
         }

      } catch (Exception var11) {
      }
   }
}
