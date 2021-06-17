package com.design.pattern.iterator.adapter;

/*
  @created 28/05/2021 - 18:21
  @author  Adham eldda
  @package com.design.pattern.adapter
  @project GreeBash
 */
public class BiCycleAdapter implements Vehicle{
  private Bicycle bicycle ;

  public BiCycleAdapter(Bicycle bicycle) {
    this.bicycle = bicycle;
  }

  @Override
  public void accelerate() {
    bicycle.pedal();
  }

  @Override
  public void pushBreak() {
  bicycle.stop();

  }

  @Override
  public void soundHorn() {
        bicycle.ringBall();
  }
}
