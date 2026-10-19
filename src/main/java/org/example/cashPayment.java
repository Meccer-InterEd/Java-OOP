package org.example;

public class cashPayment extends Payment{
    @Override
    public  void pay(double amount){
        System.out.println("Card payment of R" + amount);
    }
}
