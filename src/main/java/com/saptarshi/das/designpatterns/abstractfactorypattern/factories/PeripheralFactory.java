package com.saptarshi.das.designpatterns.abstractfactorypattern.factories;

import com.saptarshi.das.designpatterns.abstractfactorypattern.models.Keyboard;
import com.saptarshi.das.designpatterns.abstractfactorypattern.models.Mouse;

public interface PeripheralFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
}
