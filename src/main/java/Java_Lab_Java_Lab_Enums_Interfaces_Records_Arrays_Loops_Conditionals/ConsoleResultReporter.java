package Java_Lab_Java_Lab_Enums_Interfaces_Records_Arrays_Loops_Conditionals;

public class ConsoleResultReporter implements ResultReporter{

    ResultStatus resultStatus = new ResultStatus();

    @Override
    public ResultStatus.resultStatus determineStatus(int score) {
        return resultStatus.scoreStatus(score);
    }

    @Override
    public void printStudentResult(StudentRecord student) {
        System.out.println("Student: " + student.fullName() + "'s score is: " + student.score() + ". Status: " + determineStatus(student.score()));
    }
}
