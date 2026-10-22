package org.example;

public record StudentRecord(int studentId, String fullName, int score) {

    public StudentRecord{
        if(fullName.isBlank()){
            throw new IllegalArgumentException("Name must not be blank");
        }
        if(studentId<0){
            throw new IllegalArgumentException("ID must not be negative");
        }
        if(score<0 || score>100){
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }

    }

}
