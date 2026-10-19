package org.example;

public class Student extends Person{
    String studentNumber;


    Student(String studentNumber, String name){
        super(name);
        this.studentNumber = studentNumber;

    }
    void displayStudent(){
        System.out.println("Student Number : "+ studentNumber);
    }
}
