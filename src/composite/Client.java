package composite;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        Box box1 = new Box(Arrays.asList(new Laptop(), new Monitor()));
        Box box2 = new Box(Arrays.asList(new Keyboard(), new Mouse()));
        Box box3 = new Box(Arrays.asList(box1, box2));
        Order order = new Order(Arrays.asList(box3));

        System.out.println("Cost of the order = " + order.getCost());
    }
}
