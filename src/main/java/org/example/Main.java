package org.example;


import java.io.CharArrayReader;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "black", 2020);
        Car car1 = new Car("Mercedes", " white", 2024);

        car.displayDetails();
        car1.displayDetails();

        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(250);
        System.out.println("Final balance:"+ account.getBalance());

        account.deposit(-50);
        account.withdraw(5000);



    }
}