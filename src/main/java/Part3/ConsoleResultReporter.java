package Part3;

import Part1.ResultStatus;
import Part2.StudentRecord;

import static Part1.ResultStatus.*;

public class ConsoleResultReporter implements  ResultReporter{
    @Override
    public ResultStatus determineStatus(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException(
                    "Score must be between 0 and 100."
            );
        } else if (score >= 75) {
            return ResultStatus.PASS;
        } else if (score >= 50) {
            return SUPPLEMENTARY;
        } else {
            return FAIL;
        }
    }

    @Override
    public void printStudentResult(StudentRecord student) {
        System.out.println(
               "Name: "+ student.fullName() + " Score: " + student.score() + " Status: " + scoreStatus(student.score())
        );

    }
}
