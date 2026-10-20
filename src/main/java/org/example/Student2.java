package org.example;

public class Student2 {
    private String name;
    private int age;
    private double mark;

    public Student2(String name,int age,double mark){
        if((mark<0)||(mark>100)){
            throw new IllegalArgumentException("Mark must be between 0 and 100");
        }
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public boolean hasPassed(){
        return mark >= 50;
    }

    public void displayDetails(){
        System.out.println("Student name: "+name);
        System.out.println("Student age: "+age);
        System.out.println("Student mark: "+mark);

        if(hasPassed()){
            System.out.println("Student pass status: Pass");
        }else {
            System.out.println("Student pass status: Fail");
        }

    }

    public double getMark() {
        return mark;
    }
}
