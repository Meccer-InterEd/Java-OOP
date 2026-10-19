package org.example;

public class Person {
    String name;

    Person(String name){
        this.name = name;
    }

    void introduce(){
        System.out.println("Introduce yourself: ");
        System.out.println("Name: " + name);
    }
}
