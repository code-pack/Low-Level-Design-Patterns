package decorator;

public abstract class WindowDecorator implements Window {
    private Window window;

    public WindowDecorator(Window window) {
        this.window = window;
    }

    @Override
    public void draw() {
        window.draw();
    }
}
