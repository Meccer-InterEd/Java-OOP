package org.example;

public class ConsoleResultReporter implements ResultReporter{
    @Override
    public ResultStatus determineStatus(int score){
        return ResultStatus.scoreStatus(score);
    }

    @Override
    public void printStudentResult(StudentRecord student){
        System.out.println("ID: "+student.studentId()+" | " +
                "Name: "+student.fullName()+" | " +
                "Score: "+student.score()+" | " +
                "Status: "+determineStatus(student.score()).toString()+"\n");
    }
}
