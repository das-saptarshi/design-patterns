package com.saptarshi.das.designpatterns.behavioral.visitorpattern.visitor;


import com.saptarshi.das.designpatterns.behavioral.visitorpattern.shape.Circle;
import com.saptarshi.das.designpatterns.behavioral.visitorpattern.shape.Rectangle;
import com.saptarshi.das.designpatterns.behavioral.visitorpattern.shape.Square;

public interface Visitor {
    void execute(Circle circle);
    void execute(Square square);
    void execute(Rectangle rectangle);
}
