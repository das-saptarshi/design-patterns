package com.saptarshi.das.designpatterns.decoratorpattern.toppings.implementations;

import com.saptarshi.das.designpatterns.decoratorpattern.pizzas.Pizza;
import com.saptarshi.das.designpatterns.decoratorpattern.toppings.PizzaTopping;

public class ExtraCheeseTopping extends PizzaTopping {
    public ExtraCheeseTopping(final Pizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        final int cost = pizza.cost() + 25;
        System.out.println("Extra Cheese Topping - 25");
        return cost;
    }
}
