package bridge.with;

public abstract class UI {
    protected OSType osType;
    public UI(OSType osType) {
        this.osType = osType;
    }

    public abstract void render();
}
