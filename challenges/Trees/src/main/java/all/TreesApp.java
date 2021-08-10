package all;

import all.Data.Node;
import all.Structure.BinarySearchTree;
import all.Structure.BinaryTree;


public class TreesApp {
    public static void main(String[] args) {
        System.out.println("ok");

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.setRoot(new Node(1));
        binaryTree.getRoot().setLeft(new Node(2));
        binaryTree.getRoot().setRight(new Node(3));
        binaryTree.getRoot().getLeft().setLeft(new Node(4));
        binaryTree.getRoot().getLeft().setRight(new Node(78));
        binaryTree.getRoot().getRight().setRight(new Node(13));
        binaryTree.getRoot().getRight().setLeft(new Node(6));
//        System.out.print(binaryTree.toString());
        System.out.println(" ");
        binaryTree.inOrder(binaryTree.getRoot());
        System.out.println("  ");
        binaryTree.postOrder(binaryTree.getRoot());
        System.out.println("  ");
        binaryTree.preOrder(binaryTree.getRoot());
        System.out.println(" ");
        System.out.println("the max is " + binaryTree.getMax(binaryTree.getRoot()));
        System.out.println(" ");
        System.out.println("BFT ");
//        binaryTree.BFT();
        System.out.println(" ");
        System.out.println("-------------------------------");


        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(3);
        binarySearchTree.insert(2);
        binarySearchTree.insert(6);
        binarySearchTree.insert(9);
//        System.out.println(binarySearchTree.toString());
        binarySearchTree.inOrder(binarySearchTree.getRoot());
        System.out.println("  ");
        binarySearchTree.postOrder(binarySearchTree.getRoot());
        System.out.println("  ");
        binarySearchTree.preOrder(binarySearchTree.getRoot());
        System.out.println(" ");
        System.out.println("the max is " + binarySearchTree.getMax(binarySearchTree.getRoot()));
        System.out.println(" ");
//        System.out.println(binarySearchTree.contains());
//        System.out.println(binarySearchTree.contains());
        System.out.println(binarySearchTree.contains(binarySearchTree.getRoot(), 3));
        System.out.println(binarySearchTree.contains(binarySearchTree.getRoot(), 9));
        System.out.println(binarySearchTree.contains(binarySearchTree.getRoot(), 2));
        System.out.println(binarySearchTree.contains(binarySearchTree.getRoot(), 6));
        System.out.println(binarySearchTree.contains(binarySearchTree.getRoot(), 7));
        System.out.println(binarySearchTree.contains(binarySearchTree.getRoot(), 4));
        System.out.println(binarySearchTree.contains(binarySearchTree.getRoot(), 1));
    }
}
