package com.interview.queue_double_linked_list;

/*
  @created 19/05/2021 - 14:28
  @author  Adham eldda
  @package com.interview.queue_double_linked_list
  @project GreeBash
 */
public class QueueLinkedListDriver {

  public static void main(String[] args) {
    Queue<String> queueLinkedList = new Queue<>(new Node("A",null,null));

    queueLinkedList.add(new Node("B",null,null));
    queueLinkedList.add(new Node("C",null,null));
    queueLinkedList.delete();

    queueLinkedList.display();
  }
}
