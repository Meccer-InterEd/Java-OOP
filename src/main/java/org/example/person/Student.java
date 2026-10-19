package org.example.person;

public class Student extends Person{
    String studentNumber;

    public Student(String name, String studentNumber) {
        super(name);
        this.studentNumber = studentNumber;
    }

    public void introduce() {
        System.out.println("My name is " + name + " student number: " + studentNumber);
    }
}
