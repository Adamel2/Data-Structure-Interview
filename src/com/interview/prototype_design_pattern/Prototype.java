package com.interview.prototype_design_pattern;

/*
  @created 18/05/2021 - 21:23
  @author  Adham eldda
  @package com.interview.prototype_design_pattern
  @project GreeBash
 */
public class Prototype {

  public static void main(String[] args) {

    Color firstColor = new BlueColor();
    Color secondColor = new BlueColor();

    entering(firstColor);
    entering(secondColor);

  }

  public static void entering(Color  someObject)
  {
    System.out.println(someObject);
  }
}
