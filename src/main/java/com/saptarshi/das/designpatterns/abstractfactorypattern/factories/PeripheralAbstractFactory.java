package com.saptarshi.das.designpatterns.abstractfactorypattern.factories;

public class PeripheralAbstractFactory {
    public static PeripheralFactory getWirelessFactory() {
        return new WirelessPeripheralFactory();
    }

    public static PeripheralFactory getWiredFactory() {
        return new WiredPeripheralFactory();
    }
}
