package factory.with;

public class ButtonFactory {
    public static Button createButton(OS currentOS) {
        Button b = null;
        if (currentOS == OS.WINDOWS) {
            b = new Button("#FFFFFF", true, currentOS);
        }
        else if (currentOS == OS.MAC) {
            b = new Button("#000000", false, currentOS);
        }
        else if (currentOS == OS.LINUX) {
            b = new Button("#0000FF", true, currentOS);
        }
        return b;
    }
}
