package org.example;

public enum ResultStatus {
    PASS, SUPPLEMENTARY, FAIL;


    void determineStatus(int score){

        if(score < 0 || score > 100){

            System.out.println("Valid marks are between 0 and 100");

        }else{
            if(score > 74 ){
                ResultStatus status = ResultStatus.PASS;
            }else if(score > 50){
                ResultStatus status = ResultStatus.SUPPLEMENTARY;
            }else{
                ResultStatus status = ResultStatus.FAIL;
            }
        }
    }
}
