package org.example;
public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.brand = "BMW";
        car.colour = "Red";
        car.year = 2020;
        car.displayDetails();

        Car car2 = new Car();
        car2.brand = "Beijing";
        car2.colour = "Magenta";
        car2.year = 2025;
        car2.displayDetails();


    }
}