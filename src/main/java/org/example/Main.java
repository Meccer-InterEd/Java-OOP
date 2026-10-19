package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW","Black",2025);

        car.displayDetails();

        Car car1 = new Car("Polo GTI","Red",2024);

        car1.displayDetails();

        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(250);
        account.deposit(-50);
        account.withdraw(5000);
       System.out.println( account.getBalance());


       Student student = new Student("Lona","160628605");
       student.introduce();
       System.out.println(student.name + " " + student.studentNumber);


       Teacher teacher = new Teacher("Rhendi","Introduction to Programming");
       teacher.introduce();
       System.out.println(teacher.name + " " + teacher.subject);




    }
}