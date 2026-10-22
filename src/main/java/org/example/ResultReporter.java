package org.example;

public interface ResultReporter {
    ResultStatus.resultStatus determineStatus(int score);
    void printStudentResult(StudentRecord student);
}
