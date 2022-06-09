package com.priyakdey.design.patterns.structural.decorator.example1;

import java.util.ArrayList;

/**
 * @author Priyak Dey
 * @since 10-06-2022
 */
public class ExtraCheeseAsToppingDecorator implements Pizza {

    private final Pizza pizza;

    public ExtraCheeseAsToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public ArrayList<String> getToppings() {
        ArrayList<String> toppings = pizza.getToppings();
        toppings.add("cheese");
        return toppings;
    }

    @Override
    public String getName() {
        return pizza.getName();
    }
}
