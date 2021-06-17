package com.design.pattern.iterator.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 @created 28/05/2021 - 16:57
 @author  Adham eldda
 @package com.design.pattern.singleton
 @project GreeBash
*/
public class LazySingleton {

  private String[] letterList = {"A", "B", "C", "D", "E"};
  private List<String> list = Arrays.asList(letterList);
  private static volatile LazySingleton instance;

  private static boolean delayMe = true;

  public static  LazySingleton getInstance()  {

      synchronized (LazySingleton.class) {
        if (instance == null) {
        if (delayMe) {
          Thread.currentThread();
          try {

            Thread.sleep(1000);
          } catch (InterruptedException e) {
          }
          ;
        }
        instance = new LazySingleton();
      }
      }

    return instance;
  }

  private LazySingleton() {
    Collections.shuffle(this.list);
  }
  ;

  public void displayItems() {

    for (String item : list) {

      System.out.printf("%s ",item);
    }
    System.out.println();
  }
}
