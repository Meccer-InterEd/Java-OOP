package org.example;

public class ConsoleResultReporter implements ResultReporter {

        @Override
        public ResultsStatus determineStatus(int score) {

            if (score < 0 || score > 100) {
                System.out.println("Invalid Score");
            } else if (score >= 0 || score <= 49) {
                return ResultsStatus.FAIL;
            } else if (score >= 50 || score <= 74) {
                return ResultsStatus.SUPPLEMENTARY;
                
            } else if (score >= 75 || score <= 79) {
               return ResultsStatus.PASS;
                
            } else {
                return ResultsStatus.DISTINCTION;
            }
            return ResultsStatus.FAIL ;
        }

        @Override
        public void printStudentResult(StudentRecord student) {

            ResultsStatus status = determineStatus(student.score());

            System.out.println(
                    "ID: " + student.studentID()
                            + " | Name: " + student.fullName()
                            + " | Score: " + student.score()
                            + " | Status: " + status
            );
        }
    }


