package com.design.pattern.iterator.singleton.dependency;

/*
  @created 28/05/2021 - 15:52
  @author  Adham eldda
  @package com.design.pattern.dependency
  @project GreeBash
 */
public class Drawing {

  public Shape shape;

  public Drawing(Shape shape) {
    this.shape = shape;
  }

  //we can create setter method to dependency injection...
}
