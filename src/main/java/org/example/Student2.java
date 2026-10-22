package org.example;
//Lab 7: Combined Project --- Student Management System
//Create a Student class with:
// - private String name
// - private int age
// - private double mark
// A constructor - Getter methods - hasPassed(), returning true when mark is at least 50
// - displayDetails(), printing details and pass/fail result

//Create at least four students, store them in an array, and use a loop to:
// 1. Display every student's details.
// 2. Print Pass or Fail using an if statement.
// 3. Calculate the average mark.
// 4. Count students who passed.
// 5. Find the highest mark.
//Suggested data:
//Name Age Mark
//Lindiwe 19 76 Kabelo 21 48 Ayesha 20 89 Thabo 18 63
//
//Extension tasks
// - Reject marks below 0 or above 100.
// - Display Distinction for marks of 80 or higher.
// - Search for a student by name.
// - Count students who received a distinction.

public class Student2 {
    private String name;
    private int age;
    private double marks;

    public Student2(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getMarks() {
        return marks;
    }

    public void displayDetails(){
        System.out.println("Name of the student : " + name +
                "\n" + "Student is: " + age + " years" +
                "\n" +"Student marks : " + marks);
    }
    public void hasPassed(){
        if (marks >= 50) {
            System.out.println("Passed!");
        }else {
            System.out.println("Failed!");
        }
    }
}
