package com.saptarshi.das.designpatterns.behavioural.mememtopattern.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Coordinate {
    private Integer x;
    private Integer y;

    public Coordinate() {
        this.x = this.y = 0;
    }

    public Coordinate(Coordinate coordinate) {
        this.x = coordinate.getX();
        this.y = coordinate.getY();
    }
}

