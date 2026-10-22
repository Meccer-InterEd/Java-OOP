package za.co.mie;

public class MobilePayment extends Payment{
    @Override
    public void pay(double amount){
        System.out.println("Paid with mobile");
    }
}
