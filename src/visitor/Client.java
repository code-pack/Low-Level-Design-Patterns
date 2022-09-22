package visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Node> graph = new ArrayList<>();
        graph.add(new IndustrialNode());
        graph.add(new ResidentialNode());
        graph.add(new TouristNode());
        graph.add(new IndustrialNode());

//        Visitor jsonExporter = new JsonExporter();

        Visitor xmlExporter = new XMLExporter();

        for(Node node: graph) {
            node.accept(xmlExporter);
        }
    }
}
