package strategy;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProducts();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please tell how you want to do payment. Press 1 for Paypal and 2 for Card");
        int paymentMethod = scanner.nextInt();

        if (paymentMethod == 1) {
            shoppingCart.setStrategy(new PaypalStrategy());
        }
        else if (paymentMethod == 2) {
            shoppingCart.setStrategy(new CardStrategy());
        }

        shoppingCart.doPayment();
    }
}
