package org.example;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", "Black", 2018);

        car1.displayDetails();
        car1.startEngine();

        Car car2 = new Car("Toyota", "White", 2022);

        car2.displayDetails();
        car2.startEngine();

        Car car3 = new Car("Volkswagen", "Silver");
        car3.displayDetails();

        /*
        Lab 1 Questions:

        1. What is a class?
           A class is the blueprint of an object. It can define what kind data it can hold and also what
           actions it will be able to perform

        2. What is an object?
           An object is an instance of a class

        3. Can two objects from the same class have different values?
           Yes they can have different values
         */

        /*
        Lab 2 Questions:

        1. Explain when a constructor runs
           A constructor runs when instantiating an instance of a class (when declaring a new object)

        2. Explain what this.brand means
           this.brand is used to refer to the field within the class named brand. It helps us avoid
           confusion especially within our constructors. It helps us differentiate between us talking
           about the field of the class and us talking about the parameter that the constructor accepts
           when both have the same name
         */

        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(1000);
        bankAccount.withdraw(250);

        bankAccount.deposit(-50);
        bankAccount.withdraw(5000);

        bankAccount.displayBalance();

        /*
        Lab 3 Questions:

        1. Why is balance private
           Making the balance private helps us to protect the users balance. Code outside of the BankAccount class
           cannot directly access the balance attribute of the class, only methods inside of the class can manipulate
           and change the value of the balance

        2. Why should invalid amounts be rejected?
           Invalid amounts have to be rejected in order to preserve the integrity of the balance. If incorrect/invalid
           amounts are accepted the users balance could be altered incorrectly, like depositing -5 for example would
           actually reduce the account balance by 5 instead of increasing it and withdrawing an amount greater than the
           balance would allow the user to withdraw more money than they actually have
         */

        Student student = new Student(1235, "Tashleigh");
        Teacher teacher = new Teacher("English", "Elaine");

        student.introduce();
        System.out.println("My student number is " + student.studentNumber);
        teacher.introduce();
        System.out.println("I teach " + teacher.subject);

        /*
        Lab 4 Questions:

        1. What does extends do?
           Extends allows child classes to inherit properties and methods from its parent class

        2. What does super(name) do?
           super(name) passes the name argument from the child class's constructor to the matching constructor in the
           parent class, which will allow the parent constructor to initialise the inherited fields
         */

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        dog.makeSound();
        cat.makeSound();
        cow.makeSound();

        /*
        Lab 5 Questions:

        1. Explain @Override
           The @Override allows a method in a subclass to provide a specific implementation
           of a method that is already defined in its parent class. This is called method overriding

        2. Explain why one method call can produce different results
           This is because of polymorphism. One method can produce different results through method
           overriding which will allow that method to behave differently according to the specific
           behaviour given to it within the specific class in which it lives
         */

        Payment payment1 = new CardPayment();
        Payment payment2 = new CashPayment();
        Payment payment3 = new MobilePayment();

        payment1.pay(535.77);
        payment2.pay(150.50);
        payment3.pay(1234);

        /*
        Lab 6 Questions:

        1. What does abstract mean?
           Abstract is a non-access modifier used on classes and methods. When used on a class it
           restricts that class from being able to create objects. Abstract can only be used on methods
           which reside in abstract classes and the method will not have a body. The body is provided by
           the subclass.

        2. Can you create an object directly from an abstract class?
           No you cannot

        3. Why must subclasses implement pay()
           The subclasses must implement the pay() method because it is defined as an abstract method
           in the parent class. Abstract methods have no body, so each subclass has to provide its own
           implementation of the method
         */

        Student_ student1 = new Student_("Makwa", 23, 89);
        Student_ student2 = new Student_("Lona", 21, 85);
        Student_ student3 = new Student_("Siya", 24, 63);
        Student_ student4 = new Student_("Rendi", 33, 49);

        Student_ [] students = {student1, student2, student3, student4};

        int countPassed = 0;
        int countDistinction = 0;
        double total = 0;
        double highest = students[0].getMark();

        for (int i = 0; i < students.length; i++) {
            students[i].displayDetails();

            total = total + students[i].getMark();

            if (students[i].getMark() > highest) {
                highest = students[i].getMark();
            }

            if (students[i].hasPassed()) {
                countPassed++;
            }

            if (students[i].getMark() >= 80) {
                countDistinction++;
            }
        }

        System.out.println("Total passed: " + countPassed);
        System.out.println("Distinctions achieved: " + countDistinction);
        System.out.println("Highest mark: " + highest);
        System.out.println("Average mark: " + total/students.length + "\n");

        student1.searchByName("Makwa", students);

        /*
        class Animal {
            private String name;

            public Animal(String name) {
                name = name;
            }

            public void speak() {
                System.out.println(name + " makes a sound.");
            }
        }

        class Dog extends Animal {
            public Dog(String name) {
                name = name;
            }

            public void speak() {
                System.out.println("Dog barks.");
            }
        }

        Corrections to above code:

        class Animal {
            private String name;

            public Animal(String name) {
                this.name = name;
            }

            public void speak() {
                System.out.println(name + " makes a sound.");
            }
        }

        class Dog extends Animal {
            public Dog(String name) {
                super(name);
            }

            @Override
            public void speak() {
                System.out.println("Dog barks.");
            }
        }

        Changed name=name to this.name = name. This works because it assigns the constructors argument
        called name to the classes attribute called name instead of assigning the constructors argument
        to the constructors argument

        Changed the dogs constructor to use super(name) instead of name = name. This calls the constructor
        in the Animal class and passes the dogs name to it. The dogs name will be set through the Animal
        constructor

        I used @Override on the speak method in the dog class. This allows method in the dog class to
        implement its own and more specific version of the inherited method from the Animal class

         */

        //New labs on Interfaces, Enums and Records combined with some previously learned concepts

        System.out.println(ResultStatus.scoreStatus(85));

        /*
        Part 1 Questions:

        1. Explain what should happen if the score is -1 or 101
           The program should inform the user that the mark they entered to determine a score status
           is invalid and should only be between 0 and 100 (inclusive)

        2. An enum limits a variable to a known set of values. Why is that safer than storing status
           as any text string?

           It is safer because it restricts a variable to a predefined list of valid constants. This
           helps us to prevent invalid values. The problem is that Strings can hold any text including
           values which are not considered valid statuses
         */

        StudentRecord studentRecord1 = new StudentRecord(1, "Hishaam", 85);
        StudentRecord studentRecord2 = new StudentRecord(2, "Makwa", 85);
        StudentRecord studentRecord3 = new StudentRecord(3, "Lona", 78);
        StudentRecord studentRecord4 = new StudentRecord(4, "Ditebogo", 90);
        StudentRecord studentRecord5 = new StudentRecord(5, "Andile", 89);

        System.out.println("Student 1 name: " + studentRecord1.fullName());
        System.out.println("Student 2 mark: " + studentRecord2.score());
        System.out.println("Student 3 ID: " + studentRecord3.studentId());
        System.out.println("Student 4 mark: " + studentRecord4.score());
        System.out.println("Student 5 name: " + studentRecord5.fullName());

        /*
        Part 2 Questions:

        1. Explain one difference between a record and a traditional class with fields and getter
           methods.

           One difference is that Records automatically provide getter methods and a constructor while
           with a traditional class you would have to write it yourself
           
         */
    }
}