//Liskov Substitution
package com.zemoso.solid.solidimplementation.fourwheeler;

import com.zemoso.solid.solidimplementation.vehiclefueltype.FuelType;
import com.zemoso.solid.solidimplementation.vehicleunlock.VehicleUnlock;

public class TraditionalCar extends Car implements TraditionalVehicle{
    private VehicleUnlock vehicleUnlock;
    private FuelType fuelType;

    //Create constructor with FuelType as parameter
    public TraditionalCar(FuelType fuelType) {
    //    super(vehicleUnlock);
        this.fuelType = fuelType;
    }

    //Add implementation to the fillFuel method
    @Override
    public void fillFuel( ){
        this.fuelType.fillFuel();
    }

}
