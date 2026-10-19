package org.example;

public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

//    LAB 3
//    If we make balance public, users can manipulate/change their balance.
//    We reject invalid amounts because we do not want to make calculation/deductions on an invalid amount.
}