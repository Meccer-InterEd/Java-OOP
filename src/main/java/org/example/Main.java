package org.example;

public class Main {
    public static void main(String[] args) {
        Car car_1 = new Car("BMW", "Black", 2018);
        Car car_2 = new Car("Toyota", "White", 2022);
        car_1.displayDetails();
        car_1.startEngine();
        car_2.displayDetails();
        car_2.startEngine();
    }
}