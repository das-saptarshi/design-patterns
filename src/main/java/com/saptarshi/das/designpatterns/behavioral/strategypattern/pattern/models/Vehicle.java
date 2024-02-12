package com.saptarshi.das.designpatterns.behavioral.strategypattern.pattern.models;

import com.saptarshi.das.designpatterns.behavioral.strategypattern.pattern.strategy.DriveStrategy;

public class Vehicle {
	private DriveStrategy driveStrategy;
	
	public Vehicle(final DriveStrategy driveStrategy) {
		this.driveStrategy = driveStrategy;
	}
	
	public void drive() {
		driveStrategy.drive();
	}
}
