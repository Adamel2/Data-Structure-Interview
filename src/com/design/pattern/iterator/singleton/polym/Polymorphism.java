package com.design.pattern.iterator.singleton.polym;

/*
  @created 28/05/2021 - 15:46
  @author  Adham eldda
  @package com.design.pattern
  @project GreeBash
 */
public class Polymorphism {
  public static void main(String[] args) {
    Shape firstShape = new Circle();
    firstShape.draw();
    Shape SecondShape = new Triangle();
    SecondShape.draw();
  }
}
