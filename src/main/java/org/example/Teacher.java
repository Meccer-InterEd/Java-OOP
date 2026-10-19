package org.example;
// Create a Teacher class that extends Person, has a subject field, and also calls super(name).

public class Teacher extends Person {
    String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }
    public void display() {
        System.out.println("Teacher Subject: " + subject);
    }
}
