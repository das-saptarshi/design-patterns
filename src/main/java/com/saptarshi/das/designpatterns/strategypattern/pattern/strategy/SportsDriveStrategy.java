package com.saptarshi.das.designpatterns.strategypattern.pattern.strategy;

public class SportsDriveStrategy implements DriveStrategy {

	@Override
	public void drive() {
		System.out.println("Driving in sports conditions.");	
	}
}
