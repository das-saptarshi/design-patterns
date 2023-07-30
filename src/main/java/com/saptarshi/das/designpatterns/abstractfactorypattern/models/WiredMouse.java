package com.saptarshi.das.designpatterns.abstractfactorypattern.models;

public class WiredMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Wired Mouse clicked.");
    }
}
