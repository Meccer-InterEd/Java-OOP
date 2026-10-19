package org.example;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.brand = "Volkswagen";
        car1.colour = "White";
        car1.year = 2020;

        car1.displayDetails();
        car1.startEngine();

        Car car2 = new Car();

        car2.brand = "Toyota";
        car2.colour = "Silver";
        car2.year = 2018;

        car2.displayDetails();
        car2.startEngine();
    }
}