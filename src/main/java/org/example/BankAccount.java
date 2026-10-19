package org.example;

public class BankAccount {
    private double balance;
    void displayBalance(){
        System.out.println("Current balance: R" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("R"+amount+" is Deposited successful.");
        }else
        {
            System.out.println("Invalid Amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("R"+amount+" is Withdrawn successful.");
        }
        else {
            System.out.println("Invalid Amount.");
        }
    }
    public double getBalance() {
        return balance;
    }
}
