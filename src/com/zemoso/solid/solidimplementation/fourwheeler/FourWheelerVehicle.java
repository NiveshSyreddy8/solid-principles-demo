//Interface Segregation
package com.zemoso.solid.solidimplementation.fourwheeler;

import com.zemoso.solid.solidimplementation.vehicle.Vehicle;

public interface FourWheelerVehicle extends Vehicle {

    //Declare fastenSeatBelt method
    public void fastenSeatBelt();

    //Declare turnOnRadio method
    public void turnOnRadio();

    //Declare turnOnAc method
    public void turnOnAc();
}
