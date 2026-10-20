package org.example;

public class StudentM {
    private String name;
    private int age;
    private double mark;

public String getName(String name){
    this.name = name;
    return name;
}
    public double getMark(double mark){
        this.mark = mark;
        return mark;
    }
    public int getAge(int age){
        this.age = age;
        return age;
    }
    StudentM(String name, double mark, int age){
    getAge(age);
    getMark(mark);
    getName(name);

    }
    public boolean hasPassed(){
    if(mark >= 50){
       return true;
    } else {
        return false;
    }
    }

    void displayStudent(){
    System.out.println("Student Name: " + name + " Student age: " + age + " Student mark " + mark + " Passed " + hasPassed());
    }
}
