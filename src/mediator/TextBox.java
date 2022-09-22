package mediator;

public class TextBox extends UIComponent {
    public TextBox(String name, Window window) {
        super(name, window);
    }

    @Override
    void click() {

    }

    @Override
    void check() {

    }

    @Override
    void select() {
        super.window.notifyUI(this, EventType.SELECT);
    }
}
