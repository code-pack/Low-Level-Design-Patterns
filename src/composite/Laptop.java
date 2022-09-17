package composite;

public class Laptop implements Sellable {
    @Override
    public double getCost() {
        return 50_000.0;
    }
}
