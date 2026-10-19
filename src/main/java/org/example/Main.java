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

        /*
        Lab 1 Questions:

        1. What is a class?
           A class is the blueprint of an object. It can define what kind data it can hold and also what
           actions it will be able to perform

        2. What is an object?
           An object is an instance of a class

        3. Can two objects from the same class have different values?
           Yes they can have different values
         */

        /*
        Lab 2 Questions:

        1. Explain when a constructor runs
           A constructor runs when instantiating an instance of a class (when declaring a new object)

        2. Explain what this.brand means
           this.brand is used to refer to the field within the class named brand. It helps us avoid
           confusion especially within our constructors. It helps us differentiate between us talking
           about the field of the class and us talking about the parameter that the constructor accepts
           when both have the same name
         */
    }
}