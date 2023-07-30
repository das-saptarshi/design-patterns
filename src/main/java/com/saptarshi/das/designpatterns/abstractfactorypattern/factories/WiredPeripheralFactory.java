package com.saptarshi.das.designpatterns.abstractfactorypattern.factories;

import com.saptarshi.das.designpatterns.abstractfactorypattern.models.Keyboard;
import com.saptarshi.das.designpatterns.abstractfactorypattern.models.Mouse;
import com.saptarshi.das.designpatterns.abstractfactorypattern.models.WiredKeyboard;
import com.saptarshi.das.designpatterns.abstractfactorypattern.models.WiredMouse;

public class WiredPeripheralFactory implements PeripheralFactory {
    @Override
    public Mouse getMouse() {
        return new WiredMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new WiredKeyboard();
    }
}
