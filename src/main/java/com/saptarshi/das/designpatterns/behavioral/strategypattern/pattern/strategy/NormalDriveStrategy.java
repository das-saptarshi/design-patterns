package com.saptarshi.das.designpatterns.behavioral.strategypattern.pattern.strategy;

public class NormalDriveStrategy implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("Driving in noraml conditions.");
	}
}
