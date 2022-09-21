package observer;

public class Subject extends Observable {
    private String text;

    public Subject() {
        this.text = "";
    }

    public void setText(String newText) {
        if (!newText.equals(text)) {
            this.text = newText;
            for(Observer observer: observers) {
                observer.notifyy();
            }
        }
    }
}
