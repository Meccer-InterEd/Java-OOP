package org.example;

public class CashPayment extends Payment{
    @Override
    public void pay(double amount) {
        System.out.println("You paying using cash payment method!!!");
        System.out.println("Due: R" + amount);
    }



}
