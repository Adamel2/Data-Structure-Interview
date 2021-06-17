package com.design.pattern.iterator.singleton.dependency;

/*
  @created 28/05/2021 - 15:53
  @author  Adham eldda
  @package com.design.pattern.dependency
  @project GreeBash
 */
public class Circle implements Shape{
  @Override
  public void draw() {
    System.out.println("Circle!");
  }
}
