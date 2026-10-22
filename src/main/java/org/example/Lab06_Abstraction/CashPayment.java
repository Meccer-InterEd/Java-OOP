package org.example.Lab06_Abstraction;

public class CashPayment extends Payment{


      @Override
      public void pay(double amount) {
          System.out.println(" You have paid Cash");
      }
  }
