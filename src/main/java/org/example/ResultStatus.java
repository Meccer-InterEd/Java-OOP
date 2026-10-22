package org.example;

public enum ResultStatus {
    PASS,
    SUPPLEMENTARY,
    FAIL;

    double mark;

    public void scoreStatus(double mark){
        if(mark >= 0 && mark <=49 ){
            System.out.println(FAIL);
        } else if (mark >= 50 && mark <=74) {
            System.out.println(SUPPLEMENTARY);
        } else if (mark >= 75 && mark <=100) {
            System.out.println(PASS);
        } else {
            System.out.println("INVALID MARK");
        }
    }

}


