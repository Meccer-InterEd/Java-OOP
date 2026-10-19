package org.example;

public class Car {
    String brand;
    String colour;
    int year;

    void displayDetails() {
        System.out.println(brand + " " + colour + " " + year);
    }

    void startEngine(){
        System.out.println("Engine hot and ready!");
    }

//    Class is a blueprint of an object
//    An object is an instance of a class
//    You can create multiple objects of a class
}