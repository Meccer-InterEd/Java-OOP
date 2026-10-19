package org.example;

public class Student extends Person{
    String studentNumber;

    Student(String studentNumber, String name){
        super(name);
        this.studentNumber = studentNumber;
    }

    void introduce(){
        System.out.println("Introduce yourself: ");
        System.out.println("Name: " + name);
        System.out.println("Student number: " + studentNumber);
    }



}
