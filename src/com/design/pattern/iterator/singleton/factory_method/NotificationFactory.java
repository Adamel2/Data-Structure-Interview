package com.design.pattern.iterator.singleton.factory_method;

/*
  @created 28/05/2021 - 16:18
  @author  Adham eldda
  @package com.design.pattern.factory_method
  @project GreeBash
 */
public class NotificationFactory {

  public Notification createNotification(String type){

    if (type.equals("SMS")){
      return new SmsNotification();
    } else if (type.equals("Email")) {
      return new EmailNotification();
    }else if(type.equals("Push")){
      return new PushNotification();
    }
    return null;
  }
}
