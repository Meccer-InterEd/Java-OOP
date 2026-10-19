package org.example;

public class CashPayment extends Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Cash Payment Received !!!");
    }
}
