package org.example;
/*
Create a `Student` class that extends `Person`, has a `studentNumber`
field, and uses `super(name)` in its constructor. Create a `Teacher`
class that extends `Person`, has a `subject` field, and also calls
`super(name)`.
 */
public class Teacher extends Person{
    String subject;

    Teacher(String name, String subject){
        super(name);
        this.subject = subject;
    }

    void display(){
        System.out.println("\n"+this.name+" teaches: "+subject);
    }
}
