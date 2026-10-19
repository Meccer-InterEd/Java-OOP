package org.example;

public class BankAccount {
    private double balance;

    public void deposit(double amount){
        if(amount >0){
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if(amount >0 && amount <=balance){
            balance = balance - amount;
        }
    }
    public double getBalance(){
        return  balance;
    }

    public void displayBalance(){
        System.out.println("Balance: R" + balance);
    }

    /*
     balance variable is kept private in encapsulation so that outside code cannot bypass your validation rules like if variable is public, any part of the program can change it and by keeping it private, we are avoiding such instances
     Invalid amounts should be rejected because we don't want it to corrupt our data like financial errors which could cost a bank serious problems
     */

}
