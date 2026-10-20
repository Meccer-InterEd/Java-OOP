package org.example;

public abstract class Animal {

    private String name;

    public Animal(String name){
        this.name = name;
    }

    public void speak(){

        System.out.println(name + "makes a sound.");
    }
}

class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void speak(){
        System.out.println("Dog barks.");
    }
}

