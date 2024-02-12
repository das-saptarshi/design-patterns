package com.saptarshi.das.designpatterns.behavioral.strategypattern;

import com.saptarshi.das.designpatterns.behavioral.strategypattern.pattern.models.FamilyCar;
import com.saptarshi.das.designpatterns.behavioral.strategypattern.pattern.models.LuxuryCar;
import com.saptarshi.das.designpatterns.behavioral.strategypattern.pattern.models.OffRoadCar;
import com.saptarshi.das.designpatterns.behavioral.strategypattern.pattern.models.SportsCar;

public class App
{
    public static void main( String[] args )
    {
    	System.out.println("Without Strategy Pattern!!!");
    	new com.saptarshi.das.designpatterns.behavioral.strategypattern.antipattern.FamilyCar().drive();
    	new com.saptarshi.das.designpatterns.behavioral.strategypattern.antipattern.OffRoadCar().drive();
    	new com.saptarshi.das.designpatterns.behavioral.strategypattern.antipattern.SportsCar().drive();
    	new com.saptarshi.das.designpatterns.behavioral.strategypattern.antipattern.LuxuryCar().drive();
    	
    	System.out.println();
    	System.out.println("With Strategy Pattern!!!");
    	new FamilyCar().drive();
    	new OffRoadCar().drive();
    	new SportsCar().drive();
    	new LuxuryCar().drive();
    }
}
