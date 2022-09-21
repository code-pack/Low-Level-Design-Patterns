package decorator;

public class BorderDecorator extends WindowDecorator {
    private String color;
    public BorderDecorator(Window window, String color) {
        super(window);
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a border of color " + color);
        super.draw();
    }
}
