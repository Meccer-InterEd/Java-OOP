package org.example;

public enum ResultStatus {
    PASS,
    SUPPLEMENTARY,
    FAIL;

    public static ResultStatus scoreStatus(double mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        } else if (mark >= 75){
            return PASS;
        } else if (mark >= 50 && mark <= 74){
            return SUPPLEMENTARY;
        }
        return FAIL;
    }
}
