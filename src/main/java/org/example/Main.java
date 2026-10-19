package org.example;


import java.io.CharArrayReader;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "black", 2020);
        Car car1 = new Car("Mercedes", " white", 2024);

        car.displayDetails();
        car1.displayDetails();

        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(250);
        System.out.println("Final balance:"+ account.getBalance());

        account.deposit(-50);
        account.withdraw(5000);

        Student student = new Student("Karabo", "2527");
        student.introduce();
        System.out.println("Student number:" + student.studentNumber);
        Teacher teacher = new Teacher("Jacobs","Math");
        teacher.introduce();
        System.out.println("Subject: " + teacher.subject);

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound();
        animal2.makeSound();




    }
}