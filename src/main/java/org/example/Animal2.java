package org.example;

public class Animal2 {
    private String name;

    public Animal2(String name){
        this.name = name;// here java is getting confused, where the constructor assigns the parameter to itself
    }

    public void speak(){
        System.out.println(name + " makes a sound");
    }
}
