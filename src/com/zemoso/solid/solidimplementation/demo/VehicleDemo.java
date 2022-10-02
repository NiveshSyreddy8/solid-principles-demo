package com.zemoso.solid.solidimplementation.demo;

import com.zemoso.solid.solidimplementation.fourwheeler.*;
import com.zemoso.solid.solidimplementation.twowheeler.Bike;
import com.zemoso.solid.solidimplementation.twowheeler.TwoWheelerVehicle;
import com.zemoso.solid.solidimplementation.vehiclefueltype.Diesel;
import com.zemoso.solid.solidimplementation.vehiclefueltype.FuelType;
import com.zemoso.solid.solidimplementation.vehiclefueltype.Petrol;
import com.zemoso.solid.solidimplementation.vehiclefueltype.PowerPetrol;
import com.zemoso.solid.solidimplementation.vehicleservice.ServiceBike;
import com.zemoso.solid.solidimplementation.vehicleservice.ServiceElectricCar;
import com.zemoso.solid.solidimplementation.vehicleservice.ServiceTraditionalCar;
import com.zemoso.solid.solidimplementation.vehicleservice.ServiceVehicle;
import com.zemoso.solid.solidimplementation.vehicleunlock.KeyUnlock;
import com.zemoso.solid.solidimplementation.vehicleunlock.RemoteUnlock;
import com.zemoso.solid.solidimplementation.vehicleunlock.VehicleUnlock;

public class VehicleDemo {

    public static void main(String[] args) {

        //Create objects for remote unlock and key unlock
        VehicleUnlock remoteLock = new RemoteUnlock();
        VehicleUnlock keyUnlock = new KeyUnlock();

        //Create objects for Fuel type
        FuelType petrol = new Petrol();
        FuelType diesel = new Diesel();
        FuelType powerpetrol = new PowerPetrol();

        //Create object for service traditional car
        ServiceVehicle serviceTraditionalVehicle = new ServiceTraditionalCar();

        //Create object for traditional car
        TraditionalVehicle myFortuner = new TraditionalCar(diesel);

        //unlock car
        myFortuner.unlockVehicle(keyUnlock);
        //fasten the seat belt
        myFortuner.fastenSeatBelt();
        //start the car
        myFortuner.startVehicle();
        //ride the car
        myFortuner.rideVehicle();
        //Turn on AC in the car
        myFortuner.turnOnAc();
        //Turn on Radio in the car
        myFortuner.turnOnRadio();
        //Fill fuel in the car
        myFortuner.fillFuel();
        //Stop the car
        myFortuner.stopVehicle();

        //Service the car
        serviceTraditionalVehicle.service(myFortuner);

        System.out.println("\n*********************");

        //Create new object for race car
        TraditionalVehicle myFerrari = new RaceCar(powerpetrol);
        //unlock the race car
        myFerrari.unlockVehicle(remoteLock);
        //fill fuel in the race car
        myFerrari.fillFuel();
        //Service the race car
        serviceTraditionalVehicle.service(myFerrari);

        //Create a new object for Electric Car
        ElectricVehicle myTesla = new ElectricCar();
        //unlock the electric car
        myTesla.unlockVehicle(remoteLock);
        //charge the battery
        myTesla.chargeBattery();
        //Turn on Ac in the electric car
        myTesla.turnOnAc();

        //Create the service Electric car object
        ServiceVehicle serviceElectricVehicle = new ServiceElectricCar();
        //Service the electric car
        serviceElectricVehicle.service(myTesla);

        System.out.println("\n*********************");

        //Create the object for Bike
//        VehicleUnlock keyLock = new KeyUnlock();
        TwoWheelerVehicle myDucati = new Bike();

        //unlock the bike
        myDucati.unlockVehicle(keyUnlock);
        //Wear the helmet
        myDucati.wearHelmet();
        //Start the bike
        myDucati.startVehicle();
        //Ride the bike
        myDucati.rideVehicle();
        //Stop the bike
        myDucati.stopVehicle();

        //Create service bike object
        ServiceVehicle serviceBike = new ServiceBike();
        //Service the bike
        serviceBike.service(myDucati);

    }
}
