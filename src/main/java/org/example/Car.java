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

    public Car(String brand, String colour){
        this.brand = brand;
        this.colour = colour;
    }

    void displayDetails() {
        System.out.println(brand + " " + colour + " " + year);
    }

    void startEngine(){
        System.out.println("Engine hot and ready!");
    }

//    LAB 1
//    Class is a blueprint of an object
//    An object is an instance of a class
//    You can create multiple objects of a class

//    LAB 2
//    A constructor runs when an instance/object is created
//    this.brand refers to the variable belonging to the current instance i.e car_1.brand (this will display the brand argument we passed when we initiated/constructed car_1 if we did not later modify it using setters)
}