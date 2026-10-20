package org.example;

public class CardPayment extends Payment{
    @Override
    public void pay(double amount) {

        double amountDue = 0;
        double balance = amount - amountDue;

        System.out.println("Payment made. Remaining balance R" + amount);
    }
}
