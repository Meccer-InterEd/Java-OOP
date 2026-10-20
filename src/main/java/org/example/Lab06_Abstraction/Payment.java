package org.example.Lab06_Abstraction;

public abstract class Payment {
    public abstract void pay(double amount);
}
  class  CardPayment  extends Payment{

      @Override
      public void pay(double amount) {
          System.out.println("You maid card payment");
      }
  }
  class CashPayment extends Payment{


      @Override
      public void pay(double amount) {
          System.out.println(" You have paid Cash");
      }
  }

