package org.example;
//Lab 3: Encapsulation
//Create BankAccount.java with a private balance, a deposit method, a withdraw method and a getter.
//Tasks
// 1. Create an account object.
// 2. Deposit 1000.
// 3. Withdraw 250.
// 4. Try depositing -50 and withdrawing 5000.
// 5. Print the final balance.

//Questions
// Why is balance private?
//So that a user won't be able to modify the balance.

// Why should invalid amounts be rejected?
// The system must validate every input, and throw error to users to see that the input is invalid.

//Challenge: Add displayBalance().

public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public BankAccount(){
        this.balance = balance;
    }

    void deposit(double amount){
        if (amount > 0) {
            this.balance += amount;
        } else  {
            System.out.println("Invalid amount!!");
        }
    }

    void withdraw(double amount){
        if (amount < balance ) {
            this.balance -= amount;
        } else  {
            System.out.println("Insufficient amount!!");
        }
    }

    void displayBalance(){
        System.out.println("Balance: " + this.balance);
    }
}
