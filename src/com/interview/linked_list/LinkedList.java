package com.interview.linked_list;

/*
  @created 18/05/2021 - 14:12
  @author  Adham eldda
  @package com.interview.linked_list
  @project GreeBash
 */
public class LinkedList {
  Node head;

  public LinkedList(Node head) {
    this.head = head;
  }

  public void add(Node node){//O(1)
    node.setNext(head);
    head = node;
  }
  public void delete(){ //O(1)
    head=head.getNext();
  }

  public void display(){
    Node n =head;
    while(n != null)
    {
      System.out.println(n.getValue());
      n=n.getNext();
    }
  }

  @Override
  public String toString() {
    return "LinkedList{" +
      "head=" + head +
      '}';
  }
}
