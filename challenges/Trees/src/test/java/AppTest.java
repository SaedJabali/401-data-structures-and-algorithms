//import Data.Node;
//import Structure.BinarySearchTree;
//import Structure.BinaryTree;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class AppTest {
//
//    @Test
//    public void insertNode() {
//        BinaryTree binaryTree = new BinaryTree();
//        binaryTree.setRoot(new Node(3));
//        Assertions.assertEquals(3, binaryTree.getRoot().getKey());
//    }
//
//    @Test
//    public void inOrderBT() {
//        BinaryTree binaryTree = new BinaryTree();
//        binaryTree.setRoot(new Node(7));
//        binaryTree.getRoot().setLeft(new Node(4));
//        binaryTree.getRoot().setRight(new Node(1));
//        Assertions.assertEquals("4 7 1 ", binaryTree.inOrder(binaryTree.getRoot()));
//
//    }
//
//    @Test
//    public void postOrderBT() {
//        BinaryTree binaryTree = new BinaryTree();
//        binaryTree.setRoot(new Node(7));
//        binaryTree.getRoot().setLeft(new Node(4));
//        binaryTree.getRoot().setRight(new Node(1));
//        Assertions.assertEquals("4 1 7 ", binaryTree.postOrder(binaryTree.getRoot()));
//    }
//
//    @Test
//    public void PreOrderBT() {
//        BinaryTree binaryTree = new BinaryTree();
//        binaryTree.setRoot(new Node(7));
//        binaryTree.getRoot().setLeft(new Node(4));
//        binaryTree.getRoot().setRight(new Node(1));
//        assertEquals("7 4 1 ", binaryTree.preOrder(binaryTree.getRoot()));
//    }
//
//
//    @Test
//    public void inOrderBST() {
//        BinarySearchTree binarySearchTree = new BinarySearchTree();
//        binarySearchTree.insert(7);
//        binarySearchTree.insert(4);
//        binarySearchTree.insert(1);
//        Assertions.assertEquals("1 4 7 ", binarySearchTree.inOrder(binarySearchTree.getRoot()));
//    }
//
//    @Test
//    public void postOrderBST() {
//        BinarySearchTree binarySearchTree = new BinarySearchTree();
//        binarySearchTree.insert(7);
//        binarySearchTree.insert(4);
//        binarySearchTree.insert(1);
//        Assertions.assertEquals("1 7 4 ", binarySearchTree.postOrder(binarySearchTree.getRoot()));
//    }
//
//    @Test
//    public void PreOrderBST() {
//        BinarySearchTree binarySearchTree = new BinarySearchTree();
//        binarySearchTree.insert(7);
//        binarySearchTree.insert(4);
//        binarySearchTree.insert(1);
//        Assertions.assertEquals("4 1 7 ", binarySearchTree.preOrder(binarySearchTree.getRoot()));
//    }
//
//}
