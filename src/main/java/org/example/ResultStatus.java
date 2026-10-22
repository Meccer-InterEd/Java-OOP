package org.example;
//Create a file named ResultStatus.java.
//
//Declare an enum called ResultStatus with these values:
//
//PASS
//        SUPPLEMENTARY
//FAIL
//Use the following grading rules:
//
//Score Status
//
//75--100 PASS 50--74 SUPPLEMENTARY 0--49 FAIL
//
//        Tasks
//Declare the enum.
//In a separate method, use if / else if / else to determine the status from a score.
//Test the boundary values 0, 49, 50, 74, 75, and 100.
//Explain what should happen if the score is -1 or 101.
//Think about: An enum limits a variable to a known set of values. Why is that safer than storing status as any text string?
public class ResultStatus{
    enum resultStatus {
        PASS,
        SUPPLEMENTARY,
        FAIL
    }

    public  resultStatus scoreStatus(int score) {
        if (score >= 75 && score <= 100) {
            return resultStatus.PASS;
        } else if (score >= 50 && score <= 74) {
            return resultStatus.SUPPLEMENTARY;
        } else if(score >= 0 && score <= 49){
           return resultStatus.FAIL;
        }
        else{
            throw new IllegalArgumentException("The score must be between 0 and 100 only!!! ");
        }
    }
}


