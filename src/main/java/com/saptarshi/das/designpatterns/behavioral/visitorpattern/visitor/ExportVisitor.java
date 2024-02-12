package com.saptarshi.das.designpatterns.behavioral.visitorpattern.visitor;

import com.saptarshi.das.designpatterns.behavioral.visitorpattern.shape.Circle;
import com.saptarshi.das.designpatterns.behavioral.visitorpattern.shape.Rectangle;
import com.saptarshi.das.designpatterns.behavioral.visitorpattern.shape.Square;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExportVisitor implements Visitor {

    @Override
    public void execute(Circle circle) {
        log.info("Exporting Circle");
    }

    @Override
    public void execute(Square square) {
        log.info("Exporting Square");
    }

    @Override
    public void execute(Rectangle rectangle) {
        log.info("Exporting Rectangle");
    }
}
