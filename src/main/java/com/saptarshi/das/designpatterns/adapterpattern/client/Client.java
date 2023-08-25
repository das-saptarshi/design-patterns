package com.saptarshi.das.designpatterns.adapterpattern.client;

public class Client {
    private final ClientInterface adapter;

    public Client(final ClientInterface adapter) {
        this.adapter = adapter;
    }

    public void displayTemperature() {
        System.out.println("Temperature: " + roundOff(adapter.getTemperatureInCelsius()) + " °C");
    }

    private double roundOff(final double value) {
        return Math.round(value * 100.0 ) / 100.0;
    }
}
