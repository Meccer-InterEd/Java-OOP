package org.example;


import java.util.Arrays;
import java.util.Objects;

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

        StudentM [] studentM = new StudentM[]{
           new  StudentM("Lindiwe", 76, 19),
                new  StudentM("Kabelo", 48, 21),
                new  StudentM("Ayesha", 89, 20),
                new  StudentM("Thabo", 63, 18)

        };


        for (int i = 0; i < studentM.length; i++){
            studentM[i].displayStudent();
        }

        double highest = studentM[0].getMark();

        for (int i = 0; i < studentM.length; i++) {
            if (studentM[i].getMark() > highest) {
                highest = studentM[i].getMark();
            }
        }

        System.out.println("Highest mark: " + highest);

        int passCount = 0;
        int pdCount = 0;
        for (int i = 0; i < studentM.length; i++) {
            if (studentM[i].getMark() >= 50){
                passCount++;
            }
        }
        for (int i = 0; i < studentM.length; i++) {
            if (studentM[i].getMark() >= 80) {
                pdCount++;
            }
        }
            System.out.println("There are " + passCount + " students that have passed");
        System.out.println("There are/is " + pdCount + " student/s that have passed with a distinction");

        String searcher = "ayesha";

        for (int i = 0; i < studentM.length; i++) {
            if (studentM[i].getName().equalsIgnoreCase(searcher)){
                System.out.println("Student found at index " + i );
            }
        }



    }
    }
