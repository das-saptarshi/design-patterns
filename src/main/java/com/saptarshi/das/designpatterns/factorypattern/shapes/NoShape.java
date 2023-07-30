package com.saptarshi.das.designpatterns.factorypattern.shapes;

public class NoShape implements Shape {
    @Override
    public void draw() {
        System.out.println("No Shape");
    }
}
