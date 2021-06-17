package com.interview.hash_table;

/*
  @created 19/05/2021 - 17:29
  @author  Adham eldda
  @package com.interview.hash_table
  @project GreeBash
 */
public class HashMap<T> {

  Entry[] array;
  int size;

  public HashMap(int size) {
    this.size = size;
    array = new Entry[size];
    for(int i = 0; i < array.length ; i++) {

      array[i] = new Entry<T>();
    }

  }

  public void put(int key,T value){

    Entry<T> entry = new Entry<>(key,value);
    int index = hashCode(key);
    array[index].next = entry;
    entry.next = array[index];
//    array[index] = null;
  }
  public T get(int key){
    Entry value = array[hashCode(key)];

    while(value != null){
      if(value.getKey() == key){
        return (T)value.getValue();
      }
      value = value.next;
    }
    return null;
  }
  public int hashCode(int key){

    return key % size;
  }
}
