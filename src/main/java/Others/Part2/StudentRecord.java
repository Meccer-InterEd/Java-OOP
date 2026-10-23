package Others.Part2;

public record StudentRecord(int studentId,String fullName,int score) {

    public StudentRecord
    {
        if(studentId <= 0)
        {
            throw new IllegalArgumentException("Invalid Student ID");
        }

        if(fullName.isBlank() || fullName == null)
        {
            throw new IllegalArgumentException("Invalid Full Name");
        }

        if (score < 0)
        {
            throw new IllegalArgumentException("Invalid Score");
        }

    }

}
