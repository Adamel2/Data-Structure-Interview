package com.design.pattern.iterator.singleton.proxy;

/*
  @created 28/05/2021 - 16:35
  @author  Adham eldda
  @package com.design.pattern.proxy
  @project GreeBash
 */
public class RealTimeInternet implements Internet{
  @Override
  public void connectedTo(String url) {
    System.out.println("success to connected : " + url);
  }
}
