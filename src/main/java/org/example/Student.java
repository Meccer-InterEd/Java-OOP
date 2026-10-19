package org.example;

public class Student extends Person {

    String studentNumber;

    public Student(String name,String studentNumber){
        super(name);
        this.studentNumber = studentNumber;
    }

    @Override
    public void introduce(){
        System.out.println("My name is " + name+ " with studentNumber: "+studentNumber);
    }
}
