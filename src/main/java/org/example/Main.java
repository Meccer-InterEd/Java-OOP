package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW","Black",2025);

        car.displayDetails();

        Car car1 = new Car("Polo GTI","Red",2024);

        car1.displayDetails();

        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(250);
        account.deposit(-50);
        account.withdraw(5000);
       System.out.println( account.getBalance());


    }
}