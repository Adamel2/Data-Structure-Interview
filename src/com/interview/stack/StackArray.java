package com.interview.stack;

/*
  @created 18/05/2021 - 15:11
  @author  Adham eldda
  @package com.interview.stack
  @project GreeBash
 */
public class StackArray<T> {

  private int size;
  private int top;
  private Object[] arrayStack;

  public StackArray() {
  }

  public StackArray(int size) {
    this.size = size;
    this.top = -1;
    this.arrayStack = new Object[size];
  }

  public T pop(){
    boolean checkIsEmpty = isEmpty();
    T item;
    if(!checkIsEmpty){
      item = (T)arrayStack[top];
      arrayStack[top] = null;
      top--;
      return (T)item;
    }
    return null;
  }
  public void push(Object item){
    boolean checkIsFull= isFull();
    if(!checkIsFull){

      top = top+1;
      arrayStack[top] = item;

    }

  }

  public boolean isFull(){
    return top == size || top >=size;
  }
  public boolean isEmpty(){
    return top == -1;
  }

  public void display(){
    for (int i = 0; i < arrayStack.length; i++) {

      System.out.println(arrayStack[i]+" i, Top is "+top);
    }
  }

}
