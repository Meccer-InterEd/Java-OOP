package org.example;

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

    void displayDetails() {
        System.out.println(brand + " " + colour + " " + year);
    }

    void startEngine() {
        System.out.println(brand + " engine started!");
    }
}