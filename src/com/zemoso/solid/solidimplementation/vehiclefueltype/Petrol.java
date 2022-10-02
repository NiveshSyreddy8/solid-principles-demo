//Open close principle
package com.zemoso.solid.solidimplementation.vehiclefueltype;

public class Petrol implements FuelType {

    //Add implementation to the fillFuel method
    @Override
    public void fillFuel() {
        System.out.println("\nFilling Petrol in the vehicle");
    }
}
