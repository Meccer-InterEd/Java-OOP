package org.example.studentRecordManagement;

public record StudentRecord(int studentId, String fullName, int score) {
    public StudentRecord {
        if(studentId < 0 || studentId > 100){
            System.out.println("Invalid student id");
        }
        if(fullName.isBlank()){
            System.out.println("Student cannot be created with a blank name");
        }
        if(score < 0 || score > 100){
            System.out.println("Invalid score");
        }
    }
}
