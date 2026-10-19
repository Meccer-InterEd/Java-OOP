package org.example;

public class Student extends Person {
    String student_number;
    private int age;
    private double mark;
    Student(String name, String student_number, int age, double mark){
        super(name);
        this.student_number = student_number;
        this.age = age;
        this.mark = mark;

        if (mark >= 0 && mark <= 100) {
            this.mark = mark;
        } else {
            System.out.println("Invalid mark (" + mark + ") for " + name);
            this.mark = 0.0;
        }
    }
    String getName(){
        return this.name;
    }
    String getStudentNumber(){
        return this.student_number;
    }
    int getAge(){
        return this.age;
    }
    double getMark(){
        return this.mark;
    }
    boolean hasPassed(){
        return this.mark >= 50;
    }
    boolean hasDistinction() {
        return this.mark >= 80;
    }
    public static int count_distinctions(Student[] students) {
        int count = 0;
        for (Student s : students) {
            if (s.hasDistinction()) {
                count++;
            }
        }
        return count;
    }
    public static void search_student_by_name(Student[] students, String name) {
        boolean found = false;
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("We found: ");
                student.displayDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student '" + name + "' was not found.");
        }
    }
    void displayDetails(){
        System.out.println("Name: " + getName());
        System.out.println("Student Number: " + getStudentNumber());
        System.out.println("Age: " + getAge());
        System.out.println("Mark: " + getMark());

        System.out.println("THIS STUDENT GOT A DISTINCTION? " + hasDistinction());
    }
}
