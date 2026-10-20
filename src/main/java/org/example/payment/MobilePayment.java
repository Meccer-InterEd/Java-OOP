package org.example.payment;

import java.sql.SQLOutput;

public class MobilePayment extends Payment{
    @Override
    public void pay(double amount) {
        System.out.println("MobilePayment: " + amount);
    }
}
