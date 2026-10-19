package org.example;

public class BankAccount {
    private  double balance;


    public  void deposit(double amount){
    if (amount > 0){
        balance += amount;

    }
    else{
        System.out.println("Amount should be greater than zero");
    }
}
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
        balance -= amount;

    }
        else {
            System.out.println("Amount should not exceed current amount");
        }
    }
    public  double getBalance(){
        return  balance;
    }

}
