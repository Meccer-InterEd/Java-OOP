package org.example;

public class ConsoleResultReporter implements ResultsReporter {
    @Override
    public ResultsStatus determineStatus(int score) {
        if (score < 0 || score > 100) {
            System.out.println("Invalid!Score must be greater than zero and less than 100");
        } else if (score >= 75) {
            return ResultsStatus.PASS;
        } else if (score >= 50) {
            return ResultsStatus.SUPPLEMENTARY;
        } else {
            return ResultsStatus.FAIL;
        }
    }


    @Override
    public void printStudentResult(StudentRecord student) {


    }

}
