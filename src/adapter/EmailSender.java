package adapter.without;

public class EmailSender implements LegacyNotifier {
    @Override
    public void sendNotification() {
        System.out.println("Sending an email!");
    }
}
