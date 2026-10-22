package za.co.mie;

public record StudentRecord(int student_id, String full_name, int score) {
    public StudentRecord {
        if (student_id <= 0) {
            throw new IllegalArgumentException("Student id must be greater than 0");
        }

        if (full_name == null || full_name.isBlank()) {
            throw new IllegalArgumentException("Full name cannot be empty");
        }

        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must falls outside range");
        }
    }
}