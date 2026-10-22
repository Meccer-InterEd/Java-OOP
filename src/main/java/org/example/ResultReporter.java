package org.example;

public interface ResultReporter {
    ResultsStatus determineStatus(int score);
    void printStudentResult(StudentRecord student);
}
