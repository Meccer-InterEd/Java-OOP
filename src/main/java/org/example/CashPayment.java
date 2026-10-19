package org.example;

public class CashPayment extends Payment{
    @Override
    public void pay(double amount) {
        System.out.println("The amount paid with cash is:" + amount);
    }
}
