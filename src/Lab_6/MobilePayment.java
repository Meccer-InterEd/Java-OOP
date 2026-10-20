package Lab_6;

public class MobilePayment extends Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Mobile pay: " + amount);
    }
}
