package org.example;

/*1. What is a class?
A class is a blueprint or template used to create objects.
It defines the properties and behaviours that its objects can have.

 2. What is an object?
An object is an instance of a class.
 It has its own values for the variables defined in the class.*/
public class Main {
    public static void main(String[] args) {

        // lab 1 for  car
        System.out.println("============LAB 4 ====================");
        Car car1 = new Car("BMW", "Black", 2018);
        Car car2 = new Car("Toyota", "White", 2022);
        Car car3 = new Car("Audi","Gray",2026);
        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();

        car1.startEngine();
        car2.startEngine();

        // lab 2  for balance account
        System.out.println("============LAB 2 ====================");
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(250);
        account.deposit(-50);
        account.withdraw(5000);

        System.out.println("Final Balance: R" + account.getBalance());
        account.displayBalance();
      // lab 3
        System.out.println("============LAB 3 ====================");
        Student student = new Student("Thabiso", "S1001");
        Teacher teacher = new Teacher("Mr Phaka", "Java");
        student.introduce();
        teacher.introduce();
        System.out.println("Student Number: " + student.studentNumber);
        System.out.println("Subject: " + teacher.subject);

        System.out.println("============LAB 4 ====================");
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Cow();

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
        System.out.println("============LAB 4 ====================");
        Payment payment1 = new CardPayment();
        Payment payment2 = new CashPayment();
        payment1.pay(250);
        payment2.pay(100);

    }
}