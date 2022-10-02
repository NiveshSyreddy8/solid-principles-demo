//Liskov Substitute
package com.zemoso.solid.solidimplementation.fourwheeler;

public class ElectricCar extends Car implements ElectricVehicle{

    public ElectricCar() {
    }

    //Add implementation to chargeBattery method
    @Override
    public void chargeBattery() {
        System.out.println("\nCar Battery is being Charged");
    }

}
