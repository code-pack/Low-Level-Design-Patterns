package observer;

public class ObserverA implements Observer {
    @Override
    public void notifyy() {
        System.out.println("ObserverA notified!");
    }
}
