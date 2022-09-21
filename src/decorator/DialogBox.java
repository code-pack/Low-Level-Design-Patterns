package decorator;

public class DialogBox implements Window {
    @Override
    public void draw() {
        System.out.println("Drawing a dialog box");
    }
}
