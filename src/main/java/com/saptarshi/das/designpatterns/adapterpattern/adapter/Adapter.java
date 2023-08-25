package com.saptarshi.das.designpatterns.adapterpattern.adapter;

import com.saptarshi.das.designpatterns.adapterpattern.adaptee.ServiceInterface;
import com.saptarshi.das.designpatterns.adapterpattern.client.ClientInterface;

public class Adapter implements ClientInterface {
    private final ServiceInterface service;

    public Adapter(final ServiceInterface service) {
        this.service = service;
    }
    @Override
    public double getTemperatureInCelsius() {
        final double temperatureInFahrenheit = service.getTemperatureInFahrenheit();
        return (temperatureInFahrenheit - 32) * 5 / 9;
    }
}
