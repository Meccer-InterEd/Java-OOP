package org.example;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", "Black", 2018);

        car1.displayDetails();
        car1.startEngine();

        Car car2 = new Car("Toyota", "White", 2022);

        car2.displayDetails();
        car2.startEngine();

        Car car3 = new Car("Volkswagen", "Silver");
        car3.displayDetails();

        /*
        Lab 1 Questions:

        1. What is a class?
           A class is the blueprint of an object. It can define what kind data it can hold and also what
           actions it will be able to perform

        2. What is an object?
           An object is an instance of a class

        3. Can two objects from the same class have different values?
           Yes they can have different values
         */

        /*
        Lab 2 Questions:

        1. Explain when a constructor runs
           A constructor runs when instantiating an instance of a class (when declaring a new object)

        2. Explain what this.brand means
           this.brand is used to refer to the field within the class named brand. It helps us avoid
           confusion especially within our constructors. It helps us differentiate between us talking
           about the field of the class and us talking about the parameter that the constructor accepts
           when both have the same name
         */

        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(1000);
        bankAccount.withdraw(250);

        bankAccount.deposit(-50);
        bankAccount.withdraw(5000);

        bankAccount.displayBalance();

        /*
        Lab 3 Questions:

        1. Why is balance private
           Making the balance private helps us to protect the users balance. Code outside of the BankAccount class
           cannot directly access the balance attribute of the class, only methods inside of the class can manipulate
           and change the value of the balance

        2. Why should invalid amounts be rejected?
           Invalid amounts have to be rejected in order to preserve the integrity of the balance. If incorrect/invalid
           amounts are accepted the users balance could be altered incorrectly, like depositing -5 for example would
           actually reduce the account balance by 5 instead of increasing it and withdrawing an amount greater than the
           balance would allow the user to withdraw more money than they actually have
         */

        Student student = new Student(1235, "Tashleigh");
        Teacher teacher = new Teacher("English", "Elaine");

        student.introduce();
        System.out.println("My student number is " + student.studentNumber);
        teacher.introduce();
        System.out.println("I teach " + teacher.subject);

        /*
        Lab 4 Questions:

        1. What does extends do?
           Extends allows child classes to inherit properties and methods from its parent class

        2. What does super(name) do?
           super(name) passes the name argument from the child class's constructor to the matching constructor in the
           parent class, which will allow the parent constructor to initialise the inherited fields
         */

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        dog.makeSound();
        cat.makeSound();
        cow.makeSound();

        /*
        Lab 5 Questions:

        1. Explain @Override
           The @Override allows a method in a subclass to provide a specific implementation
           of a method that is already defined in its parent class. This is called method overriding

        2. Explain why one method call can produce different results
           This is because of polymorphism. One method can produce different results through method
           overriding which will allow that method to behave differently according to the specific
           behaviour given to it within the specific class in which it lives
         */
    }
}