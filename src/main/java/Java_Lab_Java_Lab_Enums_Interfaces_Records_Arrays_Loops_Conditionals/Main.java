package Java_Lab_Java_Lab_Enums_Interfaces_Records_Arrays_Loops_Conditionals;

public class Main {

    public static void main(String[] args) {

        ResultStatus resultStatus = new ResultStatus();
        System.out.println(resultStatus.scoreStatus(95));

        System.out.println("-----------------------------------------------------");
        StudentRecord studentRecord1 = new StudentRecord(291534, "Siyabonga Deut Ngobeni", 99);
        StudentRecord studentRecord2 = new StudentRecord(345674, "Lona Hans", 19);
        StudentRecord studentRecord3 = new StudentRecord(675365, "Ditebogo Tlhakola", 56);
        StudentRecord studentRecord4 = new StudentRecord(789643, "Kagiso Shaun Molefe", 77);
        StudentRecord studentRecord5 = new StudentRecord(326578, "Ntiyiso Chauke", 84);

        System.out.println("Student: " + studentRecord1.fullName() + "'s score is: " + studentRecord1.score());
        System.out.println("Student: " + studentRecord2.fullName() + "'s score is: " + studentRecord2.score());
        System.out.println("Student: " + studentRecord3.fullName() + "'s score is: " + studentRecord3.score());
        System.out.println("Student: " + studentRecord4.fullName() + "'s score is: " + studentRecord4.score());
        System.out.println("Student: " + studentRecord5.fullName() + "'s score is: " + studentRecord5.score());
        System.out.println("-----------------------------------------------------");

        StudentRecord[] students = {studentRecord1, studentRecord2, studentRecord3, studentRecord4, studentRecord5};
        ConsoleResultReporter consoleResultReporter = new ConsoleResultReporter();
        for (StudentRecord studentRecord : students) {
            consoleResultReporter.printStudentResult(studentRecord);
        }
        System.out.println("-----------------------------------------------------");

        StudentRecord[] _students = {
                new StudentRecord(291534, "Siyabonga Deut Ngobeni", 99),
                new StudentRecord(345674, "Lona Hans", 0),
                new StudentRecord(675365, "Ditebogo Tlhakola", 50),
                new StudentRecord(789643, "Kagiso Shaun Molefe", 77),
                new StudentRecord(326578, "Ntiyiso Chauke", 84),
                new StudentRecord(101, "Amina Dlamini", 82),
                new StudentRecord(102, "David Mokoena", 67),
                new StudentRecord(103, "Lerato Nkosi", 43)
        };

        System.out.println("Total number of students: " + _students.length);
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < students.length; i++) {
            System.out.println("Student Name: " + students[i].fullName() + ", Score: " + students[i].score());
        }
        System.out.println("-----------------------------------------------------");

        for (StudentRecord studentRecord: _students) {
            consoleResultReporter.printStudentResult(studentRecord);
        }
        System.out.println("-----------------------------------------------------");

        //Demonstration.
        System.out.println("First student (Index 0): " + _students[0].fullName());

        int lastIndex = _students.length - 1;
        System.out.println("Last student (Index " + lastIndex + "): " + _students[lastIndex].fullName());
        System.out.println("-----------------------------------------------------");

        int numPassedStudents = 0;
        for (StudentRecord _studentRecord: _students) {
            if (consoleResultReporter.determineStatus(_studentRecord.score()) == ResultStatus.resultStatus.PASS) {
                numPassedStudents++;
            }
        }
        System.out.println("The number of students who passed is: " + numPassedStudents);
        System.out.println("-----------------------------------------------------");

        int numSupplementaryStudents = 0;
        for (StudentRecord _studentRecord: _students) {
            if (consoleResultReporter.determineStatus(_studentRecord.score()) == ResultStatus.resultStatus.SUPPLEMENTARY) {
                numSupplementaryStudents++;
            }
        }
        System.out.println("The number of students who need supplementary assessment is: " + numSupplementaryStudents);
        System.out.println("-----------------------------------------------------");


    }
}
