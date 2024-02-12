package com.saptarshi.das.designpatterns.behavioral.strategypattern.pattern.models;

import com.saptarshi.das.designpatterns.behavioral.strategypattern.pattern.strategy.NormalDriveStrategy;

public class FamilyCar extends Vehicle {

	public FamilyCar() {
		super(new NormalDriveStrategy());
	}
}
