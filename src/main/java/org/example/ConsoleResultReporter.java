package org.example;

public class ConsoleResultReporter implements ResultReporter{
    @Override
    public ResultStatus.Result determineStatus(int score){
        return ResultStatus.getStatus(score);
    }

    @Override
    public void printStudentResult(StudentRecord s){

        ResultStatus.Result status = determineStatus(s.score());
        System.out.println("Student ID: "+s.studentId());
        System.out.println("Student name: "+s.fullName());
        System.out.println("Student score: "+s.score());
        System.out.println("Student status: "+status);

        System.out.println("----------------------------");
    }



}
