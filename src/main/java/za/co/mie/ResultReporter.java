package za.co.mie;

public interface ResultReporter {
//    The interface is used for setting rules for the child classes for the methods that needs to be implemented.
    ResultStatus determineStatus(int score);
    void printStudentResult(StudentRecord student);
}
