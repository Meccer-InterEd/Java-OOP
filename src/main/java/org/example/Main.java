package org.example;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Car car1 = new Car();

        car.brand = "Mercedes";
        car.colour = "Black";
        car.year = 2022;

        car1.brand = "BMW";
        car1.colour = "Blue";
        car1.year = 2026;

        car.displayDetails();
        car1.displayDetails();



    }
}