package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car();

        car.brand = "Audi";
        car.colour = "Blue";
        car.year = 2024;

        car1.brand = "BMW";
        car1.colour ="Black";
        car1.year = 2025;

        car.displayDetails();
        car1.displayDetails();
        car.startEngine();
    }
}