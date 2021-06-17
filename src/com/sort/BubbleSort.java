package com.sort;

/*
  @created 19/05/2021 - 20:04
  @author  Adham eldda
  @package com.sort
  @project GreeBash
 */
public class BubbleSort {

  private static int[] array = {1,5,2,7,1,9,10,6,3,4};

  public static void main(String[] args) {

    int [] sortingArray = bubbleSort(array);
    for (int i = 0; i <sortingArray.length; i++) {
      System.out.print(sortingArray[i]+" ");
    }
  }

  public static int [] bubbleSort(int [] array)
  {
    int n = array.length;
    int [] sortArray = array;
    for (int i = 0; i <n ; i++) {
      for (int j = 1; j < n-i; j++) {
        int temp = sortArray[j-1];
        if(sortArray[j-1]>sortArray[j] ){
          sortArray[j-1] = sortArray[j];
          sortArray[j]= temp;
        }
      }
    }
      return sortArray;
  }
}
