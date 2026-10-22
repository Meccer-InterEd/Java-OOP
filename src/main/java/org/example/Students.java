package org.example;
//Lab7
public class Students {

    private String name;
    private int age;
    private double mark;

    // Constructor
    public Students(String name, int age, double mark) {
        this.name = name;
        this.age = age;

        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException(
                    "Mark must be between 0 and 100"
            );
        }

        this.mark = mark;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }

    // Check if student passed
    public boolean hasPassed() {
        return mark >= 50;
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mark: " + mark);

        if (mark >= 80) {
            System.out.println("Result: Distinction");
        } else if (hasPassed()) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        System.out.println("----------------------");
    }

    // Process all students
    public void processStudents() {

        Students[] students = {
                new Students("Lindiwe", 19, 76),
                new Students("Kabelo", 21, 48),
                new Students("Ayesha", 20, 89),
                new Students("Thabo", 18, 63)
        };

        double total = 0;
        double highest = students[0].getMark();

        int passed = 0;
        int distinctions = 0;

        for (int i = 0; i < students.length; i++) {

            students[i].displayDetails();

            total += students[i].getMark();

            if (students[i].hasPassed()) {
                passed++;
            }

            if (students[i].getMark() >= 80) {
                distinctions++;
            }

            if (students[i].getMark() > highest) {
                highest = students[i].getMark();
            }
        }

        double average = total / students.length;

        System.out.println("Average mark: " + average);
        System.out.println("Students passed: " + passed);
        System.out.println("Students failed: "
                + (students.length - passed));
        System.out.println("Highest mark: " + highest);
        System.out.println("Distinctions: " + distinctions);

        // Search student by name
        String searchName = "Ayesha";
        boolean found = false;

        for (int i = 0; i < students.length; i++) {

            if (students[i].getName()
                    .equalsIgnoreCase(searchName)) {

                System.out.println("Student found: "
                        + students[i].getName());
                System.out.println("Mark: "
                        + students[i].getMark());

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }
}



