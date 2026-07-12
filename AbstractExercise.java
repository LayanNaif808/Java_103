// --- Abstract Parent Class ---
abstract class Shape {
    // Abstract method (has no body, must be implemented by subclasses)
    abstract void draw();
}

// --- Subclass 1: Circle implementing the abstract method ---
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// --- Subclass 2: Rectangle implementing the abstract method ---
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

// --- Main Class renamed to avoid file name conflicts in GitHub ---
public class AbstractExercise {
    public static void main(String[] args) {
        // Creating objects using Polymorphism with Abstract Class references
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        // Executing the implemented draw methods
        s1.draw();
        s2.draw();
    }
}

