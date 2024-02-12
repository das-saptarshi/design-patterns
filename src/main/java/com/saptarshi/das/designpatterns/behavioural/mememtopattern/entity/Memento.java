package com.saptarshi.das.designpatterns.behavioural.mememtopattern.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Class to store the state.
 * In this implementation we are simply saving the state object (which is Coordinate), but this class
 * can be used to convert/serialize the state to store it more efficiently.
 */
@Data
@Accessors(chain = true)
public class Memento {
    private Coordinate coordinate;
}
