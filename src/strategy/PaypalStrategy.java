package strategy;

public class PaypalStrategy implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        // do payment through paypal
        System.out.println("Doing payment of " + amount + " through PayPal!");
        return true;
    }
}
