package org.example;

public class CardPayment extends Payment{
    double cardBalance = 1000;
    @Override
    public void pay(double amount){
        if (amount <= cardBalance){
            cardBalance -= amount;
            System.out.println("New card balance: R"+cardBalance);
        }
    }
}
