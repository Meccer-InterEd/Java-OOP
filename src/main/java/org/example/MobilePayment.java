package org.example;

public class MobilePayment extends Payment {

    @Override
    public void pay(double amount) {
        if (amount > 0) {
            System.out.println("Mobile payment: R" + amount);
        } else {
            System.out.println("Mobile payment failed. Invalid amount");
        }
    }
}
