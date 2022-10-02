//Single Responsibility
package com.zemoso.solid.solidimplementation.vehicleservice;

import com.zemoso.solid.solidimplementation.vehicle.Vehicle;

public class ServiceTraditionalCar implements ServiceVehicle{

    //Add implementation to the service method
    @Override
    public void service(Vehicle vehicle) {
        System.out.println("\nServicing traditional car");
    }

}
