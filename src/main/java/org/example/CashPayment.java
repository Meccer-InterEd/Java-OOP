package org.example;

public class CashPayment extends Payment{

    @Override
    public void pay(double amount) {
        super.pay(amount);
        System.out.println("Cash payment of " + amount + " is successful");
    }
}
