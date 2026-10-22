package Java_Lab_Java_Lab_Enums_Interfaces_Records_Arrays_Loops_Conditionals;

public record StudentRecord(int studentID, String fullName, int score) {

    public StudentRecord {
        if (studentID < 0) {
            throw new IllegalArgumentException("ID cannot be negative: " + studentID);
        }

        if (fullName == null || fullName.isBlank()) {
            throw new IllegalArgumentException("Student name cannot be blank.");
        }

        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100. Provided: " + score);
        }
    }
}
