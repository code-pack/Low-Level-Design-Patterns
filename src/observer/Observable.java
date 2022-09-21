package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    protected List<Observer> observers;

    public Observable() {
        this.observers = new ArrayList<>();
    }

    public void register(Observer observer) {
        this.observers.add(observer);
    }

    public void unregister(Observer observer) {
        this.observers.remove(observer);
    }
}
