import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 @created 17/05/2021 - 22:12
 @author  Adham eldda
 @package PACKAGE_NAME
 @project GreeBash
*/
public class Driver {

  public static void main(String[] args) throws Exception {
    // My Testing Area

//    StringBuilder stringBuilder = new StringBuilder("Heelllllo");
//
//    stringBuilder.append("a");
//
//    System.out.println(stringBuilder);
    //    int[] arr = {1, 5, -1, 4, 6, 8, 9};
//
//    new Driver().reversArrays(arr);
//
//    for (int i = 0; i < arr.length; i++) {
//
//      System.out.print(arr[i] + "\t");
    }

    //    System.out.println(checkSum(arr,0,arr.length,5));
    //    LinkedList<String> linkedList = new LinkedList<>(new Node("A",null));
    //    linkedList.setNode(new Node("B",null));
    //    linkedList.setNode(new Node("C",null));
    //
    //    linkedList.display();
    //    int number=0;
    //
    //     double number2 = (double)1/(int)2;
    //
    //    System.out.println(number2);

    // ********************///

    // Standard Array
    //  Integer[] someArray = new Integer[]{1,2,3,4,5,6};
    //
    //  Array<Integer> myList = new Array<>();
    //   int a = Array.search(7,someArray);
    // Array List
    //    DynamicArray<Integer> list = new DynamicArray<>();
    //
    //    list.addItem(4);
    //    list.addItem(5);
    //    list.addItem(4);
    //    list.addItem(4);
    //    list.addItem(4);
    //
    //    System.out.println(list);
    // Array List
    //    String[] list = new String[3];
    //    list[0] = "a";
    //    list[1] = "c";
    //    list[2] = "c";
    //    String[] copyList = new String[3];
    //    copyList[0] = "a";
    //    copyList[1] = "c";
    //    copyList[2] = "c";

    //    String [] copyList = Arrays.copyOf(list,list.length * 2);
    //    for (int i = 0; i <copyList.length ; i++) {
    //
    //      System.out.println("i :" + copyList[i]);
    //    }
//  }

  //  public static boolean checkSum(int[] arr, int low, int high, int sum) {
  //    int start = low;
  //    int end = high - 1;
  //
  //    Arrays.sort(arr);
  //   while(start < end){
  //
  //        if (arr[start] + arr[end] == sum) {
  //          return true;
  //        }
  //        if (arr[end]+ arr[start] <  sum) {
  //          start++;
  //        }
  //
  //        end--;
  //      }
  //      return false;
  // }

  public void reversArrays(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    int tempValue;

    while (start != end) {
      tempValue = arr[start];
      arr[start] = arr[end];
      arr[end] = tempValue;
      start++;
      end--;
    }
  }
}
