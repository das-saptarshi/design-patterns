package com.saptarshi.das.designpatterns.behavioral.visitorpattern.shape;

import com.saptarshi.das.designpatterns.behavioral.visitorpattern.visitor.Visitor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Square implements Shape {
    @Override
    public void draw() {
        log.info("Drawing Square.");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.execute(this);
    }
}
