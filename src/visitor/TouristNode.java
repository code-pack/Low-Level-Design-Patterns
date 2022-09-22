package visitor;

public class TouristNode extends Node {

    @Override
    void accept(Visitor v) {
        v.exportTourist(this);
    }
}
