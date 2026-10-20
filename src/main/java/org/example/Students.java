package org.example;

public class Students {
    private String name;
    private int age;
    private double mark;

    // Constructor
    public Students(String name, int age, double mark) {

        this.name = name;
        this.age = age;
        setMark(mark);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark >= 0 && mark <= 100) {
            this.mark = mark;
        } else {
            System.out.println("Invalid mark: " + mark);
        }
    }

    public boolean hasPassed() {
        return mark >= 50;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mark: " + mark);

    }
     // calculating who passed there exam
    public void calculation() {
        if (mark >= 80) {
            System.out.println("Result: Distinction");
        } else if (hasPassed()) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}
