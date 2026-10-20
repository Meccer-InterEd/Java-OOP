package org.example;

public class Student_ {

    private String name;
    private int age;
    private double mark;

    Student_(String name, int age, double mark) {

        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Marks entered must be between 0 and 100");
        }

        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getMark() {
        return this.mark;
    }

    public boolean hasPassed() {

        if (this.mark >= 50) {
            return true;
        }

        return false;
    }

    public String isDistinction() {

        if (this.mark >= 80) {
            return "(Distinction)";
        }

        return "";
    }

    public void searchByName(String name, Student_ [] students) {

        boolean found = false;

        for (int i = 0; i < students.length; i++) {

            if (students[i].getName().equals(name)) {
                students[i].displayDetails();
                found = true;
            }
        }

        if (!found) {
            System.out.println("The name you are searching for does not exist");
        }
    }

    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge() + " years old");
        System.out.println("Mark: " + getMark() + " " + isDistinction());
        System.out.println("Passed: " + hasPassed() + "\n");
    }
}
