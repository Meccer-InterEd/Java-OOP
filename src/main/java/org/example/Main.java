package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Lab 1

        Car subaru = new Car();
        subaru.brand = "Subaru";
        subaru.colour = "Blue";
        subaru.year = 2007;

        Car ford = new Car();
        ford.brand = "Ford";
        ford.colour = "White";
        ford.year = 2015;

        subaru.displayDetails();
        ford.displayDetails();

    }
}