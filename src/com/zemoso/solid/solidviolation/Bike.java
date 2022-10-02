package com.zemoso.solid.solidviolation;

public class Bike implements Vehicle {

    private VehicleUnlock vehicleUnlock;

    public Bike(VehicleUnlock vehicleUnlock) {
        this.vehicleUnlock = vehicleUnlock;
    }

    @Override
    public void wearHelmet() {
        System.out.println("Helmet is fastened");
    }

    @Override
    public void turnOnRadio() {

    }

    @Override
    public void turnOnAc() {

    }

    @Override
    public void service() {

    }

    @Override
    public void unlockVehicle() {
        vehicleUnlock.keyUnlock();
    }

    @Override
    public void startVehicle() {
        System.out.println("Bike started");
    }

    @Override
    public void rideVehicle() {
        System.out.println("Riding the bike");
    }

    @Override
    public void stopVehicle() {
        System.out.println("Bike stopped");

    }

    @Override
    public void fastenSeatBelt() {

    }
}
