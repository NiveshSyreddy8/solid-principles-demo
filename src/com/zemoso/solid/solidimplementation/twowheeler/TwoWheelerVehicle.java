//Interface Segregation
package com.zemoso.solid.solidimplementation.twowheeler;

import com.zemoso.solid.solidimplementation.vehicle.Vehicle;

public interface TwoWheelerVehicle extends Vehicle {

    // Declare wearHelmet method
    public void wearHelmet();
}
