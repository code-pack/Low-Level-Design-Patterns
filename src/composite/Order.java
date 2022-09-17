package composite;

import java.util.List;

public class Order implements Sellable {
    List<Sellable> contents;

    public Order(List<Sellable> contents) {
        this.contents = contents;
    }

    @Override
    public double getCost() {
        double cost = 0.0;
        if (contents != null) {
            for(Sellable sellable: contents) {
                cost += sellable.getCost();
            }
        }
        return cost;
    }
}
