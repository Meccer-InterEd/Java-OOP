package org.example;

public record StudentRecord(int studentId, String fullName, int score) {

    public StudentRecord {

        if(studentId < 0){
            throw new IllegalArgumentException("ID cannot be negative");
        }
        if(fullName.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if(score < 0 || score > 100){
            throw new IllegalArgumentException("Marks range is 0 - 100");
        }
    }
}
