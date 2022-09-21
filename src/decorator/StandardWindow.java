package decorator;

public class StandardWindow implements Window {
    @Override
    public void draw() {
        System.out.println("Drawing a standard window");
    }
}
