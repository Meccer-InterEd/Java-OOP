package org.example;


public class Main {
    public static void main(String[] args) {


        Car car1 = new Car("BMW","Black",2018);
        car1.displayDetails();
        Car car2 = new Car("Toyota","White",2022);
        car2.displayDetails();
        car2.startEngine();

        /*
            Task 2 - A constructor runs the moment you instantiate a new object of a class using the new keyword
            Task 3 - this keyword refers to the current object instance(specific object created or worked with)
            .brand - refers to the variable(attribute) named brand that belongs to the class
         */
        }
    }
