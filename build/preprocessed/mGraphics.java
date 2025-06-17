
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class mGraphics {

    public Graphics graphics;
    public static int zoomLevel = 1;

    public mGraphics(Graphics var1) {
        this.graphics = var1;
    }

    public mGraphics() {
    }

    public final void drawImage(Image var1, int var2, int var3, int var4) {
        var2 *= zoomLevel;
        var3 *= zoomLevel;
        this.graphics.drawImage(var1, var2, var3, var4);
    }

    public final void drawLine(int var1, int var2, int var3, int var4) {
        var1 *= zoomLevel;
        var2 *= zoomLevel;
        var3 *= zoomLevel;
        var4 *= zoomLevel;
        this.graphics.drawLine(var1, var2, var3, var4);
    }

    public final void drawRect(int var1, int var2, int var3, int var4) {
        var1 *= zoomLevel;
        var2 *= zoomLevel;
        var3 *= zoomLevel;
        var4 *= zoomLevel;
        this.graphics.drawRect(var1, var2, var3, var4);
    }

    public final void drawRegion(Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        var7 *= zoomLevel;
        var8 *= zoomLevel;
        var2 *= zoomLevel;
        var3 *= zoomLevel;
        var4 *= zoomLevel;
        var5 *= zoomLevel;
        this.graphics.drawRegion(var1, var2, var3, var4, var5, var6, var7, var8, var9);
    }

    public final void drawRoundRect(int var1, int var2, int var3, int var4, int var5, int var6) {
        var1 *= zoomLevel;
        var2 *= zoomLevel;
        var3 *= zoomLevel;
        var4 *= zoomLevel;
        var5 *= zoomLevel;
        var6 *= zoomLevel;
        this.graphics.drawRoundRect(var1, var2, var3, var4, var5, var6);
    }

    public final void fillRect(int var1, int var2, int var3, int var4) {
        var1 *= zoomLevel;
        var2 *= zoomLevel;
        var3 *= zoomLevel;
        var4 *= zoomLevel;
        this.graphics.fillRect(var1, var2, var3, var4);
    }

    public final void fillRoundRect(int var1, int var2, int var3, int var4, int var5, int var6) {
        var1 *= zoomLevel;
        var2 *= zoomLevel;
        var3 *= zoomLevel;
        var4 *= zoomLevel;
        var5 *= zoomLevel;
        var6 *= zoomLevel;
        this.graphics.fillRoundRect(var1, var2, var3, var4, var5, var6);
    }

    public final int getTranslateX() {
        return this.graphics.getTranslateX() / zoomLevel;
    }

    public final int getTranslateY() {
        return this.graphics.getTranslateY() / zoomLevel;
    }

    public final void setClip(int var1, int var2, int var3, int var4) {
        var1 *= zoomLevel;
        var2 *= zoomLevel;
        var3 *= zoomLevel;
        var4 *= zoomLevel;
        this.graphics.setClip(var1, var2, var3, var4);
    }

    public final void setColor(int var1) {
        this.graphics.setColor(var1);
    }

    public final void translate(int var1, int var2) {
        var1 *= zoomLevel;
        var2 *= zoomLevel;
        this.graphics.translate(var1, var2);
    }

    public static int getWidth(Image var0) {
        return var0.getWidth() / zoomLevel;
    }

    public static int getHeight(Image var0) {
        return var0.getHeight() / zoomLevel;
    }

    public final void advAE(int var1, int var2, int var3, int var4) {
        var1 *= zoomLevel;
        var2 *= zoomLevel;
        var3 *= zoomLevel;
        var4 *= zoomLevel;
        this.graphics.drawArc(var1, var2, var3, var4, 0, 360);
    }
}
