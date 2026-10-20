package org.example;
//Lab 6.2
public class CashPayment extends Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid R" + amount + " using cash.");
    }
}
