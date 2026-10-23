package Others.Part3;

import Others.Part1.ResultStatus;
import Others.Part2.StudentRecord;

public interface ResultReporter {

    ResultStatus determineStatus(int score);
    void printStudentResult( StudentRecord student );

}
