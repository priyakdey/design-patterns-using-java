package com.priyakdey.design.patterns.structural.facade.example2;

public class Car {


  public static void main(String[] args) {
    DrivingFacade facade = new DrivingFacade();
    facade.drive();
  }

}
