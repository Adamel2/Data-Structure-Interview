package com.design.pattern.iterator.singleton.dependency;

/*
  @created 28/05/2021 - 15:44
  @author  Adham eldda
  @package com.design.pattern.dependency
  @project GreeBash
 */
public class DependencyInjection {
  public static void main(String[] args) {
    Drawing drawing = new Drawing(new Circle());

    drawing.shape.draw();
  }
}
