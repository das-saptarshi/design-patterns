package com.saptarshi.das.designpatterns.decoratorpattern.toppings;

import com.saptarshi.das.designpatterns.decoratorpattern.pizzas.Pizza;

public  abstract class PizzaTopping extends Pizza {
    protected Pizza pizza;

    public PizzaTopping(final Pizza pizza) {
        this.pizza = pizza;
    }
}
