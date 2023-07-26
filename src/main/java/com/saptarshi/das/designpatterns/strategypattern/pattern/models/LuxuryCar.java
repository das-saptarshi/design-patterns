package com.saptarshi.das.designpatterns.strategypattern.pattern.models;

import com.saptarshi.das.designpatterns.strategypattern.pattern.strategy.SportsDriveStrategy;

public class LuxuryCar extends Vehicle {

	public LuxuryCar() {
		super(new SportsDriveStrategy());
	}
}
