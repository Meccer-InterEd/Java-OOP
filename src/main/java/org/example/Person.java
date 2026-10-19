package org.example;
//Lab 4: Inheritance
//Create a parent class:

//Tasks 1. Create one Student and one Teacher.
// 2. Call introduce() on both.
// 3. Display their student number and subject.

//Questions
// What does extends do?
//Allows the other classes to access certain methods from the parent class.

// What does super(name) do?
// Super refers to the parent class, as for this we are taking the constructor name from the parent class to use it.

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("My name is " + name);
    }
    public void introduce(String name) {
        System.out.println("My name is " + name);
    }
}
