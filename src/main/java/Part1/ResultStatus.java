package Part1;

public enum ResultStatus {
    PASS,SUPPLEMENTARY,FAIL;

    public static ResultStatus scoreStatus(double score){

        if (score < 0 || score > 100) {
            throw new IllegalArgumentException(
                    "Score must be between 0 and 100."
            );
        } else if (score >= 75) {
            return ResultStatus.PASS;
        } else if (score >= 50) {
            return SUPPLEMENTARY;
        } else {
            return FAIL;
        }
    }

}
