package mediator;

public class Button extends UIComponent {
    public Button(String name, Window window) {
        super(name, window);
    }

    @Override
    void click() {
        window.notifyUI(this, EventType.CLICK);
    }

    @Override
    void check() {

    }

    @Override
    void select() {

    }
}
