package com.priyakdey.design.patterns.structural.decorator.example1;

import java.util.ArrayList;

public class PizzaHawaiian implements Pizza {

  ArrayList<String> toppings = new ArrayList<>();
  static String name = "Hawaiiian";

  public PizzaHawaiian() {
    toppings.add("cheese");
    toppings.add("tomato");
    toppings.add("ham");
    toppings.add("pineapple");
  }


  public ArrayList<String> getToppings() {
    return toppings;
  }

  public String getName() {
    return name;
  }

}
