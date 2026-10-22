package org.example;

public class ConsoleResultReporter implements  ResultReporter{
    @Override
    public ResultStatus determineStatus(int score) {

        ResultStatus status = null;

        if(score < 0 || score > 100){

            System.out.println("Valid marks are between 0 and 100");

        }else{
            if(score > 74 ){
                status = ResultStatus.PASS;
            }else if(score > 50){
                status = ResultStatus.SUPPLEMENTARY;
            }else{
                status = ResultStatus.FAIL;
            }
        }

        return status;
    }

    @Override
    public void printStudentResult(StudentRecord student) {


        System.out.println("Student ID:" + student.studentId());
        System.out.println("Name:" + student.fullName());
        System.out.println("Score:" + student.score());
        System.out.println("Result:" + determineStatus(student.score()));
    }
}
