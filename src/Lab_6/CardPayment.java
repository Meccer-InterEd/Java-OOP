package Lab_6;

    public class CardPayment extends Payment {
        @Override
        public void pay(double amount) {
            System.out.println("Card Pay: " + amount);
        }
    }
