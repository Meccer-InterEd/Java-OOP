package org.example.lab1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.colour = "Red";
        car1.year = 2020;

        Car car2 = new Car();
        car2.brand = "BMW";
        car2.colour = "Blue";
        car2.year = 2023;

        car1.displayDetails();
        car2.displayDetails();
        car1.startEngine();
        car2.startEngine();
    }

}
