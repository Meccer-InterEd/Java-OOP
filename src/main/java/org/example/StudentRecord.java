package org.example;

public record StudentRecord(int studentId, String fullName, int score) {
    public StudentRecord {
        if (fullName == null) {
            throw new NullPointerException("StudentRecord: fullName is null");
        } else if (studentId < 0){
            throw new NullPointerException("Student ID is negative");
        } else if (score < 0 || score > 100) {
            throw new NullPointerException("Student score out of range");
        }
    }
}
