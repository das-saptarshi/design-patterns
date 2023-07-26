package com.saptarshi.das.designpatterns.strategypattern.pattern.models;

import com.saptarshi.das.designpatterns.strategypattern.pattern.strategy.NormalDriveStrategy;

public class FamilyCar extends Vehicle {

	public FamilyCar() {
		super(new NormalDriveStrategy());
	}
}
