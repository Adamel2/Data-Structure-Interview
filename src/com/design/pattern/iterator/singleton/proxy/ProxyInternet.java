package com.design.pattern.iterator.singleton.proxy;

import java.util.Arrays;
import java.util.List;

/*
  @created 28/05/2021 - 16:38
  @author  Adham eldda
  @package com.design.pattern.proxy
  @project GreeBash
 */
public class ProxyInternet implements Internet{

  Internet internet = new RealTimeInternet();
  String [] list = {"facebook", "google", "microsoft", "tiktok"};
  List<String> websiteList = Arrays.asList(list);


  @Override
  public void connectedTo(String url) throws Exception {

    if (websiteList.contains(url)){

      throw new Exception();
    }
    else{
      internet.connectedTo(url);
    }
  }
}
