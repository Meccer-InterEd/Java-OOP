package org.example;

public class Car {

    String brand;
    String colour;
    int year;

    void displayDetails() {
        System.out.println(brand + " " + colour + " " + year);
    }

    void startEngine() {
        System.out.println("The engine is running\n");
    }

}
