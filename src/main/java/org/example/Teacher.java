/*
Create a Teacher class that extends Person, has a subject field, and also calls super(name).
Tasks 1. Create one Student and one Teacher. 2. Call introduce() on both. 3. Display their student number and subject.

 */
package org.example;
public class Teacher extends Person{
    String subject;

    public Teacher(String subject, String name){
        super(name);
        this.subject = subject;
    }
}
