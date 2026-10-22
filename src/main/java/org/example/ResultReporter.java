package org.example;

public interface ResultReporter {
    ResultStatus determineStatus(int score);
    void printStudentResults(StudentRecord student);
}
