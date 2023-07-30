package com.saptarshi.das.designpatterns.abstractfactorypattern.models;

public class WiredKeyboard implements Keyboard {
    @Override
    public void type() {
        System.out.println("Typing on Wired Keyboard.");
    }
}
