package org.example.lab8;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;        //use this to distinguish instance variables from parameter variables when they have the same name
    }

    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}
