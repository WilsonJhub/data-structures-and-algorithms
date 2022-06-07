package datastructures.trees;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BinarySearchTree extends BinaryTree {
  // this is my method that I call to add recursive operation.
  public void add(int value){
    add(tNode, value);
  }

  // adding Recursively
  private Node<Integer> add (Node<Integer> tNode, int value){
    if(tNode == null)
      return new Node<Integer>(value);
    if(value < tNode.value){
      tNode.left = add(tNode.left, value);
    } else if (value > tNode.value){
      tNode.right = add(tNode, value);
    } else {
      return tNode;
    }
    return tNode;
  }

  public boolean contains (int value){
    return contains(tNode, value);
  }
  private boolean contains(Node<Integer> current, int value){
    if (current == null){
      return false;
    }
    if (value < current.value){
      return true;
    }
    return value < current.value ?
      contains(current.left, value) :
      contains(current.right, value);
  }
  }

