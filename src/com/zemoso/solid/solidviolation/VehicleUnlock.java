//Violation of Dependency Inversion principle
package com.zemoso.solid.solidviolation;

public class VehicleUnlock {

    //Add method keyUnlock
    public void keyUnlock() {
        System.out.println("Unlocked with key");
    }

    //Add method remoteUnlock
    public void remoteUnlock(){
        System.out.println("Unlocked with remote");
    }
}
