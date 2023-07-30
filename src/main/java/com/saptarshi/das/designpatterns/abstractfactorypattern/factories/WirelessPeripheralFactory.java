package com.saptarshi.das.designpatterns.abstractfactorypattern.factories;

import com.saptarshi.das.designpatterns.abstractfactorypattern.models.Keyboard;
import com.saptarshi.das.designpatterns.abstractfactorypattern.models.Mouse;
import com.saptarshi.das.designpatterns.abstractfactorypattern.models.WirelessKeyboard;
import com.saptarshi.das.designpatterns.abstractfactorypattern.models.WirelessMouse;

public class WirelessPeripheralFactory implements PeripheralFactory {
    @Override
    public Mouse getMouse() {
        return new WirelessMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new WirelessKeyboard();
    }
}
