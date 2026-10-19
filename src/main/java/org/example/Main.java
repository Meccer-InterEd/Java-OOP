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

        System.out.println("\n\nLab 01 Question 01: What is a class? \n" +
                "- A class is a guideline of behaviours and characteristics that are " +
                "representative of real life objects.\n");

        System.out.println("Lab 01 Question 02: What is an object?\n" +
                "- An object is an instance of a class, it is the container which holds" +
                " the actual data values.\n");

        System.out.println("Lab 01 Question 03: Can two" +
                "objects from the same class have different values?\n" +
                "- Yes, objects of the same class can hold unique data values of their own.\n");

        subaru.startEngine();
        ford.startEngine();
    }
}