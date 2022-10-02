// Opn Close Principle
package com.zemoso.solid.solidimplementation.fourwheeler;

import com.zemoso.solid.solidimplementation.vehiclefueltype.FuelType;
import com.zemoso.solid.solidimplementation.vehicleunlock.VehicleUnlock;

public class RaceCar extends TraditionalCar{
    public RaceCar(FuelType fuelType) {
        super(fuelType);
    }

    //Add ActivateNitroBoost method
    public void ActivateNitroBoost(){
        System.out.println("\nNitro Boosts Activated successfully");
        System.out.println("\nNow you are ready to race");
    }

}
