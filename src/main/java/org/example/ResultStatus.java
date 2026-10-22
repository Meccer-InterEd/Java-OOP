package org.example;

public class ResultStatus {
    enum Result {
        PASS,
        SUPPLEMENTARY,
        FAIL;
    }

    public static Result getStatus(int score){
        if( score<=100 && score>=75){
            return Result.PASS;
        } else if (score>=50 && score <=74) {
            return Result.SUPPLEMENTARY;

        } else if (score<=49 && score>=0) {
            return Result.FAIL;

        } else {
            throw new IllegalArgumentException("Score should not be below 0 or above 100");
        }
    }
}
