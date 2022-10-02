//Violation of Interface Segregation
package com.zemoso.solid.solidviolation;

public interface Vehicle {

    //Declare unlockVehicle method
    public void unlockVehicle();

    //Declare wearHelmet method
    public void wearHelmet();

    //Declare fastenSeatBelt method
    public void fastenSeatBelt();

    //Declare startVehicle method
    public void startVehicle();

    //Declare rideVehicle method
    public void rideVehicle();

    //Declare turnOnRadio method
    public void turnOnRadio();

    //Declare turnOnAc method
    public void turnOnAc();

    //Declare stopVehicle method
    public void stopVehicle();

    //Declare service method
    public void service();
}
