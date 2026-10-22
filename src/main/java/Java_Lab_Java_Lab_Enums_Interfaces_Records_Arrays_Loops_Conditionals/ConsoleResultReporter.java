package Java_Lab_Java_Lab_Enums_Interfaces_Records_Arrays_Loops_Conditionals;

public class ConsoleResultReporter implements ResultReporter{

    @Override
    public ResultStatus.resultStatus determineStatus(int score) {
        if (score >= 75 && score <= 100 ) {
            return ResultStatus.resultStatus.PASS;
        } else if (score >= 50 && score < 75) {
            return ResultStatus.resultStatus.SUPPLEMENTARY;
        } else if (score >= 0 && score < 50) {
            return ResultStatus.resultStatus.FAIL;
        } else {
            throw new IllegalArgumentException("The score value: " + score + " is invalid. Score must be between 0 and 100.");
        }
    }

    @Override
    public void printStudentResult(StudentRecord student) {
        System.out.println("Student: " + student.fullName() + "'s score is: " + student.score() + ". Status: " + determineStatus(student.score()));
    }
}
