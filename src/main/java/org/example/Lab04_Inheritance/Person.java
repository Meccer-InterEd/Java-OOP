package org.example.Lab04_Inheritance;

public class Person {

    public String studentNumber;
    public String subject;
    String name;

    public Person(String name) {
        this.name = name;
    }


    public void introduce() {
        System.out.println("My name is " + name);
    }
}
