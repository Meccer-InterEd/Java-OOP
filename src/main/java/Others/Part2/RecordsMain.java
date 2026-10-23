package Others.Part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecordsMain {

    public static void main(String[] args) {

        StudentRecord student1 = new StudentRecord(-1,"John",25);
        StudentRecord student2 = new StudentRecord(1001,"Jeffrey",25);
        StudentRecord student3 = new StudentRecord(1002,"Jacob",25);
        StudentRecord student4 = new StudentRecord(1003,"Jane",54);
        StudentRecord student5 = new StudentRecord(1004,"Juliet",43);

        List<StudentRecord> students = new ArrayList<>(Arrays.asList(student1,student2,student3,student4,student5));


        for (StudentRecord record : students)
        {
            System.out.println(record.fullName() + " " + record.score() + " " + record.studentId());
        }

    }


}
