package org.example;
//Lab4
public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("My name is " + name);
    }
}
