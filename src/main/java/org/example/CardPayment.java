package org.example;

public class CardPayment extends Payment{

    @Override
    public void pay(double amount) {
        super.pay(amount);
        System.out.println("Card payment of " + amount + " is successful");
    }
}
