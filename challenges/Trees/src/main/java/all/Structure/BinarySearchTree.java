package all.Structure;

import all.Data.Node;

public class BinarySearchTree extends BinaryTree {
    Node root;

    public Node getRoot() {
        return root;
    }

    public void insert(int key) {
        if (root == null) {
            root = new Node(key);
        } else {
            Node temp = root;
            travers(temp, key);
        }
    }

    public void travers(Node temp, int key) {
        if (key > temp.getKey()) {
            if (temp.getRight() == null) {
                temp.setRight(new Node(key));
                return;
            }
            temp = temp.getRight();
        } else {
            if (temp.getLeft() == null) {
                temp.setLeft(new Node(key));
                return;
            }
            temp = temp.getLeft();
        }
        travers(temp, key);

    }

    public boolean contains(Node temp, int key) {

        if (root == null) {
            return false;
        } else if (temp == null) {
            return false;
        } else if (key > temp.getKey()) {
            if (temp.getKey() == key) {
                return true;

            } else {
                temp = temp.getRight();
                return contains(temp, key);
            }
        } else if (temp.getKey() == key) {
            return true;
        } else {
            temp = temp.getLeft();
            return contains(temp, key);
        }
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
