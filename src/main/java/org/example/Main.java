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
        Student student = new Student("Phuti", "123", 20, 21);
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

//        LAB 6
        Payment payment1 = new CardPayment();
        Payment payment2 = new CashPayment();

        payment1.pay(250);
        payment2.pay(100);

//        LAB 7
        Student[] students = {
                new Student("Lindiwe", "S001", 19, 76),
                new Student("Kabelo", "S002", 21, 48),
                new Student("Ayesha", "S003", 20, 89),
                new Student("Thabo", "S004", 18, 63)
        };
        double total_marks = 0;
        int pass_count = 0;
        double highest_mark = students[0].getMark();
        for (Student _student : students) {
            _student.displayDetails();
            if (_student.hasPassed()) {
                System.out.println("Result: Pass");
                pass_count++;
            } else {
                System.out.println("Result: Fail");
            }
            total_marks += _student.getMark();
            if (_student.getMark() > highest_mark) {
                highest_mark = _student.getMark();
            }
        }
        double average_mark = total_marks / students.length;
        System.out.println("Average: " + average_mark);
        System.out.println("Students Passed: " + pass_count + " / " + students.length);
        System.out.println("Highest Mark: " + highest_mark);
    }
}