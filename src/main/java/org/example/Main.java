package org.example;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Car car2 = new Car();

        car.brand = "BMW";
        car.colour = "Black";
        car.year = 2026;

        car2.brand = "Benz";
        car2.colour = "White";
        car2.year = 2026;

        car.startEngine();
        car2.startEngine();
    }
}