package org.example;
//Lab1
public class Car {
    String brand;
    String colour;
    int year;


   //Lab 2
    public Car(String brand, String colour, int year) {
        this.brand = brand;
        this.colour = colour;
        this.year = year;
    }
    public Car(String brand,String colour){
        this.brand=brand;
        this.colour=colour;
    }

    void displayDetails() {
        System.out.println(brand + " " + colour + " " + year);
    }
    void startEngine() {
        System.out.println(brand + " engine is starting...");
    }
}
