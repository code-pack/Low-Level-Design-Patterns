package composite;

public class Monitor implements Sellable {
    @Override
    public double getCost() {
        return 10_000.0;
    }
}
