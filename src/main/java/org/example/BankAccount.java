package org.example;

public class BankAccount {
    private double balance;

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }else{
            System.out.println("You cannot deposit a negative amount");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
        }else{
            System.out.println("The withdrawal amount exceeds the balance");
        }
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void displayBalance(){
        System.out.println("The running balance is R"+balance);
    }
}
