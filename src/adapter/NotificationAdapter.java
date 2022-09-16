package adapter;

public class NotificationAdapter implements NewNotifier {
    private LegacyNotifier legacyNotifier;

    public NotificationAdapter(LegacyNotifier legacyNotifier) {
        this.legacyNotifier = legacyNotifier;
    }


    @Override
    public void notifyy() {
        legacyNotifier.sendNotification();
    }
}
