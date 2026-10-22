package Java_Lab_Java_Lab_Enums_Interfaces_Records_Arrays_Loops_Conditionals;

public class ResultStatus {
    enum resultStatus {
        PASS,
        SUPPLEMENTARY,
        FAIL
    }

    resultStatus scoreStatus(int score) {
        if (score >= 75 && score <= 100 ) {
            return resultStatus.PASS;
        } else if (score >= 50 && score < 75) {
            return resultStatus.SUPPLEMENTARY;
        } else if (score >= 0 && score < 50) {
            return resultStatus.FAIL;
        } else {
            // If the score <= -1 or score >= 101, the program will throw an exception and points out the value
            throw new IllegalArgumentException("The score value: " + score + " is invalid. Score must be between 0 and 100.");
        }
    }
}
