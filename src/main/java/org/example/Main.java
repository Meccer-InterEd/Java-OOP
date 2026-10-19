package org.example;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Mercedes", "Black", 2022);
        Car car2 = new Car("BMW", "blue", 2026);

        car1.displayDetails();
        car2.displayDetails();

        BankAccount account = new BankAccount();
        BankAccount account1 = new BankAccount();
        account.deposit(1000);
        account.withdraw(250);
        System.out.println("Balance is: R" + account.getBalance());

        account1.deposit(-50);
        account1.withdraw(5000);
        System.out.println("Balance is: R" + account1.getBalance());

        Student student = new Student("Siyabonga", "218253974");
        Teacher teacher = new Teacher("Rhendi", "OOP");

        student.introduce();
        System.out.println("And my student number is: " + student.studentNumber);

        teacher.introduce();
        System.out.println("And the subject I teach is: " + teacher.subject);

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Cow();

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();

        Payment payment1 = new CardPayment();
        Payment payment2 = new CashPayment();
        Payment payment3 = new MobilePayment();

        payment1.pay(250);
        payment2.pay(100);
        payment3.pay(600);
    }
}