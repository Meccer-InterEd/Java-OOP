package org.example;

public class CardPayment extends Payment{

    @Override
    public void pay(double amount){
        if (amount <= 0) {
            System.out.println("Invalid amount");
        }
        System.out.println("Payment amount" + " " + amount);
    }

}
