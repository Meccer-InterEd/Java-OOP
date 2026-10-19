package org.example;

public class Car {
    String brand;
    String colour;
    int year;

    public Car(String brand, String colour, int year) {
        this.brand = brand;
        this.colour = colour;
        this.year = year;
    }

    public Car(String colour, String brand) {
        this.colour = colour;
        this.brand = brand;
    }

    void displayDetails() {
        System.out.println(brand + " " + colour + " " + year);
    }

    public void startEngine(){

    }
}
