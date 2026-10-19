package org.example;

public class Teacher extends Person {
    String subject;

    Teacher( String name,String subject){
        super(name);
        this.subject = subject;
    }

    void introduce(){
        System.out.println("Introduce yourself: ");
        System.out.println("Name: " + name);
        System.out.println("Subject: " + subject);
    }

}

