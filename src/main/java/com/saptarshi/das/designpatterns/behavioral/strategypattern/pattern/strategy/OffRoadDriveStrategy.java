package com.saptarshi.das.designpatterns.behavioral.strategypattern.pattern.strategy;

public class OffRoadDriveStrategy implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("Driving in off road conditions");
	}
}
