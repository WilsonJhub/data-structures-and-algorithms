package datastructures;



import datastructures.linkedlist.LinkedList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

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
