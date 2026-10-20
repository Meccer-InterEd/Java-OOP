package org.example;

public class Student2 {
    private String name;
    private int age;
    private double mark;

    Student2(String name, int age, double mark){
        this.age = age;
        this.name = name;
        this.mark = mark;

        if(mark < 0 || mark >100){
            System.out.println("Invalid mark, it must be between 0 and 100. Received:" + mark);
        }
    }

    public double getMark() {
        return mark;
    }

    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public Boolean hasPassed(){
        boolean passed = false;
        if(this.mark >=50){
            passed = true;
        }
        else{
            passed = false;
        }
        return passed;
    }

    public void displayDetails(){
        System.out.println("Student name:" + getName() + " has an age of " + getAge() + " and has a mark of:" + getMark() + " has passed?" + hasPassed());
    }
}
