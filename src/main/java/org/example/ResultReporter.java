package org.example;

public interface ResultReporter {

    ResultStatus.Result determineStatus(int score);
    void printStudentResult(StudentRecord student);

}
