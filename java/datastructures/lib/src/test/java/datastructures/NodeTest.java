package datastructures;

import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NodeTest {
  @Test
  public void dummy() {
    Node sut = new Node(3);
    assertTrue(sut.value == 3);
    assertEquals(3,sut.value);
  }

}
