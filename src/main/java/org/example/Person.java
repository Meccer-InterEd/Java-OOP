package org.example;

public class Person {
    String name;

    public  Person (String name){
        this.name = name;
    }

    public Person() {
    }

    public void  introduce(){
        System.out.println("My name is: " + name);
    }
}
