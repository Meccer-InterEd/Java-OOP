package org.example.car;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", "Black", 2018);
        Car car2 = new Car("Toyota", "White", 2022);

        car1.displayDetails();
        car2.displayDetails();
        car1.startEngine();
        car2.startEngine();
    }

}
