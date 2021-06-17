package com.design.pattern.iterator.singleton.proxy;

/*
 @created 28/05/2021 - 16:25
 @author  Adham eldda
 @package com.design.pattern.proxy
 @project GreeBash
*/
public class Proxy {

  public static void main(String[] args) {
    ProxyInternet proxyInternet = new ProxyInternet();
    try {

      proxyInternet.connectedTo("facebook");
    } catch (Exception e) {
      System.out.println("Exception throw" + e);
    }
  }
}
