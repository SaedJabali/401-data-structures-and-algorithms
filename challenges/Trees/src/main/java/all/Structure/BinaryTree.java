package all.Structure;

import all.Data.Node;

public class BinaryTree {
    Node root;
    int max;

    public BinaryTree() {
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.print(" " + node.getKey());
            inOrder(node.getRight());
        }
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(" " + node.getKey());
        }
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.getKey());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int getMax(Node node)
    {
        if (node == null)
            return 0;

        int root = node.getKey();
        int left = getMax(node.getLeft());
        int right = getMax(node.getRight());

        if (left > root)
            root = left;
        if (right > root)
            root = right;
        return root;
    }


    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
