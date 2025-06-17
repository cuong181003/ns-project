
public final class ChatTextField implements IActionListener {

    private static ChatTextField instance;
    public TField tfChat;
    public boolean isShow = false;
    IChatable parentScreen;
    private long lastChatTime = 0L;
    public Command left;
    public Command right;
    public Command center;
    public String to;

    public static ChatTextField gI() {
        return instance == null ? (instance = new ChatTextField()) : instance;
    }

    protected ChatTextField() {
        this.left = new Command(mResources.CHAT, this, 8000, (Object) null, 1, GameCanvas.h - mScreen.cmdH + 1);
        this.right = new Command(mResources.DELETE, this, 8001, (Object) null, GameCanvas.w - 53, GameCanvas.h - mScreen.cmdH + 1);
        this.center = null;
        this.tfChat = new TField();
        this.tfChat.name = "chat";
        this.tfChat.x = 16;
        this.tfChat.width = MotherCanvas.instance.mgetWidth() - 32;
        this.tfChat.height = mScreen.ITEM_HEIGHT + 2;
        this.tfChat.isFocus = true;
        this.tfChat.setMaxTextLenght(100);
    }

    public final void startChat(int var1, IChatable var2, String var3) {
        this.right.caption = mResources.CLOSE;
        this.to = var3;
        this.tfChat.keyPressed(var1);
        if (!this.tfChat.getText().equals("") && GameCanvas.currentDialog == null) {
            this.parentScreen = var2;
            this.isShow = true;
        }

        this.tfChat.title_Null = var3;
    }

    public final void startChat(String var1) {
        this.right.caption = mResources.CLOSE;
        this.to = var1;
        if (GameCanvas.currentDialog == null) {
            this.isShow = true;
            if (GameCanvas.isTouch) {
                this.tfChat.nsoAA();
            }
        }

        this.tfChat.title_Null = var1;
    }

    public final void paint(mGraphics var1) {
        if (this.isShow) {
            this.tfChat.paint(var1);
        }
    }

    public final void perform(int var1, Object var2) {
        switch (var1) {
            case 8000:
                if (this.parentScreen != null) {
                    long var3;
                    if ((var3 = System.currentTimeMillis()) - this.lastChatTime < 1000L) {
                        return;
                    }

                    this.lastChatTime = var3;
                    this.parentScreen.onChatFromMe(this.tfChat.getText(), this.to);
                    this.tfChat.setText("");
                    this.right.caption = mResources.CLOSE;
                    return;
                }
                break;
            case 8001:
                this.tfChat.clearAll();
                if (this.tfChat.getText().equals("")) {
                    this.isShow = false;
                    this.parentScreen.onCancelChat();
                }
        }

    }
}
