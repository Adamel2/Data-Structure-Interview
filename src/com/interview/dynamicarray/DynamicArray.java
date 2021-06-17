package com.interview.dynamicarray;

import java.util.Arrays;

/*
  @created 17/05/2021 - 22:35
  @author  Adham eldda
  @package dynamicarray
  @project GreeBash
 */
public class DynamicArray<T> {
  private Object [] array ;
  private int size ;

  public DynamicArray() {
    this.size = 0;
    this.array = (T[]) new Object[1];

  }

  public Object searchItem(T item) {
    for (int i = 0; i < array.length; i++) {

      if (array[i].equals(item)) {
        return array[i];
        }
    }
    return null;
  }

  public void addItem(Object item){
    System.out.println(array.length);
    ensureCapacity(size+1);
    array[size++] = item;
  }

  private void ensureCapacity(int minCapacity){
    int oldCapacity = array.length;
    if(minCapacity>oldCapacity)
    {
      int newCapacity = oldCapacity*2;
      array = Arrays.copyOf(array,newCapacity);
    }
  }

  @Override
  public String toString() {
    return "DynamicArray{" +
      "array=" + Arrays.toString(array) +
      '}';
  }
}
