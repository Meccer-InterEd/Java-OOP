package org.example.person;

public class Teacher extends Person{
    String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public void introduce() {
        System.out.println("My name is " + name + ". I teach " + subject);
    }
}
