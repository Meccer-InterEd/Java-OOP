package org.example;

public enum ResultStatus {
    PASS,
    SUPPLEMENTARY,
    FAIL,
    INVALID;

    public static ResultStatus markStatus(double mark) {
        if (mark >= 75) {
            return PASS;
        } else if (mark >= 50) {
            return SUPPLEMENTARY;
        }else if (mark <= 49 || mark >=0) {
            return FAIL;
        }else  {
            return INVALID;
        }
    }
}
