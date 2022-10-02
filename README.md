# solid-principles-demo
## Single-Responsibility Principle:
### A class should have one and only one reason to change, meaning that a class should have only one job.
This principle is applied in the Car class to separate the service method from the basic responsibilities of the car. The driver drives the car but he can’t service the car. The service responsibility is related to a mechanic. So the service responsibility is separated from the car and implemented in the serviceCar class. 
The same applies to the Bike class also. 

## Open close Principle:
### Objects or entities should be open for extension but closed for modification.

This principle is implemented in TraditionalCarclass. A new feature called fillFuel is added to the TraditionalCar class. Instead of adding this method in the FourWheelerVehicle interface we’re extending the FourWheelerVehicle interface to the TraditionalVehicle interface and in that interface we’re adding the feature. So, the FourWheelerVehicle interface is closed for modification and open for extension.

## Liskov Substitution Principle:
### Let q(x) be a property provable about objects of x of type T. Then q(y) should be provable for objects y of type S where S is a subtype of T.

The principle defines that objects of a superclass shall be replaceable with objects of its subclasses without breaking the application

This principle is implemented in the ElectricCar class and it contains the chargeBattery method. If we create the ElectricCar class by extending the TraditionalCar class, the ElectricCar can’t implement the fillFuel method. So, it violates the Liskov substitution principle. Hence, to avoid that we’re creating a ElectricCar interface by extending the FourWheelerVehicle so that the ElectricVehicle interface can contain all the features of FourWheelerVehicle  and the object of ElectricVehicle will be a substitution for the FourWheeler.

## Interface Segregation Principle:
### A client should never be forced to implement an interface that it doesn’t use, or clients shouldn’t be forced to depend on methods they do not use.

This principle is implemented in the Vehicle, TwoWheeler and FourWheeler interfaces. If we declare all the methods in a single interface, then the methods like fastenSeatBelt, turnOnAc, turnOnRadio will be forcibly implemented in the Bike class even if they’re not related to that class. To avoid this we’re creating two separate interfaces and declaring the exclusive methods in the respective interfaces.

## Dependency Inversion Principle:
### Entities must depend on abstractions, not on concretions. It states that the high-level module must not depend on the low-level module, but they should depend on abstractions.
 

The dependency Inversion principle is implemented in the VehicleUnlock interface. Generally, we can unlock the vehicle in two ways like using the key and using the remote. So, we can declare a class and add methods like keyUnlock and remoteUnlock. But, the dependency will be high-level as the entities like Car, Bike, etc are depending on concrete classes. This is a clear violation of the Dependency Inversion Principle. To fix this we’re creating an interface called vehicleUnlock and declaring the unlock method. The classes RemoteUnlock and KeyUnlock will implement this interface and override the unlock method. Now, the abstraction is low-level as the entities are depending on the abstraction and also the user will have the chance to choose the unlock type as key or remote. 

