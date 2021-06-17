package com.sort;

/*
 @created 23/05/2021 - 14:09
 @author  Adham eldda
 @package com.sort
 @project GreeBash
*/
public class QuickSort {

  public static void main(String[] args) {
    int arr[] = {10, 7, 8, 9, 1, 5};
    int length = arr.length - 1;

    quickSort(arr, 0, length);
    displayArray(arr);
  }

  public static void displayArray(int [] array){
    for (int i = 0; i < array.length ; i++) {
      System.out.print(array[i]+"\t");
    }
  }

  public static void quickSort(int[] arr, int low, int high) {
    if (low < high)
    {

      // pi is partitioning index, arr[p]
      // is now at right place
      int pi = partition(arr, low, high);

      // Separately sort elements before
      // partition and after partition
      quickSort(arr, low, pi - 1);
      quickSort(arr, pi + 1, high);
    }
  }

  public static int partition(int[] arr, int low, int high) {
    int i = (low - 1);
    int pivot = arr[high];
    for (int j = low; j <= high - 1; j++) {

      if (arr[j] < pivot) {
        i++;
        swap(arr, i, j);
      }
    }
    swap(arr, i + 1, high);
    return i + 1;
  }

  public static void swap(int[] arr, int firstIndex, int lastIndex) {

    int tempValue = arr[firstIndex];
    arr[firstIndex] = arr[lastIndex];
    arr[lastIndex] = tempValue;
  }
}
