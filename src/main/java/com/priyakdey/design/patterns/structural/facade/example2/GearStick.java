package com.priyakdey.design.patterns.structural.facade.example2;

public class GearStick {

  private int gear = 0;

  public void changeGear(int gear) {
    System.out.println("Changing gear to " + gear);
    this.gear = gear;
  }

}
