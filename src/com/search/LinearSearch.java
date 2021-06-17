package com.search;

/*
  @created 19/05/2021 - 18:24
  @author  Adham eldda
  @package com.search
  @project GreeBash
 */
//O(n)
public class LinearSearch {

  public static void main(String[] args) {
    //
  int [] array = {1,2,3,4,45,5,76,4};

    for (int i = 0; i <array.length; i++) {

      if(array[i] == 76){
        System.out.println(array[i]);
      }
    }
  }

}
