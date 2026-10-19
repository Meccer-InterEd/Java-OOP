package org.example;

public class MobilePayment extends Payment{
    @Override
    public void pay(double amount) {
        System.out.println("The amount paid with your mobile payment is:" + amount);
    }
}
