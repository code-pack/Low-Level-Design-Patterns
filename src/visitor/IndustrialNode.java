package visitor;

public class IndustrialNode extends Node {

    @Override
    public void accept(Visitor v) {
        v.exportIndustrial(this);
    }
}
