package strategy;

public class CardStrategy implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        // Do payment through card
        System.out.println("Doing payment of amount " + amount + " through card");
        return false;
    }
}
