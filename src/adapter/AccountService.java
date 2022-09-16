package adapter.without;

import java.util.List;

public class AccountService {
    private List<NewNotifier> notifiers;

    public AccountService(List<NewNotifier> notifiers) {
        this.notifiers = notifiers;
    }

    public void debit(double amount) {
        System.out.println(amount + " has been debited!");
        for(NewNotifier notifier: notifiers) {
            notifier.notifyy();
        }
    }
}
