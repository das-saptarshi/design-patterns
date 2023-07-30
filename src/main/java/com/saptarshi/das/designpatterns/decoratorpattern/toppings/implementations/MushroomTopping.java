package com.saptarshi.das.designpatterns.decoratorpattern.toppings.implementations;

import com.saptarshi.das.designpatterns.decoratorpattern.pizzas.Pizza;
import com.saptarshi.das.designpatterns.decoratorpattern.toppings.PizzaTopping;

public class MushroomTopping extends PizzaTopping {
    public MushroomTopping(final Pizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        final int cost = pizza.cost() + 50;
        System.out.println("Mushroom Topping - 50");
        return cost;
    }
}
