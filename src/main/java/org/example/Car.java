package org.example;
/*
## Lab 1: Classes and Objects

Create `Car.java`:

``` java
public class Car {
    String brand;
    String colour;
    int year;

    void displayDetails() {
        System.out.println(brand + " " + colour + " " + year);
    }
}
```

In `Main.java`: 1. Create two `Car` objects. 2. Give them different
values. 3. Call `displayDetails()` on each object.

**Questions** 1. What is a class? 2. What is an object? 3. Can two
objects from the same class have different values?

**Challenge:** Add a `startEngine()` method.
 */
public class Car {
    String brand;
    String colour;
    int year;

    void displayDetails() {
        System.out.println(brand + " " + colour + " " + year);
    }

    void startEngine(){
        System.out.println("===========================");
        System.out.println("Starting "+brand+" engine :)");
        System.out.println("===========================");
        System.out.println("All systems ready to go!!!!");

    }
}
