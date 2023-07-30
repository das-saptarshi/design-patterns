package com.saptarshi.das.designpatterns.factorypattern;

import com.saptarshi.das.designpatterns.factorypattern.factories.ShapeFactory;
import com.saptarshi.das.designpatterns.factorypattern.factories.ShapeType;

public class App {
    public static void main(String[] args) {
        final ShapeFactory factory = new ShapeFactory();

        factory.getShape(ShapeType.CIRCLE).draw();
        factory.getShape(ShapeType.RECTANGLE).draw();
        factory.getShape(ShapeType.SQUARE).draw();
    }
}
