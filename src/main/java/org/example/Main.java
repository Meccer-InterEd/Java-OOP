package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW","Black",2025);

        car.displayDetails();

        Car car1 = new Car("Polo GTI","Red",2024);

        car1.displayDetails();

        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(250);
        account.deposit(-50);
        account.withdraw(5000);
       System.out.println( account.getBalance());


       Student student = new Student("Lona","160628605");
       student.introduce();
       System.out.println(student.name + " " + student.studentNumber);


       Teacher teacher = new Teacher("Rhendi","Introduction to Programming");
       teacher.introduce();
       System.out.println(teacher.name + " " + teacher.subject);

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Cow();

        animal1.makeSound();
        animal2.makeSound();
        animal3.makeSound();

        Payment payment1 = new CardPayment();
        Payment payment2 = new CashPayment();

        payment1.pay(250);
        payment2.pay(100);

        Student_ student1 = new Student_("Lona",21,75);
        Student_ student2 = new Student_("Siyabonga",26,5);
        Student_ student3 = new Student_("Ditbogo",25,50);
        Student_ student4 = new Student_("Me",20,90);

        Student_ [] students = {student1,student2,student3,student4};

        double avg=0;
        int sum =0;
        int passedCount =0;
        int  distinctionCount =0;
        Student_ highestMark = students[0];
        String searchedStudent ="Lona" ;
        boolean studentFound = false;
        for(int i =0; i < students.length; i++){


              sum += students[i].getMark();

            if(students[i].hasPassed()){
                passedCount ++;
            }

            if (students[i].getMark() > highestMark.getMark()) {
                highestMark = students[i];
            }

            if(students[i].getMark() < 0 && students[i].getMark() > 100){
                System.out.println("Mark must be below 100 and above 0!!");
            }

            if(students[i].getMark() >= 80){
                System.out.println("Distinction ");
                distinctionCount++;

            }

            students[i].displayDetails();
            if(students[i].getName().equals(searchedStudent)){
                System.out.println("The student exits ");

            }

        }
        if(!studentFound){

            System.out.println("The student doesn't exist");

        }





        avg = sum / students.length;


        System.out.println("The average mark: " + avg);
        System.out.println("The number of student who passed :" + passedCount);
        System.out.println("Highest average: " + highestMark.getName());
        System.out.println("The number of student who passed with distinction :" + distinctionCount);





    }
}