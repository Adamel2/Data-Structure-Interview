package com.design.pattern.iterator.adapter;

/*
  @created 28/05/2021 - 18:11
  @author  Adham eldda
  @package com.design.pattern.adapter
  @project GreeBash
 */
public class Driver {

  public static void main(String[] args) {
    Vehicle vehicle = new Car();
    Vehicle bicycle = new BiCycleAdapter(new Bicycle());

    playWithVehicle(vehicle);
    playWithVehicle(bicycle);
  }

  public static void playWithVehicle(Vehicle vehicle){
    vehicle.accelerate();
    vehicle.pushBreak();
    vehicle.soundHorn();

    System.out.println("\n");
  }
}
