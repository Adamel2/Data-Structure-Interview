package com.design.pattern.iterator.observer;

/*
  @created 28/05/2021 - 17:48
  @author  Adham eldda
  @package com.design.pattern.observer
  @project GreeBash
 */
public class Person implements Observer{

  private String name;

  public Person(String name) {
    this.name = name;
  }

  @Override
  public void update(String message) {
    System.out.println(message);
  }
}
