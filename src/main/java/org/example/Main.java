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
                " of the method logic.\n\n");


        //Lab 06
        Payment payment1 = new CardPayment();
        Payment payment2 = new CashPayment();
        Payment mobilePayment = new MobilePayment();

        payment1.pay(250);
        payment2.pay(100);
        mobilePayment.pay(3460);

        System.out.println("\nLab 06 Question 01: What does `abstract` mean?\n" +
                "- When applied to a class, it means that an object of that class type cannot be instantiated.\n" +
                "- When applied to a method, it means that all the child classes must have their own code" +
                " implementation of that particular method.\n");
        System.out.println("Lab 06 Question 02: Can you create an object " +
                "directly from an abstract class?\n" +
                "- No.\n");
        System.out.println("Lab 06 Question 03: Why must subclasses implement " +
                "`pay()\n" +
                "- The method pay() is marked as abstract in the parent class.\n\n");

        //Lab 07
        Lab07Student[] students = {
            new Lab07Student("Lindiwe",19,76),
            new Lab07Student("Kabelo",21,48),
            new Lab07Student("Ayesha",20,89),
            new Lab07Student("Thabo",18,63)
        };

        double classAverage = 0.0;
        double aggregateSum = 0.0;
        int numberOfStudents = students.length;
        int numberOfPassedStudents = 0;
        double highestMark = 0.0;
        int numberOfDistinctions = 0;

        for(Lab07Student lab06Student : students){
            aggregateSum += lab06Student.getMark();

            lab06Student.displayDetails();
            if (lab06Student.hasPassed()){
                System.out.println(lab06Student.getName()+" passed.\n");
                numberOfPassedStudents += 1;

                if (lab06Student.getMark() >= 80){
                    numberOfDistinctions += 1;
                }
            } else {
                System.out.println(lab06Student.getName()+" failed.\n");
            }

            if (lab06Student.getMark() > highestMark){
                highestMark = lab06Student.getMark();
            }
        }

        classAverage += (aggregateSum / numberOfStudents);
        System.out.println("The class average is "+classAverage);
        System.out.println("\nA total of "+numberOfPassedStudents+" students passed.\n");
        System.out.println("The highest mark in class is "+highestMark);
        System.out.println("\nA total of "+numberOfDistinctions+" student(s) got a distinction.\n\n");


        //Lab 08
        System.out.println("Lab 08 Question 01: Why does `name = name;` not set the object's field?\n" +
                "- both the object field and constructor parameter have the same title,\n  thus it is not" +
                " known that the value of the parameter is being assigned to the object field, as " +
                "the 2 are indistinguishable.");
        System.out.println("\nLab 08 Question 02: How can `this` fix the problem?\n" +
                "- It distinguishes the object field from the constructor parameter of the same name.\n" +
                "  Making it clear that the value of the constructor parameter is being assigned to the" +
                " object field.");
        System.out.println("\nLab 08 Question 03: What should the `Dog` constructor do " +
                "to initialize the parent?\n" +
                "- Call the super() method in the first line of the constructor");
        System.out.println("\nLab 08 Question 04: Which annotation should be used for the " +
                "overridden method?\n" +
                "- @Override\n\n");


        /*
        Lab on Enums, Interfaces, and Records
         */
        System.out.println("Testing the result status boundary values:");
        System.out.println("Test value 0 produces:\t"+ResultStatus.scoreStatus(0));
        System.out.println("Test value 49 produces:\t"+ResultStatus.scoreStatus(49));
        System.out.println("Test value 50 produces:\t"+ResultStatus.scoreStatus(50));
        System.out.println("Test value 74 produces:\t"+ResultStatus.scoreStatus(74));
        System.out.println("Test value 75 produces:\t"+ResultStatus.scoreStatus(75));
        System.out.println("Test value 79 produces:\t"+ResultStatus.scoreStatus(79));
        System.out.println("Test value 80 produces:\t"+ResultStatus.scoreStatus(80));
        System.out.println("Test value 100 produces:\t"+ResultStatus.scoreStatus(100));
        System.out.println("\nIf a value of -1 or 101 is provided as an input, the " +
                "program will throw an IllegalArgumentException with a message.\n\n");


        StudentRecord[] studentRecords = {
                new StudentRecord(1, "John Doe",75),
                new StudentRecord(2, "Jane Doe",78),
                new StudentRecord(3, "Alejandro Martinez",85),
                new StudentRecord(4, "Pedro Pascal",27),
                new StudentRecord(5, "Demetrius Johnson",97),
                new StudentRecord(101, "Amina Dlamini", 82),
                new StudentRecord(102, "David Mokoena", 67),
                new StudentRecord(103, "Lerato Nkosi", 43)
        };

        int numStudents = studentRecords.length;
        ConsoleResultReporter resultReporter = new ConsoleResultReporter();

        for (int i = 0; i < numStudents; i++){
            System.out.println("Name: "+studentRecords[i].fullName()+" | " +
                    "Score: "+studentRecords[i].score()+"\n");
        }

//        for(StudentRecord student_record : studentRecords){
//            resultReporter.printStudentResult(student_record);
////            student_record.justDisplay();
//        }
        System.out.println("The difference between a record and a traditional class is that " +
                "with the former, the instance variables are constants by default.\n" +
                "Whereas with the latter, instance variables can change values unless you " +
                "explicitly mark them as constants.\n");

        System.out.println("The traditional for loop requires 3 conditions namely:\n" +
                "- The starting index.\n" +
                "- The ending index / loop termination condition.\n" +
                "- An increment / decrement value\n" +
                "On the other hand, advanced for loops requires only 2 components:\n" +
                "- The data type and name of a placeholder variable which will temporarily store " +
                "the relevant data values.\n" +
                "- The name of the data collection you are looping through.\n");

        System.out.println("Proof that indexes start at 0:::\n");
        for (int i = 0; i < numStudents; i++){
            System.out.println(
                    "index "+i+" -> "+studentRecords[i].fullName()
            );
        }

        try{
            int numPassed = 0;
            int numSupplementary = 0;
            int numFailed = 0;
            double avgClassMark = 0;
            int aggregateTotal = 0;
            int numDistinctions = 0;
            StudentRecord highestScorer = studentRecords[0];
            StudentRecord lowestScorer = studentRecords[0];

            for(StudentRecord _student : studentRecords){
                if (resultReporter.determineStatus(_student.score()) == ResultStatus.PASS){
                    numPassed += 1;
                } else if (resultReporter.determineStatus(_student.score()) == ResultStatus.FAIL){
                    numFailed += 1;
                } else if (resultReporter.determineStatus(_student.score()) == ResultStatus.DISTINCTION){
                  numDistinctions += 1;
                } else {
                    numSupplementary += 1;
                }

                aggregateTotal += _student.score();

                if (_student.score() > highestScorer.score()){
                    highestScorer = _student;
                }

                if (_student.score() < lowestScorer.score()){
                    lowestScorer = _student;
                }
            }

            avgClassMark += ((double)aggregateTotal / numStudents);

            System.out.println("\n\nSTUDENT RESULTS");
            System.out.println("---------------");
            for(StudentRecord student_record : studentRecords){
                resultReporter.printStudentResult(student_record);
//            student_record.justDisplay();
            }


            System.out.println("\nSummary");
            System.out.println("-------");
            System.out.println("Total students: "+numStudents);
            System.out.println("Distinctions: "+numDistinctions);
            System.out.println("Passes: "+numPassed);
            System.out.println("Supplementary: "+numSupplementary);
            System.out.println("Failures: "+numFailed);
            System.out.println("Average score: "+avgClassMark);
            System.out.println("Highest score: "+highestScorer.score()+" " +
                    highestScorer.fullName()+".\n" +
                    "Lowest score: "+lowestScorer.score()+" "+
                    lowestScorer.fullName()+".\n");
        } catch (Exception e) {
            throw new RuntimeException("Could not manage to generate a summary report because the array is empty!!!!!");
        }


    }
}