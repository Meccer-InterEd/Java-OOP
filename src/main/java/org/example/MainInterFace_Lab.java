package org.example;

public class MainInterFace_Lab {

    public static void main(String[] args) {

        ResultStatus rs = new ResultStatus();
        System.out.println(rs.scoreStatus(40));

        StudentRecord sr1 = new StudentRecord(-21345,"Lona",60);
        StudentRecord sr2 = new StudentRecord(21346,"Siyabonga",6);
        StudentRecord sr3 = new StudentRecord(21347,"Ditebogo",59);
        StudentRecord sr4 = new StudentRecord(21348,"Cebisa",65);
        StudentRecord sr5 = new StudentRecord(21349,"Ona",45);

        System.out.println(" --------" );
        System.out.println("Full name: " + sr1.fullName() + " and their score is: " + sr1.score());
        System.out.println("Full name: " + sr2.fullName() + " and their score is: " + sr2.score());
        System.out.println("Full name: " + sr3.fullName() + " and their score is: " + sr3.score());
        System.out.println("Full name: " + sr4.fullName() + " and their score is: " + sr4.score());
        System.out.println("Full name: " + sr5.fullName() + " and their score is: " + sr5.score());
        System.out.println(" --------" );
    }
}





