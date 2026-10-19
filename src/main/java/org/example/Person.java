package org.example;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("My name is " + name);
    }

//    Extends is used to inherit a class
//    super(variable_name) passes the variables to/of the parent class
}