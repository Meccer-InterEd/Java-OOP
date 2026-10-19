package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//       Car car1 = new Car("Audi","Silver Grey",2026);
//       Car car2 = new Car("Mercedes","Black",2025);
//
//
//       car1.displayDetails();
//       car2.displayDetails();

        BankAccount account = new BankAccount();

        account.deposit(1000);
        account.withdraw(250);
        account.withdraw(-50);
        account.withdraw(5000);

        account.displayBalance();
    }
}