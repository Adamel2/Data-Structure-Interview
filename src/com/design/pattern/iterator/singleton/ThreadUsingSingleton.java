package com.design.pattern.iterator.singleton;

/*
  @created 28/05/2021 - 17:19
  @author  Adham eldda
  @package com.design.pattern.singleton
  @project GreeBash
 */
public class ThreadUsingSingleton extends Thread {


  @Override
  public void run() {

      LazySingleton.getInstance().displayItems();

  }
}
