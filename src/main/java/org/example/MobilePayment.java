package org.example;

public class MobilePayment extends Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paying using mobile payment method!!");
        System.out.println("Due: R" +amount);
    }
}
