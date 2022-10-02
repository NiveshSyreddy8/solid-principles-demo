//Violation of Lisvok Substitution Principle
package com.zemoso.solid.solidviolation;

public class ElectricCar extends Car {
    public ElectricCar(VehicleUnlock vehicleUnlock) {

        super(vehicleUnlock);
    }

    //Add chargeBattery method
    public void ChargeBattery(){
        System.out.println("Car Battery is being Charged");
    }
}
