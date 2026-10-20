package org.example;

public class CashPayment extends Payment{
    double cashOnHand = 500;
    @Override
    public void pay(double amount){
        if (amount <= cashOnHand){
            cashOnHand -= amount;
            System.out.println("New cash balance: R"+cashOnHand);
        }
    }
}
