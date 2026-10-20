package org.example;


public class Main {
    public static void main(String[] args) {


        Car car1 = new Car("BMW","Black",2018);
        car1.displayDetails();
        Car car2 = new Car("Toyota","White",2022);
        car2.displayDetails();
        car2.startEngine();

        /*
            Task 2 - A constructor runs the moment you instantiate a new object of a class using the new keyword
            Task 3 - this keyword refers to the current object instance(specific object created or worked with)
            .brand - refers to the variable(attribute) named brand that belongs to the class
         */
        System.out.println("=======================================================");
        BankAccount accOne = new BankAccount();

        accOne.deposit(1000);
        System.out.println(accOne.getBalance());
        accOne.displayBalance();
        accOne.withdraw(250);
        System.out.println(accOne.getBalance());
        accOne.displayBalance();
        accOne.deposit(-50);
        System.out.println(accOne.getBalance());
        accOne.displayBalance();
        accOne.withdraw(5000);
        System.out.println(accOne.getBalance());
        accOne.displayBalance();

        System.out.println("=======================================================");
        Teacher m = new Teacher("Java","Mudau");
        m.introduce();
        Student s =new Student("2246667889","Motsei");
        s.introduce();
        System.out.println("Student Number:" + s.studNumber + " Learning:" +m.subject);
        /*
        extends keyword shows inheritance between classes
        super(name) calls the constructor of the parent class and passes the name argument to it
         */

        System.out.println("=======================================================");

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Cow();
        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();


        /*
         @override annotation tells compiler that a method is instended to replace/override a method in a superclass.
         why one method call can produce multiple values is because of polymorphism
         */
        System.out.println("=======================================================");

        Payment p1 = new CardPayment();
        p1.pay(250);
        Payment p2 = new CashPayment();
        p2.pay(100);
        Payment p3 = new MobilePayment();
        p3.pay(50);

        /*
            question1 - Abstract means it is declared but not fully defined, take it as a placeholder
            question2 - No you cannot instantiate an abstract class directly
            question3 - Because pay() method is declared abstract in the parent Payment class
         */

        System.out.println("=======================================================");
        }


    }
