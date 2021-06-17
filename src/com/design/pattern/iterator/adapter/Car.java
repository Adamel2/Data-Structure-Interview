package com.design.pattern.iterator.adapter;

/*
  @created 28/05/2021 - 18:15
  @author  Adham eldda
  @package com.design.pattern.adapter
  @project GreeBash
 */
public class Car implements Vehicle{
  @Override
  public void accelerate() {
    System.out.println("Car start to move...!");
  }
  @Override
  public void pushBreak() {
    System.out.println("Car Stopped");
  }

  @Override
  public void soundHorn() {

    System.out.println("Be Be Be Be....!");
  }
}
