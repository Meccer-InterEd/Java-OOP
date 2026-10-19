package org.example;

public class BankAccount {
    private double balance;
//
//    BankAccount (double balance) {
//       this.balance = balance;
//    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }else {
System.out.println("Invalid Transaction");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Amount");
        }
    }

    public double getBalance() {
        return balance;
    }
    void displayBalance(){
        System.out.println("Your Balance is: " + balance);
    }
}

