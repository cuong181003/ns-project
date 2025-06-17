
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.io.SocketConnection;

public final class Session_ME {

    protected static Session_ME instance = new Session_ME();
    public boolean nsoAB = false;
    private DataOutputStream dos;
    public DataInputStream dis;
    public Controller messageHandler;
    public SocketConnection sc;
    public boolean connected;
    public boolean connecting;
    private final Sender sender = new Sender(this);
    public Thread initThread;
    public Thread nsoAI;
    public int sendByteCount;
    public int recvByteCount;
    boolean getKeyComplete;
    public byte[] key = null;
    private byte curR;
    private byte curW;
    long timeConnected;
    public String strRecvByteCount = "";
    public static String IP;
    public static int PORT;
    public static byte serverLogin;
    public static boolean nsoAP;
    private static Object advBA = new Object();
    private MyVector recieveMsg;

    public static Session_ME gI() {
        return instance;
    }

    public final boolean isConnected() {
        return this.connected;
    }

    public final void setHandler(Controller var1) {
        this.messageHandler = var1;
    }

    public final void connect(String var1, int var2) {
        String var3 = new String(new char[]{'s', 'o', 'c', 'k', 'e', 't', ':', '/', '/'}) + var1 + new String(new char[]{':'}) + var2;
        if (GameCanvas.isBlackBerryDevice) {
            if (!GameCanvas.isGPRS) {
                var3 = var3 + new String(new char[]{';', 'i', 'n', 't', 'e', 'r', 'f', 'a', 'c', 'e', '=', 'w', 'i', 'f', 'i'});
            } else {
                var3 = var3 + new String(new char[]{';', 'd', 'e', 'v', 'i', 'c', 'e', 's', 'i', 'd', 'e', '=', 't', 'r', 'u', 'e'});
            }
        }

        System.out.println("connect to " + var3 + ":" + GameMidlet.serverLogin);
        if (!this.connected && !this.connecting) {
            this.getKeyComplete = false;
            this.sc = null;
            IP = var1;
            PORT = var2;
            serverLogin = GameMidlet.serverLogin;
            this.initThread = new Thread(new NetworkConnector(this, var3));
            SendSMS.nsoAA();
        }
    }

    public final void sendMessage(Message var1) {
        this.sender.session.recieveMsg.addElement(var1);
    }

    private synchronized void doSendMessage(Message var1) {
        byte[] var2 = var1.getData();

        try {
            if (this.getKeyComplete) {
                byte var3 = this.writeKey(var1.command);
                this.dos.writeByte(var3);
            } else {
                this.dos.writeByte(var1.command);
            }

            (new StringBuffer("cmd send ---> ")).append(var1.command).toString();
            if (var2 != null) {
                int var7 = var2.length;
                if (var1.command != -31 && this.getKeyComplete) {
                    byte var5 = this.writeKey((byte) (var7 >> 8));
                    this.dos.writeByte(var5);
                    var5 = this.writeKey((byte) var7);
                    this.dos.writeByte(var5);
                } else {
                    this.dos.writeShort(var7);
                }

                if (this.getKeyComplete) {
                    for (int var6 = 0; var6 < var2.length; ++var6) {
                        var2[var6] = this.writeKey(var2[var6]);
                    }
                }

                this.dos.write(var2);
                this.sendByteCount += 5 + var2.length;
            } else {
                this.dos.writeShort(0);
                this.sendByteCount += 5;
            }

            this.dos.flush();
        } catch (IOException var4) {
            var4.printStackTrace();
        }
    }

    private byte writeKey(byte var1) {
        byte[] var10000 = this.key;
        byte var10003 = this.curW;
        this.curW = (byte) (var10003 + 1);
        var1 = (byte) (var10000[var10003] & 255 ^ var1 & 255);
        if (this.curW >= this.key.length) {
            this.curW = (byte) (this.curW % this.key.length);
        }

        return var1;
    }

    public final void close() {
        Code.advAB();
        this.cleanNetwork();
    }

    public void cleanNetwork() {
        this.key = null;
        this.curR = 0;
        this.curW = 0;

        try {
            this.connected = false;
            this.connecting = false;
            if (this.sc != null) {
                this.sc.close();
                this.sc = null;
            }

            if (this.dos != null) {
                this.dos.close();
                this.dos = null;
            }

            if (this.dis != null) {
                this.dis.close();
                this.dis = null;
            }

            this.nsoAI = null;
            System.gc();
        } catch (Exception var1) {
            var1.printStackTrace();
        }
    }

    public final void reLogin() {
        if (GameCanvas.currentScreen != GameCanvas.selectsvScr) {
            GameCanvas.instance.advAE();
        }

        if (nsoAP) {
            advAE();
        } else {
            nsoAP = true;
            (new Thread(new AutoLogin(this))).start();
        }
    }

    public static void advAE() {
        synchronized (advBA) {
            advBA.notifyAll();
        }
    }

    static void advAA(long var0) {
        long var2 = var0;
        synchronized (advBA) {
            try {
                advBA.wait(var2);
            } catch (Exception var4) {
            }

        }
    }

    static void nsoAA(Session_ME var0, DataOutputStream var1) {
        var0.dos = var1;
    }

    static Sender nsoAA(Session_ME var0) {
        return var0.sender;
    }

    static void nsoAA(Session_ME var0, Message var1) {
        var0.doSendMessage(var1);
    }

    static void nsoAA(Session_ME var0, MyVector var1) {
        var0.recieveMsg = var1;
    }

    static MyVector nsoAB(Session_ME var0) {
        return var0.recieveMsg;
    }

    static void nsoAC(Session_ME var0) {
        var0.cleanNetwork();
    }

    static byte readKey(Session_ME var0, byte var1) {
        byte[] var10000 = (var0 = var0).key;
        byte var10003 = var0.curR;
        var0.curR = (byte) (var10003 + 1);
        var1 = (byte) (var10000[var10003] & 255 ^ var1 & 255);
        if (var0.curR >= var0.key.length) {
            var0.curR = (byte) (var0.curR % var0.key.length);
        }

        return var1;
    }
}
