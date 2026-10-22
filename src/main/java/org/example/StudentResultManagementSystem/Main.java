package org.example.StudentResultManagementSystem;

public class Main {
    public static void main(String[] args){

        //Part 1

//        int score = 100;
//        String result;
//        ResultStatus result;
//
//       if(score > 0 && score <=49){
//           result = ResultStatus.FAIL;
//           System.out.println(result);
//       }else if(score >= 50 && score <= 74){
//
//           result = ResultStatus.SUPPLEMENTARY;
//           System.out.println(result);
//       }else if(score >= 75 && score <= 100){
//           result = ResultStatus.PASS;
//           System.out.println(result);
//       }else{
//           System.out.println("Enter Proper score, a number greater than or qual to 0 ");
//       }

        //Part 2

//        StudentRecord student1 = new StudentRecord(22203082,"Thamsanqa",81);
//        StudentRecord student2 = new StudentRecord(22204092,"Gift",56);
//        StudentRecord student3 = new StudentRecord(22205076,"Thami",34);
//        StudentRecord student4 = new StudentRecord(22206089,"Nosipho",78);
//        StudentRecord student5 = new StudentRecord(22207085,"Thamsanqa",81);

        //Part 3

//        ConsoleResultReporter crr = new ConsoleResultReporter();
//
//        crr.printStudentResult(student1);
//        crr.printStudentResult(student2);
//        crr.printStudentResult(student3);
//        crr.printStudentResult(student4);
//        crr.printStudentResult(student5);

        //Part 4

        StudentRecord[] students = {
                                    new StudentRecord(22203082,"Thamsanqa",81),
                                    new StudentRecord(22204092,"Gift",56),
                                    new StudentRecord(22205076,"Thami",34),
                                    new StudentRecord(22206089,"Nosipho",78),
                                    new StudentRecord(22207085,"DeadPool",81),
                                    new StudentRecord(22208067,"SpiderMan",50),
                                    new StudentRecord(22209363,"Thor",74),
                                    new StudentRecord(22210567,"Dr Doom",100),

                                     };

            for(int i = 0; i < students.length; i++){
                System.out.println("Name: " + students[i].fullName() +
                                    "\nScore: " + students[i].score() +
                                    "\n================");
            }
        System.out.println("==================");
        System.out.println("Advanced for Loop");

            for(StudentRecord s : students){
                ConsoleResultReporter crr = new ConsoleResultReporter();
                crr.printStudentResult(s);
                System.out.println("=================");
            }




    }
}
