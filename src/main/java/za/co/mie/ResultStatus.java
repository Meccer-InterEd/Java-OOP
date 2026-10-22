package za.co.mie;

public enum ResultStatus {
    PASS("75 - 100"),
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
