package org.example;


public class Main {
    public static void main(String[] args) {
        Car car= new Car();
        car.displayDetails1();
        car.displayDetails2();


        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        bankAccount.withdraw(250);
        bankAccount.deposit(-50);
        bankAccount.withdraw(5000);
        bankAccount.displayBalance();


        Teacher teacher = new Teacher("Life Orientation", "Kagiso");
        teacher.displayTeacher();
        teacher.introduce();

        Student student = new Student("218044682", "Shaun");
        student.displayStudent();
        student.introduce();


        Animal animal1 = new Dog();
        animal1.makeSound();

        Animal animal2 = new Cat();
        animal2.makeSound();

        Animal animal3 = new Cow();
        animal3.makeSound();


        Payment cardpayment = new CardPayment();
        cardpayment.pay(250);

        Payment cashpayment = new CashPayment();
        cashpayment.pay(100);

        Payment mobilepayment = new MobilePayment();
        mobilepayment.pay(500);
        }
    }
