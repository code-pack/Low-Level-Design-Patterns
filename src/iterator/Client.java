package iterator;

public class Client {
    public static void main(String[] args) {
        Tree tree = new Tree();
        // compose the tree

        Iterator preOrderIterator = tree.getIterator();
        while (preOrderIterator.hasNext()) {
            System.out.println(preOrderIterator.current());
        }
    }
}
