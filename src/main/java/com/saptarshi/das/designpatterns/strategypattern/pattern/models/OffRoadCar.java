package com.saptarshi.das.designpatterns.strategypattern.pattern.models;

import com.saptarshi.das.designpatterns.strategypattern.pattern.strategy.OffRoadDriveStrategy;

public class OffRoadCar extends Vehicle {

	public OffRoadCar() {
		super(new OffRoadDriveStrategy());
	}
}
