package org.example.part1;

public class ResultStatus {

    public ResultsStatus status(int score){
        if(score < 0 || score > 100){
            System.out.println("Invalid results");
            return null;
        }

        if(score < 50){
            return ResultsStatus.PASS;
        } else if (score <= 74) {
            return ResultsStatus.SUPPLEMENTARY;
        }

        return ResultsStatus.PASS;
    }
}
