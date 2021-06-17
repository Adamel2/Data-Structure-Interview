package com.design.pattern.iterator.observer;

import java.util.ArrayList;
import java.util.List;

/*
  @created 28/05/2021 - 17:47
  @author  Adham eldda
  @package com.design.pattern.observer
  @project GreeBash
 */
public class Product implements Subject{

  private String name;
  private String availability;
  private List<Observer> observerList;

  public Product(String name) {
    this.name = name;
    observerList = new ArrayList<>();
  }

  @Override
  public void add(Observer observer) {

    observerList.add(observer);
  }

  @Override
  public void remove(Observer observer) {
    observerList.remove(observer);
  }

  @Override
  public void notifyAllObservers() {
    for (Observer observer : observerList) {

      observer.update(availability);

    }
  }

  public void setAvailability(boolean avaiable) {
    availability = this.name +(avaiable ? " Avaiable" : " Not avaiable");

    notifyAllObservers();
  }
}
