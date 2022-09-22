package mediator;

public class DialogBox implements Window {

    private Button submitButton;
    private Checkbox checkBox;

    public DialogBox() {
        this.submitButton = new Button("Submit", this);
        this.checkBox = new Checkbox("checkboxA", this);
    }

    public void login() {
        this.submitButton.click();
    }

    @Override
    public void notifyUI(UIComponent component, EventType eventType) {
        if (component instanceof Button) {
            handleButtonEvent((Button)component, eventType);
        }
        else if (component instanceof Checkbox) {
            handleCheckboxEvent((Checkbox) component, eventType);
        }
    }

    private void handleButtonEvent(Button button, EventType eventType) {
        // code to interact check the checkbox (interact with other components)
        if (button.getName().equals("Submit") && eventType == EventType.CLICK) {
            this.checkBox.checkTheBox();
        }
    }

    private void handleCheckboxEvent(Checkbox checkbox, EventType eventType) {

    }
}
