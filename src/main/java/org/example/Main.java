package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car car=new Car();
        Car car1=new Car();
        car.brand="BMW";
        car.colour="Black";
        car.year=2026;

        car1.brand="VW";
        car1.colour="Blue";
        car1.year=2026;

        car.displayDetails();
        car1.displayDetails();

    }
}