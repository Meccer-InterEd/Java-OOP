package org.example;

public class CardPayment extends Payment{
//Lab 6.1
    @Override
    public void pay(double amount) {
        System.out.println("Paid R" + amount + " using card.");
    }
}
