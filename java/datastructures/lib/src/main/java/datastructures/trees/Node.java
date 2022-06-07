package datastructures.trees;

public class Node<T> {
  public Node(){

  }
 public T value;
  public Node<T> left;
  public Node<T> right;

  public Node(T value){
    this.value = value;
    right = null;
    left = null;
  }



}
