package org.example;
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", "Black", 2018);
        Car car2 = new Car("Toyota", "White", 2022);

        Car car3 = new Car("Tesla", "Space Grey");
        Car car4 = new Car("VW", "Grey");

        car1.displayDetails();
        System.out.println();
        car2.displayDetails();

        car3.displayDetails();
        car4.displayDetails();

        /* Task 1.2: A constructor is a function in a class that allows you to add parameters
        to easily create objects. It shortens the lines of code. The constructor runs in the main class.
        When creating objects in the main that is when you "call" the costructor, or rather you use the constructor.
        Task 1.3 : 'this.brand' tells Java that you are assinging the variable 'brand' in the constructor
        to the 'brand' to the instance variable of the class. So that by calling either 'this.brand' or 'brand'
        you be reffering to the same values.
         */

        BankAccount bankAccount = new BankAccount(2000);
        bankAccount.deposit(1000);
        bankAccount.withdraw(250);
        bankAccount.getBalance();

        /*bankAccount.deposit(-50);
        bankAccount.withdraw(5000);
        bankAccount.getBalance();*/

    }
}