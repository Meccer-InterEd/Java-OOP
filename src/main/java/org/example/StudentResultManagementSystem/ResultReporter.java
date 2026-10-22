package org.example.StudentResultManagementSystem;

public interface ResultReporter {
    void printStudentResult(StudentRecord student);
    ResultStatus determineStatus(int score);
}
