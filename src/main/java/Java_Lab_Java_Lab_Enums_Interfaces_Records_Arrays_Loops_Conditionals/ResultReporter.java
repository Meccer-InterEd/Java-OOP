package Java_Lab_Java_Lab_Enums_Interfaces_Records_Arrays_Loops_Conditionals;

public interface ResultReporter {
    ResultStatus.resultStatus determineStatus(int score);
    void printStudentResult(StudentRecord student);
}
