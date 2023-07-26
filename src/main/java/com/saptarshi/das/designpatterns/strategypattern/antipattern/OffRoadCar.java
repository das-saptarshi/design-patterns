package com.saptarshi.das.designpatterns.strategypattern.antipattern;

public class OffRoadCar extends Vehicle {
	@Override
	public void drive() {
		System.out.println("Driving in off road conditions.");
	}
}
