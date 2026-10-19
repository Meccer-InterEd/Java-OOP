package org.example;


public class Main {
    public static void main(String[] args) {


        Car firstCar = new Car();
        firstCar.color = "Black";
        firstCar.brand = "BMW";
        firstCar.year = 2024;
        firstCar.displayDetails();
        Car secCar = new Car();
        secCar.color = "Grey";
        secCar.brand = "Porsche";
        secCar.year = 2026;
        secCar.displayDetails();
        secCar.startEngine();

        /*
            question1 - container/ blueprint or a template that is used to create objects
            question2 - an object is an instance of a class, entity that has its own data and state
            question3 - Yes, two objects from the same class can have different values
         */
        }
    }
