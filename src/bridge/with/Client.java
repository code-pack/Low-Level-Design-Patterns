package bridge.with;

public class Client {
    public static void main(String[] args) {
        UserUI windowsUserUI = new UserUI(new Windows());
        UserUI linuxUserUI = new UserUI(new Linux());

        UserUI androidUserUI = new UserUI(new Android());
    }
}
