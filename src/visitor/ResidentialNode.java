package visitor;

public class ResidentialNode extends Node {

    @Override
    public void accept(Visitor v) {
        v.exportResidential(this);
    }
}
