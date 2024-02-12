package com.saptarshi.das.designpatterns.behavioral.strategypattern.pattern.models;

import com.saptarshi.das.designpatterns.behavioral.strategypattern.pattern.strategy.SportsDriveStrategy;

public class SportsCar extends Vehicle {

	public SportsCar() {
		super(new SportsDriveStrategy());
	}
}
