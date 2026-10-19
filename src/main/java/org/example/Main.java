package org.example;

public class Main {
    public static void main(String[] args) {
//        LAB 1 & 2
        Car car_1 = new Car("BMW", "Black", 2018);
        Car car_2 = new Car("Toyota", "White", 2022);
        car_1.displayDetails();
        car_1.startEngine();
        car_2.displayDetails();
        car_2.startEngine();

//        LAB 3
        BankAccount savings_account = new BankAccount();
        savings_account.deposit(1000);
        savings_account.withdraw(250);
        savings_account.deposit(-50);
        savings_account.withdraw(5000);
        System.out.println(savings_account.getBalance());

//        LAB 4
        Student student = new Student("Phuti", "123");
        student.introduce();
        System.out.println(student.student_number);
        Teacher teacher = new Teacher("Rendi", "JAVA");
        teacher.introduce();
        System.out.println(teacher.subject);

//        LAB 5
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound();
        animal2.makeSound();
    }
}