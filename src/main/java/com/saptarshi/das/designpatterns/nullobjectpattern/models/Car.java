package com.saptarshi.das.designpatterns.nullobjectpattern.models;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving Car.");
    }
}
