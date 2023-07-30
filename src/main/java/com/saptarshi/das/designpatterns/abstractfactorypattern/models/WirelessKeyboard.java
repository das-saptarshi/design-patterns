package com.saptarshi.das.designpatterns.abstractfactorypattern.models;

public class WirelessKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Typing on Wireless Keyboard.");
    }
}
