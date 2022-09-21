package iterator;

import java.util.Stack;

public class PreOrderIterator implements Iterator {
    private Tree.Node root;
    private Stack<Tree.Node> nodeStack;

    public PreOrderIterator(Tree.Node root) {
        this.root = root;
        this.nodeStack = new Stack<>();
        this.nodeStack.add(root);
    }

    @Override
    public boolean hasNext() {
        return !nodeStack.isEmpty();
    }

    @Override
    public int current() {
        Tree.Node current = nodeStack.peek();
        nodeStack.pop();
        if (current.getRight() != null) {
            nodeStack.push(current.getRight());
        }
        if (current.getLeft() != null) {
            nodeStack.push(current.getLeft());
        }
        return current.getData();
    }
}
