package org.example;

public class Main {
    public static void main(String[] args) {

//        Car car1 = new Car();
//        Car car2 = new Car();
//
//        car1.brand = "BMW";
//        car1.colour = "Red";
//        car1.year = 2025;
//
//        car2.brand = "Toyota";
//        car2.colour = "Blue";
//        car2.year = 2023;
//
//        car1.displayDetails();
//        car2.displayDetails();
//        Car car1 = new Car("BMW", "Black", 2018);
//        Car car2 = new Car("Toyota", "White", 2022);
//
//        car1.displayDetails();
//        car2.displayDetails();
//        BankAccount account = new BankAccount();
//        account.deposit(1000);
//        account.withdraw(250);
//
//        account.deposit(-50);
//        account.withdraw(5000);
//        account.displayBalance();

//        Student student = new Student("Mancoba","101");
//        Teacher teacher = new Teacher("Ancoba","OOP");
//
//        student.introduce();
//        teacher.introduce();

//        Animal animal1 = new Dog();
//        Animal animal2 = new Cat();
//        Animal animal3 = new Cow();
//
//        animal1.makeSound();
//        animal2.makeSound();
//        animal3.makeSound();

        Payment payment1 = new CardPayment();
        Payment payment2 = new CashPayment();
        Payment payment3 = new MobilePayment();

        payment1.pay(250);
        payment2.pay(100);
        payment3.pay(500);






    }
}