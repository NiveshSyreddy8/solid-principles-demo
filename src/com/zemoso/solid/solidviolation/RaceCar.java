// Violation of Open Close Principle
package com.zemoso.solid.solidviolation;

public class RaceCar extends Car {
    public RaceCar(VehicleUnlock openLock) {
        super(openLock);
    }

    //Add ActivateNitroBoost method
    public void ActivateNitroBoost(){
        System.out.println("Nitro Boosts Activated successfully");
        System.out.println("Now you are ready to race");
    }

}
