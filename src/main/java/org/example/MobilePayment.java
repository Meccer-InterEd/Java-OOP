package org.example;

public class MobilePayment extends Payment{
    @Override
    public void pay(double amount){
        System.out.println("R"+amount+" was payed using mobile payment.");
    }
}
