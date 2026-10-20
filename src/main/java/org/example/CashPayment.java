package org.example;

public class CashPayment extends Payment {

    @Override
    public void pay(double amount) {
        if (amount > 0) {
            System.out.println("Cash payment: R" + amount);
        } else {
            System.out.println("Cash payment not accepted. Invalid amount given");
        }
    }
}
