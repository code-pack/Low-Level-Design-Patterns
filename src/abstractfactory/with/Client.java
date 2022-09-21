package abstractfactory.with;

public class Client {
    private static OS currentOS = OS.MAC;

    public static void main(String[] args) {
        Window macWindow = MacUIWindowFactory.createWindow();
        macWindow.render();
    }
}
