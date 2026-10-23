package Others.Part4;

import Others.Part2.StudentRecord;
import Others.Part3.ConsultResultReporter;

public class Main4 {

    public static void main(String[] args) {

        

        StudentRecord[] students = {
                new StudentRecord(101, "Amina Dlamini", 82),
                new StudentRecord(102, "David Mokoena", 67),
                new StudentRecord(103, "Lerato Nkosi", 43)
        };

        System.out.println("no of students " + students.length);

        for ( int i = 0 ; i < students.length ; i++)
        {
            System.out.println(students[i].fullName() + " " + students[i].score());


        }

        System.out.println(1.0/0.0);

        ConsultResultReporter news = new ConsultResultReporter();

        for (StudentRecord st : students)
        {

            news.printStudentResult(st);


        }

    }

}
