package composite;

public class Mouse implements Sellable {
    @Override
    public double getCost() {
        return 1_000.0;
    }
}
