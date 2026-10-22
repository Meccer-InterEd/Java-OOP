package org.example.Lab09_StudentResults;

public class ConsoleResultReporter implements ResultReporter {

    @Override
    public ResultStatus determineStatus(int score) {
        if (score >= 80) {
            return ResultStatus.DISTINCTION;
        }
        else if (score >= 75) {
            return ResultStatus.PASS;
        }
        else if (score >= 50) {
            return ResultStatus.SUPPLEMENTARY;
        }
        else {
            return ResultStatus.FAIL;
        }

    }

    @Override
    public void printStudentResult(StudentRecord student) {

        ResultStatus status = determineStatus(student.score());
        System.out.println("ID: " + student.studentId());
        System.out.println("Name: " + student.fullName());
        System.out.println("Score: " + student.score());
        System.out.println("Status: " + status);
    }

}


