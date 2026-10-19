package org.example;

public class Student extends Person{
    String studentNumber;

    public Student(String name, String studentNumber) {
        super(name);
        this.studentNumber = studentNumber;
    }
}
