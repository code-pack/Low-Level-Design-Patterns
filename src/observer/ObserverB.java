package observer;

public class ObserverB implements Observer {
    @Override
    public void notifyy() {
        System.out.println("ObserverB notified!");
    }
}
