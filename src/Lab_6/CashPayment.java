package Lab_6;

    public class CashPayment extends Payment {
        @Override
        public void pay(double amount) {
            System.out.println("Cash Pay: " + amount);
        }
    }

