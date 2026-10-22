package org.example;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Car car1 = new Car("BMW", "Black", 2018);
        car1.displayDetails();
        Car car2 = new Car("Toyota", "White", 2022);
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
        Teacher m = new Teacher("Java", "Mudau");
        m.introduce();
        Student s = new Student("2246667889", "Motsei");
        s.introduce();
        System.out.println("Student Number:" + s.studNumber + " Learning:" + m.subject);
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


        Student2 st1 = new Student2("Lindiwe", 19, 76);
        Student2 st2 = new Student2("Kabelo", 21, 48);
        Student2 st3 = new Student2("Ayesha", 20, 89);
        Student2 st4 = new Student2("Thabo", 18, 63);
        double sum = 0.0;
        double avg = 0.0;
        int count = 0;
        int distinct = 0;
        double high = 0.0;
        String studName = "kabelo";
        boolean found = false;
        Student2[] student2s = {st1, st2, st3, st4};
        for (Student2 dd : student2s) {
            dd.displayDetails();
            if (dd.getMark() > high) {
                high = dd.getMark();
            }

            if (dd.hasPassed() == true) {
                System.out.println(dd.getName() + " You Passed");
                count++;
            } else {
                System.out.println(dd.getName() + " Has Failed");
            }

            if (dd.getMark() >= 80) {
                System.out.println(dd.getName() + " has received a distinction");
                distinct++;
            }
            if (dd.getName().equalsIgnoreCase(studName)) {
                found = true;
            }


            sum += dd.getMark();

        }
        avg = sum / student2s.length;
        System.out.println(" Summed up marks are: " + sum + " and the average of these marks is:" + avg);
        System.out.println("Number of students that have passed are: " + count);
        System.out.println("Number of students that have received a distinction are: " + distinct);
        System.out.println("Highest mark is: " + high);
        if (found) {
            System.out.println(studName + " Student has been found");
        } else {
            System.out.println(studName + " Student has not been found");
        }
        System.out.println("=======================================================");

        ResultsStatus status = ResultsStatus.FAIL;
        int mark = 101;

        if (mark >= 0 && mark <= 100) {
            if (mark >= 75) {
                status = ResultsStatus.PASS;
            } else if (mark >= 50 && mark <= 74) {
                status = ResultsStatus.SUPPLEMENTARY;
            } else {
                status = ResultsStatus.FAIL;
            }
            System.out.println(status);
        } else {
            System.out.println("Inavlid Score entered");
        }

        System.out.println("=======================================================");


        StudentRecord s1 = new StudentRecord(1, "Mo", 101);
        StudentRecord s2 = new StudentRecord(2, "Solly", 90);
        StudentRecord s3 = new StudentRecord(3, "", 80);
        StudentRecord s4 = new StudentRecord(-4, "Sunday", 40);
        StudentRecord s5 = new StudentRecord(5, "Thabang", 60);



        System.out.println("Names: \n" + s1.fullName()+"  " + "\n" +s2.fullName()+ "\n" +s3.fullName()+ "\n" +s4.fullName()+ "\n" +s5.fullName() + "\n" );
        System.out.println("Scores: \n" + s1.score()+"  " + "\n" +s2.score()+ "\n" +s3.score()+ "\n" +s4.score()+ "\n" +s5.score() );

        System.out.println("=======================================================");

        ConsoleResultReporter m1 = new ConsoleResultReporter();

        m1.printStudentResult(s1);
        m1.printStudentResult(s2);
        m1.printStudentResult(s3);
        m1.printStudentResult(s4);
        m1.printStudentResult(s5);



    }

    }





