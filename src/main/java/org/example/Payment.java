package org.example;
//Lab 6: Abstraction
//Create an abstract class:
//Create CardPayment and CashPayment classes that extend Payment and implement pay(double amount) with a suitable message.

//Test:

//Payment payment1 = new CardPayment();
//Payment payment2 = new CashPayment();

//payment1.pay(250);
//payment2.pay(100);

//Questions
// 1. What does abstract mean?
//Means to hide or overshadow something.

// 2. Can you create an object directly from an abstract class?
// Yes.

// 3. Why must subclasses implement pay()?
// So that they could use the construct from the parent class.

//Challenge: Add a MobilePayment class.

public class Payment {
    public void pay(double amount) {

    }

}
