package com.design.pattern.iterator.singleton.factory_method;

/*
  @created 28/05/2021 - 16:15
  @author  Adham eldda
  @package com.design.pattern.factory_method
  @project GreeBash
 */
public class PushNotification implements Notification{
  @Override
  public void notifyUser() {
    System.out.println("Sending an Push Notification");
  }
}
