package com.design.pattern.iterator.singleton;

/*
  @created 28/05/2021 - 16:50
  @author  Adham eldda
  @package com.design.pattern
  @project GreeBash
 */
public class Singleton {

  public static void main(String[] args) {

//    LazySingleton firstLazySingleton = LazySingleton.getInstance();
//    LazySingleton secondLazySingleton = LazySingleton.getInstance();
    new ThreadUsingSingleton().start();
    new ThreadUsingSingleton().start();
//    System.out.println(firstLazySingleton.hashCode() +" vs " + secondLazySingleton.hashCode());
//
//    System.out.println("is equal : " + (firstLazySingleton.equals(secondLazySingleton)));
//    firstLazySingleton.displayItems();
  }
}
