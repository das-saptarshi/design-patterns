package com.saptarshi.das.designpatterns.abstractfactorypattern.models;

public class WirelessMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Wireless Mouse clicked.");
    }
}
