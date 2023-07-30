package com.saptarshi.das.designpatterns.decoratorpattern.toppings.implementations;

import com.saptarshi.das.designpatterns.decoratorpattern.pizzas.Pizza;
import com.saptarshi.das.designpatterns.decoratorpattern.toppings.PizzaTopping;

public class JalapenoTopping extends PizzaTopping {
    public JalapenoTopping(final Pizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        final int cost = pizza.cost() + 30;
        System.out.println("Jalapeno Topping - 30");
        return cost;
    }
}
