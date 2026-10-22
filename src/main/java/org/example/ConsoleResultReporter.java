package org.example;

public class ConsoleResultReporter implements ResultReporter{

    @Override
    public ResultStatus determineStatus(int mark) {
        return ResultStatus.scoreStatus(mark);
    }

    @Override
    public void printStudentResult(StudentRecord student) {
        System.out.println("ID: " + student.studentId() + " | Name: " + student.fullName()
        + " | Score: " + student.score() + " | Status: " + determineStatus(student.score()));
    }

    /*
    Part 3 Questions:

    1. In your own words, explain the role of the interface in this program
       The interface was used to achieve abstraction. The interface provides something like a contract
       which tells the class that implements it what methods it needs to use, without ever
       implementing those methods itself. It allows us to separate the method definition from its
       implementation. The interface defines what a class must do, while the class defines how it will
       do it
     */
}
