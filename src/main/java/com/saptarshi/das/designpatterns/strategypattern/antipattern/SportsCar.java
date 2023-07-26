package com.saptarshi.das.designpatterns.strategypattern.antipattern;

public class SportsCar extends Vehicle {
	@Override
	public void drive() {
		System.out.println("Driving in sports conditions.");
	}
}
