//Dependency Inversion
package com.zemoso.solid.solidimplementation.vehicleunlock;

public class RemoteUnlock implements VehicleUnlock {

    //Add implementation to the unlock method
    @Override
    public void unlock() {

        System.out.println("\nLock opened with remote");
    }
}
