package org.example;

public record StudentRecord(int studentId, String fullName, int score) {

    public StudentRecord {
        if (studentId < 0) {
            throw new IllegalArgumentException("Student ID cannot be negative");
        }

        if (fullName.isEmpty()) {
            throw new IllegalArgumentException("Names cannot be blank");
        }

        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
    }
}
