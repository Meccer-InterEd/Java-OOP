package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand =  "BMW";
        car.colour = "Black";
        car.year = 2025;

        car.displayDetails();

        Car car1 = new Car();
        car1.brand =  "Polo GTI";
        car1.colour = "Red";
        car1.year = 2024;

        car1.displayDetails();
    }
}