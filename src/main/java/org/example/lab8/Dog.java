package org.example.lab8;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);    //call super() to call the constructor of a parent class
    }

    @Override
    public void speak() {
        System.out.println("Dog barks.");
    }
}
