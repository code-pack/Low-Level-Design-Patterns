package adapter.without;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        NotificationAdapter smsAdapter = new NotificationAdapter(new SMSSender());
        NotificationAdapter emailAdapter = new NotificationAdapter(new EmailSender());

        AccountService accountService = new AccountService(Arrays.asList(smsAdapter, emailAdapter));
        accountService.debit(100.0);

    }
}
