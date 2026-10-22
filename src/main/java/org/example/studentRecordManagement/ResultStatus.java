package org.example.studentRecordManagement;

public class ResultStatus {

    public static ResultsStatusEnum status(int score){
        if(score < 0 || score > 100){
            System.out.println("Invalid results");
            return null;
        }

        if(score < 50){
            return ResultsStatusEnum.PASS;
        } else if (score <= 74) {
            return ResultsStatusEnum.SUPPLEMENTARY;
        }

        return ResultsStatusEnum.PASS;
    }
}
