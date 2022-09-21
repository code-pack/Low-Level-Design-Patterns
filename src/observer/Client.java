package observer;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();

        subject.register(new ObserverA());
        subject.register(new ObserverB());

        subject.setText("ABC");

    }
}
