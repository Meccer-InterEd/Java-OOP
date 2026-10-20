package org.example;
//Lab 6.3
public class MobilePayment extends Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid R" + amount + " using Mobile Payment.");
    }
}
