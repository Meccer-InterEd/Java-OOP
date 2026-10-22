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
                                    new StudentRecord(22203082,"Thamsanqa",80),
                                    new StudentRecord(22204092,"Gift",49),
                                    new StudentRecord(22205076,"Thami",34),
                                    new StudentRecord(22206089,"Nosipho",74),
                                    new StudentRecord(22207085,"DeadPool",75),
                                    new StudentRecord(22208067,"SpiderMan",79),
                                    new StudentRecord(22209363,"Thor",50),
                                    new StudentRecord(22210567,"Dr Doom",100),

                                     };

//            for(int = i = 0; i < students.length; i++){
//                System.out.println("Name: " + students[i].fullName() +
//                                    "\nScore: " + students[i].score() +
//                                    "\n================");
//
//
//            }

        int failCounter = 0;
        int passCounter = 0;
        int needSupp = 0;
        int distinctionCount = 0;
        int sumScore = 0;
        int avgScore ;

        System.out.println("STUDENT RESULTS");
        System.out.println("================");
            for(StudentRecord s : students) {
                ConsoleResultReporter crr = new ConsoleResultReporter();

                crr.printStudentResult(s);
               // System.out.println("=================");

                sumScore = sumScore + s.score();
                if (crr.determineStatus(s.score()) == ResultStatus.PASS) {
                    passCounter++;
                } else if (crr.determineStatus(s.score()) == ResultStatus.SUPPLEMENTARY) {
                    needSupp++;
                }else if(crr.determineStatus(s.score()) == ResultStatus.DISTINCTION){
                    distinctionCount++;
                }else {
                    failCounter++;
                }



            }


        StudentRecord lowestStudent = null;
        StudentRecord highestStudent = null;

        int  highScore = students[0].score();
        int lowScore = students[0].score();

        for(int i = 0; i < students.length; i++){

            if(students[i].score() > highScore){
                highScore = students[i].score();
                highestStudent = students[i];

            }

            if(students[i].score() < lowScore){
                lowScore = students[i].score();
                lowestStudent = students[i];

            }


        }
        avgScore = sumScore/ students.length;
        System.out.println("Summary");
        System.out.println("============"+
                "\nTotal students: " + students.length +
                "\nDistinction: " + distinctionCount +
                "\nPassed: " + passCounter +
                "\nNeed Supplementary: " + needSupp +
                "\nFailed: " + failCounter +
                "\n================" +
                "\nAverage Score: " + avgScore +
                "\n===============" +
                "\nHighest score: " + highestStudent.score() + "(" + highestStudent.fullName()+")" +
                "\nLowest score: " + lowestStudent.score()+ "(" + lowestStudent.fullName() + ")");


    }
}
