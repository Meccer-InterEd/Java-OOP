package org.example;

import static org.example.ResultStatus.getStatus;

public class Main {
    public static void main(String[] args) {

//        Car car1 = new Car();
//        Car car2 = new Car();
//
//        car1.brand = "BMW";
//        car1.colour = "Red";
//        car1.year = 2025;
//
//        car2.brand = "Toyota";
//        car2.colour = "Blue";
//        car2.year = 2023;
//
//        car1.displayDetails();
//        car2.displayDetails();
//        Car car1 = new Car("BMW", "Black", 2018);
//        Car car2 = new Car("Toyota", "White", 2022);
//
//        car1.displayDetails();
//        car2.displayDetails();
//        BankAccount account = new BankAccount();
//        account.deposit(1000);
//        account.withdraw(250);
//
//        account.deposit(-50);
//        account.withdraw(5000);
//        account.displayBalance();

//        Student student = new Student("Mancoba","101");
//        Teacher teacher = new Teacher("Ancoba","OOP");
//
//        student.introduce();
//        teacher.introduce();

//        Animal animal1 = new Dog();
//        Animal animal2 = new Cat();
//        Animal animal3 = new Cow();
//
//        animal1.makeSound();
//        animal2.makeSound();
//        animal3.makeSound();

//        Payment payment1 = new CardPayment();
//        Payment payment2 = new CashPayment();
//        Payment payment3 = new MobilePayment();
//
//        payment1.pay(250);
//        payment2.pay(100);
//        payment3.pay(500);
//        Student2[] students = {new Student2("Mancoba",23,77),new Student2("Ancoba",22,51),new Student2("Ncoba",25,90),new Student2("Babab",20,41)};
//        int passed = 0;
//        double highest = students[0].getMark();
//        double total = 0;
//        int distinction = 0;
//
//
//        for(Student2 stud : students){
//
//            stud.displayDetails();
//            System.out.println("-------------------------");
//            if(stud.hasPassed()){
//                passed++;
//            }
//            if(stud.getMark()>highest){
//                highest = stud.getMark();
//            }
//            if(stud.getMark()>=80){
//                distinction++;
//            }
//            total += stud.getMark();
//        }
//        System.out.println("Highest mark: "+highest);
//        System.out.println("Average mark: "+ total/ students.length);
//        System.out.println("Number of students passed: "+passed);
//        System.out.println("Number of students with distinction: "+distinction);
//
//
//


        int[] scores = {0,49,50,74,75,100};
        for (int score : scores){
            System.out.println("Score: "+score+" = "+getStatus(score));

        }
        System.out.println("============================");

        StudentRecord stu1 = new StudentRecord(11,"Mancoba",71);
        StudentRecord stu2 = new StudentRecord(12,"Mana",60);
        StudentRecord stu3 = new StudentRecord(13,"Macoa",55);
        StudentRecord stu4 = new StudentRecord(14,"Manc",80);
        StudentRecord stu5 = new StudentRecord(15,"Moba",99);

        StudentRecord[] students = {stu1,stu2,stu3,stu4,stu5};

        for (StudentRecord s : students){

            System.out.println("Student ID: "+s.studentId());
            System.out.println("Student name: "+s.fullName());
            System.out.println("Student score: "+s.score());
            System.out.println("----------------------------");
        }

        System.out.println("=========================================");

        ResultReporter report = new ConsoleResultReporter();

        StudentRecord stud1 = new StudentRecord(11,"Mancoba",71);
        StudentRecord stud2 = new StudentRecord(12,"Mana",60);
        StudentRecord stud3 = new StudentRecord(13,"Macoa",55);
        StudentRecord stud4 = new StudentRecord(14,"Manc",80);
        StudentRecord stud5 = new StudentRecord(15,"Moba",99);

        report.printStudentResult(stud1);
        report.printStudentResult(stud2);
        report.printStudentResult(stud3);
        report.printStudentResult(stud4);
        report.printStudentResult(stud5);

        System.out.println("=========================================");











    }
}