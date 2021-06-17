package com.interview.hash_table;

/*
  @created 19/05/2021 - 17:28
  @author  Adham eldda
  @package com.interview.hash_table
  @project GreeBash
 */
public class Entry <T>{

  int key;
  T value;
  Entry next;

  public Entry() {
    this.next = null;
  }

  public Entry(int key, T value) {
    this.key = key;
    this.value = value;
    this.next = null;
  }

  public int getKey() {
    return key;
  }

  public T getValue() {
    return value;
  }

}
