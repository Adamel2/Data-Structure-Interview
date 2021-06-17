package com.design.pattern.iterator.observer;

/*
  @created 28/05/2021 - 17:57
  @author  Adham eldda
  @package com.design.pattern.observer
  @project GreeBash
 */
public class Driver {

  public static void main(String[] args) {
    Product product = new Product("Banana Phone");

    Person first = new Person("Adam");
    Person second = new Person("Moshe");
    Person third = new Person("Avi");
    Person fourth = new Person("Guy");

    product.add(first);
    product.add(second);
    product.add(third);
    product.add(fourth);

    product.setAvailability(true);
  }
}
