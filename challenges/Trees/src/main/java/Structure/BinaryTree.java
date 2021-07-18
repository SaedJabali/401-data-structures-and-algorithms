package Structure;

import Data.Node;

public class BinaryTree {
    Node root;

    public BinaryTree() {
    }

    public String inOrder(Node node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.print(" " + node.getKey());
            inOrder(node.getRight());
        }
        return null;
    }

    public String postOrder(Node node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(" " + node.getKey());
        }
        return null;
    }

    public String preOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.getKey());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
        return null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}
