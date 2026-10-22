package org.example;

public class ConsoleResultReporter implements ResultReporter{
    @Override
    public ResultStatus determineStatus(int score){
        return ResultStatus.scoreStatus(score);
    }

    @Override
    public void printStudentResult(StudentRecord student){
        System.out.println("Student No."+student.studentId()+"\n" +
                "Student names: "+student.fullName()+"\n" +
                "Score: "+student.score()+"\n" +
                "Outcome: "+determineStatus(student.score()).toString()+"\n");
    }
}
