
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

public final class MotherCanvas extends Canvas implements Runnable {

    public static MotherCanvas instance;
    public GameGraphics tCanvas;
    private int zoomLevel = 1;
    private int newWidth;
    private int newHeight;
    private static boolean isPC = true;
    public static boolean bRun;

    public MotherCanvas() {
        this.setFullScreenMode(true);
        mGraphics.zoomLevel = 1;
        if (!isPC) {
            if (this.getWidth() * this.getHeight() > 2073600) {
                mGraphics.zoomLevel = this.zoomLevel = 4;
                this.newWidth = this.getWidth() / this.zoomLevel + 2;
                this.newHeight = this.getHeight() / this.zoomLevel + 2;
                return;
            }

            if (this.getWidth() * this.getHeight() > 153600) {
                mGraphics.zoomLevel = this.zoomLevel = 3;
                this.newWidth = this.getWidth() / this.zoomLevel + 2;
                this.newHeight = this.getHeight() / this.zoomLevel + 2;
                return;
            }

            mGraphics.zoomLevel = this.zoomLevel = 1;
        }

    }

    public static MotherCanvas gI() {
        if (instance == null) {
            instance = new MotherCanvas();
        }
        return instance;
    }

    public final void run() {
        try {
            Thread.sleep(10L);
        } catch (InterruptedException var9) {
        }

        bRun = true;

        while (bRun) {
            try {
                long var1 = System.currentTimeMillis();
                this.tCanvas.update();
                long var3 = System.currentTimeMillis() - var1;

                try {
                    Thread.sleep(var3 < (long) Code.SPGameValue ? (long) Code.SPGameValue - var3 : 1L);
                } catch (InterruptedException var6) {
                }
            } catch (Exception var8) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException var6) {
                    var6.printStackTrace();
                }

                var8.printStackTrace();
            }
        }

    }

    public final void setChildCanvas(GameGraphics var1) {
        this.tCanvas = var1;
    }

    protected final void paint(Graphics var1) {
        this.tCanvas.paint(var1);
    }

    protected final void keyPressed(int var1) {
        this.tCanvas.keyPressed(var1);
    }

    protected final void keyReleased(int var1) {
        this.tCanvas.keyReleased(var1);
    }

    protected final void pointerDragged(int var1, int var2) {
        var1 /= this.zoomLevel;
        var2 /= this.zoomLevel;
        this.tCanvas.pointerDragged(var1, var2);
    }

    protected final void pointerPressed(int var1, int var2) {
        var1 /= this.zoomLevel;
        var2 /= this.zoomLevel;
        this.tCanvas.pointerPressed(var1, var2);
    }

    protected final void pointerReleased(int var1, int var2) {
        var1 /= this.zoomLevel;
        var2 /= this.zoomLevel;
        this.tCanvas.pointerReleased(var1, var2);
    }

    public final int mgetHeight() {
        return this.zoomLevel == 1 ? this.getHeight() : this.newHeight;
    }

    public final int mgetWidth() {
        return this.zoomLevel == 1 ? this.getWidth() : this.newWidth;
    }
}
