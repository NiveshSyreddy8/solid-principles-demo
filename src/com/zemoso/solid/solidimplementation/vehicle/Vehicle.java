//Interface Segregation
package com.zemoso.solid.solidimplementation.vehicle;

import com.zemoso.solid.solidimplementation.vehicleunlock.VehicleUnlock;

public interface Vehicle {

    // Declare unlockVehicle method with unlock type as parameter
    public void unlockVehicle(VehicleUnlock vehicleUnlock);

    //Declare startVehicle method
    public void startVehicle();

    //Declare rideVehicle method
    public void rideVehicle();

    //Declare stopVehicle method
    public void stopVehicle();

}
