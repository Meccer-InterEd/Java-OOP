package org.example;
import org.example.StudentManagement.Student;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//       Car car1 = new Car("Audi","Silver Grey",2026);
//       Car car2 = new Car("Mercedes","Black",2025);
//
//
//       car1.displayDetails();
//       car2.displayDetails();

//        BankAccount account = new BankAccount();
//
//        account.deposit(1000);
//        account.withdraw(250);
//        account.withdraw(-50);
//        account.withdraw(5000);
//
//        account.displayBalance();

//        Student student = new Student("Thamsanqa",222203082);
//        Teacher teacher = new Teacher("Gift","Programming");
//
//        student.introduce();
//        System.out.print(" my student number is "+student.studentNumber);
//
//        System.out.println("\n");
//
//        teacher.introduce();
//        System.out.print(" i teach "+teacher.subject);

//        Cat cat = new Cat();
//        Dog dog = new Dog();
//
//        dog.makeSound();
//        cat.makeSound();

        //one method call can produce different results because both subclasses extend the super class and override the method in the superclass to produce a different output

    Payment payment1 = new CardPayment();
    Payment payment2 = new CashPayment();
    Payment payment3 = new MobilePayment();

        payment1.pay(250);
        payment2.pay(250);
        payment3.pay(250);

        //Abstract means to hide complexity
        //No we cannot create an object from an abstract class
        //it must implement it to give it a method body because its an extended abstract class that has a methods with no method body defined


    }
}