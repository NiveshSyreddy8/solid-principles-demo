//Open close principle
package com.zemoso.solid.solidimplementation.vehiclefueltype;

public class PowerPetrol implements FuelType {

    //Add implementation to the fillFuel method
    @Override
    public void fillFuel() {
        System.out.println("\nFilling Power Petrol in the vehicle");
    }
}
