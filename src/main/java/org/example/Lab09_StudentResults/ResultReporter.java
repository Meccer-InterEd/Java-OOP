package org.example.Lab09_StudentResults;

public interface ResultReporter {
    ResultStatus determineStatus(int score);

    void printStudentResult(StudentRecord student);
}
