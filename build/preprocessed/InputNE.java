
import java.io.InputStream;

public final class InputNE extends InputStream {

    private final InputStream advAA;

    public InputNE(InputStream var1) {
        this.advAA = var1;
    }

    public final int read() {
        int var1;
        try {
            var1 = this.advAA.read();
            return (var1 == -1) ? -1 : (~var1 & 255);
        } catch (Exception e) {
            return -1;
        }
    }
}
