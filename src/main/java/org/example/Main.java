package org.example;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Jeep","White",2020);
        Car car1 = new Car("Mazda","Red",2023);
        Car car2 = new Car("Toyota","Olive Green");

//        car.brand = "Audi";
//        car.colour = "Blue";
//        car.year = 2024;
//
//        car1.brand = "BMW";
//        car1.colour ="Black";
//        car1.year = 2025;

        car.displayDetails();
        car1.displayDetails();
        car2.displayDetails();
        car.startEngine();

        System.out.println();

        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(1000);
        bankAccount.withdraw(250);
        bankAccount.deposit(-50);
        bankAccount.withdraw(5000);
        bankAccount.displayBalance();

        System.out.println();

        Person person = new Person("Ditebogo");
        Student student = new Student("Lehutso","221393439");
        Teacher teacher = new Teacher("Rowen","Physics");

        student.introduce();
        teacher.introduce();
        System.out.println(student.name + " " + student.studentNumber );
        System.out.println(teacher.name + " " + teacher.subject );
        System.out.println();

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Cow();

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
        System.out.println();

        Payment payment = new CardPayment();
        Payment payment1 = new CashPayment();
        Payment payment2 = new MobilePayment();

        payment.pay(3000);
        payment1.pay(5000);
        payment2.pay(1500);

    }
}