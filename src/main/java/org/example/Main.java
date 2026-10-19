package org.example;


public class Main {
    public static void main(String[] args) {
        Car car= new Car();
        car.displayDetails1();
        car.displayDetails2();


        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        bankAccount.withdraw(250);
        bankAccount.deposit(-50);
        bankAccount.withdraw(5000);
        bankAccount.displayBalance();
        }
    }
