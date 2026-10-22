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
    }
}
