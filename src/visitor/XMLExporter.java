package visitor;

public class XMLExporter implements Visitor {
    @Override
    public void exportResidential(ResidentialNode residentialNode) {
        System.out.println("Exporting residential node in XML format!");
    }

    @Override
    public void exportTourist(TouristNode touristNode) {
        System.out.println("Exporting tourist node in XML format!");
    }

    @Override
    public void exportIndustrial(IndustrialNode industrialNode) {
        System.out.println("Exporting industrial node in XML format!");
    }
}
