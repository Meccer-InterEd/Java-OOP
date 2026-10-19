package org.example;

public class Main {
    public static void main(String[] args) {
/*
        Car car = new Car("BMW", "Black", 2026);
        Car car2 = new Car("Benz", "White", 2026);

        car.startEngine();
        car2.startEngine();

        car.displayDetails();
        car2.displayDetails();
*/
        BankAccount ba = new BankAccount();

        ba.setBalance(0);
        ba.deposit(1000);
        ba.withdraw(250);
        ba.deposit(-50);
        ba.withdraw(5000);
        ba.displayBalance();

    }
}