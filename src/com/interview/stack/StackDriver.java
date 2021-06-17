package com.interview.stack;


/*
  @created 18/05/2021 - 15:24
  @author  Adham eldda
  @package com.interview.stack
  @project GreeBash
 */
public class StackDriver {

  public static void main(String[] args) {
  StackArray<String> stackArray = new StackArray<>(5);
  stackArray.push("A");
  stackArray.push("B");
  stackArray.push("C");
  stackArray.pop();
  stackArray.display();



    //
  }



}
