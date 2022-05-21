package datastructures.linkedlist;


public class LinkedList {
  int myInt = 3;
  public Node head;
  Node tail;


  public LinkedList(){
    this.head = null;
  this.tail = null;
  }
  public void insert(int value) {
    if(head == null){
      head = new Node(value);
      return;
    }
    Node temp = new Node(value);
    temp.next=head;
    tail = head;
    head = temp;
  }
  public boolean includes(int value){
    Node current = head;
    while (current != null){
      if(value == current.value)
        return true;
      current = current.next;
    }
    return false;
  }
  @Override
  public String toString(){
    String temp = "";
    Node current = head;
    while(current != null){
      temp = temp + "[" + current.value + "] -> ";
      current = current.next;
    }
    return temp + "null";
  }
}
