package com.sort;

/*
 @created 19/05/2021 - 20:26
 @author  Adham eldda
 @package com.sort
 @project GreeBash
*/
public class MergeSort {

  int[] array;
  int[] tempArray;

  public static void main(String[] args) {
    int[] arr = {1, 50, 30, 10, 60, 80,10};
    System.out.println("Before Sorting");
    for (int i = 0; i < arr.length; i++) {

      System.out.print(arr[i] + "\t");
    }

    new MergeSort().PrepareForSort(arr);
    System.out.println("\nAfter Sorting");
    for (int i = 0; i < arr.length; i++) {

      System.out.print(arr[i] + "\t");
    }
  }

  void PrepareForSort(int[] arr) {
    // Prepare for sort
    this.array = arr;
    this.tempArray = new int[arr.length];
    doMergeSort(0, arr.length - 1);
  }

  void doMergeSort(int lowerIndex, int higherIndex) {
    if (lowerIndex < higherIndex) {
      int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
      doMergeSort(lowerIndex, middle);
      doMergeSort(middle + 1, higherIndex);
      mergePart(lowerIndex, middle, higherIndex);
    }
  }
  // merge small problems and sort
  void mergePart(int lowerIndex, int middle, int higherIndex) {
    for (int i = lowerIndex; i <= higherIndex; i++) {
      tempArray[i] = array[i];
    }
    int i = lowerIndex;
    int j = middle + 1;
    int k = lowerIndex;
    while (i <= middle && j <= higherIndex) {
      if (tempArray[i] <= tempArray[j]) {
        array[k] = tempArray[i];
        i++;
      } else {
        array[k] = tempArray[j];
        j++;
      }
      k++;
    }
    while (i <= middle) {
      array[k] = tempArray[i];
      k++;
      i++;
    }
  }
}
