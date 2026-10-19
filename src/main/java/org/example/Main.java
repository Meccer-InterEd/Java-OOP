package org.example;
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", "Red", 2020);
        Car car2 = new Car("Beijing", " Magenta", 2025);

        System.out.println("Lab 1");
        car1.displayDetails();
        System.out.println();
        car2.displayDetails();

    }
}