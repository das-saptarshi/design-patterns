package com.saptarshi.das.designpatterns.behavioral.visitorpattern.shape;

import com.saptarshi.das.designpatterns.behavioral.visitorpattern.visitor.Visitor;

public interface Shape {
    void draw();
    void accept(Visitor visitor);
}
