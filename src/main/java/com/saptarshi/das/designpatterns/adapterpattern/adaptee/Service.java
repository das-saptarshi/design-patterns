package com.saptarshi.das.designpatterns.adapterpattern.adaptee;

import java.util.Random;

public class Service implements ServiceInterface {
    private static final Random r = new Random();
    private static final int RANGE_MIN = 0;
    private static final int RANGE_MAX = 100;

    @Override
    public double getTemperatureInFahrenheit() {
        return RANGE_MIN + (RANGE_MAX - RANGE_MIN) * r.nextDouble();
    }
}
