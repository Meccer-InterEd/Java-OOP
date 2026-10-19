package org.example;

public class Student extends Person {
    int studentNumber;

    public Student(String name, int studentNumber) {
        super(name);
        this.studentNumber = studentNumber;
    }
}
