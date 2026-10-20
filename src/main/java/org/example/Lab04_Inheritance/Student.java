package org.example.Lab04_Inheritance;

public class Student extends Person {
    String studentNumber;

    public Student(String name,String studentNumber) {
        super(name);
//        setStudentNumber(studentNumber);
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
