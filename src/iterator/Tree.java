package iterator;

public class Tree implements Iterable {
    private Node root;

    public Tree() {
        root = new Node(10, null, null);
        Node two = new Node(2, null, null);
        root.setLeft(two);
        Node seven = new Node(7, null, null);
        root.setRight(seven);

        Node four = new Node(4, null, null);
        two.setLeft(four);
        Node eight = new Node(8, null, null);
        two.setRight(eight);
    }
    @Override
    public Iterator getIterator() {
        return new PreOrderIterator(root);
    }

    public class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}
