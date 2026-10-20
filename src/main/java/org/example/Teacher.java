package org.example;

public class Teacher extends Person{
    String subject;

    Teacher(String subject, String name) {
        super(name);
        this.subject = subject;
    }
}
