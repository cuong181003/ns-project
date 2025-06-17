public final class AutoTimBoss implements Runnable {
   AutoTimBoss() {
   }

   public final void run() {
      for(int var1 = 15; var1 < 30; ++var1) {
         Npc var3;
         if (TileMap.zoneID != var1 && (var3 = GameScr.findNPC(13)) != null) {
            if (Math.abs(var3.cx - Char.getMyChar().cx) > 22 || Math.abs(var3.cy - Char.getMyChar().cy) > 22) {
               Char.moveToChar(var3.cx, var3.cy);
            }

            Service.gI().requestChangeZone((int)var1, (int)-1);
            TileMap.advAF();

            try {
               Thread.sleep(100L);
            } catch (InterruptedException var4) {
            }
         }

         for(int var2 = 0; var2 < GameScr.vMob.size(); ++var2) {
            Mob var5;
            if ((var5 = (Mob)GameScr.vMob.elementAt(var2)).isBoss && var5.hp > 0 && var5.status != 0) {
               return;
            }
         }
      }

   }
}
