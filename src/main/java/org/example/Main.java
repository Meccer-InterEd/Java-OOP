package org.example;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", "Black", 2018);

        car1.displayDetails();
        car1.startEngine();

        Car car2 = new Car("Toyota", "White", 2022);

        car2.displayDetails();
        car2.startEngine();

        Car car3 = new Car("Volkswagen", "Silver");
        car3.displayDetails();
    }
}