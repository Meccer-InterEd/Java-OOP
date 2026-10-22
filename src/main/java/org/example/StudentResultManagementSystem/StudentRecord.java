package org.example.StudentResultManagementSystem;

public record StudentRecord(int studentId, String fullName, int score) {

   public StudentRecord{

        if(fullName.isBlank()){
            System.err.println("enter name");

        }

        if(studentId < 0){

            System.err.println("Student ID cannot be negative");
        }

        if(score < 0){

            System.err.println("Enter score greater than 0");
        }else if(score > 100){

            System.err.println("Enter score less than 100");

        }

    }
}
