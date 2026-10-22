package za.co.mie;

public enum ResultStatus {
    DISTINCTION("80 - 100"),
    PASS("75 - 79"),
    SUPPLEMENTARY("50 - 74"),
    FAIL("0 - 49");

    private final String description;

    ResultStatus(String description) {
        this.description = description;
    }

    public String get_description() {
        return this.description;
    }
}
