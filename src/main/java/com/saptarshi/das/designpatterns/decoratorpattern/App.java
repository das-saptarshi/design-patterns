package com.saptarshi.das.designpatterns.decoratorpattern;

import com.saptarshi.das.designpatterns.decoratorpattern.pizzas.Pizza;
import com.saptarshi.das.designpatterns.decoratorpattern.pizzas.implementations.NonVegLoadedPizza;
import com.saptarshi.das.designpatterns.decoratorpattern.toppings.implementations.ExtraCheeseTopping;
import com.saptarshi.das.designpatterns.decoratorpattern.toppings.implementations.MushroomTopping;

public class App {
    public static void main(String[] args) {
        Pizza pizza = new NonVegLoadedPizza();
        pizza = new ExtraCheeseTopping(pizza);
        pizza = new MushroomTopping(pizza);

        System.out.println("Total Cost = " + pizza.cost());
    }
}
