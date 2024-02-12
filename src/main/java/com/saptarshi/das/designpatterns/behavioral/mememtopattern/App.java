package com.saptarshi.das.designpatterns.behavioral.mememtopattern;

import com.saptarshi.das.designpatterns.behavioral.mememtopattern.entity.Originator;
import com.saptarshi.das.designpatterns.behavioral.mememtopattern.entity.Caretaker;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {
    public static void main(String[] args) {
        final Caretaker caretaker = new Caretaker();
        final Originator originator = new Originator();

        log.info("Current coordinates: {}", originator.getCoordinate());
        caretaker.save(originator.saveState());

        originator.move(1, 10);
        log.info("Current coordinates: {}", originator.getCoordinate());

        originator.restoreState(caretaker.undo());
        log.info("Coordinates are undo: {}", originator.getCoordinate());
    }
}
