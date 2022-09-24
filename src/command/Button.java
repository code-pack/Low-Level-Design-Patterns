package command;

public class Button {
    private Command command;
    private String text;

    public Button(Command command, String text) {
        this.command = command;
        this.text = text;
    }

    public void click() {
        this.command.execute();
    }
}
