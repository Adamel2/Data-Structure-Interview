package com.recursion;

/*
  @created 19/05/2021 - 19:49
  @author  Adham eldda
  @package com.recursion
  @project GreeBash
 */
public class Recursion {
  public static void main(String[] args) {
    System.out.println(factorial(4));
  }
  public static int factorial(int number){
    if(number == 1)
      return 1;
    return number*factorial(number-1);
  }
}
