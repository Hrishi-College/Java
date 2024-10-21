// Base class: Vehicle
class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;

    // Constructor for Vehicle
    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    // Method to start the vehicle
    public void start() {
        System.out.println("Starting the vehicle...");
    }

    // Method to stop the vehicle
    public void stop() {
        System.out.println("Stopping the vehicle...");
    }

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Vehicle Info:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Derived class: Car
class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor for Car
    public Car(String make, String model, int year, String fuelType, int numberOfDoors) {
        super(make, model, year, fuelType);  // Call to the base class constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Overridden method to start the car
    @Override
    public void start() {
        System.out.println("Starting the car...");
    }

    // Overridden method to stop the car
    @Override
    public void stop() {
        System.out.println("Stopping the car...");
    }

    // Overridden method to display car information
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call to the base class displayInfo() method
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Derived class: Motorcycle
class Motorcycle extends Vehicle {
    private boolean isSportsBike;

    // Constructor for Motorcycle
    public Motorcycle(String make, String model, int year, String fuelType, boolean isSportsBike) {
        super(make, model, year, fuelType);  // Call to the base class constructor
        this.isSportsBike = isSportsBike;
    }

    // Overridden method to start the motorcycle
    @Override
    public void start() {
        System.out.println("Starting the motorcycle...");
    }

    // Overridden method to stop the motorcycle
    @Override
    public void stop() {
        System.out.println("Stopping the motorcycle...");
    }

    // Overridden method to display motorcycle information
    @Override
    public void displayInfo() {
        super.displayInfo();  // Call to the base class displayInfo() method
        System.out.println("Is Sports Bike: " + isSportsBike);
    }
}

// Main class to demonstrate Vehicle Management System
public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car("Toyota", "Corolla", 2020, "Petrol", 4);
        System.out.println("Car Operations:");
        car.start();
        car.displayInfo();
        car.stop();

        System.out.println("\n---------------------------\n");

        // Create a Motorcycle object
        Motorcycle motorcycle = new Motorcycle("Yamaha", "R1", 2021, "Petrol", true);
        System.out.println("Motorcycle Operations:");
        motorcycle.start();
        motorcycle.displayInfo();
        motorcycle.stop();
    }
}
