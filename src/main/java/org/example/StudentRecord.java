package org.example;

public record StudentRecord(int studentId, String fullName, int score) {
 public StudentRecord{
     if(fullName == null || fullName.isBlank() ){
         System.out.println("Invalid, can not create record with a blank name");
     }
      if(studentId <0){
          System.out.println("Invalid, can not allow a negative ID");
      }

      if(score <0 || score >100){
          System.out.println("Invalid Score, cant have a negative score or a score above 100");
      }
 }
}

