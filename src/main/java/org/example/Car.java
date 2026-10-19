package org.example;
//Lab 1: Classes and Objects
//Create Car.java:

//In Main.java:
// 1. Create two Car objects.
// 2. Give them different values.
// 3. Call displayDetails() on each object.

//Questions
// 1. What is a class?
//A class is a blueprint for creating objects,encapsulating data and behavior.

// 2. What is an object?
//An object is a self-containing unit in programming that bundles data and the functions that operate on that data into a single structure.

// 3. Can two objects from the same class have different values?
// Yes they can.

//Challenge: Add a startEngine() method.
public class Car {
    String brand;
    String colour;
    int year;

    Car(String _brand, String _colour, int _year) {
        brand = _brand;
        colour = _colour;
        year = _year;
    }

    void displayDetails() {
        System.out.println(brand + " " + colour + " " + year);
    }

    void startEngine() {
        System.out.println("Starting engine ...");
    }
}
