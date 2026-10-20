package Lab_3;

public class BankAccountMain {
    void main(){
        BankAccount transaction = new BankAccount();

        transaction.deposit(1000);
        transaction.withdraw(250);

        transaction.deposit(-50);
        transaction.withdraw(5000);

        transaction.displayBalance();


    }
}
