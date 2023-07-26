package com.saptarshi.das.designpatterns.strategypattern;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Without Strategy Pattern!!!");
    	new com.saptarshi.das.designpatterns.strategypattern.antipattern.FamilyCar().drive();
    	new com.saptarshi.das.designpatterns.strategypattern.antipattern.OffRoadCar().drive();
    	new com.saptarshi.das.designpatterns.strategypattern.antipattern.SportsCar().drive();
    	new com.saptarshi.das.designpatterns.strategypattern.antipattern.LuxuryCar().drive();
    	
    	System.out.println();
    	System.out.println("With Strategy Pattern!!!");
    	new com.saptarshi.das.designpatterns.strategypattern.pattern.models.FamilyCar().drive();
    	new com.saptarshi.das.designpatterns.strategypattern.pattern.models.OffRoadCar().drive();
    	new com.saptarshi.das.designpatterns.strategypattern.pattern.models.SportsCar().drive();
    	new com.saptarshi.das.designpatterns.strategypattern.pattern.models.LuxuryCar().drive();
    }
}
