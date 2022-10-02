//Open close principle
package com.zemoso.solid.solidimplementation.vehiclefueltype;

public class Diesel implements FuelType {

    //Add implementation to the fillFuel method
    @Override
    public void fillFuel() {
        System.out.println("\nFilling Diesel in the vehicle");
    }
}
