/*
Create a Student class that extends Person, has a studentNumber field, and uses super(name) in its constructor.
Tasks 1. Create one Student and one Teacher. 2. Call introduce() on both. 3. Display their student number and subject.

 */

package org.example;

public class Student extends Person{
String studNumber;
public Student(String studNumber,String name){
    super(name);
    this.studNumber = studNumber;

}
}

