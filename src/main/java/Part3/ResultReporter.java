package Part3;
import Part1.ResultStatus;
import Part2.StudentRecord;

public interface ResultReporter {
    ResultStatus determineStatus(int score);
    void printStudentResult(StudentRecord student);
}
