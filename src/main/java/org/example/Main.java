package org.example;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Jeep","White",2020);
        Car car1 = new Car("Mazda","Red",2023);
        Car car2 = new Car("Toyota","Olive Green");

//        car.brand = "Audi";
//        car.colour = "Blue";
//        car.year = 2024;
//
//        car1.brand = "BMW";
//        car1.colour ="Black";
//        car1.year = 2025;

        car.displayDetails();
        car1.displayDetails();
        car2.displayDetails();
        car.startEngine();

        System.out.println();

        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(1000);
        bankAccount.withdraw(250);
        bankAccount.deposit(-50);
        bankAccount.withdraw(5000);
        bankAccount.displayBalance();

        System.out.println();

        Person person = new Person("Ditebogo");
        Student student = new Student("Lehutso","221393439");
        Teacher teacher = new Teacher("Rowen","Physics");

        student.introduce();
        teacher.introduce();
        System.out.println(student.name + " " + student.studentNumber );
        System.out.println(teacher.name + " " + teacher.subject );
        System.out.println();

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Cow();

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();
        System.out.println();

        Payment payment = new CardPayment();
        Payment payment1 = new CashPayment();
        Payment payment2 = new MobilePayment();

        payment.pay(3000);
        payment1.pay(5000);
        payment2.pay(1500);
        System.out.println();

        Student_ student1 = new Student_("Uncle Waffles",26,80);
        Student_ student2 = new Student_("Tyla",24,70);
        Student_ student3 = new Student_("Zee Nxumalo",25,98);
        Student_ student4 = new Student_("Jelly Babie",24,40);

        Student_[] students = {student1,student2,student3,student4};

        double average ;
        double sum = 0;
        double highMark = 0;
        String highStudent = "";

        for(int i = 0; i < students.length; i++){
            students[i].displayDetails();

            if(students[i].getMark() < 0 && students[i].getMark() > 100)
            {
                System.out.println("You have entered an invalid mark.");
            }

            if (students[i].hasPassed() && students[i].getMark() >= 80 ){
                System.out.println("Student has passed and obtained distinction.");
            }
            else if(students[i].hasPassed()){
                System.out.println("Student has passed.");
            }
            else {
                System.out.println("Student has failed.");
            }

            sum += students[i].getMark();

            if(highMark <= students[i].getMark())
            {
                highMark = students[i].getMark();
                highStudent = students[i].getName();
            }


        }

        average = sum / students.length;

        System.out.println("The average between the students is: "+ average);
        System.out.println("The student with the highest mark is: "+ highStudent +" with "+ highMark);
        System.out.println();

        Animal_ animal5 = new Dog1("Billy Blanco");
        animal5.speak();


    }
}