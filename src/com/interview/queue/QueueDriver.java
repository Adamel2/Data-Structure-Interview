package com.interview.queue;

/*
  @created 18/05/2021 - 18:33
  @author  Adham eldda
  @package com.interview.queue
  @project GreeBash
 */
public class QueueDriver {

  public static void main(String[] args) {
    Queue<String> queueList =  new Queue<>(5);

    queueList.queue("A");
    queueList.queue("B");
    queueList.queue("C");
    queueList.queue("D");

    queueList.display();
    queueList.deQueue();
    System.out.println("************");
    queueList.display();
  }
}
