
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;

final class Command_Listener implements CommandListener {

    private TField nsoAA;
    private final TextBox nsoAB;

    Command_Listener(TField var1, TextBox var2) {
        this.nsoAA = var1;
        this.nsoAB = var2;
    }

    public final void commandAction(javax.microedition.lcdui.Command var1, Displayable var2) {
        if (var1.getLabel().equals(mResources.OK)) {
            this.nsoAA.setText(this.nsoAB.getString());
        }

        Display.getDisplay(TField.nsoAJ).setCurrent(TField.nsoAI);
        TField.nsoAI.setFullScreenMode(true);
        this.nsoAA.advAI = true;

    }
}
