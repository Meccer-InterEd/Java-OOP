package org.example;

public record StudentRecord(int studentId, String fullName, int score) {
    public StudentRecord{
        if (fullName == null || fullName.isBlank()){
            throw new IllegalArgumentException("full name cannot be blank.\n");
        } else if (studentId < 0){
            throw new IllegalArgumentException("student id should not be negative.\b");
        } else if (score < 0 || score > 100){
            throw new IllegalArgumentException("score cannot be negative or larger than 100.\n");
        }
    }

//    public void justDisplay(){
//        System.out.println("Student No."+this.studentId()+"\n" +
//                "Student names: "+this.fullName()+"\n" +
//                "Score: "+this.score()+"\n");
//    }
}
