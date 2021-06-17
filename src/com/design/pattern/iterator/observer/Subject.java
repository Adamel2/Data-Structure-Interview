package com.design.pattern.iterator.observer;

/*
 @created 28/05/2021 - 17:49
 @author  Adham eldda
 @package com.design.pattern.observer
 @project GreeBash
*/
public interface Subject {
  void add(Observer observer);

  void remove(Observer observer);

  void notifyAllObservers();
}
