//package datastructures;
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.List;
//
//
//public class BfsTest {
//  public void build(BinaryTree sut)
//  {
//    BinaryTree sut1a = new BinaryTree();
//    BinaryTree sut1b = new BinaryTree();
//
//    BinaryTree sut2a = new BinaryTree();
//    BinaryTree sut2b = new BinaryTree();
//    BinaryTree sut2c = new BinaryTree();
//
//    BinaryTree sut3a = new BinaryTree();
//    BinaryTree sut3b = new BinaryTree();
//    BinaryTree sut3c = new BinaryTree();
//
////    sut.tNode = new Node<>(2);
//    sut.tNode = new Node<>(2);
//    sut1a.tNode = new Node<>(7);
//    sut1b.tNode = new Node<>(5);
//
//    sut2a.tNode = new Node<>(2);
//    sut2b.tNode = new Node<>(6);
//    sut2c.tNode = new Node<>(9);
//
//    sut3a.tNode = new Node<>(5);
//    sut3b.tNode = new Node<>(11);
//    sut3c.tNode = new Node<>(4);
//
////    sut3a.tNode.setLeftNode(null);
////    sut3a.tNode.setRightNode(null);
////    sut3b.tNode.setLeftNode(null);
////    sut3b.tNode.setRightNode(null);
////    sut3c.tNode.setLeftNode(null);
////    sut3c.tNode.setRightNode(null);
//
////    sut2a.tNode.setLeftNode(null);
////    sut2a.tNode.setRightNode(null);
//
//    sut2b.tNode.left = sut3a.tNode;
//    sut2b.tNode.right = sut3b.tNode;
//
//    sut2c.tNode.left = sut3c.tNode;
//    sut2c.tNode.right = null;
//
//    sut1a.tNode.left = sut2a.tNode;
//    sut1a.tNode.right = sut2b.tNode;
//
//    sut1b.tNode.right = sut2c.tNode;
//
//    sut.tNode.left = sut1a.tNode;
//    sut.tNode.right = sut1b.tNode;
//
//  }
//
//  @Test
//  public void testBfs() {
//    BinaryTree sut = new BinaryTree();
//    build(sut);
//    List<Integer> test = sut.levelOrder(sut.tNode);
//    assertEquals("[2, 7, 5, 2, 6, 9, 5, 11, 4]", test.toString() );
//    return;
//  }
//}
