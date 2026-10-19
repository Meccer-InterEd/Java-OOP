package org.example;
//Create a Student class that extends Person, has a studentNumber field, and uses super(name) in its constructor.

public class Student extends Person {
    String studentNumber;

    public Student(String name, String studentNumber) {
        super(name);
        this.studentNumber = studentNumber;
    }
    public void display() {
        System.out.println("Student Number: " + studentNumber);
    }
}
