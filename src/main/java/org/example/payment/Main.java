package org.example.payment;

public class Main {
    public static void main(String[] args) {
        Payment payment1 = new CardPayment();
        Payment payment2 = new CashPayment();

        payment1.pay(250);
        payment2.pay(100);
    }
}
