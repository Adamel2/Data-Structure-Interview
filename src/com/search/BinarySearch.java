package com.search;

/*
  @created 19/05/2021 - 18:45
  @author  Adham eldda
  @package com.search
  @project GreeBash
 */

//O(logn)
public class BinarySearch {
  private static int [] array = {1,5,8,9,10,30,70,80,100,200,201};
  public static void main(String[] args) {
    System.out.println(searchNumber(70,0,array.length-1,array));

  }

  public static String searchNumber(int number,int low,int high,int [] array){
    boolean isFound = true;
    int mid = 0;
    while(isFound == true){
      if(low>high){
        isFound = false;
        return "The element not found!";
      }
      mid = (high+low)/2; // low+(high-low)/2
      if(array[mid] == number){
        return Integer.toString(array[mid]);
      }
      if(array[mid] < number){
        low = mid+1;
      }
      if(array[mid] > number){
        high = mid-1;
      }
    }
    return "The element not found!";

  }
}
