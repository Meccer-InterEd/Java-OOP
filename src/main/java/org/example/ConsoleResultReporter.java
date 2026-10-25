package org.example;

public class ConsoleResultReporter implements ResultReporter {
    @Override
    public ResultStatus determineStatus(int score) {
        return ResultStatus.markStatus(score);
    }
    @Override
    public void printStudentResult(StudentRecord student) {
        System.out.println(
                "Student Name: " + student.fullName() + "Student Score: " + student.score() + "Student Id: " + student.studentId()
        );
    }
}
