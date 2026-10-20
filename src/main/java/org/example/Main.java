package org.example;


import javax.imageio.ImageReader;
import java.io.CharArrayReader;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "black", 2020);
        Car car1 = new Car("Mercedes", " white", 2024);

        car.displayDetails();
        car1.displayDetails();

        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(250);
        System.out.println("Final balance:" + account.getBalance());

        account.deposit(-50);
        account.withdraw(5000);

        Student student = new Student("Karabo", "2527");
        student.introduce();
        System.out.println("Student number:" + student.studentNumber);
        Teacher teacher = new Teacher("Jacobs", "Math");
        teacher.introduce();
        System.out.println("Subject: " + teacher.subject);

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound();
        animal2.makeSound();

        Payment payment1 = new CardPayment();
        Payment payment2 = new cashPayment();

        payment1.pay(250);
        payment2.pay(100);

        Student7[] students = {new Student7("Karabo", 23, 70),
                new Student7("Thabo", 30, 89),
                new Student7("Palesa", 25, 70),
                new Student7("Bokang", 26, 30),
                new Student7("Ayal", 28, 90)
        };
        int numOfStudentsPassed = 0;
        double classAverage = 0;
        int numOfStudents = students.length;
        double aggregateMark = 0;

        for (Student7 student_ : students) {
            student_.displayDetails();
            if (student_.hasPassed()) {
                numOfStudentsPassed += 1;
            }
        }
        System.out.println(numOfStudentsPassed + " students passed");

        double highestMark = students[0].getMark();
        for (Student7 _student : students) {
            if (_student.getMark() > highestMark) {
                highestMark = _student.getMark();
            }
            aggregateMark += _student.getMark();
        }
        classAverage += (aggregateMark / numOfStudents);
        System.out.println("The highest mark is "+highestMark);
        System.out.println("Class average is "+classAverage);
    }
}

