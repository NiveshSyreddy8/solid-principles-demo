//Single Responsibility
package com.zemoso.solid.solidimplementation.fourwheeler;

import com.zemoso.solid.solidimplementation.vehicleunlock.VehicleUnlock;

public class Car implements FourWheelerVehicle{

    //Add implementation to fastenSeatBelt method
    @Override
    public void fastenSeatBelt() {

        System.out.println("\nSeat belt fastened");
    }

    //Add implementation to unlockVehicle method
    @Override
    public void unlockVehicle(VehicleUnlock vehicleUnlock)
    {
        vehicleUnlock.unlock();
    }

    //Add implementation to startVehicle method
    @Override
    public void startVehicle() {
        System.out.println("\nCar Started");
    }

    //Add implementation to rideVehicle method
    @Override
    public void rideVehicle() {
        System.out.println("\nRiding the Car");
    }

    //Add implementation to turnOnRadio method
    @Override
    public void turnOnRadio() {
        System.out.println("\nRadio turned On");
    }

    //Add implementation to turnOnAc method
    @Override
    public void turnOnAc() {
        System.out.println("\nAC turned On");
    }

    //Add implementation to stopVehicle method
    @Override
    public void stopVehicle() {

        System.out.println("\nCar Stopped");
    }



}
