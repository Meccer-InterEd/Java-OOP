package org.example;

public class Student_ {
    private String name;
    private int age;
    private double mark;

    Student_(String name, int age, double Mark){
        this.name = name;
        this.age = age;
        this.mark = Mark;
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

    public boolean hasPassed() {

        if (this.mark >= 50) {
            return true;
        } else {
            return false;
        }
    }
    void displayDetails(){

        System.out.println("Student name :" + getName() + " Age :" + getAge() + " Mark :" + getMark());  ;
    }


}
