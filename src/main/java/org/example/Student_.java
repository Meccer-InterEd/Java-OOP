package org.example;

public class Student_ {
    private String name;
    private int age;
    private double mark;

    public Student_(String name, int age, double mark) {
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

    public  boolean hasPassed(){
        return mark >= 50;
    }

    public void displayDetails(){
        System.out.println(" ");
        System.out.println("Student name: " + getName());
        System.out.println("Student age: " + getAge());
        System.out.println("Student mark: " + getMark());
        if(hasPassed()){
            System.out.println("Result: Pass");
        }
        else{
            System.out.println("Result: Fail");
        }
    }
}
