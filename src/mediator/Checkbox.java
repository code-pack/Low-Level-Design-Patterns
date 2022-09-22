package mediator;

public class Checkbox extends UIComponent {
    boolean isChecked;
    public Checkbox(String name, Window window) {
        super(name, window);
        isChecked = false;
    }

    @Override
    void click() {
        super.window.notifyUI(this, EventType.CLICK);
    }

    @Override
    void check() {

    }

    @Override
    void select() {

    }

    void checkTheBox() {
        this.isChecked = true;
        System.out.println("Checked the checkbox with name " + super.name);
    }
}
