package Part3;

import Part2.StudentRecord;

public class ResultMain {
    public static void main(String[] args){

        StudentRecord studentRecord1 = new StudentRecord(434364, "Sam Tlala", 44);
        ConsoleResultReporter consoleResultReporter = new ConsoleResultReporter();
        consoleResultReporter.printStudentResult(studentRecord1);
    }
}
