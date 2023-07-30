package com.saptarshi.das.designpatterns.decoratorpattern.pizzas.implementations;

import com.saptarshi.das.designpatterns.decoratorpattern.pizzas.Pizza;

public class VegDelightPizza extends Pizza {
    @Override
    public int cost() {
        System.out.println("Veg Delight Pizza - 100");
        return 100;
    }
}
