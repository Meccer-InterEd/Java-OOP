package org.example;

public record StudentRecord(int studentId, String fullName, int score) {

    public StudentRecord {

        if (studentId < 0) {
            throw new IllegalArgumentException("ID can not be a negative value");
        }
        if (fullName == null) {
            throw new IllegalArgumentException("This can not be empty");
        }
        if (score <= 0 || score >= 100) {
            throw new IllegalArgumentException("Invalid score amount");
        }
    }
    public String displayResults(){
        return "Student Name:" + " " + fullName + " " +  "Student Id:" + " " +  studentId + " " + "Score:" + " " + score;
    }
}
