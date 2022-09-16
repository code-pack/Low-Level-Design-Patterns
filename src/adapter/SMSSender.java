package adapter.without;

public class SMSSender implements LegacyNotifier {
    @Override
    public void sendNotification() {
        System.out.println("Send a SMS");
    }
}
