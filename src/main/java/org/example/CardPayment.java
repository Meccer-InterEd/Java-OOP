package org.example;

public class CardPayment extends Payment{

    @Override
    public void pay(double amount) {
        System.out.println("You paying using card payment method!!!");
        System.out.println("Due: R" + amount);
    }
}
