package org.example.bankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.deposit(1000);
        acc1.withdraw(250);
        acc1.withdraw(-50);
        acc1.withdraw(5000);
        acc1.displayBalance();
    }
}
