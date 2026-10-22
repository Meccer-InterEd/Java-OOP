package org.example;

public class ConsoleResultReporter implements ResultReporter{
    @Override
    public ResultsStatus determineStatus(int score) {
        if(score >=0 && score <=100){
            if(score >75){
                return ResultsStatus.PASS;
            }
            else if(score >=50 && score <=74){
                return ResultsStatus.SUPPLEMENTARY;
            }
            else{
                return ResultsStatus.FAIL;
            }
        }
        else {
            System.out.println("invalid score result entered");
        }
        return null;
    }

    @Override
    public void printStudentResult(StudentRecord student) {
        System.out.println("Student ID:" + student.studentId() + " Name:" + student.fullName() + " Score:" + student.score() + "-"+determineStatus(student.score()));

    }

}
