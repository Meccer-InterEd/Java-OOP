package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Lab 1
        Car subaru = new Car();
        subaru.brand = "Subaru";
        subaru.colour = "Blue";
        subaru.year = 2007;

        Car ford = new Car();
        ford.brand = "Ford";
        ford.colour = "White";
        ford.year = 2015;

        subaru.displayDetails();
        ford.displayDetails();

        System.out.println("\n\nLab 01 Question 01: What is a class? \n" +
                "- A class is a guideline of behaviours and characteristics that are " +
                "representative of real life objects.\n");

        System.out.println("Lab 01 Question 02: What is an object?\n" +
                "- An object is an instance of a class, it is the container which holds" +
                " the actual data values.\n");

        System.out.println("Lab 01 Question 03: Can two" +
                "objects from the same class have different values?\n" +
                "- Yes, objects of the same class can hold unique data values of their own.\n");

        subaru.startEngine();
        ford.startEngine();


        //Lab 02
        Car car1 = new Car("BMW", "Black", 2018);
        Car car2 = new Car("Toyota", "White", 2022);

        car1.displayDetails();
        car2.displayDetails();

        System.out.println("\nLab 02 Task 02: Explain when a constructor runs\n" +
                "- The constructor runs at the moment of object instantiation. Where our code " +
                " reads new Car(BMW,Black,2018) is where we effectively\n invoke the constructor.\n");

        System.out.println("Lab 02 Task 03: Explain what `this.brand` means.\n" +
                "- 'this.brand' refers to the brand instance variable of an object of the type" +
                "  matching the class\n within which the 'this.brand' statement is made.\n");

        //Lab 03
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(250);
        account.deposit(-50);
        account.withdraw(5000);
        System.out.println(account.getBalance());
        account.displayBalance();

        System.out.println("\nLab 03 Question 01: Why is `balance` private?\n" +
                "- To control and restrict data access. Nobody should be able to simply perform " +
                "'bankAccountObject.balance = 5000000000' and successfully\n  modify the balance." +
                " Making balance private helps prevent mistakes like that.\n");
        System.out.println("Lab 03 Question 02: Why should invalid amounts" +
                "be rejected?\n" +
                "- Invalid amounts breach the rules & defy the logic of the system.\n\n");


        //Lab 04
        Student student = new Student("Andy","20030314M");
        Teacher teach = new Teacher("Yanko","Python");

        student.introduce();
        teach.introduce();

        student.display();
        teach.display();

        System.out.println("\nLab 04 Question 01: What does `extends` do?\n" +
                "- extend allows a class to inherit the properties and methods of another class.");
        System.out.println("\nLab 04 Question 02: What does `super(name)` do?\n" +
                "- calls the constructor of the parent class with the value of the name parameter" +
                "passed as an argument\n\n");


        //Lab 05
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal cow = new Cow();

        animal1.makeSound();
        animal2.makeSound();
        cow.makeSound();

        System.out.println("\nLab 05 Task: Explain @Override\n" +
                "- Overwrites the original content of the annotated method with custom, class specific behaviour.");
        System.out.println("\nLab 05 Task: Explain why " +
                "one method call can produce different results.\n" +
                "- Each class of the objects which call the method has its own unique implementation" +
                " of the method logic.");
    }
}