package org.example;

public enum ResultStatus {
    PASS,
    SUPPLEMENTARY,
    FAIL;

    public static ResultStatus scoreStatus(double mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
        else if (mark >= 75 && mark <= 100) {
            return PASS;
        } else if (mark >= 50 && mark <= 74) {
            return SUPPLEMENTARY;
        } else {
            return FAIL;
        }
    }
}
