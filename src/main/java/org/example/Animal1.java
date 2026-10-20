package org.example;

public abstract class Animal1 {
    private String name;

    public  Animal1(String name){
       this.name =name; // included 'this.' infront of name

    }

    public Animal1() {
    }

    public String getName() {
        return name;        // add get name method because name property is private
    }
    public void speak(){
        System.out.println(name + "make a sound");
    }


    public void makeSound(){
        System.out.println(name + "Make a sound");
    }

}

