package datastructures.linkedlist;
import datastructures.linkedlist.Node;

public class LinkedList {
//  int myInt = 3;
  public Node head;
  Node tail;
  public int listLength = 0;

  public LinkedList(){
    this.head = null;
    this.tail = null;
  }
  public void insert(int value) {
    //newNode var of type Node (class) = new Node object with argument of (value)
    Node newNode = new Node(value);
    // here we're saying if the Head is not equal to null -> then run the method newNode.next = head;
    if(head != null){
      // the NEXT NODE will be promoted to the title of "head" in the LinkedList.
      newNode.next = head;
    }
    // but if that head is equal to null... then...
    if(head == null) {
// tail will equal a newNode. and newNode was defined as a new object named Node with (value) as an argument.
      tail = newNode;
    }
    // head will also
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
  public void append(int value){
    Node newNode = new Node(value);
    tail.next = newNode;
    tail = newNode;
  }
  public void insertBefore(int value, int match){
    Node newNode = new Node(value);
    if(head.value == match){
      newNode.next = head;
      head = newNode;
    }
    Node current = head;
    Node prev = head;
    while(current != null){
      current = current.next;
      if(current.value == match){
        newNode.next = current;
        prev.next = newNode;
        break;
      }
      prev = current;
    }
  }
  public void insertAfter(int value,int match) {
    Node newNode = new Node(value);
    Node current = head;
    while(current != null){
      if(current.value == match){
        newNode.next = current.next;
        current.next = newNode;
        if(newNode.next == null){
          tail = newNode;
        }
      }
      current = current.next;
  }
}

  public void kthFromEnd(int k){
    if(k >= listLength || k < 0){

    }
    int stopPoint = listLength - k;
    Node current = head;
    for(int i = 0; i < stopPoint; i++){
      if(i == stopPoint - 1){
        int value = current.value;
      }
      current = current.next;
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


  //Thank you, Roger Reyes
  // --- Lab 8 ZipList ---

public LinkedList zipLists(LinkedList list2){
  Node current = head;
  Node list1Walker = head;
  Node list2Walker = list2.head;
  if(head == null && list2.head != null) return list2;
  while(current != null && list2.head != null){
    current = current.next;
    list1Walker.next = list2.head;
    list2.head = list2.head.next;
    list2Walker.next = current;
    if (list2.head != null) {
      list1Walker = current;
    }
    if(current != null){
      list2Walker = list2.head;
    }
  }
  if(list2.head != null){
    list2Walker.next = list2.head;
    list2.head = null;
  }
  return this;
}



  }


