package strategy;

public class ShoppingCart {
    private PaymentStrategy strategy;

    public void addProducts() {
        // adds products to shopping cart
    }

    public boolean doPayment() {
        double amount = 500.0; // here calculate the amount
        return strategy.pay(amount);
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
}
