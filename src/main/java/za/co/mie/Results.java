package za.co.mie;

public class Results {
    ResultStatus get_result_status(int score) {
        if (score >= 75 && score <= 100) {
            return ResultStatus.PASS;

        } else if (score >= 50 && score <= 74) {
            return ResultStatus.SUPPLEMENTARY;

        } else if (score >= 0 && score <= 49) {
            return ResultStatus.FAIL;

        } else {
//            We throw an error if the user enters a value that does not fall between 0 - 100.
            throw new IllegalArgumentException("Score falls outside the range");
        }
    }
}
