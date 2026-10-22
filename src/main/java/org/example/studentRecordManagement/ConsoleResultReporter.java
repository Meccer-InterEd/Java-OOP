package org.example.studentRecordManagement;

public class ConsoleResultReporter implements ResultReporter{

    @Override
    public ResultsStatusEnum determineStatus(int score) {
        return ResultStatus.status(score);
    }

    @Override
    public void printStudentResult(StudentRecord student) {
        System.out.println("StudentId: " + student.studentId() + ". FullName: " + student.fullName() + ". Result Score:  " + student.score() + " Status: " + determineStatus(student.score()));
    }
}
