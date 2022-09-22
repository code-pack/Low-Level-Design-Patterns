package mediator;

public abstract class UIComponent {
    protected String name;
    protected Window window;
    public UIComponent(String name, Window window) {
        this.name = name;
        this.window = window;
    }

    abstract void click();
    abstract void check();
    abstract void select();

    public String getName() {
        return name;
    }
}
