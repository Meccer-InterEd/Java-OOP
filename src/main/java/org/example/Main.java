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
                "- Invalid amounts breach the rules & defy the logic of the system.");
    }
}