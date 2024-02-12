package com.saptarshi.das.designpatterns.behavioral.strategypattern.antipattern;

public class OffRoadCar extends Vehicle {
	@Override
	public void drive() {
		System.out.println("Driving in off road conditions.");
	}
}
