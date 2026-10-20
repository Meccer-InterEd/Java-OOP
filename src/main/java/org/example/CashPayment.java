package org.example;

public class CashPayment extends Payment{
    @Override
    public void pay(double amount){
        System.out.println("R"+amount+" was payed using cash .");
    }
}
