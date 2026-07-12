// --- Base Class (Parent Class) using Encapsulation ---
class Animal {
    // Private variable, hidden from direct outside access
    private String name;

    // Setter method to safely assign a value to 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to safely retrieve the value of 'name'
    public String getName() {
        return name;
    }
}

// --- Subclass (Child Class) inheriting from Animal ---
class Dog extends Animal {
    private int age;
    private String color;

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for color
    public String getColor() {
        return color;
    }
}

// --- Main Class renamed to avoid file name conflicts in GitHub ---
public class EncapsulationExercise {
    public static void main(String[] args) {
        // Create a new Dog object
        Dog myDog = new Dog();
        
        // Using setters to assign values safely
        myDog.setName("Buddy"); // Inherited setter from Animal class
        myDog.setAge(3);
        myDog.setColor("Golden");

        // Using getters to display the values
        System.out.println("Name: " + myDog.getName());
        System.out.println("Age: " + myDog.getAge());
        System.out.println("Color: " + myDog.getColor());
    }
}
