package org.example;

public class MobilePayment extends Payment{
    double eMoneyBalance = 5000;
    @Override
    public void pay(double amount){
        if (amount <= eMoneyBalance){
            eMoneyBalance -= amount;
            System.out.println("New e-money balance: R"+eMoneyBalance);
        }
    }
}
