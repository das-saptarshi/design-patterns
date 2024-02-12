package com.saptarshi.das.designpatterns.behavioral.mememtopattern.entity;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Stack;

public class Caretaker {
    private final Stack<Memento> history;

    public Caretaker() {
        this.history = new Stack<>();
    }

    /*
     * Save the given Memento in to the history.
     */
    public void save(final Memento state) {
        this.history.push(state);
    }

    /*
     * Return the most recently added state to implement undo functionality.
     */
    public Memento undo() {
        if (CollectionUtils.isEmpty(this.history)) {
            return null;
        }

        return this.history.pop();
    }
}
