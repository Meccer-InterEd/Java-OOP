package org.example;
import javax.naming.Name;

public class Student extends Person{
    String studentNumber;

    Student(String name,String studentNumber){
        super(name);
        this.studentNumber = studentNumber;
    }

    void displayStudNo(){
        System.out.println("The student number is" + studentNumber);
    }
}
