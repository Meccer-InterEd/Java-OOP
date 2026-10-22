package org.example;

public interface ResultsReporter {
   ResultsStatus determineStatus(int score);
   public  void printStudentResult(StudentRecord student);

}
