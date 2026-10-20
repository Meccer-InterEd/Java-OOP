package org.example;

import javax.print.DocFlavor;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", "Black", 2018);
        Car car2 = new Car("Toyota", "White", 2022);

        Car car3 = new Car("Tesla", "Space Grey");
        Car car4 = new Car("VW", "Grey");

        car1.displayDetails();
        System.out.println();
        car2.displayDetails();

        car3.displayDetails();
        car4.displayDetails();

        /* Task 1.2: A constructor is a function in a class that allows you to add parameters
        to easily create objects. It shortens the lines of code. The constructor runs in the main class.
        When creating objects in the main that is when you "call" the costructor, or rather you use the constructor.
        Task 1.3 : 'this.brand' tells Java that you are assinging the variable 'brand' in the constructor
        to the 'brand' to the instance variable of the class. So that by calling either 'this.brand' or 'brand'
        you be reffering to the same values.
         */

        BankAccount bankAccount = new BankAccount(2000);
        bankAccount.deposit(1000);
        bankAccount.withdraw(250);
        bankAccount.getBalance();

        /*bankAccount.deposit(-50);
        bankAccount.withdraw(5000);
        bankAccount.getBalance();*/

        Student student = new Student("1234567", "Josephine Bleu");
        Teacher teacher = new Teacher("Hisham Kraft", "Mathematics");

        student.introduce();
        System.out.println();
        teacher.introduce();
        /* 'extends' is a key word in java that means inherits from. So if 'Student' extends 'Person'
        it simply means that 'Student' class is inheriting from 'Person' class.

        super(name) is basically referring to the variable 'name' in the parent class 'Person' that all the other classes
        are inheriting from
         */

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Cow();

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
        /* One method can produce different results because of
        @override. This allows the child class to provide its own
        implementation of the method in the parent class, therefore
        the method then prduces different outcomes.
         */

        Payment payment1 = new CardPayment();
        Payment payment2 = new CashPayment();
        payment1.pay(250);
        payment2.pay(100);

        // LAB 7
        Students[] students = new Students[4];
        students[0] = new Students("Hishaam", 21, 96);
        students[1] = new Students("Jeniffer", 30, 24);
        students[2] = new Students("John", 24, 70);
        students[3] = new Students("Jane", 26, 150);

        double average = 0;
        double sum = 0;
        double highestMark = students[0].getMark();
        int count = 0;
        int distinction = 0;

        for(int i = 0; i < students.length ; i++){
            students[i].displayDetails();
            students[i].passOrFail();
            students[i].rejectOrDistinction();

            sum = sum + students[i].getMark();
            average = sum / students.length;

            if (students[i].getMark() > highestMark && students[i].getMark() <= 100) {
                highestMark = students[i].getMark();
            }

            if (students[i].hasPassed()){
                count ++;
            }
             if(students[i].getMark() >= 80 && students[i].getMark() <=100){
                 distinction++;
             }
        }
        System.out.println("Average mark is: "  + average);
        System.out.println("The highest mark is: " + highestMark);
        System.out.println("This many students passed: " + count);
        System.out.println("This many students go a distinction: " + distinction);

        boolean found = false;
        for (int i = 0; i < students.length; i++){
            if(students[i].getName().equals("Jane")){
                found = true;
            }
        }
        System.out.println("The name was found: "+ found);
    }

    /*
    Lab 8
    CORRECTED CODE:
    class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " " + makes a sound.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("Dog barks.");
    }
}

1. That is because name = name both variables are referring
to the constructor parameter, no the object's field. So
basically Java is assigning the parameter to itself.
2. You fix this problem by adding a 'this' keyword to the first name.
You can distinguish between the object's field and the constructor parameter.
3.
     */

}