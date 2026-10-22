package za.co.mie;

public class CashPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid with cash");
    }
}
