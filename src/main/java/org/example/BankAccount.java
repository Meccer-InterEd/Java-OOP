package org.example;

public class BankAccount {
    private double balance;

    BankAccount(double balance){
       this.balance = balance;
    }

    public double getBalance(){
        System.out.println("Balance: " + balance);
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Desposit amount: " + amount );
        }
    }

    public void withdraw(double amount){
        if (amount > 0 && amount <=balance){
            balance -= amount;
            System.out.println("Withdrawl aount: " + amount);
        }
    }


}
