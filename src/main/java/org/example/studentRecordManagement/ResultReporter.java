package org.example.studentRecordManagement;

public interface ResultReporter {
    ResultsStatusEnum determineStatus(int score);
    void printStudentResult(StudentRecord student);
}
