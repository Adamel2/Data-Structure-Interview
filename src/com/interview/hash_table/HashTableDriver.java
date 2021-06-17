package com.interview.hash_table;

/*
  @created 19/05/2021 - 16:05
  @author  Adham eldda
  @package com.interview.hash_table
  @project GreeBash
 */
public class HashTableDriver {

  public static void main(String[] args) {

    HashMap<String> hashMap = new HashMap<String>(10);

    hashMap.put(1,"A");
    hashMap.put(2,"B");
    hashMap.put(9,"BBBB");
    hashMap.put(3,"C");
    hashMap.put(4,"D");
    hashMap.put(5,"E");
    hashMap.put(6,"F");
    hashMap.put(7,"G");

    System.out.println(hashMap.get(9));
  }
}
