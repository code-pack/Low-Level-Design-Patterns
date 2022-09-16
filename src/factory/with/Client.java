package factory.with;

public class Client {
    private static OS currentOS = OS.MAC;

    public static void main(String[] args) {
        Button b = ButtonFactory.createButton(currentOS);

        // Do something with button here
        b.click();
    }
}
