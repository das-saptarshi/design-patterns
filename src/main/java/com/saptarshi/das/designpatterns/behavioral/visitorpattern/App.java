package com.saptarshi.das.designpatterns.behavioral.visitorpattern;

import com.saptarshi.das.designpatterns.behavioral.visitorpattern.shape.Circle;
import com.saptarshi.das.designpatterns.behavioral.visitorpattern.shape.Rectangle;
import com.saptarshi.das.designpatterns.behavioral.visitorpattern.shape.Shape;
import com.saptarshi.das.designpatterns.behavioral.visitorpattern.shape.Square;
import com.saptarshi.das.designpatterns.behavioral.visitorpattern.visitor.ExportVisitor;
import com.saptarshi.das.designpatterns.behavioral.visitorpattern.visitor.Visitor;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        final List<Shape> shapes = Arrays.asList(
                new Circle(),
                new Square(),
                new Rectangle()
        );

        shapes.forEach(Shape::draw);

        final Visitor exportVisitor = new ExportVisitor();
        shapes.forEach(shape -> shape.accept(exportVisitor));
    }
}
