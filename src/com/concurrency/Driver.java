package com.concurrency;

/*
  @created 28/05/2021 - 20:48
  @author  Adham eldda
  @package com.concurrency
  @project GreeBash
 */
public class Driver {

  public static void main(String[] args) {

    MyRunnable myRunnable = new MyRunnable();

    Thread thread = new Thread(myRunnable);
    thread.start();
  }
}
