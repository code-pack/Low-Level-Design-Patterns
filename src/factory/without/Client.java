package factory.without;

public class Client {
    private static OS currentOS = OS.WINDOWS;

    public static void main(String[] args) {
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

        // code which uses buttons
        b.click();
    }
}
