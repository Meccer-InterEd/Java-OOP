package org.example.Lab08_Debugging;

public class Animals {

    private String name;

    public Animals(String name) {
        this.name = name; //Stores the parameter's value in the object's field.
    }

    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animals {

    public Dog(String name) {
        super(name);//Passes the name to the parent constructor.
    }

    @Override //Helps verify that a method correctly overrides a parent method.
    public void speak() {
        System.out.println("Dog barks.");
    }
}
