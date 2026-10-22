package org.example;
//Create an interface named ResultReporter.
//
//It must declare these methods:
//
//ResultStatus determineStatus(int score);
//void printStudentResult(StudentRecord student);
//Tasks
//Create a class named ConsoleResultReporter that implements ResultReporter.
//Implement determineStatus(int score) using the grading rules in Part 1.
//Implement printStudentResult(StudentRecord student) so that it prints the student's ID, name, score, and result status.
//Use @Override on implemented interface methods.
//In your own words, explain the role of the interface in this program.
//Important: Keep the grading rules in one place rather than copying different versions of the rules into multiple methods.

public class ConsoleResultReporter implements ResultReporter{

    @Override
    public ResultStatus.resultStatus determineStatus(int score) {
        if (score >= 75 && score <= 100) {
            return ResultStatus.resultStatus.PASS;
        } else if (score >= 50 && score <= 74) {
            return ResultStatus.resultStatus.SUPPLEMENTARY;
        } else if(score >= 0 && score <= 49){
            return ResultStatus.resultStatus.FAIL;
        }
        else{
            throw new IllegalArgumentException("The score must be between 0 and 100 only!!! ");
        }
    }

    @Override
    public void printStudentResult(StudentRecord student) {
        System.out.println("Student ID: " + student.studentId() + "Full name: " + student.fullName() + " and their score is: " + determineStatus(student.score()));

    }
}
