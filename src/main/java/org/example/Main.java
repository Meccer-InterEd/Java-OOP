package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Car car1 = new Car("BMW", "Black", 2018);
        Car car2 = new Car("Toyota", "White", 2022);

        car1.displayDetails();
        car2.displayDetails();
        System.out.println("==============================================================================");
        car1.startEngine();
        car2.startEngine();

        Car car3 = new Car("Ford", "Blue");
        car3.displayDetails();
        System.out.println("==============================================================================");
        BankAccount acc=new BankAccount();
        acc.deposit(1000);
        acc.withdraw(250);
        acc.displayBalance();
        System.out.println("==============================================================================");
        Student stud=new Student("Ntiyiso","220714241");
        stud.introduce();
        System.out.println("Student Number: " + stud.studNumber);
        System.out.println("==============================================================================");
        Teacher teach=new Teacher("Mr Chauke","PPB115D");
        teach.introduce();
        System.out.println("Subject Code: " + teach.subject);
        System.out.println("==============================================================================");
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Cow animal3=new Cow();
        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();;

        System.out.println("==============================================================================");
        Payment payment1 = new CardPayment();
        Payment payment2 = new CashPayment();
        MobilePayment payment3=new MobilePayment();
        payment1.pay(250);
        payment2.pay(100);
        payment3.pay(200);
        System.out.println("==============================================================================");





    }
}