package za.co.mie;

public class ConsoleResultReporter implements ResultReporter {
    @Override
    public ResultStatus determineStatus(int score){
        if (score >= 75 && score <= 100) {
            return ResultStatus.PASS;

        } else if (score >= 50 && score <= 74) {
            return ResultStatus.SUPPLEMENTARY;

        } else if (score >= 0 && score <= 49) {
            return ResultStatus.FAIL;

        } else {
            throw new IllegalArgumentException("Score falls outside the range");
        }
    }

    @Override
    public void printStudentResult(StudentRecord student){
        System.out.println("Student ID: " + student.student_id() + "\nStudent Name: " + student.full_name() + "\nStudent Score: " + student.score() + "\nStudent Status: " + determineStatus(student.score()));
    }
}
