package org.example;

public class CardPayment extends Payment {

    @Override
    public void pay(double amount) {
        if (amount > 0) {
            System.out.println("Card payment: R" + amount);
        } else {
            System.out.println("Card payment failed. Invalid amount entered");
        }
    }
}
