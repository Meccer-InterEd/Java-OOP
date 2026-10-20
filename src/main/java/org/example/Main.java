package org.example;

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
        Student2[] students = {new Student2("Mancoba",23,77),new Student2("Ancoba",22,51),new Student2("Ncoba",25,90),new Student2("Babab",20,41)};
        int passed = 0;
        double highest = students[0].getMark();
        double total = 0;
        int distinction = 0;


        for(Student2 stud : students){

            stud.displayDetails();
            System.out.println("-------------------------");
            if(stud.hasPassed()){
                passed++;
            }
            if(stud.getMark()>highest){
                highest = stud.getMark();
            }
            if(stud.getMark()>=80){
                distinction++;
            }
            total += stud.getMark();
        }
        System.out.println("Highest mark: "+highest);
        System.out.println("Average mark: "+ total/ students.length);
        System.out.println("Number of students passed: "+passed);
        System.out.println("Number of students with distinction: "+distinction);








    }
}