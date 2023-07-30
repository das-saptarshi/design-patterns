package com.saptarshi.das.designpatterns.factorypattern.factories;

import com.saptarshi.das.designpatterns.factorypattern.shapes.*;

public class ShapeFactory {
    public Shape getShape(final ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Square();
            default:
                return new NoShape();
        }
    }
}
