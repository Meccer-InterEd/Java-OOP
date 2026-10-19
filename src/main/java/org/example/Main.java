package org.example;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Mercedes", "Black", 2022);
        Car car2 = new Car("BMW", "blue", 2026);

        car1.displayDetails();
        car2.displayDetails();

        BankAccount account = new BankAccount();
        BankAccount account1 = new BankAccount();
        account.deposit(1000);
        account.withdraw(250);
        System.out.print("Balance is: R" + account.getBalance());

        account1.deposit(-50);
        account1.withdraw(5000);
        System.out.print("\nBalance is: R" + account1.getBalance());



    }
}