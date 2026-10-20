package org.example;

public class StudentLab7 {
    private String name;
    private int age;
    private double mark;

    public StudentLab7(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
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

    boolean hasPassed() {
        return mark >= 50;
    }

    void displayDetails() {
        System.out.println("----------------------------");
        System.out.println("Student name: " + getName());
        System.out.println("Student Age: " + getAge());
        System.out.println("Student Mark: " + getMark());
        System.out.print("Student Results: ");
    }
}
