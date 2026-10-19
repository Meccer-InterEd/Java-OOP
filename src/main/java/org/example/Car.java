/*
n Main.java: 1. Create two Car objects. 2. Give them different values. 3. Call displayDetails() on each object.

Questions 1. What is a class? 2. What is an object? 3. Can two objects from the same class have different values?

Challenge: Add a startEngine() method
 */

package org.example;

public class Car {
    String brand;
    String color;
    int year;

    void displayDetails(){
        System.out.println(brand+" " + color +" " + year);
    }

    void startEngine(){
        System.out.println("Engine starting for the " + brand);
    }
}
