package org.example;

public class Dog1 extends Animal_ {
        String name;

    public Dog1(String name) {
        super(name);
        this.name = name;
    }

    public void speak() {
        System.out.println("Dog barks.");
    }
}