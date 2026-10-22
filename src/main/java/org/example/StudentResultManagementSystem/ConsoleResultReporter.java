package org.example.StudentResultManagementSystem;

public class ConsoleResultReporter implements ResultReporter{

    ConsoleResultReporter(){}

    @Override
    public void printStudentResult(StudentRecord student) {
        System.out.println("Student number: " + student.studentId() +
                            "\nName: " + student.fullName() +
                            "\nScore: " + student.score() +
                            "\nResult: " + determineStatus(student.score()));
    }

    @Override
    public ResultStatus determineStatus(int score) {
       ResultStatus result = null;

        if(score > 0 && score <=49){

           result = ResultStatus.FAIL;

       }else if(score >= 50 && score <= 74){

           result = ResultStatus.SUPPLEMENTARY;

       }else if(score >= 75 && score <= 100){

           result = ResultStatus.PASS;

       }else{
           System.out.println("Enter Proper score, a number greater than or qual to 0 ");
       }
        return result;
    }
}
