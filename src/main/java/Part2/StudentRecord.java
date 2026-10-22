package Part2;

public record StudentRecord(int studentId, String fullName, int score) {
 public StudentRecord{
     if (studentId < 0)
     {
         throw new IllegalArgumentException("Student ID cannot be negative");
     }
     else if( fullName == null)
     {
         throw new IllegalArgumentException("Student name cannot be left empty");
     } else if ( score > 100 || score < 0) {
         throw  new IllegalArgumentException("Invalid mark was entered");
     }

 }
}
