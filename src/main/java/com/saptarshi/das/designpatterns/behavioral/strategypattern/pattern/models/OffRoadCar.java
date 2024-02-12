package com.saptarshi.das.designpatterns.behavioral.strategypattern.pattern.models;

import com.saptarshi.das.designpatterns.behavioral.strategypattern.pattern.strategy.OffRoadDriveStrategy;

public class OffRoadCar extends Vehicle {

	public OffRoadCar() {
		super(new OffRoadDriveStrategy());
	}
}
