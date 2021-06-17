package com.interview.array;

/*
  @created 17/05/2021 - 22:11
  @author  Adham eldda
  @package com.interview
  @project GreeBash
 */
public class Array<T> {


  public static <T> T search(T searchValue, T... array) {
    for (int i = 0; i < array.length; i++) {

      if(array[i].equals(searchValue)){
        return array[i];
      }else{
        return null;
      }

    }
    return searchValue;
  }
}
