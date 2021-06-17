package com.interview.queue_double_linked_list;

/*
  @created 19/05/2021 - 14:20
  @author  Adham eldda
  @package com.interview.queue_double_linked_list
  @project GreeBash
 */
public class Queue <T>{

  private Node<T> front;
  private Node<T> rear;


  public Queue(Node head) {
    this.front = head;
    this.rear = head;

  }

  public void add(Node<T> node){

    this.front.setNext(node);
    node.setPrevious(front);
    node.setNext(null);
    this.front = node;
  }
  public void delete()
  {
    if(this.rear.getNext()!= null)
      this.rear = rear.getNext();
  }

  public void display(){
    Node<T> node= this.rear;
    while(node != null){
      System.out.println(node.getValue());
      node = node.getNext();
    }
  }


}
