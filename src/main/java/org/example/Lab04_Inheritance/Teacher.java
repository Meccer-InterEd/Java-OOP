package org.example.Lab04_Inheritance;

public class Teacher extends Person {
    String subject;
    public Teacher(String name, String subject) {
        super(name);
        setSubject(subject);
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
