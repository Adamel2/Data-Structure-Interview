package com.interview.queue;

/*
  @created 18/05/2021 - 18:18
  @author  Adham eldda
  @package com.interview
  @project GreeBash
 */
public class Queue<T> {
  private Object[] queueArray;
  private int size;
  private int rear;
  private int front;

  public Queue(int size) {
    this.size = size;
    this.queueArray = new Object[size];
    this.front = -1;
    this.rear = 0;
  }

  public void queue(Object item){
    if(isFull()){
      front++;
      this.queueArray[front] = item;
    }
  }
  public void deQueue(){
    if(isEmpty()){
      queueArray[rear++]= null;
    }
  }

  public boolean isFull(){
    if(front==size){
      return false;
    }
    return true;
  }

  public boolean isEmpty(){
    if(rear >= size){
      return false;
    }
    if(rear == size){
      rear = -1;
      front = -1;
    }
    return true;
  }

  public void display(){
    for (int i = 0; i < queueArray.length ; i++) {
      if(queueArray[i] != null){
        System.out.println(queueArray[i]);
      }
    }
  }


}
