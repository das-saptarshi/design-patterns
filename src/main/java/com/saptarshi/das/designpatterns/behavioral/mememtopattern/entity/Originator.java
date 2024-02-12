package com.saptarshi.das.designpatterns.behavioral.mememtopattern.entity;

import lombok.Getter;

@Getter
public class Originator {
    private Coordinate coordinate;

    public Originator() {
        this.coordinate = new Coordinate();
    }

    /*
     * This method is not part of the pattern is only to help change the state of coordinates.
     */
    public void move(final Integer x, final Integer y) {
        this.coordinate
                .setX(x)
                .setY(y);
    }

    /*
     * Method to save the current state in a Memento instance and return it back.
     */
    public Memento saveState() {
        return new Memento().setCoordinate(new Coordinate(this.coordinate));
    }

    /*
     * Method to restore state from given Memento instance.
     */
    public void restoreState(final Memento state) {
        this.coordinate = state.getCoordinate();
    }
}

