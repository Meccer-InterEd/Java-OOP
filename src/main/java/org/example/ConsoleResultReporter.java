package org.example;

public class ConsoleResultReporter implements ResultReporter{

    @Override
    public void determineStatus(int score){
        return ResultStatus.scoreStatus(mark);
    }

    @Override
    public void printStudentResults(StudentRecord student){

    }
}
