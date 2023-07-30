package com.saptarshi.das.designpatterns.decoratorpattern.pizzas.implementations;

import com.saptarshi.das.designpatterns.decoratorpattern.pizzas.Pizza;

public class NonVegLoadedPizza extends Pizza {
    @Override
    public int cost() {
        System.out.println("Non Veg Loaded Pizza - 200");
        return 200;
    }
}
