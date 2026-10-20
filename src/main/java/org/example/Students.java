package org.example;

public class Students {
    private String name;
    private int age;
    private double mark;
    int average;

    Students(String name, int age, double mark){
        this.name = name;
        this.age = age;
        this.mark = mark;
    }


    public String getName(){
        return name;
    }


    public int getAge(){
        return this.age;
    }

    public double getMark(){
        return this.mark;
    }

    public boolean hasPassed(){
        return this.mark >= 50 && this.mark <=100;
    }

    public void passOrFail(){
        if (hasPassed()){
            System.out.println("You passed");
        } else {
            System.out.println("You failed");
        }
    }

    public void displayDetails(){
        System.out.println("Student name:" + " " + getName());
        System.out.println("Student age:" + " " + getAge());
    }

    public void rejectOrDistinction(){
        if(mark < 0 || mark > 100){
            System.out.println("You are rejected");
        } else if (mark >= 80){
            System.out.println("Distinction");

        }
    }


}
