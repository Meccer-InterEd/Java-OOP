package org.example.Lab06_Abstraction;

public class  CardPayment  extends Payment{

      @Override
      public void pay(double amount) {

          System.out.println("You maid card payment");
      }
  }
