package org.example;

public class MobilePayment extends Payment{

    @Override
    public void pay(double amount) {
        super.pay(amount);
        System.out.println("Mobile payment of " + amount + " is successful");
    }
}
