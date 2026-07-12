// --- Base Class (Parent Class) ---
class Animal {
    // Protected variable accessible by subclasses
    protected String name;

    // Constructor to initialize animal name
    public Animal(String name) {
        this.name = name;
    }
}

// --- Subclass (Child Class) inheriting from Animal ---
class Dog extends Animal {
    private int age;
    private String color;

    // Constructor that calls the parent constructor using super()
    public Dog(String name, int age, String color) {
        super(name); // Pass name to the Animal constructor
        this.age = age;
        this.color = color;
    }

    // Method to print all details of the dog
    public void printDogInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }
}

// --- Main Class to run the program ---
public class Main {
    public static void main(String[] args) {
        // Create a new Dog object
        Dog myDog = new Dog("Buddy", 3, "Golden");
        
        // Display the dog's information
        myDog.printDogInfo();
    }
}
