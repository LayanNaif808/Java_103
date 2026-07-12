import java.util.ArrayList;
import java.util.List;

// ==========================================
// 1. ABSTRACTION & ENCAPSULATION & INHERITANCE
// ==========================================
// Abstract Class representing a generic Vehicle
abstract class Vehicle {
    // Encapsulation: Private modifiers to protect data
    private String model;
    private int year;
    private String country;

    // Constructor to initialize common vehicle fields
    public Vehicle(String model, int year, String country) {
        this.model = model;
        this.year = year;
        this.country = country;
    }

    // Getters and Setters for Encapsulation
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    // Abstract method to be overridden by subclasses
    public abstract void displayInfo();
}

// ==========================================
// 2. SUBCLASSES WITH SPECIFIC ATTRIBUTES & POLYMORPHISM (OVERRIDING)
// ==========================================

// Car Class inheriting from Vehicle
class Car extends Vehicle {
    private int seatsCount; // Specific attribute for Car

    public Car(String model, int year, String country, int seatsCount) {
        super(model, year, country);
        this.seatsCount = seatsCount;
    }

    // Polymorphism: Method Overriding
    @Override
    public void displayInfo() {
        System.out.println("[Car] Model: " + getModel() + ", Year: " + getYear() + 
                           ", Country: " + getCountry() + ", Seats: " + seatsCount);
    }
}

// Motorcycle Class inheriting from Vehicle
class Motorcycle extends Vehicle {
    private int engineCapacity; // Specific attribute for Motorcycle

    public Motorcycle(String model, int year, String country, int engineCapacity) {
        super(model, year, country);
        this.engineCapacity = engineCapacity;
    }

    // Polymorphism: Method Overriding
    @Override
    public void displayInfo() {
        System.out.println("[Motorcycle] Model: " + getModel() + ", Year: " + getYear() + 
                           ", Country: " + getCountry() + ", Engine: " + engineCapacity + "cc");
    }
}

// Truck Class inheriting from Vehicle
class Truck extends Vehicle {
    private double loadCapacity; // Specific attribute for Truck

    public Truck(String model, int year, String country, double loadCapacity) {
        super(model, year, country);
        this.loadCapacity = loadCapacity;
    }

    // Polymorphism: Method Overriding
    @Override
    public void displayInfo() {
        System.out.println("[Truck] Model: " + getModel() + ", Year: " + getYear() + 
                           ", Country: " + getCountry() + ", Load Capacity: " + loadCapacity + " tons");
    }
}

// ==========================================
// 3. GARAGE MANAGEMENT & POLYMORPHISM (OVERLOADING)
// ==========================================
class Garage {
    // List to store all vehicles in the garage
    private List<Vehicle> vehicles = new ArrayList<>();

    // Base method to add a vehicle object directly
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Added: " + vehicle.getModel() + " to the garage.");
    }

    // Polymorphism: Method Overloading for adding by specific details
    public void addVehicle(String model, int year, String country, String type, int specialValue) {
        if (type.equalsIgnoreCase("car")) {
            addVehicle(new Car(model, year, country, specialValue));
        } else if (type.equalsIgnoreCase("motorcycle")) {
            addVehicle(new Motorcycle(model, year, country, specialValue));
        }
    }

    // Base method to remove a vehicle object
    public void removeVehicle(Vehicle vehicle) {
        if (vehicles.remove(vehicle)) {
            System.out.println("Removed: " + vehicle.getModel() + " from the garage.");
        }
    }

    // Polymorphism: Method Overloading to remove by Model Name
    public void removeVehicle(String model) {
        vehicles.removeIf(v -> v.getModel().equalsIgnoreCase(model));
        System.out.println("Removed all vehicles with model name: " + model);
    }

    // Polymorphism: Method Overloading to remove by Release Year
    public void removeVehicle(int year) {
        vehicles.removeIf(v -> v.getYear() == year);
        System.out.println("Removed all vehicles from year: " + year);
    }

    // Function to print all vehicles currently in the garage
    public void displayAllVehicles() {
        System.out.println("\n=== Vehicles Currently in Garage ===");
        if (vehicles.isEmpty()) {
            System.out.println("The garage is empty!");
        } else {
            for (Vehicle v : vehicles) {
                v.displayInfo(); // Dynamic Binding / Polymorphism in action
            }
        }
        System.out.println("=======================================\n");
    }
}

// ==========================================
// 4. MAIN SYSTEM ENTRY POINT
// ==========================================
public class GarageManagementSystem {
    public static void main(String[] args) {
        Garage myGarage = new Garage();

        // 1. Create and add vehicles using the base method
        Car Camry = new Car("Toyota Camry", 2024, "Japan", 5);
        Truck VolvoFH = new Truck("Volvo FH16", 2022, "Sweden", 25.5);
        
        myGarage.addVehicle(Camry);
        myGarage.addVehicle(VolvoFH);

        // 2. Add vehicle using Overloaded method (by details)
        myGarage.addVehicle("Ducati Panigale", 2025, "Italy", "motorcycle", 1100);

        // Display garage contents
        myGarage.displayAllVehicles();

        // 3. Remove vehicle using Overloaded method (by model name)
        myGarage.removeVehicle("Volvo FH16");

        // Display final garage contents
        myGarage.displayAllVehicles();
    }
}
