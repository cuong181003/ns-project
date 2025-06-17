
import java.io.IOException;

final class MessageCollector implements Runnable {
   private Session_ME session;

   MessageCollector(Session_ME var1) {
      this.session = var1;
   }

   public final void run() {
      while(true) {
         try {
            if (this.session.isConnected()) {
               MessageCollector var10 = this;
               byte var2 = this.session.dis.readByte();
               if (this.session.getKeyComplete) {
                  var2 = Session_ME.readKey(this.session, var2);
               }

               int var3;
               byte var4;
               byte var5;
               if (var2 == -32) {
                  var2 = this.session.dis.readByte();
                  if (this.session.getKeyComplete) {
                     var2 = Session_ME.readKey(this.session, var2);
                  }

                  var4 = Session_ME.readKey(this.session, this.session.dis.readByte());
                  var5 = Session_ME.readKey(this.session, this.session.dis.readByte());
                  byte var6 = Session_ME.readKey(this.session, this.session.dis.readByte());
                  byte var7 = Session_ME.readKey(this.session, this.session.dis.readByte());
                  var3 = (var4 & 255) << 24 | (var5 & 255) << 16 | (var6 & 255) << 8 | var7 & 255;
               } else if (this.session.getKeyComplete) {
                  var4 = this.session.dis.readByte();
                  var5 = this.session.dis.readByte();
                  var3 = (Session_ME.readKey(this.session, var4) & 255) << 8 | Session_ME.readKey(this.session, var5) & 255;
               } else {
                  var3 = this.session.dis.readUnsignedShort();
               }

               byte[] var12 = new byte[var3];
               int var13 = 0;
               int var14 = 0;

               int var15;
               while(var13 != -1 && var14 < var3) {
                  if ((var13 = var10.session.dis.read(var12, var14, var3 - var14)) > 0) {
                     var14 += var13;
                     Session_ME var10000 = var10.session;
                     var10000.recvByteCount += var14 + 5;
                     var15 = Session_ME.gI().recvByteCount + Session_ME.gI().sendByteCount;
                     var10.session.strRecvByteCount = var15 / 1024 + "." + var15 % 1024 / 102 + "Kb";
                  }
               }

               if (var10.session.getKeyComplete) {
                  for(var15 = 0; var15 < var12.length; ++var15) {
                     var12[var15] = Session_ME.readKey(var10.session, var12[var15]);
                  }
               }

               Message var11 = new Message(var2, var12);

               try {
                  if (var11.command == -27) {
                     this.getKey(var11);
                     continue;
                  }

                  this.session.messageHandler.onMessage(var11);
               } catch (Exception var8) {
                  var8.printStackTrace();
               }
               continue;
            }
         } catch (Exception var9) {
         }

         if (this.session.connected) {
            if (this.session.messageHandler != null) {
               if (System.currentTimeMillis() - this.session.timeConnected > 500L) {
                  Controller var1 = this.session.messageHandler;
                  this.session.messageHandler.advAD();
               }
                  this.session.messageHandler.onConnectionFail();
               
            }

            if (this.session.sc != null) {
               Session_ME.nsoAC(this.session);
            }
         }

         return;
      }
   }

   private void getKey(Message var1) {
       try {
           byte var2 = var1.reader().readByte();
           this.session.key = new byte[var2];
           
           int var3;
           for(var3 = 0; var3 < var2; ++var3) {
               this.session.key[var3] = var1.reader().readByte();
           }
           
           for(var3 = 0; var3 < this.session.key.length - 1; ++var3) {
               byte[] var10000 = this.session.key;
               var10000[var3 + 1] ^= this.session.key[var3];
           }
           
           this.session.getKeyComplete = true;
       } catch (IOException ex) {
           ex.printStackTrace();
       }
   }
}
