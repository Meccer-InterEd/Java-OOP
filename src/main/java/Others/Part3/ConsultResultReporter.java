package Others.Part3;

import Others.Part1.ResultStatus;
import Others.Part2.StudentRecord;

public class ConsultResultReporter implements ResultReporter {

    @Override
    public ResultStatus determineStatus(int score) {

        ResultStatus status = null;

        if ( ! ( score < 0 || score > 100))
        {

            if (score < 50)
            {
                status = ResultStatus.FAIL;
            }
            else if ( score > 49 && score < 75)
            {
                status = ResultStatus.SUPPLEMENATRY;
            }
            else
            {
                status = ResultStatus.PASS;
            }




        }
        else {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }

        return status;

    }

    @Override
    public void printStudentResult(StudentRecord student) {

        System.out.println( student.fullName() + " " + student.studentId() + " " + student.score() +  " " +  determineStatus(student.score() ));


    }
}
