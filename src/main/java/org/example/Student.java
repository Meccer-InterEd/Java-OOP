package org.example;

public class Student extends Person {
    String student_number;
    Student(String name, String student_number){
        super(name);
        this.student_number = student_number;
    }
}
