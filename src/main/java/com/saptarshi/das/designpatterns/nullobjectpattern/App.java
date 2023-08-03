package com.saptarshi.das.designpatterns.nullobjectpattern;

import com.saptarshi.das.designpatterns.nullobjectpattern.models.Bike;
import com.saptarshi.das.designpatterns.nullobjectpattern.models.Car;
import com.saptarshi.das.designpatterns.nullobjectpattern.models.NoVehicle;
import com.saptarshi.das.designpatterns.nullobjectpattern.models.Vehicle;

public class App {
    public static void main(String[] args) {
        getVehicle("CAR").drive();
        getVehicle("BIKE").drive();
        getVehicle("BOAT").drive();
    }

    private static Vehicle getVehicle(final String type) {
        switch (type) {
            case "CAR":
                return new Car();
            case "BIKE":
                return new Bike();
            default:
                // Instead of returning null, we are returning no/default behavior. This way the client
                // is not required to perform null checks.
                return new NoVehicle();
        }
    }
}
