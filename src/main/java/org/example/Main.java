package org.example;


import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Car car= new Car();
        car.displayDetails1();
        car.displayDetails2();


        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        bankAccount.withdraw(250);
        bankAccount.deposit(-50);
        bankAccount.withdraw(5000);
        bankAccount.displayBalance();


        Teacher teacher = new Teacher("Life Orientation", "Kagiso");
        teacher.displayTeacher();
        teacher.introduce();

        Student student = new Student("218044682", "Shaun");
        student.displayStudent();
        student.introduce();


        Animal animal1 = new Dog();
        animal1.makeSound();

        Animal animal2 = new Cat();
        animal2.makeSound();

        Animal animal3 = new Cow();
        animal3.makeSound();


        Payment cardpayment = new CardPayment();
        cardpayment.pay(250);

        Payment cashpayment = new CashPayment();
        cashpayment.pay(100);

        Payment mobilepayment = new MobilePayment();
        mobilepayment.pay(500);

        StudentM [] studentM = new StudentM[]{
           new  StudentM("Lindiwe", 76, 19),
                new  StudentM("Kabelo", 48, 21),
                new  StudentM("Ayesha", 89, 20),
                new  StudentM("Thabo", 63, 18)

        };


        for (int i = 0; i < studentM.length; i++){
            studentM[i].displayStudent();
        }

        double highest = studentM[0].getMark();

        for (int i = 0; i < studentM.length; i++) {
            if (studentM[i].getMark() > highest) {
                highest = studentM[i].getMark();
            }
        }

        System.out.println("Highest mark: " + highest);

        int passCount = 0;
        int pdCount = 0;
        for (int i = 0; i < studentM.length; i++) {
            if (studentM[i].getMark() >= 50){
                passCount++;
            }
        }
        for (int i = 0; i < studentM.length; i++) {
            if (studentM[i].getMark() >= 80) {
                pdCount++;
            }
        }
            System.out.println("There are " + passCount + " students that have passed");
        System.out.println("There are/is " + pdCount + " student/s that have passed with a distinction");


        double average = 0;

        for (int i = 0; i < studentM.length; i++) {
            average += studentM[i].getMark();
        }
        average = average / studentM.length;
        System.out.println(" The average is: " +average);

        String searcher = "ayesha";
        for (int i = 0; i < studentM.length; i++) {
            if (studentM[i].getName().equalsIgnoreCase(searcher)){
                System.out.println("Student found at index " + i );
            }
        }

        System.out.println("===============================================================");

        ConsoleResultReporter reporter = new ConsoleResultReporter();

        StudentRecord[] students = {
                new StudentRecord(101, "Amina Dlamini", 82),
                new StudentRecord(102, "David Mokoena", 78),
                new StudentRecord(103, "Lerato Nkosi", 43),
                new StudentRecord(104, "Neo Kunene", 37),
                new StudentRecord(105, "Thabiso Ditshego", 56),
                new StudentRecord(106, "Nhlanhla Dlamini", 70),
                new StudentRecord(107, "Mbali Zwane", 75),
                new StudentRecord(108, "Precious Ntuli", 100)
        };
        System.out.println("Student Results");
        System.out.println("--------------------");

        for (int i = 0; i < students.length; i++) {
            reporter.printStudentResult(students[i]);
        }

        int passCounter = 0;
        int suppCounter = 0;
        int failCounter = 0;
        int distCounter = 0;

        for (int i = 0; i < students.length; i++) {
            int score = students[i].score();
            ResultsStatus status = reporter.determineStatus(score);

            if ( status == ResultsStatus.FAIL) {
                failCounter++;
            } else if( status == ResultsStatus.PASS) {
                passCounter++;
            } else if( status == ResultsStatus.SUPPLEMENTARY) {
                suppCounter++;
            }else if(status == ResultsStatus.DISTINCTION){
                distCounter++;
            }
        }
        double totalScore = 0;
        double avg = 0;


        for (int i = 0; i < students.length; i++){
            int score = students[i].score();
            totalScore = totalScore + score;
        }
        avg = totalScore / students.length;


        double high = 0;
        String sname = "";
        for (int i = 0; i < students.length; i++){
            int score = students[i].score();
            if (score > high){
                high = score;
                sname = students[i].fullName();
            }
        }

        double low = 100;
        String stname = "";
        for (int i = 0; i < students.length; i++){
            int score = students[i].score();
            if (score < low){
                low = score;
                stname = students[i].fullName();
            }
        }




        System.out.println("--------------------");
        System.out.println("Total  students: " + students.length);
        System.out.println("Failures: " + failCounter);
        System.out.println("Passes : " + passCounter);
        System.out.println("Supplementary: " + suppCounter);
        System.out.println("Distinctions: " + distCounter);
        System.out.println("Average score " + avg);
        System.out.println("Highest score: " + high + " Student name: " + sname);
        System.out.println("Lowest score: " + low + " Student name: " + stname);



    }

    }
