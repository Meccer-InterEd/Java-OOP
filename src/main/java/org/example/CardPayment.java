package org.example;

public class CardPayment extends Payment{
    @Override
    public void pay(double amount){
        System.out.println("Card payment of R" + amount);
    }
}
