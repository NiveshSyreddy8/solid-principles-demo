//Violation of Single Responsibility
package com.zemoso.solid.solidviolation;

public class Car implements Vehicle {

    //Low-level design
    private VehicleUnlock vehicleUnlock;
    public Car(VehicleUnlock vehicleUnlock) {
        this.vehicleUnlock = vehicleUnlock;
    }
//    public Car(OpenLock openLock){
//        this.openLock = openLock
//    }
    public void unlockVehicle(){

        vehicleUnlock.remoteUnlock();
    }
    @Override
    public void fastenSeatBelt() {

        System.out.println("Seat belt fastened");
    }

    @Override
    public void wearHelmet() {

    }

    @Override
    public void startVehicle() {
        System.out.println("Car Started");
    }

    @Override
    public void rideVehicle() {
        System.out.println("Riding the Car");
    }
    @Override
    public void turnOnRadio() {
        System.out.println("Radio turned On");
    }

    @Override
    public void turnOnAc() {
        System.out.println("AC turned On");
    }

    @Override
    public void stopVehicle() {

        System.out.println("Car Stopped");
    }

    public void fillFuel(){

        System.out.println("filling fuel in the car");
    }
    public void ActivateNitroBoost(){
        System.out.println("Nitro Boosts Activated successfully");
        System.out.println("Now you are ready to race");
    }

    @Override
    public void service() {
        System.out.println("Servicing the car");
    }

}
