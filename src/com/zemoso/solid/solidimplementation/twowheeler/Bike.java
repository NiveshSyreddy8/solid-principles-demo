package com.zemoso.solid.solidimplementation.twowheeler;

import com.zemoso.solid.solidimplementation.vehicleunlock.VehicleUnlock;

public class Bike implements TwoWheelerVehicle{

    //Add implementation to the wearHelmet method
    @Override
    public void wearHelmet() {
        System.out.println("\nHelmet is fastened");
    }

    //Add implementation to the unlockVehicle method
    @Override
    public void unlockVehicle(VehicleUnlock vehicleUnlock) {
        vehicleUnlock.unlock();
    }

    //Add implementation to the startVehicle method
    @Override
    public void startVehicle() {
        System.out.println("\nBike started");
    }

    //Add implementation to the rideVehicle method
    @Override
    public void rideVehicle() {
        System.out.println("\nRiding the bike");
    }

    //Add implementation to the stopVehicle method
    @Override
    public void stopVehicle() {
        System.out.println("\nBike stopped");

    }
}
