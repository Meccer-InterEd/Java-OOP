package Lab_6;

public class PaymentMain {
    public void main() {


        Payment payment = new CardPayment();
        Payment payment1 = new CashPayment();
        Payment payment2 = new MobilePayment();


        payment.pay(250);
        payment1.pay(100);
        payment2.pay(150);

/*
Questions 1. What does abstract mean?
2. Can you create an object directly from an abstract class?
3. Why must subclasses implement pay()?
Challenge: Add a MobilePayment class.

Answers.
1. It means a class or method is incomplete and needs to be implemented.
2. No, you must use a subclass.
3. Because the abstract class requires each subclass to define how payment works.


 */

    }
}
