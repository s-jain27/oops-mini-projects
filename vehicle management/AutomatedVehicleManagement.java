// Base class Vehicle
class Vehicle {
    String fuelType;
    int maxSpeed;
    // Constructo
    public Vehicle(String fuelType, int maxSpeed) {
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
    }
    // Common method for all vehicles
    public void drive() {
        System.out.println("The speed of the vehicle is " + maxSpeed + " km/h.");
    }
}
// Interface for Maintenance
interface Maintenance {
    void performMaintenance();  // Method FOR ALL SUB CLASSES
}
//SUB CLASS 
class Car extends Vehicle implements Maintenance {
    int seats;  

    public Car(String fuelType, int maxSpeed, int seats) {
        super(fuelType, maxSpeed);  // CallING PARENT CLASS CONSTRUCTOR
        this.seats = seats;
    }
    @Override
    public void drive() {
        System.out.println("The speed of the car is " + maxSpeed + " km/h.");
    }
    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance for the car.");
    }
}

class Truck extends Vehicle implements Maintenance {
    int numberOfTyres;  

    public Truck(String fuelType, int maxSpeed, int numberOfTyres) {
        super(fuelType, maxSpeed);  //// CallING PARENT CLASS CONSTRUCTOR
        this.numberOfTyres = numberOfTyres;
    }
    @Override
    public void drive() {
        System.out.println("The speed of the truck is " + maxSpeed + " km/h.");
    }
    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance for the truck.");
    }
}
class Bus extends Vehicle implements Maintenance {
    String type;  

    public Bus(String fuelType, int maxSpeed, String type) {
        super(fuelType, maxSpeed);  // Call constructor of the base class
        this.type = type;
    }
    @Override
    public void drive() {
        System.out.println("The speed of the bus is " + maxSpeed + " km/h.");
    }
    @Override
    public void performMaintenance() {
        System.out.println("Performing maintenance for the bus.");
    }
}
public class AutomatedVehicleManagement {
    public static void main(String[] args) {
     //CREATING OBJECTS, CONSTRUCTOR CALL
        Car car = new Car("Petrol", 99, 5);
        Truck truck = new Truck("Diesel", 150, 25);
        Bus bus = new Bus("PETROL", 49, "LOCAL");
      //METHOD CALLING
        car.drive();
        car.performMaintenance();
        truck.drive();
        truck.performMaintenance();
        bus.drive();
        bus.performMaintenance();     
    }
}
