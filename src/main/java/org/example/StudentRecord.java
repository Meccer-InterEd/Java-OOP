package org.example;

public record StudentRecord(int studentId, String fullName,int score) {
    public StudentRecord{
        if (fullName == null || fullName.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank");
        }

        if (studentId < 0) {
            throw new IllegalArgumentException("Student ID cannot be negative");
        }

        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }
    }
}
