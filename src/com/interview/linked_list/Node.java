package com.interview.linked_list;

/*
  @created 18/05/2021 - 14:01
  @author  Adham eldda
  @package com.interview.linked_list
  @project GreeBash
 */
public class Node<T> {
  private T value;
  private Node next;

  public Node(T value, Node next) {
    this.value = value;
    this.next = next;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public T getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "Node{" +
      "value=" + value +
      '}';
  }
}
