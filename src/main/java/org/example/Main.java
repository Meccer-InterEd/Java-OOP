package org.example;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Mercedes", "Black", 2022);
        Car car2 = new Car("BMW", "blue", 2026);

        car1.displayDetails();
        car2.displayDetails();

        BankAccount account = new BankAccount();
        BankAccount account1 = new BankAccount();
        account.deposit(1000);
        account.withdraw(250);
        System.out.println("Balance is: R" + account.getBalance());

        account1.deposit(-50);
        account1.withdraw(5000);
        System.out.println("Balance is: R" + account1.getBalance());

        Student student = new Student("Siyabonga", "218253974");
        Teacher teacher = new Teacher("Rhendi", "OOP");

        student.introduce();
        System.out.println("And my student number is: " + student.studentNumber);

        teacher.introduce();
        System.out.println("And the subject I teach is: " + teacher.subject);

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
        payment3.pay(600);

        StudentLab7 student1 = new StudentLab7("Siyabonga", 26, 88.0);
        StudentLab7 student2 = new StudentLab7("Lona", 21, 61.0);
        StudentLab7 student3 = new StudentLab7("Ditebogo", 25, 34.0);
        StudentLab7 student4 = new StudentLab7("Kagiso", 24, 48.0);

        System.out.print("-----------Students Details");
        StudentLab7[] students = {student1, student2, student3, student4};
        for(StudentLab7 _students: students) {
            _students.displayDetails();
            if(_students.hasPassed()) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }
        System.out.println("----------------------------");

        double avgMark;
        double totalMarks = 0;

        for (StudentLab7 _students: students) {
            totalMarks += _students.getMark();
        }
        avgMark = totalMarks / students.length;
        System.out.println("Average mark for students is: " + avgMark);

        int numPassedStudent = 0;
        for (StudentLab7 _students : students) {
            if (_students.hasPassed()) {
                numPassedStudent++;
            }
        }
        System.out.println("The number of student that has passed is: " + numPassedStudent);

        double highestMark = students[0].getMark();
        for (StudentLab7 _students: students) {
            if(_students.getMark() > highestMark) {
                highestMark = _students.getMark();
            }
        }
        System.out.println("The highest mark is: " + highestMark);
    }
}