package composite;

import java.util.List;

public class Box implements Sellable {
    private List<Sellable> contents;

    public Box(List<Sellable> contents) {
        this.contents = contents;
    }

    @Override
    public double getCost() {
        double cost = 500.0;
        if (contents != null) {
            for(Sellable sellable: contents) {
                cost += sellable.getCost();
            }
        }
        return cost;
    }
}
