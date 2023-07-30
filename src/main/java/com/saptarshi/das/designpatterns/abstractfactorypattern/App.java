package com.saptarshi.das.designpatterns.abstractfactorypattern;

import com.saptarshi.das.designpatterns.abstractfactorypattern.factories.PeripheralAbstractFactory;
import com.saptarshi.das.designpatterns.abstractfactorypattern.factories.PeripheralFactory;
import com.saptarshi.das.designpatterns.abstractfactorypattern.models.Keyboard;
import com.saptarshi.das.designpatterns.abstractfactorypattern.models.Mouse;

public class App {
    public static void main(String[] args) {
        final PeripheralFactory wiredFactory = PeripheralAbstractFactory.getWiredFactory();
        final PeripheralFactory wirelessFactory = PeripheralAbstractFactory.getWirelessFactory();

        getAndUsePeripherals(wiredFactory);
        getAndUsePeripherals(wirelessFactory);
    }

    public static void getAndUsePeripherals(final PeripheralFactory factory) {
        final Mouse mouse = factory.getMouse();
        final Keyboard keyboard = factory.getKeyboard();

        mouse.click();
        keyboard.type();
    }
}
