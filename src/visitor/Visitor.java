package visitor;

public interface Visitor {
    void exportResidential(ResidentialNode residentialNode);
    void exportTourist(TouristNode touristNode);
    void exportIndustrial(IndustrialNode industrialNode);
}
