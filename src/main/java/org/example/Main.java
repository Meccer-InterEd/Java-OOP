package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        StudentRecord student = new StudentRecord(111, "Mo", 76);
        StudentRecord student2 = new StudentRecord(222, "Thami", 67);
        StudentRecord student3 = new StudentRecord(333, "Solly", 50);
        StudentRecord student4 = new StudentRecord(444, "Thabi", 49);
        StudentRecord student5 = new StudentRecord(555, "Ontha", 75);

        StudentRecord[] students = {student, student2, student3, student4, student5};

       for(StudentRecord s: students) {

           System.out.println(s.fullName() + " " + s.score());
       }

    }
}