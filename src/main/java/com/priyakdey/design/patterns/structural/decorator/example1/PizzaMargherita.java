package com.priyakdey.design.patterns.structural.decorator.example1;

import java.util.ArrayList;

public class PizzaMargherita implements Pizza {

  ArrayList<String> toppings = new ArrayList<>();
  static String name = "Margherita";

  public PizzaMargherita() {
    toppings.add("cheese");
    toppings.add("tomato");
  }


  public ArrayList<String> getToppings() {
    return toppings;
  }

  public String getName() {
    return name;
  }



}
