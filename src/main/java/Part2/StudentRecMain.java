package Part2;

import java.sql.SQLOutput;

public class StudentRecMain {
    public static void main(String[] args){
        StudentRecord studentRecord = new StudentRecord(221393439,"Ditebogo Tlhakola",88);
        StudentRecord studentRecord1 = new StudentRecord(22198700,"Siyabonga Ngobeni",80);
        StudentRecord studentRecord2= new StudentRecord(221334534,"Lona Hans",73);
        StudentRecord studentRecord3 = new StudentRecord(22334534,"Kagiso Molefe",55);
        StudentRecord studentRecord4 = new StudentRecord(22334534,"Lucas Kubushi",23);

        StudentRecord[] studentRecords = {studentRecord,studentRecord1,studentRecord2,studentRecord3,studentRecord4};

        for (int i = 0; i < studentRecords.length; i++ ){
            System.out.println(studentRecords[i].studentId() + " " + studentRecords[i].fullName() + " " + studentRecords[i].score() );
        }

    }
}
