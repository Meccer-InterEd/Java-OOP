package org.example;

public class Car {
    String brand;
    String colour;
    int year;

    Car(String brand, String colour, int year){
        this.brand = brand;
        this.colour = colour;
        this.year = year;
    }
    Car(String brand, String colour){
        this.brand = brand;
        this.colour = colour;
    }


    void displayDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Colour: " + colour);
        System.out.println("Year: " + year);
    }
}
