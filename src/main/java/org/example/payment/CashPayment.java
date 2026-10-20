package org.example.payment;

public class CashPayment extends Payment{
    @Override
    public void pay(double amount) {
        System.out.println("CashPayment: " + amount);
    }
}
