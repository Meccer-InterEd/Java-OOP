package org.example.studentRecordManagement;

import org.example.studentManagementSystem.Student;

public class Main {
    public static void main(String[] args) {

        StudentRecord[] students = {
                new StudentRecord(101, "Amina Dlamini", 82),
                new StudentRecord(102, "David Mokoena", 67),
                new StudentRecord(103, "Lerato Nkosi", 43),
                new StudentRecord(104, "Lerato Monama", 50),
                new StudentRecord(105, "Lethabo Monama", 75),
                new StudentRecord(106, "Lebio Nkosi", 49),
                new StudentRecord(107, "Lethabo Dlamini", 74),
                new StudentRecord(108, "Mary Mokoena", 100),
                new StudentRecord(109, "Maria Maepa", 0)
        };
        System.out.println("length: " +students.length);
        for (int i = 0; i < students.length; i++) {
            System.out.println("FullName: " + students[i].fullName() + ". Score: " + students[i].score());
        }

        ConsoleResultReporter consoleResultReporter = new ConsoleResultReporter();

        for (StudentRecord std: students){
            consoleResultReporter.printStudentResult(std);
        }


    }
}


/* 3. Records automatically provides constructor and getter methods. Traditional class
 you have to write the methods. */