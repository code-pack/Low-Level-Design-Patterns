package decorator;

public class BackgroundDecorator extends WindowDecorator {
    private String color;

    public BackgroundDecorator(Window window, String color) {
        super(window);
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Having a background of " + color + " color");
        super.draw();
    }
}
