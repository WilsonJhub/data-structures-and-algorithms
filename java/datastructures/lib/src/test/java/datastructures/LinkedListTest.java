package datastructures;



import datastructures.linkedlist.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

import datastructures.trees.BinarySearchTree;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class LinkedListTest {
  @Test
  void someLinkedListTest() {
    LinkedList sut = new LinkedList();

  }

  @Test
  public void testEmpty() {
    LinkedList sut = new LinkedList();
    assert(sut.head == null);
  }


}
