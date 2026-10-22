package org.example.studentRecordManagement;

public class Main {
    public static void main(String[] args) {
        StudentRecord std1 = new StudentRecord(1, "Lethabo", 56);
        StudentRecord std2 = new StudentRecord(2, "Lethabo", 10);
        StudentRecord std3 = new StudentRecord(3, "Lethabo", 74);
        StudentRecord std4 = new StudentRecord(4, "Lethabo", 98);
        StudentRecord std5 = new StudentRecord(5, "", 40);

        System.out.println(std1.fullName());
        System.out.println(std2.score());
        System.out.println(std3.studentId());
    }
}


/* 3. Records automatically provides constructor and getter methods. Traditional class
 you have to write the methods. */