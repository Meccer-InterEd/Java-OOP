package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        StudentClass student = new StudentClass("Thami", 27, 67);
        StudentClass student2 = new StudentClass("MO", 23, 76);
        StudentClass student3 = new StudentClass("Makwa", 24, 78);
        StudentClass student4 = new StudentClass("Ethan", 25, 49);

        StudentClass[] students = {student, student2, student3, student4};

        student.displayDetails(students);
        boolean passorfail = false;

        StudentClass highest = students[0];

        for(int i = 0; i<students.length; i++){

            passorfail = students[i].hasPassed(students[i].getMark());
        }

        student.countPassedAndAvg(students);
        student.Highest(students);

    }
}