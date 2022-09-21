package decorator;

public class Client {

    public static void main(String[] args) {
        Window dialogBox = new BackgroundDecorator(new BorderDecorator(new DialogBox(), "Red"), "Blue") ;
        doSomethingWithWindow(dialogBox);
    }

    public static void doSomethingWithWindow(Window window) {
        window.draw();
    }
}
