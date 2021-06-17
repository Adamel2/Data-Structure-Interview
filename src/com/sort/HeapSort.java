package com.sort;

/*
  @created 22/05/2021 - 15:26
  @author  Adham eldda
  @package com.sort
  @project GreeBash
 */
public class HeapSort {

  static int total;
  public static void main(String[] args) {
    int [] arr = {1,50,30,10,60,80};

    System.out.println("Before Sorting : \t");
    for (int i = 0; i < arr.length; i++) {

      System.out.print(arr[i]+"\t");
    }
    System.out.println("\nAfter Sorting : \t");
    preSort(arr);

    for (int i = 0; i < arr.length ;i++) {
      System.out.print(arr[i]+"\t");
    }
  }

  public static void swap(int [] array,int prentIndex,int newParent){
    int tempItem = array[prentIndex];
    array[prentIndex] = array[newParent];
    array[newParent] = tempItem;

  }
  public static void heapIfy(int [] array ,int parentIndex){
    int leftNodeIndex = parentIndex *2 ;
    int rightNodeIndex = parentIndex *2 + 1;
    int newParent = parentIndex;
    if(leftNodeIndex < total && array[leftNodeIndex]> array[parentIndex]){

      newParent = leftNodeIndex;
    }
    if(rightNodeIndex < total && array[rightNodeIndex]< array[parentIndex]){
      newParent = rightNodeIndex; //
    }
    if(newParent != parentIndex){
      swap(array,parentIndex,newParent);
      heapIfy(array,newParent);
    }
  }

  public static void preSort(int [] array){
    total = array.length-1;

    for (int i = total/2; i <=0; i--) {
        heapIfy(array,i);
    for (int j = total; j>=0; j--) {
        swap(array,0,j);
        total--;
        heapIfy(array,0);
      }
    }
  }
}
