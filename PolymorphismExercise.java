// --- Parent Class ---
class Animal {
    // Virtual method to be overridden by subclasses
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// --- Subclass 1: Dog overriding the sound method ---
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// --- Subclass 2: Cat overriding the sound method ---
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

// --- Main Class renamed to avoid file name conflicts in GitHub ---
public class PolymorphismExercise {
    public static void main(String[] args) {
        // Creating different animal objects using Polymorphism
        Animal myAnimal = new Animal();
        Animal myDog = new Dog(); // Dog object stored in Animal reference
        Animal myCat = new Cat(); // Cat object stored in Animal reference

        // Calling the overridden methods
        myAnimal.sound();
        myDog.sound();
        myCat.sound();
    }
}

