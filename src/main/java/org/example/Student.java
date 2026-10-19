package org.example;

public class Student extends Person{

    int studentNumber;

    Student(int studentNumber, String name) {
        super(name);
        this.studentNumber = studentNumber;
    }
}
