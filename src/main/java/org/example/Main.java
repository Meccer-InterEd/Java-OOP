package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("BMW", "Black", 2018);
        c1.displayDetails();
        c1.startEngine();
        Car c2 = new Car("Toyota", "White", 2022);
        c2.displayDetails();
        c2.startEngine();

        BankAccount ba = new BankAccount();
        ba.deposit(-50);
        ba.withdraw(500);
        ba.displayBalance();

        Student s = new Student("Tshepo","123456789");
        s.introduce();
        s.display();
        Teacher t = new Teacher("Mudau","Java");
        t.introduce();
        t.display();

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Cow();

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();

        Payment payment1 = new CardPayment();
        Payment payment2 = new CashPayment();
        Payment payment3 = new MobilePayment();
        payment1.pay(250);
        payment2.pay(100);
        payment3.pay(200);

        Animal2 anim = new Dog2("Bob");
        anim.speak();
    }
}