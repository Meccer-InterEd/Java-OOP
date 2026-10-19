package org.example;

/*1. What is a class?
A class is a blueprint or template used to create objects.
It defines the properties and behaviours that its objects can have.

 2. What is an object?
An object is an instance of a class.
 It has its own values for the variables defined in the class.*/
public class Main {
    public static void main(String[] args) {

        // lab 1 for  car
        Car car1 = new Car("BMW", "Black", 2018);
        Car car2 = new Car("Toyota", "White", 2022);
        Car car3 = new Car("Audi","Gray",2026);
        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();

        car1.startEngine();
        car2.startEngine();

        // lab 2  for balance account
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(250);
        account.deposit(-50);
        account.withdraw(5000);

        System.out.println("Final Balance: $" + account.getBalance());
        account.displayBalance();


    }
}