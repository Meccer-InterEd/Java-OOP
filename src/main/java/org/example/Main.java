package org.example;

public class Main {
    public static void main(String[] args) {

//        Car car1 = new Car();
//        Car car2 = new Car();
//
//        car1.brand = "BMW";
//        car1.colour = "Red";
//        car1.year = 2025;
//
//        car2.brand = "Toyota";
//        car2.colour = "Blue";
//        car2.year = 2023;
//
//        car1.displayDetails();
//        car2.displayDetails();
        Car car1 = new Car("BMW", "Black", 2018);
        Car car2 = new Car("Toyota", "White", 2022);

        car1.displayDetails();
        car2.displayDetails();




    }
}