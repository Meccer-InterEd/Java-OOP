package org.example;
/*
Create a `Student` class that extends `Person`, has a `studentNumber`
field, and uses `super(name)` in its constructor. Create a `Teacher`
class that extends `Person`, has a `subject` field, and also calls
`super(name)`.
 */
public class Student extends Person{
    String studentNumber;

    Student(String name, String studentNumber){
        super(name);
        this.studentNumber = studentNumber;
    }

    void display(){
        System.out.println("\n"+this.name+"'s Student number is: "+studentNumber);
    }

}
