package com.saptarshi.das.designpatterns.behavioral.strategypattern.pattern.models;

import com.saptarshi.das.designpatterns.behavioral.strategypattern.pattern.strategy.SportsDriveStrategy;

public class LuxuryCar extends Vehicle {

	public LuxuryCar() {
		super(new SportsDriveStrategy());
	}
}
