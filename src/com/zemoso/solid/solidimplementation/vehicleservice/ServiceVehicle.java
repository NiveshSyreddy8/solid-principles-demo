//Interface Segregation
package com.zemoso.solid.solidimplementation.vehicleservice;

import com.zemoso.solid.solidimplementation.vehicle.Vehicle;

public interface ServiceVehicle {

    //Declare service method
    public void service(Vehicle vehicle);

}
