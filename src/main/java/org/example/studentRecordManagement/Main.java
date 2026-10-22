package org.example.studentRecordManagement;

import org.example.studentManagementSystem.Student;

public class Main {
    public static ConsoleResultReporter consoleResultReporter = new ConsoleResultReporter();

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


        for (StudentRecord std: students){
            consoleResultReporter.printStudentResult(std);
        }

        System.out.println("Average Score: " + scoreAvg(students));

    }

    public static double scoreAvg(StudentRecord[] students){
        double total = 0;
        double average = 0;

        if(students.length == 0){
            System.out.println("Array is empty");
            return average;
        }


        for (StudentRecord std: students){
            total += std.score();
        }

        return total / students.length;
    }


   public static void statusCount(StudentRecord[] students){
        int countFail = 0;
        int countPass = 0;
        int countSupplementary = 0;

       for (StudentRecord std: students){
           if(consoleResultReporter.determineStatus(std.score()) == ResultsStatusEnum.FAIL){
               countFail += 1;
           } else if (consoleResultReporter.determineStatus(std.score()) == ResultsStatusEnum.SUPPLEMENTARY) {
               countSupplementary += 1;
           }
           countPass += 1;
       }
   }
}


/* 3. Records automatically provides constructor and getter methods. Traditional class
 you have to write the methods. */