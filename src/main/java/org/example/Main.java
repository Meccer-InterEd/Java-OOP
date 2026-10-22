package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        StudentRecord student = new StudentRecord(111, "Mo", 76);
        StudentRecord student2 = new StudentRecord(222, "Thami", 82);
        StudentRecord student3 = new StudentRecord(333, "Solly", 55);
        StudentRecord student4 = new StudentRecord(444, "Thabi", 67);
        StudentRecord student5 = new StudentRecord(555, "Ontha", 45);
        StudentRecord student6 = new StudentRecord(666, "Amina", 49);
        StudentRecord student7 = new StudentRecord(777, "David", 50);
        StudentRecord student8 = new StudentRecord(888, "Lerato", 75);

        StudentRecord[] students = {student, student2, student3, student4, student5, student6, student7, student8};

        ConsoleResultReporter crr = new ConsoleResultReporter();

       for(StudentRecord s: students) {

           crr.printStudentResult(s);
       }

        int count = students.length;
        System.out.println("Number of students:" + count);

        //Part 4.5 Demonstration
        System.out.println(students[0]);
    }
}