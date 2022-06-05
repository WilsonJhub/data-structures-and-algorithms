package datastructures.linkedlist;
import datastructures.linkedlist.Node;

public class LinkedList {
  int myInt = 3;
  public Node head;
  Node tail;


  public LinkedList(){
    this.head = null;
    this.tail = null;
  }
  public void insert(int value) {
    Node newNode = new Node(value);
    if(head != null){
      newNode.next = head;
    }
    if(head == null) {
      tail = newNode;
    }
    head = newNode;
    }

  public boolean includes(int value){
    if(this.head == null) return false;
    Node current = head;
    while(current != null){
      if(current.value == value){
        return true;
      }
      current = current.next;
    }
    return false;
  }
  public void append (int value){
    Node newNode = new Node(value){
      tail.next = newNode;
      }
    }
  }

//  @Override
//  public String toString(){
//    String temp = "";
//    Node current = head;
//    while(current != null){
//      temp = temp + "[" + current.value + "] -> ";
//      current = current.next;
//    }
//    return temp + "null";
//  }
//
//  // --- Lab 8 ZipList ---
//  public boolean zipList (LinkedList<T> otherList) {
//    try {
//      Node<T> tempAlpha = this.head;
//      Node<T> tempBravo = otherList.head;
//      Node<T> tempCharlie = this.head.next;
//
//      while (tempAlpha.next != null) {
//        tempCharlie = tempAlpha.next;
//
//        tempAlpha.next = tempBravo;
//        otherList.head = otherList.head.next;
//        tempBravo.next = tempCharlie;
//        tempBravo = otherList.head;
//        tempAlpha = tempCharlie;
//
//      }
//      tempAlpha.next =tempBravo;
//    } catch ( Exception ex) {
//      System.out.println("something went wrong: " + ex.getMessage());
//      return false;
//
//    }
//    return true;
//  }

}
