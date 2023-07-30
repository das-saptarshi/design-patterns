package com.saptarshi.das.designpatterns.decoratorpattern.pizzas.implementations;

import com.saptarshi.das.designpatterns.decoratorpattern.pizzas.Pizza;

public class MargaritaPizza extends Pizza {
    @Override
    public int cost() {
        System.out.println("Margarita Pizza - 150");
        return 150;
    }
}
