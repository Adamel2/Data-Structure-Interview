package com.design.pattern.iterator.singleton.factory_method;

/*
  @created 28/05/2021 - 16:14
  @author  Adham eldda
  @package com.design.pattern.factory_method
  @project GreeBash
 */
public class FactoryMethod {
  public static void main(String[] args) {

    NotificationFactory notificationFactory = new NotificationFactory();

    notificationFactory.createNotification("SMS").notifyUser();
  }
}
