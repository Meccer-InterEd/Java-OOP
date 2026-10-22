package org.example.Lab01n2_Constructor;
// lab 1
public class Car {
    String brand;
    String colour;
    int year;


    // constructor
    public Car(String brand, String colour, int year) {
        this.brand = brand;
        this.colour = colour;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public int getYear() {
        return year;
    }

    public void displayDetails() {
        System.out.println(brand + " " + colour + " " + year);
    }

    public void startEngine() {
        System.out.println(brand + " engine started!");
    }
}