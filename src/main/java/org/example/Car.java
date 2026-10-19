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

//Lab 2: Constructors and this
//Add a constructor to Car:
//Create objects like this:
//Car car1 = new Car("BMW", "Black", 2018);
//Car car2 = new Car("Toyota", "White", 2022);

//Tasks
// 1. Display both cars.

// 2. Explain when a constructor runs.
//A constructor runs automatically when a new instance of a class object is created, before the object is used for anything else.

// 3. Explain what this.brand means.
// Refers to the brand property of the current object being created.

//Challenge: Add a second constructor that accepts only brand and color.

public class Car {
    String brand;
    String colour;
    int year;

    Car(String _brand, String _colour, int _year) {
        brand = _brand;
        colour = _colour;
        year = _year;
    }

    void brandAndColour(String _brand, String _colour){
        this.brand = _brand;
        this.colour = _colour;
        System.out.println("Brand: " + this.brand + " Colour: " + this.colour);
    }

    void displayDetails() {
        System.out.println(brand + " " + colour + " " + year);
    }

    void startEngine() {
        System.out.println("Starting engine ...");
    }

}
