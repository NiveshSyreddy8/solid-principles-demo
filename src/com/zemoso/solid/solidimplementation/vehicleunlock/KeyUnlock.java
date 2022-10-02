//Dependency Inversion
package com.zemoso.solid.solidimplementation.vehicleunlock;

public class KeyUnlock implements VehicleUnlock{

    //Add implementation to the unlock method
    @Override
    public void unlock() {
        System.out.println("\nLock opened with Key");
    }
}
